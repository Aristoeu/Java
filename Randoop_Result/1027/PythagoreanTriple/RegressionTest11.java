package PythagoreanTriple;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11 {

    public static boolean debug = false;

    @Test
    public void test5501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5501");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, (int) (short) 1, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5502");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, (int) ' ', 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5503");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) '#', (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5504");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, (int) (short) -1, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5505");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, (int) '#', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5506");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, (int) (byte) 100, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5507");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, (int) ' ', (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5508");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) ' ', (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5509");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (int) (byte) 10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5510");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) (short) 10, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5511");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) (byte) -1, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5512");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, (int) (byte) 100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5513");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, (int) (short) 10, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5514");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, (int) (short) 100, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5515");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', (-1), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5516");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(0, (int) (short) -1, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5517");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, (int) (byte) 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5518");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', 10, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5519");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', (int) (short) 100, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5520");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', (int) (byte) 0, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5521");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(0, (int) (short) 10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5522");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), 100, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5523");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', (int) (byte) 10, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5524");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) ' ', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5525");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, (int) (short) -1, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5526");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, (int) (short) -1, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5527");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (int) '#', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5528");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', 100, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5529");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', (int) '#', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5530");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), 10, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5531");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, (int) ' ', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5532");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (int) '#', (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5533");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', 1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5534");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) 'a', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5535");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, (int) (byte) -1, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5536");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, (int) '#', (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5537");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', 0, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5538");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (int) (short) 100, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5539");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, (int) (byte) 10, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5540");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) (short) -1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5541");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) (byte) 100, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5542");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', 10, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5543");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, (int) (short) -1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5544");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) (byte) 100, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5545");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(100, (int) (byte) 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5546");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(100, (int) (short) 10, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5547");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, (int) 'a', (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5548");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', (int) (short) 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5549");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(100, 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5550");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) (short) 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5551");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, (int) '4', 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5552");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, (int) (byte) 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5553");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) (byte) 100, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5554");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, (int) (byte) -1, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5555");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, (int) (short) 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5556");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, (int) '4', (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5557");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, (int) '#', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5558");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (-1), 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5559");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (-1), 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5560");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) (byte) 10, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5561");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), 100, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5562");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, (int) (short) 100, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5563");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, 10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5564");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, (int) (short) -1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5565");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, 0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5566");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, (int) (byte) 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5567");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', (int) (byte) 1, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5568");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, (-1), (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5569");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(100, (int) '#', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5570");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', 10, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5571");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (-1), 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5572");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', 10, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5573");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, 10, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5574");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, (int) (byte) 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5575");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (int) '#', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5576");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, 0, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5577");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (int) (short) 10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5578");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', (int) (byte) 100, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5579");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (int) '4', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5580");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5581");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, (int) 'a', 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5582");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, 10, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5583");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', (int) (short) 1, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5584");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, 10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5585");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', (int) (byte) 10, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5586");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', (int) (short) 1, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5587");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', 100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5588");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, (int) (byte) -1, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5589");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) '#', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5590");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, (int) '4', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5591");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, (int) (byte) 1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5592");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, (int) ' ', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5593");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(100, (-1), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5594");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, (int) '#', (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5595");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, (int) (short) 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5596");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, (int) 'a', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5597");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (int) (byte) 0, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5598");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, (int) (short) -1, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5599");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, (int) 'a', 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5600");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(100, (int) (short) 0, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5601");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, (int) ' ', 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5602");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', (int) (byte) 10, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5603");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) ' ', 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5604");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, (int) (short) 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5605");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, (int) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5606");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, (int) (short) 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5607");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, 1, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5608");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, (int) (short) 0, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5609");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', (int) (short) 100, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5610");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5611");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(100, (int) (byte) -1, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5612");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, (int) '4', (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5613");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) (byte) 100, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5614");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, (int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5615");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) (byte) 10, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5616");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', (int) (byte) 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5617");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(0, (int) '#', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5618");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, (int) (byte) 0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5619");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, (int) (short) 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5620");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (-1), (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5621");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5622");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (-1), (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5623");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(100, (int) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5624");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, (int) (short) 1, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5625");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, (int) (short) -1, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5626");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (int) (byte) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5627");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', (int) (byte) 100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5628");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, 0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5629");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) (short) 100, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5630");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, (int) '4', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5631");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) (byte) 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5632");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, 0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5633");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, (int) (byte) 100, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5634");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, 100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5635");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, (int) (short) 10, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5636");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, (-1), 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5637");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, 10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5638");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, (int) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5639");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, (int) ' ', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5640");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) (short) 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5641");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (int) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5642");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', (int) ' ', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5643");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, (int) (short) -1, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5644");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (int) ' ', (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5645");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, (int) (short) 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5646");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5647");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (int) (byte) -1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5648");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, (int) ' ', 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5649");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) (byte) -1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5650");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', (int) (byte) 100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5651");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) '4', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5652");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', 1, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5653");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) (short) 0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5654");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (int) '#', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5655");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (int) (byte) 100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5656");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (int) '4', (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5657");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) (byte) 100, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5658");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', (int) 'a', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5659");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) (short) 0, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5660");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) (short) -1, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5661");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (int) (byte) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5662");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) 'a', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5663");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', (int) 'a', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5664");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', 10, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5665");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (-1), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5666");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(0, (int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5667");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, (int) (byte) 0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5668");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (int) (byte) 0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5669");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(100, (int) (byte) 100, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5670");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, (int) (short) 100, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5671");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) (byte) 10, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5672");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, 100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5673");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(100, (int) (short) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5674");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, (int) ' ', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5675");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', (int) (short) 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5676");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, (int) (short) 0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5677");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5678");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, (int) '#', (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5679");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, (int) (short) 10, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5680");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, (int) '#', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5681");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, (int) (byte) -1, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5682");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, (int) (byte) 100, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5683");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5684");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, (int) (byte) 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5685");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', (int) (byte) 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5686");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, 10, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5687");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (int) (short) 10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5688");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5689");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (int) (short) 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5690");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, (int) (short) 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5691");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(100, (int) (short) 0, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5692");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(100, (int) (short) 100, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5693");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', (int) (byte) -1, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5694");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', (int) (byte) 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5695");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, (int) (short) 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5696");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, (int) 'a', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5697");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) (byte) -1, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5698");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, (int) (short) 100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5699");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, (int) (short) -1, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5700");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5701");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, (int) '#', (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5702");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) (short) 0, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5703");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(100, (int) (short) 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5704");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) 'a', 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5705");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5706");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, (int) (short) 0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5707");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (int) 'a', (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5708");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (int) '4', (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5709");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(0, (int) (byte) 10, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5710");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (int) ' ', (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5711");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) (byte) 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5712");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', (int) ' ', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5713");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, (int) '#', 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5714");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, 10, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5715");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, (-1), (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5716");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (int) (short) 10, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5717");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, 1, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5718");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, (int) 'a', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5719");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(0, (int) (short) 1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5720");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, 1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5721");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, (int) (short) 10, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5722");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(0, (int) (byte) 10, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5723");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, 10, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5724");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', (int) (short) 100, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5725");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', (-1), 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5726");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, (int) ' ', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5727");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (int) 'a', (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5728");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5729");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) ' ', (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5730");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5731");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, (int) 'a', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5732");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, (int) (byte) 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5733");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, (int) '#', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5734");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, (int) (byte) 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5735");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) '#', (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5736");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, (int) (short) 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5737");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, (int) (short) 0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5738");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', 10, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5739");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, (int) ' ', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5740");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, 100, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5741");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(100, 1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5742");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, (int) ' ', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5743");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, (-1), 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5744");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) (byte) 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5745");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, (int) (byte) 10, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5746");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, (int) (byte) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5747");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', (int) (short) 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5748");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5749");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', (-1), (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5750");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (int) (short) 100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5751");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', (int) (byte) 10, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5752");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, (int) (short) 100, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5753");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) (short) 0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5754");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), 1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5755");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) (byte) 10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5756");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (int) (byte) 1, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5757");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, (int) 'a', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5758");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, (int) '4', 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5759");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, 1, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5760");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, (int) '#', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5761");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, (int) (short) 10, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5762");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, (-1), 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5763");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (int) ' ', 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5764");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, (int) (byte) -1, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5765");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) (byte) 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5766");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (int) (short) 1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5767");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', (int) (byte) 0, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5768");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (int) (byte) -1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5769");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, (int) (byte) 100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5770");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, 1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5771");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, (int) (short) 100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5772");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, 100, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5773");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, 0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5774");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, (int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5775");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(0, (int) (short) -1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5776");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', 10, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5777");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, (int) (short) 100, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5778");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, (int) '4', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5779");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, 10, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5780");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, (int) (byte) 1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5781");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', (int) (short) 1, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5782");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, (int) (short) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5783");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, (int) (byte) 100, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5784");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, (-1), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5785");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (-1), (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5786");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, (int) ' ', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5787");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', 1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5788");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) 'a', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5789");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (int) (short) -1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5790");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5791");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, (int) (short) 0, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5792");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (int) (short) 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5793");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(100, (int) ' ', (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5794");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5795");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, (int) (short) 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5796");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) (short) 100, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5797");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) (short) 1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5798");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (int) 'a', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5799");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5800");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, (int) (byte) 0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5801");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, (int) 'a', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5802");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, (int) (byte) 10, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5803");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (-1), 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5804");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5805");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (int) (byte) -1, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5806");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (int) ' ', 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5807");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(100, (int) (byte) 0, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5808");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(100, (int) (byte) 1, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5809");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(100, (int) (byte) 10, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5810");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5811");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (int) (byte) 10, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5812");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, (int) (byte) 100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5813");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) (short) 1, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5814");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, (int) (byte) -1, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5815");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (int) (byte) -1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5816");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) (short) -1, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5817");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', (int) (byte) -1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5818");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, (int) (byte) 1, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5819");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) '4', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5820");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, (int) 'a', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5821");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (int) (byte) 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5822");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, 1, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5823");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (int) (short) 100, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5824");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, (int) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5825");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) (byte) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5826");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (int) (byte) 0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5827");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) (byte) 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5828");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, (int) 'a', (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5829");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, (int) (short) 10, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5830");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, 1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5831");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5832");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) ' ', (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5833");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (int) (short) 1, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5834");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(100, 100, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5835");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, (int) '#', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5836");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', (int) ' ', (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5837");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (int) 'a', (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5838");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', 10, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5839");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', (-1), (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5840");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', (int) (short) -1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5841");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, 100, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5842");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', (int) (short) -1, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5843");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, (int) 'a', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5844");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, (int) (byte) -1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5845");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', (-1), (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5846");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', (int) 'a', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5847");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (int) 'a', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5848");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, (int) (short) 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5849");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', 10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5850");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(0, (int) (short) 0, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5851");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, (int) ' ', 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5852");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', (int) (short) 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5853");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', (int) ' ', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5854");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) '4', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5855");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5856");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, (int) (short) 10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5857");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, (int) (short) 10, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5858");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, (int) (short) 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5859");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, (int) (byte) 10, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5860");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (-1), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5861");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', 1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5862");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (int) (short) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5863");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, (int) (short) 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5864");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (-1), 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5865");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) '#', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5866");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5867");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(0, (int) ' ', (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5868");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, (int) (short) 0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5869");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, 10, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5870");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (int) '4', 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5871");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, 1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5872");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5873");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (int) (byte) 100, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5874");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) (short) -1, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5875");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (-1), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5876");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', (int) (byte) -1, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5877");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', (int) (short) 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5878");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', (int) (byte) -1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5879");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, 1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5880");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', (int) (byte) -1, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5881");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(0, (int) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5882");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (int) ' ', (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5883");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, (int) (byte) 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5884");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) (byte) -1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5885");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (int) (short) 1, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5886");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, 100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5887");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(100, 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5888");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5889");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (int) '4', (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5890");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, 10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5891");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (int) '4', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5892");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, 100, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5893");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, (int) (byte) 10, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5894");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, (int) (short) 0, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5895");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), 1, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5896");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, (int) (byte) -1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5897");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, 0, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5898");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', (int) (byte) 100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5899");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', (int) 'a', (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5900");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, (int) (byte) 100, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5901");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, (int) ' ', (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5902");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, (int) (byte) 1, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5903");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, (int) (short) 10, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5904");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, 100, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5905");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, (int) (byte) -1, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5906");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(100, (int) '4', (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5907");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) (byte) 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5908");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) '#', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5909");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, (-1), 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5910");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, 1, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5911");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, (int) '4', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5912");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) (short) 1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5913");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', 100, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5914");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, (int) (short) 10, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5915");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', (int) (short) 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5916");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (int) '4', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5917");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', 10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5918");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(0, (int) (byte) 0, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5919");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, (int) (byte) 0, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5920");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, (int) (byte) 100, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5921");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(100, (int) (byte) 10, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5922");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(10, (int) ' ', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5923");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, (int) (short) 0, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5924");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) 'a', 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5925");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (int) (short) 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5926");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, (int) '4', 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5927");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, (int) (short) 100, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5928");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, 1, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5929");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, (int) (byte) -1, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5930");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', (int) '#', (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5931");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', (int) (short) 1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5932");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), 1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5933");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, (int) (byte) -1, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5934");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, (int) (short) 0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5935");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', (int) '#', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5936");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 1, 100, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5937");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (int) (short) 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5938");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (int) (byte) 1, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5939");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) 'a', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5940");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, (int) (byte) 0, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5941");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, 1, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5942");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(0, (int) (short) 10, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5943");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (int) '4', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5944");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, (int) (byte) 1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5945");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (int) (byte) 10, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5946");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, (-1), (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5947");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, (int) (short) 0, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5948");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (int) (byte) 10, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5949");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, (int) (byte) -1, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5950");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, (int) '#', 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5951");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(100, (int) (short) 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5952");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) (byte) 1, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5953");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (int) (byte) 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5954");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (int) (byte) 0, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5955");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (int) (byte) 1, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5956");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, 1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5957");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', (-1), (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5958");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', (int) (short) 10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5959");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, 100, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5960");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, (int) 'a', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5961");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, (int) ' ', (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5962");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, (-1), (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5963");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, (int) (short) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5964");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(100, (int) (short) 10, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5965");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (-1), (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5966");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', (int) (byte) 100, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5967");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', (int) '4', 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5968");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '#', (int) (byte) 0, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5969");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (int) (byte) 10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5970");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, 100, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5971");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) (byte) 10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5972");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', (int) (byte) 100, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5973");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, (-1), (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5974");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(1, (int) (byte) 1, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5975");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(100, (-1), (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5976");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5977");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, 10, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5978");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, (int) (byte) 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5979");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 100, (int) (short) 0, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5980");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', (int) (byte) 10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5981");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, (int) (byte) -1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5982");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, (int) (short) 1, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5983");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 0, (int) (short) 10, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5984");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (int) (byte) 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5985");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5986");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', (int) (byte) -1, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5987");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, (int) '#', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5988");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple(100, (int) (short) 10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5989");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 100, (int) (byte) 0, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5990");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 0, (int) (short) 0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5991");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 10, 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5992");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) -1, 1, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5993");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (int) (short) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5994");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) 'a', (int) (byte) 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5995");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (byte) 10, (int) (byte) -1, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5996");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) '4', (int) (byte) 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5997");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) 1, (int) 'a', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5998");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) (short) -1, 10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5999");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((-1), (int) (short) 10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test6000");
        boolean boolean3 = com.thealgorithms.maths.PythagoreanTriple.isPythagTriple((int) ' ', (int) (short) 100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }
}

