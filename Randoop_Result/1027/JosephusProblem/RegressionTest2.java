package JosephusProblem;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (byte) 1, 65);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) ' ', 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(4, (-11));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(19, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(37, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2 == 18);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(18, (-13));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 100, (-60));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(23, 44);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (short) 1, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(61, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(26, (-21));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-22) + "'", int2 == (-22));
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(96, (-87));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-28) + "'", int2 == (-28));
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(51, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(67, (-53));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-29) + "'", int2 == (-29));
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(43, (-17));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-29) + "'", int2 == (-29));
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(61, 41);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(94, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(46, (-46));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-35) + "'", int2 == (-35));
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(27, 70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(9, 40);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(5, 27);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(30, 63);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 19 + "'", int2 == 19);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) '4', 36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(53, 41);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(33, (-49));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-31) + "'", int2 == (-31));
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(33, (-48));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-12) + "'", int2 == (-12));
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(1, 16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(31, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(28, (-94));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6) + "'", int2 == (-6));
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(30, (-33));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-22) + "'", int2 == (-22));
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(26, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-19) + "'", int2 == (-19));
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (short) 1, (-62));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(7, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(23, (-87));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(43, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 37 + "'", int2 == 37);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(53, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(16, 94);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(33, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(54, 17);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22 + "'", int2 == 22);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(90, (-24));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-71) + "'", int2 == (-71));
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(38, 54);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(23, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(19, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 19 + "'", int2 == 19);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(24, (-43));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(64, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(15, (-59));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(58, 48);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 49 + "'", int2 == 49);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(22, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(96, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-94) + "'", int2 == (-94));
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(31, 23);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(49, (-85));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-11) + "'", int2 == (-11));
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(51, 31);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 28 + "'", int2 == 28);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(3, (-60));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(22, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 21 + "'", int2 == 21);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(35, 46);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 19 + "'", int2 == 19);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(7, (-92));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(22, 45);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(28, (-37));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-10) + "'", int2 == (-10));
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(67, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) ' ', 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(35, 40);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(5, (-40));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(5, 22);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(2, 85);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (short) 1, (-43));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 1, 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(70, (-65));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-66) + "'", int2 == (-66));
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(20, (-20));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(58, 37);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 41 + "'", int2 == 41);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(38, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(13, 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(31, 26);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 28 + "'", int2 == 28);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(39, (-17));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(21, (-94));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-19) + "'", int2 == (-19));
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(94, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 93 + "'", int2 == 93);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (byte) 100, 12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 80 + "'", int2 == 80);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(12, (-28));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(54, (-22));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-16) + "'", int2 == (-16));
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(21, 36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 17 + "'", int2 == 17);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(90, (-83));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-22) + "'", int2 == (-22));
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(96, 44);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(45, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(28, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 24 + "'", int2 == 24);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(2, (-48));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(80, (-12));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-19) + "'", int2 == (-19));
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(18, (-14));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(49, (-25));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-28) + "'", int2 == (-28));
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(9, 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) 'a', 53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 73 + "'", int2 == 73);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(49, 28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 17 + "'", int2 == 17);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(19, 45);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(26, 47);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(65, 87);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 54 + "'", int2 == 54);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(43, (-82));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-24) + "'", int2 == (-24));
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(45, (-74));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-40) + "'", int2 == (-40));
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(31, (-3));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(20, (-33));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-17) + "'", int2 == (-17));
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 10, (-6));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (short) 1, (-96));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(4, 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(23, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(11, (-63));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(73, 38);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 61 + "'", int2 == 61);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(90, 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (byte) 100, (-83));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-89) + "'", int2 == (-89));
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(32, 17);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(51, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34 + "'", int2 == 34);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (byte) 10, 29);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(20, (-55));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(58, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(27, 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(49, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34 + "'", int2 == 34);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(7, (-28));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (short) 1, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(45, 70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(63, 12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 10, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(41, 51);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(61, (-65));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 10, 63);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(35, (-81));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-18) + "'", int2 == (-18));
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(80, (-30));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-46) + "'", int2 == (-46));
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(22, 47);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(67, 75);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(64, (-63));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-26) + "'", int2 == (-26));
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) '4', 40);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 19 + "'", int2 == 19);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(15, (-71));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-12) + "'", int2 == (-12));
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(94, (-29));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 10, 70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) '4', (-31));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6) + "'", int2 == (-6));
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(80, (-37));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-26) + "'", int2 == (-26));
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(40, 16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25 + "'", int2 == 25);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(21, 54);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(92, 93);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(92, (-41));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-73) + "'", int2 == (-73));
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(33, 13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(37, 14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 24 + "'", int2 == 24);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(87, (-17));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-19) + "'", int2 == (-19));
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(7, 53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(41, (-25));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-11) + "'", int2 == (-11));
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(61, (-33));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-28) + "'", int2 == (-28));
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(85, (-28));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-29) + "'", int2 == (-29));
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(21, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 19 + "'", int2 == 19);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(25, (-16));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(24, 16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) '#', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(1, 93);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 1, 89);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(5, (-74));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(5, (-29));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(27, 45);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (byte) 1, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(2, 56);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(50, 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 45 + "'", int2 == 45);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(29, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(60, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-58) + "'", int2 == (-58));
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(33, 61);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(46, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(23, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-22) + "'", int2 == (-22));
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(2, (-9));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(94, 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(24, (-96));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-16) + "'", int2 == (-16));
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(5, 51);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(25, (-40));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-19) + "'", int2 == (-19));
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(94, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(56, 13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(28, (-62));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-19) + "'", int2 == (-19));
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (short) 100, 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 49 + "'", int2 == 49);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(52, (-9));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-14) + "'", int2 == (-14));
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(18, 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(41, (-41));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-12) + "'", int2 == (-12));
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(51, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(22, 56);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(11, (-17));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(38, (-94));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-13) + "'", int2 == (-13));
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(40, (-53));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-22) + "'", int2 == (-22));
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(64, (-51));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-33) + "'", int2 == (-33));
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(87, (-34));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-35) + "'", int2 == (-35));
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(22, 36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (byte) 10, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(89, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 62 + "'", int2 == 62);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(10, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(63, 60);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 47 + "'", int2 == 47);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(85, 43);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (byte) 10, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) '4', (-26));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-47) + "'", int2 == (-47));
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(89, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(11, (-89));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(43, (-42));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-19) + "'", int2 == (-19));
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(36, (-94));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-13) + "'", int2 == (-13));
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(22, (-12));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-13) + "'", int2 == (-13));
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (byte) 100, (-27));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-27) + "'", int2 == (-27));
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(62, 25);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(26, 37);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 19 + "'", int2 == 19);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(80, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(89, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 73 + "'", int2 == 73);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(96, (-74));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-20) + "'", int2 == (-20));
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(38, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 28 + "'", int2 == 28);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (short) 10, 92);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(12, (-83));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(13, 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (short) 1, (-39));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(53, (-47));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-49) + "'", int2 == (-49));
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) 'a', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 93 + "'", int2 == 93);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (byte) 10, (-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6) + "'", int2 == (-6));
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 100, 23);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(48, (-95));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-13) + "'", int2 == (-13));
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(41, (-52));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-27) + "'", int2 == (-27));
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (short) 100, 14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 91 + "'", int2 == 91);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(100, 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 49 + "'", int2 == 49);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(36, (-28));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-33) + "'", int2 == (-33));
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(70, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(56, (-22));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(3, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(89, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 21 + "'", int2 == 21);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(73, (-8));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-45) + "'", int2 == (-45));
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(67, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(73, 40);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 47 + "'", int2 == 47);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(47, 54);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(93, 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 19 + "'", int2 == 19);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(27, 40);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22 + "'", int2 == 22);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(22, (-37));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-15) + "'", int2 == (-15));
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(35, (-60));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(18, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(64, 50);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(89, 56);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 24 + "'", int2 == 24);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(94, 17);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(92, (-70));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-55) + "'", int2 == (-55));
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(28, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(29, (-87));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-21) + "'", int2 == (-21));
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(16, 61);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(70, 70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 51 + "'", int2 == 51);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(9, (-5));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(93, 92);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 88 + "'", int2 == 88);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(91, 75);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 69 + "'", int2 == 69);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(85, (-70));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-11) + "'", int2 == (-11));
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(51, 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(36, 91);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(48, (-9));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-29) + "'", int2 == (-29));
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (byte) 10, 67);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(48, (-43));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(100, 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 41 + "'", int2 == 41);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(61, (-31));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-56) + "'", int2 == (-56));
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(11, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-10) + "'", int2 == (-10));
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(44, (-18));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-36) + "'", int2 == (-36));
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (short) 1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(3, 22);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(67, (-17));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-62) + "'", int2 == (-62));
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(65, (-99));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-46) + "'", int2 == (-46));
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) 'a', 53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72 + "'", int2 == 72);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(50, (-11));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) ' ', 91);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) '4', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(36, (-16));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(38, (-85));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-36) + "'", int2 == (-36));
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(35, 88);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 27 + "'", int2 == 27);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(24, (-57));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(50, 18);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(14, (-32));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6) + "'", int2 == (-6));
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(27, 58);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2 == 18);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(8, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(16, (-92));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(24, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 1, (-32));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(47, 20);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(19, (-53));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(1, (-81));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(57, (-55));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-22) + "'", int2 == (-22));
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(25, 43);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 21 + "'", int2 == 21);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(91, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(4, (-30));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(44, (-92));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) '4', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(17, (-36));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6) + "'", int2 == (-6));
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(11, (-43));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(52, (-53));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-10) + "'", int2 == (-10));
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(51, (-99));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (byte) 100, (-42));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-23) + "'", int2 == (-23));
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(2, (-18));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(20, 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(24, (-65));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-18) + "'", int2 == (-18));
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(49, 29);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(37, (-16));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-15) + "'", int2 == (-15));
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(45, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-44) + "'", int2 == (-44));
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 1, (-28));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(27, 94);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25 + "'", int2 == 25);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(38, (-41));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8) + "'", int2 == (-8));
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(38, (-77));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-16) + "'", int2 == (-16));
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(96, (-43));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-40) + "'", int2 == (-40));
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(53, 14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22 + "'", int2 == 22);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) ' ', 39);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(73, (-19));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-10) + "'", int2 == (-10));
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(27, 22);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2 == 18);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(5, (-62));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(26, (-49));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-14) + "'", int2 == (-14));
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(94, (-18));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(58, 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(34, 93);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(69, (-5));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-55) + "'", int2 == (-55));
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(90, 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(73, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-18) + "'", int2 == (-18));
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(60, 41);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(13, 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(48, (-4));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-38) + "'", int2 == (-38));
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(13, 28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(40, 88);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(36, (-47));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(26, (-71));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-16) + "'", int2 == (-16));
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(60, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2 == 18);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(90, (-4));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-84) + "'", int2 == (-84));
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(13, (-8));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-12) + "'", int2 == (-12));
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(70, 38);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2 == 18);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(88, (-58));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-76) + "'", int2 == (-76));
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(42, 28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(93, 19);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 57 + "'", int2 == 57);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(96, (-92));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-78) + "'", int2 == (-78));
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(63, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(28, (-32));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-20) + "'", int2 == (-20));
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(89, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(38, (-28));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-14) + "'", int2 == (-14));
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(15, 93);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(34, 90);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 28 + "'", int2 == 28);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(73, 50);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34 + "'", int2 == 34);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(7, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(96, (-20));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-29) + "'", int2 == (-29));
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(60, (-30));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8) + "'", int2 == (-8));
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(57, (-67));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-41) + "'", int2 == (-41));
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(40, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-39) + "'", int2 == (-39));
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(14, 39);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(34, 22);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2 == 18);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(72, (-8));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-37) + "'", int2 == (-37));
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(8, 72);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(19, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(80, 23);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 50 + "'", int2 == 50);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(69, (-69));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-57) + "'", int2 == (-57));
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(62, 85);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 57 + "'", int2 == 57);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(3, 19);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(19, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(73, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 73 + "'", int2 == 73);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(100, 61);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 54 + "'", int2 == 54);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(93, (-22));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-83) + "'", int2 == (-83));
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(80, (-71));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(38, 91);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 17 + "'", int2 == 17);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(12, 80);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(94, (-84));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-20) + "'", int2 == (-20));
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(2, (-26));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(33, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) '4', (-55));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-21) + "'", int2 == (-21));
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(88, 39);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 71 + "'", int2 == 71);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(88, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(71, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-70) + "'", int2 == (-70));
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(19, (-16));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(49, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(63, 70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(80, 93);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(85, (-18));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-21) + "'", int2 == (-21));
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(80, (-19));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-66) + "'", int2 == (-66));
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(20, 71);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(47, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 1, 27);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) '4', 80);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 38 + "'", int2 == 38);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(44, (-55));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-18) + "'", int2 == (-18));
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(25, (-8));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-16) + "'", int2 == (-16));
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (short) 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(96, 22);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 55 + "'", int2 == 55);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(5, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(80, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(56, (-15));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(30, 33);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(65, (-44));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8) + "'", int2 == (-8));
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(25, 72);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(85, 24);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40 + "'", int2 == 40);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(41, (-71));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-13) + "'", int2 == (-13));
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(54, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(67, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(12, (-54));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(25, (-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(67, (-77));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-28) + "'", int2 == (-28));
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(22, 65);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(32, (-94));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-16) + "'", int2 == (-16));
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(80, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(47, (-55));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-45) + "'", int2 == (-45));
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(49, 28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(70, (-23));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-43) + "'", int2 == (-43));
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(73, (-69));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-47) + "'", int2 == (-47));
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(19, 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) 'a', (-18));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-55) + "'", int2 == (-55));
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(6, 70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(54, 33);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(31, (-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6) + "'", int2 == (-6));
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (byte) 10, 14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(18, (-16));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6) + "'", int2 == (-6));
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(26, 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(54, (-87));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-49) + "'", int2 == (-49));
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(20, (-45));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-17) + "'", int2 == (-17));
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(56, (-19));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-15) + "'", int2 == (-15));
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(62, 49);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(52, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 47 + "'", int2 == 47);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (byte) 100, (-7));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-49) + "'", int2 == (-49));
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(38, (-51));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-16) + "'", int2 == (-16));
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(57, 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 50 + "'", int2 == 50);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(25, (-59));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(33, (-78));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(87, 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 80 + "'", int2 == 80);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(57, (-15));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-17) + "'", int2 == (-17));
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(90, (-65));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(87, 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(56, (-76));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-21) + "'", int2 == (-21));
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(52, (-89));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-33) + "'", int2 == (-33));
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(70, (-9));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-55) + "'", int2 == (-55));
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(39, (-95));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-33) + "'", int2 == (-33));
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(6, (-33));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(48, (-76));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-42) + "'", int2 == (-42));
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(60, 72);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 51 + "'", int2 == 51);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(50, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(55, 73);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 44 + "'", int2 == 44);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(55, (-87));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-26) + "'", int2 == (-26));
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(94, (-8));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-48) + "'", int2 == (-48));
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(93, (-60));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-71) + "'", int2 == (-71));
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(96, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(3, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(51, (-39));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-47) + "'", int2 == (-47));
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(88, 57);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 70 + "'", int2 == 70);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(1, 22);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(40, (-11));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-34) + "'", int2 == (-34));
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(24, 21);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(16, (-73));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-13) + "'", int2 == (-13));
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(56, (-92));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-48) + "'", int2 == (-48));
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(21, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2 == 18);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(8, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(51, 29);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 38 + "'", int2 == 38);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(89, 21);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 78 + "'", int2 == 78);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(14, 96);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(45, 33);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(48, 90);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(35, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-34) + "'", int2 == (-34));
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(12, 23);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(23, (-57));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-19) + "'", int2 == (-19));
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(45, (-38));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-38) + "'", int2 == (-38));
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(65, 57);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 51 + "'", int2 == 51);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(44, (-23));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-12) + "'", int2 == (-12));
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(8, 45);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) 'a', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(94, 21);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 93 + "'", int2 == 93);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(21, 12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(1, (-95));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(100, 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 96 + "'", int2 == 96);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(58, 49);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 54 + "'", int2 == 54);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(35, (-11));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-16) + "'", int2 == (-16));
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(65, 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 44 + "'", int2 == 44);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(63, (-18));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(4, (-84));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(9, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(46, 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(90, (-30));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(35, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25 + "'", int2 == 25);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(42, (-22));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-40) + "'", int2 == (-40));
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(23, (-22));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(17, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) '#', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(4, 31);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(49, (-84));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-14) + "'", int2 == (-14));
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(60, 42);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(32, 31);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(89, 85);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 24 + "'", int2 == 24);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(12, 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(13, (-58));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-10) + "'", int2 == (-10));
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(8, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6) + "'", int2 == (-6));
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(46, (-73));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-44) + "'", int2 == (-44));
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) 'a', 37);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(16, (-39));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(46, 19);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(65, 30);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(23, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(8, (-69));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(37, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(58, (-7));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-55) + "'", int2 == (-55));
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(60, 92);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(80, (-42));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(11, 45);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(25, (-7));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-13) + "'", int2 == (-13));
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(20, 96);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(37, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(88, (-12));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-29) + "'", int2 == (-29));
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(97, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 39 + "'", int2 == 39);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(41, 25);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(44, 44);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(69, 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(22, (-18));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-19) + "'", int2 == (-19));
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(26, 27);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 26 + "'", int2 == 26);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(73, 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(71, 93);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(22, (-37));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-16) + "'", int2 == (-16));
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (short) 10, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (byte) 10, (-66));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8) + "'", int2 == (-8));
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(73, 57);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22 + "'", int2 == 22);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(19, 45);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(49, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }
}

