package JosephusProblem;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

    public static boolean debug = false;

    @Test
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4001");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(55, 69);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 24 + "'", int2 == 24);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(87, 59);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25 + "'", int2 == 25);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(80, (-27));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-31) + "'", int2 == (-31));
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) ' ', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(63, 65);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(19, (-35));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (byte) 100, 53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(2, (-72));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(7, 42);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(13, (-37));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(98, (-44));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-88) + "'", int2 == (-88));
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(89, (-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-12) + "'", int2 == (-12));
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(33, (-39));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-12) + "'", int2 == (-12));
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(3, 77);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(33, (-18));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-27) + "'", int2 == (-27));
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(72, (-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-10) + "'", int2 == (-10));
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(50, 26);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 47 + "'", int2 == 47);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(94, (-27));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-60) + "'", int2 == (-60));
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) '#', (-81));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-19) + "'", int2 == (-19));
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(57, 73);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 21 + "'", int2 == 21);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(43, (-5));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-30) + "'", int2 == (-30));
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(68, (-69));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-57) + "'", int2 == (-57));
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(24, 94);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(42, (-49));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-19) + "'", int2 == (-19));
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(36, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (byte) 100, (-61));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-54) + "'", int2 == (-54));
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(20, 71);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(1, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(2, 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(78, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 77 + "'", int2 == 77);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(69, 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 46 + "'", int2 == 46);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(82, (-9));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(32, (-17));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-27) + "'", int2 == (-27));
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(82, 19);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 24 + "'", int2 == 24);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(12, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(57, (-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-52) + "'", int2 == (-52));
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(5, 66);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (byte) 1, 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(81, 96);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 39 + "'", int2 == 39);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(19, 96);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2 == 18);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(84, 94);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72 + "'", int2 == 72);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(65, 61);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 41 + "'", int2 == 41);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(46, 91);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25 + "'", int2 == 25);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(56, 37);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(30, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 28 + "'", int2 == 28);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(27, (-9));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-21) + "'", int2 == (-21));
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(32, (-45));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-15) + "'", int2 == (-15));
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(14, 85);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(98, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2 == 18);
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(73, 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 63 + "'", int2 == 63);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(98, 95);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25 + "'", int2 == 25);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(29, 99);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(49, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-47) + "'", int2 == (-47));
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(86, (-70));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-80) + "'", int2 == (-80));
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(30, (-42));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-21) + "'", int2 == (-21));
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(99, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(79, (-48));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-30) + "'", int2 == (-30));
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(72, (-97));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(33, (-55));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-30) + "'", int2 == (-30));
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(10, 63);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(91, (-77));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-58) + "'", int2 == (-58));
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(4, 47);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(70, (-32));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-12) + "'", int2 == (-12));
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(42, (-29));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(93, (-65));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-13) + "'", int2 == (-13));
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(41, 88);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2 == 18);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(80, (-39));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-11) + "'", int2 == (-11));
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(34, 16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(67, 26);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(59, (-89));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-42) + "'", int2 == (-42));
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(9, 48);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(29, 80);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 26 + "'", int2 == 26);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(72, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 50 + "'", int2 == 50);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(72, (-12));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(37, (-76));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-15) + "'", int2 == (-15));
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(54, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22 + "'", int2 == 22);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(98, (-14));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-63) + "'", int2 == (-63));
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(13, (-29));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (byte) 1, 70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(77, 24);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(42, (-57));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-13) + "'", int2 == (-13));
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(29, 30);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 28 + "'", int2 == 28);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(11, 55);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (byte) 100, 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67 + "'", int2 == 67);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(9, (-90));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(37, (-72));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-24) + "'", int2 == (-24));
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(17, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-15) + "'", int2 == (-15));
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(44, (-73));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-33) + "'", int2 == (-33));
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(42, (-50));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-16) + "'", int2 == (-16));
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(6, 47);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(72, 71);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) '4', (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(90, (-53));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-74) + "'", int2 == (-74));
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(46, (-27));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-38) + "'", int2 == (-38));
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(87, (-44));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-63) + "'", int2 == (-63));
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (byte) 100, (-6));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-67) + "'", int2 == (-67));
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(18, (-59));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(12, 38);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(86, 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(32, 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(61, (-14));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-16) + "'", int2 == (-16));
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(32, (-24));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-22) + "'", int2 == (-22));
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(16, (-85));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(73, 11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(61, 24);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 45 + "'", int2 == 45);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(13, 67);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(50, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(27, 19);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 26 + "'", int2 == 26);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(70, (-34));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-10) + "'", int2 == (-10));
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(70, 20);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(53, (-86));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-30) + "'", int2 == (-30));
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(46, (-73));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-43) + "'", int2 == (-43));
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(37, 26);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(6, (-68));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(37, 99);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (byte) 1, 18);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(58, 11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 42 + "'", int2 == 42);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(36, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(24, (-21));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6) + "'", int2 == (-6));
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(61, 62);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 58 + "'", int2 == 58);
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(80, (-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-11) + "'", int2 == (-11));
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(88, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 59 + "'", int2 == 59);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(5, 46);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(5, 95);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(88, (-18));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-76) + "'", int2 == (-76));
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(69, 79);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 21 + "'", int2 == 21);
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(27, 65);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(27, (-69));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-11) + "'", int2 == (-11));
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(51, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-50) + "'", int2 == (-50));
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(61, (-58));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-59) + "'", int2 == (-59));
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(39, (-43));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-17) + "'", int2 == (-17));
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(68, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 42 + "'", int2 == 42);
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) '4', (-11));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-30) + "'", int2 == (-30));
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(91, (-97));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-45) + "'", int2 == (-45));
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(97, 96);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 58 + "'", int2 == 58);
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(2, 38);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(62, (-42));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-32) + "'", int2 == (-32));
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(95, (-62));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-91) + "'", int2 == (-91));
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(71, 81);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67 + "'", int2 == 67);
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(58, 21);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(70, 60);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67 + "'", int2 == 67);
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 10, (-27));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(17, 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(3, (-77));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(95, 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 37 + "'", int2 == 37);
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(87, (-12));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-18) + "'", int2 == (-18));
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(31, 41);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(53, 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22 + "'", int2 == 22);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(9, (-83));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(14, 44);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(40, (-20));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-13) + "'", int2 == (-13));
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (byte) 10, 47);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(52, 99);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 49 + "'", int2 == 49);
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(47, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-45) + "'", int2 == (-45));
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(14, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) 'a', 55);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2 == 18);
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(25, (-71));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-24) + "'", int2 == (-24));
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(56, 89);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(3, 53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (byte) 10, (-98));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(39, (-85));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(26, (-42));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-22) + "'", int2 == (-22));
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(86, 63);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 69 + "'", int2 == 69);
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(47, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(41, 77);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(36, 92);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(51, (-38));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-24) + "'", int2 == (-24));
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(62, 30);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (byte) 10, (-53));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6) + "'", int2 == (-6));
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(55, 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 43 + "'", int2 == 43);
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(25, (-99));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-20) + "'", int2 == (-20));
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(68, (-34));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-11) + "'", int2 == (-11));
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(73, 99);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 10, (-17));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(18, (-43));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (byte) 10, 23);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(84, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 51 + "'", int2 == 51);
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(41, 66);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(14, (-39));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(86, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(80, 78);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(35, (-40));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-30) + "'", int2 == (-30));
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(45, 44);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(62, (-23));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-58) + "'", int2 == (-58));
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(83, (-61));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-27) + "'", int2 == (-27));
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(44, 21);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25 + "'", int2 == 25);
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (byte) 10, 75);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(61, (-5));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-14) + "'", int2 == (-14));
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(2, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (byte) 1, 95);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(95, 88);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34 + "'", int2 == 34);
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(46, 80);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(21, (-34));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(96, 65);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2 == 18);
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(38, (-26));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(17, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 1, (-58));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(38, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 37 + "'", int2 == 37);
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(23, (-26));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(2, (-83));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(25, (-74));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(29, 71);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(34, 44);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) 'a', (-87));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-17) + "'", int2 == (-17));
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(93, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(20, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-19) + "'", int2 == (-19));
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(57, 54);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(33, (-9));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-15) + "'", int2 == (-15));
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) 'a', 93);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(4, (-75));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(58, (-20));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-30) + "'", int2 == (-30));
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(100, 49);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(72, (-69));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-51) + "'", int2 == (-51));
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(56, 75);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 45 + "'", int2 == 45);
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(97, (-63));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-25) + "'", int2 == (-25));
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(27, 98);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(81, (-57));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-10) + "'", int2 == (-10));
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(50, 93);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(44, 12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(23, (-55));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-13) + "'", int2 == (-13));
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(27, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4223");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(91, (-53));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-37) + "'", int2 == (-37));
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4224");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(5, 86);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(29, 68);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4226");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(2, (-74));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4227");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(98, (-24));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-78) + "'", int2 == (-78));
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4228");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(81, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 28 + "'", int2 == 28);
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(12, (-15));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4230");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(23, (-9));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-10) + "'", int2 == (-10));
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4231");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (short) 1, 66);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4232");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(73, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4233");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(6, (-96));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4234");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(99, (-4));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-29) + "'", int2 == (-29));
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4235");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (byte) 1, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4236");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(77, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 76 + "'", int2 == 76);
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4237");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(72, (-82));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-14) + "'", int2 == (-14));
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4238");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 10, (-32));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4239");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(60, 95);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4240");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(76, 84);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4241");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(82, (-11));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-26) + "'", int2 == (-26));
    }

    @Test
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4242");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(32, (-16));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4243");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(62, 20);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 51 + "'", int2 == 51);
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4244");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(62, 79);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4245");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(33, 69);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4246");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(84, 21);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 59 + "'", int2 == 59);
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4247");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (short) 10, (-11));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6) + "'", int2 == (-6));
    }

    @Test
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4248");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (byte) 1, 13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4249");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(79, (-83));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-43) + "'", int2 == (-43));
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4250");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(73, (-90));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-36) + "'", int2 == (-36));
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4251");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(89, (-31));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-32) + "'", int2 == (-32));
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4252");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(93, (-15));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-34) + "'", int2 == (-34));
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4253");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(72, 40);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4254");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(57, (-77));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4255");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(49, 11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 49 + "'", int2 == 49);
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4256");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(4, (-94));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4257");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (byte) 100, (-73));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-86) + "'", int2 == (-86));
    }

    @Test
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4258");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(55, 23);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
    }

    @Test
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4259");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(13, 84);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4260");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) 'a', (-18));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-54) + "'", int2 == (-54));
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4261");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(13, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4262");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(50, (-78));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-46) + "'", int2 == (-46));
    }

    @Test
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4263");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(51, (-29));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-37) + "'", int2 == (-37));
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4264");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(71, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 65 + "'", int2 == 65);
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4265");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(55, (-69));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-24) + "'", int2 == (-24));
    }

    @Test
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4266");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) 'a', (-71));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-53) + "'", int2 == (-53));
    }

    @Test
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4267");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(96, (-60));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-61) + "'", int2 == (-61));
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4268");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(76, 99);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4269");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) ' ', (-27));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-10) + "'", int2 == (-10));
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4270");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(100, 82);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 82 + "'", int2 == 82);
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4271");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(90, (-49));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4272");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(23, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-21) + "'", int2 == (-21));
    }

    @Test
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4273");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(26, 36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4274");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(73, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4275");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(99, 12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 69 + "'", int2 == 69);
    }

    @Test
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4276");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(54, (-40));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-45) + "'", int2 == (-45));
    }

    @Test
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4277");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(99, 45);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4278");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(83, 16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72 + "'", int2 == 72);
    }

    @Test
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4279");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(54, (-6));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-16) + "'", int2 == (-16));
    }

    @Test
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4280");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(32, 60);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4281");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(58, 31);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 24 + "'", int2 == 24);
    }

    @Test
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4282");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(74, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 59 + "'", int2 == 59);
    }

    @Test
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4283");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(21, 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4284");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(10, (-65));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4285");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(62, (-50));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-27) + "'", int2 == (-27));
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4286");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(71, (-38));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-56) + "'", int2 == (-56));
    }

    @Test
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4287");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(88, 99);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34 + "'", int2 == 34);
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4288");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(55, (-68));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-10) + "'", int2 == (-10));
    }

    @Test
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4289");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(54, (-23));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-46) + "'", int2 == (-46));
    }

    @Test
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4290");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(85, (-32));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-20) + "'", int2 == (-20));
    }

    @Test
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4291");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(86, (-68));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-17) + "'", int2 == (-17));
    }

    @Test
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4292");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(66, (-12));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4293");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(28, (-94));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
    }

    @Test
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4294");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(96, 14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4295");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) 'a', (-55));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-18) + "'", int2 == (-18));
    }

    @Test
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4296");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(14, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4297");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(19, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4298");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(58, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
    }

    @Test
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4299");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) 'a', (-13));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-30) + "'", int2 == (-30));
    }

    @Test
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4300");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(75, 69);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 37 + "'", int2 == 37);
    }

    @Test
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4301");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(77, (-18));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-41) + "'", int2 == (-41));
    }

    @Test
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4302");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(99, 82);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4303");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(1, 18);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4304");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(84, (-58));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-16) + "'", int2 == (-16));
    }

    @Test
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4305");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(93, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4306");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(51, 17);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 24 + "'", int2 == 24);
    }

    @Test
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4307");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(86, (-31));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-27) + "'", int2 == (-27));
    }

    @Test
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4308");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(86, (-97));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4309");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(59, (-77));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-46) + "'", int2 == (-46));
    }

    @Test
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4310");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(18, 29);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4311");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(34, (-23));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-18) + "'", int2 == (-18));
    }

    @Test
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4312");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(64, 40);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4313");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(19, 20);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4314");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(36, 11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 28 + "'", int2 == 28);
    }

    @Test
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4315");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(91, (-99));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-59) + "'", int2 == (-59));
    }

    @Test
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4316");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(59, (-9));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-19) + "'", int2 == (-19));
    }

    @Test
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4317");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(2, (-6));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4318");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(99, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 88 + "'", int2 == 88);
    }

    @Test
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4319");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (byte) 100, (-47));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-22) + "'", int2 == (-22));
    }

    @Test
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4320");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(83, (-5));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-52) + "'", int2 == (-52));
    }

    @Test
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4321");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(64, 60);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 42 + "'", int2 == 42);
    }

    @Test
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4322");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(96, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-94) + "'", int2 == (-94));
    }

    @Test
    public void test4323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4323");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) ' ', 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test4324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4324");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(67, (-14));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-36) + "'", int2 == (-36));
    }

    @Test
    public void test4325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4325");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(51, (-22));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test4326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4326");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(7, (-31));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test4327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4327");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(2, 88);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4328");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(38, 46);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test4329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4329");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(81, (-72));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-10) + "'", int2 == (-10));
    }

    @Test
    public void test4330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4330");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(2, (-90));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4331");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(12, (-12));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
    }

    @Test
    public void test4332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4332");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(58, 66);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
    }

    @Test
    public void test4333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4333");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (short) 100, 42);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 24 + "'", int2 == 24);
    }

    @Test
    public void test4334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4334");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(70, (-69));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-55) + "'", int2 == (-55));
    }

    @Test
    public void test4335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4335");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(36, (-24));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-14) + "'", int2 == (-14));
    }

    @Test
    public void test4336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4336");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(38, (-15));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-18) + "'", int2 == (-18));
    }

    @Test
    public void test4337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4337");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(23, (-47));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-14) + "'", int2 == (-14));
    }

    @Test
    public void test4338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4338");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) '#', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test4339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4339");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(85, (-85));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-34) + "'", int2 == (-34));
    }

    @Test
    public void test4340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4340");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(95, (-51));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-34) + "'", int2 == (-34));
    }

    @Test
    public void test4341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4341");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 10, (-33));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4342");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(56, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
    }

    @Test
    public void test4343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4343");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(90, (-57));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test4344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4344");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(98, (-59));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-20) + "'", int2 == (-20));
    }

    @Test
    public void test4345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4345");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(64, (-13));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8) + "'", int2 == (-8));
    }

    @Test
    public void test4346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4346");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(34, (-45));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test4347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4347");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(99, 41);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 75 + "'", int2 == 75);
    }

    @Test
    public void test4348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4348");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(53, (-59));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-27) + "'", int2 == (-27));
    }

    @Test
    public void test4349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4349");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(36, 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test4350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4350");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(9, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test4351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4351");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(22, (-22));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test4352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4352");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(38, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 21 + "'", int2 == 21);
    }

    @Test
    public void test4353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4353");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (byte) 100, 42);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 24 + "'", int2 == 24);
    }

    @Test
    public void test4354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4354");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(30, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
    }

    @Test
    public void test4355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4355");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(75, (-4));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-25) + "'", int2 == (-25));
    }

    @Test
    public void test4356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4356");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(64, (-65));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-10) + "'", int2 == (-10));
    }

    @Test
    public void test4357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4357");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(25, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25 + "'", int2 == 25);
    }

    @Test
    public void test4358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4358");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(47, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test4359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4359");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(22, 90);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test4360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4360");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(45, 67);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test4361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4361");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(24, (-66));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
    }

    @Test
    public void test4362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4362");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(34, (-87));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-10) + "'", int2 == (-10));
    }

    @Test
    public void test4363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4363");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(40, 69);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test4364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4364");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(65, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test4365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4365");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(20, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
    }

    @Test
    public void test4366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4366");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(74, (-11));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-18) + "'", int2 == (-18));
    }

    @Test
    public void test4367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4367");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(87, (-63));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-43) + "'", int2 == (-43));
    }

    @Test
    public void test4368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4368");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(77, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 21 + "'", int2 == 21);
    }

    @Test
    public void test4369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4369");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(89, (-81));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test4370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4370");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(95, (-32));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-70) + "'", int2 == (-70));
    }

    @Test
    public void test4371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4371");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(99, (-62));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-48) + "'", int2 == (-48));
    }

    @Test
    public void test4372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4372");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(9, (-57));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test4373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4373");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(52, (-80));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-37) + "'", int2 == (-37));
    }

    @Test
    public void test4374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4374");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(8, (-4));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test4375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4375");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(35, 60);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test4376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4376");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(69, (-44));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-49) + "'", int2 == (-49));
    }

    @Test
    public void test4377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4377");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(38, (-46));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8) + "'", int2 == (-8));
    }

    @Test
    public void test4378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4378");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(49, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25 + "'", int2 == 25);
    }

    @Test
    public void test4379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4379");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(82, (-25));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
    }

    @Test
    public void test4380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4380");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(6, 13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test4381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4381");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(56, 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40 + "'", int2 == 40);
    }

    @Test
    public void test4382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4382");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(36, 72);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 26 + "'", int2 == 26);
    }

    @Test
    public void test4383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4383");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(61, (-96));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-34) + "'", int2 == (-34));
    }

    @Test
    public void test4384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4384");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(58, (-42));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-45) + "'", int2 == (-45));
    }

    @Test
    public void test4385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4385");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(12, (-26));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test4386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4386");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(11, (-4));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8) + "'", int2 == (-8));
    }

    @Test
    public void test4387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4387");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(37, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
    }

    @Test
    public void test4388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4388");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(72, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 27 + "'", int2 == 27);
    }

    @Test
    public void test4389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4389");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(2, (-78));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4390");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(18, 71);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test4391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4391");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(78, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 37 + "'", int2 == 37);
    }

    @Test
    public void test4392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4392");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(6, 13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test4393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4393");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(84, 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 19 + "'", int2 == 19);
    }

    @Test
    public void test4394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4394");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(98, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4395");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(17, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-15) + "'", int2 == (-15));
    }

    @Test
    public void test4396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4396");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(90, (-52));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-73) + "'", int2 == (-73));
    }

    @Test
    public void test4397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4397");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(66, 33);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test4398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4398");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(95, (-6));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-36) + "'", int2 == (-36));
    }

    @Test
    public void test4399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4399");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(21, (-20));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4400");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(74, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test4401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4401");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(38, 47);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
    }

    @Test
    public void test4402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4402");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(62, (-43));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-60) + "'", int2 == (-60));
    }

    @Test
    public void test4403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4403");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(80, 42);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test4404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4404");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(80, 21);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 56 + "'", int2 == 56);
    }

    @Test
    public void test4405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4405");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(32, (-37));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test4406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4406");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(25, 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test4407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4407");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(86, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4408");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(95, (-5));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-21) + "'", int2 == (-21));
    }

    @Test
    public void test4409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4409");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(3, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4410");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(49, 65);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test4411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4411");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(41, 49);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test4412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4412");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(19, 66);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test4413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4413");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(59, 75);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40 + "'", int2 == 40);
    }

    @Test
    public void test4414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4414");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(21, (-13));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
    }

    @Test
    public void test4415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4415");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(72, 31);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 69 + "'", int2 == 69);
    }

    @Test
    public void test4416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4416");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(28, 17);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
    }

    @Test
    public void test4417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4417");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(80, 16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25 + "'", int2 == 25);
    }

    @Test
    public void test4418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4418");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) 'a', (-12));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-43) + "'", int2 == (-43));
    }

    @Test
    public void test4419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4419");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(76, (-99));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4420");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) 'a', 98);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 62 + "'", int2 == 62);
    }

    @Test
    public void test4421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4421");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(17, 14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test4422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4422");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(89, (-32));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-61) + "'", int2 == (-61));
    }

    @Test
    public void test4423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4423");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(9, 87);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test4424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4424");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(61, 89);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 41 + "'", int2 == 41);
    }

    @Test
    public void test4425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4425");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(18, (-62));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4426");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(77, (-6));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-17) + "'", int2 == (-17));
    }

    @Test
    public void test4427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4427");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(74, (-26));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-60) + "'", int2 == (-60));
    }

    @Test
    public void test4428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4428");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(89, 81);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test4429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4429");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4430");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(58, 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test4431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4431");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(72, 56);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 42 + "'", int2 == 42);
    }

    @Test
    public void test4432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4432");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(35, 91);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test4433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4433");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(56, 74);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    }

    @Test
    public void test4434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4434");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(15, 19);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test4435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4435");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) ' ', 33);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25 + "'", int2 == 25);
    }

    @Test
    public void test4436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4436");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(92, (-49));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-10) + "'", int2 == (-10));
    }

    @Test
    public void test4437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4437");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(45, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4438");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(13, (-85));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test4439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4439");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(39, (-80));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test4440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4440");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(8, 53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test4441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4441");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(53, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test4442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4442");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(43, 40);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40 + "'", int2 == 40);
    }

    @Test
    public void test4443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4443");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(59, (-55));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-14) + "'", int2 == (-14));
    }

    @Test
    public void test4444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4444");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(47, (-30));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4445");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(94, (-51));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-78) + "'", int2 == (-78));
    }

    @Test
    public void test4446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4446");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(24, 62);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test4447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4447");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(100, (-45));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-76) + "'", int2 == (-76));
    }

    @Test
    public void test4448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4448");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(8, (-73));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test4449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4449");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(92, 93);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test4450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4450");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(96, (-46));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test4451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4451");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(6, (-27));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test4452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4452");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(96, (-55));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-60) + "'", int2 == (-60));
    }

    @Test
    public void test4453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4453");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(8, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
    }

    @Test
    public void test4454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4454");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(63, (-28));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
    }

    @Test
    public void test4455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4455");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(10, 18);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test4456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4456");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(1, (-11));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4457");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(92, 12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
    }

    @Test
    public void test4458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4458");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(30, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-28) + "'", int2 == (-28));
    }

    @Test
    public void test4459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4459");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(36, 53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test4460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4460");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(22, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4461");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(27, (-97));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-13) + "'", int2 == (-13));
    }

    @Test
    public void test4462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4462");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(42, (-34));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
    }

    @Test
    public void test4463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4463");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(64, (-75));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-43) + "'", int2 == (-43));
    }

    @Test
    public void test4464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4464");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(33, 27);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test4465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4465");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (byte) 10, 85);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test4466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4466");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(55, (-51));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-53) + "'", int2 == (-53));
    }

    @Test
    public void test4467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4467");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(20, (-59));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
    }

    @Test
    public void test4468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4468");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(12, 41);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test4469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4469");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(19, 62);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test4470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4470");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(50, 74);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test4471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4471");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(42, 55);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 39 + "'", int2 == 39);
    }

    @Test
    public void test4472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4472");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(76, 44);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67 + "'", int2 == 67);
    }

    @Test
    public void test4473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4473");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(67, (-43));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-15) + "'", int2 == (-15));
    }

    @Test
    public void test4474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4474");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(34, 69);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test4475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4475");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(5, 25);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test4476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4476");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(14, 80);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test4477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4477");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(48, 19);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 24 + "'", int2 == 24);
    }

    @Test
    public void test4478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4478");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(100, (-46));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-88) + "'", int2 == (-88));
    }

    @Test
    public void test4479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4479");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(2, 19);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4480");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(94, 28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test4481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4481");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(76, (-51));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-12) + "'", int2 == (-12));
    }

    @Test
    public void test4482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4482");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(86, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 54 + "'", int2 == 54);
    }

    @Test
    public void test4483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4483");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(30, 36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test4484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4484");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(47, 57);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 28 + "'", int2 == 28);
    }

    @Test
    public void test4485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4485");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (byte) 100, (-53));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-32) + "'", int2 == (-32));
    }

    @Test
    public void test4486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4486");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(77, 59);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test4487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4487");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (byte) 10, (-33));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4488");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(40, (-32));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-28) + "'", int2 == (-28));
    }

    @Test
    public void test4489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4489");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(50, 49);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 41 + "'", int2 == 41);
    }

    @Test
    public void test4490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4490");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(54, 76);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 37 + "'", int2 == 37);
    }

    @Test
    public void test4491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4491");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(41, 61);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test4492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4492");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(39, (-81));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test4493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4493");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(20, (-54));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-14) + "'", int2 == (-14));
    }

    @Test
    public void test4494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4494");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(19, 92);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test4495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4495");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(86, 72);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test4496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4496");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(4, (-77));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4497");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(82, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4498");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) 'a', 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 21 + "'", int2 == 21);
    }

    @Test
    public void test4499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4499");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(7, 74);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test4500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4500");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(36, 95);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
    }
}

