package HeronsFormula;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest13 {

    public static boolean debug = false;

    @Test
    public void test6501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6501");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (short) 0, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6502");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) ' ', (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6503");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, 10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test6504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6504");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) ' ', (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6505");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6506");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) (byte) 100, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6507");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, 1, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6508");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) '#', (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6509");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) '#', (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6510");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) ' ', (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6511");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, 1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test6512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6512");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, 1, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6513");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), 100, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6514");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6515");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (byte) 1, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6516");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) ' ', (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6517");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (short) 100, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6518");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) '4', (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6519");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (short) 0, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6520");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) (short) 100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 499.3746088859545d + "'", double3 == 499.3746088859545d);
    }

    @Test
    public void test6521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6521");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) ' ', 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6522");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (short) -1, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6523");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (short) 10, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6524");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (byte) 0, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6525");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (-1), (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.993746088859544d + "'", double3 == 4.993746088859544d);
    }

    @Test
    public void test6526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6526");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (short) -1, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6527");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) (short) 100, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6528");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) 'a', (int) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 484.3552415324934d + "'", double3 == 484.3552415324934d);
    }

    @Test
    public void test6529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6529");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, (int) (short) -1, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6530");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) (byte) 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 49.9993749960937d + "'", double3 == 49.9993749960937d);
    }

    @Test
    public void test6531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6531");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (byte) 0, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6532");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) (short) 10, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6533");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) ' ', (int) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.998046755776157d + "'", double3 == 15.998046755776157d);
    }

    @Test
    public void test6534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6534");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) (byte) 0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
    }

    @Test
    public void test6535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6535");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, 100, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6536");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) (byte) -1, (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test6537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6537");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (byte) 100, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6538");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6539");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (-1), (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6540");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (short) -1, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6541");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (-1), (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6542");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) '#', (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6543");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (short) 100, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6544");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (short) 0, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6545");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) (byte) 0, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6546");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, 10, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6547");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) (byte) -1, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6548");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) 'a', (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6549");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, 100, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6550");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, 100, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6551");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) (short) 0, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6552");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (short) 0, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6553");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) 'a', (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6554");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (-1), (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6555");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) (short) 0, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6556");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (short) 10, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6557");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) '#', (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6558");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) '#', (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6559");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) ' ', (int) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 157.99505530237332d + "'", double3 == 157.99505530237332d);
    }

    @Test
    public void test6560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6560");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (short) 1, 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test6561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6561");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', 1, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6562");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', 100, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6563");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, 1, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6564");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (byte) -1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test6565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6565");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) (short) 0, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6566");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, 100, 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4330.127018922193d + "'", double3 == 4330.127018922193d);
    }

    @Test
    public void test6567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6567");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) (short) 100, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6568");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) (byte) 10, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6569");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (short) 10, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6570");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, 10, (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.993746088859544d + "'", double3 == 4.993746088859544d);
    }

    @Test
    public void test6571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6571");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) '#', (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6572");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (byte) 0, (int) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test6573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6573");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (short) 100, (int) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1690.0840215799924d + "'", double3 == 1690.0840215799924d);
    }

    @Test
    public void test6574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6574");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) (byte) -1, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6575");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (byte) -1, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6576");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (byte) 1, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6577");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (short) -1, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6578");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) (short) 10, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6579");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) '4', (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6580");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) '#', 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6581");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) (short) -1, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6582");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) '#', (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6583");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (short) 0, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6584");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) '#', 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6585");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) (short) 10, 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 499.3746088859545d + "'", double3 == 499.3746088859545d);
    }

    @Test
    public void test6586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6586");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (short) 10, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6587");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) (byte) 0, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6588");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (short) 1, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6589");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (short) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6590");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) (short) 10, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6591");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) (short) -1, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6592");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) '#', (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6593");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) (byte) -1, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6594");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), 100, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6595");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) '#', (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6596");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, 10, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6597");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) ' ', 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6598");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) (short) 10, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6599");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (byte) 1, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6600");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) '4', (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6601");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (byte) 1, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6602");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) (byte) 10, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6603");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (byte) 0, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6604");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (short) 0, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6605");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) (short) -1, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6606");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (short) 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.993746088859544d + "'", double3 == 4.993746088859544d);
    }

    @Test
    public void test6607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6607");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) ' ', (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6608");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (-1), (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6609");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) ' ', (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6610");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (short) 0, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6611");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) ' ', (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6612");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (byte) -1, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6613");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (byte) 100, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6614");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) ' ', 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6615");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (byte) -1, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6616");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (byte) 10, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6617");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) (byte) 0, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6618");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (short) 1, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6619");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) (short) 1, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6620");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) '#', (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6621");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (short) 10, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6622");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6623");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) (byte) 10, 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 499.3746088859545d + "'", double3 == 499.3746088859545d);
    }

    @Test
    public void test6624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6624");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) '4', (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6625");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) '#', (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6626");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) (short) 1, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6627");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, 100, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6628");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) (short) 1, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6629");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', 1, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6630");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) '4', (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6631");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (byte) 100, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6632");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) (byte) -1, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6633");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) (short) 100, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6634");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, 10, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6635");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (-1), (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6636");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', 1, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6637");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, 1, 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test6638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6638");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (byte) 10, 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test6639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6639");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6640");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (short) 1, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6641");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) 'a', (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6642");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) ' ', (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6643");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) '#', (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6644");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', 10, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6645");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (short) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6646");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) 'a', (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6647");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.993746088859544d + "'", double3 == 4.993746088859544d);
    }

    @Test
    public void test6648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6648");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) (short) 1, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6649");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (short) 1, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6650");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) 'a', (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6651");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (short) 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.993746088859544d + "'", double3 == 4.993746088859544d);
    }

    @Test
    public void test6652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6652");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) (short) -1, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6653");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (byte) 1, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6654");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (short) 10, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6655");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6656");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) (short) -1, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6657");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (short) 1, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6658");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) (short) 1, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6659");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, 10, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6660");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (byte) 100, 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 49.9993749960937d + "'", double3 == 49.9993749960937d);
    }

    @Test
    public void test6661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6661");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) (byte) 100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test6662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6662");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (short) 0, (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
    }

    @Test
    public void test6663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6663");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (byte) 0, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6664");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) (byte) 100, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6665");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) 'a', (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6666");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) (byte) -1, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6667");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (byte) 10, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6668");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (byte) 100, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6669");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), 1, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6670");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) '#', 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6671");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) (short) 10, (int) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 173.20508075688772d + "'", double3 == 173.20508075688772d);
    }

    @Test
    public void test6672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6672");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) 'a', (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6673");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) (byte) -1, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6674");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) '#', (int) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 468.83999136165846d + "'", double3 == 468.83999136165846d);
    }

    @Test
    public void test6675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6675");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, 1, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6676");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) (short) -1, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6677");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, 10, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6678");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (short) 10, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6679");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6680");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (-1), (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6681");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) ' ', (int) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 158.03480629279107d + "'", double3 == 158.03480629279107d);
    }

    @Test
    public void test6682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6682");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) '4', (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6683");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (short) -1, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6684");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) (short) 1, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6685");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', 100, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6686");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) (byte) 10, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6687");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) (byte) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6688");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) '#', (int) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test6689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6689");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) 'a', (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6690");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (byte) 100, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6691");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) 'a', 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6692");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) (short) 1, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6693");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) '#', 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6694");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (byte) 100, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6695");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (byte) 10, 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 469.2093749063418d + "'", double3 == 469.2093749063418d);
    }

    @Test
    public void test6696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6696");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (-1), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test6697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6697");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (short) 0, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6698");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6699");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (byte) 0, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6700");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (short) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 49.9993749960937d + "'", double3 == 49.9993749960937d);
    }

    @Test
    public void test6701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6701");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', 1, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6702");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) (short) 1, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6703");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (byte) -1, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6704");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (byte) -1, 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.993746088859544d + "'", double3 == 4.993746088859544d);
    }

    @Test
    public void test6705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6705");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (short) -1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
    }

    @Test
    public void test6706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6706");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) (byte) 0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test6707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6707");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (short) 0, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6708");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (-1), (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6709");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (short) 10, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6710");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) '4', (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6711");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (short) -1, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6712");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) (short) 100, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6713");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (-1), (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.993746088859544d + "'", double3 == 4.993746088859544d);
    }

    @Test
    public void test6714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6714");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) '4', (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6715");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) (byte) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6716");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, 10, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6717");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) '4', (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6718");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (byte) 100, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6719");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (-1), (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.993746088859544d + "'", double3 == 4.993746088859544d);
    }

    @Test
    public void test6720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6720");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) (byte) 1, 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test6721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6721");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) '#', (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6722");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, 10, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6723");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (byte) 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 469.2093749063418d + "'", double3 == 469.2093749063418d);
    }

    @Test
    public void test6724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6724");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) (short) -1, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6725");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) (byte) -1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test6726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6726");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (short) 1, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6727");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1548.2202483819929d + "'", double3 == 1548.2202483819929d);
    }

    @Test
    public void test6728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6728");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (short) 0, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6729");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) '4', 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6730");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) '#', (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6731");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, 1, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6732");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, 10, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6733");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (short) -1, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6734");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (short) 0, 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test6735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6735");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (short) 10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.993746088859544d + "'", double3 == 4.993746088859544d);
    }

    @Test
    public void test6736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6736");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (short) 10, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6737");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) (short) 10, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6738");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) (byte) 1, (int) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 17.498214194597114d + "'", double3 == 17.498214194597114d);
    }

    @Test
    public void test6739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6739");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, 1, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6740");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (byte) -1, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6741");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) (byte) 1, (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test6742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6742");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (byte) 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 43.30127018922193d + "'", double3 == 43.30127018922193d);
    }

    @Test
    public void test6743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6743");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) (byte) 0, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6744");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (byte) -1, 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test6745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6745");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6746");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (-1), 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test6747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6747");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (-1), 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
    }

    @Test
    public void test6748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6748");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (short) 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test6749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6749");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) (short) 0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test6750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6750");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6751");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) 'a', 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6752");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (byte) 100, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6753");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (short) 10, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6754");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) '4', 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6755");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) (short) 1, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6756");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) 'a', (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6757");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (short) 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test6758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6758");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (byte) 1, (int) '4');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 25.998798049140657d + "'", double3 == 25.998798049140657d);
    }

    @Test
    public void test6759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6759");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) '4', (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6760");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (short) 0, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6761");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) (byte) 1, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6762");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) '#', (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6763");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) '#', (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6764");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) '4', (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6765");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, 10, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6766");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) '#', (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6767");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) (short) 1, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6768");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', 10, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6769");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) (byte) 100, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6770");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, 10, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6771");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, 1, (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test6772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6772");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) '#', (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6773");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) ' ', (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6774");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) ' ', (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6775");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test6776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6776");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (short) 0, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6777");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (-1), 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test6778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6778");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) (byte) 100, (int) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1722.9947584075815d + "'", double3 == 1722.9947584075815d);
    }

    @Test
    public void test6779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6779");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2466.056758775029d + "'", double3 == 2466.056758775029d);
    }

    @Test
    public void test6780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6780");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (short) 1, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6781");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (byte) 0, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6782");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) 'a', (int) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1548.2202483819929d + "'", double3 == 1548.2202483819929d);
    }

    @Test
    public void test6783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6783");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, 1, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6784");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) '#', (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6785");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) '#', (int) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 157.99505530237332d + "'", double3 == 157.99505530237332d);
    }

    @Test
    public void test6786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6786");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) (short) 10, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6787");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (short) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6788");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (byte) 100, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6789");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) 'a', (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6790");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) ' ', (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6791");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (-1), (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test6792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6792");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (byte) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6793");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, 100, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6794");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (short) 0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test6795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6795");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (byte) 10, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6796");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, 100, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6797");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (byte) 1, 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test6798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6798");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) (byte) 100, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 49.9993749960937d + "'", double3 == 49.9993749960937d);
    }

    @Test
    public void test6799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6799");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, 100, (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 49.9993749960937d + "'", double3 == 49.9993749960937d);
    }

    @Test
    public void test6800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6800");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) (short) 10, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 499.3746088859545d + "'", double3 == 499.3746088859545d);
    }

    @Test
    public void test6801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6801");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) (short) 100, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6802");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) (byte) 100, 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 499.3746088859545d + "'", double3 == 499.3746088859545d);
    }

    @Test
    public void test6803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6803");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) (short) 100, (int) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1722.9947584075815d + "'", double3 == 1722.9947584075815d);
    }

    @Test
    public void test6804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6804");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (byte) 10, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6805");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) '4', (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6806");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) ' ', 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6807");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (byte) 10, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6808");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) (byte) 0, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6809");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) (byte) 0, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6810");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (byte) 1, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6811");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (byte) -1, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6812");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) (byte) 10, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6813");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (-1), (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test6814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6814");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (-1), (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6815");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6816");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) 'a', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 469.2093749063418d + "'", double3 == 469.2093749063418d);
    }

    @Test
    public void test6817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6817");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (byte) 100, 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 49.9993749960937d + "'", double3 == 49.9993749960937d);
    }

    @Test
    public void test6818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6818");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) (short) 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test6819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6819");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) '4', (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6820");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) (short) 0, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6821");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, 10, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6822");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (short) -1, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6823");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, 1, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6824");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 49.9993749960937d + "'", double3 == 49.9993749960937d);
    }

    @Test
    public void test6825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6825");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (short) 10, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6826");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test6827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6827");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) (short) 1, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6828");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (short) 1, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6829");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (byte) 100, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6830");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (short) 0, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6831");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (byte) 100, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6832");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) 'a', (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6833");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) (short) 0, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6834");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (-1), (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6835");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) '4', (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6836");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (short) 100, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6837");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, 1, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6838");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) (byte) 10, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6839");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, 1, (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test6840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6840");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) (short) 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
    }

    @Test
    public void test6841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6841");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6842");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (byte) 10, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6843");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) '#', (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6844");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (short) 10, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6845");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) (byte) 10, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 499.3746088859545d + "'", double3 == 499.3746088859545d);
    }

    @Test
    public void test6846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6846");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (byte) 0, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6847");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) ' ', (int) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1530.7409970337894d + "'", double3 == 1530.7409970337894d);
    }

    @Test
    public void test6848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6848");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', 1, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6849");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) (byte) 100, 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 499.3746088859545d + "'", double3 == 499.3746088859545d);
    }

    @Test
    public void test6850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6850");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) 'a', 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6851");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 49.9993749960937d + "'", double3 == 49.9993749960937d);
    }

    @Test
    public void test6852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6852");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (short) -1, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6853");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) '#', (int) '4');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 856.9194463308672d + "'", double3 == 856.9194463308672d);
    }

    @Test
    public void test6854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6854");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) '4', (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6855");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (byte) 10, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6856");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (short) -1, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6857");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (short) 0, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6858");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (short) -1, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6859");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) (short) -1, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test6860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6860");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (short) 10, 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.993746088859544d + "'", double3 == 4.993746088859544d);
    }

    @Test
    public void test6861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6861");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', 10, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }
}

