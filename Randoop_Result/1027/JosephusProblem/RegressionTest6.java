package JosephusProblem;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(72, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-71) + "'", int2 == (-71));
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(7, 67);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(71, 77);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(90, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(27, 93);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 24 + "'", int2 == 24);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(29, (-12));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-20) + "'", int2 == (-20));
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(30, (-9));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-20) + "'", int2 == (-20));
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(68, 14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 51 + "'", int2 == 51);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(79, (-75));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-21) + "'", int2 == (-21));
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(72, (-43));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-18) + "'", int2 == (-18));
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(79, (-14));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-58) + "'", int2 == (-58));
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(65, 83);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 37 + "'", int2 == 37);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(90, (-47));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-33) + "'", int2 == (-33));
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(39, 14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(97, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 75 + "'", int2 == 75);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(46, (-29));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-36) + "'", int2 == (-36));
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(75, 63);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 21 + "'", int2 == 21);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(10, (-87));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(64, (-33));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(20, (-16));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(40, (-28));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-31) + "'", int2 == (-31));
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) '#', 41);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34 + "'", int2 == 34);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(80, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(80, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-79) + "'", int2 == (-79));
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(18, (-75));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-10) + "'", int2 == (-10));
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(59, 83);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 37 + "'", int2 == 37);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(56, (-31));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-19) + "'", int2 == (-19));
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(22, (-83));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-10) + "'", int2 == (-10));
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(8, 68);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(77, (-55));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-50) + "'", int2 == (-50));
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(85, (-44));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-62) + "'", int2 == (-62));
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(7, 81);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(90, (-82));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-24) + "'", int2 == (-24));
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(63, 29);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 43 + "'", int2 == 43);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) '4', 91);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(100, (-43));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-14) + "'", int2 == (-14));
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(97, (-80));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-90) + "'", int2 == (-90));
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(69, 58);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 69 + "'", int2 == 69);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(70, (-6));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-50) + "'", int2 == (-50));
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(62, (-76));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(14, (-42));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-12) + "'", int2 == (-12));
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(24, 98);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 24 + "'", int2 == 24);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) 'a', 49);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67 + "'", int2 == 67);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(22, (-5));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-16) + "'", int2 == (-16));
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(37, 92);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(4, (-26));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(17, (-39));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6) + "'", int2 == (-6));
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(88, (-49));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-86) + "'", int2 == (-86));
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(53, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40 + "'", int2 == 40);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(20, (-90));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(89, 99);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 44 + "'", int2 == 44);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(68, (-44));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(81, 56);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(67, 63);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 19 + "'", int2 == 19);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(70, 88);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 58 + "'", int2 == 58);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(41, 99);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(25, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-24) + "'", int2 == (-24));
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(7, (-36));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(19, (-42));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(31, 58);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(81, 51);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(24, 93);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(60, (-65));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(31, 22);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2 == 18);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(13, (-44));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(10, (-59));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(15, (-92));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6) + "'", int2 == (-6));
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(6, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(15, (-78));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6) + "'", int2 == (-6));
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(70, 68);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 27 + "'", int2 == 27);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 100, (-64));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-49) + "'", int2 == (-49));
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) '4', (-58));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-43) + "'", int2 == (-43));
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(22, 29);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(10, 19);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) ' ', 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(24, (-92));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8) + "'", int2 == (-8));
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(51, (-61));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(25, 57);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(70, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(75, (-45));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(38, 36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 17 + "'", int2 == 17);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(26, (-66));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-14) + "'", int2 == (-14));
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(41, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-40) + "'", int2 == (-40));
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(43, 11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 28 + "'", int2 == 28);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(15, 63);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(36, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22 + "'", int2 == 22);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(24, (-66));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8) + "'", int2 == (-8));
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(13, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(5, 30);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(95, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(11, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(32, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 28 + "'", int2 == 28);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(31, (-20));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-13) + "'", int2 == (-13));
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(54, (-95));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-15) + "'", int2 == (-15));
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(50, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(39, (-54));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-33) + "'", int2 == (-33));
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(18, (-80));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-13) + "'", int2 == (-13));
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(64, (-12));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-44) + "'", int2 == (-44));
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(24, (-8));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8) + "'", int2 == (-8));
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(7, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6) + "'", int2 == (-6));
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(83, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 56 + "'", int2 == 56);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(50, 96);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 38 + "'", int2 == 38);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(45, (-23));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-34) + "'", int2 == (-34));
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (byte) 10, (-37));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(35, (-74));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-24) + "'", int2 == (-24));
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(83, (-64));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-61) + "'", int2 == (-61));
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(7, 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(40, (-44));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6) + "'", int2 == (-6));
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) 'a', (-85));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-49) + "'", int2 == (-49));
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (short) 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(12, (-42));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8) + "'", int2 == (-8));
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(87, (-55));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-25) + "'", int2 == (-25));
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(61, 43);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 17 + "'", int2 == 17);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(64, (-19));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-47) + "'", int2 == (-47));
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(48, 30);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(13, (-80));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(43, 59);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 19 + "'", int2 == 19);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (byte) 10, (-15));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(75, 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(79, (-68));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-38) + "'", int2 == (-38));
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(57, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 38 + "'", int2 == 38);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(25, 53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(11, 24);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(14, 26);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(47, (-33));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(85, 56);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 62 + "'", int2 == 62);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(89, 83);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(71, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(70, 57);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67 + "'", int2 == 67);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (byte) 100, 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 96 + "'", int2 == 96);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(55, 90);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 19 + "'", int2 == 19);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(51, 89);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 50 + "'", int2 == 50);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(23, 37);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(98, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-67) + "'", int2 == (-67));
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(79, 14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(89, (-44));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-64) + "'", int2 == (-64));
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(97, 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 57 + "'", int2 == 57);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(45, (-19));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-12) + "'", int2 == (-12));
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(2, (-65));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(42, (-65));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(44, 62);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(5, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(78, 36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 56 + "'", int2 == 56);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (short) 100, (-45));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-77) + "'", int2 == (-77));
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (byte) 10, 89);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(3, 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 10, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(38, (-33));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(78, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(37, 96);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(86, (-46));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(86, 87);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(43, (-8));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-28) + "'", int2 == (-28));
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(49, (-14));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-16) + "'", int2 == (-16));
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(60, 12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 58 + "'", int2 == 58);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (byte) 10, 20);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(2, 41);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(52, (-27));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(7, (-40));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(6, (-15));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(73, 48);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 50 + "'", int2 == 50);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(92, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-55) + "'", int2 == (-55));
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(47, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 45 + "'", int2 == 45);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(80, 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(98, (-75));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-23) + "'", int2 == (-23));
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(14, (-7));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-11) + "'", int2 == (-11));
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(13, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(99, 93);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 88 + "'", int2 == 88);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(3, (-37));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(9, 38);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(14, (-98));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-11) + "'", int2 == (-11));
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(30, 68);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25 + "'", int2 == 25);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(82, 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40 + "'", int2 == 40);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) 'a', (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(49, (-41));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-21) + "'", int2 == (-21));
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(69, 38);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 50 + "'", int2 == 50);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(98, 25);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 44 + "'", int2 == 44);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(97, 28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 93 + "'", int2 == 93);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(26, 26);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(28, (-45));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-17) + "'", int2 == (-17));
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(95, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(87, 33);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 84 + "'", int2 == 84);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) 'a', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 19 + "'", int2 == 19);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(44, (-98));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(56, (-7));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-42) + "'", int2 == (-42));
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(48, 72);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(35, (-56));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-33) + "'", int2 == (-33));
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(11, 73);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(45, 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(66, (-83));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-54) + "'", int2 == (-54));
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(7, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(32, (-45));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-14) + "'", int2 == (-14));
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(97, 41);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(13, (-94));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(18, (-8));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(77, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(27, 71);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(17, (-90));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(99, 20);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 90 + "'", int2 == 90);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(88, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-48) + "'", int2 == (-48));
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(72, 99);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(63, 80);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(81, 25);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 66 + "'", int2 == 66);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(54, 39);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(77, 44);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34 + "'", int2 == 34);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(24, (-22));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(32, 29);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (byte) 1, (-63));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(35, (-75));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(85, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 61 + "'", int2 == 61);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(88, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 38 + "'", int2 == 38);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 1, (-16));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(100, (-8));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-96) + "'", int2 == (-96));
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(22, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(65, (-62));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-50) + "'", int2 == (-50));
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(84, (-73));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-24) + "'", int2 == (-24));
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(14, (-84));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (byte) 100, 21);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 24 + "'", int2 == 24);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(20, 48);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(39, 58);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(79, 83);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 44 + "'", int2 == 44);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(56, (-71));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(1, 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(19, (-61));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6) + "'", int2 == (-6));
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(37, (-62));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-19) + "'", int2 == (-19));
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(61, (-38));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(4, 80);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(85, 48);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72 + "'", int2 == 72);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(82, (-52));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(81, (-22));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-77) + "'", int2 == (-77));
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(91, 30);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) ' ', (-16));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6) + "'", int2 == (-6));
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (byte) 10, 80);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(18, 18);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(5, 19);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(77, (-56));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-21) + "'", int2 == (-21));
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(15, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(34, 54);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 21 + "'", int2 == 21);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(98, (-63));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-88) + "'", int2 == (-88));
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(8, (-24));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(4, (-7));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(11, (-66));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8) + "'", int2 == (-8));
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(27, 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 21 + "'", int2 == 21);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) '#', (-81));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-18) + "'", int2 == (-18));
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(65, (-54));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-62) + "'", int2 == (-62));
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(65, (-22));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-16) + "'", int2 == (-16));
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(80, 13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 73 + "'", int2 == 73);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (byte) 1, (-48));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(2, 23);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(52, 18);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 38 + "'", int2 == 38);
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(33, 26);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(45, (-71));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-36) + "'", int2 == (-36));
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(60, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(75, 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 28 + "'", int2 == 28);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(9, 42);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(67, (-72));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-45) + "'", int2 == (-45));
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(19, (-71));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(7, (-17));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(18, 71);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(31, 72);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(47, 44);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(3, 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(57, (-70));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-33) + "'", int2 == (-33));
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(63, (-8));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-32) + "'", int2 == (-32));
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(17, 22);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(10, (-79));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8) + "'", int2 == (-8));
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(80, (-34));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-48) + "'", int2 == (-48));
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(38, (-89));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8) + "'", int2 == (-8));
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(69, (-74));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(34, 56);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(65, 60);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 38 + "'", int2 == 38);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(57, (-51));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-41) + "'", int2 == (-41));
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(21, (-58));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(22, 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 19 + "'", int2 == 19);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(37, 53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 21 + "'", int2 == 21);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(62, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(39, 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(16, 92);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) ' ', 43);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(4, (-88));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(75, (-48));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-70) + "'", int2 == (-70));
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(96, 44);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(88, 86);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53 + "'", int2 == 53);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(15, (-11));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-11) + "'", int2 == (-11));
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(84, (-72));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-60) + "'", int2 == (-60));
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(52, 19);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 49 + "'", int2 == 49);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(100, (-79));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-23) + "'", int2 == (-23));
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(67, (-5));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-45) + "'", int2 == (-45));
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(67, (-63));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-17) + "'", int2 == (-17));
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(48, (-49));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-40) + "'", int2 == (-40));
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) 'a', 86);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 87 + "'", int2 == 87);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(86, (-86));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-55) + "'", int2 == (-55));
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(53, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(47, (-96));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-42) + "'", int2 == (-42));
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(95, 55);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(14, 25);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(2, (-54));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(4, 83);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(7, 43);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(11, (-98));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(61, 67);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(31, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 27 + "'", int2 == 27);
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(43, (-37));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-37) + "'", int2 == (-37));
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(37, (-45));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-30) + "'", int2 == (-30));
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(64, 83);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 19 + "'", int2 == 19);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(73, (-68));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-14) + "'", int2 == (-14));
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(72, (-73));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-12) + "'", int2 == (-12));
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(45, (-72));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-20) + "'", int2 == (-20));
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(88, 55);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 81 + "'", int2 == 81);
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(93, 96);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 55 + "'", int2 == 55);
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 10, 47);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(55, (-48));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-16) + "'", int2 == (-16));
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(36, 94);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(70, 40);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 70 + "'", int2 == 70);
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(67, 59);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(9, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(29, (-40));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-16) + "'", int2 == (-16));
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(13, (-88));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(64, 95);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (byte) 100, (-44));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-77) + "'", int2 == (-77));
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(83, (-9));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-19) + "'", int2 == (-19));
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(12, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(83, (-62));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-58) + "'", int2 == (-58));
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(39, (-35));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-22) + "'", int2 == (-22));
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(92, 95);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(41, (-12));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-26) + "'", int2 == (-26));
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(100, 26);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 46 + "'", int2 == 46);
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(43, (-12));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8) + "'", int2 == (-8));
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(92, (-87));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-57) + "'", int2 == (-57));
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(41, (-67));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(21, (-84));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-11) + "'", int2 == (-11));
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(71, (-74));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(25, (-54));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-10) + "'", int2 == (-10));
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(63, (-3));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-48) + "'", int2 == (-48));
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(79, (-34));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-13) + "'", int2 == (-13));
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(9, (-26));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(21, 17);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(55, 81);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(56, (-67));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-30) + "'", int2 == (-30));
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(77, 88);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(98, (-50));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-92) + "'", int2 == (-92));
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(2, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(79, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 28 + "'", int2 == 28);
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(97, 39);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(31, (-70));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-22) + "'", int2 == (-22));
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(21, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(45, (-94));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-43) + "'", int2 == (-43));
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(54, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(97, (-66));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-75) + "'", int2 == (-75));
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(52, 17);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 41 + "'", int2 == 41);
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(79, (-39));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-52) + "'", int2 == (-52));
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(70, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(14, (-94));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) '#', 86);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(83, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 58 + "'", int2 == 58);
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(94, 41);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 63 + "'", int2 == 63);
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(57, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(18, 79);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(7, (-81));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(39, 70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 19 + "'", int2 == 19);
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(36, 45);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 24 + "'", int2 == 24);
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(91, (-85));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-13) + "'", int2 == (-13));
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(91, (-61));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-78) + "'", int2 == (-78));
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (byte) 1, (-7));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(73, 41);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(64, 78);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 56 + "'", int2 == 56);
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(68, (-53));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-13) + "'", int2 == (-13));
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(98, (-17));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-18) + "'", int2 == (-18));
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(39, (-13));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(99, (-74));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-44) + "'", int2 == (-44));
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(88, 44);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 21 + "'", int2 == 21);
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(12, (-28));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(62, (-6));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(86, 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 86 + "'", int2 == 86);
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(64, (-67));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-22) + "'", int2 == (-22));
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(28, (-64));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-12) + "'", int2 == (-12));
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(67, (-90));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-58) + "'", int2 == (-58));
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (byte) 1, (-29));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(93, 42);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(92, (-47));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-34) + "'", int2 == (-34));
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(47, 27);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 19 + "'", int2 == 19);
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(67, (-94));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-57) + "'", int2 == (-57));
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(93, 28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 75 + "'", int2 == 75);
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(83, (-63));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-47) + "'", int2 == (-47));
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(78, 99);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 45 + "'", int2 == 45);
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(87, (-60));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-70) + "'", int2 == (-70));
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(44, 26);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(65, (-24));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-12) + "'", int2 == (-12));
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 100, (-48));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-53) + "'", int2 == (-53));
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(64, (-46));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-43) + "'", int2 == (-43));
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(56, 99);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(28, (-78));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-17) + "'", int2 == (-17));
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(88, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(96, (-71));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-78) + "'", int2 == (-78));
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(38, (-6));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-14) + "'", int2 == (-14));
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(49, (-75));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-46) + "'", int2 == (-46));
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(72, (-16));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-48) + "'", int2 == (-48));
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(65, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-63) + "'", int2 == (-63));
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(7, (-84));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(94, 14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(85, 70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(100, 84);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(28, (-28));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(41, (-66));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-35) + "'", int2 == (-35));
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (byte) 1, 74);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(81, (-44));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-51) + "'", int2 == (-51));
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(66, (-40));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-45) + "'", int2 == (-45));
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(41, 26);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 38 + "'", int2 == 38);
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(13, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(46, (-37));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-12) + "'", int2 == (-12));
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(2, (-31));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(40, 86);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34 + "'", int2 == 34);
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(65, 81);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 57 + "'", int2 == 57);
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(12, (-90));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-11) + "'", int2 == (-11));
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(34, (-92));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-25) + "'", int2 == (-25));
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(14, 43);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(77, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 27 + "'", int2 == 27);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(8, 31);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(31, 80);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(39, (-50));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-29) + "'", int2 == (-29));
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(31, 54);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 24 + "'", int2 == 24);
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(17, 20);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 17 + "'", int2 == 17);
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(42, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 39 + "'", int2 == 39);
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (byte) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22 + "'", int2 == 22);
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(4, 62);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(33, 94);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(14, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-12) + "'", int2 == (-12));
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(84, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 41 + "'", int2 == 41);
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(85, (-21));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-78) + "'", int2 == (-78));
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(16, (-4));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (short) 100, (-41));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-16) + "'", int2 == (-16));
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 1, 74);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(65, 70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 41 + "'", int2 == 41);
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(9, 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(77, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) ' ', (-43));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(11, 69);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(86, 25);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(22, (-26));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(64, 44);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(66, 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 57 + "'", int2 == 57);
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(32, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(56, 38);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 54 + "'", int2 == 54);
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(59, (-69));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-12) + "'", int2 == (-12));
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(47, 96);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 43 + "'", int2 == 43);
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(32, (-57));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(80, (-55));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-58) + "'", int2 == (-58));
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(48, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-31) + "'", int2 == (-31));
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(42, (-63));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-13) + "'", int2 == (-13));
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(19, (-62));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6) + "'", int2 == (-6));
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(88, 67);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 37 + "'", int2 == 37);
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(63, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-62) + "'", int2 == (-62));
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(6, (-61));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(71, (-27));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-17) + "'", int2 == (-17));
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(96, (-57));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-66) + "'", int2 == (-66));
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(72, 69);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 51 + "'", int2 == 51);
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(7, 55);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(25, (-96));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-12) + "'", int2 == (-12));
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(95, (-31));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-33) + "'", int2 == (-33));
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(5, 95);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(64, (-8));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-41) + "'", int2 == (-41));
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(44, 84);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 17 + "'", int2 == 17);
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(98, 53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 28 + "'", int2 == 28);
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(50, (-49));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-39) + "'", int2 == (-39));
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(54, (-39));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(48, (-19));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-22) + "'", int2 == (-22));
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(83, (-24));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-75) + "'", int2 == (-75));
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(85, 49);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 27 + "'", int2 == 27);
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(47, (-14));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-36) + "'", int2 == (-36));
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(53, 21);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 17 + "'", int2 == 17);
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(45, (-13));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-34) + "'", int2 == (-34));
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(60, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 41 + "'", int2 == 41);
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(71, 70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 51 + "'", int2 == 51);
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (byte) 100, 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(84, (-47));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-14) + "'", int2 == (-14));
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) '4', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 51 + "'", int2 == 51);
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(74, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(37, (-27));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) 'a', 87);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 19 + "'", int2 == 19);
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(38, (-19));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(28, 16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(17, (-48));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8) + "'", int2 == (-8));
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(54, (-47));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-41) + "'", int2 == (-41));
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(88, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 88 + "'", int2 == 88);
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (short) 1, 13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(47, (-45));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-18) + "'", int2 == (-18));
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(7, 96);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(87, 88);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 63 + "'", int2 == 63);
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(31, (-50));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-17) + "'", int2 == (-17));
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(77, 96);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(81, 98);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(61, (-99));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-30) + "'", int2 == (-30));
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(74, (-40));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-11) + "'", int2 == (-11));
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(22, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(98, 84);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67 + "'", int2 == 67);
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(61, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-59) + "'", int2 == (-59));
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(29, (-87));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-22) + "'", int2 == (-22));
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(61, 87);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22 + "'", int2 == 22);
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) '#', 75);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(20, (-86));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-12) + "'", int2 == (-12));
    }
}

