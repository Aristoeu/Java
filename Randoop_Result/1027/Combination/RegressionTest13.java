package Combination;

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
        java.util.List[][][][][][][][][][][] listArray1 = new java.util.List[0][][][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][][][][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][][][][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][][][]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][][][]>> listArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (-1));
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][][][]>> listArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, 2);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][][][]>> listArraySetList10 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (byte) 100);
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArraySetList4);
        org.junit.Assert.assertNotNull(listArraySetList6);
        org.junit.Assert.assertNotNull(listArraySetList8);
        org.junit.Assert.assertNotNull(listArraySetList10);
    }

    @Test
    public void test6502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6502");
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][] combinationArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6503");
        java.lang.String[][][][][][][][][][][][] strArray0 = new java.lang.String[][][][][][][][][][][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][][][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][][][][]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, 0);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][][][][]>> strArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][][][][]>> strArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNull(strArraySetList4);
        org.junit.Assert.assertNotNull(strArraySetList6);
        org.junit.Assert.assertNull(strArraySetList8);
    }

    @Test
    public void test6504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6504");
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][][][][][] combinationArray1 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][][][][][] combinationArray2 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][][][][][][] combinationArray3 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][][][][][][] { combinationArray0, combinationArray1, combinationArray2 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][][][][][]>> combinationArraySetList5 = com.thealgorithms.backtracking.Combination.combination(combinationArray3, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNotNull(combinationArray1);
        org.junit.Assert.assertNotNull(combinationArray2);
        org.junit.Assert.assertNotNull(combinationArray3);
    }

    @Test
    public void test6505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6505");
        java.lang.Class[][][][] classArray1 = new java.lang.Class[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 4);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, (int) (byte) 10);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][]>> genericDeclarationArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][][]) wildcardClassArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList14 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 1);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(typeArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(typeArraySetList10);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList12);
        org.junit.Assert.assertNull(wildcardClassArraySetList14);
        org.junit.Assert.assertNotNull(typeArraySetList16);
    }

    @Test
    public void test6506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6506");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList4 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray0, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) strArray0, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) 10);
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList10 = com.thealgorithms.backtracking.Combination.combination(strArray0, 100);
        java.lang.Class<?> wildcardClass11 = strArraySetList10.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNull(serializableSetList4);
        org.junit.Assert.assertNotNull(constableArraySetList6);
        org.junit.Assert.assertNotNull(strArraySetList8);
        org.junit.Assert.assertNotNull(strArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test6507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6507");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList9 = com.thealgorithms.backtracking.Combination.combination(strArray7, (int) '#');
        java.util.List[] listArray11 = new java.util.List[2];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[] strSetListArray12 = (java.util.List<java.util.TreeSet<java.lang.String>>[]) listArray11;
        strSetListArray12[0] = strSetList4;
        strSetListArray12[1] = strSetList9;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>>> setListSetList18 = com.thealgorithms.backtracking.Combination.combination(strSetListArray12, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>>> setListSetList20 = com.thealgorithms.backtracking.Combination.combination(strSetListArray12, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>>> setListSetList22 = com.thealgorithms.backtracking.Combination.combination(strSetListArray12, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>>> setListSetList24 = com.thealgorithms.backtracking.Combination.combination(strSetListArray12, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>>> setListSetList26 = com.thealgorithms.backtracking.Combination.combination(strSetListArray12, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>>> setListSetList28 = com.thealgorithms.backtracking.Combination.combination(strSetListArray12, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strSetList9);
        org.junit.Assert.assertNotNull(listArray11);
        org.junit.Assert.assertNotNull(strSetListArray12);
        org.junit.Assert.assertNull(setListSetList18);
        org.junit.Assert.assertNull(setListSetList20);
        org.junit.Assert.assertNull(setListSetList22);
        org.junit.Assert.assertNull(setListSetList24);
        org.junit.Assert.assertNull(setListSetList26);
    }

    @Test
    public void test6508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6508");
        java.lang.Class[][][][][][][][][][][][][][][][][][][] classArray1 = new java.lang.Class[0][][][][][][][][][][][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][][][][][][][][][][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][][][][][][][][][][][][][][][]) classArray1;
        java.lang.Class[][][][][][][][][][][][][][][][][][][] classArray4 = new java.lang.Class[0][][][][][][][][][][][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][][][][][][][][][][][][][] wildcardClassArray5 = (java.lang.Class<?>[][][][][][][][][][][][][][][][][][][]) classArray4;
        java.lang.Class[][][][][][][][][][][][][][][][][][][] classArray7 = new java.lang.Class[0][][][][][][][][][][][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][][][][][][][][][][][][][] wildcardClassArray8 = (java.lang.Class<?>[][][][][][][][][][][][][][][][][][][]) classArray7;
        java.lang.Class[][][][][][][][][][][][][][][][][][][][] classArray10 = new java.lang.Class[3][][][][][][][][][][][][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][][][][][][][][][][][][][][] wildcardClassArray11 = (java.lang.Class<?>[][][][][][][][][][][][][][][][][][][][]) classArray10;
        wildcardClassArray11[0] = wildcardClassArray2;
        wildcardClassArray11[1] = wildcardClassArray5;
        wildcardClassArray11[2] = wildcardClassArray8;
        java.lang.Class[][][][][][][][][][][][][][][][][][][][][] classArray19 = new java.lang.Class[1][][][][][][][][][][][][][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][][][][][][][][][][][][][][][] wildcardClassArray20 = (java.lang.Class<?>[][][][][][][][][][][][][][][][][][][][][]) classArray19;
        wildcardClassArray20[0] = wildcardClassArray11;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][][][][][][][][][][][][][]>> wildcardClassArraySetList24 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray20, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][][][][][][][][][][][][][]>> wildcardClassArraySetList26 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray20, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][][][][][][][][][][][][][]>> wildcardClassArraySetList28 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray20, (int) (byte) 100);
        java.lang.Class<?> wildcardClass29 = wildcardClassArraySetList28.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(classArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(classArray19);
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList24);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList26);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test6509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6509");
        java.lang.String[][][][][][][][] strArray0 = new java.lang.String[][][][][][][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][]>> strArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][]>> strArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strArray0, 100);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][]>> strArraySetList10 = com.thealgorithms.backtracking.Combination.combination(strArray0, 6);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][]>> strArraySetList12 = com.thealgorithms.backtracking.Combination.combination(strArray0, 0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNotNull(strArraySetList4);
        org.junit.Assert.assertNotNull(strArraySetList6);
        org.junit.Assert.assertNotNull(strArraySetList8);
        org.junit.Assert.assertNotNull(strArraySetList10);
        org.junit.Assert.assertNull(strArraySetList12);
    }

    @Test
    public void test6510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6510");
        java.lang.Class[][][][][] classArray1 = new java.lang.Class[0][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 10);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList10 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 10);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][][]>> genericDeclarationArraySetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][][][]) wildcardClassArray2, (int) (byte) 10);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList16 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) '4');
        java.lang.Class<?> wildcardClass17 = wildcardClassArraySetList16.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList12);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList14);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6511");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, 10);
        java.lang.Class<?> wildcardClass9 = genericDeclarationArraySetList8.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNull(constableArraySetList6);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test6512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6512");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList8 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable>> constableSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[]) strArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList14 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) (short) 100);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(constantDescSetList6);
        org.junit.Assert.assertNotNull(strSetList8);
        org.junit.Assert.assertNull(charSequenceSetList10);
        org.junit.Assert.assertNull(constableSetList12);
        org.junit.Assert.assertNotNull(strSetList14);
    }

    @Test
    public void test6513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6513");
        com.thealgorithms.backtracking.Combination[][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][] combinationArray1 = new com.thealgorithms.backtracking.Combination[][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][] combinationArray2 = new com.thealgorithms.backtracking.Combination[][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][] combinationArray3 = new com.thealgorithms.backtracking.Combination[][][][][][][] { combinationArray0, combinationArray1, combinationArray2 };
        com.thealgorithms.backtracking.Combination[][][][][][][][] combinationArray4 = new com.thealgorithms.backtracking.Combination[][][][][][][][] { combinationArray3 };
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray4, (int) '4');
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][]>> combinationArraySetList8 = com.thealgorithms.backtracking.Combination.combination(combinationArray4, (int) (byte) 100);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][]>> combinationArraySetList10 = com.thealgorithms.backtracking.Combination.combination(combinationArray4, (int) (byte) 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][]>> combinationArraySetList12 = com.thealgorithms.backtracking.Combination.combination(combinationArray4, (int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = combinationArraySetList12.getClass();
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNotNull(combinationArray1);
        org.junit.Assert.assertNotNull(combinationArray2);
        org.junit.Assert.assertNotNull(combinationArray3);
        org.junit.Assert.assertNotNull(combinationArray4);
        org.junit.Assert.assertNotNull(combinationArraySetList6);
        org.junit.Assert.assertNotNull(combinationArraySetList8);
        org.junit.Assert.assertNull(combinationArraySetList10);
        org.junit.Assert.assertNotNull(combinationArraySetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6514");
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 4);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][]>> combinationArraySetList8 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (byte) 100);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][]>> combinationArraySetList10 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass11 = combinationArray0.getClass();
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNull(combinationArraySetList2);
        org.junit.Assert.assertNotNull(combinationArraySetList4);
        org.junit.Assert.assertNotNull(combinationArraySetList6);
        org.junit.Assert.assertNotNull(combinationArraySetList8);
        org.junit.Assert.assertNotNull(combinationArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test6515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6515");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.Object>> objSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.Object[]) strArray2, (int) (short) 1);
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, (int) (byte) 100);
        java.lang.Class<?> wildcardClass11 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(charSequenceSetList6);
        org.junit.Assert.assertNotNull(objSetList8);
        org.junit.Assert.assertNotNull(charSequenceSetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test6516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6516");
        java.util.List[][][][][][] listArray1 = new java.util.List[0][][][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][]>> listArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][]>> listArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, 0);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][]>> listArraySetList10 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, 100);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][]>> listArraySetList12 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][]>> listArraySetList14 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = listArraySetList14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArraySetList4);
        org.junit.Assert.assertNotNull(listArraySetList6);
        org.junit.Assert.assertNull(listArraySetList8);
        org.junit.Assert.assertNotNull(listArraySetList10);
        org.junit.Assert.assertNotNull(listArraySetList12);
        org.junit.Assert.assertNull(listArraySetList14);
    }

    @Test
    public void test6517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6517");
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][][][][] combinationArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6518");
        java.lang.Class[][][][] classArray1 = new java.lang.Class[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList14 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 1);
        java.lang.Class<?> wildcardClass15 = wildcardClassArraySetList14.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(typeArraySetList6);
        org.junit.Assert.assertNotNull(typeArraySetList8);
        org.junit.Assert.assertNotNull(typeArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList12);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6519");
        com.thealgorithms.backtracking.Combination[][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 100);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][]>> combinationArraySetList8 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 10);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][]>> combinationArraySetList10 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) -1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][]>> combinationArraySetList12 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) '#');
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][]>> combinationArraySetList14 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.lang.Object>> objSetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.Object[]) combinationArray0, 10);
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNull(combinationArraySetList2);
        org.junit.Assert.assertNotNull(combinationArraySetList4);
        org.junit.Assert.assertNotNull(combinationArraySetList6);
        org.junit.Assert.assertNotNull(combinationArraySetList8);
        org.junit.Assert.assertNotNull(combinationArraySetList10);
        org.junit.Assert.assertNotNull(combinationArraySetList12);
        org.junit.Assert.assertNotNull(combinationArraySetList14);
        org.junit.Assert.assertNotNull(objSetList16);
    }

    @Test
    public void test6520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6520");
        java.lang.Class[][][][][][][][][][][][][][][][][] classArray1 = new java.lang.Class[0][][][][][][][][][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][][][][][][][][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][][][][][][][][][][][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][][][][][][][][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][][][][][][][][][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][][][][][][][][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) ' ');
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
    }

    @Test
    public void test6521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6521");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "", "" };
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList10 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray6, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.Object>> objSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.Object[]) strArray6, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, 100);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList16 = com.thealgorithms.backtracking.Combination.combination(strArray6, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList18 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray6, 5);
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList20 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray6, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList22 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray6, 3);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable>> constableSetList24 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[]) strArray6, 3);
        java.lang.Class<?> wildcardClass25 = constableSetList24.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strComparableSetList8);
        org.junit.Assert.assertNotNull(serializableSetList10);
        org.junit.Assert.assertNotNull(objSetList12);
        org.junit.Assert.assertNotNull(strComparableSetList14);
        org.junit.Assert.assertNotNull(strSetList16);
        org.junit.Assert.assertNotNull(charSequenceSetList18);
        org.junit.Assert.assertNotNull(charSequenceSetList20);
        org.junit.Assert.assertNotNull(constantDescSetList22);
        org.junit.Assert.assertNotNull(constableSetList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6522");
        java.util.List[][][] listArray1 = new java.util.List[0][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][]) listArray1;
        java.util.List[][][] listArray4 = new java.util.List[0][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][] strSetListArray5 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][]) listArray4;
        java.util.List[][][][] listArray7 = new java.util.List[2][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][] strSetListArray8 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][]) listArray7;
        strSetListArray8[0] = strSetListArray2;
        strSetListArray8[1] = strSetListArray5;
        java.util.List[][][] listArray14 = new java.util.List[0][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][] strSetListArray15 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][]) listArray14;
        java.util.List[][][] listArray17 = new java.util.List[0][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][] strSetListArray18 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][]) listArray17;
        java.util.List[][][][] listArray20 = new java.util.List[2][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][] strSetListArray21 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][]) listArray20;
        strSetListArray21[0] = strSetListArray15;
        strSetListArray21[1] = strSetListArray18;
        java.util.List[][][][][] listArray27 = new java.util.List[2][][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][][] strSetListArray28 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][][]) listArray27;
        strSetListArray28[0] = strSetListArray8;
        strSetListArray28[1] = strSetListArray21;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][]>> listArraySetList34 = com.thealgorithms.backtracking.Combination.combination(strSetListArray28, 0);
        java.lang.Class<?> wildcardClass35 = strSetListArray28.getClass();
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArray4);
        org.junit.Assert.assertNotNull(strSetListArray5);
        org.junit.Assert.assertNotNull(listArray7);
        org.junit.Assert.assertNotNull(strSetListArray8);
        org.junit.Assert.assertNotNull(listArray14);
        org.junit.Assert.assertNotNull(strSetListArray15);
        org.junit.Assert.assertNotNull(listArray17);
        org.junit.Assert.assertNotNull(strSetListArray18);
        org.junit.Assert.assertNotNull(listArray20);
        org.junit.Assert.assertNotNull(strSetListArray21);
        org.junit.Assert.assertNotNull(listArray27);
        org.junit.Assert.assertNotNull(strSetListArray28);
        org.junit.Assert.assertNull(listArraySetList34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test6523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6523");
        java.util.List[][] listArray1 = new java.util.List[0][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (-1));
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][]) strSetListArray2, 3);
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][]) strSetListArray2, 6);
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArraySetList4);
        org.junit.Assert.assertNotNull(listArraySetList6);
        org.junit.Assert.assertNotNull(collectionArraySetList8);
        org.junit.Assert.assertNotNull(collectionArraySetList10);
    }

    @Test
    public void test6524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6524");
        com.thealgorithms.backtracking.Combination[][][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (-1));
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (byte) 100);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 1);
        java.lang.Class<?> wildcardClass7 = combinationArraySetList6.getClass();
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNotNull(combinationArraySetList2);
        org.junit.Assert.assertNotNull(combinationArraySetList4);
        org.junit.Assert.assertNotNull(combinationArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test6525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6525");
        java.util.List[][][][][][][][][][][][][][] listArray1 = new java.util.List[0][][][][][][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][][][][][][][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][][][][][][][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][][][][][][]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) 1);
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArraySetList4);
    }

    @Test
    public void test6526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6526");
        java.util.List[][] listArray1 = new java.util.List[0][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (-1));
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]>> iterableArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.Iterable<java.util.TreeSet<java.lang.String>>[][]) strSetListArray2, (int) '4');
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList10 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList12 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) 10);
        java.lang.Class<?> wildcardClass13 = listArraySetList12.getClass();
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArraySetList4);
        org.junit.Assert.assertNotNull(listArraySetList6);
        org.junit.Assert.assertNotNull(iterableArraySetList8);
        org.junit.Assert.assertNotNull(listArraySetList10);
        org.junit.Assert.assertNotNull(listArraySetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6527");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.AnnotatedElement>> annotatedElementSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.AnnotatedElement[]) wildcardClassArray2, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> wildcardClassOfFieldSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[]) wildcardClassArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type>> typeSetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.Object>> objSetList18 = com.thealgorithms.backtracking.Combination.combination((java.lang.Object[]) wildcardClassArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = objSetList18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNull(typeDescriptorSetList6);
        org.junit.Assert.assertNotNull(annotatedElementSetList8);
        org.junit.Assert.assertNotNull(typeDescriptorSetList10);
        org.junit.Assert.assertNotNull(wildcardClassSetList12);
        org.junit.Assert.assertNotNull(wildcardClassOfFieldSetList14);
        org.junit.Assert.assertNull(typeSetList16);
        org.junit.Assert.assertNull(objSetList18);
    }

    @Test
    public void test6528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6528");
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 6);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) '#');
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][]>> combinationArraySetList8 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 6);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][]>> combinationArraySetList10 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 3);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][]>> combinationArraySetList12 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (-1));
        java.lang.Class<?> wildcardClass13 = combinationArraySetList12.getClass();
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNull(combinationArraySetList2);
        org.junit.Assert.assertNotNull(combinationArraySetList4);
        org.junit.Assert.assertNotNull(combinationArraySetList6);
        org.junit.Assert.assertNotNull(combinationArraySetList8);
        org.junit.Assert.assertNotNull(combinationArraySetList10);
        org.junit.Assert.assertNotNull(combinationArraySetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6529");
        java.util.List[] listArray1 = new java.util.List[0];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[]) listArray1;
        java.util.List[] listArray4 = new java.util.List[0];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[] strSetListArray5 = (java.util.List<java.util.TreeSet<java.lang.String>>[]) listArray4;
        java.util.List[][] listArray7 = new java.util.List[2][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][] strSetListArray8 = (java.util.List<java.util.TreeSet<java.lang.String>>[][]) listArray7;
        strSetListArray8[0] = strSetListArray2;
        strSetListArray8[1] = strSetListArray5;
        java.util.List[][][] listArray14 = new java.util.List[1][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][] strSetListArray15 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][]) listArray14;
        strSetListArray15[0] = strSetListArray8;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][]>> listArraySetList19 = com.thealgorithms.backtracking.Combination.combination(strSetListArray15, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.util.Collection[][]>> collectionArraySetList21 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][][]) strSetListArray15, 100);
        java.util.List<java.util.TreeSet<java.util.Collection[][]>> collectionArraySetList23 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][][]) strSetListArray15, (int) '#');
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][]>> listArraySetList25 = com.thealgorithms.backtracking.Combination.combination(strSetListArray15, (int) 'a');
        java.util.List<java.util.TreeSet<java.util.Collection[][]>> collectionArraySetList27 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][][]) strSetListArray15, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.util.Collection[][]>> collectionArraySetList29 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][][]) strSetListArray15, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArray4);
        org.junit.Assert.assertNotNull(strSetListArray5);
        org.junit.Assert.assertNotNull(listArray7);
        org.junit.Assert.assertNotNull(strSetListArray8);
        org.junit.Assert.assertNotNull(listArray14);
        org.junit.Assert.assertNotNull(strSetListArray15);
        org.junit.Assert.assertNotNull(listArraySetList19);
        org.junit.Assert.assertNotNull(collectionArraySetList21);
        org.junit.Assert.assertNotNull(collectionArraySetList23);
        org.junit.Assert.assertNotNull(listArraySetList25);
        org.junit.Assert.assertNull(collectionArraySetList27);
    }

    @Test
    public void test6530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6530");
        java.util.List[][][][] listArray1 = new java.util.List[0][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][]>> listArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) 1);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][]>> listArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, 0);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][]>> listArraySetList10 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.util.Collection[][][]>> collectionArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][][][]) strSetListArray2, 2);
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArraySetList4);
        org.junit.Assert.assertNotNull(listArraySetList6);
        org.junit.Assert.assertNull(listArraySetList8);
        org.junit.Assert.assertNotNull(listArraySetList10);
        org.junit.Assert.assertNotNull(collectionArraySetList12);
    }

    @Test
    public void test6531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6531");
        java.lang.String[][][] strArray0 = new java.lang.String[][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNotNull(strArraySetList4);
        org.junit.Assert.assertNotNull(strArraySetList6);
        org.junit.Assert.assertNotNull(strArraySetList8);
    }

    @Test
    public void test6532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6532");
        java.lang.Class[][][] classArray1 = new java.lang.Class[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][] wildcardClassArray2 = (java.lang.Class<?>[][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 5);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 10);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][]>> genericDeclarationArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][]) wildcardClassArray2, 6);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList14 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 5);
        java.lang.Class<?> wildcardClass15 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList12);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6533");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, (-1));
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) strArray0, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.CharSequence[]>> charSequenceArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[][]) strArray0, 1);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) strArray0, 10);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) strArray0, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.CharSequence[]>> charSequenceArraySetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[][]) strArray0, 100);
        java.util.List<java.util.TreeSet<java.lang.CharSequence[]>> charSequenceArraySetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[][]) strArray0, 10);
        java.util.List<java.util.TreeSet<java.lang.CharSequence[]>> charSequenceArraySetList18 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[][]) strArray0, 100);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNotNull(strArraySetList4);
        org.junit.Assert.assertNotNull(constableArraySetList6);
        org.junit.Assert.assertNotNull(charSequenceArraySetList8);
        org.junit.Assert.assertNotNull(constableArraySetList10);
        org.junit.Assert.assertNotNull(constableArraySetList12);
        org.junit.Assert.assertNotNull(charSequenceArraySetList14);
        org.junit.Assert.assertNotNull(charSequenceArraySetList16);
        org.junit.Assert.assertNotNull(charSequenceArraySetList18);
    }

    @Test
    public void test6534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6534");
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 3);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (byte) -1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) '4');
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNotNull(combinationArraySetList2);
        org.junit.Assert.assertNotNull(combinationArraySetList4);
        org.junit.Assert.assertNotNull(combinationArraySetList6);
    }

    @Test
    public void test6535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6535");
        java.util.List[][][][][][][][][][][][] listArray1 = new java.util.List[0][][][][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][][][][][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][][][][][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][][][][]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][][][][]>> listArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][][][][]>> listArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][][][][]>> listArraySetList10 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][][][][]>> listArraySetList12 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) 100);
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNull(listArraySetList4);
        org.junit.Assert.assertNotNull(listArraySetList6);
        org.junit.Assert.assertNotNull(listArraySetList8);
        org.junit.Assert.assertNotNull(listArraySetList10);
        org.junit.Assert.assertNotNull(listArraySetList12);
    }

    @Test
    public void test6536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6536");
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][][][][][] combinationArray1 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][][][][][] combinationArray2 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][][][][][] combinationArray3 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][][][][][] combinationArray4 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][][][][][] combinationArray5 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][][][][][][] combinationArray6 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][][][][][][] { combinationArray0, combinationArray1, combinationArray2, combinationArray3, combinationArray4, combinationArray5 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][][][][][]>> combinationArraySetList8 = com.thealgorithms.backtracking.Combination.combination(combinationArray6, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNotNull(combinationArray1);
        org.junit.Assert.assertNotNull(combinationArray2);
        org.junit.Assert.assertNotNull(combinationArray3);
        org.junit.Assert.assertNotNull(combinationArray4);
        org.junit.Assert.assertNotNull(combinationArray5);
        org.junit.Assert.assertNotNull(combinationArray6);
    }

    @Test
    public void test6537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6537");
        java.lang.String[][][][][][][][] strArray0 = new java.lang.String[][][][][][][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][]>> strArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][]>> strArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNull(strArraySetList4);
        org.junit.Assert.assertNull(strArraySetList6);
        org.junit.Assert.assertNotNull(strArraySetList8);
    }

    @Test
    public void test6538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6538");
        java.lang.Class[][][][][] classArray1 = new java.lang.Class[0][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 10);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][][]>> genericDeclarationArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][][][]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][][]>> genericDeclarationArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][][][]) wildcardClassArray2, (int) (byte) 1);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNull(genericDeclarationArraySetList10);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList12);
    }

    @Test
    public void test6539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6539");
        java.util.List[][] listArray1 = new java.util.List[0][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (-1));
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]>> iterableArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.Iterable<java.util.TreeSet<java.lang.String>>[][]) strSetListArray2, (-1));
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList12 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = listArraySetList12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArraySetList4);
        org.junit.Assert.assertNotNull(listArraySetList6);
        org.junit.Assert.assertNotNull(listArraySetList8);
        org.junit.Assert.assertNotNull(iterableArraySetList10);
        org.junit.Assert.assertNull(listArraySetList12);
    }

    @Test
    public void test6540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6540");
        java.util.List[][][][] listArray1 = new java.util.List[0][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][]>> listArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) 1);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][]>> listArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, 0);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][]>> listArraySetList10 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][]>> listArraySetList12 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, 3);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][]>> listArraySetList14 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) '4');
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][]>> listArraySetList16 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) ' ');
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArraySetList4);
        org.junit.Assert.assertNotNull(listArraySetList6);
        org.junit.Assert.assertNull(listArraySetList8);
        org.junit.Assert.assertNotNull(listArraySetList10);
        org.junit.Assert.assertNotNull(listArraySetList12);
        org.junit.Assert.assertNotNull(listArraySetList14);
        org.junit.Assert.assertNotNull(listArraySetList16);
    }

    @Test
    public void test6541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6541");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][]) wildcardClassArray2, 5);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][]) wildcardClassArray2, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.Object>> objSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.Object[]) wildcardClassArray2, 3);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(typeArraySetList8);
        org.junit.Assert.assertNull(typeArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList12);
        org.junit.Assert.assertNotNull(objSetList14);
    }

    @Test
    public void test6542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6542");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][]) wildcardClassArray2, 5);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][]) wildcardClassArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList14 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(typeArraySetList8);
        org.junit.Assert.assertNotNull(typeArraySetList10);
        org.junit.Assert.assertNull(wildcardClassArraySetList12);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList14);
    }

    @Test
    public void test6543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6543");
        java.lang.Class[][][][] classArray1 = new java.lang.Class[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (-1));
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, (int) (byte) 10);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList14 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) '4');
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(typeArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(typeArraySetList10);
        org.junit.Assert.assertNotNull(typeArraySetList12);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList14);
    }

    @Test
    public void test6544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6544");
        java.util.List[][][][][][][][][][] listArray1 = new java.util.List[0][][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][][][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][][][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][][]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, 4);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][][]>> listArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][][]>> listArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) 1);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][][]>> listArraySetList10 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][][]>> listArraySetList12 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, 0);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][][]>> listArraySetList14 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][][]>> listArraySetList16 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) '4');
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][][]>> listArraySetList18 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) -1);
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArraySetList4);
        org.junit.Assert.assertNotNull(listArraySetList6);
        org.junit.Assert.assertNotNull(listArraySetList8);
        org.junit.Assert.assertNotNull(listArraySetList10);
        org.junit.Assert.assertNull(listArraySetList12);
        org.junit.Assert.assertNotNull(listArraySetList14);
        org.junit.Assert.assertNotNull(listArraySetList16);
        org.junit.Assert.assertNotNull(listArraySetList18);
    }

    @Test
    public void test6545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6545");
        java.util.List[][][][] listArray1 = new java.util.List[0][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][]>> listArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.util.Collection[][][]>> collectionArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][][][]) strSetListArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][]>> listArraySetList10 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (byte) 100);
        java.lang.Class<?> wildcardClass11 = listArraySetList10.getClass();
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArraySetList4);
        org.junit.Assert.assertNotNull(listArraySetList6);
        org.junit.Assert.assertNotNull(collectionArraySetList8);
        org.junit.Assert.assertNotNull(listArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test6546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6546");
        java.util.List[][][][][][][] listArray1 = new java.util.List[0][][][][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][]>> listArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][]>> listArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][]>> listArraySetList10 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][]>> listArraySetList12 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (byte) 0);
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNull(listArraySetList4);
        org.junit.Assert.assertNull(listArraySetList6);
        org.junit.Assert.assertNotNull(listArraySetList8);
        org.junit.Assert.assertNotNull(listArraySetList10);
        org.junit.Assert.assertNull(listArraySetList12);
    }

    @Test
    public void test6547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6547");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.AnnotatedElement>> annotatedElementSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.AnnotatedElement[]) wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable>> constableSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[]) wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = typeDescriptorSetList12.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(typeDescriptorSetList6);
        org.junit.Assert.assertNotNull(annotatedElementSetList8);
        org.junit.Assert.assertNotNull(constableSetList10);
        org.junit.Assert.assertNotNull(typeDescriptorSetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6548");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "", "" };
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList10 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray6, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList12 = com.thealgorithms.backtracking.Combination.combination(strArray6, 1);
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray6, 2);
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray6, 10);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList18 = com.thealgorithms.backtracking.Combination.combination(strArray6, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList20 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray6, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList22 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, 0);
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList24 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray6, (int) (short) -1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strComparableSetList8);
        org.junit.Assert.assertNotNull(serializableSetList10);
        org.junit.Assert.assertNotNull(strSetList12);
        org.junit.Assert.assertNotNull(constantDescSetList14);
        org.junit.Assert.assertNotNull(constantDescSetList16);
        org.junit.Assert.assertNotNull(strSetList18);
        org.junit.Assert.assertNotNull(constantDescSetList20);
        org.junit.Assert.assertNull(strComparableSetList22);
        org.junit.Assert.assertNotNull(constantDescSetList24);
    }

    @Test
    public void test6549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6549");
        java.util.List[][][][][][][] listArray1 = new java.util.List[0][][][][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][]>> listArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][]>> listArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (-1));
        java.lang.Class<?> wildcardClass9 = listArraySetList8.getClass();
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNull(listArraySetList4);
        org.junit.Assert.assertNotNull(listArraySetList6);
        org.junit.Assert.assertNotNull(listArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test6550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6550");
        java.util.List[][][][][][][][] listArray1 = new java.util.List[0][][][][][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, 0);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][]>> listArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, 6);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][]>> listArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][]>> listArraySetList10 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, 10);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][]>> listArraySetList12 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, 5);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][]>> listArraySetList14 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][]>> listArraySetList16 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (byte) 10);
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNull(listArraySetList4);
        org.junit.Assert.assertNotNull(listArraySetList6);
        org.junit.Assert.assertNotNull(listArraySetList8);
        org.junit.Assert.assertNotNull(listArraySetList10);
        org.junit.Assert.assertNotNull(listArraySetList12);
        org.junit.Assert.assertNotNull(listArraySetList14);
        org.junit.Assert.assertNotNull(listArraySetList16);
    }

    @Test
    public void test6551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6551");
        java.util.List[] listArray1 = new java.util.List[0];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[]) listArray1;
        java.util.List[] listArray4 = new java.util.List[0];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[] strSetListArray5 = (java.util.List<java.util.TreeSet<java.lang.String>>[]) listArray4;
        java.util.List[][] listArray7 = new java.util.List[2][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][] strSetListArray8 = (java.util.List<java.util.TreeSet<java.lang.String>>[][]) listArray7;
        strSetListArray8[0] = strSetListArray2;
        strSetListArray8[1] = strSetListArray5;
        java.util.List[][][] listArray14 = new java.util.List[1][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][] strSetListArray15 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][]) listArray14;
        strSetListArray15[0] = strSetListArray8;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][]>> listArraySetList19 = com.thealgorithms.backtracking.Combination.combination(strSetListArray15, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][]>> listArraySetList21 = com.thealgorithms.backtracking.Combination.combination(strSetListArray15, (int) '#');
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][]>> listArraySetList23 = com.thealgorithms.backtracking.Combination.combination(strSetListArray15, (int) ' ');
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][]>> listArraySetList25 = com.thealgorithms.backtracking.Combination.combination(strSetListArray15, (int) (byte) 10);
        java.util.List<java.util.TreeSet<java.util.Collection[][]>> collectionArraySetList27 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][][]) strSetListArray15, (int) (byte) 0);
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArray4);
        org.junit.Assert.assertNotNull(strSetListArray5);
        org.junit.Assert.assertNotNull(listArray7);
        org.junit.Assert.assertNotNull(strSetListArray8);
        org.junit.Assert.assertNotNull(listArray14);
        org.junit.Assert.assertNotNull(strSetListArray15);
        org.junit.Assert.assertNotNull(listArraySetList19);
        org.junit.Assert.assertNotNull(listArraySetList21);
        org.junit.Assert.assertNotNull(listArraySetList23);
        org.junit.Assert.assertNotNull(listArraySetList25);
        org.junit.Assert.assertNull(collectionArraySetList27);
    }

    @Test
    public void test6552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6552");
        java.lang.reflect.Type[][] typeArray0 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray1 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray2 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray3 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray4 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][][] typeArray5 = new java.lang.reflect.Type[][][] { typeArray0, typeArray1, typeArray2, typeArray3, typeArray4 };
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][]>> typeArraySetList7 = com.thealgorithms.backtracking.Combination.combination(typeArray5, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][]>> typeArraySetList9 = com.thealgorithms.backtracking.Combination.combination(typeArray5, 0);
        org.junit.Assert.assertNotNull(typeArray0);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertNotNull(typeArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertNull(typeArraySetList7);
        org.junit.Assert.assertNull(typeArraySetList9);
    }

    @Test
    public void test6553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6553");
        java.util.List[][] listArray1 = new java.util.List[0][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (-1));
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][]) strSetListArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]>> iterableArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.Iterable<java.util.TreeSet<java.lang.String>>[][]) strSetListArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList12 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, 1);
        java.lang.Class<?> wildcardClass13 = strSetListArray2.getClass();
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArraySetList4);
        org.junit.Assert.assertNotNull(listArraySetList6);
        org.junit.Assert.assertNotNull(collectionArraySetList8);
        org.junit.Assert.assertNotNull(iterableArraySetList10);
        org.junit.Assert.assertNotNull(listArraySetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6554");
        java.util.List[][] listArray1 = new java.util.List[0][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (-1));
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]>> iterableArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.Iterable<java.util.TreeSet<java.lang.String>>[][]) strSetListArray2, (int) '4');
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList10 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, 100);
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][]) strSetListArray2, 100);
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList14 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][]) strSetListArray2, (int) (short) 1);
        java.lang.Class<?> wildcardClass15 = strSetListArray2.getClass();
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArraySetList4);
        org.junit.Assert.assertNotNull(listArraySetList6);
        org.junit.Assert.assertNotNull(iterableArraySetList8);
        org.junit.Assert.assertNotNull(listArraySetList10);
        org.junit.Assert.assertNotNull(collectionArraySetList12);
        org.junit.Assert.assertNotNull(collectionArraySetList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6555");
        java.lang.Class[][][][][][][] classArray1 = new java.lang.Class[0][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][]>> wildcardClassArraySetList10 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][]>> wildcardClassArraySetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][]>> wildcardClassArraySetList14 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.lang.Class<?> wildcardClass15 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList12);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6556");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList4 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray0, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.CharSequence[]>> charSequenceArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[][]) strArray0, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) strArray0, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList10 = com.thealgorithms.backtracking.Combination.combination(strArray0, 0);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList12 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray0, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList14 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.CharSequence[]>> charSequenceArraySetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[][]) strArray0, (int) (byte) 10);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNull(serializableSetList4);
        org.junit.Assert.assertNull(charSequenceArraySetList6);
        org.junit.Assert.assertNotNull(constableArraySetList8);
        org.junit.Assert.assertNull(strArraySetList10);
        org.junit.Assert.assertNotNull(serializableSetList12);
        org.junit.Assert.assertNull(strArraySetList14);
        org.junit.Assert.assertNotNull(charSequenceArraySetList16);
    }

    @Test
    public void test6557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6557");
        java.lang.Iterable[] iterableArray1 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.TreeSet<java.lang.String>>[] strSetIterableArray2 = (java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]) iterableArray1;
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList4 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList6 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList8 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, (int) (byte) 10);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList10 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList12 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList14 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, (int) 'a');
        java.lang.Class<?> wildcardClass15 = setIterableSetList14.getClass();
        org.junit.Assert.assertNotNull(iterableArray1);
        org.junit.Assert.assertNotNull(strSetIterableArray2);
        org.junit.Assert.assertNotNull(setIterableSetList4);
        org.junit.Assert.assertNull(setIterableSetList6);
        org.junit.Assert.assertNotNull(setIterableSetList8);
        org.junit.Assert.assertNotNull(setIterableSetList10);
        org.junit.Assert.assertNotNull(setIterableSetList12);
        org.junit.Assert.assertNotNull(setIterableSetList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6558");
        java.lang.Class<?>[][][][][][][][][][][][][] wildcardClassArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][][][][][]>> wildcardClassArraySetList2 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6559");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList4 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable>> constableSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[]) strArray2, 4);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList8 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray2, (int) '#');
        java.lang.Class<?> wildcardClass13 = strComparableSetList12.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strComparableSetList4);
        org.junit.Assert.assertNotNull(constableSetList6);
        org.junit.Assert.assertNotNull(strSetList8);
        org.junit.Assert.assertNotNull(constantDescSetList10);
        org.junit.Assert.assertNotNull(strComparableSetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6560");
        java.lang.Class[][][][][][][] classArray1 = new java.lang.Class[0][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.Object>> objSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.Object[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][]>> wildcardClassArraySetList10 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][]>> wildcardClassArraySetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][]>> wildcardClassArraySetList14 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) 'a');
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNull(objSetList8);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList12);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList14);
    }

    @Test
    public void test6561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6561");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.AnnotatedElement>> annotatedElementSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.AnnotatedElement[]) wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> wildcardClassOfFieldSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[]) wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.reflect.AnnotatedElement>> annotatedElementSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.AnnotatedElement[]) wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.Object>> objSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.Object[]) wildcardClassArray2, 4);
        java.lang.Class<?> wildcardClass15 = objSetList14.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNull(typeDescriptorSetList6);
        org.junit.Assert.assertNotNull(annotatedElementSetList8);
        org.junit.Assert.assertNotNull(wildcardClassOfFieldSetList10);
        org.junit.Assert.assertNotNull(annotatedElementSetList12);
        org.junit.Assert.assertNotNull(objSetList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6562");
        java.lang.String[][][][][][][][][][][][][][] strArray0 = new java.lang.String[][][][][][][][][][][][][][] {};
        java.lang.String[][][][][][][][][][][][][][][] strArray1 = new java.lang.String[][][][][][][][][][][][][][][] { strArray0 };
        java.lang.String[][][][][][][][][][][][][][] strArray2 = new java.lang.String[][][][][][][][][][][][][][] {};
        java.lang.String[][][][][][][][][][][][][][][] strArray3 = new java.lang.String[][][][][][][][][][][][][][][] { strArray2 };
        java.lang.String[][][][][][][][][][][][][][][][] strArray4 = new java.lang.String[][][][][][][][][][][][][][][][] { strArray1, strArray3 };
        java.lang.String[][][][][][][][][][][][][][] strArray5 = new java.lang.String[][][][][][][][][][][][][][] {};
        java.lang.String[][][][][][][][][][][][][][][] strArray6 = new java.lang.String[][][][][][][][][][][][][][][] { strArray5 };
        java.lang.String[][][][][][][][][][][][][][] strArray7 = new java.lang.String[][][][][][][][][][][][][][] {};
        java.lang.String[][][][][][][][][][][][][][][] strArray8 = new java.lang.String[][][][][][][][][][][][][][][] { strArray7 };
        java.lang.String[][][][][][][][][][][][][][][][] strArray9 = new java.lang.String[][][][][][][][][][][][][][][][] { strArray6, strArray8 };
        java.lang.String[][][][][][][][][][][][][][] strArray10 = new java.lang.String[][][][][][][][][][][][][][] {};
        java.lang.String[][][][][][][][][][][][][][][] strArray11 = new java.lang.String[][][][][][][][][][][][][][][] { strArray10 };
        java.lang.String[][][][][][][][][][][][][][] strArray12 = new java.lang.String[][][][][][][][][][][][][][] {};
        java.lang.String[][][][][][][][][][][][][][][] strArray13 = new java.lang.String[][][][][][][][][][][][][][][] { strArray12 };
        java.lang.String[][][][][][][][][][][][][][][][] strArray14 = new java.lang.String[][][][][][][][][][][][][][][][] { strArray11, strArray13 };
        java.lang.String[][][][][][][][][][][][][][] strArray15 = new java.lang.String[][][][][][][][][][][][][][] {};
        java.lang.String[][][][][][][][][][][][][][][] strArray16 = new java.lang.String[][][][][][][][][][][][][][][] { strArray15 };
        java.lang.String[][][][][][][][][][][][][][] strArray17 = new java.lang.String[][][][][][][][][][][][][][] {};
        java.lang.String[][][][][][][][][][][][][][][] strArray18 = new java.lang.String[][][][][][][][][][][][][][][] { strArray17 };
        java.lang.String[][][][][][][][][][][][][][][][] strArray19 = new java.lang.String[][][][][][][][][][][][][][][][] { strArray16, strArray18 };
        java.lang.String[][][][][][][][][][][][][][][][][] strArray20 = new java.lang.String[][][][][][][][][][][][][][][][][] { strArray4, strArray9, strArray14, strArray19 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][][][][][][][][][]>> strArraySetList22 = com.thealgorithms.backtracking.Combination.combination(strArray20, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test6563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6563");
        java.lang.Class[][][] classArray1 = new java.lang.Class[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][] wildcardClassArray2 = (java.lang.Class<?>[][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][]>> genericDeclarationArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][]) wildcardClassArray2, (-1));
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][]>> typeArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList10 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][]>> genericDeclarationArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][]) wildcardClassArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList14 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][]>> genericDeclarationArraySetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][]) wildcardClassArray2, 6);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList6);
        org.junit.Assert.assertNull(typeArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList10);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList12);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList14);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList16);
    }

    @Test
    public void test6564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6564");
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray1 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray2 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray3 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][] combinationArray4 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][] { combinationArray0, combinationArray1, combinationArray2, combinationArray3 };
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray4, (int) (byte) 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][]>> combinationArraySetList8 = com.thealgorithms.backtracking.Combination.combination(combinationArray4, (int) (short) 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][]>> combinationArraySetList10 = com.thealgorithms.backtracking.Combination.combination(combinationArray4, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][]>> combinationArraySetList12 = com.thealgorithms.backtracking.Combination.combination(combinationArray4, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNotNull(combinationArray1);
        org.junit.Assert.assertNotNull(combinationArray2);
        org.junit.Assert.assertNotNull(combinationArray3);
        org.junit.Assert.assertNotNull(combinationArray4);
        org.junit.Assert.assertNull(combinationArraySetList6);
        org.junit.Assert.assertNull(combinationArraySetList8);
        org.junit.Assert.assertNull(combinationArraySetList10);
    }

    @Test
    public void test6565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6565");
        java.util.List[][][][][][][][][][] listArray1 = new java.util.List[0][][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][][][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][][][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][][]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, 4);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][][]>> listArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][][]>> listArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) 1);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][][]>> listArraySetList10 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][][]>> listArraySetList12 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, 0);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][][]>> listArraySetList14 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][][]>> listArraySetList16 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) '4');
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][][]>> listArraySetList18 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, 3);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][][]>> listArraySetList20 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) '4');
        java.lang.Class<?> wildcardClass21 = strSetListArray2.getClass();
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArraySetList4);
        org.junit.Assert.assertNotNull(listArraySetList6);
        org.junit.Assert.assertNotNull(listArraySetList8);
        org.junit.Assert.assertNotNull(listArraySetList10);
        org.junit.Assert.assertNull(listArraySetList12);
        org.junit.Assert.assertNotNull(listArraySetList14);
        org.junit.Assert.assertNotNull(listArraySetList16);
        org.junit.Assert.assertNotNull(listArraySetList18);
        org.junit.Assert.assertNotNull(listArraySetList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6566");
        com.thealgorithms.backtracking.Combination[][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (byte) 1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (byte) 1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][]>> combinationArraySetList8 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][]>> combinationArraySetList10 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][]>> combinationArraySetList12 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 100);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][]>> combinationArraySetList14 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (-1));
        java.lang.Class<?> wildcardClass15 = combinationArraySetList14.getClass();
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNotNull(combinationArraySetList2);
        org.junit.Assert.assertNotNull(combinationArraySetList4);
        org.junit.Assert.assertNotNull(combinationArraySetList6);
        org.junit.Assert.assertNotNull(combinationArraySetList8);
        org.junit.Assert.assertNull(combinationArraySetList10);
        org.junit.Assert.assertNotNull(combinationArraySetList12);
        org.junit.Assert.assertNotNull(combinationArraySetList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6567");
        java.util.List[][][][][][][][] listArray1 = new java.util.List[0][][][][][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][]) listArray1;
        java.util.List[][][][][][][][] listArray4 = new java.util.List[0][][][][][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][] strSetListArray5 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][]) listArray4;
        java.util.List[][][][][][][][] listArray7 = new java.util.List[0][][][][][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][] strSetListArray8 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][]) listArray7;
        java.util.List[][][][][][][][][] listArray10 = new java.util.List[3][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][][] strSetListArray11 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][][]) listArray10;
        strSetListArray11[0] = strSetListArray2;
        strSetListArray11[1] = strSetListArray5;
        strSetListArray11[2] = strSetListArray8;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][]>> listArraySetList19 = com.thealgorithms.backtracking.Combination.combination(strSetListArray11, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][]>> listArraySetList21 = com.thealgorithms.backtracking.Combination.combination(strSetListArray11, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][]>> listArraySetList23 = com.thealgorithms.backtracking.Combination.combination(strSetListArray11, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArray4);
        org.junit.Assert.assertNotNull(strSetListArray5);
        org.junit.Assert.assertNotNull(listArray7);
        org.junit.Assert.assertNotNull(strSetListArray8);
        org.junit.Assert.assertNotNull(listArray10);
        org.junit.Assert.assertNotNull(strSetListArray11);
        org.junit.Assert.assertNull(listArraySetList19);
        org.junit.Assert.assertNull(listArraySetList21);
    }

    @Test
    public void test6568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6568");
        java.lang.Class[][][][][][] classArray1 = new java.lang.Class[0][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 4);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 100);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList10 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) wildcardClassArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][][][]>> genericDeclarationArraySetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][][][][]) wildcardClassArray2, 6);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList16 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.lang.Class<?> wildcardClass17 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(serializableSetList10);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList12);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList14);
        org.junit.Assert.assertNull(wildcardClassArraySetList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6569");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) wildcardClassArray2, 2);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[]>> ofFieldArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[][]) wildcardClassArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 100);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList6);
        org.junit.Assert.assertNotNull(constableArraySetList8);
        org.junit.Assert.assertNotNull(ofFieldArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList12);
    }

    @Test
    public void test6570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6570");
        java.lang.String[][][][][][][][] strArray0 = new java.lang.String[][][][][][][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, 3);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][]>> strArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][]>> strArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strArray0, 1);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][]>> strArraySetList10 = com.thealgorithms.backtracking.Combination.combination(strArray0, 4);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNotNull(strArraySetList4);
        org.junit.Assert.assertNotNull(strArraySetList6);
        org.junit.Assert.assertNotNull(strArraySetList8);
        org.junit.Assert.assertNotNull(strArraySetList10);
    }

    @Test
    public void test6571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6571");
        java.lang.Class[][][][][][][][][][][][][][][][][][][] classArray1 = new java.lang.Class[0][][][][][][][][][][][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][][][][][][][][][][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][][][][][][][][][][][][][][][]) classArray1;
        java.lang.Class[][][][][][][][][][][][][][][][][][][] classArray4 = new java.lang.Class[0][][][][][][][][][][][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][][][][][][][][][][][][][] wildcardClassArray5 = (java.lang.Class<?>[][][][][][][][][][][][][][][][][][][]) classArray4;
        java.lang.Class[][][][][][][][][][][][][][][][][][][] classArray7 = new java.lang.Class[0][][][][][][][][][][][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][][][][][][][][][][][][][] wildcardClassArray8 = (java.lang.Class<?>[][][][][][][][][][][][][][][][][][][]) classArray7;
        java.lang.Class[][][][][][][][][][][][][][][][][][][][] classArray10 = new java.lang.Class[3][][][][][][][][][][][][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][][][][][][][][][][][][][][] wildcardClassArray11 = (java.lang.Class<?>[][][][][][][][][][][][][][][][][][][][]) classArray10;
        wildcardClassArray11[0] = wildcardClassArray2;
        wildcardClassArray11[1] = wildcardClassArray5;
        wildcardClassArray11[2] = wildcardClassArray8;
        java.lang.Class[][][][][][][][][][][][][][][][][][][][][] classArray19 = new java.lang.Class[1][][][][][][][][][][][][][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][][][][][][][][][][][][][][][] wildcardClassArray20 = (java.lang.Class<?>[][][][][][][][][][][][][][][][][][][][][]) classArray19;
        wildcardClassArray20[0] = wildcardClassArray11;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][][][][][][][][][][][][][]>> wildcardClassArraySetList24 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray20, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][][][][][][][][][][][][][]>> wildcardClassArraySetList26 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray20, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][][][][][][][][][][][][][]>> wildcardClassArraySetList28 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray20, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][][][][][][][][][][][][][]>> wildcardClassArraySetList30 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray20, 5);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(classArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(classArray19);
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList24);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList26);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList28);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList30);
    }

    @Test
    public void test6572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6572");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.AnnotatedElement>> annotatedElementSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.AnnotatedElement[]) wildcardClassArray2, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> wildcardClassOfFieldSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.reflect.AnnotatedElement>> annotatedElementSetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.AnnotatedElement[]) wildcardClassArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList18 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (short) 100);
        java.lang.Class<?> wildcardClass19 = typeDescriptorSetList18.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNull(typeDescriptorSetList6);
        org.junit.Assert.assertNotNull(annotatedElementSetList8);
        org.junit.Assert.assertNotNull(typeDescriptorSetList10);
        org.junit.Assert.assertNotNull(genericDeclarationSetList12);
        org.junit.Assert.assertNotNull(wildcardClassOfFieldSetList14);
        org.junit.Assert.assertNotNull(annotatedElementSetList16);
        org.junit.Assert.assertNotNull(typeDescriptorSetList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6573");
        java.lang.Class[][][][][][] classArray1 = new java.lang.Class[0][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 4);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList10 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][][][]>> genericDeclarationArraySetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][][][][]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList16 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][][][]>> genericDeclarationArraySetList18 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][][][][]) wildcardClassArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][][][]>> genericDeclarationArraySetList20 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][][][][]) wildcardClassArray2, (-1));
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][][][]>> genericDeclarationArraySetList22 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][][][][]) wildcardClassArray2, (int) (short) 10);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList12);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList14);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList16);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList18);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList20);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList22);
    }

    @Test
    public void test6574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6574");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList10 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 1);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList14 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 0);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList6);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList10);
        org.junit.Assert.assertNull(constableArraySetList12);
        org.junit.Assert.assertNull(wildcardClassArraySetList14);
    }

    @Test
    public void test6575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6575");
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) 'a');
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 10);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 3);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][]>> combinationArraySetList8 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) 'a');
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][]>> combinationArraySetList10 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][]>> combinationArraySetList12 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 10);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][]>> combinationArraySetList14 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) 'a');
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][]>> combinationArraySetList16 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 0);
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNotNull(combinationArraySetList2);
        org.junit.Assert.assertNotNull(combinationArraySetList4);
        org.junit.Assert.assertNotNull(combinationArraySetList6);
        org.junit.Assert.assertNotNull(combinationArraySetList8);
        org.junit.Assert.assertNull(combinationArraySetList10);
        org.junit.Assert.assertNotNull(combinationArraySetList12);
        org.junit.Assert.assertNotNull(combinationArraySetList14);
        org.junit.Assert.assertNull(combinationArraySetList16);
    }

    @Test
    public void test6576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6576");
        java.lang.Class[][][][] classArray1 = new java.lang.Class[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.Object>> objSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.Object[]) wildcardClassArray2, 6);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 10);
        java.lang.Class<?> wildcardClass13 = wildcardClassArraySetList12.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(typeArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(objSetList10);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6577");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList14 = com.thealgorithms.backtracking.Combination.combination(strArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList16 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList18 = com.thealgorithms.backtracking.Combination.combination(strArray2, 0);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList20 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray2, (-1));
        java.lang.Class<?> wildcardClass21 = serializableSetList20.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(constantDescSetList6);
        org.junit.Assert.assertNull(charSequenceSetList8);
        org.junit.Assert.assertNotNull(charSequenceSetList10);
        org.junit.Assert.assertNotNull(charSequenceSetList12);
        org.junit.Assert.assertNotNull(strSetList14);
        org.junit.Assert.assertNotNull(strSetList16);
        org.junit.Assert.assertNull(strSetList18);
        org.junit.Assert.assertNotNull(serializableSetList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6578");
        java.lang.String[][][][][][] strArray0 = new java.lang.String[][][][][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) 10);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strArray0, 6);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList10 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList12 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList14 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass15 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNull(strArraySetList4);
        org.junit.Assert.assertNotNull(strArraySetList6);
        org.junit.Assert.assertNotNull(strArraySetList8);
        org.junit.Assert.assertNotNull(strArraySetList10);
        org.junit.Assert.assertNotNull(strArraySetList12);
        org.junit.Assert.assertNotNull(strArraySetList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6579");
        java.util.List[] listArray1 = new java.util.List[0];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[]) listArray1;
        java.util.List[] listArray4 = new java.util.List[0];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[] strSetListArray5 = (java.util.List<java.util.TreeSet<java.lang.String>>[]) listArray4;
        java.util.List[][] listArray7 = new java.util.List[2][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][] strSetListArray8 = (java.util.List<java.util.TreeSet<java.lang.String>>[][]) listArray7;
        strSetListArray8[0] = strSetListArray2;
        strSetListArray8[1] = strSetListArray5;
        java.util.List[][][] listArray14 = new java.util.List[1][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][] strSetListArray15 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][]) listArray14;
        strSetListArray15[0] = strSetListArray8;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][]>> listArraySetList19 = com.thealgorithms.backtracking.Combination.combination(strSetListArray15, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][]>> listArraySetList21 = com.thealgorithms.backtracking.Combination.combination(strSetListArray15, (int) '#');
        java.util.List<java.util.TreeSet<java.util.Collection[][]>> collectionArraySetList23 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][][]) strSetListArray15, 0);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][]>> listArraySetList25 = com.thealgorithms.backtracking.Combination.combination(strSetListArray15, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.util.Collection[][]>> collectionArraySetList27 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][][]) strSetListArray15, (int) '#');
        java.util.List<java.util.TreeSet<java.util.Collection[][]>> collectionArraySetList29 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][][]) strSetListArray15, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][]>> listArraySetList31 = com.thealgorithms.backtracking.Combination.combination(strSetListArray15, (int) ' ');
        java.lang.Class<?> wildcardClass32 = strSetListArray15.getClass();
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArray4);
        org.junit.Assert.assertNotNull(strSetListArray5);
        org.junit.Assert.assertNotNull(listArray7);
        org.junit.Assert.assertNotNull(strSetListArray8);
        org.junit.Assert.assertNotNull(listArray14);
        org.junit.Assert.assertNotNull(strSetListArray15);
        org.junit.Assert.assertNotNull(listArraySetList19);
        org.junit.Assert.assertNotNull(listArraySetList21);
        org.junit.Assert.assertNull(collectionArraySetList23);
        org.junit.Assert.assertNull(listArraySetList25);
        org.junit.Assert.assertNotNull(collectionArraySetList27);
        org.junit.Assert.assertNotNull(collectionArraySetList29);
        org.junit.Assert.assertNotNull(listArraySetList31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test6580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6580");
        java.util.List[][][][] listArray1 = new java.util.List[0][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][]>> listArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) '4');
        java.util.List<java.util.TreeSet<java.util.Collection[][][]>> collectionArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][][][]) strSetListArray2, 100);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][]>> listArraySetList10 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (-1));
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArraySetList4);
        org.junit.Assert.assertNotNull(listArraySetList6);
        org.junit.Assert.assertNotNull(collectionArraySetList8);
        org.junit.Assert.assertNotNull(listArraySetList10);
    }

    @Test
    public void test6581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6581");
        java.lang.Class[][][][][][] classArray1 = new java.lang.Class[0][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 4);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList10 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][][][]>> genericDeclarationArraySetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][][][][]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList16 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][][][]>> genericDeclarationArraySetList18 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][][][][]) wildcardClassArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][][][]>> genericDeclarationArraySetList20 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][][][][]) wildcardClassArray2, (-1));
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList22 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) wildcardClassArray2, (int) 'a');
        java.lang.Class<?> wildcardClass23 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList12);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList14);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList16);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList18);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList20);
        org.junit.Assert.assertNotNull(serializableSetList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6582");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList10 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) ' ');
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(typeDescriptorSetList6);
        org.junit.Assert.assertNull(genericDeclarationSetList8);
        org.junit.Assert.assertNotNull(serializableSetList10);
        org.junit.Assert.assertNotNull(wildcardClassSetList12);
    }

    @Test
    public void test6583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6583");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray2, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList8 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray2, 6);
        java.lang.Class<?> wildcardClass13 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNull(constantDescSetList6);
        org.junit.Assert.assertNotNull(strSetList8);
        org.junit.Assert.assertNull(constantDescSetList10);
        org.junit.Assert.assertNotNull(constantDescSetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6584");
        java.lang.String[][][][][][][][] strArray0 = new java.lang.String[][][][][][][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][]>> strArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][]>> strArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strArray0, 10);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][]>> strArraySetList10 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][]>> strArraySetList12 = com.thealgorithms.backtracking.Combination.combination(strArray0, 4);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNotNull(strArraySetList4);
        org.junit.Assert.assertNotNull(strArraySetList6);
        org.junit.Assert.assertNotNull(strArraySetList8);
        org.junit.Assert.assertNotNull(strArraySetList10);
        org.junit.Assert.assertNotNull(strArraySetList12);
    }

    @Test
    public void test6585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6585");
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 4);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][]>> combinationArraySetList8 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (byte) 100);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][]>> combinationArraySetList10 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (byte) 1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][]>> combinationArraySetList12 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][]>> combinationArraySetList14 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 0);
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNull(combinationArraySetList2);
        org.junit.Assert.assertNotNull(combinationArraySetList4);
        org.junit.Assert.assertNotNull(combinationArraySetList6);
        org.junit.Assert.assertNotNull(combinationArraySetList8);
        org.junit.Assert.assertNotNull(combinationArraySetList10);
        org.junit.Assert.assertNotNull(combinationArraySetList12);
        org.junit.Assert.assertNull(combinationArraySetList14);
    }

    @Test
    public void test6586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6586");
        com.thealgorithms.backtracking.Combination combination0 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination1 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination2 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination3 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination4 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination5 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination[] combinationArray6 = new com.thealgorithms.backtracking.Combination[] { combination0, combination1, combination2, combination3, combination4, combination5 };
        com.thealgorithms.backtracking.Combination combination7 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination8 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination9 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination10 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination11 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination12 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination[] combinationArray13 = new com.thealgorithms.backtracking.Combination[] { combination7, combination8, combination9, combination10, combination11, combination12 };
        com.thealgorithms.backtracking.Combination[][] combinationArray14 = new com.thealgorithms.backtracking.Combination[][] { combinationArray6, combinationArray13 };
        com.thealgorithms.backtracking.Combination combination15 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination16 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination17 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination18 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination19 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination20 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination[] combinationArray21 = new com.thealgorithms.backtracking.Combination[] { combination15, combination16, combination17, combination18, combination19, combination20 };
        com.thealgorithms.backtracking.Combination combination22 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination23 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination24 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination25 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination26 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination27 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination[] combinationArray28 = new com.thealgorithms.backtracking.Combination[] { combination22, combination23, combination24, combination25, combination26, combination27 };
        com.thealgorithms.backtracking.Combination[][] combinationArray29 = new com.thealgorithms.backtracking.Combination[][] { combinationArray21, combinationArray28 };
        com.thealgorithms.backtracking.Combination combination30 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination31 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination32 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination33 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination34 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination35 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination[] combinationArray36 = new com.thealgorithms.backtracking.Combination[] { combination30, combination31, combination32, combination33, combination34, combination35 };
        com.thealgorithms.backtracking.Combination combination37 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination38 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination39 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination40 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination41 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination42 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination[] combinationArray43 = new com.thealgorithms.backtracking.Combination[] { combination37, combination38, combination39, combination40, combination41, combination42 };
        com.thealgorithms.backtracking.Combination[][] combinationArray44 = new com.thealgorithms.backtracking.Combination[][] { combinationArray36, combinationArray43 };
        com.thealgorithms.backtracking.Combination combination45 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination46 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination47 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination48 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination49 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination50 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination[] combinationArray51 = new com.thealgorithms.backtracking.Combination[] { combination45, combination46, combination47, combination48, combination49, combination50 };
        com.thealgorithms.backtracking.Combination combination52 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination53 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination54 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination55 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination56 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination57 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination[] combinationArray58 = new com.thealgorithms.backtracking.Combination[] { combination52, combination53, combination54, combination55, combination56, combination57 };
        com.thealgorithms.backtracking.Combination[][] combinationArray59 = new com.thealgorithms.backtracking.Combination[][] { combinationArray51, combinationArray58 };
        com.thealgorithms.backtracking.Combination combination60 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination61 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination62 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination63 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination64 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination65 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination[] combinationArray66 = new com.thealgorithms.backtracking.Combination[] { combination60, combination61, combination62, combination63, combination64, combination65 };
        com.thealgorithms.backtracking.Combination combination67 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination68 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination69 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination70 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination71 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination72 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination[] combinationArray73 = new com.thealgorithms.backtracking.Combination[] { combination67, combination68, combination69, combination70, combination71, combination72 };
        com.thealgorithms.backtracking.Combination[][] combinationArray74 = new com.thealgorithms.backtracking.Combination[][] { combinationArray66, combinationArray73 };
        com.thealgorithms.backtracking.Combination[][][] combinationArray75 = new com.thealgorithms.backtracking.Combination[][][] { combinationArray14, combinationArray29, combinationArray44, combinationArray59, combinationArray74 };
        com.thealgorithms.backtracking.Combination[][][][] combinationArray76 = new com.thealgorithms.backtracking.Combination[][][][] { combinationArray75 };
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][]>> combinationArraySetList78 = com.thealgorithms.backtracking.Combination.combination(combinationArray76, 2);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][]>> combinationArraySetList80 = com.thealgorithms.backtracking.Combination.combination(combinationArray76, (int) (byte) 100);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][]>> combinationArraySetList82 = com.thealgorithms.backtracking.Combination.combination(combinationArray76, 3);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][]>> combinationArraySetList84 = com.thealgorithms.backtracking.Combination.combination(combinationArray76, 6);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][]>> combinationArraySetList86 = com.thealgorithms.backtracking.Combination.combination(combinationArray76, (int) ' ');
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][]>> combinationArraySetList88 = com.thealgorithms.backtracking.Combination.combination(combinationArray76, 4);
        java.util.List<java.util.TreeSet<java.lang.Object>> objSetList90 = com.thealgorithms.backtracking.Combination.combination((java.lang.Object[]) combinationArray76, 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][]>> combinationArraySetList92 = com.thealgorithms.backtracking.Combination.combination(combinationArray76, (int) (short) 10);
        org.junit.Assert.assertNotNull(combinationArray6);
        org.junit.Assert.assertNotNull(combinationArray13);
        org.junit.Assert.assertNotNull(combinationArray14);
        org.junit.Assert.assertNotNull(combinationArray21);
        org.junit.Assert.assertNotNull(combinationArray28);
        org.junit.Assert.assertNotNull(combinationArray29);
        org.junit.Assert.assertNotNull(combinationArray36);
        org.junit.Assert.assertNotNull(combinationArray43);
        org.junit.Assert.assertNotNull(combinationArray44);
        org.junit.Assert.assertNotNull(combinationArray51);
        org.junit.Assert.assertNotNull(combinationArray58);
        org.junit.Assert.assertNotNull(combinationArray59);
        org.junit.Assert.assertNotNull(combinationArray66);
        org.junit.Assert.assertNotNull(combinationArray73);
        org.junit.Assert.assertNotNull(combinationArray74);
        org.junit.Assert.assertNotNull(combinationArray75);
        org.junit.Assert.assertNotNull(combinationArray76);
        org.junit.Assert.assertNotNull(combinationArraySetList78);
        org.junit.Assert.assertNotNull(combinationArraySetList80);
        org.junit.Assert.assertNotNull(combinationArraySetList82);
        org.junit.Assert.assertNotNull(combinationArraySetList84);
        org.junit.Assert.assertNotNull(combinationArraySetList86);
        org.junit.Assert.assertNotNull(combinationArraySetList88);
        org.junit.Assert.assertNull(objSetList90);
        org.junit.Assert.assertNotNull(combinationArraySetList92);
    }

    @Test
    public void test6587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6587");
        java.util.List[] listArray1 = new java.util.List[0];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[]) listArray1;
        java.util.List[] listArray4 = new java.util.List[0];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[] strSetListArray5 = (java.util.List<java.util.TreeSet<java.lang.String>>[]) listArray4;
        java.util.List[][] listArray7 = new java.util.List[2][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][] strSetListArray8 = (java.util.List<java.util.TreeSet<java.lang.String>>[][]) listArray7;
        strSetListArray8[0] = strSetListArray2;
        strSetListArray8[1] = strSetListArray5;
        java.util.List[][][] listArray14 = new java.util.List[1][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][] strSetListArray15 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][]) listArray14;
        strSetListArray15[0] = strSetListArray8;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][]>> listArraySetList19 = com.thealgorithms.backtracking.Combination.combination(strSetListArray15, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.util.Collection[][]>> collectionArraySetList21 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][][]) strSetListArray15, 10);
        java.util.List<java.util.TreeSet<java.util.Collection[][]>> collectionArraySetList23 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][][]) strSetListArray15, 6);
        java.util.List<java.util.TreeSet<java.util.Collection[][]>> collectionArraySetList25 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][][]) strSetListArray15, (int) 'a');
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArray4);
        org.junit.Assert.assertNotNull(strSetListArray5);
        org.junit.Assert.assertNotNull(listArray7);
        org.junit.Assert.assertNotNull(strSetListArray8);
        org.junit.Assert.assertNotNull(listArray14);
        org.junit.Assert.assertNotNull(strSetListArray15);
        org.junit.Assert.assertNotNull(listArraySetList19);
        org.junit.Assert.assertNotNull(collectionArraySetList21);
        org.junit.Assert.assertNotNull(collectionArraySetList23);
        org.junit.Assert.assertNotNull(collectionArraySetList25);
    }

    @Test
    public void test6588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6588");
        java.util.List[] listArray1 = new java.util.List[0];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>>> setListSetList4 = com.thealgorithms.backtracking.Combination.combination((java.util.List<java.util.TreeSet<java.lang.String>>[]) listArray1, (int) (short) 1);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>>> setListSetList6 = com.thealgorithms.backtracking.Combination.combination((java.util.List<java.util.TreeSet<java.lang.String>>[]) listArray1, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>>> setListSetList8 = com.thealgorithms.backtracking.Combination.combination((java.util.List<java.util.TreeSet<java.lang.String>>[]) listArray1, 100);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>>> setListSetList10 = com.thealgorithms.backtracking.Combination.combination((java.util.List<java.util.TreeSet<java.lang.String>>[]) listArray1, 4);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>>> setListSetList12 = com.thealgorithms.backtracking.Combination.combination((java.util.List<java.util.TreeSet<java.lang.String>>[]) listArray1, (int) '#');
        java.lang.Class<?> wildcardClass13 = setListSetList12.getClass();
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(setListSetList4);
        org.junit.Assert.assertNull(setListSetList6);
        org.junit.Assert.assertNotNull(setListSetList8);
        org.junit.Assert.assertNotNull(setListSetList10);
        org.junit.Assert.assertNotNull(setListSetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6589");
        com.thealgorithms.backtracking.Combination[][][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (byte) 1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 100);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][]>> combinationArraySetList8 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (byte) -1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][]>> combinationArraySetList10 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) '#');
        java.lang.Class<?> wildcardClass11 = combinationArray0.getClass();
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNotNull(combinationArraySetList2);
        org.junit.Assert.assertNotNull(combinationArraySetList4);
        org.junit.Assert.assertNotNull(combinationArraySetList6);
        org.junit.Assert.assertNotNull(combinationArraySetList8);
        org.junit.Assert.assertNotNull(combinationArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test6590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6590");
        com.thealgorithms.backtracking.Combination combination0 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination[] combinationArray1 = new com.thealgorithms.backtracking.Combination[] { combination0 };
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination>> combinationSetList3 = com.thealgorithms.backtracking.Combination.combination(combinationArray1, (int) (byte) 100);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination>> combinationSetList5 = com.thealgorithms.backtracking.Combination.combination(combinationArray1, (int) (byte) 100);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination>> combinationSetList7 = com.thealgorithms.backtracking.Combination.combination(combinationArray1, 2);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination>> combinationSetList9 = com.thealgorithms.backtracking.Combination.combination(combinationArray1, 4);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination>> combinationSetList11 = com.thealgorithms.backtracking.Combination.combination(combinationArray1, 10);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination>> combinationSetList13 = com.thealgorithms.backtracking.Combination.combination(combinationArray1, (int) 'a');
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination>> combinationSetList15 = com.thealgorithms.backtracking.Combination.combination(combinationArray1, 5);
        org.junit.Assert.assertNotNull(combinationArray1);
        org.junit.Assert.assertNotNull(combinationSetList3);
        org.junit.Assert.assertNotNull(combinationSetList5);
        org.junit.Assert.assertNotNull(combinationSetList7);
        org.junit.Assert.assertNotNull(combinationSetList9);
        org.junit.Assert.assertNotNull(combinationSetList11);
        org.junit.Assert.assertNotNull(combinationSetList13);
        org.junit.Assert.assertNotNull(combinationSetList15);
    }

    @Test
    public void test6591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6591");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][]) wildcardClassArray2, 5);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][]) wildcardClassArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, (int) '4');
        java.lang.Class<?> wildcardClass13 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(typeArraySetList8);
        org.junit.Assert.assertNotNull(typeArraySetList10);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6592");
        java.util.List[][][][][][] listArray1 = new java.util.List[0][][][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][]>> listArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) 1);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][]>> listArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) '4');
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArraySetList4);
        org.junit.Assert.assertNotNull(listArraySetList6);
        org.junit.Assert.assertNotNull(listArraySetList8);
    }

    @Test
    public void test6593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6593");
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) '4');
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (byte) 100);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][]>> combinationArraySetList8 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 6);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][]>> combinationArraySetList10 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) ' ');
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNotNull(combinationArraySetList2);
        org.junit.Assert.assertNull(combinationArraySetList4);
        org.junit.Assert.assertNotNull(combinationArraySetList6);
        org.junit.Assert.assertNotNull(combinationArraySetList8);
        org.junit.Assert.assertNotNull(combinationArraySetList10);
    }

    @Test
    public void test6594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6594");
        java.lang.Class[][][][] classArray1 = new java.lang.Class[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList14 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) wildcardClassArray2, (int) (byte) 10);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList16 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 5);
        java.lang.Class<?> wildcardClass17 = wildcardClassArraySetList16.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(typeArraySetList6);
        org.junit.Assert.assertNotNull(typeArraySetList8);
        org.junit.Assert.assertNotNull(typeArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList12);
        org.junit.Assert.assertNotNull(serializableSetList14);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6595");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable>> constableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[]) strArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.Object>> objSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.Object[]) strArray2, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList12 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, (int) (byte) 10);
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList18 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) (byte) 100);
        java.lang.Class<?> wildcardClass19 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(charSequenceSetList6);
        org.junit.Assert.assertNotNull(constableSetList8);
        org.junit.Assert.assertNull(objSetList10);
        org.junit.Assert.assertNotNull(strSetList12);
        org.junit.Assert.assertNotNull(charSequenceSetList14);
        org.junit.Assert.assertNull(strComparableSetList16);
        org.junit.Assert.assertNotNull(strSetList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6596");
        java.util.List<java.util.TreeSet<java.lang.String>>[][][] strSetListArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][]>> listArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strSetListArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6597");
        java.lang.Class[][][][][][][][][] classArray1 = new java.lang.Class[0][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][][][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 2);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][]>> wildcardClassArraySetList10 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 5);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList10);
    }

    @Test
    public void test6598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6598");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (-1));
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList14 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.constant.Constable>> constableSetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[]) wildcardClassArray2, (int) '4');
        java.lang.Class<?> wildcardClass17 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(genericDeclarationSetList6);
        org.junit.Assert.assertNotNull(typeDescriptorSetList8);
        org.junit.Assert.assertNull(genericDeclarationSetList10);
        org.junit.Assert.assertNotNull(wildcardClassSetList12);
        org.junit.Assert.assertNotNull(wildcardClassSetList14);
        org.junit.Assert.assertNotNull(constableSetList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6599");
        java.lang.String[][][][][][] strArray0 = new java.lang.String[][][][][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) ' ');
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNotNull(strArraySetList4);
    }

    @Test
    public void test6600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6600");
        java.lang.String[][][][][][][][][][][][] strArray0 = new java.lang.String[][][][][][][][][][][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][][][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][][][][]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNull(strArraySetList4);
    }

    @Test
    public void test6601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6601");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList16 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList18 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (byte) 100);
        java.lang.Class<?> wildcardClass19 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(genericDeclarationSetList6);
        org.junit.Assert.assertNotNull(typeDescriptorSetList8);
        org.junit.Assert.assertNull(genericDeclarationSetList10);
        org.junit.Assert.assertNull(genericDeclarationSetList12);
        org.junit.Assert.assertNotNull(typeDescriptorSetList14);
        org.junit.Assert.assertNotNull(wildcardClassSetList16);
        org.junit.Assert.assertNotNull(genericDeclarationSetList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6602");
        com.thealgorithms.backtracking.Combination[][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (byte) 1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) '4');
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 4);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][]>> combinationArraySetList8 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass9 = combinationArray0.getClass();
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNotNull(combinationArraySetList2);
        org.junit.Assert.assertNotNull(combinationArraySetList4);
        org.junit.Assert.assertNotNull(combinationArraySetList6);
        org.junit.Assert.assertNotNull(combinationArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test6603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6603");
        java.util.List[][] listArray1 = new java.util.List[0][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]>> iterableArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.Iterable<java.util.TreeSet<java.lang.String>>[][]) strSetListArray2, 2);
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][]) strSetListArray2, (-1));
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList10 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList12 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strSetListArray2, (int) (byte) 10);
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList14 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][]) strSetListArray2, 2);
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArraySetList4);
        org.junit.Assert.assertNotNull(iterableArraySetList6);
        org.junit.Assert.assertNotNull(collectionArraySetList8);
        org.junit.Assert.assertNotNull(listArraySetList10);
        org.junit.Assert.assertNotNull(serializableSetList12);
        org.junit.Assert.assertNotNull(collectionArraySetList14);
    }

    @Test
    public void test6604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6604");
        java.lang.String[][][][][] strArray0 = new java.lang.String[][][][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, 100);
        java.util.List<java.util.TreeSet<java.lang.String[][][][]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, 4);
        java.util.List<java.util.TreeSet<java.lang.String[][][][]>> strArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strArray0, 1);
        java.util.List<java.util.TreeSet<java.lang.String[][][][]>> strArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strArray0, 1);
        java.util.List<java.util.TreeSet<java.lang.String[][][][]>> strArraySetList10 = com.thealgorithms.backtracking.Combination.combination(strArray0, (-1));
        java.util.List<java.util.TreeSet<java.lang.String[][][][]>> strArraySetList12 = com.thealgorithms.backtracking.Combination.combination(strArray0, 1);
        java.lang.Class<?> wildcardClass13 = strArraySetList12.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNotNull(strArraySetList4);
        org.junit.Assert.assertNotNull(strArraySetList6);
        org.junit.Assert.assertNotNull(strArraySetList8);
        org.junit.Assert.assertNotNull(strArraySetList10);
        org.junit.Assert.assertNotNull(strArraySetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6605");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> wildcardClassOfFieldSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[]) wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.reflect.AnnotatedElement>> annotatedElementSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.AnnotatedElement[]) wildcardClassArray2, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.reflect.AnnotatedElement>> annotatedElementSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.AnnotatedElement[]) wildcardClassArray2, 2);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, 6);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(typeDescriptorSetList6);
        org.junit.Assert.assertNotNull(typeDescriptorSetList8);
        org.junit.Assert.assertNotNull(wildcardClassOfFieldSetList10);
        org.junit.Assert.assertNotNull(annotatedElementSetList12);
        org.junit.Assert.assertNotNull(annotatedElementSetList14);
        org.junit.Assert.assertNotNull(genericDeclarationSetList16);
    }

    @Test
    public void test6606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6606");
        com.thealgorithms.backtracking.Combination[][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (byte) 1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 100);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][]>> combinationArraySetList8 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][]>> combinationArraySetList10 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][]>> combinationArraySetList12 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][]>> combinationArraySetList14 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (byte) -1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][]>> combinationArraySetList16 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 100);
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNotNull(combinationArraySetList2);
        org.junit.Assert.assertNotNull(combinationArraySetList4);
        org.junit.Assert.assertNull(combinationArraySetList6);
        org.junit.Assert.assertNull(combinationArraySetList8);
        org.junit.Assert.assertNull(combinationArraySetList10);
        org.junit.Assert.assertNotNull(combinationArraySetList12);
        org.junit.Assert.assertNotNull(combinationArraySetList14);
        org.junit.Assert.assertNotNull(combinationArraySetList16);
    }

    @Test
    public void test6607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6607");
        java.util.List[][] listArray1 = new java.util.List[0][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]>> iterableArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.Iterable<java.util.TreeSet<java.lang.String>>[][]) strSetListArray2, 2);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]>> iterableArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.Iterable<java.util.TreeSet<java.lang.String>>[][]) strSetListArray2, 4);
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][]) strSetListArray2, (int) (short) 0);
        java.lang.Class<?> wildcardClass13 = strSetListArray2.getClass();
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArraySetList4);
        org.junit.Assert.assertNotNull(iterableArraySetList6);
        org.junit.Assert.assertNotNull(listArraySetList8);
        org.junit.Assert.assertNotNull(iterableArraySetList10);
        org.junit.Assert.assertNull(collectionArraySetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6608");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList16 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = wildcardClassSetList16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(genericDeclarationSetList6);
        org.junit.Assert.assertNotNull(typeDescriptorSetList8);
        org.junit.Assert.assertNull(genericDeclarationSetList10);
        org.junit.Assert.assertNull(genericDeclarationSetList12);
        org.junit.Assert.assertNull(typeDescriptorSetList14);
        org.junit.Assert.assertNull(wildcardClassSetList16);
    }

    @Test
    public void test6609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6609");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class[][] classArray4 = new java.lang.Class[1][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray5 = (java.lang.Class<?>[][]) classArray4;
        wildcardClassArray5[0] = classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList9 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray5, 10);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList11 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray5, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList13 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) wildcardClassArray5, 4);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[]>> ofFieldArraySetList15 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[][]) wildcardClassArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = ofFieldArraySetList15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(classArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList9);
        org.junit.Assert.assertNull(wildcardClassArraySetList11);
        org.junit.Assert.assertNotNull(constableArraySetList13);
        org.junit.Assert.assertNull(ofFieldArraySetList15);
    }

    @Test
    public void test6610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6610");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 5);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, (int) (byte) 10);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) wildcardClassArray2, (int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = constableArraySetList12.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList10);
        org.junit.Assert.assertNotNull(constableArraySetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6611");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 5);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) wildcardClassArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(constableArraySetList10);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6612");
        java.lang.Iterable<java.util.TreeSet<java.lang.String>>[] strSetIterableArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList2 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6613");
        java.util.List[][][][][][][][][][][][][][] listArray1 = new java.util.List[0][][][][][][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][][][][][][][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][][][][][][][]) listArray1;
        java.util.List[][][][][][][][][][][][][][] listArray4 = new java.util.List[0][][][][][][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][][][][][][][] strSetListArray5 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][][][][][][][]) listArray4;
        java.util.List[][][][][][][][][][][][][][] listArray7 = new java.util.List[0][][][][][][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][][][][][][][] strSetListArray8 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][][][][][][][]) listArray7;
        java.util.List[][][][][][][][][][][][][][][] listArray10 = new java.util.List[3][][][][][][][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][][][][][][][][] strSetListArray11 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][][][][][][][][]) listArray10;
        strSetListArray11[0] = strSetListArray2;
        strSetListArray11[1] = strSetListArray5;
        strSetListArray11[2] = strSetListArray8;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][][][][][][][]>> listArraySetList19 = com.thealgorithms.backtracking.Combination.combination(strSetListArray11, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArray4);
        org.junit.Assert.assertNotNull(strSetListArray5);
        org.junit.Assert.assertNotNull(listArray7);
        org.junit.Assert.assertNotNull(strSetListArray8);
        org.junit.Assert.assertNotNull(listArray10);
        org.junit.Assert.assertNotNull(strSetListArray11);
    }

    @Test
    public void test6614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6614");
        java.util.List[][] listArray1 = new java.util.List[0][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, 3);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, 5);
        java.lang.Class<?> wildcardClass9 = listArraySetList8.getClass();
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArraySetList4);
        org.junit.Assert.assertNotNull(listArraySetList6);
        org.junit.Assert.assertNotNull(listArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test6615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6615");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type>> typeSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.AnnotatedElement>> annotatedElementSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.AnnotatedElement[]) wildcardClassArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type>> typeSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[]) wildcardClassArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (short) 0);
        java.lang.Class<?> wildcardClass17 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(typeDescriptorSetList6);
        org.junit.Assert.assertNotNull(typeDescriptorSetList8);
        org.junit.Assert.assertNotNull(typeSetList10);
        org.junit.Assert.assertNotNull(annotatedElementSetList12);
        org.junit.Assert.assertNotNull(typeSetList14);
        org.junit.Assert.assertNull(genericDeclarationSetList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6616");
        java.lang.Class[][][][][][][][] classArray1 = new java.lang.Class[0][][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 2);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 6);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][]>> wildcardClassArraySetList10 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList10);
    }

    @Test
    public void test6617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6617");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][]) wildcardClassArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[]>> ofFieldArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[][]) wildcardClassArray2, (-1));
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList6);
        org.junit.Assert.assertNotNull(constableArraySetList8);
        org.junit.Assert.assertNotNull(typeArraySetList10);
        org.junit.Assert.assertNotNull(ofFieldArraySetList12);
    }

    @Test
    public void test6618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6618");
        java.lang.Class[][][][][][] classArray1 = new java.lang.Class[0][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 4);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList10 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (-1));
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][][][]>> genericDeclarationArraySetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][][][][]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList16 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList18 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) '#');
        java.lang.Class<?> wildcardClass19 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList12);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList14);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList16);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6619");
        java.util.List[][][][][][][][][][][][] listArray1 = new java.util.List[0][][][][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][][][][][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][][][][][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][][][][]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][][][][]>> listArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][][][][]>> listArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) 0);
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNull(listArraySetList4);
        org.junit.Assert.assertNotNull(listArraySetList6);
        org.junit.Assert.assertNull(listArraySetList8);
    }

    @Test
    public void test6620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6620");
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) '4');
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (byte) 100);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][]>> combinationArraySetList8 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) -1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][]>> combinationArraySetList10 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) '#');
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][]>> combinationArraySetList12 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) ' ');
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNotNull(combinationArraySetList2);
        org.junit.Assert.assertNull(combinationArraySetList4);
        org.junit.Assert.assertNotNull(combinationArraySetList6);
        org.junit.Assert.assertNotNull(combinationArraySetList8);
        org.junit.Assert.assertNotNull(combinationArraySetList10);
        org.junit.Assert.assertNotNull(combinationArraySetList12);
    }

    @Test
    public void test6621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6621");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.Object>> objSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.Object[]) wildcardClassArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[]>> ofFieldArraySetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[][]) wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) wildcardClassArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList18 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, 4);
        java.lang.Class<?> wildcardClass19 = genericDeclarationArraySetList18.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNull(genericDeclarationArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNull(genericDeclarationArraySetList10);
        org.junit.Assert.assertNotNull(objSetList12);
        org.junit.Assert.assertNotNull(ofFieldArraySetList14);
        org.junit.Assert.assertNotNull(constableArraySetList16);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6622");
        java.lang.Class[][][][][][] classArray1 = new java.lang.Class[0][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 4);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][][][]>> genericDeclarationArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][][][][]) wildcardClassArray2, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) '#');
        java.lang.Class<?> wildcardClass13 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6623");
        java.lang.Class[][][][][][] classArray1 = new java.lang.Class[0][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][][][]>> genericDeclarationArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][][][][]) wildcardClassArray2, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 100);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
    }

    @Test
    public void test6624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6624");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, (-1));
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.Object>> objSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.Object[]) strArray0, 5);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNotNull(strArraySetList4);
        org.junit.Assert.assertNotNull(strArraySetList6);
        org.junit.Assert.assertNotNull(strArraySetList8);
        org.junit.Assert.assertNotNull(objSetList10);
    }

    @Test
    public void test6625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6625");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList16 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.reflect.Type>> typeSetList18 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[]) wildcardClassArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList20 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.lang.reflect.AnnotatedElement>> annotatedElementSetList22 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.AnnotatedElement[]) wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList24 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, 4);
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList26 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) 'a');
        java.lang.Class<?> wildcardClass27 = wildcardClassSetList26.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(genericDeclarationSetList6);
        org.junit.Assert.assertNotNull(typeDescriptorSetList8);
        org.junit.Assert.assertNull(genericDeclarationSetList10);
        org.junit.Assert.assertNull(genericDeclarationSetList12);
        org.junit.Assert.assertNotNull(typeDescriptorSetList14);
        org.junit.Assert.assertNotNull(wildcardClassSetList16);
        org.junit.Assert.assertNotNull(typeSetList18);
        org.junit.Assert.assertNotNull(wildcardClassSetList20);
        org.junit.Assert.assertNull(annotatedElementSetList22);
        org.junit.Assert.assertNotNull(typeDescriptorSetList24);
        org.junit.Assert.assertNotNull(wildcardClassSetList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test6626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6626");
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 3);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) -1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNotNull(combinationArraySetList2);
        org.junit.Assert.assertNotNull(combinationArraySetList4);
        org.junit.Assert.assertNotNull(combinationArraySetList6);
    }

    @Test
    public void test6627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6627");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList10 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 2);
        java.lang.Class<?> wildcardClass11 = wildcardClassArraySetList10.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList6);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test6628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6628");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][]) wildcardClassArray2, 5);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][]) wildcardClassArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, (int) (short) 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList16 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 5);
        java.lang.Class<?> wildcardClass17 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(typeArraySetList8);
        org.junit.Assert.assertNotNull(typeArraySetList10);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList12);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList14);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6629");
        com.thealgorithms.backtracking.Combination[][][][][] combinationArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6630");
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) '#');
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 4);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][]>> combinationArraySetList8 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 10);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][]>> combinationArraySetList10 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (byte) 1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][]>> combinationArraySetList12 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) '#');
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][]>> combinationArraySetList14 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][]>> combinationArraySetList16 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) -1);
        java.lang.Class<?> wildcardClass17 = combinationArray0.getClass();
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNull(combinationArraySetList2);
        org.junit.Assert.assertNotNull(combinationArraySetList4);
        org.junit.Assert.assertNotNull(combinationArraySetList6);
        org.junit.Assert.assertNotNull(combinationArraySetList8);
        org.junit.Assert.assertNotNull(combinationArraySetList10);
        org.junit.Assert.assertNotNull(combinationArraySetList12);
        org.junit.Assert.assertNull(combinationArraySetList14);
        org.junit.Assert.assertNotNull(combinationArraySetList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6631");
        java.lang.Class<?>[][][][][][][][][][][][][][] wildcardClassArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][][][][][][]>> wildcardClassArraySetList2 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6632");
        java.lang.Class[][][][] classArray1 = new java.lang.Class[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][]>> genericDeclarationArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][][]) wildcardClassArray2, 2);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, (int) (byte) 10);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNull(typeArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList10);
        org.junit.Assert.assertNotNull(typeArraySetList12);
    }

    @Test
    public void test6633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6633");
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 100);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 3);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][]>> combinationArraySetList8 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (byte) 1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][]>> combinationArraySetList10 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][]>> combinationArraySetList12 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 5);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][]>> combinationArraySetList14 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 4);
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNotNull(combinationArraySetList2);
        org.junit.Assert.assertNotNull(combinationArraySetList4);
        org.junit.Assert.assertNull(combinationArraySetList6);
        org.junit.Assert.assertNotNull(combinationArraySetList8);
        org.junit.Assert.assertNull(combinationArraySetList10);
        org.junit.Assert.assertNotNull(combinationArraySetList12);
        org.junit.Assert.assertNotNull(combinationArraySetList14);
    }

    @Test
    public void test6634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6634");
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 6);
        java.lang.Class<?> wildcardClass3 = combinationArraySetList2.getClass();
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNotNull(combinationArraySetList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test6635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6635");
        java.lang.Class[][][] classArray1 = new java.lang.Class[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][] wildcardClassArray2 = (java.lang.Class<?>[][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][]>> genericDeclarationArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][]) wildcardClassArray2, 5);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][]>> typeArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][]) wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList10 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][]>> typeArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][]) wildcardClassArray2, (int) (short) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][]>> genericDeclarationArraySetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][]) wildcardClassArray2, 4);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][]>> genericDeclarationArraySetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][]) wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][]>> genericDeclarationArraySetList18 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][]) wildcardClassArray2, (int) (short) -1);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList6);
        org.junit.Assert.assertNotNull(typeArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList10);
        org.junit.Assert.assertNotNull(typeArraySetList12);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList14);
        org.junit.Assert.assertNull(genericDeclarationArraySetList16);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList18);
    }

    @Test
    public void test6636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6636");
        java.lang.String[][][][][][] strArray0 = new java.lang.String[][][][][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, (-1));
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strArray0, 5);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNotNull(strArraySetList4);
        org.junit.Assert.assertNotNull(strArraySetList6);
    }

    @Test
    public void test6637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6637");
        java.lang.String[][][][][][][][][][][][][][] strArray0 = new java.lang.String[][][][][][][][][][][][][][] {};
        java.lang.String[][][][][][][][][][][][][][][] strArray1 = new java.lang.String[][][][][][][][][][][][][][][] { strArray0 };
        java.lang.String[][][][][][][][][][][][][][] strArray2 = new java.lang.String[][][][][][][][][][][][][][] {};
        java.lang.String[][][][][][][][][][][][][][][] strArray3 = new java.lang.String[][][][][][][][][][][][][][][] { strArray2 };
        java.lang.String[][][][][][][][][][][][][][] strArray4 = new java.lang.String[][][][][][][][][][][][][][] {};
        java.lang.String[][][][][][][][][][][][][][][] strArray5 = new java.lang.String[][][][][][][][][][][][][][][] { strArray4 };
        java.lang.String[][][][][][][][][][][][][][] strArray6 = new java.lang.String[][][][][][][][][][][][][][] {};
        java.lang.String[][][][][][][][][][][][][][][] strArray7 = new java.lang.String[][][][][][][][][][][][][][][] { strArray6 };
        java.lang.String[][][][][][][][][][][][][][][][] strArray8 = new java.lang.String[][][][][][][][][][][][][][][][] { strArray1, strArray3, strArray5, strArray7 };
        java.lang.String[][][][][][][][][][][][][][][][][] strArray9 = new java.lang.String[][][][][][][][][][][][][][][][][] { strArray8 };
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][][][][][][][][][]>> strArraySetList11 = com.thealgorithms.backtracking.Combination.combination(strArray9, 0);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][][][][][][][][][]>> strArraySetList13 = com.thealgorithms.backtracking.Combination.combination(strArray9, 2);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(strArraySetList11);
        org.junit.Assert.assertNotNull(strArraySetList13);
    }

    @Test
    public void test6638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6638");
        java.lang.Class[][][][][][][] classArray1 = new java.lang.Class[0][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (-1));
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][]>> wildcardClassArraySetList10 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 6);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][]>> wildcardClassArraySetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 3);
        java.lang.Class<?> wildcardClass13 = wildcardClassArraySetList12.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6639");
        java.lang.String[][][][][][][][][][][][][][][][][][] strArray0 = new java.lang.String[][][][][][][][][][][][][][][][][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][][][][][][][][][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][][][][][][][][][][]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, 6);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][][][][][][][][][][]>> strArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][][][][][][][][][][]>> strArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) 'a');
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNotNull(strArraySetList4);
        org.junit.Assert.assertNotNull(strArraySetList6);
        org.junit.Assert.assertNotNull(strArraySetList8);
    }

    @Test
    public void test6640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6640");
        java.lang.String[][][][][][] strArray0 = new java.lang.String[][][][][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) 10);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strArray0, 6);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList10 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList12 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList14 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList16 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) '4');
        java.lang.Class<?> wildcardClass17 = strArraySetList16.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNull(strArraySetList4);
        org.junit.Assert.assertNotNull(strArraySetList6);
        org.junit.Assert.assertNotNull(strArraySetList8);
        org.junit.Assert.assertNotNull(strArraySetList10);
        org.junit.Assert.assertNotNull(strArraySetList12);
        org.junit.Assert.assertNotNull(strArraySetList14);
        org.junit.Assert.assertNotNull(strArraySetList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6641");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList4 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.Object>> objSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.Object[]) strArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable>> constableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[]) strArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, (int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strComparableSetList4);
        org.junit.Assert.assertNotNull(objSetList6);
        org.junit.Assert.assertNotNull(constableSetList8);
        org.junit.Assert.assertNull(charSequenceSetList10);
    }

    @Test
    public void test6642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6642");
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass5 = combinationArraySetList4.getClass();
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNull(combinationArraySetList2);
        org.junit.Assert.assertNotNull(combinationArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test6643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6643");
        java.lang.String[][][][][][][][][][][][][][] strArray0 = new java.lang.String[][][][][][][][][][][][][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][][][][][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, 4);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][][][][][][]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNotNull(strArraySetList4);
    }

    @Test
    public void test6644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6644");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.lang.String[][][] strArray1 = new java.lang.String[][][] { strArray0 };
        java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList3 = com.thealgorithms.backtracking.Combination.combination(strArray1, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList5 = com.thealgorithms.backtracking.Combination.combination(strArray1, 5);
        java.lang.Class<?> wildcardClass6 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArraySetList3);
        org.junit.Assert.assertNotNull(strArraySetList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test6645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6645");
        java.lang.String[][][][][][][][][][][][][][] strArray0 = new java.lang.String[][][][][][][][][][][][][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][][][][][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, 4);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][][][][][][]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][][][][][][]>> strArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) 10);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][][][][][][]>> strArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNull(strArraySetList4);
        org.junit.Assert.assertNotNull(strArraySetList6);
        org.junit.Assert.assertNull(strArraySetList8);
    }

    @Test
    public void test6646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6646");
        java.lang.String[][][][][][][][][][][][][][] strArray0 = new java.lang.String[][][][][][][][][][][][][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][][][][][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, 4);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][][][][][][]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][][][][][][]>> strArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNull(strArraySetList4);
        org.junit.Assert.assertNotNull(strArraySetList6);
    }

    @Test
    public void test6647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6647");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable>> constableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[]) strArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.Object>> objSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.Object[]) strArray2, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList14 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable>> constableSetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[]) strArray2, (int) '4');
        java.lang.Class<?> wildcardClass17 = constableSetList16.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(charSequenceSetList6);
        org.junit.Assert.assertNotNull(constableSetList8);
        org.junit.Assert.assertNull(objSetList10);
        org.junit.Assert.assertNotNull(charSequenceSetList12);
        org.junit.Assert.assertNull(strSetList14);
        org.junit.Assert.assertNotNull(constableSetList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6648");
        java.lang.Class[][][][][][][][][][][][][] classArray1 = new java.lang.Class[0][][][][][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][][][][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][][][][][][][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][][][][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 5);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][][][][][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][][][][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 5);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
    }

    @Test
    public void test6649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6649");
        java.lang.Class[][][][][][][] classArray1 = new java.lang.Class[0][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][][][]) classArray1;
        java.lang.Class[][][][][][][][] classArray4 = new java.lang.Class[1][][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][][] wildcardClassArray5 = (java.lang.Class<?>[][][][][][][][]) classArray4;
        wildcardClassArray5[0] = wildcardClassArray2;
        java.lang.Class[][][][][][][] classArray9 = new java.lang.Class[0][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][] wildcardClassArray10 = (java.lang.Class<?>[][][][][][][]) classArray9;
        java.lang.Class[][][][][][][][] classArray12 = new java.lang.Class[1][][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][][] wildcardClassArray13 = (java.lang.Class<?>[][][][][][][][]) classArray12;
        wildcardClassArray13[0] = wildcardClassArray10;
        java.lang.Class[][][][][][][] classArray17 = new java.lang.Class[0][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][] wildcardClassArray18 = (java.lang.Class<?>[][][][][][][]) classArray17;
        java.lang.Class[][][][][][][][] classArray20 = new java.lang.Class[1][][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][][] wildcardClassArray21 = (java.lang.Class<?>[][][][][][][][]) classArray20;
        wildcardClassArray21[0] = wildcardClassArray18;
        java.lang.Class[][][][][][][] classArray25 = new java.lang.Class[0][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][] wildcardClassArray26 = (java.lang.Class<?>[][][][][][][]) classArray25;
        java.lang.Class[][][][][][][][] classArray28 = new java.lang.Class[1][][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][][] wildcardClassArray29 = (java.lang.Class<?>[][][][][][][][]) classArray28;
        wildcardClassArray29[0] = wildcardClassArray26;
        java.lang.Class[][][][][][][][][] classArray33 = new java.lang.Class[4][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][][][] wildcardClassArray34 = (java.lang.Class<?>[][][][][][][][][]) classArray33;
        wildcardClassArray34[0] = wildcardClassArray5;
        wildcardClassArray34[1] = wildcardClassArray13;
        wildcardClassArray34[2] = wildcardClassArray21;
        wildcardClassArray34[3] = wildcardClassArray29;
        java.lang.Class[][][][][][][][][][] classArray44 = new java.lang.Class[1][][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][][][][] wildcardClassArray45 = (java.lang.Class<?>[][][][][][][][][][]) classArray44;
        wildcardClassArray45[0] = wildcardClassArray34;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][][]>> wildcardClassArraySetList49 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray45, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][][]>> wildcardClassArraySetList51 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray45, 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][][]>> wildcardClassArraySetList53 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray45, 6);
        java.lang.Class<?> wildcardClass54 = wildcardClassArraySetList53.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(classArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertNotNull(classArray25);
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertNotNull(classArray28);
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertNotNull(classArray33);
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertNotNull(classArray44);
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList49);
        org.junit.Assert.assertNull(wildcardClassArraySetList51);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList53);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test6650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6650");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray2, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray2, 2);
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList18 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray2, (int) 'a');
        java.lang.Class<?> wildcardClass19 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(charSequenceSetList6);
        org.junit.Assert.assertNotNull(constantDescSetList8);
        org.junit.Assert.assertNotNull(constantDescSetList10);
        org.junit.Assert.assertNotNull(constantDescSetList12);
        org.junit.Assert.assertNull(constantDescSetList14);
        org.junit.Assert.assertNotNull(constantDescSetList16);
        org.junit.Assert.assertNotNull(constantDescSetList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6651");
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) 'a');
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (byte) 10);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 100);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][]>> combinationArraySetList8 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 0);
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNotNull(combinationArraySetList2);
        org.junit.Assert.assertNotNull(combinationArraySetList4);
        org.junit.Assert.assertNotNull(combinationArraySetList6);
        org.junit.Assert.assertNull(combinationArraySetList8);
    }

    @Test
    public void test6652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6652");
        com.thealgorithms.backtracking.Combination[][][][][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (byte) 100);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 5);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][]>> combinationArraySetList8 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (-1));
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNotNull(combinationArraySetList2);
        org.junit.Assert.assertNull(combinationArraySetList4);
        org.junit.Assert.assertNotNull(combinationArraySetList6);
        org.junit.Assert.assertNotNull(combinationArraySetList8);
    }

    @Test
    public void test6653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6653");
        com.thealgorithms.backtracking.Combination combination0 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination[] combinationArray1 = new com.thealgorithms.backtracking.Combination[] { combination0 };
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination>> combinationSetList3 = com.thealgorithms.backtracking.Combination.combination(combinationArray1, (int) (byte) 100);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination>> combinationSetList5 = com.thealgorithms.backtracking.Combination.combination(combinationArray1, (int) (short) 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination>> combinationSetList7 = com.thealgorithms.backtracking.Combination.combination(combinationArray1, 5);
        org.junit.Assert.assertNotNull(combinationArray1);
        org.junit.Assert.assertNotNull(combinationSetList3);
        org.junit.Assert.assertNull(combinationSetList5);
        org.junit.Assert.assertNotNull(combinationSetList7);
    }

    @Test
    public void test6654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6654");
        java.lang.String[][][][][][][] strArray0 = new java.lang.String[][][][][][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][]>> strArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][]>> strArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strArray0, 0);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][]>> strArraySetList10 = com.thealgorithms.backtracking.Combination.combination(strArray0, 100);
        java.lang.Class<?> wildcardClass11 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNotNull(strArraySetList4);
        org.junit.Assert.assertNotNull(strArraySetList6);
        org.junit.Assert.assertNull(strArraySetList8);
        org.junit.Assert.assertNotNull(strArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test6655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6655");
        com.thealgorithms.backtracking.Combination[][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 100);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][]>> combinationArraySetList8 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 10);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][]>> combinationArraySetList10 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) -1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][]>> combinationArraySetList12 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 100);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][]>> combinationArraySetList14 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNull(combinationArraySetList2);
        org.junit.Assert.assertNotNull(combinationArraySetList4);
        org.junit.Assert.assertNotNull(combinationArraySetList6);
        org.junit.Assert.assertNotNull(combinationArraySetList8);
        org.junit.Assert.assertNotNull(combinationArraySetList10);
        org.junit.Assert.assertNotNull(combinationArraySetList12);
        org.junit.Assert.assertNull(combinationArraySetList14);
    }

    @Test
    public void test6656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6656");
        java.lang.Class[][][] classArray1 = new java.lang.Class[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][] wildcardClassArray2 = (java.lang.Class<?>[][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][]>> typeArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][]) wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][]>> genericDeclarationArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][]) wildcardClassArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList10 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][]>> typeArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][]) wildcardClassArray2, (int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNull(typeArraySetList6);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList10);
        org.junit.Assert.assertNotNull(typeArraySetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6657");
        java.lang.Iterable[] iterableArray1 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.TreeSet<java.lang.String>>[] strSetIterableArray2 = (java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]) iterableArray1;
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList4 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList6 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList8 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, (-1));
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList10 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, 10);
        org.junit.Assert.assertNotNull(iterableArray1);
        org.junit.Assert.assertNotNull(strSetIterableArray2);
        org.junit.Assert.assertNotNull(setIterableSetList4);
        org.junit.Assert.assertNull(setIterableSetList6);
        org.junit.Assert.assertNotNull(setIterableSetList8);
        org.junit.Assert.assertNotNull(setIterableSetList10);
    }

    @Test
    public void test6658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6658");
        java.lang.String[][][][][][][][][][][] strArray0 = new java.lang.String[][][][][][][][][][][] {};
        java.lang.String[][][][][][][][][][][] strArray1 = new java.lang.String[][][][][][][][][][][] {};
        java.lang.String[][][][][][][][][][][] strArray2 = new java.lang.String[][][][][][][][][][][] {};
        java.lang.String[][][][][][][][][][][] strArray3 = new java.lang.String[][][][][][][][][][][] {};
        java.lang.String[][][][][][][][][][][] strArray4 = new java.lang.String[][][][][][][][][][][] {};
        java.lang.String[][][][][][][][][][][][] strArray5 = new java.lang.String[][][][][][][][][][][][] { strArray0, strArray1, strArray2, strArray3, strArray4 };
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][][][][]>> strArraySetList7 = com.thealgorithms.backtracking.Combination.combination(strArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][][][][]>> strArraySetList9 = com.thealgorithms.backtracking.Combination.combination(strArray5, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNull(strArraySetList7);
    }

    @Test
    public void test6659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6659");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.AnnotatedElement>> annotatedElementSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.AnnotatedElement[]) wildcardClassArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type>> typeSetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList18 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, 3);
        java.lang.Class<?> wildcardClass19 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(genericDeclarationSetList6);
        org.junit.Assert.assertNotNull(annotatedElementSetList8);
        org.junit.Assert.assertNull(genericDeclarationSetList10);
        org.junit.Assert.assertNull(genericDeclarationSetList12);
        org.junit.Assert.assertNotNull(genericDeclarationSetList14);
        org.junit.Assert.assertNull(typeSetList16);
        org.junit.Assert.assertNotNull(genericDeclarationSetList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6660");
        java.util.List[][] listArray1 = new java.util.List[0][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]>> iterableArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.Iterable<java.util.TreeSet<java.lang.String>>[][]) strSetListArray2, (int) '4');
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][]) strSetListArray2, 10);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList10 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) 1);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList12 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, 5);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]>> iterableArraySetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.Iterable<java.util.TreeSet<java.lang.String>>[][]) strSetListArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]>> iterableArraySetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.Iterable<java.util.TreeSet<java.lang.String>>[][]) strSetListArray2, (int) (short) 10);
        java.lang.Class<?> wildcardClass17 = iterableArraySetList16.getClass();
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArraySetList4);
        org.junit.Assert.assertNotNull(iterableArraySetList6);
        org.junit.Assert.assertNotNull(collectionArraySetList8);
        org.junit.Assert.assertNotNull(listArraySetList10);
        org.junit.Assert.assertNotNull(listArraySetList12);
        org.junit.Assert.assertNotNull(iterableArraySetList14);
        org.junit.Assert.assertNotNull(iterableArraySetList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6661");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type>> typeSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.AnnotatedElement>> annotatedElementSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.AnnotatedElement[]) wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.reflect.AnnotatedElement>> annotatedElementSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.AnnotatedElement[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList18 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, 100);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(typeDescriptorSetList6);
        org.junit.Assert.assertNotNull(typeDescriptorSetList8);
        org.junit.Assert.assertNotNull(typeSetList10);
        org.junit.Assert.assertNotNull(annotatedElementSetList12);
        org.junit.Assert.assertNull(annotatedElementSetList14);
        org.junit.Assert.assertNotNull(typeDescriptorSetList16);
        org.junit.Assert.assertNotNull(genericDeclarationSetList18);
    }

    @Test
    public void test6662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6662");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> wildcardClassOfFieldSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[]) wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.reflect.AnnotatedElement>> annotatedElementSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.AnnotatedElement[]) wildcardClassArray2, (int) '4');
        java.lang.Class<?> wildcardClass13 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(typeDescriptorSetList6);
        org.junit.Assert.assertNotNull(typeDescriptorSetList8);
        org.junit.Assert.assertNotNull(wildcardClassOfFieldSetList10);
        org.junit.Assert.assertNotNull(annotatedElementSetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6663");
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 6);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (-1));
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][][]>> combinationArraySetList8 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][][]>> combinationArraySetList10 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 100);
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNotNull(combinationArraySetList2);
        org.junit.Assert.assertNotNull(combinationArraySetList4);
        org.junit.Assert.assertNotNull(combinationArraySetList6);
        org.junit.Assert.assertNotNull(combinationArraySetList8);
        org.junit.Assert.assertNotNull(combinationArraySetList10);
    }

    @Test
    public void test6664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6664");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "", "" };
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList10 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray6, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList12 = com.thealgorithms.backtracking.Combination.combination(strArray6, 1);
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray6, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList16 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray6, 2);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable>> constableSetList18 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[]) strArray6, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList20 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList22 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList24 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, 5);
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList26 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, (int) (short) -1);
        java.lang.Class<?> wildcardClass27 = strComparableSetList26.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strComparableSetList8);
        org.junit.Assert.assertNotNull(serializableSetList10);
        org.junit.Assert.assertNotNull(strSetList12);
        org.junit.Assert.assertNotNull(constantDescSetList14);
        org.junit.Assert.assertNotNull(serializableSetList16);
        org.junit.Assert.assertNotNull(constableSetList18);
        org.junit.Assert.assertNotNull(strComparableSetList20);
        org.junit.Assert.assertNotNull(strComparableSetList22);
        org.junit.Assert.assertNotNull(strComparableSetList24);
        org.junit.Assert.assertNotNull(strComparableSetList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test6665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6665");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, (int) ' ');
        java.lang.Class<?> wildcardClass11 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList6);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList8);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test6666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6666");
        java.lang.Class[][][][][] classArray1 = new java.lang.Class[0][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 10);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][][]>> genericDeclarationArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][][][]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][][]>> genericDeclarationArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][][][]) wildcardClassArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList14 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 0);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNull(genericDeclarationArraySetList10);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList12);
        org.junit.Assert.assertNull(wildcardClassArraySetList14);
    }

    @Test
    public void test6667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6667");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class[][] classArray4 = new java.lang.Class[1][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray5 = (java.lang.Class<?>[][]) classArray4;
        wildcardClassArray5[0] = classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList9 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray5, 10);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList11 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray5, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList13 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][]) wildcardClassArray5, 0);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(classArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList9);
        org.junit.Assert.assertNull(wildcardClassArraySetList11);
        org.junit.Assert.assertNull(typeArraySetList13);
    }

    @Test
    public void test6668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6668");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][]) wildcardClassArray2, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.Object>> objSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.Object[]) wildcardClassArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, (int) (short) 100);
        java.lang.Class<?> wildcardClass15 = genericDeclarationArraySetList14.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList6);
        org.junit.Assert.assertNotNull(typeArraySetList8);
        org.junit.Assert.assertNull(typeArraySetList10);
        org.junit.Assert.assertNotNull(objSetList12);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6669");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.AnnotatedElement>> annotatedElementSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.AnnotatedElement[]) wildcardClassArray2, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> wildcardClassOfFieldSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[]) wildcardClassArray2, (int) ' ');
        java.lang.Class<?> wildcardClass13 = wildcardClassOfFieldSetList12.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNull(typeDescriptorSetList6);
        org.junit.Assert.assertNotNull(annotatedElementSetList8);
        org.junit.Assert.assertNotNull(typeDescriptorSetList10);
        org.junit.Assert.assertNotNull(wildcardClassOfFieldSetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6670");
        java.util.List[][] listArray1 = new java.util.List[0][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (-1));
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][]) strSetListArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList10 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, 3);
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][]) strSetListArray2, 100);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList14 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) ' ');
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArraySetList4);
        org.junit.Assert.assertNotNull(listArraySetList6);
        org.junit.Assert.assertNotNull(collectionArraySetList8);
        org.junit.Assert.assertNotNull(listArraySetList10);
        org.junit.Assert.assertNotNull(collectionArraySetList12);
        org.junit.Assert.assertNotNull(listArraySetList14);
    }

    @Test
    public void test6671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6671");
        java.lang.Class[][][][] classArray1 = new java.lang.Class[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList14 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) wildcardClassArray2, (int) (byte) 10);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList16 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 5);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList18 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, (int) (byte) -1);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(typeArraySetList6);
        org.junit.Assert.assertNotNull(typeArraySetList8);
        org.junit.Assert.assertNotNull(typeArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList12);
        org.junit.Assert.assertNotNull(serializableSetList14);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList16);
        org.junit.Assert.assertNotNull(typeArraySetList18);
    }

    @Test
    public void test6672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6672");
        java.util.List[][][][][][][][] listArray1 = new java.util.List[0][][][][][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, 0);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][]>> listArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (byte) 10);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][]>> listArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) '4');
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][]>> listArraySetList10 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, 0);
        java.lang.Class<?> wildcardClass11 = strSetListArray2.getClass();
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNull(listArraySetList4);
        org.junit.Assert.assertNotNull(listArraySetList6);
        org.junit.Assert.assertNotNull(listArraySetList8);
        org.junit.Assert.assertNull(listArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test6673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6673");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][]) wildcardClassArray2, 5);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, (-1));
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList10 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[]>> ofFieldArraySetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[][]) wildcardClassArray2, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList16 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.lang.Class<?> wildcardClass17 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(typeArraySetList6);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList12);
        org.junit.Assert.assertNotNull(ofFieldArraySetList14);
        org.junit.Assert.assertNull(wildcardClassArraySetList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6674");
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) 'a');
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 10);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (byte) 100);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][]>> combinationArraySetList8 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) '4');
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNotNull(combinationArraySetList2);
        org.junit.Assert.assertNotNull(combinationArraySetList4);
        org.junit.Assert.assertNotNull(combinationArraySetList6);
        org.junit.Assert.assertNotNull(combinationArraySetList8);
    }

    @Test
    public void test6675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6675");
        java.util.List[][] listArray1 = new java.util.List[0][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (-1));
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList10 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (byte) 10);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList12 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList14 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]>> iterableArraySetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.Iterable<java.util.TreeSet<java.lang.String>>[][]) strSetListArray2, 6);
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArraySetList4);
        org.junit.Assert.assertNotNull(listArraySetList6);
        org.junit.Assert.assertNotNull(listArraySetList8);
        org.junit.Assert.assertNotNull(listArraySetList10);
        org.junit.Assert.assertNotNull(listArraySetList12);
        org.junit.Assert.assertNotNull(listArraySetList14);
        org.junit.Assert.assertNotNull(iterableArraySetList16);
    }

    @Test
    public void test6676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6676");
        java.lang.Class[][][] classArray1 = new java.lang.Class[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][] wildcardClassArray2 = (java.lang.Class<?>[][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList10 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 100);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList10);
    }

    @Test
    public void test6677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6677");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class[][] classArray4 = new java.lang.Class[1][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray5 = (java.lang.Class<?>[][]) classArray4;
        wildcardClassArray5[0] = classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList9 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray5, 10);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList11 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][]) wildcardClassArray5, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[]>> ofFieldArraySetList13 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[][]) wildcardClassArray5, 5);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList15 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray5, 6);
        java.lang.Class<?> wildcardClass16 = genericDeclarationArraySetList15.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(classArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList9);
        org.junit.Assert.assertNull(typeArraySetList11);
        org.junit.Assert.assertNotNull(ofFieldArraySetList13);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6678");
        java.lang.String[][][][][][][][][] strArray0 = new java.lang.String[][][][][][][][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][]>> strArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][]>> strArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][]>> strArraySetList10 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][]>> strArraySetList12 = com.thealgorithms.backtracking.Combination.combination(strArray0, 1);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][]>> strArraySetList14 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][]>> strArraySetList16 = com.thealgorithms.backtracking.Combination.combination(strArray0, 0);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][]>> strArraySetList18 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNotNull(strArraySetList4);
        org.junit.Assert.assertNotNull(strArraySetList6);
        org.junit.Assert.assertNotNull(strArraySetList8);
        org.junit.Assert.assertNotNull(strArraySetList10);
        org.junit.Assert.assertNotNull(strArraySetList12);
        org.junit.Assert.assertNotNull(strArraySetList14);
        org.junit.Assert.assertNull(strArraySetList16);
        org.junit.Assert.assertNotNull(strArraySetList18);
    }

    @Test
    public void test6679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6679");
        java.lang.String[][][][][][][][][][][][][][][] strArray0 = new java.lang.String[][][][][][][][][][][][][][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][][][][][][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][][][][][][][]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, 5);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][][][][][][][]>> strArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strArray0, 100);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNotNull(strArraySetList4);
        org.junit.Assert.assertNotNull(strArraySetList6);
    }

    @Test
    public void test6680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6680");
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 3);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (byte) 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) -1);
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNotNull(combinationArraySetList2);
        org.junit.Assert.assertNull(combinationArraySetList4);
        org.junit.Assert.assertNotNull(combinationArraySetList6);
    }

    @Test
    public void test6681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6681");
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) ' ');
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 5);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][]>> combinationArraySetList8 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (-1));
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNotNull(combinationArraySetList2);
        org.junit.Assert.assertNull(combinationArraySetList4);
        org.junit.Assert.assertNotNull(combinationArraySetList6);
        org.junit.Assert.assertNotNull(combinationArraySetList8);
    }

    @Test
    public void test6682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6682");
        java.util.List[][] listArray1 = new java.util.List[0][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]>> iterableArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.Iterable<java.util.TreeSet<java.lang.String>>[][]) strSetListArray2, (int) '4');
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][]) strSetListArray2, 10);
        java.lang.Class<?> wildcardClass9 = strSetListArray2.getClass();
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArraySetList4);
        org.junit.Assert.assertNotNull(iterableArraySetList6);
        org.junit.Assert.assertNotNull(collectionArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test6683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6683");
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) ' ');
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 5);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][]>> combinationArraySetList8 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 1);
        java.lang.Class<?> wildcardClass9 = combinationArraySetList8.getClass();
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNotNull(combinationArraySetList2);
        org.junit.Assert.assertNull(combinationArraySetList4);
        org.junit.Assert.assertNotNull(combinationArraySetList6);
        org.junit.Assert.assertNotNull(combinationArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test6684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6684");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 5);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) wildcardClassArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) wildcardClassArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][]) wildcardClassArray2, (int) (short) 100);
        java.lang.Class<?> wildcardClass17 = typeArraySetList16.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(constableArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList12);
        org.junit.Assert.assertNotNull(constableArraySetList14);
        org.junit.Assert.assertNotNull(typeArraySetList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6685");
        java.lang.String[][][][][][][][][][][][][][][] strArray0 = new java.lang.String[][][][][][][][][][][][][][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][][][][][][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, 10);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
    }

    @Test
    public void test6686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6686");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 5);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) wildcardClassArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][]) wildcardClassArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) wildcardClassArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][]) wildcardClassArray2, 0);
        java.lang.Class<?> wildcardClass17 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(constableArraySetList10);
        org.junit.Assert.assertNotNull(typeArraySetList12);
        org.junit.Assert.assertNotNull(constableArraySetList14);
        org.junit.Assert.assertNull(typeArraySetList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6687");
        java.lang.String[][][][][][] strArray0 = new java.lang.String[][][][][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList10 = com.thealgorithms.backtracking.Combination.combination(strArray0, (-1));
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList12 = com.thealgorithms.backtracking.Combination.combination(strArray0, 4);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNull(strArraySetList4);
        org.junit.Assert.assertNull(strArraySetList6);
        org.junit.Assert.assertNull(strArraySetList8);
        org.junit.Assert.assertNotNull(strArraySetList10);
        org.junit.Assert.assertNotNull(strArraySetList12);
    }

    @Test
    public void test6688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6688");
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 100);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 3);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][]>> combinationArraySetList8 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) '4');
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][]>> combinationArraySetList10 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) ' ');
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][]>> combinationArraySetList12 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 10);
        java.lang.Class<?> wildcardClass13 = combinationArray0.getClass();
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNotNull(combinationArraySetList2);
        org.junit.Assert.assertNotNull(combinationArraySetList4);
        org.junit.Assert.assertNull(combinationArraySetList6);
        org.junit.Assert.assertNotNull(combinationArraySetList8);
        org.junit.Assert.assertNotNull(combinationArraySetList10);
        org.junit.Assert.assertNotNull(combinationArraySetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6689");
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 100);
        java.lang.Class<?> wildcardClass3 = combinationArraySetList2.getClass();
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNotNull(combinationArraySetList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test6690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6690");
        java.util.List[][][][] listArray1 = new java.util.List[0][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][]>> listArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) '4');
        java.util.List<java.util.TreeSet<java.util.Collection[][][]>> collectionArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][][][]) strSetListArray2, 10);
        java.util.List<java.util.TreeSet<java.util.Collection[][][]>> collectionArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][][][]) strSetListArray2, 0);
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArraySetList4);
        org.junit.Assert.assertNotNull(listArraySetList6);
        org.junit.Assert.assertNotNull(collectionArraySetList8);
        org.junit.Assert.assertNull(collectionArraySetList10);
    }

    @Test
    public void test6691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6691");
        java.lang.Class[][][][][][][][][] classArray1 = new java.lang.Class[0][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][][][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 2);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 2);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][]>> wildcardClassArraySetList10 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 6);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][]>> wildcardClassArraySetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) ' ');
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList12);
    }

    @Test
    public void test6692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6692");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, (-1));
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) strArray0, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.CharSequence[]>> charSequenceArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[][]) strArray0, 1);
        java.util.List<java.util.TreeSet<java.lang.CharSequence[]>> charSequenceArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[][]) strArray0, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList12 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) 10);
        java.util.List<java.util.TreeSet<java.lang.CharSequence[]>> charSequenceArraySetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[][]) strArray0, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) strArray0, 1);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNotNull(strArraySetList4);
        org.junit.Assert.assertNotNull(constableArraySetList6);
        org.junit.Assert.assertNotNull(charSequenceArraySetList8);
        org.junit.Assert.assertNotNull(charSequenceArraySetList10);
        org.junit.Assert.assertNotNull(strArraySetList12);
        org.junit.Assert.assertNull(charSequenceArraySetList14);
        org.junit.Assert.assertNotNull(constableArraySetList16);
    }

    @Test
    public void test6693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6693");
        java.lang.String[][][][][][][] strArray0 = new java.lang.String[][][][][][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][]>> strArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][]>> strArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strArray0, 0);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][]>> strArraySetList10 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (short) 100);
        java.lang.Class<?> wildcardClass11 = strArraySetList10.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNotNull(strArraySetList4);
        org.junit.Assert.assertNotNull(strArraySetList6);
        org.junit.Assert.assertNull(strArraySetList8);
        org.junit.Assert.assertNotNull(strArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test6694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6694");
        java.lang.String[][][][][][][][][][][][][][] strArray0 = new java.lang.String[][][][][][][][][][][][][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][][][][][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, 4);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][][][][][][]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][][][][][][]>> strArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) '4');
        java.lang.Class<?> wildcardClass7 = strArraySetList6.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNull(strArraySetList4);
        org.junit.Assert.assertNotNull(strArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test6695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6695");
        java.lang.Class[][][][][][] classArray1 = new java.lang.Class[0][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 4);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 100);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList10 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) wildcardClassArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][][][]>> genericDeclarationArraySetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][][][][]) wildcardClassArray2, 2);
        java.lang.Class<?> wildcardClass15 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(serializableSetList10);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList12);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6696");
        java.util.List[][] listArray1 = new java.util.List[0][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]>> iterableArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.Iterable<java.util.TreeSet<java.lang.String>>[][]) strSetListArray2, (int) '4');
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][]) strSetListArray2, 10);
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][]) strSetListArray2, 3);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList12 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) 1);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList14 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass15 = listArraySetList14.getClass();
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArraySetList4);
        org.junit.Assert.assertNotNull(iterableArraySetList6);
        org.junit.Assert.assertNotNull(collectionArraySetList8);
        org.junit.Assert.assertNotNull(collectionArraySetList10);
        org.junit.Assert.assertNotNull(listArraySetList12);
        org.junit.Assert.assertNotNull(listArraySetList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6697");
        com.thealgorithms.backtracking.Combination[][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (byte) 1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) '4');
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[]>> combinationArraySetList8 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[]>> combinationArraySetList10 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[]>> combinationArraySetList12 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 6);
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNull(combinationArraySetList2);
        org.junit.Assert.assertNotNull(combinationArraySetList4);
        org.junit.Assert.assertNotNull(combinationArraySetList6);
        org.junit.Assert.assertNull(combinationArraySetList8);
        org.junit.Assert.assertNull(combinationArraySetList10);
        org.junit.Assert.assertNotNull(combinationArraySetList12);
    }

    @Test
    public void test6698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6698");
        java.lang.Class[][][] classArray1 = new java.lang.Class[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][] wildcardClassArray2 = (java.lang.Class<?>[][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][]>> typeArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][]) wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList10 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 1);
        java.lang.Class<?> wildcardClass13 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNull(typeArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNull(wildcardClassArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6699");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 100);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNull(genericDeclarationArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNull(genericDeclarationArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList12);
    }

    @Test
    public void test6700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6700");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> wildcardClassOfFieldSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[]) wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type>> typeSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[]) wildcardClassArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList14 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (-1));
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList18 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList20 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, 10);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(typeDescriptorSetList6);
        org.junit.Assert.assertNotNull(typeDescriptorSetList8);
        org.junit.Assert.assertNotNull(wildcardClassOfFieldSetList10);
        org.junit.Assert.assertNotNull(typeSetList12);
        org.junit.Assert.assertNotNull(wildcardClassSetList14);
        org.junit.Assert.assertNotNull(genericDeclarationSetList16);
        org.junit.Assert.assertNotNull(typeDescriptorSetList18);
        org.junit.Assert.assertNotNull(genericDeclarationSetList20);
    }

    @Test
    public void test6701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6701");
        java.lang.String[][][][][][][][][][][][] strArray0 = new java.lang.String[][][][][][][][][][][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][][][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][][][][]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][][][][]>> strArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][][][][]>> strArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][][][][]>> strArraySetList10 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][][][][]>> strArraySetList12 = com.thealgorithms.backtracking.Combination.combination(strArray0, 5);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][][][][]>> strArraySetList14 = com.thealgorithms.backtracking.Combination.combination(strArray0, 0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNotNull(strArraySetList4);
        org.junit.Assert.assertNotNull(strArraySetList6);
        org.junit.Assert.assertNotNull(strArraySetList8);
        org.junit.Assert.assertNull(strArraySetList10);
        org.junit.Assert.assertNotNull(strArraySetList12);
        org.junit.Assert.assertNull(strArraySetList14);
    }

    @Test
    public void test6702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6702");
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (-1));
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (byte) -1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) 'a');
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][]>> combinationArraySetList8 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (byte) 1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][]>> combinationArraySetList10 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 10);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][]>> combinationArraySetList12 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) ' ');
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNotNull(combinationArraySetList2);
        org.junit.Assert.assertNotNull(combinationArraySetList4);
        org.junit.Assert.assertNotNull(combinationArraySetList6);
        org.junit.Assert.assertNotNull(combinationArraySetList8);
        org.junit.Assert.assertNotNull(combinationArraySetList10);
        org.junit.Assert.assertNotNull(combinationArraySetList12);
    }

    @Test
    public void test6703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6703");
        java.lang.Class[][][][][][][][][][][][][][][][][][][] classArray1 = new java.lang.Class[0][][][][][][][][][][][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][][][][][][][][][][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][][][][][][][][][][][][][][][]) classArray1;
        java.lang.Class[][][][][][][][][][][][][][][][][][][] classArray4 = new java.lang.Class[0][][][][][][][][][][][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][][][][][][][][][][][][][] wildcardClassArray5 = (java.lang.Class<?>[][][][][][][][][][][][][][][][][][][]) classArray4;
        java.lang.Class[][][][][][][][][][][][][][][][][][][] classArray7 = new java.lang.Class[0][][][][][][][][][][][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][][][][][][][][][][][][][] wildcardClassArray8 = (java.lang.Class<?>[][][][][][][][][][][][][][][][][][][]) classArray7;
        java.lang.Class[][][][][][][][][][][][][][][][][][][][] classArray10 = new java.lang.Class[3][][][][][][][][][][][][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][][][][][][][][][][][][][][] wildcardClassArray11 = (java.lang.Class<?>[][][][][][][][][][][][][][][][][][][][]) classArray10;
        wildcardClassArray11[0] = wildcardClassArray2;
        wildcardClassArray11[1] = wildcardClassArray5;
        wildcardClassArray11[2] = wildcardClassArray8;
        java.lang.Class[][][][][][][][][][][][][][][][][][][][][] classArray19 = new java.lang.Class[1][][][][][][][][][][][][][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][][][][][][][][][][][][][][][] wildcardClassArray20 = (java.lang.Class<?>[][][][][][][][][][][][][][][][][][][][][]) classArray19;
        wildcardClassArray20[0] = wildcardClassArray11;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][][][][][][][][][][][][][]>> wildcardClassArraySetList24 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray20, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][][][][][][][][][][][][][]>> wildcardClassArraySetList26 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray20, 0);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(classArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(classArray19);
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList24);
        org.junit.Assert.assertNull(wildcardClassArraySetList26);
    }

    @Test
    public void test6704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6704");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][]) wildcardClassArray2, 5);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, 4);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) wildcardClassArray2, 4);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(typeArraySetList8);
        org.junit.Assert.assertNotNull(constableArraySetList10);
        org.junit.Assert.assertNull(wildcardClassArraySetList12);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList14);
        org.junit.Assert.assertNotNull(constableArraySetList16);
    }

    @Test
    public void test6705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6705");
        java.lang.Class[][][] classArray1 = new java.lang.Class[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][] wildcardClassArray2 = (java.lang.Class<?>[][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList10 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList14 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList10);
        org.junit.Assert.assertNull(wildcardClassArraySetList12);
        org.junit.Assert.assertNull(wildcardClassArraySetList14);
    }

    @Test
    public void test6706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6706");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList16 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.reflect.Type>> typeSetList18 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[]) wildcardClassArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList20 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList22 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass23 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(genericDeclarationSetList6);
        org.junit.Assert.assertNotNull(typeDescriptorSetList8);
        org.junit.Assert.assertNull(genericDeclarationSetList10);
        org.junit.Assert.assertNull(genericDeclarationSetList12);
        org.junit.Assert.assertNotNull(typeDescriptorSetList14);
        org.junit.Assert.assertNotNull(wildcardClassSetList16);
        org.junit.Assert.assertNotNull(typeSetList18);
        org.junit.Assert.assertNotNull(wildcardClassSetList20);
        org.junit.Assert.assertNotNull(wildcardClassSetList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6707");
        java.util.List[][][][] listArray1 = new java.util.List[0][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][]>> listArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) 1);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][]>> listArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, 5);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][]>> listArraySetList10 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][]>> listArraySetList12 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) ' ');
        java.lang.Class<?> wildcardClass13 = strSetListArray2.getClass();
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArraySetList4);
        org.junit.Assert.assertNotNull(listArraySetList6);
        org.junit.Assert.assertNotNull(listArraySetList8);
        org.junit.Assert.assertNotNull(listArraySetList10);
        org.junit.Assert.assertNotNull(listArraySetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6708");
        java.lang.Class[][][][][][] classArray1 = new java.lang.Class[0][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 4);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 100);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList10 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) wildcardClassArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList14 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][][][]>> genericDeclarationArraySetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][][][][]) wildcardClassArray2, (int) (byte) 10);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList18 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) wildcardClassArray2, 100);
        java.lang.Class<?> wildcardClass19 = serializableSetList18.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(serializableSetList10);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList12);
        org.junit.Assert.assertNull(wildcardClassArraySetList14);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList16);
        org.junit.Assert.assertNotNull(serializableSetList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6709");
        com.thealgorithms.backtracking.Combination[][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 4);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (byte) 1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][]>> combinationArraySetList8 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 10);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][]>> combinationArraySetList10 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (byte) 1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][]>> combinationArraySetList12 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][]>> combinationArraySetList14 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) ' ');
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNotNull(combinationArraySetList2);
        org.junit.Assert.assertNotNull(combinationArraySetList4);
        org.junit.Assert.assertNotNull(combinationArraySetList6);
        org.junit.Assert.assertNotNull(combinationArraySetList8);
        org.junit.Assert.assertNotNull(combinationArraySetList10);
        org.junit.Assert.assertNull(combinationArraySetList12);
        org.junit.Assert.assertNotNull(combinationArraySetList14);
    }

    @Test
    public void test6710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6710");
        java.util.List[][] listArray1 = new java.util.List[0][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (-1));
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]>> iterableArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.Iterable<java.util.TreeSet<java.lang.String>>[][]) strSetListArray2, (-1));
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][]) strSetListArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList14 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]>> iterableArraySetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.Iterable<java.util.TreeSet<java.lang.String>>[][]) strSetListArray2, 2);
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList18 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][]) strSetListArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]>> iterableArraySetList20 = com.thealgorithms.backtracking.Combination.combination((java.lang.Iterable<java.util.TreeSet<java.lang.String>>[][]) strSetListArray2, 5);
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList22 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][]) strSetListArray2, (int) '4');
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList24 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (byte) 100);
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArraySetList4);
        org.junit.Assert.assertNotNull(listArraySetList6);
        org.junit.Assert.assertNotNull(listArraySetList8);
        org.junit.Assert.assertNotNull(iterableArraySetList10);
        org.junit.Assert.assertNotNull(collectionArraySetList12);
        org.junit.Assert.assertNotNull(listArraySetList14);
        org.junit.Assert.assertNotNull(iterableArraySetList16);
        org.junit.Assert.assertNotNull(collectionArraySetList18);
        org.junit.Assert.assertNotNull(iterableArraySetList20);
        org.junit.Assert.assertNotNull(collectionArraySetList22);
        org.junit.Assert.assertNotNull(listArraySetList24);
    }

    @Test
    public void test6711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6711");
        java.util.List[][] listArray1 = new java.util.List[0][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]>> iterableArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.Iterable<java.util.TreeSet<java.lang.String>>[][]) strSetListArray2, (int) '4');
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][]) strSetListArray2, 10);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList10 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) 1);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList12 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, 0);
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArraySetList4);
        org.junit.Assert.assertNotNull(iterableArraySetList6);
        org.junit.Assert.assertNotNull(collectionArraySetList8);
        org.junit.Assert.assertNotNull(listArraySetList10);
        org.junit.Assert.assertNull(listArraySetList12);
    }

    @Test
    public void test6712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6712");
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (byte) 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 5);
        java.util.List<java.util.TreeSet<java.lang.Object>> objSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.Object[]) combinationArray0, 6);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][]>> combinationArraySetList10 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (byte) 100);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][]>> combinationArraySetList12 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) ' ');
        java.lang.Class<?> wildcardClass13 = combinationArray0.getClass();
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNull(combinationArraySetList2);
        org.junit.Assert.assertNull(combinationArraySetList4);
        org.junit.Assert.assertNotNull(combinationArraySetList6);
        org.junit.Assert.assertNotNull(objSetList8);
        org.junit.Assert.assertNotNull(combinationArraySetList10);
        org.junit.Assert.assertNotNull(combinationArraySetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6713");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.Object>> objSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.Object[]) wildcardClassArray2, 5);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(genericDeclarationSetList6);
        org.junit.Assert.assertNotNull(typeDescriptorSetList8);
        org.junit.Assert.assertNull(genericDeclarationSetList10);
        org.junit.Assert.assertNotNull(genericDeclarationSetList12);
        org.junit.Assert.assertNotNull(objSetList14);
    }

    @Test
    public void test6714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6714");
        java.lang.Class[][][][][][][][][][][][] classArray1 = new java.lang.Class[0][][][][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][][][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][][][][][][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][][][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][][][][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][][][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][][][][]>> wildcardClassArraySetList10 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 100);
        java.lang.Class<?> wildcardClass11 = wildcardClassArraySetList10.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test6715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6715");
        java.lang.Class<?>[][][][] wildcardClassArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList2 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6716");
        java.lang.String[][][][][][][][][][][][][][] strArray0 = new java.lang.String[][][][][][][][][][][][][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][][][][][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, 4);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][][][][][][]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][][][][][][]>> strArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.Object>> objSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.Object[]) strArray0, 6);
        java.lang.Class<?> wildcardClass9 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNull(strArraySetList4);
        org.junit.Assert.assertNotNull(strArraySetList6);
        org.junit.Assert.assertNotNull(objSetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test6717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6717");
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 6);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 1);
        java.lang.Class<?> wildcardClass7 = combinationArray0.getClass();
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNull(combinationArraySetList2);
        org.junit.Assert.assertNotNull(combinationArraySetList4);
        org.junit.Assert.assertNotNull(combinationArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test6718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6718");
        java.lang.Class[][][][] classArray1 = new java.lang.Class[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 2);
        java.lang.Class<?> wildcardClass13 = wildcardClassArraySetList12.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(typeArraySetList6);
        org.junit.Assert.assertNotNull(typeArraySetList8);
        org.junit.Assert.assertNotNull(typeArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6719");
        java.util.List[] listArray1 = new java.util.List[0];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[]) listArray1;
        java.util.List[] listArray4 = new java.util.List[0];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[] strSetListArray5 = (java.util.List<java.util.TreeSet<java.lang.String>>[]) listArray4;
        java.util.List[][] listArray7 = new java.util.List[2][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][] strSetListArray8 = (java.util.List<java.util.TreeSet<java.lang.String>>[][]) listArray7;
        strSetListArray8[0] = strSetListArray2;
        strSetListArray8[1] = strSetListArray5;
        java.util.List[][][] listArray14 = new java.util.List[1][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][] strSetListArray15 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][]) listArray14;
        strSetListArray15[0] = strSetListArray8;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][]>> listArraySetList19 = com.thealgorithms.backtracking.Combination.combination(strSetListArray15, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][]>> listArraySetList21 = com.thealgorithms.backtracking.Combination.combination(strSetListArray15, (int) '#');
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][]>> listArraySetList23 = com.thealgorithms.backtracking.Combination.combination(strSetListArray15, 4);
        java.util.List<java.util.TreeSet<java.util.Collection[][]>> collectionArraySetList25 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][][]) strSetListArray15, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][]>> listArraySetList27 = com.thealgorithms.backtracking.Combination.combination(strSetListArray15, 10);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][]>> listArraySetList29 = com.thealgorithms.backtracking.Combination.combination(strSetListArray15, (int) 'a');
        java.util.List<java.util.TreeSet<java.util.Collection[][]>> collectionArraySetList31 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][][]) strSetListArray15, 0);
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArray4);
        org.junit.Assert.assertNotNull(strSetListArray5);
        org.junit.Assert.assertNotNull(listArray7);
        org.junit.Assert.assertNotNull(strSetListArray8);
        org.junit.Assert.assertNotNull(listArray14);
        org.junit.Assert.assertNotNull(strSetListArray15);
        org.junit.Assert.assertNotNull(listArraySetList19);
        org.junit.Assert.assertNotNull(listArraySetList21);
        org.junit.Assert.assertNotNull(listArraySetList23);
        org.junit.Assert.assertNull(collectionArraySetList25);
        org.junit.Assert.assertNotNull(listArraySetList27);
        org.junit.Assert.assertNotNull(listArraySetList29);
        org.junit.Assert.assertNull(collectionArraySetList31);
    }

    @Test
    public void test6720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6720");
        java.lang.String[][][][][][][][][][][][][][][] strArray0 = new java.lang.String[][][][][][][][][][][][][][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][][][][][][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][][][][][][][]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][][][][][][][]>> strArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][][][][][][][]>> strArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNotNull(strArraySetList4);
        org.junit.Assert.assertNotNull(strArraySetList6);
        org.junit.Assert.assertNull(strArraySetList8);
    }

    @Test
    public void test6721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6721");
        java.lang.Class[][][][][][][][][][][][][][][] classArray1 = new java.lang.Class[0][][][][][][][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][][][][][][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][][][][][][][][][][][]) classArray1;
        java.lang.Class[][][][][][][][][][][][][][][] classArray4 = new java.lang.Class[0][][][][][][][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][][][][][][][][][] wildcardClassArray5 = (java.lang.Class<?>[][][][][][][][][][][][][][][]) classArray4;
        java.lang.Class[][][][][][][][][][][][][][][] classArray7 = new java.lang.Class[0][][][][][][][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][][][][][][][][][] wildcardClassArray8 = (java.lang.Class<?>[][][][][][][][][][][][][][][]) classArray7;
        java.lang.Class[][][][][][][][][][][][][][][] classArray10 = new java.lang.Class[0][][][][][][][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][][][][][][][][][] wildcardClassArray11 = (java.lang.Class<?>[][][][][][][][][][][][][][][]) classArray10;
        java.lang.Class[][][][][][][][][][][][][][][] classArray13 = new java.lang.Class[0][][][][][][][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][][][][][][][][][] wildcardClassArray14 = (java.lang.Class<?>[][][][][][][][][][][][][][][]) classArray13;
        java.lang.Class[][][][][][][][][][][][][][][][] classArray16 = new java.lang.Class[5][][][][][][][][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][][][][][][][][][][] wildcardClassArray17 = (java.lang.Class<?>[][][][][][][][][][][][][][][][]) classArray16;
        wildcardClassArray17[0] = wildcardClassArray2;
        wildcardClassArray17[1] = wildcardClassArray5;
        wildcardClassArray17[2] = wildcardClassArray8;
        wildcardClassArray17[3] = wildcardClassArray11;
        wildcardClassArray17[4] = wildcardClassArray14;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][][][][][][][][]>> wildcardClassArraySetList29 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray17, (int) (short) 0);
        java.lang.Class<?> wildcardClass30 = wildcardClassArray17.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(classArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertNotNull(classArray16);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertNull(wildcardClassArraySetList29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test6722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6722");
        com.thealgorithms.backtracking.Combination[][][][][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][] combinationArray1 = new com.thealgorithms.backtracking.Combination[][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][] combinationArray2 = new com.thealgorithms.backtracking.Combination[][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray3 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] { combinationArray0, combinationArray1, combinationArray2 };
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][] combinationArray4 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][] { combinationArray3 };
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray4, 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][]>> combinationArraySetList8 = com.thealgorithms.backtracking.Combination.combination(combinationArray4, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][]>> combinationArraySetList10 = com.thealgorithms.backtracking.Combination.combination(combinationArray4, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNotNull(combinationArray1);
        org.junit.Assert.assertNotNull(combinationArray2);
        org.junit.Assert.assertNotNull(combinationArray3);
        org.junit.Assert.assertNotNull(combinationArray4);
        org.junit.Assert.assertNull(combinationArraySetList6);
        org.junit.Assert.assertNotNull(combinationArraySetList8);
    }

    @Test
    public void test6723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6723");
        java.lang.Class[][][] classArray1 = new java.lang.Class[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][] wildcardClassArray2 = (java.lang.Class<?>[][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList10 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 6);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][]>> typeArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][]) wildcardClassArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][]>> typeArraySetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][]) wildcardClassArray2, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][]>> genericDeclarationArraySetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][]) wildcardClassArray2, (int) (short) -1);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList10);
        org.junit.Assert.assertNotNull(typeArraySetList12);
        org.junit.Assert.assertNotNull(typeArraySetList14);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList16);
    }

    @Test
    public void test6724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6724");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> wildcardClassOfFieldSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.reflect.AnnotatedElement>> annotatedElementSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.AnnotatedElement[]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.reflect.Type>> typeSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[]) wildcardClassArray2, (int) (short) 1);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(typeDescriptorSetList6);
        org.junit.Assert.assertNotNull(typeDescriptorSetList8);
        org.junit.Assert.assertNotNull(wildcardClassOfFieldSetList10);
        org.junit.Assert.assertNotNull(annotatedElementSetList12);
        org.junit.Assert.assertNotNull(typeSetList14);
    }

    @Test
    public void test6725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6725");
        java.lang.Class<?>[][][][][][][][][][][][][][][][][][][] wildcardClassArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][][][][][][][][][][][]>> wildcardClassArraySetList2 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6726");
        java.lang.String[][][][][][][][][][][][] strArray0 = new java.lang.String[][][][][][][][][][][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][][][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][][][][]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, 0);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][][][][]>> strArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (short) 1);
        java.lang.Class<?> wildcardClass7 = strArraySetList6.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNull(strArraySetList4);
        org.junit.Assert.assertNotNull(strArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test6727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6727");
        java.util.List[][][][][][][] listArray1 = new java.util.List[0][][][][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][]>> listArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][]>> listArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, 5);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][]>> listArraySetList10 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][]>> listArraySetList12 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = listArraySetList12.getClass();
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNull(listArraySetList4);
        org.junit.Assert.assertNotNull(listArraySetList6);
        org.junit.Assert.assertNotNull(listArraySetList8);
        org.junit.Assert.assertNotNull(listArraySetList10);
        org.junit.Assert.assertNotNull(listArraySetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6728");
        java.lang.String[][][][][][][][][][][][][][][] strArray0 = new java.lang.String[][][][][][][][][][][][][][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][][][][][][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, 3);
        java.lang.Class<?> wildcardClass3 = strArraySetList2.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test6729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6729");
        java.lang.Class[][][][] classArray1 = new java.lang.Class[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][]>> genericDeclarationArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][][]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][]>> genericDeclarationArraySetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][][]) wildcardClassArray2, 4);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(typeArraySetList6);
        org.junit.Assert.assertNotNull(typeArraySetList8);
        org.junit.Assert.assertNotNull(typeArraySetList10);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList12);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList14);
    }

    @Test
    public void test6730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6730");
        java.lang.Class[][][][][][][][] classArray1 = new java.lang.Class[0][][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 2);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.Object>> objSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.Object[]) wildcardClassArray2, (int) (byte) 10);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][]>> wildcardClassArraySetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (-1));
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(objSetList10);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList12);
    }

    @Test
    public void test6731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6731");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList4 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable>> constableSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[]) strArray2, 4);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList8 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray2, (int) 'a');
        java.lang.Class<?> wildcardClass11 = strComparableSetList10.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strComparableSetList4);
        org.junit.Assert.assertNotNull(constableSetList6);
        org.junit.Assert.assertNotNull(strSetList8);
        org.junit.Assert.assertNotNull(strComparableSetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test6732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6732");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][]) wildcardClassArray2, 5);
        java.util.List<java.util.TreeSet<java.lang.Object>> objSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.Object[]) wildcardClassArray2, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) wildcardClassArray2, (int) (byte) -1);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(typeArraySetList6);
        org.junit.Assert.assertNull(objSetList8);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList10);
        org.junit.Assert.assertNotNull(constableArraySetList12);
    }

    @Test
    public void test6733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6733");
        java.lang.String[][][][][][][][][][][][][][][][] strArray0 = new java.lang.String[][][][][][][][][][][][][][][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][][][][][][][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, 1);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][][][][][][][][]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, 2);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][][][][][][][][]>> strArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strArray0, 6);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNotNull(strArraySetList4);
        org.junit.Assert.assertNotNull(strArraySetList6);
    }

    @Test
    public void test6734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6734");
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) '4');
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][]>> combinationArraySetList8 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 0);
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNotNull(combinationArraySetList2);
        org.junit.Assert.assertNull(combinationArraySetList4);
        org.junit.Assert.assertNotNull(combinationArraySetList6);
        org.junit.Assert.assertNull(combinationArraySetList8);
    }

    @Test
    public void test6735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6735");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.AnnotatedElement>> annotatedElementSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.AnnotatedElement[]) wildcardClassArray2, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.reflect.AnnotatedElement>> annotatedElementSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.AnnotatedElement[]) wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.AnnotatedElement>> annotatedElementSetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.AnnotatedElement[]) wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList18 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, 10);
        java.lang.Class<?> wildcardClass19 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNull(typeDescriptorSetList6);
        org.junit.Assert.assertNotNull(annotatedElementSetList8);
        org.junit.Assert.assertNotNull(typeDescriptorSetList10);
        org.junit.Assert.assertNotNull(wildcardClassSetList12);
        org.junit.Assert.assertNotNull(annotatedElementSetList14);
        org.junit.Assert.assertNotNull(annotatedElementSetList16);
        org.junit.Assert.assertNotNull(genericDeclarationSetList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6736");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, (int) (short) 1);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList6);
        org.junit.Assert.assertNotNull(constableArraySetList8);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList10);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList12);
    }

    @Test
    public void test6737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6737");
        java.util.List[] listArray1 = new java.util.List[0];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>>> setListSetList4 = com.thealgorithms.backtracking.Combination.combination((java.util.List<java.util.TreeSet<java.lang.String>>[]) listArray1, (int) (short) 1);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>>> setListSetList6 = com.thealgorithms.backtracking.Combination.combination((java.util.List<java.util.TreeSet<java.lang.String>>[]) listArray1, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>>> setListSetList8 = com.thealgorithms.backtracking.Combination.combination((java.util.List<java.util.TreeSet<java.lang.String>>[]) listArray1, 3);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>>> setListSetList10 = com.thealgorithms.backtracking.Combination.combination((java.util.List<java.util.TreeSet<java.lang.String>>[]) listArray1, 6);
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(setListSetList4);
        org.junit.Assert.assertNull(setListSetList6);
        org.junit.Assert.assertNotNull(setListSetList8);
        org.junit.Assert.assertNotNull(setListSetList10);
    }

    @Test
    public void test6738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6738");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.AnnotatedElement>> annotatedElementSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.AnnotatedElement[]) wildcardClassArray2, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, 2);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (short) 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList18 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type>> typeSetList20 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[]) wildcardClassArray2, (int) (byte) 10);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable>> constableSetList22 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[]) wildcardClassArray2, (int) 'a');
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNull(typeDescriptorSetList6);
        org.junit.Assert.assertNotNull(annotatedElementSetList8);
        org.junit.Assert.assertNotNull(typeDescriptorSetList10);
        org.junit.Assert.assertNotNull(wildcardClassSetList12);
        org.junit.Assert.assertNotNull(typeDescriptorSetList14);
        org.junit.Assert.assertNotNull(typeDescriptorSetList16);
        org.junit.Assert.assertNotNull(wildcardClassSetList18);
        org.junit.Assert.assertNotNull(typeSetList20);
        org.junit.Assert.assertNotNull(constableSetList22);
    }

    @Test
    public void test6739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6739");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][]) wildcardClassArray2, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.Object>> objSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.Object[]) wildcardClassArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, 2);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][]) wildcardClassArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[]>> ofFieldArraySetList18 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[][]) wildcardClassArray2, 10);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList6);
        org.junit.Assert.assertNotNull(typeArraySetList8);
        org.junit.Assert.assertNull(typeArraySetList10);
        org.junit.Assert.assertNotNull(objSetList12);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList14);
        org.junit.Assert.assertNotNull(typeArraySetList16);
        org.junit.Assert.assertNotNull(ofFieldArraySetList18);
    }

    @Test
    public void test6740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6740");
        com.thealgorithms.backtracking.Combination[][][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (byte) 1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 100);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][]>> combinationArraySetList8 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (byte) -1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][]>> combinationArraySetList10 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 10);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][]>> combinationArraySetList12 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) 'a');
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][]>> combinationArraySetList14 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 2);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][]>> combinationArraySetList16 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) 'a');
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNotNull(combinationArraySetList2);
        org.junit.Assert.assertNotNull(combinationArraySetList4);
        org.junit.Assert.assertNotNull(combinationArraySetList6);
        org.junit.Assert.assertNotNull(combinationArraySetList8);
        org.junit.Assert.assertNotNull(combinationArraySetList10);
        org.junit.Assert.assertNotNull(combinationArraySetList12);
        org.junit.Assert.assertNotNull(combinationArraySetList14);
        org.junit.Assert.assertNotNull(combinationArraySetList16);
    }

    @Test
    public void test6741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6741");
        java.util.List[][][] listArray1 = new java.util.List[0][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][]) listArray1;
        java.util.List[][][] listArray4 = new java.util.List[0][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][] strSetListArray5 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][]) listArray4;
        java.util.List[][][] listArray7 = new java.util.List[0][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][] strSetListArray8 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][]) listArray7;
        java.util.List[][][] listArray10 = new java.util.List[0][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][] strSetListArray11 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][]) listArray10;
        java.util.List[][][] listArray13 = new java.util.List[0][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][] strSetListArray14 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][]) listArray13;
        java.util.List[][][][] listArray16 = new java.util.List[5][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][] strSetListArray17 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][]) listArray16;
        strSetListArray17[0] = strSetListArray2;
        strSetListArray17[1] = strSetListArray5;
        strSetListArray17[2] = strSetListArray8;
        strSetListArray17[3] = strSetListArray11;
        strSetListArray17[4] = strSetListArray14;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][]>> listArraySetList29 = com.thealgorithms.backtracking.Combination.combination(strSetListArray17, 0);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][]>> listArraySetList31 = com.thealgorithms.backtracking.Combination.combination(strSetListArray17, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.util.Collection[][][]>> collectionArraySetList33 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][][][]) strSetListArray17, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArray4);
        org.junit.Assert.assertNotNull(strSetListArray5);
        org.junit.Assert.assertNotNull(listArray7);
        org.junit.Assert.assertNotNull(strSetListArray8);
        org.junit.Assert.assertNotNull(listArray10);
        org.junit.Assert.assertNotNull(strSetListArray11);
        org.junit.Assert.assertNotNull(listArray13);
        org.junit.Assert.assertNotNull(strSetListArray14);
        org.junit.Assert.assertNotNull(listArray16);
        org.junit.Assert.assertNotNull(strSetListArray17);
        org.junit.Assert.assertNull(listArraySetList29);
        org.junit.Assert.assertNull(listArraySetList31);
    }

    @Test
    public void test6742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6742");
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][][][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (byte) 10);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][][][][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 100);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][][][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 10);
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNotNull(combinationArraySetList2);
        org.junit.Assert.assertNotNull(combinationArraySetList4);
        org.junit.Assert.assertNotNull(combinationArraySetList6);
    }

    @Test
    public void test6743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6743");
        java.util.List[][] listArray1 = new java.util.List[0][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]>> iterableArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.Iterable<java.util.TreeSet<java.lang.String>>[][]) strSetListArray2, (int) '4');
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][]) strSetListArray2, 10);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList10 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]>> iterableArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.Iterable<java.util.TreeSet<java.lang.String>>[][]) strSetListArray2, 2);
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArraySetList4);
        org.junit.Assert.assertNotNull(iterableArraySetList6);
        org.junit.Assert.assertNotNull(collectionArraySetList8);
        org.junit.Assert.assertNull(listArraySetList10);
        org.junit.Assert.assertNotNull(iterableArraySetList12);
    }

    @Test
    public void test6744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6744");
        java.util.List[][][] listArray1 = new java.util.List[0][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][]) listArray1;
        java.util.List[][][] listArray4 = new java.util.List[0][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][] strSetListArray5 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][]) listArray4;
        java.util.List[][][] listArray7 = new java.util.List[0][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][] strSetListArray8 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][]) listArray7;
        java.util.List[][][] listArray10 = new java.util.List[0][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][] strSetListArray11 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][]) listArray10;
        java.util.List[][][] listArray13 = new java.util.List[0][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][] strSetListArray14 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][]) listArray13;
        java.util.List[][][][] listArray16 = new java.util.List[5][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][] strSetListArray17 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][]) listArray16;
        strSetListArray17[0] = strSetListArray2;
        strSetListArray17[1] = strSetListArray5;
        strSetListArray17[2] = strSetListArray8;
        strSetListArray17[3] = strSetListArray11;
        strSetListArray17[4] = strSetListArray14;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][]>> listArraySetList29 = com.thealgorithms.backtracking.Combination.combination(strSetListArray17, 0);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][]>> listArraySetList31 = com.thealgorithms.backtracking.Combination.combination(strSetListArray17, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][]>> listArraySetList33 = com.thealgorithms.backtracking.Combination.combination(strSetListArray17, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArray4);
        org.junit.Assert.assertNotNull(strSetListArray5);
        org.junit.Assert.assertNotNull(listArray7);
        org.junit.Assert.assertNotNull(strSetListArray8);
        org.junit.Assert.assertNotNull(listArray10);
        org.junit.Assert.assertNotNull(strSetListArray11);
        org.junit.Assert.assertNotNull(listArray13);
        org.junit.Assert.assertNotNull(strSetListArray14);
        org.junit.Assert.assertNotNull(listArray16);
        org.junit.Assert.assertNotNull(strSetListArray17);
        org.junit.Assert.assertNull(listArraySetList29);
        org.junit.Assert.assertNull(listArraySetList31);
    }

    @Test
    public void test6745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6745");
        java.lang.Class[][][][][] classArray1 = new java.lang.Class[0][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 10);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList10 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList14 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList16 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 5);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][][]>> genericDeclarationArraySetList18 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][][][]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][][]>> genericDeclarationArraySetList20 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][][][]) wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList22 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList24 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][][]>> genericDeclarationArraySetList26 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][][][]) wildcardClassArray2, 5);
        java.lang.Class<?> wildcardClass27 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList12);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList14);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList16);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList18);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList20);
        org.junit.Assert.assertNull(wildcardClassArraySetList22);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList24);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test6746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6746");
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 4);
        java.lang.Class<?> wildcardClass3 = combinationArraySetList2.getClass();
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNotNull(combinationArraySetList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test6747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6747");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "", "" };
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList10 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray6, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.Object>> objSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.Object[]) strArray6, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray6, 10);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strComparableSetList8);
        org.junit.Assert.assertNotNull(serializableSetList10);
        org.junit.Assert.assertNotNull(objSetList12);
        org.junit.Assert.assertNotNull(constantDescSetList14);
    }

    @Test
    public void test6748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6748");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type>> typeSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[]) wildcardClassArray2, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (short) 100);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(typeDescriptorSetList6);
        org.junit.Assert.assertNull(genericDeclarationSetList8);
        org.junit.Assert.assertNull(typeSetList10);
        org.junit.Assert.assertNotNull(genericDeclarationSetList12);
    }

    @Test
    public void test6749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6749");
        java.lang.String[][][][][][] strArray0 = new java.lang.String[][][][][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) 100);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNull(strArraySetList4);
        org.junit.Assert.assertNotNull(strArraySetList6);
        org.junit.Assert.assertNotNull(strArraySetList8);
    }

    @Test
    public void test6750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6750");
        com.thealgorithms.backtracking.Combination[][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 3);
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNull(combinationArraySetList2);
        org.junit.Assert.assertNull(combinationArraySetList4);
        org.junit.Assert.assertNotNull(combinationArraySetList6);
    }

    @Test
    public void test6751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6751");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type>> typeSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[]) wildcardClassArray2, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = genericDeclarationSetList14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(typeDescriptorSetList6);
        org.junit.Assert.assertNull(genericDeclarationSetList8);
        org.junit.Assert.assertNotNull(typeDescriptorSetList10);
        org.junit.Assert.assertNotNull(typeSetList12);
        org.junit.Assert.assertNull(genericDeclarationSetList14);
    }

    @Test
    public void test6752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6752");
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][][] combinationArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6753");
        java.lang.Class[][][][] classArray1 = new java.lang.Class[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList10 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 2);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][]>> genericDeclarationArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][][]) wildcardClassArray2, (int) (short) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][]>> genericDeclarationArraySetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][][]) wildcardClassArray2, 1);
        java.lang.Class<?> wildcardClass17 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(typeArraySetList6);
        org.junit.Assert.assertNotNull(typeArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList10);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList12);
        org.junit.Assert.assertNotNull(typeArraySetList14);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6754");
        java.lang.Class[][][][][][][][][][][] classArray1 = new java.lang.Class[0][][][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][][][][][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 5);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][][][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 5);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][][][]>> wildcardClassArraySetList10 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][][][]>> wildcardClassArraySetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][][][]>> wildcardClassArraySetList14 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][][][]>> wildcardClassArraySetList16 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 0);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNull(wildcardClassArraySetList10);
        org.junit.Assert.assertNull(wildcardClassArraySetList12);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList14);
        org.junit.Assert.assertNull(wildcardClassArraySetList16);
    }

    @Test
    public void test6755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6755");
        java.util.List[][] listArray1 = new java.util.List[0][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]>> iterableArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.Iterable<java.util.TreeSet<java.lang.String>>[][]) strSetListArray2, (int) '4');
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][]) strSetListArray2, 10);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList10 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) 1);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList12 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, 5);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList14 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]>> iterableArraySetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.Iterable<java.util.TreeSet<java.lang.String>>[][]) strSetListArray2, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList18 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) 'a');
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArraySetList4);
        org.junit.Assert.assertNotNull(iterableArraySetList6);
        org.junit.Assert.assertNotNull(collectionArraySetList8);
        org.junit.Assert.assertNotNull(listArraySetList10);
        org.junit.Assert.assertNotNull(listArraySetList12);
        org.junit.Assert.assertNotNull(listArraySetList14);
        org.junit.Assert.assertNotNull(iterableArraySetList16);
        org.junit.Assert.assertNotNull(listArraySetList18);
    }

    @Test
    public void test6756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6756");
        java.lang.String[][][][][][][][][] strArray0 = new java.lang.String[][][][][][][][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, 6);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][]>> strArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][]>> strArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strArray0, 0);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][]>> strArraySetList10 = com.thealgorithms.backtracking.Combination.combination(strArray0, 100);
        java.lang.Class<?> wildcardClass11 = strArraySetList10.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNotNull(strArraySetList4);
        org.junit.Assert.assertNotNull(strArraySetList6);
        org.junit.Assert.assertNull(strArraySetList8);
        org.junit.Assert.assertNotNull(strArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test6757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6757");
        com.thealgorithms.backtracking.Combination[][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 4);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 100);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][]>> combinationArraySetList8 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) ' ');
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][]>> combinationArraySetList10 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (byte) 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][]>> combinationArraySetList12 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 10);
        java.lang.Class<?> wildcardClass13 = combinationArraySetList12.getClass();
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNotNull(combinationArraySetList2);
        org.junit.Assert.assertNotNull(combinationArraySetList4);
        org.junit.Assert.assertNotNull(combinationArraySetList6);
        org.junit.Assert.assertNotNull(combinationArraySetList8);
        org.junit.Assert.assertNull(combinationArraySetList10);
        org.junit.Assert.assertNotNull(combinationArraySetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6758");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> wildcardClassOfFieldSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[]) wildcardClassArray2, (int) (short) 1);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable>> constableSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[]) wildcardClassArray2, 10);
        java.lang.Class<?> wildcardClass15 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(genericDeclarationSetList6);
        org.junit.Assert.assertNotNull(typeDescriptorSetList8);
        org.junit.Assert.assertNull(genericDeclarationSetList10);
        org.junit.Assert.assertNotNull(wildcardClassOfFieldSetList12);
        org.junit.Assert.assertNotNull(constableSetList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6759");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type>> typeSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type>> typeSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[]) wildcardClassArray2, 2);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable>> constableSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[]) wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type>> typeSetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[]) wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList18 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList20 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList22 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 1);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(typeDescriptorSetList6);
        org.junit.Assert.assertNotNull(typeDescriptorSetList8);
        org.junit.Assert.assertNotNull(typeSetList10);
        org.junit.Assert.assertNotNull(typeSetList12);
        org.junit.Assert.assertNotNull(constableSetList14);
        org.junit.Assert.assertNotNull(typeSetList16);
        org.junit.Assert.assertNotNull(wildcardClassSetList18);
        org.junit.Assert.assertNull(wildcardClassSetList20);
        org.junit.Assert.assertNotNull(wildcardClassSetList22);
    }

    @Test
    public void test6760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6760");
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 100);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 3);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][]>> combinationArraySetList8 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (byte) 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][]>> combinationArraySetList10 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (byte) 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][]>> combinationArraySetList12 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 2);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][]>> combinationArraySetList14 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][][][]>> combinationArraySetList16 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) -1);
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNotNull(combinationArraySetList2);
        org.junit.Assert.assertNotNull(combinationArraySetList4);
        org.junit.Assert.assertNull(combinationArraySetList6);
        org.junit.Assert.assertNull(combinationArraySetList8);
        org.junit.Assert.assertNull(combinationArraySetList10);
        org.junit.Assert.assertNotNull(combinationArraySetList12);
        org.junit.Assert.assertNull(combinationArraySetList14);
        org.junit.Assert.assertNotNull(combinationArraySetList16);
    }

    @Test
    public void test6761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6761");
        java.lang.Class[][][][] classArray1 = new java.lang.Class[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][]>> genericDeclarationArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][][]) wildcardClassArray2, 1);
        java.lang.Class<?> wildcardClass13 = genericDeclarationArraySetList12.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(typeArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(typeArraySetList10);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6762");
        java.util.List[][][][][][][][] listArray1 = new java.util.List[0][][][][][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, 0);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][]>> listArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][]>> listArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, 3);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][]>> listArraySetList10 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, 1);
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNull(listArraySetList4);
        org.junit.Assert.assertNull(listArraySetList6);
        org.junit.Assert.assertNotNull(listArraySetList8);
        org.junit.Assert.assertNotNull(listArraySetList10);
    }

    @Test
    public void test6763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6763");
        java.lang.Class[][][][][][] classArray1 = new java.lang.Class[0][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 4);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][][][]>> genericDeclarationArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][][][][]) wildcardClassArray2, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][][][]>> genericDeclarationArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][][][][]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][][][]>> genericDeclarationArraySetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][][][][]) wildcardClassArray2, 4);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][][][]>> genericDeclarationArraySetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][][][][]) wildcardClassArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][][][]>> genericDeclarationArraySetList18 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][][][][]) wildcardClassArray2, (int) (short) 10);
        java.lang.Class<?> wildcardClass19 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList10);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList12);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList14);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList16);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6764");
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) ' ');
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 4);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][]>> combinationArraySetList8 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (-1));
        java.lang.Class<?> wildcardClass9 = combinationArray0.getClass();
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNull(combinationArraySetList2);
        org.junit.Assert.assertNotNull(combinationArraySetList4);
        org.junit.Assert.assertNotNull(combinationArraySetList6);
        org.junit.Assert.assertNotNull(combinationArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test6765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6765");
        java.lang.Class[][][][][][][][][][][][][][][][][] classArray1 = new java.lang.Class[0][][][][][][][][][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][][][][][][][][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][][][][][][][][][][][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][][][][][][][][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][][][][][][][][][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][][][][][][][][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) ' ');
        java.lang.Class<?> wildcardClass9 = wildcardClassArraySetList8.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test6766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6766");
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) ' ');
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 100);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][]>> combinationArraySetList8 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) 'a');
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][]>> combinationArraySetList10 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][]>> combinationArraySetList12 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 3);
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNull(combinationArraySetList2);
        org.junit.Assert.assertNotNull(combinationArraySetList4);
        org.junit.Assert.assertNotNull(combinationArraySetList6);
        org.junit.Assert.assertNotNull(combinationArraySetList8);
        org.junit.Assert.assertNotNull(combinationArraySetList10);
        org.junit.Assert.assertNotNull(combinationArraySetList12);
    }

    @Test
    public void test6767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6767");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList4 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray0, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.CharSequence[]>> charSequenceArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[][]) strArray0, 3);
        java.lang.Class<?> wildcardClass7 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNull(serializableSetList4);
        org.junit.Assert.assertNotNull(charSequenceArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test6768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6768");
        java.util.Collection[] collectionArray1 = new java.util.Collection[0];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.util.TreeSet<java.lang.String>>[] strSetCollectionArray2 = (java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray1;
        java.util.List<java.util.TreeSet<java.util.Collection<java.util.TreeSet<java.lang.String>>>> setCollectionSetList4 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray1, (-1));
        java.util.List<java.util.TreeSet<java.util.Collection<java.util.TreeSet<java.lang.String>>>> setCollectionSetList6 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray1, (int) '4');
        java.util.List<java.util.TreeSet<java.util.Collection<java.util.TreeSet<java.lang.String>>>> setCollectionSetList8 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray1, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.util.Collection<java.util.TreeSet<java.lang.String>>>> setCollectionSetList10 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray1, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.util.Collection<java.util.TreeSet<java.lang.String>>>> setCollectionSetList12 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray1, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.util.Collection<java.util.TreeSet<java.lang.String>>>> setCollectionSetList14 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray1, (int) ' ');
        org.junit.Assert.assertNotNull(collectionArray1);
        org.junit.Assert.assertNotNull(strSetCollectionArray2);
        org.junit.Assert.assertNotNull(setCollectionSetList4);
        org.junit.Assert.assertNotNull(setCollectionSetList6);
        org.junit.Assert.assertNotNull(setCollectionSetList8);
        org.junit.Assert.assertNull(setCollectionSetList10);
        org.junit.Assert.assertNotNull(setCollectionSetList12);
        org.junit.Assert.assertNotNull(setCollectionSetList14);
    }

    @Test
    public void test6769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6769");
        com.thealgorithms.backtracking.Combination[][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 100);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][]>> combinationArraySetList8 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 10);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][]>> combinationArraySetList10 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) -1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][]>> combinationArraySetList12 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) '#');
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][]>> combinationArraySetList14 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) -1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][]>> combinationArraySetList16 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) 'a');
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNull(combinationArraySetList2);
        org.junit.Assert.assertNotNull(combinationArraySetList4);
        org.junit.Assert.assertNotNull(combinationArraySetList6);
        org.junit.Assert.assertNotNull(combinationArraySetList8);
        org.junit.Assert.assertNotNull(combinationArraySetList10);
        org.junit.Assert.assertNotNull(combinationArraySetList12);
        org.junit.Assert.assertNotNull(combinationArraySetList14);
        org.junit.Assert.assertNotNull(combinationArraySetList16);
    }

    @Test
    public void test6770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6770");
        java.lang.String[][][][][] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.String[][][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6771");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList9 = com.thealgorithms.backtracking.Combination.combination(strArray7, (int) '#');
        java.util.List[] listArray11 = new java.util.List[2];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[] strSetListArray12 = (java.util.List<java.util.TreeSet<java.lang.String>>[]) listArray11;
        strSetListArray12[0] = strSetList4;
        strSetListArray12[1] = strSetList9;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>>> setListSetList18 = com.thealgorithms.backtracking.Combination.combination(strSetListArray12, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>>> setListSetList20 = com.thealgorithms.backtracking.Combination.combination(strSetListArray12, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>>> setListSetList22 = com.thealgorithms.backtracking.Combination.combination(strSetListArray12, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>>> setListSetList24 = com.thealgorithms.backtracking.Combination.combination(strSetListArray12, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList26 = com.thealgorithms.backtracking.Combination.combination((java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]) strSetListArray12, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strSetList9);
        org.junit.Assert.assertNotNull(listArray11);
        org.junit.Assert.assertNotNull(strSetListArray12);
        org.junit.Assert.assertNull(setListSetList18);
        org.junit.Assert.assertNull(setListSetList20);
        org.junit.Assert.assertNull(setListSetList22);
        org.junit.Assert.assertNull(setListSetList24);
    }

    @Test
    public void test6772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6772");
        java.lang.Class[][][][][][][][][][][][][][][][][][][] classArray1 = new java.lang.Class[0][][][][][][][][][][][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][][][][][][][][][][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][][][][][][][][][][][][][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][][][][][][][][][][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][][][][][][][][][][][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 10);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][][][][][][][][][][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][][][][][][][][][][][]>> wildcardClassArraySetList10 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNull(wildcardClassArraySetList10);
    }
}

