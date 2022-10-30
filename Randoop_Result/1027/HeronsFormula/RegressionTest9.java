package HeronsFormula;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

    public static boolean debug = false;

    @Test
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4501");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) 'a', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 469.2093749063418d + "'", double3 == 469.2093749063418d);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (short) -1, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) ' ', (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) (byte) -1, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (byte) 10, 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 43.30127018922193d + "'", double3 == 43.30127018922193d);
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) (short) 100, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, 100, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) (short) 10, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (short) 0, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (byte) 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 49.9993749960937d + "'", double3 == 49.9993749960937d);
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) (byte) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 49.9993749960937d + "'", double3 == 49.9993749960937d);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) 'a', (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) ' ', (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) (short) -1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, 100, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (short) 1, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (-1), (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (short) 100, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, (-1), 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 499.3746088859545d + "'", double3 == 499.3746088859545d);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.993746088859544d + "'", double3 == 4.993746088859544d);
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) (byte) 10, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', 10, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (byte) 1, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) 'a', (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (-1), (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) ' ', (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (byte) -1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) (short) 1, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) ' ', (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, (int) '4', (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) (short) 0, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) (short) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, (int) '4', (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) (short) 10, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) '#', (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) (short) 1, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) 'a', (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) 'a', 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (short) 0, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) (byte) -1, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (short) 10, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (byte) 0, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (short) 100, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (short) 1, 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) ' ', (int) '4');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 791.6362801185908d + "'", double3 == 791.6362801185908d);
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (byte) -1, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) (short) 100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) (short) -1, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) (short) -1, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, 10, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (short) 10, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) 'a', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4241.393631520187d + "'", double3 == 4241.393631520187d);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, 0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (short) 10, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (-1), (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, 0, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) ' ', (int) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (short) 0, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (short) -1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) ' ', 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (short) 1, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) ' ', (int) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.998046755776157d + "'", double3 == 15.998046755776157d);
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) (byte) 1, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, 100, 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (-1), (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (short) 1, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) (short) 1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), 100, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (short) 10, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (byte) 10, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) '4', 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, 0, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) ' ', (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) (short) 10, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) (byte) 1, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, 1, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, (int) (byte) 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) (byte) 100, 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 49.9993749960937d + "'", double3 == 49.9993749960937d);
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) (short) 10, 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 499.3746088859545d + "'", double3 == 499.3746088859545d);
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, 0, 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) (byte) -1, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) 'a', (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, 0, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, 1, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, 10, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (byte) 0, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, 0, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.993746088859544d + "'", double3 == 4.993746088859544d);
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) (short) 10, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) (byte) -1, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) (byte) 0, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (short) -1, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', 1, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) 'a', (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (byte) 0, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (short) -1, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) 'a', (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (short) 10, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, (int) (byte) 10, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (short) -1, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, 1, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) (byte) 1, 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 49.9993749960937d + "'", double3 == 49.9993749960937d);
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (short) 0, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', 0, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (byte) -1, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (short) 1, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) '#', (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (short) -1, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, 100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, 100, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (byte) 0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (short) 10, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (byte) 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.993746088859544d + "'", double3 == 4.993746088859544d);
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (short) 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 43.30127018922193d + "'", double3 == 43.30127018922193d);
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) '#', 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (byte) -1, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (short) 100, 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 49.9993749960937d + "'", double3 == 49.9993749960937d);
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) (byte) 10, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, (int) (short) 0, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) '4', (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.993746088859544d + "'", double3 == 4.993746088859544d);
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) (byte) 100, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) 'a', 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1548.2202483819929d + "'", double3 == 1548.2202483819929d);
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) (short) 100, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) '#', (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (short) 1, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) (byte) 1, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (byte) 1, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) (byte) 1, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.993746088859544d + "'", double3 == 4.993746088859544d);
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) (short) 0, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) (short) 1, (int) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 17.498214194597114d + "'", double3 == 17.498214194597114d);
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (short) 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) (byte) 10, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) (short) 100, 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 49.9993749960937d + "'", double3 == 49.9993749960937d);
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) 'a', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 469.2093749063418d + "'", double3 == 469.2093749063418d);
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, 10, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) '4', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 714.142842854285d + "'", double3 == 714.142842854285d);
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) '4', (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) (byte) -1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) (byte) 100, 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 49.9993749960937d + "'", double3 == 49.9993749960937d);
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (short) 10, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, 100, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 49.9993749960937d + "'", double3 == 49.9993749960937d);
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) (byte) 100, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) (byte) 10, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, 1, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) '4', (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, 100, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (short) 1, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) '#', 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) ' ', 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (byte) 100, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) (short) 100, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) 'a', (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, 1, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, 0, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, 10, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) '#', (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) 'a', (int) '4');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 909.617467675286d + "'", double3 == 909.617467675286d);
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) (short) -1, (int) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 17.498214194597114d + "'", double3 == 17.498214194597114d);
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 43.30127018922193d + "'", double3 == 43.30127018922193d);
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (byte) 1, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) (byte) -1, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', 1, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (short) -1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) (byte) 0, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, 1, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, (int) (short) -1, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) '4', 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4241.393631520187d + "'", double3 == 4241.393631520187d);
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, 0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) '4', (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4686");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, 1, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4687");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) (byte) -1, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4688");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (short) 10, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4689");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) ' ', (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4690");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) ' ', (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4691");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (short) 100, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4692");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (byte) 0, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4693");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) (byte) -1, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4694");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4695");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) '#', 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4696");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, 10, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4697");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) (byte) 10, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4698");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (short) 0, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4699");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) (byte) 10, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4700");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) (short) -1, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4701");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (byte) -1, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4702");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) 'a', 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4703");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) 'a', (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4704");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (byte) -1, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4705");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (byte) -1, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4706");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (-1), (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.993746088859544d + "'", double3 == 4.993746088859544d);
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4707");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) 'a', (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4708");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', 100, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4709");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, 100, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4710");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (short) 10, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4711");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (short) 100, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4712");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) (short) -1, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4713");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) '#', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4714");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) '4', (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4715");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) '4', (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4716");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', 100, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4717");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) (short) 0, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4718");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) (byte) 1, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4719");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) (byte) 0, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4720");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (byte) 100, 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4721");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (-1), (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4722");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (byte) 1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4723");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) (byte) -1, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4724");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) (short) 1, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4725");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) (byte) 1, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4726");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) 'a', (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4727");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) (byte) 1, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4728");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) (byte) -1, 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 49.9993749960937d + "'", double3 == 49.9993749960937d);
    }

    @Test
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4729");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) (short) -1, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4730");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (byte) 0, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4731");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) (short) -1, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4732");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (byte) -1, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4733");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) (short) 1, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4734");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, 10, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4735");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) ' ', 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4736");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) (short) 100, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4737");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) '#', 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4738");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (short) 10, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4739");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, 100, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4740");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) '#', 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4741");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) (byte) 10, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4742");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) '4', 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 25.998798049140657d + "'", double3 == 25.998798049140657d);
    }

    @Test
    public void test4743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4743");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (byte) 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.993746088859544d + "'", double3 == 4.993746088859544d);
    }

    @Test
    public void test4744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4744");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) (short) 10, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4745");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', 10, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4746");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) 'a', (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4747");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) (short) -1, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4748");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, (int) '4', (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4749");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) (short) 10, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4750");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4751");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) (short) 10, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 499.3746088859545d + "'", double3 == 499.3746088859545d);
    }

    @Test
    public void test4752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4752");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) 'a', (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4753");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) 'a', (int) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1690.0840215799924d + "'", double3 == 1690.0840215799924d);
    }

    @Test
    public void test4754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4754");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) (byte) -1, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4755");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (short) 0, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4756");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, (int) '4', (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4757");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, 100, 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 49.9993749960937d + "'", double3 == 49.9993749960937d);
    }

    @Test
    public void test4758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4758");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (short) 100, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4759");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (short) -1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
    }

    @Test
    public void test4760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4760");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, (int) (short) 10, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4761");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (byte) 1, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4762");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) (short) 0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test4763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4763");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, (int) (byte) -1, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4764");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (short) -1, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4765");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) '4', (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4766");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) (short) -1, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4767");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (byte) 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 469.2093749063418d + "'", double3 == 469.2093749063418d);
    }

    @Test
    public void test4768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4768");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), 0, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4769");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (byte) 100, 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 49.9993749960937d + "'", double3 == 49.9993749960937d);
    }

    @Test
    public void test4770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4770");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (short) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4771");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) 'a', (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4772");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) 'a', (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4773");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) (short) 10, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4774");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) 'a', (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4775");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, 10, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4776");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (-1), 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4777");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, (int) ' ', (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4778");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) (short) -1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 49.9993749960937d + "'", double3 == 49.9993749960937d);
    }

    @Test
    public void test4779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4779");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (byte) 1, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4780");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) '#', (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4781");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) (short) 100, 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1722.9947584075815d + "'", double3 == 1722.9947584075815d);
    }

    @Test
    public void test4782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4782");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (short) 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test4783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4783");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (byte) 0, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4784");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (byte) -1, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4785");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, 100, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4786");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, 10, 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 499.3746088859545d + "'", double3 == 499.3746088859545d);
    }

    @Test
    public void test4787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4787");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) '4', (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4788");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', 0, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4789");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, 1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 49.9993749960937d + "'", double3 == 49.9993749960937d);
    }

    @Test
    public void test4790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4790");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) (byte) 1, 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
    }

    @Test
    public void test4791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4791");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, 0, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4792");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) ' ', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.998046755776157d + "'", double3 == 15.998046755776157d);
    }

    @Test
    public void test4793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4793");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (byte) 10, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.993746088859544d + "'", double3 == 4.993746088859544d);
    }

    @Test
    public void test4794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4794");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, 1, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4795");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (byte) -1, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4796");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) '4', (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4797");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) 'a', (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4798");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', 1, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4799");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (byte) 10, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4800");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (byte) 0, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4801");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, 10, 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.993746088859544d + "'", double3 == 4.993746088859544d);
    }

    @Test
    public void test4802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4802");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) 'a', (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4803");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, 1, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4804");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', 1, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4805");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) (byte) 1, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4806");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) '4', (int) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 548.3255761862655d + "'", double3 == 548.3255761862655d);
    }

    @Test
    public void test4807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4807");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) (byte) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4808");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (-1), (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4809");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) (byte) 100, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4810");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (short) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4241.393631520187d + "'", double3 == 4241.393631520187d);
    }

    @Test
    public void test4811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4811");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (-1), (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4812");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) '4', (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4813");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (-1), (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4814");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (short) 0, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4815");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) '#', (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4816");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (-1), (int) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test4817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4817");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) ' ', (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4818");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) (byte) 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 43.30127018922193d + "'", double3 == 43.30127018922193d);
    }

    @Test
    public void test4819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4819");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (byte) -1, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4820");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, 10, 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.993746088859544d + "'", double3 == 4.993746088859544d);
    }

    @Test
    public void test4821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4821");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) 'a', (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4822");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (byte) 1, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4823");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2510.582402551249d + "'", double3 == 2510.582402551249d);
    }

    @Test
    public void test4824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4824");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (byte) 10, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4825");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (-1), 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4826");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (-1), 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4827");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (byte) -1, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4828");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (byte) 10, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4829");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) (byte) 10, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4830");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) (short) 100, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4831");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (byte) 10, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4832");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (short) 1, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4833");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) (byte) 0, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4834");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, 0, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4835");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (-1), (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4836");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) (short) -1, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4837");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (short) -1, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4838");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 49.9993749960937d + "'", double3 == 49.9993749960937d);
    }

    @Test
    public void test4839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4839");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (byte) -1, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4840");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, 10, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4841");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) (byte) 10, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4842");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) '#', 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1690.0840215799924d + "'", double3 == 1690.0840215799924d);
    }

    @Test
    public void test4843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4843");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, 1, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4844");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (-1), (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4845");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, 100, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4846");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) (short) 1, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4847");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) (byte) 1, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4848");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', 100, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4849");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (byte) 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.993746088859544d + "'", double3 == 4.993746088859544d);
    }

    @Test
    public void test4850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4850");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) (byte) 0, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4851");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, 0, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4852");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) (byte) 10, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 499.3746088859545d + "'", double3 == 499.3746088859545d);
    }

    @Test
    public void test4853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4853");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) (short) -1, 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test4854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4854");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) (short) 100, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4855");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (byte) 100, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4856");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) 'a', (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4857");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (short) 10, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4858");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) 'a', 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 469.2093749063418d + "'", double3 == 469.2093749063418d);
    }

    @Test
    public void test4859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4859");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) (short) 0, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4860");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (byte) 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 469.2093749063418d + "'", double3 == 469.2093749063418d);
    }

    @Test
    public void test4861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4861");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) '4', 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2510.582402551249d + "'", double3 == 2510.582402551249d);
    }

    @Test
    public void test4862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4862");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) '#', 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4863");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (byte) 10, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4864");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) '#', (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4865");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) (byte) 10, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 499.3746088859545d + "'", double3 == 499.3746088859545d);
    }

    @Test
    public void test4866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4866");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (byte) 0, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4867");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, 1, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4868");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) (short) 10, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4869");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', 10, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4870");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) (byte) 100, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4871");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) (byte) 100, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4872");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (short) 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 43.30127018922193d + "'", double3 == 43.30127018922193d);
    }

    @Test
    public void test4873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4873");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, 100, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4874");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) '4', 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4875");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (byte) 1, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4876");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) ' ', (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4877");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, 100, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4878");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (-1), 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4879");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) (short) -1, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4880");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, 10, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4881");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) 'a', 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4882");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), 10, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4883");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (short) 100, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4884");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (byte) 0, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4885");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (short) 1, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4886");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, 1, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4887");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) (byte) 0, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4888");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) ' ', (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4889");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (-1), (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4890");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (byte) 10, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4891");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (short) 1, (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test4892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4892");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) (byte) 10, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 499.3746088859545d + "'", double3 == 499.3746088859545d);
    }

    @Test
    public void test4893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4893");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', 10, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4894");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) (byte) 0, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4895");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, 100, (int) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1722.9947584075815d + "'", double3 == 1722.9947584075815d);
    }

    @Test
    public void test4896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4896");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, 100, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4897");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) ' ', (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4898");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 499.3746088859545d + "'", double3 == 499.3746088859545d);
    }

    @Test
    public void test4899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4899");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (byte) 0, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4900");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (byte) 0, 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test4901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4901");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) (short) -1, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4902");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, 100, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4903");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) (byte) 10, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4904");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (short) 0, 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test4905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4905");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, 10, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4906");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, (int) (short) 10, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4907");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (byte) 0, (int) '4');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test4908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4908");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) (byte) 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 469.2093749063418d + "'", double3 == 469.2093749063418d);
    }

    @Test
    public void test4909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4909");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, 10, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4910");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4241.393631520187d + "'", double3 == 4241.393631520187d);
    }

    @Test
    public void test4911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4911");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) (short) 0, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4912");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) ' ', (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4913");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (short) 0, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4914");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (byte) 0, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4915");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, 100, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4916");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (short) 100, (int) '4');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 714.142842854285d + "'", double3 == 714.142842854285d);
    }

    @Test
    public void test4917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4917");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (byte) 0, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4918");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (byte) -1, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4919");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) (byte) 10, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4920");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, (-1), (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4921");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, (int) 'a', (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4922");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (byte) -1, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4923");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (byte) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4924");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) (byte) 1, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4925");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) (short) 0, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4926");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, 10, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4927");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, 10, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4928");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) '4', (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4929");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, 1, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4930");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (short) -1, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4931");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (short) 1, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4932");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) (short) 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 49.9993749960937d + "'", double3 == 49.9993749960937d);
    }

    @Test
    public void test4933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4933");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (byte) 10, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4934");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (byte) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4935");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (short) 100, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4936");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) 'a', (int) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1548.2202483819929d + "'", double3 == 1548.2202483819929d);
    }

    @Test
    public void test4937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4937");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) ' ', (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4938");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4939");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) '4', (int) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 791.6362801185908d + "'", double3 == 791.6362801185908d);
    }

    @Test
    public void test4940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4940");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) (byte) 10, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4941");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (-1), (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4942");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) ' ', (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4943");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) ' ', (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4944");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (short) 0, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4945");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test4946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4946");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (short) 0, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4947");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (byte) -1, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4948");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, (-1), (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4949");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) (short) 1, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4950");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, 10, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4951");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) (short) 0, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4952");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', 1, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4953");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), 10, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4954");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) ' ', (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4955");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) 'a', (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4956");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) ' ', (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4957");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) '4', (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4958");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (byte) 0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test4959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4959");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (short) 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test4960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4960");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
    }

    @Test
    public void test4961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4961");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) ' ', (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4962");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (short) -1, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4963");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) '4', (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4964");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', 100, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4965");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) ' ', (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4966");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (byte) 1, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4967");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, 1, 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test4968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4968");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (short) -1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test4969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4969");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) '#', (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4970");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', 0, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4971");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, 0, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4972");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) ' ', 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4973");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (-1), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test4974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4974");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (byte) 100, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4975");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (short) 100, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4976");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (byte) 0, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4977");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (-1), (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4978");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) (short) 100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 499.3746088859545d + "'", double3 == 499.3746088859545d);
    }

    @Test
    public void test4979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4979");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (byte) -1, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4980");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) (byte) 10, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4981");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) 'a', 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4982");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) (short) 100, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4983");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) '4', (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4984");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (short) -1, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4985");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) '4', (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4986");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) (short) 10, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4987");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (short) 0, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4988");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', 100, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4989");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', 10, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4990");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) '#', (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4991");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', 1, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4992");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (byte) 0, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4993");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) 'a', (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4994");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) '4', (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4995");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test4996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4996");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) (short) 10, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4997");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) (short) 0, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4998");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) '#', (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test4999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4999");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (short) 10, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test5000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test5000");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, (int) (byte) 1, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }
}

