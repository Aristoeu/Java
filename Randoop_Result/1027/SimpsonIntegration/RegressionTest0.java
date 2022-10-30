package SimpsonIntegration;

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
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        java.lang.Class<?> wildcardClass1 = simpsonIntegration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        java.lang.Class<?> wildcardClass5 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        java.lang.Class<?> wildcardClass7 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double2 = simpsonIntegration0.f((double) 0);
        double double6 = simpsonIntegration0.simpsonsMethod(0, (double) (byte) -1, (double) 100.0f);
        java.lang.Class<?> wildcardClass7 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.2395293152101427E-40d + "'", double6 == 1.2395293152101427E-40d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        java.lang.Class<?> wildcardClass11 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        java.lang.Class<?> wildcardClass13 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double2 = simpsonIntegration0.f((double) 0);
        double double6 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 1.2395293152101427E-40d, (double) (byte) 10);
        java.lang.Class<?> wildcardClass7 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.8007854031706057E-43d) + "'", double6 == (-1.8007854031706057E-43d));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        java.lang.Class<?> wildcardClass13 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double12 = simpsonIntegration0.f((double) 10);
        java.lang.Class<?> wildcardClass13 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        java.lang.Class<?> wildcardClass15 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double16 = simpsonIntegration0.simpsonsMethod(0, 0.0d, 0.9226783964008627d);
        java.lang.Class<?> wildcardClass17 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double14 = simpsonIntegration0.f((double) (byte) 10);
        java.lang.Class<?> wildcardClass15 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.004358393257198546d) + "'", double14 == (-0.004358393257198546d));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) ' ', 0.0d, 0.0d);
        double double6 = simpsonIntegration0.f((double) (byte) 0);
        java.lang.Class<?> wildcardClass7 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (byte) 0, (double) 0L, (double) ' ');
        double double8 = simpsonIntegration0.simpsonsMethod((int) '#', (double) 'a', 0.9226783964008627d);
        java.lang.Class<?> wildcardClass9 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.46343442189374d + "'", double8 == 40.46343442189374d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double2 = simpsonIntegration0.f((double) 0);
        java.lang.Class<?> wildcardClass3 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(0, (double) ' ', (double) (-1));
        double double18 = simpsonIntegration0.f((double) (byte) 10);
        java.lang.Class<?> wildcardClass19 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 86.98501851068946d + "'", double16 == 86.98501851068946d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.004358393257198546d) + "'", double18 == (-0.004358393257198546d));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(100, (double) 1, 1.2395293152101427E-40d);
        java.lang.Class<?> wildcardClass11 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.9972480396213286d + "'", double10 == 1.9972480396213286d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 0.0d, (double) (byte) 1);
        double double16 = simpsonIntegration0.f((double) 1L);
        double double18 = simpsonIntegration0.f(4.0d);
        java.lang.Class<?> wildcardClass19 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.103638323514327d + "'", double16 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.21978766666481014d) + "'", double18 == (-0.21978766666481014d));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(0, (double) ' ', (double) (-1));
        double double18 = simpsonIntegration0.f(1.2395293152101427E-40d);
        double double20 = simpsonIntegration0.f((-0.004358393257198546d));
        java.lang.Class<?> wildcardClass21 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 86.98501851068946d + "'", double16 == 86.98501851068946d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.017452540903338d + "'", double20 == 4.017452540903338d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) ' ', 0.0d, 0.0d);
        java.lang.Class<?> wildcardClass5 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 0.0d, (double) (byte) 1);
        double double16 = simpsonIntegration0.f((double) 1L);
        java.lang.Class<?> wildcardClass17 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.103638323514327d + "'", double16 == 1.103638323514327d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(0, (double) ' ', (double) (-1));
        double double18 = simpsonIntegration0.f((double) (byte) 10);
        double double22 = simpsonIntegration0.simpsonsMethod((int) (short) -1, 0.9226783964008627d, (double) (byte) 1);
        double double26 = simpsonIntegration0.simpsonsMethod((int) (byte) -1, 4.0d, 1.0d);
        java.lang.Class<?> wildcardClass27 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 86.98501851068946d + "'", double16 == 86.98501851068946d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.004358393257198546d) + "'", double18 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(0, (double) ' ', (double) (-1));
        double double18 = simpsonIntegration0.f(1.2395293152101427E-40d);
        double double20 = simpsonIntegration0.f((-0.004358393257198546d));
        double double22 = simpsonIntegration0.f((double) 0L);
        java.lang.Class<?> wildcardClass23 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 86.98501851068946d + "'", double16 == 86.98501851068946d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.017452540903338d + "'", double20 == 4.017452540903338d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.0d + "'", double22 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        double double16 = simpsonIntegration0.f((double) 10L);
        double double18 = simpsonIntegration0.f((double) (-1L));
        java.lang.Class<?> wildcardClass19 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 8.154845485377137d + "'", double18 == 8.154845485377137d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(10, (-0.0d), (double) (byte) 0);
        double double18 = simpsonIntegration0.f((double) 0L);
        double double22 = simpsonIntegration0.simpsonsMethod((int) (short) 100, (double) 100, (double) 10L);
        double double26 = simpsonIntegration0.simpsonsMethod(0, 0.9226783964008627d, 1.0d);
        java.lang.Class<?> wildcardClass27 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.0d) + "'", double16 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.14527977523995153d) + "'", double22 == (-0.14527977523995153d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.3394344128489119d + "'", double26 == 0.3394344128489119d);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(0, (double) ' ', (double) (-1));
        java.lang.Class<?> wildcardClass17 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 86.98501851068946d + "'", double16 == 86.98501851068946d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double16 = simpsonIntegration0.simpsonsMethod(0, 0.0d, 0.9226783964008627d);
        double double18 = simpsonIntegration0.f(86.98501851068946d);
        java.lang.Class<?> wildcardClass19 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.2634141046617278E-34d) + "'", double18 == (-1.2634141046617278E-34d));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double14 = simpsonIntegration0.simpsonsMethod((int) (short) 10, (double) (byte) 1, (-1.2634141046617278E-34d));
        java.lang.Class<?> wildcardClass15 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2.002615341358857d + "'", double14 == 2.002615341358857d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(0, (double) ' ', (double) (-1));
        double double18 = simpsonIntegration0.f((double) (byte) 10);
        double double22 = simpsonIntegration0.simpsonsMethod((int) (short) -1, 0.9226783964008627d, (double) (byte) 1);
        double double26 = simpsonIntegration0.simpsonsMethod(0, (double) (byte) 1, (double) (-1));
        java.lang.Class<?> wildcardClass27 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 86.98501851068946d + "'", double16 == 86.98501851068946d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.004358393257198546d) + "'", double18 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 2.7182818284590455d + "'", double26 == 2.7182818284590455d);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double2 = simpsonIntegration0.f((double) 0);
        double double6 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 1.2395293152101427E-40d, (double) (byte) 10);
        double double10 = simpsonIntegration0.simpsonsMethod((int) (byte) 100, (double) (byte) 10, (double) (byte) 10);
        double double12 = simpsonIntegration0.f(1.2395293152101427E-40d);
        java.lang.Class<?> wildcardClass13 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.8007854031706057E-43d) + "'", double6 == (-1.8007854031706057E-43d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.01453886097417405d) + "'", double10 == (-0.01453886097417405d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.0d + "'", double12 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (byte) -1, (-1.8007854031706057E-43d), (double) (byte) 0);
        double double8 = simpsonIntegration0.simpsonsMethod(0, (double) 0.0f, 0.0d);
        java.lang.Class<?> wildcardClass9 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(10, (-0.0d), (double) (byte) 0);
        double double18 = simpsonIntegration0.f((double) 0L);
        double double22 = simpsonIntegration0.simpsonsMethod((int) (short) 100, (double) 100, (double) 10L);
        java.lang.Class<?> wildcardClass23 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.0d) + "'", double16 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.14527977523995153d) + "'", double22 == (-0.14527977523995153d));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        double double16 = simpsonIntegration0.f(8.154845485377137d);
        double double18 = simpsonIntegration0.f((double) 0.0f);
        double double20 = simpsonIntegration0.f((double) 100);
        java.lang.Class<?> wildcardClass21 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.017959162462641984d) + "'", double16 == (-0.017959162462641984d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-3.718587945630428E-40d) + "'", double20 == (-3.718587945630428E-40d));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double14 = simpsonIntegration0.f(53.95124589585826d);
        java.lang.Class<?> wildcardClass15 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0781454254561233E-20d) + "'", double14 == (-1.0781454254561233E-20d));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double2 = simpsonIntegration0.f((double) 0);
        double double6 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 1.2395293152101427E-40d, (double) (byte) 10);
        double double8 = simpsonIntegration0.f(0.0d);
        java.lang.Class<?> wildcardClass9 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.8007854031706057E-43d) + "'", double6 == (-1.8007854031706057E-43d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.0d + "'", double8 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double14 = simpsonIntegration0.simpsonsMethod((int) (short) 10, (double) (byte) 1, (-1.2634141046617278E-34d));
        double double16 = simpsonIntegration0.f(4.880565806253262d);
        java.lang.Class<?> wildcardClass17 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2.002615341358857d + "'", double14 == 2.002615341358857d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.15048705932345452d) + "'", double16 == (-0.15048705932345452d));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        double double16 = simpsonIntegration0.f((double) 10L);
        double double18 = simpsonIntegration0.f((double) (short) 10);
        java.lang.Class<?> wildcardClass19 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.004358393257198546d) + "'", double18 == (-0.004358393257198546d));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
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
        java.lang.Class<?> wildcardClass29 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 86.98501851068946d + "'", double16 == 86.98501851068946d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.004358393257198546d) + "'", double18 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 2.7182818284590455d + "'", double26 == 2.7182818284590455d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 4.0d + "'", double28 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (byte) 0, (double) 0L, (double) ' ');
        double double8 = simpsonIntegration0.simpsonsMethod((int) '#', (double) 'a', 0.9226783964008627d);
        double double10 = simpsonIntegration0.f((-0.01453886097417405d));
        java.lang.Class<?> wildcardClass11 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.46343442189374d + "'", double8 == 40.46343442189374d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.058365782993775d + "'", double10 == 4.058365782993775d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 0.0d, (double) (byte) 1);
        java.lang.Class<?> wildcardClass15 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double2 = simpsonIntegration0.f((double) 0);
        double double6 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 1.2395293152101427E-40d, (double) (byte) 10);
        double double8 = simpsonIntegration0.f(0.0d);
        double double10 = simpsonIntegration0.f(2.002615341358857d);
        double double12 = simpsonIntegration0.f(2.002615341358857d);
        java.lang.Class<?> wildcardClass13 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.8007854031706057E-43d) + "'", double6 == (-1.8007854031706057E-43d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.0d + "'", double8 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.0014130171899539316d) + "'", double10 == (-0.0014130171899539316d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.0014130171899539316d) + "'", double12 == (-0.0014130171899539316d));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        double double16 = simpsonIntegration0.f((double) 10L);
        double double18 = simpsonIntegration0.f((double) (-1L));
        double double20 = simpsonIntegration0.f(86.98501851068946d);
        double double22 = simpsonIntegration0.f(2.8306689949230137E-25d);
        java.lang.Class<?> wildcardClass23 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 8.154845485377137d + "'", double18 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.2634141046617278E-34d) + "'", double20 == (-1.2634141046617278E-34d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.0d + "'", double22 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double2 = simpsonIntegration0.f((double) 0);
        double double6 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 1.2395293152101427E-40d, (double) (byte) 10);
        double double10 = simpsonIntegration0.simpsonsMethod((int) (byte) 100, (double) (byte) 10, (double) (byte) 10);
        java.lang.Class<?> wildcardClass11 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.8007854031706057E-43d) + "'", double6 == (-1.8007854031706057E-43d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.01453886097417405d) + "'", double10 == (-0.01453886097417405d));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f((double) '4');
        java.lang.Class<?> wildcardClass11 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-7.047753488102803E-20d) + "'", double10 == (-7.047753488102803E-20d));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double14 = simpsonIntegration0.f((-0.01453886097417405d));
        java.lang.Class<?> wildcardClass15 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.058365782993775d + "'", double14 == 4.058365782993775d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double14 = simpsonIntegration0.simpsonsMethod((int) (short) 10, (double) (byte) 1, (-1.2634141046617278E-34d));
        double double16 = simpsonIntegration0.f(4.880565806253262d);
        double double20 = simpsonIntegration0.simpsonsMethod((int) (byte) 100, 14.352775055113481d, 1.2395293152101427E-40d);
        java.lang.Class<?> wildcardClass21 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2.002615341358857d + "'", double14 == 2.002615341358857d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.15048705932345452d) + "'", double16 == (-0.15048705932345452d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 19.13477449062135d + "'", double20 == 19.13477449062135d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 0.0d, (double) (byte) 1);
        double double16 = simpsonIntegration0.f((double) 1L);
        double double18 = simpsonIntegration0.f(8.154845485377137d);
        java.lang.Class<?> wildcardClass19 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.103638323514327d + "'", double16 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.017959162462641984d) + "'", double18 == (-0.017959162462641984d));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double12 = simpsonIntegration0.f((double) 10);
        double double16 = simpsonIntegration0.simpsonsMethod((int) '#', (-1.0d), (double) 100.0f);
        double double18 = simpsonIntegration0.f((double) '#');
        java.lang.Class<?> wildcardClass19 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 2.1230017461922604E-25d + "'", double16 == 2.1230017461922604E-25d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-7.698547564139474E-13d) + "'", double18 == (-7.698547564139474E-13d));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (byte) 0, (double) 0L, (double) ' ');
        double double6 = simpsonIntegration0.f((-1.8007854031706057E-43d));
        double double10 = simpsonIntegration0.simpsonsMethod((int) (short) 10, 4.017452540903338d, (-1.2634141046617278E-34d));
        double double14 = simpsonIntegration0.simpsonsMethod((int) (short) 10, (double) 0, (double) 100L);
        java.lang.Class<?> wildcardClass15 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.129134273777278d + "'", double10 == 4.129134273777278d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.0d) + "'", double14 == (-0.0d));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) 'a', 10.0d, 2.002615341358857d);
        java.lang.Class<?> wildcardClass5 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.016155316979210545d) + "'", double4 == (-0.016155316979210545d));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double12 = simpsonIntegration0.simpsonsMethod((int) (byte) -1, 4.021497963060547d, (-3.3283848740159176E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(0, (double) ' ', (double) (-1));
        double double18 = simpsonIntegration0.f((double) (byte) 10);
        double double22 = simpsonIntegration0.simpsonsMethod((int) (short) -1, 0.9226783964008627d, (double) (byte) 1);
        double double26 = simpsonIntegration0.simpsonsMethod(0, (double) (byte) 1, (double) (-1));
        double double30 = simpsonIntegration0.simpsonsMethod((int) (byte) 1, 2.8306689949230137E-25d, 2.002615341358857d);
        java.lang.Class<?> wildcardClass31 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 86.98501851068946d + "'", double16 == 86.98501851068946d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.004358393257198546d) + "'", double18 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 2.7182818284590455d + "'", double26 == 2.7182818284590455d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-2.6665226325972244E-28d) + "'", double30 == (-2.6665226325972244E-28d));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) (short) -1);
        java.lang.Class<?> wildcardClass13 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.154845485377137d + "'", double12 == 8.154845485377137d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double12 = simpsonIntegration0.f((double) 10);
        double double16 = simpsonIntegration0.simpsonsMethod(0, (-1.2395293152101427E-40d), 4.058365782993775d);
        java.lang.Class<?> wildcardClass17 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 8.902002817124393E-42d + "'", double16 == 8.902002817124393E-42d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (byte) 0, (double) 0L, (double) ' ');
        double double6 = simpsonIntegration0.f((-1.8007854031706057E-43d));
        double double10 = simpsonIntegration0.simpsonsMethod((int) (short) 10, 4.017452540903338d, (-1.2634141046617278E-34d));
        java.lang.Class<?> wildcardClass11 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.129134273777278d + "'", double10 == 4.129134273777278d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(0, (double) ' ', (double) (-1));
        double double18 = simpsonIntegration0.f(1.2395293152101427E-40d);
        double double20 = simpsonIntegration0.f((-0.004358393257198546d));
        double double22 = simpsonIntegration0.f((-0.2100593206839558d));
        java.lang.Class<?> wildcardClass23 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 86.98501851068946d + "'", double16 == 86.98501851068946d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.017452540903338d + "'", double20 == 4.017452540903338d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.880565806253262d + "'", double22 == 4.880565806253262d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double16 = simpsonIntegration0.simpsonsMethod(0, 0.0d, 0.9226783964008627d);
        double double18 = simpsonIntegration0.f((double) 10);
        double double22 = simpsonIntegration0.simpsonsMethod((int) (byte) 1, (double) (short) 1, 0.0d);
        double double24 = simpsonIntegration0.f((-0.004358393257198546d));
        java.lang.Class<?> wildcardClass25 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.004358393257198546d) + "'", double18 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.7012127745047754d + "'", double22 == 1.7012127745047754d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 4.017452540903338d + "'", double24 == 4.017452540903338d);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        double double18 = simpsonIntegration0.simpsonsMethod((int) (short) 10, (double) (short) 100, (-1.2395293152101427E-40d));
        java.lang.Class<?> wildcardClass19 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 133.33333333333334d + "'", double18 == 133.33333333333334d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double12 = simpsonIntegration0.simpsonsMethod(0, (double) 1L, (double) 100.0f);
        double double14 = simpsonIntegration0.f((double) 0L);
        java.lang.Class<?> wildcardClass15 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.2395293152101427E-40d) + "'", double12 == (-1.2395293152101427E-40d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double2 = simpsonIntegration0.f((double) 0);
        double double6 = simpsonIntegration0.simpsonsMethod(0, (double) (byte) -1, (double) 100.0f);
        double double8 = simpsonIntegration0.f(100.0d);
        java.lang.Class<?> wildcardClass9 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.2395293152101427E-40d + "'", double6 == 1.2395293152101427E-40d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.718587945630428E-40d) + "'", double8 == (-3.718587945630428E-40d));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(10, (-0.0d), (double) (byte) 0);
        double double18 = simpsonIntegration0.f((double) 0L);
        double double22 = simpsonIntegration0.simpsonsMethod((int) (short) 100, (double) 100, (double) 10L);
        double double24 = simpsonIntegration0.f((double) (short) 10);
        double double26 = simpsonIntegration0.f(53.95124589585826d);
        double double28 = simpsonIntegration0.f(4.005654064435647d);
        java.lang.Class<?> wildcardClass29 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.0d) + "'", double16 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.14527977523995153d) + "'", double22 == (-0.14527977523995153d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-0.004358393257198546d) + "'", double24 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0781454254561233E-20d) + "'", double26 == (-1.0781454254561233E-20d));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-0.219372853236844d) + "'", double28 == (-0.219372853236844d));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double12 = simpsonIntegration0.simpsonsMethod(0, (double) 1L, (double) 100.0f);
        double double14 = simpsonIntegration0.f((double) 0L);
        double double18 = simpsonIntegration0.simpsonsMethod((int) (short) -1, (-1.8007854031706057E-43d), 1.0d);
        java.lang.Class<?> wildcardClass19 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.2395293152101427E-40d) + "'", double12 == (-1.2395293152101427E-40d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.0d) + "'", double18 == (-0.0d));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        double double16 = simpsonIntegration0.f(8.154845485377137d);
        double double18 = simpsonIntegration0.f((double) 0.0f);
        double double20 = simpsonIntegration0.f((double) 100);
        double double22 = simpsonIntegration0.f((-0.005367301737528441d));
        java.lang.Class<?> wildcardClass23 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.017959162462641984d) + "'", double16 == (-0.017959162462641984d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-3.718587945630428E-40d) + "'", double20 == (-3.718587945630428E-40d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.021497963060547d + "'", double22 == 4.021497963060547d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double2 = simpsonIntegration0.f((double) 0);
        double double6 = simpsonIntegration0.simpsonsMethod((int) '4', (-7.047753488102803E-20d), (-0.0012649947976536042d));
        java.lang.Class<?> wildcardClass7 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.4677877090000082E-17d) + "'", double6 == (-1.4677877090000082E-17d));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(10, (-0.0d), (double) (byte) 0);
        double double18 = simpsonIntegration0.f((double) 0L);
        double double22 = simpsonIntegration0.simpsonsMethod((int) (short) 100, (double) 100, (double) 10L);
        double double24 = simpsonIntegration0.f((double) (short) 10);
        double double28 = simpsonIntegration0.simpsonsMethod((-1), (-0.021540422638947395d), (double) (byte) 10);
        java.lang.Class<?> wildcardClass29 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.0d) + "'", double16 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.14527977523995153d) + "'", double22 == (-0.14527977523995153d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-0.004358393257198546d) + "'", double24 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-0.0d) + "'", double28 == (-0.0d));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(0, (double) ' ', (double) (-1));
        double double18 = simpsonIntegration0.f(1.2395293152101427E-40d);
        double double20 = simpsonIntegration0.f((-0.004358393257198546d));
        double double24 = simpsonIntegration0.simpsonsMethod((int) (short) 1, (double) (byte) 10, 4.005654064435647d);
        java.lang.Class<?> wildcardClass25 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 86.98501851068946d + "'", double16 == 86.98501851068946d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.017452540903338d + "'", double20 == 4.017452540903338d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-0.7317724584449441d) + "'", double24 == (-0.7317724584449441d));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        double double16 = simpsonIntegration0.f((double) 10L);
        double double18 = simpsonIntegration0.f((double) (-1L));
        double double20 = simpsonIntegration0.f((-0.017959162462641984d));
        java.lang.Class<?> wildcardClass21 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 8.154845485377137d + "'", double18 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.072157215642454d + "'", double20 == 4.072157215642454d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(0, (double) ' ', (double) (-1));
        double double18 = simpsonIntegration0.f((double) (byte) 10);
        double double22 = simpsonIntegration0.simpsonsMethod((int) (short) -1, 0.9226783964008627d, (double) (byte) 1);
        double double26 = simpsonIntegration0.simpsonsMethod(0, (double) (byte) 1, (double) (-1));
        double double30 = simpsonIntegration0.simpsonsMethod((int) 'a', (-2.3854629903149513d), (double) (-1.0f));
        java.lang.Class<?> wildcardClass31 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 86.98501851068946d + "'", double16 == 86.98501851068946d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.004358393257198546d) + "'", double18 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 2.7182818284590455d + "'", double26 == 2.7182818284590455d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 4.3947944567089737E105d + "'", double30 == 4.3947944567089737E105d);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double12 = simpsonIntegration0.simpsonsMethod(1, 0.9226783964008627d, 4.058365782993775d);
        java.lang.Class<?> wildcardClass13 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.11021647807132358d) + "'", double12 == (-0.11021647807132358d));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) ' ', 0.0d, 0.0d);
        double double6 = simpsonIntegration0.f(0.0d);
        java.lang.Class<?> wildcardClass7 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (byte) 0, (double) 0L, (double) ' ');
        double double6 = simpsonIntegration0.f((-1.8007854031706057E-43d));
        java.lang.Class<?> wildcardClass7 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        double double16 = simpsonIntegration0.f(8.154845485377137d);
        double double18 = simpsonIntegration0.f(100.0d);
        java.lang.Class<?> wildcardClass19 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.017959162462641984d) + "'", double16 == (-0.017959162462641984d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-3.718587945630428E-40d) + "'", double18 == (-3.718587945630428E-40d));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double8 = simpsonIntegration0.f((double) (-1L));
        double double12 = simpsonIntegration0.simpsonsMethod(1, (-3.3283848740159176E-4d), 4.005654064435647d);
        java.lang.Class<?> wildcardClass13 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.154845485377137d + "'", double8 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.867986517190933E-5d + "'", double12 == 4.867986517190933E-5d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f((double) (-1L));
        double double14 = simpsonIntegration0.simpsonsMethod(1, 40.46343442189374d, 0.0d);
        double double16 = simpsonIntegration0.f(2.609103086070402E-5d);
        java.lang.Class<?> wildcardClass17 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.154845485377137d + "'", double10 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 53.95124589585826d + "'", double14 == 53.95124589585826d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 3.999895636557305d + "'", double16 == 3.999895636557305d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        java.lang.Class<?> wildcardClass9 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double14 = simpsonIntegration0.f(10.0d);
        double double16 = simpsonIntegration0.f((double) (short) 10);
        double double20 = simpsonIntegration0.simpsonsMethod((-1), (double) (short) 10, 2.609103086070402E-5d);
        double double22 = simpsonIntegration0.f(4.017452540903338d);
        double double26 = simpsonIntegration0.simpsonsMethod((int) (byte) -1, (-0.2100593206839558d), (-0.14527977523995153d));
        java.lang.Class<?> wildcardClass27 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.004358393257198546d) + "'", double14 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.21850356693465028d) + "'", double22 == (-0.21850356693465028d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-0.0d) + "'", double26 == (-0.0d));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(0, (double) ' ', (double) (-1));
        double double18 = simpsonIntegration0.f((double) (byte) 10);
        double double22 = simpsonIntegration0.simpsonsMethod((int) (short) -1, 0.9226783964008627d, (double) (byte) 1);
        double double26 = simpsonIntegration0.simpsonsMethod(0, (double) (byte) 1, (double) (-1));
        double double30 = simpsonIntegration0.simpsonsMethod((int) (byte) 1, 2.8306689949230137E-25d, 2.002615341358857d);
        double double32 = simpsonIntegration0.f(133.33333333333334d);
        java.lang.Class<?> wildcardClass33 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 86.98501851068946d + "'", double16 == 86.98501851068946d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.004358393257198546d) + "'", double18 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 2.7182818284590455d + "'", double26 == 2.7182818284590455d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-2.6665226325972244E-28d) + "'", double30 == (-2.6665226325972244E-28d));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-2.2072362778100317E-54d) + "'", double32 == (-2.2072362778100317E-54d));
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(10, (-0.0d), (double) (byte) 0);
        double double18 = simpsonIntegration0.f((double) 0L);
        double double22 = simpsonIntegration0.simpsonsMethod((int) (short) 100, (double) 100, (double) 10L);
        double double24 = simpsonIntegration0.f((double) (short) 10);
        double double26 = simpsonIntegration0.f(53.95124589585826d);
        double double30 = simpsonIntegration0.simpsonsMethod(0, (-1.2634141046617278E-34d), (double) (byte) 10);
        java.lang.Class<?> wildcardClass31 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.0d) + "'", double16 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.14527977523995153d) + "'", double22 == (-0.14527977523995153d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-0.004358393257198546d) + "'", double24 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0781454254561233E-20d) + "'", double26 == (-1.0781454254561233E-20d));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.835485171602404E-37d + "'", double30 == 1.835485171602404E-37d);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(100, (double) 1, 1.2395293152101427E-40d);
        double double12 = simpsonIntegration0.f(0.9226783964008627d);
        java.lang.Class<?> wildcardClass13 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.9972480396213286d + "'", double10 == 1.9972480396213286d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.2514464254193938d + "'", double12 == 1.2514464254193938d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(0.0d);
        java.lang.Class<?> wildcardClass11 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.0d + "'", double10 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double12 = simpsonIntegration0.simpsonsMethod(1, 0.9226783964008627d, 4.058365782993775d);
        double double16 = simpsonIntegration0.simpsonsMethod(100, 2.7182818284590455d, (double) 10.0f);
        double double18 = simpsonIntegration0.f(1.0d);
        java.lang.Class<?> wildcardClass19 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.11021647807132358d) + "'", double12 == (-0.11021647807132358d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.005762150198617093d) + "'", double16 == (-0.005762150198617093d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.103638323514327d + "'", double18 == 1.103638323514327d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 0.0d, (double) (byte) 1);
        double double16 = simpsonIntegration0.f((double) 1L);
        double double18 = simpsonIntegration0.f(8.154845485377137d);
        double double22 = simpsonIntegration0.simpsonsMethod(0, (double) '4', (double) '4');
        double double26 = simpsonIntegration0.simpsonsMethod(1, (-0.01453886097417405d), 1735120.3626874206d);
        java.lang.Class<?> wildcardClass27 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.103638323514327d + "'", double16 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.017959162462641984d) + "'", double18 == (-0.017959162462641984d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.2216106046044858E-18d) + "'", double22 == (-1.2216106046044858E-18d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-0.0d) + "'", double26 == (-0.0d));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) ' ', 0.0d, 0.0d);
        double double6 = simpsonIntegration0.f((double) (byte) 0);
        double double10 = simpsonIntegration0.simpsonsMethod((int) (short) 100, 1.2514464254193938d, 0.0d);
        java.lang.Class<?> wildcardClass11 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.0011516619038376d + "'", double10 == 2.0011516619038376d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double12 = simpsonIntegration0.simpsonsMethod(0, (double) 1L, (double) 100.0f);
        java.lang.Class<?> wildcardClass13 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.2395293152101427E-40d) + "'", double12 == (-1.2395293152101427E-40d));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (byte) 0, (double) 0L, (double) ' ');
        double double6 = simpsonIntegration0.f((-1.8007854031706057E-43d));
        double double10 = simpsonIntegration0.simpsonsMethod((int) (short) 10, 4.017452540903338d, (-1.2634141046617278E-34d));
        double double14 = simpsonIntegration0.simpsonsMethod((int) (short) 10, (double) 0, (double) 100L);
        double double16 = simpsonIntegration0.f(0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.129134273777278d + "'", double10 == 4.129134273777278d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.0d) + "'", double14 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.0d + "'", double16 == 4.0d);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double12 = simpsonIntegration0.f((double) 10);
        double double16 = simpsonIntegration0.simpsonsMethod((int) '#', (-1.0d), (double) 100.0f);
        java.lang.Class<?> wildcardClass17 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 2.1230017461922604E-25d + "'", double16 == 2.1230017461922604E-25d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 0.0d, (double) (byte) 1);
        double double16 = simpsonIntegration0.f((double) 1L);
        double double18 = simpsonIntegration0.f((double) '4');
        java.lang.Class<?> wildcardClass19 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.103638323514327d + "'", double16 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-7.047753488102803E-20d) + "'", double18 == (-7.047753488102803E-20d));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(10, (-0.0d), (double) (byte) 0);
        double double18 = simpsonIntegration0.f((double) 0L);
        double double20 = simpsonIntegration0.f((-0.0d));
        java.lang.Class<?> wildcardClass21 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.0d) + "'", double16 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.0d + "'", double20 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f((double) (-1L));
        double double14 = simpsonIntegration0.simpsonsMethod(1, 40.46343442189374d, 0.0d);
        java.lang.Class<?> wildcardClass15 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.154845485377137d + "'", double10 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 53.95124589585826d + "'", double14 == 53.95124589585826d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double8 = simpsonIntegration0.f((double) (-1L));
        double double10 = simpsonIntegration0.f((double) 10);
        java.lang.Class<?> wildcardClass11 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.154845485377137d + "'", double8 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.004358393257198546d) + "'", double10 == (-0.004358393257198546d));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        double double18 = simpsonIntegration0.simpsonsMethod((int) (short) 10, (double) (short) 100, (-1.2395293152101427E-40d));
        double double22 = simpsonIntegration0.simpsonsMethod((int) '#', (double) 0, (double) 1.0f);
        double double24 = simpsonIntegration0.f(86.98501851068946d);
        double double28 = simpsonIntegration0.simpsonsMethod(100, (-0.219372853236844d), 271.8281828459046d);
        double double32 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 9.931906770383255E-23d, 115.98002468091927d);
        java.lang.Class<?> wildcardClass33 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 133.33333333333334d + "'", double18 == 133.33333333333334d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.2634141046617278E-34d) + "'", double24 == (-1.2634141046617278E-34d));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.8737714602130133E-104d + "'", double28 == 1.8737714602130133E-104d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-1.9013579238539744E-69d) + "'", double32 == (-1.9013579238539744E-69d));
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 0.0d, (double) (byte) 1);
        double double16 = simpsonIntegration0.f((double) 1L);
        double double18 = simpsonIntegration0.f(8.154845485377137d);
        double double22 = simpsonIntegration0.simpsonsMethod((int) ' ', 46.66666666663074d, 1.103638323514327d);
        java.lang.Class<?> wildcardClass23 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.103638323514327d + "'", double16 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.017959162462641984d) + "'", double18 == (-0.017959162462641984d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 14.352775055113481d + "'", double22 == 14.352775055113481d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 0.0d, (double) (byte) 1);
        double double16 = simpsonIntegration0.f((double) (-1));
        double double18 = simpsonIntegration0.f(351.55527719495865d);
        java.lang.Class<?> wildcardClass19 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 8.154845485377137d + "'", double16 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-2.590933206896706E-148d) + "'", double18 == (-2.590933206896706E-148d));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        double double16 = simpsonIntegration0.f((double) 10L);
        double double18 = simpsonIntegration0.f((-1.2634141046617278E-34d));
        double double20 = simpsonIntegration0.f(8.902002817124393E-42d);
        java.lang.Class<?> wildcardClass21 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.0d + "'", double20 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        double double16 = simpsonIntegration0.f((double) 10L);
        double double18 = simpsonIntegration0.f((double) (-1L));
        double double20 = simpsonIntegration0.f(86.98501851068946d);
        double double22 = simpsonIntegration0.f(2.8306689949230137E-25d);
        double double24 = simpsonIntegration0.f((-1.7731645398316149E-6d));
        java.lang.Class<?> wildcardClass25 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 8.154845485377137d + "'", double18 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.2634141046617278E-34d) + "'", double20 == (-1.2634141046617278E-34d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.0d + "'", double22 == 4.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 4.000007092661304d + "'", double24 == 4.000007092661304d);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 0.0d, (double) (byte) 1);
        double double16 = simpsonIntegration0.f((double) 1L);
        double double18 = simpsonIntegration0.f(8.154845485377137d);
        double double20 = simpsonIntegration0.f(1.2395293152101427E-40d);
        double double22 = simpsonIntegration0.f((-1.2634141046617278E-34d));
        java.lang.Class<?> wildcardClass23 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.103638323514327d + "'", double16 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.017959162462641984d) + "'", double18 == (-0.017959162462641984d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.0d + "'", double20 == 4.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.0d + "'", double22 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 0.0d, (double) (byte) 1);
        double double16 = simpsonIntegration0.f((double) 1L);
        double double18 = simpsonIntegration0.f(4.0d);
        double double22 = simpsonIntegration0.simpsonsMethod((int) (short) -1, (-1.2634141046617278E-34d), 3.235822297226532d);
        java.lang.Class<?> wildcardClass23 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.103638323514327d + "'", double16 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.21978766666481014d) + "'", double18 == (-0.21978766666481014d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.0d) + "'", double22 == (-0.0d));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f((double) (-1L));
        double double14 = simpsonIntegration0.simpsonsMethod(1, 40.46343442189374d, 0.0d);
        double double18 = simpsonIntegration0.simpsonsMethod((int) (byte) 10, (double) '#', (double) 0.0f);
        double double22 = simpsonIntegration0.simpsonsMethod(10, (-3.718587945630428E-40d), (double) (short) 10);
        java.lang.Class<?> wildcardClass23 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.154845485377137d + "'", double10 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 53.95124589585826d + "'", double14 == 53.95124589585826d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 46.66666666663074d + "'", double18 == 46.66666666663074d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.6207068628535456E-41d + "'", double22 == 1.6207068628535456E-41d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double14 = simpsonIntegration0.f(10.0d);
        double double16 = simpsonIntegration0.f((double) (short) 10);
        double double18 = simpsonIntegration0.f((-1.0781454254561233E-20d));
        java.lang.Class<?> wildcardClass19 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.004358393257198546d) + "'", double14 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
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
        java.lang.Class<?> wildcardClass35 = simpsonIntegration0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 0.0d, (double) (byte) 1);
        double double16 = simpsonIntegration0.f((double) (-1));
        double double18 = simpsonIntegration0.f(351.55527719495865d);
        double double22 = simpsonIntegration0.simpsonsMethod(0, 2.7666384931515604d, (-0.21545281845024855d));
        java.lang.Class<?> wildcardClass23 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 8.154845485377137d + "'", double16 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-2.590933206896706E-148d) + "'", double18 == (-2.590933206896706E-148d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.522636368713808d + "'", double22 == 4.522636368713808d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double12 = simpsonIntegration0.f((double) 10);
        double double16 = simpsonIntegration0.simpsonsMethod((int) '#', (-1.0d), (double) 100.0f);
        double double18 = simpsonIntegration0.f((double) '#');
        double double20 = simpsonIntegration0.f((double) (byte) -1);
        double double24 = simpsonIntegration0.simpsonsMethod(10, 2.1169125427498074d, (double) 'a');
        java.lang.Class<?> wildcardClass25 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 2.1230017461922604E-25d + "'", double16 == 2.1230017461922604E-25d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-7.698547564139474E-13d) + "'", double18 == (-7.698547564139474E-13d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 8.154845485377137d + "'", double20 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-7.651460376422497E-39d) + "'", double24 == (-7.651460376422497E-39d));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double16 = simpsonIntegration0.simpsonsMethod(0, 0.0d, 0.9226783964008627d);
        double double18 = simpsonIntegration0.f((double) 10);
        double double22 = simpsonIntegration0.simpsonsMethod((int) (short) 1, 4.880565806253262d, (-0.21978736206516547d));
        java.lang.Class<?> wildcardClass23 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.004358393257198546d) + "'", double18 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 7.736386911307096d + "'", double22 == 7.736386911307096d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double16 = simpsonIntegration0.simpsonsMethod(0, 0.0d, 0.9226783964008627d);
        double double18 = simpsonIntegration0.f((double) 10);
        java.lang.Class<?> wildcardClass19 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.004358393257198546d) + "'", double18 == (-0.004358393257198546d));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        double double16 = simpsonIntegration0.f((double) 10L);
        double double18 = simpsonIntegration0.f((-1.2634141046617278E-34d));
        java.lang.Class<?> wildcardClass19 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(0, (double) ' ', (double) (-1));
        double double18 = simpsonIntegration0.f(1.2395293152101427E-40d);
        double double20 = simpsonIntegration0.f((-0.004358393257198546d));
        double double24 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (double) (byte) -1, 2.609103086070402E-5d);
        double double28 = simpsonIntegration0.simpsonsMethod((int) (short) 1, (double) 1L, (-7.047753488102803E-20d));
        java.lang.Class<?> wildcardClass29 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 86.98501851068946d + "'", double16 == 86.98501851068946d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.017452540903338d + "'", double20 == 4.017452540903338d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.3332985455191015d) + "'", double24 == (-1.3332985455191015d));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.7012127745047754d + "'", double28 == 1.7012127745047754d);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double16 = simpsonIntegration0.simpsonsMethod(0, 0.0d, 0.9226783964008627d);
        double double18 = simpsonIntegration0.f(86.98501851068946d);
        double double22 = simpsonIntegration0.simpsonsMethod((int) (byte) 10, (-1.2395293152101427E-40d), (double) 1.0f);
        double double24 = simpsonIntegration0.f(53.95124589585826d);
        double double26 = simpsonIntegration0.f((double) 100.0f);
        java.lang.Class<?> wildcardClass27 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.2634141046617278E-34d) + "'", double18 == (-1.2634141046617278E-34d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.3679920553853836E-39d) + "'", double22 == (-1.3679920553853836E-39d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0781454254561233E-20d) + "'", double24 == (-1.0781454254561233E-20d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-3.718587945630428E-40d) + "'", double26 == (-3.718587945630428E-40d));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double14 = simpsonIntegration0.simpsonsMethod((int) (short) 10, (double) (byte) 1, (-1.2634141046617278E-34d));
        double double16 = simpsonIntegration0.f(4.880565806253262d);
        double double18 = simpsonIntegration0.f(4.000004157639954d);
        double double20 = simpsonIntegration0.f(8.154845485377137d);
        double double24 = simpsonIntegration0.simpsonsMethod((int) 'a', 46.66666666663074d, (-0.7317724584449441d));
        double double26 = simpsonIntegration0.f((-1.2634141046617278E-34d));
        java.lang.Class<?> wildcardClass27 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2.002615341358857d + "'", double14 == 2.002615341358857d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.15048705932345452d) + "'", double16 == (-0.15048705932345452d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.21978736206516547d) + "'", double18 == (-0.21978736206516547d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.017959162462641984d) + "'", double20 == (-0.017959162462641984d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 112.02938954346982d + "'", double24 == 112.02938954346982d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 4.0d + "'", double26 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
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
        java.lang.Class<?> wildcardClass27 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.004358393257198546d) + "'", double14 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.21850356693465028d) + "'", double22 == (-0.21850356693465028d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double2 = simpsonIntegration0.f((double) 0);
        double double6 = simpsonIntegration0.simpsonsMethod(0, (double) (byte) -1, (double) 100.0f);
        double double8 = simpsonIntegration0.f(8.154845485377137d);
        double double10 = simpsonIntegration0.f(2.413675113314953d);
        java.lang.Class<?> wildcardClass11 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.2395293152101427E-40d + "'", double6 == 1.2395293152101427E-40d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.017959162462641984d) + "'", double8 == (-0.017959162462641984d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.16338567387879238d) + "'", double10 == (-0.16338567387879238d));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        double double16 = simpsonIntegration0.f((double) 10L);
        double double18 = simpsonIntegration0.f((double) (-1L));
        double double20 = simpsonIntegration0.f(86.98501851068946d);
        double double24 = simpsonIntegration0.simpsonsMethod(10, 0.0d, (double) 100);
        double double28 = simpsonIntegration0.simpsonsMethod((-1), 4.000000000003079d, 0.20178029722268845d);
        java.lang.Class<?> wildcardClass29 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 8.154845485377137d + "'", double18 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.2634141046617278E-34d) + "'", double20 == (-1.2634141046617278E-34d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-0.0d) + "'", double24 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 0.0d, (double) (byte) 1);
        double double16 = simpsonIntegration0.f((double) 1L);
        double double20 = simpsonIntegration0.simpsonsMethod((int) (short) 1, 0.9226783964008627d, 4.058365782993775d);
        java.lang.Class<?> wildcardClass21 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.103638323514327d + "'", double16 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.11021647807132358d) + "'", double20 == (-0.11021647807132358d));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) ' ', 0.0d, 0.0d);
        double double6 = simpsonIntegration0.f(0.0d);
        double double8 = simpsonIntegration0.f(4.000007092661304d);
        double double12 = simpsonIntegration0.simpsonsMethod((int) (short) -1, (-0.0d), (-0.716016414389119d));
        java.lang.Class<?> wildcardClass13 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.21978714703739602d) + "'", double8 == (-0.21978714703739602d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.0d) + "'", double12 == (-0.0d));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double16 = simpsonIntegration0.simpsonsMethod(0, 0.0d, 0.9226783964008627d);
        double double18 = simpsonIntegration0.f((double) 10);
        double double22 = simpsonIntegration0.simpsonsMethod((int) (byte) 1, (double) (short) 1, 0.0d);
        java.lang.Class<?> wildcardClass23 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.004358393257198546d) + "'", double18 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.7012127745047754d + "'", double22 == 1.7012127745047754d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 0.0d, (double) (byte) 1);
        double double16 = simpsonIntegration0.f((double) 1L);
        double double18 = simpsonIntegration0.f(4.0d);
        double double20 = simpsonIntegration0.f((double) '4');
        double double24 = simpsonIntegration0.simpsonsMethod((int) (short) 1, (double) 0, (-0.0012649947976536042d));
        java.lang.Class<?> wildcardClass25 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.103638323514327d + "'", double16 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.21978766666481014d) + "'", double18 == (-0.21978766666481014d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-7.047753488102803E-20d) + "'", double20 == (-7.047753488102803E-20d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double14 = simpsonIntegration0.f(10.0d);
        double double16 = simpsonIntegration0.f((double) (short) 10);
        double double18 = simpsonIntegration0.f((-0.2100593206839558d));
        double double20 = simpsonIntegration0.f(2.6478847316533405E47d);
        java.lang.Class<?> wildcardClass21 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.004358393257198546d) + "'", double14 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.880565806253262d + "'", double18 == 4.880565806253262d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.0d) + "'", double20 == (-0.0d));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        double double18 = simpsonIntegration0.simpsonsMethod((int) (short) 10, (double) (short) 100, (-1.2395293152101427E-40d));
        double double22 = simpsonIntegration0.simpsonsMethod(100, 4.017452540903338d, 0.0d);
        double double26 = simpsonIntegration0.simpsonsMethod((int) ' ', (-8.792109355360879E-19d), (-0.716016414389119d));
        java.lang.Class<?> wildcardClass27 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 133.33333333333334d + "'", double18 == 133.33333333333334d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.12913427377727d + "'", double22 == 4.12913427377727d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-2.0076911253185856E-16d) + "'", double26 == (-2.0076911253185856E-16d));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double2 = simpsonIntegration0.f((double) 0);
        double double6 = simpsonIntegration0.simpsonsMethod(0, (double) (byte) -1, (double) 100.0f);
        double double8 = simpsonIntegration0.f(100.0d);
        double double10 = simpsonIntegration0.f(2.413675113314953d);
        java.lang.Class<?> wildcardClass11 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.2395293152101427E-40d + "'", double6 == 1.2395293152101427E-40d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.718587945630428E-40d) + "'", double8 == (-3.718587945630428E-40d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.16338567387879238d) + "'", double10 == (-0.16338567387879238d));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (byte) -1, (-1.8007854031706057E-43d), (double) (byte) 0);
        double double8 = simpsonIntegration0.simpsonsMethod(0, (double) 0.0f, 0.0d);
        double double12 = simpsonIntegration0.simpsonsMethod((int) 'a', (double) (short) 1, 13.318805355809339d);
        java.lang.Class<?> wildcardClass13 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-3.3283848740159176E-4d) + "'", double12 == (-3.3283848740159176E-4d));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 0.0d, (double) (byte) 1);
        double double16 = simpsonIntegration0.f((double) 1L);
        double double20 = simpsonIntegration0.simpsonsMethod((int) (byte) 1, (double) (byte) 0, (double) 100L);
        java.lang.Class<?> wildcardClass21 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.103638323514327d + "'", double16 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.0d) + "'", double20 == (-0.0d));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        double double18 = simpsonIntegration0.simpsonsMethod((int) (short) 10, (double) (short) 100, (-1.2395293152101427E-40d));
        double double22 = simpsonIntegration0.simpsonsMethod((int) '#', (double) 0, (double) 1.0f);
        java.lang.Class<?> wildcardClass23 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 133.33333333333334d + "'", double18 == 133.33333333333334d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double2 = simpsonIntegration0.f((double) 0);
        double double6 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 1.2395293152101427E-40d, (double) (byte) 10);
        double double8 = simpsonIntegration0.f(0.0d);
        double double10 = simpsonIntegration0.f(2.002615341358857d);
        double double12 = simpsonIntegration0.f(2.002615341358857d);
        double double14 = simpsonIntegration0.f(4.017452540903338d);
        double double18 = simpsonIntegration0.simpsonsMethod((int) (byte) 100, 4.072157215642454d, 1735120.3626874206d);
        java.lang.Class<?> wildcardClass19 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.8007854031706057E-43d) + "'", double6 == (-1.8007854031706057E-43d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.0d + "'", double8 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.0014130171899539316d) + "'", double10 == (-0.0014130171899539316d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.0014130171899539316d) + "'", double12 == (-0.0014130171899539316d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.21850356693465028d) + "'", double14 == (-0.21850356693465028d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double14 = simpsonIntegration0.f((double) (byte) 10);
        double double16 = simpsonIntegration0.f((-1.2216106046044858E-18d));
        double double20 = simpsonIntegration0.simpsonsMethod((int) '4', 13.318805355809339d, 3.652737548989758d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.004358393257198546d) + "'", double14 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.0d + "'", double16 == 4.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.075300265827411d) + "'", double20 == (-1.075300265827411d));
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod((int) 'a', (double) 100.0f, (double) 10.0f);
        double double18 = simpsonIntegration0.simpsonsMethod((int) (byte) 1, (double) 100L, 2.609103086070402E-5d);
        java.lang.Class<?> wildcardClass19 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.14527977523995153d) + "'", double14 == (-0.14527977523995153d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 133.3298545519102d + "'", double18 == 133.3298545519102d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double14 = simpsonIntegration0.f(10.0d);
        java.lang.Class<?> wildcardClass15 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.004358393257198546d) + "'", double14 == (-0.004358393257198546d));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double14 = simpsonIntegration0.simpsonsMethod((int) (short) 10, (double) (byte) 1, (-1.2634141046617278E-34d));
        double double16 = simpsonIntegration0.f(4.880565806253262d);
        double double18 = simpsonIntegration0.f(4.000004157639954d);
        double double20 = simpsonIntegration0.f(8.154845485377137d);
        double double24 = simpsonIntegration0.simpsonsMethod((int) 'a', 46.66666666663074d, (-0.7317724584449441d));
        java.lang.Class<?> wildcardClass25 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2.002615341358857d + "'", double14 == 2.002615341358857d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.15048705932345452d) + "'", double16 == (-0.15048705932345452d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.21978736206516547d) + "'", double18 == (-0.21978736206516547d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.017959162462641984d) + "'", double20 == (-0.017959162462641984d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 112.02938954346982d + "'", double24 == 112.02938954346982d);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(0, (double) ' ', (double) (-1));
        double double18 = simpsonIntegration0.f((double) (byte) 10);
        double double22 = simpsonIntegration0.simpsonsMethod((int) (short) -1, 0.9226783964008627d, (double) (byte) 1);
        double double26 = simpsonIntegration0.simpsonsMethod(0, (double) (byte) 1, (double) (-1));
        double double30 = simpsonIntegration0.simpsonsMethod((int) (byte) 1, 2.8306689949230137E-25d, 2.002615341358857d);
        double double34 = simpsonIntegration0.simpsonsMethod((-1), 3.999895636557305d, 4.129134273777278d);
        java.lang.Class<?> wildcardClass35 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 86.98501851068946d + "'", double16 == 86.98501851068946d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.004358393257198546d) + "'", double18 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 2.7182818284590455d + "'", double26 == 2.7182818284590455d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-2.6665226325972244E-28d) + "'", double30 == (-2.6665226325972244E-28d));
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        double double18 = simpsonIntegration0.simpsonsMethod((int) (short) 100, 4.000004157639954d, (-0.2100593206839558d));
        java.lang.Class<?> wildcardClass19 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 5.190318108611563d + "'", double18 == 5.190318108611563d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double12 = simpsonIntegration0.simpsonsMethod(0, (double) 1L, (double) 100.0f);
        double double14 = simpsonIntegration0.f((-0.0014130171899539316d));
        java.lang.Class<?> wildcardClass15 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.2395293152101427E-40d) + "'", double12 == (-1.2395293152101427E-40d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.005654064435647d + "'", double14 == 4.005654064435647d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double2 = simpsonIntegration0.f((double) 0);
        double double6 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 1.2395293152101427E-40d, (double) (byte) 10);
        double double10 = simpsonIntegration0.simpsonsMethod((int) (short) -1, (-7.027389983271083E-39d), 0.0d);
        java.lang.Class<?> wildcardClass11 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.8007854031706057E-43d) + "'", double6 == (-1.8007854031706057E-43d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.0d) + "'", double10 == (-0.0d));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        double double18 = simpsonIntegration0.simpsonsMethod((int) (short) 10, (double) (short) 100, (-1.2395293152101427E-40d));
        double double22 = simpsonIntegration0.simpsonsMethod((int) '#', (double) 0, (double) 1.0f);
        double double26 = simpsonIntegration0.simpsonsMethod(10, (double) 'a', (double) (-1.0f));
        double double28 = simpsonIntegration0.f(0.0d);
        java.lang.Class<?> wildcardClass29 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 133.33333333333334d + "'", double18 == 133.33333333333334d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 263.67333736052746d + "'", double26 == 263.67333736052746d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 4.0d + "'", double28 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double16 = simpsonIntegration0.simpsonsMethod(0, 0.0d, 0.9226783964008627d);
        double double18 = simpsonIntegration0.f(86.98501851068946d);
        double double22 = simpsonIntegration0.simpsonsMethod((int) (byte) 10, (-1.2395293152101427E-40d), (double) 1.0f);
        java.lang.Class<?> wildcardClass23 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.2634141046617278E-34d) + "'", double18 == (-1.2634141046617278E-34d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.3679920553853836E-39d) + "'", double22 == (-1.3679920553853836E-39d));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 0.0d, (double) (byte) 1);
        double double16 = simpsonIntegration0.f((double) 1L);
        double double18 = simpsonIntegration0.f(8.154845485377137d);
        double double20 = simpsonIntegration0.f(1.2395293152101427E-40d);
        double double24 = simpsonIntegration0.simpsonsMethod((-1), 0.3394344128489119d, (double) 1L);
        java.lang.Class<?> wildcardClass25 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.103638323514327d + "'", double16 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.017959162462641984d) + "'", double18 == (-0.017959162462641984d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.0d + "'", double20 == 4.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        double double16 = simpsonIntegration0.f((double) 10L);
        java.lang.Class<?> wildcardClass17 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double8 = simpsonIntegration0.f((double) (-1L));
        double double10 = simpsonIntegration0.f((double) 10);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 1.2514464254193938d, 0.0d);
        double double18 = simpsonIntegration0.simpsonsMethod(10, (-0.01453886097417405d), 9.931906770383255E-23d);
        java.lang.Class<?> wildcardClass19 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.154845485377137d + "'", double8 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.004358393257198546d) + "'", double10 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2.0018152742371256d + "'", double14 == 2.0018152742371256d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.6248127531564629d) + "'", double18 == (-0.6248127531564629d));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        double double16 = simpsonIntegration0.f(8.154845485377137d);
        double double20 = simpsonIntegration0.simpsonsMethod((int) (short) 100, (-7.047753488102803E-20d), 468.7403695932782d);
        java.lang.Class<?> wildcardClass21 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.017959162462641984d) + "'", double16 == (-0.017959162462641984d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.154813702961169E-216d + "'", double20 == 4.154813702961169E-216d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        double double16 = simpsonIntegration0.f((double) 10L);
        double double18 = simpsonIntegration0.f((double) (-1L));
        double double20 = simpsonIntegration0.f(86.98501851068946d);
        java.lang.Class<?> wildcardClass21 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 8.154845485377137d + "'", double18 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.2634141046617278E-34d) + "'", double20 == (-1.2634141046617278E-34d));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double16 = simpsonIntegration0.simpsonsMethod(0, 0.0d, 0.9226783964008627d);
        double double18 = simpsonIntegration0.f((double) (short) 0);
        double double20 = simpsonIntegration0.f((double) 0L);
        double double22 = simpsonIntegration0.f(4.021497963060547d);
        java.lang.Class<?> wildcardClass23 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.0d + "'", double20 == 4.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.21820438682936422d) + "'", double22 == (-0.21820438682936422d));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) 'a', 10.0d, 2.002615341358857d);
        double double6 = simpsonIntegration0.f(4.058365782993775d);
        java.lang.Class<?> wildcardClass7 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.016155316979210545d) + "'", double4 == (-0.016155316979210545d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.21545281845024855d) + "'", double6 == (-0.21545281845024855d));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 0.0d, (double) (byte) 1);
        double double16 = simpsonIntegration0.f((double) 1L);
        double double18 = simpsonIntegration0.f(4.0d);
        double double22 = simpsonIntegration0.simpsonsMethod((int) (short) 100, (-1.3679920553853836E-39d), 1.2514464254193938d);
        java.lang.Class<?> wildcardClass23 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.103638323514327d + "'", double16 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.21978766666481014d) + "'", double18 == (-0.21978766666481014d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-9.525478241589842E-38d) + "'", double22 == (-9.525478241589842E-38d));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
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
        double double28 = simpsonIntegration0.f(4.880565806253262d);
        java.lang.Class<?> wildcardClass29 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.004358393257198546d) + "'", double18 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.005367301737528441d) + "'", double22 == (-0.005367301737528441d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 115.98002468091927d + "'", double26 == 115.98002468091927d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-0.15048705932345452d) + "'", double28 == (-0.15048705932345452d));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) 'a', 10.0d, 2.002615341358857d);
        double double6 = simpsonIntegration0.f((-124010.55567924457d));
        java.lang.Class<?> wildcardClass7 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.016155316979210545d) + "'", double4 == (-0.016155316979210545d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.NEGATIVE_INFINITY + "'", double6 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double14 = simpsonIntegration0.simpsonsMethod((int) (short) 10, (double) (byte) 1, (-1.2634141046617278E-34d));
        double double16 = simpsonIntegration0.f(4.880565806253262d);
        double double18 = simpsonIntegration0.f(4.000004157639954d);
        double double20 = simpsonIntegration0.f(8.154845485377137d);
        double double24 = simpsonIntegration0.simpsonsMethod((int) 'a', 46.66666666663074d, (-0.7317724584449441d));
        double double28 = simpsonIntegration0.simpsonsMethod((int) '#', (-124010.55567924457d), 1.103638323514327d);
        java.lang.Class<?> wildcardClass29 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2.002615341358857d + "'", double14 == 2.002615341358857d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.15048705932345452d) + "'", double16 == (-0.15048705932345452d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.21978736206516547d) + "'", double18 == (-0.21978736206516547d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.017959162462641984d) + "'", double20 == (-0.017959162462641984d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 112.02938954346982d + "'", double24 == 112.02938954346982d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + Double.POSITIVE_INFINITY + "'", double28 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
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
        double double30 = simpsonIntegration0.simpsonsMethod(10, (-7.027389983271083E-39d), (-0.21978766666481014d));
        java.lang.Class<?> wildcardClass31 = simpsonIntegration0.getClass();
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
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-3.459631683047994E-37d) + "'", double30 == (-3.459631683047994E-37d));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double14 = simpsonIntegration0.f(10.0d);
        double double16 = simpsonIntegration0.f((double) (short) 10);
        double double20 = simpsonIntegration0.simpsonsMethod((-1), (double) (short) 10, 2.609103086070402E-5d);
        double double22 = simpsonIntegration0.f(4.017452540903338d);
        java.lang.Class<?> wildcardClass23 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.004358393257198546d) + "'", double14 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.21850356693465028d) + "'", double22 == (-0.21850356693465028d));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double16 = simpsonIntegration0.simpsonsMethod(0, 0.0d, 0.9226783964008627d);
        double double18 = simpsonIntegration0.f(86.98501851068946d);
        double double22 = simpsonIntegration0.simpsonsMethod((int) (byte) 10, (-1.2395293152101427E-40d), (double) 1.0f);
        double double26 = simpsonIntegration0.simpsonsMethod((int) (byte) 10, (-1.0781454254561233E-20d), (double) (-1));
        double double30 = simpsonIntegration0.simpsonsMethod((-1), 1.103638323514327d, 0.20178029722268845d);
        java.lang.Class<?> wildcardClass31 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.2634141046617278E-34d) + "'", double18 == (-1.2634141046617278E-34d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.3679920553853836E-39d) + "'", double22 == (-1.3679920553853836E-39d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-8.792109355360879E-19d) + "'", double26 == (-8.792109355360879E-19d));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double12 = simpsonIntegration0.f((double) 10);
        double double16 = simpsonIntegration0.simpsonsMethod((int) '#', (-1.0d), (double) 100.0f);
        double double18 = simpsonIntegration0.f((double) '#');
        double double20 = simpsonIntegration0.f((double) (byte) -1);
        double double22 = simpsonIntegration0.f(0.0d);
        java.lang.Class<?> wildcardClass23 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 2.1230017461922604E-25d + "'", double16 == 2.1230017461922604E-25d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-7.698547564139474E-13d) + "'", double18 == (-7.698547564139474E-13d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 8.154845485377137d + "'", double20 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.0d + "'", double22 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        double double18 = simpsonIntegration0.simpsonsMethod((int) (short) 10, (double) (short) 100, (-1.2395293152101427E-40d));
        double double22 = simpsonIntegration0.simpsonsMethod((int) '#', (double) 0, (double) 1.0f);
        double double24 = simpsonIntegration0.f(86.98501851068946d);
        double double28 = simpsonIntegration0.simpsonsMethod((int) (byte) 0, 0.865609122350895d, (-2.3854629903149513d));
        java.lang.Class<?> wildcardClass29 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 133.33333333333334d + "'", double18 == 133.33333333333334d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.2634141046617278E-34d) + "'", double24 == (-1.2634141046617278E-34d));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-5.298978042385537d) + "'", double28 == (-5.298978042385537d));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double14 = simpsonIntegration0.f(53.95124589585826d);
        double double18 = simpsonIntegration0.simpsonsMethod(1, 0.6963109328077465d, 1.103638323514327d);
        double double22 = simpsonIntegration0.simpsonsMethod((int) 'a', (-1.3332985455191015d), (-3.718587945630428E-40d));
        double double26 = simpsonIntegration0.simpsonsMethod((int) (short) 1, 2.1169125427498074d, (-0.21978736206516547d));
        java.lang.Class<?> wildcardClass27 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0781454254561233E-20d) + "'", double14 == (-1.0781454254561233E-20d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.2433240273856971d + "'", double18 == 0.2433240273856971d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 2.0088200117797813E60d + "'", double22 == 2.0088200117797813E60d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 3.516335322931642d + "'", double26 == 3.516335322931642d);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        double double18 = simpsonIntegration0.simpsonsMethod((int) (short) 10, (double) (short) 100, (-1.2395293152101427E-40d));
        double double22 = simpsonIntegration0.simpsonsMethod(100, 4.017452540903338d, 0.0d);
        double double26 = simpsonIntegration0.simpsonsMethod((int) ' ', (-8.792109355360879E-19d), (-0.716016414389119d));
        double double28 = simpsonIntegration0.f((-1.0781454254561233E-20d));
        java.lang.Class<?> wildcardClass29 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 133.33333333333334d + "'", double18 == 133.33333333333334d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.12913427377727d + "'", double22 == 4.12913427377727d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-2.0076911253185856E-16d) + "'", double26 == (-2.0076911253185856E-16d));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 4.0d + "'", double28 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(0, (double) ' ', (double) (-1));
        double double18 = simpsonIntegration0.f(1.2395293152101427E-40d);
        double double20 = simpsonIntegration0.f((-0.004358393257198546d));
        double double24 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (double) (byte) -1, 2.609103086070402E-5d);
        double double28 = simpsonIntegration0.simpsonsMethod((int) (short) 1, (double) 1L, (-7.047753488102803E-20d));
        double double30 = simpsonIntegration0.f(4.522636368713808d);
        java.lang.Class<?> wildcardClass31 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 86.98501851068946d + "'", double16 == 86.98501851068946d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.017452540903338d + "'", double20 == 4.017452540903338d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.3332985455191015d) + "'", double24 == (-1.3332985455191015d));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.7012127745047754d + "'", double28 == 1.7012127745047754d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-0.17869886812937555d) + "'", double30 == (-0.17869886812937555d));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(10, (-0.0d), (double) (byte) 0);
        double double18 = simpsonIntegration0.f((double) 0L);
        double double22 = simpsonIntegration0.simpsonsMethod((int) (short) 100, (double) 100, (double) 10L);
        double double24 = simpsonIntegration0.f(37867.06926325643d);
        java.lang.Class<?> wildcardClass25 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.0d) + "'", double16 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.14527977523995153d) + "'", double22 == (-0.14527977523995153d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-0.0d) + "'", double24 == (-0.0d));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double12 = simpsonIntegration0.f((double) 10);
        double double16 = simpsonIntegration0.simpsonsMethod(0, (-1.2395293152101427E-40d), 4.058365782993775d);
        double double18 = simpsonIntegration0.f((-3.806556146559686E-40d));
        java.lang.Class<?> wildcardClass19 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 8.902002817124393E-42d + "'", double16 == 8.902002817124393E-42d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        double double16 = simpsonIntegration0.f((double) 10L);
        double double18 = simpsonIntegration0.f((double) (-1L));
        double double20 = simpsonIntegration0.f((-0.017959162462641984d));
        double double22 = simpsonIntegration0.f((double) 100L);
        java.lang.Class<?> wildcardClass23 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 8.154845485377137d + "'", double18 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.072157215642454d + "'", double20 == 4.072157215642454d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-3.718587945630428E-40d) + "'", double22 == (-3.718587945630428E-40d));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double14 = simpsonIntegration0.f(10.0d);
        double double16 = simpsonIntegration0.f((double) (short) 10);
        double double20 = simpsonIntegration0.simpsonsMethod((int) (byte) 10, (double) 1, 0.865609122350895d);
        double double24 = simpsonIntegration0.simpsonsMethod(0, (double) (short) 100, (double) (-1));
        double double28 = simpsonIntegration0.simpsonsMethod((int) (byte) 10, (-0.11021647807132358d), 2.7666384931515604d);
        double double30 = simpsonIntegration0.f((-2.2148125385032659E-54d));
        java.lang.Class<?> wildcardClass31 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.004358393257198546d) + "'", double14 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.19222885149765373d) + "'", double20 == (-0.19222885149765373d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 271.8281828459046d + "'", double24 == 271.8281828459046d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0725840423804812d + "'", double28 == 0.0725840423804812d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 4.0d + "'", double30 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double2 = simpsonIntegration0.f((double) 0);
        double double6 = simpsonIntegration0.simpsonsMethod((int) '4', (-7.047753488102803E-20d), (-0.0012649947976536042d));
        double double10 = simpsonIntegration0.simpsonsMethod((int) 'a', (-1.9013579238539744E-69d), 177.83695398750095d);
        java.lang.Class<?> wildcardClass11 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.4677877090000082E-17d) + "'", double6 == (-1.4677877090000082E-17d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.3940787665690245E-140d + "'", double10 == 3.3940787665690245E-140d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        double double16 = simpsonIntegration0.f((double) 10L);
        double double18 = simpsonIntegration0.f((double) (-1L));
        double double20 = simpsonIntegration0.f(86.98501851068946d);
        double double22 = simpsonIntegration0.f(0.9226783964008627d);
        double double26 = simpsonIntegration0.simpsonsMethod((int) (short) 10, 0.0d, (double) 0.0f);
        double double28 = simpsonIntegration0.f(Double.NEGATIVE_INFINITY);
        double double32 = simpsonIntegration0.simpsonsMethod((int) (byte) 1, (-2.2072362778100317E-54d), (-7.651460376422497E-39d));
        java.lang.Class<?> wildcardClass33 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 8.154845485377137d + "'", double18 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.2634141046617278E-34d) + "'", double20 == (-1.2634141046617278E-34d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.2514464254193938d + "'", double22 == 1.2514464254193938d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + Double.NEGATIVE_INFINITY + "'", double28 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-5.885963407493417E-54d) + "'", double32 == (-5.885963407493417E-54d));
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (byte) -1, (-1.8007854031706057E-43d), (double) (byte) 0);
        double double8 = simpsonIntegration0.simpsonsMethod(0, (double) 0.0f, 0.0d);
        double double12 = simpsonIntegration0.simpsonsMethod((int) (short) 10, 2.566645225308353d, 4.0013314647187705d);
        java.lang.Class<?> wildcardClass13 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.39478808990516345d) + "'", double12 == (-0.39478808990516345d));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double14 = simpsonIntegration0.f(10.0d);
        double double16 = simpsonIntegration0.f((double) (short) 10);
        double double20 = simpsonIntegration0.simpsonsMethod((-1), (double) (short) 10, 2.609103086070402E-5d);
        java.lang.Class<?> wildcardClass21 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.004358393257198546d) + "'", double14 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(0, (double) ' ', (double) (-1));
        double double18 = simpsonIntegration0.f((double) (byte) 10);
        double double20 = simpsonIntegration0.f((double) (byte) 10);
        double double24 = simpsonIntegration0.simpsonsMethod((int) (short) 1, (double) 100.0f, (-0.004358393257198546d));
        double double28 = simpsonIntegration0.simpsonsMethod((-1), (double) ' ', 1.2514464254193938d);
        java.lang.Class<?> wildcardClass29 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 86.98501851068946d + "'", double16 == 86.98501851068946d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.004358393257198546d) + "'", double18 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.004358393257198546d) + "'", double20 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 133.91508469677794d + "'", double24 == 133.91508469677794d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 0.0d, (double) (byte) 1);
        double double16 = simpsonIntegration0.f((double) 1L);
        double double20 = simpsonIntegration0.simpsonsMethod((int) (short) 1, 0.9226783964008627d, 4.058365782993775d);
        double double22 = simpsonIntegration0.f((-0.716016414389119d));
        java.lang.Class<?> wildcardClass23 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.103638323514327d + "'", double16 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.11021647807132358d) + "'", double20 == (-0.11021647807132358d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 7.13598354278324d + "'", double22 == 7.13598354278324d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double14 = simpsonIntegration0.f(10.0d);
        double double16 = simpsonIntegration0.f((double) (short) 10);
        double double20 = simpsonIntegration0.simpsonsMethod((int) (short) 1, 13.318805355809339d, 13.318805355809339d);
        java.lang.Class<?> wildcardClass21 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.004358393257198546d) + "'", double14 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.0012649947976536042d) + "'", double20 == (-0.0012649947976536042d));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 0.0d, (double) (byte) 1);
        double double16 = simpsonIntegration0.f((double) 1L);
        double double18 = simpsonIntegration0.f(8.154845485377137d);
        double double20 = simpsonIntegration0.f(1.2395293152101427E-40d);
        double double24 = simpsonIntegration0.simpsonsMethod(1, (-0.219372853236844d), (-25.7567339920559d));
        java.lang.Class<?> wildcardClass25 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.103638323514327d + "'", double16 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.017959162462641984d) + "'", double18 == (-0.017959162462641984d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.0d + "'", double20 == 4.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.677349340227826E13d + "'", double24 == 1.677349340227826E13d);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double12 = simpsonIntegration0.f((double) (byte) 10);
        java.lang.Class<?> wildcardClass13 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double14 = simpsonIntegration0.simpsonsMethod((int) (short) 10, (double) (byte) 1, (-1.2634141046617278E-34d));
        double double16 = simpsonIntegration0.f(4.880565806253262d);
        double double20 = simpsonIntegration0.simpsonsMethod(0, 8.154845485377137d, 2.0011516619038376d);
        java.lang.Class<?> wildcardClass21 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2.002615341358857d + "'", double14 == 2.002615341358857d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.15048705932345452d) + "'", double16 == (-0.15048705932345452d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.001693227728973961d) + "'", double20 == (-0.001693227728973961d));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(0, (double) ' ', (double) (-1));
        double double18 = simpsonIntegration0.f(1.2395293152101427E-40d);
        double double20 = simpsonIntegration0.f((double) ' ');
        double double22 = simpsonIntegration0.f((-3.3283848740159176E-4d));
        java.lang.Class<?> wildcardClass23 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 86.98501851068946d + "'", double16 == 86.98501851068946d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.291744886007606E-11d) + "'", double20 == (-1.291744886007606E-11d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.0013314647187705d + "'", double22 == 4.0013314647187705d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(0, (double) ' ', (double) (-1));
        double double18 = simpsonIntegration0.f((double) (byte) 10);
        double double22 = simpsonIntegration0.simpsonsMethod((int) (short) -1, 0.9226783964008627d, (double) (byte) 1);
        double double26 = simpsonIntegration0.simpsonsMethod((int) (byte) -1, 4.0d, 1.0d);
        double double30 = simpsonIntegration0.simpsonsMethod((int) (byte) 10, (double) (-1L), 0.0d);
        double double32 = simpsonIntegration0.f(2.485648803550844E-41d);
        java.lang.Class<?> wildcardClass33 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 86.98501851068946d + "'", double16 == 86.98501851068946d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.004358393257198546d) + "'", double18 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1735120.3626874206d + "'", double30 == 1735120.3626874206d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 4.0d + "'", double32 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f((-1.3679920553853836E-39d));
        java.lang.Class<?> wildcardClass11 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.0d + "'", double10 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f((double) (-1L));
        double double14 = simpsonIntegration0.simpsonsMethod(1, 40.46343442189374d, 0.0d);
        double double18 = simpsonIntegration0.simpsonsMethod((int) (byte) 10, (double) '#', (double) 0.0f);
        double double22 = simpsonIntegration0.simpsonsMethod(1, 351.55527719495865d, (-1.8007854031706057E-43d));
        java.lang.Class<?> wildcardClass23 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.154845485377137d + "'", double10 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 53.95124589585826d + "'", double14 == 53.95124589585826d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 46.66666666663074d + "'", double18 == 46.66666666663074d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 468.7403695932782d + "'", double22 == 468.7403695932782d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(0, (double) ' ', (double) (-1));
        double double18 = simpsonIntegration0.f((double) (byte) 10);
        double double20 = simpsonIntegration0.f((double) (byte) 10);
        double double24 = simpsonIntegration0.simpsonsMethod((int) (short) 1, (double) 100.0f, (-0.004358393257198546d));
        double double28 = simpsonIntegration0.simpsonsMethod((int) (byte) 100, (-5.885963407493417E-54d), (-0.21978736206516547d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 86.98501851068946d + "'", double16 == 86.98501851068946d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.004358393257198546d) + "'", double18 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.004358393257198546d) + "'", double20 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 133.91508469677794d + "'", double24 == 133.91508469677794d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-2.8976988648164163E-51d) + "'", double28 == (-2.8976988648164163E-51d));
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        double double18 = simpsonIntegration0.simpsonsMethod((int) (short) 10, (double) (short) 100, (-1.2395293152101427E-40d));
        double double22 = simpsonIntegration0.simpsonsMethod((int) '#', (double) 0, (double) 1.0f);
        double double26 = simpsonIntegration0.simpsonsMethod(10, (double) 'a', (double) (-1.0f));
        double double28 = simpsonIntegration0.f(0.0d);
        double double32 = simpsonIntegration0.simpsonsMethod((int) (short) -1, 14.352775055113481d, (double) (-1));
        java.lang.Class<?> wildcardClass33 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 133.33333333333334d + "'", double18 == 133.33333333333334d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 263.67333736052746d + "'", double26 == 263.67333736052746d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 4.0d + "'", double28 == 4.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double14 = simpsonIntegration0.f(10.0d);
        double double16 = simpsonIntegration0.f((double) (short) 10);
        double double20 = simpsonIntegration0.simpsonsMethod((int) (byte) 10, (double) 1, 0.865609122350895d);
        double double24 = simpsonIntegration0.simpsonsMethod(0, (double) (short) 100, (double) (-1));
        double double26 = simpsonIntegration0.f(4.005654064435647d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.004358393257198546d) + "'", double14 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.19222885149765373d) + "'", double20 == (-0.19222885149765373d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 271.8281828459046d + "'", double24 == 271.8281828459046d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-0.219372853236844d) + "'", double26 == (-0.219372853236844d));
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(0, (double) ' ', (double) (-1));
        double double18 = simpsonIntegration0.f((double) (byte) 10);
        double double22 = simpsonIntegration0.simpsonsMethod((int) (short) -1, 0.9226783964008627d, (double) (byte) 1);
        double double26 = simpsonIntegration0.simpsonsMethod((int) (byte) -1, 4.0d, 1.0d);
        double double28 = simpsonIntegration0.f(4.005654064435647d);
        double double30 = simpsonIntegration0.f((-7.651460376422497E-39d));
        java.lang.Class<?> wildcardClass31 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 86.98501851068946d + "'", double16 == 86.98501851068946d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.004358393257198546d) + "'", double18 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-0.219372853236844d) + "'", double28 == (-0.219372853236844d));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 4.0d + "'", double30 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 0.0d, (double) (byte) 1);
        double double16 = simpsonIntegration0.f((double) 1L);
        double double18 = simpsonIntegration0.f(8.154845485377137d);
        double double22 = simpsonIntegration0.simpsonsMethod(0, (double) '4', (double) '4');
        double double24 = simpsonIntegration0.f((-0.0014130171899539316d));
        double double28 = simpsonIntegration0.simpsonsMethod(0, 3.7906927820365864E-25d, 7.201889327800033d);
        java.lang.Class<?> wildcardClass29 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.103638323514327d + "'", double16 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.017959162462641984d) + "'", double18 == (-0.017959162462641984d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.2216106046044858E-18d) + "'", double22 == (-1.2216106046044858E-18d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 4.005654064435647d + "'", double24 == 4.005654064435647d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-4.5070736307907564E-27d) + "'", double28 == (-4.5070736307907564E-27d));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(0, (double) ' ', (double) (-1));
        double double18 = simpsonIntegration0.f(1.2395293152101427E-40d);
        double double20 = simpsonIntegration0.f((-0.004358393257198546d));
        double double22 = simpsonIntegration0.f((-0.2100593206839558d));
        double double26 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.3394344128489119d, (-1.0781454254561233E-20d));
        java.lang.Class<?> wildcardClass27 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 86.98501851068946d + "'", double16 == 86.98501851068946d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.017452540903338d + "'", double20 == 4.017452540903338d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.880565806253262d + "'", double22 == 4.880565806253262d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.45257921713188254d + "'", double26 == 0.45257921713188254d);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double12 = simpsonIntegration0.simpsonsMethod(0, (double) 1L, (double) 100.0f);
        double double14 = simpsonIntegration0.f((-1.0781454254561233E-20d));
        double double18 = simpsonIntegration0.simpsonsMethod((int) (byte) 0, (-0.001693227728973961d), (-0.11021647807132358d));
        double double20 = simpsonIntegration0.f(5.244886555713727d);
        java.lang.Class<?> wildcardClass21 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.2395293152101427E-40d) + "'", double12 == (-1.2395293152101427E-40d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.0025130411114009576d) + "'", double18 == (-0.0025130411114009576d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.1239954697245761d) + "'", double20 == (-0.1239954697245761d));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 0.0d, (double) (byte) 1);
        double double16 = simpsonIntegration0.f((double) (-1));
        java.lang.Class<?> wildcardClass17 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 8.154845485377137d + "'", double16 == 8.154845485377137d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 0.0d, (double) (byte) 1);
        double double16 = simpsonIntegration0.f((double) 1L);
        double double20 = simpsonIntegration0.simpsonsMethod((int) (byte) 1, (double) (byte) 0, (double) 100L);
        double double24 = simpsonIntegration0.simpsonsMethod((int) (short) 1, (-0.20064417731540868d), (-0.21545281845024855d));
        java.lang.Class<?> wildcardClass25 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.103638323514327d + "'", double16 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.0d) + "'", double20 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-0.716016414389119d) + "'", double24 == (-0.716016414389119d));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double8 = simpsonIntegration0.f((double) (-1L));
        double double12 = simpsonIntegration0.simpsonsMethod(1, (-3.3283848740159176E-4d), 4.005654064435647d);
        double double14 = simpsonIntegration0.f(7.149920860492725E-6d);
        java.lang.Class<?> wildcardClass15 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.154845485377137d + "'", double8 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.867986517190933E-5d + "'", double12 == 4.867986517190933E-5d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.99997140036768d + "'", double14 == 3.99997140036768d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double16 = simpsonIntegration0.simpsonsMethod(0, 0.0d, 0.9226783964008627d);
        double double18 = simpsonIntegration0.f(86.98501851068946d);
        double double22 = simpsonIntegration0.simpsonsMethod((int) (byte) 10, (-1.2395293152101427E-40d), (double) 1.0f);
        double double24 = simpsonIntegration0.f(0.3394344128489119d);
        double double28 = simpsonIntegration0.simpsonsMethod((int) (byte) 10, (double) (byte) -1, (-0.716016414389119d));
        java.lang.Class<?> wildcardClass29 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.2634141046617278E-34d) + "'", double18 == (-1.2634141046617278E-34d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.3679920553853836E-39d) + "'", double22 == (-1.3679920553853836E-39d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 2.7666384931515604d + "'", double24 == 2.7666384931515604d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 4158731.584777471d + "'", double28 == 4158731.584777471d);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double2 = simpsonIntegration0.f((double) 0);
        double double6 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 1.2395293152101427E-40d, (double) (byte) 10);
        double double8 = simpsonIntegration0.f(0.0d);
        double double10 = simpsonIntegration0.f(2.002615341358857d);
        java.lang.Class<?> wildcardClass11 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.8007854031706057E-43d) + "'", double6 == (-1.8007854031706057E-43d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.0d + "'", double8 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.0014130171899539316d) + "'", double10 == (-0.0014130171899539316d));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        double double16 = simpsonIntegration0.f(8.154845485377137d);
        double double18 = simpsonIntegration0.f((double) 0.0f);
        double double20 = simpsonIntegration0.f((double) 100);
        double double22 = simpsonIntegration0.f((-0.005367301737528441d));
        double double26 = simpsonIntegration0.simpsonsMethod(10, (double) 0.0f, 263.67333736052746d);
        java.lang.Class<?> wildcardClass27 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.017959162462641984d) + "'", double16 == (-0.017959162462641984d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-3.718587945630428E-40d) + "'", double20 == (-3.718587945630428E-40d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.021497963060547d + "'", double22 == 4.021497963060547d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-0.0d) + "'", double26 == (-0.0d));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double14 = simpsonIntegration0.f(10.0d);
        double double16 = simpsonIntegration0.f((double) (short) 10);
        double double18 = simpsonIntegration0.f((-0.2100593206839558d));
        java.lang.Class<?> wildcardClass19 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.004358393257198546d) + "'", double14 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.880565806253262d + "'", double18 == 4.880565806253262d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double12 = simpsonIntegration0.f((double) 10);
        double double14 = simpsonIntegration0.f((double) (short) 0);
        java.lang.Class<?> wildcardClass15 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double8 = simpsonIntegration0.f((double) (-1L));
        double double12 = simpsonIntegration0.simpsonsMethod(1, (-3.3283848740159176E-4d), 4.005654064435647d);
        double double14 = simpsonIntegration0.f((double) (-1));
        java.lang.Class<?> wildcardClass15 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.154845485377137d + "'", double8 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.867986517190933E-5d + "'", double12 == 4.867986517190933E-5d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 0.0d, (double) (byte) 1);
        double double16 = simpsonIntegration0.f((double) 1L);
        double double18 = simpsonIntegration0.f(8.154845485377137d);
        double double20 = simpsonIntegration0.f(1.2395293152101427E-40d);
        double double22 = simpsonIntegration0.f((-1.2634141046617278E-34d));
        double double24 = simpsonIntegration0.f((-0.0d));
        java.lang.Class<?> wildcardClass25 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.103638323514327d + "'", double16 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.017959162462641984d) + "'", double18 == (-0.017959162462641984d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.0d + "'", double20 == 4.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.0d + "'", double22 == 4.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 4.0d + "'", double24 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 0.0d, (double) (byte) 1);
        double double16 = simpsonIntegration0.f((double) (-1));
        double double18 = simpsonIntegration0.f(351.55527719495865d);
        double double22 = simpsonIntegration0.simpsonsMethod(0, 2.7666384931515604d, (-0.21545281845024855d));
        double double26 = simpsonIntegration0.simpsonsMethod(0, 2.413675113314953d, 0.0d);
        java.lang.Class<?> wildcardClass27 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 8.154845485377137d + "'", double16 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-2.590933206896706E-148d) + "'", double18 == (-2.590933206896706E-148d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.522636368713808d + "'", double22 == 4.522636368713808d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 3.218233484419937d + "'", double26 == 3.218233484419937d);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (byte) 0, (double) 0L, (double) ' ');
        double double6 = simpsonIntegration0.f((-1.8007854031706057E-43d));
        double double10 = simpsonIntegration0.simpsonsMethod((int) (short) 10, 4.017452540903338d, (-1.2634141046617278E-34d));
        double double14 = simpsonIntegration0.simpsonsMethod(1, 1.3573857385474846d, 19.13477449062135d);
        double double16 = simpsonIntegration0.f((double) 10.0f);
        java.lang.Class<?> wildcardClass17 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.129134273777278d + "'", double10 == 4.129134273777278d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.039409718471294E-6d) + "'", double14 == (-1.039409718471294E-6d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 0.0d, (double) (byte) 1);
        double double16 = simpsonIntegration0.f((double) 1L);
        double double20 = simpsonIntegration0.simpsonsMethod((int) (byte) 1, (double) (byte) 0, (double) 100L);
        double double22 = simpsonIntegration0.f((-0.016155316979210545d));
        double double26 = simpsonIntegration0.simpsonsMethod((int) (short) 1, 1.835485171602404E-37d, (-1.3679920553853836E-39d));
        java.lang.Class<?> wildcardClass27 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.103638323514327d + "'", double16 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.0d) + "'", double20 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.064880833848463d + "'", double22 == 4.064880833848463d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 4.894627124273078E-37d + "'", double26 == 4.894627124273078E-37d);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(0, (double) ' ', (double) (-1));
        double double20 = simpsonIntegration0.simpsonsMethod((int) '4', (-0.0014130171899539316d), 133.3298545519102d);
        double double22 = simpsonIntegration0.f(0.0d);
        java.lang.Class<?> wildcardClass23 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 86.98501851068946d + "'", double16 == 86.98501851068946d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.687712295743327E-55d + "'", double20 == 1.687712295743327E-55d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.0d + "'", double22 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double12 = simpsonIntegration0.f((double) 10);
        double double16 = simpsonIntegration0.simpsonsMethod(0, (-1.2395293152101427E-40d), 4.058365782993775d);
        double double18 = simpsonIntegration0.f((double) (byte) 100);
        double double20 = simpsonIntegration0.f(4.1439347378385145d);
        java.lang.Class<?> wildcardClass21 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 8.902002817124393E-42d + "'", double16 == 8.902002817124393E-42d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-3.718587945630428E-40d) + "'", double18 == (-3.718587945630428E-40d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.20891526061417334d) + "'", double20 == (-0.20891526061417334d));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 0.0d, (double) (byte) 1);
        double double16 = simpsonIntegration0.f((double) (-1));
        double double18 = simpsonIntegration0.f(351.55527719495865d);
        double double22 = simpsonIntegration0.simpsonsMethod(0, 2.7666384931515604d, (-0.21545281845024855d));
        double double24 = simpsonIntegration0.f((-1.2216106046044858E-18d));
        double double26 = simpsonIntegration0.f(4.086622276466951d);
        java.lang.Class<?> wildcardClass27 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 8.154845485377137d + "'", double16 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-2.590933206896706E-148d) + "'", double18 == (-2.590933206896706E-148d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.522636368713808d + "'", double22 == 4.522636368713808d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 4.0d + "'", double24 == 4.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-0.21331563406496507d) + "'", double26 == (-0.21331563406496507d));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double14 = simpsonIntegration0.f(10.0d);
        double double16 = simpsonIntegration0.f((double) (short) 10);
        double double20 = simpsonIntegration0.simpsonsMethod((int) (byte) 10, (double) 1, 0.865609122350895d);
        double double24 = simpsonIntegration0.simpsonsMethod(0, (double) (short) 100, (double) (-1));
        java.lang.Class<?> wildcardClass25 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.004358393257198546d) + "'", double14 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.19222885149765373d) + "'", double20 == (-0.19222885149765373d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 271.8281828459046d + "'", double24 == 271.8281828459046d);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double2 = simpsonIntegration0.f((double) 0);
        double double6 = simpsonIntegration0.simpsonsMethod(0, (double) (byte) -1, (double) 100.0f);
        double double8 = simpsonIntegration0.f(100.0d);
        double double10 = simpsonIntegration0.f(0.3394344128489119d);
        double double14 = simpsonIntegration0.simpsonsMethod((int) ' ', (-1.039409718471294E-6d), 4.064880833848463d);
        double double18 = simpsonIntegration0.simpsonsMethod((int) (byte) 10, (-0.6248127531564629d), (-1.4677877090000082E-17d));
        java.lang.Class<?> wildcardClass19 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.2395293152101427E-40d + "'", double6 == 1.2395293152101427E-40d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.718587945630428E-40d) + "'", double8 == (-3.718587945630428E-40d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.7666384931515604d + "'", double10 == 2.7666384931515604d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 7.149920860492725E-6d + "'", double14 == 7.149920860492725E-6d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 12723.839736354059d + "'", double18 == 12723.839736354059d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double12 = simpsonIntegration0.f((double) 10);
        double double16 = simpsonIntegration0.simpsonsMethod((int) '#', (-1.0d), (double) 100.0f);
        double double18 = simpsonIntegration0.f((double) '#');
        double double20 = simpsonIntegration0.f((double) (byte) -1);
        double double22 = simpsonIntegration0.f(0.0d);
        double double24 = simpsonIntegration0.f(3.652737548989758d);
        java.lang.Class<?> wildcardClass25 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 2.1230017461922604E-25d + "'", double16 == 2.1230017461922604E-25d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-7.698547564139474E-13d) + "'", double18 == (-7.698547564139474E-13d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 8.154845485377137d + "'", double20 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.0d + "'", double22 == 4.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-0.24215807452852617d) + "'", double24 == (-0.24215807452852617d));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(0, (double) ' ', (double) (-1));
        double double18 = simpsonIntegration0.f(1.2395293152101427E-40d);
        double double20 = simpsonIntegration0.f((-0.004358393257198546d));
        double double24 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (double) (byte) -1, 2.609103086070402E-5d);
        double double26 = simpsonIntegration0.f(1.0368854366838988E-41d);
        java.lang.Class<?> wildcardClass27 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 86.98501851068946d + "'", double16 == 86.98501851068946d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.017452540903338d + "'", double20 == 4.017452540903338d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.3332985455191015d) + "'", double24 == (-1.3332985455191015d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 4.0d + "'", double26 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (byte) -1, (-1.8007854031706057E-43d), (double) (byte) 0);
        double double8 = simpsonIntegration0.simpsonsMethod(0, (double) 0.0f, 0.0d);
        double double10 = simpsonIntegration0.f((-1.0294644847870642E67d));
        java.lang.Class<?> wildcardClass11 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.NEGATIVE_INFINITY + "'", double10 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        double double16 = simpsonIntegration0.f((double) 10L);
        double double18 = simpsonIntegration0.f((double) (short) 10);
        double double20 = simpsonIntegration0.f(2.3024062608264327E-51d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.004358393257198546d) + "'", double18 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.0d + "'", double20 == 4.0d);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double16 = simpsonIntegration0.simpsonsMethod(0, 0.0d, 0.9226783964008627d);
        double double20 = simpsonIntegration0.simpsonsMethod((int) (byte) 0, (-8.792109355360879E-19d), 1.3678875951919236d);
        double double22 = simpsonIntegration0.f(4.880565806253262d);
        java.lang.Class<?> wildcardClass23 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.5887577916121145E-19d) + "'", double20 == (-1.5887577916121145E-19d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.15048705932345452d) + "'", double22 == (-0.15048705932345452d));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 0.0d, (double) (byte) 1);
        double double16 = simpsonIntegration0.f((double) 1L);
        double double18 = simpsonIntegration0.f(4.0d);
        double double22 = simpsonIntegration0.simpsonsMethod((int) (short) -1, (-1.2634141046617278E-34d), 3.235822297226532d);
        double double24 = simpsonIntegration0.f((-3.718587945630428E-40d));
        java.lang.Class<?> wildcardClass25 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.103638323514327d + "'", double16 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.21978766666481014d) + "'", double18 == (-0.21978766666481014d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.0d) + "'", double22 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 4.0d + "'", double24 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 0.0d, (double) (byte) 1);
        double double16 = simpsonIntegration0.f((double) 1L);
        double double18 = simpsonIntegration0.f(4.0d);
        double double20 = simpsonIntegration0.f(4.058365782993775d);
        java.lang.Class<?> wildcardClass21 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.103638323514327d + "'", double16 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.21978766666481014d) + "'", double18 == (-0.21978766666481014d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.21545281845024855d) + "'", double20 == (-0.21545281845024855d));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double12 = simpsonIntegration0.simpsonsMethod(1, 0.9226783964008627d, 4.058365782993775d);
        double double16 = simpsonIntegration0.simpsonsMethod(100, 2.7182818284590455d, (double) 10.0f);
        double double20 = simpsonIntegration0.simpsonsMethod((-1), (-7.698547564139474E-13d), (-0.017959162462641984d));
        double double24 = simpsonIntegration0.simpsonsMethod((int) (byte) 0, 115.98002468091927d, (-0.11021647807132358d));
        double double28 = simpsonIntegration0.simpsonsMethod((int) '4', (-0.7317724584449441d), 0.0d);
        java.lang.Class<?> wildcardClass29 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.11021647807132358d) + "'", double12 == (-0.11021647807132358d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.005762150198617093d) + "'", double16 == (-0.005762150198617093d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.0d) + "'", double20 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 172.13430015173705d + "'", double24 == 172.13430015173705d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 4.605901680240415E19d + "'", double28 == 4.605901680240415E19d);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 0.0d, (double) (byte) 1);
        double double16 = simpsonIntegration0.f((double) 1L);
        double double18 = simpsonIntegration0.f(8.154845485377137d);
        double double20 = simpsonIntegration0.f(1.2395293152101427E-40d);
        java.lang.Class<?> wildcardClass21 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.103638323514327d + "'", double16 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.017959162462641984d) + "'", double18 == (-0.017959162462641984d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.0d + "'", double20 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        double double16 = simpsonIntegration0.f((double) 10L);
        double double18 = simpsonIntegration0.f((double) (-1L));
        double double22 = simpsonIntegration0.simpsonsMethod((int) (short) 10, (-0.21978766666458455d), (-2.2072362778100317E-54d));
        double double26 = simpsonIntegration0.simpsonsMethod(0, (-0.19871408377292402d), 5.244886555713727d);
        java.lang.Class<?> wildcardClass27 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 8.154845485377137d + "'", double18 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-12.092727733684448d) + "'", double22 == (-12.092727733684448d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.00821321538610416d + "'", double26 == 0.00821321538610416d);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(10, (-0.0d), (double) (byte) 0);
        double double18 = simpsonIntegration0.f((double) 0L);
        double double22 = simpsonIntegration0.simpsonsMethod((int) (short) 100, (double) 100, (double) 10L);
        double double24 = simpsonIntegration0.f((double) (short) 10);
        double double26 = simpsonIntegration0.f(53.95124589585826d);
        double double28 = simpsonIntegration0.f(115.98002468091927d);
        java.lang.Class<?> wildcardClass29 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.0d) + "'", double16 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.14527977523995153d) + "'", double22 == (-0.14527977523995153d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-0.004358393257198546d) + "'", double24 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0781454254561233E-20d) + "'", double26 == (-1.0781454254561233E-20d));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-5.743180945446806E-47d) + "'", double28 == (-5.743180945446806E-47d));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        double double16 = simpsonIntegration0.f((double) 10L);
        double double20 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (-2.2148125385032659E-54d));
        double double22 = simpsonIntegration0.f(3.516335322931642d);
        java.lang.Class<?> wildcardClass23 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.2484968469493311d) + "'", double22 == (-0.2484968469493311d));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 0.0d, (double) (byte) 1);
        double double16 = simpsonIntegration0.f((double) 1L);
        double double20 = simpsonIntegration0.simpsonsMethod((int) (byte) 1, (double) (byte) 0, (double) 100L);
        double double22 = simpsonIntegration0.f((-0.016155316979210545d));
        java.lang.Class<?> wildcardClass23 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.103638323514327d + "'", double16 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.0d) + "'", double20 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.064880833848463d + "'", double22 == 4.064880833848463d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double12 = simpsonIntegration0.simpsonsMethod(0, (double) 1L, (double) 100.0f);
        double double14 = simpsonIntegration0.f((double) 0L);
        double double18 = simpsonIntegration0.simpsonsMethod(0, (-3.00839694745219d), (double) (-1));
        double double22 = simpsonIntegration0.simpsonsMethod((int) (short) 100, (-7.651460376422497E-39d), 86.98501851068946d);
        java.lang.Class<?> wildcardClass23 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.2395293152101427E-40d) + "'", double12 == (-1.2395293152101427E-40d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-8.17767075505095d) + "'", double18 == (-8.17767075505095d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 9.666962960832531E-71d + "'", double22 == 9.666962960832531E-71d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double16 = simpsonIntegration0.simpsonsMethod(0, 0.0d, 0.9226783964008627d);
        double double18 = simpsonIntegration0.f((double) (short) 0);
        double double22 = simpsonIntegration0.simpsonsMethod(0, 2.8306689949230137E-25d, (-0.004358393257198546d));
        double double24 = simpsonIntegration0.f((-0.21978736206516547d));
        java.lang.Class<?> wildcardClass25 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 3.7906927820365864E-25d + "'", double22 == 3.7906927820365864E-25d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 4.923066394071297d + "'", double24 == 4.923066394071297d);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double2 = simpsonIntegration0.f((double) 0);
        double double4 = simpsonIntegration0.f((double) 1L);
        double double8 = simpsonIntegration0.simpsonsMethod(0, (double) (byte) 1, (-0.017959162462641984d));
        java.lang.Class<?> wildcardClass9 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.103638323514327d + "'", double4 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.3573857385474846d + "'", double8 == 1.3573857385474846d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double12 = simpsonIntegration0.f((double) 10);
        double double16 = simpsonIntegration0.simpsonsMethod((int) '#', (-1.0d), (double) 100.0f);
        double double18 = simpsonIntegration0.f((double) '#');
        double double20 = simpsonIntegration0.f((double) (byte) -1);
        double double22 = simpsonIntegration0.f(0.0d);
        double double24 = simpsonIntegration0.f(3.652737548989758d);
        double double28 = simpsonIntegration0.simpsonsMethod((int) (short) 10, (-0.21978766666458455d), 5.244886555713727d);
        double double32 = simpsonIntegration0.simpsonsMethod((int) (byte) -1, 0.44560275377566727d, (-0.0012649947976536042d));
        java.lang.Class<?> wildcardClass33 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 2.1230017461922604E-25d + "'", double16 == 2.1230017461922604E-25d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-7.698547564139474E-13d) + "'", double18 == (-7.698547564139474E-13d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 8.154845485377137d + "'", double20 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.0d + "'", double22 == 4.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-0.24215807452852617d) + "'", double24 == (-0.24215807452852617d));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.44560275377566727d + "'", double28 == 0.44560275377566727d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (byte) 0, (double) 0L, (double) ' ');
        double double8 = simpsonIntegration0.simpsonsMethod((int) '#', (double) 'a', 0.9226783964008627d);
        double double10 = simpsonIntegration0.f((-0.01453886097417405d));
        double double12 = simpsonIntegration0.f((double) 100L);
        double double14 = simpsonIntegration0.f((-0.01453886097417405d));
        double double18 = simpsonIntegration0.simpsonsMethod((-1), (-0.11021647807132358d), (double) (byte) 0);
        java.lang.Class<?> wildcardClass19 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.46343442189374d + "'", double8 == 40.46343442189374d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.058365782993775d + "'", double10 == 4.058365782993775d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-3.718587945630428E-40d) + "'", double12 == (-3.718587945630428E-40d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.058365782993775d + "'", double14 == 4.058365782993775d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.0d) + "'", double18 == (-0.0d));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(0, (double) ' ', (double) (-1));
        double double18 = simpsonIntegration0.f((double) (byte) 10);
        double double20 = simpsonIntegration0.f((double) (byte) 10);
        double double24 = simpsonIntegration0.simpsonsMethod((int) (short) 1, (double) 100.0f, (-0.004358393257198546d));
        double double28 = simpsonIntegration0.simpsonsMethod((-1), (double) ' ', 1.2514464254193938d);
        double double30 = simpsonIntegration0.f(5.921363349002919E-140d);
        java.lang.Class<?> wildcardClass31 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 86.98501851068946d + "'", double16 == 86.98501851068946d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.004358393257198546d) + "'", double18 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.004358393257198546d) + "'", double20 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 133.91508469677794d + "'", double24 == 133.91508469677794d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 4.0d + "'", double30 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double2 = simpsonIntegration0.f((double) 0);
        double double6 = simpsonIntegration0.simpsonsMethod(0, (double) (byte) -1, (double) 100.0f);
        double double8 = simpsonIntegration0.f(100.0d);
        double double12 = simpsonIntegration0.simpsonsMethod(0, (-0.016155316979210545d), (double) 'a');
        double double14 = simpsonIntegration0.f(0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.2395293152101427E-40d + "'", double6 == 1.2395293152101427E-40d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.718587945630428E-40d) + "'", double8 == (-3.718587945630428E-40d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.7843237572091147E-41d + "'", double12 == 3.7843237572091147E-41d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
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
        double double26 = simpsonIntegration0.simpsonsMethod((int) (short) 10, (-1.693539419598958E-19d), 0.2433240273856971d);
        java.lang.Class<?> wildcardClass27 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.017959162462641984d) + "'", double16 == (-0.017959162462641984d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-3.718587945630428E-40d) + "'", double20 == (-3.718587945630428E-40d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 2.413675113314953d + "'", double22 == 2.413675113314953d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-5.232445296420394E-18d) + "'", double26 == (-5.232445296420394E-18d));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod((int) 'a', (double) 100.0f, (double) 10.0f);
        java.lang.Class<?> wildcardClass15 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.14527977523995153d) + "'", double14 == (-0.14527977523995153d));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 0.0d, (double) (byte) 1);
        double double16 = simpsonIntegration0.f((double) (-1));
        double double18 = simpsonIntegration0.f(351.55527719495865d);
        double double22 = simpsonIntegration0.simpsonsMethod(0, 2.7666384931515604d, (-0.21545281845024855d));
        double double24 = simpsonIntegration0.f((-1.2216106046044858E-18d));
        java.lang.Class<?> wildcardClass25 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 8.154845485377137d + "'", double16 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-2.590933206896706E-148d) + "'", double18 == (-2.590933206896706E-148d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.522636368713808d + "'", double22 == 4.522636368713808d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 4.0d + "'", double24 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 0.0d, (double) (byte) 1);
        double double16 = simpsonIntegration0.f((double) 1L);
        double double18 = simpsonIntegration0.f(8.154845485377137d);
        double double20 = simpsonIntegration0.f((-0.16338567387879238d));
        java.lang.Class<?> wildcardClass21 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.103638323514327d + "'", double16 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.017959162462641984d) + "'", double18 == (-0.017959162462641984d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.678529946300102d + "'", double20 == 4.678529946300102d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double14 = simpsonIntegration0.f(10.0d);
        double double16 = simpsonIntegration0.f((double) (short) 10);
        double double20 = simpsonIntegration0.simpsonsMethod((int) (byte) 10, (double) 1, 0.865609122350895d);
        double double24 = simpsonIntegration0.simpsonsMethod(0, (double) (short) 100, (double) (-1));
        double double28 = simpsonIntegration0.simpsonsMethod((int) ' ', 1.103638323514327d, (double) 10);
        double double32 = simpsonIntegration0.simpsonsMethod(10, (-7.326510413260626d), 3.999895636557305d);
        java.lang.Class<?> wildcardClass33 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.004358393257198546d) + "'", double14 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.19222885149765373d) + "'", double20 == (-0.19222885149765373d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 271.8281828459046d + "'", double24 == 271.8281828459046d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-0.005372034579787903d) + "'", double28 == (-0.005372034579787903d));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 1.415320313230246E34d + "'", double32 == 1.415320313230246E34d);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double2 = simpsonIntegration0.f((double) 0);
        double double6 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 1.2395293152101427E-40d, (double) (byte) 10);
        double double10 = simpsonIntegration0.simpsonsMethod((int) (byte) 100, (double) (byte) 10, (double) (byte) 10);
        double double12 = simpsonIntegration0.f(1.2395293152101427E-40d);
        double double16 = simpsonIntegration0.simpsonsMethod((int) 'a', (double) (short) 1, 1.2514464254193938d);
        double double18 = simpsonIntegration0.f((double) 1.0f);
        double double20 = simpsonIntegration0.f(0.06767458874211592d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.8007854031706057E-43d) + "'", double6 == (-1.8007854031706057E-43d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.01453886097417405d) + "'", double10 == (-0.01453886097417405d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.0d + "'", double12 == 4.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.5850594265420912d) + "'", double16 == (-0.5850594265420912d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.103638323514327d + "'", double18 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 3.7339780023149696d + "'", double20 == 3.7339780023149696d);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f((double) (-1L));
        double double14 = simpsonIntegration0.simpsonsMethod(1, 40.46343442189374d, 0.0d);
        double double16 = simpsonIntegration0.f(2.609103086070402E-5d);
        double double18 = simpsonIntegration0.f(19.13477449062135d);
        java.lang.Class<?> wildcardClass19 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.154845485377137d + "'", double10 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 53.95124589585826d + "'", double14 == 53.95124589585826d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 3.999895636557305d + "'", double16 == 3.999895636557305d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.7731645398316149E-6d) + "'", double18 == (-1.7731645398316149E-6d));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double2 = simpsonIntegration0.f((double) 0);
        double double6 = simpsonIntegration0.simpsonsMethod(0, (double) (byte) -1, (double) 100.0f);
        double double8 = simpsonIntegration0.f(8.154845485377137d);
        double double12 = simpsonIntegration0.simpsonsMethod((int) (short) 1, (double) 1.0f, (-0.20064417731540868d));
        java.lang.Class<?> wildcardClass13 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.2395293152101427E-40d + "'", double6 == 1.2395293152101427E-40d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.017959162462641984d) + "'", double8 == (-0.017959162462641984d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 2.1169125427498074d + "'", double12 == 2.1169125427498074d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 0.0d, (double) (byte) 1);
        double double16 = simpsonIntegration0.f((double) 1L);
        double double18 = simpsonIntegration0.f(8.154845485377137d);
        double double22 = simpsonIntegration0.simpsonsMethod(0, (double) '4', (double) '4');
        double double24 = simpsonIntegration0.f((-0.0014130171899539316d));
        java.lang.Class<?> wildcardClass25 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.103638323514327d + "'", double16 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.017959162462641984d) + "'", double18 == (-0.017959162462641984d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.2216106046044858E-18d) + "'", double22 == (-1.2216106046044858E-18d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 4.005654064435647d + "'", double24 == 4.005654064435647d);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(0, (double) ' ', (double) (-1));
        double double18 = simpsonIntegration0.f(1.2395293152101427E-40d);
        double double20 = simpsonIntegration0.f((-0.004358393257198546d));
        double double24 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (double) (byte) -1, 2.609103086070402E-5d);
        double double28 = simpsonIntegration0.simpsonsMethod((int) (short) 1, (double) 1L, (-7.047753488102803E-20d));
        double double30 = simpsonIntegration0.f(5.035372138877525E47d);
        java.lang.Class<?> wildcardClass31 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 86.98501851068946d + "'", double16 == 86.98501851068946d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.017452540903338d + "'", double20 == 4.017452540903338d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.3332985455191015d) + "'", double24 == (-1.3332985455191015d));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.7012127745047754d + "'", double28 == 1.7012127745047754d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-0.0d) + "'", double30 == (-0.0d));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double12 = simpsonIntegration0.simpsonsMethod(1, 0.9226783964008627d, 4.058365782993775d);
        double double16 = simpsonIntegration0.simpsonsMethod(100, 2.7182818284590455d, (double) 10.0f);
        double double18 = simpsonIntegration0.f(1.0d);
        double double22 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.15048705932345452d), 2.609103086070402E-5d);
        java.lang.Class<?> wildcardClass23 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.11021647807132358d) + "'", double12 == (-0.11021647807132358d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.005762150198617093d) + "'", double16 == (-0.005762150198617093d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.103638323514327d + "'", double18 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.20064417731540868d) + "'", double22 == (-0.20064417731540868d));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(0, (double) ' ', (double) (-1));
        double double20 = simpsonIntegration0.simpsonsMethod((int) '4', (-0.0014130171899539316d), 133.3298545519102d);
        java.lang.Class<?> wildcardClass21 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 86.98501851068946d + "'", double16 == 86.98501851068946d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.687712295743327E-55d + "'", double20 == 1.687712295743327E-55d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 0.0d, (double) (byte) 1);
        double double16 = simpsonIntegration0.f((double) 1L);
        double double18 = simpsonIntegration0.f((double) '4');
        double double22 = simpsonIntegration0.simpsonsMethod(10, 133.33333333333334d, (-3.3283848740159176E-4d));
        double double26 = simpsonIntegration0.simpsonsMethod((int) 'a', (-0.20064417731540868d), 177.83695398750095d);
        java.lang.Class<?> wildcardClass27 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.103638323514327d + "'", double16 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-7.047753488102803E-20d) + "'", double18 == (-7.047753488102803E-20d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 177.83695398750095d + "'", double22 == 177.83695398750095d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 3.953494426882914E-65d + "'", double26 == 3.953494426882914E-65d);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double12 = simpsonIntegration0.simpsonsMethod(0, (double) 1L, (double) 100.0f);
        double double14 = simpsonIntegration0.f(53.95124589585826d);
        java.lang.Class<?> wildcardClass15 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.2395293152101427E-40d) + "'", double12 == (-1.2395293152101427E-40d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0781454254561233E-20d) + "'", double14 == (-1.0781454254561233E-20d));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double12 = simpsonIntegration0.simpsonsMethod(1, 0.9226783964008627d, 4.058365782993775d);
        double double14 = simpsonIntegration0.f(0.0d);
        double double16 = simpsonIntegration0.f((-0.6537519371611368d));
        java.lang.Class<?> wildcardClass17 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.11021647807132358d) + "'", double12 == (-0.11021647807132358d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 6.869201790086779d + "'", double16 == 6.869201790086779d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(0, 4.0013314647187705d, 4.005654064435647d);
        double double18 = simpsonIntegration0.f(263.67333736052746d);
        java.lang.Class<?> wildcardClass19 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.29259450005390564d) + "'", double16 == (-0.29259450005390564d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-2.1391045133933362E-110d) + "'", double18 == (-2.1391045133933362E-110d));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
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
        double double38 = simpsonIntegration0.f((-124010.55567924457d));
        double double42 = simpsonIntegration0.simpsonsMethod((int) (short) 100, (-0.19222885149765373d), (-0.16338567387879238d));
        java.lang.Class<?> wildcardClass43 = simpsonIntegration0.getClass();
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
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + Double.NEGATIVE_INFINITY + "'", double38 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 8.799770009341391E10d + "'", double42 == 8.799770009341391E10d);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(0, (double) ' ', (double) (-1));
        double double18 = simpsonIntegration0.f((double) (byte) 10);
        double double20 = simpsonIntegration0.f((double) (byte) 10);
        double double24 = simpsonIntegration0.simpsonsMethod((int) '4', 4.017452540903338d, 0.9226783964008627d);
        java.lang.Class<?> wildcardClass25 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 86.98501851068946d + "'", double16 == 86.98501851068946d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.004358393257198546d) + "'", double18 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.004358393257198546d) + "'", double20 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.865609122350895d + "'", double24 == 0.865609122350895d);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double8 = simpsonIntegration0.f((double) (-1L));
        double double12 = simpsonIntegration0.simpsonsMethod((int) 'a', 2.1230017461922604E-25d, (-0.20064417731540868d));
        java.lang.Class<?> wildcardClass13 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.154845485377137d + "'", double8 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 9.931906770383255E-23d + "'", double12 == 9.931906770383255E-23d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double16 = simpsonIntegration0.simpsonsMethod(0, 0.0d, 0.9226783964008627d);
        double double18 = simpsonIntegration0.f((double) 10);
        double double22 = simpsonIntegration0.simpsonsMethod((int) (short) 1, 4.880565806253262d, (-0.21978736206516547d));
        double double26 = simpsonIntegration0.simpsonsMethod((int) (byte) 0, (-0.5850594265420912d), 2.566645225308353d);
        java.lang.Class<?> wildcardClass27 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.004358393257198546d) + "'", double18 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 7.736386911307096d + "'", double22 == 7.736386911307096d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.03875318263267466d + "'", double26 == 0.03875318263267466d);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double12 = simpsonIntegration0.simpsonsMethod(1, 0.9226783964008627d, 4.058365782993775d);
        double double14 = simpsonIntegration0.f(0.0d);
        java.lang.Class<?> wildcardClass15 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.11021647807132358d) + "'", double12 == (-0.11021647807132358d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double2 = simpsonIntegration0.f((double) 0);
        double double6 = simpsonIntegration0.simpsonsMethod(0, (double) (byte) -1, (double) 100.0f);
        double double8 = simpsonIntegration0.f(100.0d);
        double double12 = simpsonIntegration0.simpsonsMethod(0, (-0.016155316979210545d), (double) 'a');
        double double14 = simpsonIntegration0.f(4.000000000003079d);
        java.lang.Class<?> wildcardClass15 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.2395293152101427E-40d + "'", double6 == 1.2395293152101427E-40d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.718587945630428E-40d) + "'", double8 == (-3.718587945630428E-40d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.7843237572091147E-41d + "'", double12 == 3.7843237572091147E-41d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.21978766666458455d) + "'", double14 == (-0.21978766666458455d));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 0.0d, (double) (byte) 1);
        double double16 = simpsonIntegration0.f((double) 1L);
        double double18 = simpsonIntegration0.f(8.154845485377137d);
        double double20 = simpsonIntegration0.f((-0.16338567387879238d));
        double double22 = simpsonIntegration0.f(1.0d);
        double double24 = simpsonIntegration0.f(4.880565806253262d);
        java.lang.Class<?> wildcardClass25 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.103638323514327d + "'", double16 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.017959162462641984d) + "'", double18 == (-0.017959162462641984d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.678529946300102d + "'", double20 == 4.678529946300102d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.103638323514327d + "'", double22 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-0.15048705932345452d) + "'", double24 == (-0.15048705932345452d));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double8 = simpsonIntegration0.f((double) (-1L));
        double double10 = simpsonIntegration0.f((double) 10);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 1.2514464254193938d, 0.0d);
        double double16 = simpsonIntegration0.f(0.2433240273856971d);
        java.lang.Class<?> wildcardClass17 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.154845485377137d + "'", double8 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.004358393257198546d) + "'", double10 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2.0018152742371256d + "'", double14 == 2.0018152742371256d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 3.0896507254962358d + "'", double16 == 3.0896507254962358d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (byte) -1, (-1.8007854031706057E-43d), (double) (byte) 0);
        double double8 = simpsonIntegration0.simpsonsMethod(0, (double) 0.0f, 0.0d);
        double double12 = simpsonIntegration0.simpsonsMethod((int) 'a', (double) (short) 1, 13.318805355809339d);
        double double14 = simpsonIntegration0.f(0.0d);
        java.lang.Class<?> wildcardClass15 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-3.3283848740159176E-4d) + "'", double12 == (-3.3283848740159176E-4d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
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
        double double26 = simpsonIntegration0.f((-1.7731645398316149E-6d));
        double double30 = simpsonIntegration0.simpsonsMethod((int) (byte) 10, (-0.21979531239781874d), (-2.590933206896706E-148d));
        double double32 = simpsonIntegration0.f(4.000000000041571d);
        java.lang.Class<?> wildcardClass33 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.004358393257198546d) + "'", double18 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.005367301737528441d) + "'", double22 == (-0.005367301737528441d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-0.219372853236844d) + "'", double24 == (-0.219372853236844d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 4.000007092661304d + "'", double26 == 4.000007092661304d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-12.092155046994721d) + "'", double30 == (-12.092155046994721d));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-0.21978766666176455d) + "'", double32 == (-0.21978766666176455d));
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double12 = simpsonIntegration0.simpsonsMethod(0, (double) 1L, (double) 100.0f);
        double double14 = simpsonIntegration0.f((-1.0781454254561233E-20d));
        double double18 = simpsonIntegration0.simpsonsMethod((int) (byte) 0, (-0.001693227728973961d), (-0.11021647807132358d));
        java.lang.Class<?> wildcardClass19 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.2395293152101427E-40d) + "'", double12 == (-1.2395293152101427E-40d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.0025130411114009576d) + "'", double18 == (-0.0025130411114009576d));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (byte) 0, (double) 0L, (double) ' ');
        double double8 = simpsonIntegration0.simpsonsMethod((int) '#', (double) 'a', 0.9226783964008627d);
        double double10 = simpsonIntegration0.f((-0.01453886097417405d));
        double double12 = simpsonIntegration0.f((double) 100L);
        double double14 = simpsonIntegration0.f((double) (short) 1);
        double double18 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.23948687210556677d), 2.8306689949230137E-25d);
        java.lang.Class<?> wildcardClass19 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.46343442189374d + "'", double8 == 40.46343442189374d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.058365782993775d + "'", double10 == 4.058365782993775d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-3.718587945630428E-40d) + "'", double12 == (-3.718587945630428E-40d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.103638323514327d + "'", double14 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.31931582947408904d) + "'", double18 == (-0.31931582947408904d));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        double double16 = simpsonIntegration0.f(8.154845485377137d);
        double double20 = simpsonIntegration0.simpsonsMethod((int) (short) 100, (-7.047753488102803E-20d), 468.7403695932782d);
        double double22 = simpsonIntegration0.f(7.201889327800033d);
        double double24 = simpsonIntegration0.f((-0.21978766666176455d));
        java.lang.Class<?> wildcardClass25 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.017959162462641984d) + "'", double16 == (-0.017959162462641984d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.154813702961169E-216d + "'", double20 == 4.154813702961169E-216d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.03566952446383129d) + "'", double22 == (-0.03566952446383129d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 4.923067726815203d + "'", double24 == 4.923067726815203d);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) 'a', 10.0d, 2.002615341358857d);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 10, (-0.6360598969347263d), 1.9972480396213286d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.016155316979210545d) + "'", double4 == (-0.016155316979210545d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 654.9727419850799d + "'", double8 == 654.9727419850799d);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(0, (double) ' ', (double) (-1));
        double double18 = simpsonIntegration0.f((double) (byte) 10);
        double double22 = simpsonIntegration0.simpsonsMethod((int) (short) -1, 0.9226783964008627d, (double) (byte) 1);
        double double26 = simpsonIntegration0.simpsonsMethod(0, (double) (byte) 1, (double) (-1));
        double double28 = simpsonIntegration0.f((-0.017959162462641984d));
        double double32 = simpsonIntegration0.simpsonsMethod(1, (-2.2148125385032659E-54d), 3.99997140036768d);
        java.lang.Class<?> wildcardClass33 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 86.98501851068946d + "'", double16 == 86.98501851068946d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.004358393257198546d) + "'", double18 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 2.7182818284590455d + "'", double26 == 2.7182818284590455d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 4.072157215642454d + "'", double28 == 4.072157215642454d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 3.2452874704106528E-55d + "'", double32 == 3.2452874704106528E-55d);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(0, (double) ' ', (double) (-1));
        double double18 = simpsonIntegration0.f((double) (byte) 10);
        double double22 = simpsonIntegration0.simpsonsMethod((int) (short) -1, 0.9226783964008627d, (double) (byte) 1);
        double double26 = simpsonIntegration0.simpsonsMethod(0, (double) (byte) 1, (double) (-1));
        double double30 = simpsonIntegration0.simpsonsMethod((int) 'a', (-2.3854629903149513d), (double) (-1.0f));
        double double32 = simpsonIntegration0.f((-3.806556146559686E-40d));
        double double36 = simpsonIntegration0.simpsonsMethod((int) (byte) 100, (-1.0d), 4.064880833848463d);
        double double38 = simpsonIntegration0.f(0.0d);
        double double40 = simpsonIntegration0.f(1.415320313230246E34d);
        java.lang.Class<?> wildcardClass41 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 86.98501851068946d + "'", double16 == 86.98501851068946d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.004358393257198546d) + "'", double18 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 2.7182818284590455d + "'", double26 == 2.7182818284590455d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 4.3947944567089737E105d + "'", double30 == 4.3947944567089737E105d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 4.0d + "'", double32 == 4.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 4.179484741423919E45d + "'", double36 == 4.179484741423919E45d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 4.0d + "'", double38 == 4.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-0.0d) + "'", double40 == (-0.0d));
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(0, (double) ' ', (double) (-1));
        double double18 = simpsonIntegration0.f((double) (byte) 10);
        double double22 = simpsonIntegration0.simpsonsMethod((int) (short) -1, 0.9226783964008627d, (double) (byte) 1);
        double double26 = simpsonIntegration0.simpsonsMethod(0, (double) (byte) 1, (double) (-1));
        double double28 = simpsonIntegration0.f((-0.017959162462641984d));
        double double30 = simpsonIntegration0.f((-1.0781454254561233E-20d));
        java.lang.Class<?> wildcardClass31 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 86.98501851068946d + "'", double16 == 86.98501851068946d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.004358393257198546d) + "'", double18 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 2.7182818284590455d + "'", double26 == 2.7182818284590455d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 4.072157215642454d + "'", double28 == 4.072157215642454d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 4.0d + "'", double30 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(10, (-0.0d), (double) (byte) 0);
        double double18 = simpsonIntegration0.f((double) '4');
        java.lang.Class<?> wildcardClass19 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.0d) + "'", double16 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-7.047753488102803E-20d) + "'", double18 == (-7.047753488102803E-20d));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double2 = simpsonIntegration0.f((double) 0);
        double double6 = simpsonIntegration0.simpsonsMethod(0, (double) (byte) -1, (double) 100.0f);
        double double8 = simpsonIntegration0.f(100.0d);
        double double10 = simpsonIntegration0.f(2.413675113314953d);
        double double14 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 1.103638323514327d, (-124010.55567924457d));
        java.lang.Class<?> wildcardClass15 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.2395293152101427E-40d + "'", double6 == 1.2395293152101427E-40d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.718587945630428E-40d) + "'", double8 == (-3.718587945630428E-40d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.16338567387879238d) + "'", double10 == (-0.16338567387879238d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + Double.NEGATIVE_INFINITY + "'", double14 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, (double) (byte) 10, (-1.2395293152101427E-40d));
        double double14 = simpsonIntegration0.simpsonsMethod((int) (byte) 10, 3.235822297226532d, (-1.291744886007606E-11d));
        java.lang.Class<?> wildcardClass15 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 13.318805355809339d + "'", double10 == 13.318805355809339d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.0654977926758233d + "'", double14 == 3.0654977926758233d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        double double16 = simpsonIntegration0.f(8.154845485377137d);
        double double20 = simpsonIntegration0.simpsonsMethod(10, (double) (short) 10, (double) 1L);
        double double22 = simpsonIntegration0.f(3.999895636557305d);
        double double24 = simpsonIntegration0.f(4.017452540903338d);
        java.lang.Class<?> wildcardClass25 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.017959162462641984d) + "'", double16 == (-0.017959162462641984d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 3.652737548989758d + "'", double20 == 3.652737548989758d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.21979531239781874d) + "'", double22 == (-0.21979531239781874d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-0.21850356693465028d) + "'", double24 == (-0.21850356693465028d));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (byte) 0, (double) 0L, (double) ' ');
        java.lang.Class<?> wildcardClass5 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
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
        java.lang.Class<?> wildcardClass31 = simpsonIntegration0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double2 = simpsonIntegration0.f((double) 0);
        double double6 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 1.2395293152101427E-40d, (double) (byte) 10);
        double double8 = simpsonIntegration0.f(0.0d);
        double double12 = simpsonIntegration0.simpsonsMethod((int) ' ', (-0.21978766666458455d), (-1.2395293152101427E-40d));
        double double16 = simpsonIntegration0.simpsonsMethod((int) (byte) 100, 4.923066394071297d, 3.652737548989758d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.8007854031706057E-43d) + "'", double6 == (-1.8007854031706057E-43d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.0d + "'", double8 == 4.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 37867.06926325643d + "'", double12 == 37867.06926325643d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.48431351424052344d) + "'", double16 == (-0.48431351424052344d));
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (byte) 0, (double) 0L, (double) ' ');
        double double8 = simpsonIntegration0.simpsonsMethod((int) '#', (double) 'a', 0.9226783964008627d);
        double double10 = simpsonIntegration0.f((-0.01453886097417405d));
        double double12 = simpsonIntegration0.f((double) 100L);
        double double14 = simpsonIntegration0.f((double) (short) 1);
        double double18 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (double) (byte) 1, 40.46343442189374d);
        double double22 = simpsonIntegration0.simpsonsMethod(1, (-0.2484968469493311d), (-2.6665226325972244E-28d));
        double double24 = simpsonIntegration0.f(4.923067726815203d);
        java.lang.Class<?> wildcardClass25 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.46343442189374d + "'", double8 == 40.46343442189374d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.058365782993775d + "'", double10 == 4.058365782993775d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-3.718587945630428E-40d) + "'", double12 == (-3.718587945630428E-40d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.103638323514327d + "'", double14 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.455109358270963E-15d) + "'", double18 == (-1.455109358270963E-15d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.7495672780391712d) + "'", double22 == (-0.7495672780391712d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-0.14725712270254981d) + "'", double24 == (-0.14725712270254981d));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) ' ', 0.0d, 0.0d);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (byte) 1, (double) 10.0f, (-0.20064417731540868d));
        java.lang.Class<?> wildcardClass9 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 16.114832901593264d + "'", double8 == 16.114832901593264d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 0.0d, (double) (byte) 1);
        double double16 = simpsonIntegration0.f((double) (-1));
        double double20 = simpsonIntegration0.simpsonsMethod((int) (short) -1, 3.652737548989758d, 3.218233484419937d);
        java.lang.Class<?> wildcardClass21 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 8.154845485377137d + "'", double16 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double8 = simpsonIntegration0.f((double) (-1L));
        double double10 = simpsonIntegration0.f((double) 10);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 1.2514464254193938d, 0.0d);
        double double18 = simpsonIntegration0.simpsonsMethod(10, (-0.01453886097417405d), 9.931906770383255E-23d);
        double double20 = simpsonIntegration0.f(1.7010219573714175E-40d);
        double double24 = simpsonIntegration0.simpsonsMethod((int) '#', 0.865609122350895d, (-7.027389983271083E-39d));
        double double28 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 4.154813702961169E-216d, 0.00821321538610416d);
        java.lang.Class<?> wildcardClass29 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.154845485377137d + "'", double8 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.004358393257198546d) + "'", double10 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2.0018152742371256d + "'", double14 == 2.0018152742371256d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.6248127531564629d) + "'", double18 == (-0.6248127531564629d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.0d + "'", double20 == 4.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.997483484540344d + "'", double24 == 1.997483484540344d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 5.494346108142295E-216d + "'", double28 == 5.494346108142295E-216d);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        double double16 = simpsonIntegration0.f((double) 10L);
        double double18 = simpsonIntegration0.f((double) (short) 10);
        double double22 = simpsonIntegration0.simpsonsMethod((int) '4', (double) 1, (double) 10);
        java.lang.Class<?> wildcardClass23 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.004358393257198546d) + "'", double18 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.005367301737528441d) + "'", double22 == (-0.005367301737528441d));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double8 = simpsonIntegration0.f((double) (-1L));
        double double10 = simpsonIntegration0.f((double) 10);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 1.2514464254193938d, 0.0d);
        double double16 = simpsonIntegration0.f(0.2433240273856971d);
        double double18 = simpsonIntegration0.f(1.2514464254193938d);
        java.lang.Class<?> wildcardClass19 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.154845485377137d + "'", double8 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.004358393257198546d) + "'", double10 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2.0018152742371256d + "'", double14 == 2.0018152742371256d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 3.0896507254962358d + "'", double16 == 3.0896507254962358d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.6963109328077465d + "'", double18 == 0.6963109328077465d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 0.0d, (double) (byte) 1);
        double double16 = simpsonIntegration0.f((double) 1L);
        double double18 = simpsonIntegration0.f(4.0d);
        double double20 = simpsonIntegration0.f((double) '4');
        double double24 = simpsonIntegration0.simpsonsMethod((int) (short) 1, (double) 0, (-0.0012649947976536042d));
        double double28 = simpsonIntegration0.simpsonsMethod(10, 4.086622276466951d, (-0.014630273071269208d));
        java.lang.Class<?> wildcardClass29 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.103638323514327d + "'", double16 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.21978766666481014d) + "'", double18 == (-0.21978766666481014d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-7.047753488102803E-20d) + "'", double20 == (-7.047753488102803E-20d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 4.307795425205677d + "'", double28 == 4.307795425205677d);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        double double16 = simpsonIntegration0.f((double) 10L);
        double double20 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (-2.2148125385032659E-54d));
        double double22 = simpsonIntegration0.f(5.244886555713727d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.1239954697245761d) + "'", double22 == (-0.1239954697245761d));
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double16 = simpsonIntegration0.simpsonsMethod(0, 0.0d, 0.9226783964008627d);
        double double18 = simpsonIntegration0.f((double) (short) 0);
        double double20 = simpsonIntegration0.f((double) 0L);
        double double22 = simpsonIntegration0.f(62.22222222217432d);
        java.lang.Class<?> wildcardClass23 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.0d + "'", double20 == 4.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-3.670069962076287E-24d) + "'", double22 == (-3.670069962076287E-24d));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(0, (double) ' ', (double) (-1));
        double double18 = simpsonIntegration0.f((double) (byte) 10);
        double double22 = simpsonIntegration0.simpsonsMethod((int) (short) -1, 0.9226783964008627d, (double) (byte) 1);
        double double26 = simpsonIntegration0.simpsonsMethod(0, (double) (byte) 1, (double) (-1));
        double double30 = simpsonIntegration0.simpsonsMethod((int) 'a', (-2.3854629903149513d), (double) (-1.0f));
        double double32 = simpsonIntegration0.f((-3.806556146559686E-40d));
        double double36 = simpsonIntegration0.simpsonsMethod((int) (byte) 100, (-1.0d), 4.064880833848463d);
        java.lang.Class<?> wildcardClass37 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 86.98501851068946d + "'", double16 == 86.98501851068946d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.004358393257198546d) + "'", double18 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 2.7182818284590455d + "'", double26 == 2.7182818284590455d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 4.3947944567089737E105d + "'", double30 == 4.3947944567089737E105d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 4.0d + "'", double32 == 4.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 4.179484741423919E45d + "'", double36 == 4.179484741423919E45d);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(0, (double) ' ', (double) (-1));
        double double18 = simpsonIntegration0.f(1.2395293152101427E-40d);
        double double20 = simpsonIntegration0.f((-0.004358393257198546d));
        double double24 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (double) (byte) -1, 2.609103086070402E-5d);
        double double28 = simpsonIntegration0.simpsonsMethod((int) (byte) 1, 0.45257921713188254d, 0.0d);
        double double30 = simpsonIntegration0.f((-0.39478808990516345d));
        java.lang.Class<?> wildcardClass31 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 86.98501851068946d + "'", double16 == 86.98501851068946d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.017452540903338d + "'", double20 == 4.017452540903338d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.3332985455191015d) + "'", double24 == (-1.3332985455191015d));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.9675653539074399d + "'", double28 == 0.9675653539074399d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 5.704975082960015d + "'", double30 == 5.704975082960015d);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double12 = simpsonIntegration0.simpsonsMethod(1, 0.9226783964008627d, 4.058365782993775d);
        double double16 = simpsonIntegration0.simpsonsMethod(100, 2.7182818284590455d, (double) 10.0f);
        double double18 = simpsonIntegration0.f(1.0d);
        double double20 = simpsonIntegration0.f((double) 0.0f);
        java.lang.Class<?> wildcardClass21 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.11021647807132358d) + "'", double12 == (-0.11021647807132358d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.005762150198617093d) + "'", double16 == (-0.005762150198617093d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.103638323514327d + "'", double18 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.0d + "'", double20 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double8 = simpsonIntegration0.f((double) (-1L));
        double double10 = simpsonIntegration0.f(Double.NEGATIVE_INFINITY);
        double double14 = simpsonIntegration0.simpsonsMethod((int) (byte) 10, 4.290977979226583d, (-2.810955993308433E-36d));
        java.lang.Class<?> wildcardClass15 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.154845485377137d + "'", double8 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.NEGATIVE_INFINITY + "'", double10 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.552569468618193d + "'", double14 == 4.552569468618193d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) 'a', 10.0d, 2.002615341358857d);
        double double6 = simpsonIntegration0.f(5.244452246984291d);
        java.lang.Class<?> wildcardClass7 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.016155316979210545d) + "'", double4 == (-0.016155316979210545d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.12402529508953528d) + "'", double6 == (-0.12402529508953528d));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (byte) -1, (-1.8007854031706057E-43d), (double) (byte) 0);
        double double8 = simpsonIntegration0.simpsonsMethod((int) 'a', 4.00000000207581d, (double) (byte) 100);
        java.lang.Class<?> wildcardClass9 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-5.3550489133017936E-40d) + "'", double8 == (-5.3550489133017936E-40d));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        double double16 = simpsonIntegration0.f((double) 10L);
        double double18 = simpsonIntegration0.f((double) (-1L));
        double double22 = simpsonIntegration0.simpsonsMethod(0, (-0.016155316979210545d), (-1.4677877090000082E-17d));
        java.lang.Class<?> wildcardClass23 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 8.154845485377137d + "'", double18 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.021540422638947395d) + "'", double22 == (-0.021540422638947395d));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 0.0d, (double) (byte) 1);
        double double16 = simpsonIntegration0.f((double) (-1));
        double double20 = simpsonIntegration0.simpsonsMethod(0, 3.218233484419937d, 0.6941125599944457d);
        java.lang.Class<?> wildcardClass21 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 8.154845485377137d + "'", double16 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.885248141323014d + "'", double20 == 1.885248141323014d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double16 = simpsonIntegration0.simpsonsMethod(0, 0.0d, 0.9226783964008627d);
        double double18 = simpsonIntegration0.f((double) (-1.0f));
        double double20 = simpsonIntegration0.f(1.332866202146335E-40d);
        java.lang.Class<?> wildcardClass21 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 8.154845485377137d + "'", double18 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.0d + "'", double20 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        double double16 = simpsonIntegration0.f((double) 10L);
        double double20 = simpsonIntegration0.simpsonsMethod(10, 4.552569468618193d, 351.55527719495865d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-4.102827874764563E-148d) + "'", double20 == (-4.102827874764563E-148d));
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (byte) 0, (double) 0L, (double) ' ');
        double double8 = simpsonIntegration0.simpsonsMethod((int) '#', (double) 'a', 0.9226783964008627d);
        double double10 = simpsonIntegration0.f((-0.01453886097417405d));
        double double12 = simpsonIntegration0.f((double) 100L);
        double double14 = simpsonIntegration0.f((double) (short) 1);
        double double18 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (double) (byte) 1, 40.46343442189374d);
        double double22 = simpsonIntegration0.simpsonsMethod(10, (-1.291744886007606E-11d), 2.821207116672178E-62d);
        java.lang.Class<?> wildcardClass23 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.46343442189374d + "'", double8 == 40.46343442189374d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.058365782993775d + "'", double10 == 4.058365782993775d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-3.718587945630428E-40d) + "'", double12 == (-3.718587945630428E-40d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.103638323514327d + "'", double14 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.455109358270963E-15d) + "'", double18 == (-1.455109358270963E-15d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-5.166979544364144E-10d) + "'", double22 == (-5.166979544364144E-10d));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double2 = simpsonIntegration0.f((double) 0);
        double double6 = simpsonIntegration0.simpsonsMethod(0, (double) (byte) -1, (double) 100.0f);
        double double8 = simpsonIntegration0.f(100.0d);
        double double12 = simpsonIntegration0.simpsonsMethod(0, (-0.016155316979210545d), (double) 'a');
        double double16 = simpsonIntegration0.simpsonsMethod((-1), (-0.21545281845024855d), 4.880565806253262d);
        java.lang.Class<?> wildcardClass17 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.2395293152101427E-40d + "'", double6 == 1.2395293152101427E-40d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.718587945630428E-40d) + "'", double8 == (-3.718587945630428E-40d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.7843237572091147E-41d + "'", double12 == 3.7843237572091147E-41d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.0d) + "'", double16 == (-0.0d));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double2 = simpsonIntegration0.f((double) 0);
        double double6 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 1.2395293152101427E-40d, (double) (byte) 10);
        double double8 = simpsonIntegration0.f(0.0d);
        double double10 = simpsonIntegration0.f(2.002615341358857d);
        double double12 = simpsonIntegration0.f(2.002615341358857d);
        double double14 = simpsonIntegration0.f(4.017452540903338d);
        double double16 = simpsonIntegration0.f((double) 10L);
        double double20 = simpsonIntegration0.simpsonsMethod((int) (byte) 1, 1.0d, (-1.291744886007606E-11d));
        double double24 = simpsonIntegration0.simpsonsMethod((int) (short) 100, 1.7012127745299188d, 5.035372138877525E47d);
        double double26 = simpsonIntegration0.f((-0.15495903000016553d));
        java.lang.Class<?> wildcardClass27 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.8007854031706057E-43d) + "'", double6 == (-1.8007854031706057E-43d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.0d + "'", double8 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.0014130171899539316d) + "'", double10 == (-0.0014130171899539316d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.0014130171899539316d) + "'", double12 == (-0.0014130171899539316d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.21850356693465028d) + "'", double14 == (-0.21850356693465028d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.7012127745299188d + "'", double20 == 1.7012127745299188d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 4.642403486852022d + "'", double26 == 4.642403486852022d);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        double double16 = simpsonIntegration0.f((double) 10L);
        double double18 = simpsonIntegration0.f((double) (short) 10);
        double double22 = simpsonIntegration0.simpsonsMethod(100, 0.0d, (-1.3332985455191015d));
        double double24 = simpsonIntegration0.f(4.880565806253262d);
        double double28 = simpsonIntegration0.simpsonsMethod(0, 5.035372138877525E47d, (-0.004358393257198546d));
        java.lang.Class<?> wildcardClass29 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.004358393257198546d) + "'", double18 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-0.15048705932345452d) + "'", double24 == (-0.15048705932345452d));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 6.743122864575795E47d + "'", double28 == 6.743122864575795E47d);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(0, (double) ' ', (double) (-1));
        double double20 = simpsonIntegration0.simpsonsMethod((int) '4', (-0.0014130171899539316d), 133.3298545519102d);
        double double22 = simpsonIntegration0.f(0.0d);
        double double26 = simpsonIntegration0.simpsonsMethod(0, 9.666962960832531E-71d, (-0.21850356693465028d));
        java.lang.Class<?> wildcardClass27 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 86.98501851068946d + "'", double16 == 86.98501851068946d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.687712295743327E-55d + "'", double20 == 1.687712295743327E-55d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.0d + "'", double22 == 4.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.584560339852038E-70d + "'", double26 == 1.584560339852038E-70d);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double2 = simpsonIntegration0.f((double) 0);
        double double6 = simpsonIntegration0.simpsonsMethod(0, (double) (byte) -1, (double) 100.0f);
        double double8 = simpsonIntegration0.f(100.0d);
        double double10 = simpsonIntegration0.f(0.3394344128489119d);
        double double14 = simpsonIntegration0.simpsonsMethod((int) ' ', 1.584560339852038E-70d, 8504.888752167593d);
        java.lang.Class<?> wildcardClass15 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.2395293152101427E-40d + "'", double6 == 1.2395293152101427E-40d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.718587945630428E-40d) + "'", double8 == (-3.718587945630428E-40d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.7666384931515604d + "'", double10 == 2.7666384931515604d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double8 = simpsonIntegration0.f((double) (-1L));
        double double10 = simpsonIntegration0.f((double) 10);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 1.2514464254193938d, 0.0d);
        java.lang.Class<?> wildcardClass15 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.154845485377137d + "'", double8 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.004358393257198546d) + "'", double10 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2.0018152742371256d + "'", double14 == 2.0018152742371256d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        java.lang.Class<?> wildcardClass11 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(10, (-0.0d), (double) (byte) 0);
        double double18 = simpsonIntegration0.f((double) 0L);
        double double22 = simpsonIntegration0.simpsonsMethod((int) (short) 100, (double) 100, (double) 10L);
        double double24 = simpsonIntegration0.f((double) (short) 10);
        java.lang.Class<?> wildcardClass25 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.0d) + "'", double16 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.14527977523995153d) + "'", double22 == (-0.14527977523995153d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-0.004358393257198546d) + "'", double24 == (-0.004358393257198546d));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        double double16 = simpsonIntegration0.f((double) 10L);
        double double18 = simpsonIntegration0.f((double) (-1L));
        double double20 = simpsonIntegration0.f(86.98501851068946d);
        double double22 = simpsonIntegration0.f(0.9226783964008627d);
        double double26 = simpsonIntegration0.simpsonsMethod((int) (short) 10, 0.0d, (double) 0.0f);
        java.lang.Class<?> wildcardClass27 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 8.154845485377137d + "'", double18 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.2634141046617278E-34d) + "'", double20 == (-1.2634141046617278E-34d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.2514464254193938d + "'", double22 == 1.2514464254193938d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double12 = simpsonIntegration0.f((double) 10);
        double double16 = simpsonIntegration0.simpsonsMethod((int) '#', (-1.0d), (double) 100.0f);
        double double18 = simpsonIntegration0.f((double) '#');
        double double20 = simpsonIntegration0.f((double) (byte) -1);
        double double22 = simpsonIntegration0.f(4.154813702961169E-216d);
        java.lang.Class<?> wildcardClass23 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 2.1230017461922604E-25d + "'", double16 == 2.1230017461922604E-25d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-7.698547564139474E-13d) + "'", double18 == (-7.698547564139474E-13d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 8.154845485377137d + "'", double20 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.0d + "'", double22 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double8 = simpsonIntegration0.f(4.678529946300102d);
        double double12 = simpsonIntegration0.simpsonsMethod((int) (byte) 100, 4.115717347876469E-20d, 3.7906927820365864E-25d);
        java.lang.Class<?> wildcardClass13 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.16623315392370067d) + "'", double8 == (-0.16623315392370067d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.6462869391505874E-17d + "'", double12 == 1.6462869391505874E-17d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double2 = simpsonIntegration0.f((double) 0);
        double double6 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 1.2395293152101427E-40d, (double) (byte) 10);
        double double10 = simpsonIntegration0.simpsonsMethod((int) (byte) 100, (double) (byte) 10, (double) (byte) 10);
        double double12 = simpsonIntegration0.f(1.2395293152101427E-40d);
        double double16 = simpsonIntegration0.simpsonsMethod((int) 'a', (double) (short) 1, 1.2514464254193938d);
        java.lang.Class<?> wildcardClass17 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.8007854031706057E-43d) + "'", double6 == (-1.8007854031706057E-43d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.01453886097417405d) + "'", double10 == (-0.01453886097417405d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.0d + "'", double12 == 4.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.5850594265420912d) + "'", double16 == (-0.5850594265420912d));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(0, (double) ' ', (double) (-1));
        double double18 = simpsonIntegration0.f((double) (byte) 10);
        double double22 = simpsonIntegration0.simpsonsMethod((int) (short) -1, 0.9226783964008627d, (double) (byte) 1);
        double double26 = simpsonIntegration0.simpsonsMethod(0, (double) (byte) 1, (double) (-1));
        double double30 = simpsonIntegration0.simpsonsMethod((int) (byte) 1, 2.8306689949230137E-25d, 2.002615341358857d);
        double double32 = simpsonIntegration0.f(133.33333333333334d);
        double double36 = simpsonIntegration0.simpsonsMethod(0, Double.POSITIVE_INFINITY, 0.0d);
        java.lang.Class<?> wildcardClass37 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 86.98501851068946d + "'", double16 == 86.98501851068946d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.004358393257198546d) + "'", double18 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 2.7182818284590455d + "'", double26 == 2.7182818284590455d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-2.6665226325972244E-28d) + "'", double30 == (-2.6665226325972244E-28d));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-2.2072362778100317E-54d) + "'", double32 == (-2.2072362778100317E-54d));
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + Double.POSITIVE_INFINITY + "'", double36 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double12 = simpsonIntegration0.simpsonsMethod(0, (double) 1L, (double) 100.0f);
        double double14 = simpsonIntegration0.f((-0.01453886097417405d));
        java.lang.Class<?> wildcardClass15 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.2395293152101427E-40d) + "'", double12 == (-1.2395293152101427E-40d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.058365782993775d + "'", double14 == 4.058365782993775d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double2 = simpsonIntegration0.f((double) 0);
        double double6 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 1.2395293152101427E-40d, (double) (byte) 10);
        double double10 = simpsonIntegration0.simpsonsMethod((int) (byte) 100, (double) (byte) 10, (double) (byte) 10);
        double double12 = simpsonIntegration0.f(1.2395293152101427E-40d);
        double double16 = simpsonIntegration0.simpsonsMethod((int) 'a', (double) (short) 1, 1.2514464254193938d);
        double double18 = simpsonIntegration0.f((double) 1.0f);
        double double22 = simpsonIntegration0.simpsonsMethod((int) (short) 10, (double) (byte) 0, 7.736386911307096d);
        java.lang.Class<?> wildcardClass23 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.8007854031706057E-43d) + "'", double6 == (-1.8007854031706057E-43d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.01453886097417405d) + "'", double10 == (-0.01453886097417405d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.0d + "'", double12 == 4.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.5850594265420912d) + "'", double16 == (-0.5850594265420912d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.103638323514327d + "'", double18 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.0d) + "'", double22 == (-0.0d));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
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
        java.lang.Class<?> wildcardClass23 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.017959162462641984d) + "'", double16 == (-0.017959162462641984d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-3.718587945630428E-40d) + "'", double20 == (-3.718587945630428E-40d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 2.413675113314953d + "'", double22 == 2.413675113314953d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double14 = simpsonIntegration0.f(10.0d);
        double double16 = simpsonIntegration0.f((double) (short) 10);
        double double20 = simpsonIntegration0.simpsonsMethod((int) (short) 1, 13.318805355809339d, 13.318805355809339d);
        double double24 = simpsonIntegration0.simpsonsMethod(1, (-7.027389983271083E-39d), 4.179484741423919E45d);
        java.lang.Class<?> wildcardClass25 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.004358393257198546d) + "'", double14 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.0012649947976536042d) + "'", double20 == (-0.0012649947976536042d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-0.0d) + "'", double24 == (-0.0d));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        double double16 = simpsonIntegration0.f((double) 10L);
        double double18 = simpsonIntegration0.f((-1.2634141046617278E-34d));
        double double20 = simpsonIntegration0.f((-8.792109355360879E-19d));
        java.lang.Class<?> wildcardClass21 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.0d + "'", double20 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double2 = simpsonIntegration0.f((double) 0);
        double double6 = simpsonIntegration0.simpsonsMethod(0, 2.1230017461922604E-25d, 0.0d);
        java.lang.Class<?> wildcardClass7 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.8306689949230137E-25d + "'", double6 == 2.8306689949230137E-25d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f((double) (-1L));
        double double14 = simpsonIntegration0.simpsonsMethod(1, 40.46343442189374d, 0.0d);
        double double18 = simpsonIntegration0.simpsonsMethod((int) (byte) 10, (double) '#', (double) 0.0f);
        double double22 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-1.039409718471294E-6d), (-1.0781454254561233E-20d));
        java.lang.Class<?> wildcardClass23 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.154845485377137d + "'", double10 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 53.95124589585826d + "'", double14 == 53.95124589585826d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 46.66666666663074d + "'", double18 == 46.66666666663074d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.385879624628392E-6d) + "'", double22 == (-1.385879624628392E-6d));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f((double) (-1L));
        double double14 = simpsonIntegration0.simpsonsMethod(1, 40.46343442189374d, 0.0d);
        double double18 = simpsonIntegration0.simpsonsMethod((int) (byte) 10, (double) '#', (double) 0.0f);
        double double22 = simpsonIntegration0.simpsonsMethod(10, (-3.718587945630428E-40d), (double) (short) 10);
        double double24 = simpsonIntegration0.f((-7.651460376422497E-39d));
        java.lang.Class<?> wildcardClass25 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.154845485377137d + "'", double10 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 53.95124589585826d + "'", double14 == 53.95124589585826d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 46.66666666663074d + "'", double18 == 46.66666666663074d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.6207068628535456E-41d + "'", double22 == 1.6207068628535456E-41d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 4.0d + "'", double24 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
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
        double double26 = simpsonIntegration0.f((-1.7731645398316149E-6d));
        double double28 = simpsonIntegration0.f(7.201889327800033d);
        java.lang.Class<?> wildcardClass29 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.004358393257198546d) + "'", double18 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.005367301737528441d) + "'", double22 == (-0.005367301737528441d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-0.219372853236844d) + "'", double24 == (-0.219372853236844d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 4.000007092661304d + "'", double26 == 4.000007092661304d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-0.03566952446383129d) + "'", double28 == (-0.03566952446383129d));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (byte) 0, (double) 0L, (double) ' ');
        double double8 = simpsonIntegration0.simpsonsMethod((int) '#', (double) 'a', 0.9226783964008627d);
        double double10 = simpsonIntegration0.f((-0.01453886097417405d));
        double double12 = simpsonIntegration0.f((double) 100L);
        double double14 = simpsonIntegration0.f((double) (short) 1);
        double double18 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (double) (byte) 1, 40.46343442189374d);
        double double22 = simpsonIntegration0.simpsonsMethod(1, (-0.2484968469493311d), (-2.6665226325972244E-28d));
        double double26 = simpsonIntegration0.simpsonsMethod((int) (byte) 10, (double) '4', 6.012902566071085E-4d);
        double double28 = simpsonIntegration0.f(1.687712295743327E-55d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.46343442189374d + "'", double8 == 40.46343442189374d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.058365782993775d + "'", double10 == 4.058365782993775d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-3.718587945630428E-40d) + "'", double12 == (-3.718587945630428E-40d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.103638323514327d + "'", double14 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.455109358270963E-15d) + "'", double18 == (-1.455109358270963E-15d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.7495672780391712d) + "'", double22 == (-0.7495672780391712d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 69.2916501436634d + "'", double26 == 69.2916501436634d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 4.0d + "'", double28 == 4.0d);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double16 = simpsonIntegration0.simpsonsMethod(0, 0.0d, 0.9226783964008627d);
        double double18 = simpsonIntegration0.f(86.98501851068946d);
        double double22 = simpsonIntegration0.simpsonsMethod((int) (byte) -1, (-0.0012649947976536042d), 53.95124589585826d);
        double double26 = simpsonIntegration0.simpsonsMethod((int) (byte) 1, (-0.15048705932345452d), (-0.6248127531564629d));
        java.lang.Class<?> wildcardClass27 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.2634141046617278E-34d) + "'", double18 == (-1.2634141046617278E-34d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.0d) + "'", double22 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-0.7084045299481001d) + "'", double26 == (-0.7084045299481001d));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (byte) -1, (-1.8007854031706057E-43d), (double) (byte) 0);
        double double6 = simpsonIntegration0.f((double) 0);
        java.lang.Class<?> wildcardClass7 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double16 = simpsonIntegration0.simpsonsMethod(0, 0.0d, 0.9226783964008627d);
        double double18 = simpsonIntegration0.f(86.98501851068946d);
        double double22 = simpsonIntegration0.simpsonsMethod(0, 1735120.3626874206d, 4.072157215642454d);
        double double24 = simpsonIntegration0.f(8.430431742414195d);
        java.lang.Class<?> wildcardClass25 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.2634141046617278E-34d) + "'", double18 == (-1.2634141046617278E-34d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-124010.55567924457d) + "'", double22 == (-124010.55567924457d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-0.014630273071269208d) + "'", double24 == (-0.014630273071269208d));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(0, (double) ' ', (double) (-1));
        double double18 = simpsonIntegration0.f(1.2395293152101427E-40d);
        double double20 = simpsonIntegration0.f((-0.004358393257198546d));
        double double22 = simpsonIntegration0.f((-0.2100593206839558d));
        double double26 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.3394344128489119d, (-1.0781454254561233E-20d));
        double double28 = simpsonIntegration0.f(4.3947944567089737E105d);
        double double32 = simpsonIntegration0.simpsonsMethod(1, 4.290977979226583d, (double) 100L);
        java.lang.Class<?> wildcardClass33 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 86.98501851068946d + "'", double16 == 86.98501851068946d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.017452540903338d + "'", double20 == 4.017452540903338d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.880565806253262d + "'", double22 == 4.880565806253262d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.45257921713188254d + "'", double26 == 0.45257921713188254d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-0.0d) + "'", double28 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-5.398001628809013E-40d) + "'", double32 == (-5.398001628809013E-40d));
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
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
        double double24 = simpsonIntegration0.f(0.20178029722268845d);
        double double26 = simpsonIntegration0.f(133.33333333333334d);
        double double30 = simpsonIntegration0.simpsonsMethod((int) '4', 0.6963109328077465d, 12723.839736354059d);
        double double34 = simpsonIntegration0.simpsonsMethod(10, 4.115717347876469E-20d, (-0.03566952446383129d));
        java.lang.Class<?> wildcardClass35 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.017959162462641984d) + "'", double16 == (-0.017959162462641984d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-3.718587945630428E-40d) + "'", double20 == (-3.718587945630428E-40d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 2.413675113314953d + "'", double22 == 2.413675113314953d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 3.235822297226532d + "'", double24 == 3.235822297226532d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-2.2072362778100317E-54d) + "'", double26 == (-2.2072362778100317E-54d));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.7055264088989899E-18d + "'", double34 == 1.7055264088989899E-18d);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(0, (double) ' ', (double) (-1));
        double double18 = simpsonIntegration0.f(1.2395293152101427E-40d);
        double double20 = simpsonIntegration0.f((-0.004358393257198546d));
        double double22 = simpsonIntegration0.f((-0.2100593206839558d));
        double double26 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.3394344128489119d, (-1.0781454254561233E-20d));
        double double30 = simpsonIntegration0.simpsonsMethod((int) (short) -1, (-2.1973647973812517E-4d), (-3.3283848740159176E-4d));
        java.lang.Class<?> wildcardClass31 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 86.98501851068946d + "'", double16 == 86.98501851068946d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.017452540903338d + "'", double20 == 4.017452540903338d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.880565806253262d + "'", double22 == 4.880565806253262d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.45257921713188254d + "'", double26 == 0.45257921713188254d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-0.0d) + "'", double30 == (-0.0d));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double14 = simpsonIntegration0.f(10.0d);
        double double16 = simpsonIntegration0.f((double) (short) 10);
        double double20 = simpsonIntegration0.simpsonsMethod((int) (byte) 10, (double) 1, 0.865609122350895d);
        double double24 = simpsonIntegration0.simpsonsMethod(0, (double) (short) 100, (double) (-1));
        double double28 = simpsonIntegration0.simpsonsMethod((int) (byte) 1, 1.415320313230246E34d, 2.7182818284590455d);
        java.lang.Class<?> wildcardClass29 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.004358393257198546d) + "'", double14 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.19222885149765373d) + "'", double20 == (-0.19222885149765373d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 271.8281828459046d + "'", double24 == 271.8281828459046d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-1.0550606958097157E33d) + "'", double28 == (-1.0550606958097157E33d));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double16 = simpsonIntegration0.simpsonsMethod(0, 0.0d, 0.9226783964008627d);
        double double18 = simpsonIntegration0.f((double) 10);
        double double22 = simpsonIntegration0.simpsonsMethod((int) '4', (-3.00839694745219d), (-5.298978042385537d));
        java.lang.Class<?> wildcardClass23 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.004358393257198546d) + "'", double18 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 5.458494683964391E74d + "'", double22 == 5.458494683964391E74d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
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
        java.lang.Class<?> wildcardClass35 = simpsonIntegration0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double12 = simpsonIntegration0.simpsonsMethod(0, (double) 1L, (double) 100.0f);
        double double14 = simpsonIntegration0.f((double) 0L);
        double double16 = simpsonIntegration0.f(7.149920860492725E-6d);
        double double20 = simpsonIntegration0.simpsonsMethod((int) 'a', (-0.12402529508953528d), 0.6963109328077465d);
        java.lang.Class<?> wildcardClass21 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.2395293152101427E-40d) + "'", double12 == (-1.2395293152101427E-40d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 3.99997140036768d + "'", double16 == 3.99997140036768d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 8281404.76069857d + "'", double20 == 8281404.76069857d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(0, (double) ' ', (double) (-1));
        double double18 = simpsonIntegration0.f((double) (byte) 10);
        double double22 = simpsonIntegration0.simpsonsMethod((int) 'a', (double) 100L, (-0.004358393257198546d));
        java.lang.Class<?> wildcardClass23 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 86.98501851068946d + "'", double16 == 86.98501851068946d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.004358393257198546d) + "'", double18 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 133.91508469677794d + "'", double22 == 133.91508469677794d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 0.0d, (double) (byte) 1);
        double double16 = simpsonIntegration0.f((double) (-1));
        double double18 = simpsonIntegration0.f(351.55527719495865d);
        double double22 = simpsonIntegration0.simpsonsMethod((int) (byte) 0, (-0.21979531239781874d), (-4.03791947167852E-20d));
        double double24 = simpsonIntegration0.f(86.98501851068946d);
        java.lang.Class<?> wildcardClass25 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 8.154845485377137d + "'", double16 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-2.590933206896706E-148d) + "'", double18 == (-2.590933206896706E-148d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.29306041653042497d) + "'", double22 == (-0.29306041653042497d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.2634141046617278E-34d) + "'", double24 == (-1.2634141046617278E-34d));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double16 = simpsonIntegration0.simpsonsMethod(0, 0.0d, 0.9226783964008627d);
        double double18 = simpsonIntegration0.f((double) (short) 0);
        double double22 = simpsonIntegration0.simpsonsMethod(0, 2.8306689949230137E-25d, (-0.004358393257198546d));
        java.lang.Class<?> wildcardClass23 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 3.7906927820365864E-25d + "'", double22 == 3.7906927820365864E-25d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
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
        double double40 = simpsonIntegration0.simpsonsMethod((int) '4', (-0.14725712270254981d), (-0.20064417731540868d));
        java.lang.Class<?> wildcardClass41 = simpsonIntegration0.getClass();
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
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 113888.0642537291d + "'", double40 == 113888.0642537291d);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(0, (double) ' ', (double) (-1));
        double double18 = simpsonIntegration0.f((double) (byte) 10);
        double double22 = simpsonIntegration0.simpsonsMethod((int) (short) -1, 0.9226783964008627d, (double) (byte) 1);
        double double26 = simpsonIntegration0.simpsonsMethod((int) (byte) -1, 4.0d, 1.0d);
        double double28 = simpsonIntegration0.f(4.005654064435647d);
        java.lang.Class<?> wildcardClass29 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 86.98501851068946d + "'", double16 == 86.98501851068946d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.004358393257198546d) + "'", double18 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-0.219372853236844d) + "'", double28 == (-0.219372853236844d));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) ' ', 0.0d, 0.0d);
        double double6 = simpsonIntegration0.f((double) (byte) 0);
        double double8 = simpsonIntegration0.f((double) 100.0f);
        double double12 = simpsonIntegration0.simpsonsMethod((int) '#', (-0.21978714703739602d), 133.91508469677794d);
        java.lang.Class<?> wildcardClass13 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.718587945630428E-40d) + "'", double8 == (-3.718587945630428E-40d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 2.3024062608264327E-51d + "'", double12 == 2.3024062608264327E-51d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 0.0d, (double) (byte) 1);
        double double16 = simpsonIntegration0.f((double) 1L);
        double double18 = simpsonIntegration0.f(8.154845485377137d);
        double double20 = simpsonIntegration0.f(1.2395293152101427E-40d);
        double double22 = simpsonIntegration0.f((-1.2634141046617278E-34d));
        double double24 = simpsonIntegration0.f((double) ' ');
        java.lang.Class<?> wildcardClass25 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.103638323514327d + "'", double16 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.017959162462641984d) + "'", double18 == (-0.017959162462641984d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.0d + "'", double20 == 4.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.0d + "'", double22 == 4.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.291744886007606E-11d) + "'", double24 == (-1.291744886007606E-11d));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        double double16 = simpsonIntegration0.f((double) 10L);
        double double18 = simpsonIntegration0.f((-1.2634141046617278E-34d));
        double double20 = simpsonIntegration0.f((-8.792109355360879E-19d));
        double double22 = simpsonIntegration0.f((-0.21978736206516547d));
        java.lang.Class<?> wildcardClass23 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.0d + "'", double20 == 4.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.923066394071297d + "'", double22 == 4.923066394071297d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(10, (-0.0d), (double) (byte) 0);
        double double18 = simpsonIntegration0.f((double) 0L);
        double double22 = simpsonIntegration0.simpsonsMethod((int) (short) 100, (double) 100, (double) 10L);
        double double24 = simpsonIntegration0.f((double) (short) 10);
        double double26 = simpsonIntegration0.f(53.95124589585826d);
        double double28 = simpsonIntegration0.f((-0.08927106357638526d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.0d) + "'", double16 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.14527977523995153d) + "'", double22 == (-0.14527977523995153d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-0.004358393257198546d) + "'", double24 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0781454254561233E-20d) + "'", double26 == (-1.0781454254561233E-20d));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 4.364794489183566d + "'", double28 == 4.364794489183566d);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double16 = simpsonIntegration0.simpsonsMethod(0, 0.0d, 0.9226783964008627d);
        double double18 = simpsonIntegration0.f(86.98501851068946d);
        double double22 = simpsonIntegration0.simpsonsMethod((int) (byte) -1, (-0.0012649947976536042d), 53.95124589585826d);
        double double26 = simpsonIntegration0.simpsonsMethod((int) '#', 4.92310118030922d, 4.072157215642454d);
        java.lang.Class<?> wildcardClass27 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.2634141046617278E-34d) + "'", double18 == (-1.2634141046617278E-34d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.0d) + "'", double22 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-0.41503840884717663d) + "'", double26 == (-0.41503840884717663d));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod((int) 'a', (double) 100.0f, (double) 10.0f);
        double double18 = simpsonIntegration0.simpsonsMethod((int) (byte) 1, (double) 100L, 2.609103086070402E-5d);
        double double20 = simpsonIntegration0.f((-0.6537519371611368d));
        java.lang.Class<?> wildcardClass21 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.14527977523995153d) + "'", double14 == (-0.14527977523995153d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 133.3298545519102d + "'", double18 == 133.3298545519102d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 6.869201790086779d + "'", double20 == 6.869201790086779d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double8 = simpsonIntegration0.f((double) (-1L));
        double double10 = simpsonIntegration0.f(Double.NEGATIVE_INFINITY);
        double double14 = simpsonIntegration0.simpsonsMethod((int) ' ', (-0.14527977523995153d), (-0.2297560765487938d));
        java.lang.Class<?> wildcardClass15 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.154845485377137d + "'", double8 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.NEGATIVE_INFINITY + "'", double10 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1586.410651560393d + "'", double14 == 1586.410651560393d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double12 = simpsonIntegration0.simpsonsMethod(0, (double) 1L, (double) 100.0f);
        double double14 = simpsonIntegration0.f((-1.0781454254561233E-20d));
        double double18 = simpsonIntegration0.simpsonsMethod((int) (byte) 0, (-0.001693227728973961d), (-0.11021647807132358d));
        double double22 = simpsonIntegration0.simpsonsMethod(100, (-2.0076911253185856E-16d), 4.031290735472884d);
        java.lang.Class<?> wildcardClass23 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.2395293152101427E-40d) + "'", double12 == (-1.2395293152101427E-40d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.0025130411114009576d) + "'", double18 == (-0.0025130411114009576d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.366283488214899E-15d + "'", double22 == 4.366283488214899E-15d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        double double16 = simpsonIntegration0.f(8.154845485377137d);
        double double20 = simpsonIntegration0.simpsonsMethod((int) (short) 100, (-7.047753488102803E-20d), 468.7403695932782d);
        double double22 = simpsonIntegration0.f((-1.2280915787237313E-17d));
        double double26 = simpsonIntegration0.simpsonsMethod((int) (byte) 100, (-0.14725712270254981d), 46.66666666663074d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.017959162462641984d) + "'", double16 == (-0.017959162462641984d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.154813702961169E-216d + "'", double20 == 4.154813702961169E-216d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.0d + "'", double22 == 4.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.4537517738744065E-11d + "'", double26 == 1.4537517738744065E-11d);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f((double) (-1L));
        double double14 = simpsonIntegration0.simpsonsMethod(1, 40.46343442189374d, 0.0d);
        double double18 = simpsonIntegration0.simpsonsMethod((int) (byte) 10, (double) '#', (double) 0.0f);
        double double20 = simpsonIntegration0.f(133.3298545519102d);
        double double22 = simpsonIntegration0.f((-7.027389983271083E-39d));
        double double26 = simpsonIntegration0.simpsonsMethod((int) (byte) 0, 1.0d, (-0.39478808990516345d));
        java.lang.Class<?> wildcardClass27 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.154845485377137d + "'", double10 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 53.95124589585826d + "'", double14 == 53.95124589585826d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 46.66666666663074d + "'", double18 == 46.66666666663074d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-2.2148125385032659E-54d) + "'", double20 == (-2.2148125385032659E-54d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.0d + "'", double22 == 4.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.9016583609866715d + "'", double26 == 1.9016583609866715d);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double14 = simpsonIntegration0.f((double) (byte) 10);
        double double18 = simpsonIntegration0.simpsonsMethod((int) (byte) 1, 5.494346108142295E-216d, 4.3947944567089737E105d);
        java.lang.Class<?> wildcardClass19 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.004358393257198546d) + "'", double14 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double2 = simpsonIntegration0.f((double) 0);
        double double6 = simpsonIntegration0.simpsonsMethod(0, (double) (byte) -1, (double) 100.0f);
        double double8 = simpsonIntegration0.f(100.0d);
        double double10 = simpsonIntegration0.f(2.413675113314953d);
        double double12 = simpsonIntegration0.f(0.0d);
        java.lang.Class<?> wildcardClass13 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.2395293152101427E-40d + "'", double6 == 1.2395293152101427E-40d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.718587945630428E-40d) + "'", double8 == (-3.718587945630428E-40d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.16338567387879238d) + "'", double10 == (-0.16338567387879238d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.0d + "'", double12 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (byte) 0, (double) 0L, (double) ' ');
        double double6 = simpsonIntegration0.f((-1.8007854031706057E-43d));
        double double10 = simpsonIntegration0.simpsonsMethod((int) (short) 10, 4.017452540903338d, (-1.2634141046617278E-34d));
        double double14 = simpsonIntegration0.simpsonsMethod(1, 1.3573857385474846d, 19.13477449062135d);
        double double16 = simpsonIntegration0.f(0.0d);
        java.lang.Class<?> wildcardClass17 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.129134273777278d + "'", double10 == 4.129134273777278d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.039409718471294E-6d) + "'", double14 == (-1.039409718471294E-6d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.0d + "'", double16 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double14 = simpsonIntegration0.f((double) (byte) 10);
        double double18 = simpsonIntegration0.simpsonsMethod((int) (short) 100, 2.0018152742371256d, 4.880565806253262d);
        double double20 = simpsonIntegration0.f(5.244452246984291d);
        double double24 = simpsonIntegration0.simpsonsMethod((int) 'a', 468.7403695932782d, 4.0013314647187705d);
        double double26 = simpsonIntegration0.f((double) '#');
        java.lang.Class<?> wildcardClass27 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.004358393257198546d) + "'", double14 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.23948687210556677d) + "'", double18 == (-0.23948687210556677d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.12402529508953528d) + "'", double20 == (-0.12402529508953528d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-34.3258709728719d) + "'", double24 == (-34.3258709728719d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-7.698547564139474E-13d) + "'", double26 == (-7.698547564139474E-13d));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double2 = simpsonIntegration0.f((double) 0);
        double double6 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 1.2395293152101427E-40d, (double) (byte) 10);
        double double8 = simpsonIntegration0.f(4.072157215642454d);
        double double10 = simpsonIntegration0.f((-8.17767075505095d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.8007854031706057E-43d) + "'", double6 == (-1.8007854031706057E-43d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.2144125992859175d) + "'", double8 == (-0.2144125992859175d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-223867.1856878668d) + "'", double10 == (-223867.1856878668d));
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f((double) (-1L));
        double double14 = simpsonIntegration0.simpsonsMethod(1, 40.46343442189374d, 0.0d);
        double double18 = simpsonIntegration0.simpsonsMethod((int) (byte) 10, (double) '#', (double) 0.0f);
        java.lang.Class<?> wildcardClass19 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.154845485377137d + "'", double10 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 53.95124589585826d + "'", double14 == 53.95124589585826d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 46.66666666663074d + "'", double18 == 46.66666666663074d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
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
        double double30 = simpsonIntegration0.simpsonsMethod(10, (-7.027389983271083E-39d), (-0.21978766666481014d));
        double double34 = simpsonIntegration0.simpsonsMethod((int) (byte) 100, 3.3511754945332024d, (-1.0781454254561233E-20d));
        java.lang.Class<?> wildcardClass35 = simpsonIntegration0.getClass();
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
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-3.459631683047994E-37d) + "'", double30 == (-3.459631683047994E-37d));
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 3.204500014245096d + "'", double34 == 3.204500014245096d);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) ' ', 0.0d, 0.0d);
        double double6 = simpsonIntegration0.f(0.0d);
        double double8 = simpsonIntegration0.f(4.000007092661304d);
        java.lang.Class<?> wildcardClass9 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.21978714703739602d) + "'", double8 == (-0.21978714703739602d));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double12 = simpsonIntegration0.simpsonsMethod(0, (double) 1L, (double) 100.0f);
        double double14 = simpsonIntegration0.f((-1.0781454254561233E-20d));
        double double18 = simpsonIntegration0.simpsonsMethod((int) '#', 177.83695398750095d, (-3.806556146559686E-40d));
        double double20 = simpsonIntegration0.f((-0.7317724584449441d));
        double double24 = simpsonIntegration0.simpsonsMethod(1, (-0.0014130171899539316d), 2.7666384931515604d);
        double double26 = simpsonIntegration0.f((-3.79553963179095E-43d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.2395293152101427E-40d) + "'", double12 == (-1.2395293152101427E-40d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 237.11593865000125d + "'", double18 == 237.11593865000125d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 7.201889327800033d + "'", double20 == 7.201889327800033d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 2.1635407177761077E-4d + "'", double24 == 2.1635407177761077E-4d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 4.0d + "'", double26 == 4.0d);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (byte) 0, (double) 0L, (double) ' ');
        double double8 = simpsonIntegration0.simpsonsMethod((int) '#', (double) 'a', 0.9226783964008627d);
        double double10 = simpsonIntegration0.f((-0.01453886097417405d));
        double double12 = simpsonIntegration0.f((double) 100L);
        double double14 = simpsonIntegration0.f((double) (short) 1);
        double double18 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (double) (byte) 1, 40.46343442189374d);
        double double22 = simpsonIntegration0.simpsonsMethod(1, (-0.2484968469493311d), (-2.6665226325972244E-28d));
        java.lang.Class<?> wildcardClass23 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.46343442189374d + "'", double8 == 40.46343442189374d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.058365782993775d + "'", double10 == 4.058365782993775d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-3.718587945630428E-40d) + "'", double12 == (-3.718587945630428E-40d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.103638323514327d + "'", double14 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.455109358270963E-15d) + "'", double18 == (-1.455109358270963E-15d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.7495672780391712d) + "'", double22 == (-0.7495672780391712d));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double8 = simpsonIntegration0.f((double) (-1L));
        java.lang.Class<?> wildcardClass9 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.154845485377137d + "'", double8 == 8.154845485377137d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double12 = simpsonIntegration0.simpsonsMethod(0, (double) 1L, (double) 100.0f);
        double double14 = simpsonIntegration0.f((-2.6665226325972244E-28d));
        double double16 = simpsonIntegration0.f(316.15458486666836d);
        double double18 = simpsonIntegration0.f(5.013142936481665E9d);
        java.lang.Class<?> wildcardClass19 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.2395293152101427E-40d) + "'", double12 == (-1.2395293152101427E-40d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-4.961236754861211E-133d) + "'", double16 == (-4.961236754861211E-133d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.0d) + "'", double18 == (-0.0d));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double16 = simpsonIntegration0.simpsonsMethod(0, 0.0d, 0.9226783964008627d);
        double double18 = simpsonIntegration0.f((double) (short) 0);
        java.lang.Class<?> wildcardClass19 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        double double16 = simpsonIntegration0.f((double) 10L);
        double double18 = simpsonIntegration0.f((-1.2634141046617278E-34d));
        double double20 = simpsonIntegration0.f((-8.792109355360879E-19d));
        double double24 = simpsonIntegration0.simpsonsMethod((-1), (-0.20891526061417334d), 4.522636368713808d);
        java.lang.Class<?> wildcardClass25 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.0d + "'", double20 == 4.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-0.0d) + "'", double24 == (-0.0d));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, (double) (byte) 10, (-1.2395293152101427E-40d));
        double double14 = simpsonIntegration0.simpsonsMethod((int) (short) 10, (double) (-1.0f), 0.0d);
        double double16 = simpsonIntegration0.f(1.777154880761807E-40d);
        java.lang.Class<?> wildcardClass17 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 13.318805355809339d + "'", double10 == 13.318805355809339d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1735120.3626874206d + "'", double14 == 1735120.3626874206d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.0d + "'", double16 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(0, (double) ' ', (double) (-1));
        double double18 = simpsonIntegration0.f((double) (byte) 10);
        double double20 = simpsonIntegration0.f((double) (byte) 10);
        double double24 = simpsonIntegration0.simpsonsMethod(0, (-1.693539419598958E-19d), (-2.7847089655510492E-45d));
        java.lang.Class<?> wildcardClass25 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 86.98501851068946d + "'", double16 == 86.98501851068946d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.004358393257198546d) + "'", double18 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.004358393257198546d) + "'", double20 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-2.2580525594652775E-19d) + "'", double24 == (-2.2580525594652775E-19d));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(10, (-0.0d), (double) (byte) 0);
        double double18 = simpsonIntegration0.f((double) 0L);
        double double20 = simpsonIntegration0.f(4.005654064435647d);
        double double22 = simpsonIntegration0.f((-0.21978766666176455d));
        java.lang.Class<?> wildcardClass23 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.0d) + "'", double16 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.219372853236844d) + "'", double20 == (-0.219372853236844d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.923067726815203d + "'", double22 == 4.923067726815203d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 0.0d, (double) (byte) 1);
        double double16 = simpsonIntegration0.f((double) 1L);
        double double18 = simpsonIntegration0.f(8.154845485377137d);
        double double20 = simpsonIntegration0.f(1.2395293152101427E-40d);
        double double22 = simpsonIntegration0.f((-1.2634141046617278E-34d));
        double double24 = simpsonIntegration0.f((double) ' ');
        double double26 = simpsonIntegration0.f((-8.792109355360879E-19d));
        java.lang.Class<?> wildcardClass27 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.103638323514327d + "'", double16 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.017959162462641984d) + "'", double18 == (-0.017959162462641984d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.0d + "'", double20 == 4.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.0d + "'", double22 == 4.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.291744886007606E-11d) + "'", double24 == (-1.291744886007606E-11d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 4.0d + "'", double26 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
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
        double double30 = simpsonIntegration0.f((double) 'a');
        double double32 = simpsonIntegration0.f(0.0d);
        java.lang.Class<?> wildcardClass33 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 86.98501851068946d + "'", double16 == 86.98501851068946d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.004358393257198546d) + "'", double18 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 2.7182818284590455d + "'", double26 == 2.7182818284590455d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 4.0d + "'", double28 == 4.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-7.027389983271083E-39d) + "'", double30 == (-7.027389983271083E-39d));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 4.0d + "'", double32 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double2 = simpsonIntegration0.f((double) 0);
        double double6 = simpsonIntegration0.simpsonsMethod(0, (double) (byte) -1, (double) 100.0f);
        double double8 = simpsonIntegration0.f(8.154845485377137d);
        double double10 = simpsonIntegration0.f(2.413675113314953d);
        double double14 = simpsonIntegration0.simpsonsMethod((int) (short) 1, 4.3947944567089737E105d, (double) 'a');
        double double16 = simpsonIntegration0.f((-1.7731645398316149E-6d));
        java.lang.Class<?> wildcardClass17 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.2395293152101427E-40d + "'", double6 == 1.2395293152101427E-40d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.017959162462641984d) + "'", double8 == (-0.017959162462641984d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.16338567387879238d) + "'", double10 == (-0.16338567387879238d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0294644847870642E67d) + "'", double14 == (-1.0294644847870642E67d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.000007092661304d + "'", double16 == 4.000007092661304d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(0, (double) ' ', (double) (-1));
        double double18 = simpsonIntegration0.f((double) (byte) 10);
        double double22 = simpsonIntegration0.simpsonsMethod((int) (short) -1, 0.9226783964008627d, (double) (byte) 1);
        double double26 = simpsonIntegration0.simpsonsMethod((int) (byte) -1, 4.0d, 1.0d);
        double double28 = simpsonIntegration0.f(4.005654064435647d);
        double double30 = simpsonIntegration0.f((-7.651460376422497E-39d));
        double double32 = simpsonIntegration0.f(1.3678875951919236d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 86.98501851068946d + "'", double16 == 86.98501851068946d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.004358393257198546d) + "'", double18 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-0.219372853236844d) + "'", double28 == (-0.219372853236844d));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 4.0d + "'", double30 == 4.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.5421080632863339d + "'", double32 == 0.5421080632863339d);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double2 = simpsonIntegration0.f((double) 0);
        double double6 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 1.2395293152101427E-40d, (double) (byte) 10);
        double double8 = simpsonIntegration0.f(0.0d);
        double double10 = simpsonIntegration0.f(2.002615341358857d);
        double double12 = simpsonIntegration0.f(2.002615341358857d);
        double double14 = simpsonIntegration0.f(4.017452540903338d);
        double double16 = simpsonIntegration0.f((double) 10L);
        double double18 = simpsonIntegration0.f((-1.2216106046044858E-18d));
        java.lang.Class<?> wildcardClass19 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.8007854031706057E-43d) + "'", double6 == (-1.8007854031706057E-43d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.0d + "'", double8 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.0014130171899539316d) + "'", double10 == (-0.0014130171899539316d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.0014130171899539316d) + "'", double12 == (-0.0014130171899539316d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.21850356693465028d) + "'", double14 == (-0.21850356693465028d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double12 = simpsonIntegration0.f((double) 10);
        double double16 = simpsonIntegration0.simpsonsMethod((int) '#', (-1.0d), (double) 100.0f);
        double double18 = simpsonIntegration0.f((double) '#');
        double double20 = simpsonIntegration0.f((double) (byte) -1);
        double double22 = simpsonIntegration0.f(0.0d);
        double double24 = simpsonIntegration0.f(3.652737548989758d);
        double double26 = simpsonIntegration0.f(0.6941125599944457d);
        java.lang.Class<?> wildcardClass27 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 2.1230017461922604E-25d + "'", double16 == 2.1230017461922604E-25d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-7.698547564139474E-13d) + "'", double18 == (-7.698547564139474E-13d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 8.154845485377137d + "'", double20 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.0d + "'", double22 == 4.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-0.24215807452852617d) + "'", double24 == (-0.24215807452852617d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.7574064937642173d + "'", double26 == 1.7574064937642173d);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(0, (double) ' ', (double) (-1));
        double double18 = simpsonIntegration0.f((double) (byte) 10);
        double double22 = simpsonIntegration0.simpsonsMethod((int) 'a', (double) 100L, (-0.004358393257198546d));
        double double26 = simpsonIntegration0.simpsonsMethod((int) (byte) 0, (-0.016155316979210545d), (-124010.55567924457d));
        java.lang.Class<?> wildcardClass27 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 86.98501851068946d + "'", double16 == 86.98501851068946d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.004358393257198546d) + "'", double18 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 133.91508469677794d + "'", double22 == 133.91508469677794d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + Double.POSITIVE_INFINITY + "'", double26 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(0, (double) ' ', (double) (-1));
        double double18 = simpsonIntegration0.f((double) (byte) 10);
        double double22 = simpsonIntegration0.simpsonsMethod((-1), 0.20178029722268845d, 237.11593865000125d);
        double double26 = simpsonIntegration0.simpsonsMethod((int) (byte) 1, 8.430431742414195d, 7.423268877573701E-25d);
        java.lang.Class<?> wildcardClass27 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 86.98501851068946d + "'", double16 == 86.98501851068946d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.004358393257198546d) + "'", double18 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 11.199462483718854d + "'", double26 == 11.199462483718854d);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (byte) 0, (double) 0L, (double) ' ');
        double double6 = simpsonIntegration0.f((-1.8007854031706057E-43d));
        double double10 = simpsonIntegration0.simpsonsMethod((int) (short) 10, 4.017452540903338d, (-1.2634141046617278E-34d));
        double double12 = simpsonIntegration0.f(6.869201790086779d);
        java.lang.Class<?> wildcardClass13 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.129134273777278d + "'", double10 == 4.129134273777278d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.04488341326713284d) + "'", double12 == (-0.04488341326713284d));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double14 = simpsonIntegration0.f(10.0d);
        double double16 = simpsonIntegration0.f((double) (short) 10);
        double double20 = simpsonIntegration0.simpsonsMethod((int) (short) 1, 13.318805355809339d, 13.318805355809339d);
        double double22 = simpsonIntegration0.f((-1.3332985455191015d));
        double double26 = simpsonIntegration0.simpsonsMethod((int) (byte) 10, 4.3947944567089737E105d, 4.000000000003079d);
        double double28 = simpsonIntegration0.f(1.1005454154423282d);
        double double30 = simpsonIntegration0.f((double) (byte) 10);
        java.lang.Class<?> wildcardClass31 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.004358393257198546d) + "'", double14 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.0012649947976536042d) + "'", double20 == (-0.0012649947976536042d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 8.430431742414195d + "'", double22 == 8.430431742414195d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-3.219738730368386E104d) + "'", double26 == (-3.219738730368386E104d));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.9278046308322911d + "'", double28 == 0.9278046308322911d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-0.004358393257198546d) + "'", double30 == (-0.004358393257198546d));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double2 = simpsonIntegration0.f((double) 0);
        double double6 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 1.2395293152101427E-40d, (double) (byte) 10);
        double double10 = simpsonIntegration0.simpsonsMethod((int) (byte) 100, (double) (byte) 10, (double) (byte) 10);
        double double14 = simpsonIntegration0.simpsonsMethod((int) (short) 100, (-0.29306041653042497d), 37867.06926325643d);
        double double18 = simpsonIntegration0.simpsonsMethod((int) (byte) 0, (-0.29259450005390564d), (-1.1752745249820245E-17d));
        java.lang.Class<?> wildcardClass19 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.8007854031706057E-43d) + "'", double6 == (-1.8007854031706057E-43d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.01453886097417405d) + "'", double10 == (-0.01453886097417405d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.0d) + "'", double14 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.3901260000718742d) + "'", double18 == (-0.3901260000718742d));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double2 = simpsonIntegration0.f((double) 0);
        double double4 = simpsonIntegration0.f((double) 1L);
        java.lang.Class<?> wildcardClass5 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.103638323514327d + "'", double4 == 1.103638323514327d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double14 = simpsonIntegration0.simpsonsMethod((int) (short) 10, (double) (byte) 1, (-1.2634141046617278E-34d));
        double double16 = simpsonIntegration0.f(4.880565806253262d);
        double double18 = simpsonIntegration0.f(4.000004157639954d);
        double double20 = simpsonIntegration0.f(8.154845485377137d);
        double double24 = simpsonIntegration0.simpsonsMethod((int) 'a', 46.66666666663074d, (-0.7317724584449441d));
        double double28 = simpsonIntegration0.simpsonsMethod((int) '#', (-124010.55567924457d), 1.103638323514327d);
        double double30 = simpsonIntegration0.f(271.8281828459046d);
        java.lang.Class<?> wildcardClass31 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2.002615341358857d + "'", double14 == 2.002615341358857d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.15048705932345452d) + "'", double16 == (-0.15048705932345452d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.21978736206516547d) + "'", double18 == (-0.21978736206516547d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.017959162462641984d) + "'", double20 == (-0.017959162462641984d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 112.02938954346982d + "'", double24 == 112.02938954346982d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + Double.POSITIVE_INFINITY + "'", double28 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-6.532593241661005E-114d) + "'", double30 == (-6.532593241661005E-114d));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double14 = simpsonIntegration0.f((-0.6360598969347263d));
        java.lang.Class<?> wildcardClass15 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 6.791846724745044d + "'", double14 == 6.791846724745044d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 0.0d, (double) (byte) 1);
        double double16 = simpsonIntegration0.f((double) 1L);
        double double18 = simpsonIntegration0.f(4.0d);
        double double20 = simpsonIntegration0.f(4.058365782993775d);
        double double24 = simpsonIntegration0.simpsonsMethod((int) (byte) 100, (-0.005762150198617093d), 6.012902566071085E-4d);
        java.lang.Class<?> wildcardClass25 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.103638323514327d + "'", double16 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.21978766666481014d) + "'", double18 == (-0.21978766666481014d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.21545281845024855d) + "'", double20 == (-0.21545281845024855d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-3.0168047656133004d) + "'", double24 == (-3.0168047656133004d));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double8 = simpsonIntegration0.f((double) (-1L));
        double double10 = simpsonIntegration0.f(Double.NEGATIVE_INFINITY);
        double double14 = simpsonIntegration0.simpsonsMethod((int) ' ', (-0.14527977523995153d), (-0.2297560765487938d));
        double double16 = simpsonIntegration0.f(7.736386911307096d);
        double double20 = simpsonIntegration0.simpsonsMethod((int) '4', 13.318805355809339d, 4.296180111033149E59d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.154845485377137d + "'", double8 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.NEGATIVE_INFINITY + "'", double10 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1586.410651560393d + "'", double14 == 1586.410651560393d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.02438743442391897d) + "'", double16 == (-0.02438743442391897d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(0, (double) ' ', (double) (-1));
        double double18 = simpsonIntegration0.f((double) (byte) 10);
        double double20 = simpsonIntegration0.f((double) (byte) 10);
        double double24 = simpsonIntegration0.simpsonsMethod((-1), (double) 'a', 2.8306689949230137E-25d);
        double double26 = simpsonIntegration0.f((-0.03322074426088808d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 86.98501851068946d + "'", double16 == 86.98501851068946d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.004358393257198546d) + "'", double18 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.004358393257198546d) + "'", double20 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 4.133973962456099d + "'", double26 == 4.133973962456099d);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod((int) 'a', (double) 100.0f, (double) 10.0f);
        double double18 = simpsonIntegration0.simpsonsMethod((int) (short) 10, (double) ' ', 2.7182818284590455d);
        java.lang.Class<?> wildcardClass19 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.14527977523995153d) + "'", double14 == (-0.14527977523995153d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-2.3854629903149513d) + "'", double18 == (-2.3854629903149513d));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double2 = simpsonIntegration0.f((double) 0);
        double double6 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 1.2395293152101427E-40d, (double) (byte) 10);
        double double8 = simpsonIntegration0.f(0.0d);
        double double10 = simpsonIntegration0.f(2.002615341358857d);
        double double12 = simpsonIntegration0.f(1.2395293152101427E-40d);
        java.lang.Class<?> wildcardClass13 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.8007854031706057E-43d) + "'", double6 == (-1.8007854031706057E-43d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.0d + "'", double8 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.0014130171899539316d) + "'", double10 == (-0.0014130171899539316d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.0d + "'", double12 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double14 = simpsonIntegration0.f(10.0d);
        double double16 = simpsonIntegration0.f((double) (short) 10);
        double double20 = simpsonIntegration0.simpsonsMethod((int) (byte) 10, (double) 1, 0.865609122350895d);
        double double24 = simpsonIntegration0.simpsonsMethod(0, (double) (short) 100, (double) (-1));
        double double28 = simpsonIntegration0.simpsonsMethod((int) ' ', 1.103638323514327d, (double) 10);
        double double30 = simpsonIntegration0.f((-1.0246151676860008E-54d));
        double double34 = simpsonIntegration0.simpsonsMethod((-1), (-0.24684720032875246d), 46.66666666663074d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.004358393257198546d) + "'", double14 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.19222885149765373d) + "'", double20 == (-0.19222885149765373d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 271.8281828459046d + "'", double24 == 271.8281828459046d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-0.005372034579787903d) + "'", double28 == (-0.005372034579787903d));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 4.0d + "'", double30 == 4.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-0.0d) + "'", double34 == (-0.0d));
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double12 = simpsonIntegration0.simpsonsMethod(1, 0.9226783964008627d, 4.058365782993775d);
        double double14 = simpsonIntegration0.f(0.0d);
        double double16 = simpsonIntegration0.f((-1.6271151591768237E-19d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.11021647807132358d) + "'", double12 == (-0.11021647807132358d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.0d + "'", double16 == 4.0d);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double12 = simpsonIntegration0.simpsonsMethod(1, 0.9226783964008627d, 4.058365782993775d);
        double double16 = simpsonIntegration0.simpsonsMethod(100, 2.7182818284590455d, (double) 10.0f);
        double double20 = simpsonIntegration0.simpsonsMethod((-1), (-7.698547564139474E-13d), (-0.017959162462641984d));
        double double24 = simpsonIntegration0.simpsonsMethod((int) (byte) 0, 115.98002468091927d, (-0.11021647807132358d));
        java.lang.Class<?> wildcardClass25 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.11021647807132358d) + "'", double12 == (-0.11021647807132358d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.005762150198617093d) + "'", double16 == (-0.005762150198617093d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.0d) + "'", double20 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 172.13430015173705d + "'", double24 == 172.13430015173705d);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double16 = simpsonIntegration0.simpsonsMethod(0, 0.0d, 0.9226783964008627d);
        double double18 = simpsonIntegration0.f((double) 10);
        double double22 = simpsonIntegration0.simpsonsMethod((int) (byte) 1, (double) (short) 1, 0.0d);
        double double24 = simpsonIntegration0.f((-0.004358393257198546d));
        double double28 = simpsonIntegration0.simpsonsMethod((int) '4', (-0.21978714703739602d), 0.0d);
        java.lang.Class<?> wildcardClass29 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.004358393257198546d) + "'", double18 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.7012127745047754d + "'", double22 == 1.7012127745047754d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 4.017452540903338d + "'", double24 == 4.017452540903338d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 9724445.562448898d + "'", double28 == 9724445.562448898d);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(10, (-0.0d), (double) (byte) 0);
        double double18 = simpsonIntegration0.f((double) 0L);
        double double22 = simpsonIntegration0.simpsonsMethod((int) (short) 100, (double) 100, (double) 10L);
        double double24 = simpsonIntegration0.f((double) (short) 10);
        double double26 = simpsonIntegration0.f(53.95124589585826d);
        double double30 = simpsonIntegration0.simpsonsMethod(0, (-1.2634141046617278E-34d), (double) (byte) 10);
        double double34 = simpsonIntegration0.simpsonsMethod(0, 2.485648803550844E-41d, 0.9226783964008627d);
        java.lang.Class<?> wildcardClass35 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.0d) + "'", double16 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.14527977523995153d) + "'", double22 == (-0.14527977523995153d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-0.004358393257198546d) + "'", double24 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0781454254561233E-20d) + "'", double26 == (-1.0781454254561233E-20d));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.835485171602404E-37d + "'", double30 == 1.835485171602404E-37d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.0368854366838988E-41d + "'", double34 == 1.0368854366838988E-41d);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
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
        java.lang.Class<?> wildcardClass45 = simpsonIntegration0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double8 = simpsonIntegration0.f((double) (-1L));
        double double10 = simpsonIntegration0.f((double) 10);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 1.2514464254193938d, 0.0d);
        double double18 = simpsonIntegration0.simpsonsMethod(10, (-0.01453886097417405d), 9.931906770383255E-23d);
        double double20 = simpsonIntegration0.f(1.7010219573714175E-40d);
        double double24 = simpsonIntegration0.simpsonsMethod((int) '#', 0.865609122350895d, (-7.027389983271083E-39d));
        double double28 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 4.154813702961169E-216d, 0.00821321538610416d);
        double double32 = simpsonIntegration0.simpsonsMethod((int) (byte) -1, (double) 'a', 4.0d);
        java.lang.Class<?> wildcardClass33 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.154845485377137d + "'", double8 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.004358393257198546d) + "'", double10 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2.0018152742371256d + "'", double14 == 2.0018152742371256d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.6248127531564629d) + "'", double18 == (-0.6248127531564629d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.0d + "'", double20 == 4.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.997483484540344d + "'", double24 == 1.997483484540344d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 5.494346108142295E-216d + "'", double28 == 5.494346108142295E-216d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 0.0d, (double) (byte) 1);
        double double16 = simpsonIntegration0.f((double) 1L);
        double double18 = simpsonIntegration0.f(4.0d);
        double double22 = simpsonIntegration0.simpsonsMethod((int) (short) 100, (-1.3679920553853836E-39d), 1.2514464254193938d);
        double double24 = simpsonIntegration0.f((double) (short) 10);
        double double26 = simpsonIntegration0.f(46.66666666663074d);
        double double28 = simpsonIntegration0.f((-10.031072123892118d));
        java.lang.Class<?> wildcardClass29 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.103638323514327d + "'", double16 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.21978766666481014d) + "'", double18 == (-0.21978766666481014d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-9.525478241589842E-38d) + "'", double22 == (-9.525478241589842E-38d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-0.004358393257198546d) + "'", double24 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.1752745249820245E-17d) + "'", double26 == (-1.1752745249820245E-17d));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-2195417.5289783063d) + "'", double28 == (-2195417.5289783063d));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        double double18 = simpsonIntegration0.simpsonsMethod((int) (short) 10, (double) (short) 100, (-1.2395293152101427E-40d));
        double double22 = simpsonIntegration0.simpsonsMethod(100, 4.017452540903338d, 0.0d);
        double double26 = simpsonIntegration0.simpsonsMethod((int) ' ', (-8.792109355360879E-19d), (-0.716016414389119d));
        double double30 = simpsonIntegration0.simpsonsMethod(100, (-3.24956540118872E-45d), 46.66666666663074d);
        java.lang.Class<?> wildcardClass31 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 133.33333333333334d + "'", double18 == 133.33333333333334d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.12913427377727d + "'", double22 == 4.12913427377727d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-2.0076911253185856E-16d) + "'", double26 == (-2.0076911253185856E-16d));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 3.819131433280093E-60d + "'", double30 == 3.819131433280093E-60d);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        double double16 = simpsonIntegration0.f((double) 10L);
        double double18 = simpsonIntegration0.f((double) (-1L));
        double double20 = simpsonIntegration0.f(86.98501851068946d);
        double double22 = simpsonIntegration0.f(0.9226783964008627d);
        double double26 = simpsonIntegration0.simpsonsMethod((int) (short) 10, 0.0d, (double) 0.0f);
        double double28 = simpsonIntegration0.f(Double.NEGATIVE_INFINITY);
        double double30 = simpsonIntegration0.f((double) (byte) 100);
        java.lang.Class<?> wildcardClass31 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 8.154845485377137d + "'", double18 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.2634141046617278E-34d) + "'", double20 == (-1.2634141046617278E-34d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.2514464254193938d + "'", double22 == 1.2514464254193938d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + Double.NEGATIVE_INFINITY + "'", double28 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-3.718587945630428E-40d) + "'", double30 == (-3.718587945630428E-40d));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        double double16 = simpsonIntegration0.f((double) 10L);
        double double18 = simpsonIntegration0.f((double) (short) 10);
        double double22 = simpsonIntegration0.simpsonsMethod(100, 0.0d, (-1.3332985455191015d));
        double double24 = simpsonIntegration0.f(4.880565806253262d);
        java.lang.Class<?> wildcardClass25 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.004358393257198546d) + "'", double18 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-0.15048705932345452d) + "'", double24 == (-0.15048705932345452d));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (byte) -1, (-1.8007854031706057E-43d), (double) (byte) 0);
        java.lang.Class<?> wildcardClass5 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double8 = simpsonIntegration0.f((double) (-1L));
        double double10 = simpsonIntegration0.f(Double.NEGATIVE_INFINITY);
        double double14 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 4.021497963060547d, 0.0d);
        java.lang.Class<?> wildcardClass15 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.154845485377137d + "'", double8 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.NEGATIVE_INFINITY + "'", double10 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5.361997284080729d + "'", double14 == 5.361997284080729d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        double double16 = simpsonIntegration0.f(8.154845485377137d);
        double double18 = simpsonIntegration0.f((double) 0.0f);
        double double20 = simpsonIntegration0.f((-3.3283848740159176E-4d));
        double double22 = simpsonIntegration0.f(2.4866682957019E-151d);
        double double24 = simpsonIntegration0.f(1586.410651560393d);
        java.lang.Class<?> wildcardClass25 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.017959162462641984d) + "'", double16 == (-0.017959162462641984d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.0013314647187705d + "'", double20 == 4.0013314647187705d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.0d + "'", double22 == 4.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-0.0d) + "'", double24 == (-0.0d));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
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
        double double38 = simpsonIntegration0.f(9.931906770383255E-23d);
        java.lang.Class<?> wildcardClass39 = simpsonIntegration0.getClass();
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
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 4.0d + "'", double38 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double2 = simpsonIntegration0.f((double) 0);
        double double6 = simpsonIntegration0.simpsonsMethod((int) '4', (-7.047753488102803E-20d), (-0.0012649947976536042d));
        double double8 = simpsonIntegration0.f((-0.21978736206516547d));
        double double10 = simpsonIntegration0.f(5.470395964063189d);
        java.lang.Class<?> wildcardClass11 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.4677877090000082E-17d) + "'", double6 == (-1.4677877090000082E-17d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.923066394071297d + "'", double8 == 4.923066394071297d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.10913394903881343d) + "'", double10 == (-0.10913394903881343d));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (byte) -1, (-1.8007854031706057E-43d), (double) (byte) 0);
        double double8 = simpsonIntegration0.simpsonsMethod(0, (double) 0.0f, 0.0d);
        double double10 = simpsonIntegration0.f(21.374652739542693d);
        java.lang.Class<?> wildcardClass11 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-2.3609422135150708E-7d) + "'", double10 == (-2.3609422135150708E-7d));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 0.0d, (double) (byte) 1);
        double double16 = simpsonIntegration0.f((double) 1L);
        double double18 = simpsonIntegration0.f((double) '4');
        double double22 = simpsonIntegration0.simpsonsMethod(10, 133.33333333333334d, (-3.3283848740159176E-4d));
        double double26 = simpsonIntegration0.simpsonsMethod((int) (short) 100, (-0.0012649947976536042d), (double) 1L);
        double double28 = simpsonIntegration0.f(3.8830304245077953d);
        java.lang.Class<?> wildcardClass29 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.103638323514327d + "'", double16 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-7.047753488102803E-20d) + "'", double18 == (-7.047753488102803E-20d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 177.83695398750095d + "'", double22 == 177.83695398750095d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-0.15495903000016553d) + "'", double26 == (-0.15495903000016553d));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-0.22807608261057874d) + "'", double28 == (-0.22807608261057874d));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double12 = simpsonIntegration0.simpsonsMethod(1, 0.9226783964008627d, 4.058365782993775d);
        double double16 = simpsonIntegration0.simpsonsMethod((int) (byte) 1, 19.13477449062135d, 0.1697530814684139d);
        java.lang.Class<?> wildcardClass17 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.11021647807132358d) + "'", double12 == (-0.11021647807132358d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 21.374652739542693d + "'", double16 == 21.374652739542693d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double12 = simpsonIntegration0.simpsonsMethod(1, 0.9226783964008627d, 4.058365782993775d);
        double double16 = simpsonIntegration0.simpsonsMethod(100, 2.7182818284590455d, (double) 10.0f);
        double double18 = simpsonIntegration0.f(1.0d);
        double double22 = simpsonIntegration0.simpsonsMethod((int) (short) 10, (-8.665507736503254E-45d), 113888.0642537291d);
        java.lang.Class<?> wildcardClass23 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.11021647807132358d) + "'", double12 == (-0.11021647807132358d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.005762150198617093d) + "'", double16 == (-0.005762150198617093d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.103638323514327d + "'", double18 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.0d) + "'", double22 == (-0.0d));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 0.0d, (double) (byte) 1);
        double double16 = simpsonIntegration0.f((double) 1L);
        double double18 = simpsonIntegration0.f(8.154845485377137d);
        double double22 = simpsonIntegration0.simpsonsMethod(0, (double) '4', (double) '4');
        double double24 = simpsonIntegration0.f(5.361997284080729d);
        java.lang.Class<?> wildcardClass25 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.103638323514327d + "'", double16 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.017959162462641984d) + "'", double18 == (-0.017959162462641984d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.2216106046044858E-18d) + "'", double22 == (-1.2216106046044858E-18d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-0.11612004051994845d) + "'", double24 == (-0.11612004051994845d));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 0.0d, (double) (byte) 1);
        double double16 = simpsonIntegration0.f((double) (-1));
        double double18 = simpsonIntegration0.f(351.55527719495865d);
        double double22 = simpsonIntegration0.simpsonsMethod(0, 2.7666384931515604d, (-0.21545281845024855d));
        double double26 = simpsonIntegration0.simpsonsMethod(0, 2.413675113314953d, 0.0d);
        double double28 = simpsonIntegration0.f(2.566645225308353d);
        java.lang.Class<?> wildcardClass29 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 8.154845485377137d + "'", double16 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-2.590933206896706E-148d) + "'", double18 == (-2.590933206896706E-148d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.522636368713808d + "'", double22 == 4.522636368713808d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 3.218233484419937d + "'", double26 == 3.218233484419937d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-0.19871408377292402d) + "'", double28 == (-0.19871408377292402d));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double12 = simpsonIntegration0.simpsonsMethod(1, 0.9226783964008627d, 4.058365782993775d);
        double double16 = simpsonIntegration0.simpsonsMethod(100, 2.7182818284590455d, (double) 10.0f);
        double double18 = simpsonIntegration0.f(2.002615341358857d);
        double double22 = simpsonIntegration0.simpsonsMethod((int) (byte) 10, (-0.0016866597302048056d), 8949499.808293283d);
        double double24 = simpsonIntegration0.f((double) (byte) 1);
        java.lang.Class<?> wildcardClass25 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.11021647807132358d) + "'", double12 == (-0.11021647807132358d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.005762150198617093d) + "'", double16 == (-0.005762150198617093d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.0014130171899539316d) + "'", double18 == (-0.0014130171899539316d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.0d) + "'", double22 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.103638323514327d + "'", double24 == 1.103638323514327d);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (byte) 0, (double) 0L, (double) ' ');
        double double6 = simpsonIntegration0.f((-1.8007854031706057E-43d));
        double double10 = simpsonIntegration0.simpsonsMethod((int) (short) 10, 4.017452540903338d, (-1.2634141046617278E-34d));
        double double14 = simpsonIntegration0.simpsonsMethod(1, 1.3573857385474846d, 19.13477449062135d);
        double double16 = simpsonIntegration0.f((double) 10.0f);
        double double20 = simpsonIntegration0.simpsonsMethod((int) (short) 100, 0.44560275377566727d, 5.031457561902246d);
        java.lang.Class<?> wildcardClass21 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.129134273777278d + "'", double10 == 4.129134273777278d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.039409718471294E-6d) + "'", double14 == (-1.039409718471294E-6d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.21793386075293272d) + "'", double20 == (-0.21793386075293272d));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 0.0d, (double) (byte) 1);
        double double16 = simpsonIntegration0.f((double) 1L);
        double double18 = simpsonIntegration0.f((double) '4');
        double double22 = simpsonIntegration0.simpsonsMethod(10, 133.33333333333334d, (-3.3283848740159176E-4d));
        double double26 = simpsonIntegration0.simpsonsMethod((int) 'a', (-0.20064417731540868d), 177.83695398750095d);
        double double30 = simpsonIntegration0.simpsonsMethod((int) (short) 1, (-5.298978042385537d), 3.7906927820365864E-25d);
        java.lang.Class<?> wildcardClass31 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.103638323514327d + "'", double16 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-7.047753488102803E-20d) + "'", double18 == (-7.047753488102803E-20d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 177.83695398750095d + "'", double22 == 177.83695398750095d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 3.953494426882914E-65d + "'", double26 == 3.953494426882914E-65d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 8504.888752167593d + "'", double30 == 8504.888752167593d);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 0.0d, (double) (byte) 1);
        double double16 = simpsonIntegration0.f((double) 1L);
        double double18 = simpsonIntegration0.f(8.154845485377137d);
        double double20 = simpsonIntegration0.f((-0.16338567387879238d));
        double double22 = simpsonIntegration0.f(1.0d);
        double double26 = simpsonIntegration0.simpsonsMethod((int) (byte) 10, (-0.0014130171899539316d), 4.744461181212093d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.103638323514327d + "'", double16 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.017959162462641984d) + "'", double18 == (-0.017959162462641984d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.678529946300102d + "'", double20 == 4.678529946300102d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.103638323514327d + "'", double22 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.002283244809187602d + "'", double26 == 0.002283244809187602d);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double2 = simpsonIntegration0.f((double) 0);
        double double6 = simpsonIntegration0.simpsonsMethod(0, (double) (byte) -1, (double) 100.0f);
        double double8 = simpsonIntegration0.f(100.0d);
        double double12 = simpsonIntegration0.simpsonsMethod(0, (-0.016155316979210545d), (double) 'a');
        java.lang.Class<?> wildcardClass13 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.2395293152101427E-40d + "'", double6 == 1.2395293152101427E-40d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.718587945630428E-40d) + "'", double8 == (-3.718587945630428E-40d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.7843237572091147E-41d + "'", double12 == 3.7843237572091147E-41d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        double double16 = simpsonIntegration0.f((double) 10L);
        double double18 = simpsonIntegration0.f((double) (-1L));
        double double22 = simpsonIntegration0.simpsonsMethod(0, (-0.016155316979210545d), (-1.4677877090000082E-17d));
        double double26 = simpsonIntegration0.simpsonsMethod((int) (short) -1, 7.201889327800033d, (-2.6665226325972244E-28d));
        double double28 = simpsonIntegration0.f((-0.007807484634704912d));
        java.lang.Class<?> wildcardClass29 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 8.154845485377137d + "'", double18 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.021540422638947395d) + "'", double22 == (-0.021540422638947395d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 4.031290735472884d + "'", double28 == 4.031290735472884d);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double2 = simpsonIntegration0.f((double) 0);
        double double6 = simpsonIntegration0.simpsonsMethod((int) (short) -1, 2.534547434273728E-11d, (-0.2484968469493311d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double16 = simpsonIntegration0.simpsonsMethod(0, 0.0d, 0.9226783964008627d);
        double double18 = simpsonIntegration0.f(86.98501851068946d);
        double double22 = simpsonIntegration0.simpsonsMethod((int) (byte) 10, (-1.2395293152101427E-40d), (double) 1.0f);
        double double24 = simpsonIntegration0.f(53.95124589585826d);
        double double26 = simpsonIntegration0.f(4.129134273777278d);
        double double28 = simpsonIntegration0.f(316.15458486666836d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.2634141046617278E-34d) + "'", double18 == (-1.2634141046617278E-34d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.3679920553853836E-39d) + "'", double22 == (-1.3679920553853836E-39d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0781454254561233E-20d) + "'", double24 == (-1.0781454254561233E-20d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-0.2100593206839558d) + "'", double26 == (-0.2100593206839558d));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-4.961236754861211E-133d) + "'", double28 == (-4.961236754861211E-133d));
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double12 = simpsonIntegration0.simpsonsMethod(1, 0.9226783964008627d, 4.058365782993775d);
        double double14 = simpsonIntegration0.f(0.0d);
        double double18 = simpsonIntegration0.simpsonsMethod((int) '#', (-0.41503840884717663d), (-1.2216106046044858E-18d));
        double double20 = simpsonIntegration0.f(3.516335322931642d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.11021647807132358d) + "'", double12 == (-0.11021647807132358d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 3.2169325995787305E8d + "'", double18 == 3.2169325995787305E8d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.2484968469493311d) + "'", double20 == (-0.2484968469493311d));
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(0, (double) ' ', (double) (-1));
        double double18 = simpsonIntegration0.f((double) (byte) 10);
        double double22 = simpsonIntegration0.simpsonsMethod((int) (short) -1, 0.9226783964008627d, (double) (byte) 1);
        double double26 = simpsonIntegration0.simpsonsMethod(0, (double) (byte) 1, (double) (-1));
        double double30 = simpsonIntegration0.simpsonsMethod((int) 'a', (-2.3854629903149513d), (double) (-1.0f));
        double double32 = simpsonIntegration0.f((-3.806556146559686E-40d));
        double double36 = simpsonIntegration0.simpsonsMethod((int) (byte) 100, (-1.0d), 4.064880833848463d);
        double double40 = simpsonIntegration0.simpsonsMethod((int) 'a', 4.133973962456099d, (-0.19871408377292402d));
        java.lang.Class<?> wildcardClass41 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 86.98501851068946d + "'", double16 == 86.98501851068946d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.004358393257198546d) + "'", double18 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 2.7182818284590455d + "'", double26 == 2.7182818284590455d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 4.3947944567089737E105d + "'", double30 == 4.3947944567089737E105d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 4.0d + "'", double32 == 4.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 4.179484741423919E45d + "'", double36 == 4.179484741423919E45d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 5.363361249893394d + "'", double40 == 5.363361249893394d);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double8 = simpsonIntegration0.f((double) (-1L));
        double double10 = simpsonIntegration0.f((double) 10);
        double double12 = simpsonIntegration0.f(1.2514464254193938d);
        double double16 = simpsonIntegration0.simpsonsMethod(0, (-0.21979531239781874d), 53.95124589585826d);
        double double20 = simpsonIntegration0.simpsonsMethod((int) (short) 10, (-7.047753488102803E-20d), 1.9016583609866715d);
        double double24 = simpsonIntegration0.simpsonsMethod((int) (byte) 1, (-3.24956540118872E-45d), 1.584560339852038E-70d);
        java.lang.Class<?> wildcardClass25 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.154845485377137d + "'", double8 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.004358393257198546d) + "'", double10 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.6963109328077465d + "'", double12 == 0.6963109328077465d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 7.8990436866135935E-22d + "'", double16 == 7.8990436866135935E-22d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-4.03791947167852E-20d) + "'", double20 == (-4.03791947167852E-20d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-8.665507736503254E-45d) + "'", double24 == (-8.665507736503254E-45d));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double2 = simpsonIntegration0.f((double) 0);
        double double6 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 1.2395293152101427E-40d, (double) (byte) 10);
        double double10 = simpsonIntegration0.simpsonsMethod((int) (byte) 100, (double) (byte) 10, (double) (byte) 10);
        double double14 = simpsonIntegration0.simpsonsMethod((int) (short) 100, (-0.29306041653042497d), 37867.06926325643d);
        java.lang.Class<?> wildcardClass15 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.8007854031706057E-43d) + "'", double6 == (-1.8007854031706057E-43d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.01453886097417405d) + "'", double10 == (-0.01453886097417405d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.0d) + "'", double14 == (-0.0d));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double12 = simpsonIntegration0.simpsonsMethod(0, (double) 1L, (double) 100.0f);
        double double14 = simpsonIntegration0.f((-0.01453886097417405d));
        double double18 = simpsonIntegration0.simpsonsMethod((int) 'a', (-12.092155046994721d), 7.0548950493513125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.2395293152101427E-40d) + "'", double12 == (-1.2395293152101427E-40d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.058365782993775d + "'", double14 == 4.058365782993775d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + Double.POSITIVE_INFINITY + "'", double18 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f((double) (-1L));
        double double14 = simpsonIntegration0.simpsonsMethod(1, 40.46343442189374d, 0.0d);
        double double18 = simpsonIntegration0.simpsonsMethod((int) (short) 1, 2.413675113314953d, (-0.21850356693465028d));
        double double22 = simpsonIntegration0.simpsonsMethod((int) (byte) 100, 0.0d, 0.6941125599944457d);
        double double24 = simpsonIntegration0.f((-3.219738730368386E104d));
        double double28 = simpsonIntegration0.simpsonsMethod((int) 'a', 6.671025125253619E8d, 3.3940787665690245E-140d);
        java.lang.Class<?> wildcardClass29 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.154845485377137d + "'", double10 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 53.95124589585826d + "'", double14 == 53.95124589585826d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 3.8830304245077953d + "'", double18 == 3.8830304245077953d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + Double.NEGATIVE_INFINITY + "'", double24 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 8.894700167004825E8d + "'", double28 == 8.894700167004825E8d);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (byte) 0, (double) 0L, (double) ' ');
        double double8 = simpsonIntegration0.simpsonsMethod((int) '#', (double) 'a', 0.9226783964008627d);
        double double10 = simpsonIntegration0.f((-0.01453886097417405d));
        double double12 = simpsonIntegration0.f((double) 100L);
        double double14 = simpsonIntegration0.f((double) (short) 1);
        double double18 = simpsonIntegration0.simpsonsMethod((int) ' ', (-0.0012649947976536042d), 8.430431742414195d);
        java.lang.Class<?> wildcardClass19 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.46343442189374d + "'", double8 == 40.46343442189374d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.058365782993775d + "'", double10 == 4.058365782993775d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-3.718587945630428E-40d) + "'", double12 == (-3.718587945630428E-40d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.103638323514327d + "'", double14 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 6.012902566071085E-4d + "'", double18 == 6.012902566071085E-4d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double12 = simpsonIntegration0.f((double) 10);
        double double16 = simpsonIntegration0.simpsonsMethod(0, (-1.2395293152101427E-40d), 4.058365782993775d);
        double double18 = simpsonIntegration0.f((-3.806556146559686E-40d));
        double double22 = simpsonIntegration0.simpsonsMethod((int) (short) 100, (-0.21978766666480973d), (-0.7281914854444458d));
        java.lang.Class<?> wildcardClass23 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 8.902002817124393E-42d + "'", double16 == 8.902002817124393E-42d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 3.4035995320374717E12d + "'", double22 == 3.4035995320374717E12d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f((double) '4');
        double double12 = simpsonIntegration0.f(468.7403695932782d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-7.047753488102803E-20d) + "'", double10 == (-7.047753488102803E-20d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-5.895231310196705E-199d) + "'", double12 == (-5.895231310196705E-199d));
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 0.0d, (double) (byte) 1);
        double double16 = simpsonIntegration0.f((double) 1L);
        double double18 = simpsonIntegration0.f(8.154845485377137d);
        double double20 = simpsonIntegration0.f(1.2395293152101427E-40d);
        double double24 = simpsonIntegration0.simpsonsMethod((-1), 0.3394344128489119d, (double) 1L);
        double double26 = simpsonIntegration0.f((-0.7317724584449441d));
        java.lang.Class<?> wildcardClass27 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.103638323514327d + "'", double16 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.017959162462641984d) + "'", double18 == (-0.017959162462641984d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.0d + "'", double20 == 4.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 7.201889327800033d + "'", double26 == 7.201889327800033d);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double12 = simpsonIntegration0.simpsonsMethod(0, (double) 1L, (double) 100.0f);
        double double14 = simpsonIntegration0.f((-1.0781454254561233E-20d));
        double double18 = simpsonIntegration0.simpsonsMethod((int) '#', 177.83695398750095d, (-3.806556146559686E-40d));
        double double20 = simpsonIntegration0.f((-0.7317724584449441d));
        double double24 = simpsonIntegration0.simpsonsMethod(1, (-0.0014130171899539316d), 2.7666384931515604d);
        java.lang.Class<?> wildcardClass25 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.2395293152101427E-40d) + "'", double12 == (-1.2395293152101427E-40d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 237.11593865000125d + "'", double18 == 237.11593865000125d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 7.201889327800033d + "'", double20 == 7.201889327800033d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 2.1635407177761077E-4d + "'", double24 == 2.1635407177761077E-4d);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        double double16 = simpsonIntegration0.f((double) 10L);
        double double18 = simpsonIntegration0.f((double) (-1L));
        double double20 = simpsonIntegration0.f((-0.017959162462641984d));
        double double22 = simpsonIntegration0.f((double) 100L);
        double double26 = simpsonIntegration0.simpsonsMethod((-1), (double) 0.0f, (double) (short) 0);
        double double30 = simpsonIntegration0.simpsonsMethod((int) (short) 10, 4.867986517190933E-5d, (-0.29259450005390564d));
        double double32 = simpsonIntegration0.f(4.296180111033149E59d);
        java.lang.Class<?> wildcardClass33 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 8.154845485377137d + "'", double18 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.072157215642454d + "'", double20 == 4.072157215642454d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-3.718587945630428E-40d) + "'", double22 == (-3.718587945630428E-40d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.002552675179427612d + "'", double30 == 0.002552675179427612d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-0.0d) + "'", double32 == (-0.0d));
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double2 = simpsonIntegration0.f((double) 0);
        double double6 = simpsonIntegration0.simpsonsMethod(0, (double) (byte) -1, (double) 100.0f);
        double double8 = simpsonIntegration0.f(100.0d);
        double double10 = simpsonIntegration0.f(0.3394344128489119d);
        double double14 = simpsonIntegration0.simpsonsMethod((int) ' ', (-1.039409718471294E-6d), 4.064880833848463d);
        java.lang.Class<?> wildcardClass15 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.2395293152101427E-40d + "'", double6 == 1.2395293152101427E-40d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.718587945630428E-40d) + "'", double8 == (-3.718587945630428E-40d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.7666384931515604d + "'", double10 == 2.7666384931515604d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 7.149920860492725E-6d + "'", double14 == 7.149920860492725E-6d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(0, (double) ' ', (double) (-1));
        double double18 = simpsonIntegration0.f(1.2395293152101427E-40d);
        java.lang.Class<?> wildcardClass19 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 86.98501851068946d + "'", double16 == 86.98501851068946d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        double double16 = simpsonIntegration0.f((double) 10L);
        double double18 = simpsonIntegration0.f((double) (-1L));
        double double20 = simpsonIntegration0.f(86.98501851068946d);
        double double22 = simpsonIntegration0.f(2.8306689949230137E-25d);
        double double26 = simpsonIntegration0.simpsonsMethod(1, 7.201889327800033d, (double) '4');
        double double30 = simpsonIntegration0.simpsonsMethod(10, 2.7182818284590455d, 112.02938954346982d);
        double double32 = simpsonIntegration0.f(4.880565806253262d);
        java.lang.Class<?> wildcardClass33 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 8.154845485377137d + "'", double18 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.2634141046617278E-34d) + "'", double20 == (-1.2634141046617278E-34d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.0d + "'", double22 == 4.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.693539419598958E-19d) + "'", double26 == (-1.693539419598958E-19d));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-3.24956540118872E-45d) + "'", double30 == (-3.24956540118872E-45d));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-0.15048705932345452d) + "'", double32 == (-0.15048705932345452d));
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double12 = simpsonIntegration0.f((double) 10);
        double double16 = simpsonIntegration0.simpsonsMethod((int) '#', (-1.0d), (double) 100.0f);
        double double18 = simpsonIntegration0.f((double) '#');
        double double20 = simpsonIntegration0.f((double) 10);
        double double22 = simpsonIntegration0.f(2.7182818284590455d);
        java.lang.Class<?> wildcardClass23 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 2.1230017461922604E-25d + "'", double16 == 2.1230017461922604E-25d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-7.698547564139474E-13d) + "'", double18 == (-7.698547564139474E-13d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.004358393257198546d) + "'", double20 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.22363715533801087d) + "'", double22 == (-0.22363715533801087d));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double14 = simpsonIntegration0.simpsonsMethod((int) (short) 10, (double) (byte) 1, (-1.2634141046617278E-34d));
        double double16 = simpsonIntegration0.f(4.880565806253262d);
        double double18 = simpsonIntegration0.f(177.83695398750095d);
        java.lang.Class<?> wildcardClass19 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2.002615341358857d + "'", double14 == 2.002615341358857d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.15048705932345452d) + "'", double16 == (-0.15048705932345452d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.846635986505554E-73d) + "'", double18 == (-1.846635986505554E-73d));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double14 = simpsonIntegration0.f(53.95124589585826d);
        double double18 = simpsonIntegration0.simpsonsMethod(1, 0.6963109328077465d, 1.103638323514327d);
        java.lang.Class<?> wildcardClass19 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0781454254561233E-20d) + "'", double14 == (-1.0781454254561233E-20d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.2433240273856971d + "'", double18 == 0.2433240273856971d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        double double16 = simpsonIntegration0.f((double) 10L);
        double double18 = simpsonIntegration0.f((double) (-1L));
        double double20 = simpsonIntegration0.f((-0.017959162462641984d));
        double double22 = simpsonIntegration0.f((double) 100L);
        double double26 = simpsonIntegration0.simpsonsMethod((-1), (double) 0.0f, (double) (short) 0);
        java.lang.Class<?> wildcardClass27 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 8.154845485377137d + "'", double18 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.072157215642454d + "'", double20 == 4.072157215642454d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-3.718587945630428E-40d) + "'", double22 == (-3.718587945630428E-40d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
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
        double double24 = simpsonIntegration0.f(0.20178029722268845d);
        java.lang.Class<?> wildcardClass25 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.017959162462641984d) + "'", double16 == (-0.017959162462641984d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-3.718587945630428E-40d) + "'", double20 == (-3.718587945630428E-40d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 2.413675113314953d + "'", double22 == 2.413675113314953d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 3.235822297226532d + "'", double24 == 3.235822297226532d);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f((double) (-1L));
        double double14 = simpsonIntegration0.simpsonsMethod(1, 40.46343442189374d, 0.0d);
        double double18 = simpsonIntegration0.simpsonsMethod((int) (byte) 10, (double) '#', (double) 0.0f);
        double double22 = simpsonIntegration0.simpsonsMethod(10, (-3.718587945630428E-40d), (double) (short) 10);
        double double24 = simpsonIntegration0.f(0.0d);
        double double26 = simpsonIntegration0.f((double) '4');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.154845485377137d + "'", double10 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 53.95124589585826d + "'", double14 == 53.95124589585826d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 46.66666666663074d + "'", double18 == 46.66666666663074d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.6207068628535456E-41d + "'", double22 == 1.6207068628535456E-41d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 4.0d + "'", double24 == 4.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-7.047753488102803E-20d) + "'", double26 == (-7.047753488102803E-20d));
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double8 = simpsonIntegration0.f((double) (-1L));
        double double10 = simpsonIntegration0.f(1.0368854366838988E-41d);
        java.lang.Class<?> wildcardClass11 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.154845485377137d + "'", double8 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.0d + "'", double10 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) -1, 0.0d, 4.058365782993775d);
        java.lang.Class<?> wildcardClass5 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        double double18 = simpsonIntegration0.simpsonsMethod((int) (short) 100, 4.000004157639954d, (-0.2100593206839558d));
        double double22 = simpsonIntegration0.simpsonsMethod((int) (byte) 100, (-0.016155316979210545d), (-0.25447267600936185d));
        double double24 = simpsonIntegration0.f(2.534547434273728E-11d);
        java.lang.Class<?> wildcardClass25 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 5.190318108611563d + "'", double18 == 5.190318108611563d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-11.401442591964965d) + "'", double22 == (-11.401442591964965d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 3.999999999898618d + "'", double24 == 3.999999999898618d);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double16 = simpsonIntegration0.simpsonsMethod(0, 0.0d, 0.9226783964008627d);
        double double18 = simpsonIntegration0.f((double) (short) 0);
        double double20 = simpsonIntegration0.f(1.2514464254193938d);
        java.lang.Class<?> wildcardClass21 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.6963109328077465d + "'", double20 == 0.6963109328077465d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double14 = simpsonIntegration0.f(10.0d);
        double double16 = simpsonIntegration0.f((double) (short) 10);
        double double18 = simpsonIntegration0.f((-0.2100593206839558d));
        double double20 = simpsonIntegration0.f(0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.004358393257198546d) + "'", double14 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.880565806253262d + "'", double18 == 4.880565806253262d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.0d + "'", double20 == 4.0d);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(10, (-0.0d), (double) (byte) 0);
        java.lang.Class<?> wildcardClass17 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.0d) + "'", double16 == (-0.0d));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 0.0d, (double) (byte) 1);
        double double16 = simpsonIntegration0.f((double) 1L);
        double double20 = simpsonIntegration0.simpsonsMethod((int) (byte) 1, (double) (byte) 0, (double) 100L);
        double double24 = simpsonIntegration0.simpsonsMethod((int) (short) 1, (-0.20064417731540868d), (-0.21545281845024855d));
        double double26 = simpsonIntegration0.f(0.0d);
        double double30 = simpsonIntegration0.simpsonsMethod((int) (byte) -1, (-0.21545281845024855d), 5.494346108142295E-216d);
        java.lang.Class<?> wildcardClass31 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.103638323514327d + "'", double16 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.0d) + "'", double20 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-0.716016414389119d) + "'", double24 == (-0.716016414389119d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 4.0d + "'", double26 == 4.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-0.0d) + "'", double30 == (-0.0d));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double2 = simpsonIntegration0.f((double) 0);
        double double6 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 1.2395293152101427E-40d, (double) (byte) 10);
        double double10 = simpsonIntegration0.simpsonsMethod((int) (byte) 100, (double) (byte) 10, (double) (byte) 10);
        double double12 = simpsonIntegration0.f(1.2395293152101427E-40d);
        double double16 = simpsonIntegration0.simpsonsMethod((int) 'a', (double) (short) 1, 1.2514464254193938d);
        double double18 = simpsonIntegration0.f((-0.03566952446383129d));
        double double22 = simpsonIntegration0.simpsonsMethod(10, (double) 100.0f, (-3.806556146559686E-40d));
        java.lang.Class<?> wildcardClass23 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.8007854031706057E-43d) + "'", double6 == (-1.8007854031706057E-43d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.01453886097417405d) + "'", double10 == (-0.01453886097417405d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.0d + "'", double12 == 4.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.5850594265420912d) + "'", double16 == (-0.5850594265420912d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.1439347378385145d + "'", double18 == 4.1439347378385145d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 133.33333333333334d + "'", double22 == 133.33333333333334d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
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
        double double24 = simpsonIntegration0.f(0.20178029722268845d);
        double double28 = simpsonIntegration0.simpsonsMethod(100, (-0.21979531239781874d), (-0.005762150198617093d));
        java.lang.Class<?> wildcardClass29 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.017959162462641984d) + "'", double16 == (-0.017959162462641984d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-3.718587945630428E-40d) + "'", double20 == (-3.718587945630428E-40d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 2.413675113314953d + "'", double22 == 2.413675113314953d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 3.235822297226532d + "'", double24 == 3.235822297226532d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.5451154569942336E12d + "'", double28 == 1.5451154569942336E12d);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) ' ', 0.0d, 0.0d);
        double double6 = simpsonIntegration0.f((double) (byte) 0);
        double double10 = simpsonIntegration0.simpsonsMethod((int) (short) 100, 1.2514464254193938d, 0.0d);
        double double12 = simpsonIntegration0.f(0.0d);
        java.lang.Class<?> wildcardClass13 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.0011516619038376d + "'", double10 == 2.0011516619038376d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.0d + "'", double12 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double2 = simpsonIntegration0.f((double) 0);
        double double6 = simpsonIntegration0.simpsonsMethod(0, (double) (byte) -1, (double) 100.0f);
        double double8 = simpsonIntegration0.f(100.0d);
        double double10 = simpsonIntegration0.f(0.3394344128489119d);
        double double14 = simpsonIntegration0.simpsonsMethod((int) ' ', (-1.039409718471294E-6d), 4.064880833848463d);
        double double16 = simpsonIntegration0.f((-3.718587945630428E-40d));
        double double18 = simpsonIntegration0.f(0.0d);
        java.lang.Class<?> wildcardClass19 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.2395293152101427E-40d + "'", double6 == 1.2395293152101427E-40d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.718587945630428E-40d) + "'", double8 == (-3.718587945630428E-40d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.7666384931515604d + "'", double10 == 2.7666384931515604d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 7.149920860492725E-6d + "'", double14 == 7.149920860492725E-6d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.0d + "'", double16 == 4.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
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
        double double24 = simpsonIntegration0.f(0.20178029722268845d);
        double double26 = simpsonIntegration0.f(133.33333333333334d);
        double double30 = simpsonIntegration0.simpsonsMethod((int) 'a', (-2.2580525594652775E-19d), (-165.45632377294922d));
        java.lang.Class<?> wildcardClass31 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.017959162462641984d) + "'", double16 == (-0.017959162462641984d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-3.718587945630428E-40d) + "'", double20 == (-3.718587945630428E-40d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 2.413675113314953d + "'", double22 == 2.413675113314953d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 3.235822297226532d + "'", double24 == 3.235822297226532d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-2.2072362778100317E-54d) + "'", double26 == (-2.2072362778100317E-54d));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 4.296180111033149E59d + "'", double30 == 4.296180111033149E59d);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double8 = simpsonIntegration0.f((double) (-1L));
        double double10 = simpsonIntegration0.f(4.017452540903338d);
        double double12 = simpsonIntegration0.f((-0.1239954697245761d));
        double double14 = simpsonIntegration0.f((-1.4204158423907026E-98d));
        java.lang.Class<?> wildcardClass15 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.154845485377137d + "'", double8 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.21850356693465028d) + "'", double10 == (-0.21850356693465028d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.510638445289436d + "'", double12 == 4.510638445289436d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f((double) (-1L));
        double double14 = simpsonIntegration0.simpsonsMethod(1, 40.46343442189374d, 0.0d);
        double double18 = simpsonIntegration0.simpsonsMethod((int) (byte) 10, (double) '#', (double) 0.0f);
        double double20 = simpsonIntegration0.f((-1.455109358270963E-15d));
        java.lang.Class<?> wildcardClass21 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.154845485377137d + "'", double10 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 53.95124589585826d + "'", double14 == 53.95124589585826d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 46.66666666663074d + "'", double18 == 46.66666666663074d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.000000000000006d + "'", double20 == 4.000000000000006d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double14 = simpsonIntegration0.f(10.0d);
        double double16 = simpsonIntegration0.f((double) (short) 10);
        double double20 = simpsonIntegration0.simpsonsMethod((int) (byte) 10, (double) 1, 0.865609122350895d);
        double double24 = simpsonIntegration0.simpsonsMethod(0, (double) (short) 100, (double) (-1));
        double double28 = simpsonIntegration0.simpsonsMethod((int) (byte) 10, (-0.11021647807132358d), 2.7666384931515604d);
        java.lang.Class<?> wildcardClass29 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.004358393257198546d) + "'", double14 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.19222885149765373d) + "'", double20 == (-0.19222885149765373d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 271.8281828459046d + "'", double24 == 271.8281828459046d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0725840423804812d + "'", double28 == 0.0725840423804812d);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double14 = simpsonIntegration0.simpsonsMethod((int) (short) 10, (double) (byte) 1, (-1.2634141046617278E-34d));
        double double16 = simpsonIntegration0.f(4.880565806253262d);
        double double20 = simpsonIntegration0.simpsonsMethod(0, 8.154845485377137d, 2.0011516619038376d);
        double double22 = simpsonIntegration0.f(86.98501851068946d);
        java.lang.Class<?> wildcardClass23 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2.002615341358857d + "'", double14 == 2.002615341358857d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.15048705932345452d) + "'", double16 == (-0.15048705932345452d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.001693227728973961d) + "'", double20 == (-0.001693227728973961d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.2634141046617278E-34d) + "'", double22 == (-1.2634141046617278E-34d));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        double double16 = simpsonIntegration0.f((double) 10L);
        double double18 = simpsonIntegration0.f((-1.2634141046617278E-34d));
        double double20 = simpsonIntegration0.f(4.072157215642454d);
        double double24 = simpsonIntegration0.simpsonsMethod(0, (-1.291744886007606E-11d), 0.45257921713188254d);
        java.lang.Class<?> wildcardClass25 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.2144125992859175d) + "'", double20 == (-0.2144125992859175d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0392841613694731E-11d) + "'", double24 == (-1.0392841613694731E-11d));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(0, (double) ' ', (double) (-1));
        double double18 = simpsonIntegration0.f(1.2395293152101427E-40d);
        double double20 = simpsonIntegration0.f((-0.004358393257198546d));
        double double24 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (double) (byte) -1, 2.609103086070402E-5d);
        double double28 = simpsonIntegration0.simpsonsMethod((-1), (-1.7731645398316149E-6d), (-7.047753488102803E-20d));
        double double32 = simpsonIntegration0.simpsonsMethod((int) (byte) -1, 2.3024062608264327E-51d, (-0.10913394903881343d));
        java.lang.Class<?> wildcardClass33 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 86.98501851068946d + "'", double16 == 86.98501851068946d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.017452540903338d + "'", double20 == 4.017452540903338d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.3332985455191015d) + "'", double24 == (-1.3332985455191015d));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-0.0d) + "'", double28 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double2 = simpsonIntegration0.f((double) 0);
        double double6 = simpsonIntegration0.simpsonsMethod(0, (double) (byte) -1, (double) 100.0f);
        double double8 = simpsonIntegration0.f(100.0d);
        double double10 = simpsonIntegration0.f(Double.NaN);
        double double14 = simpsonIntegration0.simpsonsMethod(10, (-1.0294644847870642E67d), 4.064880833848463d);
        java.lang.Class<?> wildcardClass15 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.2395293152101427E-40d + "'", double6 == 1.2395293152101427E-40d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.718587945630428E-40d) + "'", double8 == (-3.718587945630428E-40d));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + Double.POSITIVE_INFINITY + "'", double14 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double12 = simpsonIntegration0.f((double) 10);
        double double16 = simpsonIntegration0.simpsonsMethod((int) '#', (-1.0d), (double) 100.0f);
        double double18 = simpsonIntegration0.f((double) '#');
        double double20 = simpsonIntegration0.f((double) (byte) -1);
        double double22 = simpsonIntegration0.f(0.0d);
        double double24 = simpsonIntegration0.f((-0.21331563406496507d));
        java.lang.Class<?> wildcardClass25 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 2.1230017461922604E-25d + "'", double16 == 2.1230017461922604E-25d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-7.698547564139474E-13d) + "'", double18 == (-7.698547564139474E-13d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 8.154845485377137d + "'", double20 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.0d + "'", double22 == 4.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 4.894777913434244d + "'", double24 == 4.894777913434244d);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(0, (double) ' ', (double) (-1));
        double double18 = simpsonIntegration0.f((-2.0076911253185856E-16d));
        double double20 = simpsonIntegration0.f((-0.21850356693465028d));
        java.lang.Class<?> wildcardClass21 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 86.98501851068946d + "'", double16 == 86.98501851068946d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.000000000000001d + "'", double18 == 4.000000000000001d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.9174503293501d + "'", double20 == 4.9174503293501d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double12 = simpsonIntegration0.simpsonsMethod(0, (double) 1L, (double) 100.0f);
        double double14 = simpsonIntegration0.f((-1.0781454254561233E-20d));
        double double18 = simpsonIntegration0.simpsonsMethod((int) (byte) 0, (-0.001693227728973961d), (-0.11021647807132358d));
        double double22 = simpsonIntegration0.simpsonsMethod((int) (byte) 1, 1.3678875951919236d, (-25.7567339920559d));
        java.lang.Class<?> wildcardClass23 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.2395293152101427E-40d) + "'", double12 == (-1.2395293152101427E-40d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.0025130411114009576d) + "'", double18 == (-0.0025130411114009576d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-5.666893689166815E13d) + "'", double22 == (-5.666893689166815E13d));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 0.0d, (double) (byte) 1);
        double double16 = simpsonIntegration0.f((double) (-1));
        double double18 = simpsonIntegration0.f(351.55527719495865d);
        double double22 = simpsonIntegration0.simpsonsMethod(0, 2.7666384931515604d, (-0.21545281845024855d));
        double double24 = simpsonIntegration0.f((-1.2216106046044858E-18d));
        double double26 = simpsonIntegration0.f(4.086622276466951d);
        double double28 = simpsonIntegration0.f((-0.0012649947976536042d));
        double double30 = simpsonIntegration0.f((-75513.57023853235d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 8.154845485377137d + "'", double16 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-2.590933206896706E-148d) + "'", double18 == (-2.590933206896706E-148d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.522636368713808d + "'", double22 == 4.522636368713808d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 4.0d + "'", double24 == 4.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-0.21331563406496507d) + "'", double26 == (-0.21331563406496507d));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 4.0050615787268455d + "'", double28 == 4.0050615787268455d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + Double.NEGATIVE_INFINITY + "'", double30 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) -1, 0.0d, 4.058365782993775d);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (byte) 100, (-0.12402529508953528d), 2.7182818284590455d);
        java.lang.Class<?> wildcardClass9 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1163192.9224180172d + "'", double8 == 1163192.9224180172d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        double double16 = simpsonIntegration0.f(8.154845485377137d);
        double double18 = simpsonIntegration0.f((double) 0.0f);
        java.lang.Class<?> wildcardClass19 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.017959162462641984d) + "'", double16 == (-0.017959162462641984d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 0.0d, (double) (byte) 1);
        double double16 = simpsonIntegration0.f((double) 1L);
        double double18 = simpsonIntegration0.f(8.154845485377137d);
        double double22 = simpsonIntegration0.simpsonsMethod(0, (double) '4', (double) '4');
        double double26 = simpsonIntegration0.simpsonsMethod(1, (-0.01453886097417405d), 1735120.3626874206d);
        double double28 = simpsonIntegration0.f((-0.03566952446383129d));
        double double32 = simpsonIntegration0.simpsonsMethod((int) (byte) 0, 4.000005543520419d, (double) (byte) 0);
        java.lang.Class<?> wildcardClass33 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.103638323514327d + "'", double16 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.017959162462641984d) + "'", double18 == (-0.017959162462641984d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.2216106046044858E-18d) + "'", double22 == (-1.2216106046044858E-18d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-0.0d) + "'", double26 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 4.1439347378385145d + "'", double28 == 4.1439347378385145d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 5.333340724693891d + "'", double32 == 5.333340724693891d);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
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
        double double24 = simpsonIntegration0.f((-8.17767075505095d));
        java.lang.Class<?> wildcardClass25 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.017959162462641984d) + "'", double16 == (-0.017959162462641984d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-3.718587945630428E-40d) + "'", double20 == (-3.718587945630428E-40d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 2.413675113314953d + "'", double22 == 2.413675113314953d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-223867.1856878668d) + "'", double24 == (-223867.1856878668d));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double2 = simpsonIntegration0.f((double) 0);
        double double4 = simpsonIntegration0.f((double) 1L);
        double double6 = simpsonIntegration0.f(2.1230017461922604E-25d);
        double double10 = simpsonIntegration0.simpsonsMethod((int) (short) 1, (-2.3854629903149513d), 3.989795820963261d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.103638323514327d + "'", double4 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.05259923664488315d) + "'", double10 == (-0.05259923664488315d));
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double14 = simpsonIntegration0.f(10.0d);
        double double16 = simpsonIntegration0.f((double) (short) 10);
        double double20 = simpsonIntegration0.simpsonsMethod((int) (short) 1, 13.318805355809339d, 13.318805355809339d);
        double double24 = simpsonIntegration0.simpsonsMethod((int) (byte) 10, (-1.291744886007606E-11d), (-0.004358393257198546d));
        double double28 = simpsonIntegration0.simpsonsMethod(10, 1.3573857385474846d, (-0.219372853236844d));
        java.lang.Class<?> wildcardClass29 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.004358393257198546d) + "'", double14 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.0012649947976536042d) + "'", double20 == (-0.0012649947976536042d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-5.189523774824596E-10d) + "'", double24 == (-5.189523774824596E-10d));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 2.961776856125533d + "'", double28 == 2.961776856125533d);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double2 = simpsonIntegration0.f((double) 0);
        double double6 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 1.2395293152101427E-40d, (double) (byte) 10);
        double double8 = simpsonIntegration0.f(4.072157215642454d);
        double double10 = simpsonIntegration0.f((-0.6968547617730776d));
        java.lang.Class<?> wildcardClass11 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.8007854031706057E-43d) + "'", double6 == (-1.8007854031706057E-43d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.2144125992859175d) + "'", double8 == (-0.2144125992859175d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 7.0548950493513125d + "'", double10 == 7.0548950493513125d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double8 = simpsonIntegration0.f((double) (-1L));
        double double10 = simpsonIntegration0.f((double) 10);
        double double12 = simpsonIntegration0.f(1.2514464254193938d);
        double double16 = simpsonIntegration0.simpsonsMethod(0, (-0.21979531239781874d), 53.95124589585826d);
        double double20 = simpsonIntegration0.simpsonsMethod((int) (short) 10, (-7.047753488102803E-20d), 1.9016583609866715d);
        java.lang.Class<?> wildcardClass21 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.154845485377137d + "'", double8 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.004358393257198546d) + "'", double10 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.6963109328077465d + "'", double12 == 0.6963109328077465d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 7.8990436866135935E-22d + "'", double16 == 7.8990436866135935E-22d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-4.03791947167852E-20d) + "'", double20 == (-4.03791947167852E-20d));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 0.0d, (double) (byte) 1);
        double double16 = simpsonIntegration0.f((double) 1L);
        double double18 = simpsonIntegration0.f(8.154845485377137d);
        double double20 = simpsonIntegration0.f(1.2395293152101427E-40d);
        double double22 = simpsonIntegration0.f((-1.2634141046617278E-34d));
        double double26 = simpsonIntegration0.simpsonsMethod((int) (short) -1, 1.2514464254193938d, (double) (short) 100);
        double double28 = simpsonIntegration0.f(0.002552675179427612d);
        java.lang.Class<?> wildcardClass29 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.103638323514327d + "'", double16 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.017959162462641984d) + "'", double18 == (-0.017959162462641984d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.0d + "'", double20 == 4.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.0d + "'", double22 == 4.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 3.989795820963261d + "'", double28 == 3.989795820963261d);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(1, 4.129134273777278d, 9.666962960832531E-71d);
        java.lang.Class<?> wildcardClass17 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 5.216391318182206d + "'", double16 == 5.216391318182206d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        double double18 = simpsonIntegration0.simpsonsMethod((int) (short) 100, 4.000004157639954d, (-0.2100593206839558d));
        double double20 = simpsonIntegration0.f(100.0d);
        java.lang.Class<?> wildcardClass21 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 5.190318108611563d + "'", double18 == 5.190318108611563d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-3.718587945630428E-40d) + "'", double20 == (-3.718587945630428E-40d));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double2 = simpsonIntegration0.f((double) 0);
        double double6 = simpsonIntegration0.simpsonsMethod((int) '4', (-7.047753488102803E-20d), (-0.0012649947976536042d));
        double double10 = simpsonIntegration0.simpsonsMethod((int) '#', (-7.326510413260626d), 177.83695398750095d);
        java.lang.Class<?> wildcardClass11 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.4677877090000082E-17d) + "'", double6 == (-1.4677877090000082E-17d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.0431863480639123E38d + "'", double10 == 2.0431863480639123E38d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double16 = simpsonIntegration0.simpsonsMethod(0, 0.0d, 0.9226783964008627d);
        double double18 = simpsonIntegration0.f(86.98501851068946d);
        double double22 = simpsonIntegration0.simpsonsMethod((int) (byte) -1, (-0.0012649947976536042d), 53.95124589585826d);
        java.lang.Class<?> wildcardClass23 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.2634141046617278E-34d) + "'", double18 == (-1.2634141046617278E-34d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.0d) + "'", double22 == (-0.0d));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double12 = simpsonIntegration0.simpsonsMethod(1, 0.9226783964008627d, 4.058365782993775d);
        double double16 = simpsonIntegration0.simpsonsMethod(100, 2.7182818284590455d, (double) 10.0f);
        double double18 = simpsonIntegration0.f(1.0d);
        double double22 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.15048705932345452d), 2.609103086070402E-5d);
        double double26 = simpsonIntegration0.simpsonsMethod((int) (byte) 10, (-8.792109355360879E-19d), (-0.21978766666481014d));
        double double30 = simpsonIntegration0.simpsonsMethod((int) (byte) 10, 2.485648803550844E-41d, 2.961776856125533d);
        double double32 = simpsonIntegration0.f((-4.328414981812432E-17d));
        java.lang.Class<?> wildcardClass33 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.11021647807132358d) + "'", double12 == (-0.11021647807132358d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.005762150198617093d) + "'", double16 == (-0.005762150198617093d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.103638323514327d + "'", double18 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.20064417731540868d) + "'", double22 == (-0.20064417731540868d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-4.328414981812432E-17d) + "'", double26 == (-4.328414981812432E-17d));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-6.135754481570391E-41d) + "'", double30 == (-6.135754481570391E-41d));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 4.0d + "'", double32 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double12 = simpsonIntegration0.simpsonsMethod(0, (double) 1L, (double) 100.0f);
        double double14 = simpsonIntegration0.f((-1.0781454254561233E-20d));
        double double18 = simpsonIntegration0.simpsonsMethod((int) (byte) 0, (-0.001693227728973961d), (-0.11021647807132358d));
        double double22 = simpsonIntegration0.simpsonsMethod(100, (-2.0076911253185856E-16d), 4.031290735472884d);
        double double24 = simpsonIntegration0.f(9.931906770383255E-23d);
        java.lang.Class<?> wildcardClass25 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.2395293152101427E-40d) + "'", double12 == (-1.2395293152101427E-40d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.0025130411114009576d) + "'", double18 == (-0.0025130411114009576d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.366283488214899E-15d + "'", double22 == 4.366283488214899E-15d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 4.0d + "'", double24 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double14 = simpsonIntegration0.f(10.0d);
        double double16 = simpsonIntegration0.f((double) (short) 10);
        double double18 = simpsonIntegration0.f((-0.2100593206839558d));
        double double20 = simpsonIntegration0.f(2.6478847316533405E47d);
        double double22 = simpsonIntegration0.f((-7.047753488102803E-20d));
        java.lang.Class<?> wildcardClass23 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.004358393257198546d) + "'", double14 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.880565806253262d + "'", double18 == 4.880565806253262d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.0d) + "'", double20 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.0d + "'", double22 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        double double16 = simpsonIntegration0.f(8.154845485377137d);
        double double20 = simpsonIntegration0.simpsonsMethod(10, (double) (short) 10, (double) 1L);
        double double24 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 351.55527719495865d, 3.999895636557305d);
        java.lang.Class<?> wildcardClass25 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.017959162462641984d) + "'", double16 == (-0.017959162462641984d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 3.652737548989758d + "'", double20 == 3.652737548989758d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-25.7567339920559d) + "'", double24 == (-25.7567339920559d));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double14 = simpsonIntegration0.f(10.0d);
        double double16 = simpsonIntegration0.f((double) (short) 10);
        double double20 = simpsonIntegration0.simpsonsMethod((int) (short) 1, 13.318805355809339d, 13.318805355809339d);
        double double22 = simpsonIntegration0.f((-1.3332985455191015d));
        double double26 = simpsonIntegration0.simpsonsMethod((int) (byte) 10, 4.3947944567089737E105d, 4.000000000003079d);
        java.lang.Class<?> wildcardClass27 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.004358393257198546d) + "'", double14 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.0012649947976536042d) + "'", double20 == (-0.0012649947976536042d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 8.430431742414195d + "'", double22 == 8.430431742414195d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-3.219738730368386E104d) + "'", double26 == (-3.219738730368386E104d));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
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
        java.lang.Class<?> wildcardClass29 = simpsonIntegration0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 0.0d, (double) (byte) 1);
        double double16 = simpsonIntegration0.f((double) 1L);
        double double18 = simpsonIntegration0.f(8.154845485377137d);
        double double20 = simpsonIntegration0.f((-1.0392841613694731E-11d));
        double double22 = simpsonIntegration0.f(336.6334782286822d);
        java.lang.Class<?> wildcardClass23 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.103638323514327d + "'", double16 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.017959162462641984d) + "'", double18 == (-0.017959162462641984d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.000000000041571d + "'", double20 == 4.000000000041571d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-7.181865381904353E-142d) + "'", double22 == (-7.181865381904353E-142d));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        double double18 = simpsonIntegration0.simpsonsMethod((int) (short) 10, (double) (short) 100, (-1.2395293152101427E-40d));
        double double20 = simpsonIntegration0.f(3.204500014245096d);
        double double24 = simpsonIntegration0.simpsonsMethod((int) (short) 100, (-1.2395293152101427E-40d), 0.44560275377566727d);
        java.lang.Class<?> wildcardClass25 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 133.33333333333334d + "'", double18 == 133.33333333333334d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.2543836240055899d) + "'", double20 == (-0.2543836240055899d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-3.0177406865107807E-38d) + "'", double24 == (-3.0177406865107807E-38d));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
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
        double double40 = simpsonIntegration0.simpsonsMethod((int) (short) 100, 4.991048879292929E-41d, (-1.039409718471294E-6d));
        java.lang.Class<?> wildcardClass41 = simpsonIntegration0.getClass();
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
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 1.9964216268155975E-38d + "'", double40 == 1.9964216268155975E-38d);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double2 = simpsonIntegration0.f((double) 0);
        double double6 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 1.2395293152101427E-40d, (double) (byte) 10);
        double double8 = simpsonIntegration0.f(0.0d);
        double double12 = simpsonIntegration0.simpsonsMethod((int) ' ', (-0.21978766666458455d), (-1.2395293152101427E-40d));
        double double14 = simpsonIntegration0.f(4.3947944567089737E105d);
        double double18 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 1.415320313230246E34d, 3.516335322931642d);
        double double20 = simpsonIntegration0.f(2.833789995040116E16d);
        double double22 = simpsonIntegration0.f(46.66666666663074d);
        java.lang.Class<?> wildcardClass23 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.8007854031706057E-43d) + "'", double6 == (-1.8007854031706057E-43d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.0d + "'", double8 == 4.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 37867.06926325643d + "'", double12 == 37867.06926325643d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.0d) + "'", double14 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.1723421175368526E33d) + "'", double18 == (-1.1723421175368526E33d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.0d) + "'", double20 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.1752745249820245E-17d) + "'", double22 == (-1.1752745249820245E-17d));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 0.0d, (double) (byte) 1);
        double double16 = simpsonIntegration0.f((double) 1L);
        double double18 = simpsonIntegration0.f(4.0d);
        double double22 = simpsonIntegration0.simpsonsMethod((int) (short) 100, (-1.3679920553853836E-39d), 1.2514464254193938d);
        double double24 = simpsonIntegration0.f((double) (short) 10);
        double double26 = simpsonIntegration0.f(46.66666666663074d);
        double double30 = simpsonIntegration0.simpsonsMethod((int) (short) -1, 133.3298545519102d, (-9.813455426063182E-4d));
        java.lang.Class<?> wildcardClass31 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.103638323514327d + "'", double16 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.21978766666481014d) + "'", double18 == (-0.21978766666481014d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-9.525478241589842E-38d) + "'", double22 == (-9.525478241589842E-38d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-0.004358393257198546d) + "'", double24 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.1752745249820245E-17d) + "'", double26 == (-1.1752745249820245E-17d));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) 'a', 10.0d, 2.002615341358857d);
        double double6 = simpsonIntegration0.f((-124010.55567924457d));
        double double8 = simpsonIntegration0.f((-0.0016866597302048056d));
        java.lang.Class<?> wildcardClass9 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.016155316979210545d) + "'", double4 == (-0.016155316979210545d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.NEGATIVE_INFINITY + "'", double6 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.0067494821397505d + "'", double8 == 4.0067494821397505d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (byte) 0, (double) 0L, (double) ' ');
        double double6 = simpsonIntegration0.f((-1.8007854031706057E-43d));
        double double10 = simpsonIntegration0.simpsonsMethod((int) (byte) 10, (-0.01453886097417405d), 0.00821321538610416d);
        java.lang.Class<?> wildcardClass11 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.6198814034757335d) + "'", double10 == (-0.6198814034757335d));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double8 = simpsonIntegration0.f((double) (-1L));
        double double10 = simpsonIntegration0.f((double) 10);
        double double14 = simpsonIntegration0.simpsonsMethod((int) (short) 1, 2.1230017461922604E-25d, (-0.29259450005390564d));
        double double16 = simpsonIntegration0.f(0.0d);
        double double20 = simpsonIntegration0.simpsonsMethod(0, 5.470395964063189d, (-0.06370583432788772d));
        double double24 = simpsonIntegration0.simpsonsMethod((int) (short) -1, 3.8830304245077953d, (-7.125983677388118E-39d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.154845485377137d + "'", double8 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.004358393257198546d) + "'", double10 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 7.423268877573701E-25d + "'", double14 == 7.423268877573701E-25d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.0d + "'", double16 == 4.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 7.7657557957586585d + "'", double20 == 7.7657557957586585d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        double double18 = simpsonIntegration0.simpsonsMethod((int) (short) 10, (double) (short) 100, (-1.2395293152101427E-40d));
        double double20 = simpsonIntegration0.f((-0.24446942585486767d));
        java.lang.Class<?> wildcardClass21 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 133.33333333333334d + "'", double18 == 133.33333333333334d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 5.031457561902246d + "'", double20 == 5.031457561902246d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
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
        double double32 = simpsonIntegration0.f(4.000000000000001d);
        double double36 = simpsonIntegration0.simpsonsMethod((int) ' ', (-2.2580525594652775E-19d), (-0.0014130171899539316d));
        java.lang.Class<?> wildcardClass37 = simpsonIntegration0.getClass();
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
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-0.21978766666481012d) + "'", double32 == (-0.21978766666481012d));
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-2.894392772010049E-17d) + "'", double36 == (-2.894392772010049E-17d));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(0, (double) ' ', (double) (-1));
        double double18 = simpsonIntegration0.f((-2.0076911253185856E-16d));
        double double20 = simpsonIntegration0.f((-0.21850356693465028d));
        double double22 = simpsonIntegration0.f(1586.410651560393d);
        double double26 = simpsonIntegration0.simpsonsMethod((int) (short) 10, (-7.027389983271083E-39d), 4.921252850810739d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 86.98501851068946d + "'", double16 == 86.98501851068946d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.000000000000001d + "'", double18 == 4.000000000000001d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.9174503293501d + "'", double20 == 4.9174503293501d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.0d) + "'", double22 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.035797748680461E-38d + "'", double26 == 1.035797748680461E-38d);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 0.0d, (double) (byte) 1);
        double double16 = simpsonIntegration0.f((double) (-1));
        double double20 = simpsonIntegration0.simpsonsMethod(0, 3.218233484419937d, 0.6941125599944457d);
        double double22 = simpsonIntegration0.f((double) (short) 10);
        double double26 = simpsonIntegration0.simpsonsMethod(0, (-3.00839694745219d), (-6.963036892259676E-41d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 8.154845485377137d + "'", double16 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.885248141323014d + "'", double20 == 1.885248141323014d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.004358393257198546d) + "'", double22 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-4.011195929936253d) + "'", double26 == (-4.011195929936253d));
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (byte) -1, (-1.8007854031706057E-43d), (double) (byte) 0);
        double double8 = simpsonIntegration0.simpsonsMethod(0, (double) 0.0f, 0.0d);
        double double10 = simpsonIntegration0.f((-0.219372853236844d));
        java.lang.Class<?> wildcardClass11 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.921252850810739d + "'", double10 == 4.921252850810739d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 0.0d, (double) (byte) 1);
        double double16 = simpsonIntegration0.f((double) (-1));
        double double20 = simpsonIntegration0.simpsonsMethod((int) (short) -1, 3.652737548989758d, 3.218233484419937d);
        double double24 = simpsonIntegration0.simpsonsMethod((int) (byte) 1, 10.0d, 4.1439347378385145d);
        java.lang.Class<?> wildcardClass25 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 8.154845485377137d + "'", double16 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-0.6968547617730776d) + "'", double24 == (-0.6968547617730776d));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
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
        java.lang.Class<?> wildcardClass29 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.154845485377137d + "'", double8 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.004358393257198546d) + "'", double10 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2.0018152742371256d + "'", double14 == 2.0018152742371256d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.6248127531564629d) + "'", double18 == (-0.6248127531564629d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.0d + "'", double20 == 4.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.997483484540344d + "'", double24 == 1.997483484540344d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 62279.944702754045d + "'", double28 == 62279.944702754045d);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double14 = simpsonIntegration0.f((double) (byte) 10);
        double double16 = simpsonIntegration0.f((-1.2216106046044858E-18d));
        double double20 = simpsonIntegration0.simpsonsMethod((int) (byte) 1, 7.605406990167605E-70d, 2.1169125427498074d);
        double double24 = simpsonIntegration0.simpsonsMethod(0, 972.9594587424306d, 3.778386660053488E16d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.004358393257198546d) + "'", double14 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.0d + "'", double16 == 4.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-2.938329611655847E-71d) + "'", double20 == (-2.938329611655847E-71d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        double double16 = simpsonIntegration0.f((double) 10L);
        double double18 = simpsonIntegration0.f((double) (short) 10);
        double double20 = simpsonIntegration0.f((-7.698547564139474E-13d));
        double double24 = simpsonIntegration0.simpsonsMethod((int) (short) -1, 0.44560275377566727d, 4.017452540903338d);
        double double28 = simpsonIntegration0.simpsonsMethod((int) (byte) 100, (double) (byte) 10, 9.726641315455883d);
        java.lang.Class<?> wildcardClass29 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.004358393257198546d) + "'", double18 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.000000000003079d + "'", double20 == 4.000000000003079d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-0.01803647294929195d) + "'", double28 == (-0.01803647294929195d));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) (short) -1);
        double double14 = simpsonIntegration0.f(187.8648496323537d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.154845485377137d + "'", double12 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-9.098594192354854E-78d) + "'", double14 == (-9.098594192354854E-78d));
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 0.0d, (double) (byte) 1);
        double double16 = simpsonIntegration0.f((double) 1L);
        double double20 = simpsonIntegration0.simpsonsMethod((int) (byte) 1, (double) (byte) 0, (double) 100L);
        double double24 = simpsonIntegration0.simpsonsMethod((int) (short) 1, (-0.20064417731540868d), (-0.21545281845024855d));
        double double28 = simpsonIntegration0.simpsonsMethod((int) (byte) -1, 263.67333736052746d, (-7.047753488102803E-20d));
        java.lang.Class<?> wildcardClass29 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.103638323514327d + "'", double16 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.0d) + "'", double20 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-0.716016414389119d) + "'", double24 == (-0.716016414389119d));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double2 = simpsonIntegration0.f((double) 0);
        double double6 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 1.2395293152101427E-40d, (double) (byte) 10);
        double double10 = simpsonIntegration0.simpsonsMethod((int) (byte) 100, (double) (byte) 10, (double) (byte) 10);
        double double14 = simpsonIntegration0.simpsonsMethod((int) (short) 100, (-0.29306041653042497d), 37867.06926325643d);
        double double16 = simpsonIntegration0.f(7.277492823503115E74d);
        java.lang.Class<?> wildcardClass17 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.8007854031706057E-43d) + "'", double6 == (-1.8007854031706057E-43d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.01453886097417405d) + "'", double10 == (-0.01453886097417405d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.0d) + "'", double14 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.0d) + "'", double16 == (-0.0d));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        double double16 = simpsonIntegration0.f(8.154845485377137d);
        double double20 = simpsonIntegration0.simpsonsMethod((int) (short) 100, (-7.047753488102803E-20d), 468.7403695932782d);
        double double22 = simpsonIntegration0.f(7.201889327800033d);
        java.lang.Class<?> wildcardClass23 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.017959162462641984d) + "'", double16 == (-0.017959162462641984d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.154813702961169E-216d + "'", double20 == 4.154813702961169E-216d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.03566952446383129d) + "'", double22 == (-0.03566952446383129d));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double8 = simpsonIntegration0.f((double) (-1L));
        double double10 = simpsonIntegration0.f((double) 10);
        double double14 = simpsonIntegration0.simpsonsMethod((int) (short) 1, 2.1230017461922604E-25d, (-0.29259450005390564d));
        java.lang.Class<?> wildcardClass15 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.154845485377137d + "'", double8 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.004358393257198546d) + "'", double10 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 7.423268877573701E-25d + "'", double14 == 7.423268877573701E-25d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) (short) -1);
        double double16 = simpsonIntegration0.simpsonsMethod((int) (byte) -1, 4.072157215642454d, (-0.7317724584449441d));
        double double20 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 7.201889327800033d, (-3.670069962076287E-24d));
        double double24 = simpsonIntegration0.simpsonsMethod(1, (double) '4', (-0.21978766666481014d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.154845485377137d + "'", double12 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 9.602519103733377d + "'", double20 == 9.602519103733377d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 85.33317393169449d + "'", double24 == 85.33317393169449d);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double14 = simpsonIntegration0.simpsonsMethod((int) (short) 10, (double) (byte) 1, (-1.2634141046617278E-34d));
        double double16 = simpsonIntegration0.f(0.44560275377566727d);
        double double18 = simpsonIntegration0.f(1.677349340227826E13d);
        java.lang.Class<?> wildcardClass19 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2.002615341358857d + "'", double14 == 2.002615341358857d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 2.4345859750797203d + "'", double16 == 2.4345859750797203d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.0d) + "'", double18 == (-0.0d));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
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
        double double38 = simpsonIntegration0.f((-124010.55567924457d));
        double double42 = simpsonIntegration0.simpsonsMethod((int) (short) 100, (-0.19222885149765373d), (-0.16338567387879238d));
        double double44 = simpsonIntegration0.f((double) (-1.0f));
        java.lang.Class<?> wildcardClass45 = simpsonIntegration0.getClass();
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
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + Double.NEGATIVE_INFINITY + "'", double38 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 8.799770009341391E10d + "'", double42 == 8.799770009341391E10d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 8.154845485377137d + "'", double44 == 8.154845485377137d);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double16 = simpsonIntegration0.simpsonsMethod((int) (byte) 1, 9.158693229411702d, (-1.4677877090000082E-17d));
        double double18 = simpsonIntegration0.f(4.000878994199535d);
        java.lang.Class<?> wildcardClass19 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 12.185911303806977d + "'", double16 == 12.185911303806977d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.21972325516464264d) + "'", double18 == (-0.21972325516464264d));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double14 = simpsonIntegration0.f(10.0d);
        double double16 = simpsonIntegration0.f((double) (short) 10);
        double double18 = simpsonIntegration0.f((-0.2100593206839558d));
        double double20 = simpsonIntegration0.f(2.6478847316533405E47d);
        double double22 = simpsonIntegration0.f((double) 10);
        java.lang.Class<?> wildcardClass23 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.004358393257198546d) + "'", double14 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.880565806253262d + "'", double18 == 4.880565806253262d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.0d) + "'", double20 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.004358393257198546d) + "'", double22 == (-0.004358393257198546d));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (byte) 0, (double) 0L, (double) ' ');
        double double6 = simpsonIntegration0.f((-1.8007854031706057E-43d));
        double double10 = simpsonIntegration0.simpsonsMethod((int) (short) 10, 4.017452540903338d, (-1.2634141046617278E-34d));
        double double14 = simpsonIntegration0.simpsonsMethod(1, 1.3573857385474846d, 19.13477449062135d);
        double double16 = simpsonIntegration0.f((double) 10.0f);
        double double20 = simpsonIntegration0.simpsonsMethod((int) (short) 100, 0.44560275377566727d, 5.031457561902246d);
        double double22 = simpsonIntegration0.f(2.0011516619038376d);
        java.lang.Class<?> wildcardClass23 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.129134273777278d + "'", double10 == 4.129134273777278d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.039409718471294E-6d) + "'", double14 == (-1.039409718471294E-6d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.21793386075293272d) + "'", double20 == (-0.21793386075293272d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-6.22903670710931E-4d) + "'", double22 == (-6.22903670710931E-4d));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (byte) 0, (double) 0L, (double) ' ');
        double double8 = simpsonIntegration0.simpsonsMethod((int) '#', (double) 'a', 0.9226783964008627d);
        double double10 = simpsonIntegration0.f((-0.01453886097417405d));
        double double12 = simpsonIntegration0.f((double) 100L);
        double double14 = simpsonIntegration0.f((double) (short) 1);
        java.lang.Class<?> wildcardClass15 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.46343442189374d + "'", double8 == 40.46343442189374d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.058365782993775d + "'", double10 == 4.058365782993775d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-3.718587945630428E-40d) + "'", double12 == (-3.718587945630428E-40d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.103638323514327d + "'", double14 == 1.103638323514327d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double14 = simpsonIntegration0.f(10.0d);
        double double16 = simpsonIntegration0.f((double) (short) 10);
        double double20 = simpsonIntegration0.simpsonsMethod((int) (byte) 10, (double) 1, 0.865609122350895d);
        double double24 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 1.6462869391505874E-17d, 1.415320313230246E34d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.004358393257198546d) + "'", double14 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.19222885149765373d) + "'", double20 == (-0.19222885149765373d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double12 = simpsonIntegration0.simpsonsMethod(0, (double) 1L, (double) 100.0f);
        double double14 = simpsonIntegration0.f(53.95124589585826d);
        double double16 = simpsonIntegration0.f((-3.897858977387694E-34d));
        java.lang.Class<?> wildcardClass17 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.2395293152101427E-40d) + "'", double12 == (-1.2395293152101427E-40d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0781454254561233E-20d) + "'", double14 == (-1.0781454254561233E-20d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.0d + "'", double16 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (byte) 0, (double) 0L, (double) ' ');
        double double6 = simpsonIntegration0.f((-1.8007854031706057E-43d));
        double double10 = simpsonIntegration0.simpsonsMethod((int) (byte) 100, (-5.541700050128766d), 0.6963109328077465d);
        java.lang.Class<?> wildcardClass11 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.3487052438746718E246d + "'", double10 == 1.3487052438746718E246d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(0, (double) ' ', (double) (-1));
        double double18 = simpsonIntegration0.f(1.2395293152101427E-40d);
        double double20 = simpsonIntegration0.f((-0.004358393257198546d));
        double double22 = simpsonIntegration0.f((double) 0L);
        double double24 = simpsonIntegration0.f(1.2900871385432533d);
        double double26 = simpsonIntegration0.f(13.625131410312626d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 86.98501851068946d + "'", double16 == 86.98501851068946d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.017452540903338d + "'", double20 == 4.017452540903338d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.0d + "'", double22 == 4.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.642887111768759d + "'", double24 == 0.642887111768759d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-2.1973647973812517E-4d) + "'", double26 == (-2.1973647973812517E-4d));
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(10, (-0.0d), (double) (byte) 0);
        double double18 = simpsonIntegration0.f((double) 0L);
        double double22 = simpsonIntegration0.simpsonsMethod((int) (short) 100, (double) 100, (double) 10L);
        double double24 = simpsonIntegration0.f((double) (short) 10);
        double double26 = simpsonIntegration0.f(53.95124589585826d);
        java.lang.Class<?> wildcardClass27 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.0d) + "'", double16 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.14527977523995153d) + "'", double22 == (-0.14527977523995153d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-0.004358393257198546d) + "'", double24 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0781454254561233E-20d) + "'", double26 == (-1.0781454254561233E-20d));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(0, (double) ' ', (double) (-1));
        double double18 = simpsonIntegration0.f(1.2395293152101427E-40d);
        double double20 = simpsonIntegration0.f((-0.004358393257198546d));
        double double22 = simpsonIntegration0.f((-0.2100593206839558d));
        double double26 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.3394344128489119d, (-1.0781454254561233E-20d));
        double double28 = simpsonIntegration0.f((-5.298978042385537d));
        double double32 = simpsonIntegration0.simpsonsMethod((int) (byte) -1, 4.086622276466951d, 3.7547577511829258d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 86.98501851068946d + "'", double16 == 86.98501851068946d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.017452540903338d + "'", double20 == 4.017452540903338d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.880565806253262d + "'", double22 == 4.880565806253262d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.45257921713188254d + "'", double26 == 0.45257921713188254d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-4819.016414941848d) + "'", double28 == (-4819.016414941848d));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double14 = simpsonIntegration0.simpsonsMethod(10, 0.0d, (double) (byte) 1);
        double double16 = simpsonIntegration0.f((double) 1L);
        double double18 = simpsonIntegration0.f((double) '4');
        double double22 = simpsonIntegration0.simpsonsMethod(10, 133.33333333333334d, (-3.3283848740159176E-4d));
        double double26 = simpsonIntegration0.simpsonsMethod((int) (short) 100, (-0.0012649947976536042d), (double) 1L);
        java.lang.Class<?> wildcardClass27 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.103638323514327d + "'", double16 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-7.047753488102803E-20d) + "'", double18 == (-7.047753488102803E-20d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 177.83695398750095d + "'", double22 == 177.83695398750095d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-0.15495903000016553d) + "'", double26 == (-0.15495903000016553d));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double14 = simpsonIntegration0.simpsonsMethod((int) (short) 10, (double) (byte) 1, (-1.2634141046617278E-34d));
        double double16 = simpsonIntegration0.f(4.880565806253262d);
        double double18 = simpsonIntegration0.f(4.000004157639954d);
        double double20 = simpsonIntegration0.f(8.154845485377137d);
        double double24 = simpsonIntegration0.simpsonsMethod((int) 'a', 46.66666666663074d, (-0.7317724584449441d));
        double double26 = simpsonIntegration0.f(4.9174503293501d);
        java.lang.Class<?> wildcardClass27 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2.002615341358857d + "'", double14 == 2.002615341358857d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.15048705932345452d) + "'", double16 == (-0.15048705932345452d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.21978736206516547d) + "'", double18 == (-0.21978736206516547d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.017959162462641984d) + "'", double20 == (-0.017959162462641984d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 112.02938954346982d + "'", double24 == 112.02938954346982d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-0.14768214005492689d) + "'", double26 == (-0.14768214005492689d));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        double double18 = simpsonIntegration0.simpsonsMethod((int) (short) 10, (double) (short) 100, (-1.2395293152101427E-40d));
        double double22 = simpsonIntegration0.simpsonsMethod(100, 4.017452540903338d, 0.0d);
        double double26 = simpsonIntegration0.simpsonsMethod((int) ' ', (-8.792109355360879E-19d), (-0.716016414389119d));
        double double28 = simpsonIntegration0.f((-1.0781454254561233E-20d));
        double double32 = simpsonIntegration0.simpsonsMethod((int) '4', (-0.31931582947408904d), 5.244886555713727d);
        double double36 = simpsonIntegration0.simpsonsMethod((int) (byte) 1, (-1.3679920553853836E-39d), (-5.77121997574991E-17d));
        java.lang.Class<?> wildcardClass37 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 133.33333333333334d + "'", double18 == 133.33333333333334d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.12913427377727d + "'", double22 == 4.12913427377727d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-2.0076911253185856E-16d) + "'", double26 == (-2.0076911253185856E-16d));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 4.0d + "'", double28 == 4.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 8949499.808293283d + "'", double32 == 8949499.808293283d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-3.647978814361023E-39d) + "'", double36 == (-3.647978814361023E-39d));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (byte) -1, (-1.8007854031706057E-43d), (double) (byte) 0);
        double double8 = simpsonIntegration0.simpsonsMethod(0, (double) 0.0f, 0.0d);
        double double10 = simpsonIntegration0.f((-0.219372853236844d));
        double double12 = simpsonIntegration0.f(4.001139810731062d);
        java.lang.Class<?> wildcardClass13 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.921252850810739d + "'", double10 == 4.921252850810739d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.21970413744981404d) + "'", double12 == (-0.21970413744981404d));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double16 = simpsonIntegration0.simpsonsMethod(10, (-0.0d), (double) (byte) 0);
        double double18 = simpsonIntegration0.f((double) 0L);
        double double22 = simpsonIntegration0.simpsonsMethod((int) (short) 100, (double) 100, (double) 10L);
        double double26 = simpsonIntegration0.simpsonsMethod(10, 62.22222222217432d, 4.000000000041571d);
        java.lang.Class<?> wildcardClass27 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.0d) + "'", double16 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.14527977523995153d) + "'", double22 == (-0.14527977523995153d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-4.5585590122404955d) + "'", double26 == (-4.5585590122404955d));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (byte) -1, (-1.8007854031706057E-43d), (double) (byte) 0);
        double double8 = simpsonIntegration0.simpsonsMethod(0, (double) 0.0f, 0.0d);
        double double10 = simpsonIntegration0.f((-1.0294644847870642E67d));
        double double14 = simpsonIntegration0.simpsonsMethod((int) (byte) -1, 4.031290735472884d, 11.199462483718854d);
        java.lang.Class<?> wildcardClass15 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.NEGATIVE_INFINITY + "'", double10 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double14 = simpsonIntegration0.f((double) (byte) 10);
        double double16 = simpsonIntegration0.f((-2.9383834183063776E-39d));
        java.lang.Class<?> wildcardClass17 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.004358393257198546d) + "'", double14 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.0d + "'", double16 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        double double18 = simpsonIntegration0.simpsonsMethod((int) (short) 10, (double) (short) 100, (-1.2395293152101427E-40d));
        double double22 = simpsonIntegration0.simpsonsMethod((int) '#', (double) 0, (double) 1.0f);
        double double24 = simpsonIntegration0.f(86.98501851068946d);
        double double26 = simpsonIntegration0.f(2.609103086070402E-5d);
        java.lang.Class<?> wildcardClass27 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 133.33333333333334d + "'", double18 == 133.33333333333334d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.2634141046617278E-34d) + "'", double24 == (-1.2634141046617278E-34d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 3.999895636557305d + "'", double26 == 3.999895636557305d);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 1.0f);
        double double14 = simpsonIntegration0.f((double) (-1L));
        double double16 = simpsonIntegration0.f((double) 10L);
        double double18 = simpsonIntegration0.f((double) (short) 10);
        double double22 = simpsonIntegration0.simpsonsMethod(100, 0.0d, (-1.3332985455191015d));
        double double24 = simpsonIntegration0.f(7.149920860492725E-6d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.103638323514327d + "'", double12 == 1.103638323514327d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.154845485377137d + "'", double14 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.004358393257198546d) + "'", double18 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 3.99997140036768d + "'", double24 == 3.99997140036768d);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, (-0.004358393257198546d), 8.154845485377137d);
        double double10 = simpsonIntegration0.f(1.103638323514327d);
        double double12 = simpsonIntegration0.f((double) 10);
        double double16 = simpsonIntegration0.simpsonsMethod((int) '#', (-1.0d), (double) 100.0f);
        double double18 = simpsonIntegration0.f((double) '#');
        double double20 = simpsonIntegration0.f(4.129134273777278d);
        double double22 = simpsonIntegration0.f((-0.39478808990516345d));
        java.lang.Class<?> wildcardClass23 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.609103086070402E-5d + "'", double8 == 2.609103086070402E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9226783964008627d + "'", double10 == 0.9226783964008627d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 2.1230017461922604E-25d + "'", double16 == 2.1230017461922604E-25d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-7.698547564139474E-13d) + "'", double18 == (-7.698547564139474E-13d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.2100593206839558d) + "'", double20 == (-0.2100593206839558d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 5.704975082960015d + "'", double22 == 5.704975082960015d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double10 = simpsonIntegration0.simpsonsMethod(1, 0.0d, (-0.0d));
        double double12 = simpsonIntegration0.f((double) 10L);
        double double14 = simpsonIntegration0.f(10.0d);
        double double16 = simpsonIntegration0.f((double) (short) 10);
        double double20 = simpsonIntegration0.simpsonsMethod((int) (short) 1, 13.318805355809339d, 13.318805355809339d);
        double double22 = simpsonIntegration0.f((-1.3332985455191015d));
        double double24 = simpsonIntegration0.f(4.129134273777278d);
        double double26 = simpsonIntegration0.f(2.566645225308353d);
        double double30 = simpsonIntegration0.simpsonsMethod(0, (-0.0016613224797858684d), 4.923066394071297d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.004358393257198546d) + "'", double12 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.004358393257198546d) + "'", double14 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.004358393257198546d) + "'", double16 == (-0.004358393257198546d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.0012649947976536042d) + "'", double20 == (-0.0012649947976536042d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 8.430431742414195d + "'", double22 == 8.430431742414195d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-0.2100593206839558d) + "'", double24 == (-0.2100593206839558d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-0.19871408377292402d) + "'", double26 == (-0.19871408377292402d));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 8.154724522054004E-5d + "'", double30 == 8.154724522054004E-5d);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) 'a', 10.0d, 2.002615341358857d);
        double double8 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 86.98501851068946d, (-0.2144125992859175d));
        java.lang.Class<?> wildcardClass9 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.016155316979210545d) + "'", double4 == (-0.016155316979210545d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 142.06302919295956d + "'", double8 == 142.06302919295956d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        com.thealgorithms.maths.SimpsonIntegration simpsonIntegration0 = new com.thealgorithms.maths.SimpsonIntegration();
        double double4 = simpsonIntegration0.simpsonsMethod((int) (short) 0, 0.0d, (double) 100);
        double double6 = simpsonIntegration0.f((-0.0d));
        double double8 = simpsonIntegration0.f((double) (-1L));
        double double10 = simpsonIntegration0.f(Double.NEGATIVE_INFINITY);
        double double14 = simpsonIntegration0.simpsonsMethod((int) (byte) 10, 2.6478847316533405E47d, (-0.39478808990516345d));
        java.lang.Class<?> wildcardClass15 = simpsonIntegration0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.154845485377137d + "'", double8 == 8.154845485377137d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.NEGATIVE_INFINITY + "'", double10 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5.035372138877525E47d + "'", double14 == 5.035372138877525E47d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }
}

