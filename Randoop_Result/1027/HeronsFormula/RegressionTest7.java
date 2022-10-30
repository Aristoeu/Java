package HeronsFormula;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, 1, (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, 10, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) '4', (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, 0, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) (short) -1, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) (short) -1, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (-1), 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (byte) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.993746088859544d + "'", double3 == 4.993746088859544d);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (byte) 1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) (short) -1, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) '4', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 258.7952858921507d + "'", double3 == 258.7952858921507d);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) 'a', (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) 'a', (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, 1, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, (int) '4', 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, 1, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) '4', (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (short) 10, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (-1), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) (short) -1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) (byte) -1, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, 100, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) ' ', (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) ' ', (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (short) 1, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) 'a', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) '4', (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) ' ', (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, 0, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (byte) 100, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (byte) -1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, 100, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (-1), (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), 0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (byte) 1, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) '#', (int) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 17.498214194597114d + "'", double3 == 17.498214194597114d);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (-1), (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), 10, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (-1), (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) (short) -1, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) (byte) 1, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) (byte) 100, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (short) -1, 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) (short) 1, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, (int) (byte) 10, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, 1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) '#', (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, 100, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) (short) 0, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) '4', (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (byte) 1, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (-1), (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (short) 0, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) '#', 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (-1), 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, 100, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (-1), (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), 10, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, 10, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (short) 1, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', 1, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) '4', (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (short) 10, 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.993746088859544d + "'", double3 == 4.993746088859544d);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (-1), 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) (byte) -1, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) (short) 100, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) (short) 1, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (short) 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 469.2093749063418d + "'", double3 == 469.2093749063418d);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (byte) 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (short) 100, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (-1), (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, 0, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) (short) 10, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (short) 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 469.2093749063418d + "'", double3 == 469.2093749063418d);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, 0, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 499.3746088859545d + "'", double3 == 499.3746088859545d);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (short) 10, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) 'a', (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, 100, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 49.9993749960937d + "'", double3 == 49.9993749960937d);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) '4', (int) '4');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 25.998798049140657d + "'", double3 == 25.998798049140657d);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) '4', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2510.582402551249d + "'", double3 == 2510.582402551249d);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (short) 0, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) ' ', (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (short) 10, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, (int) (short) 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) (byte) 0, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (-1), (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, 1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, 1, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) ' ', (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) ' ', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.998046755776157d + "'", double3 == 15.998046755776157d);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) (short) 0, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) (short) 0, 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (-1), (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, 0, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, 100, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) (short) -1, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) 'a', (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (-1), (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (short) 100, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (byte) 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (-1), (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) (short) 10, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, 10, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, 1, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) '4', (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, 1, 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (byte) 100, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', 0, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), 10, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (byte) 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (byte) 1, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) (byte) -1, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) (short) 10, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) (byte) -1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, 10, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (byte) 1, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) (byte) -1, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 49.9993749960937d + "'", double3 == 49.9993749960937d);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) 'a', 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) (short) 0, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (short) -1, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) (byte) 10, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', 0, (int) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (short) 0, (int) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) '#', 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) (short) 100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) (short) 10, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (byte) -1, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), 1, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) (byte) 10, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) (short) 10, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.993746088859544d + "'", double3 == 4.993746088859544d);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) (byte) 100, (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 49.9993749960937d + "'", double3 == 49.9993749960937d);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (byte) 1, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) (short) 0, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (-1), (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, 1, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) (byte) 0, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) '4', (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, (-1), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (byte) 0, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (byte) 10, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', 0, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', 1, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (byte) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2510.582402551249d + "'", double3 == 2510.582402551249d);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', 10, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 469.2093749063418d + "'", double3 == 469.2093749063418d);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, 0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) (short) 100, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, 0, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (short) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 49.9993749960937d + "'", double3 == 49.9993749960937d);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) ' ', (int) '4');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 548.3255761862655d + "'", double3 == 548.3255761862655d);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (short) 1, 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) (short) 10, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) ' ', 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.998046755776157d + "'", double3 == 15.998046755776157d);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, 10, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) ' ', (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) (byte) 0, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) ' ', (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', 0, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) (short) -1, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) '#', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 17.498214194597114d + "'", double3 == 17.498214194597114d);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, 100, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (short) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (byte) -1, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) 'a', (int) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) 'a', (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (-1), (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) (short) -1, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (short) 1, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (-1), 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', 0, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, 1, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, 0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, 100, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, 0, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (byte) 100, (int) '4');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 714.142842854285d + "'", double3 == 714.142842854285d);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) ' ', (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), 100, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (short) 0, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) (short) -1, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, 1, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) '#', (int) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 609.1994747207191d + "'", double3 == 609.1994747207191d);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, 100, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, 0, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, 10, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) ' ', (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (byte) 10, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) (byte) -1, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (-1), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) 'a', (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (short) 10, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (short) 10, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (short) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, (int) (short) 0, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, (int) (short) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (short) 0, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (short) -1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) 'a', (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, 10, 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) '#', (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) (byte) 1, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) (short) -1, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) (byte) -1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, 10, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, 1, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, 0, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (byte) 0, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) 'a', (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', 10, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (byte) 1, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) (byte) 100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 49.9993749960937d + "'", double3 == 49.9993749960937d);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) '4', 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (short) 10, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, 100, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) (short) 1, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (short) 10, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) (short) 0, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (-1), (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, (int) '#', (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) ' ', 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (-1), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 49.9993749960937d + "'", double3 == 49.9993749960937d);
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (byte) 100, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (short) 100, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (short) 100, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', 1, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) '#', (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (short) 100, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (-1), (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) (short) 1, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) 'a', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 469.2093749063418d + "'", double3 == 469.2093749063418d);
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, 10, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) ' ', (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) '#', (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (short) 0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (short) 100, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, 1, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (byte) 0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (short) 0, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) (short) -1, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) '#', (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) '4', (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) (byte) 10, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (short) -1, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) (short) 0, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (byte) 0, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) '#', 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) '#', (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (byte) 100, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) ' ', (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (short) 100, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, 0, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (byte) 0, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', 100, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, (int) '#', (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (byte) 0, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, 10, 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.993746088859544d + "'", double3 == 4.993746088859544d);
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', 1, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) (byte) 10, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) (short) 10, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, (int) '#', (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) ' ', (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (-1), (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (short) 1, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (short) 0, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) 'a', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 469.2093749063418d + "'", double3 == 469.2093749063418d);
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) (short) 1, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) (short) 0, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) (short) -1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (-1), 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', 100, 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2510.582402551249d + "'", double3 == 2510.582402551249d);
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (short) 0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (byte) 1, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) 'a', (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) ' ', 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) (short) -1, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4330.127018922193d + "'", double3 == 4330.127018922193d);
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4241.393631520187d + "'", double3 == 4241.393631520187d);
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (-1), (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) (byte) 0, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) 'a', (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, 0, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', 0, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) (short) 0, 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) 'a', (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, 100, 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) (short) 1, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, 0, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (-1), (int) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (byte) 10, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) '4', (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, 0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', 0, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) (byte) 10, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) (short) 10, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, 100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 49.9993749960937d + "'", double3 == 49.9993749960937d);
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, 1, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) 'a', (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, 10, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) ' ', (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) '4', (int) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2466.056758775029d + "'", double3 == 2466.056758775029d);
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (byte) 100, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) '#', (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (short) 10, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (short) 0, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) '4', (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) (short) -1, (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (byte) -1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, 100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 49.9993749960937d + "'", double3 == 49.9993749960937d);
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, 1, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) (byte) -1, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (short) 0, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) (short) 100, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (short) 1, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (short) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2510.582402551249d + "'", double3 == 2510.582402551249d);
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (short) 10, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (short) 0, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', 1, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) '4', (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.993746088859544d + "'", double3 == 4.993746088859544d);
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, 1, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) (byte) 100, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) (short) -1, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) (byte) 10, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) '#', (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) (byte) 100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 49.9993749960937d + "'", double3 == 49.9993749960937d);
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) ' ', 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (byte) 100, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) (byte) 0, 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) (byte) 100, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', 0, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, 10, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (-1), (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, 10, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (-1), (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) 'a', (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) '4', (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) (short) 1, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) 'a', (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) 'a', (int) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1669.6458269645093d + "'", double3 == 1669.6458269645093d);
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) ' ', 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, 0, 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (byte) -1, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, (int) (short) 100, 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', 100, (int) '4');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 714.142842854285d + "'", double3 == 714.142842854285d);
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) '#', (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) 'a', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4241.393631520187d + "'", double3 == 4241.393631520187d);
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (short) -1, 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.993746088859544d + "'", double3 == 4.993746088859544d);
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) (short) 0, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) ' ', (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (-1), 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) (byte) 1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (byte) 10, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) 'a', (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (-1), (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) '#', 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (short) -1, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) '#', (int) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1690.0840215799924d + "'", double3 == 1690.0840215799924d);
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) (short) 100, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, 0, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (short) 100, 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 469.2093749063418d + "'", double3 == 469.2093749063418d);
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, 100, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (byte) 10, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (short) 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 43.30127018922193d + "'", double3 == 43.30127018922193d);
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', 1, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, 10, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) (short) -1, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) 'a', (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, 10, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) (byte) 0, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) '4', (int) '4');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 25.998798049140657d + "'", double3 == 25.998798049140657d);
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) (short) 100, (int) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1579.3872229443925d + "'", double3 == 1579.3872229443925d);
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) ' ', 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 469.2093749063418d + "'", double3 == 469.2093749063418d);
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, 10, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) (byte) 1, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, 100, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, 10, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (byte) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) (byte) 10, 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4156.019730463271d + "'", double3 == 4156.019730463271d);
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) (byte) 0, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, (int) (short) 1, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, 0, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) (short) 100, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', 100, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (byte) 0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (short) 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (short) -1, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (short) 1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) (byte) 10, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (-1), (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) (short) 100, 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1579.3872229443925d + "'", double3 == 1579.3872229443925d);
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, (int) 'a', (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) ' ', (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, 0, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, (int) (byte) -1, (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) (short) -1, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) (short) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (byte) 1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (short) 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) (short) 1, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) '#', 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) (byte) 0, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (short) 10, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) (byte) 100, 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 49.9993749960937d + "'", double3 == 49.9993749960937d);
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) '4', (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) '4', (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, 0, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) '4', (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (-1), 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) (short) 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 49.9993749960937d + "'", double3 == 49.9993749960937d);
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) (byte) -1, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (short) 100, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) (byte) -1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) (short) 1, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) '4', (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) (byte) 0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (short) 1, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (byte) 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4241.393631520187d + "'", double3 == 4241.393631520187d);
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) (byte) 0, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) '#', (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) (byte) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (short) -1, (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', 1, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, (int) (short) -1, 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) (byte) -1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) (byte) 0, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) (short) 100, 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) (short) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1722.9947584075815d + "'", double3 == 1722.9947584075815d);
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, 10, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) (byte) 0, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (byte) 10, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) '#', (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) 'a', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 469.2093749063418d + "'", double3 == 469.2093749063418d);
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (short) 100, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) (short) -1, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) (byte) 100, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (short) -1, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, (int) ' ', (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, 100, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (byte) -1, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (-1), (int) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) '4', (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) '4', 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) ' ', (int) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1548.2202483819929d + "'", double3 == 1548.2202483819929d);
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) (byte) 100, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) (short) 10, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (short) -1, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (byte) 10, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) (byte) 100, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) (short) 10, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, 100, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) (short) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 49.9993749960937d + "'", double3 == 49.9993749960937d);
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) (byte) 0, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (short) 100, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, 1, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, 0, 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (byte) -1, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, (int) '4', (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 49.9993749960937d + "'", double3 == 49.9993749960937d);
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) '4', 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, 100, (int) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1722.9947584075815d + "'", double3 == 1722.9947584075815d);
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) '#', (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) (short) 10, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', 1, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 49.9993749960937d + "'", double3 == 49.9993749960937d);
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, 0, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (short) 10, 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 469.2093749063418d + "'", double3 == 469.2093749063418d);
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) (short) -1, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) (short) 10, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, 100, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (byte) 0, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, 0, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (byte) 10, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3988");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) '#', (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3989");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) ' ', (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) (byte) 10, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3991");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', 1, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3992");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) (short) 100, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3993");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (short) -1, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3994");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) (short) 10, (int) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 158.03480629279107d + "'", double3 == 158.03480629279107d);
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3995");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) ' ', (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, 0, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (-1), (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3998");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) (short) 0, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3999");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', 100, (int) '4');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2466.056758775029d + "'", double3 == 2466.056758775029d);
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test4000");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', 1, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }
}

