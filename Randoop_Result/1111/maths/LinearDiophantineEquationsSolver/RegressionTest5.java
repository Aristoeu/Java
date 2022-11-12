package maths.LinearDiophantineEquationsSolver;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (short) -1, 97, (int) ' ');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution4 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        java.lang.String str5 = solution4.toString();
        org.junit.Assert.assertNotNull(solution4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Solution[x=-32, y=0]" + "'", str5, "Solution[x=-32, y=0]");
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) 1, (int) '#');
        solution2.setX((-1));
        java.lang.String str5 = solution2.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Solution[x=-1, y=35]" + "'", str5, "Solution[x=-1, y=35]");
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(35, (int) (short) 100);
        int int4 = solution3.getX();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper5 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(1, solution3);
        solution3.setX((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int4 = equation3.c();
        int int5 = equation3.b();
        int int6 = equation3.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation10 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int11 = equation10.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution12 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation10);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution14 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper15 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution14);
        boolean boolean17 = gcdSolutionWrapper15.equals((java.lang.Object) 1);
        boolean boolean18 = equation10.equals((java.lang.Object) boolean17);
        int int19 = equation10.a();
        int int20 = equation10.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution22 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper23 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution22);
        gcdSolutionWrapper23.setGcd((int) ' ');
        gcdSolutionWrapper23.setGcd((int) (short) 1);
        int int28 = gcdSolutionWrapper23.getGcd();
        int int29 = gcdSolutionWrapper23.getGcd();
        boolean boolean30 = equation10.equals((java.lang.Object) int29);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution32 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper33 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution32);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution36 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int37 = solution36.getY();
        solution36.setY((int) (byte) 1);
        gcdSolutionWrapper33.setSolution(solution36);
        boolean boolean41 = equation10.equals((java.lang.Object) gcdSolutionWrapper33);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution42 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation10);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution43 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation10);
        boolean boolean44 = equation3.equals((java.lang.Object) equation10);
        int int45 = equation10.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation49 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int50 = equation49.c();
        int int51 = equation49.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution55 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int56 = solution55.getY();
        solution55.setY((int) (byte) 1);
        boolean boolean60 = solution55.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper61 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution55);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution62 = gcdSolutionWrapper61.getSolution();
        java.lang.String str63 = gcdSolutionWrapper61.toString();
        gcdSolutionWrapper61.setGcd((int) (byte) 1);
        boolean boolean66 = equation49.equals((java.lang.Object) gcdSolutionWrapper61);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution67 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation49);
        int int68 = equation49.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution69 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation49);
        boolean boolean70 = equation10.equals((java.lang.Object) equation49);
        int int71 = equation10.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution72 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertNotNull(solution12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(solution42);
        org.junit.Assert.assertNotNull(solution43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 35 + "'", int45 == 35);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 35 + "'", int50 == 35);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(solution62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str63, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(solution67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(solution69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(solution72);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) 'a', 0, (int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution4 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution10 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation9);
        int int11 = solution10.getX();
        int int12 = solution10.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) 'a', solution10);
        gcdSolutionWrapper13.setGcd((int) (short) 0);
        gcdSolutionWrapper13.setGcd((int) '4');
        int int18 = gcdSolutionWrapper13.getGcd();
        java.lang.String str19 = gcdSolutionWrapper13.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution22 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(10, 0);
        int int23 = solution22.getX();
        int int24 = solution22.getX();
        gcdSolutionWrapper13.setSolution(solution22);
        boolean boolean26 = solution4.equals((java.lang.Object) gcdSolutionWrapper13);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation31 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int32 = equation31.c();
        int int33 = equation31.b();
        int int34 = equation31.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution35 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation31);
        java.lang.String str36 = solution35.toString();
        int int37 = solution35.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper38 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((-75), solution35);
        gcdSolutionWrapper13.setSolution(solution35);
        org.junit.Assert.assertNotNull(solution4);
        org.junit.Assert.assertNotNull(solution10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "GcdSolutionWrapper[gcd=52, solution=Solution[x=0, y=0]]" + "'", str19, "GcdSolutionWrapper[gcd=52, solution=Solution[x=0, y=0]]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 35 + "'", int32 == 35);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 35 + "'", int34 == 35);
        org.junit.Assert.assertNotNull(solution35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Solution[x=0, y=-35]" + "'", str36, "Solution[x=0, y=-35]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-35) + "'", int37 == (-35));
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((-35), (int) ' ', 0);
        java.lang.String str4 = equation3.toString();
        boolean boolean6 = equation3.equals((java.lang.Object) true);
        int int7 = equation3.c();
        int int8 = equation3.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution9 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        solution9.setY(32);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equation[a=-35, b=32, c=0]" + "'", str4, "Equation[a=-35, b=32, c=0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNotNull(solution9);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        java.lang.String str4 = equation3.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        solution5.setY((int) (byte) 10);
        solution5.setY((int) (byte) 10);
        int int10 = solution5.getY();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str4, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (short) 10, 10, 100);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution4 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation10 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution11 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation10);
        int int12 = solution11.getX();
        int int13 = solution11.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper14 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) 'a', solution11);
        gcdSolutionWrapper14.setGcd((int) (short) 0);
        gcdSolutionWrapper14.setGcd((int) '4');
        int int19 = gcdSolutionWrapper14.getGcd();
        gcdSolutionWrapper14.setGcd((int) (short) -1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution22 = gcdSolutionWrapper14.getSolution();
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
        int int42 = solution35.getY();
        gcdSolutionWrapper14.setSolution(solution35);
        boolean boolean44 = solution5.equals((java.lang.Object) gcdSolutionWrapper14);
        org.junit.Assert.assertNotNull(solution4);
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertNotNull(solution11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertNotNull(solution22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Solution[x=97, y=1]" + "'", str37, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 97 + "'", int41 == 97);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) 10, (int) (short) 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((-1), solution3);
        int int5 = gcdSolutionWrapper4.getGcd();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution4 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        int int5 = solution4.getX();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        int int10 = equation9.c();
        int int11 = equation9.c();
        int int12 = equation9.a();
        boolean boolean13 = solution4.equals((java.lang.Object) equation9);
        int int14 = equation9.a();
        java.lang.String str15 = equation9.toString();
        java.lang.Object obj16 = null;
        boolean boolean17 = equation9.equals(obj16);
        org.junit.Assert.assertNotNull(solution4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equation[a=52, b=52, c=0]" + "'", str15, "Equation[a=52, b=52, c=0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '#', 52, 32);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution4 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        int int6 = equation3.c();
        java.lang.String str7 = equation3.toString();
        org.junit.Assert.assertNotNull(solution4);
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equation[a=35, b=52, c=32]" + "'", str7, "Equation[a=35, b=52, c=32]");
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        int int4 = equation3.a();
        int int5 = equation3.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        solution7.setY((int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(solution6);
        org.junit.Assert.assertNotNull(solution7);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) '4', (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution3);
        java.lang.String str5 = gcdSolutionWrapper4.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = gcdSolutionWrapper4.getSolution();
        gcdSolutionWrapper4.setGcd(52);
        int int9 = gcdSolutionWrapper4.getGcd();
        java.lang.String str10 = gcdSolutionWrapper4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]" + "'", str5, "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]");
        org.junit.Assert.assertNotNull(solution6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GcdSolutionWrapper[gcd=52, solution=Solution[x=52, y=52]]" + "'", str10, "GcdSolutionWrapper[gcd=52, solution=Solution[x=52, y=52]]");
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(35, (-35));
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation6 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int7 = equation6.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution8 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation6);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution10 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper11 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution10);
        boolean boolean13 = gcdSolutionWrapper11.equals((java.lang.Object) 1);
        boolean boolean14 = equation6.equals((java.lang.Object) boolean13);
        int int15 = equation6.a();
        int int16 = equation6.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution18 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper19 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution18);
        gcdSolutionWrapper19.setGcd((int) ' ');
        gcdSolutionWrapper19.setGcd((int) (short) 1);
        int int24 = gcdSolutionWrapper19.getGcd();
        int int25 = gcdSolutionWrapper19.getGcd();
        boolean boolean26 = equation6.equals((java.lang.Object) int25);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution28 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper29 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution28);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution32 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int33 = solution32.getY();
        solution32.setY((int) (byte) 1);
        gcdSolutionWrapper29.setSolution(solution32);
        boolean boolean37 = equation6.equals((java.lang.Object) gcdSolutionWrapper29);
        boolean boolean39 = equation6.equals((java.lang.Object) (short) 1);
        java.lang.String str40 = equation6.toString();
        boolean boolean41 = solution2.equals((java.lang.Object) str40);
        solution2.setX((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(solution8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str40, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
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
        boolean boolean74 = solution69.equals((java.lang.Object) '#');
        int int75 = solution69.getY();
        int int76 = solution69.getX();
        solution69.setY((int) (byte) 10);
        gcdSolutionWrapper24.setSolution(solution69);
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
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution1 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((-75), solution1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = gcdSolutionWrapper2.getSolution();
        org.junit.Assert.assertNull(solution3);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        int int4 = equation3.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        java.lang.String str6 = equation3.toString();
        int int7 = equation3.a();
        int int8 = equation3.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation12 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution16 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int17 = solution16.getY();
        solution16.setY((int) (byte) 1);
        boolean boolean21 = solution16.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper22 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution16);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution23 = gcdSolutionWrapper22.getSolution();
        java.lang.String str24 = gcdSolutionWrapper22.toString();
        gcdSolutionWrapper22.setGcd((int) (byte) 1);
        boolean boolean27 = equation12.equals((java.lang.Object) gcdSolutionWrapper22);
        java.lang.String str28 = equation12.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution29 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation12);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution30 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation12);
        int int31 = solution30.getY();
        boolean boolean32 = equation3.equals((java.lang.Object) solution30);
        int int33 = equation3.b();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equation[a=97, b=0, c=52]" + "'", str6, "Equation[a=97, b=0, c=52]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(solution23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str24, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str28, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertNotNull(solution29);
        org.junit.Assert.assertNotNull(solution30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-35) + "'", int31 == (-35));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
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
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation35 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '#', 52, 32);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution38 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int39 = solution38.getY();
        java.lang.String str40 = solution38.toString();
        solution38.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation46 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int47 = equation46.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution48 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation46);
        boolean boolean49 = solution38.equals((java.lang.Object) solution48);
        boolean boolean51 = solution48.equals((java.lang.Object) 0);
        boolean boolean52 = equation35.equals((java.lang.Object) solution48);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation56 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int57 = equation56.c();
        int int58 = equation56.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution62 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int63 = solution62.getY();
        solution62.setY((int) (byte) 1);
        boolean boolean67 = solution62.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper68 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution62);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution69 = gcdSolutionWrapper68.getSolution();
        java.lang.String str70 = gcdSolutionWrapper68.toString();
        gcdSolutionWrapper68.setGcd((int) (byte) 1);
        boolean boolean73 = equation56.equals((java.lang.Object) gcdSolutionWrapper68);
        boolean boolean74 = equation35.equals((java.lang.Object) equation56);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution75 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation35);
        gcdSolutionWrapper9.setSolution(solution75);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution77 = gcdSolutionWrapper9.getSolution();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Solution[x=97, y=1]" + "'", str17, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-35) + "'", int21 == (-35));
        org.junit.Assert.assertNotNull(solution22);
        org.junit.Assert.assertNotNull(solution27);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Solution[x=97, y=1]" + "'", str40, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 35 + "'", int47 == 35);
        org.junit.Assert.assertNotNull(solution48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 35 + "'", int57 == 35);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(solution69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str70, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(solution75);
        org.junit.Assert.assertNotNull(solution77);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int4 = solution3.getY();
        java.lang.String str5 = solution3.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        int int10 = equation9.c();
        int int11 = equation9.a();
        int int12 = equation9.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution13 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation9);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation17 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int18 = equation17.c();
        int int19 = equation17.b();
        int int20 = equation17.c();
        boolean boolean21 = solution13.equals((java.lang.Object) equation17);
        boolean boolean22 = solution3.equals((java.lang.Object) boolean21);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper23 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) '4', solution3);
        int int24 = gcdSolutionWrapper23.getGcd();
        java.lang.String str25 = gcdSolutionWrapper23.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Solution[x=97, y=1]" + "'", str5, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(solution13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "GcdSolutionWrapper[gcd=52, solution=Solution[x=97, y=1]]" + "'", str25, "GcdSolutionWrapper[gcd=52, solution=Solution[x=97, y=1]]");
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int4 = equation3.c();
        java.lang.String str5 = equation3.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution17 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int18 = solution17.getY();
        solution17.setY((int) (byte) 1);
        boolean boolean22 = solution17.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper23 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution17);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution24 = gcdSolutionWrapper23.getSolution();
        java.lang.String str25 = gcdSolutionWrapper23.toString();
        gcdSolutionWrapper23.setGcd((int) (byte) 1);
        boolean boolean28 = equation13.equals((java.lang.Object) gcdSolutionWrapper23);
        int int29 = gcdSolutionWrapper23.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution30 = gcdSolutionWrapper23.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper31 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(32, solution30);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper32 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) ' ', solution30);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution33 = gcdSolutionWrapper32.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper34 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(100, solution33);
        boolean boolean35 = equation3.equals((java.lang.Object) 100);
        int int36 = equation3.c();
        int int37 = equation3.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution38 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        solution38.setX((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str5, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertNotNull(solution6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(solution24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str25, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(solution30);
        org.junit.Assert.assertNotNull(solution33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 35 + "'", int37 == 35);
        org.junit.Assert.assertNotNull(solution38);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int5 = solution4.getY();
        java.lang.String str6 = solution4.toString();
        solution4.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((-35), solution4);
        int int10 = gcdSolutionWrapper9.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution11 = gcdSolutionWrapper9.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution12 = gcdSolutionWrapper9.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution15 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int16 = solution15.getY();
        java.lang.String str17 = solution15.toString();
        solution15.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation23 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, 0, (int) (short) -1);
        boolean boolean24 = solution15.equals((java.lang.Object) equation23);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation28 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(32, (-35), (int) (byte) 1);
        boolean boolean29 = solution15.equals((java.lang.Object) (byte) 1);
        int int30 = solution15.getY();
        solution15.setX((int) (short) -1);
        boolean boolean33 = gcdSolutionWrapper9.equals((java.lang.Object) solution15);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution34 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution.INFINITE_SOLUTIONS;
        solution34.setY((int) (short) 100);
        boolean boolean37 = gcdSolutionWrapper9.equals((java.lang.Object) (short) 100);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution40 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) '4', (int) '4');
        boolean boolean41 = gcdSolutionWrapper9.equals((java.lang.Object) solution40);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper42 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (short) 0, solution40);
        gcdSolutionWrapper42.setGcd(1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Solution[x=97, y=1]" + "'", str6, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-35) + "'", int10 == (-35));
        org.junit.Assert.assertNotNull(solution11);
        org.junit.Assert.assertNotNull(solution12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Solution[x=97, y=1]" + "'", str17, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(solution34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) 10, 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution4 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper5 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution4);
        gcdSolutionWrapper5.setGcd((int) ' ');
        gcdSolutionWrapper5.setGcd((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution10 = gcdSolutionWrapper5.getSolution();
        int int11 = gcdSolutionWrapper5.getGcd();
        gcdSolutionWrapper5.setGcd(0);
        gcdSolutionWrapper5.setGcd((int) ' ');
        gcdSolutionWrapper5.setGcd((int) (byte) 100);
        boolean boolean18 = solution2.equals((java.lang.Object) (byte) 100);
        org.junit.Assert.assertNull(solution10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) 0, (-35));
        int int3 = solution2.getY();
        java.lang.String str4 = solution2.toString();
        solution2.setX((int) (short) 100);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution10 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(100, (int) (byte) -1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation14 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int15 = equation14.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution16 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation14);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution18 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper19 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution18);
        boolean boolean21 = gcdSolutionWrapper19.equals((java.lang.Object) 1);
        boolean boolean22 = equation14.equals((java.lang.Object) boolean21);
        int int23 = equation14.a();
        boolean boolean24 = solution10.equals((java.lang.Object) int23);
        solution10.setY(10);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper27 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (short) 1, solution10);
        gcdSolutionWrapper27.setGcd(1);
        gcdSolutionWrapper27.setGcd(0);
        boolean boolean32 = solution2.equals((java.lang.Object) gcdSolutionWrapper27);
        solution2.setX((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-35) + "'", int3 == (-35));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Solution[x=0, y=-35]" + "'", str4, "Solution[x=0, y=-35]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertNotNull(solution16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) 'a', 52, (int) 'a');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int8 = equation7.c();
        int int9 = equation7.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int14 = solution13.getY();
        solution13.setY((int) (byte) 1);
        boolean boolean18 = solution13.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper19 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution13);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution20 = gcdSolutionWrapper19.getSolution();
        java.lang.String str21 = gcdSolutionWrapper19.toString();
        gcdSolutionWrapper19.setGcd((int) (byte) 1);
        boolean boolean24 = equation7.equals((java.lang.Object) gcdSolutionWrapper19);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution25 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation7);
        int int26 = equation7.a();
        boolean boolean27 = equation3.equals((java.lang.Object) equation7);
        int int28 = equation3.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution29 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(solution20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str21, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(solution25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertNotNull(solution29);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation5 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation5);
        int int7 = solution6.getX();
        int int8 = solution6.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) 'a', solution6);
        java.lang.String str10 = solution6.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper11 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(52, solution6);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution13 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper14 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution13);
        gcdSolutionWrapper14.setGcd((int) ' ');
        gcdSolutionWrapper14.setGcd((int) (short) 1);
        java.lang.String str19 = gcdSolutionWrapper14.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution22 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int23 = solution22.getY();
        java.lang.String str24 = solution22.toString();
        solution22.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation30 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int31 = equation30.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution32 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation30);
        boolean boolean33 = solution22.equals((java.lang.Object) solution32);
        boolean boolean35 = solution22.equals((java.lang.Object) false);
        gcdSolutionWrapper14.setSolution(solution22);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution39 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int40 = solution39.getY();
        java.lang.String str41 = solution39.toString();
        solution39.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation47 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, 0, (int) (short) -1);
        boolean boolean48 = solution39.equals((java.lang.Object) equation47);
        int int49 = equation47.c();
        int int50 = equation47.a();
        boolean boolean51 = gcdSolutionWrapper14.equals((java.lang.Object) equation47);
        boolean boolean52 = gcdSolutionWrapper11.equals((java.lang.Object) gcdSolutionWrapper14);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution53 = gcdSolutionWrapper11.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution56 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(1, (int) (byte) -1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation60 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, (-1), 32);
        java.lang.String str61 = equation60.toString();
        int int62 = equation60.c();
        boolean boolean63 = solution56.equals((java.lang.Object) equation60);
        boolean boolean64 = gcdSolutionWrapper11.equals((java.lang.Object) equation60);
        org.junit.Assert.assertNotNull(solution6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Solution[x=0, y=0]" + "'", str10, "Solution[x=0, y=0]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=null]" + "'", str19, "GcdSolutionWrapper[gcd=1, solution=null]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Solution[x=97, y=1]" + "'", str24, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 35 + "'", int31 == 35);
        org.junit.Assert.assertNotNull(solution32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Solution[x=97, y=1]" + "'", str41, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(solution53);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Equation[a=97, b=-1, c=32]" + "'", str61, "Equation[a=97, b=-1, c=32]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 32 + "'", int62 == 32);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        java.lang.String str4 = equation3.toString();
        java.lang.Object obj5 = null;
        boolean boolean6 = equation3.equals(obj5);
        int int7 = equation3.b();
        int int8 = equation3.a();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str4, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
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
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation29 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, (-1), 32);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution30 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation29);
        boolean boolean31 = gcdSolutionWrapper9.equals((java.lang.Object) equation29);
        gcdSolutionWrapper9.setGcd((int) '4');
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
        org.junit.Assert.assertNotNull(solution30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation4);
        int int6 = solution5.getX();
        int int7 = solution5.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) 'a', solution5);
        boolean boolean10 = solution5.equals((java.lang.Object) '#');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution12 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution12);
        boolean boolean14 = solution5.equals((java.lang.Object) (byte) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution18 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int19 = solution18.getY();
        solution18.setY((int) (byte) 1);
        boolean boolean23 = solution18.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper24 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution18);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution25 = gcdSolutionWrapper24.getSolution();
        solution25.setX((int) 'a');
        boolean boolean28 = solution5.equals((java.lang.Object) 'a');
        solution5.setY((int) (short) 0);
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(solution25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(10, 0);
        int int4 = solution3.getX();
        solution3.setX(100);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (short) -1, solution3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution9 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper10 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution9);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int14 = solution13.getY();
        solution13.setY((int) (byte) 1);
        gcdSolutionWrapper10.setSolution(solution13);
        int int18 = gcdSolutionWrapper10.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution21 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int22 = solution21.getY();
        java.lang.String str23 = solution21.toString();
        solution21.setX((int) (short) 1);
        boolean boolean27 = solution21.equals((java.lang.Object) (-1.0f));
        java.lang.String str28 = solution21.toString();
        java.lang.String str29 = solution21.toString();
        gcdSolutionWrapper10.setSolution(solution21);
        solution21.setX((int) '4');
        java.lang.String str33 = solution21.toString();
        gcdSolutionWrapper7.setSolution(solution21);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation38 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 10, (int) (short) 0, (int) '#');
        boolean boolean39 = gcdSolutionWrapper7.equals((java.lang.Object) (byte) 10);
        gcdSolutionWrapper7.setGcd(100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Solution[x=97, y=1]" + "'", str23, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Solution[x=1, y=1]" + "'", str28, "Solution[x=1, y=1]");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Solution[x=1, y=1]" + "'", str29, "Solution[x=1, y=1]");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Solution[x=52, y=1]" + "'", str33, "Solution[x=52, y=1]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution1 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution1);
        gcdSolutionWrapper2.setGcd((int) ' ');
        gcdSolutionWrapper2.setGcd((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = gcdSolutionWrapper2.getSolution();
        gcdSolutionWrapper2.setGcd((int) (byte) 10);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution10 = gcdSolutionWrapper2.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution12 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution12);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution16 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int17 = solution16.getY();
        solution16.setY((int) (byte) 1);
        gcdSolutionWrapper13.setSolution(solution16);
        int int21 = gcdSolutionWrapper13.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution24 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int25 = solution24.getY();
        java.lang.String str26 = solution24.toString();
        solution24.setX((int) (short) 1);
        boolean boolean30 = solution24.equals((java.lang.Object) (-1.0f));
        java.lang.String str31 = solution24.toString();
        java.lang.String str32 = solution24.toString();
        gcdSolutionWrapper13.setSolution(solution24);
        java.lang.String str34 = solution24.toString();
        solution24.setY(52);
        gcdSolutionWrapper2.setSolution(solution24);
        java.lang.String str38 = gcdSolutionWrapper2.toString();
        org.junit.Assert.assertNull(solution7);
        org.junit.Assert.assertNull(solution10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Solution[x=97, y=1]" + "'", str26, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Solution[x=1, y=1]" + "'", str31, "Solution[x=1, y=1]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Solution[x=1, y=1]" + "'", str32, "Solution[x=1, y=1]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Solution[x=1, y=1]" + "'", str34, "Solution[x=1, y=1]");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "GcdSolutionWrapper[gcd=10, solution=Solution[x=1, y=52]]" + "'", str38, "GcdSolutionWrapper[gcd=10, solution=Solution[x=1, y=52]]");
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '#', (int) (short) 10, (-1));
        int int4 = equation3.b();
        int int5 = equation3.c();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, 125, 97);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int3 = solution2.getY();
        java.lang.String str4 = solution2.toString();
        solution2.setX((int) (short) 1);
        boolean boolean8 = solution2.equals((java.lang.Object) (-1.0f));
        java.lang.String str9 = solution2.toString();
        java.lang.String str10 = solution2.toString();
        int int11 = solution2.getX();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Solution[x=97, y=1]" + "'", str4, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Solution[x=1, y=1]" + "'", str9, "Solution[x=1, y=1]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Solution[x=1, y=1]" + "'", str10, "Solution[x=1, y=1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution1 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution1);
        gcdSolutionWrapper2.setGcd((int) ' ');
        gcdSolutionWrapper2.setGcd((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = gcdSolutionWrapper2.getSolution();
        int int8 = gcdSolutionWrapper2.getGcd();
        gcdSolutionWrapper2.setGcd(0);
        gcdSolutionWrapper2.setGcd((int) ' ');
        int int13 = gcdSolutionWrapper2.getGcd();
        org.junit.Assert.assertNull(solution7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', 0, 0);
        int int4 = equation3.b();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int4 = solution3.getY();
        java.lang.String str5 = solution3.toString();
        solution3.setX((int) (short) 1);
        boolean boolean9 = solution3.equals((java.lang.Object) true);
        solution3.setY(32);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper12 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 10, solution3);
        java.lang.String str13 = gcdSolutionWrapper12.toString();
        int int14 = gcdSolutionWrapper12.getGcd();
        int int15 = gcdSolutionWrapper12.getGcd();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Solution[x=97, y=1]" + "'", str5, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "GcdSolutionWrapper[gcd=10, solution=Solution[x=1, y=32]]" + "'", str13, "GcdSolutionWrapper[gcd=10, solution=Solution[x=1, y=32]]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        int int4 = equation3.c();
        int int5 = equation3.b();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) 100, (int) ' ');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (short) 10, solution3);
        java.lang.String str5 = gcdSolutionWrapper4.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation10 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution14 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int15 = solution14.getY();
        solution14.setY((int) (byte) 1);
        boolean boolean19 = solution14.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper20 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution14);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution21 = gcdSolutionWrapper20.getSolution();
        java.lang.String str22 = gcdSolutionWrapper20.toString();
        gcdSolutionWrapper20.setGcd((int) (byte) 1);
        boolean boolean25 = equation10.equals((java.lang.Object) gcdSolutionWrapper20);
        int int26 = gcdSolutionWrapper20.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution27 = gcdSolutionWrapper20.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper28 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(32, solution27);
        int int29 = gcdSolutionWrapper28.getGcd();
        gcdSolutionWrapper28.setGcd((int) (short) 100);
        java.lang.String str32 = gcdSolutionWrapper28.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution35 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper36 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution35);
        boolean boolean38 = gcdSolutionWrapper36.equals((java.lang.Object) 1);
        java.lang.String str39 = gcdSolutionWrapper36.toString();
        gcdSolutionWrapper36.setGcd(32);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution44 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) 100, (int) (byte) -1);
        gcdSolutionWrapper36.setSolution(solution44);
        int int46 = solution44.getX();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper47 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution44);
        java.lang.String str48 = solution44.toString();
        solution44.setX((int) (byte) 10);
        int int51 = solution44.getX();
        gcdSolutionWrapper28.setSolution(solution44);
        gcdSolutionWrapper4.setSolution(solution44);
        java.lang.Object obj54 = null;
        boolean boolean55 = solution44.equals(obj54);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GcdSolutionWrapper[gcd=10, solution=Solution[x=100, y=32]]" + "'", str5, "GcdSolutionWrapper[gcd=10, solution=Solution[x=100, y=32]]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(solution21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str22, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(solution27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 32 + "'", int29 == 32);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "GcdSolutionWrapper[gcd=100, solution=Solution[x=97, y=1]]" + "'", str32, "GcdSolutionWrapper[gcd=100, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=null]" + "'", str39, "GcdSolutionWrapper[gcd=1, solution=null]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 100 + "'", int46 == 100);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Solution[x=100, y=-1]" + "'", str48, "Solution[x=100, y=-1]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 10 + "'", int51 == 10);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(10, 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 10, solution3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = gcdSolutionWrapper4.getSolution();
        int int6 = solution5.getY();
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation5 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation5);
        solution6.setY(0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution6);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation14 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution15 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation14);
        int int16 = solution15.getX();
        int int17 = solution15.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper18 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) 'a', solution15);
        int int19 = solution15.getX();
        gcdSolutionWrapper9.setSolution(solution15);
        int int21 = solution15.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper22 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) 'a', solution15);
        java.lang.String str23 = gcdSolutionWrapper22.toString();
        org.junit.Assert.assertNotNull(solution6);
        org.junit.Assert.assertNotNull(solution15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "GcdSolutionWrapper[gcd=97, solution=Solution[x=0, y=0]]" + "'", str23, "GcdSolutionWrapper[gcd=97, solution=Solution[x=0, y=0]]");
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int4 = solution3.getY();
        java.lang.String str5 = solution3.toString();
        solution3.setX((int) (short) 1);
        boolean boolean9 = solution3.equals((java.lang.Object) true);
        solution3.setY(32);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper12 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 10, solution3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution16 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) 100, (int) ' ');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper17 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (short) 10, solution16);
        solution16.setY((int) (byte) 0);
        gcdSolutionWrapper12.setSolution(solution16);
        gcdSolutionWrapper12.setGcd((-35));
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution23 = gcdSolutionWrapper12.getSolution();
        java.lang.String str24 = gcdSolutionWrapper12.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Solution[x=97, y=1]" + "'", str5, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(solution23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "GcdSolutionWrapper[gcd=-35, solution=Solution[x=100, y=0]]" + "'", str24, "GcdSolutionWrapper[gcd=-35, solution=Solution[x=100, y=0]]");
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) (byte) 100, 32);
        int int4 = equation3.b();
        int int5 = equation3.a();
        int int6 = equation3.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution8 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution8);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution12 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int13 = solution12.getY();
        solution12.setY((int) (byte) 1);
        gcdSolutionWrapper9.setSolution(solution12);
        int int17 = gcdSolutionWrapper9.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution20 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int21 = solution20.getY();
        java.lang.String str22 = solution20.toString();
        solution20.setX((int) (short) 1);
        boolean boolean26 = solution20.equals((java.lang.Object) (-1.0f));
        java.lang.String str27 = solution20.toString();
        java.lang.String str28 = solution20.toString();
        gcdSolutionWrapper9.setSolution(solution20);
        int int30 = gcdSolutionWrapper9.getGcd();
        gcdSolutionWrapper9.setGcd((int) 'a');
        gcdSolutionWrapper9.setGcd((int) ' ');
        boolean boolean35 = equation3.equals((java.lang.Object) gcdSolutionWrapper9);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution36 = gcdSolutionWrapper9.getSolution();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Solution[x=97, y=1]" + "'", str22, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Solution[x=1, y=1]" + "'", str27, "Solution[x=1, y=1]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Solution[x=1, y=1]" + "'", str28, "Solution[x=1, y=1]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(solution36);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int4 = equation3.c();
        java.lang.String str5 = equation3.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int10 = solution9.getY();
        java.lang.String str11 = solution9.toString();
        solution9.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper14 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((-35), solution9);
        int int15 = gcdSolutionWrapper14.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution16 = gcdSolutionWrapper14.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation20 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution21 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation20);
        solution21.setY((int) (byte) 10);
        gcdSolutionWrapper14.setSolution(solution21);
        boolean boolean25 = equation3.equals((java.lang.Object) solution21);
        solution21.setX(97);
        solution21.setX(100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str5, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Solution[x=97, y=1]" + "'", str11, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-35) + "'", int15 == (-35));
        org.junit.Assert.assertNotNull(solution16);
        org.junit.Assert.assertNotNull(solution21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
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
        java.lang.String str30 = gcdSolutionWrapper10.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Solution[x=97, y=1]" + "'", str6, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Solution[x=97, y=1]" + "'", str23, "Solution[x=97, y=1]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Solution[x=97, y=1]" + "'", str24, "Solution[x=97, y=1]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Solution[x=97, y=1]" + "'", str25, "Solution[x=97, y=1]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "GcdSolutionWrapper[gcd=52, solution=Solution[x=97, y=1]]" + "'", str27, "GcdSolutionWrapper[gcd=52, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "GcdSolutionWrapper[gcd=52, solution=Solution[x=97, y=1]]" + "'", str30, "GcdSolutionWrapper[gcd=52, solution=Solution[x=97, y=1]]");
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) '4', (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution3);
        java.lang.String str5 = gcdSolutionWrapper4.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = gcdSolutionWrapper4.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = gcdSolutionWrapper4.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation11 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) ' ', (int) ' ', 35);
        boolean boolean12 = gcdSolutionWrapper4.equals((java.lang.Object) ' ');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution13 = gcdSolutionWrapper4.getSolution();
        gcdSolutionWrapper4.setGcd((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]" + "'", str5, "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]");
        org.junit.Assert.assertNotNull(solution6);
        org.junit.Assert.assertNotNull(solution7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(solution13);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int4 = equation3.c();
        int int5 = equation3.b();
        int int6 = equation3.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation10 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int11 = equation10.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution12 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation10);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution14 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper15 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution14);
        boolean boolean17 = gcdSolutionWrapper15.equals((java.lang.Object) 1);
        boolean boolean18 = equation10.equals((java.lang.Object) boolean17);
        int int19 = equation10.a();
        int int20 = equation10.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution22 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper23 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution22);
        gcdSolutionWrapper23.setGcd((int) ' ');
        gcdSolutionWrapper23.setGcd((int) (short) 1);
        int int28 = gcdSolutionWrapper23.getGcd();
        int int29 = gcdSolutionWrapper23.getGcd();
        boolean boolean30 = equation10.equals((java.lang.Object) int29);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution32 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper33 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution32);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution36 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int37 = solution36.getY();
        solution36.setY((int) (byte) 1);
        gcdSolutionWrapper33.setSolution(solution36);
        boolean boolean41 = equation10.equals((java.lang.Object) gcdSolutionWrapper33);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution42 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation10);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution43 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation10);
        boolean boolean44 = equation3.equals((java.lang.Object) equation10);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation48 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution52 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int53 = solution52.getY();
        solution52.setY((int) (byte) 1);
        boolean boolean57 = solution52.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper58 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution52);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution59 = gcdSolutionWrapper58.getSolution();
        java.lang.String str60 = gcdSolutionWrapper58.toString();
        gcdSolutionWrapper58.setGcd((int) (byte) 1);
        boolean boolean63 = equation48.equals((java.lang.Object) gcdSolutionWrapper58);
        int int64 = gcdSolutionWrapper58.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution65 = gcdSolutionWrapper58.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation69 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        java.lang.String str70 = equation69.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution71 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation69);
        solution71.setY((int) (byte) 10);
        boolean boolean74 = solution65.equals((java.lang.Object) solution71);
        java.lang.String str75 = solution71.toString();
        boolean boolean76 = equation3.equals((java.lang.Object) solution71);
        solution71.setX((int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertNotNull(solution12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(solution42);
        org.junit.Assert.assertNotNull(solution43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(solution59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str60, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertNotNull(solution65);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str70, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertNotNull(solution71);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "Solution[x=0, y=10]" + "'", str75, "Solution[x=0, y=10]");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation5 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation5);
        solution6.setY(0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution6);
        solution6.setY((int) (short) 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper12 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((-35), solution6);
        int int13 = gcdSolutionWrapper12.getGcd();
        org.junit.Assert.assertNotNull(solution6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-35) + "'", int13 == (-35));
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(1, 100);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (short) -1, (int) (byte) 0, 96);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
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
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation21 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution22 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation21);
        int int23 = solution22.getX();
        int int24 = solution22.getY();
        boolean boolean25 = solution12.equals((java.lang.Object) solution22);
        solution12.setY(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Solution[x=97, y=1]" + "'", str14, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(solution22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
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
        int int20 = equation3.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution21 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation25 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int26 = equation25.c();
        int int27 = equation25.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution31 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int32 = solution31.getY();
        solution31.setY((int) (byte) 1);
        boolean boolean36 = solution31.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper37 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution31);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution38 = gcdSolutionWrapper37.getSolution();
        java.lang.String str39 = gcdSolutionWrapper37.toString();
        gcdSolutionWrapper37.setGcd((int) (byte) 1);
        boolean boolean42 = equation25.equals((java.lang.Object) gcdSolutionWrapper37);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution43 = gcdSolutionWrapper37.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution44 = gcdSolutionWrapper37.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution48 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int49 = solution48.getY();
        solution48.setY((int) (byte) 1);
        boolean boolean53 = solution48.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper54 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution48);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution57 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int58 = solution57.getY();
        java.lang.String str59 = solution57.toString();
        boolean boolean61 = solution57.equals((java.lang.Object) (-1L));
        gcdSolutionWrapper54.setSolution(solution57);
        int int63 = solution57.getX();
        java.lang.String str64 = solution57.toString();
        solution57.setX((int) (byte) 0);
        boolean boolean67 = gcdSolutionWrapper37.equals((java.lang.Object) (byte) 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution68 = gcdSolutionWrapper37.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution69 = gcdSolutionWrapper37.getSolution();
        java.lang.String str70 = solution69.toString();
        boolean boolean71 = equation3.equals((java.lang.Object) str70);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(solution14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str15, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str19, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertNotNull(solution21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(solution38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str39, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(solution43);
        org.junit.Assert.assertNotNull(solution44);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Solution[x=97, y=1]" + "'", str59, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 97 + "'", int63 == 97);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Solution[x=97, y=1]" + "'", str64, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(solution68);
        org.junit.Assert.assertNotNull(solution69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Solution[x=97, y=1]" + "'", str70, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(32, (int) (short) 100, 52);
        int int4 = equation3.b();
        int int5 = equation3.a();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
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
        int int48 = gcdSolutionWrapper32.getGcd();
        gcdSolutionWrapper32.setGcd((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 100 + "'", int48 == 100);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int4 = equation3.c();
        int int5 = equation3.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation11 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        java.lang.String str12 = equation11.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution13 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation11);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper14 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (short) 0, solution13);
        java.lang.String str15 = gcdSolutionWrapper14.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution16 = gcdSolutionWrapper14.getSolution();
        boolean boolean17 = equation3.equals((java.lang.Object) solution16);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation23 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution24 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation23);
        int int25 = solution24.getX();
        int int26 = solution24.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper27 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) 'a', solution24);
        gcdSolutionWrapper27.setGcd((int) (short) 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation33 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution34 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation33);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation38 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((-1), 0, (int) (byte) 10);
        boolean boolean39 = solution34.equals((java.lang.Object) (byte) 10);
        gcdSolutionWrapper27.setSolution(solution34);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper41 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(32, solution34);
        boolean boolean42 = equation3.equals((java.lang.Object) 32);
        int int43 = equation3.c();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(solution6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str12, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertNotNull(solution13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GcdSolutionWrapper[gcd=0, solution=Solution[x=0, y=-35]]" + "'", str15, "GcdSolutionWrapper[gcd=0, solution=Solution[x=0, y=-35]]");
        org.junit.Assert.assertNotNull(solution16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(solution24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(solution34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 35 + "'", int43 == 35);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) 'a', (int) (short) 10, 32);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(10, 35);
        int int7 = solution6.getY();
        boolean boolean8 = equation3.equals((java.lang.Object) int7);
        int int9 = equation3.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution10 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNotNull(solution10);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (short) -1, (int) (short) 0, 0);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
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
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation27 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int28 = equation27.c();
        java.lang.String str29 = equation27.toString();
        int int30 = equation27.b();
        int int31 = equation27.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution32 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation27);
        gcdSolutionWrapper9.setSolution(solution32);
        int int34 = gcdSolutionWrapper9.getGcd();
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 35 + "'", int28 == 35);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str29, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(solution32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        int int4 = equation3.c();
        int int5 = equation3.a();
        int int6 = equation3.a();
        java.lang.String str7 = equation3.toString();
        int int8 = equation3.a();
        int int9 = equation3.b();
        int int10 = equation3.a();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equation[a=97, b=0, c=52]" + "'", str7, "Equation[a=97, b=0, c=52]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution1 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution1);
        gcdSolutionWrapper2.setGcd((int) ' ');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int8 = solution7.getY();
        java.lang.String str9 = solution7.toString();
        gcdSolutionWrapper2.setSolution(solution7);
        boolean boolean12 = gcdSolutionWrapper2.equals((java.lang.Object) (short) 0);
        gcdSolutionWrapper2.setGcd((int) (short) 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation18 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution22 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int23 = solution22.getY();
        solution22.setY((int) (byte) 1);
        boolean boolean27 = solution22.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper28 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution22);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution29 = gcdSolutionWrapper28.getSolution();
        java.lang.String str30 = gcdSolutionWrapper28.toString();
        gcdSolutionWrapper28.setGcd((int) (byte) 1);
        boolean boolean33 = equation18.equals((java.lang.Object) gcdSolutionWrapper28);
        java.lang.String str34 = equation18.toString();
        int int35 = equation18.c();
        boolean boolean36 = gcdSolutionWrapper2.equals((java.lang.Object) equation18);
        int int37 = equation18.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution38 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation18);
        int int39 = solution38.getX();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Solution[x=97, y=1]" + "'", str9, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(solution29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str30, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str34, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 35 + "'", int35 == 35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(solution38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) 10, (int) (short) -1);
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
        int int28 = solution21.getY();
        int int29 = solution21.getX();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper30 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (short) -1, solution21);
        boolean boolean31 = equation3.equals((java.lang.Object) solution21);
        java.lang.Class<?> wildcardClass32 = equation3.getClass();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Solution[x=97, y=1]" + "'", str13, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertNotNull(solution21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-35) + "'", int28 == (-35));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
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
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation23 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        int int24 = equation23.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution25 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation23);
        java.lang.String str26 = equation23.toString();
        int int27 = equation23.b();
        int int28 = equation23.b();
        boolean boolean29 = gcdSolutionWrapper19.equals((java.lang.Object) equation23);
        int int30 = equation23.a();
        int int31 = equation23.a();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Solution[x=97, y=1]" + "'", str15, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertNotNull(solution25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Equation[a=97, b=0, c=52]" + "'", str26, "Equation[a=97, b=0, c=52]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 97 + "'", int30 == 97);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 97 + "'", int31 == 97);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) (byte) 100, 32);
        int int4 = equation3.b();
        int int5 = equation3.a();
        java.lang.String str6 = equation3.toString();
        int int7 = equation3.b();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equation[a=52, b=100, c=32]" + "'", str6, "Equation[a=52, b=100, c=32]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
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
        boolean boolean40 = solution29.equals((java.lang.Object) 97);
        solution29.setX((int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
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
        gcdSolutionWrapper13.setGcd((int) (short) -1);
        int int24 = gcdSolutionWrapper13.getGcd();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(solution14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str15, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(solution19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (short) 10, (int) '4');
        java.lang.Object obj3 = null;
        boolean boolean4 = solution2.equals(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) '4', (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution3);
        java.lang.String str5 = gcdSolutionWrapper4.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = gcdSolutionWrapper4.getSolution();
        gcdSolutionWrapper4.setGcd(52);
        gcdSolutionWrapper4.setGcd((int) (byte) 10);
        java.lang.String str11 = gcdSolutionWrapper4.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution15 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) '4', (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper16 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution15);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution17 = gcdSolutionWrapper16.getSolution();
        java.lang.String str18 = gcdSolutionWrapper16.toString();
        gcdSolutionWrapper16.setGcd((-1));
        gcdSolutionWrapper16.setGcd((int) (byte) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution25 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(97, (int) (short) 1);
        solution25.setY((-35));
        gcdSolutionWrapper16.setSolution(solution25);
        solution25.setX((int) (byte) -1);
        gcdSolutionWrapper4.setSolution(solution25);
        java.lang.String str32 = gcdSolutionWrapper4.toString();
        java.lang.Class<?> wildcardClass33 = gcdSolutionWrapper4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]" + "'", str5, "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]");
        org.junit.Assert.assertNotNull(solution6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "GcdSolutionWrapper[gcd=10, solution=Solution[x=52, y=52]]" + "'", str11, "GcdSolutionWrapper[gcd=10, solution=Solution[x=52, y=52]]");
        org.junit.Assert.assertNotNull(solution17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]" + "'", str18, "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "GcdSolutionWrapper[gcd=10, solution=Solution[x=-1, y=-35]]" + "'", str32, "GcdSolutionWrapper[gcd=10, solution=Solution[x=-1, y=-35]]");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution1 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int6 = solution5.getY();
        solution5.setY((int) (byte) 1);
        gcdSolutionWrapper2.setSolution(solution5);
        java.lang.String str10 = solution5.toString();
        int int11 = solution5.getX();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Solution[x=97, y=1]" + "'", str10, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) (byte) 100, 32);
        int int4 = equation3.b();
        int int5 = equation3.b();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) 1, (int) (short) 100);
        solution2.setX(35);
        java.lang.String str5 = solution2.toString();
        int int6 = solution2.getX();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Solution[x=35, y=100]" + "'", str5, "Solution[x=35, y=100]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (short) 0, (int) (byte) 1);
        java.lang.Object obj3 = null;
        boolean boolean4 = solution2.equals(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) '4', (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution3);
        java.lang.String str5 = gcdSolutionWrapper4.toString();
        int int6 = gcdSolutionWrapper4.getGcd();
        int int7 = gcdSolutionWrapper4.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution10 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) '4', (int) (byte) 0);
        gcdSolutionWrapper4.setSolution(solution10);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution14 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) '#', (int) (short) 1);
        boolean boolean15 = gcdSolutionWrapper4.equals((java.lang.Object) '#');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]" + "'", str5, "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(0, 35);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution3);
        solution3.setY((int) '#');
        int int7 = solution3.getY();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution1 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution1);
        gcdSolutionWrapper2.setGcd((int) ' ');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int8 = solution7.getY();
        java.lang.String str9 = solution7.toString();
        gcdSolutionWrapper2.setSolution(solution7);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution11 = gcdSolutionWrapper2.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution12 = gcdSolutionWrapper2.getSolution();
        int int13 = solution12.getY();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Solution[x=97, y=1]" + "'", str9, "Solution[x=97, y=1]");
        org.junit.Assert.assertNotNull(solution11);
        org.junit.Assert.assertNotNull(solution12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution4 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        int int5 = solution4.getX();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        int int10 = equation9.c();
        int int11 = equation9.c();
        int int12 = equation9.a();
        boolean boolean13 = solution4.equals((java.lang.Object) equation9);
        int int14 = equation9.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution15 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation9);
        solution15.setY((int) (byte) 1);
        solution15.setY((int) 'a');
        org.junit.Assert.assertNotNull(solution4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertNotNull(solution15);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
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
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution36 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(10, 0);
        int int37 = solution36.getX();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper38 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (short) -1, solution36);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution41 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper42 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution41);
        gcdSolutionWrapper42.setGcd((int) ' ');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution47 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int48 = solution47.getY();
        java.lang.String str49 = solution47.toString();
        gcdSolutionWrapper42.setSolution(solution47);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution54 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int55 = solution54.getY();
        solution54.setY((int) (byte) 1);
        boolean boolean59 = solution54.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper60 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution54);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution61 = gcdSolutionWrapper60.getSolution();
        java.lang.String str62 = gcdSolutionWrapper60.toString();
        gcdSolutionWrapper60.setGcd((int) (byte) 1);
        int int65 = gcdSolutionWrapper60.getGcd();
        boolean boolean66 = solution47.equals((java.lang.Object) gcdSolutionWrapper60);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper67 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) ' ', solution47);
        gcdSolutionWrapper38.setSolution(solution47);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper69 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(97, solution47);
        gcdSolutionWrapper15.setSolution(solution47);
        int int71 = gcdSolutionWrapper15.getGcd();
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Solution[x=97, y=1]" + "'", str49, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(solution61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str62, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
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
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation32 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution33 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation32);
        int int34 = solution33.getX();
        int int35 = solution33.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper36 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) ' ', solution33);
        gcdSolutionWrapper9.setSolution(solution33);
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
        org.junit.Assert.assertNotNull(solution33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (short) -1, (int) (byte) 0, (-75));
        int int4 = equation3.c();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-75) + "'", int4 == (-75));
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
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
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution17 = gcdSolutionWrapper16.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation21 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int22 = equation21.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution23 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation21);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution25 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper26 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution25);
        boolean boolean28 = gcdSolutionWrapper26.equals((java.lang.Object) 1);
        boolean boolean29 = equation21.equals((java.lang.Object) boolean28);
        int int30 = equation21.c();
        boolean boolean31 = gcdSolutionWrapper16.equals((java.lang.Object) equation21);
        java.lang.String str32 = gcdSolutionWrapper16.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution33 = gcdSolutionWrapper16.getSolution();
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(solution15);
        org.junit.Assert.assertNotNull(solution17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertNotNull(solution23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "GcdSolutionWrapper[gcd=100, solution=Solution[x=0, y=0]]" + "'", str32, "GcdSolutionWrapper[gcd=100, solution=Solution[x=0, y=0]]");
        org.junit.Assert.assertNotNull(solution33);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation4);
        int int6 = solution5.getX();
        int int7 = solution5.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) 'a', solution5);
        gcdSolutionWrapper8.setGcd((int) '#');
        java.lang.String str11 = gcdSolutionWrapper8.toString();
        gcdSolutionWrapper8.setGcd(96);
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "GcdSolutionWrapper[gcd=35, solution=Solution[x=0, y=0]]" + "'", str11, "GcdSolutionWrapper[gcd=35, solution=Solution[x=0, y=0]]");
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
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
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation63 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(0, (int) (short) 100, (int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution64 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation63);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper65 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution64);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation69 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) ' ', 52, 100);
        int int70 = equation69.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation74 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int75 = equation74.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution76 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation74);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution78 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper79 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution78);
        boolean boolean81 = gcdSolutionWrapper79.equals((java.lang.Object) 1);
        boolean boolean82 = equation74.equals((java.lang.Object) boolean81);
        int int83 = equation74.a();
        int int84 = equation74.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution86 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper87 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution86);
        gcdSolutionWrapper87.setGcd((int) ' ');
        gcdSolutionWrapper87.setGcd((int) (short) 1);
        int int92 = gcdSolutionWrapper87.getGcd();
        int int93 = gcdSolutionWrapper87.getGcd();
        boolean boolean94 = equation74.equals((java.lang.Object) int93);
        boolean boolean95 = equation69.equals((java.lang.Object) equation74);
        java.lang.String str96 = equation74.toString();
        boolean boolean97 = solution64.equals((java.lang.Object) str96);
        gcdSolutionWrapper58.setSolution(solution64);
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
        org.junit.Assert.assertNotNull(solution64);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 32 + "'", int70 == 32);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 35 + "'", int75 == 35);
        org.junit.Assert.assertNotNull(solution76);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 1 + "'", int92 == 1);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 1 + "'", int93 == 1);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str96, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        int int4 = equation3.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        java.lang.String str6 = equation3.toString();
        int int7 = equation3.b();
        int int8 = equation3.b();
        java.lang.String str9 = equation3.toString();
        int int10 = equation3.b();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equation[a=97, b=0, c=52]" + "'", str6, "Equation[a=97, b=0, c=52]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equation[a=97, b=0, c=52]" + "'", str9, "Equation[a=97, b=0, c=52]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
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
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution21 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        java.lang.String str22 = equation3.toString();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(solution14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str15, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str19, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertNotNull(solution20);
        org.junit.Assert.assertNotNull(solution21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str22, "Equation[a=0, b=-1, c=35]");
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((-1), 125, 1);
        int int4 = equation3.b();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 125 + "'", int4 == 125);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
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
        int int52 = gcdSolutionWrapper24.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution55 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int56 = solution55.getY();
        java.lang.String str57 = solution55.toString();
        int int58 = solution55.getX();
        int int59 = solution55.getY();
        solution55.setY((int) (short) 100);
        int int62 = solution55.getX();
        gcdSolutionWrapper24.setSolution(solution55);
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
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 32 + "'", int52 == 32);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Solution[x=97, y=1]" + "'", str57, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 97 + "'", int58 == 97);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 97 + "'", int62 == 97);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int4 = equation3.c();
        int int5 = equation3.a();
        int int6 = equation3.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        int int8 = equation3.b();
        int int9 = equation3.a();
        java.lang.String str10 = equation3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(solution7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str10, "Equation[a=0, b=-1, c=35]");
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (short) -1, 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((-35), solution3);
        java.lang.String str5 = gcdSolutionWrapper4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GcdSolutionWrapper[gcd=-35, solution=Solution[x=-1, y=1]]" + "'", str5, "GcdSolutionWrapper[gcd=-35, solution=Solution[x=-1, y=1]]");
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
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
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution22 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int23 = solution22.getY();
        java.lang.String str24 = solution22.toString();
        solution22.setX((int) (short) 1);
        boolean boolean28 = solution22.equals((java.lang.Object) (-1.0f));
        java.lang.String str29 = solution22.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation33 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        java.lang.String str34 = equation33.toString();
        int int35 = equation33.c();
        boolean boolean36 = solution22.equals((java.lang.Object) equation33);
        int int37 = equation33.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution38 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation33);
        boolean boolean39 = gcdSolutionWrapper13.equals((java.lang.Object) equation33);
        int int40 = equation33.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution41 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation33);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(solution14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str15, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(solution19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Solution[x=97, y=1]" + "'", str24, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Solution[x=1, y=1]" + "'", str29, "Solution[x=1, y=1]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str34, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 35 + "'", int35 == 35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(solution38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(solution41);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) '4', (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution3);
        gcdSolutionWrapper4.setGcd(0);
        java.lang.Object obj7 = null;
        boolean boolean8 = gcdSolutionWrapper4.equals(obj7);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution11 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) 100, (int) (byte) -1);
        gcdSolutionWrapper4.setSolution(solution11);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution15 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((-35), (int) '4');
        java.lang.String str16 = solution15.toString();
        java.lang.String str17 = solution15.toString();
        gcdSolutionWrapper4.setSolution(solution15);
        java.lang.String str19 = solution15.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Solution[x=-35, y=52]" + "'", str16, "Solution[x=-35, y=52]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Solution[x=-35, y=52]" + "'", str17, "Solution[x=-35, y=52]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Solution[x=-35, y=52]" + "'", str19, "Solution[x=-35, y=52]");
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation4);
        int int6 = solution5.getX();
        int int7 = solution5.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) 'a', solution5);
        boolean boolean10 = solution5.equals((java.lang.Object) '#');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution12 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution12);
        boolean boolean14 = solution5.equals((java.lang.Object) (byte) 1);
        solution5.setX(35);
        solution5.setX((int) (byte) 1);
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution4 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        solution4.setY((int) (byte) 10);
        int int7 = solution4.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation11 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(35, (int) '#', (int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution12 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation11);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation16 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution20 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int21 = solution20.getY();
        solution20.setY((int) (byte) 1);
        boolean boolean25 = solution20.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper26 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution20);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution27 = gcdSolutionWrapper26.getSolution();
        java.lang.String str28 = gcdSolutionWrapper26.toString();
        gcdSolutionWrapper26.setGcd((int) (byte) 1);
        boolean boolean31 = equation16.equals((java.lang.Object) gcdSolutionWrapper26);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation35 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int36 = equation35.c();
        int int37 = equation35.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution38 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation35);
        boolean boolean39 = gcdSolutionWrapper26.equals((java.lang.Object) solution38);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation43 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        java.lang.String str44 = equation43.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution45 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation43);
        solution45.setY((int) (byte) 10);
        gcdSolutionWrapper26.setSolution(solution45);
        boolean boolean49 = equation11.equals((java.lang.Object) gcdSolutionWrapper26);
        java.lang.String str50 = gcdSolutionWrapper26.toString();
        boolean boolean51 = solution4.equals((java.lang.Object) gcdSolutionWrapper26);
        org.junit.Assert.assertNotNull(solution4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(solution12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(solution27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str28, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(solution38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str44, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertNotNull(solution45);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=Solution[x=0, y=10]]" + "'", str50, "GcdSolutionWrapper[gcd=1, solution=Solution[x=0, y=10]]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, (-1), (int) ' ');
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution4 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        int int5 = equation3.c();
        int int6 = equation3.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        org.junit.Assert.assertNotNull(solution4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(solution7);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int5 = solution4.getY();
        java.lang.String str6 = solution4.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation10 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        int int11 = equation10.c();
        int int12 = equation10.a();
        int int13 = equation10.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution14 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation10);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation18 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int19 = equation18.c();
        int int20 = equation18.b();
        int int21 = equation18.c();
        boolean boolean22 = solution14.equals((java.lang.Object) equation18);
        boolean boolean23 = solution4.equals((java.lang.Object) boolean22);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper24 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) '4', solution4);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper25 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 10, solution4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Solution[x=97, y=1]" + "'", str6, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNotNull(solution14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (short) -1, 32, 0);
        java.lang.String str4 = equation3.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation10 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution11 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation10);
        int int12 = solution11.getX();
        int int13 = solution11.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper14 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) 'a', solution11);
        gcdSolutionWrapper14.setGcd((int) (short) 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution20 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(1, 52);
        int int21 = solution20.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper22 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((-1), solution20);
        boolean boolean23 = gcdSolutionWrapper14.equals((java.lang.Object) solution20);
        java.lang.String str24 = solution20.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper25 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(97, solution20);
        boolean boolean26 = equation3.equals((java.lang.Object) gcdSolutionWrapper25);
        java.lang.String str27 = equation3.toString();
        int int28 = equation3.c();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equation[a=-1, b=32, c=0]" + "'", str4, "Equation[a=-1, b=32, c=0]");
        org.junit.Assert.assertNotNull(solution11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Solution[x=1, y=52]" + "'", str24, "Solution[x=1, y=52]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Equation[a=-1, b=32, c=0]" + "'", str27, "Equation[a=-1, b=32, c=0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (short) 10, 10, 52);
        java.lang.String str4 = equation3.toString();
        int int5 = equation3.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        java.lang.String str7 = equation3.toString();
        int int8 = equation3.c();
        java.lang.String str9 = equation3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equation[a=10, b=10, c=52]" + "'", str4, "Equation[a=10, b=10, c=52]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(solution6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equation[a=10, b=10, c=52]" + "'", str7, "Equation[a=10, b=10, c=52]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equation[a=10, b=10, c=52]" + "'", str9, "Equation[a=10, b=10, c=52]");
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
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
        java.lang.String str34 = solution2.toString();
        int int35 = solution2.getY();
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Solution[x=1, y=1]" + "'", str34, "Solution[x=1, y=1]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution2);
        gcdSolutionWrapper3.setGcd((int) ' ');
        gcdSolutionWrapper3.setGcd((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution8 = gcdSolutionWrapper3.getSolution();
        int int9 = gcdSolutionWrapper3.getGcd();
        gcdSolutionWrapper3.setGcd(0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation15 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution16 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation15);
        solution16.setY(0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation22 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (short) 10, 10, 52);
        boolean boolean23 = solution16.equals((java.lang.Object) (short) 10);
        gcdSolutionWrapper3.setSolution(solution16);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution28 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int29 = solution28.getY();
        java.lang.String str30 = solution28.toString();
        solution28.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper33 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((-35), solution28);
        java.lang.String str34 = solution28.toString();
        gcdSolutionWrapper3.setSolution(solution28);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper36 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution28);
        java.lang.String str37 = gcdSolutionWrapper36.toString();
        org.junit.Assert.assertNull(solution8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(solution16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Solution[x=97, y=1]" + "'", str30, "Solution[x=97, y=1]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Solution[x=1, y=1]" + "'", str34, "Solution[x=1, y=1]");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=1, y=1]]" + "'", str37, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=1, y=1]]");
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (short) 1, 10);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) -1, (-1), 125);
        int int4 = equation3.a();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation4);
        solution5.setY(0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(97, solution5);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation12 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        int int13 = equation12.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution14 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation12);
        int int15 = solution14.getX();
        gcdSolutionWrapper8.setSolution(solution14);
        solution14.setY((int) (short) 10);
        int int19 = solution14.getY();
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(solution14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(125, (-75), 100);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution1 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution1);
        gcdSolutionWrapper2.setGcd((int) ' ');
        int int5 = gcdSolutionWrapper2.getGcd();
        int int6 = gcdSolutionWrapper2.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = gcdSolutionWrapper2.getSolution();
        gcdSolutionWrapper2.setGcd(1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNull(solution7);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
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
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution29 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper30 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution29);
        boolean boolean32 = gcdSolutionWrapper30.equals((java.lang.Object) 1);
        java.lang.String str33 = gcdSolutionWrapper30.toString();
        gcdSolutionWrapper30.setGcd(32);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution38 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) 100, (int) (byte) -1);
        gcdSolutionWrapper30.setSolution(solution38);
        int int40 = solution38.getX();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper41 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution38);
        java.lang.String str42 = solution38.toString();
        solution38.setX((int) (byte) 10);
        int int45 = solution38.getX();
        gcdSolutionWrapper22.setSolution(solution38);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation50 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 1, (int) (short) 10, (int) (short) -1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution51 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation50);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution52 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation50);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution56 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int57 = solution56.getY();
        solution56.setY((int) (byte) 1);
        boolean boolean61 = solution56.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper62 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution56);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution65 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int66 = solution65.getY();
        java.lang.String str67 = solution65.toString();
        boolean boolean69 = solution65.equals((java.lang.Object) (-1L));
        gcdSolutionWrapper62.setSolution(solution65);
        int int71 = solution65.getX();
        boolean boolean72 = equation50.equals((java.lang.Object) solution65);
        java.lang.String str73 = equation50.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution74 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation50);
        java.lang.String str75 = solution74.toString();
        boolean boolean76 = solution38.equals((java.lang.Object) str75);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(solution15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str16, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(solution21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "GcdSolutionWrapper[gcd=100, solution=Solution[x=97, y=1]]" + "'", str26, "GcdSolutionWrapper[gcd=100, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=null]" + "'", str33, "GcdSolutionWrapper[gcd=1, solution=null]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Solution[x=100, y=-1]" + "'", str42, "Solution[x=100, y=-1]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertNotNull(solution51);
        org.junit.Assert.assertNotNull(solution52);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Solution[x=97, y=1]" + "'", str67, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 97 + "'", int71 == 97);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Equation[a=1, b=10, c=-1]" + "'", str73, "Equation[a=1, b=10, c=-1]");
        org.junit.Assert.assertNotNull(solution74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "Solution[x=-1, y=0]" + "'", str75, "Solution[x=-1, y=0]");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(32, (int) ' ');
        java.lang.String str3 = solution2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Solution[x=32, y=32]" + "'", str3, "Solution[x=32, y=32]");
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
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
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution50 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int51 = solution50.getY();
        solution50.setY((int) (byte) 1);
        boolean boolean55 = solution50.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper56 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution50);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution57 = gcdSolutionWrapper56.getSolution();
        java.lang.String str58 = gcdSolutionWrapper56.toString();
        gcdSolutionWrapper56.setGcd((int) (byte) 1);
        java.lang.String str61 = gcdSolutionWrapper56.toString();
        gcdSolutionWrapper56.setGcd(1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution64 = gcdSolutionWrapper56.getSolution();
        boolean boolean65 = gcdSolutionWrapper15.equals((java.lang.Object) gcdSolutionWrapper56);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution66 = gcdSolutionWrapper56.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution67 = gcdSolutionWrapper56.getSolution();
        java.lang.String str68 = gcdSolutionWrapper56.toString();
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
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(solution57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str58, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]" + "'", str61, "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertNotNull(solution64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(solution66);
        org.junit.Assert.assertNotNull(solution67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]" + "'", str68, "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]");
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
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
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution22 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution25 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper26 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution25);
        gcdSolutionWrapper26.setGcd((int) ' ');
        gcdSolutionWrapper26.setGcd((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution31 = gcdSolutionWrapper26.getSolution();
        int int32 = gcdSolutionWrapper26.getGcd();
        gcdSolutionWrapper26.setGcd(0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation38 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution39 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation38);
        solution39.setY(0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation45 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (short) 10, 10, 52);
        boolean boolean46 = solution39.equals((java.lang.Object) (short) 10);
        gcdSolutionWrapper26.setSolution(solution39);
        java.lang.String str48 = solution39.toString();
        int int49 = solution39.getX();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper50 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (short) 100, solution39);
        boolean boolean51 = solution22.equals((java.lang.Object) gcdSolutionWrapper50);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(solution14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str15, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str19, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertNotNull(solution20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(solution22);
        org.junit.Assert.assertNull(solution31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(solution39);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Solution[x=100, y=0]" + "'", str48, "Solution[x=100, y=0]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 100 + "'", int49 == 100);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) ' ', (int) (byte) 10);
        solution2.setY(52);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '#', (int) '4', 125);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 100, (int) (byte) -1, (-35));
        java.lang.String str8 = equation7.toString();
        boolean boolean9 = equation3.equals((java.lang.Object) equation7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Equation[a=100, b=-1, c=-35]" + "'", str8, "Equation[a=100, b=-1, c=-35]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) -1, (int) (byte) 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper5 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 0, solution4);
        solution4.setY((-35));
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) 'a', solution4);
        int int9 = solution4.getX();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int5 = solution4.getY();
        solution4.setY((int) (byte) 1);
        boolean boolean9 = solution4.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper10 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution4);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper11 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution4);
        int int12 = gcdSolutionWrapper11.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution13 = gcdSolutionWrapper11.getSolution();
        gcdSolutionWrapper11.setGcd(97);
        java.lang.String str16 = gcdSolutionWrapper11.toString();
        java.lang.String str17 = gcdSolutionWrapper11.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(solution13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "GcdSolutionWrapper[gcd=97, solution=Solution[x=97, y=1]]" + "'", str16, "GcdSolutionWrapper[gcd=97, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "GcdSolutionWrapper[gcd=97, solution=Solution[x=97, y=1]]" + "'", str17, "GcdSolutionWrapper[gcd=97, solution=Solution[x=97, y=1]]");
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int4 = equation3.c();
        java.lang.String str5 = equation3.toString();
        int int6 = equation3.b();
        java.lang.Object obj7 = null;
        boolean boolean8 = equation3.equals(obj7);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution9 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        solution9.setX(100);
        int int12 = solution9.getY();
        java.lang.Class<?> wildcardClass13 = solution9.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str5, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(solution9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (-35), 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int9 = solution8.getY();
        solution8.setY((int) (byte) 1);
        boolean boolean13 = solution8.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper14 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution8);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution17 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int18 = solution17.getY();
        java.lang.String str19 = solution17.toString();
        boolean boolean21 = solution17.equals((java.lang.Object) (-1L));
        gcdSolutionWrapper14.setSolution(solution17);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper23 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) 'a', solution17);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation27 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        int int28 = equation27.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution29 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation27);
        java.lang.String str30 = equation27.toString();
        int int31 = equation27.b();
        int int32 = equation27.b();
        boolean boolean33 = gcdSolutionWrapper23.equals((java.lang.Object) equation27);
        int int34 = equation27.a();
        boolean boolean35 = equation3.equals((java.lang.Object) equation27);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation39 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution40 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation39);
        int int41 = equation39.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation45 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(52, (int) (byte) -1, (int) (byte) 10);
        boolean boolean46 = equation39.equals((java.lang.Object) (byte) 10);
        boolean boolean47 = equation3.equals((java.lang.Object) (byte) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Solution[x=97, y=1]" + "'", str19, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertNotNull(solution29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Equation[a=97, b=0, c=52]" + "'", str30, "Equation[a=97, b=0, c=52]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(solution40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(100, (int) (byte) -1);
        solution2.setY(32);
        java.lang.String str5 = solution2.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Solution[x=100, y=32]" + "'", str5, "Solution[x=100, y=32]");
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        int int4 = equation3.c();
        boolean boolean6 = equation3.equals((java.lang.Object) false);
        java.lang.String str7 = equation3.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution10 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(0, (int) (short) 10);
        boolean boolean11 = equation3.equals((java.lang.Object) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equation[a=97, b=0, c=52]" + "'", str7, "Equation[a=97, b=0, c=52]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(35, (int) (short) 100);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int7 = solution6.getY();
        solution6.setY((int) (byte) 1);
        boolean boolean11 = solution6.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper12 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution6);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution13 = gcdSolutionWrapper12.getSolution();
        java.lang.String str14 = gcdSolutionWrapper12.toString();
        gcdSolutionWrapper12.setGcd((int) (byte) 1);
        java.lang.String str17 = gcdSolutionWrapper12.toString();
        java.lang.String str18 = gcdSolutionWrapper12.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation22 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        int int23 = equation22.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution24 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation22);
        boolean boolean25 = gcdSolutionWrapper12.equals((java.lang.Object) equation22);
        int int26 = equation22.c();
        boolean boolean27 = solution2.equals((java.lang.Object) equation22);
        int int28 = solution2.getY();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(solution13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str14, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]" + "'", str17, "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]" + "'", str18, "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertNotNull(solution24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        java.lang.String str4 = equation3.toString();
        java.lang.Object obj5 = null;
        boolean boolean6 = equation3.equals(obj5);
        int int7 = equation3.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation11 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(32, (-35), (int) (byte) 1);
        int int12 = equation11.b();
        java.lang.String str13 = equation11.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution16 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) 100, (int) (byte) -1);
        int int17 = solution16.getX();
        boolean boolean18 = equation11.equals((java.lang.Object) solution16);
        boolean boolean19 = equation3.equals((java.lang.Object) boolean18);
        int int20 = equation3.c();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str4, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Equation[a=32, b=-35, c=1]" + "'", str13, "Equation[a=32, b=-35, c=1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 1, (int) (short) 10, (int) (short) -1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution4 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        int int6 = equation3.b();
        org.junit.Assert.assertNotNull(solution4);
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
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
        java.lang.String str25 = solution24.toString();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(solution14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str15, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(solution24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Solution[x=-1, y=52]" + "'", str25, "Solution[x=-1, y=52]");
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int5 = solution4.getY();
        solution4.setY((int) (byte) 1);
        boolean boolean9 = solution4.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper10 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution4);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper11 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution4);
        int int12 = gcdSolutionWrapper11.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution13 = gcdSolutionWrapper11.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution16 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) 1, (int) (short) 1);
        int int17 = solution16.getY();
        boolean boolean18 = gcdSolutionWrapper11.equals((java.lang.Object) int17);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(solution13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(10, 0);
        int int3 = solution2.getX();
        solution2.setY(1);
        solution2.setX((int) (short) 0);
        java.lang.String str8 = solution2.toString();
        java.lang.String str9 = solution2.toString();
        int int10 = solution2.getX();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Solution[x=0, y=1]" + "'", str8, "Solution[x=0, y=1]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Solution[x=0, y=1]" + "'", str9, "Solution[x=0, y=1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
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
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution17 = gcdSolutionWrapper16.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation21 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int22 = equation21.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution23 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation21);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution25 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper26 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution25);
        boolean boolean28 = gcdSolutionWrapper26.equals((java.lang.Object) 1);
        boolean boolean29 = equation21.equals((java.lang.Object) boolean28);
        int int30 = equation21.c();
        boolean boolean31 = gcdSolutionWrapper16.equals((java.lang.Object) equation21);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution35 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int36 = solution35.getY();
        java.lang.String str37 = solution35.toString();
        solution35.setX((int) (short) 1);
        boolean boolean41 = solution35.equals((java.lang.Object) true);
        solution35.setY(32);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper44 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 10, solution35);
        boolean boolean45 = gcdSolutionWrapper16.equals((java.lang.Object) gcdSolutionWrapper44);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution48 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(10, 0);
        int int49 = solution48.getX();
        solution48.setY(1);
        solution48.setX((int) (short) 0);
        java.lang.String str54 = solution48.toString();
        boolean boolean55 = gcdSolutionWrapper44.equals((java.lang.Object) solution48);
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(solution15);
        org.junit.Assert.assertNotNull(solution17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertNotNull(solution23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Solution[x=97, y=1]" + "'", str37, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Solution[x=0, y=1]" + "'", str54, "Solution[x=0, y=1]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(52, 1, 0);
        int int4 = equation3.c();
        java.lang.String str5 = equation3.toString();
        java.lang.String str6 = equation3.toString();
        int int7 = equation3.a();
        int int8 = equation3.b();
        int int9 = equation3.b();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equation[a=52, b=1, c=0]" + "'", str5, "Equation[a=52, b=1, c=0]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equation[a=52, b=1, c=0]" + "'", str6, "Equation[a=52, b=1, c=0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
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
        gcdSolutionWrapper14.setGcd((int) (short) 0);
        int int22 = gcdSolutionWrapper14.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution27 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int28 = solution27.getY();
        java.lang.String str29 = solution27.toString();
        solution27.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper32 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((-35), solution27);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper33 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) ' ', solution27);
        gcdSolutionWrapper14.setSolution(solution27);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper35 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution27);
        java.lang.Object obj36 = null;
        boolean boolean37 = gcdSolutionWrapper35.equals(obj36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(solution15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str16, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Solution[x=97, y=1]" + "'", str29, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
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
        solution29.setY((int) (short) -1);
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
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 1, (int) (short) 10, (int) (short) -1);
        int int4 = equation3.a();
        int int5 = equation3.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(solution6);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
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
        gcdSolutionWrapper10.setGcd((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Solution[x=97, y=1]" + "'", str6, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
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
        solution14.setX((int) (byte) 100);
        int int28 = solution14.getX();
        java.lang.String str29 = solution14.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Solution[x=97, y=1]" + "'", str5, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-35) + "'", int9 == (-35));
        org.junit.Assert.assertNotNull(solution10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "GcdSolutionWrapper[gcd=-35, solution=Solution[x=1, y=1]]" + "'", str11, "GcdSolutionWrapper[gcd=-35, solution=Solution[x=1, y=1]]");
        org.junit.Assert.assertNotNull(solution20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Solution[x=100, y=52]" + "'", str29, "Solution[x=100, y=52]");
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution1 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution1);
        boolean boolean4 = gcdSolutionWrapper2.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution6);
        gcdSolutionWrapper7.setGcd((int) ' ');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution12 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int13 = solution12.getY();
        java.lang.String str14 = solution12.toString();
        gcdSolutionWrapper7.setSolution(solution12);
        gcdSolutionWrapper2.setSolution(solution12);
        int int17 = solution12.getY();
        java.lang.String str18 = solution12.toString();
        solution12.setX((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Solution[x=97, y=1]" + "'", str14, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Solution[x=97, y=1]" + "'", str18, "Solution[x=97, y=1]");
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 10, 0, (int) (short) 10);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (short) 10, 10, 52);
        java.lang.String str4 = equation3.toString();
        int int5 = equation3.b();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equation[a=10, b=10, c=52]" + "'", str4, "Equation[a=10, b=10, c=52]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int3 = solution2.getY();
        java.lang.String str4 = solution2.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution6);
        gcdSolutionWrapper7.setGcd((int) ' ');
        gcdSolutionWrapper7.setGcd((int) (short) 1);
        int int12 = gcdSolutionWrapper7.getGcd();
        gcdSolutionWrapper7.setGcd((int) (byte) -1);
        int int15 = gcdSolutionWrapper7.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution19 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int20 = solution19.getY();
        java.lang.String str21 = solution19.toString();
        solution19.setX((int) (short) 1);
        java.lang.String str24 = solution19.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper25 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(35, solution19);
        boolean boolean26 = gcdSolutionWrapper7.equals((java.lang.Object) solution19);
        boolean boolean27 = solution2.equals((java.lang.Object) gcdSolutionWrapper7);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution29 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper30 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution29);
        gcdSolutionWrapper30.setGcd((int) ' ');
        gcdSolutionWrapper30.setGcd((int) (short) 100);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution37 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int38 = solution37.getY();
        java.lang.String str39 = solution37.toString();
        solution37.setX((int) (short) 1);
        boolean boolean43 = solution37.equals((java.lang.Object) (-1.0f));
        gcdSolutionWrapper30.setSolution(solution37);
        int int45 = gcdSolutionWrapper30.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation49 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution50 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation49);
        solution50.setY((int) (byte) 10);
        solution50.setY((-1));
        int int55 = solution50.getX();
        gcdSolutionWrapper30.setSolution(solution50);
        gcdSolutionWrapper30.setGcd((int) (byte) 1);
        boolean boolean59 = solution2.equals((java.lang.Object) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Solution[x=97, y=1]" + "'", str4, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Solution[x=97, y=1]" + "'", str21, "Solution[x=97, y=1]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Solution[x=1, y=1]" + "'", str24, "Solution[x=1, y=1]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Solution[x=97, y=1]" + "'", str39, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
        org.junit.Assert.assertNotNull(solution50);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 100 + "'", int55 == 100);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution1 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution1);
        gcdSolutionWrapper2.setGcd((int) ' ');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int8 = solution7.getY();
        java.lang.String str9 = solution7.toString();
        gcdSolutionWrapper2.setSolution(solution7);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution11 = gcdSolutionWrapper2.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution15 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper16 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution15);
        boolean boolean18 = gcdSolutionWrapper16.equals((java.lang.Object) 1);
        java.lang.String str19 = gcdSolutionWrapper16.toString();
        gcdSolutionWrapper16.setGcd(32);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution24 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) 100, (int) (byte) -1);
        gcdSolutionWrapper16.setSolution(solution24);
        int int26 = solution24.getX();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper27 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution24);
        java.lang.String str28 = solution24.toString();
        solution24.setX((int) (byte) 10);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper31 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) ' ', solution24);
        gcdSolutionWrapper2.setSolution(solution24);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution35 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) ' ', (int) (short) 10);
        boolean boolean36 = solution24.equals((java.lang.Object) ' ');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Solution[x=97, y=1]" + "'", str9, "Solution[x=97, y=1]");
        org.junit.Assert.assertNotNull(solution11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=null]" + "'", str19, "GcdSolutionWrapper[gcd=1, solution=null]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Solution[x=100, y=-1]" + "'", str28, "Solution[x=100, y=-1]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) 'a', 52, (int) 'a');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int8 = equation7.c();
        int int9 = equation7.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int14 = solution13.getY();
        solution13.setY((int) (byte) 1);
        boolean boolean18 = solution13.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper19 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution13);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution20 = gcdSolutionWrapper19.getSolution();
        java.lang.String str21 = gcdSolutionWrapper19.toString();
        gcdSolutionWrapper19.setGcd((int) (byte) 1);
        boolean boolean24 = equation7.equals((java.lang.Object) gcdSolutionWrapper19);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution25 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation7);
        int int26 = equation7.a();
        boolean boolean27 = equation3.equals((java.lang.Object) equation7);
        java.lang.Class<?> wildcardClass28 = equation7.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(solution20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str21, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(solution25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation4);
        java.lang.String str6 = solution5.toString();
        int int7 = solution5.getX();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((-1), solution5);
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Solution[x=0, y=0]" + "'", str6, "Solution[x=0, y=0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((-1), (-1), 100);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        java.lang.String str4 = equation3.toString();
        java.lang.Object obj5 = null;
        boolean boolean6 = equation3.equals(obj5);
        int int7 = equation3.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation11 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(32, (-35), (int) (byte) 1);
        int int12 = equation11.b();
        java.lang.String str13 = equation11.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution16 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) 100, (int) (byte) -1);
        int int17 = solution16.getX();
        boolean boolean18 = equation11.equals((java.lang.Object) solution16);
        boolean boolean19 = equation3.equals((java.lang.Object) boolean18);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution20 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        int int21 = equation3.c();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str4, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Equation[a=32, b=-35, c=1]" + "'", str13, "Equation[a=32, b=-35, c=1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(solution20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution1 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution1);
        gcdSolutionWrapper2.setGcd((int) ' ');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int8 = solution7.getY();
        java.lang.String str9 = solution7.toString();
        gcdSolutionWrapper2.setSolution(solution7);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution11 = gcdSolutionWrapper2.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution15 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper16 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution15);
        boolean boolean18 = gcdSolutionWrapper16.equals((java.lang.Object) 1);
        java.lang.String str19 = gcdSolutionWrapper16.toString();
        gcdSolutionWrapper16.setGcd(32);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution24 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) 100, (int) (byte) -1);
        gcdSolutionWrapper16.setSolution(solution24);
        int int26 = solution24.getX();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper27 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution24);
        java.lang.String str28 = solution24.toString();
        solution24.setX((int) (byte) 10);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper31 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) ' ', solution24);
        gcdSolutionWrapper2.setSolution(solution24);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution33 = gcdSolutionWrapper2.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation37 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int38 = equation37.c();
        java.lang.String str39 = equation37.toString();
        int int40 = equation37.b();
        java.lang.Object obj41 = null;
        boolean boolean42 = equation37.equals(obj41);
        int int43 = equation37.b();
        boolean boolean44 = gcdSolutionWrapper2.equals((java.lang.Object) equation37);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution48 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int49 = solution48.getY();
        solution48.setY((int) (byte) 1);
        boolean boolean53 = solution48.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper54 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution48);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution55 = gcdSolutionWrapper54.getSolution();
        java.lang.String str56 = gcdSolutionWrapper54.toString();
        gcdSolutionWrapper54.setGcd((int) (byte) 1);
        java.lang.String str59 = gcdSolutionWrapper54.toString();
        java.lang.String str60 = gcdSolutionWrapper54.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation64 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        int int65 = equation64.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution66 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation64);
        boolean boolean67 = gcdSolutionWrapper54.equals((java.lang.Object) equation64);
        int int68 = equation64.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution69 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation64);
        boolean boolean70 = equation37.equals((java.lang.Object) solution69);
        solution69.setX((-75));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Solution[x=97, y=1]" + "'", str9, "Solution[x=97, y=1]");
        org.junit.Assert.assertNotNull(solution11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=null]" + "'", str19, "GcdSolutionWrapper[gcd=1, solution=null]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Solution[x=100, y=-1]" + "'", str28, "Solution[x=100, y=-1]");
        org.junit.Assert.assertNotNull(solution33);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 35 + "'", int38 == 35);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str39, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(solution55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str56, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]" + "'", str59, "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]" + "'", str60, "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 97 + "'", int65 == 97);
        org.junit.Assert.assertNotNull(solution66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 97 + "'", int68 == 97);
        org.junit.Assert.assertNotNull(solution69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (short) -1, (int) (byte) 100);
        int int3 = solution2.getX();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
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
        int int46 = equation3.c();
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
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 32 + "'", int46 == 32);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation5 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation5);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation5);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(1, solution7);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution7);
        int int10 = gcdSolutionWrapper9.getGcd();
        org.junit.Assert.assertNotNull(solution6);
        org.junit.Assert.assertNotNull(solution7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (short) 1, (int) (byte) 100);
        int int4 = solution3.getX();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper5 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (short) -1, solution3);
        int int6 = solution3.getY();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
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
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution25 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) 100, (int) ' ');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper26 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (short) 10, solution25);
        gcdSolutionWrapper26.setGcd(97);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution32 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) 100, (int) ' ');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper33 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (short) 10, solution32);
        gcdSolutionWrapper33.setGcd(97);
        boolean boolean36 = gcdSolutionWrapper26.equals((java.lang.Object) gcdSolutionWrapper33);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation40 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution41 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation40);
        solution41.setY((int) (byte) 10);
        int int44 = solution41.getY();
        boolean boolean45 = gcdSolutionWrapper26.equals((java.lang.Object) solution41);
        boolean boolean46 = gcdSolutionWrapper15.equals((java.lang.Object) gcdSolutionWrapper26);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution49 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) 10, 0);
        gcdSolutionWrapper26.setSolution(solution49);
        solution49.setY(1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(solution16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str17, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(solution21);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(solution41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
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
        com.thealgorithms.maths.LinearDiophantineEquationsSolver linearDiophantineEquationsSolver70 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver();
        boolean boolean71 = equation24.equals((java.lang.Object) linearDiophantineEquationsSolver70);
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
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution1 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution1);
        boolean boolean4 = gcdSolutionWrapper2.equals((java.lang.Object) 1);
        gcdSolutionWrapper2.setGcd(10);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) '#', 0);
        gcdSolutionWrapper2.setSolution(solution9);
        int int11 = gcdSolutionWrapper2.getGcd();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '#', 52, 32);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int8 = solution7.getY();
        java.lang.String str9 = solution7.toString();
        solution7.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation15 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int16 = equation15.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution17 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation15);
        boolean boolean18 = solution7.equals((java.lang.Object) solution17);
        boolean boolean20 = solution17.equals((java.lang.Object) 0);
        boolean boolean21 = equation4.equals((java.lang.Object) solution17);
        boolean boolean23 = solution17.equals((java.lang.Object) (byte) -1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation28 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution29 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation28);
        solution29.setY(0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper32 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution29);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation36 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution37 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation36);
        solution37.setY((int) (byte) 10);
        boolean boolean40 = solution29.equals((java.lang.Object) (byte) 10);
        boolean boolean41 = solution17.equals((java.lang.Object) (byte) 10);
        int int42 = solution17.getX();
        solution17.setY((int) (byte) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper45 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (short) -1, solution17);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution48 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) 100, (int) ' ');
        java.lang.String str49 = solution48.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution52 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(100, (int) (byte) -1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation56 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int57 = equation56.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution58 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation56);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution60 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper61 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution60);
        boolean boolean63 = gcdSolutionWrapper61.equals((java.lang.Object) 1);
        boolean boolean64 = equation56.equals((java.lang.Object) boolean63);
        int int65 = equation56.a();
        boolean boolean66 = solution52.equals((java.lang.Object) int65);
        solution52.setY(10);
        boolean boolean69 = solution48.equals((java.lang.Object) solution52);
        gcdSolutionWrapper45.setSolution(solution48);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution71 = gcdSolutionWrapper45.getSolution();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Solution[x=97, y=1]" + "'", str9, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertNotNull(solution17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(solution29);
        org.junit.Assert.assertNotNull(solution37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Solution[x=100, y=32]" + "'", str49, "Solution[x=100, y=32]");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 35 + "'", int57 == 35);
        org.junit.Assert.assertNotNull(solution58);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(solution71);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (short) 0, (int) (byte) -1);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
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
        gcdSolutionWrapper15.setGcd(10);
        gcdSolutionWrapper15.setGcd(1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution26 = gcdSolutionWrapper15.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution30 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) '4', (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper31 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution30);
        java.lang.String str32 = gcdSolutionWrapper31.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution33 = gcdSolutionWrapper31.getSolution();
        gcdSolutionWrapper31.setGcd(52);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution36 = gcdSolutionWrapper31.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation40 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution41 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation40);
        solution41.setY(0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation47 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (short) 10, 10, 52);
        boolean boolean48 = solution41.equals((java.lang.Object) (short) 10);
        boolean boolean49 = solution36.equals((java.lang.Object) solution41);
        solution36.setX(52);
        boolean boolean52 = gcdSolutionWrapper15.equals((java.lang.Object) solution36);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(solution16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str17, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(solution21);
        org.junit.Assert.assertNotNull(solution26);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]" + "'", str32, "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]");
        org.junit.Assert.assertNotNull(solution33);
        org.junit.Assert.assertNotNull(solution36);
        org.junit.Assert.assertNotNull(solution41);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        int int5 = equation4.a();
        int int6 = equation4.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation4);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution7);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(solution7);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(0, (int) (byte) 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int7 = solution6.getY();
        solution6.setY((int) (byte) 1);
        boolean boolean11 = solution6.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper12 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution6);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution13 = gcdSolutionWrapper12.getSolution();
        java.lang.String str14 = gcdSolutionWrapper12.toString();
        boolean boolean15 = solution2.equals((java.lang.Object) str14);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation19 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 1, (int) (short) 10, (int) (short) -1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution20 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation19);
        int int21 = solution20.getX();
        solution20.setX((-75));
        int int24 = solution20.getY();
        int int25 = solution20.getY();
        boolean boolean26 = solution2.equals((java.lang.Object) solution20);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(solution13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str14, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(solution20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation5 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation5);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation5);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(1, solution7);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution7);
        gcdSolutionWrapper9.setGcd((-35));
        gcdSolutionWrapper9.setGcd((int) (byte) 100);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation17 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution21 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int22 = solution21.getY();
        solution21.setY((int) (byte) 1);
        boolean boolean26 = solution21.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper27 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution21);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution28 = gcdSolutionWrapper27.getSolution();
        java.lang.String str29 = gcdSolutionWrapper27.toString();
        gcdSolutionWrapper27.setGcd((int) (byte) 1);
        boolean boolean32 = equation17.equals((java.lang.Object) gcdSolutionWrapper27);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation36 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int37 = equation36.c();
        int int38 = equation36.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution39 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation36);
        boolean boolean40 = gcdSolutionWrapper27.equals((java.lang.Object) solution39);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation44 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int45 = equation44.c();
        int int46 = equation44.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution50 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int51 = solution50.getY();
        solution50.setY((int) (byte) 1);
        boolean boolean55 = solution50.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper56 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution50);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution57 = gcdSolutionWrapper56.getSolution();
        java.lang.String str58 = gcdSolutionWrapper56.toString();
        gcdSolutionWrapper56.setGcd((int) (byte) 1);
        boolean boolean61 = equation44.equals((java.lang.Object) gcdSolutionWrapper56);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution62 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation44);
        int int63 = solution62.getY();
        boolean boolean64 = gcdSolutionWrapper27.equals((java.lang.Object) int63);
        java.lang.String str65 = gcdSolutionWrapper27.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution66 = gcdSolutionWrapper27.getSolution();
        gcdSolutionWrapper27.setGcd((int) (byte) -1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution72 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int73 = solution72.getY();
        java.lang.String str74 = solution72.toString();
        solution72.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper77 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((-35), solution72);
        int int78 = gcdSolutionWrapper77.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution79 = gcdSolutionWrapper77.getSolution();
        java.lang.String str80 = solution79.toString();
        gcdSolutionWrapper27.setSolution(solution79);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation85 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (short) -1, 0, 97);
        boolean boolean86 = solution79.equals((java.lang.Object) 0);
        gcdSolutionWrapper9.setSolution(solution79);
        org.junit.Assert.assertNotNull(solution6);
        org.junit.Assert.assertNotNull(solution7);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(solution28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str29, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 35 + "'", int37 == 35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(solution39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 35 + "'", int45 == 35);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(solution57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str58, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(solution62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-35) + "'", int63 == (-35));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]" + "'", str65, "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertNotNull(solution66);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "Solution[x=97, y=1]" + "'", str74, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-35) + "'", int78 == (-35));
        org.junit.Assert.assertNotNull(solution79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "Solution[x=1, y=1]" + "'", str80, "Solution[x=1, y=1]");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(32, (int) (byte) 10);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper6 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution5);
        boolean boolean8 = gcdSolutionWrapper6.equals((java.lang.Object) "Equation[a=0, b=-1, c=35]");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution11 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) '4', (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution14 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int15 = solution14.getY();
        java.lang.String str16 = solution14.toString();
        solution14.setX((int) (short) 1);
        boolean boolean20 = solution14.equals((java.lang.Object) (-1.0f));
        java.lang.String str21 = solution14.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation25 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        java.lang.String str26 = equation25.toString();
        int int27 = equation25.c();
        boolean boolean28 = solution14.equals((java.lang.Object) equation25);
        int int29 = equation25.c();
        boolean boolean30 = solution11.equals((java.lang.Object) equation25);
        boolean boolean31 = gcdSolutionWrapper6.equals((java.lang.Object) equation25);
        boolean boolean32 = solution3.equals((java.lang.Object) gcdSolutionWrapper6);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper33 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((-35), solution3);
        solution3.setY((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Solution[x=97, y=1]" + "'", str16, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Solution[x=1, y=1]" + "'", str21, "Solution[x=1, y=1]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str26, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (short) 100, (int) (short) 1);
        solution2.setX((int) (short) 10);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (short) -1, 100, 96);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (short) 10, 10, 100);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution4 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        java.lang.String str5 = equation3.toString();
        int int6 = equation3.a();
        java.lang.Object obj7 = null;
        boolean boolean8 = equation3.equals(obj7);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution9 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        solution9.setX((int) (byte) 100);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution13 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper14 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution13);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution17 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int18 = solution17.getY();
        solution17.setY((int) (byte) 1);
        gcdSolutionWrapper14.setSolution(solution17);
        int int22 = gcdSolutionWrapper14.getGcd();
        int int23 = gcdSolutionWrapper14.getGcd();
        boolean boolean24 = solution9.equals((java.lang.Object) gcdSolutionWrapper14);
        int int25 = gcdSolutionWrapper14.getGcd();
        org.junit.Assert.assertNotNull(solution4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equation[a=10, b=10, c=100]" + "'", str5, "Equation[a=10, b=10, c=100]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(solution9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
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
        solution20.setY((int) (short) 100);
        int int23 = solution20.getY();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(solution16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(solution20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
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
        int int50 = equation3.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation54 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int55 = equation54.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution56 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation54);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution58 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper59 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution58);
        boolean boolean61 = gcdSolutionWrapper59.equals((java.lang.Object) 1);
        boolean boolean62 = equation54.equals((java.lang.Object) boolean61);
        int int63 = equation54.a();
        int int64 = equation54.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution66 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper67 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution66);
        gcdSolutionWrapper67.setGcd((int) ' ');
        gcdSolutionWrapper67.setGcd((int) (short) 1);
        int int72 = gcdSolutionWrapper67.getGcd();
        int int73 = gcdSolutionWrapper67.getGcd();
        boolean boolean74 = equation54.equals((java.lang.Object) int73);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution76 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper77 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution76);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution80 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int81 = solution80.getY();
        solution80.setY((int) (byte) 1);
        gcdSolutionWrapper77.setSolution(solution80);
        boolean boolean85 = equation54.equals((java.lang.Object) gcdSolutionWrapper77);
        boolean boolean86 = equation3.equals((java.lang.Object) equation54);
        java.lang.String str87 = equation54.toString();
        java.lang.String str88 = equation54.toString();
        int int89 = equation54.c();
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
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 35 + "'", int55 == 35);
        org.junit.Assert.assertNotNull(solution56);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str87, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str88, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 35 + "'", int89 == 35);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
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
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation30 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (short) 1, (int) ' ', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution31 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation30);
        boolean boolean32 = equation3.equals((java.lang.Object) equation30);
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
        org.junit.Assert.assertNotNull(solution31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((-35), (int) (short) 1, (-1));
        int int4 = equation3.b();
        int int5 = equation3.b();
        int int6 = equation3.c();
        int int7 = equation3.b();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
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
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation24 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution28 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int29 = solution28.getY();
        solution28.setY((int) (byte) 1);
        boolean boolean33 = solution28.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper34 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution28);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution35 = gcdSolutionWrapper34.getSolution();
        java.lang.String str36 = gcdSolutionWrapper34.toString();
        gcdSolutionWrapper34.setGcd((int) (byte) 1);
        boolean boolean39 = equation24.equals((java.lang.Object) gcdSolutionWrapper34);
        int int40 = gcdSolutionWrapper34.getGcd();
        boolean boolean41 = solution17.equals((java.lang.Object) int40);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper42 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) ' ', solution17);
        java.lang.String str43 = gcdSolutionWrapper42.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(solution6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(solution17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(solution35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str36, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "GcdSolutionWrapper[gcd=32, solution=Solution[x=-75, y=10]]" + "'", str43, "GcdSolutionWrapper[gcd=32, solution=Solution[x=-75, y=10]]");
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution2);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int8 = solution7.getY();
        int int9 = solution7.getX();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper10 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(1, solution7);
        gcdSolutionWrapper3.setSolution(solution7);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper12 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(10, solution7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation5 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int6 = equation5.c();
        int int7 = equation5.b();
        int int8 = equation5.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution9 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation5);
        java.lang.String str10 = solution9.toString();
        int int11 = solution9.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper12 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(10, solution9);
        int int13 = solution9.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper14 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 10, solution9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNotNull(solution9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Solution[x=0, y=-35]" + "'", str10, "Solution[x=0, y=-35]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-35) + "'", int11 == (-35));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-35) + "'", int13 == (-35));
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) 0, (-35));
        solution2.setX((int) (byte) 10);
        solution2.setX((int) '#');
        int int7 = solution2.getY();
        int int8 = solution2.getY();
        java.lang.String str9 = solution2.toString();
        solution2.setY((int) '#');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution15 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int16 = solution15.getY();
        java.lang.String str17 = solution15.toString();
        solution15.setX((int) (short) 1);
        java.lang.String str20 = solution15.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper21 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(35, solution15);
        java.lang.Object obj22 = null;
        boolean boolean23 = gcdSolutionWrapper21.equals(obj22);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution24 = gcdSolutionWrapper21.getSolution();
        boolean boolean25 = solution2.equals((java.lang.Object) gcdSolutionWrapper21);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution28 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int29 = solution28.getY();
        java.lang.String str30 = solution28.toString();
        java.lang.String str31 = solution28.toString();
        gcdSolutionWrapper21.setSolution(solution28);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution33 = gcdSolutionWrapper21.getSolution();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-35) + "'", int7 == (-35));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-35) + "'", int8 == (-35));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Solution[x=35, y=-35]" + "'", str9, "Solution[x=35, y=-35]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Solution[x=97, y=1]" + "'", str17, "Solution[x=97, y=1]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Solution[x=1, y=1]" + "'", str20, "Solution[x=1, y=1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(solution24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Solution[x=97, y=1]" + "'", str30, "Solution[x=97, y=1]");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Solution[x=97, y=1]" + "'", str31, "Solution[x=97, y=1]");
        org.junit.Assert.assertNotNull(solution33);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
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
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation29 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, (-1), 32);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution30 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation29);
        boolean boolean31 = gcdSolutionWrapper9.equals((java.lang.Object) equation29);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution32 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation29);
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
        org.junit.Assert.assertNotNull(solution30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(solution32);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(0, 32, (int) '#');
        int int4 = equation3.c();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int6 = solution5.getY();
        solution5.setY((int) (byte) 1);
        boolean boolean10 = solution5.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper11 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution5);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution14 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int15 = solution14.getY();
        java.lang.String str16 = solution14.toString();
        boolean boolean18 = solution14.equals((java.lang.Object) (-1L));
        gcdSolutionWrapper11.setSolution(solution14);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper20 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) 'a', solution14);
        int int21 = solution14.getX();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper22 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((-1), solution14);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution23 = gcdSolutionWrapper22.getSolution();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Solution[x=97, y=1]" + "'", str16, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertNotNull(solution23);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (short) 10, (int) ' ', 0);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        int int4 = equation3.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        int int6 = equation3.b();
        int int7 = equation3.a();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (short) 1, 10, (int) (byte) 1);
        int int4 = equation3.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int9 = equation8.c();
        int int10 = equation8.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution11 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation8);
        solution11.setY(0);
        java.lang.String str14 = solution11.toString();
        boolean boolean15 = equation3.equals((java.lang.Object) solution11);
        int int16 = equation3.c();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(solution11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Solution[x=0, y=0]" + "'", str14, "Solution[x=0, y=0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
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
        int int50 = equation3.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation54 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int55 = equation54.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution56 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation54);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution58 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper59 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution58);
        boolean boolean61 = gcdSolutionWrapper59.equals((java.lang.Object) 1);
        boolean boolean62 = equation54.equals((java.lang.Object) boolean61);
        int int63 = equation54.a();
        int int64 = equation54.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution66 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper67 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution66);
        gcdSolutionWrapper67.setGcd((int) ' ');
        gcdSolutionWrapper67.setGcd((int) (short) 1);
        int int72 = gcdSolutionWrapper67.getGcd();
        int int73 = gcdSolutionWrapper67.getGcd();
        boolean boolean74 = equation54.equals((java.lang.Object) int73);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution76 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper77 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution76);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution80 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int81 = solution80.getY();
        solution80.setY((int) (byte) 1);
        gcdSolutionWrapper77.setSolution(solution80);
        boolean boolean85 = equation54.equals((java.lang.Object) gcdSolutionWrapper77);
        boolean boolean86 = equation3.equals((java.lang.Object) equation54);
        int int87 = equation3.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution88 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
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
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 35 + "'", int55 == 35);
        org.junit.Assert.assertNotNull(solution56);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-35) + "'", int87 == (-35));
        org.junit.Assert.assertNotNull(solution88);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
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
        java.lang.String str24 = gcdSolutionWrapper15.toString();
        gcdSolutionWrapper15.setGcd(35);
        gcdSolutionWrapper15.setGcd((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(solution16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str17, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=null]" + "'", str24, "GcdSolutionWrapper[gcd=1, solution=null]");
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (short) 100, 100);
        java.lang.String str3 = solution2.toString();
        int int4 = solution2.getY();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Solution[x=100, y=100]" + "'", str3, "Solution[x=100, y=100]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((-35), (int) (short) 1, (-1));
        int int4 = equation3.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        java.lang.String str8 = equation3.toString();
        int int9 = equation3.a();
        int int10 = equation3.c();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertNotNull(solution6);
        org.junit.Assert.assertNotNull(solution7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Equation[a=-35, b=1, c=-1]" + "'", str8, "Equation[a=-35, b=1, c=-1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-35) + "'", int9 == (-35));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(125, (int) (byte) 10);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution1 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution1);
        gcdSolutionWrapper2.setGcd((int) ' ');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = gcdSolutionWrapper2.getSolution();
        gcdSolutionWrapper2.setGcd((int) (short) -1);
        gcdSolutionWrapper2.setGcd((int) 'a');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int14 = solution13.getY();
        solution13.setY((int) (byte) 1);
        boolean boolean18 = solution13.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper19 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution13);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution20 = gcdSolutionWrapper19.getSolution();
        java.lang.String str21 = gcdSolutionWrapper19.toString();
        gcdSolutionWrapper19.setGcd((int) (byte) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution26 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((-1), (int) '4');
        gcdSolutionWrapper19.setSolution(solution26);
        java.lang.String str28 = solution26.toString();
        solution26.setY((int) ' ');
        solution26.setX(1);
        int int33 = solution26.getX();
        solution26.setY((int) (byte) -1);
        int int36 = solution26.getY();
        gcdSolutionWrapper2.setSolution(solution26);
        org.junit.Assert.assertNull(solution5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(solution20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str21, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Solution[x=-1, y=52]" + "'", str28, "Solution[x=-1, y=52]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) 100, (int) ' ');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (short) 10, solution3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = gcdSolutionWrapper4.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        boolean boolean10 = gcdSolutionWrapper4.equals((java.lang.Object) 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution11 = gcdSolutionWrapper4.getSolution();
        java.lang.String str12 = gcdSolutionWrapper4.toString();
        int int13 = gcdSolutionWrapper4.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution14 = gcdSolutionWrapper4.getSolution();
        int int15 = solution14.getX();
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(solution11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "GcdSolutionWrapper[gcd=10, solution=Solution[x=100, y=32]]" + "'", str12, "GcdSolutionWrapper[gcd=10, solution=Solution[x=100, y=32]]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(solution14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int4 = solution3.getY();
        java.lang.String str5 = solution3.toString();
        solution3.setX((int) (short) 1);
        boolean boolean9 = solution3.equals((java.lang.Object) (-1.0f));
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper10 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 100, solution3);
        java.lang.String str11 = gcdSolutionWrapper10.toString();
        gcdSolutionWrapper10.setGcd((int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Solution[x=97, y=1]" + "'", str5, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "GcdSolutionWrapper[gcd=100, solution=Solution[x=1, y=1]]" + "'", str11, "GcdSolutionWrapper[gcd=100, solution=Solution[x=1, y=1]]");
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int5 = solution4.getY();
        java.lang.String str6 = solution4.toString();
        solution4.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation12 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int13 = equation12.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution14 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation12);
        boolean boolean15 = solution4.equals((java.lang.Object) solution14);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper16 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution14);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution18 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper19 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution18);
        boolean boolean20 = solution14.equals((java.lang.Object) (byte) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper21 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (short) 0, solution14);
        solution14.setY(100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Solution[x=97, y=1]" + "'", str6, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertNotNull(solution14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) '4', (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution3);
        java.lang.String str5 = gcdSolutionWrapper4.toString();
        int int6 = gcdSolutionWrapper4.getGcd();
        int int7 = gcdSolutionWrapper4.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution10 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) '4', (int) (byte) 0);
        gcdSolutionWrapper4.setSolution(solution10);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution12 = gcdSolutionWrapper4.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution17 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int18 = solution17.getY();
        solution17.setY((int) (byte) 1);
        boolean boolean22 = solution17.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper23 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution17);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution26 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int27 = solution26.getY();
        java.lang.String str28 = solution26.toString();
        boolean boolean30 = solution26.equals((java.lang.Object) (-1L));
        gcdSolutionWrapper23.setSolution(solution26);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper32 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) 'a', solution26);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation36 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        int int37 = equation36.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution38 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation36);
        java.lang.String str39 = equation36.toString();
        int int40 = equation36.b();
        int int41 = equation36.b();
        boolean boolean42 = gcdSolutionWrapper32.equals((java.lang.Object) equation36);
        int int43 = equation36.a();
        java.lang.String str44 = equation36.toString();
        boolean boolean45 = gcdSolutionWrapper4.equals((java.lang.Object) equation36);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]" + "'", str5, "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(solution12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Solution[x=97, y=1]" + "'", str28, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 97 + "'", int37 == 97);
        org.junit.Assert.assertNotNull(solution38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Equation[a=97, b=0, c=52]" + "'", str39, "Equation[a=97, b=0, c=52]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 97 + "'", int43 == 97);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Equation[a=97, b=0, c=52]" + "'", str44, "Equation[a=97, b=0, c=52]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) 'a', (int) (byte) 0, 10);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        int int4 = equation3.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        java.lang.String str6 = equation3.toString();
        int int7 = equation3.b();
        int int8 = equation3.b();
        int int9 = equation3.c();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Equation[a=97, b=0, c=52]" + "'", str6, "Equation[a=97, b=0, c=52]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) 'a', 52, (int) 'a');
        int int4 = equation3.b();
        int int5 = equation3.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int10 = solution9.getY();
        solution9.setY((int) (byte) 1);
        boolean boolean14 = solution9.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper15 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution9);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution16 = gcdSolutionWrapper15.getSolution();
        java.lang.String str17 = gcdSolutionWrapper15.toString();
        gcdSolutionWrapper15.setGcd((int) (byte) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution22 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((-1), (int) '4');
        gcdSolutionWrapper15.setSolution(solution22);
        java.lang.Class<?> wildcardClass24 = gcdSolutionWrapper15.getClass();
        boolean boolean25 = equation3.equals((java.lang.Object) gcdSolutionWrapper15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(solution16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str17, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((-35), (int) (short) 1, (-1));
        int int4 = equation3.b();
        int int5 = equation3.c();
        int int6 = equation3.c();
        java.lang.String str7 = equation3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equation[a=-35, b=1, c=-1]" + "'", str7, "Equation[a=-35, b=1, c=-1]");
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int4 = solution3.getY();
        java.lang.String str5 = solution3.toString();
        solution3.setX((int) (short) 1);
        boolean boolean9 = solution3.equals((java.lang.Object) (-1.0f));
        java.lang.String str10 = solution3.toString();
        java.lang.String str11 = solution3.toString();
        java.lang.String str12 = solution3.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution3);
        solution3.setY((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Solution[x=97, y=1]" + "'", str5, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Solution[x=1, y=1]" + "'", str10, "Solution[x=1, y=1]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Solution[x=1, y=1]" + "'", str11, "Solution[x=1, y=1]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Solution[x=1, y=1]" + "'", str12, "Solution[x=1, y=1]");
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', 96);
        java.lang.Class<?> wildcardClass3 = solution2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
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
        int int19 = equation3.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution23 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(1, 52);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation28 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution29 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation28);
        int int30 = solution29.getX();
        int int31 = solution29.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper32 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) 'a', solution29);
        boolean boolean33 = solution23.equals((java.lang.Object) 'a');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper34 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((-35), solution23);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution35 = gcdSolutionWrapper34.getSolution();
        boolean boolean36 = equation3.equals((java.lang.Object) gcdSolutionWrapper34);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution39 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int40 = solution39.getY();
        java.lang.String str41 = solution39.toString();
        solution39.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation47 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, 0, (int) (short) -1);
        boolean boolean48 = solution39.equals((java.lang.Object) equation47);
        int int49 = equation47.a();
        java.lang.String str50 = equation47.toString();
        boolean boolean51 = gcdSolutionWrapper34.equals((java.lang.Object) equation47);
        java.lang.Class<?> wildcardClass52 = equation47.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(solution14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str15, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertNotNull(solution29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(solution35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Solution[x=97, y=1]" + "'", str41, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Equation[a=0, b=0, c=-1]" + "'", str50, "Equation[a=0, b=0, c=-1]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int5 = equation4.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation4);
        java.lang.String str7 = solution6.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(1, solution6);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(solution6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Solution[x=0, y=-35]" + "'", str7, "Solution[x=0, y=-35]");
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) 100, (int) ' ');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (short) 10, solution3);
        gcdSolutionWrapper4.setGcd(97);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution10 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) 100, (int) ' ');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper11 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (short) 10, solution10);
        gcdSolutionWrapper11.setGcd(97);
        boolean boolean14 = gcdSolutionWrapper4.equals((java.lang.Object) gcdSolutionWrapper11);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution17 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) -1, 52);
        solution17.setY((-75));
        gcdSolutionWrapper11.setSolution(solution17);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution24 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) 100, (int) ' ');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper25 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (short) 10, solution24);
        gcdSolutionWrapper25.setGcd(97);
        gcdSolutionWrapper25.setGcd(0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution32 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(32, (int) (byte) 10);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution36 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int37 = solution36.getY();
        solution36.setY((int) (byte) 1);
        boolean boolean41 = solution36.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper42 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution36);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution45 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int46 = solution45.getY();
        java.lang.String str47 = solution45.toString();
        boolean boolean49 = solution45.equals((java.lang.Object) (-1L));
        gcdSolutionWrapper42.setSolution(solution45);
        int int51 = solution45.getX();
        int int52 = solution45.getY();
        solution45.setY((int) (short) 10);
        solution45.setY(35);
        solution45.setX(0);
        boolean boolean59 = solution32.equals((java.lang.Object) solution45);
        gcdSolutionWrapper25.setSolution(solution32);
        boolean boolean61 = solution17.equals((java.lang.Object) solution32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Solution[x=97, y=1]" + "'", str47, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 97 + "'", int51 == 97);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (short) 10, (-75), (int) (short) 10);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution1 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution1);
        gcdSolutionWrapper2.setGcd((int) ' ');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int8 = solution7.getY();
        java.lang.String str9 = solution7.toString();
        gcdSolutionWrapper2.setSolution(solution7);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution11 = gcdSolutionWrapper2.getSolution();
        int int12 = gcdSolutionWrapper2.getGcd();
        gcdSolutionWrapper2.setGcd((int) (short) 0);
        gcdSolutionWrapper2.setGcd((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Solution[x=97, y=1]" + "'", str9, "Solution[x=97, y=1]");
        org.junit.Assert.assertNotNull(solution11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution2);
        boolean boolean5 = gcdSolutionWrapper3.equals((java.lang.Object) 1);
        java.lang.String str6 = gcdSolutionWrapper3.toString();
        gcdSolutionWrapper3.setGcd(32);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution11 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) 100, (int) (byte) -1);
        gcdSolutionWrapper3.setSolution(solution11);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 10, solution11);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation17 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution21 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int22 = solution21.getY();
        solution21.setY((int) (byte) 1);
        boolean boolean26 = solution21.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper27 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution21);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution28 = gcdSolutionWrapper27.getSolution();
        java.lang.String str29 = gcdSolutionWrapper27.toString();
        gcdSolutionWrapper27.setGcd((int) (byte) 1);
        boolean boolean32 = equation17.equals((java.lang.Object) gcdSolutionWrapper27);
        int int33 = gcdSolutionWrapper27.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution36 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((-1), (int) '4');
        gcdSolutionWrapper27.setSolution(solution36);
        gcdSolutionWrapper13.setSolution(solution36);
        java.lang.String str39 = gcdSolutionWrapper13.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=null]" + "'", str6, "GcdSolutionWrapper[gcd=1, solution=null]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(solution28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str29, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "GcdSolutionWrapper[gcd=10, solution=Solution[x=-1, y=52]]" + "'", str39, "GcdSolutionWrapper[gcd=10, solution=Solution[x=-1, y=52]]");
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) 'a', (int) (short) 10, 32);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(10, 35);
        int int7 = solution6.getY();
        boolean boolean8 = equation3.equals((java.lang.Object) int7);
        int int9 = equation3.c();
        java.lang.String str10 = equation3.toString();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equation[a=97, b=10, c=32]" + "'", str10, "Equation[a=97, b=10, c=32]");
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution4 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        java.lang.String str5 = solution4.toString();
        solution4.setX((int) ' ');
        org.junit.Assert.assertNotNull(solution4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Solution[x=0, y=0]" + "'", str5, "Solution[x=0, y=0]");
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
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
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation23 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int24 = equation23.c();
        int int25 = equation23.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution26 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation23);
        boolean boolean27 = gcdSolutionWrapper14.equals((java.lang.Object) solution26);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution30 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int31 = solution30.getY();
        java.lang.String str32 = solution30.toString();
        solution30.setX((int) (short) 1);
        boolean boolean36 = solution30.equals((java.lang.Object) true);
        solution30.setY(32);
        gcdSolutionWrapper14.setSolution(solution30);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation43 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((-35), (int) (short) 1, (-1));
        int int44 = equation43.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution45 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation43);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution46 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation43);
        boolean boolean47 = solution30.equals((java.lang.Object) solution46);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper48 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(35, solution30);
        int int49 = gcdSolutionWrapper48.getGcd();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(solution15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str16, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(solution26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Solution[x=97, y=1]" + "'", str32, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(solution45);
        org.junit.Assert.assertNotNull(solution46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 35 + "'", int49 == 35);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
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
        gcdSolutionWrapper16.setGcd((int) '#');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution57 = gcdSolutionWrapper16.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution61 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int62 = solution61.getY();
        java.lang.String str63 = solution61.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation67 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        int int68 = equation67.c();
        int int69 = equation67.a();
        int int70 = equation67.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution71 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation67);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation75 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int76 = equation75.c();
        int int77 = equation75.b();
        int int78 = equation75.c();
        boolean boolean79 = solution71.equals((java.lang.Object) equation75);
        boolean boolean80 = solution61.equals((java.lang.Object) boolean79);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper81 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) '4', solution61);
        java.lang.String str82 = solution61.toString();
        solution61.setY((int) (short) 10);
        java.lang.Object obj85 = null;
        boolean boolean86 = solution61.equals(obj85);
        gcdSolutionWrapper16.setSolution(solution61);
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
        org.junit.Assert.assertNotNull(solution57);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Solution[x=97, y=1]" + "'", str63, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 52 + "'", int68 == 52);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 97 + "'", int69 == 97);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 97 + "'", int70 == 97);
        org.junit.Assert.assertNotNull(solution71);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 35 + "'", int76 == 35);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 35 + "'", int78 == 35);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "Solution[x=97, y=1]" + "'", str82, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
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
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation31 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution32 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation31);
        int int33 = solution32.getX();
        int int34 = solution32.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper35 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) 'a', solution32);
        gcdSolutionWrapper35.setGcd((int) (short) 0);
        gcdSolutionWrapper35.setGcd((int) '4');
        int int40 = gcdSolutionWrapper35.getGcd();
        java.lang.String str41 = gcdSolutionWrapper35.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution44 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(10, 0);
        int int45 = solution44.getX();
        int int46 = solution44.getX();
        gcdSolutionWrapper35.setSolution(solution44);
        boolean boolean48 = solution25.equals((java.lang.Object) gcdSolutionWrapper35);
        gcdSolutionWrapper35.setGcd(125);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution54 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int55 = solution54.getY();
        solution54.setY((int) (byte) 1);
        boolean boolean59 = solution54.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper60 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution54);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution63 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int64 = solution63.getY();
        java.lang.String str65 = solution63.toString();
        boolean boolean67 = solution63.equals((java.lang.Object) (-1L));
        gcdSolutionWrapper60.setSolution(solution63);
        solution63.setX(1);
        solution63.setY((int) (byte) 1);
        int int73 = solution63.getY();
        gcdSolutionWrapper35.setSolution(solution63);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(solution14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str15, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(solution25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(solution32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 52 + "'", int40 == 52);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "GcdSolutionWrapper[gcd=52, solution=Solution[x=0, y=0]]" + "'", str41, "GcdSolutionWrapper[gcd=52, solution=Solution[x=0, y=0]]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Solution[x=97, y=1]" + "'", str65, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
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
        int int22 = gcdSolutionWrapper15.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution24 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper25 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution24);
        gcdSolutionWrapper25.setGcd((int) ' ');
        gcdSolutionWrapper25.setGcd((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution30 = gcdSolutionWrapper25.getSolution();
        int int31 = gcdSolutionWrapper25.getGcd();
        gcdSolutionWrapper25.setGcd(0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation37 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, 0, 10);
        int int38 = equation37.a();
        boolean boolean39 = gcdSolutionWrapper25.equals((java.lang.Object) int38);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation43 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 1, (int) (short) 10, (int) (short) -1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution44 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation43);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution45 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation43);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution49 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int50 = solution49.getY();
        solution49.setY((int) (byte) 1);
        boolean boolean54 = solution49.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper55 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution49);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution58 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int59 = solution58.getY();
        java.lang.String str60 = solution58.toString();
        boolean boolean62 = solution58.equals((java.lang.Object) (-1L));
        gcdSolutionWrapper55.setSolution(solution58);
        int int64 = solution58.getX();
        boolean boolean65 = equation43.equals((java.lang.Object) solution58);
        int int66 = equation43.a();
        boolean boolean67 = gcdSolutionWrapper25.equals((java.lang.Object) equation43);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution68 = gcdSolutionWrapper25.getSolution();
        boolean boolean69 = gcdSolutionWrapper15.equals((java.lang.Object) gcdSolutionWrapper25);
        int int70 = gcdSolutionWrapper15.getGcd();
        java.lang.String str71 = gcdSolutionWrapper15.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(solution16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str17, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(solution21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNull(solution30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(solution44);
        org.junit.Assert.assertNotNull(solution45);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Solution[x=97, y=1]" + "'", str60, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 97 + "'", int64 == 97);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(solution68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]" + "'", str71, "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]");
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (short) -1, (int) (byte) 10);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution3);
        int int5 = gcdSolutionWrapper4.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution7);
        gcdSolutionWrapper8.setGcd((int) ' ');
        gcdSolutionWrapper8.setGcd((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution13 = gcdSolutionWrapper8.getSolution();
        int int14 = gcdSolutionWrapper8.getGcd();
        gcdSolutionWrapper8.setGcd(0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation20 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution21 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation20);
        solution21.setY(0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation27 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (short) 10, 10, 52);
        boolean boolean28 = solution21.equals((java.lang.Object) (short) 10);
        gcdSolutionWrapper8.setSolution(solution21);
        gcdSolutionWrapper4.setSolution(solution21);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation34 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int35 = equation34.c();
        int int36 = equation34.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution40 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int41 = solution40.getY();
        solution40.setY((int) (byte) 1);
        boolean boolean45 = solution40.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper46 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution40);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution47 = gcdSolutionWrapper46.getSolution();
        java.lang.String str48 = gcdSolutionWrapper46.toString();
        gcdSolutionWrapper46.setGcd((int) (byte) 1);
        boolean boolean51 = equation34.equals((java.lang.Object) gcdSolutionWrapper46);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution52 = gcdSolutionWrapper46.getSolution();
        int int53 = solution52.getX();
        solution52.setY((int) 'a');
        gcdSolutionWrapper4.setSolution(solution52);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation60 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution64 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int65 = solution64.getY();
        solution64.setY((int) (byte) 1);
        boolean boolean69 = solution64.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper70 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution64);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution71 = gcdSolutionWrapper70.getSolution();
        java.lang.String str72 = gcdSolutionWrapper70.toString();
        gcdSolutionWrapper70.setGcd((int) (byte) 1);
        boolean boolean75 = equation60.equals((java.lang.Object) gcdSolutionWrapper70);
        gcdSolutionWrapper70.setGcd((int) (short) 0);
        boolean boolean78 = gcdSolutionWrapper4.equals((java.lang.Object) gcdSolutionWrapper70);
        gcdSolutionWrapper4.setGcd((-35));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(solution13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(solution21);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 35 + "'", int35 == 35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(solution47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str48, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(solution52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 97 + "'", int53 == 97);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(solution71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str72, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) 100, (int) ' ');
        int int3 = solution2.getY();
        int int4 = solution2.getX();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, (-1), 32);
        int int4 = equation3.c();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) '4', (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution3);
        gcdSolutionWrapper4.setGcd(0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = gcdSolutionWrapper4.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution8 = gcdSolutionWrapper4.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution12 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) '4', (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution12);
        java.lang.String str14 = gcdSolutionWrapper13.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution15 = gcdSolutionWrapper13.getSolution();
        int int16 = gcdSolutionWrapper13.getGcd();
        int int17 = gcdSolutionWrapper13.getGcd();
        boolean boolean18 = gcdSolutionWrapper4.equals((java.lang.Object) int17);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution19 = null;
        gcdSolutionWrapper4.setSolution(solution19);
        org.junit.Assert.assertNotNull(solution7);
        org.junit.Assert.assertNotNull(solution8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]" + "'", str14, "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]");
        org.junit.Assert.assertNotNull(solution15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((-75), (int) (short) 100);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int4 = equation3.c();
        java.lang.String str5 = equation3.toString();
        int int6 = equation3.b();
        int int7 = equation3.c();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str5, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int4 = equation3.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        int int7 = equation3.b();
        int int8 = equation3.c();
        int int9 = equation3.a();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertNotNull(solution6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '#', (int) (byte) 1, 10);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(0, (int) (short) 100, (int) (short) 1);
        int int4 = equation3.c();
        int int5 = equation3.c();
        int int6 = equation3.a();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
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
        int int28 = solution20.getX();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=null]" + "'", str5, "GcdSolutionWrapper[gcd=1, solution=null]");
        org.junit.Assert.assertNull(solution6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=null]" + "'", str15, "GcdSolutionWrapper[gcd=1, solution=null]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Solution[x=100, y=-1]" + "'", str24, "Solution[x=100, y=-1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int3 = solution2.getY();
        java.lang.String str4 = solution2.toString();
        solution2.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation10 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, 0, (int) (short) -1);
        boolean boolean11 = solution2.equals((java.lang.Object) equation10);
        int int12 = equation10.c();
        int int13 = equation10.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution17 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) 0, (-35));
        solution17.setX((int) (byte) 10);
        int int20 = solution17.getX();
        solution17.setX(10);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper23 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(32, solution17);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation27 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int28 = equation27.c();
        int int29 = equation27.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution30 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation27);
        boolean boolean31 = solution17.equals((java.lang.Object) equation27);
        boolean boolean32 = equation10.equals((java.lang.Object) boolean31);
        int int33 = equation10.c();
        int int34 = equation10.c();
        int int35 = equation10.c();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Solution[x=97, y=1]" + "'", str4, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 35 + "'", int28 == 35);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(solution30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(35, (int) '#', (int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution4 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        int int5 = equation3.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((-35), (int) ' ', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution10 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation9);
        int int11 = equation9.b();
        boolean boolean12 = equation3.equals((java.lang.Object) int11);
        org.junit.Assert.assertNotNull(solution4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(solution10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution2);
        gcdSolutionWrapper3.setGcd((int) ' ');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int9 = solution8.getY();
        java.lang.String str10 = solution8.toString();
        gcdSolutionWrapper3.setSolution(solution8);
        int int12 = gcdSolutionWrapper3.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution15 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int16 = solution15.getY();
        gcdSolutionWrapper3.setSolution(solution15);
        int int18 = solution15.getY();
        solution15.setX(0);
        java.lang.String str21 = solution15.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper22 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution15);
        java.lang.Class<?> wildcardClass23 = gcdSolutionWrapper22.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Solution[x=97, y=1]" + "'", str10, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Solution[x=0, y=1]" + "'", str21, "Solution[x=0, y=1]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(100, (int) (byte) -1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int9 = equation8.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution10 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation8);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution12 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution12);
        boolean boolean15 = gcdSolutionWrapper13.equals((java.lang.Object) 1);
        boolean boolean16 = equation8.equals((java.lang.Object) boolean15);
        int int17 = equation8.a();
        boolean boolean18 = solution4.equals((java.lang.Object) int17);
        solution4.setY(10);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper21 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (short) 1, solution4);
        java.lang.String str22 = solution4.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper23 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(10, solution4);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution24 = gcdSolutionWrapper23.getSolution();
        java.lang.String str25 = gcdSolutionWrapper23.toString();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(solution10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Solution[x=100, y=10]" + "'", str22, "Solution[x=100, y=10]");
        org.junit.Assert.assertNotNull(solution24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "GcdSolutionWrapper[gcd=10, solution=Solution[x=100, y=10]]" + "'", str25, "GcdSolutionWrapper[gcd=10, solution=Solution[x=100, y=10]]");
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
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
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution19 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(32, (int) (byte) 10);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution23 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int24 = solution23.getY();
        solution23.setY((int) (byte) 1);
        boolean boolean28 = solution23.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper29 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution23);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution32 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int33 = solution32.getY();
        java.lang.String str34 = solution32.toString();
        boolean boolean36 = solution32.equals((java.lang.Object) (-1L));
        gcdSolutionWrapper29.setSolution(solution32);
        int int38 = solution32.getX();
        int int39 = solution32.getY();
        solution32.setY((int) (short) 10);
        solution32.setY(35);
        solution32.setX(0);
        boolean boolean46 = solution19.equals((java.lang.Object) solution32);
        java.lang.String str47 = solution19.toString();
        gcdSolutionWrapper2.setSolution(solution19);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution52 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(32, (int) (short) 10);
        int int53 = solution52.getY();
        int int54 = solution52.getY();
        boolean boolean56 = solution52.equals((java.lang.Object) "GcdSolutionWrapper[gcd=100, solution=null]");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper57 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(97, solution52);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution59 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper60 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution59);
        gcdSolutionWrapper60.setGcd((int) ' ');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution65 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int66 = solution65.getY();
        java.lang.String str67 = solution65.toString();
        gcdSolutionWrapper60.setSolution(solution65);
        boolean boolean70 = gcdSolutionWrapper60.equals((java.lang.Object) (short) 0);
        gcdSolutionWrapper60.setGcd((int) (short) 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution73 = gcdSolutionWrapper60.getSolution();
        gcdSolutionWrapper57.setSolution(solution73);
        int int75 = gcdSolutionWrapper57.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution78 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int79 = solution78.getY();
        java.lang.String str80 = solution78.toString();
        solution78.setX((int) (short) 1);
        solution78.setX((int) (byte) 1);
        boolean boolean85 = gcdSolutionWrapper57.equals((java.lang.Object) solution78);
        boolean boolean86 = solution19.equals((java.lang.Object) gcdSolutionWrapper57);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Solution[x=97, y=1]" + "'", str11, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Solution[x=97, y=1]" + "'", str34, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 97 + "'", int38 == 97);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Solution[x=32, y=10]" + "'", str47, "Solution[x=32, y=10]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 10 + "'", int53 == 10);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 10 + "'", int54 == 10);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Solution[x=97, y=1]" + "'", str67, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(solution73);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 97 + "'", int75 == 97);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1 + "'", int79 == 1);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "Solution[x=97, y=1]" + "'", str80, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((-35), (int) (short) 1, (-1));
        int int4 = equation3.b();
        boolean boolean6 = equation3.equals((java.lang.Object) "Equation[a=97, b=-1, c=32]");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        boolean boolean9 = solution7.equals((java.lang.Object) (-1.0f));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(solution7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((-75), (int) (short) -1);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
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
        solution13.setX(1);
        java.lang.String str21 = solution13.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation25 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '#', 52, 32);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution28 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int29 = solution28.getY();
        java.lang.String str30 = solution28.toString();
        solution28.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation36 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int37 = equation36.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution38 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation36);
        boolean boolean39 = solution28.equals((java.lang.Object) solution38);
        boolean boolean41 = solution38.equals((java.lang.Object) 0);
        boolean boolean42 = equation25.equals((java.lang.Object) solution38);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation46 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int47 = equation46.c();
        int int48 = equation46.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution52 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int53 = solution52.getY();
        solution52.setY((int) (byte) 1);
        boolean boolean57 = solution52.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper58 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution52);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution59 = gcdSolutionWrapper58.getSolution();
        java.lang.String str60 = gcdSolutionWrapper58.toString();
        gcdSolutionWrapper58.setGcd((int) (byte) 1);
        boolean boolean63 = equation46.equals((java.lang.Object) gcdSolutionWrapper58);
        boolean boolean64 = equation25.equals((java.lang.Object) equation46);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution65 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation25);
        boolean boolean66 = solution13.equals((java.lang.Object) equation25);
        java.lang.String str67 = solution13.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper68 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) '4', solution13);
        java.lang.String str69 = solution13.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Solution[x=97, y=1]" + "'", str15, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Solution[x=1, y=1]" + "'", str21, "Solution[x=1, y=1]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Solution[x=97, y=1]" + "'", str30, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 35 + "'", int37 == 35);
        org.junit.Assert.assertNotNull(solution38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 35 + "'", int47 == 35);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(solution59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str60, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(solution65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Solution[x=1, y=1]" + "'", str67, "Solution[x=1, y=1]");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Solution[x=1, y=1]" + "'", str69, "Solution[x=1, y=1]");
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
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
        java.lang.String str43 = equation3.toString();
        int int44 = equation3.a();
        int int45 = equation3.b();
        int int46 = equation3.b();
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
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Equation[a=35, b=52, c=32]" + "'", str43, "Equation[a=35, b=52, c=32]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 35 + "'", int44 == 35);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 52 + "'", int45 == 52);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 52 + "'", int46 == 52);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int4 = solution3.getY();
        solution3.setY((int) (byte) 1);
        boolean boolean8 = solution3.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution10 = gcdSolutionWrapper9.getSolution();
        java.lang.String str11 = gcdSolutionWrapper9.toString();
        gcdSolutionWrapper9.setGcd((int) (byte) 1);
        int int14 = gcdSolutionWrapper9.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution15 = gcdSolutionWrapper9.getSolution();
        java.lang.String str16 = solution15.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution18 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper19 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution18);
        gcdSolutionWrapper19.setGcd((int) ' ');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution24 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int25 = solution24.getY();
        java.lang.String str26 = solution24.toString();
        gcdSolutionWrapper19.setSolution(solution24);
        int int28 = gcdSolutionWrapper19.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution31 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int32 = solution31.getY();
        gcdSolutionWrapper19.setSolution(solution31);
        java.lang.String str34 = solution31.toString();
        boolean boolean35 = solution15.equals((java.lang.Object) str34);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(solution10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str11, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(solution15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Solution[x=97, y=1]" + "'", str16, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Solution[x=97, y=1]" + "'", str26, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 32 + "'", int28 == 32);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Solution[x=97, y=1]" + "'", str34, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int3 = solution2.getY();
        java.lang.String str4 = solution2.toString();
        int int5 = solution2.getX();
        solution2.setY(35);
        solution2.setY((int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Solution[x=97, y=1]" + "'", str4, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
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
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution22 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation4);
        int int23 = solution22.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper24 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(1, solution22);
        int int25 = gcdSolutionWrapper24.getGcd();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(solution17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str18, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(solution22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-35) + "'", int23 == (-35));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation4);
        int int6 = solution5.getX();
        int int7 = solution5.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) 'a', solution5);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution14 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation13);
        solution14.setY(0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper17 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution14);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation21 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution22 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation21);
        solution22.setY((int) (byte) 10);
        boolean boolean25 = solution14.equals((java.lang.Object) (byte) 10);
        boolean boolean27 = solution14.equals((java.lang.Object) (-1));
        solution14.setY((int) (byte) 0);
        gcdSolutionWrapper8.setSolution(solution14);
        int int31 = gcdSolutionWrapper8.getGcd();
        int int32 = gcdSolutionWrapper8.getGcd();
        gcdSolutionWrapper8.setGcd((int) (byte) 10);
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(solution14);
        org.junit.Assert.assertNotNull(solution22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 97 + "'", int31 == 97);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
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
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation22 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        int int23 = equation22.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution24 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation22);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution25 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation22);
        solution25.setX(35);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation33 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution34 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation33);
        int int35 = solution34.getX();
        int int36 = solution34.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper37 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) 'a', solution34);
        boolean boolean39 = solution34.equals((java.lang.Object) '#');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution41 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper42 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution41);
        boolean boolean43 = solution34.equals((java.lang.Object) (byte) 1);
        solution34.setX(35);
        solution34.setY(0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper48 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(1, solution34);
        boolean boolean49 = solution25.equals((java.lang.Object) solution34);
        solution34.setX(97);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution54 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(32, (int) (byte) 10);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution58 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int59 = solution58.getY();
        solution58.setY((int) (byte) 1);
        boolean boolean63 = solution58.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper64 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution58);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution67 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int68 = solution67.getY();
        java.lang.String str69 = solution67.toString();
        boolean boolean71 = solution67.equals((java.lang.Object) (-1L));
        gcdSolutionWrapper64.setSolution(solution67);
        int int73 = solution67.getX();
        int int74 = solution67.getY();
        solution67.setY((int) (short) 10);
        solution67.setY(35);
        solution67.setX(0);
        boolean boolean81 = solution54.equals((java.lang.Object) solution67);
        solution67.setY((-1));
        int int84 = solution67.getY();
        boolean boolean85 = solution34.equals((java.lang.Object) int84);
        boolean boolean86 = gcdSolutionWrapper8.equals((java.lang.Object) solution34);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Solution[x=97, y=1]" + "'", str5, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-35) + "'", int9 == (-35));
        org.junit.Assert.assertNotNull(solution10);
        org.junit.Assert.assertNotNull(solution15);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertNotNull(solution24);
        org.junit.Assert.assertNotNull(solution25);
        org.junit.Assert.assertNotNull(solution34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Solution[x=97, y=1]" + "'", str69, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 97 + "'", int73 == 97);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (short) 10, 10, 100);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution4 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        java.lang.String str5 = equation3.toString();
        int int6 = equation3.a();
        java.lang.Object obj7 = null;
        boolean boolean8 = equation3.equals(obj7);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int14 = solution13.getY();
        solution13.setY((int) (byte) 1);
        boolean boolean18 = solution13.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper19 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution13);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper20 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution13);
        gcdSolutionWrapper20.setGcd(32);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation26 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int27 = equation26.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution28 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation26);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution30 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper31 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution30);
        boolean boolean33 = gcdSolutionWrapper31.equals((java.lang.Object) 1);
        boolean boolean34 = equation26.equals((java.lang.Object) boolean33);
        boolean boolean35 = gcdSolutionWrapper20.equals((java.lang.Object) boolean33);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution38 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int39 = solution38.getY();
        java.lang.String str40 = solution38.toString();
        solution38.setX((int) (short) 1);
        solution38.setX((int) (byte) 10);
        gcdSolutionWrapper20.setSolution(solution38);
        boolean boolean46 = equation3.equals((java.lang.Object) gcdSolutionWrapper20);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution50 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int51 = solution50.getY();
        solution50.setY((int) (byte) 1);
        boolean boolean55 = solution50.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper56 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution50);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution59 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int60 = solution59.getY();
        java.lang.String str61 = solution59.toString();
        boolean boolean63 = solution59.equals((java.lang.Object) (-1L));
        gcdSolutionWrapper56.setSolution(solution59);
        int int65 = solution59.getX();
        boolean boolean66 = gcdSolutionWrapper20.equals((java.lang.Object) int65);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution67 = gcdSolutionWrapper20.getSolution();
        java.lang.String str68 = gcdSolutionWrapper20.toString();
        org.junit.Assert.assertNotNull(solution4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equation[a=10, b=10, c=100]" + "'", str5, "Equation[a=10, b=10, c=100]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
        org.junit.Assert.assertNotNull(solution28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Solution[x=97, y=1]" + "'", str40, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Solution[x=97, y=1]" + "'", str61, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 97 + "'", int65 == 97);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(solution67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "GcdSolutionWrapper[gcd=32, solution=Solution[x=10, y=1]]" + "'", str68, "GcdSolutionWrapper[gcd=32, solution=Solution[x=10, y=1]]");
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) '4', (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper5 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution4);
        java.lang.String str6 = gcdSolutionWrapper5.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = gcdSolutionWrapper5.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution8 = gcdSolutionWrapper5.getSolution();
        java.lang.String str9 = gcdSolutionWrapper5.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution10 = gcdSolutionWrapper5.getSolution();
        solution10.setY((-35));
        int int13 = solution10.getY();
        int int14 = solution10.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper15 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 0, solution10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]" + "'", str6, "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]");
        org.junit.Assert.assertNotNull(solution7);
        org.junit.Assert.assertNotNull(solution8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]" + "'", str9, "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]");
        org.junit.Assert.assertNotNull(solution10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-35) + "'", int13 == (-35));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-35) + "'", int14 == (-35));
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int4 = solution3.getX();
        solution3.setY(52);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) '#', solution3);
        java.lang.String str8 = solution3.toString();
        solution3.setY((int) (short) 10);
        java.lang.String str11 = solution3.toString();
        java.lang.String str12 = solution3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Solution[x=97, y=52]" + "'", str8, "Solution[x=97, y=52]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Solution[x=97, y=10]" + "'", str11, "Solution[x=97, y=10]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Solution[x=97, y=10]" + "'", str12, "Solution[x=97, y=10]");
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((-35), (int) ' ', 0);
        java.lang.String str5 = equation4.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation4);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) 'a', solution6);
        int int8 = solution6.getX();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equation[a=-35, b=32, c=0]" + "'", str5, "Equation[a=-35, b=32, c=0]");
        org.junit.Assert.assertNotNull(solution6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) '4', (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution3);
        gcdSolutionWrapper4.setGcd(0);
        java.lang.Object obj7 = null;
        boolean boolean8 = gcdSolutionWrapper4.equals(obj7);
        java.lang.String str9 = gcdSolutionWrapper4.toString();
        gcdSolutionWrapper4.setGcd(0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution12 = gcdSolutionWrapper4.getSolution();
        solution12.setY((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]" + "'", str9, "GcdSolutionWrapper[gcd=0, solution=Solution[x=52, y=52]]");
        org.junit.Assert.assertNotNull(solution12);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
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
        int int17 = equation14.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation21 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '#', 52, 32);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution24 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int25 = solution24.getY();
        java.lang.String str26 = solution24.toString();
        solution24.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation32 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int33 = equation32.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution34 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation32);
        boolean boolean35 = solution24.equals((java.lang.Object) solution34);
        boolean boolean37 = solution34.equals((java.lang.Object) 0);
        boolean boolean38 = equation21.equals((java.lang.Object) solution34);
        java.lang.String str39 = equation21.toString();
        java.lang.String str40 = equation21.toString();
        int int41 = equation21.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution42 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation21);
        boolean boolean43 = equation14.equals((java.lang.Object) solution42);
        org.junit.Assert.assertNull(solution7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str15, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Solution[x=97, y=1]" + "'", str26, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertNotNull(solution34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Equation[a=35, b=52, c=32]" + "'", str39, "Equation[a=35, b=52, c=32]");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Equation[a=35, b=52, c=32]" + "'", str40, "Equation[a=35, b=52, c=32]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 52 + "'", int41 == 52);
        org.junit.Assert.assertNotNull(solution42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int4 = equation3.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution7);
        boolean boolean10 = gcdSolutionWrapper8.equals((java.lang.Object) 1);
        boolean boolean11 = equation3.equals((java.lang.Object) boolean10);
        int int12 = equation3.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution13 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution14 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        solution14.setY(125);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(solution13);
        org.junit.Assert.assertNotNull(solution14);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
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
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation27 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution28 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation27);
        int int29 = solution28.getX();
        int int30 = solution28.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper31 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) ' ', solution28);
        solution28.setY((int) (short) -1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper34 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) '#', solution28);
        int int35 = solution28.getX();
        boolean boolean36 = gcdSolutionWrapper15.equals((java.lang.Object) int35);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution37 = gcdSolutionWrapper15.getSolution();
        java.lang.String str38 = gcdSolutionWrapper15.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(solution16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str17, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(solution28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(solution37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]" + "'", str38, "GcdSolutionWrapper[gcd=1, solution=Solution[x=97, y=1]]");
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (short) -1, (int) (byte) 10);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution3);
        int int5 = gcdSolutionWrapper4.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution7);
        gcdSolutionWrapper8.setGcd((int) ' ');
        gcdSolutionWrapper8.setGcd((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution13 = gcdSolutionWrapper8.getSolution();
        int int14 = gcdSolutionWrapper8.getGcd();
        gcdSolutionWrapper8.setGcd(0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation20 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution21 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation20);
        solution21.setY(0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation27 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (short) 10, 10, 52);
        boolean boolean28 = solution21.equals((java.lang.Object) (short) 10);
        gcdSolutionWrapper8.setSolution(solution21);
        gcdSolutionWrapper4.setSolution(solution21);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation34 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int35 = equation34.c();
        int int36 = equation34.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution40 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int41 = solution40.getY();
        solution40.setY((int) (byte) 1);
        boolean boolean45 = solution40.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper46 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution40);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution47 = gcdSolutionWrapper46.getSolution();
        java.lang.String str48 = gcdSolutionWrapper46.toString();
        gcdSolutionWrapper46.setGcd((int) (byte) 1);
        boolean boolean51 = equation34.equals((java.lang.Object) gcdSolutionWrapper46);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution52 = gcdSolutionWrapper46.getSolution();
        int int53 = solution52.getX();
        solution52.setY((int) 'a');
        gcdSolutionWrapper4.setSolution(solution52);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution60 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int61 = solution60.getY();
        solution60.setY((int) (byte) 1);
        int int64 = solution60.getY();
        java.lang.String str65 = solution60.toString();
        solution60.setY(97);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper68 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (short) 1, solution60);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution69 = gcdSolutionWrapper68.getSolution();
        int int70 = gcdSolutionWrapper68.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution71 = gcdSolutionWrapper68.getSolution();
        boolean boolean72 = solution52.equals((java.lang.Object) solution71);
        int int73 = solution52.getY();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(solution13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(solution21);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 35 + "'", int35 == 35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(solution47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str48, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(solution52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 97 + "'", int53 == 97);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Solution[x=97, y=1]" + "'", str65, "Solution[x=97, y=1]");
        org.junit.Assert.assertNotNull(solution69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertNotNull(solution71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 97 + "'", int73 == 97);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
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
        int int32 = equation8.b();
        int int33 = equation8.a();
        java.lang.String str34 = equation8.toString();
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str34, "Equation[a=0, b=-1, c=35]");
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
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
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution24 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation19);
        int int25 = equation19.b();
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
        org.junit.Assert.assertNotNull(solution24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(0, (int) (short) 10, 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution4 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        solution4.setY(52);
        org.junit.Assert.assertNotNull(solution4);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int4 = solution3.getX();
        java.lang.String str5 = solution3.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper6 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation10 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int11 = equation10.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution12 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation10);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution14 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper15 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution14);
        boolean boolean17 = gcdSolutionWrapper15.equals((java.lang.Object) 1);
        boolean boolean18 = equation10.equals((java.lang.Object) boolean17);
        int int19 = equation10.a();
        int int20 = equation10.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution22 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper23 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution22);
        gcdSolutionWrapper23.setGcd((int) ' ');
        gcdSolutionWrapper23.setGcd((int) (short) 1);
        int int28 = gcdSolutionWrapper23.getGcd();
        int int29 = gcdSolutionWrapper23.getGcd();
        boolean boolean30 = equation10.equals((java.lang.Object) int29);
        int int31 = equation10.a();
        int int32 = equation10.a();
        int int33 = equation10.a();
        boolean boolean34 = gcdSolutionWrapper6.equals((java.lang.Object) int33);
        int int35 = gcdSolutionWrapper6.getGcd();
        gcdSolutionWrapper6.setGcd(32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Solution[x=97, y=1]" + "'", str5, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertNotNull(solution12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        java.lang.String str4 = equation3.toString();
        int int5 = equation3.c();
        int int6 = equation3.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str4, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(solution7);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, 52, (int) (byte) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int8 = equation7.c();
        int int9 = equation7.a();
        int int10 = equation7.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution11 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation7);
        int int12 = equation7.b();
        int int13 = equation7.a();
        int int14 = equation7.b();
        boolean boolean15 = equation3.equals((java.lang.Object) equation7);
        int int16 = equation3.c();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(solution11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(97, 100);
        solution2.setX((-75));
        solution2.setY((int) (short) 0);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) (short) 1, (int) (byte) 100);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution9 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation8);
        java.lang.String str10 = solution9.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper11 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(1, solution9);
        boolean boolean12 = equation3.equals((java.lang.Object) solution9);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution13 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        java.lang.Class<?> wildcardClass14 = equation3.getClass();
        org.junit.Assert.assertNotNull(solution9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Solution[x=0, y=0]" + "'", str10, "Solution[x=0, y=0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(solution13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
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
        int int23 = gcdSolutionWrapper13.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution25 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper26 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution25);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution29 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int30 = solution29.getY();
        solution29.setY((int) (byte) 1);
        gcdSolutionWrapper26.setSolution(solution29);
        gcdSolutionWrapper13.setSolution(solution29);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution35 = gcdSolutionWrapper13.getSolution();
        int int36 = gcdSolutionWrapper13.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution37 = gcdSolutionWrapper13.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution39 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper40 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution39);
        gcdSolutionWrapper40.setGcd((int) ' ');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution45 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int46 = solution45.getY();
        java.lang.String str47 = solution45.toString();
        gcdSolutionWrapper40.setSolution(solution45);
        boolean boolean49 = solution37.equals((java.lang.Object) solution45);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(solution19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(solution35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(solution37);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Solution[x=97, y=1]" + "'", str47, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
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
        java.lang.String str24 = solution19.toString();
        int int25 = solution19.getY();
        int int26 = solution19.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation30 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 1, (int) (short) 10, (int) (short) -1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution31 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation30);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution32 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation30);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution36 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int37 = solution36.getY();
        solution36.setY((int) (byte) 1);
        boolean boolean41 = solution36.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper42 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution36);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution45 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int46 = solution45.getY();
        java.lang.String str47 = solution45.toString();
        boolean boolean49 = solution45.equals((java.lang.Object) (-1L));
        gcdSolutionWrapper42.setSolution(solution45);
        int int51 = solution45.getX();
        boolean boolean52 = equation30.equals((java.lang.Object) solution45);
        int int53 = equation30.a();
        boolean boolean54 = solution19.equals((java.lang.Object) equation30);
        solution19.setY(52);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(solution19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Solution[x=35, y=10]" + "'", str24, "Solution[x=35, y=10]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(solution31);
        org.junit.Assert.assertNotNull(solution32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Solution[x=97, y=1]" + "'", str47, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 97 + "'", int51 == 97);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(10, 0);
        int int5 = solution4.getX();
        solution4.setX(100);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (short) -1, solution4);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution10 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper11 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution10);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution14 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int15 = solution14.getY();
        solution14.setY((int) (byte) 1);
        gcdSolutionWrapper11.setSolution(solution14);
        int int19 = gcdSolutionWrapper11.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution22 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int23 = solution22.getY();
        java.lang.String str24 = solution22.toString();
        solution22.setX((int) (short) 1);
        boolean boolean28 = solution22.equals((java.lang.Object) (-1.0f));
        java.lang.String str29 = solution22.toString();
        java.lang.String str30 = solution22.toString();
        gcdSolutionWrapper11.setSolution(solution22);
        solution22.setX((int) '4');
        java.lang.String str34 = solution22.toString();
        gcdSolutionWrapper8.setSolution(solution22);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper36 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 0, solution22);
        int int37 = solution22.getY();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Solution[x=97, y=1]" + "'", str24, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Solution[x=1, y=1]" + "'", str29, "Solution[x=1, y=1]");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Solution[x=1, y=1]" + "'", str30, "Solution[x=1, y=1]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Solution[x=52, y=1]" + "'", str34, "Solution[x=52, y=1]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((-35), (int) (short) 1, (-1));
        int int4 = equation3.b();
        boolean boolean6 = equation3.equals((java.lang.Object) "Equation[a=97, b=-1, c=32]");
        java.lang.String str7 = equation3.toString();
        int int8 = equation3.a();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution11 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) '4', (int) 'a');
        boolean boolean12 = equation3.equals((java.lang.Object) solution11);
        int int13 = equation3.a();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Equation[a=-35, b=1, c=-1]" + "'", str7, "Equation[a=-35, b=1, c=-1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-35) + "'", int8 == (-35));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-35) + "'", int13 == (-35));
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int3 = solution2.getY();
        java.lang.String str4 = solution2.toString();
        solution2.setX((int) (short) 1);
        boolean boolean8 = solution2.equals((java.lang.Object) (-1.0f));
        java.lang.String str9 = solution2.toString();
        solution2.setX(96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Solution[x=97, y=1]" + "'", str4, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Solution[x=1, y=1]" + "'", str9, "Solution[x=1, y=1]");
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(32, (int) (short) 10);
        int int4 = solution3.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper5 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution3);
        solution3.setY(35);
        int int8 = solution3.getY();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) 0, (-35));
        solution2.setX((int) (byte) 10);
        solution2.setX(1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation10 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (short) 100, (int) (short) 0, 1);
        int int11 = equation10.b();
        int int12 = equation10.b();
        java.lang.Object obj13 = null;
        boolean boolean14 = equation10.equals(obj13);
        int int15 = equation10.a();
        int int16 = equation10.a();
        boolean boolean17 = solution2.equals((java.lang.Object) int16);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
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
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation21 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        java.lang.String str22 = equation21.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution23 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation21);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper24 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (short) 0, solution23);
        boolean boolean25 = gcdSolutionWrapper2.equals((java.lang.Object) gcdSolutionWrapper24);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution28 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (short) 100, (int) (short) 1);
        solution28.setY((int) 'a');
        gcdSolutionWrapper24.setSolution(solution28);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Solution[x=97, y=1]" + "'", str11, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str22, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertNotNull(solution23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
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
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution51 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int52 = solution51.getY();
        java.lang.String str53 = solution51.toString();
        solution51.setX((int) (short) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper56 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((-35), solution51);
        solution51.setY((int) (short) 10);
        int int59 = solution51.getX();
        gcdSolutionWrapper15.setSolution(solution51);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation64 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        java.lang.String str65 = equation64.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution66 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation64);
        solution66.setY((int) (byte) 10);
        solution66.setY((int) (byte) 10);
        int int71 = solution66.getX();
        int int72 = solution66.getX();
        int int73 = solution66.getX();
        gcdSolutionWrapper15.setSolution(solution66);
        int int75 = solution66.getY();
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
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Solution[x=97, y=1]" + "'", str53, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str65, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertNotNull(solution66);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 10 + "'", int75 == 10);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) ' ', (int) ' ', (int) ' ');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution4 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        org.junit.Assert.assertNotNull(solution4);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
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
        gcdSolutionWrapper2.setGcd((int) (byte) -1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution16 = gcdSolutionWrapper2.getSolution();
        int int17 = gcdSolutionWrapper2.getGcd();
        java.lang.String str18 = gcdSolutionWrapper2.toString();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Solution[x=97, y=1]" + "'", str9, "Solution[x=97, y=1]");
        org.junit.Assert.assertNotNull(solution11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "GcdSolutionWrapper[gcd=32, solution=Solution[x=97, y=1]]" + "'", str12, "GcdSolutionWrapper[gcd=32, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(solution16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str18, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(100, (int) (short) 1, (int) (short) 100);
        int int4 = equation3.c();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        int int4 = equation3.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        int int6 = equation3.b();
        java.lang.Class<?> wildcardClass7 = equation3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
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
        gcdSolutionWrapper15.setGcd((int) (short) 100);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation26 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        int int27 = equation26.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution28 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation26);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution30 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper31 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution30);
        boolean boolean33 = gcdSolutionWrapper31.equals((java.lang.Object) 1);
        boolean boolean34 = equation26.equals((java.lang.Object) boolean33);
        int int35 = equation26.a();
        int int36 = equation26.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution38 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper39 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution38);
        gcdSolutionWrapper39.setGcd((int) ' ');
        gcdSolutionWrapper39.setGcd((int) (short) 1);
        int int44 = gcdSolutionWrapper39.getGcd();
        int int45 = gcdSolutionWrapper39.getGcd();
        boolean boolean46 = equation26.equals((java.lang.Object) int45);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution48 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper49 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution48);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution52 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int53 = solution52.getY();
        solution52.setY((int) (byte) 1);
        gcdSolutionWrapper49.setSolution(solution52);
        boolean boolean57 = equation26.equals((java.lang.Object) gcdSolutionWrapper49);
        boolean boolean58 = gcdSolutionWrapper15.equals((java.lang.Object) gcdSolutionWrapper49);
        gcdSolutionWrapper49.setGcd((int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(solution16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str17, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
        org.junit.Assert.assertNotNull(solution28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
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
        solution20.setY((int) (byte) 0);
        int int23 = solution20.getX();
        solution20.setX(35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(solution14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str15, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Equation[a=0, b=-1, c=35]" + "'", str19, "Equation[a=0, b=-1, c=35]");
        org.junit.Assert.assertNotNull(solution20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
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
        solution5.setX(0);
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
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((-35), (int) (short) 1, (-1));
        int int4 = equation3.b();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        solution5.setX(32);
        java.lang.String str8 = solution5.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Solution[x=32, y=-1]" + "'", str8, "Solution[x=32, y=-1]");
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation5 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution6 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation5);
        java.lang.String str7 = solution6.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(1, solution6);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper9 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) '4', solution6);
        int int10 = solution6.getX();
        org.junit.Assert.assertNotNull(solution6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Solution[x=0, y=0]" + "'", str7, "Solution[x=0, y=0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        int int4 = equation3.c();
        boolean boolean6 = equation3.equals((java.lang.Object) false);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation11 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) (byte) 0, (int) (byte) -1, (int) '#');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution15 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int16 = solution15.getY();
        solution15.setY((int) (byte) 1);
        boolean boolean20 = solution15.equals((java.lang.Object) 1);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper21 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) -1, solution15);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution22 = gcdSolutionWrapper21.getSolution();
        java.lang.String str23 = gcdSolutionWrapper21.toString();
        gcdSolutionWrapper21.setGcd((int) (byte) 1);
        boolean boolean26 = equation11.equals((java.lang.Object) gcdSolutionWrapper21);
        int int27 = gcdSolutionWrapper21.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution28 = gcdSolutionWrapper21.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper29 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(32, solution28);
        int int30 = gcdSolutionWrapper29.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution33 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) '#', (int) (byte) 10);
        solution33.setX((int) (byte) 1);
        gcdSolutionWrapper29.setSolution(solution33);
        boolean boolean37 = equation3.equals((java.lang.Object) solution33);
        int int38 = equation3.a();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(solution22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]" + "'", str23, "GcdSolutionWrapper[gcd=-1, solution=Solution[x=97, y=1]]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(solution28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 32 + "'", int30 == 32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 97 + "'", int38 == 97);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(1, 0, (-35));
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(96, 96);
        solution2.setY((int) (byte) 1);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) (short) -1);
        int int4 = equation3.b();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(0, (int) 'a');
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(32, (-35), (int) (short) 1);
        int int4 = equation3.c();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(solution5);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation4);
        int int6 = solution5.getX();
        int int7 = solution5.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) 'a', solution5);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution14 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation13);
        solution14.setY(0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper17 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(0, solution14);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation21 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(97, 0, (int) '4');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution22 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation21);
        solution22.setY((int) (byte) 10);
        boolean boolean25 = solution14.equals((java.lang.Object) (byte) 10);
        boolean boolean27 = solution14.equals((java.lang.Object) (-1));
        solution14.setY((int) (byte) 0);
        gcdSolutionWrapper8.setSolution(solution14);
        gcdSolutionWrapper8.setGcd(1);
        gcdSolutionWrapper8.setGcd(100);
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(solution14);
        org.junit.Assert.assertNotNull(solution22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution1 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper2 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution1);
        gcdSolutionWrapper2.setGcd((int) ' ');
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution7 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) 'a', (int) (short) 1);
        int int8 = solution7.getY();
        java.lang.String str9 = solution7.toString();
        gcdSolutionWrapper2.setSolution(solution7);
        boolean boolean12 = gcdSolutionWrapper2.equals((java.lang.Object) (short) 0);
        gcdSolutionWrapper2.setGcd(35);
        int int15 = gcdSolutionWrapper2.getGcd();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution16 = gcdSolutionWrapper2.getSolution();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Solution[x=97, y=1]" + "'", str9, "Solution[x=97, y=1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertNotNull(solution16);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation((int) '4', (int) '4', 0);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution5 = com.thealgorithms.maths.LinearDiophantineEquationsSolver.findAnySolution(equation4);
        int int6 = solution5.getX();
        int int7 = solution5.getY();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) ' ', solution5);
        java.lang.String str9 = gcdSolutionWrapper8.toString();
        java.lang.String str10 = gcdSolutionWrapper8.toString();
        java.lang.String str11 = gcdSolutionWrapper8.toString();
        org.junit.Assert.assertNotNull(solution5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "GcdSolutionWrapper[gcd=32, solution=Solution[x=0, y=0]]" + "'", str9, "GcdSolutionWrapper[gcd=32, solution=Solution[x=0, y=0]]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GcdSolutionWrapper[gcd=32, solution=Solution[x=0, y=0]]" + "'", str10, "GcdSolutionWrapper[gcd=32, solution=Solution[x=0, y=0]]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "GcdSolutionWrapper[gcd=32, solution=Solution[x=0, y=0]]" + "'", str11, "GcdSolutionWrapper[gcd=32, solution=Solution[x=0, y=0]]");
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(10, 10);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper4 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (short) 100, solution3);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution8 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution(32, (int) (short) 10);
        int int9 = solution8.getY();
        int int10 = solution8.getY();
        boolean boolean12 = solution8.equals((java.lang.Object) "GcdSolutionWrapper[gcd=100, solution=null]");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper13 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper(97, solution8);
        gcdSolutionWrapper4.setSolution(solution8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation equation3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Equation(100, (-75), (int) '#');
        int int4 = equation3.b();
        int int5 = equation3.c();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-75) + "'", int4 == (-75));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution2 = null;
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper3 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution2);
        boolean boolean5 = gcdSolutionWrapper3.equals((java.lang.Object) 1);
        java.lang.String str6 = gcdSolutionWrapper3.toString();
        gcdSolutionWrapper3.setGcd(32);
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution11 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution((int) (byte) 100, (int) (byte) -1);
        gcdSolutionWrapper3.setSolution(solution11);
        int int13 = solution11.getX();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper gcdSolutionWrapper14 = new com.thealgorithms.maths.LinearDiophantineEquationsSolver.GcdSolutionWrapper((int) (byte) 1, solution11);
        java.lang.String str15 = gcdSolutionWrapper14.toString();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution16 = gcdSolutionWrapper14.getSolution();
        com.thealgorithms.maths.LinearDiophantineEquationsSolver.Solution solution17 = gcdSolutionWrapper14.getSolution();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=null]" + "'", str6, "GcdSolutionWrapper[gcd=1, solution=null]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GcdSolutionWrapper[gcd=1, solution=Solution[x=100, y=-1]]" + "'", str15, "GcdSolutionWrapper[gcd=1, solution=Solution[x=100, y=-1]]");
        org.junit.Assert.assertNotNull(solution16);
        org.junit.Assert.assertNotNull(solution17);
    }
}

