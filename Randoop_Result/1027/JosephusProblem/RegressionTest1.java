package JosephusProblem;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (short) 100, 27);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 27 + "'", int2 == 27);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(10, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(49, 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(21, 20);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(52, (-22));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-25) + "'", int2 == (-25));
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(10, 26);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(11, 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(2, 19);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) 'a', 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 63 + "'", int2 == 63);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(6, 46);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(49, 49);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 41 + "'", int2 == 41);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) '#', 22);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(14, 14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(34, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(18, 30);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(64, 44);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(53, (-37));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-21) + "'", int2 == (-21));
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(23, 75);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(36, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(75, (-78));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(48, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(12, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(9, (-51));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6) + "'", int2 == (-6));
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 1, (-40));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(85, (-71));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-23) + "'", int2 == (-23));
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (short) 100, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(26, (-38));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-13) + "'", int2 == (-13));
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(27, (-30));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-24) + "'", int2 == (-24));
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (short) 1, (-46));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(11, (-12));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (byte) 100, (-46));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-87) + "'", int2 == (-87));
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(19, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(25, 90);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (byte) 10, (-99));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(54, (-36));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-42) + "'", int2 == (-42));
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(50, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(1, (-46));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(40, (-4));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) '4', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(96, 54);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 65 + "'", int2 == 65);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (byte) 100, (-4));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-33) + "'", int2 == (-33));
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(18, (-28));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(7, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(39, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(25, 39);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(2, (-15));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(46, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(65, (-46));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-24) + "'", int2 == (-24));
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(33, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-31) + "'", int2 == (-31));
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(3, (-62));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(34, (-29));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-10) + "'", int2 == (-10));
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(11, 45);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(32, 58);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(90, (-42));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-81) + "'", int2 == (-81));
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(43, 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(5, (-31));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(34, 43);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 24 + "'", int2 == 24);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(31, (-28));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-27) + "'", int2 == (-27));
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(30, 27);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 19 + "'", int2 == 19);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(25, (-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(53, (-15));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-12) + "'", int2 == (-12));
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(13, 43);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(33, 48);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(89, 38);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 19 + "'", int2 == 19);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(16, (-22));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8) + "'", int2 == (-8));
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(40, 25);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 27 + "'", int2 == 27);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) 'a', (-44));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-43) + "'", int2 == (-43));
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(30, 38);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 24 + "'", int2 == 24);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(11, (-11));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6) + "'", int2 == (-6));
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(58, 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 57 + "'", int2 == 57);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(14, 33);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(53, 96);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(52, 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(33, 33);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25 + "'", int2 == 25);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(16, 12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(14, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-11) + "'", int2 == (-11));
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(13, (-81));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-10) + "'", int2 == (-10));
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(11, 25);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (byte) 100, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 21 + "'", int2 == 21);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(90, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 89 + "'", int2 == 89);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(17, 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(40, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40 + "'", int2 == 40);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(58, (-48));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-47) + "'", int2 == (-47));
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(100, (-62));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(48, (-32));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-19) + "'", int2 == (-19));
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(13, (-20));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-11) + "'", int2 == (-11));
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(24, 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22 + "'", int2 == 22);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(7, 23);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(34, 53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (byte) 10, 48);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(26, (-92));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-14) + "'", int2 == (-14));
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(100, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34 + "'", int2 == 34);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(31, 11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(44, 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 26 + "'", int2 == 26);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(49, (-28));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-15) + "'", int2 == (-15));
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(10, (-78));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(44, (-3));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-38) + "'", int2 == (-38));
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(15, (-30));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(25, (-51));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-15) + "'", int2 == (-15));
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(57, (-30));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-37) + "'", int2 == (-37));
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(4, 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(20, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(15, 38);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (byte) 1, 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(6, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) '4', (-27));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(20, (-25));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-17) + "'", int2 == (-17));
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(26, 96);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(38, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(27, (-37));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(5, (-33));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(4, (-95));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(51, 43);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 38 + "'", int2 == 38);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(30, 25);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 21 + "'", int2 == 21);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(1, 41);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(4, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(34, (-34));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6) + "'", int2 == (-6));
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(57, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53 + "'", int2 == 53);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(38, 89);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(26, 13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(7, (-62));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(31, (-82));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(46, 28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(33, 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 1, (-35));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(46, (-70));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-38) + "'", int2 == (-38));
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(23, 50);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (byte) 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(85, 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(65, 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(4, (-41));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(75, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40 + "'", int2 == 40);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(34, (-63));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-10) + "'", int2 == (-10));
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(2, 49);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(15, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(31, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-30) + "'", int2 == (-30));
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(34, 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(57, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(39, 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(90, 36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 70 + "'", int2 == 70);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(57, (-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-53) + "'", int2 == (-53));
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(64, (-36));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-49) + "'", int2 == (-49));
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(46, 27);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 38 + "'", int2 == 38);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (short) 1, (-30));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(31, (-53));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-11) + "'", int2 == (-11));
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(63, (-42));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-12) + "'", int2 == (-12));
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(4, (-15));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(24, 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(33, (-12));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6) + "'", int2 == (-6));
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(2, (-95));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(75, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-74) + "'", int2 == (-74));
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(89, 31);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(58, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-57) + "'", int2 == (-57));
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) '#', (-49));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-25) + "'", int2 == (-25));
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(26, (-49));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-15) + "'", int2 == (-15));
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(6, (-7));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(24, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(5, (-82));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(47, (-39));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-39) + "'", int2 == (-39));
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(96, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(25, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-24) + "'", int2 == (-24));
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(24, 96);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2 == 18);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(7, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(34, 63);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(7, (-30));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(36, (-51));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-27) + "'", int2 == (-27));
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(70, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-69) + "'", int2 == (-69));
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(20, (-31));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8) + "'", int2 == (-8));
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (byte) 100, 25);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 94 + "'", int2 == 94);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(63, (-41));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-33) + "'", int2 == (-33));
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(64, (-16));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-54) + "'", int2 == (-54));
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) '#', (-35));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-32) + "'", int2 == (-32));
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(53, 65);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(7, (-95));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (short) 10, (-33));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(70, (-62));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-21) + "'", int2 == (-21));
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(46, (-12));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-43) + "'", int2 == (-43));
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(75, 31);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(20, 75);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(85, (-6));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-65) + "'", int2 == (-65));
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(7, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(38, 85);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 38 + "'", int2 == 38);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(11, (-49));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(29, 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 27 + "'", int2 == 27);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(28, 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22 + "'", int2 == 22);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(40, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(64, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-63) + "'", int2 == (-63));
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(15, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(38, (-31));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-24) + "'", int2 == (-24));
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(19, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(36, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(6, 50);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(11, 27);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(2, (-8));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(15, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(1, 36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (short) 10, 38);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(33, (-37));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(12, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(7, 11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 1, (-17));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(40, (-43));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-20) + "'", int2 == (-20));
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(65, (-49));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-26) + "'", int2 == (-26));
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(2, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(65, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(52, 46);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(12, (-49));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(15, 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(14, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(19, 53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(54, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(29, (-24));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-11) + "'", int2 == (-11));
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(96, (-12));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-32) + "'", int2 == (-32));
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(70, (-35));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-39) + "'", int2 == (-39));
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(15, (-81));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-13) + "'", int2 == (-13));
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(45, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(24, (-13));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(17, (-29));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(13, (-38));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) ' ', (-4));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-13) + "'", int2 == (-13));
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(8, 14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(45, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2 == 18);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(34, (-29));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(6, 23);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(54, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 24 + "'", int2 == 24);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(40, 39);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 28 + "'", int2 == 28);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(36, 38);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (byte) 1, 49);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(17, 26);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(26, 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(19, 94);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(6, (-82));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(38, 23);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(39, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 37 + "'", int2 == 37);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 100, (-16));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-73) + "'", int2 == (-73));
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) ' ', 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(89, (-28));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-52) + "'", int2 == (-52));
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(96, 37);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(9, (-39));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6) + "'", int2 == (-6));
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(49, (-23));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-33) + "'", int2 == (-33));
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(70, (-5));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-60) + "'", int2 == (-60));
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(5, (-36));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(37, 19);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 26 + "'", int2 == 26);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(90, (-21));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8) + "'", int2 == (-8));
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(90, (-9));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-81) + "'", int2 == (-81));
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (byte) 100, 23);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(100, 94);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(18, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(35, 63);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (byte) 1, (-73));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 100, 43);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(8, 51);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(90, (-27));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-43) + "'", int2 == (-43));
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(47, (-81));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(34, 38);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(51, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 37 + "'", int2 == 37);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(58, (-92));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(90, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 19 + "'", int2 == 19);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(10, (-27));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(49, (-18));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-32) + "'", int2 == (-32));
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(4, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(94, (-70));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(15, (-40));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(64, (-53));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(4, (-35));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (short) 10, (-38));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8) + "'", int2 == (-8));
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(25, (-73));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(34, (-48));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-26) + "'", int2 == (-26));
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(64, (-29));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8) + "'", int2 == (-8));
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(45, (-70));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-14) + "'", int2 == (-14));
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(10, (-71));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(52, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40 + "'", int2 == 40);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) 'a', (-15));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-94) + "'", int2 == (-94));
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(45, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 44 + "'", int2 == 44);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) 'a', 18);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 56 + "'", int2 == 56);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(34, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(17, (-37));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8) + "'", int2 == (-8));
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(57, 18);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2 == 18);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(52, 30);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 51 + "'", int2 == 51);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(56, (-54));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(12, (-71));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6) + "'", int2 == (-6));
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(16, (-73));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-12) + "'", int2 == (-12));
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(17, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(58, (-14));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-35) + "'", int2 == (-35));
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(47, 31);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(17, 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(45, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(44, (-60));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-28) + "'", int2 == (-28));
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(51, 65);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(6, (-32));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(65, 92);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 28 + "'", int2 == 28);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(6, (-24));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(63, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-62) + "'", int2 == (-62));
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 100, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22 + "'", int2 == 22);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(16, 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(43, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-42) + "'", int2 == (-42));
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(90, (-81));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-83) + "'", int2 == (-83));
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(57, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 39 + "'", int2 == 39);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(27, (-47));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-24) + "'", int2 == (-24));
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(46, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(40, (-17));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-19) + "'", int2 == (-19));
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) ' ', 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(39, 22);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(32, 56);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(44, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (byte) 10, 43);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(52, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(35, 18);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(31, (-43));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-26) + "'", int2 == (-26));
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(70, (-49));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-67) + "'", int2 == (-67));
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 10, (-40));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6) + "'", int2 == (-6));
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(37, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34 + "'", int2 == 34);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(18, 19);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(18, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(64, (-92));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(51, (-82));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-18) + "'", int2 == (-18));
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(58, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(65, (-63));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-25) + "'", int2 == (-25));
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(75, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 41 + "'", int2 == 41);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(100, 89);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(45, 45);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22 + "'", int2 == 22);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(8, 11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(25, (-35));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-13) + "'", int2 == (-13));
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(26, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(37, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(28, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(33, 29);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(34, (-7));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-18) + "'", int2 == (-18));
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(54, 85);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(32, (-8));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-16) + "'", int2 == (-16));
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(12, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(23, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(57, (-16));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(15, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(15, (-62));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(10, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (byte) 100, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(100, (-94));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) '#', 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(22, (-35));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(15, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(56, 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(63, (-6));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8) + "'", int2 == (-8));
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(35, 43);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(38, 16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(10, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(90, (-9));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-82) + "'", int2 == (-82));
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(75, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 56 + "'", int2 == 56);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(16, (-30));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-14) + "'", int2 == (-14));
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(10, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(30, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 26 + "'", int2 == 26);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(4, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(14, (-43));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-12) + "'", int2 == (-12));
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (byte) 10, 90);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(7, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(34, 11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(75, (-99));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-53) + "'", int2 == (-53));
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (byte) 10, (-52));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(10, (-13));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(49, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2 == 18);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(65, (-52));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(28, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-24) + "'", int2 == (-24));
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(36, 96);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(90, (-26));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-70) + "'", int2 == (-70));
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(29, 47);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(75, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(75, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(22, (-67));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(22, (-41));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(63, 56);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(46, (-20));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(30, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25 + "'", int2 == 25);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(75, 94);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25 + "'", int2 == 25);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(53, 48);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(15, 12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(53, 92);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(27, (-21));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-16) + "'", int2 == (-16));
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(33, (-12));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(12, (-46));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(58, (-37));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-39) + "'", int2 == (-39));
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(28, 43);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 17 + "'", int2 == 17);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(17, 37);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 10, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(12, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) '4', 27);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(3, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(94, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 94 + "'", int2 == 94);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (byte) 100, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(2, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) '4', (-23));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(57, 17);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2 == 18);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(92, 13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 61 + "'", int2 == 61);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(22, (-24));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(32, (-71));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (byte) 100, 58);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2 == 18);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(65, 61);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 42 + "'", int2 == 42);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(56, 58);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 10, (-41));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6) + "'", int2 == (-6));
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(41, 56);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 26 + "'", int2 == 26);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 100, (-95));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-15) + "'", int2 == (-15));
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(26, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-24) + "'", int2 == (-24));
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(96, 50);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 90 + "'", int2 == 90);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(37, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-35) + "'", int2 == (-35));
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(46, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) 'a', (-4));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-20) + "'", int2 == (-20));
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(34, 53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(25, 90);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 19 + "'", int2 == 19);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(33, (-70));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(29, (-37));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-18) + "'", int2 == (-18));
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(16, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(92, 22);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 61 + "'", int2 == 61);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) 'a', (-78));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-87) + "'", int2 == (-87));
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(46, 53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 38 + "'", int2 == 38);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(46, (-34));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8) + "'", int2 == (-8));
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(94, (-13));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-85) + "'", int2 == (-85));
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(27, 47);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 26 + "'", int2 == 26);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(51, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 50 + "'", int2 == 50);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(51, (-46));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-20) + "'", int2 == (-20));
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(9, 33);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(40, (-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-23) + "'", int2 == (-23));
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(92, (-43));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-57) + "'", int2 == (-57));
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(24, (-20));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-13) + "'", int2 == (-13));
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(18, 38);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(31, (-67));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-21) + "'", int2 == (-21));
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(51, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-49) + "'", int2 == (-49));
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(54, (-95));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-16) + "'", int2 == (-16));
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(90, 92);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 87 + "'", int2 == 87);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (byte) 10, (-19));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(70, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67 + "'", int2 == 67);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(34, (-53));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(42, 63);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(2, 70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(31, 51);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(87, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(60, (-19));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-33) + "'", int2 == (-33));
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(16, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) 'a', (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-96) + "'", int2 == (-96));
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(56, 28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53 + "'", int2 == 53);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(63, (-39));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(9, 65);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(3, 23);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (byte) 1, 11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(94, 96);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 57 + "'", int2 == 57);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) '4', (-35));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-20) + "'", int2 == (-20));
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(12, 27);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(20, 29);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(26, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(85, (-96));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(29, 67);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 100, (-54));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-84) + "'", int2 == (-84));
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (byte) 100, 26);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 47 + "'", int2 == 47);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(28, 60);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(32, (-84));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(48, 37);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 41 + "'", int2 == 41);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(44, 85);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(58, (-13));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-53) + "'", int2 == (-53));
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(5, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(90, 46);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(41, (-65));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-28) + "'", int2 == (-28));
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(47, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(28, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 21 + "'", int2 == 21);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(56, (-26));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-43) + "'", int2 == (-43));
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(36, (-95));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-15) + "'", int2 == (-15));
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(52, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(3, (-11));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(29, (-41));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-12) + "'", int2 == (-12));
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(21, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-19) + "'", int2 == (-19));
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(94, (-83));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-77) + "'", int2 == (-77));
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(63, (-13));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-59) + "'", int2 == (-59));
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(87, (-24));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(43, (-27));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) '#', (-82));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(14, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (byte) 10, (-92));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(60, (-22));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-32) + "'", int2 == (-32));
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(33, 21);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(75, 54);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 42 + "'", int2 == 42);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(36, 41);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(26, (-20));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(61, (-52));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-55) + "'", int2 == (-55));
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (byte) 10, 26);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(20, (-18));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(19, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(24, (-8));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(29, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-28) + "'", int2 == (-28));
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(54, (-94));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-46) + "'", int2 == (-46));
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(87, (-35));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(22, (-27));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-14) + "'", int2 == (-14));
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(44, 89);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(87, (-11));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-81) + "'", int2 == (-81));
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(5, 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(54, (-49));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-26) + "'", int2 == (-26));
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(35, 58);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 10, 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(45, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-43) + "'", int2 == (-43));
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(67, 61);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(25, 21);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(61, (-4));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-37) + "'", int2 == (-37));
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(54, 75);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(36, (-21));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-15) + "'", int2 == (-15));
    }
}

