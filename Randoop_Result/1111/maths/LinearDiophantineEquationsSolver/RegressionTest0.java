package maths.LinearDiophantineEquationsSolver;

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
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution1 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.thealgorithms.maths.LinearDiophantineEquationsSolver$Equation.a()\" because \"equation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 1, (int) (short) 10, (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = equation3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) 1, (int) (short) 1);
        java.lang.Class<?> wildcardClass3 = solution2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((-1), (int) '4');
        java.lang.Class<?> wildcardClass3 = solution2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution1 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution1);
        gcdSolutionWrapper2.setGcd((int) ' ');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int8 = solution7.getY();
        java.lang.String str9 = solution7.toString();
        gcdSolutionWrapper2.setSolution(solution7);
        java.lang.Class<?> wildcardClass11 = solution7.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Solution[x=97, y=1]" + "'", str9, "Solution[x=97, y=1]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution1 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution1);
        boolean boolean4 = gcdSolutionWrapper2.equals((java.lang.Object) 1);
        java.lang.String str5 = gcdSolutionWrapper2.toString();
        java.lang.String str6 = gcdSolutionWrapper2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=null]" + "'", str5, "GcdSolutionWrapper[gcd=1, solution=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=null]" + "'", str6, "GcdSolutionWrapper[gcd=1, solution=null]");
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        int int4 = equation3.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        java.lang.Class<?> wildcardClass6 = equation3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int3 = solution2.getY();
        java.lang.String str4 = solution2.toString();
        solution2.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution8 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution8);
        boolean boolean11 = gcdSolutionWrapper9.equals((java.lang.Object) "Equation[a=0, b=-1, c=35]");
        boolean boolean12 = solution2.equals((java.lang.Object) boolean11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Solution[x=97, y=1]" + "'", str4, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution4 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        java.lang.Class<?> wildcardClass5 = solution4.getClass();
        org.junit.Assert.assertNotNull(solution4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution1 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution1);
        gcdSolutionWrapper2.setGcd((int) ' ');
        int int5 = gcdSolutionWrapper2.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = gcdSolutionWrapper2.getSolution();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNull(solution6);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        java.lang.String str4 = equation3.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        java.lang.String str6 = solution5.toString();
        java.lang.Class<?> wildcardClass7 = solution5.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str4, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Solution[x=0, y=-35]" + "'", str6, "Solution[x=0, y=-35]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int4 = equation3.c();
        int int5 = equation3.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int10 = solution9.getY();
        solution9.setY((int) (byte) 1);
        boolean boolean14 = solution9.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper15 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution9);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution16 = gcdSolutionWrapper15.getSolution();
        java.lang.String str17 = gcdSolutionWrapper15.toString();
        gcdSolutionWrapper15.setGcd((int) (byte) 1);
        boolean boolean20 = equation3.equals((java.lang.Object) gcdSolutionWrapper15);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution21 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        int int22 = solution21.getX();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(solution16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str17, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(solution21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution1 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution1);
        gcdSolutionWrapper2.setGcd((int) ' ');
        gcdSolutionWrapper2.setGcd((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = gcdSolutionWrapper2.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution8 = gcdSolutionWrapper2.getSolution();
        org.junit.Assert.assertNull(solution7);
        org.junit.Assert.assertNull(solution8);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int8 = solution7.getY();
        solution7.setY((int) (byte) 1);
        boolean boolean12 = solution7.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution7);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution14 = gcdSolutionWrapper13.getSolution();
        java.lang.String str15 = gcdSolutionWrapper13.toString();
        gcdSolutionWrapper13.setGcd((int) (byte) 1);
        boolean boolean18 = equation3.equals((java.lang.Object) gcdSolutionWrapper13);
        int int19 = gcdSolutionWrapper13.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution20 = gcdSolutionWrapper13.getSolution();
        java.lang.String str21 = gcdSolutionWrapper13.toString();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(solution14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str15, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(solution20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]" + "'", str21, "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]");
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution4 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        int int5 = solution4.getX();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(32, (int) (short) 10);
        boolean boolean9 = solution4.equals((java.lang.Object) 32);
        int int10 = solution4.getX();
        org.junit.Assert.assertNotNull(solution4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution0 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution.NO_SOLUTION;
        solution0.setX((int) (short) 1);
        org.junit.Assert.assertNotNull(solution0);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution1 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution1);
        gcdSolutionWrapper2.setGcd((int) ' ');
        gcdSolutionWrapper2.setGcd((int) (short) 100);
        java.lang.String str7 = gcdSolutionWrapper2.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GcdSolutionWrapper[gcd=100, solution=null]" + "'", str7, "GcdSolutionWrapper[gcd=100, solution=null]");
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution4 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        java.lang.String str5 = solution4.toString();
        solution4.setX((int) (short) 10);
        solution4.setX((-1));
        org.junit.Assert.assertNotNull(solution4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Solution[x=0, y=0]" + "'", str5, "Solution[x=0, y=0]");
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((-35), (int) (short) 1, (-1));
        int int4 = equation3.c();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) '4', (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution3);
        java.lang.String str5 = gcdSolutionWrapper4.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = gcdSolutionWrapper4.getSolution();
        gcdSolutionWrapper4.setGcd(52);
        java.lang.Class<?> wildcardClass9 = gcdSolutionWrapper4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]" + "'", str5, "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]");
        org.junit.Assert.assertNotNull(solution6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution1 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution1);
        boolean boolean4 = gcdSolutionWrapper2.equals((java.lang.Object) "Equation[a=0, b=-1, c=35]");
        java.lang.String str5 = gcdSolutionWrapper2.toString();
        java.lang.String str6 = gcdSolutionWrapper2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=null]" + "'", str5, "GcdSolutionWrapper[gcd=1, solution=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=null]" + "'", str6, "GcdSolutionWrapper[gcd=1, solution=null]");
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int8 = solution7.getY();
        solution7.setY((int) (byte) 1);
        boolean boolean12 = solution7.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution7);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution14 = gcdSolutionWrapper13.getSolution();
        java.lang.String str15 = gcdSolutionWrapper13.toString();
        gcdSolutionWrapper13.setGcd((int) (byte) 1);
        boolean boolean18 = equation3.equals((java.lang.Object) gcdSolutionWrapper13);
        int int19 = gcdSolutionWrapper13.getGcd();
        java.lang.Class<?> wildcardClass20 = gcdSolutionWrapper13.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(solution14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str15, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int4 = equation3.c();
        int int5 = equation3.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int10 = solution9.getY();
        solution9.setY((int) (byte) 1);
        boolean boolean14 = solution9.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper15 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution9);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution16 = gcdSolutionWrapper15.getSolution();
        java.lang.String str17 = gcdSolutionWrapper15.toString();
        gcdSolutionWrapper15.setGcd((int) (byte) 1);
        boolean boolean20 = equation3.equals((java.lang.Object) gcdSolutionWrapper15);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution21 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        int int22 = equation3.a();
        java.lang.Class<?> wildcardClass23 = equation3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(solution16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str17, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(solution21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, 0, (int) (short) -1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int8 = solution7.getY();
        solution7.setY((int) (byte) 1);
        boolean boolean12 = solution7.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution7);
        boolean boolean14 = equation3.equals((java.lang.Object) gcdSolutionWrapper13);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation18 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int19 = equation18.c();
        int int20 = equation18.b();
        java.lang.Class<?> wildcardClass21 = equation18.getClass();
        boolean boolean22 = equation3.equals((java.lang.Object) wildcardClass21);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution23 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, 0, (int) (short) -1);
        int int4 = equation3.c();
        int int5 = equation3.b();
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (short) -1, 0);
        solution2.setX(1);
        int int5 = solution2.getX();
        int int6 = solution2.getX();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int8 = solution7.getY();
        solution7.setY((int) (byte) 1);
        boolean boolean12 = solution7.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution7);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution14 = gcdSolutionWrapper13.getSolution();
        java.lang.String str15 = gcdSolutionWrapper13.toString();
        gcdSolutionWrapper13.setGcd((int) (byte) 1);
        boolean boolean18 = equation3.equals((java.lang.Object) gcdSolutionWrapper13);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution19 = gcdSolutionWrapper13.getSolution();
        int int20 = solution19.getX();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(solution14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str15, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(solution19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int4 = solution3.getY();
        solution3.setY((int) (byte) 1);
        boolean boolean8 = solution3.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution12 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int13 = solution12.getY();
        java.lang.String str14 = solution12.toString();
        boolean boolean16 = solution12.equals((java.lang.Object) (-1L));
        gcdSolutionWrapper9.setSolution(solution12);
        int int18 = solution12.getX();
        java.lang.String str19 = solution12.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution21 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper22 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution21);
        gcdSolutionWrapper22.setGcd((int) ' ');
        gcdSolutionWrapper22.setGcd((int) (short) 1);
        boolean boolean27 = solution12.equals((java.lang.Object) gcdSolutionWrapper22);
        java.lang.Class<?> wildcardClass28 = solution12.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Solution[x=97, y=1]" + "'", str14, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Solution[x=97, y=1]" + "'", str19, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (short) 1, (int) (byte) 100);
        int int3 = solution2.getY();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(0, (int) (byte) 100);
        int int3 = solution2.getY();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation4);
        int int6 = solution5.getX();
        int int7 = solution5.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) 'a', solution5);
        boolean boolean10 = solution5.equals((java.lang.Object) '#');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution12 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution12);
        boolean boolean15 = gcdSolutionWrapper13.equals((java.lang.Object) "Equation[a=0, b=-1, c=35]");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation19 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution20 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation19);
        solution20.setY((int) (byte) 10);
        int int23 = solution20.getY();
        gcdSolutionWrapper13.setSolution(solution20);
        boolean boolean25 = solution5.equals((java.lang.Object) solution20);
        java.lang.Class<?> wildcardClass26 = solution5.getClass();
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(solution20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 100, (int) (short) 1, 0);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, 0, 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution4 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution1 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution1);
        gcdSolutionWrapper2.setGcd((int) ' ');
        gcdSolutionWrapper2.setGcd((int) (short) 1);
        java.lang.Class<?> wildcardClass7 = gcdSolutionWrapper2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int3 = solution2.getY();
        java.lang.String str4 = solution2.toString();
        solution2.setX((int) (short) 1);
        boolean boolean8 = solution2.equals((java.lang.Object) (-1.0f));
        java.lang.String str9 = solution2.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        java.lang.String str14 = equation13.toString();
        int int15 = equation13.c();
        boolean boolean16 = solution2.equals((java.lang.Object) equation13);
        int int17 = equation13.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution18 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation13);
        java.lang.Class<?> wildcardClass19 = solution18.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Solution[x=97, y=1]" + "'", str4, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Solution[x=1, y=1]" + "'", str9, "Solution[x=1, y=1]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str14, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(solution18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) '4', (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution3);
        java.lang.String str5 = gcdSolutionWrapper4.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = gcdSolutionWrapper4.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = gcdSolutionWrapper4.getSolution();
        java.lang.Class<?> wildcardClass8 = solution7.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]" + "'", str5, "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]");
        org.junit.Assert.assertNotNull(solution6);
        org.junit.Assert.assertNotNull(solution7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int3 = solution2.getY();
        solution2.setY((int) (byte) 1);
        int int6 = solution2.getY();
        java.lang.String str7 = solution2.toString();
        int int8 = solution2.getY();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Solution[x=97, y=1]" + "'", str7, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution0 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution.INFINITE_SOLUTIONS;
        int int1 = solution0.getY();
        org.junit.Assert.assertNotNull(solution0);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution1 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution1);
        int int3 = gcdSolutionWrapper2.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution4 = gcdSolutionWrapper2.getSolution();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(solution4);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int8 = solution7.getY();
        solution7.setY((int) (byte) 1);
        boolean boolean12 = solution7.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution7);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution14 = gcdSolutionWrapper13.getSolution();
        java.lang.String str15 = gcdSolutionWrapper13.toString();
        gcdSolutionWrapper13.setGcd((int) (byte) 1);
        boolean boolean18 = equation3.equals((java.lang.Object) gcdSolutionWrapper13);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation22 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int23 = equation22.c();
        int int24 = equation22.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution25 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation22);
        boolean boolean26 = gcdSolutionWrapper13.equals((java.lang.Object) solution25);
        java.lang.String str27 = solution25.toString();
        java.lang.String str28 = solution25.toString();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(solution14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str15, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(solution25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Solution[x=0, y=-35]" + "'", str27, "Solution[x=0, y=-35]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Solution[x=0, y=-35]" + "'", str28, "Solution[x=0, y=-35]");
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation4);
        int int6 = solution5.getX();
        int int7 = solution5.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) ' ', solution5);
        java.lang.String str9 = gcdSolutionWrapper8.toString();
        java.lang.Class<?> wildcardClass10 = gcdSolutionWrapper8.getClass();
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "GcdSolutionWrapper[gcd=32, solution=Solution[x=0, y=0]]" + "'", str9, "GcdSolutionWrapper[gcd=32, solution=Solution[x=0, y=0]]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution4 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        java.lang.Class<?> wildcardClass5 = equation3.getClass();
        org.junit.Assert.assertNotNull(solution4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) ' ', 52, 100);
        int int4 = equation3.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int9 = equation8.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution10 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation8);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution12 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution12);
        boolean boolean15 = gcdSolutionWrapper13.equals((java.lang.Object) 1);
        boolean boolean16 = equation8.equals((java.lang.Object) boolean15);
        int int17 = equation8.a();
        int int18 = equation8.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution20 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper21 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution20);
        gcdSolutionWrapper21.setGcd((int) ' ');
        gcdSolutionWrapper21.setGcd((int) (short) 1);
        int int26 = gcdSolutionWrapper21.getGcd();
        int int27 = gcdSolutionWrapper21.getGcd();
        boolean boolean28 = equation8.equals((java.lang.Object) int27);
        boolean boolean29 = equation3.equals((java.lang.Object) equation8);
        java.lang.Class<?> wildcardClass30 = equation8.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(solution10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int4 = solution3.getY();
        java.lang.String str5 = solution3.toString();
        solution3.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((-35), solution3);
        int int9 = gcdSolutionWrapper8.getGcd();
        java.lang.Class<?> wildcardClass10 = gcdSolutionWrapper8.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Solution[x=97, y=1]" + "'", str5, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-35) + "'", int9 == (-35));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution1 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution1);
        gcdSolutionWrapper2.setGcd((int) ' ');
        gcdSolutionWrapper2.setGcd((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = gcdSolutionWrapper2.getSolution();
        int int8 = gcdSolutionWrapper2.getGcd();
        gcdSolutionWrapper2.setGcd(0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation14 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        java.lang.String str15 = equation14.toString();
        boolean boolean16 = gcdSolutionWrapper2.equals((java.lang.Object) equation14);
        java.lang.Class<?> wildcardClass17 = gcdSolutionWrapper2.getClass();
        org.junit.Assert.assertNull(solution7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str15, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int4 = equation3.c();
        int int5 = equation3.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int10 = solution9.getY();
        solution9.setY((int) (byte) 1);
        boolean boolean14 = solution9.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper15 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution9);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution16 = gcdSolutionWrapper15.getSolution();
        java.lang.String str17 = gcdSolutionWrapper15.toString();
        gcdSolutionWrapper15.setGcd((int) (byte) 1);
        boolean boolean20 = equation3.equals((java.lang.Object) gcdSolutionWrapper15);
        int int21 = gcdSolutionWrapper15.getGcd();
        boolean boolean23 = gcdSolutionWrapper15.equals((java.lang.Object) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(solution16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str17, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(32, (int) (short) 10);
        int int4 = solution3.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper5 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution3);
        solution3.setX((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '#', 52, 32);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int7 = solution6.getY();
        java.lang.String str8 = solution6.toString();
        solution6.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation14 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int15 = equation14.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution16 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation14);
        boolean boolean17 = solution6.equals((java.lang.Object) solution16);
        boolean boolean19 = solution16.equals((java.lang.Object) 0);
        boolean boolean20 = equation3.equals((java.lang.Object) solution16);
        boolean boolean22 = solution16.equals((java.lang.Object) (byte) -1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation27 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution28 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation27);
        solution28.setY(0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper31 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution28);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation35 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution36 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation35);
        solution36.setY((int) (byte) 10);
        boolean boolean39 = solution28.equals((java.lang.Object) (byte) 10);
        boolean boolean40 = solution16.equals((java.lang.Object) (byte) 10);
        int int41 = solution16.getX();
        solution16.setY(97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Solution[x=97, y=1]" + "'", str8, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertNotNull(solution16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(solution28);
        org.junit.Assert.assertNotNull(solution36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int8 = solution7.getY();
        solution7.setY((int) (byte) 1);
        boolean boolean12 = solution7.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution7);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution14 = gcdSolutionWrapper13.getSolution();
        java.lang.String str15 = gcdSolutionWrapper13.toString();
        gcdSolutionWrapper13.setGcd((int) (byte) 1);
        boolean boolean18 = equation3.equals((java.lang.Object) gcdSolutionWrapper13);
        int int19 = gcdSolutionWrapper13.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution20 = gcdSolutionWrapper13.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation24 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        java.lang.String str25 = equation24.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution26 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation24);
        solution26.setY((int) (byte) 10);
        boolean boolean29 = solution20.equals((java.lang.Object) solution26);
        java.lang.Class<?> wildcardClass30 = solution20.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(solution14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str15, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(solution20);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str25, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertNotNull(solution26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int3 = solution2.getY();
        java.lang.String str4 = solution2.toString();
        solution2.setX((int) (short) 1);
        java.lang.Class<?> wildcardClass7 = solution2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Solution[x=97, y=1]" + "'", str4, "Solution[x=97, y=1]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int3 = solution2.getY();
        java.lang.String str4 = solution2.toString();
        solution2.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation10 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, 0, (int) (short) -1);
        boolean boolean11 = solution2.equals((java.lang.Object) equation10);
        int int12 = equation10.c();
        int int13 = equation10.b();
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution14 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Solution[x=97, y=1]" + "'", str4, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, 0, (int) (short) -1);
        int int4 = equation3.c();
        int int5 = equation3.a();
        int int6 = equation3.a();
        java.lang.Class<?> wildcardClass7 = equation3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution1 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution1);
        gcdSolutionWrapper2.setGcd((int) ' ');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int8 = solution7.getY();
        java.lang.String str9 = solution7.toString();
        gcdSolutionWrapper2.setSolution(solution7);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution11 = gcdSolutionWrapper2.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation15 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        java.lang.String str16 = equation15.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution17 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation15);
        java.lang.String str18 = solution17.toString();
        boolean boolean19 = gcdSolutionWrapper2.equals((java.lang.Object) solution17);
        java.lang.Object obj20 = null;
        boolean boolean21 = solution17.equals(obj20);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Solution[x=97, y=1]" + "'", str9, "Solution[x=97, y=1]");
        org.junit.Assert.assertNotNull(solution11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str16, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertNotNull(solution17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Solution[x=0, y=-35]" + "'", str18, "Solution[x=0, y=-35]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int8 = solution7.getY();
        solution7.setY((int) (byte) 1);
        boolean boolean12 = solution7.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution7);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution14 = gcdSolutionWrapper13.getSolution();
        java.lang.String str15 = gcdSolutionWrapper13.toString();
        gcdSolutionWrapper13.setGcd((int) (byte) 1);
        boolean boolean18 = equation3.equals((java.lang.Object) gcdSolutionWrapper13);
        int int19 = gcdSolutionWrapper13.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution20 = gcdSolutionWrapper13.getSolution();
        java.lang.Class<?> wildcardClass21 = solution20.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(solution14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str15, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(solution20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (short) 100, (int) (short) -1, (int) '4');
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int3 = solution2.getY();
        java.lang.String str4 = solution2.toString();
        solution2.setX((int) (short) 1);
        solution2.setX((int) (byte) 10);
        java.lang.String str9 = solution2.toString();
        java.lang.Class<?> wildcardClass10 = solution2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Solution[x=97, y=1]" + "'", str4, "Solution[x=97, y=1]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Solution[x=10, y=1]" + "'", str9, "Solution[x=10, y=1]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int3 = solution2.getY();
        solution2.setY((int) (byte) 1);
        solution2.setX((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution1 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution1);
        boolean boolean4 = gcdSolutionWrapper2.equals((java.lang.Object) 1);
        gcdSolutionWrapper2.setGcd((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(32, (int) (byte) 100, 1);
        java.lang.String str4 = equation3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equation[a=32, b=100, c=1]" + "'", str4, "Equation[a=32, b=100, c=1]");
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int3 = solution2.getY();
        java.lang.String str4 = solution2.toString();
        solution2.setX((int) (short) 1);
        java.lang.String str7 = solution2.toString();
        java.lang.String str8 = solution2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Solution[x=97, y=1]" + "'", str4, "Solution[x=97, y=1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Solution[x=1, y=1]" + "'", str7, "Solution[x=1, y=1]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Solution[x=1, y=1]" + "'", str8, "Solution[x=1, y=1]");
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution1 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution1);
        gcdSolutionWrapper2.setGcd((int) ' ');
        gcdSolutionWrapper2.setGcd((int) (short) 100);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution8 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution8);
        gcdSolutionWrapper9.setGcd((int) ' ');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution14 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int15 = solution14.getY();
        java.lang.String str16 = solution14.toString();
        gcdSolutionWrapper9.setSolution(solution14);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution18 = gcdSolutionWrapper9.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation22 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        java.lang.String str23 = equation22.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution24 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation22);
        java.lang.String str25 = solution24.toString();
        boolean boolean26 = gcdSolutionWrapper9.equals((java.lang.Object) solution24);
        boolean boolean27 = gcdSolutionWrapper2.equals((java.lang.Object) boolean26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Solution[x=97, y=1]" + "'", str16, "Solution[x=97, y=1]");
        org.junit.Assert.assertNotNull(solution18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str23, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertNotNull(solution24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Solution[x=0, y=-35]" + "'", str25, "Solution[x=0, y=-35]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) (byte) 100, 32);
        java.lang.Class<?> wildcardClass4 = equation3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(1, 52);
        int int4 = solution3.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper5 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((-1), solution3);
        java.lang.String str6 = solution3.toString();
        java.lang.String str7 = solution3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Solution[x=1, y=52]" + "'", str6, "Solution[x=1, y=52]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Solution[x=1, y=52]" + "'", str7, "Solution[x=1, y=52]");
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int4 = equation3.c();
        java.lang.String str5 = equation3.toString();
        int int6 = equation3.c();
        int int7 = equation3.a();
        int int8 = equation3.c();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str5, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) ' ', (int) ' ', 35);
        int int4 = equation3.c();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int3 = solution2.getY();
        java.lang.String str4 = solution2.toString();
        solution2.setX((int) (short) 1);
        java.lang.String str7 = solution2.toString();
        solution2.setX(1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Solution[x=97, y=1]" + "'", str4, "Solution[x=97, y=1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Solution[x=1, y=1]" + "'", str7, "Solution[x=1, y=1]");
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, 0, (int) (short) -1);
        int int4 = equation3.c();
        java.lang.String str5 = equation3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equation[a=0, b=0, c=-1]" + "'", str5, "Equation[a=0, b=0, c=-1]");
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution1 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution1);
        gcdSolutionWrapper2.setGcd((int) ' ');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int8 = solution7.getY();
        java.lang.String str9 = solution7.toString();
        gcdSolutionWrapper2.setSolution(solution7);
        int int11 = gcdSolutionWrapper2.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution14 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int15 = solution14.getY();
        gcdSolutionWrapper2.setSolution(solution14);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution18 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper19 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution18);
        gcdSolutionWrapper19.setGcd((int) ' ');
        gcdSolutionWrapper19.setGcd((int) (short) 100);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution26 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int27 = solution26.getY();
        java.lang.String str28 = solution26.toString();
        solution26.setX((int) (short) 1);
        boolean boolean32 = solution26.equals((java.lang.Object) (-1.0f));
        gcdSolutionWrapper19.setSolution(solution26);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution35 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper36 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution35);
        boolean boolean38 = gcdSolutionWrapper36.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution40 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper41 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution40);
        gcdSolutionWrapper41.setGcd((int) ' ');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution46 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int47 = solution46.getY();
        java.lang.String str48 = solution46.toString();
        gcdSolutionWrapper41.setSolution(solution46);
        gcdSolutionWrapper36.setSolution(solution46);
        int int51 = solution46.getY();
        java.lang.String str52 = solution46.toString();
        gcdSolutionWrapper19.setSolution(solution46);
        gcdSolutionWrapper2.setSolution(solution46);
        gcdSolutionWrapper2.setGcd(1);
        int int57 = gcdSolutionWrapper2.getGcd();
        java.lang.String str58 = gcdSolutionWrapper2.toString();
        java.lang.String str59 = gcdSolutionWrapper2.toString();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Solution[x=97, y=1]" + "'", str9, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Solution[x=97, y=1]" + "'", str28, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Solution[x=97, y=1]" + "'", str48, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Solution[x=97, y=1]" + "'", str52, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]" + "'", str58, "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]" + "'", str59, "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]");
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int8 = solution7.getY();
        solution7.setY((int) (byte) 1);
        boolean boolean12 = solution7.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution7);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution14 = gcdSolutionWrapper13.getSolution();
        java.lang.String str15 = gcdSolutionWrapper13.toString();
        gcdSolutionWrapper13.setGcd((int) (byte) 1);
        boolean boolean18 = equation3.equals((java.lang.Object) gcdSolutionWrapper13);
        int int19 = gcdSolutionWrapper13.getGcd();
        java.lang.String str20 = gcdSolutionWrapper13.toString();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(solution14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str15, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]" + "'", str20, "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]");
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) '4', (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution3);
        java.lang.String str5 = gcdSolutionWrapper4.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = gcdSolutionWrapper4.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation10 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int11 = equation10.c();
        int int12 = equation10.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution16 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int17 = solution16.getY();
        solution16.setY((int) (byte) 1);
        boolean boolean21 = solution16.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper22 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution16);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution23 = gcdSolutionWrapper22.getSolution();
        java.lang.String str24 = gcdSolutionWrapper22.toString();
        gcdSolutionWrapper22.setGcd((int) (byte) 1);
        boolean boolean27 = equation10.equals((java.lang.Object) gcdSolutionWrapper22);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution28 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation10);
        boolean boolean29 = gcdSolutionWrapper4.equals((java.lang.Object) solution28);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution31 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper32 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution31);
        gcdSolutionWrapper32.setGcd((int) ' ');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution37 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int38 = solution37.getY();
        java.lang.String str39 = solution37.toString();
        gcdSolutionWrapper32.setSolution(solution37);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution41 = gcdSolutionWrapper32.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation45 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        java.lang.String str46 = equation45.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution47 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation45);
        java.lang.String str48 = solution47.toString();
        boolean boolean49 = gcdSolutionWrapper32.equals((java.lang.Object) solution47);
        gcdSolutionWrapper4.setSolution(solution47);
        java.lang.Class<?> wildcardClass51 = solution47.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]" + "'", str5, "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]");
        org.junit.Assert.assertNotNull(solution6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(solution23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str24, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(solution28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Solution[x=97, y=1]" + "'", str39, "Solution[x=97, y=1]");
        org.junit.Assert.assertNotNull(solution41);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str46, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertNotNull(solution47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Solution[x=0, y=-35]" + "'", str48, "Solution[x=0, y=-35]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int3 = solution2.getY();
        java.lang.String str4 = solution2.toString();
        int int5 = solution2.getX();
        int int6 = solution2.getY();
        solution2.setY((int) (short) 100);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution14 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation13);
        int int15 = solution14.getX();
        int int16 = solution14.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper17 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) ' ', solution14);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution18 = gcdSolutionWrapper17.getSolution();
        boolean boolean19 = solution2.equals((java.lang.Object) gcdSolutionWrapper17);
        int int20 = gcdSolutionWrapper17.getGcd();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Solution[x=97, y=1]" + "'", str4, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(solution14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(solution18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '#', 52, 32);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution4 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        solution4.setX(97);
        org.junit.Assert.assertNotNull(solution4);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int8 = solution7.getY();
        solution7.setY((int) (byte) 1);
        boolean boolean12 = solution7.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution7);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution14 = gcdSolutionWrapper13.getSolution();
        java.lang.String str15 = gcdSolutionWrapper13.toString();
        gcdSolutionWrapper13.setGcd((int) (byte) 1);
        boolean boolean18 = equation3.equals((java.lang.Object) gcdSolutionWrapper13);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation22 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int23 = equation22.c();
        int int24 = equation22.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution25 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation22);
        boolean boolean26 = gcdSolutionWrapper13.equals((java.lang.Object) solution25);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation30 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        java.lang.String str31 = equation30.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution32 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation30);
        solution32.setY((int) (byte) 10);
        gcdSolutionWrapper13.setSolution(solution32);
        int int36 = solution32.getY();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(solution14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str15, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(solution25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str31, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertNotNull(solution32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int4 = equation3.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int9 = solution8.getY();
        java.lang.String str10 = solution8.toString();
        boolean boolean12 = solution8.equals((java.lang.Object) (-1L));
        boolean boolean13 = equation3.equals((java.lang.Object) (-1L));
        int int14 = equation3.a();
        java.lang.Class<?> wildcardClass15 = equation3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Solution[x=97, y=1]" + "'", str10, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        int int4 = equation3.c();
        java.lang.Class<?> wildcardClass5 = equation3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int4 = equation3.c();
        int int5 = equation3.b();
        int int6 = equation3.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        int int8 = solution7.getY();
        int int9 = solution7.getY();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(solution7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-35) + "'", int8 == (-35));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-35) + "'", int9 == (-35));
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int4 = equation3.c();
        int int5 = equation3.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int10 = solution9.getY();
        solution9.setY((int) (byte) 1);
        boolean boolean14 = solution9.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper15 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution9);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution16 = gcdSolutionWrapper15.getSolution();
        java.lang.String str17 = gcdSolutionWrapper15.toString();
        gcdSolutionWrapper15.setGcd((int) (byte) 1);
        boolean boolean20 = equation3.equals((java.lang.Object) gcdSolutionWrapper15);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution21 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        java.lang.String str22 = equation3.toString();
        java.lang.Class<?> wildcardClass23 = equation3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(solution16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str17, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(solution21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str22, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        java.lang.String str4 = equation3.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution7);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution11 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int12 = solution11.getY();
        solution11.setY((int) (byte) 1);
        gcdSolutionWrapper8.setSolution(solution11);
        int int16 = gcdSolutionWrapper8.getGcd();
        boolean boolean17 = solution5.equals((java.lang.Object) gcdSolutionWrapper8);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution18 = gcdSolutionWrapper8.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution22 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int23 = solution22.getY();
        solution22.setY((int) (byte) 1);
        boolean boolean27 = solution22.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper28 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution22);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution29 = gcdSolutionWrapper28.getSolution();
        java.lang.String str30 = gcdSolutionWrapper28.toString();
        gcdSolutionWrapper28.setGcd((int) (byte) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution35 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((-1), (int) '4');
        gcdSolutionWrapper28.setSolution(solution35);
        java.lang.String str37 = solution35.toString();
        gcdSolutionWrapper8.setSolution(solution35);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str4, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(solution18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(solution29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str30, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Solution[x=-1, y=52]" + "'", str37, "Solution[x=-1, y=52]");
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(32, 0, (-35));
        int int4 = equation3.a();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int3 = solution2.getY();
        java.lang.String str4 = solution2.toString();
        solution2.setX((int) (short) 1);
        boolean boolean8 = solution2.equals((java.lang.Object) (-1.0f));
        java.lang.String str9 = solution2.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        java.lang.String str14 = equation13.toString();
        int int15 = equation13.c();
        boolean boolean16 = solution2.equals((java.lang.Object) equation13);
        int int17 = equation13.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution18 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation13);
        java.lang.String str19 = equation13.toString();
        java.lang.Class<?> wildcardClass20 = equation13.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Solution[x=97, y=1]" + "'", str4, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Solution[x=1, y=1]" + "'", str9, "Solution[x=1, y=1]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str14, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(solution18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str19, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int4 = equation3.c();
        int int5 = equation3.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int10 = solution9.getY();
        solution9.setY((int) (byte) 1);
        boolean boolean14 = solution9.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper15 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution9);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution16 = gcdSolutionWrapper15.getSolution();
        java.lang.String str17 = gcdSolutionWrapper15.toString();
        gcdSolutionWrapper15.setGcd((int) (byte) 1);
        boolean boolean20 = equation3.equals((java.lang.Object) gcdSolutionWrapper15);
        int int21 = gcdSolutionWrapper15.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution22 = null;
        gcdSolutionWrapper15.setSolution(solution22);
        java.lang.Class<?> wildcardClass24 = gcdSolutionWrapper15.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(solution16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str17, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int4 = equation3.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution7);
        boolean boolean10 = gcdSolutionWrapper8.equals((java.lang.Object) 1);
        boolean boolean11 = equation3.equals((java.lang.Object) boolean10);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation15 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution16 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation15);
        solution16.setY((int) (byte) 10);
        boolean boolean19 = equation3.equals((java.lang.Object) solution16);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution20 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        int int21 = equation3.c();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(solution16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(solution20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution1 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution1);
        boolean boolean4 = gcdSolutionWrapper2.equals((java.lang.Object) 1);
        java.lang.String str5 = gcdSolutionWrapper2.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = gcdSolutionWrapper2.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(100, (int) (short) 100);
        gcdSolutionWrapper2.setSolution(solution9);
        java.lang.Class<?> wildcardClass11 = solution9.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=null]" + "'", str5, "GcdSolutionWrapper[gcd=1, solution=null]");
        org.junit.Assert.assertNull(solution6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 1, (int) (short) 10, (int) (short) -1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution4 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        int int5 = equation3.a();
        int int6 = equation3.b();
        org.junit.Assert.assertNotNull(solution4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution1 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution1);
        gcdSolutionWrapper2.setGcd((int) ' ');
        gcdSolutionWrapper2.setGcd((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = gcdSolutionWrapper2.getSolution();
        int int8 = gcdSolutionWrapper2.getGcd();
        gcdSolutionWrapper2.setGcd(0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation14 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution15 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation14);
        solution15.setY(0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation21 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (short) 10, 10, 52);
        boolean boolean22 = solution15.equals((java.lang.Object) (short) 10);
        gcdSolutionWrapper2.setSolution(solution15);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution27 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int28 = solution27.getY();
        java.lang.String str29 = solution27.toString();
        solution27.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper32 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((-35), solution27);
        java.lang.String str33 = solution27.toString();
        gcdSolutionWrapper2.setSolution(solution27);
        java.lang.Class<?> wildcardClass35 = gcdSolutionWrapper2.getClass();
        org.junit.Assert.assertNull(solution7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(solution15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Solution[x=97, y=1]" + "'", str29, "Solution[x=97, y=1]");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Solution[x=1, y=1]" + "'", str33, "Solution[x=1, y=1]");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int5 = solution4.getY();
        java.lang.String str6 = solution4.toString();
        solution4.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((-35), solution4);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper10 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) ' ', solution4);
        gcdSolutionWrapper10.setGcd(52);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution13 = gcdSolutionWrapper10.getSolution();
        int int14 = solution13.getX();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Solution[x=97, y=1]" + "'", str6, "Solution[x=97, y=1]");
        org.junit.Assert.assertNotNull(solution13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int4 = equation3.c();
        int int5 = equation3.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int10 = solution9.getY();
        solution9.setY((int) (byte) 1);
        boolean boolean14 = solution9.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper15 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution9);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution16 = gcdSolutionWrapper15.getSolution();
        java.lang.String str17 = gcdSolutionWrapper15.toString();
        gcdSolutionWrapper15.setGcd((int) (byte) 1);
        boolean boolean20 = equation3.equals((java.lang.Object) gcdSolutionWrapper15);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution21 = gcdSolutionWrapper15.getSolution();
        int int22 = solution21.getX();
        java.lang.Class<?> wildcardClass23 = solution21.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(solution16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str17, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(solution21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) 1, (int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int7 = solution6.getY();
        solution6.setY((int) (byte) 1);
        boolean boolean11 = solution6.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper12 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution6);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution13 = gcdSolutionWrapper12.getSolution();
        java.lang.String str14 = gcdSolutionWrapper12.toString();
        gcdSolutionWrapper12.setGcd((int) (byte) 1);
        int int17 = gcdSolutionWrapper12.getGcd();
        boolean boolean18 = solution2.equals((java.lang.Object) gcdSolutionWrapper12);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution22 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int23 = solution22.getY();
        java.lang.String str24 = solution22.toString();
        solution22.setX((int) (short) 1);
        boolean boolean28 = solution22.equals((java.lang.Object) true);
        solution22.setY(32);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper31 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 10, solution22);
        java.lang.String str32 = gcdSolutionWrapper31.toString();
        boolean boolean33 = gcdSolutionWrapper12.equals((java.lang.Object) str32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(solution13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str14, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Solution[x=97, y=1]" + "'", str24, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "GcdSolutionWrapper[gcd=10, solution=Solution[x=1, y=32]]" + "'", str32, "GcdSolutionWrapper[gcd=10, solution=Solution[x=1, y=32]]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(1, 52);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution9 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation8);
        int int10 = solution9.getX();
        int int11 = solution9.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper12 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) 'a', solution9);
        boolean boolean13 = solution3.equals((java.lang.Object) 'a');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation18 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution19 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation18);
        solution19.setY(0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper22 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution19);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation27 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution28 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation27);
        int int29 = solution28.getX();
        int int30 = solution28.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper31 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) 'a', solution28);
        int int32 = solution28.getX();
        gcdSolutionWrapper22.setSolution(solution28);
        boolean boolean34 = solution3.equals((java.lang.Object) gcdSolutionWrapper22);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper35 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (short) 1, solution3);
        org.junit.Assert.assertNotNull(solution9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(solution19);
        org.junit.Assert.assertNotNull(solution28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) 100, (int) (short) 100);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int4 = equation3.c();
        int int5 = equation3.b();
        int int6 = equation3.a();
        java.lang.Class<?> wildcardClass7 = equation3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int4 = solution3.getY();
        solution3.setY((int) (byte) 1);
        boolean boolean8 = solution3.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution12 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int13 = solution12.getY();
        java.lang.String str14 = solution12.toString();
        boolean boolean16 = solution12.equals((java.lang.Object) (-1L));
        gcdSolutionWrapper9.setSolution(solution12);
        int int18 = solution12.getX();
        int int19 = solution12.getY();
        java.lang.String str20 = solution12.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Solution[x=97, y=1]" + "'", str14, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Solution[x=97, y=1]" + "'", str20, "Solution[x=97, y=1]");
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) '4', (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution3);
        java.lang.String str5 = gcdSolutionWrapper4.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = gcdSolutionWrapper4.getSolution();
        gcdSolutionWrapper4.setGcd(52);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution9 = gcdSolutionWrapper4.getSolution();
        solution9.setY((-35));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]" + "'", str5, "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]");
        org.junit.Assert.assertNotNull(solution6);
        org.junit.Assert.assertNotNull(solution9);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int4 = solution3.getY();
        java.lang.String str5 = solution3.toString();
        solution3.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((-35), solution3);
        gcdSolutionWrapper8.setGcd((int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Solution[x=97, y=1]" + "'", str5, "Solution[x=97, y=1]");
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (short) 10, 0, (-35));
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(0, (int) (byte) 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int7 = solution6.getY();
        solution6.setY((int) (byte) 1);
        boolean boolean11 = solution6.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper12 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution6);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution13 = gcdSolutionWrapper12.getSolution();
        java.lang.String str14 = gcdSolutionWrapper12.toString();
        boolean boolean15 = solution2.equals((java.lang.Object) str14);
        solution2.setX(10);
        solution2.setY(97);
        int int20 = solution2.getY();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(solution13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str14, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((-35), (int) ' ', 0);
        java.lang.String str5 = equation4.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation4);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) 'a', solution6);
        int int8 = gcdSolutionWrapper7.getGcd();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equation[a=-35, b=32, c=0]" + "'", str5, "Equation[a=-35, b=32, c=0]");
        org.junit.Assert.assertNotNull(solution6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution0 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution.INFINITE_SOLUTIONS;
        solution0.setY((int) (short) 100);
        solution0.setY((int) (byte) 1);
        solution0.setX((int) (short) 100);
        solution0.setY((int) (byte) 100);
        java.lang.Class<?> wildcardClass9 = solution0.getClass();
        org.junit.Assert.assertNotNull(solution0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution2);
        boolean boolean5 = gcdSolutionWrapper3.equals((java.lang.Object) 1);
        java.lang.String str6 = gcdSolutionWrapper3.toString();
        gcdSolutionWrapper3.setGcd(32);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution11 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) 100, (int) (byte) -1);
        gcdSolutionWrapper3.setSolution(solution11);
        int int13 = solution11.getX();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper14 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 0, solution11);
        java.lang.String str15 = solution11.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=null]" + "'", str6, "GcdSolutionWrapper[gcd=1, solution=null]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Solution[x=100, y=-1]" + "'", str15, "Solution[x=100, y=-1]");
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 1, (int) ' ', 0);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int3 = solution2.getY();
        java.lang.String str4 = solution2.toString();
        solution2.setX((int) (short) 1);
        boolean boolean8 = solution2.equals((java.lang.Object) (-1.0f));
        java.lang.String str9 = solution2.toString();
        java.lang.String str10 = solution2.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution14 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) '4', (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper15 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution14);
        java.lang.String str16 = gcdSolutionWrapper15.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution17 = gcdSolutionWrapper15.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation21 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int22 = equation21.c();
        int int23 = equation21.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution27 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int28 = solution27.getY();
        solution27.setY((int) (byte) 1);
        boolean boolean32 = solution27.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper33 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution27);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution34 = gcdSolutionWrapper33.getSolution();
        java.lang.String str35 = gcdSolutionWrapper33.toString();
        gcdSolutionWrapper33.setGcd((int) (byte) 1);
        boolean boolean38 = equation21.equals((java.lang.Object) gcdSolutionWrapper33);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution39 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation21);
        boolean boolean40 = gcdSolutionWrapper15.equals((java.lang.Object) solution39);
        boolean boolean41 = solution2.equals((java.lang.Object) gcdSolutionWrapper15);
        solution2.setY((int) (short) -1);
        java.lang.Class<?> wildcardClass44 = solution2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Solution[x=97, y=1]" + "'", str4, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Solution[x=1, y=1]" + "'", str9, "Solution[x=1, y=1]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Solution[x=1, y=1]" + "'", str10, "Solution[x=1, y=1]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]" + "'", str16, "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]");
        org.junit.Assert.assertNotNull(solution17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(solution34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str35, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(solution39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        int int4 = equation3.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        java.lang.String str6 = equation3.toString();
        int int7 = equation3.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution8 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equation[a=97, b=0, c=52]" + "'", str6, "Equation[a=97, b=0, c=52]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(solution8);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(0, 100);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution2);
        boolean boolean5 = gcdSolutionWrapper3.equals((java.lang.Object) 1);
        java.lang.String str6 = gcdSolutionWrapper3.toString();
        gcdSolutionWrapper3.setGcd(32);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution11 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) 100, (int) (byte) -1);
        gcdSolutionWrapper3.setSolution(solution11);
        int int13 = solution11.getX();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper14 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 0, solution11);
        solution11.setX((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=null]" + "'", str6, "GcdSolutionWrapper[gcd=1, solution=null]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution1 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int6 = solution5.getY();
        solution5.setY((int) (byte) 1);
        gcdSolutionWrapper2.setSolution(solution5);
        int int10 = gcdSolutionWrapper2.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int14 = solution13.getY();
        java.lang.String str15 = solution13.toString();
        solution13.setX((int) (short) 1);
        boolean boolean19 = solution13.equals((java.lang.Object) (-1.0f));
        java.lang.String str20 = solution13.toString();
        java.lang.String str21 = solution13.toString();
        gcdSolutionWrapper2.setSolution(solution13);
        solution13.setY((int) (byte) -1);
        int int25 = solution13.getY();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Solution[x=97, y=1]" + "'", str15, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Solution[x=1, y=1]" + "'", str20, "Solution[x=1, y=1]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Solution[x=1, y=1]" + "'", str21, "Solution[x=1, y=1]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) ' ', 52, 100);
        int int4 = equation3.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int9 = equation8.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution10 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation8);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution12 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution12);
        boolean boolean15 = gcdSolutionWrapper13.equals((java.lang.Object) 1);
        boolean boolean16 = equation8.equals((java.lang.Object) boolean15);
        int int17 = equation8.a();
        int int18 = equation8.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution20 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper21 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution20);
        gcdSolutionWrapper21.setGcd((int) ' ');
        gcdSolutionWrapper21.setGcd((int) (short) 1);
        int int26 = gcdSolutionWrapper21.getGcd();
        int int27 = gcdSolutionWrapper21.getGcd();
        boolean boolean28 = equation8.equals((java.lang.Object) int27);
        boolean boolean29 = equation3.equals((java.lang.Object) equation8);
        java.lang.String str30 = equation8.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution31 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation8);
        java.lang.Class<?> wildcardClass32 = solution31.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(solution10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str30, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertNotNull(solution31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int4 = equation3.c();
        int int5 = equation3.b();
        int int6 = equation3.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution10 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(1, 52);
        int int11 = solution10.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper12 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((-1), solution10);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution13 = gcdSolutionWrapper12.getSolution();
        int int14 = solution13.getX();
        boolean boolean15 = equation3.equals((java.lang.Object) int14);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertNotNull(solution13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int5 = solution4.getY();
        java.lang.String str6 = solution4.toString();
        solution4.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((-35), solution4);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper10 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) ' ', solution4);
        gcdSolutionWrapper10.setGcd(52);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution16 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) 100, (int) ' ');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper17 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (short) 10, solution16);
        gcdSolutionWrapper10.setSolution(solution16);
        java.lang.String str19 = solution16.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Solution[x=97, y=1]" + "'", str6, "Solution[x=97, y=1]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Solution[x=100, y=32]" + "'", str19, "Solution[x=100, y=32]");
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution1 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution1);
        gcdSolutionWrapper2.setGcd((int) ' ');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int8 = solution7.getY();
        java.lang.String str9 = solution7.toString();
        gcdSolutionWrapper2.setSolution(solution7);
        int int11 = gcdSolutionWrapper2.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution14 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int15 = solution14.getY();
        gcdSolutionWrapper2.setSolution(solution14);
        int int17 = solution14.getX();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Solution[x=97, y=1]" + "'", str9, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int4 = solution3.getY();
        solution3.setY((int) (byte) 1);
        boolean boolean8 = solution3.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution10 = gcdSolutionWrapper9.getSolution();
        java.lang.String str11 = gcdSolutionWrapper9.toString();
        gcdSolutionWrapper9.setGcd((int) (byte) 1);
        java.lang.String str14 = gcdSolutionWrapper9.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution18 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int19 = solution18.getY();
        java.lang.String str20 = solution18.toString();
        solution18.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper23 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((-35), solution18);
        int int24 = gcdSolutionWrapper23.getGcd();
        boolean boolean25 = gcdSolutionWrapper9.equals((java.lang.Object) int24);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(solution10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str11, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]" + "'", str14, "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Solution[x=97, y=1]" + "'", str20, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-35) + "'", int24 == (-35));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) ' ', (int) (byte) 0);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(97, (int) '#');
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int4 = equation3.c();
        int int5 = equation3.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int10 = solution9.getY();
        solution9.setY((int) (byte) 1);
        boolean boolean14 = solution9.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper15 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution9);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution16 = gcdSolutionWrapper15.getSolution();
        java.lang.String str17 = gcdSolutionWrapper15.toString();
        gcdSolutionWrapper15.setGcd((int) (byte) 1);
        boolean boolean20 = equation3.equals((java.lang.Object) gcdSolutionWrapper15);
        int int21 = gcdSolutionWrapper15.getGcd();
        java.lang.String str22 = gcdSolutionWrapper15.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(solution16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str17, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]" + "'", str22, "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]");
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation4);
        int int6 = solution5.getX();
        int int7 = solution5.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) 'a', solution5);
        java.lang.String str9 = solution5.toString();
        java.lang.Class<?> wildcardClass10 = solution5.getClass();
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Solution[x=0, y=0]" + "'", str9, "Solution[x=0, y=0]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(0, (int) (short) 100, (int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution4 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        java.lang.String str5 = equation3.toString();
        org.junit.Assert.assertNotNull(solution4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equation[a=0, b=100, c=1]" + "'", str5, "Equation[a=0, b=100, c=1]");
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) '4', (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution3);
        java.lang.String str5 = gcdSolutionWrapper4.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = gcdSolutionWrapper4.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = gcdSolutionWrapper4.getSolution();
        java.lang.String str8 = gcdSolutionWrapper4.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation12 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) ' ', 52, 100);
        int int13 = equation12.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation17 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int18 = equation17.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution19 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation17);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution21 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper22 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution21);
        boolean boolean24 = gcdSolutionWrapper22.equals((java.lang.Object) 1);
        boolean boolean25 = equation17.equals((java.lang.Object) boolean24);
        int int26 = equation17.a();
        int int27 = equation17.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution29 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper30 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution29);
        gcdSolutionWrapper30.setGcd((int) ' ');
        gcdSolutionWrapper30.setGcd((int) (short) 1);
        int int35 = gcdSolutionWrapper30.getGcd();
        int int36 = gcdSolutionWrapper30.getGcd();
        boolean boolean37 = equation17.equals((java.lang.Object) int36);
        boolean boolean38 = equation12.equals((java.lang.Object) equation17);
        java.lang.String str39 = equation17.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution40 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation17);
        gcdSolutionWrapper4.setSolution(solution40);
        int int42 = solution40.getY();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]" + "'", str5, "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]");
        org.junit.Assert.assertNotNull(solution6);
        org.junit.Assert.assertNotNull(solution7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]" + "'", str8, "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertNotNull(solution19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str39, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertNotNull(solution40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-35) + "'", int42 == (-35));
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (short) 0, (int) (short) 0);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int3 = solution2.getY();
        java.lang.String str4 = solution2.toString();
        solution2.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation10 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int11 = equation10.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution12 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation10);
        boolean boolean13 = solution2.equals((java.lang.Object) solution12);
        boolean boolean15 = solution12.equals((java.lang.Object) 0);
        solution12.setY(32);
        solution12.setY((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Solution[x=97, y=1]" + "'", str4, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertNotNull(solution12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(1, 52);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution8 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation7);
        int int9 = solution8.getX();
        int int10 = solution8.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper11 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) 'a', solution8);
        boolean boolean12 = solution2.equals((java.lang.Object) 'a');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation17 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution18 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation17);
        solution18.setY(0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper21 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution18);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation26 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution27 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation26);
        int int28 = solution27.getX();
        int int29 = solution27.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper30 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) 'a', solution27);
        int int31 = solution27.getX();
        gcdSolutionWrapper21.setSolution(solution27);
        boolean boolean33 = solution2.equals((java.lang.Object) gcdSolutionWrapper21);
        int int34 = gcdSolutionWrapper21.getGcd();
        org.junit.Assert.assertNotNull(solution8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(solution18);
        org.junit.Assert.assertNotNull(solution27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int8 = solution7.getY();
        solution7.setY((int) (byte) 1);
        boolean boolean12 = solution7.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution7);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution14 = gcdSolutionWrapper13.getSolution();
        java.lang.String str15 = gcdSolutionWrapper13.toString();
        gcdSolutionWrapper13.setGcd((int) (byte) 1);
        boolean boolean18 = equation3.equals((java.lang.Object) gcdSolutionWrapper13);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation22 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int23 = equation22.c();
        int int24 = equation22.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution25 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation22);
        boolean boolean26 = gcdSolutionWrapper13.equals((java.lang.Object) solution25);
        boolean boolean28 = gcdSolutionWrapper13.equals((java.lang.Object) (short) 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation33 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution34 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation33);
        int int35 = solution34.getX();
        int int36 = solution34.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper37 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) 'a', solution34);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution40 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int41 = solution40.getY();
        java.lang.String str42 = solution40.toString();
        solution40.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation48 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int49 = equation48.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution50 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation48);
        boolean boolean51 = solution40.equals((java.lang.Object) solution50);
        boolean boolean52 = solution34.equals((java.lang.Object) boolean51);
        gcdSolutionWrapper13.setSolution(solution34);
        solution34.setY(100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(solution14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str15, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(solution25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(solution34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Solution[x=97, y=1]" + "'", str42, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 35 + "'", int49 == 35);
        org.junit.Assert.assertNotNull(solution50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int8 = solution7.getY();
        solution7.setY((int) (byte) 1);
        boolean boolean12 = solution7.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution7);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution14 = gcdSolutionWrapper13.getSolution();
        java.lang.String str15 = gcdSolutionWrapper13.toString();
        gcdSolutionWrapper13.setGcd((int) (byte) 1);
        boolean boolean18 = equation3.equals((java.lang.Object) gcdSolutionWrapper13);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation22 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int23 = equation22.c();
        int int24 = equation22.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution25 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation22);
        boolean boolean26 = gcdSolutionWrapper13.equals((java.lang.Object) solution25);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation30 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int31 = equation30.c();
        int int32 = equation30.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution36 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int37 = solution36.getY();
        solution36.setY((int) (byte) 1);
        boolean boolean41 = solution36.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper42 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution36);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution43 = gcdSolutionWrapper42.getSolution();
        java.lang.String str44 = gcdSolutionWrapper42.toString();
        gcdSolutionWrapper42.setGcd((int) (byte) 1);
        boolean boolean47 = equation30.equals((java.lang.Object) gcdSolutionWrapper42);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution48 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation30);
        int int49 = solution48.getY();
        boolean boolean50 = gcdSolutionWrapper13.equals((java.lang.Object) int49);
        java.lang.String str51 = gcdSolutionWrapper13.toString();
        java.lang.String str52 = gcdSolutionWrapper13.toString();
        gcdSolutionWrapper13.setGcd(52);
        java.lang.Class<?> wildcardClass55 = gcdSolutionWrapper13.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(solution14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str15, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(solution25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 35 + "'", int31 == 35);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(solution43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str44, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(solution48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-35) + "'", int49 == (-35));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]" + "'", str51, "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]" + "'", str52, "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, 0, (int) (short) -1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int8 = solution7.getY();
        solution7.setY((int) (byte) 1);
        boolean boolean12 = solution7.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution7);
        boolean boolean14 = equation3.equals((java.lang.Object) gcdSolutionWrapper13);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation18 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int19 = equation18.c();
        int int20 = equation18.b();
        java.lang.Class<?> wildcardClass21 = equation18.getClass();
        boolean boolean22 = equation3.equals((java.lang.Object) wildcardClass21);
        int int23 = equation3.a();
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution24 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) '4', 100);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int4 = solution3.getY();
        solution3.setY((int) (byte) 1);
        boolean boolean8 = solution3.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution3);
        gcdSolutionWrapper9.setGcd((-1));
        gcdSolutionWrapper9.setGcd(10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution1 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution1);
        boolean boolean4 = gcdSolutionWrapper2.equals((java.lang.Object) 1);
        java.lang.String str5 = gcdSolutionWrapper2.toString();
        gcdSolutionWrapper2.setGcd(32);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution10 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) 100, (int) (byte) -1);
        gcdSolutionWrapper2.setSolution(solution10);
        int int12 = solution10.getX();
        java.lang.Class<?> wildcardClass13 = solution10.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=null]" + "'", str5, "GcdSolutionWrapper[gcd=1, solution=null]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution1 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution1);
        gcdSolutionWrapper2.setGcd((int) ' ');
        gcdSolutionWrapper2.setGcd((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = gcdSolutionWrapper2.getSolution();
        int int8 = gcdSolutionWrapper2.getGcd();
        gcdSolutionWrapper2.setGcd(0);
        int int11 = gcdSolutionWrapper2.getGcd();
        java.lang.Class<?> wildcardClass12 = gcdSolutionWrapper2.getClass();
        org.junit.Assert.assertNull(solution7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, (int) (short) 10, 0);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 1, (int) (short) 10, (int) (short) -1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution4 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        int int6 = equation3.c();
        java.lang.String str7 = equation3.toString();
        org.junit.Assert.assertNotNull(solution4);
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equation[a=1, b=10, c=-1]" + "'", str7, "Equation[a=1, b=10, c=-1]");
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int4 = solution3.getY();
        java.lang.String str5 = solution3.toString();
        solution3.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((-35), solution3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation12 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int13 = equation12.c();
        int int14 = equation12.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution15 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation12);
        boolean boolean16 = solution3.equals((java.lang.Object) equation12);
        solution3.setX((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Solution[x=97, y=1]" + "'", str5, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(solution15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int4 = equation3.c();
        int int5 = equation3.b();
        int int6 = equation3.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        int int8 = equation3.a();
        java.lang.Class<?> wildcardClass9 = equation3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(solution7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '#', 0, 100);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) 100, (int) ' ');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (short) 10, solution3);
        gcdSolutionWrapper4.setGcd(97);
        java.lang.String str7 = gcdSolutionWrapper4.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GcdSolutionWrapper[gcd=97, solution=Solution[x=100, y=32]]" + "'", str7, "GcdSolutionWrapper[gcd=97, solution=Solution[x=100, y=32]]");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        int int4 = equation3.b();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 1, (int) (short) 10, (int) (short) -1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution4 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        int int5 = solution4.getX();
        java.lang.Class<?> wildcardClass6 = solution4.getClass();
        org.junit.Assert.assertNotNull(solution4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation4);
        solution5.setY(0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution5);
        boolean boolean10 = solution5.equals((java.lang.Object) "Solution[x=-1, y=0]");
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int4 = solution3.getY();
        solution3.setY((int) (byte) 1);
        boolean boolean8 = solution3.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution12 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int13 = solution12.getY();
        java.lang.String str14 = solution12.toString();
        boolean boolean16 = solution12.equals((java.lang.Object) (-1L));
        gcdSolutionWrapper9.setSolution(solution12);
        int int18 = solution12.getX();
        int int19 = solution12.getY();
        solution12.setY((int) (short) 10);
        solution12.setY(35);
        solution12.setX(0);
        solution12.setX((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Solution[x=97, y=1]" + "'", str14, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        java.lang.String str5 = equation4.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation4);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (short) 0, solution6);
        int int8 = solution6.getY();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str5, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertNotNull(solution6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-35) + "'", int8 == (-35));
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        int int4 = equation3.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution6);
        gcdSolutionWrapper7.setGcd((int) ' ');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution10 = gcdSolutionWrapper7.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int14 = solution13.getY();
        java.lang.String str15 = solution13.toString();
        solution13.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation21 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, 0, (int) (short) -1);
        boolean boolean22 = solution13.equals((java.lang.Object) equation21);
        int int23 = equation21.c();
        int int24 = equation21.a();
        boolean boolean25 = gcdSolutionWrapper7.equals((java.lang.Object) int24);
        boolean boolean26 = equation3.equals((java.lang.Object) boolean25);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(solution10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Solution[x=97, y=1]" + "'", str15, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, 0, (int) (short) -1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int8 = solution7.getY();
        solution7.setY((int) (byte) 1);
        boolean boolean12 = solution7.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution7);
        boolean boolean14 = equation3.equals((java.lang.Object) gcdSolutionWrapper13);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation18 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int19 = equation18.c();
        int int20 = equation18.b();
        java.lang.Class<?> wildcardClass21 = equation18.getClass();
        boolean boolean22 = equation3.equals((java.lang.Object) wildcardClass21);
        int int23 = equation3.a();
        java.lang.String str24 = equation3.toString();
        int int25 = equation3.a();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Equation[a=0, b=0, c=-1]" + "'", str24, "Equation[a=0, b=0, c=-1]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (short) 10, 10, 52);
        java.lang.String str4 = equation3.toString();
        java.lang.Class<?> wildcardClass5 = equation3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equation[a=10, b=10, c=52]" + "'", str4, "Equation[a=10, b=10, c=52]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int4 = equation3.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution7);
        boolean boolean10 = gcdSolutionWrapper8.equals((java.lang.Object) 1);
        boolean boolean11 = equation3.equals((java.lang.Object) boolean10);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation15 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution16 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation15);
        solution16.setY((int) (byte) 10);
        boolean boolean19 = equation3.equals((java.lang.Object) solution16);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation24 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution25 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation24);
        solution25.setY(0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper28 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution25);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution29 = gcdSolutionWrapper28.getSolution();
        boolean boolean30 = solution16.equals((java.lang.Object) solution29);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(solution16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(solution25);
        org.junit.Assert.assertNotNull(solution29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        int int4 = equation3.c();
        int int5 = equation3.a();
        int int6 = equation3.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        java.lang.String str8 = equation3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(solution7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Equation[a=97, b=0, c=52]" + "'", str8, "Equation[a=97, b=0, c=52]");
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(0, 35);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution3);
        java.lang.Class<?> wildcardClass5 = gcdSolutionWrapper4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) '4', (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution3);
        java.lang.String str5 = gcdSolutionWrapper4.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = gcdSolutionWrapper4.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = gcdSolutionWrapper4.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation11 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) ' ', (int) ' ', 35);
        boolean boolean12 = gcdSolutionWrapper4.equals((java.lang.Object) ' ');
        java.lang.String str13 = gcdSolutionWrapper4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]" + "'", str5, "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]");
        org.junit.Assert.assertNotNull(solution6);
        org.junit.Assert.assertNotNull(solution7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]" + "'", str13, "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(100, (int) (byte) -1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation6 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int7 = equation6.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution8 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation6);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution10 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper11 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution10);
        boolean boolean13 = gcdSolutionWrapper11.equals((java.lang.Object) 1);
        boolean boolean14 = equation6.equals((java.lang.Object) boolean13);
        int int15 = equation6.a();
        boolean boolean16 = solution2.equals((java.lang.Object) int15);
        int int17 = solution2.getX();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(solution8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int4 = equation3.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution7);
        boolean boolean10 = gcdSolutionWrapper8.equals((java.lang.Object) 1);
        boolean boolean11 = equation3.equals((java.lang.Object) boolean10);
        int int12 = equation3.b();
        int int13 = equation3.c();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int5 = solution4.getY();
        java.lang.String str6 = solution4.toString();
        solution4.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((-35), solution4);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper10 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) ' ', solution4);
        gcdSolutionWrapper10.setGcd(52);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution16 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) 100, (int) ' ');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper17 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (short) 10, solution16);
        gcdSolutionWrapper10.setSolution(solution16);
        int int19 = solution16.getX();
        solution16.setY((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Solution[x=97, y=1]" + "'", str6, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int4 = solution3.getY();
        java.lang.String str5 = solution3.toString();
        solution3.setX((int) (short) 1);
        boolean boolean9 = solution3.equals((java.lang.Object) true);
        solution3.setY(32);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper12 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 10, solution3);
        java.lang.Class<?> wildcardClass13 = solution3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Solution[x=97, y=1]" + "'", str5, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) '4', (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution3);
        java.lang.String str5 = gcdSolutionWrapper4.toString();
        gcdSolutionWrapper4.setGcd(32);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation11 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution12 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation11);
        solution12.setY((int) (byte) 10);
        int int15 = solution12.getY();
        gcdSolutionWrapper4.setSolution(solution12);
        solution12.setY(0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]" + "'", str5, "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]");
        org.junit.Assert.assertNotNull(solution12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(0, (int) (short) 100, (int) (short) 1);
        int int4 = equation3.b();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) '4', (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution3);
        java.lang.String str5 = gcdSolutionWrapper4.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = gcdSolutionWrapper4.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = gcdSolutionWrapper4.getSolution();
        java.lang.String str8 = gcdSolutionWrapper4.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution9 = gcdSolutionWrapper4.getSolution();
        solution9.setY(35);
        java.lang.Class<?> wildcardClass12 = solution9.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]" + "'", str5, "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]");
        org.junit.Assert.assertNotNull(solution6);
        org.junit.Assert.assertNotNull(solution7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]" + "'", str8, "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]");
        org.junit.Assert.assertNotNull(solution9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(0, (int) (short) 100, (int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation4);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper6 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution5);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation10 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) ' ', 52, 100);
        int int11 = equation10.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation15 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int16 = equation15.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution17 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation15);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution19 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper20 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution19);
        boolean boolean22 = gcdSolutionWrapper20.equals((java.lang.Object) 1);
        boolean boolean23 = equation15.equals((java.lang.Object) boolean22);
        int int24 = equation15.a();
        int int25 = equation15.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution27 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper28 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution27);
        gcdSolutionWrapper28.setGcd((int) ' ');
        gcdSolutionWrapper28.setGcd((int) (short) 1);
        int int33 = gcdSolutionWrapper28.getGcd();
        int int34 = gcdSolutionWrapper28.getGcd();
        boolean boolean35 = equation15.equals((java.lang.Object) int34);
        boolean boolean36 = equation10.equals((java.lang.Object) equation15);
        java.lang.String str37 = equation15.toString();
        boolean boolean38 = solution5.equals((java.lang.Object) str37);
        int int39 = solution5.getX();
        java.lang.Class<?> wildcardClass40 = solution5.getClass();
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertNotNull(solution17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str37, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(1, 52);
        int int4 = solution3.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper5 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((-1), solution3);
        int int6 = gcdSolutionWrapper5.getGcd();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation4);
        int int6 = solution5.getX();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation10 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        int int11 = equation10.c();
        int int12 = equation10.c();
        int int13 = equation10.a();
        boolean boolean14 = solution5.equals((java.lang.Object) equation10);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution15 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation10);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper16 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 100, solution15);
        java.lang.String str17 = solution15.toString();
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(solution15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Solution[x=0, y=0]" + "'", str17, "Solution[x=0, y=0]");
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, 0, (int) (short) -1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int8 = solution7.getY();
        solution7.setY((int) (byte) 1);
        boolean boolean12 = solution7.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution7);
        boolean boolean14 = equation3.equals((java.lang.Object) gcdSolutionWrapper13);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation18 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution19 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation18);
        solution19.setY(0);
        gcdSolutionWrapper13.setSolution(solution19);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation26 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution30 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int31 = solution30.getY();
        solution30.setY((int) (byte) 1);
        boolean boolean35 = solution30.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper36 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution30);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution37 = gcdSolutionWrapper36.getSolution();
        java.lang.String str38 = gcdSolutionWrapper36.toString();
        gcdSolutionWrapper36.setGcd((int) (byte) 1);
        boolean boolean41 = equation26.equals((java.lang.Object) gcdSolutionWrapper36);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation45 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int46 = equation45.c();
        int int47 = equation45.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution48 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation45);
        boolean boolean49 = gcdSolutionWrapper36.equals((java.lang.Object) solution48);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation53 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int54 = equation53.c();
        int int55 = equation53.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution59 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int60 = solution59.getY();
        solution59.setY((int) (byte) 1);
        boolean boolean64 = solution59.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper65 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution59);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution66 = gcdSolutionWrapper65.getSolution();
        java.lang.String str67 = gcdSolutionWrapper65.toString();
        gcdSolutionWrapper65.setGcd((int) (byte) 1);
        boolean boolean70 = equation53.equals((java.lang.Object) gcdSolutionWrapper65);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution71 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation53);
        int int72 = solution71.getY();
        boolean boolean73 = gcdSolutionWrapper36.equals((java.lang.Object) int72);
        gcdSolutionWrapper36.setGcd((int) (short) 1);
        boolean boolean76 = solution19.equals((java.lang.Object) gcdSolutionWrapper36);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution77 = gcdSolutionWrapper36.getSolution();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(solution19);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(solution37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str38, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 35 + "'", int46 == 35);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(solution48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 35 + "'", int54 == 35);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(solution66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str67, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(solution71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-35) + "'", int72 == (-35));
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(solution77);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        int int4 = equation3.c();
        int int5 = equation3.a();
        int int6 = equation3.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        int int8 = equation3.b();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(solution7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((-35), (int) ' ', 0);
        java.lang.String str5 = equation4.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation4);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) 'a', solution6);
        java.lang.String str8 = gcdSolutionWrapper7.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equation[a=-35, b=32, c=0]" + "'", str5, "Equation[a=-35, b=32, c=0]");
        org.junit.Assert.assertNotNull(solution6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GcdSolutionWrapper[gcd=97, solution=Solution[x=0, y=0]]" + "'", str8, "GcdSolutionWrapper[gcd=97, solution=Solution[x=0, y=0]]");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (short) 10, 10, 52);
        java.lang.String str4 = equation3.toString();
        int int5 = equation3.c();
        int int6 = equation3.a();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equation[a=10, b=10, c=52]" + "'", str4, "Equation[a=10, b=10, c=52]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (short) 100, 97);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution2);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int7 = solution6.getY();
        solution6.setY((int) (byte) 1);
        gcdSolutionWrapper3.setSolution(solution6);
        java.lang.String str11 = solution6.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper12 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) ' ', solution6);
        int int13 = solution6.getY();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Solution[x=97, y=1]" + "'", str11, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int4 = equation3.c();
        java.lang.String str5 = equation3.toString();
        java.lang.String str6 = equation3.toString();
        int int7 = equation3.a();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str5, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str6, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        int int4 = equation3.c();
        boolean boolean6 = equation3.equals((java.lang.Object) false);
        int int7 = equation3.c();
        java.lang.Class<?> wildcardClass8 = equation3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation4);
        int int6 = solution5.getX();
        int int7 = solution5.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) ' ', solution5);
        java.lang.String str9 = gcdSolutionWrapper8.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution11 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper12 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution11);
        boolean boolean14 = gcdSolutionWrapper12.equals((java.lang.Object) 1);
        java.lang.String str15 = gcdSolutionWrapper12.toString();
        gcdSolutionWrapper12.setGcd(32);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution20 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) 100, (int) (byte) -1);
        gcdSolutionWrapper12.setSolution(solution20);
        int int22 = solution20.getX();
        gcdSolutionWrapper8.setSolution(solution20);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution24 = gcdSolutionWrapper8.getSolution();
        int int25 = gcdSolutionWrapper8.getGcd();
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "GcdSolutionWrapper[gcd=32, solution=Solution[x=0, y=0]]" + "'", str9, "GcdSolutionWrapper[gcd=32, solution=Solution[x=0, y=0]]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=null]" + "'", str15, "GcdSolutionWrapper[gcd=1, solution=null]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNotNull(solution24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int4 = solution3.getY();
        solution3.setY((int) (byte) 1);
        boolean boolean8 = solution3.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution10 = gcdSolutionWrapper9.getSolution();
        java.lang.String str11 = gcdSolutionWrapper9.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution14 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(10, 0);
        int int15 = solution14.getX();
        gcdSolutionWrapper9.setSolution(solution14);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution17 = gcdSolutionWrapper9.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation21 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution25 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int26 = solution25.getY();
        solution25.setY((int) (byte) 1);
        boolean boolean30 = solution25.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper31 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution25);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution32 = gcdSolutionWrapper31.getSolution();
        java.lang.String str33 = gcdSolutionWrapper31.toString();
        gcdSolutionWrapper31.setGcd((int) (byte) 1);
        boolean boolean36 = equation21.equals((java.lang.Object) gcdSolutionWrapper31);
        int int37 = gcdSolutionWrapper31.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution38 = gcdSolutionWrapper31.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation42 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        java.lang.String str43 = equation42.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution44 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation42);
        solution44.setY((int) (byte) 10);
        boolean boolean47 = solution38.equals((java.lang.Object) solution44);
        boolean boolean48 = gcdSolutionWrapper9.equals((java.lang.Object) boolean47);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(solution10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str11, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(solution17);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(solution32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str33, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(solution38);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str43, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertNotNull(solution44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution0 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution.INFINITE_SOLUTIONS;
        solution0.setY((int) (short) 100);
        solution0.setY((int) (byte) 1);
        solution0.setX((int) (short) 100);
        solution0.setY((int) (byte) 100);
        int int9 = solution0.getY();
        solution0.setY(52);
        org.junit.Assert.assertNotNull(solution0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution1 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution1);
        gcdSolutionWrapper2.setGcd((int) ' ');
        gcdSolutionWrapper2.setGcd((int) (short) 100);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int10 = solution9.getY();
        java.lang.String str11 = solution9.toString();
        solution9.setX((int) (short) 1);
        boolean boolean15 = solution9.equals((java.lang.Object) (-1.0f));
        gcdSolutionWrapper2.setSolution(solution9);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution18 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper19 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution18);
        boolean boolean21 = gcdSolutionWrapper19.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution23 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper24 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution23);
        gcdSolutionWrapper24.setGcd((int) ' ');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution29 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int30 = solution29.getY();
        java.lang.String str31 = solution29.toString();
        gcdSolutionWrapper24.setSolution(solution29);
        gcdSolutionWrapper19.setSolution(solution29);
        int int34 = solution29.getY();
        java.lang.String str35 = solution29.toString();
        gcdSolutionWrapper2.setSolution(solution29);
        java.lang.Class<?> wildcardClass37 = gcdSolutionWrapper2.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Solution[x=97, y=1]" + "'", str11, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Solution[x=97, y=1]" + "'", str31, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Solution[x=97, y=1]" + "'", str35, "Solution[x=97, y=1]");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) '4', (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution3);
        java.lang.String str5 = gcdSolutionWrapper4.toString();
        int int6 = gcdSolutionWrapper4.getGcd();
        int int7 = gcdSolutionWrapper4.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution10 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) '4', (int) (byte) 0);
        gcdSolutionWrapper4.setSolution(solution10);
        int int12 = gcdSolutionWrapper4.getGcd();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]" + "'", str5, "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution4 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        int int5 = solution4.getX();
        int int6 = solution4.getX();
        org.junit.Assert.assertNotNull(solution4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution4 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        int int5 = solution4.getX();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        int int10 = equation9.c();
        int int11 = equation9.c();
        int int12 = equation9.a();
        boolean boolean13 = solution4.equals((java.lang.Object) equation9);
        int int14 = equation9.a();
        int int15 = equation9.a();
        org.junit.Assert.assertNotNull(solution4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (short) 100, (int) (short) 0, 1);
        int int4 = equation3.b();
        int int5 = equation3.a();
        java.lang.Class<?> wildcardClass6 = equation3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(10, 32);
        int int3 = solution2.getY();
        int int4 = solution2.getX();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation4);
        java.lang.String str6 = solution5.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(1, solution5);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution8 = null;
        gcdSolutionWrapper7.setSolution(solution8);
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Solution[x=0, y=0]" + "'", str6, "Solution[x=0, y=0]");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution2);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int7 = solution6.getY();
        solution6.setY((int) (byte) 1);
        gcdSolutionWrapper3.setSolution(solution6);
        java.lang.String str11 = solution6.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper12 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) ' ', solution6);
        java.lang.String str13 = solution6.toString();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Solution[x=97, y=1]" + "'", str11, "Solution[x=97, y=1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Solution[x=97, y=1]" + "'", str13, "Solution[x=97, y=1]");
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (short) -1, (int) (byte) 10);
        int int3 = solution2.getY();
        java.lang.Class<?> wildcardClass4 = solution2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int4 = solution3.getY();
        solution3.setY((int) (byte) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (short) 0, (int) (short) 1);
        boolean boolean10 = solution3.equals((java.lang.Object) solution9);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper11 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution3);
        java.lang.Class<?> wildcardClass12 = gcdSolutionWrapper11.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int4 = equation3.c();
        int int5 = equation3.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        int int7 = solution6.getY();
        java.lang.Class<?> wildcardClass8 = solution6.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(solution6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-35) + "'", int7 == (-35));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int3 = solution2.getY();
        java.lang.String str4 = solution2.toString();
        int int5 = solution2.getX();
        solution2.setY(1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Solution[x=97, y=1]" + "'", str4, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 1, (int) (short) 10, (int) (short) -1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution4 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution7);
        gcdSolutionWrapper8.setGcd((int) ' ');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution11 = gcdSolutionWrapper8.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution14 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int15 = solution14.getY();
        java.lang.String str16 = solution14.toString();
        solution14.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation22 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, 0, (int) (short) -1);
        boolean boolean23 = solution14.equals((java.lang.Object) equation22);
        int int24 = equation22.c();
        int int25 = equation22.a();
        boolean boolean26 = gcdSolutionWrapper8.equals((java.lang.Object) int25);
        boolean boolean27 = solution5.equals((java.lang.Object) boolean26);
        org.junit.Assert.assertNotNull(solution4);
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertNull(solution11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Solution[x=97, y=1]" + "'", str16, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int5 = solution4.getY();
        solution4.setY((int) (byte) 1);
        boolean boolean9 = solution4.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper10 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution4);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int14 = solution13.getY();
        java.lang.String str15 = solution13.toString();
        boolean boolean17 = solution13.equals((java.lang.Object) (-1L));
        gcdSolutionWrapper10.setSolution(solution13);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper19 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) 'a', solution13);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution22 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) 100, (int) ' ');
        java.lang.String str23 = solution22.toString();
        boolean boolean24 = solution13.equals((java.lang.Object) str23);
        int int25 = solution13.getY();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Solution[x=97, y=1]" + "'", str15, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Solution[x=100, y=32]" + "'", str23, "Solution[x=100, y=32]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int4 = solution3.getY();
        solution3.setY((int) (byte) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (short) 0, (int) (short) 1);
        boolean boolean10 = solution3.equals((java.lang.Object) solution9);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper11 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution3);
        java.lang.String str12 = gcdSolutionWrapper11.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "GcdSolutionWrapper[gcd=0, solution=Solution[x=97, y=1]]" + "'", str12, "GcdSolutionWrapper[gcd=0, solution=Solution[x=97, y=1]]");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int9 = solution8.getY();
        solution8.setY((int) (byte) 1);
        boolean boolean13 = solution8.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper14 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution8);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution15 = gcdSolutionWrapper14.getSolution();
        java.lang.String str16 = gcdSolutionWrapper14.toString();
        gcdSolutionWrapper14.setGcd((int) (byte) 1);
        boolean boolean19 = equation4.equals((java.lang.Object) gcdSolutionWrapper14);
        int int20 = gcdSolutionWrapper14.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution21 = gcdSolutionWrapper14.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper22 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(32, solution21);
        int int23 = gcdSolutionWrapper22.getGcd();
        gcdSolutionWrapper22.setGcd((int) (short) 100);
        java.lang.String str26 = gcdSolutionWrapper22.toString();
        gcdSolutionWrapper22.setGcd((-1));
        java.lang.Class<?> wildcardClass29 = gcdSolutionWrapper22.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(solution15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str16, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(solution21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "GcdSolutionWrapper[gcd=100, solution=Solution[x=97, y=1]]" + "'", str26, "GcdSolutionWrapper[gcd=100, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution4 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((-1), 0, (int) (byte) 10);
        boolean boolean9 = solution4.equals((java.lang.Object) (byte) 10);
        solution4.setX((-1));
        int int12 = solution4.getY();
        org.junit.Assert.assertNotNull(solution4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int8 = solution7.getY();
        solution7.setY((int) (byte) 1);
        boolean boolean12 = solution7.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution7);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution14 = gcdSolutionWrapper13.getSolution();
        java.lang.String str15 = gcdSolutionWrapper13.toString();
        gcdSolutionWrapper13.setGcd((int) (byte) 1);
        boolean boolean18 = equation3.equals((java.lang.Object) gcdSolutionWrapper13);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution20 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper21 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution20);
        gcdSolutionWrapper21.setGcd((int) ' ');
        gcdSolutionWrapper21.setGcd((int) (short) 100);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution28 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int29 = solution28.getY();
        java.lang.String str30 = solution28.toString();
        solution28.setX((int) (short) 1);
        boolean boolean34 = solution28.equals((java.lang.Object) (-1.0f));
        gcdSolutionWrapper21.setSolution(solution28);
        gcdSolutionWrapper13.setSolution(solution28);
        int int37 = gcdSolutionWrapper13.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution39 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper40 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution39);
        boolean boolean42 = gcdSolutionWrapper40.equals((java.lang.Object) 1);
        java.lang.String str43 = gcdSolutionWrapper40.toString();
        gcdSolutionWrapper40.setGcd(32);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution48 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) 100, (int) (byte) -1);
        gcdSolutionWrapper40.setSolution(solution48);
        int int50 = solution48.getX();
        gcdSolutionWrapper13.setSolution(solution48);
        java.lang.String str52 = solution48.toString();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(solution14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str15, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Solution[x=97, y=1]" + "'", str30, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=null]" + "'", str43, "GcdSolutionWrapper[gcd=1, solution=null]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 100 + "'", int50 == 100);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Solution[x=100, y=-1]" + "'", str52, "Solution[x=100, y=-1]");
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) -1, 52, (int) (byte) -1);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int4 = solution3.getY();
        solution3.setY((int) (byte) 1);
        boolean boolean8 = solution3.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution3);
        java.lang.Class<?> wildcardClass10 = solution3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (short) -1, 0);
        int int3 = solution2.getX();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) ' ', 52, 100);
        int int4 = equation3.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int9 = equation8.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution10 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation8);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution12 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution12);
        boolean boolean15 = gcdSolutionWrapper13.equals((java.lang.Object) 1);
        boolean boolean16 = equation8.equals((java.lang.Object) boolean15);
        int int17 = equation8.a();
        int int18 = equation8.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution20 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper21 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution20);
        gcdSolutionWrapper21.setGcd((int) ' ');
        gcdSolutionWrapper21.setGcd((int) (short) 1);
        int int26 = gcdSolutionWrapper21.getGcd();
        int int27 = gcdSolutionWrapper21.getGcd();
        boolean boolean28 = equation8.equals((java.lang.Object) int27);
        boolean boolean29 = equation3.equals((java.lang.Object) equation8);
        int int30 = equation3.b();
        int int31 = equation3.a();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(solution10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 32 + "'", int31 == 32);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution1 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution1);
        gcdSolutionWrapper2.setGcd((int) ' ');
        gcdSolutionWrapper2.setGcd((int) (short) 1);
        java.lang.String str7 = gcdSolutionWrapper2.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution10 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int11 = solution10.getY();
        java.lang.String str12 = solution10.toString();
        solution10.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation18 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int19 = equation18.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution20 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation18);
        boolean boolean21 = solution10.equals((java.lang.Object) solution20);
        boolean boolean23 = solution10.equals((java.lang.Object) false);
        gcdSolutionWrapper2.setSolution(solution10);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution27 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int28 = solution27.getY();
        java.lang.String str29 = solution27.toString();
        solution27.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation35 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, 0, (int) (short) -1);
        boolean boolean36 = solution27.equals((java.lang.Object) equation35);
        int int37 = equation35.c();
        int int38 = equation35.a();
        boolean boolean39 = gcdSolutionWrapper2.equals((java.lang.Object) equation35);
        java.lang.String str40 = equation35.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=null]" + "'", str7, "GcdSolutionWrapper[gcd=1, solution=null]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Solution[x=97, y=1]" + "'", str12, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertNotNull(solution20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Solution[x=97, y=1]" + "'", str29, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Equation[a=0, b=0, c=-1]" + "'", str40, "Equation[a=0, b=0, c=-1]");
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int4 = equation3.c();
        int int5 = equation3.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int10 = solution9.getY();
        solution9.setY((int) (byte) 1);
        boolean boolean14 = solution9.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper15 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution9);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution16 = gcdSolutionWrapper15.getSolution();
        java.lang.String str17 = gcdSolutionWrapper15.toString();
        gcdSolutionWrapper15.setGcd((int) (byte) 1);
        boolean boolean20 = equation3.equals((java.lang.Object) gcdSolutionWrapper15);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution21 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        java.lang.String str22 = equation3.toString();
        java.lang.String str23 = equation3.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution27 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int28 = solution27.getY();
        java.lang.String str29 = solution27.toString();
        solution27.setX((int) (short) 1);
        solution27.setX((int) (byte) 10);
        java.lang.String str34 = solution27.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper35 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(35, solution27);
        gcdSolutionWrapper35.setGcd((int) (byte) 1);
        boolean boolean38 = equation3.equals((java.lang.Object) (byte) 1);
        int int39 = equation3.b();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(solution16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str17, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(solution21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str22, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str23, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Solution[x=97, y=1]" + "'", str29, "Solution[x=97, y=1]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Solution[x=10, y=1]" + "'", str34, "Solution[x=10, y=1]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) '4', (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution3);
        java.lang.String str5 = gcdSolutionWrapper4.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        java.lang.String str10 = equation9.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution11 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation9);
        boolean boolean12 = gcdSolutionWrapper4.equals((java.lang.Object) solution11);
        gcdSolutionWrapper4.setGcd((int) (byte) 10);
        int int15 = gcdSolutionWrapper4.getGcd();
        java.lang.String str16 = gcdSolutionWrapper4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]" + "'", str5, "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str10, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertNotNull(solution11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "GcdSolutionWrapper[gcd=10, solution=Solution[x=52, y=52]]" + "'", str16, "GcdSolutionWrapper[gcd=10, solution=Solution[x=52, y=52]]");
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int4 = equation3.c();
        int int5 = equation3.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int10 = solution9.getY();
        solution9.setY((int) (byte) 1);
        boolean boolean14 = solution9.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper15 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution9);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution16 = gcdSolutionWrapper15.getSolution();
        java.lang.String str17 = gcdSolutionWrapper15.toString();
        gcdSolutionWrapper15.setGcd((int) (byte) 1);
        boolean boolean20 = equation3.equals((java.lang.Object) gcdSolutionWrapper15);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution21 = gcdSolutionWrapper15.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution22 = gcdSolutionWrapper15.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution26 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int27 = solution26.getY();
        solution26.setY((int) (byte) 1);
        boolean boolean31 = solution26.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper32 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution26);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution35 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int36 = solution35.getY();
        java.lang.String str37 = solution35.toString();
        boolean boolean39 = solution35.equals((java.lang.Object) (-1L));
        gcdSolutionWrapper32.setSolution(solution35);
        int int41 = solution35.getX();
        java.lang.String str42 = solution35.toString();
        solution35.setX((int) (byte) 0);
        boolean boolean45 = gcdSolutionWrapper15.equals((java.lang.Object) (byte) 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution46 = gcdSolutionWrapper15.getSolution();
        java.lang.String str47 = gcdSolutionWrapper15.toString();
        int int48 = gcdSolutionWrapper15.getGcd();
        gcdSolutionWrapper15.setGcd(52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(solution16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str17, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(solution21);
        org.junit.Assert.assertNotNull(solution22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Solution[x=97, y=1]" + "'", str37, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 97 + "'", int41 == 97);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Solution[x=97, y=1]" + "'", str42, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(solution46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]" + "'", str47, "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int8 = solution7.getY();
        solution7.setY((int) (byte) 1);
        boolean boolean12 = solution7.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution7);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution14 = gcdSolutionWrapper13.getSolution();
        java.lang.String str15 = gcdSolutionWrapper13.toString();
        gcdSolutionWrapper13.setGcd((int) (byte) 1);
        boolean boolean18 = equation3.equals((java.lang.Object) gcdSolutionWrapper13);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation22 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int23 = equation22.c();
        int int24 = equation22.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution25 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation22);
        boolean boolean26 = gcdSolutionWrapper13.equals((java.lang.Object) solution25);
        boolean boolean28 = gcdSolutionWrapper13.equals((java.lang.Object) (short) 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation33 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution34 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation33);
        int int35 = solution34.getX();
        int int36 = solution34.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper37 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) 'a', solution34);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution40 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int41 = solution40.getY();
        java.lang.String str42 = solution40.toString();
        solution40.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation48 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int49 = equation48.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution50 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation48);
        boolean boolean51 = solution40.equals((java.lang.Object) solution50);
        boolean boolean52 = solution34.equals((java.lang.Object) boolean51);
        gcdSolutionWrapper13.setSolution(solution34);
        solution34.setX((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(solution14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str15, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(solution25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(solution34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Solution[x=97, y=1]" + "'", str42, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 35 + "'", int49 == 35);
        org.junit.Assert.assertNotNull(solution50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, 0, (int) (short) -1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int8 = solution7.getY();
        solution7.setY((int) (byte) 1);
        boolean boolean12 = solution7.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution7);
        boolean boolean14 = equation3.equals((java.lang.Object) gcdSolutionWrapper13);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation18 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution19 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation18);
        solution19.setY(0);
        gcdSolutionWrapper13.setSolution(solution19);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation26 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution30 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int31 = solution30.getY();
        solution30.setY((int) (byte) 1);
        boolean boolean35 = solution30.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper36 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution30);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution37 = gcdSolutionWrapper36.getSolution();
        java.lang.String str38 = gcdSolutionWrapper36.toString();
        gcdSolutionWrapper36.setGcd((int) (byte) 1);
        boolean boolean41 = equation26.equals((java.lang.Object) gcdSolutionWrapper36);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation45 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int46 = equation45.c();
        int int47 = equation45.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution48 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation45);
        boolean boolean49 = gcdSolutionWrapper36.equals((java.lang.Object) solution48);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation53 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int54 = equation53.c();
        int int55 = equation53.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution59 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int60 = solution59.getY();
        solution59.setY((int) (byte) 1);
        boolean boolean64 = solution59.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper65 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution59);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution66 = gcdSolutionWrapper65.getSolution();
        java.lang.String str67 = gcdSolutionWrapper65.toString();
        gcdSolutionWrapper65.setGcd((int) (byte) 1);
        boolean boolean70 = equation53.equals((java.lang.Object) gcdSolutionWrapper65);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution71 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation53);
        int int72 = solution71.getY();
        boolean boolean73 = gcdSolutionWrapper36.equals((java.lang.Object) int72);
        gcdSolutionWrapper36.setGcd((int) (short) 1);
        boolean boolean76 = solution19.equals((java.lang.Object) gcdSolutionWrapper36);
        java.lang.String str77 = solution19.toString();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(solution19);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(solution37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str38, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 35 + "'", int46 == 35);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(solution48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 35 + "'", int54 == 35);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(solution66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str67, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(solution71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-35) + "'", int72 == (-35));
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Solution[x=-1, y=0]" + "'", str77, "Solution[x=-1, y=0]");
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) '4', (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution3);
        java.lang.String str5 = gcdSolutionWrapper4.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = gcdSolutionWrapper4.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = gcdSolutionWrapper4.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation11 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) ' ', (int) ' ', 35);
        boolean boolean12 = gcdSolutionWrapper4.equals((java.lang.Object) ' ');
        java.lang.Class<?> wildcardClass13 = gcdSolutionWrapper4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]" + "'", str5, "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]");
        org.junit.Assert.assertNotNull(solution6);
        org.junit.Assert.assertNotNull(solution7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(0, (int) (byte) 1, 0);
        int int4 = equation3.c();
        java.lang.String str5 = equation3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equation[a=0, b=1, c=0]" + "'", str5, "Equation[a=0, b=1, c=0]");
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((-1), 0);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) ' ', (int) ' ', 35);
        java.lang.Class<?> wildcardClass4 = equation3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution2);
        boolean boolean5 = gcdSolutionWrapper3.equals((java.lang.Object) 1);
        java.lang.String str6 = gcdSolutionWrapper3.toString();
        gcdSolutionWrapper3.setGcd(32);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution11 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) 100, (int) (byte) -1);
        gcdSolutionWrapper3.setSolution(solution11);
        int int13 = solution11.getX();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper14 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution11);
        java.lang.String str15 = solution11.toString();
        solution11.setY((int) (short) 1);
        int int18 = solution11.getY();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=null]" + "'", str6, "GcdSolutionWrapper[gcd=1, solution=null]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Solution[x=100, y=-1]" + "'", str15, "Solution[x=100, y=-1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int4 = equation3.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution7);
        boolean boolean10 = gcdSolutionWrapper8.equals((java.lang.Object) 1);
        boolean boolean11 = equation3.equals((java.lang.Object) boolean10);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation15 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution16 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation15);
        solution16.setY((int) (byte) 10);
        boolean boolean19 = equation3.equals((java.lang.Object) solution16);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution20 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution24 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) '4', (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper25 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution24);
        java.lang.String str26 = gcdSolutionWrapper25.toString();
        gcdSolutionWrapper25.setGcd((int) '4');
        boolean boolean29 = solution20.equals((java.lang.Object) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(solution16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(solution20);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]" + "'", str26, "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int5 = solution4.getY();
        java.lang.String str6 = solution4.toString();
        solution4.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((-35), solution4);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper10 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) ' ', solution4);
        gcdSolutionWrapper10.setGcd(52);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution16 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) 100, (int) ' ');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper17 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (short) 10, solution16);
        gcdSolutionWrapper10.setSolution(solution16);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution21 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int22 = solution21.getY();
        java.lang.String str23 = solution21.toString();
        java.lang.String str24 = solution21.toString();
        java.lang.String str25 = solution21.toString();
        gcdSolutionWrapper10.setSolution(solution21);
        java.lang.String str27 = gcdSolutionWrapper10.toString();
        gcdSolutionWrapper10.setGcd(52);
        gcdSolutionWrapper10.setGcd((int) (short) 0);
        java.lang.Class<?> wildcardClass32 = gcdSolutionWrapper10.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Solution[x=97, y=1]" + "'", str6, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Solution[x=97, y=1]" + "'", str23, "Solution[x=97, y=1]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Solution[x=97, y=1]" + "'", str24, "Solution[x=97, y=1]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Solution[x=97, y=1]" + "'", str25, "Solution[x=97, y=1]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "GcdSolutionWrapper[gcd=52, solution=Solution[x=97, y=1]]" + "'", str27, "GcdSolutionWrapper[gcd=52, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) 1, (int) (short) 100);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(35, solution3);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int4 = solution3.getY();
        solution3.setY((int) (byte) 1);
        boolean boolean8 = solution3.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution10 = gcdSolutionWrapper9.getSolution();
        java.lang.String str11 = gcdSolutionWrapper9.toString();
        gcdSolutionWrapper9.setGcd((int) (byte) 1);
        java.lang.String str14 = gcdSolutionWrapper9.toString();
        java.lang.String str15 = gcdSolutionWrapper9.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation19 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        int int20 = equation19.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution21 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation19);
        boolean boolean22 = gcdSolutionWrapper9.equals((java.lang.Object) equation19);
        java.lang.String str23 = gcdSolutionWrapper9.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution26 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(35, 35);
        gcdSolutionWrapper9.setSolution(solution26);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(solution10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str11, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]" + "'", str14, "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]" + "'", str15, "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertNotNull(solution21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]" + "'", str23, "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]");
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, 0, (int) (short) -1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int8 = solution7.getY();
        solution7.setY((int) (byte) 1);
        boolean boolean12 = solution7.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution7);
        boolean boolean14 = equation3.equals((java.lang.Object) gcdSolutionWrapper13);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation18 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int19 = equation18.c();
        int int20 = equation18.b();
        java.lang.Class<?> wildcardClass21 = equation18.getClass();
        boolean boolean22 = equation3.equals((java.lang.Object) wildcardClass21);
        java.lang.String str23 = equation3.toString();
        int int24 = equation3.b();
        int int25 = equation3.a();
        int int26 = equation3.c();
        java.lang.String str27 = equation3.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution32 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int33 = solution32.getY();
        java.lang.String str34 = solution32.toString();
        solution32.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper37 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((-35), solution32);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper38 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) ' ', solution32);
        gcdSolutionWrapper38.setGcd(52);
        boolean boolean41 = equation3.equals((java.lang.Object) 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Equation[a=0, b=0, c=-1]" + "'", str23, "Equation[a=0, b=0, c=-1]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Equation[a=0, b=0, c=-1]" + "'", str27, "Equation[a=0, b=0, c=-1]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Solution[x=97, y=1]" + "'", str34, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '#', 52, 32);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int7 = solution6.getY();
        java.lang.String str8 = solution6.toString();
        solution6.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation14 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int15 = equation14.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution16 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation14);
        boolean boolean17 = solution6.equals((java.lang.Object) solution16);
        boolean boolean19 = solution16.equals((java.lang.Object) 0);
        boolean boolean20 = equation3.equals((java.lang.Object) solution16);
        java.lang.String str21 = equation3.toString();
        java.lang.Class<?> wildcardClass22 = equation3.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Solution[x=97, y=1]" + "'", str8, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertNotNull(solution16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Equation[a=35, b=52, c=32]" + "'", str21, "Equation[a=35, b=52, c=32]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        int int4 = equation3.c();
        boolean boolean6 = equation3.equals((java.lang.Object) false);
        int int7 = equation3.a();
        int int8 = equation3.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution9 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(solution9);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((-35), 1);
        java.lang.String str3 = solution2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Solution[x=-35, y=1]" + "'", str3, "Solution[x=-35, y=1]");
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation4);
        int int6 = solution5.getX();
        int int7 = solution5.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) ' ', solution5);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution9 = gcdSolutionWrapper8.getSolution();
        java.lang.String str10 = solution9.toString();
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(solution9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Solution[x=0, y=0]" + "'", str10, "Solution[x=0, y=0]");
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(10, 0);
        java.lang.String str3 = solution2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Solution[x=10, y=0]" + "'", str3, "Solution[x=10, y=0]");
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) 1, (int) (short) 1);
        java.lang.String str3 = solution2.toString();
        int int4 = solution2.getY();
        java.lang.Class<?> wildcardClass5 = solution2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Solution[x=1, y=1]" + "'", str3, "Solution[x=1, y=1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int3 = solution2.getY();
        java.lang.String str4 = solution2.toString();
        solution2.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation10 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, 0, (int) (short) -1);
        boolean boolean11 = solution2.equals((java.lang.Object) equation10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution12 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Solution[x=97, y=1]" + "'", str4, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution1 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution1);
        gcdSolutionWrapper2.setGcd((int) ' ');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int8 = solution7.getY();
        java.lang.String str9 = solution7.toString();
        gcdSolutionWrapper2.setSolution(solution7);
        int int11 = gcdSolutionWrapper2.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution14 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int15 = solution14.getY();
        gcdSolutionWrapper2.setSolution(solution14);
        java.lang.String str17 = gcdSolutionWrapper2.toString();
        int int18 = gcdSolutionWrapper2.getGcd();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Solution[x=97, y=1]" + "'", str9, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "GcdSolutionWrapper[gcd=32, solution=Solution[x=97, y=1]]" + "'", str17, "GcdSolutionWrapper[gcd=32, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (short) 1, (int) ' ', (int) (byte) 1);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int3 = solution2.getY();
        java.lang.String str4 = solution2.toString();
        solution2.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation10 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int11 = equation10.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution12 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation10);
        boolean boolean13 = solution2.equals((java.lang.Object) solution12);
        int int14 = solution12.getY();
        java.lang.String str15 = solution12.toString();
        solution12.setY((int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Solution[x=97, y=1]" + "'", str4, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertNotNull(solution12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-35) + "'", int14 == (-35));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Solution[x=0, y=-35]" + "'", str15, "Solution[x=0, y=-35]");
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (short) 0, 32);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int5 = equation4.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation4);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution8 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution8);
        boolean boolean11 = gcdSolutionWrapper9.equals((java.lang.Object) 1);
        boolean boolean12 = equation4.equals((java.lang.Object) boolean11);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation16 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution17 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation16);
        solution17.setY((int) (byte) 10);
        boolean boolean20 = equation4.equals((java.lang.Object) solution17);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution21 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation4);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper22 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (short) -1, solution21);
        java.lang.String str23 = gcdSolutionWrapper22.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution24 = gcdSolutionWrapper22.getSolution();
        int int25 = solution24.getX();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(solution6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(solution17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(solution21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=0, y=-35]]" + "'", str23, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=0, y=-35]]");
        org.junit.Assert.assertNotNull(solution24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) ' ', 52, 100);
        int int4 = equation3.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int9 = equation8.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution10 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation8);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution12 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution12);
        boolean boolean15 = gcdSolutionWrapper13.equals((java.lang.Object) 1);
        boolean boolean16 = equation8.equals((java.lang.Object) boolean15);
        int int17 = equation8.a();
        int int18 = equation8.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution20 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper21 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution20);
        gcdSolutionWrapper21.setGcd((int) ' ');
        gcdSolutionWrapper21.setGcd((int) (short) 1);
        int int26 = gcdSolutionWrapper21.getGcd();
        int int27 = gcdSolutionWrapper21.getGcd();
        boolean boolean28 = equation8.equals((java.lang.Object) int27);
        boolean boolean29 = equation3.equals((java.lang.Object) equation8);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution30 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation8);
        solution30.setY((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(solution10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(solution30);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int4 = solution3.getY();
        solution3.setY((int) (byte) 1);
        boolean boolean8 = solution3.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution10 = gcdSolutionWrapper9.getSolution();
        java.lang.String str11 = gcdSolutionWrapper9.toString();
        gcdSolutionWrapper9.setGcd((int) (byte) 1);
        java.lang.String str14 = gcdSolutionWrapper9.toString();
        java.lang.String str15 = gcdSolutionWrapper9.toString();
        int int16 = gcdSolutionWrapper9.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation20 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int21 = equation20.c();
        int int22 = equation20.b();
        int int23 = equation20.c();
        int int24 = equation20.c();
        boolean boolean25 = gcdSolutionWrapper9.equals((java.lang.Object) int24);
        gcdSolutionWrapper9.setGcd((int) (byte) 10);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation31 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int32 = equation31.c();
        java.lang.String str33 = equation31.toString();
        java.lang.String str34 = equation31.toString();
        boolean boolean35 = gcdSolutionWrapper9.equals((java.lang.Object) str34);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(solution10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str11, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]" + "'", str14, "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]" + "'", str15, "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 35 + "'", int32 == 35);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str33, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str34, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution1 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(97, solution1);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        java.lang.String str4 = equation3.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        solution5.setY((int) (byte) 10);
        solution5.setY((int) (short) 100);
        int int10 = solution5.getX();
        solution5.setY(52);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str4, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution1 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution1);
        gcdSolutionWrapper2.setGcd((int) ' ');
        gcdSolutionWrapper2.setGcd((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = gcdSolutionWrapper2.getSolution();
        int int8 = gcdSolutionWrapper2.getGcd();
        gcdSolutionWrapper2.setGcd(0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation14 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution15 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation14);
        solution15.setY(0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation21 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (short) 10, 10, 52);
        boolean boolean22 = solution15.equals((java.lang.Object) (short) 10);
        gcdSolutionWrapper2.setSolution(solution15);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution27 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int28 = solution27.getY();
        java.lang.String str29 = solution27.toString();
        solution27.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper32 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((-35), solution27);
        java.lang.String str33 = solution27.toString();
        gcdSolutionWrapper2.setSolution(solution27);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation38 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(32, (int) (byte) 100, 1);
        int int39 = equation38.b();
        boolean boolean40 = gcdSolutionWrapper2.equals((java.lang.Object) int39);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution43 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int44 = solution43.getY();
        java.lang.String str45 = solution43.toString();
        solution43.setX((int) (short) 1);
        solution43.setX((int) (byte) 10);
        java.lang.String str50 = solution43.toString();
        solution43.setY((int) 'a');
        solution43.setY(35);
        gcdSolutionWrapper2.setSolution(solution43);
        gcdSolutionWrapper2.setGcd((int) (byte) -1);
        java.lang.Class<?> wildcardClass58 = gcdSolutionWrapper2.getClass();
        org.junit.Assert.assertNull(solution7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(solution15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Solution[x=97, y=1]" + "'", str29, "Solution[x=97, y=1]");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Solution[x=1, y=1]" + "'", str33, "Solution[x=1, y=1]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Solution[x=97, y=1]" + "'", str45, "Solution[x=97, y=1]");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Solution[x=10, y=1]" + "'", str50, "Solution[x=10, y=1]");
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(32, (int) (byte) 10);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int7 = solution6.getY();
        solution6.setY((int) (byte) 1);
        boolean boolean11 = solution6.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper12 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution6);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution15 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int16 = solution15.getY();
        java.lang.String str17 = solution15.toString();
        boolean boolean19 = solution15.equals((java.lang.Object) (-1L));
        gcdSolutionWrapper12.setSolution(solution15);
        int int21 = solution15.getX();
        int int22 = solution15.getY();
        solution15.setY((int) (short) 10);
        solution15.setY(35);
        solution15.setX(0);
        boolean boolean29 = solution2.equals((java.lang.Object) solution15);
        solution15.setY(35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Solution[x=97, y=1]" + "'", str17, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((-1), 52);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution1 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution1);
        gcdSolutionWrapper2.setGcd((int) ' ');
        gcdSolutionWrapper2.setGcd((int) (short) 100);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int10 = solution9.getY();
        java.lang.String str11 = solution9.toString();
        solution9.setX((int) (short) 1);
        boolean boolean15 = solution9.equals((java.lang.Object) (-1.0f));
        gcdSolutionWrapper2.setSolution(solution9);
        int int17 = gcdSolutionWrapper2.getGcd();
        java.lang.Class<?> wildcardClass18 = gcdSolutionWrapper2.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Solution[x=97, y=1]" + "'", str11, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(32, (-35), (int) (byte) 1);
        int int4 = equation3.b();
        int int5 = equation3.b();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-35) + "'", int4 == (-35));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-35) + "'", int5 == (-35));
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation4);
        int int6 = solution5.getX();
        int int7 = solution5.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) ' ', solution5);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution9 = gcdSolutionWrapper8.getSolution();
        int int10 = gcdSolutionWrapper8.getGcd();
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(solution9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int4 = equation3.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution7);
        boolean boolean10 = gcdSolutionWrapper8.equals((java.lang.Object) 1);
        boolean boolean11 = equation3.equals((java.lang.Object) boolean10);
        int int12 = equation3.a();
        int int13 = equation3.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution15 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper16 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution15);
        gcdSolutionWrapper16.setGcd((int) ' ');
        gcdSolutionWrapper16.setGcd((int) (short) 1);
        int int21 = gcdSolutionWrapper16.getGcd();
        int int22 = gcdSolutionWrapper16.getGcd();
        boolean boolean23 = equation3.equals((java.lang.Object) int22);
        int int24 = equation3.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution28 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int29 = solution28.getY();
        java.lang.String str30 = solution28.toString();
        solution28.setX((int) (short) 1);
        java.lang.String str33 = solution28.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper34 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(35, solution28);
        boolean boolean35 = equation3.equals((java.lang.Object) 35);
        java.lang.Class<?> wildcardClass36 = equation3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Solution[x=97, y=1]" + "'", str30, "Solution[x=97, y=1]");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Solution[x=1, y=1]" + "'", str33, "Solution[x=1, y=1]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, 0, (int) (short) -1);
        int int4 = equation3.c();
        int int5 = equation3.c();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int4 = equation3.c();
        int int5 = equation3.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int10 = solution9.getY();
        solution9.setY((int) (byte) 1);
        boolean boolean14 = solution9.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper15 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution9);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution16 = gcdSolutionWrapper15.getSolution();
        java.lang.String str17 = gcdSolutionWrapper15.toString();
        gcdSolutionWrapper15.setGcd((int) (byte) 1);
        boolean boolean20 = equation3.equals((java.lang.Object) gcdSolutionWrapper15);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution21 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution23 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper24 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution23);
        gcdSolutionWrapper24.setGcd((int) ' ');
        gcdSolutionWrapper24.setGcd((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution29 = gcdSolutionWrapper24.getSolution();
        int int30 = gcdSolutionWrapper24.getGcd();
        gcdSolutionWrapper24.setGcd(0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation36 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution37 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation36);
        solution37.setY(0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation43 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (short) 10, 10, 52);
        boolean boolean44 = solution37.equals((java.lang.Object) (short) 10);
        gcdSolutionWrapper24.setSolution(solution37);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution49 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int50 = solution49.getY();
        java.lang.String str51 = solution49.toString();
        solution49.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper54 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((-35), solution49);
        java.lang.String str55 = solution49.toString();
        gcdSolutionWrapper24.setSolution(solution49);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation60 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(32, (int) (byte) 100, 1);
        int int61 = equation60.b();
        boolean boolean62 = gcdSolutionWrapper24.equals((java.lang.Object) int61);
        boolean boolean63 = equation3.equals((java.lang.Object) gcdSolutionWrapper24);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation68 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution69 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation68);
        int int70 = solution69.getX();
        int int71 = solution69.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper72 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) 'a', solution69);
        gcdSolutionWrapper72.setGcd((int) (short) 0);
        gcdSolutionWrapper72.setGcd((int) '4');
        boolean boolean77 = gcdSolutionWrapper24.equals((java.lang.Object) gcdSolutionWrapper72);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(solution16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str17, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(solution21);
        org.junit.Assert.assertNull(solution29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(solution37);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Solution[x=97, y=1]" + "'", str51, "Solution[x=97, y=1]");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Solution[x=1, y=1]" + "'", str55, "Solution[x=1, y=1]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 100 + "'", int61 == 100);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(solution69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, 0, (int) (short) -1);
        int int4 = equation3.c();
        int int5 = equation3.a();
        int int6 = equation3.a();
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution1 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution1);
        gcdSolutionWrapper2.setGcd((int) ' ');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = gcdSolutionWrapper2.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = gcdSolutionWrapper2.getSolution();
        java.lang.String str7 = gcdSolutionWrapper2.toString();
        org.junit.Assert.assertNull(solution5);
        org.junit.Assert.assertNull(solution6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GcdSolutionWrapper[gcd=32, solution=null]" + "'", str7, "GcdSolutionWrapper[gcd=32, solution=null]");
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int4 = solution3.getY();
        solution3.setY((int) (byte) 1);
        boolean boolean8 = solution3.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution10 = gcdSolutionWrapper9.getSolution();
        java.lang.String str11 = gcdSolutionWrapper9.toString();
        gcdSolutionWrapper9.setGcd((int) (byte) 1);
        java.lang.String str14 = gcdSolutionWrapper9.toString();
        java.lang.String str15 = gcdSolutionWrapper9.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation19 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        int int20 = equation19.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution21 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation19);
        boolean boolean22 = gcdSolutionWrapper9.equals((java.lang.Object) equation19);
        int int23 = equation19.a();
        java.lang.String str24 = equation19.toString();
        int int25 = equation19.b();
        int int26 = equation19.c();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(solution10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str11, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]" + "'", str14, "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]" + "'", str15, "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertNotNull(solution21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Equation[a=97, b=0, c=52]" + "'", str24, "Equation[a=97, b=0, c=52]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int5 = equation4.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation4);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution8 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution8);
        boolean boolean11 = gcdSolutionWrapper9.equals((java.lang.Object) 1);
        boolean boolean12 = equation4.equals((java.lang.Object) boolean11);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation16 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution17 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation16);
        solution17.setY((int) (byte) 10);
        boolean boolean20 = equation4.equals((java.lang.Object) solution17);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution21 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation4);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper22 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (short) -1, solution21);
        int int23 = solution21.getX();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(solution6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(solution17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(solution21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (short) 10, 10, 52);
        java.lang.String str4 = equation3.toString();
        int int5 = equation3.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        java.lang.String str7 = equation3.toString();
        java.lang.Class<?> wildcardClass8 = equation3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equation[a=10, b=10, c=52]" + "'", str4, "Equation[a=10, b=10, c=52]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(solution6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equation[a=10, b=10, c=52]" + "'", str7, "Equation[a=10, b=10, c=52]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(97, (int) (short) 1);
        java.lang.String str3 = solution2.toString();
        int int4 = solution2.getY();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Solution[x=97, y=1]" + "'", str3, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 100, 0, 52);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution1 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution1);
        gcdSolutionWrapper2.setGcd((int) ' ');
        gcdSolutionWrapper2.setGcd((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = gcdSolutionWrapper2.getSolution();
        int int8 = gcdSolutionWrapper2.getGcd();
        gcdSolutionWrapper2.setGcd(0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation14 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution15 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation14);
        solution15.setY(0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation21 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (short) 10, 10, 52);
        boolean boolean22 = solution15.equals((java.lang.Object) (short) 10);
        gcdSolutionWrapper2.setSolution(solution15);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution27 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int28 = solution27.getY();
        java.lang.String str29 = solution27.toString();
        solution27.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper32 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((-35), solution27);
        java.lang.String str33 = solution27.toString();
        gcdSolutionWrapper2.setSolution(solution27);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation38 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(32, (int) (byte) 100, 1);
        int int39 = equation38.b();
        boolean boolean40 = gcdSolutionWrapper2.equals((java.lang.Object) int39);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution43 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int44 = solution43.getY();
        java.lang.String str45 = solution43.toString();
        solution43.setX((int) (short) 1);
        solution43.setX((int) (byte) 10);
        java.lang.String str50 = solution43.toString();
        solution43.setY((int) 'a');
        solution43.setY(35);
        gcdSolutionWrapper2.setSolution(solution43);
        java.lang.String str56 = gcdSolutionWrapper2.toString();
        org.junit.Assert.assertNull(solution7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(solution15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Solution[x=97, y=1]" + "'", str29, "Solution[x=97, y=1]");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Solution[x=1, y=1]" + "'", str33, "Solution[x=1, y=1]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Solution[x=97, y=1]" + "'", str45, "Solution[x=97, y=1]");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Solution[x=10, y=1]" + "'", str50, "Solution[x=10, y=1]");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "GcdSolutionWrapper[gcd=0, solution=Solution[x=10, y=35]]" + "'", str56, "GcdSolutionWrapper[gcd=0, solution=Solution[x=10, y=35]]");
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) '4', (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution3);
        int int5 = solution3.getX();
        solution3.setY((-1));
        solution3.setY((int) ' ');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation4);
        int int6 = solution5.getX();
        int int7 = solution5.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) 'a', solution5);
        gcdSolutionWrapper8.setGcd((int) (short) 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation14 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution15 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation14);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation19 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((-1), 0, (int) (byte) 10);
        boolean boolean20 = solution15.equals((java.lang.Object) (byte) 10);
        gcdSolutionWrapper8.setSolution(solution15);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution22 = gcdSolutionWrapper8.getSolution();
        java.lang.String str23 = gcdSolutionWrapper8.toString();
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(solution15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(solution22);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "GcdSolutionWrapper[gcd=0, solution=Solution[x=0, y=0]]" + "'", str23, "GcdSolutionWrapper[gcd=0, solution=Solution[x=0, y=0]]");
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution1 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution1);
        gcdSolutionWrapper2.setGcd((int) ' ');
        gcdSolutionWrapper2.setGcd((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = gcdSolutionWrapper2.getSolution();
        int int8 = gcdSolutionWrapper2.getGcd();
        gcdSolutionWrapper2.setGcd(0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation14 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution15 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation14);
        solution15.setY(0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation21 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (short) 10, 10, 52);
        boolean boolean22 = solution15.equals((java.lang.Object) (short) 10);
        gcdSolutionWrapper2.setSolution(solution15);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution27 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int28 = solution27.getY();
        java.lang.String str29 = solution27.toString();
        solution27.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper32 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((-35), solution27);
        java.lang.String str33 = solution27.toString();
        gcdSolutionWrapper2.setSolution(solution27);
        int int35 = gcdSolutionWrapper2.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation39 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int40 = equation39.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution41 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation39);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution42 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation39);
        java.lang.Class<?> wildcardClass43 = equation39.getClass();
        boolean boolean44 = gcdSolutionWrapper2.equals((java.lang.Object) wildcardClass43);
        org.junit.Assert.assertNull(solution7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(solution15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Solution[x=97, y=1]" + "'", str29, "Solution[x=97, y=1]");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Solution[x=1, y=1]" + "'", str33, "Solution[x=1, y=1]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 35 + "'", int40 == 35);
        org.junit.Assert.assertNotNull(solution41);
        org.junit.Assert.assertNotNull(solution42);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(1, 52);
        int int4 = solution3.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper5 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((-1), solution3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = gcdSolutionWrapper5.getSolution();
        int int7 = solution6.getX();
        solution6.setX((int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(solution6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int5 = solution4.getY();
        java.lang.String str6 = solution4.toString();
        solution4.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((-35), solution4);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper10 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) ' ', solution4);
        gcdSolutionWrapper10.setGcd(52);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution16 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) 100, (int) ' ');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper17 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (short) 10, solution16);
        gcdSolutionWrapper10.setSolution(solution16);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution19 = gcdSolutionWrapper10.getSolution();
        java.lang.String str20 = solution19.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Solution[x=97, y=1]" + "'", str6, "Solution[x=97, y=1]");
        org.junit.Assert.assertNotNull(solution19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Solution[x=100, y=32]" + "'", str20, "Solution[x=100, y=32]");
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (short) 0, 97, (int) (short) 10);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        int int4 = equation3.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        java.lang.Class<?> wildcardClass6 = solution5.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int8 = solution7.getY();
        solution7.setY((int) (byte) 1);
        boolean boolean12 = solution7.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution7);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution14 = gcdSolutionWrapper13.getSolution();
        java.lang.String str15 = gcdSolutionWrapper13.toString();
        gcdSolutionWrapper13.setGcd((int) (byte) 1);
        boolean boolean18 = equation3.equals((java.lang.Object) gcdSolutionWrapper13);
        int int19 = gcdSolutionWrapper13.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution20 = gcdSolutionWrapper13.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation24 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        java.lang.String str25 = equation24.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution26 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation24);
        solution26.setY((int) (byte) 10);
        boolean boolean29 = solution20.equals((java.lang.Object) solution26);
        java.lang.String str30 = solution20.toString();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(solution14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str15, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(solution20);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str25, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertNotNull(solution26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Solution[x=97, y=1]" + "'", str30, "Solution[x=97, y=1]");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (short) -1, (int) (short) 10);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation4);
        solution5.setY(0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution5);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation12 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution13 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation12);
        solution13.setY((int) (byte) 10);
        boolean boolean16 = solution5.equals((java.lang.Object) (byte) 10);
        int int17 = solution5.getX();
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertNotNull(solution13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution1 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution1);
        gcdSolutionWrapper2.setGcd((int) ' ');
        gcdSolutionWrapper2.setGcd((int) (short) 1);
        java.lang.String str7 = gcdSolutionWrapper2.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution10 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int11 = solution10.getY();
        java.lang.String str12 = solution10.toString();
        solution10.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation18 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int19 = equation18.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution20 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation18);
        boolean boolean21 = solution10.equals((java.lang.Object) solution20);
        boolean boolean23 = solution10.equals((java.lang.Object) false);
        gcdSolutionWrapper2.setSolution(solution10);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution27 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int28 = solution27.getY();
        java.lang.String str29 = solution27.toString();
        solution27.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation35 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, 0, (int) (short) -1);
        boolean boolean36 = solution27.equals((java.lang.Object) equation35);
        int int37 = equation35.c();
        int int38 = equation35.a();
        boolean boolean39 = gcdSolutionWrapper2.equals((java.lang.Object) equation35);
        java.lang.String str40 = gcdSolutionWrapper2.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=null]" + "'", str7, "GcdSolutionWrapper[gcd=1, solution=null]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Solution[x=97, y=1]" + "'", str12, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertNotNull(solution20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Solution[x=97, y=1]" + "'", str29, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=Solution[x=1, y=1]]" + "'", str40, "GcdSolutionWrapper[gcd=1, solution=Solution[x=1, y=1]]");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int4 = solution3.getY();
        solution3.setY((int) (byte) 1);
        int int7 = solution3.getY();
        java.lang.String str8 = solution3.toString();
        solution3.setY(97);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper11 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (short) 1, solution3);
        int int12 = gcdSolutionWrapper11.getGcd();
        int int13 = gcdSolutionWrapper11.getGcd();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Solution[x=97, y=1]" + "'", str8, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(32, (int) (short) 10);
        int int4 = solution3.getY();
        int int5 = solution3.getY();
        boolean boolean7 = solution3.equals((java.lang.Object) "GcdSolutionWrapper[gcd=100, solution=null]");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(97, solution3);
        gcdSolutionWrapper8.setGcd(97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int4 = equation3.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution7);
        boolean boolean10 = gcdSolutionWrapper8.equals((java.lang.Object) 1);
        boolean boolean11 = equation3.equals((java.lang.Object) boolean10);
        int int12 = equation3.a();
        int int13 = equation3.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution15 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper16 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution15);
        gcdSolutionWrapper16.setGcd((int) ' ');
        gcdSolutionWrapper16.setGcd((int) (short) 1);
        int int21 = gcdSolutionWrapper16.getGcd();
        int int22 = gcdSolutionWrapper16.getGcd();
        boolean boolean23 = equation3.equals((java.lang.Object) int22);
        int int24 = equation3.c();
        int int25 = equation3.b();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(10, 10);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (short) 100, solution3);
        int int5 = solution3.getY();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution4 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        solution4.setY(0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation10 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (short) 10, 10, 52);
        boolean boolean11 = solution4.equals((java.lang.Object) (short) 10);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation15 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        java.lang.String str16 = equation15.toString();
        boolean boolean17 = solution4.equals((java.lang.Object) str16);
        solution4.setX(0);
        java.lang.Class<?> wildcardClass20 = solution4.getClass();
        org.junit.Assert.assertNotNull(solution4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str16, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) '4', (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution3);
        java.lang.String str5 = gcdSolutionWrapper4.toString();
        gcdSolutionWrapper4.setGcd((int) '4');
        gcdSolutionWrapper4.setGcd((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]" + "'", str5, "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]");
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (short) -1, 52);
        int int3 = solution2.getY();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(10, 10);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (short) 100, solution3);
        gcdSolutionWrapper4.setGcd(52);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int3 = solution2.getY();
        java.lang.String str4 = solution2.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        int int9 = equation8.c();
        int int10 = equation8.a();
        int int11 = equation8.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution12 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation8);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation16 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int17 = equation16.c();
        int int18 = equation16.b();
        int int19 = equation16.c();
        boolean boolean20 = solution12.equals((java.lang.Object) equation16);
        boolean boolean21 = solution2.equals((java.lang.Object) boolean20);
        java.lang.String str22 = solution2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Solution[x=97, y=1]" + "'", str4, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(solution12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Solution[x=97, y=1]" + "'", str22, "Solution[x=97, y=1]");
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution1 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution1);
        gcdSolutionWrapper2.setGcd((int) ' ');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int8 = solution7.getY();
        java.lang.String str9 = solution7.toString();
        gcdSolutionWrapper2.setSolution(solution7);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution11 = gcdSolutionWrapper2.getSolution();
        java.lang.String str12 = gcdSolutionWrapper2.toString();
        int int13 = gcdSolutionWrapper2.getGcd();
        java.lang.Object obj14 = null;
        boolean boolean15 = gcdSolutionWrapper2.equals(obj14);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Solution[x=97, y=1]" + "'", str9, "Solution[x=97, y=1]");
        org.junit.Assert.assertNotNull(solution11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "GcdSolutionWrapper[gcd=32, solution=Solution[x=97, y=1]]" + "'", str12, "GcdSolutionWrapper[gcd=32, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution4 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        int int5 = equation3.c();
        int int6 = equation3.c();
        int int7 = equation3.c();
        org.junit.Assert.assertNotNull(solution4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int5 = solution4.getY();
        java.lang.String str6 = solution4.toString();
        solution4.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((-35), solution4);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper10 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) ' ', solution4);
        gcdSolutionWrapper10.setGcd(52);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution13 = gcdSolutionWrapper10.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution17 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) '4', (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper18 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution17);
        java.lang.String str19 = gcdSolutionWrapper18.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution20 = gcdSolutionWrapper18.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation24 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int25 = equation24.c();
        int int26 = equation24.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution30 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int31 = solution30.getY();
        solution30.setY((int) (byte) 1);
        boolean boolean35 = solution30.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper36 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution30);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution37 = gcdSolutionWrapper36.getSolution();
        java.lang.String str38 = gcdSolutionWrapper36.toString();
        gcdSolutionWrapper36.setGcd((int) (byte) 1);
        boolean boolean41 = equation24.equals((java.lang.Object) gcdSolutionWrapper36);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution42 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation24);
        boolean boolean43 = gcdSolutionWrapper18.equals((java.lang.Object) solution42);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution47 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int48 = solution47.getY();
        solution47.setY((int) (byte) 1);
        boolean boolean52 = solution47.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper53 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution47);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution56 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int57 = solution56.getY();
        java.lang.String str58 = solution56.toString();
        boolean boolean60 = solution56.equals((java.lang.Object) (-1L));
        gcdSolutionWrapper53.setSolution(solution56);
        int int62 = solution56.getX();
        boolean boolean63 = solution42.equals((java.lang.Object) solution56);
        gcdSolutionWrapper10.setSolution(solution42);
        java.lang.Class<?> wildcardClass65 = solution42.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Solution[x=97, y=1]" + "'", str6, "Solution[x=97, y=1]");
        org.junit.Assert.assertNotNull(solution13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]" + "'", str19, "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]");
        org.junit.Assert.assertNotNull(solution20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 35 + "'", int25 == 35);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(solution37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str38, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(solution42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Solution[x=97, y=1]" + "'", str58, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 97 + "'", int62 == 97);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution1 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution1);
        gcdSolutionWrapper2.setGcd((int) ' ');
        gcdSolutionWrapper2.setGcd((int) (short) 100);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int10 = solution9.getY();
        java.lang.String str11 = solution9.toString();
        solution9.setX((int) (short) 1);
        boolean boolean15 = solution9.equals((java.lang.Object) (-1.0f));
        gcdSolutionWrapper2.setSolution(solution9);
        java.lang.Class<?> wildcardClass17 = solution9.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Solution[x=97, y=1]" + "'", str11, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution1 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution1);
        gcdSolutionWrapper2.setGcd((int) ' ');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int8 = solution7.getY();
        java.lang.String str9 = solution7.toString();
        gcdSolutionWrapper2.setSolution(solution7);
        int int11 = gcdSolutionWrapper2.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution14 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int15 = solution14.getY();
        gcdSolutionWrapper2.setSolution(solution14);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution18 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper19 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution18);
        gcdSolutionWrapper19.setGcd((int) ' ');
        gcdSolutionWrapper19.setGcd((int) (short) 100);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution26 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int27 = solution26.getY();
        java.lang.String str28 = solution26.toString();
        solution26.setX((int) (short) 1);
        boolean boolean32 = solution26.equals((java.lang.Object) (-1.0f));
        gcdSolutionWrapper19.setSolution(solution26);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution35 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper36 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution35);
        boolean boolean38 = gcdSolutionWrapper36.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution40 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper41 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution40);
        gcdSolutionWrapper41.setGcd((int) ' ');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution46 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int47 = solution46.getY();
        java.lang.String str48 = solution46.toString();
        gcdSolutionWrapper41.setSolution(solution46);
        gcdSolutionWrapper36.setSolution(solution46);
        int int51 = solution46.getY();
        java.lang.String str52 = solution46.toString();
        gcdSolutionWrapper19.setSolution(solution46);
        gcdSolutionWrapper2.setSolution(solution46);
        gcdSolutionWrapper2.setGcd(1);
        boolean boolean58 = gcdSolutionWrapper2.equals((java.lang.Object) false);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution61 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int62 = solution61.getY();
        java.lang.String str63 = solution61.toString();
        java.lang.String str64 = solution61.toString();
        gcdSolutionWrapper2.setSolution(solution61);
        solution61.setX((int) (byte) 0);
        java.lang.Class<?> wildcardClass68 = solution61.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Solution[x=97, y=1]" + "'", str9, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Solution[x=97, y=1]" + "'", str28, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Solution[x=97, y=1]" + "'", str48, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Solution[x=97, y=1]" + "'", str52, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Solution[x=97, y=1]" + "'", str63, "Solution[x=97, y=1]");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Solution[x=97, y=1]" + "'", str64, "Solution[x=97, y=1]");
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int4 = solution3.getY();
        solution3.setY((int) (byte) 1);
        boolean boolean8 = solution3.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution12 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int13 = solution12.getY();
        java.lang.String str14 = solution12.toString();
        boolean boolean16 = solution12.equals((java.lang.Object) (-1L));
        gcdSolutionWrapper9.setSolution(solution12);
        int int18 = solution12.getX();
        java.lang.String str19 = solution12.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution21 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper22 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution21);
        gcdSolutionWrapper22.setGcd((int) ' ');
        gcdSolutionWrapper22.setGcd((int) (short) 1);
        boolean boolean27 = solution12.equals((java.lang.Object) gcdSolutionWrapper22);
        int int28 = gcdSolutionWrapper22.getGcd();
        gcdSolutionWrapper22.setGcd((int) '#');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation34 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int35 = equation34.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution36 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation34);
        boolean boolean37 = gcdSolutionWrapper22.equals((java.lang.Object) equation34);
        java.lang.Class<?> wildcardClass38 = equation34.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Solution[x=97, y=1]" + "'", str14, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Solution[x=97, y=1]" + "'", str19, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 35 + "'", int35 == 35);
        org.junit.Assert.assertNotNull(solution36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int5 = solution4.getY();
        java.lang.String str6 = solution4.toString();
        solution4.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((-35), solution4);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper10 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) ' ', solution4);
        gcdSolutionWrapper10.setGcd(52);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution16 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(1, 52);
        int int17 = solution16.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper18 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((-1), solution16);
        boolean boolean19 = gcdSolutionWrapper10.equals((java.lang.Object) gcdSolutionWrapper18);
        java.lang.Class<?> wildcardClass20 = gcdSolutionWrapper10.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Solution[x=97, y=1]" + "'", str6, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int3 = solution2.getX();
        solution2.setY((int) (short) -1);
        java.lang.Class<?> wildcardClass6 = solution2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int8 = solution7.getY();
        solution7.setY((int) (byte) 1);
        boolean boolean12 = solution7.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution7);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution14 = gcdSolutionWrapper13.getSolution();
        java.lang.String str15 = gcdSolutionWrapper13.toString();
        gcdSolutionWrapper13.setGcd((int) (byte) 1);
        boolean boolean18 = equation3.equals((java.lang.Object) gcdSolutionWrapper13);
        int int19 = gcdSolutionWrapper13.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution20 = gcdSolutionWrapper13.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation24 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        java.lang.String str25 = equation24.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution26 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation24);
        solution26.setY((int) (byte) 10);
        boolean boolean29 = solution20.equals((java.lang.Object) solution26);
        solution20.setX((-35));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(solution14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str15, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(solution20);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str25, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertNotNull(solution26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(0, (int) (short) 10);
        solution2.setY(35);
        java.lang.String str5 = solution2.toString();
        solution2.setX((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Solution[x=0, y=35]" + "'", str5, "Solution[x=0, y=35]");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(100, 97);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int4 = equation3.c();
        int int5 = equation3.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int10 = solution9.getY();
        solution9.setY((int) (byte) 1);
        boolean boolean14 = solution9.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper15 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution9);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution16 = gcdSolutionWrapper15.getSolution();
        java.lang.String str17 = gcdSolutionWrapper15.toString();
        gcdSolutionWrapper15.setGcd((int) (byte) 1);
        boolean boolean20 = equation3.equals((java.lang.Object) gcdSolutionWrapper15);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution21 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        java.lang.String str22 = equation3.toString();
        int int23 = equation3.b();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(solution16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str17, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(solution21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str22, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '#', 52, 32);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int7 = solution6.getY();
        java.lang.String str8 = solution6.toString();
        solution6.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation14 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int15 = equation14.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution16 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation14);
        boolean boolean17 = solution6.equals((java.lang.Object) solution16);
        boolean boolean19 = solution16.equals((java.lang.Object) 0);
        boolean boolean20 = equation3.equals((java.lang.Object) solution16);
        boolean boolean22 = solution16.equals((java.lang.Object) (byte) -1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation27 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution28 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation27);
        solution28.setY(0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper31 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution28);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation35 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution36 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation35);
        solution36.setY((int) (byte) 10);
        boolean boolean39 = solution28.equals((java.lang.Object) (byte) 10);
        boolean boolean40 = solution16.equals((java.lang.Object) (byte) 10);
        int int41 = solution16.getX();
        solution16.setY((int) (byte) 1);
        solution16.setY((-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Solution[x=97, y=1]" + "'", str8, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertNotNull(solution16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(solution28);
        org.junit.Assert.assertNotNull(solution36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(100, (int) (short) 100);
        solution2.setX((int) '#');
        solution2.setY((int) (short) 0);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution1 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution1);
        boolean boolean4 = gcdSolutionWrapper2.equals((java.lang.Object) "Equation[a=0, b=-1, c=35]");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) '4', (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution10 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int11 = solution10.getY();
        java.lang.String str12 = solution10.toString();
        solution10.setX((int) (short) 1);
        boolean boolean16 = solution10.equals((java.lang.Object) (-1.0f));
        java.lang.String str17 = solution10.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation21 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        java.lang.String str22 = equation21.toString();
        int int23 = equation21.c();
        boolean boolean24 = solution10.equals((java.lang.Object) equation21);
        int int25 = equation21.c();
        boolean boolean26 = solution7.equals((java.lang.Object) equation21);
        boolean boolean27 = gcdSolutionWrapper2.equals((java.lang.Object) equation21);
        int int28 = equation21.c();
        int int29 = equation21.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution30 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation21);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Solution[x=97, y=1]" + "'", str12, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Solution[x=1, y=1]" + "'", str17, "Solution[x=1, y=1]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str22, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 35 + "'", int25 == 35);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 35 + "'", int28 == 35);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(solution30);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation4);
        int int6 = solution5.getX();
        int int7 = solution5.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) ' ', solution5);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution9 = gcdSolutionWrapper8.getSolution();
        java.lang.String str10 = gcdSolutionWrapper8.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int14 = solution13.getY();
        java.lang.String str15 = solution13.toString();
        int int16 = solution13.getX();
        int int17 = solution13.getY();
        solution13.setX((int) (short) 0);
        solution13.setY(35);
        gcdSolutionWrapper8.setSolution(solution13);
        int int23 = gcdSolutionWrapper8.getGcd();
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(solution9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GcdSolutionWrapper[gcd=32, solution=Solution[x=0, y=0]]" + "'", str10, "GcdSolutionWrapper[gcd=32, solution=Solution[x=0, y=0]]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Solution[x=97, y=1]" + "'", str15, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((-35), (int) ' ', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution4 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        java.lang.String str6 = equation3.toString();
        org.junit.Assert.assertNotNull(solution4);
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equation[a=-35, b=32, c=0]" + "'", str6, "Equation[a=-35, b=32, c=0]");
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int4 = equation3.c();
        int int5 = equation3.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int10 = solution9.getY();
        solution9.setY((int) (byte) 1);
        boolean boolean14 = solution9.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper15 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution9);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution16 = gcdSolutionWrapper15.getSolution();
        java.lang.String str17 = gcdSolutionWrapper15.toString();
        gcdSolutionWrapper15.setGcd((int) (byte) 1);
        boolean boolean20 = equation3.equals((java.lang.Object) gcdSolutionWrapper15);
        int int21 = gcdSolutionWrapper15.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation25 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int26 = equation25.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution27 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation25);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution28 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation25);
        int int29 = equation25.b();
        int int30 = equation25.c();
        boolean boolean31 = gcdSolutionWrapper15.equals((java.lang.Object) int30);
        gcdSolutionWrapper15.setGcd((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(solution16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str17, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
        org.junit.Assert.assertNotNull(solution27);
        org.junit.Assert.assertNotNull(solution28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int4 = equation3.c();
        int int5 = equation3.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int10 = solution9.getY();
        solution9.setY((int) (byte) 1);
        boolean boolean14 = solution9.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper15 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution9);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution16 = gcdSolutionWrapper15.getSolution();
        java.lang.String str17 = gcdSolutionWrapper15.toString();
        gcdSolutionWrapper15.setGcd((int) (byte) 1);
        boolean boolean20 = equation3.equals((java.lang.Object) gcdSolutionWrapper15);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution21 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        int int22 = equation3.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution23 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        java.lang.Class<?> wildcardClass24 = equation3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(solution16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str17, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(solution21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(solution23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) 'a');
        int int4 = equation3.b();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int3 = solution2.getY();
        solution2.setY((int) (byte) 1);
        int int6 = solution2.getY();
        java.lang.String str7 = solution2.toString();
        int int8 = solution2.getX();
        solution2.setY(1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Solution[x=97, y=1]" + "'", str7, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int8 = solution7.getY();
        solution7.setY((int) (byte) 1);
        boolean boolean12 = solution7.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution7);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution14 = gcdSolutionWrapper13.getSolution();
        java.lang.String str15 = gcdSolutionWrapper13.toString();
        gcdSolutionWrapper13.setGcd((int) (byte) 1);
        boolean boolean18 = equation3.equals((java.lang.Object) gcdSolutionWrapper13);
        java.lang.String str19 = equation3.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution20 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        int int21 = equation3.a();
        int int22 = equation3.c();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(solution14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str15, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str19, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertNotNull(solution20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(32, (int) (short) 10);
        java.lang.String str3 = solution2.toString();
        int int4 = solution2.getX();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Solution[x=32, y=10]" + "'", str3, "Solution[x=32, y=10]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        java.lang.String str4 = equation3.toString();
        int int5 = equation3.c();
        int int6 = equation3.a();
        int int7 = equation3.a();
        int int8 = equation3.a();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str4, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (short) -1, 0);
        solution2.setX(0);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int4 = solution3.getY();
        solution3.setY((int) (byte) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (short) 0, (int) (short) 1);
        boolean boolean10 = solution3.equals((java.lang.Object) solution9);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper11 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution3);
        int int12 = solution3.getY();
        java.lang.Class<?> wildcardClass13 = solution3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        java.lang.String str4 = equation3.toString();
        int int5 = equation3.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution10 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int11 = solution10.getY();
        java.lang.String str12 = solution10.toString();
        solution10.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper15 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((-35), solution10);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper16 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) ' ', solution10);
        gcdSolutionWrapper16.setGcd(52);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution19 = gcdSolutionWrapper16.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution23 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) '4', (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper24 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution23);
        java.lang.String str25 = gcdSolutionWrapper24.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution26 = gcdSolutionWrapper24.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation30 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int31 = equation30.c();
        int int32 = equation30.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution36 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int37 = solution36.getY();
        solution36.setY((int) (byte) 1);
        boolean boolean41 = solution36.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper42 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution36);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution43 = gcdSolutionWrapper42.getSolution();
        java.lang.String str44 = gcdSolutionWrapper42.toString();
        gcdSolutionWrapper42.setGcd((int) (byte) 1);
        boolean boolean47 = equation30.equals((java.lang.Object) gcdSolutionWrapper42);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution48 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation30);
        boolean boolean49 = gcdSolutionWrapper24.equals((java.lang.Object) solution48);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution53 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int54 = solution53.getY();
        solution53.setY((int) (byte) 1);
        boolean boolean58 = solution53.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper59 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution53);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution62 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int63 = solution62.getY();
        java.lang.String str64 = solution62.toString();
        boolean boolean66 = solution62.equals((java.lang.Object) (-1L));
        gcdSolutionWrapper59.setSolution(solution62);
        int int68 = solution62.getX();
        boolean boolean69 = solution48.equals((java.lang.Object) solution62);
        gcdSolutionWrapper16.setSolution(solution48);
        boolean boolean71 = equation3.equals((java.lang.Object) solution48);
        java.lang.String str72 = equation3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str4, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Solution[x=97, y=1]" + "'", str12, "Solution[x=97, y=1]");
        org.junit.Assert.assertNotNull(solution19);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]" + "'", str25, "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]");
        org.junit.Assert.assertNotNull(solution26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 35 + "'", int31 == 35);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(solution43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str44, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(solution48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Solution[x=97, y=1]" + "'", str64, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 97 + "'", int68 == 97);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str72, "Equation[a=0, b=-1, c=35]");
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(100, (int) (byte) -1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int8 = equation7.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution9 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation7);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution11 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper12 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution11);
        boolean boolean14 = gcdSolutionWrapper12.equals((java.lang.Object) 1);
        boolean boolean15 = equation7.equals((java.lang.Object) boolean14);
        int int16 = equation7.a();
        boolean boolean17 = solution3.equals((java.lang.Object) int16);
        solution3.setY(10);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper20 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (short) 1, solution3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution21 = gcdSolutionWrapper20.getSolution();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNotNull(solution9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(solution21);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int4 = solution3.getY();
        java.lang.String str5 = solution3.toString();
        solution3.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((-35), solution3);
        gcdSolutionWrapper8.setGcd((int) (byte) 1);
        gcdSolutionWrapper8.setGcd((int) '4');
        java.lang.String str13 = gcdSolutionWrapper8.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Solution[x=97, y=1]" + "'", str5, "Solution[x=97, y=1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "GcdSolutionWrapper[gcd=52, solution=Solution[x=1, y=1]]" + "'", str13, "GcdSolutionWrapper[gcd=52, solution=Solution[x=1, y=1]]");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int4 = equation3.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution7);
        boolean boolean10 = gcdSolutionWrapper8.equals((java.lang.Object) 1);
        boolean boolean11 = equation3.equals((java.lang.Object) boolean10);
        int int12 = equation3.a();
        int int13 = equation3.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution15 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper16 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution15);
        gcdSolutionWrapper16.setGcd((int) ' ');
        gcdSolutionWrapper16.setGcd((int) (short) 1);
        int int21 = gcdSolutionWrapper16.getGcd();
        int int22 = gcdSolutionWrapper16.getGcd();
        boolean boolean23 = equation3.equals((java.lang.Object) int22);
        int int24 = equation3.c();
        int int25 = equation3.a();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) '4', (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution3);
        java.lang.String str5 = gcdSolutionWrapper4.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = gcdSolutionWrapper4.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation10 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int11 = equation10.c();
        int int12 = equation10.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution16 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int17 = solution16.getY();
        solution16.setY((int) (byte) 1);
        boolean boolean21 = solution16.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper22 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution16);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution23 = gcdSolutionWrapper22.getSolution();
        java.lang.String str24 = gcdSolutionWrapper22.toString();
        gcdSolutionWrapper22.setGcd((int) (byte) 1);
        boolean boolean27 = equation10.equals((java.lang.Object) gcdSolutionWrapper22);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution28 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation10);
        boolean boolean29 = gcdSolutionWrapper4.equals((java.lang.Object) solution28);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution31 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper32 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution31);
        gcdSolutionWrapper32.setGcd((int) ' ');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution37 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int38 = solution37.getY();
        java.lang.String str39 = solution37.toString();
        gcdSolutionWrapper32.setSolution(solution37);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution41 = gcdSolutionWrapper32.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation45 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        java.lang.String str46 = equation45.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution47 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation45);
        java.lang.String str48 = solution47.toString();
        boolean boolean49 = gcdSolutionWrapper32.equals((java.lang.Object) solution47);
        gcdSolutionWrapper4.setSolution(solution47);
        int int51 = solution47.getY();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]" + "'", str5, "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]");
        org.junit.Assert.assertNotNull(solution6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(solution23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str24, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(solution28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Solution[x=97, y=1]" + "'", str39, "Solution[x=97, y=1]");
        org.junit.Assert.assertNotNull(solution41);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str46, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertNotNull(solution47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Solution[x=0, y=-35]" + "'", str48, "Solution[x=0, y=-35]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-35) + "'", int51 == (-35));
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution1 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int6 = solution5.getY();
        solution5.setY((int) (byte) 1);
        gcdSolutionWrapper2.setSolution(solution5);
        gcdSolutionWrapper2.setGcd((int) (byte) 0);
        gcdSolutionWrapper2.setGcd((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(0, (int) (byte) 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int8 = solution7.getY();
        solution7.setY((int) (byte) 1);
        boolean boolean12 = solution7.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution7);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution14 = gcdSolutionWrapper13.getSolution();
        java.lang.String str15 = gcdSolutionWrapper13.toString();
        boolean boolean16 = solution3.equals((java.lang.Object) str15);
        solution3.setX(10);
        solution3.setY(97);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper21 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(solution14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str15, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation4);
        int int6 = solution5.getX();
        int int7 = solution5.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) ' ', solution5);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution9 = gcdSolutionWrapper8.getSolution();
        java.lang.String str10 = gcdSolutionWrapper8.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int14 = solution13.getY();
        java.lang.String str15 = solution13.toString();
        int int16 = solution13.getX();
        int int17 = solution13.getY();
        solution13.setX((int) (short) 0);
        solution13.setY(35);
        gcdSolutionWrapper8.setSolution(solution13);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution23 = gcdSolutionWrapper8.getSolution();
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(solution9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GcdSolutionWrapper[gcd=32, solution=Solution[x=0, y=0]]" + "'", str10, "GcdSolutionWrapper[gcd=32, solution=Solution[x=0, y=0]]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Solution[x=97, y=1]" + "'", str15, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(solution23);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(1, 52);
        int int5 = solution4.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper6 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((-1), solution4);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = gcdSolutionWrapper6.getSolution();
        int int8 = solution7.getX();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) '4', solution7);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) ' ', 52, 100);
        int int14 = equation13.a();
        int int15 = equation13.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution19 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int20 = solution19.getY();
        solution19.setY((int) (byte) 1);
        boolean boolean24 = solution19.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper25 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution19);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution26 = gcdSolutionWrapper25.getSolution();
        java.lang.String str27 = gcdSolutionWrapper25.toString();
        gcdSolutionWrapper25.setGcd((int) (byte) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution32 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((-1), (int) '4');
        gcdSolutionWrapper25.setSolution(solution32);
        boolean boolean34 = equation13.equals((java.lang.Object) gcdSolutionWrapper25);
        boolean boolean35 = solution7.equals((java.lang.Object) boolean34);
        int int36 = solution7.getX();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(solution7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(solution26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str27, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int4 = equation3.c();
        int int5 = equation3.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int10 = solution9.getY();
        solution9.setY((int) (byte) 1);
        boolean boolean14 = solution9.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper15 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution9);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution16 = gcdSolutionWrapper15.getSolution();
        java.lang.String str17 = gcdSolutionWrapper15.toString();
        gcdSolutionWrapper15.setGcd((int) (byte) 1);
        boolean boolean20 = equation3.equals((java.lang.Object) gcdSolutionWrapper15);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution21 = gcdSolutionWrapper15.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution22 = gcdSolutionWrapper15.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution26 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int27 = solution26.getY();
        solution26.setY((int) (byte) 1);
        boolean boolean31 = solution26.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper32 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution26);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution35 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int36 = solution35.getY();
        java.lang.String str37 = solution35.toString();
        boolean boolean39 = solution35.equals((java.lang.Object) (-1L));
        gcdSolutionWrapper32.setSolution(solution35);
        int int41 = solution35.getX();
        java.lang.String str42 = solution35.toString();
        solution35.setX((int) (byte) 0);
        boolean boolean45 = gcdSolutionWrapper15.equals((java.lang.Object) (byte) 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution46 = gcdSolutionWrapper15.getSolution();
        java.lang.String str47 = gcdSolutionWrapper15.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution50 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper51 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution50);
        boolean boolean53 = gcdSolutionWrapper51.equals((java.lang.Object) 1);
        java.lang.String str54 = gcdSolutionWrapper51.toString();
        gcdSolutionWrapper51.setGcd(32);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution59 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) 100, (int) (byte) -1);
        gcdSolutionWrapper51.setSolution(solution59);
        int int61 = solution59.getX();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper62 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution59);
        java.lang.String str63 = solution59.toString();
        solution59.setX((int) (byte) 10);
        int int66 = solution59.getX();
        gcdSolutionWrapper15.setSolution(solution59);
        int int68 = gcdSolutionWrapper15.getGcd();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(solution16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str17, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(solution21);
        org.junit.Assert.assertNotNull(solution22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Solution[x=97, y=1]" + "'", str37, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 97 + "'", int41 == 97);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Solution[x=97, y=1]" + "'", str42, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(solution46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]" + "'", str47, "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=null]" + "'", str54, "GcdSolutionWrapper[gcd=1, solution=null]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 100 + "'", int61 == 100);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Solution[x=100, y=-1]" + "'", str63, "Solution[x=100, y=-1]");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 10 + "'", int66 == 10);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution1 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int6 = solution5.getY();
        solution5.setY((int) (byte) 1);
        gcdSolutionWrapper2.setSolution(solution5);
        gcdSolutionWrapper2.setGcd((int) (byte) 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution15 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int16 = solution15.getY();
        solution15.setY((int) (byte) 1);
        boolean boolean20 = solution15.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper21 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution15);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution22 = gcdSolutionWrapper21.getSolution();
        java.lang.String str23 = gcdSolutionWrapper21.toString();
        gcdSolutionWrapper21.setGcd((int) (byte) 1);
        java.lang.String str26 = gcdSolutionWrapper21.toString();
        java.lang.String str27 = gcdSolutionWrapper21.toString();
        int int28 = gcdSolutionWrapper21.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation32 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int33 = equation32.c();
        int int34 = equation32.b();
        int int35 = equation32.c();
        int int36 = equation32.c();
        boolean boolean37 = gcdSolutionWrapper21.equals((java.lang.Object) int36);
        boolean boolean38 = gcdSolutionWrapper2.equals((java.lang.Object) boolean37);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(solution22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str23, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]" + "'", str26, "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]" + "'", str27, "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 35 + "'", int35 == 35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution1 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution1);
        boolean boolean4 = gcdSolutionWrapper2.equals((java.lang.Object) 1);
        java.lang.String str5 = gcdSolutionWrapper2.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = gcdSolutionWrapper2.getSolution();
        gcdSolutionWrapper2.setGcd((int) 'a');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution11 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper12 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution11);
        boolean boolean14 = gcdSolutionWrapper12.equals((java.lang.Object) 1);
        java.lang.String str15 = gcdSolutionWrapper12.toString();
        gcdSolutionWrapper12.setGcd(32);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution20 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) 100, (int) (byte) -1);
        gcdSolutionWrapper12.setSolution(solution20);
        int int22 = solution20.getX();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper23 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution20);
        java.lang.String str24 = solution20.toString();
        boolean boolean25 = gcdSolutionWrapper2.equals((java.lang.Object) solution20);
        solution20.setY((int) (byte) 10);
        java.lang.String str28 = solution20.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=null]" + "'", str5, "GcdSolutionWrapper[gcd=1, solution=null]");
        org.junit.Assert.assertNull(solution6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=null]" + "'", str15, "GcdSolutionWrapper[gcd=1, solution=null]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Solution[x=100, y=-1]" + "'", str24, "Solution[x=100, y=-1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Solution[x=100, y=10]" + "'", str28, "Solution[x=100, y=10]");
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution4 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        solution4.setX((int) (byte) 100);
        org.junit.Assert.assertNotNull(solution4);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) '4', (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution3);
        java.lang.String str5 = gcdSolutionWrapper4.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = gcdSolutionWrapper4.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = gcdSolutionWrapper4.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation11 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) ' ', (int) ' ', 35);
        boolean boolean12 = gcdSolutionWrapper4.equals((java.lang.Object) ' ');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution13 = gcdSolutionWrapper4.getSolution();
        solution13.setX((-35));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]" + "'", str5, "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]");
        org.junit.Assert.assertNotNull(solution6);
        org.junit.Assert.assertNotNull(solution7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(solution13);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) ' ', 52, 100);
        int int4 = equation3.a();
        int int5 = equation3.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        java.lang.String str7 = solution6.toString();
        int int8 = solution6.getY();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(solution6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Solution[x=125, y=-75]" + "'", str7, "Solution[x=125, y=-75]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-75) + "'", int8 == (-75));
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(10, (int) (byte) 100);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        int int4 = equation3.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        java.lang.String str6 = equation3.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation10 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, 0, (int) (short) -1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution14 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int15 = solution14.getY();
        solution14.setY((int) (byte) 1);
        boolean boolean19 = solution14.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper20 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution14);
        boolean boolean21 = equation10.equals((java.lang.Object) gcdSolutionWrapper20);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation25 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int26 = equation25.c();
        int int27 = equation25.b();
        java.lang.Class<?> wildcardClass28 = equation25.getClass();
        boolean boolean29 = equation10.equals((java.lang.Object) wildcardClass28);
        int int30 = equation10.a();
        java.lang.String str31 = equation10.toString();
        boolean boolean32 = equation3.equals((java.lang.Object) str31);
        int int33 = equation3.a();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equation[a=97, b=0, c=52]" + "'", str6, "Equation[a=97, b=0, c=52]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Equation[a=0, b=0, c=-1]" + "'", str31, "Equation[a=0, b=0, c=-1]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (short) 100, (int) (short) 0, 1);
        int int4 = equation3.b();
        int int5 = equation3.c();
        int int6 = equation3.a();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (short) -1, 32, (int) 'a');
        java.lang.String str4 = equation3.toString();
        int int5 = equation3.a();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equation[a=-1, b=32, c=97]" + "'", str4, "Equation[a=-1, b=32, c=97]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(10, 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 10, solution3);
        java.lang.Class<?> wildcardClass5 = solution3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(100, (int) ' ');
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(1, (int) (byte) 1, (int) 'a');
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(0, 32, 52);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(100, (int) (byte) -1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation6 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution10 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int11 = solution10.getY();
        solution10.setY((int) (byte) 1);
        boolean boolean15 = solution10.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper16 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution10);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution17 = gcdSolutionWrapper16.getSolution();
        java.lang.String str18 = gcdSolutionWrapper16.toString();
        gcdSolutionWrapper16.setGcd((int) (byte) 1);
        boolean boolean21 = equation6.equals((java.lang.Object) gcdSolutionWrapper16);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution23 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper24 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution23);
        gcdSolutionWrapper24.setGcd((int) ' ');
        gcdSolutionWrapper24.setGcd((int) (short) 100);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution31 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int32 = solution31.getY();
        java.lang.String str33 = solution31.toString();
        solution31.setX((int) (short) 1);
        boolean boolean37 = solution31.equals((java.lang.Object) (-1.0f));
        gcdSolutionWrapper24.setSolution(solution31);
        gcdSolutionWrapper16.setSolution(solution31);
        int int40 = gcdSolutionWrapper16.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution42 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper43 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution42);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution46 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int47 = solution46.getY();
        solution46.setY((int) (byte) 1);
        gcdSolutionWrapper43.setSolution(solution46);
        gcdSolutionWrapper43.setGcd((int) (byte) 0);
        boolean boolean53 = gcdSolutionWrapper16.equals((java.lang.Object) (byte) 0);
        boolean boolean54 = solution2.equals((java.lang.Object) gcdSolutionWrapper16);
        solution2.setY((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(solution17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str18, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Solution[x=97, y=1]" + "'", str33, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(0, (int) ' ', 0);
        int int4 = equation3.b();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int4 = solution3.getY();
        solution3.setY((int) (byte) 1);
        boolean boolean8 = solution3.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution12 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int13 = solution12.getY();
        java.lang.String str14 = solution12.toString();
        boolean boolean16 = solution12.equals((java.lang.Object) (-1L));
        gcdSolutionWrapper9.setSolution(solution12);
        solution12.setX(1);
        java.lang.String str20 = solution12.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation24 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '#', 52, 32);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution27 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int28 = solution27.getY();
        java.lang.String str29 = solution27.toString();
        solution27.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation35 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int36 = equation35.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution37 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation35);
        boolean boolean38 = solution27.equals((java.lang.Object) solution37);
        boolean boolean40 = solution37.equals((java.lang.Object) 0);
        boolean boolean41 = equation24.equals((java.lang.Object) solution37);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation45 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int46 = equation45.c();
        int int47 = equation45.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution51 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int52 = solution51.getY();
        solution51.setY((int) (byte) 1);
        boolean boolean56 = solution51.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper57 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution51);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution58 = gcdSolutionWrapper57.getSolution();
        java.lang.String str59 = gcdSolutionWrapper57.toString();
        gcdSolutionWrapper57.setGcd((int) (byte) 1);
        boolean boolean62 = equation45.equals((java.lang.Object) gcdSolutionWrapper57);
        boolean boolean63 = equation24.equals((java.lang.Object) equation45);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution64 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation24);
        boolean boolean65 = solution12.equals((java.lang.Object) equation24);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation69 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution73 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int74 = solution73.getY();
        solution73.setY((int) (byte) 1);
        boolean boolean78 = solution73.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper79 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution73);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution80 = gcdSolutionWrapper79.getSolution();
        java.lang.String str81 = gcdSolutionWrapper79.toString();
        gcdSolutionWrapper79.setGcd((int) (byte) 1);
        boolean boolean84 = equation69.equals((java.lang.Object) gcdSolutionWrapper79);
        int int85 = gcdSolutionWrapper79.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution86 = gcdSolutionWrapper79.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation90 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        java.lang.String str91 = equation90.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution92 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation90);
        solution92.setY((int) (byte) 10);
        boolean boolean95 = solution86.equals((java.lang.Object) solution92);
        int int96 = solution92.getY();
        boolean boolean97 = equation24.equals((java.lang.Object) solution92);
        java.lang.Class<?> wildcardClass98 = solution92.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Solution[x=97, y=1]" + "'", str14, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Solution[x=1, y=1]" + "'", str20, "Solution[x=1, y=1]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Solution[x=97, y=1]" + "'", str29, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
        org.junit.Assert.assertNotNull(solution37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 35 + "'", int46 == 35);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(solution58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str59, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(solution64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(solution80);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str81, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 1 + "'", int85 == 1);
        org.junit.Assert.assertNotNull(solution86);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str91, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertNotNull(solution92);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 10 + "'", int96 == 10);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertNotNull(wildcardClass98);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, 0, (int) (short) -1);
        int int4 = equation3.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int14 = solution13.getY();
        solution13.setY((int) (byte) 1);
        boolean boolean18 = solution13.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper19 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution13);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution20 = gcdSolutionWrapper19.getSolution();
        java.lang.String str21 = gcdSolutionWrapper19.toString();
        gcdSolutionWrapper19.setGcd((int) (byte) 1);
        boolean boolean24 = equation9.equals((java.lang.Object) gcdSolutionWrapper19);
        int int25 = gcdSolutionWrapper19.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution26 = gcdSolutionWrapper19.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper27 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(32, solution26);
        boolean boolean28 = equation3.equals((java.lang.Object) gcdSolutionWrapper27);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(solution20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str21, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(solution26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        int int4 = equation3.c();
        boolean boolean6 = equation3.equals((java.lang.Object) false);
        java.lang.String str7 = equation3.toString();
        int int8 = equation3.b();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equation[a=97, b=0, c=52]" + "'", str7, "Equation[a=97, b=0, c=52]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int4 = solution3.getY();
        solution3.setY((int) (byte) 1);
        boolean boolean8 = solution3.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution12 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int13 = solution12.getY();
        java.lang.String str14 = solution12.toString();
        boolean boolean16 = solution12.equals((java.lang.Object) (-1L));
        gcdSolutionWrapper9.setSolution(solution12);
        solution12.setX(1);
        java.lang.String str20 = solution12.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation24 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '#', 52, 32);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution27 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int28 = solution27.getY();
        java.lang.String str29 = solution27.toString();
        solution27.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation35 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int36 = equation35.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution37 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation35);
        boolean boolean38 = solution27.equals((java.lang.Object) solution37);
        boolean boolean40 = solution37.equals((java.lang.Object) 0);
        boolean boolean41 = equation24.equals((java.lang.Object) solution37);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation45 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int46 = equation45.c();
        int int47 = equation45.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution51 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int52 = solution51.getY();
        solution51.setY((int) (byte) 1);
        boolean boolean56 = solution51.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper57 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution51);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution58 = gcdSolutionWrapper57.getSolution();
        java.lang.String str59 = gcdSolutionWrapper57.toString();
        gcdSolutionWrapper57.setGcd((int) (byte) 1);
        boolean boolean62 = equation45.equals((java.lang.Object) gcdSolutionWrapper57);
        boolean boolean63 = equation24.equals((java.lang.Object) equation45);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution64 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation24);
        boolean boolean65 = solution12.equals((java.lang.Object) equation24);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution68 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (short) 0, (int) (byte) 100);
        boolean boolean69 = equation24.equals((java.lang.Object) solution68);
        java.lang.String str70 = equation24.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Solution[x=97, y=1]" + "'", str14, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Solution[x=1, y=1]" + "'", str20, "Solution[x=1, y=1]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Solution[x=97, y=1]" + "'", str29, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
        org.junit.Assert.assertNotNull(solution37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 35 + "'", int46 == 35);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(solution58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str59, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(solution64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Equation[a=35, b=52, c=32]" + "'", str70, "Equation[a=35, b=52, c=32]");
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) ' ', (-35), 35);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int4 = equation3.c();
        int int5 = equation3.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int10 = solution9.getY();
        solution9.setY((int) (byte) 1);
        boolean boolean14 = solution9.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper15 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution9);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution16 = gcdSolutionWrapper15.getSolution();
        java.lang.String str17 = gcdSolutionWrapper15.toString();
        gcdSolutionWrapper15.setGcd((int) (byte) 1);
        boolean boolean20 = equation3.equals((java.lang.Object) gcdSolutionWrapper15);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution21 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        int int22 = equation3.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution23 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution24 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(solution16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str17, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(solution21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(solution23);
        org.junit.Assert.assertNotNull(solution24);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int4 = solution3.getY();
        solution3.setY((int) (byte) 1);
        boolean boolean8 = solution3.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution10 = gcdSolutionWrapper9.getSolution();
        java.lang.String str11 = gcdSolutionWrapper9.toString();
        gcdSolutionWrapper9.setGcd((int) (byte) 1);
        java.lang.String str14 = gcdSolutionWrapper9.toString();
        java.lang.String str15 = gcdSolutionWrapper9.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation19 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        int int20 = equation19.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution21 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation19);
        boolean boolean22 = gcdSolutionWrapper9.equals((java.lang.Object) equation19);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution23 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation19);
        int int24 = equation19.c();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(solution10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str11, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]" + "'", str14, "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]" + "'", str15, "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertNotNull(solution21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(solution23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int4 = equation3.c();
        int int5 = equation3.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int10 = solution9.getY();
        solution9.setY((int) (byte) 1);
        boolean boolean14 = solution9.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper15 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution9);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution16 = gcdSolutionWrapper15.getSolution();
        java.lang.String str17 = gcdSolutionWrapper15.toString();
        gcdSolutionWrapper15.setGcd((int) (byte) 1);
        boolean boolean20 = equation3.equals((java.lang.Object) gcdSolutionWrapper15);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution21 = gcdSolutionWrapper15.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution22 = gcdSolutionWrapper15.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution26 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int27 = solution26.getY();
        solution26.setY((int) (byte) 1);
        boolean boolean31 = solution26.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper32 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution26);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution35 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int36 = solution35.getY();
        java.lang.String str37 = solution35.toString();
        boolean boolean39 = solution35.equals((java.lang.Object) (-1L));
        gcdSolutionWrapper32.setSolution(solution35);
        int int41 = solution35.getX();
        java.lang.String str42 = solution35.toString();
        solution35.setX((int) (byte) 0);
        boolean boolean45 = gcdSolutionWrapper15.equals((java.lang.Object) (byte) 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution46 = gcdSolutionWrapper15.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation51 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution52 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation51);
        int int53 = solution52.getX();
        int int54 = solution52.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper55 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) 'a', solution52);
        gcdSolutionWrapper55.setGcd((int) (short) 0);
        gcdSolutionWrapper55.setGcd((int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution62 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((-1), 100);
        gcdSolutionWrapper55.setSolution(solution62);
        gcdSolutionWrapper15.setSolution(solution62);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution68 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int69 = solution68.getY();
        solution68.setY((int) (byte) 1);
        boolean boolean73 = solution68.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper74 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution68);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution75 = gcdSolutionWrapper74.getSolution();
        java.lang.String str76 = gcdSolutionWrapper74.toString();
        gcdSolutionWrapper74.setGcd((int) (byte) 1);
        java.lang.String str79 = gcdSolutionWrapper74.toString();
        java.lang.String str80 = gcdSolutionWrapper74.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation84 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        int int85 = equation84.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution86 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation84);
        boolean boolean87 = gcdSolutionWrapper74.equals((java.lang.Object) equation84);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution88 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation84);
        gcdSolutionWrapper15.setSolution(solution88);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(solution16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str17, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(solution21);
        org.junit.Assert.assertNotNull(solution22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Solution[x=97, y=1]" + "'", str37, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 97 + "'", int41 == 97);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Solution[x=97, y=1]" + "'", str42, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(solution46);
        org.junit.Assert.assertNotNull(solution52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(solution75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str76, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]" + "'", str79, "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]" + "'", str80, "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 97 + "'", int85 == 97);
        org.junit.Assert.assertNotNull(solution86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(solution88);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int4 = solution3.getY();
        solution3.setY((int) (byte) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 10, solution3);
        int int8 = solution3.getY();
        java.lang.String str9 = solution3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Solution[x=97, y=1]" + "'", str9, "Solution[x=97, y=1]");
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, 0, (int) (short) -1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int8 = solution7.getY();
        solution7.setY((int) (byte) 1);
        boolean boolean12 = solution7.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution7);
        boolean boolean14 = equation3.equals((java.lang.Object) gcdSolutionWrapper13);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation18 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution19 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation18);
        solution19.setY(0);
        gcdSolutionWrapper13.setSolution(solution19);
        int int23 = solution19.getX();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(solution19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) '4', (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution3);
        java.lang.String str5 = gcdSolutionWrapper4.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        java.lang.String str10 = equation9.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution11 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation9);
        boolean boolean12 = gcdSolutionWrapper4.equals((java.lang.Object) solution11);
        java.lang.String str13 = gcdSolutionWrapper4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]" + "'", str5, "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str10, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertNotNull(solution11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]" + "'", str13, "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(32, (int) (short) 10);
        java.lang.String str3 = solution2.toString();
        int int4 = solution2.getY();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Solution[x=32, y=10]" + "'", str3, "Solution[x=32, y=10]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, 0, (int) (short) -1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int8 = solution7.getY();
        solution7.setY((int) (byte) 1);
        boolean boolean12 = solution7.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution7);
        boolean boolean14 = equation3.equals((java.lang.Object) gcdSolutionWrapper13);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation18 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int19 = equation18.c();
        int int20 = equation18.b();
        java.lang.Class<?> wildcardClass21 = equation18.getClass();
        boolean boolean22 = equation3.equals((java.lang.Object) wildcardClass21);
        java.lang.String str23 = equation3.toString();
        int int24 = equation3.b();
        int int25 = equation3.a();
        int int26 = equation3.b();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Equation[a=0, b=0, c=-1]" + "'", str23, "Equation[a=0, b=0, c=-1]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(32, (-35), (int) (short) 1);
        int int4 = equation3.b();
        java.lang.Class<?> wildcardClass5 = equation3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-35) + "'", int4 == (-35));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(32, (int) (short) 10);
        java.lang.String str3 = solution2.toString();
        solution2.setX((int) '#');
        boolean boolean7 = solution2.equals((java.lang.Object) "GcdSolutionWrapper[gcd=32, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Solution[x=32, y=10]" + "'", str3, "Solution[x=32, y=10]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(0, (int) (short) 100);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) 100, (-35));
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (short) -1, 1, (int) (byte) 10);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) '4', (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution3);
        java.lang.String str5 = gcdSolutionWrapper4.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = gcdSolutionWrapper4.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = gcdSolutionWrapper4.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution8 = gcdSolutionWrapper4.getSolution();
        solution8.setY((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]" + "'", str5, "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]");
        org.junit.Assert.assertNotNull(solution6);
        org.junit.Assert.assertNotNull(solution7);
        org.junit.Assert.assertNotNull(solution8);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (short) -1, 52);
        int int3 = solution2.getX();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int4 = solution3.getY();
        solution3.setY((int) (byte) 1);
        boolean boolean8 = solution3.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution10 = gcdSolutionWrapper9.getSolution();
        java.lang.String str11 = gcdSolutionWrapper9.toString();
        gcdSolutionWrapper9.setGcd((int) (byte) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution16 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((-1), (int) '4');
        gcdSolutionWrapper9.setSolution(solution16);
        java.lang.String str18 = solution16.toString();
        java.lang.Class<?> wildcardClass19 = solution16.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(solution10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str11, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Solution[x=-1, y=52]" + "'", str18, "Solution[x=-1, y=52]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation4);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation4);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(1, solution6);
        solution6.setY((int) (byte) 1);
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertNotNull(solution6);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int4 = solution3.getY();
        solution3.setY((int) (byte) 1);
        boolean boolean8 = solution3.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution3);
        gcdSolutionWrapper9.setGcd((-1));
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution15 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int16 = solution15.getY();
        java.lang.String str17 = solution15.toString();
        solution15.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper20 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((-35), solution15);
        int int21 = gcdSolutionWrapper20.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution22 = gcdSolutionWrapper20.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation26 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution27 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation26);
        solution27.setY((int) (byte) 10);
        gcdSolutionWrapper20.setSolution(solution27);
        gcdSolutionWrapper9.setSolution(solution27);
        int int32 = solution27.getY();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Solution[x=97, y=1]" + "'", str17, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-35) + "'", int21 == (-35));
        org.junit.Assert.assertNotNull(solution22);
        org.junit.Assert.assertNotNull(solution27);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (short) -1, 10, 10);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) -1, 0, 0);
        java.lang.String str4 = equation3.toString();
        int int5 = equation3.b();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equation[a=-1, b=0, c=0]" + "'", str4, "Equation[a=-1, b=0, c=0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int4 = equation3.c();
        int int5 = equation3.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int10 = solution9.getY();
        solution9.setY((int) (byte) 1);
        boolean boolean14 = solution9.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper15 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution9);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution16 = gcdSolutionWrapper15.getSolution();
        java.lang.String str17 = gcdSolutionWrapper15.toString();
        gcdSolutionWrapper15.setGcd((int) (byte) 1);
        boolean boolean20 = equation3.equals((java.lang.Object) gcdSolutionWrapper15);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution21 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution23 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper24 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution23);
        gcdSolutionWrapper24.setGcd((int) ' ');
        gcdSolutionWrapper24.setGcd((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution29 = gcdSolutionWrapper24.getSolution();
        int int30 = gcdSolutionWrapper24.getGcd();
        gcdSolutionWrapper24.setGcd(0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation36 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution37 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation36);
        solution37.setY(0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation43 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (short) 10, 10, 52);
        boolean boolean44 = solution37.equals((java.lang.Object) (short) 10);
        gcdSolutionWrapper24.setSolution(solution37);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution49 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int50 = solution49.getY();
        java.lang.String str51 = solution49.toString();
        solution49.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper54 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((-35), solution49);
        java.lang.String str55 = solution49.toString();
        gcdSolutionWrapper24.setSolution(solution49);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation60 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(32, (int) (byte) 100, 1);
        int int61 = equation60.b();
        boolean boolean62 = gcdSolutionWrapper24.equals((java.lang.Object) int61);
        boolean boolean63 = equation3.equals((java.lang.Object) gcdSolutionWrapper24);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution67 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(32, (int) (short) 10);
        int int68 = solution67.getY();
        int int69 = solution67.getY();
        boolean boolean71 = solution67.equals((java.lang.Object) "GcdSolutionWrapper[gcd=100, solution=null]");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper72 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(97, solution67);
        boolean boolean73 = gcdSolutionWrapper24.equals((java.lang.Object) 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(solution16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str17, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(solution21);
        org.junit.Assert.assertNull(solution29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(solution37);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Solution[x=97, y=1]" + "'", str51, "Solution[x=97, y=1]");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Solution[x=1, y=1]" + "'", str55, "Solution[x=1, y=1]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 100 + "'", int61 == 100);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 10 + "'", int68 == 10);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 10 + "'", int69 == 10);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int4 = solution3.getY();
        solution3.setY((int) (byte) 1);
        boolean boolean8 = solution3.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution10 = gcdSolutionWrapper9.getSolution();
        java.lang.String str11 = gcdSolutionWrapper9.toString();
        gcdSolutionWrapper9.setGcd((int) (byte) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution16 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int17 = solution16.getY();
        java.lang.String str18 = solution16.toString();
        int int19 = solution16.getX();
        gcdSolutionWrapper9.setSolution(solution16);
        gcdSolutionWrapper9.setGcd(32);
        gcdSolutionWrapper9.setGcd(32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(solution10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str11, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Solution[x=97, y=1]" + "'", str18, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation5 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((-35), (int) ' ', 0);
        java.lang.String str6 = equation5.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation5);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) 'a', solution7);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (short) 10, solution7);
        java.lang.String str10 = gcdSolutionWrapper9.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equation[a=-35, b=32, c=0]" + "'", str6, "Equation[a=-35, b=32, c=0]");
        org.junit.Assert.assertNotNull(solution7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GcdSolutionWrapper[gcd=10, solution=Solution[x=0, y=0]]" + "'", str10, "GcdSolutionWrapper[gcd=10, solution=Solution[x=0, y=0]]");
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', 52, 100);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (short) 10, 10, 52);
        boolean boolean8 = equation3.equals((java.lang.Object) (short) 10);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution9 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(solution9);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 1, (int) (short) 10, (int) (short) -1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution4 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int10 = solution9.getY();
        solution9.setY((int) (byte) 1);
        boolean boolean14 = solution9.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper15 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution9);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution18 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int19 = solution18.getY();
        java.lang.String str20 = solution18.toString();
        boolean boolean22 = solution18.equals((java.lang.Object) (-1L));
        gcdSolutionWrapper15.setSolution(solution18);
        int int24 = solution18.getX();
        boolean boolean25 = equation3.equals((java.lang.Object) solution18);
        java.lang.String str26 = equation3.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation30 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, 10, 97);
        boolean boolean31 = equation3.equals((java.lang.Object) 10);
        org.junit.Assert.assertNotNull(solution4);
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Solution[x=97, y=1]" + "'", str20, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Equation[a=1, b=10, c=-1]" + "'", str26, "Equation[a=1, b=10, c=-1]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int8 = solution7.getY();
        solution7.setY((int) (byte) 1);
        boolean boolean12 = solution7.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution7);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution14 = gcdSolutionWrapper13.getSolution();
        java.lang.String str15 = gcdSolutionWrapper13.toString();
        gcdSolutionWrapper13.setGcd((int) (byte) 1);
        boolean boolean18 = equation3.equals((java.lang.Object) gcdSolutionWrapper13);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation22 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int23 = equation22.c();
        int int24 = equation22.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution25 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation22);
        boolean boolean26 = gcdSolutionWrapper13.equals((java.lang.Object) solution25);
        boolean boolean28 = gcdSolutionWrapper13.equals((java.lang.Object) (short) 0);
        int int29 = gcdSolutionWrapper13.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution31 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper32 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution31);
        gcdSolutionWrapper32.setGcd((int) ' ');
        gcdSolutionWrapper32.setGcd((int) (short) 100);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution39 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int40 = solution39.getY();
        java.lang.String str41 = solution39.toString();
        solution39.setX((int) (short) 1);
        boolean boolean45 = solution39.equals((java.lang.Object) (-1.0f));
        gcdSolutionWrapper32.setSolution(solution39);
        boolean boolean47 = gcdSolutionWrapper13.equals((java.lang.Object) gcdSolutionWrapper32);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation51 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int52 = equation51.c();
        int int53 = equation51.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution54 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation51);
        gcdSolutionWrapper32.setSolution(solution54);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution56 = gcdSolutionWrapper32.getSolution();
        solution56.setX((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(solution14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str15, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(solution25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Solution[x=97, y=1]" + "'", str41, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 35 + "'", int52 == 35);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(solution54);
        org.junit.Assert.assertNotNull(solution56);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int4 = solution3.getY();
        solution3.setY((int) (byte) 1);
        int int7 = solution3.getY();
        java.lang.String str8 = solution3.toString();
        solution3.setY(97);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper11 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (short) 1, solution3);
        solution3.setX((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Solution[x=97, y=1]" + "'", str8, "Solution[x=97, y=1]");
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(32, (int) (byte) 10);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int7 = solution6.getY();
        solution6.setY((int) (byte) 1);
        boolean boolean11 = solution6.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper12 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution6);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution15 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int16 = solution15.getY();
        java.lang.String str17 = solution15.toString();
        boolean boolean19 = solution15.equals((java.lang.Object) (-1L));
        gcdSolutionWrapper12.setSolution(solution15);
        int int21 = solution15.getX();
        int int22 = solution15.getY();
        solution15.setY((int) (short) 10);
        solution15.setY(35);
        solution15.setX(0);
        boolean boolean29 = solution2.equals((java.lang.Object) solution15);
        solution15.setY((-1));
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation36 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution40 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int41 = solution40.getY();
        solution40.setY((int) (byte) 1);
        boolean boolean45 = solution40.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper46 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution40);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution47 = gcdSolutionWrapper46.getSolution();
        java.lang.String str48 = gcdSolutionWrapper46.toString();
        gcdSolutionWrapper46.setGcd((int) (byte) 1);
        boolean boolean51 = equation36.equals((java.lang.Object) gcdSolutionWrapper46);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation55 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int56 = equation55.c();
        int int57 = equation55.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution58 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation55);
        boolean boolean59 = gcdSolutionWrapper46.equals((java.lang.Object) solution58);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation63 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        java.lang.String str64 = equation63.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution65 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation63);
        solution65.setY((int) (byte) 10);
        gcdSolutionWrapper46.setSolution(solution65);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper69 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (short) -1, solution65);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution72 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper73 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution72);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution76 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int77 = solution76.getY();
        solution76.setY((int) (byte) 1);
        gcdSolutionWrapper73.setSolution(solution76);
        int int81 = gcdSolutionWrapper73.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution84 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int85 = solution84.getY();
        java.lang.String str86 = solution84.toString();
        solution84.setX((int) (short) 1);
        boolean boolean90 = solution84.equals((java.lang.Object) (-1.0f));
        java.lang.String str91 = solution84.toString();
        java.lang.String str92 = solution84.toString();
        gcdSolutionWrapper73.setSolution(solution84);
        java.lang.String str94 = solution84.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper95 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (short) -1, solution84);
        boolean boolean96 = solution65.equals((java.lang.Object) gcdSolutionWrapper95);
        boolean boolean97 = solution15.equals((java.lang.Object) solution65);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Solution[x=97, y=1]" + "'", str17, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(solution47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str48, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 35 + "'", int56 == 35);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(solution58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str64, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertNotNull(solution65);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 1 + "'", int85 == 1);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "Solution[x=97, y=1]" + "'", str86, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "Solution[x=1, y=1]" + "'", str91, "Solution[x=1, y=1]");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "Solution[x=1, y=1]" + "'", str92, "Solution[x=1, y=1]");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "Solution[x=1, y=1]" + "'", str94, "Solution[x=1, y=1]");
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) 'a', (int) (short) 10, 32);
        int int4 = equation3.c();
        java.lang.Class<?> wildcardClass5 = equation3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int3 = solution2.getY();
        java.lang.String str4 = solution2.toString();
        solution2.setX((int) (short) 1);
        boolean boolean8 = solution2.equals((java.lang.Object) (-1.0f));
        java.lang.String str9 = solution2.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        java.lang.String str14 = equation13.toString();
        int int15 = equation13.c();
        boolean boolean16 = solution2.equals((java.lang.Object) equation13);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution17 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation13);
        java.lang.String str18 = solution17.toString();
        solution17.setY((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Solution[x=97, y=1]" + "'", str4, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Solution[x=1, y=1]" + "'", str9, "Solution[x=1, y=1]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str14, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(solution17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Solution[x=0, y=-35]" + "'", str18, "Solution[x=0, y=-35]");
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution1 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int6 = solution5.getY();
        solution5.setY((int) (byte) 1);
        gcdSolutionWrapper2.setSolution(solution5);
        int int10 = gcdSolutionWrapper2.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int14 = solution13.getY();
        java.lang.String str15 = solution13.toString();
        solution13.setX((int) (short) 1);
        boolean boolean19 = solution13.equals((java.lang.Object) (-1.0f));
        java.lang.String str20 = solution13.toString();
        java.lang.String str21 = solution13.toString();
        gcdSolutionWrapper2.setSolution(solution13);
        solution13.setX((int) '4');
        java.lang.String str25 = solution13.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution29 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) '4', (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper30 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution29);
        java.lang.String str31 = gcdSolutionWrapper30.toString();
        gcdSolutionWrapper30.setGcd(32);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation37 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution38 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation37);
        solution38.setY((int) (byte) 10);
        int int41 = solution38.getY();
        gcdSolutionWrapper30.setSolution(solution38);
        int int43 = gcdSolutionWrapper30.getGcd();
        int int44 = gcdSolutionWrapper30.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution45 = gcdSolutionWrapper30.getSolution();
        boolean boolean46 = solution13.equals((java.lang.Object) gcdSolutionWrapper30);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Solution[x=97, y=1]" + "'", str15, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Solution[x=1, y=1]" + "'", str20, "Solution[x=1, y=1]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Solution[x=1, y=1]" + "'", str21, "Solution[x=1, y=1]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Solution[x=52, y=1]" + "'", str25, "Solution[x=52, y=1]");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]" + "'", str31, "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]");
        org.junit.Assert.assertNotNull(solution38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 32 + "'", int43 == 32);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 32 + "'", int44 == 32);
        org.junit.Assert.assertNotNull(solution45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int8 = solution7.getY();
        solution7.setY((int) (byte) 1);
        boolean boolean12 = solution7.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution7);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution14 = gcdSolutionWrapper13.getSolution();
        java.lang.String str15 = gcdSolutionWrapper13.toString();
        gcdSolutionWrapper13.setGcd((int) (byte) 1);
        boolean boolean18 = equation3.equals((java.lang.Object) gcdSolutionWrapper13);
        int int19 = gcdSolutionWrapper13.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution22 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((-1), (int) '4');
        gcdSolutionWrapper13.setSolution(solution22);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution24 = gcdSolutionWrapper13.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution28 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int29 = solution28.getY();
        java.lang.String str30 = solution28.toString();
        solution28.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper33 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((-35), solution28);
        int int34 = gcdSolutionWrapper33.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution35 = gcdSolutionWrapper33.getSolution();
        java.lang.String str36 = gcdSolutionWrapper33.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution39 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(1, 52);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation44 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution45 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation44);
        int int46 = solution45.getX();
        int int47 = solution45.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper48 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) 'a', solution45);
        boolean boolean49 = solution39.equals((java.lang.Object) 'a');
        gcdSolutionWrapper33.setSolution(solution39);
        solution39.setX((int) (byte) 100);
        gcdSolutionWrapper13.setSolution(solution39);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(solution14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str15, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(solution24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Solution[x=97, y=1]" + "'", str30, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-35) + "'", int34 == (-35));
        org.junit.Assert.assertNotNull(solution35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "GcdSolutionWrapper[gcd=-35, solution=Solution[x=1, y=1]]" + "'", str36, "GcdSolutionWrapper[gcd=-35, solution=Solution[x=1, y=1]]");
        org.junit.Assert.assertNotNull(solution45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int5 = solution4.getY();
        solution4.setY((int) (byte) 1);
        boolean boolean9 = solution4.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper10 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution4);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int14 = solution13.getY();
        java.lang.String str15 = solution13.toString();
        boolean boolean17 = solution13.equals((java.lang.Object) (-1L));
        gcdSolutionWrapper10.setSolution(solution13);
        int int19 = solution13.getX();
        int int20 = solution13.getY();
        solution13.setY((int) (short) 10);
        solution13.setY(35);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution28 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int29 = solution28.getY();
        solution28.setY((int) (byte) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution34 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (short) 0, (int) (short) 1);
        boolean boolean35 = solution28.equals((java.lang.Object) solution34);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper36 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution28);
        boolean boolean37 = solution13.equals((java.lang.Object) gcdSolutionWrapper36);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper38 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) ' ', solution13);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution42 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int43 = solution42.getY();
        java.lang.String str44 = solution42.toString();
        solution42.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper47 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((-35), solution42);
        int int48 = gcdSolutionWrapper47.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution49 = gcdSolutionWrapper47.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation53 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution54 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation53);
        solution54.setY((int) (byte) 10);
        gcdSolutionWrapper47.setSolution(solution54);
        int int58 = solution54.getY();
        boolean boolean59 = solution13.equals((java.lang.Object) int58);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Solution[x=97, y=1]" + "'", str15, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Solution[x=97, y=1]" + "'", str44, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-35) + "'", int48 == (-35));
        org.junit.Assert.assertNotNull(solution49);
        org.junit.Assert.assertNotNull(solution54);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 10 + "'", int58 == 10);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution4 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        java.lang.String str5 = solution4.toString();
        solution4.setX((int) (short) 100);
        solution4.setX((int) (byte) 0);
        org.junit.Assert.assertNotNull(solution4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Solution[x=0, y=0]" + "'", str5, "Solution[x=0, y=0]");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        java.lang.String str5 = equation4.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation4);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (short) 0, solution6);
        java.lang.String str8 = gcdSolutionWrapper7.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution9 = gcdSolutionWrapper7.getSolution();
        gcdSolutionWrapper7.setGcd((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str5, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertNotNull(solution6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GcdSolutionWrapper[gcd=0, solution=Solution[x=0, y=-35]]" + "'", str8, "GcdSolutionWrapper[gcd=0, solution=Solution[x=0, y=-35]]");
        org.junit.Assert.assertNotNull(solution9);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int3 = solution2.getY();
        java.lang.String str4 = solution2.toString();
        solution2.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation10 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, 0, (int) (short) -1);
        boolean boolean11 = solution2.equals((java.lang.Object) equation10);
        int int12 = equation10.c();
        int int13 = equation10.a();
        int int14 = equation10.a();
        int int15 = equation10.b();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Solution[x=97, y=1]" + "'", str4, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution1 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution1);
        gcdSolutionWrapper2.setGcd((int) ' ');
        gcdSolutionWrapper2.setGcd((int) (short) 100);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int10 = solution9.getY();
        java.lang.String str11 = solution9.toString();
        solution9.setX((int) (short) 1);
        boolean boolean15 = solution9.equals((java.lang.Object) (-1.0f));
        gcdSolutionWrapper2.setSolution(solution9);
        int int17 = gcdSolutionWrapper2.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation21 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution22 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation21);
        solution22.setY((int) (byte) 10);
        solution22.setY((-1));
        int int27 = solution22.getX();
        gcdSolutionWrapper2.setSolution(solution22);
        int int29 = solution22.getY();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Solution[x=97, y=1]" + "'", str11, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(solution22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, 0, (int) (short) -1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int8 = solution7.getY();
        solution7.setY((int) (byte) 1);
        boolean boolean12 = solution7.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution7);
        boolean boolean14 = equation3.equals((java.lang.Object) gcdSolutionWrapper13);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation18 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int19 = equation18.c();
        int int20 = equation18.b();
        java.lang.Class<?> wildcardClass21 = equation18.getClass();
        boolean boolean22 = equation3.equals((java.lang.Object) wildcardClass21);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation27 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution28 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation27);
        int int29 = solution28.getX();
        int int30 = solution28.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper31 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) 'a', solution28);
        gcdSolutionWrapper31.setGcd((int) (short) 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution37 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(1, 52);
        int int38 = solution37.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper39 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((-1), solution37);
        boolean boolean40 = gcdSolutionWrapper31.equals((java.lang.Object) solution37);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution41 = gcdSolutionWrapper31.getSolution();
        boolean boolean42 = equation3.equals((java.lang.Object) gcdSolutionWrapper31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(solution28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 52 + "'", int38 == 52);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(solution41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int4 = equation3.c();
        int int5 = equation3.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int10 = solution9.getY();
        solution9.setY((int) (byte) 1);
        boolean boolean14 = solution9.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper15 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution9);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution16 = gcdSolutionWrapper15.getSolution();
        java.lang.String str17 = gcdSolutionWrapper15.toString();
        gcdSolutionWrapper15.setGcd((int) (byte) 1);
        boolean boolean20 = equation3.equals((java.lang.Object) gcdSolutionWrapper15);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution21 = gcdSolutionWrapper15.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution22 = gcdSolutionWrapper15.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution26 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int27 = solution26.getY();
        solution26.setY((int) (byte) 1);
        boolean boolean31 = solution26.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper32 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution26);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution35 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int36 = solution35.getY();
        java.lang.String str37 = solution35.toString();
        boolean boolean39 = solution35.equals((java.lang.Object) (-1L));
        gcdSolutionWrapper32.setSolution(solution35);
        int int41 = solution35.getX();
        java.lang.String str42 = solution35.toString();
        solution35.setX((int) (byte) 0);
        boolean boolean45 = gcdSolutionWrapper15.equals((java.lang.Object) (byte) 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution46 = gcdSolutionWrapper15.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation51 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution52 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation51);
        int int53 = solution52.getX();
        int int54 = solution52.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper55 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) 'a', solution52);
        gcdSolutionWrapper55.setGcd((int) (short) 0);
        gcdSolutionWrapper55.setGcd((int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution62 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((-1), 100);
        gcdSolutionWrapper55.setSolution(solution62);
        gcdSolutionWrapper15.setSolution(solution62);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution69 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int70 = solution69.getY();
        solution69.setY((int) (byte) 1);
        boolean boolean74 = solution69.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper75 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution69);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper76 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution69);
        int int77 = gcdSolutionWrapper76.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution78 = gcdSolutionWrapper76.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution81 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((-1), 100);
        gcdSolutionWrapper76.setSolution(solution81);
        boolean boolean83 = solution62.equals((java.lang.Object) gcdSolutionWrapper76);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(solution16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str17, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(solution21);
        org.junit.Assert.assertNotNull(solution22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Solution[x=97, y=1]" + "'", str37, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 97 + "'", int41 == 97);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Solution[x=97, y=1]" + "'", str42, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(solution46);
        org.junit.Assert.assertNotNull(solution52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
        org.junit.Assert.assertNotNull(solution78);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(0, (int) (byte) 10, 0);
        int int4 = equation3.b();
        int int5 = equation3.b();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int3 = solution2.getY();
        java.lang.String str4 = solution2.toString();
        solution2.setX((int) (short) 1);
        boolean boolean8 = solution2.equals((java.lang.Object) (-1.0f));
        java.lang.String str9 = solution2.toString();
        java.lang.String str10 = solution2.toString();
        java.lang.String str11 = solution2.toString();
        solution2.setY((int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Solution[x=97, y=1]" + "'", str4, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Solution[x=1, y=1]" + "'", str9, "Solution[x=1, y=1]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Solution[x=1, y=1]" + "'", str10, "Solution[x=1, y=1]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Solution[x=1, y=1]" + "'", str11, "Solution[x=1, y=1]");
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int4 = solution3.getY();
        java.lang.String str5 = solution3.toString();
        java.lang.String str6 = solution3.toString();
        int int7 = solution3.getY();
        solution3.setX((int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper10 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Solution[x=97, y=1]" + "'", str5, "Solution[x=97, y=1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Solution[x=97, y=1]" + "'", str6, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((-35), (int) ' ', 0);
        java.lang.String str4 = equation3.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '#', 52, 32);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution11 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int12 = solution11.getY();
        java.lang.String str13 = solution11.toString();
        solution11.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation19 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int20 = equation19.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution21 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation19);
        boolean boolean22 = solution11.equals((java.lang.Object) solution21);
        boolean boolean24 = solution21.equals((java.lang.Object) 0);
        boolean boolean25 = equation8.equals((java.lang.Object) solution21);
        boolean boolean27 = solution21.equals((java.lang.Object) (byte) -1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation32 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution33 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation32);
        solution33.setY(0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper36 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution33);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation40 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution41 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation40);
        solution41.setY((int) (byte) 10);
        boolean boolean44 = solution33.equals((java.lang.Object) (byte) 10);
        boolean boolean45 = solution21.equals((java.lang.Object) (byte) 10);
        int int46 = solution21.getX();
        solution21.setY((int) (byte) 1);
        boolean boolean49 = equation3.equals((java.lang.Object) (byte) 1);
        java.lang.Class<?> wildcardClass50 = equation3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equation[a=-35, b=32, c=0]" + "'", str4, "Equation[a=-35, b=32, c=0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Solution[x=97, y=1]" + "'", str13, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertNotNull(solution21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(solution33);
        org.junit.Assert.assertNotNull(solution41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) ' ', 52, 100);
        int int5 = equation4.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int10 = equation9.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution11 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation9);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution13 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper14 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution13);
        boolean boolean16 = gcdSolutionWrapper14.equals((java.lang.Object) 1);
        boolean boolean17 = equation9.equals((java.lang.Object) boolean16);
        int int18 = equation9.a();
        int int19 = equation9.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution21 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper22 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution21);
        gcdSolutionWrapper22.setGcd((int) ' ');
        gcdSolutionWrapper22.setGcd((int) (short) 1);
        int int27 = gcdSolutionWrapper22.getGcd();
        int int28 = gcdSolutionWrapper22.getGcd();
        boolean boolean29 = equation9.equals((java.lang.Object) int28);
        boolean boolean30 = equation4.equals((java.lang.Object) equation9);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution31 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation9);
        int int32 = solution31.getY();
        solution31.setX((int) (short) 10);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper35 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 0, solution31);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(solution11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(solution31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-35) + "'", int32 == (-35));
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int8 = solution7.getY();
        solution7.setY((int) (byte) 1);
        boolean boolean12 = solution7.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution7);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution14 = gcdSolutionWrapper13.getSolution();
        java.lang.String str15 = gcdSolutionWrapper13.toString();
        gcdSolutionWrapper13.setGcd((int) (byte) 1);
        boolean boolean18 = equation3.equals((java.lang.Object) gcdSolutionWrapper13);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution20 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper21 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution20);
        gcdSolutionWrapper21.setGcd((int) ' ');
        gcdSolutionWrapper21.setGcd((int) (short) 100);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution28 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int29 = solution28.getY();
        java.lang.String str30 = solution28.toString();
        solution28.setX((int) (short) 1);
        boolean boolean34 = solution28.equals((java.lang.Object) (-1.0f));
        gcdSolutionWrapper21.setSolution(solution28);
        gcdSolutionWrapper13.setSolution(solution28);
        gcdSolutionWrapper13.setGcd(52);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution42 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int43 = solution42.getY();
        solution42.setY((int) (byte) 1);
        boolean boolean47 = solution42.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper48 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution42);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution51 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int52 = solution51.getY();
        java.lang.String str53 = solution51.toString();
        boolean boolean55 = solution51.equals((java.lang.Object) (-1L));
        gcdSolutionWrapper48.setSolution(solution51);
        int int57 = solution51.getX();
        java.lang.String str58 = solution51.toString();
        solution51.setX((int) (byte) 0);
        boolean boolean61 = gcdSolutionWrapper13.equals((java.lang.Object) (byte) 0);
        int int62 = gcdSolutionWrapper13.getGcd();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(solution14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str15, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Solution[x=97, y=1]" + "'", str30, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Solution[x=97, y=1]" + "'", str53, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 97 + "'", int57 == 97);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Solution[x=97, y=1]" + "'", str58, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 52 + "'", int62 == 52);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) '4', (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper5 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution4);
        java.lang.String str6 = gcdSolutionWrapper5.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = gcdSolutionWrapper5.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation11 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int12 = equation11.c();
        int int13 = equation11.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution17 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int18 = solution17.getY();
        solution17.setY((int) (byte) 1);
        boolean boolean22 = solution17.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper23 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution17);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution24 = gcdSolutionWrapper23.getSolution();
        java.lang.String str25 = gcdSolutionWrapper23.toString();
        gcdSolutionWrapper23.setGcd((int) (byte) 1);
        boolean boolean28 = equation11.equals((java.lang.Object) gcdSolutionWrapper23);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution29 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation11);
        boolean boolean30 = gcdSolutionWrapper5.equals((java.lang.Object) solution29);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution34 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int35 = solution34.getY();
        solution34.setY((int) (byte) 1);
        boolean boolean39 = solution34.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper40 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution34);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution43 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int44 = solution43.getY();
        java.lang.String str45 = solution43.toString();
        boolean boolean47 = solution43.equals((java.lang.Object) (-1L));
        gcdSolutionWrapper40.setSolution(solution43);
        int int49 = solution43.getX();
        boolean boolean50 = solution29.equals((java.lang.Object) solution43);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper51 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 100, solution29);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]" + "'", str6, "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]");
        org.junit.Assert.assertNotNull(solution7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(solution24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str25, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(solution29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Solution[x=97, y=1]" + "'", str45, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 97 + "'", int49 == 97);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((-75), (int) (byte) 10, 35);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int4 = solution3.getY();
        solution3.setY((int) (byte) 1);
        boolean boolean8 = solution3.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution12 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int13 = solution12.getY();
        java.lang.String str14 = solution12.toString();
        boolean boolean16 = solution12.equals((java.lang.Object) (-1L));
        gcdSolutionWrapper9.setSolution(solution12);
        int int18 = solution12.getX();
        int int19 = solution12.getY();
        solution12.setY((int) (short) 10);
        solution12.setY(35);
        solution12.setY((int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Solution[x=97, y=1]" + "'", str14, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution4 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        int int5 = equation3.a();
        int int6 = equation3.b();
        org.junit.Assert.assertNotNull(solution4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution1 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution1);
        boolean boolean4 = gcdSolutionWrapper2.equals((java.lang.Object) 1);
        java.lang.String str5 = gcdSolutionWrapper2.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = gcdSolutionWrapper2.getSolution();
        gcdSolutionWrapper2.setGcd((int) 'a');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution11 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper12 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution11);
        boolean boolean14 = gcdSolutionWrapper12.equals((java.lang.Object) 1);
        java.lang.String str15 = gcdSolutionWrapper12.toString();
        gcdSolutionWrapper12.setGcd(32);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution20 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) 100, (int) (byte) -1);
        gcdSolutionWrapper12.setSolution(solution20);
        int int22 = solution20.getX();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper23 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution20);
        java.lang.String str24 = solution20.toString();
        boolean boolean25 = gcdSolutionWrapper2.equals((java.lang.Object) solution20);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution26 = gcdSolutionWrapper2.getSolution();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=null]" + "'", str5, "GcdSolutionWrapper[gcd=1, solution=null]");
        org.junit.Assert.assertNull(solution6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=null]" + "'", str15, "GcdSolutionWrapper[gcd=1, solution=null]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Solution[x=100, y=-1]" + "'", str24, "Solution[x=100, y=-1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(solution26);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int8 = solution7.getY();
        solution7.setY((int) (byte) 1);
        boolean boolean12 = solution7.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution7);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution14 = gcdSolutionWrapper13.getSolution();
        java.lang.String str15 = gcdSolutionWrapper13.toString();
        gcdSolutionWrapper13.setGcd((int) (byte) 1);
        boolean boolean18 = equation3.equals((java.lang.Object) gcdSolutionWrapper13);
        int int19 = equation3.b();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(solution14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str15, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (short) -1, (int) (byte) 10);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(52, solution3);
        java.lang.Class<?> wildcardClass5 = solution3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((-1), (int) (short) 100, 35);
        int int4 = equation3.a();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(0, (int) '#');
        int int4 = solution3.getY();
        int int5 = solution3.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper6 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(100, solution3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int4 = equation3.c();
        int int5 = equation3.b();
        int int6 = equation3.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        int int8 = equation3.a();
        int int9 = equation3.c();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(solution7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (short) 0, (int) (byte) 1);
        java.lang.String str3 = solution2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Solution[x=0, y=1]" + "'", str3, "Solution[x=0, y=1]");
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int4 = equation3.c();
        int int5 = equation3.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation10 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int11 = equation10.c();
        int int12 = equation10.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution16 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int17 = solution16.getY();
        solution16.setY((int) (byte) 1);
        boolean boolean21 = solution16.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper22 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution16);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution23 = gcdSolutionWrapper22.getSolution();
        java.lang.String str24 = gcdSolutionWrapper22.toString();
        gcdSolutionWrapper22.setGcd((int) (byte) 1);
        boolean boolean27 = equation10.equals((java.lang.Object) gcdSolutionWrapper22);
        int int28 = gcdSolutionWrapper22.getGcd();
        boolean boolean29 = equation3.equals((java.lang.Object) int28);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(solution6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(solution23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str24, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int4 = equation3.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(solution5);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int4 = solution3.getY();
        solution3.setY((int) (byte) 1);
        boolean boolean8 = solution3.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution12 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int13 = solution12.getY();
        java.lang.String str14 = solution12.toString();
        boolean boolean16 = solution12.equals((java.lang.Object) (-1L));
        gcdSolutionWrapper9.setSolution(solution12);
        solution12.setX(1);
        java.lang.String str20 = solution12.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation24 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '#', 52, 32);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution27 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int28 = solution27.getY();
        java.lang.String str29 = solution27.toString();
        solution27.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation35 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int36 = equation35.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution37 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation35);
        boolean boolean38 = solution27.equals((java.lang.Object) solution37);
        boolean boolean40 = solution37.equals((java.lang.Object) 0);
        boolean boolean41 = equation24.equals((java.lang.Object) solution37);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation45 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int46 = equation45.c();
        int int47 = equation45.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution51 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int52 = solution51.getY();
        solution51.setY((int) (byte) 1);
        boolean boolean56 = solution51.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper57 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution51);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution58 = gcdSolutionWrapper57.getSolution();
        java.lang.String str59 = gcdSolutionWrapper57.toString();
        gcdSolutionWrapper57.setGcd((int) (byte) 1);
        boolean boolean62 = equation45.equals((java.lang.Object) gcdSolutionWrapper57);
        boolean boolean63 = equation24.equals((java.lang.Object) equation45);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution64 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation24);
        boolean boolean65 = solution12.equals((java.lang.Object) equation24);
        java.lang.String str66 = solution12.toString();
        java.lang.Class<?> wildcardClass67 = solution12.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Solution[x=97, y=1]" + "'", str14, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Solution[x=1, y=1]" + "'", str20, "Solution[x=1, y=1]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Solution[x=97, y=1]" + "'", str29, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
        org.junit.Assert.assertNotNull(solution37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 35 + "'", int46 == 35);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(solution58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str59, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(solution64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Solution[x=1, y=1]" + "'", str66, "Solution[x=1, y=1]");
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) 'a', (int) (short) 10, 32);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(0, (int) (short) 10);
        boolean boolean7 = equation3.equals((java.lang.Object) (short) 10);
        int int8 = equation3.b();
        int int9 = equation3.b();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int3 = solution2.getY();
        java.lang.String str4 = solution2.toString();
        solution2.setX((int) (short) 1);
        java.lang.String str7 = solution2.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation11 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) ' ', 52, 100);
        int int12 = equation11.a();
        int int13 = equation11.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution17 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int18 = solution17.getY();
        solution17.setY((int) (byte) 1);
        boolean boolean22 = solution17.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper23 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution17);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution24 = gcdSolutionWrapper23.getSolution();
        java.lang.String str25 = gcdSolutionWrapper23.toString();
        gcdSolutionWrapper23.setGcd((int) (byte) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution30 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((-1), (int) '4');
        gcdSolutionWrapper23.setSolution(solution30);
        boolean boolean32 = equation11.equals((java.lang.Object) gcdSolutionWrapper23);
        boolean boolean33 = solution2.equals((java.lang.Object) equation11);
        java.lang.Object obj34 = null;
        boolean boolean35 = equation11.equals(obj34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Solution[x=97, y=1]" + "'", str4, "Solution[x=97, y=1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Solution[x=1, y=1]" + "'", str7, "Solution[x=1, y=1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(solution24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str25, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int3 = solution2.getY();
        java.lang.String str4 = solution2.toString();
        solution2.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation10 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int11 = equation10.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution12 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation10);
        boolean boolean13 = solution2.equals((java.lang.Object) solution12);
        int int14 = solution12.getY();
        java.lang.String str15 = solution12.toString();
        solution12.setX((int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Solution[x=97, y=1]" + "'", str4, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertNotNull(solution12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-35) + "'", int14 == (-35));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Solution[x=0, y=-35]" + "'", str15, "Solution[x=0, y=-35]");
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation4);
        solution5.setY(0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution5);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution14 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation13);
        int int15 = solution14.getX();
        int int16 = solution14.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper17 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) 'a', solution14);
        int int18 = solution14.getX();
        gcdSolutionWrapper8.setSolution(solution14);
        java.lang.String str20 = gcdSolutionWrapper8.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation24 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 1, (int) (short) 10, (int) (short) -1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution25 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation24);
        int int26 = equation24.a();
        boolean boolean27 = gcdSolutionWrapper8.equals((java.lang.Object) equation24);
        int int28 = equation24.a();
        java.lang.String str29 = equation24.toString();
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertNotNull(solution14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "GcdSolutionWrapper[gcd=0, solution=Solution[x=0, y=0]]" + "'", str20, "GcdSolutionWrapper[gcd=0, solution=Solution[x=0, y=0]]");
        org.junit.Assert.assertNotNull(solution25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Equation[a=1, b=10, c=-1]" + "'", str29, "Equation[a=1, b=10, c=-1]");
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int4 = equation3.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        int int7 = equation3.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution8 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        java.lang.Class<?> wildcardClass9 = equation3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertNotNull(solution6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(solution8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (short) 1, (int) (byte) 100);
        solution2.setX((int) 'a');
        int int5 = solution2.getY();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int4 = solution3.getY();
        java.lang.String str5 = solution3.toString();
        solution3.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((-35), solution3);
        solution3.setX((int) (byte) -1);
        java.lang.Class<?> wildcardClass11 = solution3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Solution[x=97, y=1]" + "'", str5, "Solution[x=97, y=1]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) 100, (int) ' ');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (short) 10, solution3);
        int int5 = solution3.getY();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) '4', (int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation6 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation6);
        java.lang.String str8 = solution7.toString();
        solution7.setX((int) (short) 10);
        boolean boolean11 = solution2.equals((java.lang.Object) solution7);
        int int12 = solution7.getX();
        org.junit.Assert.assertNotNull(solution7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Solution[x=0, y=0]" + "'", str8, "Solution[x=0, y=0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int6 = solution5.getY();
        solution5.setY((int) (byte) 1);
        boolean boolean10 = solution5.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper11 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution5);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper12 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution5);
        int int13 = gcdSolutionWrapper12.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution14 = gcdSolutionWrapper12.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution17 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((-1), 100);
        gcdSolutionWrapper12.setSolution(solution17);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation23 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((-35), (int) ' ', 0);
        java.lang.String str24 = equation23.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution25 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation23);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper26 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) 'a', solution25);
        gcdSolutionWrapper12.setSolution(solution25);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper28 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution25);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(solution14);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Equation[a=-35, b=32, c=0]" + "'", str24, "Equation[a=-35, b=32, c=0]");
        org.junit.Assert.assertNotNull(solution25);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) -1, (int) (byte) 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution4 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper5 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution4);
        gcdSolutionWrapper5.setGcd((int) ' ');
        gcdSolutionWrapper5.setGcd((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution10 = gcdSolutionWrapper5.getSolution();
        int int11 = gcdSolutionWrapper5.getGcd();
        java.lang.Class<?> wildcardClass12 = gcdSolutionWrapper5.getClass();
        boolean boolean13 = solution2.equals((java.lang.Object) gcdSolutionWrapper5);
        org.junit.Assert.assertNull(solution10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(100, (int) (byte) -1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int8 = equation7.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution9 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation7);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution11 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper12 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution11);
        boolean boolean14 = gcdSolutionWrapper12.equals((java.lang.Object) 1);
        boolean boolean15 = equation7.equals((java.lang.Object) boolean14);
        int int16 = equation7.a();
        boolean boolean17 = solution3.equals((java.lang.Object) int16);
        solution3.setY(10);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper20 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (short) 1, solution3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution22 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper23 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution22);
        gcdSolutionWrapper23.setGcd((int) ' ');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution28 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int29 = solution28.getY();
        java.lang.String str30 = solution28.toString();
        gcdSolutionWrapper23.setSolution(solution28);
        int int32 = gcdSolutionWrapper23.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution35 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int36 = solution35.getY();
        gcdSolutionWrapper23.setSolution(solution35);
        int int38 = solution35.getY();
        gcdSolutionWrapper20.setSolution(solution35);
        gcdSolutionWrapper20.setGcd(35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNotNull(solution9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Solution[x=97, y=1]" + "'", str30, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 32 + "'", int32 == 32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation4);
        solution5.setY(0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution5);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution14 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation13);
        int int15 = solution14.getX();
        int int16 = solution14.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper17 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) 'a', solution14);
        int int18 = solution14.getX();
        gcdSolutionWrapper8.setSolution(solution14);
        int int20 = solution14.getY();
        java.lang.Class<?> wildcardClass21 = solution14.getClass();
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertNotNull(solution14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) 'a', (int) (short) 10, 32);
        java.lang.String str4 = equation3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equation[a=97, b=10, c=32]" + "'", str4, "Equation[a=97, b=10, c=32]");
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) 0, (-35));
        solution3.setX((int) (byte) 10);
        int int6 = solution3.getX();
        solution3.setX(10);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 10, solution3);
        gcdSolutionWrapper9.setGcd((int) '#');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution13 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper14 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution13);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution17 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int18 = solution17.getY();
        solution17.setY((int) (byte) 1);
        gcdSolutionWrapper14.setSolution(solution17);
        int int22 = gcdSolutionWrapper14.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution25 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int26 = solution25.getY();
        java.lang.String str27 = solution25.toString();
        solution25.setX((int) (short) 1);
        boolean boolean31 = solution25.equals((java.lang.Object) (-1.0f));
        java.lang.String str32 = solution25.toString();
        java.lang.String str33 = solution25.toString();
        gcdSolutionWrapper14.setSolution(solution25);
        solution25.setX((int) '4');
        java.lang.String str37 = solution25.toString();
        gcdSolutionWrapper9.setSolution(solution25);
        java.lang.String str39 = gcdSolutionWrapper9.toString();
        java.lang.String str40 = gcdSolutionWrapper9.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Solution[x=97, y=1]" + "'", str27, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Solution[x=1, y=1]" + "'", str32, "Solution[x=1, y=1]");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Solution[x=1, y=1]" + "'", str33, "Solution[x=1, y=1]");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Solution[x=52, y=1]" + "'", str37, "Solution[x=52, y=1]");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "GcdSolutionWrapper[gcd=35, solution=Solution[x=52, y=1]]" + "'", str39, "GcdSolutionWrapper[gcd=35, solution=Solution[x=52, y=1]]");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "GcdSolutionWrapper[gcd=35, solution=Solution[x=52, y=1]]" + "'", str40, "GcdSolutionWrapper[gcd=35, solution=Solution[x=52, y=1]]");
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation4);
        int int6 = solution5.getX();
        int int7 = solution5.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) 'a', solution5);
        gcdSolutionWrapper8.setGcd((int) (short) 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution14 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(1, 52);
        int int15 = solution14.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper16 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((-1), solution14);
        boolean boolean17 = gcdSolutionWrapper8.equals((java.lang.Object) solution14);
        java.lang.String str18 = gcdSolutionWrapper8.toString();
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "GcdSolutionWrapper[gcd=0, solution=Solution[x=0, y=0]]" + "'", str18, "GcdSolutionWrapper[gcd=0, solution=Solution[x=0, y=0]]");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) ' ', 52, 100);
        int int4 = equation3.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int9 = equation8.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution10 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation8);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution12 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution12);
        boolean boolean15 = gcdSolutionWrapper13.equals((java.lang.Object) 1);
        boolean boolean16 = equation8.equals((java.lang.Object) boolean15);
        int int17 = equation8.a();
        int int18 = equation8.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution20 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper21 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution20);
        gcdSolutionWrapper21.setGcd((int) ' ');
        gcdSolutionWrapper21.setGcd((int) (short) 1);
        int int26 = gcdSolutionWrapper21.getGcd();
        int int27 = gcdSolutionWrapper21.getGcd();
        boolean boolean28 = equation8.equals((java.lang.Object) int27);
        boolean boolean29 = equation3.equals((java.lang.Object) equation8);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution30 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation8);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution31 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation8);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation36 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution37 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation36);
        int int38 = solution37.getX();
        int int39 = solution37.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper40 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) 'a', solution37);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation45 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution46 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation45);
        solution46.setY(0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper49 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution46);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation53 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution54 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation53);
        solution54.setY((int) (byte) 10);
        boolean boolean57 = solution46.equals((java.lang.Object) (byte) 10);
        boolean boolean59 = solution46.equals((java.lang.Object) (-1));
        solution46.setY((int) (byte) 0);
        gcdSolutionWrapper40.setSolution(solution46);
        solution46.setY((int) ' ');
        int int65 = solution46.getX();
        boolean boolean66 = solution31.equals((java.lang.Object) solution46);
        int int67 = solution31.getY();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(solution10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(solution30);
        org.junit.Assert.assertNotNull(solution31);
        org.junit.Assert.assertNotNull(solution37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(solution46);
        org.junit.Assert.assertNotNull(solution54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-35) + "'", int67 == (-35));
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int4 = solution3.getY();
        solution3.setY((int) (byte) 1);
        boolean boolean8 = solution3.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution12 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int13 = solution12.getY();
        java.lang.String str14 = solution12.toString();
        boolean boolean16 = solution12.equals((java.lang.Object) (-1L));
        gcdSolutionWrapper9.setSolution(solution12);
        int int18 = solution12.getX();
        java.lang.String str19 = solution12.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution21 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper22 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution21);
        gcdSolutionWrapper22.setGcd((int) ' ');
        gcdSolutionWrapper22.setGcd((int) (short) 1);
        boolean boolean27 = solution12.equals((java.lang.Object) gcdSolutionWrapper22);
        solution12.setX((int) (short) 0);
        int int30 = solution12.getY();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Solution[x=97, y=1]" + "'", str14, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Solution[x=97, y=1]" + "'", str19, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '#', 52, 32);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int7 = solution6.getY();
        java.lang.String str8 = solution6.toString();
        solution6.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation14 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int15 = equation14.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution16 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation14);
        boolean boolean17 = solution6.equals((java.lang.Object) solution16);
        boolean boolean19 = solution16.equals((java.lang.Object) 0);
        boolean boolean20 = equation3.equals((java.lang.Object) solution16);
        boolean boolean22 = solution16.equals((java.lang.Object) (byte) -1);
        int int23 = solution16.getY();
        int int24 = solution16.getX();
        int int25 = solution16.getY();
        solution16.setY(1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Solution[x=97, y=1]" + "'", str8, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertNotNull(solution16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-35) + "'", int23 == (-35));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-35) + "'", int25 == (-35));
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution4 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        int int5 = solution4.getX();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        int int10 = equation9.c();
        int int11 = equation9.c();
        int int12 = equation9.a();
        boolean boolean13 = solution4.equals((java.lang.Object) equation9);
        boolean boolean15 = equation9.equals((java.lang.Object) "GcdSolutionWrapper[gcd=0, solution=Solution[x=0, y=0]]");
        org.junit.Assert.assertNotNull(solution4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution1 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution1);
        gcdSolutionWrapper2.setGcd((int) ' ');
        gcdSolutionWrapper2.setGcd((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = gcdSolutionWrapper2.getSolution();
        int int8 = gcdSolutionWrapper2.getGcd();
        int int9 = gcdSolutionWrapper2.getGcd();
        java.lang.String str10 = gcdSolutionWrapper2.toString();
        java.lang.String str11 = gcdSolutionWrapper2.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution12 = gcdSolutionWrapper2.getSolution();
        org.junit.Assert.assertNull(solution7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=null]" + "'", str10, "GcdSolutionWrapper[gcd=1, solution=null]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=null]" + "'", str11, "GcdSolutionWrapper[gcd=1, solution=null]");
        org.junit.Assert.assertNull(solution12);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, 0, (int) (short) -1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int8 = solution7.getY();
        solution7.setY((int) (byte) 1);
        boolean boolean12 = solution7.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution7);
        boolean boolean14 = equation3.equals((java.lang.Object) gcdSolutionWrapper13);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation18 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int19 = equation18.c();
        int int20 = equation18.b();
        java.lang.Class<?> wildcardClass21 = equation18.getClass();
        boolean boolean22 = equation3.equals((java.lang.Object) wildcardClass21);
        java.lang.String str23 = equation3.toString();
        int int24 = equation3.b();
        int int25 = equation3.a();
        int int26 = equation3.c();
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution27 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Equation[a=0, b=0, c=-1]" + "'", str23, "Equation[a=0, b=0, c=-1]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) 100, (int) ' ');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (short) 10, solution3);
        gcdSolutionWrapper4.setGcd(97);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution10 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) 100, (int) ' ');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper11 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (short) 10, solution10);
        gcdSolutionWrapper11.setGcd(97);
        boolean boolean14 = gcdSolutionWrapper4.equals((java.lang.Object) gcdSolutionWrapper11);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation18 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution19 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation18);
        solution19.setY((int) (byte) 10);
        int int22 = solution19.getY();
        boolean boolean23 = gcdSolutionWrapper4.equals((java.lang.Object) solution19);
        gcdSolutionWrapper4.setGcd((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(solution19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution1 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution1);
        boolean boolean4 = gcdSolutionWrapper2.equals((java.lang.Object) 1);
        java.lang.String str5 = gcdSolutionWrapper2.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = gcdSolutionWrapper2.getSolution();
        gcdSolutionWrapper2.setGcd((int) 'a');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution11 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper12 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution11);
        boolean boolean14 = gcdSolutionWrapper12.equals((java.lang.Object) 1);
        java.lang.String str15 = gcdSolutionWrapper12.toString();
        gcdSolutionWrapper12.setGcd(32);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution20 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) 100, (int) (byte) -1);
        gcdSolutionWrapper12.setSolution(solution20);
        int int22 = solution20.getX();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper23 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution20);
        java.lang.String str24 = solution20.toString();
        boolean boolean25 = gcdSolutionWrapper2.equals((java.lang.Object) solution20);
        int int26 = gcdSolutionWrapper2.getGcd();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=null]" + "'", str5, "GcdSolutionWrapper[gcd=1, solution=null]");
        org.junit.Assert.assertNull(solution6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=null]" + "'", str15, "GcdSolutionWrapper[gcd=1, solution=null]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Solution[x=100, y=-1]" + "'", str24, "Solution[x=100, y=-1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, 0, (int) (short) -1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int8 = solution7.getY();
        solution7.setY((int) (byte) 1);
        boolean boolean12 = solution7.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution7);
        boolean boolean14 = equation3.equals((java.lang.Object) gcdSolutionWrapper13);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation18 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int19 = equation18.c();
        int int20 = equation18.b();
        java.lang.Class<?> wildcardClass21 = equation18.getClass();
        boolean boolean22 = equation3.equals((java.lang.Object) wildcardClass21);
        int int23 = equation3.a();
        java.lang.String str24 = equation3.toString();
        java.lang.Class<?> wildcardClass25 = equation3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Equation[a=0, b=0, c=-1]" + "'", str24, "Equation[a=0, b=0, c=-1]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution4 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((-1), 0, (int) (byte) 10);
        boolean boolean9 = solution4.equals((java.lang.Object) (byte) 10);
        int int10 = solution4.getY();
        java.lang.String str11 = solution4.toString();
        int int12 = solution4.getY();
        solution4.setX((int) (short) 100);
        org.junit.Assert.assertNotNull(solution4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Solution[x=0, y=10]" + "'", str11, "Solution[x=0, y=10]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', 97);
        solution2.setY((int) (short) 1);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int8 = solution7.getY();
        solution7.setY((int) (byte) 1);
        boolean boolean12 = solution7.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution7);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution14 = gcdSolutionWrapper13.getSolution();
        java.lang.String str15 = gcdSolutionWrapper13.toString();
        gcdSolutionWrapper13.setGcd((int) (byte) 1);
        boolean boolean18 = equation3.equals((java.lang.Object) gcdSolutionWrapper13);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution19 = gcdSolutionWrapper13.getSolution();
        solution19.setX(0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(solution14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str15, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(solution19);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (short) -1, 32, (int) 'a');
        java.lang.Object obj4 = null;
        boolean boolean5 = equation3.equals(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int4 = equation3.c();
        int int5 = equation3.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int10 = solution9.getY();
        solution9.setY((int) (byte) 1);
        boolean boolean14 = solution9.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper15 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution9);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution16 = gcdSolutionWrapper15.getSolution();
        java.lang.String str17 = gcdSolutionWrapper15.toString();
        gcdSolutionWrapper15.setGcd((int) (byte) 1);
        boolean boolean20 = equation3.equals((java.lang.Object) gcdSolutionWrapper15);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution21 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution23 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper24 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution23);
        gcdSolutionWrapper24.setGcd((int) ' ');
        gcdSolutionWrapper24.setGcd((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution29 = gcdSolutionWrapper24.getSolution();
        int int30 = gcdSolutionWrapper24.getGcd();
        gcdSolutionWrapper24.setGcd(0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation36 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution37 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation36);
        solution37.setY(0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation43 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (short) 10, 10, 52);
        boolean boolean44 = solution37.equals((java.lang.Object) (short) 10);
        gcdSolutionWrapper24.setSolution(solution37);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution49 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int50 = solution49.getY();
        java.lang.String str51 = solution49.toString();
        solution49.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper54 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((-35), solution49);
        java.lang.String str55 = solution49.toString();
        gcdSolutionWrapper24.setSolution(solution49);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation60 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(32, (int) (byte) 100, 1);
        int int61 = equation60.b();
        boolean boolean62 = gcdSolutionWrapper24.equals((java.lang.Object) int61);
        boolean boolean63 = equation3.equals((java.lang.Object) gcdSolutionWrapper24);
        java.lang.String str64 = gcdSolutionWrapper24.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(solution16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str17, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(solution21);
        org.junit.Assert.assertNull(solution29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(solution37);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Solution[x=97, y=1]" + "'", str51, "Solution[x=97, y=1]");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Solution[x=1, y=1]" + "'", str55, "Solution[x=1, y=1]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 100 + "'", int61 == 100);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "GcdSolutionWrapper[gcd=0, solution=Solution[x=1, y=1]]" + "'", str64, "GcdSolutionWrapper[gcd=0, solution=Solution[x=1, y=1]]");
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int3 = solution2.getY();
        java.lang.String str4 = solution2.toString();
        boolean boolean6 = solution2.equals((java.lang.Object) (-1L));
        int int7 = solution2.getY();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Solution[x=97, y=1]" + "'", str4, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int4 = equation3.c();
        int int5 = equation3.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        int int7 = equation3.c();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(solution6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (short) -1, 0);
        int int3 = solution2.getY();
        solution2.setX((int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int4 = equation3.c();
        int int5 = equation3.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int10 = solution9.getY();
        solution9.setY((int) (byte) 1);
        boolean boolean14 = solution9.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper15 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution9);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution16 = gcdSolutionWrapper15.getSolution();
        java.lang.String str17 = gcdSolutionWrapper15.toString();
        gcdSolutionWrapper15.setGcd((int) (byte) 1);
        boolean boolean20 = equation3.equals((java.lang.Object) gcdSolutionWrapper15);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution21 = gcdSolutionWrapper15.getSolution();
        int int22 = solution21.getX();
        solution21.setY((-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(solution16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str17, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(solution21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) -1, (int) (byte) 10, (int) (short) 1);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int4 = solution3.getY();
        java.lang.String str5 = solution3.toString();
        solution3.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((-35), solution3);
        int int9 = gcdSolutionWrapper8.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution10 = gcdSolutionWrapper8.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution11 = gcdSolutionWrapper8.getSolution();
        java.lang.String str12 = solution11.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Solution[x=97, y=1]" + "'", str5, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-35) + "'", int9 == (-35));
        org.junit.Assert.assertNotNull(solution10);
        org.junit.Assert.assertNotNull(solution11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Solution[x=1, y=1]" + "'", str12, "Solution[x=1, y=1]");
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        int int4 = equation3.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        int int6 = equation3.b();
        java.lang.String str7 = equation3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equation[a=97, b=0, c=52]" + "'", str7, "Equation[a=97, b=0, c=52]");
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        java.lang.String str5 = equation4.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation4);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (short) 0, solution6);
        java.lang.String str8 = gcdSolutionWrapper7.toString();
        java.lang.String str9 = gcdSolutionWrapper7.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str5, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertNotNull(solution6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GcdSolutionWrapper[gcd=0, solution=Solution[x=0, y=-35]]" + "'", str8, "GcdSolutionWrapper[gcd=0, solution=Solution[x=0, y=-35]]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "GcdSolutionWrapper[gcd=0, solution=Solution[x=0, y=-35]]" + "'", str9, "GcdSolutionWrapper[gcd=0, solution=Solution[x=0, y=-35]]");
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(100, (int) (byte) -1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int8 = equation7.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution9 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation7);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution11 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper12 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution11);
        boolean boolean14 = gcdSolutionWrapper12.equals((java.lang.Object) 1);
        boolean boolean15 = equation7.equals((java.lang.Object) boolean14);
        int int16 = equation7.a();
        boolean boolean17 = solution3.equals((java.lang.Object) int16);
        solution3.setY(10);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper20 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (short) 1, solution3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution23 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int24 = solution23.getY();
        java.lang.String str25 = solution23.toString();
        boolean boolean27 = solution23.equals((java.lang.Object) (-1L));
        solution23.setY((int) 'a');
        gcdSolutionWrapper20.setSolution(solution23);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNotNull(solution9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Solution[x=97, y=1]" + "'", str25, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) '4', (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution3);
        java.lang.String str5 = gcdSolutionWrapper4.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int10 = equation9.c();
        int int11 = equation9.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution12 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation9);
        int int13 = solution12.getX();
        java.lang.String str14 = solution12.toString();
        gcdSolutionWrapper4.setSolution(solution12);
        solution12.setY((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]" + "'", str5, "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(solution12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Solution[x=0, y=-35]" + "'", str14, "Solution[x=0, y=-35]");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int4 = solution3.getY();
        solution3.setY((int) (byte) 1);
        boolean boolean8 = solution3.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution10 = gcdSolutionWrapper9.getSolution();
        java.lang.String str11 = gcdSolutionWrapper9.toString();
        gcdSolutionWrapper9.setGcd((int) (byte) 1);
        java.lang.String str14 = gcdSolutionWrapper9.toString();
        java.lang.String str15 = gcdSolutionWrapper9.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation19 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        int int20 = equation19.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution21 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation19);
        boolean boolean22 = gcdSolutionWrapper9.equals((java.lang.Object) equation19);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution23 = gcdSolutionWrapper9.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution25 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper26 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution25);
        gcdSolutionWrapper26.setGcd((int) ' ');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution31 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int32 = solution31.getY();
        java.lang.String str33 = solution31.toString();
        gcdSolutionWrapper26.setSolution(solution31);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution35 = gcdSolutionWrapper26.getSolution();
        int int36 = gcdSolutionWrapper26.getGcd();
        boolean boolean37 = solution23.equals((java.lang.Object) gcdSolutionWrapper26);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(solution10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str11, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]" + "'", str14, "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]" + "'", str15, "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertNotNull(solution21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(solution23);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Solution[x=97, y=1]" + "'", str33, "Solution[x=97, y=1]");
        org.junit.Assert.assertNotNull(solution35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 32 + "'", int36 == 32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(35, 35);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int7 = solution6.getY();
        solution6.setY((int) (byte) 1);
        boolean boolean11 = solution6.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper12 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution6);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution15 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int16 = solution15.getY();
        java.lang.String str17 = solution15.toString();
        boolean boolean19 = solution15.equals((java.lang.Object) (-1L));
        gcdSolutionWrapper12.setSolution(solution15);
        solution15.setX(1);
        java.lang.String str23 = solution15.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation27 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '#', 52, 32);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution30 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int31 = solution30.getY();
        java.lang.String str32 = solution30.toString();
        solution30.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation38 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int39 = equation38.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution40 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation38);
        boolean boolean41 = solution30.equals((java.lang.Object) solution40);
        boolean boolean43 = solution40.equals((java.lang.Object) 0);
        boolean boolean44 = equation27.equals((java.lang.Object) solution40);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation48 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int49 = equation48.c();
        int int50 = equation48.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution54 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int55 = solution54.getY();
        solution54.setY((int) (byte) 1);
        boolean boolean59 = solution54.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper60 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution54);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution61 = gcdSolutionWrapper60.getSolution();
        java.lang.String str62 = gcdSolutionWrapper60.toString();
        gcdSolutionWrapper60.setGcd((int) (byte) 1);
        boolean boolean65 = equation48.equals((java.lang.Object) gcdSolutionWrapper60);
        boolean boolean66 = equation27.equals((java.lang.Object) equation48);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution67 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation27);
        boolean boolean68 = solution15.equals((java.lang.Object) equation27);
        boolean boolean69 = solution2.equals((java.lang.Object) equation27);
        int int70 = solution2.getY();
        java.lang.String str71 = solution2.toString();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Solution[x=97, y=1]" + "'", str17, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Solution[x=1, y=1]" + "'", str23, "Solution[x=1, y=1]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Solution[x=97, y=1]" + "'", str32, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
        org.junit.Assert.assertNotNull(solution40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 35 + "'", int49 == 35);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(solution61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str62, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(solution67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 35 + "'", int70 == 35);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Solution[x=35, y=35]" + "'", str71, "Solution[x=35, y=35]");
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        int int4 = equation3.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertNotNull(solution6);
        org.junit.Assert.assertNotNull(solution7);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int8 = solution7.getY();
        solution7.setY((int) (byte) 1);
        boolean boolean12 = solution7.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution7);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution14 = gcdSolutionWrapper13.getSolution();
        java.lang.String str15 = gcdSolutionWrapper13.toString();
        gcdSolutionWrapper13.setGcd((int) (byte) 1);
        boolean boolean18 = equation3.equals((java.lang.Object) gcdSolutionWrapper13);
        gcdSolutionWrapper13.setGcd((int) (short) 0);
        int int21 = gcdSolutionWrapper13.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution26 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int27 = solution26.getY();
        java.lang.String str28 = solution26.toString();
        solution26.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper31 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((-35), solution26);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper32 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) ' ', solution26);
        gcdSolutionWrapper13.setSolution(solution26);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution36 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        boolean boolean37 = gcdSolutionWrapper13.equals((java.lang.Object) (short) 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(solution14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str15, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Solution[x=97, y=1]" + "'", str28, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int4 = solution3.getY();
        java.lang.String str5 = solution3.toString();
        solution3.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((-35), solution3);
        int int9 = gcdSolutionWrapper8.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution10 = gcdSolutionWrapper8.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution11 = gcdSolutionWrapper8.getSolution();
        solution11.setY((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Solution[x=97, y=1]" + "'", str5, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-35) + "'", int9 == (-35));
        org.junit.Assert.assertNotNull(solution10);
        org.junit.Assert.assertNotNull(solution11);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (short) 1, (int) (byte) 100);
        solution2.setX((int) 'a');
        java.lang.Class<?> wildcardClass5 = solution2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        int int4 = equation3.c();
        boolean boolean6 = equation3.equals((java.lang.Object) false);
        int int7 = equation3.a();
        int int8 = equation3.c();
        int int9 = equation3.b();
        int int10 = equation3.a();
        int int11 = equation3.a();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation4);
        solution5.setY(0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution5);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution14 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation13);
        int int15 = solution14.getX();
        int int16 = solution14.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper17 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) 'a', solution14);
        int int18 = solution14.getX();
        gcdSolutionWrapper8.setSolution(solution14);
        java.lang.String str20 = gcdSolutionWrapper8.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation24 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 1, (int) (short) 10, (int) (short) -1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution25 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation24);
        int int26 = equation24.a();
        boolean boolean27 = gcdSolutionWrapper8.equals((java.lang.Object) equation24);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation31 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution35 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int36 = solution35.getY();
        solution35.setY((int) (byte) 1);
        boolean boolean40 = solution35.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper41 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution35);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution42 = gcdSolutionWrapper41.getSolution();
        java.lang.String str43 = gcdSolutionWrapper41.toString();
        gcdSolutionWrapper41.setGcd((int) (byte) 1);
        boolean boolean46 = equation31.equals((java.lang.Object) gcdSolutionWrapper41);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution48 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper49 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution48);
        gcdSolutionWrapper49.setGcd((int) ' ');
        gcdSolutionWrapper49.setGcd((int) (short) 100);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution56 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int57 = solution56.getY();
        java.lang.String str58 = solution56.toString();
        solution56.setX((int) (short) 1);
        boolean boolean62 = solution56.equals((java.lang.Object) (-1.0f));
        gcdSolutionWrapper49.setSolution(solution56);
        gcdSolutionWrapper41.setSolution(solution56);
        int int65 = gcdSolutionWrapper41.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution67 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper68 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution67);
        boolean boolean70 = gcdSolutionWrapper68.equals((java.lang.Object) 1);
        java.lang.String str71 = gcdSolutionWrapper68.toString();
        gcdSolutionWrapper68.setGcd(32);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution76 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) 100, (int) (byte) -1);
        gcdSolutionWrapper68.setSolution(solution76);
        int int78 = solution76.getX();
        gcdSolutionWrapper41.setSolution(solution76);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution80 = gcdSolutionWrapper41.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation84 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        int int85 = equation84.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution86 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation84);
        java.lang.String str87 = solution86.toString();
        java.lang.String str88 = solution86.toString();
        int int89 = solution86.getX();
        boolean boolean90 = solution80.equals((java.lang.Object) int89);
        gcdSolutionWrapper8.setSolution(solution80);
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertNotNull(solution14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "GcdSolutionWrapper[gcd=0, solution=Solution[x=0, y=0]]" + "'", str20, "GcdSolutionWrapper[gcd=0, solution=Solution[x=0, y=0]]");
        org.junit.Assert.assertNotNull(solution25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(solution42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str43, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Solution[x=97, y=1]" + "'", str58, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=null]" + "'", str71, "GcdSolutionWrapper[gcd=1, solution=null]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 100 + "'", int78 == 100);
        org.junit.Assert.assertNotNull(solution80);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 97 + "'", int85 == 97);
        org.junit.Assert.assertNotNull(solution86);
// flaky:         org.junit.Assert.assertEquals("'" + str87 + "' != '" + "Solution[x=52, y=0]" + "'", str87, "Solution[x=52, y=0]");
// flaky:         org.junit.Assert.assertEquals("'" + str88 + "' != '" + "Solution[x=52, y=0]" + "'", str88, "Solution[x=52, y=0]");
// flaky:         org.junit.Assert.assertTrue("'" + int89 + "' != '" + 52 + "'", int89 == 52);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((-35), 97);
        int int3 = solution2.getX();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-35) + "'", int3 == (-35));
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) '4', (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution3);
        java.lang.String str5 = gcdSolutionWrapper4.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = gcdSolutionWrapper4.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = gcdSolutionWrapper4.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution8 = gcdSolutionWrapper4.getSolution();
        java.lang.String str9 = gcdSolutionWrapper4.toString();
        gcdSolutionWrapper4.setGcd((int) '#');
        java.lang.String str12 = gcdSolutionWrapper4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]" + "'", str5, "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]");
        org.junit.Assert.assertNotNull(solution6);
        org.junit.Assert.assertNotNull(solution7);
        org.junit.Assert.assertNotNull(solution8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]" + "'", str9, "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "GcdSolutionWrapper[gcd=35, solution=Solution[x=52, y=52]]" + "'", str12, "GcdSolutionWrapper[gcd=35, solution=Solution[x=52, y=52]]");
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int8 = solution7.getY();
        solution7.setY((int) (byte) 1);
        boolean boolean12 = solution7.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution7);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution14 = gcdSolutionWrapper13.getSolution();
        java.lang.String str15 = gcdSolutionWrapper13.toString();
        gcdSolutionWrapper13.setGcd((int) (byte) 1);
        boolean boolean18 = equation3.equals((java.lang.Object) gcdSolutionWrapper13);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation22 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int23 = equation22.c();
        int int24 = equation22.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution25 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation22);
        boolean boolean26 = gcdSolutionWrapper13.equals((java.lang.Object) solution25);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution29 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int30 = solution29.getY();
        java.lang.String str31 = solution29.toString();
        solution29.setX((int) (short) 1);
        boolean boolean35 = solution29.equals((java.lang.Object) true);
        solution29.setY(32);
        gcdSolutionWrapper13.setSolution(solution29);
        solution29.setX((int) ' ');
        int int41 = solution29.getY();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(solution14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str15, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(solution25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Solution[x=97, y=1]" + "'", str31, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 32 + "'", int41 == 32);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(32, (int) (short) 10);
        int int5 = solution4.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper6 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution4);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(1, solution4);
        solution4.setY((int) 'a');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution11 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper12 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution11);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution15 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int16 = solution15.getY();
        solution15.setY((int) (byte) 1);
        gcdSolutionWrapper12.setSolution(solution15);
        java.lang.String str20 = solution15.toString();
        boolean boolean21 = solution4.equals((java.lang.Object) str20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Solution[x=97, y=1]" + "'", str20, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution1 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution1);
        gcdSolutionWrapper2.setGcd((int) ' ');
        gcdSolutionWrapper2.setGcd((int) (short) 100);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int10 = solution9.getY();
        java.lang.String str11 = solution9.toString();
        solution9.setX((int) (short) 1);
        boolean boolean15 = solution9.equals((java.lang.Object) (-1.0f));
        gcdSolutionWrapper2.setSolution(solution9);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution19 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int20 = solution19.getY();
        java.lang.String str21 = solution19.toString();
        solution19.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation27 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int28 = equation27.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution29 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation27);
        boolean boolean30 = solution19.equals((java.lang.Object) solution29);
        int int31 = solution29.getY();
        gcdSolutionWrapper2.setSolution(solution29);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Solution[x=97, y=1]" + "'", str11, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Solution[x=97, y=1]" + "'", str21, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 35 + "'", int28 == 35);
        org.junit.Assert.assertNotNull(solution29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-35) + "'", int31 == (-35));
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, 0, (int) (short) -1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int8 = solution7.getY();
        solution7.setY((int) (byte) 1);
        boolean boolean12 = solution7.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution7);
        boolean boolean14 = equation3.equals((java.lang.Object) gcdSolutionWrapper13);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation18 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int19 = equation18.c();
        int int20 = equation18.b();
        java.lang.Class<?> wildcardClass21 = equation18.getClass();
        boolean boolean22 = equation3.equals((java.lang.Object) wildcardClass21);
        java.lang.String str23 = equation3.toString();
        int int24 = equation3.b();
        int int25 = equation3.a();
        int int26 = equation3.c();
        java.lang.String str27 = equation3.toString();
        int int28 = equation3.a();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Equation[a=0, b=0, c=-1]" + "'", str23, "Equation[a=0, b=0, c=-1]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Equation[a=0, b=0, c=-1]" + "'", str27, "Equation[a=0, b=0, c=-1]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int4 = solution3.getY();
        java.lang.String str5 = solution3.toString();
        solution3.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((-35), solution3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation12 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int13 = equation12.c();
        int int14 = equation12.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution15 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation12);
        boolean boolean16 = solution3.equals((java.lang.Object) equation12);
        int int17 = equation12.c();
        int int18 = equation12.b();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Solution[x=97, y=1]" + "'", str5, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(solution15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, 0, (int) (short) -1);
        int int4 = equation3.c();
        int int5 = equation3.a();
        java.lang.String str6 = equation3.toString();
        int int7 = equation3.a();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equation[a=0, b=0, c=-1]" + "'", str6, "Equation[a=0, b=0, c=-1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        int int4 = equation3.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int10 = equation9.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution11 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation9);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution13 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper14 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution13);
        boolean boolean16 = gcdSolutionWrapper14.equals((java.lang.Object) 1);
        boolean boolean17 = equation9.equals((java.lang.Object) boolean16);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation21 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution22 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation21);
        solution22.setY((int) (byte) 10);
        boolean boolean25 = equation9.equals((java.lang.Object) solution22);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution26 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation9);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution29 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) 1, (int) (short) 1);
        int int30 = solution29.getY();
        boolean boolean31 = solution26.equals((java.lang.Object) int30);
        int int32 = solution26.getY();
        boolean boolean33 = solution5.equals((java.lang.Object) solution26);
        java.lang.String str34 = solution26.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(solution11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(solution22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(solution26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-35) + "'", int32 == (-35));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Solution[x=0, y=-35]" + "'", str34, "Solution[x=0, y=-35]");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int5 = solution4.getY();
        java.lang.String str6 = solution4.toString();
        solution4.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((-35), solution4);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper10 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) ' ', solution4);
        gcdSolutionWrapper10.setGcd(52);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution16 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) 100, (int) ' ');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper17 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (short) 10, solution16);
        gcdSolutionWrapper10.setSolution(solution16);
        java.lang.Class<?> wildcardClass19 = gcdSolutionWrapper10.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Solution[x=97, y=1]" + "'", str6, "Solution[x=97, y=1]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(100, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution4 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        java.lang.String str5 = solution4.toString();
        int int6 = solution4.getY();
        org.junit.Assert.assertNotNull(solution4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Solution[x=52, y=0]" + "'", str5, "Solution[x=52, y=0]");
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution1 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution1);
        gcdSolutionWrapper2.setGcd((int) ' ');
        gcdSolutionWrapper2.setGcd((int) (short) 100);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int10 = solution9.getY();
        java.lang.String str11 = solution9.toString();
        solution9.setX((int) (short) 1);
        boolean boolean15 = solution9.equals((java.lang.Object) (-1.0f));
        gcdSolutionWrapper2.setSolution(solution9);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution18 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper19 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution18);
        boolean boolean21 = gcdSolutionWrapper19.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution23 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper24 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution23);
        gcdSolutionWrapper24.setGcd((int) ' ');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution29 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int30 = solution29.getY();
        java.lang.String str31 = solution29.toString();
        gcdSolutionWrapper24.setSolution(solution29);
        gcdSolutionWrapper19.setSolution(solution29);
        int int34 = solution29.getY();
        java.lang.String str35 = solution29.toString();
        gcdSolutionWrapper2.setSolution(solution29);
        int int37 = solution29.getX();
        int int38 = solution29.getX();
        java.lang.String str39 = solution29.toString();
        int int40 = solution29.getY();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Solution[x=97, y=1]" + "'", str11, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Solution[x=97, y=1]" + "'", str31, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Solution[x=97, y=1]" + "'", str35, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 97 + "'", int37 == 97);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 97 + "'", int38 == 97);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Solution[x=97, y=1]" + "'", str39, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '#', 52, 32);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int7 = solution6.getY();
        java.lang.String str8 = solution6.toString();
        solution6.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation14 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int15 = equation14.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution16 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation14);
        boolean boolean17 = solution6.equals((java.lang.Object) solution16);
        boolean boolean19 = solution16.equals((java.lang.Object) 0);
        boolean boolean20 = equation3.equals((java.lang.Object) solution16);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation24 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int25 = equation24.c();
        int int26 = equation24.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution30 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int31 = solution30.getY();
        solution30.setY((int) (byte) 1);
        boolean boolean35 = solution30.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper36 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution30);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution37 = gcdSolutionWrapper36.getSolution();
        java.lang.String str38 = gcdSolutionWrapper36.toString();
        gcdSolutionWrapper36.setGcd((int) (byte) 1);
        boolean boolean41 = equation24.equals((java.lang.Object) gcdSolutionWrapper36);
        boolean boolean42 = equation3.equals((java.lang.Object) equation24);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution43 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        int int44 = equation3.c();
        java.lang.String str45 = equation3.toString();
        int int46 = equation3.b();
        int int47 = equation3.a();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Solution[x=97, y=1]" + "'", str8, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertNotNull(solution16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 35 + "'", int25 == 35);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(solution37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str38, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(solution43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 32 + "'", int44 == 32);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Equation[a=35, b=52, c=32]" + "'", str45, "Equation[a=35, b=52, c=32]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 52 + "'", int46 == 52);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 35 + "'", int47 == 35);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        java.lang.String str4 = equation3.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        int int6 = equation3.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation10 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution11 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation10);
        int int12 = equation10.c();
        boolean boolean13 = equation3.equals((java.lang.Object) int12);
        java.lang.String str14 = equation3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str4, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(solution11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str14, "Equation[a=0, b=-1, c=35]");
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) ' ', (int) (short) -1);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution1 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution1);
        gcdSolutionWrapper2.setGcd((int) ' ');
        gcdSolutionWrapper2.setGcd((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = gcdSolutionWrapper2.getSolution();
        int int8 = gcdSolutionWrapper2.getGcd();
        gcdSolutionWrapper2.setGcd(0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation14 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution15 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation14);
        solution15.setY(0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation21 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (short) 10, 10, 52);
        boolean boolean22 = solution15.equals((java.lang.Object) (short) 10);
        gcdSolutionWrapper2.setSolution(solution15);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution27 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int28 = solution27.getY();
        java.lang.String str29 = solution27.toString();
        solution27.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper32 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((-35), solution27);
        java.lang.String str33 = solution27.toString();
        gcdSolutionWrapper2.setSolution(solution27);
        gcdSolutionWrapper2.setGcd(35);
        org.junit.Assert.assertNull(solution7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(solution15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Solution[x=97, y=1]" + "'", str29, "Solution[x=97, y=1]");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Solution[x=1, y=1]" + "'", str33, "Solution[x=1, y=1]");
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', 97);
        int int3 = solution2.getY();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(32, (int) (byte) 10);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int7 = solution6.getY();
        solution6.setY((int) (byte) 1);
        boolean boolean11 = solution6.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper12 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution6);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution15 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int16 = solution15.getY();
        java.lang.String str17 = solution15.toString();
        boolean boolean19 = solution15.equals((java.lang.Object) (-1L));
        gcdSolutionWrapper12.setSolution(solution15);
        int int21 = solution15.getX();
        int int22 = solution15.getY();
        solution15.setY((int) (short) 10);
        solution15.setY(35);
        solution15.setX(0);
        boolean boolean29 = solution2.equals((java.lang.Object) solution15);
        solution15.setY((-1));
        java.lang.Class<?> wildcardClass32 = solution15.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Solution[x=97, y=1]" + "'", str17, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int3 = solution2.getY();
        java.lang.String str4 = solution2.toString();
        solution2.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation10 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, 0, (int) (short) -1);
        boolean boolean11 = solution2.equals((java.lang.Object) equation10);
        int int12 = equation10.c();
        java.lang.String str13 = equation10.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Solution[x=97, y=1]" + "'", str4, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Equation[a=0, b=0, c=-1]" + "'", str13, "Equation[a=0, b=0, c=-1]");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (short) 10, (int) '#', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        java.lang.String str8 = equation7.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution9 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation7);
        boolean boolean10 = equation3.equals((java.lang.Object) solution9);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str8, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertNotNull(solution9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (short) -1, 97);
        solution2.setX((int) (byte) 10);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((-1), (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (short) 0, solution3);
        int int5 = solution3.getY();
        int int6 = solution3.getY();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        int int4 = equation3.a();
        int int5 = equation3.c();
        int int6 = equation3.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        int int8 = equation3.c();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(solution7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int4 = equation3.c();
        int int5 = equation3.b();
        int int6 = equation3.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        java.lang.String str8 = equation3.toString();
        java.lang.String str9 = equation3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(solution7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str8, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str9, "Equation[a=0, b=-1, c=35]");
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution1 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution1);
        gcdSolutionWrapper2.setGcd((int) ' ');
        gcdSolutionWrapper2.setGcd((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = gcdSolutionWrapper2.getSolution();
        int int8 = gcdSolutionWrapper2.getGcd();
        gcdSolutionWrapper2.setGcd(0);
        java.lang.String str11 = gcdSolutionWrapper2.toString();
        org.junit.Assert.assertNull(solution7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "GcdSolutionWrapper[gcd=0, solution=null]" + "'", str11, "GcdSolutionWrapper[gcd=0, solution=null]");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 100, (int) (byte) -1, (-35));
        int int4 = equation3.b();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int4 = solution3.getY();
        java.lang.String str5 = solution3.toString();
        solution3.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((-35), solution3);
        int int9 = gcdSolutionWrapper8.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution10 = gcdSolutionWrapper8.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation14 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution15 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation14);
        solution15.setY((int) (byte) 10);
        gcdSolutionWrapper8.setSolution(solution15);
        gcdSolutionWrapper8.setGcd((int) (short) 100);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution24 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(0, 35);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper25 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution24);
        gcdSolutionWrapper8.setSolution(solution24);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution27 = gcdSolutionWrapper8.getSolution();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Solution[x=97, y=1]" + "'", str5, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-35) + "'", int9 == (-35));
        org.junit.Assert.assertNotNull(solution10);
        org.junit.Assert.assertNotNull(solution15);
        org.junit.Assert.assertNotNull(solution27);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) 100, (int) ' ');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (short) 10, solution3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = gcdSolutionWrapper4.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        boolean boolean10 = gcdSolutionWrapper4.equals((java.lang.Object) 0);
        int int11 = gcdSolutionWrapper4.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation15 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        int int16 = equation15.c();
        boolean boolean18 = equation15.equals((java.lang.Object) false);
        java.lang.String str19 = equation15.toString();
        boolean boolean21 = equation15.equals((java.lang.Object) "");
        boolean boolean22 = gcdSolutionWrapper4.equals((java.lang.Object) "");
        java.lang.String str23 = gcdSolutionWrapper4.toString();
        java.lang.Class<?> wildcardClass24 = gcdSolutionWrapper4.getClass();
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Equation[a=97, b=0, c=52]" + "'", str19, "Equation[a=97, b=0, c=52]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "GcdSolutionWrapper[gcd=10, solution=Solution[x=100, y=32]]" + "'", str23, "GcdSolutionWrapper[gcd=10, solution=Solution[x=100, y=32]]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((-35), (int) (short) 1, (-1));
        int int4 = equation3.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        int int7 = equation3.c();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertNotNull(solution6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution1 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution1);
        gcdSolutionWrapper2.setGcd((int) ' ');
        java.lang.Class<?> wildcardClass5 = gcdSolutionWrapper2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution1 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution1);
        gcdSolutionWrapper2.setGcd((int) ' ');
        int int5 = gcdSolutionWrapper2.getGcd();
        int int6 = gcdSolutionWrapper2.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = gcdSolutionWrapper2.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution11 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) '4', (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper12 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution11);
        java.lang.String str13 = gcdSolutionWrapper12.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution14 = gcdSolutionWrapper12.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation18 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int19 = equation18.c();
        int int20 = equation18.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution24 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int25 = solution24.getY();
        solution24.setY((int) (byte) 1);
        boolean boolean29 = solution24.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper30 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution24);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution31 = gcdSolutionWrapper30.getSolution();
        java.lang.String str32 = gcdSolutionWrapper30.toString();
        gcdSolutionWrapper30.setGcd((int) (byte) 1);
        boolean boolean35 = equation18.equals((java.lang.Object) gcdSolutionWrapper30);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution36 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation18);
        boolean boolean37 = gcdSolutionWrapper12.equals((java.lang.Object) solution36);
        boolean boolean38 = gcdSolutionWrapper2.equals((java.lang.Object) boolean37);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNull(solution7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]" + "'", str13, "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]");
        org.junit.Assert.assertNotNull(solution14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(solution31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str32, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(solution36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (short) 1, (int) (byte) -1, 97);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(1, 52);
        int int4 = solution3.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper5 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((-1), solution3);
        java.lang.String str6 = gcdSolutionWrapper5.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution10 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper11 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution10);
        boolean boolean13 = gcdSolutionWrapper11.equals((java.lang.Object) 1);
        java.lang.String str14 = gcdSolutionWrapper11.toString();
        gcdSolutionWrapper11.setGcd(32);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution19 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) 100, (int) (byte) -1);
        gcdSolutionWrapper11.setSolution(solution19);
        int int21 = solution19.getX();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper22 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution19);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper23 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(100, solution19);
        boolean boolean24 = gcdSolutionWrapper5.equals((java.lang.Object) 100);
        java.lang.String str25 = gcdSolutionWrapper5.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=1, y=52]]" + "'", str6, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=1, y=52]]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=null]" + "'", str14, "GcdSolutionWrapper[gcd=1, solution=null]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=1, y=52]]" + "'", str25, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=1, y=52]]");
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int8 = solution7.getY();
        solution7.setY((int) (byte) 1);
        boolean boolean12 = solution7.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution7);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution14 = gcdSolutionWrapper13.getSolution();
        java.lang.String str15 = gcdSolutionWrapper13.toString();
        gcdSolutionWrapper13.setGcd((int) (byte) 1);
        boolean boolean18 = equation3.equals((java.lang.Object) gcdSolutionWrapper13);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution20 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper21 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution20);
        gcdSolutionWrapper21.setGcd((int) ' ');
        gcdSolutionWrapper21.setGcd((int) (short) 100);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution28 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int29 = solution28.getY();
        java.lang.String str30 = solution28.toString();
        solution28.setX((int) (short) 1);
        boolean boolean34 = solution28.equals((java.lang.Object) (-1.0f));
        gcdSolutionWrapper21.setSolution(solution28);
        gcdSolutionWrapper13.setSolution(solution28);
        int int37 = gcdSolutionWrapper13.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution39 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper40 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution39);
        boolean boolean42 = gcdSolutionWrapper40.equals((java.lang.Object) 1);
        java.lang.String str43 = gcdSolutionWrapper40.toString();
        gcdSolutionWrapper40.setGcd(32);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution48 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) 100, (int) (byte) -1);
        gcdSolutionWrapper40.setSolution(solution48);
        int int50 = solution48.getX();
        gcdSolutionWrapper13.setSolution(solution48);
        gcdSolutionWrapper13.setGcd(0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(solution14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str15, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Solution[x=97, y=1]" + "'", str30, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=null]" + "'", str43, "GcdSolutionWrapper[gcd=1, solution=null]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 100 + "'", int50 == 100);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution4 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 1, (int) (short) 10, (int) (short) -1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution9 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation8);
        int int10 = solution9.getX();
        boolean boolean11 = equation3.equals((java.lang.Object) solution9);
        solution9.setY(100);
        org.junit.Assert.assertNotNull(solution4);
        org.junit.Assert.assertNotNull(solution9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, (-1), 32);
        java.lang.String str4 = equation3.toString();
        int int5 = equation3.c();
        int int6 = equation3.c();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equation[a=97, b=-1, c=32]" + "'", str4, "Equation[a=97, b=-1, c=32]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int4 = solution3.getY();
        java.lang.String str5 = solution3.toString();
        solution3.setX((int) (short) 1);
        solution3.setX((int) (byte) 10);
        java.lang.String str10 = solution3.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper11 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(35, solution3);
        gcdSolutionWrapper11.setGcd((int) (byte) 1);
        gcdSolutionWrapper11.setGcd((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Solution[x=97, y=1]" + "'", str5, "Solution[x=97, y=1]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Solution[x=10, y=1]" + "'", str10, "Solution[x=10, y=1]");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(1, 52);
        int int4 = solution3.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper5 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((-1), solution3);
        solution3.setY(0);
        solution3.setX((-75));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int4 = solution3.getY();
        java.lang.String str5 = solution3.toString();
        solution3.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((-35), solution3);
        int int9 = gcdSolutionWrapper8.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution10 = gcdSolutionWrapper8.getSolution();
        int int11 = gcdSolutionWrapper8.getGcd();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Solution[x=97, y=1]" + "'", str5, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-35) + "'", int9 == (-35));
        org.junit.Assert.assertNotNull(solution10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-35) + "'", int11 == (-35));
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) 100, (int) ' ');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (short) 10, solution3);
        gcdSolutionWrapper4.setGcd(97);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution10 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) 100, (int) ' ');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper11 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (short) 10, solution10);
        gcdSolutionWrapper11.setGcd(97);
        boolean boolean14 = gcdSolutionWrapper4.equals((java.lang.Object) gcdSolutionWrapper11);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation18 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution19 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation18);
        solution19.setY((int) (byte) 10);
        int int22 = solution19.getY();
        boolean boolean23 = gcdSolutionWrapper4.equals((java.lang.Object) solution19);
        gcdSolutionWrapper4.setGcd((int) '#');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(solution19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int4 = equation3.c();
        int int5 = equation3.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int10 = solution9.getY();
        solution9.setY((int) (byte) 1);
        boolean boolean14 = solution9.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper15 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution9);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution16 = gcdSolutionWrapper15.getSolution();
        java.lang.String str17 = gcdSolutionWrapper15.toString();
        gcdSolutionWrapper15.setGcd((int) (byte) 1);
        boolean boolean20 = equation3.equals((java.lang.Object) gcdSolutionWrapper15);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution21 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        java.lang.String str22 = solution21.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(solution16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str17, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(solution21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Solution[x=0, y=-35]" + "'", str22, "Solution[x=0, y=-35]");
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int4 = solution3.getY();
        java.lang.String str5 = solution3.toString();
        solution3.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((-35), solution3);
        int int9 = gcdSolutionWrapper8.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution10 = gcdSolutionWrapper8.getSolution();
        java.lang.String str11 = gcdSolutionWrapper8.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution14 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(1, 52);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation19 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution20 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation19);
        int int21 = solution20.getX();
        int int22 = solution20.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper23 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) 'a', solution20);
        boolean boolean24 = solution14.equals((java.lang.Object) 'a');
        gcdSolutionWrapper8.setSolution(solution14);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation30 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        java.lang.String str31 = equation30.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution32 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation30);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper33 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (short) 0, solution32);
        java.lang.String str34 = gcdSolutionWrapper33.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution35 = gcdSolutionWrapper33.getSolution();
        int int36 = gcdSolutionWrapper33.getGcd();
        boolean boolean37 = solution14.equals((java.lang.Object) int36);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Solution[x=97, y=1]" + "'", str5, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-35) + "'", int9 == (-35));
        org.junit.Assert.assertNotNull(solution10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "GcdSolutionWrapper[gcd=-35, solution=Solution[x=1, y=1]]" + "'", str11, "GcdSolutionWrapper[gcd=-35, solution=Solution[x=1, y=1]]");
        org.junit.Assert.assertNotNull(solution20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str31, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertNotNull(solution32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "GcdSolutionWrapper[gcd=0, solution=Solution[x=0, y=-35]]" + "'", str34, "GcdSolutionWrapper[gcd=0, solution=Solution[x=0, y=-35]]");
        org.junit.Assert.assertNotNull(solution35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(10, 0);
        int int3 = solution2.getX();
        int int4 = solution2.getX();
        solution2.setX((int) ' ');
        solution2.setY((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (short) -1, (int) (byte) 10);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper5 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution4);
        int int6 = gcdSolutionWrapper5.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution8 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution8);
        gcdSolutionWrapper9.setGcd((int) ' ');
        gcdSolutionWrapper9.setGcd((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution14 = gcdSolutionWrapper9.getSolution();
        int int15 = gcdSolutionWrapper9.getGcd();
        gcdSolutionWrapper9.setGcd(0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation21 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution22 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation21);
        solution22.setY(0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation28 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (short) 10, 10, 52);
        boolean boolean29 = solution22.equals((java.lang.Object) (short) 10);
        gcdSolutionWrapper9.setSolution(solution22);
        gcdSolutionWrapper5.setSolution(solution22);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation35 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int36 = equation35.c();
        int int37 = equation35.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution41 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int42 = solution41.getY();
        solution41.setY((int) (byte) 1);
        boolean boolean46 = solution41.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper47 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution41);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution48 = gcdSolutionWrapper47.getSolution();
        java.lang.String str49 = gcdSolutionWrapper47.toString();
        gcdSolutionWrapper47.setGcd((int) (byte) 1);
        boolean boolean52 = equation35.equals((java.lang.Object) gcdSolutionWrapper47);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution53 = gcdSolutionWrapper47.getSolution();
        int int54 = solution53.getX();
        solution53.setY((int) 'a');
        gcdSolutionWrapper5.setSolution(solution53);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper58 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 100, solution53);
        java.lang.Class<?> wildcardClass59 = gcdSolutionWrapper58.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(solution14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(solution22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(solution48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str49, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(solution53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 97 + "'", int54 == 97);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(0, (int) (short) 100, (int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation4);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper6 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution5);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(35, 35);
        gcdSolutionWrapper6.setSolution(solution9);
        org.junit.Assert.assertNotNull(solution5);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(10, 0);
        int int3 = solution2.getX();
        solution2.setY(1);
        solution2.setX((int) (short) 0);
        java.lang.String str8 = solution2.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution14 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation13);
        int int15 = solution14.getX();
        int int16 = solution14.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper17 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) 'a', solution14);
        int int18 = solution14.getX();
        boolean boolean19 = solution2.equals((java.lang.Object) int18);
        int int20 = solution2.getX();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Solution[x=0, y=1]" + "'", str8, "Solution[x=0, y=1]");
        org.junit.Assert.assertNotNull(solution14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(100, (int) (byte) -1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int8 = equation7.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution9 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation7);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution11 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper12 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution11);
        boolean boolean14 = gcdSolutionWrapper12.equals((java.lang.Object) 1);
        boolean boolean15 = equation7.equals((java.lang.Object) boolean14);
        int int16 = equation7.a();
        boolean boolean17 = solution3.equals((java.lang.Object) int16);
        solution3.setY(10);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper20 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (short) 1, solution3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution22 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper23 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution22);
        gcdSolutionWrapper23.setGcd((int) ' ');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution28 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int29 = solution28.getY();
        java.lang.String str30 = solution28.toString();
        gcdSolutionWrapper23.setSolution(solution28);
        int int32 = gcdSolutionWrapper23.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution35 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int36 = solution35.getY();
        gcdSolutionWrapper23.setSolution(solution35);
        int int38 = solution35.getY();
        gcdSolutionWrapper20.setSolution(solution35);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation44 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution48 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int49 = solution48.getY();
        solution48.setY((int) (byte) 1);
        boolean boolean53 = solution48.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper54 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution48);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution55 = gcdSolutionWrapper54.getSolution();
        java.lang.String str56 = gcdSolutionWrapper54.toString();
        gcdSolutionWrapper54.setGcd((int) (byte) 1);
        boolean boolean59 = equation44.equals((java.lang.Object) gcdSolutionWrapper54);
        int int60 = gcdSolutionWrapper54.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution61 = gcdSolutionWrapper54.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper62 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(32, solution61);
        gcdSolutionWrapper20.setSolution(solution61);
        java.lang.String str64 = solution61.toString();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNotNull(solution9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Solution[x=97, y=1]" + "'", str30, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 32 + "'", int32 == 32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(solution55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str56, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertNotNull(solution61);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Solution[x=97, y=1]" + "'", str64, "Solution[x=97, y=1]");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (short) -1, (int) (short) 10, (int) (short) -1);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution1 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution1);
        gcdSolutionWrapper2.setGcd((int) ' ');
        gcdSolutionWrapper2.setGcd((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = gcdSolutionWrapper2.getSolution();
        int int8 = gcdSolutionWrapper2.getGcd();
        gcdSolutionWrapper2.setGcd(0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation14 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution15 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation14);
        solution15.setY(0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation21 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (short) 10, 10, 52);
        boolean boolean22 = solution15.equals((java.lang.Object) (short) 10);
        gcdSolutionWrapper2.setSolution(solution15);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution27 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int28 = solution27.getY();
        java.lang.String str29 = solution27.toString();
        solution27.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper32 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((-35), solution27);
        java.lang.String str33 = solution27.toString();
        gcdSolutionWrapper2.setSolution(solution27);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation38 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(32, (int) (byte) 100, 1);
        int int39 = equation38.b();
        boolean boolean40 = gcdSolutionWrapper2.equals((java.lang.Object) int39);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution43 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int44 = solution43.getY();
        java.lang.String str45 = solution43.toString();
        solution43.setX((int) (short) 1);
        solution43.setX((int) (byte) 10);
        java.lang.String str50 = solution43.toString();
        solution43.setY((int) 'a');
        solution43.setY(35);
        gcdSolutionWrapper2.setSolution(solution43);
        gcdSolutionWrapper2.setGcd((int) (byte) -1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution58 = gcdSolutionWrapper2.getSolution();
        org.junit.Assert.assertNull(solution7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(solution15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Solution[x=97, y=1]" + "'", str29, "Solution[x=97, y=1]");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Solution[x=1, y=1]" + "'", str33, "Solution[x=1, y=1]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Solution[x=97, y=1]" + "'", str45, "Solution[x=97, y=1]");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Solution[x=10, y=1]" + "'", str50, "Solution[x=10, y=1]");
        org.junit.Assert.assertNotNull(solution58);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int4 = equation3.c();
        int int5 = equation3.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int10 = solution9.getY();
        solution9.setY((int) (byte) 1);
        boolean boolean14 = solution9.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper15 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution9);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution16 = gcdSolutionWrapper15.getSolution();
        java.lang.String str17 = gcdSolutionWrapper15.toString();
        gcdSolutionWrapper15.setGcd((int) (byte) 1);
        boolean boolean20 = equation3.equals((java.lang.Object) gcdSolutionWrapper15);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution21 = gcdSolutionWrapper15.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution22 = gcdSolutionWrapper15.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution26 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int27 = solution26.getY();
        solution26.setY((int) (byte) 1);
        boolean boolean31 = solution26.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper32 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution26);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution35 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int36 = solution35.getY();
        java.lang.String str37 = solution35.toString();
        boolean boolean39 = solution35.equals((java.lang.Object) (-1L));
        gcdSolutionWrapper32.setSolution(solution35);
        int int41 = solution35.getX();
        java.lang.String str42 = solution35.toString();
        solution35.setX((int) (byte) 0);
        boolean boolean45 = gcdSolutionWrapper15.equals((java.lang.Object) (byte) 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution46 = gcdSolutionWrapper15.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution47 = gcdSolutionWrapper15.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution52 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int53 = solution52.getY();
        java.lang.String str54 = solution52.toString();
        solution52.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper57 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((-35), solution52);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper58 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) ' ', solution52);
        gcdSolutionWrapper58.setGcd(52);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution64 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) 100, (int) ' ');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper65 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (short) 10, solution64);
        gcdSolutionWrapper58.setSolution(solution64);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution69 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int70 = solution69.getY();
        java.lang.String str71 = solution69.toString();
        java.lang.String str72 = solution69.toString();
        java.lang.String str73 = solution69.toString();
        gcdSolutionWrapper58.setSolution(solution69);
        solution69.setY((int) '#');
        gcdSolutionWrapper15.setSolution(solution69);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(solution16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str17, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(solution21);
        org.junit.Assert.assertNotNull(solution22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Solution[x=97, y=1]" + "'", str37, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 97 + "'", int41 == 97);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Solution[x=97, y=1]" + "'", str42, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(solution46);
        org.junit.Assert.assertNotNull(solution47);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Solution[x=97, y=1]" + "'", str54, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Solution[x=97, y=1]" + "'", str71, "Solution[x=97, y=1]");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "Solution[x=97, y=1]" + "'", str72, "Solution[x=97, y=1]");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Solution[x=97, y=1]" + "'", str73, "Solution[x=97, y=1]");
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int4 = solution3.getY();
        java.lang.String str5 = solution3.toString();
        solution3.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((-35), solution3);
        java.lang.String str9 = solution3.toString();
        int int10 = solution3.getX();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Solution[x=97, y=1]" + "'", str5, "Solution[x=97, y=1]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Solution[x=1, y=1]" + "'", str9, "Solution[x=1, y=1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(1, 52);
        int int3 = solution2.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) -1, 52);
        solution6.setY((-75));
        boolean boolean9 = solution2.equals((java.lang.Object) (-75));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(52, (-1));
        java.lang.String str3 = solution2.toString();
        java.lang.Class<?> wildcardClass4 = solution2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Solution[x=52, y=-1]" + "'", str3, "Solution[x=52, y=-1]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation5 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int10 = solution9.getY();
        solution9.setY((int) (byte) 1);
        boolean boolean14 = solution9.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper15 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution9);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution16 = gcdSolutionWrapper15.getSolution();
        java.lang.String str17 = gcdSolutionWrapper15.toString();
        gcdSolutionWrapper15.setGcd((int) (byte) 1);
        boolean boolean20 = equation5.equals((java.lang.Object) gcdSolutionWrapper15);
        int int21 = gcdSolutionWrapper15.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution22 = gcdSolutionWrapper15.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper23 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(32, solution22);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper24 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) ' ', solution22);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution25 = gcdSolutionWrapper24.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation29 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int30 = equation29.c();
        int int31 = equation29.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution35 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int36 = solution35.getY();
        solution35.setY((int) (byte) 1);
        boolean boolean40 = solution35.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper41 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution35);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution42 = gcdSolutionWrapper41.getSolution();
        java.lang.String str43 = gcdSolutionWrapper41.toString();
        gcdSolutionWrapper41.setGcd((int) (byte) 1);
        boolean boolean46 = equation29.equals((java.lang.Object) gcdSolutionWrapper41);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution47 = gcdSolutionWrapper41.getSolution();
        int int48 = solution47.getX();
        solution47.setY((int) 'a');
        gcdSolutionWrapper24.setSolution(solution47);
        java.lang.String str52 = solution47.toString();
        solution47.setY((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(solution16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str17, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(solution22);
        org.junit.Assert.assertNotNull(solution25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(solution42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str43, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(solution47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 97 + "'", int48 == 97);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Solution[x=97, y=97]" + "'", str52, "Solution[x=97, y=97]");
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int4 = solution3.getY();
        solution3.setY((int) (byte) 1);
        boolean boolean8 = solution3.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution12 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int13 = solution12.getY();
        java.lang.String str14 = solution12.toString();
        boolean boolean16 = solution12.equals((java.lang.Object) (-1L));
        gcdSolutionWrapper9.setSolution(solution12);
        solution12.setX(1);
        java.lang.String str20 = solution12.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation24 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '#', 52, 32);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution27 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int28 = solution27.getY();
        java.lang.String str29 = solution27.toString();
        solution27.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation35 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int36 = equation35.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution37 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation35);
        boolean boolean38 = solution27.equals((java.lang.Object) solution37);
        boolean boolean40 = solution37.equals((java.lang.Object) 0);
        boolean boolean41 = equation24.equals((java.lang.Object) solution37);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation45 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int46 = equation45.c();
        int int47 = equation45.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution51 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int52 = solution51.getY();
        solution51.setY((int) (byte) 1);
        boolean boolean56 = solution51.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper57 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution51);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution58 = gcdSolutionWrapper57.getSolution();
        java.lang.String str59 = gcdSolutionWrapper57.toString();
        gcdSolutionWrapper57.setGcd((int) (byte) 1);
        boolean boolean62 = equation45.equals((java.lang.Object) gcdSolutionWrapper57);
        boolean boolean63 = equation24.equals((java.lang.Object) equation45);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution64 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation24);
        boolean boolean65 = solution12.equals((java.lang.Object) equation24);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation69 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution73 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int74 = solution73.getY();
        solution73.setY((int) (byte) 1);
        boolean boolean78 = solution73.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper79 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution73);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution80 = gcdSolutionWrapper79.getSolution();
        java.lang.String str81 = gcdSolutionWrapper79.toString();
        gcdSolutionWrapper79.setGcd((int) (byte) 1);
        boolean boolean84 = equation69.equals((java.lang.Object) gcdSolutionWrapper79);
        int int85 = gcdSolutionWrapper79.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution86 = gcdSolutionWrapper79.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation90 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        java.lang.String str91 = equation90.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution92 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation90);
        solution92.setY((int) (byte) 10);
        boolean boolean95 = solution86.equals((java.lang.Object) solution92);
        int int96 = solution92.getY();
        boolean boolean97 = equation24.equals((java.lang.Object) solution92);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution98 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation24);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Solution[x=97, y=1]" + "'", str14, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Solution[x=1, y=1]" + "'", str20, "Solution[x=1, y=1]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Solution[x=97, y=1]" + "'", str29, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
        org.junit.Assert.assertNotNull(solution37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 35 + "'", int46 == 35);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(solution58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str59, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(solution64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(solution80);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str81, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 1 + "'", int85 == 1);
        org.junit.Assert.assertNotNull(solution86);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str91, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertNotNull(solution92);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 10 + "'", int96 == 10);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertNotNull(solution98);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution1 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution1);
        boolean boolean4 = gcdSolutionWrapper2.equals((java.lang.Object) 1);
        java.lang.String str5 = gcdSolutionWrapper2.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = gcdSolutionWrapper2.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(100, (int) (short) 100);
        gcdSolutionWrapper2.setSolution(solution9);
        java.lang.String str11 = gcdSolutionWrapper2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=null]" + "'", str5, "GcdSolutionWrapper[gcd=1, solution=null]");
        org.junit.Assert.assertNull(solution6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=Solution[x=100, y=100]]" + "'", str11, "GcdSolutionWrapper[gcd=1, solution=Solution[x=100, y=100]]");
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((-35), (int) ' ', 0);
        java.lang.String str4 = equation3.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '#', 52, 32);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution11 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int12 = solution11.getY();
        java.lang.String str13 = solution11.toString();
        solution11.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation19 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int20 = equation19.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution21 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation19);
        boolean boolean22 = solution11.equals((java.lang.Object) solution21);
        boolean boolean24 = solution21.equals((java.lang.Object) 0);
        boolean boolean25 = equation8.equals((java.lang.Object) solution21);
        boolean boolean27 = solution21.equals((java.lang.Object) (byte) -1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation32 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution33 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation32);
        solution33.setY(0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper36 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution33);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation40 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution41 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation40);
        solution41.setY((int) (byte) 10);
        boolean boolean44 = solution33.equals((java.lang.Object) (byte) 10);
        boolean boolean45 = solution21.equals((java.lang.Object) (byte) 10);
        int int46 = solution21.getX();
        solution21.setY((int) (byte) 1);
        boolean boolean49 = equation3.equals((java.lang.Object) (byte) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution52 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int53 = solution52.getY();
        java.lang.String str54 = solution52.toString();
        solution52.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation60 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int61 = equation60.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution62 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation60);
        boolean boolean63 = solution52.equals((java.lang.Object) solution62);
        int int64 = solution52.getX();
        int int65 = solution52.getY();
        boolean boolean66 = equation3.equals((java.lang.Object) int65);
        java.lang.String str67 = equation3.toString();
        int int68 = equation3.a();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equation[a=-35, b=32, c=0]" + "'", str4, "Equation[a=-35, b=32, c=0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Solution[x=97, y=1]" + "'", str13, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertNotNull(solution21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(solution33);
        org.junit.Assert.assertNotNull(solution41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Solution[x=97, y=1]" + "'", str54, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 35 + "'", int61 == 35);
        org.junit.Assert.assertNotNull(solution62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Equation[a=-35, b=32, c=0]" + "'", str67, "Equation[a=-35, b=32, c=0]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-35) + "'", int68 == (-35));
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) ' ', (int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) '4', solution3);
        solution3.setY((int) (short) 10);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation4);
        int int6 = solution5.getX();
        int int7 = solution5.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) 'a', solution5);
        gcdSolutionWrapper8.setGcd((int) '#');
        int int11 = gcdSolutionWrapper8.getGcd();
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((-1), (int) (byte) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) 0, 0);
        boolean boolean6 = solution2.equals((java.lang.Object) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int4 = solution3.getY();
        solution3.setY((int) (byte) 1);
        boolean boolean8 = solution3.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution3);
        gcdSolutionWrapper9.setGcd((-1));
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution15 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int16 = solution15.getY();
        java.lang.String str17 = solution15.toString();
        solution15.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper20 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((-35), solution15);
        int int21 = gcdSolutionWrapper20.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution22 = gcdSolutionWrapper20.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation26 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution27 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation26);
        solution27.setY((int) (byte) 10);
        gcdSolutionWrapper20.setSolution(solution27);
        gcdSolutionWrapper9.setSolution(solution27);
        int int32 = gcdSolutionWrapper9.getGcd();
        int int33 = gcdSolutionWrapper9.getGcd();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Solution[x=97, y=1]" + "'", str17, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-35) + "'", int21 == (-35));
        org.junit.Assert.assertNotNull(solution22);
        org.junit.Assert.assertNotNull(solution27);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution1 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution1);
        gcdSolutionWrapper2.setGcd((int) ' ');
        int int5 = gcdSolutionWrapper2.getGcd();
        int int6 = gcdSolutionWrapper2.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = gcdSolutionWrapper2.getSolution();
        java.lang.Class<?> wildcardClass8 = gcdSolutionWrapper2.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNull(solution7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(52, 10, 35);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution3);
        boolean boolean6 = gcdSolutionWrapper4.equals((java.lang.Object) 1);
        java.lang.String str7 = gcdSolutionWrapper4.toString();
        gcdSolutionWrapper4.setGcd(32);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution12 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) 100, (int) (byte) -1);
        gcdSolutionWrapper4.setSolution(solution12);
        int int14 = solution12.getX();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper15 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution12);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper16 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(10, solution12);
        java.lang.String str17 = gcdSolutionWrapper16.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=null]" + "'", str7, "GcdSolutionWrapper[gcd=1, solution=null]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "GcdSolutionWrapper[gcd=10, solution=Solution[x=100, y=-1]]" + "'", str17, "GcdSolutionWrapper[gcd=10, solution=Solution[x=100, y=-1]]");
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int3 = solution2.getY();
        java.lang.String str4 = solution2.toString();
        solution2.setX((int) (short) 1);
        solution2.setY(32);
        java.lang.Class<?> wildcardClass9 = solution2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Solution[x=97, y=1]" + "'", str4, "Solution[x=97, y=1]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(100, (int) (short) 100);
        int int3 = solution2.getX();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int8 = solution7.getY();
        solution7.setY((int) (byte) 1);
        boolean boolean12 = solution7.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution7);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution14 = gcdSolutionWrapper13.getSolution();
        java.lang.String str15 = gcdSolutionWrapper13.toString();
        gcdSolutionWrapper13.setGcd((int) (byte) 1);
        boolean boolean18 = equation3.equals((java.lang.Object) gcdSolutionWrapper13);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution19 = gcdSolutionWrapper13.getSolution();
        gcdSolutionWrapper13.setGcd((int) (byte) 100);
        java.lang.String str22 = gcdSolutionWrapper13.toString();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(solution14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str15, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(solution19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "GcdSolutionWrapper[gcd=100, solution=Solution[x=97, y=1]]" + "'", str22, "GcdSolutionWrapper[gcd=100, solution=Solution[x=97, y=1]]");
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (short) -1, 100);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int3 = solution2.getY();
        java.lang.String str4 = solution2.toString();
        solution2.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation10 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, 0, (int) (short) -1);
        boolean boolean11 = solution2.equals((java.lang.Object) equation10);
        int int12 = equation10.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution15 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(100, (int) (short) 100);
        boolean boolean16 = equation10.equals((java.lang.Object) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Solution[x=97, y=1]" + "'", str4, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(100, (int) (byte) -1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int8 = equation7.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution9 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation7);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution11 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper12 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution11);
        boolean boolean14 = gcdSolutionWrapper12.equals((java.lang.Object) 1);
        boolean boolean15 = equation7.equals((java.lang.Object) boolean14);
        int int16 = equation7.a();
        boolean boolean17 = solution3.equals((java.lang.Object) int16);
        solution3.setY(10);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper20 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (short) 1, solution3);
        gcdSolutionWrapper20.setGcd(1);
        java.lang.Class<?> wildcardClass23 = gcdSolutionWrapper20.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNotNull(solution9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', 35, (-35));
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int4 = solution3.getY();
        java.lang.String str5 = solution3.toString();
        solution3.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((-35), solution3);
        int int9 = gcdSolutionWrapper8.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution10 = gcdSolutionWrapper8.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution11 = gcdSolutionWrapper8.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution14 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int15 = solution14.getY();
        java.lang.String str16 = solution14.toString();
        solution14.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation22 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, 0, (int) (short) -1);
        boolean boolean23 = solution14.equals((java.lang.Object) equation22);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation27 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(32, (-35), (int) (byte) 1);
        boolean boolean28 = solution14.equals((java.lang.Object) (byte) 1);
        int int29 = solution14.getY();
        solution14.setX((int) (short) -1);
        boolean boolean32 = gcdSolutionWrapper8.equals((java.lang.Object) solution14);
        int int33 = gcdSolutionWrapper8.getGcd();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Solution[x=97, y=1]" + "'", str5, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-35) + "'", int9 == (-35));
        org.junit.Assert.assertNotNull(solution10);
        org.junit.Assert.assertNotNull(solution11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Solution[x=97, y=1]" + "'", str16, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-35) + "'", int33 == (-35));
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) 'a', (int) (short) 10, 32);
        int int4 = equation3.c();
        int int5 = equation3.a();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        int int4 = equation3.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        int int6 = equation3.b();
        int int7 = equation3.c();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int4 = solution3.getY();
        solution3.setY((int) (byte) 1);
        boolean boolean8 = solution3.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution3);
        gcdSolutionWrapper9.setGcd((-1));
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution15 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int16 = solution15.getY();
        java.lang.String str17 = solution15.toString();
        solution15.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper20 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((-35), solution15);
        int int21 = gcdSolutionWrapper20.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution22 = gcdSolutionWrapper20.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation26 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution27 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation26);
        solution27.setY((int) (byte) 10);
        gcdSolutionWrapper20.setSolution(solution27);
        gcdSolutionWrapper9.setSolution(solution27);
        solution27.setX((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Solution[x=97, y=1]" + "'", str17, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-35) + "'", int21 == (-35));
        org.junit.Assert.assertNotNull(solution22);
        org.junit.Assert.assertNotNull(solution27);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution1 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution1);
        gcdSolutionWrapper2.setGcd((int) ' ');
        gcdSolutionWrapper2.setGcd((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = gcdSolutionWrapper2.getSolution();
        int int8 = gcdSolutionWrapper2.getGcd();
        gcdSolutionWrapper2.setGcd(0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation14 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        java.lang.String str15 = equation14.toString();
        boolean boolean16 = gcdSolutionWrapper2.equals((java.lang.Object) equation14);
        java.lang.String str17 = gcdSolutionWrapper2.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution18 = gcdSolutionWrapper2.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution19 = gcdSolutionWrapper2.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution20 = gcdSolutionWrapper2.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution21 = gcdSolutionWrapper2.getSolution();
        org.junit.Assert.assertNull(solution7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str15, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "GcdSolutionWrapper[gcd=0, solution=null]" + "'", str17, "GcdSolutionWrapper[gcd=0, solution=null]");
        org.junit.Assert.assertNull(solution18);
        org.junit.Assert.assertNull(solution19);
        org.junit.Assert.assertNull(solution20);
        org.junit.Assert.assertNull(solution21);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int4 = equation3.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        int int7 = equation3.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution8 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        int int9 = solution8.getX();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertNotNull(solution6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(solution8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(35, (int) (short) 100);
        solution2.setX(35);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int8 = solution7.getY();
        solution7.setY((int) (byte) 1);
        boolean boolean12 = solution7.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution7);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution14 = gcdSolutionWrapper13.getSolution();
        java.lang.String str15 = gcdSolutionWrapper13.toString();
        gcdSolutionWrapper13.setGcd((int) (byte) 1);
        boolean boolean18 = equation3.equals((java.lang.Object) gcdSolutionWrapper13);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation22 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int23 = equation22.c();
        int int24 = equation22.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution25 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation22);
        boolean boolean26 = gcdSolutionWrapper13.equals((java.lang.Object) solution25);
        boolean boolean28 = gcdSolutionWrapper13.equals((java.lang.Object) (short) 0);
        int int29 = gcdSolutionWrapper13.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution31 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper32 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution31);
        gcdSolutionWrapper32.setGcd((int) ' ');
        gcdSolutionWrapper32.setGcd((int) (short) 100);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution39 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int40 = solution39.getY();
        java.lang.String str41 = solution39.toString();
        solution39.setX((int) (short) 1);
        boolean boolean45 = solution39.equals((java.lang.Object) (-1.0f));
        gcdSolutionWrapper32.setSolution(solution39);
        boolean boolean47 = gcdSolutionWrapper13.equals((java.lang.Object) gcdSolutionWrapper32);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution48 = gcdSolutionWrapper13.getSolution();
        java.lang.String str49 = solution48.toString();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(solution14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str15, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(solution25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Solution[x=97, y=1]" + "'", str41, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(solution48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Solution[x=97, y=1]" + "'", str49, "Solution[x=97, y=1]");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) 100, (int) (byte) -1);
        int int3 = solution2.getX();
        int int4 = solution2.getY();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int5 = equation4.c();
        int int6 = equation4.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution10 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int11 = solution10.getY();
        solution10.setY((int) (byte) 1);
        boolean boolean15 = solution10.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper16 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution10);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution17 = gcdSolutionWrapper16.getSolution();
        java.lang.String str18 = gcdSolutionWrapper16.toString();
        gcdSolutionWrapper16.setGcd((int) (byte) 1);
        boolean boolean21 = equation4.equals((java.lang.Object) gcdSolutionWrapper16);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution22 = gcdSolutionWrapper16.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution23 = gcdSolutionWrapper16.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper24 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 10, solution23);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution25 = gcdSolutionWrapper24.getSolution();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(solution17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str18, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(solution22);
        org.junit.Assert.assertNotNull(solution23);
        org.junit.Assert.assertNotNull(solution25);
    }
}
