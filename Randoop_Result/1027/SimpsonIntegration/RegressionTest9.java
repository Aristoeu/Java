package SimpsonIntegration;

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
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f((double) (-1L));
        double double14 = simpsonIntegration0.simpsonsMethod(1, 40.46343442189374d, 0.0d);
        double double18 = simpsonIntegration0.simpsonsMethod((int) (byte) 10, (double) '#', (double) 0.0f);
        double double20 = simpsonIntegration0.f((-1.455109358270963E-15d));
        double double24 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-7.274285591033407E-42d), 4.921252850810739d);
        double double26 = simpsonIntegration0.f(1.2678433127954059E-73d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.154845485377137d + "'", double10 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 53.95124589585826d + "'", double14 == 53.95124589585826d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 46.66666666663074d + "'", double18 == 46.66666666663074d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.000000000000006d + "'", double20 == 4.000000000000006d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 3.573962574245288E-43d + "'", double24 == 3.573962574245288E-43d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 4.0d + "'", double26 == 4.0d);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double8 = simpsonIntegration0.f((double) (-1L));
        double double10 = simpsonIntegration0.f((double) 10);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 1.2514464254193938d, 0.0d);
        double double18 = simpsonIntegration0.simpsonsMethod(10, (-0.01453886097417405d), 9.931906770383255E-23d);
        double double20 = simpsonIntegration0.f(1.7010219573714175E-40d);
        double double24 = simpsonIntegration0.simpsonsMethod((int) '#', 0.865609122350895d, (-7.027389983271083E-39d));
        double double28 = simpsonIntegration0.simpsonsMethod((int) '#', (-0.21331563406496507d), 1.7010219573714175E-40d);
        double double32 = simpsonIntegration0.simpsonsMethod(100, 1.6207068628535456E-41d, 6.012902566071085E-4d);
        double double34 = simpsonIntegration0.f((-6.135754481570391E-41d));
        double double36 = simpsonIntegration0.f(7.605406990167605E-70d);
        double double38 = simpsonIntegration0.f(133.33333333333334d);
        double double40 = simpsonIntegration0.f((-0.379895655640099d));
        double double44 = simpsonIntegration0.simpsonsMethod(1, (double) (short) -1, (-0.2043913073532469d));
        double double48 = simpsonIntegration0.simpsonsMethod((int) (byte) -1, 0.20178029720200558d, (-6.075451155035934E-16d));
        double double50 = simpsonIntegration0.f(514.8898010014253d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.154845485377137d + "'", double8 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.004358393257198546d) + "'", double10 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2.0018152742371256d + "'", double14 == 2.0018152742371256d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.6248127531564629d) + "'", double18 == (-0.6248127531564629d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.0d + "'", double20 == 4.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.997483484540344d + "'", double24 == 1.997483484540344d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 62279.944702754045d + "'", double28 == 62279.944702754045d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 6.478929976516274E-39d + "'", double32 == 6.478929976516274E-39d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 4.0d + "'", double34 == 4.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 4.0d + "'", double36 == 4.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-2.2072362778100317E-54d) + "'", double38 == (-2.2072362778100317E-54d));
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 5.637512135489039d + "'", double40 == 5.637512135489039d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-4.4525195398210275d) + "'", double44 == (-4.4525195398210275d));
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + (-6.450934954081737E-219d) + "'", double50 == (-6.450934954081737E-219d));
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double12 = simpsonIntegration0.simpsonsMethod(0, (double) 1L, (double) 100.0f);
        double double14 = simpsonIntegration0.f((double) 0L);
        double double16 = simpsonIntegration0.f(7.149920860492725E-6d);
        double double20 = simpsonIntegration0.simpsonsMethod((int) (byte) 1, 8.430431742414195d, (-1.3099942896125311E-43d));
        double double24 = simpsonIntegration0.simpsonsMethod((int) (short) 10, 2.7182818284590455d, (-5.885963407493417E-54d));
        double double26 = simpsonIntegration0.f(113.77756524225931d);
        double double28 = simpsonIntegration0.f(4.894627124273078E-37d);
        double double32 = simpsonIntegration0.simpsonsMethod(0, 4.115717347876469E-20d, 269096.59220169694d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.2395293152101427E-40d) + "'", double12 == (-1.2395293152101427E-40d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 3.99997140036768d + "'", double16 == 3.99997140036768d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 11.199462483718854d + "'", double20 == 11.199462483718854d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 2.5422839731301923d + "'", double24 == 2.5422839731301923d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-5.0004640425277356E-46d) + "'", double26 == (-5.0004640425277356E-46d));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 4.0d + "'", double28 == 4.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(0, (double) ' ', (double) (-1));
        double double18 = simpsonIntegration0.f((double) (byte) 10);
        double double22 = simpsonIntegration0.simpsonsMethod((int) (short) -1, 0.9226783964008627d, (double) (byte) 1);
        double double26 = simpsonIntegration0.simpsonsMethod(0, (double) (byte) 1, (double) (-1));
        double double28 = simpsonIntegration0.f(0.0d);
        double double32 = simpsonIntegration0.simpsonsMethod((int) (byte) 1, (-0.19598513191998923d), 3.999895636557305d);
        double double36 = simpsonIntegration0.simpsonsMethod(1, 3.6138952411133203d, 1.773008614440612d);
        double double40 = simpsonIntegration0.simpsonsMethod(0, 0.0d, 4.000878994199535d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 86.98501851068946d + "'", double16 == 86.98501851068946d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.004358393257198546d) + "'", double18 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 2.7182818284590455d + "'", double26 == 2.7182818284590455d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 4.0d + "'", double28 == 4.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.029600108355565525d + "'", double32 == 0.029600108355565525d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.03728709403342463d + "'", double36 == 0.03728709403342463d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-0.0d) + "'", double40 == (-0.0d));
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 0.0d, (double) (byte) 1);
        double double16 = simpsonIntegration0.f((double) 1L);
        double double18 = simpsonIntegration0.f(8.154845485377137d);
        double double20 = simpsonIntegration0.f((-1.0392841613694731E-11d));
        double double22 = simpsonIntegration0.f(336.6334782286822d);
        double double26 = simpsonIntegration0.simpsonsMethod(10, (-0.7281914854444458d), (double) (byte) 1);
        double double30 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-1.51821585271638E-41d), (-3.24956540118872E-45d));
        double double32 = simpsonIntegration0.f((-2.435990545242269E-52d));
        double double36 = simpsonIntegration0.simpsonsMethod((int) '4', 5.470395964063189d, (-1.0920192743599933E-71d));
        double double40 = simpsonIntegration0.simpsonsMethod(100, (-0.6198814034757335d), (-3.670069962076287E-24d));
        double double42 = simpsonIntegration0.f(4.9230677270153755d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.103638323514327d + "'", double16 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.017959162462641984d) + "'", double18 == (-0.017959162462641984d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.000000000041571d + "'", double20 == 4.000000000041571d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-7.181865381904353E-142d) + "'", double22 == (-7.181865381904353E-142d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 13376.05417302862d + "'", double26 == 13376.05417302862d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-2.02428780362184E-41d) + "'", double30 == (-2.02428780362184E-41d));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 4.0d + "'", double32 == 4.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 6.490231291042576d + "'", double36 == 6.490231291042576d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 3.1019358844304676E30d + "'", double40 == 3.1019358844304676E30d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + (-0.147257122687415d) + "'", double42 == (-0.147257122687415d));
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double12 = simpsonIntegration0.simpsonsMethod(0, (double) 1L, (double) 100.0f);
        double double14 = simpsonIntegration0.f((-1.0781454254561233E-20d));
        double double18 = simpsonIntegration0.simpsonsMethod((int) (byte) 0, (-0.001693227728973961d), (-0.11021647807132358d));
        double double22 = simpsonIntegration0.simpsonsMethod(100, (-2.0076911253185856E-16d), 4.031290735472884d);
        double double24 = simpsonIntegration0.f(9.931906770383255E-23d);
        double double28 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 8.174983641967351d, 2.614949402528304E46d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.2395293152101427E-40d) + "'", double12 == (-1.2395293152101427E-40d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.0025130411114009576d) + "'", double18 == (-0.0025130411114009576d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.366283488214899E-15d + "'", double22 == 4.366283488214899E-15d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 4.0d + "'", double24 == 4.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod((int) 'a', (double) 100.0f, (double) 10.0f);
        double double18 = simpsonIntegration0.simpsonsMethod((int) (short) 10, (double) ' ', 2.7182818284590455d);
        double double20 = simpsonIntegration0.f((-0.10347953329490019d));
        java.lang.Class<?> wildcardClass21 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.14527977523995153d) + "'", double14 == (-0.14527977523995153d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-2.3854629903149513d) + "'", double18 == (-2.3854629903149513d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.42421694571781d + "'", double20 == 4.42421694571781d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (byte) -1, (-1.8007854031706057E-43d), (double) (byte) 0);
        double double8 = simpsonIntegration0.simpsonsMethod(0, (double) 0.0f, 0.0d);
        double double10 = simpsonIntegration0.f((double) (byte) -1);
        double double14 = simpsonIntegration0.simpsonsMethod((int) (short) -1, (-7.125983677388118E-39d), 4.984287490361674E-40d);
        double double16 = simpsonIntegration0.f((-1.8239894071805115E-39d));
        double double20 = simpsonIntegration0.simpsonsMethod((int) (short) 1, 5.903529769054625d, 1.6207463930615804E58d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.154845485377137d + "'", double10 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.0d) + "'", double14 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.0d + "'", double16 == 4.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double12 = simpsonIntegration0.simpsonsMethod(0, (double) 1L, (double) 100.0f);
        double double14 = simpsonIntegration0.f((double) 0L);
        double double16 = simpsonIntegration0.f(7.149920860492725E-6d);
        double double20 = simpsonIntegration0.simpsonsMethod((int) (byte) 1, 8.430431742414195d, (-1.3099942896125311E-43d));
        double double22 = simpsonIntegration0.f((-0.24215807452852617d));
        double double24 = simpsonIntegration0.f(0.0d);
        double double26 = simpsonIntegration0.f((-0.10776645064116655d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.2395293152101427E-40d) + "'", double12 == (-1.2395293152101427E-40d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 3.99997140036768d + "'", double16 == 3.99997140036768d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 11.199462483718854d + "'", double20 == 11.199462483718854d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 5.021274473653755d + "'", double22 == 5.021274473653755d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 4.0d + "'", double24 == 4.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 4.442215270178554d + "'", double26 == 4.442215270178554d);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double8 = simpsonIntegration0.f((double) (-1L));
        double double10 = simpsonIntegration0.f((double) 10);
        double double12 = simpsonIntegration0.f(1.2514464254193938d);
        double double14 = simpsonIntegration0.f(5.013142936481665E9d);
        double double16 = simpsonIntegration0.f(5.487623130501958E-20d);
        java.lang.Class<?> wildcardClass17 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.154845485377137d + "'", double8 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.004358393257198546d) + "'", double10 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.6963109328077465d + "'", double12 == 0.6963109328077465d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.0d) + "'", double14 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.0d + "'", double16 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double14 = simpsonIntegration0.f((double) (byte) 10);
        double double18 = simpsonIntegration0.simpsonsMethod((int) (short) 100, 2.0018152742371256d, 4.880565806253262d);
        double double20 = simpsonIntegration0.f(5.244452246984291d);
        double double24 = simpsonIntegration0.simpsonsMethod((int) 'a', 468.7403695932782d, 4.0013314647187705d);
        double double28 = simpsonIntegration0.simpsonsMethod((int) (byte) 1, 2.8156577064260246d, 0.0d);
        double double32 = simpsonIntegration0.simpsonsMethod((int) (short) 100, (-1.173529860291328E-39d), (-0.6867777557763204d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.004358393257198546d) + "'", double14 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.23948687210556677d) + "'", double18 == (-0.23948687210556677d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.12402529508953528d) + "'", double20 == (-0.12402529508953528d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-34.3258709728719d) + "'", double24 == (-34.3258709728719d));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 3.533512705082346d + "'", double28 == 3.533512705082346d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-8.228637087564143E-37d) + "'", double32 == (-8.228637087564143E-37d));
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double12 = simpsonIntegration0.simpsonsMethod(0, (double) 1L, (double) 100.0f);
        double double14 = simpsonIntegration0.f((-0.01453886097417405d));
        double double18 = simpsonIntegration0.simpsonsMethod((int) (byte) 0, (-0.21820438682936422d), (-2.8493238807739195E-4d));
        double double20 = simpsonIntegration0.f(6781.678412312041d);
        double double24 = simpsonIntegration0.simpsonsMethod((int) (byte) -1, (-0.2784933219029312d), 8.316928398176819d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.2395293152101427E-40d) + "'", double12 == (-1.2395293152101427E-40d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.058365782993775d + "'", double14 == 4.058365782993775d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.29102208633970994d) + "'", double18 == (-0.29102208633970994d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.0d) + "'", double20 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-0.0d) + "'", double24 == (-0.0d));
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double12 = simpsonIntegration0.simpsonsMethod(0, (double) 1L, (double) 100.0f);
        double double14 = simpsonIntegration0.f((double) 0L);
        double double18 = simpsonIntegration0.simpsonsMethod(0, (-3.00839694745219d), (double) (-1));
        double double22 = simpsonIntegration0.simpsonsMethod((int) (short) 100, (-0.11573545799183435d), (-1.506384831910158E-44d));
        double double26 = simpsonIntegration0.simpsonsMethod((int) (byte) 10, 3.835155910746787E21d, (-104.19489372358262d));
        java.lang.Class<?> wildcardClass27 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.2395293152101427E-40d) + "'", double12 == (-1.2395293152101427E-40d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-8.17767075505095d) + "'", double18 == (-8.17767075505095d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.1559960411554156E7d + "'", double22 == 1.1559960411554156E7d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-2.474354875797746E70d) + "'", double26 == (-2.474354875797746E70d));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        double double16 = simpsonIntegration0.f((double) 10L);
        double double18 = simpsonIntegration0.f((double) (-1L));
        double double22 = simpsonIntegration0.simpsonsMethod(0, (-0.016155316979210545d), (-1.4677877090000082E-17d));
        double double26 = simpsonIntegration0.simpsonsMethod(0, 3.2169325995787305E8d, (double) (-1L));
        double double28 = simpsonIntegration0.f((-7.027389983271083E-39d));
        double double32 = simpsonIntegration0.simpsonsMethod((int) (byte) 100, (-0.22807608261057874d), 4.518959263205429d);
        double double34 = simpsonIntegration0.f(4.9217502541159845d);
        double double38 = simpsonIntegration0.simpsonsMethod((-1), 1.506259387633786E-36d, (-5.478773010713476E-41d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 8.154845485377137d + "'", double18 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.021540422638947395d) + "'", double22 == (-0.021540422638947395d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 8.744529428812383E8d + "'", double26 == 8.744529428812383E8d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 4.0d + "'", double28 == 4.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 2.593046111588738E10d + "'", double32 == 2.593046111588738E10d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-0.14735675158901146d) + "'", double34 == (-0.14735675158901146d));
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double16 = simpsonIntegration0.simpsonsMethod(0, 0.0d, 0.9226783964008627d);
        double double18 = simpsonIntegration0.f((double) (short) 0);
        double double20 = simpsonIntegration0.f(1.2514464254193938d);
        double double22 = simpsonIntegration0.f((-1.9516606609665203E-32d));
        double double26 = simpsonIntegration0.simpsonsMethod(0, (-0.14452408005239994d), 6.339638915247768d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.6963109328077465d + "'", double20 == 0.6963109328077465d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.0d + "'", double22 == 4.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.003077156631512255d + "'", double26 == 0.003077156631512255d);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 0.0d, (double) (byte) 1);
        double double16 = simpsonIntegration0.f((double) 1L);
        double double18 = simpsonIntegration0.f(8.154845485377137d);
        double double22 = simpsonIntegration0.simpsonsMethod((int) ' ', 46.66666666663074d, 1.103638323514327d);
        double double24 = simpsonIntegration0.f(1.7012127745047754d);
        double double28 = simpsonIntegration0.simpsonsMethod((int) (byte) 100, 15.508493508867508d, 3.236734389900072E24d);
        double double32 = simpsonIntegration0.simpsonsMethod((int) (byte) 0, (-0.5041193463837379d), (-0.21962509006791398d));
        double double34 = simpsonIntegration0.f((-0.31483370732618465d));
        double double38 = simpsonIntegration0.simpsonsMethod((int) 'a', 4.922734750414501d, 6.0254253560244E-44d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.103638323514327d + "'", double16 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.017959162462641984d) + "'", double18 == (-0.017959162462641984d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 14.352775055113481d + "'", double22 == 14.352775055113481d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.20178029722268845d + "'", double24 == 0.20178029722268845d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-0.8271516970856071d) + "'", double32 == (-0.8271516970856071d));
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 5.344327983691195d + "'", double34 == 5.344327983691195d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 5.580231329327871d + "'", double38 == 5.580231329327871d);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod((int) 'a', (double) 100.0f, (double) 10.0f);
        double double18 = simpsonIntegration0.simpsonsMethod((int) (byte) 1, (double) 100L, 2.609103086070402E-5d);
        double double20 = simpsonIntegration0.f((-0.6537519371611368d));
        double double24 = simpsonIntegration0.simpsonsMethod((int) (byte) -1, 4.000007092661304d, (-0.39478808990516345d));
        double double26 = simpsonIntegration0.f(4.087396130228527d);
        double double28 = simpsonIntegration0.f(8.937090610856986d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.14527977523995153d) + "'", double14 == (-0.14527977523995153d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 133.3298545519102d + "'", double18 == 133.3298545519102d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 6.869201790086779d + "'", double20 == 6.869201790086779d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-0.21325678281826846d) + "'", double26 == (-0.21325678281826846d));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-0.00997126000400413d) + "'", double28 == (-0.00997126000400413d));
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (byte) 0, (double) 0L, (double) ' ');
        double double6 = simpsonIntegration0.f((-1.8007854031706057E-43d));
        double double8 = simpsonIntegration0.f((-1.693539419598958E-19d));
        double double10 = simpsonIntegration0.f(0.01476225098817667d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.0d + "'", double8 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.941169976714199d + "'", double10 == 3.941169976714199d);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 0.0d, (double) (byte) 1);
        double double16 = simpsonIntegration0.f((double) 1L);
        double double18 = simpsonIntegration0.f(8.154845485377137d);
        double double22 = simpsonIntegration0.simpsonsMethod(0, (double) '4', (double) '4');
        double double24 = simpsonIntegration0.f((-0.0014130171899539316d));
        double double28 = simpsonIntegration0.simpsonsMethod(100, (double) (-1.0f), 0.0d);
        double double32 = simpsonIntegration0.simpsonsMethod(100, 8.430431742414195d, (-0.21850356693465028d));
        double double34 = simpsonIntegration0.f((-0.41503840884717663d));
        double double38 = simpsonIntegration0.simpsonsMethod((int) 'a', 5.571297817298636E15d, (-0.05730760033459962d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.103638323514327d + "'", double16 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.017959162462641984d) + "'", double18 == (-0.017959162462641984d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.2216106046044858E-18d) + "'", double22 == (-1.2216106046044858E-18d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 4.005654064435647d + "'", double24 == 4.005654064435647d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 2.6478847316533405E47d + "'", double28 == 2.6478847316533405E47d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 13.625131410312626d + "'", double32 == 13.625131410312626d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 5.796844828425246d + "'", double34 == 5.796844828425246d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 7.860076375614007E15d + "'", double38 == 7.860076375614007E15d);
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double8 = simpsonIntegration0.f((double) (-1L));
        double double10 = simpsonIntegration0.f((double) 10);
        double double12 = simpsonIntegration0.f(4.12913427377727d);
        double double16 = simpsonIntegration0.simpsonsMethod(0, 4.000007092661304d, 8949499.808293283d);
        double double20 = simpsonIntegration0.simpsonsMethod((int) 'a', 0.35597672253554696d, 6.610072943606929E45d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.154845485377137d + "'", double8 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.004358393257198546d) + "'", double10 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.21005932068395639d) + "'", double12 == (-0.21005932068395639d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double2 = simpsonIntegration0.f((double) 0);
        double double6 = simpsonIntegration0.simpsonsMethod(0, (double) (byte) -1, (double) 100.0f);
        double double8 = simpsonIntegration0.f(8.154845485377137d);
        double double10 = simpsonIntegration0.f(2.413675113314953d);
        double double14 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 177.83695398750095d, (-0.017959162462641984d));
        double double16 = simpsonIntegration0.f((double) (byte) 0);
        double double18 = simpsonIntegration0.f((-7.885679299244647E-39d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.2395293152101427E-40d + "'", double6 == 1.2395293152101427E-40d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.017959162462641984d) + "'", double8 == (-0.017959162462641984d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.16338567387879238d) + "'", double10 == (-0.16338567387879238d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 241.393345129359d + "'", double14 == 241.393345129359d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.0d + "'", double16 == 4.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(0, 4.0013314647187705d, 4.005654064435647d);
        double double20 = simpsonIntegration0.simpsonsMethod((int) (byte) -1, (-1.8007854031706057E-43d), 4.605901680240415E19d);
        double double22 = simpsonIntegration0.f(0.0d);
        double double24 = simpsonIntegration0.f((-2.303294722949877E-16d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.29259450005390564d) + "'", double16 == (-0.29259450005390564d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.0d) + "'", double20 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.0d + "'", double22 == 4.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 4.000000000000001d + "'", double24 == 4.000000000000001d);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double8 = simpsonIntegration0.f((double) (-1L));
        double double10 = simpsonIntegration0.f((double) 10);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 1.2514464254193938d, 0.0d);
        double double18 = simpsonIntegration0.simpsonsMethod(10, (-0.01453886097417405d), 9.931906770383255E-23d);
        double double20 = simpsonIntegration0.f(1.7010219573714175E-40d);
        double double24 = simpsonIntegration0.simpsonsMethod((int) '#', 0.865609122350895d, (-7.027389983271083E-39d));
        double double28 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-1.4613664942214284E-15d), (-2.4864469782988373E44d));
        double double30 = simpsonIntegration0.f(17123.640415913545d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.154845485377137d + "'", double8 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.004358393257198546d) + "'", double10 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2.0018152742371256d + "'", double14 == 2.0018152742371256d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.6248127531564629d) + "'", double18 == (-0.6248127531564629d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.0d + "'", double20 == 4.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.997483484540344d + "'", double24 == 1.997483484540344d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + Double.POSITIVE_INFINITY + "'", double28 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-0.0d) + "'", double30 == (-0.0d));
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(10, (-0.0d), (double) (byte) 0);
        double double18 = simpsonIntegration0.f((double) 0L);
        double double22 = simpsonIntegration0.simpsonsMethod((int) (short) 100, (double) 100, (double) 10L);
        double double24 = simpsonIntegration0.f((double) (short) 10);
        double double28 = simpsonIntegration0.simpsonsMethod((int) '4', 1.9972480396213286d, (-0.11021647807132358d));
        double double30 = simpsonIntegration0.f((-2.5726623095214227E-28d));
        double double32 = simpsonIntegration0.f((-0.17279946422731832d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.0d) + "'", double16 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.14527977523995153d) + "'", double22 == (-0.14527977523995153d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-0.004358393257198546d) + "'", double24 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 2.566645225308353d + "'", double28 == 2.566645225308353d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 4.0d + "'", double30 == 4.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 4.719018861803803d + "'", double32 == 4.719018861803803d);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(10, (-0.0d), (double) (byte) 0);
        double double20 = simpsonIntegration0.simpsonsMethod((int) (short) -1, 1.332866202146335E-40d, 2.4345859750797203d);
        double double22 = simpsonIntegration0.f(4.821545503077824E-16d);
        double double24 = simpsonIntegration0.f(468.7403695932782d);
        double double26 = simpsonIntegration0.f(3.997595200595966d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.0d) + "'", double16 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 3.9999999999999982d + "'", double22 == 3.9999999999999982d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-5.895231310196705E-199d) + "'", double24 == (-5.895231310196705E-199d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-0.21996374223938314d) + "'", double26 == (-0.21996374223938314d));
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double12 = simpsonIntegration0.simpsonsMethod(1, 0.9226783964008627d, 4.058365782993775d);
        double double16 = simpsonIntegration0.simpsonsMethod(100, 2.7182818284590455d, (double) 10.0f);
        double double18 = simpsonIntegration0.f(2.002615341358857d);
        double double22 = simpsonIntegration0.simpsonsMethod((int) (byte) 10, (-0.0016866597302048056d), 8949499.808293283d);
        double double24 = simpsonIntegration0.f((-0.14725712270254981d));
        double double28 = simpsonIntegration0.simpsonsMethod((int) (short) 10, 2.1309036837023276d, 3.7136491196817962d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.11021647807132358d) + "'", double12 == (-0.11021647807132358d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.005762150198617093d) + "'", double16 == (-0.005762150198617093d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.0014130171899539316d) + "'", double18 == (-0.0014130171899539316d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.0d) + "'", double22 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 4.609482390266634d + "'", double24 == 4.609482390266634d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-0.4595956621129599d) + "'", double28 == (-0.4595956621129599d));
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double14 = simpsonIntegration0.f(53.95124589585826d);
        double double18 = simpsonIntegration0.simpsonsMethod(100, (-7.027389983271083E-39d), 0.0d);
        double double20 = simpsonIntegration0.f((-0.6537519371611368d));
        double double22 = simpsonIntegration0.f((-1.0781454254561233E-20d));
        double double26 = simpsonIntegration0.simpsonsMethod((int) (byte) 0, (-6.135754481570391E-41d), 4.364794489183566d);
        double double28 = simpsonIntegration0.f(4.367455514789127d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0781454254561233E-20d) + "'", double14 == (-1.0781454254561233E-20d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-2.810955993308433E-36d) + "'", double18 == (-2.810955993308433E-36d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 6.869201790086779d + "'", double20 == 6.869201790086779d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.0d + "'", double22 == 4.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 3.9148790340424284E-42d + "'", double26 == 3.9148790340424284E-42d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-0.19119913216067358d) + "'", double28 == (-0.19119913216067358d));
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double2 = simpsonIntegration0.f((double) 0);
        double double6 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 1.2395293152101427E-40d, (double) (byte) 10);
        double double10 = simpsonIntegration0.simpsonsMethod((int) (byte) 100, (double) (byte) 10, (double) (byte) 10);
        double double14 = simpsonIntegration0.simpsonsMethod((int) (short) 100, (-0.29306041653042497d), 37867.06926325643d);
        double double18 = simpsonIntegration0.simpsonsMethod((int) (byte) 0, (-0.29259450005390564d), (-1.1752745249820245E-17d));
        double double20 = simpsonIntegration0.f(654.9727419850799d);
        double double22 = simpsonIntegration0.f(0.0d);
        double double24 = simpsonIntegration0.f((-1.0805898549126908E-145d));
        double double26 = simpsonIntegration0.f(4.61450226291385E-26d);
        double double28 = simpsonIntegration0.f(4.233572819169364d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.8007854031706057E-43d) + "'", double6 == (-1.8007854031706057E-43d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.01453886097417405d) + "'", double10 == (-0.01453886097417405d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.0d) + "'", double14 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.3901260000718742d) + "'", double18 == (-0.3901260000718742d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.518429952342686E-279d) + "'", double20 == (-1.518429952342686E-279d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.0d + "'", double22 == 4.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 4.0d + "'", double24 == 4.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 4.0d + "'", double26 == 4.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-0.20189233876309856d) + "'", double28 == (-0.20189233876309856d));
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        double double16 = simpsonIntegration0.f(8.154845485377137d);
        double double18 = simpsonIntegration0.f((double) 0.0f);
        double double20 = simpsonIntegration0.f((double) 100);
        double double22 = simpsonIntegration0.f(0.45257921713188254d);
        double double26 = simpsonIntegration0.simpsonsMethod(100, 0.9226783964008627d, (double) (short) 100);
        double double28 = simpsonIntegration0.f((double) (-1.0f));
        double double30 = simpsonIntegration0.f(0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.017959162462641984d) + "'", double16 == (-0.017959162462641984d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-3.718587945630428E-40d) + "'", double20 == (-3.718587945630428E-40d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 2.413675113314953d + "'", double22 == 2.413675113314953d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-3.806556146559686E-40d) + "'", double26 == (-3.806556146559686E-40d));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 8.154845485377137d + "'", double28 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 4.0d + "'", double30 == 4.0d);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(10, (-0.0d), (double) (byte) 0);
        double double18 = simpsonIntegration0.f((double) 0L);
        double double20 = simpsonIntegration0.f((-0.0d));
        double double24 = simpsonIntegration0.simpsonsMethod(0, 1.7012127745047754d, (-0.11904526768630361d));
        double double28 = simpsonIntegration0.simpsonsMethod((int) ' ', (-0.0027840775569069336d), (-5.053656418646911E-32d));
        double double30 = simpsonIntegration0.f((-3.219738730368386E104d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.0d) + "'", double16 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.0d + "'", double20 == 4.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 2.54598981209145d + "'", double24 == 2.54598981209145d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-0.3724662269612744d) + "'", double28 == (-0.3724662269612744d));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + Double.NEGATIVE_INFINITY + "'", double30 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double14 = simpsonIntegration0.simpsonsMethod((int) (short) 10, (double) (byte) 1, (-1.2634141046617278E-34d));
        double double18 = simpsonIntegration0.simpsonsMethod((int) (byte) 100, (-7.181865381904353E-142d), (-1.0883501299761437E-15d));
        double double20 = simpsonIntegration0.f(4.809915255035245d);
        double double24 = simpsonIntegration0.simpsonsMethod(10, (-3.211014101120496d), (-7.386543946022228E-72d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2.002615341358857d + "'", double14 == 2.002615341358857d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-2.8727461527617422E-139d) + "'", double18 == (-2.8727461527617422E-139d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.15592482878892458d) + "'", double20 == (-0.15592482878892458d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0977231172173112E17d + "'", double24 == 1.0977231172173112E17d);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double14 = simpsonIntegration0.simpsonsMethod((-1), (-3.516843742144352E-16d), 0.0d);
        double double18 = simpsonIntegration0.simpsonsMethod((int) (short) 100, (-9.163716264599753E-41d), 5.7440811083967755d);
        double double20 = simpsonIntegration0.f((-7.410927708676895E-42d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.0d) + "'", double14 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 8.506757369625936E-40d + "'", double18 == 8.506757369625936E-40d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.0d + "'", double20 == 4.0d);
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        double double16 = simpsonIntegration0.f((double) 10L);
        double double18 = simpsonIntegration0.f((double) (short) 10);
        double double22 = simpsonIntegration0.simpsonsMethod((int) '4', (double) 1, (double) 10);
        double double24 = simpsonIntegration0.f(4.005654064435647d);
        double double26 = simpsonIntegration0.f(351.55527719495865d);
        double double28 = simpsonIntegration0.f(177.77313940254692d);
        double double30 = simpsonIntegration0.f(7.226972434711676E10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.004358393257198546d) + "'", double18 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.005367301737528441d) + "'", double22 == (-0.005367301737528441d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-0.219372853236844d) + "'", double24 == (-0.219372853236844d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-2.590933206896706E-148d) + "'", double26 == (-2.590933206896706E-148d));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-1.966907059238147E-73d) + "'", double28 == (-1.966907059238147E-73d));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-0.0d) + "'", double30 == (-0.0d));
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double14 = simpsonIntegration0.f(10.0d);
        double double16 = simpsonIntegration0.f((double) (short) 10);
        double double20 = simpsonIntegration0.simpsonsMethod((-1), (double) (short) 10, 2.609103086070402E-5d);
        double double22 = simpsonIntegration0.f(4.017452540903338d);
        double double26 = simpsonIntegration0.simpsonsMethod((int) (byte) -1, (double) 100L, (-0.21850356693465028d));
        double double30 = simpsonIntegration0.simpsonsMethod((int) 'a', 1.7010219573714175E-40d, 4.522636368713808d);
        double double34 = simpsonIntegration0.simpsonsMethod((int) 'a', 4.000000000041571d, 2.6478847316533405E47d);
        double double36 = simpsonIntegration0.f((-2.1973647973812517E-4d));
        double double40 = simpsonIntegration0.simpsonsMethod((-1), 4.159574664691861d, (-0.21985105211622094d));
        double double44 = simpsonIntegration0.simpsonsMethod((int) '#', 0.0d, 113.77756524225931d);
        double double46 = simpsonIntegration0.f(1.6326492254099202E-24d);
        java.lang.Class<?> wildcardClass47 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.004358393257198546d) + "'", double14 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.21850356693465028d) + "'", double22 == (-0.21850356693465028d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-2.9383834183063776E-39d) + "'", double30 == (-2.9383834183063776E-39d));
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 4.000878994199535d + "'", double36 == 4.000878994199535d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-0.0d) + "'", double44 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 4.0d + "'", double46 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double2 = simpsonIntegration0.f((double) 0);
        double double6 = simpsonIntegration0.simpsonsMethod((int) '4', (-7.047753488102803E-20d), (-0.0012649947976536042d));
        double double10 = simpsonIntegration0.simpsonsMethod((int) 'a', (-1.9013579238539744E-69d), 177.83695398750095d);
        double double14 = simpsonIntegration0.simpsonsMethod((int) (byte) 1, (-1.3332985455191015d), (-0.017959162462641984d));
        double double16 = simpsonIntegration0.f(4.064880833848463d);
        double double20 = simpsonIntegration0.simpsonsMethod((int) (short) 100, (-2.7847089655510492E-45d), 0.7714961382196976d);
        double double22 = simpsonIntegration0.f(12.136492619068228d);
        java.lang.Class<?> wildcardClass23 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.4677877090000082E-17d) + "'", double6 == (-1.4677877090000082E-17d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.3940787665690245E-140d + "'", double10 == 3.3940787665690245E-140d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-5.541700050128766d) + "'", double14 == (-5.541700050128766d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.21496212640080373d) + "'", double16 == (-0.21496212640080373d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-4.383430258657361E-43d) + "'", double20 == (-4.383430258657361E-43d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-7.680997170482439E-4d) + "'", double22 == (-7.680997170482439E-4d));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double14 = simpsonIntegration0.f(10.0d);
        double double16 = simpsonIntegration0.f((double) (short) 10);
        double double20 = simpsonIntegration0.simpsonsMethod((-1), (double) (short) 10, 2.609103086070402E-5d);
        double double22 = simpsonIntegration0.f(4.017452540903338d);
        double double26 = simpsonIntegration0.simpsonsMethod((int) (byte) -1, (double) 100L, (-0.21850356693465028d));
        double double28 = simpsonIntegration0.f(6.713968744570808d);
        double double32 = simpsonIntegration0.simpsonsMethod((int) (byte) 100, (-0.15481487707579042d), (-2.2580525594652775E-19d));
        double double34 = simpsonIntegration0.f(9.602519103733377d);
        double double36 = simpsonIntegration0.f(16.114832901593264d);
        double double38 = simpsonIntegration0.f((-7.209302091946524d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.004358393257198546d) + "'", double14 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.21850356693465028d) + "'", double22 == (-0.21850356693465028d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-0.04986124508701346d) + "'", double28 == (-0.04986124508701346d));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 1.093693750903387E9d + "'", double32 == 1.093693750903387E9d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-0.005959210866063758d) + "'", double34 == (-0.005959210866063758d));
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-2.5652344723017104E-5d) + "'", double36 == (-2.5652344723017104E-5d));
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-64858.42220814868d) + "'", double38 == (-64858.42220814868d));
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f((double) (-1L));
        double double14 = simpsonIntegration0.simpsonsMethod(1, 40.46343442189374d, 0.0d);
        double double18 = simpsonIntegration0.simpsonsMethod((int) (byte) 10, (double) '#', (double) 0.0f);
        double double22 = simpsonIntegration0.simpsonsMethod(10, (-3.718587945630428E-40d), (double) (short) 10);
        double double24 = simpsonIntegration0.f(0.0d);
        double double28 = simpsonIntegration0.simpsonsMethod((int) '4', 3.999134630525349d, (-0.12596183872068215d));
        double double30 = simpsonIntegration0.f(1.7010573769184405d);
        double double34 = simpsonIntegration0.simpsonsMethod(100, 4.301096944478566d, (-0.19222885149765373d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.154845485377137d + "'", double10 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 53.95124589585826d + "'", double14 == 53.95124589585826d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 46.66666666663074d + "'", double18 == 46.66666666663074d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.6207068628535456E-41d + "'", double22 == 1.6207068628535456E-41d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 4.0d + "'", double24 == 4.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 4.740159026617631d + "'", double28 == 4.740159026617631d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.2019081393708409d + "'", double30 == 0.2019081393708409d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 5.627124368673698d + "'", double34 == 5.627124368673698d);
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double14 = simpsonIntegration0.f(10.0d);
        double double16 = simpsonIntegration0.f((double) (short) 10);
        double double20 = simpsonIntegration0.simpsonsMethod((int) (byte) 10, (double) 1, 0.865609122350895d);
        double double24 = simpsonIntegration0.simpsonsMethod(0, (double) (short) 100, (double) (-1));
        double double26 = simpsonIntegration0.f((-3.7939539979137215E-40d));
        double double30 = simpsonIntegration0.simpsonsMethod((int) '4', 4.290977979226583d, 50489.425684341906d);
        double double34 = simpsonIntegration0.simpsonsMethod((int) 'a', (double) (-1), (-0.5412450765741706d));
        double double36 = simpsonIntegration0.f((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.004358393257198546d) + "'", double14 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.19222885149765373d) + "'", double20 == (-0.19222885149765373d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 271.8281828459046d + "'", double24 == 271.8281828459046d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 4.0d + "'", double26 == 4.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.767689885073998E46d + "'", double34 == 1.767689885073998E46d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-3.718587945630428E-40d) + "'", double36 == (-3.718587945630428E-40d));
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        double double18 = simpsonIntegration0.simpsonsMethod((int) (short) 100, 4.000004157639954d, (-0.2100593206839558d));
        double double22 = simpsonIntegration0.simpsonsMethod((int) (byte) 100, (-0.016155316979210545d), (-0.25447267600936185d));
        double double24 = simpsonIntegration0.f(2.534547434273728E-11d);
        double double26 = simpsonIntegration0.f((double) 100);
        double double30 = simpsonIntegration0.simpsonsMethod((int) (byte) 0, 37867.06926325643d, 133.91508469677794d);
        double double34 = simpsonIntegration0.simpsonsMethod((int) '#', 2.025364812212042d, (-4.4891700020047587E-11d));
        double double38 = simpsonIntegration0.simpsonsMethod((int) (byte) 0, (-7.739413865779025E18d), (-2.0450979511321518E-30d));
        double double40 = simpsonIntegration0.f(0.0d);
        java.lang.Class<?> wildcardClass41 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 5.190318108611563d + "'", double18 == 5.190318108611563d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-11.401442591964965d) + "'", double22 == (-11.401442591964965d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 3.999999999898618d + "'", double24 == 3.999999999898618d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-3.718587945630428E-40d) + "'", double26 == (-3.718587945630428E-40d));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-1.5707976129560468E-50d) + "'", double30 == (-1.5707976129560468E-50d));
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 2.1309036837023276d + "'", double34 == 2.1309036837023276d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-1.0319218487705367E19d) + "'", double38 == (-1.0319218487705367E19d));
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 4.0d + "'", double40 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double12 = simpsonIntegration0.simpsonsMethod(0, (double) 1L, (double) 100.0f);
        double double14 = simpsonIntegration0.f((-1.0781454254561233E-20d));
        double double18 = simpsonIntegration0.simpsonsMethod((int) (byte) 0, (-0.001693227728973961d), (-0.11021647807132358d));
        double double22 = simpsonIntegration0.simpsonsMethod((int) (byte) 1, 1.3678875951919236d, (-25.7567339920559d));
        double double26 = simpsonIntegration0.simpsonsMethod((int) '#', 6.392519083195419E14d, 4.058365782993775d);
        double double28 = simpsonIntegration0.f(2.6077294675569685E-41d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.2395293152101427E-40d) + "'", double12 == (-1.2395293152101427E-40d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.0025130411114009576d) + "'", double18 == (-0.0025130411114009576d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-5.666893689166815E13d) + "'", double22 == (-5.666893689166815E13d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-4.590954178238173E13d) + "'", double26 == (-4.590954178238173E13d));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 4.0d + "'", double28 == 4.0d);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        double double16 = simpsonIntegration0.f((double) 10L);
        double double20 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (-2.2148125385032659E-54d));
        double double22 = simpsonIntegration0.f(3.516335322931642d);
        double double26 = simpsonIntegration0.simpsonsMethod((int) (short) 1, 8.799770009341391E10d, (double) 0.0f);
        double double28 = simpsonIntegration0.f(5.216391318182206d);
        double double30 = simpsonIntegration0.f(0.0d);
        double double32 = simpsonIntegration0.f((-1.1283529452428217E-25d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.2484968469493311d) + "'", double22 == (-0.2484968469493311d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.1733026679121855E11d + "'", double26 == 1.1733026679121855E11d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-0.12596183872068215d) + "'", double28 == (-0.12596183872068215d));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 4.0d + "'", double30 == 4.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 4.0d + "'", double32 == 4.0d);
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(10, (-0.0d), (double) (byte) 0);
        double double18 = simpsonIntegration0.f((double) 0L);
        double double22 = simpsonIntegration0.simpsonsMethod((int) (short) 100, (double) 100, (double) 10L);
        double double24 = simpsonIntegration0.f((double) (short) 10);
        double double28 = simpsonIntegration0.simpsonsMethod((int) '4', 1.9972480396213286d, (-0.11021647807132358d));
        double double32 = simpsonIntegration0.simpsonsMethod((int) (byte) 1, (-0.11603030361707438d), (-1.966907059238147E-73d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.0d) + "'", double16 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.14527977523995153d) + "'", double22 == (-0.14527977523995153d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-0.004358393257198546d) + "'", double24 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 2.566645225308353d + "'", double28 == 2.566645225308353d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-0.3278629700389083d) + "'", double32 == (-0.3278629700389083d));
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double12 = simpsonIntegration0.simpsonsMethod(0, (double) 1L, (double) 100.0f);
        double double14 = simpsonIntegration0.f((-1.0781454254561233E-20d));
        double double18 = simpsonIntegration0.simpsonsMethod((int) (byte) 0, (-0.001693227728973961d), (-0.11021647807132358d));
        double double20 = simpsonIntegration0.f(5.244886555713727d);
        double double22 = simpsonIntegration0.f((-0.7750610602756668d));
        java.lang.Class<?> wildcardClass23 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.2395293152101427E-40d) + "'", double12 == (-1.2395293152101427E-40d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.0025130411114009576d) + "'", double18 == (-0.0025130411114009576d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.1239954697245761d) + "'", double20 == (-0.1239954697245761d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 7.378901715990906d + "'", double22 == 7.378901715990906d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) (short) -1);
        double double14 = simpsonIntegration0.f(1.6207068628535456E-41d);
        double double16 = simpsonIntegration0.f(86.98501851068946d);
        double double18 = simpsonIntegration0.f(1.677349340227826E13d);
        double double20 = simpsonIntegration0.f((-6.245641679771267d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.154845485377137d + "'", double12 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.2634141046617278E-34d) + "'", double16 == (-1.2634141046617278E-34d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.0d) + "'", double18 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-18055.749211899783d) + "'", double20 == (-18055.749211899783d));
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 0.0d, (double) (byte) 1);
        double double16 = simpsonIntegration0.f((double) 1L);
        double double18 = simpsonIntegration0.f(4.0d);
        double double20 = simpsonIntegration0.f((double) '4');
        double double22 = simpsonIntegration0.f((-5.885963407493417E-54d));
        double double26 = simpsonIntegration0.simpsonsMethod(0, (-1.1723421175368526E33d), (-0.17869886812937555d));
        double double30 = simpsonIntegration0.simpsonsMethod((int) ' ', (-0.8373242679212068d), (-0.04037443249634688d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.103638323514327d + "'", double16 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.21978766666481014d) + "'", double18 == (-0.21978766666481014d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-7.047753488102803E-20d) + "'", double20 == (-7.047753488102803E-20d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.0d + "'", double22 == 4.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.854043889251194E33d) + "'", double26 == (-1.854043889251194E33d));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 3.006576060032853E14d + "'", double30 == 3.006576060032853E14d);
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double14 = simpsonIntegration0.simpsonsMethod((int) (short) 10, (double) (byte) 1, (-1.2634141046617278E-34d));
        double double16 = simpsonIntegration0.f(4.880565806253262d);
        double double20 = simpsonIntegration0.simpsonsMethod((int) (byte) 100, 14.352775055113481d, 1.2395293152101427E-40d);
        double double22 = simpsonIntegration0.f(5.013142936481665E9d);
        double double24 = simpsonIntegration0.f((-9.525478241589842E-38d));
        double double28 = simpsonIntegration0.simpsonsMethod((int) (short) 10, 2.6472019978091197d, 3.6394658261790678d);
        double double32 = simpsonIntegration0.simpsonsMethod((int) '#', 4.1439347378385145d, 4.191427205849399d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2.002615341358857d + "'", double14 == 2.002615341358857d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.15048705932345452d) + "'", double16 == (-0.15048705932345452d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 19.13477449062135d + "'", double20 == 19.13477449062135d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.0d) + "'", double22 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 4.0d + "'", double24 == 4.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-0.4698284492467563d) + "'", double28 == (-0.4698284492467563d));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-0.3719348782105178d) + "'", double32 == (-0.3719348782105178d));
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double8 = simpsonIntegration0.f((double) (-1L));
        double double10 = simpsonIntegration0.f((double) 10);
        double double12 = simpsonIntegration0.f(1.2514464254193938d);
        double double16 = simpsonIntegration0.simpsonsMethod(0, (-0.21979531239781874d), 53.95124589585826d);
        double double20 = simpsonIntegration0.simpsonsMethod((int) (short) 10, (-7.047753488102803E-20d), 1.9016583609866715d);
        double double24 = simpsonIntegration0.simpsonsMethod((int) (byte) 100, 2.0392516257668794d, 4.744461181212093d);
        double double28 = simpsonIntegration0.simpsonsMethod(0, 1.093693750903387E9d, 3.1066519309245734E11d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.154845485377137d + "'", double8 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.004358393257198546d) + "'", double10 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.6963109328077465d + "'", double12 == 0.6963109328077465d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 7.8990436866135935E-22d + "'", double16 == 7.8990436866135935E-22d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-4.03791947167852E-20d) + "'", double20 == (-4.03791947167852E-20d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-0.2602951346802557d) + "'", double24 == (-0.2602951346802557d));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double14 = simpsonIntegration0.simpsonsMethod((-1), (-3.516843742144352E-16d), 0.0d);
        double double16 = simpsonIntegration0.f((-0.9544820129360382d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.0d) + "'", double14 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 8.023043195425396d + "'", double16 == 8.023043195425396d);
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        double double16 = simpsonIntegration0.f((double) 10L);
        double double18 = simpsonIntegration0.f((double) (short) 10);
        double double22 = simpsonIntegration0.simpsonsMethod((int) '4', (double) 1, (double) 10);
        double double26 = simpsonIntegration0.simpsonsMethod(0, 86.98501851068946d, 0.0d);
        double double30 = simpsonIntegration0.simpsonsMethod((int) '#', 263.67333736052746d, 2.609103086070402E-5d);
        double double34 = simpsonIntegration0.simpsonsMethod((-1), (-0.016155316979210545d), (-0.001693227728973961d));
        double double36 = simpsonIntegration0.f((double) ' ');
        double double40 = simpsonIntegration0.simpsonsMethod((int) (byte) 10, (-6.963036892259676E-41d), 241.393345129359d);
        double double44 = simpsonIntegration0.simpsonsMethod((int) (short) 1, 1.0368854366838988E-41d, (-0.21850356693465028d));
        double double46 = simpsonIntegration0.f(1.6382258164782091E-31d);
        double double50 = simpsonIntegration0.simpsonsMethod((int) '4', (-7.342443577706336E-20d), (-0.052080790422341865d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.004358393257198546d) + "'", double18 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.005367301737528441d) + "'", double22 == (-0.005367301737528441d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 115.98002468091927d + "'", double26 == 115.98002468091927d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 351.55527719495865d + "'", double30 == 351.55527719495865d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-0.0d) + "'", double34 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-1.291744886007606E-11d) + "'", double36 == (-1.291744886007606E-11d));
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 5.921363349002919E-140d + "'", double40 == 5.921363349002919E-140d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 3.399221754746374E-41d + "'", double44 == 3.399221754746374E-41d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 4.0d + "'", double46 == 4.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + (-1.6077842014315496E-17d) + "'", double50 == (-1.6077842014315496E-17d));
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double8 = simpsonIntegration0.f((double) (-1L));
        double double10 = simpsonIntegration0.f((double) 10);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 1.2514464254193938d, 0.0d);
        double double18 = simpsonIntegration0.simpsonsMethod(10, (-0.01453886097417405d), 9.931906770383255E-23d);
        double double20 = simpsonIntegration0.f(1.7010219573714175E-40d);
        double double24 = simpsonIntegration0.simpsonsMethod((int) '#', 0.865609122350895d, (-7.027389983271083E-39d));
        double double28 = simpsonIntegration0.simpsonsMethod((int) '#', (-0.21331563406496507d), 1.7010219573714175E-40d);
        double double32 = simpsonIntegration0.simpsonsMethod(100, 1.6207068628535456E-41d, 6.012902566071085E-4d);
        double double34 = simpsonIntegration0.f((-6.135754481570391E-41d));
        double double36 = simpsonIntegration0.f(6.791846724745044d);
        double double38 = simpsonIntegration0.f((-1.4659035088898843E-68d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.154845485377137d + "'", double8 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.004358393257198546d) + "'", double10 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2.0018152742371256d + "'", double14 == 2.0018152742371256d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.6248127531564629d) + "'", double18 == (-0.6248127531564629d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.0d + "'", double20 == 4.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.997483484540344d + "'", double24 == 1.997483484540344d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 62279.944702754045d + "'", double28 == 62279.944702754045d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 6.478929976516274E-39d + "'", double32 == 6.478929976516274E-39d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 4.0d + "'", double34 == 4.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-0.047306571223171195d) + "'", double36 == (-0.047306571223171195d));
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 4.0d + "'", double38 == 4.0d);
    }
}

