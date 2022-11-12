package backtracking.Combination;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, (-1));
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) strArray0, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) strArray0, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.lang.CharSequence[]>> charSequenceArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[][]) strArray0, (-1));
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNotNull(strArraySetList4);
        org.junit.Assert.assertNotNull(constableArraySetList6);
        org.junit.Assert.assertNotNull(constableArraySetList8);
        org.junit.Assert.assertNotNull(charSequenceArraySetList10);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        java.lang.String[][][][][][] strArray0 = new java.lang.String[][][][][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList10 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) 'a');
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNull(strArraySetList4);
        org.junit.Assert.assertNull(strArraySetList6);
        org.junit.Assert.assertNull(strArraySetList8);
        org.junit.Assert.assertNotNull(strArraySetList10);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        java.lang.Class[][][] classArray1 = new java.lang.Class[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][] wildcardClassArray2 = (java.lang.Class<?>[][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][]>> typeArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][]) wildcardClassArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][]>> genericDeclarationArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList14 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 4);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(typeArraySetList10);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList12);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList14);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        java.util.List[][] listArray1 = new java.util.List[0][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (-1));
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][]) strSetListArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList10 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, 3);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList12 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) 'a');
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArraySetList4);
        org.junit.Assert.assertNotNull(listArraySetList6);
        org.junit.Assert.assertNotNull(collectionArraySetList8);
        org.junit.Assert.assertNotNull(listArraySetList10);
        org.junit.Assert.assertNotNull(listArraySetList12);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        java.lang.Class[][][][][][][][][][][] classArray1 = new java.lang.Class[0][][][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][][][][][][][]) classArray1;
        java.lang.Class[][][][][][][][][][][] classArray4 = new java.lang.Class[0][][][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][][][][][] wildcardClassArray5 = (java.lang.Class<?>[][][][][][][][][][][]) classArray4;
        java.lang.Class[][][][][][][][][][][] classArray7 = new java.lang.Class[0][][][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][][][][][] wildcardClassArray8 = (java.lang.Class<?>[][][][][][][][][][][]) classArray7;
        java.lang.Class[][][][][][][][][][][] classArray10 = new java.lang.Class[0][][][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][][][][][] wildcardClassArray11 = (java.lang.Class<?>[][][][][][][][][][][]) classArray10;
        java.lang.Class[][][][][][][][][][][] classArray13 = new java.lang.Class[0][][][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][][][][][] wildcardClassArray14 = (java.lang.Class<?>[][][][][][][][][][][]) classArray13;
        java.lang.Class[][][][][][][][][][][][] classArray16 = new java.lang.Class[5][][][][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][][][][][][] wildcardClassArray17 = (java.lang.Class<?>[][][][][][][][][][][][]) classArray16;
        wildcardClassArray17[0] = wildcardClassArray2;
        wildcardClassArray17[1] = wildcardClassArray5;
        wildcardClassArray17[2] = wildcardClassArray8;
        wildcardClassArray17[3] = wildcardClassArray11;
        wildcardClassArray17[4] = wildcardClassArray14;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][][][][]>> wildcardClassArraySetList29 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray17, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][]) wildcardClassArray2, 5);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, 4);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(typeArraySetList8);
        org.junit.Assert.assertNotNull(constableArraySetList10);
        org.junit.Assert.assertNull(wildcardClassArraySetList12);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList14);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList4 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray0, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strArray0, 0);
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strArray0, (-1));
        java.util.List<java.util.TreeSet<java.lang.CharSequence[]>> charSequenceArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[][]) strArray0, (-1));
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList12 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.CharSequence[]>> charSequenceArraySetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[][]) strArray0, (int) (byte) 100);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNull(serializableSetList4);
        org.junit.Assert.assertNull(strArraySetList6);
        org.junit.Assert.assertNotNull(strArraySetList8);
        org.junit.Assert.assertNotNull(charSequenceArraySetList10);
        org.junit.Assert.assertNotNull(strArraySetList12);
        org.junit.Assert.assertNotNull(charSequenceArraySetList14);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.AnnotatedElement>> annotatedElementSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.AnnotatedElement[]) wildcardClassArray2, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList16 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 1);
        java.lang.Class<?> wildcardClass17 = wildcardClassSetList16.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(genericDeclarationSetList6);
        org.junit.Assert.assertNotNull(typeDescriptorSetList8);
        org.junit.Assert.assertNull(genericDeclarationSetList10);
        org.junit.Assert.assertNull(genericDeclarationSetList12);
        org.junit.Assert.assertNotNull(annotatedElementSetList14);
        org.junit.Assert.assertNotNull(wildcardClassSetList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][] combinationArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray2, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList8 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) (byte) 100);
        java.lang.Class<?> wildcardClass9 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNull(constantDescSetList6);
        org.junit.Assert.assertNotNull(strSetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
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
        java.lang.Class<?> wildcardClass21 = typeSetList20.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        java.lang.Class<?>[][][][] wildcardClassArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList2 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray0, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        java.util.List[][][][] listArray1 = new java.util.List[0][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][]) listArray1;
        java.util.List[][][][][] listArray4 = new java.util.List[1][][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][][] strSetListArray5 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][][]) listArray4;
        strSetListArray5[0] = strSetListArray2;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][]>> listArraySetList9 = com.thealgorithms.backtracking.Combination.combination(strSetListArray5, 5);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][]>> listArraySetList11 = com.thealgorithms.backtracking.Combination.combination(strSetListArray5, (int) (short) 100);
        java.lang.Class<?> wildcardClass12 = strSetListArray5.getClass();
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArray4);
        org.junit.Assert.assertNotNull(strSetListArray5);
        org.junit.Assert.assertNotNull(listArraySetList9);
        org.junit.Assert.assertNotNull(listArraySetList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        java.lang.Class[][][][][][][] classArray1 = new java.lang.Class[0][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][]>> wildcardClassArraySetList10 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][]>> wildcardClassArraySetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][]>> wildcardClassArraySetList14 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) 'a');
        java.lang.Class<?> wildcardClass15 = wildcardClassArraySetList14.getClass();
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
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) wildcardClassArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][]) wildcardClassArray2, 4);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNull(genericDeclarationArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(constableArraySetList10);
        org.junit.Assert.assertNull(wildcardClassArraySetList12);
        org.junit.Assert.assertNotNull(typeArraySetList14);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        java.lang.Class[][][] classArray1 = new java.lang.Class[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][] wildcardClassArray2 = (java.lang.Class<?>[][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][]>> genericDeclarationArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][]) wildcardClassArray2, (-1));
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][]>> typeArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList10 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList6);
        org.junit.Assert.assertNull(typeArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList10);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        java.lang.Class[][][][][][][][][] classArray1 = new java.lang.Class[0][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][][][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 2);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][]>> wildcardClassArraySetList10 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][]>> wildcardClassArraySetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][]>> wildcardClassArraySetList14 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) '4');
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList10);
        org.junit.Assert.assertNull(wildcardClassArraySetList12);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList14);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class[][] classArray4 = new java.lang.Class[1][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray5 = (java.lang.Class<?>[][]) classArray4;
        wildcardClassArray5[0] = classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList9 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray5, 10);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList11 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray5, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[]>> ofFieldArraySetList13 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[][]) wildcardClassArray5, (int) 'a');
        java.lang.Class<?> wildcardClass14 = wildcardClassArray5.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(classArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList9);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList11);
        org.junit.Assert.assertNotNull(ofFieldArraySetList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.AnnotatedElement>> annotatedElementSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.AnnotatedElement[]) wildcardClassArray2, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> wildcardClassOfFieldSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (short) 1);
        java.lang.Class<?> wildcardClass17 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNull(typeDescriptorSetList6);
        org.junit.Assert.assertNotNull(annotatedElementSetList8);
        org.junit.Assert.assertNotNull(typeDescriptorSetList10);
        org.junit.Assert.assertNotNull(genericDeclarationSetList12);
        org.junit.Assert.assertNotNull(wildcardClassOfFieldSetList14);
        org.junit.Assert.assertNotNull(genericDeclarationSetList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][]) wildcardClassArray2, 5);
        java.util.List<java.util.TreeSet<java.lang.Object>> objSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.Object[]) wildcardClassArray2, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 1);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(typeArraySetList6);
        org.junit.Assert.assertNull(objSetList8);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList12);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        com.thealgorithms.backtracking.Combination[][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (byte) 1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) '4');
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 4);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][]>> combinationArraySetList8 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) ' ');
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNotNull(combinationArraySetList2);
        org.junit.Assert.assertNotNull(combinationArraySetList4);
        org.junit.Assert.assertNotNull(combinationArraySetList6);
        org.junit.Assert.assertNotNull(combinationArraySetList8);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        java.lang.Class[][][][] classArray1 = new java.lang.Class[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, (-1));
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][]>> genericDeclarationArraySetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][][]) wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList16 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 4);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][]>> genericDeclarationArraySetList18 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][][]) wildcardClassArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = genericDeclarationArraySetList18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(typeArraySetList6);
        org.junit.Assert.assertNotNull(typeArraySetList8);
        org.junit.Assert.assertNotNull(typeArraySetList10);
        org.junit.Assert.assertNotNull(typeArraySetList12);
        org.junit.Assert.assertNull(genericDeclarationArraySetList14);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList16);
        org.junit.Assert.assertNull(genericDeclarationArraySetList18);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        java.lang.Class[][][][] classArray1 = new java.lang.Class[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList10 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 100);
        java.lang.Class<?> wildcardClass11 = wildcardClassArraySetList10.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(typeArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        java.lang.Class[][][] classArray1 = new java.lang.Class[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][] wildcardClassArray2 = (java.lang.Class<?>[][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][]>> genericDeclarationArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][]) wildcardClassArray2, 5);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][]>> typeArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][]) wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList10 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][]>> typeArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][]) wildcardClassArray2, (int) (short) 1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList14 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList16 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 2);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][]>> genericDeclarationArraySetList18 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][]) wildcardClassArray2, 4);
        java.lang.Class<?> wildcardClass19 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList6);
        org.junit.Assert.assertNotNull(typeArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList10);
        org.junit.Assert.assertNotNull(typeArraySetList12);
        org.junit.Assert.assertNotNull(serializableSetList14);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList16);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        java.util.List[][][][] listArray1 = new java.util.List[0][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][]) listArray1;
        java.util.List[][][][][] listArray4 = new java.util.List[1][][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][][] strSetListArray5 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][][]) listArray4;
        strSetListArray5[0] = strSetListArray2;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][]>> listArraySetList9 = com.thealgorithms.backtracking.Combination.combination(strSetListArray5, 5);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][]>> listArraySetList11 = com.thealgorithms.backtracking.Combination.combination(strSetListArray5, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][]>> listArraySetList13 = com.thealgorithms.backtracking.Combination.combination(strSetListArray5, 0);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][]>> listArraySetList15 = com.thealgorithms.backtracking.Combination.combination(strSetListArray5, 4);
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArray4);
        org.junit.Assert.assertNotNull(strSetListArray5);
        org.junit.Assert.assertNotNull(listArraySetList9);
        org.junit.Assert.assertNotNull(listArraySetList11);
        org.junit.Assert.assertNull(listArraySetList13);
        org.junit.Assert.assertNotNull(listArraySetList15);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "", "" };
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList10 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray6, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList12 = com.thealgorithms.backtracking.Combination.combination(strArray6, 1);
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray6, 2);
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray6, 10);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList18 = com.thealgorithms.backtracking.Combination.combination(strArray6, (int) (short) -1);
        java.lang.Class<?> wildcardClass19 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strComparableSetList8);
        org.junit.Assert.assertNotNull(serializableSetList10);
        org.junit.Assert.assertNotNull(strSetList12);
        org.junit.Assert.assertNotNull(constantDescSetList14);
        org.junit.Assert.assertNotNull(constantDescSetList16);
        org.junit.Assert.assertNotNull(strSetList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        com.thealgorithms.backtracking.Combination[][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 100);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][]>> combinationArraySetList8 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 10);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][]>> combinationArraySetList10 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) -1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][]>> combinationArraySetList12 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) '#');
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][]>> combinationArraySetList14 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 0);
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
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        java.lang.Class[][][][][][][][][] classArray1 = new java.lang.Class[0][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][][][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 2);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][]>> wildcardClassArraySetList10 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][]>> wildcardClassArraySetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 0);
        java.lang.Class<?> wildcardClass13 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList10);
        org.junit.Assert.assertNull(wildcardClassArraySetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        java.lang.Class[][][] classArray1 = new java.lang.Class[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][] wildcardClassArray2 = (java.lang.Class<?>[][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][]>> genericDeclarationArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][]) wildcardClassArray2, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][]>> genericDeclarationArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][]) wildcardClassArray2, (int) '#');
        java.lang.Class<?> wildcardClass11 = genericDeclarationArraySetList10.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList8);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        java.lang.Class[][][][] classArray1 = new java.lang.Class[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 4);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, (int) (byte) 10);
        java.lang.Class<?> wildcardClass11 = typeArraySetList10.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(typeArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(typeArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        java.util.List[][] listArray1 = new java.util.List[0][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (-1));
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]>> iterableArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.Iterable<java.util.TreeSet<java.lang.String>>[][]) strSetListArray2, (-1));
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][]) strSetListArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]>> iterableArraySetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.Iterable<java.util.TreeSet<java.lang.String>>[][]) strSetListArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList16 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (byte) 10);
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList18 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][]) strSetListArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]>> iterableArraySetList20 = com.thealgorithms.backtracking.Combination.combination((java.lang.Iterable<java.util.TreeSet<java.lang.String>>[][]) strSetListArray2, (int) (byte) 100);
        java.lang.Class<?> wildcardClass21 = iterableArraySetList20.getClass();
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArraySetList4);
        org.junit.Assert.assertNotNull(listArraySetList6);
        org.junit.Assert.assertNotNull(listArraySetList8);
        org.junit.Assert.assertNotNull(iterableArraySetList10);
        org.junit.Assert.assertNotNull(collectionArraySetList12);
        org.junit.Assert.assertNotNull(iterableArraySetList14);
        org.junit.Assert.assertNotNull(listArraySetList16);
        org.junit.Assert.assertNotNull(collectionArraySetList18);
        org.junit.Assert.assertNotNull(iterableArraySetList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList8 = com.thealgorithms.backtracking.Combination.combination(strArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, (int) (short) -1);
        java.lang.Class<?> wildcardClass11 = charSequenceSetList10.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(charSequenceSetList6);
        org.junit.Assert.assertNull(strSetList8);
        org.junit.Assert.assertNotNull(charSequenceSetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList14 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 4);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable>> constableSetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList18 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) '#');
        java.lang.Class<?> wildcardClass19 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(genericDeclarationSetList6);
        org.junit.Assert.assertNotNull(typeDescriptorSetList8);
        org.junit.Assert.assertNull(genericDeclarationSetList10);
        org.junit.Assert.assertNull(typeDescriptorSetList12);
        org.junit.Assert.assertNotNull(wildcardClassSetList14);
        org.junit.Assert.assertNull(constableSetList16);
        org.junit.Assert.assertNotNull(wildcardClassSetList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        java.util.List[][] listArray1 = new java.util.List[0][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (-1));
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]>> iterableArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.Iterable<java.util.TreeSet<java.lang.String>>[][]) strSetListArray2, (-1));
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][]) strSetListArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]>> iterableArraySetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.Iterable<java.util.TreeSet<java.lang.String>>[][]) strSetListArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList16 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (byte) 10);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]>> iterableArraySetList18 = com.thealgorithms.backtracking.Combination.combination((java.lang.Iterable<java.util.TreeSet<java.lang.String>>[][]) strSetListArray2, (-1));
        java.lang.Class<?> wildcardClass19 = strSetListArray2.getClass();
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArraySetList4);
        org.junit.Assert.assertNotNull(listArraySetList6);
        org.junit.Assert.assertNotNull(listArraySetList8);
        org.junit.Assert.assertNotNull(iterableArraySetList10);
        org.junit.Assert.assertNotNull(collectionArraySetList12);
        org.junit.Assert.assertNotNull(iterableArraySetList14);
        org.junit.Assert.assertNotNull(listArraySetList16);
        org.junit.Assert.assertNotNull(iterableArraySetList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) '#');
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNull(combinationArraySetList2);
        org.junit.Assert.assertNotNull(combinationArraySetList4);
        org.junit.Assert.assertNotNull(combinationArraySetList6);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        com.thealgorithms.backtracking.Combination[][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (byte) 1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) '4');
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 4);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][]>> combinationArraySetList8 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass9 = combinationArraySetList8.getClass();
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNotNull(combinationArraySetList2);
        org.junit.Assert.assertNotNull(combinationArraySetList4);
        org.junit.Assert.assertNotNull(combinationArraySetList6);
        org.junit.Assert.assertNotNull(combinationArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        java.lang.Class[][][] classArray1 = new java.lang.Class[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][] wildcardClassArray2 = (java.lang.Class<?>[][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][]>> genericDeclarationArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][]) wildcardClassArray2, (-1));
        java.lang.Class<?> wildcardClass7 = genericDeclarationArraySetList6.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.AnnotatedElement>> annotatedElementSetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.AnnotatedElement[]) wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.Object>> objSetList18 = com.thealgorithms.backtracking.Combination.combination((java.lang.Object[]) wildcardClassArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type>> typeSetList20 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[]) wildcardClassArray2, 1);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(genericDeclarationSetList6);
        org.junit.Assert.assertNotNull(typeDescriptorSetList8);
        org.junit.Assert.assertNull(genericDeclarationSetList10);
        org.junit.Assert.assertNull(genericDeclarationSetList12);
        org.junit.Assert.assertNull(typeDescriptorSetList14);
        org.junit.Assert.assertNull(annotatedElementSetList16);
        org.junit.Assert.assertNotNull(objSetList18);
        org.junit.Assert.assertNotNull(typeSetList20);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        java.lang.Class[][][] classArray1 = new java.lang.Class[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][] wildcardClassArray2 = (java.lang.Class<?>[][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][]>> typeArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][]) wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][]>> genericDeclarationArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][]) wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][]>> genericDeclarationArraySetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][]) wildcardClassArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][]>> typeArraySetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][]) wildcardClassArray2, 1);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(typeArraySetList8);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList12);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList14);
        org.junit.Assert.assertNotNull(typeArraySetList16);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.AnnotatedElement>> annotatedElementSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.AnnotatedElement[]) wildcardClassArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = genericDeclarationSetList10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(genericDeclarationSetList6);
        org.junit.Assert.assertNotNull(annotatedElementSetList8);
        org.junit.Assert.assertNull(genericDeclarationSetList10);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        java.lang.Class[][][] classArray1 = new java.lang.Class[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][] wildcardClassArray2 = (java.lang.Class<?>[][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][]>> typeArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][]) wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][]>> genericDeclarationArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][]) wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][]>> genericDeclarationArraySetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][]) wildcardClassArray2, 1);
        java.lang.Class<?> wildcardClass15 = genericDeclarationArraySetList14.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(typeArraySetList8);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList12);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
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
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList20 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList22 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.reflect.AnnotatedElement>> annotatedElementSetList24 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.AnnotatedElement[]) wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList26 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) wildcardClassArray2, (int) (short) 0);
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
        org.junit.Assert.assertNotNull(typeDescriptorSetList22);
        org.junit.Assert.assertNotNull(annotatedElementSetList24);
        org.junit.Assert.assertNull(serializableSetList26);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type>> typeSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type>> typeSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[]) wildcardClassArray2, 2);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type>> typeSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[]) wildcardClassArray2, 6);
        java.util.List<java.util.TreeSet<java.lang.reflect.AnnotatedElement>> annotatedElementSetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.AnnotatedElement[]) wildcardClassArray2, (int) (byte) 100);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(typeDescriptorSetList6);
        org.junit.Assert.assertNotNull(typeDescriptorSetList8);
        org.junit.Assert.assertNotNull(typeSetList10);
        org.junit.Assert.assertNotNull(typeSetList12);
        org.junit.Assert.assertNotNull(typeSetList14);
        org.junit.Assert.assertNotNull(annotatedElementSetList16);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        java.lang.Class[][][] classArray1 = new java.lang.Class[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][] wildcardClassArray2 = (java.lang.Class<?>[][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][]>> typeArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][]) wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][]>> typeArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][]) wildcardClassArray2, 5);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNull(typeArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(typeArraySetList10);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
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
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> wildcardClassOfFieldSetList18 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[]) wildcardClassArray2, (int) '#');
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
        org.junit.Assert.assertNotNull(wildcardClassOfFieldSetList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        java.lang.Class[][][][][] classArray1 = new java.lang.Class[0][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) '#');
        java.lang.Class<?> wildcardClass7 = wildcardClassArraySetList6.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type>> typeSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.AnnotatedElement>> annotatedElementSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.AnnotatedElement[]) wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable>> constableSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[]) wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList16 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 5);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type>> typeSetList18 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[]) wildcardClassArray2, (int) ' ');
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(typeDescriptorSetList6);
        org.junit.Assert.assertNotNull(typeDescriptorSetList8);
        org.junit.Assert.assertNotNull(typeSetList10);
        org.junit.Assert.assertNotNull(annotatedElementSetList12);
        org.junit.Assert.assertNotNull(constableSetList14);
        org.junit.Assert.assertNotNull(wildcardClassSetList16);
        org.junit.Assert.assertNotNull(typeSetList18);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList8 = com.thealgorithms.backtracking.Combination.combination(strArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray2, 2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(charSequenceSetList6);
        org.junit.Assert.assertNull(strSetList8);
        org.junit.Assert.assertNotNull(constantDescSetList10);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray1 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray2 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray3 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray4 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][] combinationArray5 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][] { combinationArray0, combinationArray1, combinationArray2, combinationArray3, combinationArray4 };
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray6 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray7 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray8 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray9 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray10 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][] combinationArray11 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][] { combinationArray6, combinationArray7, combinationArray8, combinationArray9, combinationArray10 };
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray12 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray13 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray14 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray15 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray16 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][] combinationArray17 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][] { combinationArray12, combinationArray13, combinationArray14, combinationArray15, combinationArray16 };
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray18 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray19 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray20 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray21 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray22 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][] combinationArray23 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][] { combinationArray18, combinationArray19, combinationArray20, combinationArray21, combinationArray22 };
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray24 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray25 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray26 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray27 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray28 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][] combinationArray29 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][] { combinationArray24, combinationArray25, combinationArray26, combinationArray27, combinationArray28 };
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][][] combinationArray30 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][][] { combinationArray5, combinationArray11, combinationArray17, combinationArray23, combinationArray29 };
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray31 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray32 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray33 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray34 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray35 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][] combinationArray36 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][] { combinationArray31, combinationArray32, combinationArray33, combinationArray34, combinationArray35 };
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray37 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray38 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray39 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray40 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray41 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][] combinationArray42 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][] { combinationArray37, combinationArray38, combinationArray39, combinationArray40, combinationArray41 };
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray43 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray44 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray45 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray46 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray47 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][] combinationArray48 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][] { combinationArray43, combinationArray44, combinationArray45, combinationArray46, combinationArray47 };
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray49 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray50 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray51 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray52 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray53 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][] combinationArray54 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][] { combinationArray49, combinationArray50, combinationArray51, combinationArray52, combinationArray53 };
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray55 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray56 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray57 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray58 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray59 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][] combinationArray60 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][] { combinationArray55, combinationArray56, combinationArray57, combinationArray58, combinationArray59 };
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][][] combinationArray61 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][][] { combinationArray36, combinationArray42, combinationArray48, combinationArray54, combinationArray60 };
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray62 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray63 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray64 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray65 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray66 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][] combinationArray67 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][] { combinationArray62, combinationArray63, combinationArray64, combinationArray65, combinationArray66 };
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray68 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray69 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray70 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray71 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray72 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][] combinationArray73 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][] { combinationArray68, combinationArray69, combinationArray70, combinationArray71, combinationArray72 };
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray74 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray75 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray76 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray77 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray78 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][] combinationArray79 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][] { combinationArray74, combinationArray75, combinationArray76, combinationArray77, combinationArray78 };
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray80 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray81 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray82 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray83 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray84 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][] combinationArray85 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][] { combinationArray80, combinationArray81, combinationArray82, combinationArray83, combinationArray84 };
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray86 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray87 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray88 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray89 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray90 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][] combinationArray91 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][] { combinationArray86, combinationArray87, combinationArray88, combinationArray89, combinationArray90 };
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][][] combinationArray92 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][][] { combinationArray67, combinationArray73, combinationArray79, combinationArray85, combinationArray91 };
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][] combinationArray93 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][] { combinationArray30, combinationArray61, combinationArray92 };
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][] combinationArray94 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][] { combinationArray93 };
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][]>> combinationArraySetList96 = com.thealgorithms.backtracking.Combination.combination(combinationArray94, (int) (byte) 0);
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNotNull(combinationArray1);
        org.junit.Assert.assertNotNull(combinationArray2);
        org.junit.Assert.assertNotNull(combinationArray3);
        org.junit.Assert.assertNotNull(combinationArray4);
        org.junit.Assert.assertNotNull(combinationArray5);
        org.junit.Assert.assertNotNull(combinationArray6);
        org.junit.Assert.assertNotNull(combinationArray7);
        org.junit.Assert.assertNotNull(combinationArray8);
        org.junit.Assert.assertNotNull(combinationArray9);
        org.junit.Assert.assertNotNull(combinationArray10);
        org.junit.Assert.assertNotNull(combinationArray11);
        org.junit.Assert.assertNotNull(combinationArray12);
        org.junit.Assert.assertNotNull(combinationArray13);
        org.junit.Assert.assertNotNull(combinationArray14);
        org.junit.Assert.assertNotNull(combinationArray15);
        org.junit.Assert.assertNotNull(combinationArray16);
        org.junit.Assert.assertNotNull(combinationArray17);
        org.junit.Assert.assertNotNull(combinationArray18);
        org.junit.Assert.assertNotNull(combinationArray19);
        org.junit.Assert.assertNotNull(combinationArray20);
        org.junit.Assert.assertNotNull(combinationArray21);
        org.junit.Assert.assertNotNull(combinationArray22);
        org.junit.Assert.assertNotNull(combinationArray23);
        org.junit.Assert.assertNotNull(combinationArray24);
        org.junit.Assert.assertNotNull(combinationArray25);
        org.junit.Assert.assertNotNull(combinationArray26);
        org.junit.Assert.assertNotNull(combinationArray27);
        org.junit.Assert.assertNotNull(combinationArray28);
        org.junit.Assert.assertNotNull(combinationArray29);
        org.junit.Assert.assertNotNull(combinationArray30);
        org.junit.Assert.assertNotNull(combinationArray31);
        org.junit.Assert.assertNotNull(combinationArray32);
        org.junit.Assert.assertNotNull(combinationArray33);
        org.junit.Assert.assertNotNull(combinationArray34);
        org.junit.Assert.assertNotNull(combinationArray35);
        org.junit.Assert.assertNotNull(combinationArray36);
        org.junit.Assert.assertNotNull(combinationArray37);
        org.junit.Assert.assertNotNull(combinationArray38);
        org.junit.Assert.assertNotNull(combinationArray39);
        org.junit.Assert.assertNotNull(combinationArray40);
        org.junit.Assert.assertNotNull(combinationArray41);
        org.junit.Assert.assertNotNull(combinationArray42);
        org.junit.Assert.assertNotNull(combinationArray43);
        org.junit.Assert.assertNotNull(combinationArray44);
        org.junit.Assert.assertNotNull(combinationArray45);
        org.junit.Assert.assertNotNull(combinationArray46);
        org.junit.Assert.assertNotNull(combinationArray47);
        org.junit.Assert.assertNotNull(combinationArray48);
        org.junit.Assert.assertNotNull(combinationArray49);
        org.junit.Assert.assertNotNull(combinationArray50);
        org.junit.Assert.assertNotNull(combinationArray51);
        org.junit.Assert.assertNotNull(combinationArray52);
        org.junit.Assert.assertNotNull(combinationArray53);
        org.junit.Assert.assertNotNull(combinationArray54);
        org.junit.Assert.assertNotNull(combinationArray55);
        org.junit.Assert.assertNotNull(combinationArray56);
        org.junit.Assert.assertNotNull(combinationArray57);
        org.junit.Assert.assertNotNull(combinationArray58);
        org.junit.Assert.assertNotNull(combinationArray59);
        org.junit.Assert.assertNotNull(combinationArray60);
        org.junit.Assert.assertNotNull(combinationArray61);
        org.junit.Assert.assertNotNull(combinationArray62);
        org.junit.Assert.assertNotNull(combinationArray63);
        org.junit.Assert.assertNotNull(combinationArray64);
        org.junit.Assert.assertNotNull(combinationArray65);
        org.junit.Assert.assertNotNull(combinationArray66);
        org.junit.Assert.assertNotNull(combinationArray67);
        org.junit.Assert.assertNotNull(combinationArray68);
        org.junit.Assert.assertNotNull(combinationArray69);
        org.junit.Assert.assertNotNull(combinationArray70);
        org.junit.Assert.assertNotNull(combinationArray71);
        org.junit.Assert.assertNotNull(combinationArray72);
        org.junit.Assert.assertNotNull(combinationArray73);
        org.junit.Assert.assertNotNull(combinationArray74);
        org.junit.Assert.assertNotNull(combinationArray75);
        org.junit.Assert.assertNotNull(combinationArray76);
        org.junit.Assert.assertNotNull(combinationArray77);
        org.junit.Assert.assertNotNull(combinationArray78);
        org.junit.Assert.assertNotNull(combinationArray79);
        org.junit.Assert.assertNotNull(combinationArray80);
        org.junit.Assert.assertNotNull(combinationArray81);
        org.junit.Assert.assertNotNull(combinationArray82);
        org.junit.Assert.assertNotNull(combinationArray83);
        org.junit.Assert.assertNotNull(combinationArray84);
        org.junit.Assert.assertNotNull(combinationArray85);
        org.junit.Assert.assertNotNull(combinationArray86);
        org.junit.Assert.assertNotNull(combinationArray87);
        org.junit.Assert.assertNotNull(combinationArray88);
        org.junit.Assert.assertNotNull(combinationArray89);
        org.junit.Assert.assertNotNull(combinationArray90);
        org.junit.Assert.assertNotNull(combinationArray91);
        org.junit.Assert.assertNotNull(combinationArray92);
        org.junit.Assert.assertNotNull(combinationArray93);
        org.junit.Assert.assertNotNull(combinationArray94);
        org.junit.Assert.assertNull(combinationArraySetList96);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class[][] classArray4 = new java.lang.Class[1][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray5 = (java.lang.Class<?>[][]) classArray4;
        wildcardClassArray5[0] = classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList9 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray5, 10);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList11 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray5, 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[]>> ofFieldArraySetList13 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[][]) wildcardClassArray5, 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList15 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray5, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList17 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][]) wildcardClassArray5, 3);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(classArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList9);
        org.junit.Assert.assertNull(genericDeclarationArraySetList11);
        org.junit.Assert.assertNull(ofFieldArraySetList13);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList15);
        org.junit.Assert.assertNotNull(typeArraySetList17);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        com.thealgorithms.backtracking.Combination combination0 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination[] combinationArray1 = new com.thealgorithms.backtracking.Combination[] { combination0 };
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination>> combinationSetList3 = com.thealgorithms.backtracking.Combination.combination(combinationArray1, (int) (byte) 100);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination>> combinationSetList5 = com.thealgorithms.backtracking.Combination.combination(combinationArray1, (int) (byte) 100);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination>> combinationSetList7 = com.thealgorithms.backtracking.Combination.combination(combinationArray1, 2);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination>> combinationSetList9 = com.thealgorithms.backtracking.Combination.combination(combinationArray1, 4);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination>> combinationSetList11 = com.thealgorithms.backtracking.Combination.combination(combinationArray1, 10);
        java.lang.Class<?> wildcardClass12 = combinationSetList11.getClass();
        org.junit.Assert.assertNotNull(combinationArray1);
        org.junit.Assert.assertNotNull(combinationSetList3);
        org.junit.Assert.assertNotNull(combinationSetList5);
        org.junit.Assert.assertNotNull(combinationSetList7);
        org.junit.Assert.assertNotNull(combinationSetList9);
        org.junit.Assert.assertNotNull(combinationSetList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
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
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 5);
        java.lang.Class<?> wildcardClass9 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        java.util.List[][][][][][] listArray1 = new java.util.List[0][][][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][]>> listArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][]>> listArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (-1));
        java.lang.Class<?> wildcardClass9 = strSetListArray2.getClass();
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArraySetList4);
        org.junit.Assert.assertNotNull(listArraySetList6);
        org.junit.Assert.assertNotNull(listArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        java.lang.constant.Constable[] constableArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.constant.Constable>> constableSetList2 = com.thealgorithms.backtracking.Combination.combination(constableArray0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, (int) (short) -1);
        java.lang.Class<?> wildcardClass9 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(charSequenceSetList6);
        org.junit.Assert.assertNotNull(charSequenceSetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.AnnotatedElement>> annotatedElementSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.AnnotatedElement[]) wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList10 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) '#');
        java.lang.Class<?> wildcardClass13 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNull(typeDescriptorSetList6);
        org.junit.Assert.assertNotNull(annotatedElementSetList8);
        org.junit.Assert.assertNull(wildcardClassSetList10);
        org.junit.Assert.assertNotNull(typeDescriptorSetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        java.lang.Class[][][] classArray1 = new java.lang.Class[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][] wildcardClassArray2 = (java.lang.Class<?>[][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][]>> typeArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][]) wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][]>> genericDeclarationArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][]) wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = wildcardClassArraySetList12.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(typeArraySetList8);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        java.lang.String[][][][][][] strArray0 = new java.lang.String[][][][][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) 10);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strArray0, 6);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList10 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList12 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (short) 10);
        java.lang.Class<?> wildcardClass13 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNull(strArraySetList4);
        org.junit.Assert.assertNotNull(strArraySetList6);
        org.junit.Assert.assertNotNull(strArraySetList8);
        org.junit.Assert.assertNotNull(strArraySetList10);
        org.junit.Assert.assertNotNull(strArraySetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        java.util.List[][][][][][] listArray1 = new java.util.List[0][][][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][]>> listArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][]>> listArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (byte) -1);
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArraySetList4);
        org.junit.Assert.assertNotNull(listArraySetList6);
        org.junit.Assert.assertNotNull(listArraySetList8);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 5);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList10 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) '4');
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
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (short) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type>> typeSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (short) 1);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList18 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, 3);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(genericDeclarationSetList6);
        org.junit.Assert.assertNotNull(typeDescriptorSetList8);
        org.junit.Assert.assertNotNull(genericDeclarationSetList10);
        org.junit.Assert.assertNotNull(genericDeclarationSetList12);
        org.junit.Assert.assertNull(typeSetList14);
        org.junit.Assert.assertNotNull(typeDescriptorSetList16);
        org.junit.Assert.assertNotNull(typeDescriptorSetList18);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        java.lang.String[][] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray2, (int) (byte) 10);
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList14 = com.thealgorithms.backtracking.Combination.combination(strArray2, (-1));
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray2, 4);
        java.lang.Class<?> wildcardClass17 = strComparableSetList16.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(constantDescSetList6);
        org.junit.Assert.assertNull(charSequenceSetList8);
        org.junit.Assert.assertNotNull(strComparableSetList10);
        org.junit.Assert.assertNotNull(strComparableSetList12);
        org.junit.Assert.assertNotNull(strSetList14);
        org.junit.Assert.assertNotNull(strComparableSetList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList4 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable>> constableSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[]) strArray2, 4);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList8 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray2, (int) ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strComparableSetList4);
        org.junit.Assert.assertNotNull(constableSetList6);
        org.junit.Assert.assertNotNull(strSetList8);
        org.junit.Assert.assertNotNull(constantDescSetList10);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][]) wildcardClassArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) wildcardClassArray2, (int) (byte) -1);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList6);
        org.junit.Assert.assertNotNull(constableArraySetList8);
        org.junit.Assert.assertNotNull(typeArraySetList10);
        org.junit.Assert.assertNotNull(constableArraySetList12);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
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
        java.lang.Class<?> wildcardClass23 = strSetListArray12.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strSetList9);
        org.junit.Assert.assertNotNull(listArray11);
        org.junit.Assert.assertNotNull(strSetListArray12);
        org.junit.Assert.assertNull(setListSetList18);
        org.junit.Assert.assertNull(setListSetList20);
        org.junit.Assert.assertNull(setListSetList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        java.lang.Class<?>[][][][] wildcardClassArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList2 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) wildcardClassArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[]>> ofFieldArraySetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[][]) wildcardClassArray2, (-1));
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNull(genericDeclarationArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(constableArraySetList10);
        org.junit.Assert.assertNull(wildcardClassArraySetList12);
        org.junit.Assert.assertNotNull(constableArraySetList14);
        org.junit.Assert.assertNotNull(ofFieldArraySetList16);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        java.util.List[][][][] listArray1 = new java.util.List[0][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][]>> listArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (byte) 100);
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArraySetList4);
        org.junit.Assert.assertNotNull(listArraySetList6);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        java.lang.Class[][][][][][][][][] classArray1 = new java.lang.Class[0][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][][][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 2);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 10);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][]>> wildcardClassArraySetList10 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][]>> wildcardClassArraySetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 10);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList12);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        java.lang.Class<?>[][][][][][][][][][][] wildcardClassArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][][][]>> wildcardClassArraySetList2 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        java.lang.Class[][][][][][][] classArray1 = new java.lang.Class[0][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][]>> wildcardClassArraySetList10 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][]>> wildcardClassArraySetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
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
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        java.lang.String[][][][] strArray0 = new java.lang.String[][][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) 10);
        java.util.List<java.util.TreeSet<java.lang.String[][][]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, 0);
        java.util.List<java.util.TreeSet<java.lang.String[][][]>> strArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass7 = strArraySetList6.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNull(strArraySetList4);
        org.junit.Assert.assertNotNull(strArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (-1));
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass5 = combinationArraySetList4.getClass();
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNotNull(combinationArraySetList2);
        org.junit.Assert.assertNotNull(combinationArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
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
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][][]>> wildcardClassArraySetList51 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray45, (int) (byte) 0);
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
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][]) wildcardClassArray2, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][]) wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][]) wildcardClassArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][]) wildcardClassArray2, (int) (short) 10);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList6);
        org.junit.Assert.assertNotNull(typeArraySetList8);
        org.junit.Assert.assertNull(typeArraySetList10);
        org.junit.Assert.assertNull(typeArraySetList12);
        org.junit.Assert.assertNotNull(typeArraySetList14);
        org.junit.Assert.assertNotNull(typeArraySetList16);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) wildcardClassArray2, (int) (short) 1);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) wildcardClassArray2, 10);
        java.lang.Class<?> wildcardClass13 = constableArraySetList12.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList6);
        org.junit.Assert.assertNotNull(constableArraySetList8);
        org.junit.Assert.assertNotNull(constableArraySetList10);
        org.junit.Assert.assertNotNull(constableArraySetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        java.lang.String[][][][][] strArray0 = new java.lang.String[][][][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, 100);
        java.util.List<java.util.TreeSet<java.lang.String[][][][]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, 4);
        java.util.List<java.util.TreeSet<java.lang.String[][][][]>> strArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strArray0, 6);
        java.util.List<java.util.TreeSet<java.lang.String[][][][]>> strArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strArray0, 6);
        java.lang.Class<?> wildcardClass9 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNotNull(strArraySetList4);
        org.junit.Assert.assertNotNull(strArraySetList6);
        org.junit.Assert.assertNotNull(strArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        java.lang.Class[][][][][] classArray1 = new java.lang.Class[0][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][][]>> genericDeclarationArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][][][]) wildcardClassArray2, 0);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNull(genericDeclarationArraySetList8);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        java.util.List[][] listArray1 = new java.util.List[0][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (-1));
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]>> iterableArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.Iterable<java.util.TreeSet<java.lang.String>>[][]) strSetListArray2, (-1));
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][]) strSetListArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]>> iterableArraySetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.Iterable<java.util.TreeSet<java.lang.String>>[][]) strSetListArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList16 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (byte) 10);
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList18 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][]) strSetListArray2, 10);
        java.lang.Class<?> wildcardClass19 = collectionArraySetList18.getClass();
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArraySetList4);
        org.junit.Assert.assertNotNull(listArraySetList6);
        org.junit.Assert.assertNotNull(listArraySetList8);
        org.junit.Assert.assertNotNull(iterableArraySetList10);
        org.junit.Assert.assertNotNull(collectionArraySetList12);
        org.junit.Assert.assertNotNull(iterableArraySetList14);
        org.junit.Assert.assertNotNull(listArraySetList16);
        org.junit.Assert.assertNotNull(collectionArraySetList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, (-1));
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) strArray0, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.CharSequence[]>> charSequenceArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[][]) strArray0, 1);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) strArray0, 10);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) strArray0, 1);
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList14 = com.thealgorithms.backtracking.Combination.combination(strArray0, (-1));
        java.lang.Class<?> wildcardClass15 = strArraySetList14.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNotNull(strArraySetList4);
        org.junit.Assert.assertNotNull(constableArraySetList6);
        org.junit.Assert.assertNotNull(charSequenceArraySetList8);
        org.junit.Assert.assertNotNull(constableArraySetList10);
        org.junit.Assert.assertNotNull(constableArraySetList12);
        org.junit.Assert.assertNotNull(strArraySetList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        java.lang.Class[][][][] classArray1 = new java.lang.Class[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (-1));
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, (int) (byte) 10);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, (int) (short) 10);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(typeArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(typeArraySetList10);
        org.junit.Assert.assertNotNull(typeArraySetList12);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        com.thealgorithms.backtracking.Combination[][][][][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (byte) 100);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 2);
        java.lang.Class<?> wildcardClass7 = combinationArraySetList6.getClass();
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNotNull(combinationArraySetList2);
        org.junit.Assert.assertNull(combinationArraySetList4);
        org.junit.Assert.assertNotNull(combinationArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        java.util.List[][] listArray1 = new java.util.List[0][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]>> iterableArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.Iterable<java.util.TreeSet<java.lang.String>>[][]) strSetListArray2, 2);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, 10);
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][]) strSetListArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList12 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) '#');
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArraySetList4);
        org.junit.Assert.assertNotNull(iterableArraySetList6);
        org.junit.Assert.assertNotNull(listArraySetList8);
        org.junit.Assert.assertNotNull(collectionArraySetList10);
        org.junit.Assert.assertNotNull(listArraySetList12);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][] combinationArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (short) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type>> typeSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) '4');
        java.lang.Class<?> wildcardClass17 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(genericDeclarationSetList6);
        org.junit.Assert.assertNotNull(typeDescriptorSetList8);
        org.junit.Assert.assertNotNull(genericDeclarationSetList10);
        org.junit.Assert.assertNotNull(genericDeclarationSetList12);
        org.junit.Assert.assertNull(typeSetList14);
        org.junit.Assert.assertNotNull(genericDeclarationSetList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        com.thealgorithms.backtracking.Combination[][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 4);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (byte) 1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][]>> combinationArraySetList8 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 10);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][]>> combinationArraySetList10 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][]>> combinationArraySetList12 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 5);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][]>> combinationArraySetList14 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) ' ');
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNotNull(combinationArraySetList2);
        org.junit.Assert.assertNotNull(combinationArraySetList4);
        org.junit.Assert.assertNotNull(combinationArraySetList6);
        org.junit.Assert.assertNotNull(combinationArraySetList8);
        org.junit.Assert.assertNotNull(combinationArraySetList10);
        org.junit.Assert.assertNotNull(combinationArraySetList12);
        org.junit.Assert.assertNotNull(combinationArraySetList14);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        java.lang.Class[][][][] classArray1 = new java.lang.Class[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = wildcardClassArraySetList12.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(typeArraySetList6);
        org.junit.Assert.assertNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(typeArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, (-1));
        java.util.List<java.util.TreeSet<java.lang.CharSequence[]>> charSequenceArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[][]) strArray0, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.CharSequence[]>> charSequenceArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[][]) strArray0, (int) (short) 1);
        java.lang.Class<?> wildcardClass9 = charSequenceArraySetList8.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNotNull(strArraySetList4);
        org.junit.Assert.assertNull(charSequenceArraySetList6);
        org.junit.Assert.assertNotNull(charSequenceArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        java.lang.Class[][][][][][] classArray1 = new java.lang.Class[0][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 4);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 100);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList10 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) wildcardClassArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList14 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 0);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(serializableSetList10);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList12);
        org.junit.Assert.assertNull(wildcardClassArraySetList14);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        java.lang.Class[][][][] classArray1 = new java.lang.Class[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, (int) (byte) 10);
        java.lang.Class<?> wildcardClass11 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(typeArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(typeArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList8 = com.thealgorithms.backtracking.Combination.combination(strArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList12 = com.thealgorithms.backtracking.Combination.combination(strArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable>> constableSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[]) strArray2, 10);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(charSequenceSetList6);
        org.junit.Assert.assertNull(strSetList8);
        org.junit.Assert.assertNotNull(constantDescSetList10);
        org.junit.Assert.assertNull(strSetList12);
        org.junit.Assert.assertNotNull(constableSetList14);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        java.lang.Class[][][] classArray1 = new java.lang.Class[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][] wildcardClassArray2 = (java.lang.Class<?>[][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][]>> genericDeclarationArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][]) wildcardClassArray2, 5);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][]>> typeArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][]) wildcardClassArray2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass9 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList6);
        org.junit.Assert.assertNotNull(typeArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
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
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][][]>> wildcardClassArraySetList51 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray45, 100);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][][]>> wildcardClassArraySetList53 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray45, (int) (byte) 10);
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
        org.junit.Assert.assertNotNull(wildcardClassArraySetList51);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList53);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        java.lang.String[][][][][][][][][] strArray0 = new java.lang.String[][][][][][][][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        java.lang.reflect.GenericDeclaration[][][][] genericDeclarationArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][]>> genericDeclarationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(genericDeclarationArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        java.lang.Class[][][][] classArray1 = new java.lang.Class[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, (-1));
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList14 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][]>> genericDeclarationArraySetList18 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][][]) wildcardClassArray2, (int) (short) 100);
        java.lang.Class<?> wildcardClass19 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(typeArraySetList6);
        org.junit.Assert.assertNotNull(typeArraySetList8);
        org.junit.Assert.assertNotNull(typeArraySetList10);
        org.junit.Assert.assertNotNull(typeArraySetList12);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList14);
        org.junit.Assert.assertNotNull(typeArraySetList16);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
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
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][]>> listArraySetList31 = com.thealgorithms.backtracking.Combination.combination(strSetListArray17, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][]>> listArraySetList33 = com.thealgorithms.backtracking.Combination.combination(strSetListArray17, 1);
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
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        java.lang.String[][][][][][] strArray0 = new java.lang.String[][][][][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) 10);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strArray0, 6);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList10 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList12 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList14 = com.thealgorithms.backtracking.Combination.combination(strArray0, 0);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList16 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList18 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) '#');
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNull(strArraySetList4);
        org.junit.Assert.assertNotNull(strArraySetList6);
        org.junit.Assert.assertNotNull(strArraySetList8);
        org.junit.Assert.assertNotNull(strArraySetList10);
        org.junit.Assert.assertNotNull(strArraySetList12);
        org.junit.Assert.assertNull(strArraySetList14);
        org.junit.Assert.assertNotNull(strArraySetList16);
        org.junit.Assert.assertNotNull(strArraySetList18);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        java.lang.String[][][][][][] strArray0 = new java.lang.String[][][][][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) 10);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strArray0, 6);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList10 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList12 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList14 = com.thealgorithms.backtracking.Combination.combination(strArray0, 0);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList16 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList18 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) 'a');
        java.lang.Class<?> wildcardClass19 = strArraySetList18.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNull(strArraySetList4);
        org.junit.Assert.assertNotNull(strArraySetList6);
        org.junit.Assert.assertNotNull(strArraySetList8);
        org.junit.Assert.assertNotNull(strArraySetList10);
        org.junit.Assert.assertNotNull(strArraySetList12);
        org.junit.Assert.assertNull(strArraySetList14);
        org.junit.Assert.assertNotNull(strArraySetList16);
        org.junit.Assert.assertNotNull(strArraySetList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray2, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray2, (int) '#');
        java.lang.Class<?> wildcardClass13 = strComparableSetList12.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(charSequenceSetList6);
        org.junit.Assert.assertNotNull(constantDescSetList8);
        org.junit.Assert.assertNotNull(constantDescSetList10);
        org.junit.Assert.assertNotNull(strComparableSetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
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
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][][]>> wildcardClassArraySetList51 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray45, 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][][]>> wildcardClassArraySetList53 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray45, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(wildcardClassArraySetList51);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> wildcardClassOfFieldSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> wildcardClassOfFieldSetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[]) wildcardClassArray2, 4);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(genericDeclarationSetList6);
        org.junit.Assert.assertNotNull(typeDescriptorSetList8);
        org.junit.Assert.assertNull(genericDeclarationSetList10);
        org.junit.Assert.assertNotNull(genericDeclarationSetList12);
        org.junit.Assert.assertNotNull(wildcardClassOfFieldSetList14);
        org.junit.Assert.assertNotNull(wildcardClassOfFieldSetList16);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList8 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) (byte) -1);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "", "", "", "", "" };
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList17 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray15, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList19 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray15, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.Object>> objSetList21 = com.thealgorithms.backtracking.Combination.combination((java.lang.Object[]) strArray15, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList23 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray15, 100);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList25 = com.thealgorithms.backtracking.Combination.combination(strArray15, (int) '4');
        java.lang.String[] strArray28 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList30 = com.thealgorithms.backtracking.Combination.combination(strArray28, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList32 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray28, 10);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable>> constableSetList34 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[]) strArray28, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList36 = com.thealgorithms.backtracking.Combination.combination(strArray28, (int) (short) 1);
        java.lang.String[] strArray39 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList41 = com.thealgorithms.backtracking.Combination.combination(strArray39, (int) '#');
        java.lang.String[] strArray44 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList46 = com.thealgorithms.backtracking.Combination.combination(strArray44, (int) '#');
        java.util.List[] listArray48 = new java.util.List[5];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[] strSetListArray49 = (java.util.List<java.util.TreeSet<java.lang.String>>[]) listArray48;
        strSetListArray49[0] = strSetList8;
        strSetListArray49[1] = strSetList25;
        strSetListArray49[2] = strSetList36;
        strSetListArray49[3] = strSetList41;
        strSetListArray49[4] = strSetList46;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>>> setListSetList61 = com.thealgorithms.backtracking.Combination.combination(strSetListArray49, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>>> setListSetList63 = com.thealgorithms.backtracking.Combination.combination(strSetListArray49, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(constantDescSetList6);
        org.junit.Assert.assertNotNull(strSetList8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strComparableSetList17);
        org.junit.Assert.assertNotNull(serializableSetList19);
        org.junit.Assert.assertNotNull(objSetList21);
        org.junit.Assert.assertNotNull(strComparableSetList23);
        org.junit.Assert.assertNotNull(strSetList25);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(strSetList30);
        org.junit.Assert.assertNotNull(charSequenceSetList32);
        org.junit.Assert.assertNotNull(constableSetList34);
        org.junit.Assert.assertNotNull(strSetList36);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(strSetList41);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(strSetList46);
        org.junit.Assert.assertNotNull(listArray48);
        org.junit.Assert.assertNotNull(strSetListArray49);
        org.junit.Assert.assertNull(setListSetList61);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        java.lang.Class[][][][] classArray1 = new java.lang.Class[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList14 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 2);
        java.lang.Class<?> wildcardClass15 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(typeArraySetList6);
        org.junit.Assert.assertNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNull(typeArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList12);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        java.util.List[][][][][][][] listArray1 = new java.util.List[0][][][][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList6 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strSetListArray2, 2);
        java.lang.Class<?> wildcardClass7 = strSetListArray2.getClass();
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNull(listArraySetList4);
        org.junit.Assert.assertNotNull(serializableSetList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) '#');
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 4);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][]>> combinationArraySetList8 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 3);
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNull(combinationArraySetList2);
        org.junit.Assert.assertNotNull(combinationArraySetList4);
        org.junit.Assert.assertNotNull(combinationArraySetList6);
        org.junit.Assert.assertNotNull(combinationArraySetList8);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        java.lang.Class[][][][] classArray1 = new java.lang.Class[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, (-1));
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][]>> genericDeclarationArraySetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][][]) wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList16 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][]>> genericDeclarationArraySetList18 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][][]) wildcardClassArray2, 4);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList20 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 2);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(typeArraySetList6);
        org.junit.Assert.assertNotNull(typeArraySetList8);
        org.junit.Assert.assertNotNull(typeArraySetList10);
        org.junit.Assert.assertNotNull(typeArraySetList12);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList14);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList16);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList18);
        org.junit.Assert.assertNotNull(typeArraySetList20);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        java.util.Collection[] collectionArray1 = new java.util.Collection[0];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.util.TreeSet<java.lang.String>>[] strSetCollectionArray2 = (java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray1;
        java.util.List<java.util.TreeSet<java.util.Collection<java.util.TreeSet<java.lang.String>>>> setCollectionSetList4 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray1, (-1));
        java.util.List<java.util.TreeSet<java.util.Collection<java.util.TreeSet<java.lang.String>>>> setCollectionSetList6 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray1, (int) '4');
        java.util.List<java.util.TreeSet<java.util.Collection<java.util.TreeSet<java.lang.String>>>> setCollectionSetList8 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray1, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.util.Collection<java.util.TreeSet<java.lang.String>>>> setCollectionSetList10 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray1, (int) '4');
        org.junit.Assert.assertNotNull(collectionArray1);
        org.junit.Assert.assertNotNull(strSetCollectionArray2);
        org.junit.Assert.assertNotNull(setCollectionSetList4);
        org.junit.Assert.assertNotNull(setCollectionSetList6);
        org.junit.Assert.assertNotNull(setCollectionSetList8);
        org.junit.Assert.assertNotNull(setCollectionSetList10);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        java.lang.Class[][][][] classArray1 = new java.lang.Class[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, (-1));
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][]>> genericDeclarationArraySetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][][]) wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList16 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][]>> genericDeclarationArraySetList18 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][][]) wildcardClassArray2, 4);
        java.lang.Class<?> wildcardClass19 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(typeArraySetList6);
        org.junit.Assert.assertNotNull(typeArraySetList8);
        org.junit.Assert.assertNotNull(typeArraySetList10);
        org.junit.Assert.assertNotNull(typeArraySetList12);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList14);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList16);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
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
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (short) 1);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = typeDescriptorSetList14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(genericDeclarationSetList6);
        org.junit.Assert.assertNotNull(typeDescriptorSetList8);
        org.junit.Assert.assertNotNull(genericDeclarationSetList10);
        org.junit.Assert.assertNotNull(genericDeclarationSetList12);
        org.junit.Assert.assertNull(typeDescriptorSetList14);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        java.util.List[][][][] listArray1 = new java.util.List[0][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][]) listArray1;
        java.util.List[][][][][] listArray4 = new java.util.List[1][][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][][] strSetListArray5 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][][]) listArray4;
        strSetListArray5[0] = strSetListArray2;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][]>> listArraySetList9 = com.thealgorithms.backtracking.Combination.combination(strSetListArray5, 5);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][]>> listArraySetList11 = com.thealgorithms.backtracking.Combination.combination(strSetListArray5, 2);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][]>> listArraySetList13 = com.thealgorithms.backtracking.Combination.combination(strSetListArray5, (int) (short) 10);
        java.lang.Class<?> wildcardClass14 = strSetListArray5.getClass();
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArray4);
        org.junit.Assert.assertNotNull(strSetListArray5);
        org.junit.Assert.assertNotNull(listArraySetList9);
        org.junit.Assert.assertNotNull(listArraySetList11);
        org.junit.Assert.assertNotNull(listArraySetList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        java.lang.Class[][][][][] classArray1 = new java.lang.Class[0][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 10);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) ' ');
        java.lang.Class<?> wildcardClass9 = wildcardClassArraySetList8.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][]) wildcardClassArray2, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][]) wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][]) wildcardClassArray2, (int) (short) -1);
        java.lang.Class<?> wildcardClass15 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList6);
        org.junit.Assert.assertNotNull(typeArraySetList8);
        org.junit.Assert.assertNull(typeArraySetList10);
        org.junit.Assert.assertNull(typeArraySetList12);
        org.junit.Assert.assertNotNull(typeArraySetList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        com.thealgorithms.backtracking.Combination[][][][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][] combinationArray1 = new com.thealgorithms.backtracking.Combination[][][][][][][][][] { combinationArray0 };
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][]>> combinationArraySetList3 = com.thealgorithms.backtracking.Combination.combination(combinationArray1, 6);
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNotNull(combinationArray1);
        org.junit.Assert.assertNotNull(combinationArraySetList3);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        com.thealgorithms.backtracking.Combination[][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 6);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[]>> combinationArraySetList8 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 100);
        java.lang.Class<?> wildcardClass9 = combinationArraySetList8.getClass();
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNull(combinationArraySetList2);
        org.junit.Assert.assertNull(combinationArraySetList4);
        org.junit.Assert.assertNotNull(combinationArraySetList6);
        org.junit.Assert.assertNotNull(combinationArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        java.util.List[][] listArray1 = new java.util.List[0][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (-1));
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][]) strSetListArray2, 5);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]>> iterableArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.Iterable<java.util.TreeSet<java.lang.String>>[][]) strSetListArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]>> iterableArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.Iterable<java.util.TreeSet<java.lang.String>>[][]) strSetListArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList14 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, 1);
        java.lang.Class<?> wildcardClass15 = listArraySetList14.getClass();
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArraySetList4);
        org.junit.Assert.assertNotNull(listArraySetList6);
        org.junit.Assert.assertNotNull(collectionArraySetList8);
        org.junit.Assert.assertNotNull(iterableArraySetList10);
        org.junit.Assert.assertNotNull(iterableArraySetList12);
        org.junit.Assert.assertNotNull(listArraySetList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        com.thealgorithms.backtracking.Combination[][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 1);
        java.lang.Class<?> wildcardClass5 = combinationArraySetList4.getClass();
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNull(combinationArraySetList2);
        org.junit.Assert.assertNotNull(combinationArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        java.util.List[][][][][][] listArray1 = new java.util.List[0][][][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][]>> listArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][]>> listArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (-1));
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][]>> listArraySetList10 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (byte) 10);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][]>> listArraySetList12 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][]>> listArraySetList14 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) '#');
        java.lang.Class<?> wildcardClass15 = strSetListArray2.getClass();
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArraySetList4);
        org.junit.Assert.assertNotNull(listArraySetList6);
        org.junit.Assert.assertNotNull(listArraySetList8);
        org.junit.Assert.assertNotNull(listArraySetList10);
        org.junit.Assert.assertNull(listArraySetList12);
        org.junit.Assert.assertNotNull(listArraySetList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (-1));
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList14 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList16 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList18 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) ' ');
        java.lang.Class<?> wildcardClass19 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(genericDeclarationSetList6);
        org.junit.Assert.assertNotNull(typeDescriptorSetList8);
        org.junit.Assert.assertNull(genericDeclarationSetList10);
        org.junit.Assert.assertNotNull(wildcardClassSetList12);
        org.junit.Assert.assertNotNull(wildcardClassSetList14);
        org.junit.Assert.assertNotNull(wildcardClassSetList16);
        org.junit.Assert.assertNotNull(genericDeclarationSetList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class[][] classArray4 = new java.lang.Class[1][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray5 = (java.lang.Class<?>[][]) classArray4;
        wildcardClassArray5[0] = classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList9 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray5, 10);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList11 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray5, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[]>> ofFieldArraySetList13 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[][]) wildcardClassArray5, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[]>> ofFieldArraySetList15 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[][]) wildcardClassArray5, (int) (byte) 0);
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
        org.junit.Assert.assertNotNull(wildcardClassArraySetList11);
        org.junit.Assert.assertNotNull(ofFieldArraySetList13);
        org.junit.Assert.assertNull(ofFieldArraySetList15);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
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
        java.util.List<java.util.TreeSet<java.lang.reflect.Type>> typeSetList18 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[]) wildcardClassArray2, 1);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(genericDeclarationSetList6);
        org.junit.Assert.assertNotNull(annotatedElementSetList8);
        org.junit.Assert.assertNull(genericDeclarationSetList10);
        org.junit.Assert.assertNull(genericDeclarationSetList12);
        org.junit.Assert.assertNotNull(genericDeclarationSetList14);
        org.junit.Assert.assertNull(typeSetList16);
        org.junit.Assert.assertNotNull(typeSetList18);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        java.lang.String[][][][][] strArray0 = new java.lang.String[][][][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, 100);
        java.util.List<java.util.TreeSet<java.lang.String[][][][]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, 4);
        java.util.List<java.util.TreeSet<java.lang.String[][][][]>> strArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strArray0, 10);
        java.util.List<java.util.TreeSet<java.lang.String[][][][]>> strArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (short) -1);
        java.lang.Class<?> wildcardClass9 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNotNull(strArraySetList4);
        org.junit.Assert.assertNotNull(strArraySetList6);
        org.junit.Assert.assertNotNull(strArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        com.thealgorithms.backtracking.Combination[][][][][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (byte) 100);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 0);
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNotNull(combinationArraySetList2);
        org.junit.Assert.assertNull(combinationArraySetList4);
        org.junit.Assert.assertNull(combinationArraySetList6);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 4);
        java.lang.Class<?> wildcardClass9 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(genericDeclarationSetList6);
        org.junit.Assert.assertNotNull(wildcardClassSetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        java.lang.reflect.Type[] typeArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.reflect.Type>> typeSetList2 = com.thealgorithms.backtracking.Combination.combination(typeArray0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "", "" };
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList10 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray6, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList12 = com.thealgorithms.backtracking.Combination.combination(strArray6, 1);
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray6, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.lang.Object>> objSetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.Object[]) strArray6, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.Object>> objSetList18 = com.thealgorithms.backtracking.Combination.combination((java.lang.Object[]) strArray6, 3);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList20 = com.thealgorithms.backtracking.Combination.combination(strArray6, 5);
        java.lang.Class<?> wildcardClass21 = strSetList20.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strComparableSetList8);
        org.junit.Assert.assertNotNull(serializableSetList10);
        org.junit.Assert.assertNotNull(strSetList12);
        org.junit.Assert.assertNotNull(constantDescSetList14);
        org.junit.Assert.assertNotNull(objSetList16);
        org.junit.Assert.assertNotNull(objSetList18);
        org.junit.Assert.assertNotNull(strSetList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        java.lang.Class[][][][][][] classArray1 = new java.lang.Class[0][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 4);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) '4');
        java.lang.Class<?> wildcardClass9 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][]) wildcardClassArray2, 5);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][]) wildcardClassArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][]) wildcardClassArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList14 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (-1));
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, (-1));
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(typeArraySetList8);
        org.junit.Assert.assertNotNull(typeArraySetList10);
        org.junit.Assert.assertNotNull(typeArraySetList12);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList14);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList16);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable>> constableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[]) strArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList10 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) (short) 1);
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray2, (int) (short) 1);
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable>> constableSetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[]) strArray2, 5);
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList18 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 100);
        java.lang.Class<?> wildcardClass19 = charSequenceSetList18.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(charSequenceSetList6);
        org.junit.Assert.assertNotNull(constableSetList8);
        org.junit.Assert.assertNotNull(strSetList10);
        org.junit.Assert.assertNotNull(constantDescSetList12);
        org.junit.Assert.assertNotNull(constantDescSetList14);
        org.junit.Assert.assertNotNull(constableSetList16);
        org.junit.Assert.assertNotNull(charSequenceSetList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
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
        java.util.List<java.util.TreeSet<java.util.Collection[][]>> collectionArraySetList25 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][][]) strSetListArray15, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][]>> listArraySetList27 = com.thealgorithms.backtracking.Combination.combination(strSetListArray15, 4);
        java.lang.Class<?> wildcardClass28 = strSetListArray15.getClass();
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
        org.junit.Assert.assertNotNull(collectionArraySetList25);
        org.junit.Assert.assertNotNull(listArraySetList27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        com.thealgorithms.backtracking.Combination[][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][] combinationArray1 = new com.thealgorithms.backtracking.Combination[][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][] combinationArray2 = new com.thealgorithms.backtracking.Combination[][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][] combinationArray3 = new com.thealgorithms.backtracking.Combination[][][][][][][] { combinationArray0, combinationArray1, combinationArray2 };
        com.thealgorithms.backtracking.Combination[][][][][][][][] combinationArray4 = new com.thealgorithms.backtracking.Combination[][][][][][][][] { combinationArray3 };
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray4, (int) '4');
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][]>> combinationArraySetList8 = com.thealgorithms.backtracking.Combination.combination(combinationArray4, (int) (byte) 100);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][]>> combinationArraySetList10 = com.thealgorithms.backtracking.Combination.combination(combinationArray4, (int) (byte) 10);
        java.lang.Class<?> wildcardClass11 = combinationArraySetList10.getClass();
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNotNull(combinationArray1);
        org.junit.Assert.assertNotNull(combinationArray2);
        org.junit.Assert.assertNotNull(combinationArray3);
        org.junit.Assert.assertNotNull(combinationArray4);
        org.junit.Assert.assertNotNull(combinationArraySetList6);
        org.junit.Assert.assertNotNull(combinationArraySetList8);
        org.junit.Assert.assertNotNull(combinationArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        java.lang.Class[][][][][][] classArray1 = new java.lang.Class[0][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 4);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 100);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList10 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) wildcardClassArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][][][]>> genericDeclarationArraySetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][][][][]) wildcardClassArray2, 6);
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
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        java.lang.Class[][][][][][][][] classArray1 = new java.lang.Class[0][][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 2);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) -1);
        java.lang.Class<?> wildcardClass9 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
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
        java.util.List[][][][] listArray13 = new java.util.List[4][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][] strSetListArray14 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][]) listArray13;
        strSetListArray14[0] = strSetListArray2;
        strSetListArray14[1] = strSetListArray5;
        strSetListArray14[2] = strSetListArray8;
        strSetListArray14[3] = strSetListArray11;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][]>> listArraySetList24 = com.thealgorithms.backtracking.Combination.combination(strSetListArray14, 1);
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
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        java.util.Collection[] collectionArray1 = new java.util.Collection[0];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.util.TreeSet<java.lang.String>>[] strSetCollectionArray2 = (java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray1;
        java.util.List<java.util.TreeSet<java.util.Collection<java.util.TreeSet<java.lang.String>>>> setCollectionSetList4 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray1, (-1));
        java.util.List<java.util.TreeSet<java.util.Collection<java.util.TreeSet<java.lang.String>>>> setCollectionSetList6 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray1, (int) '4');
        java.util.List<java.util.TreeSet<java.util.Collection<java.util.TreeSet<java.lang.String>>>> setCollectionSetList8 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray1, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.util.Collection<java.util.TreeSet<java.lang.String>>>> setCollectionSetList10 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray1, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.util.Collection<java.util.TreeSet<java.lang.String>>>> setCollectionSetList12 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray1, (int) (short) 10);
        org.junit.Assert.assertNotNull(collectionArray1);
        org.junit.Assert.assertNotNull(strSetCollectionArray2);
        org.junit.Assert.assertNotNull(setCollectionSetList4);
        org.junit.Assert.assertNotNull(setCollectionSetList6);
        org.junit.Assert.assertNotNull(setCollectionSetList8);
        org.junit.Assert.assertNull(setCollectionSetList10);
        org.junit.Assert.assertNotNull(setCollectionSetList12);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        java.lang.String[][][][][][][][] strArray0 = new java.lang.String[][][][][][][][] {};
        java.lang.String[][][][][][][][] strArray1 = new java.lang.String[][][][][][][][] {};
        java.lang.String[][][][][][][][] strArray2 = new java.lang.String[][][][][][][][] {};
        java.lang.String[][][][][][][][] strArray3 = new java.lang.String[][][][][][][][] {};
        java.lang.String[][][][][][][][] strArray4 = new java.lang.String[][][][][][][][] {};
        java.lang.String[][][][][][][][][] strArray5 = new java.lang.String[][][][][][][][][] { strArray0, strArray1, strArray2, strArray3, strArray4 };
        java.lang.String[][][][][][][][] strArray6 = new java.lang.String[][][][][][][][] {};
        java.lang.String[][][][][][][][] strArray7 = new java.lang.String[][][][][][][][] {};
        java.lang.String[][][][][][][][] strArray8 = new java.lang.String[][][][][][][][] {};
        java.lang.String[][][][][][][][] strArray9 = new java.lang.String[][][][][][][][] {};
        java.lang.String[][][][][][][][] strArray10 = new java.lang.String[][][][][][][][] {};
        java.lang.String[][][][][][][][][] strArray11 = new java.lang.String[][][][][][][][][] { strArray6, strArray7, strArray8, strArray9, strArray10 };
        java.lang.String[][][][][][][][] strArray12 = new java.lang.String[][][][][][][][] {};
        java.lang.String[][][][][][][][] strArray13 = new java.lang.String[][][][][][][][] {};
        java.lang.String[][][][][][][][] strArray14 = new java.lang.String[][][][][][][][] {};
        java.lang.String[][][][][][][][] strArray15 = new java.lang.String[][][][][][][][] {};
        java.lang.String[][][][][][][][] strArray16 = new java.lang.String[][][][][][][][] {};
        java.lang.String[][][][][][][][][] strArray17 = new java.lang.String[][][][][][][][][] { strArray12, strArray13, strArray14, strArray15, strArray16 };
        java.lang.String[][][][][][][][] strArray18 = new java.lang.String[][][][][][][][] {};
        java.lang.String[][][][][][][][] strArray19 = new java.lang.String[][][][][][][][] {};
        java.lang.String[][][][][][][][] strArray20 = new java.lang.String[][][][][][][][] {};
        java.lang.String[][][][][][][][] strArray21 = new java.lang.String[][][][][][][][] {};
        java.lang.String[][][][][][][][] strArray22 = new java.lang.String[][][][][][][][] {};
        java.lang.String[][][][][][][][][] strArray23 = new java.lang.String[][][][][][][][][] { strArray18, strArray19, strArray20, strArray21, strArray22 };
        java.lang.String[][][][][][][][][][] strArray24 = new java.lang.String[][][][][][][][][][] { strArray5, strArray11, strArray17, strArray23 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][][]>> strArraySetList26 = com.thealgorithms.backtracking.Combination.combination(strArray24, (int) (byte) 10);
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
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray24);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 4);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) -1);
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNull(combinationArraySetList2);
        org.junit.Assert.assertNotNull(combinationArraySetList4);
        org.junit.Assert.assertNotNull(combinationArraySetList6);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 100);
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNull(combinationArraySetList2);
        org.junit.Assert.assertNotNull(combinationArraySetList4);
        org.junit.Assert.assertNotNull(combinationArraySetList6);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][]) wildcardClassArray2, 5);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, 2);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[]>> ofFieldArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[][]) wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, (int) (byte) 100);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(typeArraySetList8);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList10);
        org.junit.Assert.assertNotNull(ofFieldArraySetList12);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList14);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        java.util.Collection[][] collectionArray0 = new java.util.Collection[][] {};
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList2 = com.thealgorithms.backtracking.Combination.combination(collectionArray0, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList4 = com.thealgorithms.backtracking.Combination.combination(collectionArray0, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList6 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) collectionArray0, (int) '4');
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList8 = com.thealgorithms.backtracking.Combination.combination(collectionArray0, (int) '#');
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList10 = com.thealgorithms.backtracking.Combination.combination(collectionArray0, 10);
        java.lang.Class<?> wildcardClass11 = collectionArray0.getClass();
        org.junit.Assert.assertNotNull(collectionArray0);
        org.junit.Assert.assertNull(collectionArraySetList2);
        org.junit.Assert.assertNotNull(collectionArraySetList4);
        org.junit.Assert.assertNotNull(serializableSetList6);
        org.junit.Assert.assertNotNull(collectionArraySetList8);
        org.junit.Assert.assertNotNull(collectionArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        java.util.List[][] listArray1 = new java.util.List[0][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (-1));
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]>> iterableArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.Iterable<java.util.TreeSet<java.lang.String>>[][]) strSetListArray2, (-1));
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][]) strSetListArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]>> iterableArraySetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.Iterable<java.util.TreeSet<java.lang.String>>[][]) strSetListArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList16 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (byte) 10);
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList18 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][]) strSetListArray2, (int) (byte) 0);
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArraySetList4);
        org.junit.Assert.assertNotNull(listArraySetList6);
        org.junit.Assert.assertNotNull(listArraySetList8);
        org.junit.Assert.assertNotNull(iterableArraySetList10);
        org.junit.Assert.assertNotNull(collectionArraySetList12);
        org.junit.Assert.assertNotNull(iterableArraySetList14);
        org.junit.Assert.assertNotNull(listArraySetList16);
        org.junit.Assert.assertNull(collectionArraySetList18);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        com.thealgorithms.backtracking.Combination[][][][][][] combinationArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        java.lang.Class[][][] classArray1 = new java.lang.Class[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][] wildcardClassArray2 = (java.lang.Class<?>[][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][]>> genericDeclarationArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][]) wildcardClassArray2, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][]>> typeArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][]) wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][]>> typeArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][]) wildcardClassArray2, (int) (short) -1);
        java.lang.Class<?> wildcardClass13 = typeArraySetList12.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList8);
        org.junit.Assert.assertNotNull(typeArraySetList10);
        org.junit.Assert.assertNotNull(typeArraySetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        com.thealgorithms.backtracking.Combination[][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (byte) 1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) '4');
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 4);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][]>> combinationArraySetList8 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 2);
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNotNull(combinationArraySetList2);
        org.junit.Assert.assertNotNull(combinationArraySetList4);
        org.junit.Assert.assertNotNull(combinationArraySetList6);
        org.junit.Assert.assertNotNull(combinationArraySetList8);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray2, (int) (byte) 10);
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList14 = com.thealgorithms.backtracking.Combination.combination(strArray2, (-1));
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray2, 6);
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList18 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray2, (-1));
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList20 = com.thealgorithms.backtracking.Combination.combination(strArray2, 2);
        java.lang.Class<?> wildcardClass21 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(constantDescSetList6);
        org.junit.Assert.assertNull(charSequenceSetList8);
        org.junit.Assert.assertNotNull(strComparableSetList10);
        org.junit.Assert.assertNotNull(strComparableSetList12);
        org.junit.Assert.assertNotNull(strSetList14);
        org.junit.Assert.assertNotNull(constantDescSetList16);
        org.junit.Assert.assertNotNull(constantDescSetList18);
        org.junit.Assert.assertNotNull(strSetList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        com.thealgorithms.backtracking.Combination[][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (byte) 1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 100);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (byte) 100);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][]>> combinationArraySetList8 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 10);
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNotNull(combinationArraySetList2);
        org.junit.Assert.assertNotNull(combinationArraySetList4);
        org.junit.Assert.assertNotNull(combinationArraySetList6);
        org.junit.Assert.assertNotNull(combinationArraySetList8);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        com.thealgorithms.backtracking.Combination[][][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (byte) 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][]>> combinationArraySetList8 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 0);
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNotNull(combinationArraySetList2);
        org.junit.Assert.assertNotNull(combinationArraySetList4);
        org.junit.Assert.assertNull(combinationArraySetList6);
        org.junit.Assert.assertNull(combinationArraySetList8);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
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
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> wildcardClassOfFieldSetList18 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[]) wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList20 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, 5);
        java.lang.Class<?> wildcardClass21 = typeDescriptorSetList20.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(genericDeclarationSetList6);
        org.junit.Assert.assertNotNull(typeDescriptorSetList8);
        org.junit.Assert.assertNull(genericDeclarationSetList10);
        org.junit.Assert.assertNull(genericDeclarationSetList12);
        org.junit.Assert.assertNotNull(typeDescriptorSetList14);
        org.junit.Assert.assertNotNull(wildcardClassSetList16);
        org.junit.Assert.assertNotNull(wildcardClassOfFieldSetList18);
        org.junit.Assert.assertNotNull(typeDescriptorSetList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        com.thealgorithms.backtracking.Combination[][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) 'a');
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (byte) 1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][]>> combinationArraySetList8 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (-1));
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNull(combinationArraySetList2);
        org.junit.Assert.assertNotNull(combinationArraySetList4);
        org.junit.Assert.assertNotNull(combinationArraySetList6);
        org.junit.Assert.assertNotNull(combinationArraySetList8);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        java.lang.Class[][][][][][][][][] classArray1 = new java.lang.Class[0][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][][][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 2);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 5);
        java.lang.Class<?> wildcardClass7 = wildcardClassArraySetList6.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        java.util.List[][] listArray1 = new java.util.List[0][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (-1));
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][]) strSetListArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList10 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]>> iterableArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.Iterable<java.util.TreeSet<java.lang.String>>[][]) strSetListArray2, (-1));
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArraySetList4);
        org.junit.Assert.assertNotNull(listArraySetList6);
        org.junit.Assert.assertNotNull(collectionArraySetList8);
        org.junit.Assert.assertNotNull(listArraySetList10);
        org.junit.Assert.assertNotNull(iterableArraySetList12);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable>> constableSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[]) wildcardClassArray2, (int) (short) 1);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(genericDeclarationSetList6);
        org.junit.Assert.assertNotNull(typeDescriptorSetList8);
        org.junit.Assert.assertNotNull(genericDeclarationSetList10);
        org.junit.Assert.assertNotNull(genericDeclarationSetList12);
        org.junit.Assert.assertNotNull(constableSetList14);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        java.lang.Class[][][][][][] classArray1 = new java.lang.Class[0][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 4);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][][][]>> genericDeclarationArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][][][][]) wildcardClassArray2, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][][][]>> genericDeclarationArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][][][][]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][][][]>> genericDeclarationArraySetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][][][][]) wildcardClassArray2, 4);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList10);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList12);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList14);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> wildcardClassOfFieldSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[]) wildcardClassArray2, 2);
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 0);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(genericDeclarationSetList6);
        org.junit.Assert.assertNotNull(typeDescriptorSetList8);
        org.junit.Assert.assertNotNull(wildcardClassOfFieldSetList10);
        org.junit.Assert.assertNull(wildcardClassSetList12);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        java.lang.Class[][][] classArray1 = new java.lang.Class[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][] wildcardClassArray2 = (java.lang.Class<?>[][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][]>> typeArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][]) wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][]>> genericDeclarationArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList10 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][]>> typeArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][]) wildcardClassArray2, 4);
        java.lang.Class<?> wildcardClass13 = typeArraySetList12.getClass();
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
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        java.util.List[][] listArray1 = new java.util.List[0][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]>> iterableArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.Iterable<java.util.TreeSet<java.lang.String>>[][]) strSetListArray2, 2);
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][]) strSetListArray2, (-1));
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][]) strSetListArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][]) strSetListArray2, 100);
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList14 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][]) strSetListArray2, (int) (short) 100);
        java.lang.Class<?> wildcardClass15 = collectionArraySetList14.getClass();
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArraySetList4);
        org.junit.Assert.assertNotNull(iterableArraySetList6);
        org.junit.Assert.assertNotNull(collectionArraySetList8);
        org.junit.Assert.assertNull(collectionArraySetList10);
        org.junit.Assert.assertNotNull(collectionArraySetList12);
        org.junit.Assert.assertNotNull(collectionArraySetList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        java.lang.Class[][][][][][][][] classArray1 = new java.lang.Class[0][][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 2);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][]>> wildcardClassArraySetList10 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 6);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList10);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> wildcardClassOfFieldSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[]) wildcardClassArray2, (int) (short) 100);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(genericDeclarationSetList6);
        org.junit.Assert.assertNotNull(typeDescriptorSetList8);
        org.junit.Assert.assertNotNull(genericDeclarationSetList10);
        org.junit.Assert.assertNotNull(genericDeclarationSetList12);
        org.junit.Assert.assertNotNull(wildcardClassOfFieldSetList14);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        com.thealgorithms.backtracking.Combination[][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][] combinationArray1 = new com.thealgorithms.backtracking.Combination[][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][] combinationArray2 = new com.thealgorithms.backtracking.Combination[][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][] combinationArray3 = new com.thealgorithms.backtracking.Combination[][][][][][][] { combinationArray0, combinationArray1, combinationArray2 };
        com.thealgorithms.backtracking.Combination[][][][][][][][] combinationArray4 = new com.thealgorithms.backtracking.Combination[][][][][][][][] { combinationArray3 };
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray4, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][]>> combinationArraySetList8 = com.thealgorithms.backtracking.Combination.combination(combinationArray4, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNotNull(combinationArray1);
        org.junit.Assert.assertNotNull(combinationArray2);
        org.junit.Assert.assertNotNull(combinationArray3);
        org.junit.Assert.assertNotNull(combinationArray4);
        org.junit.Assert.assertNotNull(combinationArraySetList6);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        java.lang.Class[][][][] classArray1 = new java.lang.Class[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, (-1));
        java.lang.Class<?> wildcardClass15 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(typeArraySetList6);
        org.junit.Assert.assertNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(typeArraySetList10);
        org.junit.Assert.assertNotNull(typeArraySetList12);
        org.junit.Assert.assertNotNull(typeArraySetList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        java.lang.Class[][][][][][] classArray1 = new java.lang.Class[0][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 4);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][][][]>> genericDeclarationArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][][][][]) wildcardClassArray2, (int) (short) 100);
        java.lang.Class<?> wildcardClass11 = genericDeclarationArraySetList10.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        java.util.List[][][][][][][] listArray1 = new java.util.List[0][][][][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][]>> listArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][]>> listArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, 5);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][]>> listArraySetList10 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, 2);
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNull(listArraySetList4);
        org.junit.Assert.assertNotNull(listArraySetList6);
        org.junit.Assert.assertNotNull(listArraySetList8);
        org.junit.Assert.assertNotNull(listArraySetList10);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        java.util.List[][][][][] listArray1 = new java.util.List[0][][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][]>> listArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][]>> listArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][]>> listArraySetList10 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (-1));
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArraySetList4);
        org.junit.Assert.assertNotNull(listArraySetList6);
        org.junit.Assert.assertNotNull(listArraySetList8);
        org.junit.Assert.assertNotNull(listArraySetList10);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        java.util.List[][] listArray1 = new java.util.List[0][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (-1));
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][]) strSetListArray2, 5);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]>> iterableArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.Iterable<java.util.TreeSet<java.lang.String>>[][]) strSetListArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]>> iterableArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.Iterable<java.util.TreeSet<java.lang.String>>[][]) strSetListArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList14 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, 1);
        java.lang.Class<?> wildcardClass15 = strSetListArray2.getClass();
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArraySetList4);
        org.junit.Assert.assertNotNull(listArraySetList6);
        org.junit.Assert.assertNotNull(collectionArraySetList8);
        org.junit.Assert.assertNotNull(iterableArraySetList10);
        org.junit.Assert.assertNotNull(iterableArraySetList12);
        org.junit.Assert.assertNotNull(listArraySetList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 6);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) '#');
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][]>> combinationArraySetList8 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) '4');
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][]>> combinationArraySetList10 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) '#');
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
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.AnnotatedElement>> annotatedElementSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.AnnotatedElement[]) wildcardClassArray2, (int) (short) 100);
        java.lang.Class<?> wildcardClass15 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(genericDeclarationSetList6);
        org.junit.Assert.assertNotNull(typeDescriptorSetList8);
        org.junit.Assert.assertNull(genericDeclarationSetList10);
        org.junit.Assert.assertNull(genericDeclarationSetList12);
        org.junit.Assert.assertNotNull(annotatedElementSetList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNull(combinationArraySetList2);
        org.junit.Assert.assertNotNull(combinationArraySetList4);
        org.junit.Assert.assertNotNull(combinationArraySetList6);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> wildcardClassOfFieldSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[]) wildcardClassArray2, 2);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList14 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type>> typeSetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[]) wildcardClassArray2, 3);
        java.lang.Class<?> wildcardClass17 = typeSetList16.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(genericDeclarationSetList6);
        org.junit.Assert.assertNotNull(typeDescriptorSetList8);
        org.junit.Assert.assertNotNull(wildcardClassOfFieldSetList10);
        org.junit.Assert.assertNotNull(typeDescriptorSetList12);
        org.junit.Assert.assertNotNull(wildcardClassSetList14);
        org.junit.Assert.assertNotNull(typeSetList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        java.lang.Class[][][] classArray1 = new java.lang.Class[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][] wildcardClassArray2 = (java.lang.Class<?>[][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][]>> genericDeclarationArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][]) wildcardClassArray2, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][]>> genericDeclarationArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][]) wildcardClassArray2, (-1));
        java.lang.Class<?> wildcardClass11 = genericDeclarationArraySetList10.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList8);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray1 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray2 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray3 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray4 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray5 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][] combinationArray6 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][] { combinationArray0, combinationArray1, combinationArray2, combinationArray3, combinationArray4, combinationArray5 };
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][][] combinationArray7 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][][] { combinationArray6 };
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray8 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray9 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray10 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray11 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray12 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray13 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][] combinationArray14 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][] { combinationArray8, combinationArray9, combinationArray10, combinationArray11, combinationArray12, combinationArray13 };
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][][] combinationArray15 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][][] { combinationArray14 };
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray16 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray17 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray18 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray19 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray20 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray21 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][] combinationArray22 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][] { combinationArray16, combinationArray17, combinationArray18, combinationArray19, combinationArray20, combinationArray21 };
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][][] combinationArray23 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][][] { combinationArray22 };
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray24 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray25 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray26 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray27 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray28 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray29 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][] combinationArray30 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][] { combinationArray24, combinationArray25, combinationArray26, combinationArray27, combinationArray28, combinationArray29 };
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][][] combinationArray31 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][][] { combinationArray30 };
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray32 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray33 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray34 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray35 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray36 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray37 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][] combinationArray38 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][] { combinationArray32, combinationArray33, combinationArray34, combinationArray35, combinationArray36, combinationArray37 };
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][][] combinationArray39 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][][] { combinationArray38 };
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray40 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray41 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray42 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray43 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray44 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray45 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][] combinationArray46 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][] { combinationArray40, combinationArray41, combinationArray42, combinationArray43, combinationArray44, combinationArray45 };
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][][] combinationArray47 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][][] { combinationArray46 };
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][] combinationArray48 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][] { combinationArray7, combinationArray15, combinationArray23, combinationArray31, combinationArray39, combinationArray47 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][]>> combinationArraySetList50 = com.thealgorithms.backtracking.Combination.combination(combinationArray48, (int) (byte) -1);
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
        org.junit.Assert.assertNotNull(combinationArray7);
        org.junit.Assert.assertNotNull(combinationArray8);
        org.junit.Assert.assertNotNull(combinationArray9);
        org.junit.Assert.assertNotNull(combinationArray10);
        org.junit.Assert.assertNotNull(combinationArray11);
        org.junit.Assert.assertNotNull(combinationArray12);
        org.junit.Assert.assertNotNull(combinationArray13);
        org.junit.Assert.assertNotNull(combinationArray14);
        org.junit.Assert.assertNotNull(combinationArray15);
        org.junit.Assert.assertNotNull(combinationArray16);
        org.junit.Assert.assertNotNull(combinationArray17);
        org.junit.Assert.assertNotNull(combinationArray18);
        org.junit.Assert.assertNotNull(combinationArray19);
        org.junit.Assert.assertNotNull(combinationArray20);
        org.junit.Assert.assertNotNull(combinationArray21);
        org.junit.Assert.assertNotNull(combinationArray22);
        org.junit.Assert.assertNotNull(combinationArray23);
        org.junit.Assert.assertNotNull(combinationArray24);
        org.junit.Assert.assertNotNull(combinationArray25);
        org.junit.Assert.assertNotNull(combinationArray26);
        org.junit.Assert.assertNotNull(combinationArray27);
        org.junit.Assert.assertNotNull(combinationArray28);
        org.junit.Assert.assertNotNull(combinationArray29);
        org.junit.Assert.assertNotNull(combinationArray30);
        org.junit.Assert.assertNotNull(combinationArray31);
        org.junit.Assert.assertNotNull(combinationArray32);
        org.junit.Assert.assertNotNull(combinationArray33);
        org.junit.Assert.assertNotNull(combinationArray34);
        org.junit.Assert.assertNotNull(combinationArray35);
        org.junit.Assert.assertNotNull(combinationArray36);
        org.junit.Assert.assertNotNull(combinationArray37);
        org.junit.Assert.assertNotNull(combinationArray38);
        org.junit.Assert.assertNotNull(combinationArray39);
        org.junit.Assert.assertNotNull(combinationArray40);
        org.junit.Assert.assertNotNull(combinationArray41);
        org.junit.Assert.assertNotNull(combinationArray42);
        org.junit.Assert.assertNotNull(combinationArray43);
        org.junit.Assert.assertNotNull(combinationArray44);
        org.junit.Assert.assertNotNull(combinationArray45);
        org.junit.Assert.assertNotNull(combinationArray46);
        org.junit.Assert.assertNotNull(combinationArray47);
        org.junit.Assert.assertNotNull(combinationArray48);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.AnnotatedElement>> annotatedElementSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.AnnotatedElement[]) wildcardClassArray2, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> wildcardClassOfFieldSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.reflect.AnnotatedElement>> annotatedElementSetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.AnnotatedElement[]) wildcardClassArray2, (int) ' ');
        java.lang.Class<?> wildcardClass17 = annotatedElementSetList16.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNull(typeDescriptorSetList6);
        org.junit.Assert.assertNotNull(annotatedElementSetList8);
        org.junit.Assert.assertNotNull(typeDescriptorSetList10);
        org.junit.Assert.assertNotNull(genericDeclarationSetList12);
        org.junit.Assert.assertNotNull(wildcardClassOfFieldSetList14);
        org.junit.Assert.assertNotNull(annotatedElementSetList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList4 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray0, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strArray0, 0);
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strArray0, (-1));
        java.util.List<java.util.TreeSet<java.lang.CharSequence[]>> charSequenceArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[][]) strArray0, (-1));
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList12 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) '#');
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList14 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray0, 0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNull(serializableSetList4);
        org.junit.Assert.assertNull(strArraySetList6);
        org.junit.Assert.assertNotNull(strArraySetList8);
        org.junit.Assert.assertNotNull(charSequenceArraySetList10);
        org.junit.Assert.assertNotNull(strArraySetList12);
        org.junit.Assert.assertNull(serializableSetList14);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        java.lang.Class[][][] classArray1 = new java.lang.Class[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][] wildcardClassArray2 = (java.lang.Class<?>[][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][]>> genericDeclarationArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][]) wildcardClassArray2, (-1));
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][]>> genericDeclarationArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][]) wildcardClassArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList12 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) wildcardClassArray2, (int) (short) 100);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList10);
        org.junit.Assert.assertNotNull(serializableSetList12);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][]) wildcardClassArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList14 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) wildcardClassArray2, 2);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList6);
        org.junit.Assert.assertNotNull(constableArraySetList8);
        org.junit.Assert.assertNotNull(typeArraySetList10);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList12);
        org.junit.Assert.assertNotNull(serializableSetList14);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        java.lang.Class[][][] classArray1 = new java.lang.Class[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][] wildcardClassArray2 = (java.lang.Class<?>[][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][]>> typeArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][]) wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][]>> genericDeclarationArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][]) wildcardClassArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList10 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][]>> genericDeclarationArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][]) wildcardClassArray2, (int) (short) 0);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNull(typeArraySetList6);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList10);
        org.junit.Assert.assertNull(genericDeclarationArraySetList12);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        java.lang.Class[][][][][][][] classArray1 = new java.lang.Class[0][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.Object>> objSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.Object[]) wildcardClassArray2, 0);
        java.lang.Class<?> wildcardClass9 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNull(objSetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.AnnotatedElement>> annotatedElementSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.AnnotatedElement[]) wildcardClassArray2, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.reflect.Type>> typeSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[]) wildcardClassArray2, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList16 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.Object>> objSetList18 = com.thealgorithms.backtracking.Combination.combination((java.lang.Object[]) wildcardClassArray2, (int) (byte) -1);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNull(typeDescriptorSetList6);
        org.junit.Assert.assertNotNull(annotatedElementSetList8);
        org.junit.Assert.assertNotNull(typeDescriptorSetList10);
        org.junit.Assert.assertNotNull(genericDeclarationSetList12);
        org.junit.Assert.assertNotNull(typeSetList14);
        org.junit.Assert.assertNotNull(wildcardClassSetList16);
        org.junit.Assert.assertNotNull(objSetList18);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable>> constableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[]) strArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.Object>> objSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.Object[]) strArray2, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList12 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray2, (-1));
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(charSequenceSetList6);
        org.junit.Assert.assertNotNull(constableSetList8);
        org.junit.Assert.assertNull(objSetList10);
        org.junit.Assert.assertNotNull(strSetList12);
        org.junit.Assert.assertNotNull(strComparableSetList14);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        java.lang.Iterable[] iterableArray1 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.TreeSet<java.lang.String>>[] strSetIterableArray2 = (java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]) iterableArray1;
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList4 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList6 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.Object>> objSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.Object[]) strSetIterableArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList10 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList12 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, (int) (short) 100);
        org.junit.Assert.assertNotNull(iterableArray1);
        org.junit.Assert.assertNotNull(strSetIterableArray2);
        org.junit.Assert.assertNotNull(setIterableSetList4);
        org.junit.Assert.assertNull(setIterableSetList6);
        org.junit.Assert.assertNotNull(objSetList8);
        org.junit.Assert.assertNotNull(setIterableSetList10);
        org.junit.Assert.assertNotNull(setIterableSetList12);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        java.lang.Class[][][][] classArray1 = new java.lang.Class[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, (-1));
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][]>> genericDeclarationArraySetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][][]) wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList16 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 4);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][]>> genericDeclarationArraySetList18 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][][]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][]>> genericDeclarationArraySetList20 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][][]) wildcardClassArray2, (int) '4');
        java.lang.Class<?> wildcardClass21 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(typeArraySetList6);
        org.junit.Assert.assertNotNull(typeArraySetList8);
        org.junit.Assert.assertNotNull(typeArraySetList10);
        org.junit.Assert.assertNotNull(typeArraySetList12);
        org.junit.Assert.assertNull(genericDeclarationArraySetList14);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList16);
        org.junit.Assert.assertNull(genericDeclarationArraySetList18);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList4 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray0, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strArray0, 0);
        java.util.List<java.util.TreeSet<java.lang.CharSequence[]>> charSequenceArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[][]) strArray0, 0);
        java.util.List<java.util.TreeSet<java.lang.CharSequence[]>> charSequenceArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[][]) strArray0, 100);
        java.lang.Class<?> wildcardClass11 = charSequenceArraySetList10.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNull(serializableSetList4);
        org.junit.Assert.assertNull(strArraySetList6);
        org.junit.Assert.assertNull(charSequenceArraySetList8);
        org.junit.Assert.assertNotNull(charSequenceArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
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
        java.lang.Class<?> wildcardClass19 = wildcardClassArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList8 = com.thealgorithms.backtracking.Combination.combination(strArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList10 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 3);
        java.lang.Class<?> wildcardClass13 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(charSequenceSetList6);
        org.junit.Assert.assertNull(strSetList8);
        org.junit.Assert.assertNull(strSetList10);
        org.junit.Assert.assertNotNull(charSequenceSetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList8 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, (int) '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(constantDescSetList6);
        org.junit.Assert.assertNotNull(strSetList8);
        org.junit.Assert.assertNotNull(charSequenceSetList10);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList8 = com.thealgorithms.backtracking.Combination.combination(strArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList10 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 10);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(charSequenceSetList6);
        org.junit.Assert.assertNull(strSetList8);
        org.junit.Assert.assertNull(strSetList10);
        org.junit.Assert.assertNull(charSequenceSetList12);
        org.junit.Assert.assertNotNull(charSequenceSetList14);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type>> typeSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.AnnotatedElement>> annotatedElementSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.AnnotatedElement[]) wildcardClassArray2, (int) (short) 10);
        java.lang.Class<?> wildcardClass13 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(typeDescriptorSetList6);
        org.junit.Assert.assertNotNull(typeDescriptorSetList8);
        org.junit.Assert.assertNotNull(typeSetList10);
        org.junit.Assert.assertNotNull(annotatedElementSetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> wildcardClassOfFieldSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[]) wildcardClassArray2, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type>> typeSetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[]) wildcardClassArray2, (int) (byte) 10);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(genericDeclarationSetList6);
        org.junit.Assert.assertNotNull(typeDescriptorSetList8);
        org.junit.Assert.assertNotNull(genericDeclarationSetList10);
        org.junit.Assert.assertNotNull(genericDeclarationSetList12);
        org.junit.Assert.assertNull(wildcardClassOfFieldSetList14);
        org.junit.Assert.assertNotNull(typeSetList16);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.reflect.AnnotatedElement>> annotatedElementSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.AnnotatedElement[]) wildcardClassArray2, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.AnnotatedElement>> annotatedElementSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.AnnotatedElement[]) wildcardClassArray2, 0);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(typeDescriptorSetList6);
        org.junit.Assert.assertNotNull(genericDeclarationSetList8);
        org.junit.Assert.assertNotNull(annotatedElementSetList10);
        org.junit.Assert.assertNull(annotatedElementSetList12);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        com.thealgorithms.backtracking.Combination[][][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (byte) 10);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 10);
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNotNull(combinationArraySetList2);
        org.junit.Assert.assertNotNull(combinationArraySetList4);
        org.junit.Assert.assertNotNull(combinationArraySetList6);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        java.util.List[][][][][][][] listArray1 = new java.util.List[0][][][][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][]>> listArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][]>> listArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) '4');
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNull(listArraySetList4);
        org.junit.Assert.assertNotNull(listArraySetList6);
        org.junit.Assert.assertNotNull(listArraySetList8);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][]) wildcardClassArray2, 5);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][]) wildcardClassArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) wildcardClassArray2, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][]) wildcardClassArray2, (int) (short) 10);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(typeArraySetList8);
        org.junit.Assert.assertNotNull(typeArraySetList10);
        org.junit.Assert.assertNotNull(constableArraySetList12);
        org.junit.Assert.assertNotNull(typeArraySetList14);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
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
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][]>> listArraySetList25 = com.thealgorithms.backtracking.Combination.combination(strSetListArray15, 10);
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
        org.junit.Assert.assertNotNull(listArraySetList25);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        java.lang.Class[][][][][][] classArray1 = new java.lang.Class[0][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 5);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        com.thealgorithms.backtracking.Combination combination0 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination[] combinationArray1 = new com.thealgorithms.backtracking.Combination[] { combination0 };
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination>> combinationSetList3 = com.thealgorithms.backtracking.Combination.combination(combinationArray1, (int) (byte) 100);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination>> combinationSetList5 = com.thealgorithms.backtracking.Combination.combination(combinationArray1, (int) (byte) 100);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination>> combinationSetList7 = com.thealgorithms.backtracking.Combination.combination(combinationArray1, 2);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination>> combinationSetList9 = com.thealgorithms.backtracking.Combination.combination(combinationArray1, 4);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination>> combinationSetList11 = com.thealgorithms.backtracking.Combination.combination(combinationArray1, (int) (byte) 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination>> combinationSetList13 = com.thealgorithms.backtracking.Combination.combination(combinationArray1, (int) ' ');
        java.lang.Class<?> wildcardClass14 = combinationArray1.getClass();
        org.junit.Assert.assertNotNull(combinationArray1);
        org.junit.Assert.assertNotNull(combinationSetList3);
        org.junit.Assert.assertNotNull(combinationSetList5);
        org.junit.Assert.assertNotNull(combinationSetList7);
        org.junit.Assert.assertNotNull(combinationSetList9);
        org.junit.Assert.assertNull(combinationSetList11);
        org.junit.Assert.assertNotNull(combinationSetList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        java.lang.Class<?>[] wildcardClassArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList2 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        com.thealgorithms.backtracking.Combination[][][][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][] combinationArray1 = new com.thealgorithms.backtracking.Combination[][][][][][][][][] { combinationArray0 };
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][]>> combinationArraySetList3 = com.thealgorithms.backtracking.Combination.combination(combinationArray1, 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][]>> combinationArraySetList5 = com.thealgorithms.backtracking.Combination.combination(combinationArray1, 6);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][]>> combinationArraySetList7 = com.thealgorithms.backtracking.Combination.combination(combinationArray1, 4);
        java.lang.Class<?> wildcardClass8 = combinationArray1.getClass();
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNotNull(combinationArray1);
        org.junit.Assert.assertNull(combinationArraySetList3);
        org.junit.Assert.assertNotNull(combinationArraySetList5);
        org.junit.Assert.assertNotNull(combinationArraySetList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) wildcardClassArray2, (-1));
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][]) wildcardClassArray2, 6);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(constableArraySetList10);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList12);
        org.junit.Assert.assertNotNull(typeArraySetList14);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.AnnotatedElement>> annotatedElementSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.AnnotatedElement[]) wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList10 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = wildcardClassSetList10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(typeDescriptorSetList6);
        org.junit.Assert.assertNotNull(annotatedElementSetList8);
        org.junit.Assert.assertNull(wildcardClassSetList10);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        java.lang.Class[][][][][][][][][][][][] classArray1 = new java.lang.Class[0][][][][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][][][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][][][][][][][][]) classArray1;
        java.lang.Class[][][][][][][][][][][][] classArray4 = new java.lang.Class[0][][][][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][][][][][][] wildcardClassArray5 = (java.lang.Class<?>[][][][][][][][][][][][]) classArray4;
        java.lang.Class[][][][][][][][][][][][] classArray7 = new java.lang.Class[0][][][][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][][][][][][] wildcardClassArray8 = (java.lang.Class<?>[][][][][][][][][][][][]) classArray7;
        java.lang.Class[][][][][][][][][][][][][] classArray10 = new java.lang.Class[3][][][][][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][][][][][][][] wildcardClassArray11 = (java.lang.Class<?>[][][][][][][][][][][][][]) classArray10;
        wildcardClassArray11[0] = wildcardClassArray2;
        wildcardClassArray11[1] = wildcardClassArray5;
        wildcardClassArray11[2] = wildcardClassArray8;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][][][][][]>> wildcardClassArraySetList19 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray11, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(classArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        com.thealgorithms.backtracking.Combination combination0 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination1 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination2 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination3 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination[] combinationArray4 = new com.thealgorithms.backtracking.Combination[] { combination0, combination1, combination2, combination3 };
        com.thealgorithms.backtracking.Combination combination5 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination6 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination7 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination8 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination[] combinationArray9 = new com.thealgorithms.backtracking.Combination[] { combination5, combination6, combination7, combination8 };
        com.thealgorithms.backtracking.Combination combination10 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination11 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination12 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination13 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination[] combinationArray14 = new com.thealgorithms.backtracking.Combination[] { combination10, combination11, combination12, combination13 };
        com.thealgorithms.backtracking.Combination[][] combinationArray15 = new com.thealgorithms.backtracking.Combination[][] { combinationArray4, combinationArray9, combinationArray14 };
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[]>> combinationArraySetList17 = com.thealgorithms.backtracking.Combination.combination(combinationArray15, 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[]>> combinationArraySetList19 = com.thealgorithms.backtracking.Combination.combination(combinationArray15, 0);
        org.junit.Assert.assertNotNull(combinationArray4);
        org.junit.Assert.assertNotNull(combinationArray9);
        org.junit.Assert.assertNotNull(combinationArray14);
        org.junit.Assert.assertNotNull(combinationArray15);
        org.junit.Assert.assertNull(combinationArraySetList17);
        org.junit.Assert.assertNull(combinationArraySetList19);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray1 };
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.lang.String[][] strArray5 = new java.lang.String[][] { strArray4 };
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.lang.String[][] strArray8 = new java.lang.String[][] { strArray7 };
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        java.lang.String[][] strArray11 = new java.lang.String[][] { strArray10 };
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        java.lang.String[][] strArray14 = new java.lang.String[][] { strArray13 };
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        java.lang.String[][] strArray17 = new java.lang.String[][] { strArray16 };
        java.lang.String[][][] strArray18 = new java.lang.String[][][] { strArray2, strArray5, strArray8, strArray11, strArray14, strArray17 };
        java.lang.String[][][][] strArray19 = new java.lang.String[][][][] { strArray18 };
        java.util.List<java.util.TreeSet<java.lang.String[][][]>> strArraySetList21 = com.thealgorithms.backtracking.Combination.combination(strArray19, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.String[][][]>> strArraySetList23 = com.thealgorithms.backtracking.Combination.combination(strArray19, 4);
        java.util.List<java.util.TreeSet<java.lang.String[][][]>> strArraySetList25 = com.thealgorithms.backtracking.Combination.combination(strArray19, 5);
        java.util.List<java.util.TreeSet<java.lang.String[][][]>> strArraySetList27 = com.thealgorithms.backtracking.Combination.combination(strArray19, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.String[][][]>> strArraySetList29 = com.thealgorithms.backtracking.Combination.combination(strArray19, 0);
        java.lang.Class<?> wildcardClass30 = strArray19.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNull(strArraySetList21);
        org.junit.Assert.assertNotNull(strArraySetList23);
        org.junit.Assert.assertNotNull(strArraySetList25);
        org.junit.Assert.assertNotNull(strArraySetList27);
        org.junit.Assert.assertNull(strArraySetList29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        com.thealgorithms.backtracking.Combination[][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) ' ');
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (byte) 100);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) ' ');
        java.lang.Class<?> wildcardClass7 = combinationArraySetList6.getClass();
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNotNull(combinationArraySetList2);
        org.junit.Assert.assertNotNull(combinationArraySetList4);
        org.junit.Assert.assertNotNull(combinationArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
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
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.reflect.AnnotatedElement>> annotatedElementSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.AnnotatedElement[]) wildcardClassArray2, (int) (short) -1);
        java.lang.Class<?> wildcardClass11 = annotatedElementSetList10.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(typeDescriptorSetList6);
        org.junit.Assert.assertNotNull(typeDescriptorSetList8);
        org.junit.Assert.assertNotNull(annotatedElementSetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        java.lang.Class[][][] classArray1 = new java.lang.Class[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][] wildcardClassArray2 = (java.lang.Class<?>[][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][]>> typeArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][]) wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][]>> genericDeclarationArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][]>> genericDeclarationArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][]) wildcardClassArray2, 5);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNull(typeArraySetList6);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList8);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        com.thealgorithms.backtracking.Combination[][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) ' ');
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 5);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 5);
        java.lang.Class<?> wildcardClass7 = combinationArraySetList6.getClass();
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNotNull(combinationArraySetList2);
        org.junit.Assert.assertNotNull(combinationArraySetList4);
        org.junit.Assert.assertNotNull(combinationArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        java.util.List[] listArray1 = new java.util.List[0];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>>> setListSetList4 = com.thealgorithms.backtracking.Combination.combination((java.util.List<java.util.TreeSet<java.lang.String>>[]) listArray1, (int) (short) 1);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>>> setListSetList6 = com.thealgorithms.backtracking.Combination.combination((java.util.List<java.util.TreeSet<java.lang.String>>[]) listArray1, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>>> setListSetList8 = com.thealgorithms.backtracking.Combination.combination((java.util.List<java.util.TreeSet<java.lang.String>>[]) listArray1, 100);
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(setListSetList4);
        org.junit.Assert.assertNull(setListSetList6);
        org.junit.Assert.assertNotNull(setListSetList8);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        java.util.List[][] listArray1 = new java.util.List[0][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (-1));
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][]) strSetListArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList10 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, 3);
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][]) strSetListArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]>> iterableArraySetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.Iterable<java.util.TreeSet<java.lang.String>>[][]) strSetListArray2, (int) ' ');
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArraySetList4);
        org.junit.Assert.assertNotNull(listArraySetList6);
        org.junit.Assert.assertNotNull(collectionArraySetList8);
        org.junit.Assert.assertNotNull(listArraySetList10);
        org.junit.Assert.assertNotNull(collectionArraySetList12);
        org.junit.Assert.assertNotNull(iterableArraySetList14);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable>> constableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[]) strArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList10 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) (short) 1);
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray2, (int) (short) 1);
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList16 = com.thealgorithms.backtracking.Combination.combination(strArray2, 100);
        java.lang.Class<?> wildcardClass17 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(charSequenceSetList6);
        org.junit.Assert.assertNotNull(constableSetList8);
        org.junit.Assert.assertNotNull(strSetList10);
        org.junit.Assert.assertNotNull(constantDescSetList12);
        org.junit.Assert.assertNotNull(constantDescSetList14);
        org.junit.Assert.assertNotNull(strSetList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        com.thealgorithms.backtracking.Combination[][][][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][] combinationArray1 = new com.thealgorithms.backtracking.Combination[][][][][][][][][] { combinationArray0 };
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][]>> combinationArraySetList3 = com.thealgorithms.backtracking.Combination.combination(combinationArray1, 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][]>> combinationArraySetList5 = com.thealgorithms.backtracking.Combination.combination(combinationArray1, 6);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][]>> combinationArraySetList7 = com.thealgorithms.backtracking.Combination.combination(combinationArray1, (int) (byte) 100);
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNotNull(combinationArray1);
        org.junit.Assert.assertNull(combinationArraySetList3);
        org.junit.Assert.assertNotNull(combinationArraySetList5);
        org.junit.Assert.assertNotNull(combinationArraySetList7);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
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
        java.util.List<java.util.TreeSet<java.util.Collection<java.util.TreeSet<java.lang.String>>>> setCollectionSetList20 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection<java.util.TreeSet<java.lang.String>>[]) strSetListArray12, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList22 = com.thealgorithms.backtracking.Combination.combination((java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]) strSetListArray12, (int) (byte) -1);
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
        org.junit.Assert.assertNull(setCollectionSetList20);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        java.lang.Object[] objArray0 = null;
        java.util.List<java.util.TreeSet<java.lang.Object>> objSetList2 = com.thealgorithms.backtracking.Combination.combination(objArray0, (int) (byte) 0);
        org.junit.Assert.assertNull(objSetList2);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "", "" };
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList10 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray6, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList12 = com.thealgorithms.backtracking.Combination.combination(strArray6, 1);
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray6, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.lang.Object>> objSetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.Object[]) strArray6, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.Object>> objSetList18 = com.thealgorithms.backtracking.Combination.combination((java.lang.Object[]) strArray6, 3);
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList20 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, (int) (byte) 10);
        java.lang.Class<?> wildcardClass21 = strComparableSetList20.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strComparableSetList8);
        org.junit.Assert.assertNotNull(serializableSetList10);
        org.junit.Assert.assertNotNull(strSetList12);
        org.junit.Assert.assertNotNull(constantDescSetList14);
        org.junit.Assert.assertNotNull(objSetList16);
        org.junit.Assert.assertNotNull(objSetList18);
        org.junit.Assert.assertNotNull(strComparableSetList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        java.lang.String[][][][][][] strArray0 = new java.lang.String[][][][][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray0, (int) 'a');
        java.lang.Class<?> wildcardClass9 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNull(strArraySetList4);
        org.junit.Assert.assertNull(strArraySetList6);
        org.junit.Assert.assertNotNull(serializableSetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        java.lang.String[][][][][][][][] strArray0 = new java.lang.String[][][][][][][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNull(strArraySetList4);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.util.Collection[][]>> collectionArraySetList29 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][][]) strSetListArray15, (int) (byte) -1);
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
        org.junit.Assert.assertNotNull(listArraySetList21);
        org.junit.Assert.assertNull(collectionArraySetList23);
        org.junit.Assert.assertNull(listArraySetList25);
        org.junit.Assert.assertNotNull(collectionArraySetList27);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        java.util.List[][][][][][][] listArray1 = new java.util.List[0][][][][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][]>> listArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][]>> listArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, 5);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][]>> listArraySetList10 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][]>> listArraySetList12 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, 4);
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNull(listArraySetList4);
        org.junit.Assert.assertNotNull(listArraySetList6);
        org.junit.Assert.assertNotNull(listArraySetList8);
        org.junit.Assert.assertNotNull(listArraySetList10);
        org.junit.Assert.assertNotNull(listArraySetList12);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, (-1));
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) strArray0, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.CharSequence[]>> charSequenceArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[][]) strArray0, 1);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) strArray0, 10);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) strArray0, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList14 = com.thealgorithms.backtracking.Combination.combination(strArray0, 0);
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList16 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (short) -1);
        java.lang.Class<?> wildcardClass17 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNotNull(strArraySetList4);
        org.junit.Assert.assertNotNull(constableArraySetList6);
        org.junit.Assert.assertNotNull(charSequenceArraySetList8);
        org.junit.Assert.assertNotNull(constableArraySetList10);
        org.junit.Assert.assertNotNull(constableArraySetList12);
        org.junit.Assert.assertNull(strArraySetList14);
        org.junit.Assert.assertNotNull(strArraySetList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        java.lang.Class[][][][][] classArray1 = new java.lang.Class[0][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 10);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 0);
        java.lang.Class<?> wildcardClass9 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, (-1));
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[]>> ofFieldArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[][]) wildcardClassArray2, 0);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList10);
        org.junit.Assert.assertNull(ofFieldArraySetList12);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList4 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray0, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strArray0, 0);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) strArray0, (int) (short) 1);
        java.util.List<java.util.TreeSet<java.lang.CharSequence[]>> charSequenceArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[][]) strArray0, (int) (byte) 10);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) strArray0, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList14 = com.thealgorithms.backtracking.Combination.combination(strArray0, 100);
        java.lang.Class<?> wildcardClass15 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNull(serializableSetList4);
        org.junit.Assert.assertNull(strArraySetList6);
        org.junit.Assert.assertNotNull(constableArraySetList8);
        org.junit.Assert.assertNotNull(charSequenceArraySetList10);
        org.junit.Assert.assertNotNull(constableArraySetList12);
        org.junit.Assert.assertNotNull(strArraySetList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>>> setListSetList22 = com.thealgorithms.backtracking.Combination.combination(strSetListArray12, (int) (short) 1);
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
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        java.lang.Class[][][][][][][][][][][] classArray1 = new java.lang.Class[0][][][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][][][][][][][]) classArray1;
        java.lang.Class[][][][][][][][][][][] classArray4 = new java.lang.Class[0][][][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][][][][][] wildcardClassArray5 = (java.lang.Class<?>[][][][][][][][][][][]) classArray4;
        java.lang.Class[][][][][][][][][][][] classArray7 = new java.lang.Class[0][][][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][][][][][] wildcardClassArray8 = (java.lang.Class<?>[][][][][][][][][][][]) classArray7;
        java.lang.Class[][][][][][][][][][][] classArray10 = new java.lang.Class[0][][][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][][][][][] wildcardClassArray11 = (java.lang.Class<?>[][][][][][][][][][][]) classArray10;
        java.lang.Class[][][][][][][][][][][] classArray13 = new java.lang.Class[0][][][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][][][][][] wildcardClassArray14 = (java.lang.Class<?>[][][][][][][][][][][]) classArray13;
        java.lang.Class[][][][][][][][][][][] classArray16 = new java.lang.Class[0][][][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][][][][][] wildcardClassArray17 = (java.lang.Class<?>[][][][][][][][][][][]) classArray16;
        java.lang.Class[][][][][][][][][][][][] classArray19 = new java.lang.Class[6][][][][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][][][][][][] wildcardClassArray20 = (java.lang.Class<?>[][][][][][][][][][][][]) classArray19;
        wildcardClassArray20[0] = wildcardClassArray2;
        wildcardClassArray20[1] = wildcardClassArray5;
        wildcardClassArray20[2] = wildcardClassArray8;
        wildcardClassArray20[3] = wildcardClassArray11;
        wildcardClassArray20[4] = wildcardClassArray14;
        wildcardClassArray20[5] = wildcardClassArray17;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][][][][]>> wildcardClassArraySetList34 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray20, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][][][][]>> wildcardClassArraySetList36 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray20, 0);
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
        org.junit.Assert.assertNotNull(classArray19);
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertNull(wildcardClassArraySetList34);
        org.junit.Assert.assertNull(wildcardClassArraySetList36);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        java.lang.String[][][][][][][][] strArray0 = new java.lang.String[][][][][][][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (short) -1);
        java.lang.Class<?> wildcardClass5 = strArraySetList4.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNotNull(strArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        java.lang.Class[][][][][][][][][] classArray1 = new java.lang.Class[0][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][][][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 2);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][]>> wildcardClassArraySetList10 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 2);
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
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type>> typeSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, 0);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(typeDescriptorSetList6);
        org.junit.Assert.assertNotNull(typeDescriptorSetList8);
        org.junit.Assert.assertNotNull(typeSetList10);
        org.junit.Assert.assertNull(typeDescriptorSetList12);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        com.thealgorithms.backtracking.Combination[][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (byte) 1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 100);
        java.lang.Class<?> wildcardClass7 = combinationArraySetList6.getClass();
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNotNull(combinationArraySetList2);
        org.junit.Assert.assertNotNull(combinationArraySetList4);
        org.junit.Assert.assertNotNull(combinationArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        java.util.List[][] listArray1 = new java.util.List[0][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (-1));
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][]) strSetListArray2, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]>> iterableArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.Iterable<java.util.TreeSet<java.lang.String>>[][]) strSetListArray2, (int) '#');
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArraySetList4);
        org.junit.Assert.assertNotNull(listArraySetList6);
        org.junit.Assert.assertNull(collectionArraySetList8);
        org.junit.Assert.assertNotNull(iterableArraySetList10);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList4 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray0, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) strArray0, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) 10);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNull(serializableSetList4);
        org.junit.Assert.assertNotNull(constableArraySetList6);
        org.junit.Assert.assertNotNull(strArraySetList8);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        java.lang.Class[][][][][][] classArray1 = new java.lang.Class[0][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 0);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNull(wildcardClassArraySetList8);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (-1));
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList14 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.reflect.Type>> typeSetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[]) wildcardClassArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type>> typeSetList18 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[]) wildcardClassArray2, (int) (short) 0);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(genericDeclarationSetList6);
        org.junit.Assert.assertNotNull(typeDescriptorSetList8);
        org.junit.Assert.assertNull(genericDeclarationSetList10);
        org.junit.Assert.assertNotNull(wildcardClassSetList12);
        org.junit.Assert.assertNotNull(wildcardClassSetList14);
        org.junit.Assert.assertNotNull(typeSetList16);
        org.junit.Assert.assertNull(typeSetList18);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList4 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray0, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.CharSequence[]>> charSequenceArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[][]) strArray0, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) strArray0, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList10 = com.thealgorithms.backtracking.Combination.combination(strArray0, 0);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList12 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNull(serializableSetList4);
        org.junit.Assert.assertNull(charSequenceArraySetList6);
        org.junit.Assert.assertNotNull(constableArraySetList8);
        org.junit.Assert.assertNull(strArraySetList10);
        org.junit.Assert.assertNotNull(serializableSetList12);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        java.lang.Class[][][][][][] classArray1 = new java.lang.Class[0][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 4);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][][][]>> genericDeclarationArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][][][][]) wildcardClassArray2, (int) '4');
        java.lang.Class<?> wildcardClass11 = genericDeclarationArraySetList10.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        java.lang.String[][][][][][][][][] strArray0 = new java.lang.String[][][][][][][][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        com.thealgorithms.backtracking.Combination[][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) ' ');
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) -1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][]>> combinationArraySetList8 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) '#');
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][]>> combinationArraySetList10 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 2);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][]>> combinationArraySetList12 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 2);
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNotNull(combinationArraySetList2);
        org.junit.Assert.assertNotNull(combinationArraySetList4);
        org.junit.Assert.assertNotNull(combinationArraySetList6);
        org.junit.Assert.assertNotNull(combinationArraySetList8);
        org.junit.Assert.assertNotNull(combinationArraySetList10);
        org.junit.Assert.assertNotNull(combinationArraySetList12);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        com.thealgorithms.backtracking.Combination[][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (byte) 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][]>> combinationArraySetList8 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 100);
        java.lang.Class<?> wildcardClass9 = combinationArray0.getClass();
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNull(combinationArraySetList2);
        org.junit.Assert.assertNotNull(combinationArraySetList4);
        org.junit.Assert.assertNull(combinationArraySetList6);
        org.junit.Assert.assertNotNull(combinationArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        java.lang.Class[][][][][] classArray1 = new java.lang.Class[0][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 10);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList10 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList14 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList16 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) ' ');
        java.lang.Class<?> wildcardClass17 = wildcardClassArraySetList16.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList12);
        org.junit.Assert.assertNull(wildcardClassArraySetList14);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        java.lang.Class[][][][][] classArray1 = new java.lang.Class[0][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 10);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList10 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 5);
        java.lang.Class<?> wildcardClass11 = wildcardClassArraySetList10.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        com.thealgorithms.backtracking.Combination[][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) ' ');
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 5);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 5);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][]>> combinationArraySetList8 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) ' ');
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNotNull(combinationArraySetList2);
        org.junit.Assert.assertNotNull(combinationArraySetList4);
        org.junit.Assert.assertNotNull(combinationArraySetList6);
        org.junit.Assert.assertNotNull(combinationArraySetList8);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        java.lang.String[][][][][] strArray0 = new java.lang.String[][][][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, 100);
        java.util.List<java.util.TreeSet<java.lang.String[][][][]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, 4);
        java.util.List<java.util.TreeSet<java.lang.String[][][][]>> strArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strArray0, 1);
        java.util.List<java.util.TreeSet<java.lang.String[][][][]>> strArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.String[][][][]>> strArraySetList10 = com.thealgorithms.backtracking.Combination.combination(strArray0, 10);
        java.util.List<java.util.TreeSet<java.lang.String[][][][]>> strArraySetList12 = com.thealgorithms.backtracking.Combination.combination(strArray0, 3);
        java.util.List<java.util.TreeSet<java.lang.String[][][][]>> strArraySetList14 = com.thealgorithms.backtracking.Combination.combination(strArray0, 10);
        java.util.List<java.util.TreeSet<java.lang.String[][][][]>> strArraySetList16 = com.thealgorithms.backtracking.Combination.combination(strArray0, 100);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNotNull(strArraySetList4);
        org.junit.Assert.assertNotNull(strArraySetList6);
        org.junit.Assert.assertNull(strArraySetList8);
        org.junit.Assert.assertNotNull(strArraySetList10);
        org.junit.Assert.assertNotNull(strArraySetList12);
        org.junit.Assert.assertNotNull(strArraySetList14);
        org.junit.Assert.assertNotNull(strArraySetList16);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        com.thealgorithms.backtracking.Combination[][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 4);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][]>> combinationArraySetList8 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 5);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][]>> combinationArraySetList10 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNotNull(combinationArraySetList2);
        org.junit.Assert.assertNotNull(combinationArraySetList4);
        org.junit.Assert.assertNotNull(combinationArraySetList6);
        org.junit.Assert.assertNotNull(combinationArraySetList8);
        org.junit.Assert.assertNotNull(combinationArraySetList10);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray1 };
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.lang.String[][] strArray5 = new java.lang.String[][] { strArray4 };
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.lang.String[][] strArray8 = new java.lang.String[][] { strArray7 };
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        java.lang.String[][] strArray11 = new java.lang.String[][] { strArray10 };
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        java.lang.String[][] strArray14 = new java.lang.String[][] { strArray13 };
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        java.lang.String[][] strArray17 = new java.lang.String[][] { strArray16 };
        java.lang.String[][][] strArray18 = new java.lang.String[][][] { strArray2, strArray5, strArray8, strArray11, strArray14, strArray17 };
        java.lang.String[][][][] strArray19 = new java.lang.String[][][][] { strArray18 };
        java.util.List<java.util.TreeSet<java.lang.String[][][]>> strArraySetList21 = com.thealgorithms.backtracking.Combination.combination(strArray19, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.String[][][]>> strArraySetList23 = com.thealgorithms.backtracking.Combination.combination(strArray19, 4);
        java.util.List<java.util.TreeSet<java.lang.String[][][]>> strArraySetList25 = com.thealgorithms.backtracking.Combination.combination(strArray19, 5);
        java.util.List<java.util.TreeSet<java.lang.String[][][]>> strArraySetList27 = com.thealgorithms.backtracking.Combination.combination(strArray19, (int) ' ');
        java.lang.Class<?> wildcardClass28 = strArraySetList27.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNull(strArraySetList21);
        org.junit.Assert.assertNotNull(strArraySetList23);
        org.junit.Assert.assertNotNull(strArraySetList25);
        org.junit.Assert.assertNotNull(strArraySetList27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        com.thealgorithms.backtracking.Combination[][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 4);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][]>> combinationArraySetList8 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 5);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][]>> combinationArraySetList10 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 1);
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNotNull(combinationArraySetList2);
        org.junit.Assert.assertNotNull(combinationArraySetList4);
        org.junit.Assert.assertNotNull(combinationArraySetList6);
        org.junit.Assert.assertNotNull(combinationArraySetList8);
        org.junit.Assert.assertNotNull(combinationArraySetList10);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        java.lang.String[][][][][] strArray0 = new java.lang.String[][][][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, 100);
        java.util.List<java.util.TreeSet<java.lang.String[][][][]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, 4);
        java.util.List<java.util.TreeSet<java.lang.String[][][][]>> strArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strArray0, 1);
        java.util.List<java.util.TreeSet<java.lang.String[][][][]>> strArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.String[][][][]>> strArraySetList10 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.String[][][][]>> strArraySetList12 = com.thealgorithms.backtracking.Combination.combination(strArray0, 10);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNotNull(strArraySetList4);
        org.junit.Assert.assertNotNull(strArraySetList6);
        org.junit.Assert.assertNull(strArraySetList8);
        org.junit.Assert.assertNotNull(strArraySetList10);
        org.junit.Assert.assertNotNull(strArraySetList12);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        com.thealgorithms.backtracking.Combination[][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (byte) 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][]>> combinationArraySetList8 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 6);
        java.lang.Class<?> wildcardClass9 = combinationArraySetList8.getClass();
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNull(combinationArraySetList2);
        org.junit.Assert.assertNotNull(combinationArraySetList4);
        org.junit.Assert.assertNull(combinationArraySetList6);
        org.junit.Assert.assertNotNull(combinationArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        java.util.List[][] listArray1 = new java.util.List[0][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (-1));
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]>> iterableArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.Iterable<java.util.TreeSet<java.lang.String>>[][]) strSetListArray2, (-1));
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][]) strSetListArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList14 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]>> iterableArraySetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.Iterable<java.util.TreeSet<java.lang.String>>[][]) strSetListArray2, (int) 'a');
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArraySetList4);
        org.junit.Assert.assertNotNull(listArraySetList6);
        org.junit.Assert.assertNotNull(listArraySetList8);
        org.junit.Assert.assertNotNull(iterableArraySetList10);
        org.junit.Assert.assertNotNull(collectionArraySetList12);
        org.junit.Assert.assertNotNull(listArraySetList14);
        org.junit.Assert.assertNotNull(iterableArraySetList16);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        java.lang.String[][][][][][][][][] strArray0 = new java.lang.String[][][][][][][][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, 6);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][]>> strArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) '4');
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNotNull(strArraySetList4);
        org.junit.Assert.assertNotNull(strArraySetList6);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        java.util.List[][] listArray1 = new java.util.List[0][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (-1));
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]>> iterableArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.Iterable<java.util.TreeSet<java.lang.String>>[][]) strSetListArray2, (int) '4');
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][]) strSetListArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]>> iterableArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.Iterable<java.util.TreeSet<java.lang.String>>[][]) strSetListArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList14 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList16 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, 2);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]>> iterableArraySetList18 = com.thealgorithms.backtracking.Combination.combination((java.lang.Iterable<java.util.TreeSet<java.lang.String>>[][]) strSetListArray2, (-1));
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArraySetList4);
        org.junit.Assert.assertNotNull(listArraySetList6);
        org.junit.Assert.assertNotNull(iterableArraySetList8);
        org.junit.Assert.assertNotNull(collectionArraySetList10);
        org.junit.Assert.assertNotNull(iterableArraySetList12);
        org.junit.Assert.assertNotNull(listArraySetList14);
        org.junit.Assert.assertNotNull(listArraySetList16);
        org.junit.Assert.assertNotNull(iterableArraySetList18);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "", "" };
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList10 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray6, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList12 = com.thealgorithms.backtracking.Combination.combination(strArray6, 1);
        java.lang.String[] strArray19 = new java.lang.String[] { "", "", "", "", "", "" };
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList21 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray19, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList23 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray19, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList25 = com.thealgorithms.backtracking.Combination.combination(strArray19, 1);
        java.util.Collection[] collectionArray27 = new java.util.Collection[2];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.util.TreeSet<java.lang.String>>[] strSetCollectionArray28 = (java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray27;
        strSetCollectionArray28[0] = strSetList12;
        strSetCollectionArray28[1] = strSetList25;
        java.util.List<java.util.TreeSet<java.util.Collection<java.util.TreeSet<java.lang.String>>>> setCollectionSetList34 = com.thealgorithms.backtracking.Combination.combination(strSetCollectionArray28, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList36 = com.thealgorithms.backtracking.Combination.combination((java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]) strSetCollectionArray28, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strComparableSetList8);
        org.junit.Assert.assertNotNull(serializableSetList10);
        org.junit.Assert.assertNotNull(strSetList12);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strComparableSetList21);
        org.junit.Assert.assertNotNull(serializableSetList23);
        org.junit.Assert.assertNotNull(strSetList25);
        org.junit.Assert.assertNotNull(collectionArray27);
        org.junit.Assert.assertNotNull(strSetCollectionArray28);
        org.junit.Assert.assertNull(setCollectionSetList34);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 5);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) wildcardClassArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 10);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(constableArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList12);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        java.lang.String[][][][][][] strArray0 = new java.lang.String[][][][][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) 10);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (short) 10);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNull(strArraySetList4);
        org.junit.Assert.assertNotNull(strArraySetList6);
        org.junit.Assert.assertNotNull(strArraySetList8);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 6);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) '#');
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][]>> combinationArraySetList8 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) '4');
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][]>> combinationArraySetList10 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (-1));
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNull(combinationArraySetList2);
        org.junit.Assert.assertNotNull(combinationArraySetList4);
        org.junit.Assert.assertNotNull(combinationArraySetList6);
        org.junit.Assert.assertNotNull(combinationArraySetList8);
        org.junit.Assert.assertNotNull(combinationArraySetList10);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        java.lang.String[][][][][][][][] strArray0 = new java.lang.String[][][][][][][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][]>> strArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][]>> strArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strArray0, 10);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][]>> strArraySetList10 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) 'a');
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNotNull(strArraySetList4);
        org.junit.Assert.assertNotNull(strArraySetList6);
        org.junit.Assert.assertNotNull(strArraySetList8);
        org.junit.Assert.assertNotNull(strArraySetList10);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
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
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][]>> listArraySetList27 = com.thealgorithms.backtracking.Combination.combination(strSetListArray15, (int) (short) 100);
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
        org.junit.Assert.assertNotNull(listArraySetList27);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        java.lang.Class[][][][][][][][][] classArray1 = new java.lang.Class[0][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][][][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 2);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][]>> wildcardClassArraySetList10 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 2);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][]>> wildcardClassArraySetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 5);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList12);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>>> setListSetList20 = com.thealgorithms.backtracking.Combination.combination(strSetListArray12, (int) (short) -1);
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
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        java.lang.String[][][][][][][][][][] strArray0 = null;
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, 0);
        org.junit.Assert.assertNull(strArraySetList2);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        java.lang.String[][][][][][] strArray0 = new java.lang.String[][][][][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList10 = com.thealgorithms.backtracking.Combination.combination(strArray0, (-1));
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNull(strArraySetList4);
        org.junit.Assert.assertNull(strArraySetList6);
        org.junit.Assert.assertNull(strArraySetList8);
        org.junit.Assert.assertNotNull(strArraySetList10);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        java.lang.Class[][][][] classArray1 = new java.lang.Class[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) '#');
        java.lang.Class<?> wildcardClass9 = wildcardClassArraySetList8.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNull(typeArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
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
        java.lang.Class<?> wildcardClass21 = wildcardClassSetList20.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 0);
        java.lang.Class<?> wildcardClass5 = combinationArray0.getClass();
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNull(combinationArraySetList2);
        org.junit.Assert.assertNull(combinationArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        java.lang.Class[][][][] classArray1 = new java.lang.Class[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, (-1));
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 2);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][]>> genericDeclarationArraySetList18 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][][]) wildcardClassArray2, (int) (short) 10);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(typeArraySetList6);
        org.junit.Assert.assertNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(typeArraySetList10);
        org.junit.Assert.assertNotNull(typeArraySetList12);
        org.junit.Assert.assertNotNull(typeArraySetList14);
        org.junit.Assert.assertNotNull(typeArraySetList16);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList18);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
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
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList18 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (short) 0);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(genericDeclarationSetList6);
        org.junit.Assert.assertNotNull(typeDescriptorSetList8);
        org.junit.Assert.assertNull(genericDeclarationSetList10);
        org.junit.Assert.assertNull(genericDeclarationSetList12);
        org.junit.Assert.assertNotNull(typeDescriptorSetList14);
        org.junit.Assert.assertNotNull(wildcardClassSetList16);
        org.junit.Assert.assertNull(genericDeclarationSetList18);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, (-1));
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) strArray0, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.CharSequence[]>> charSequenceArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[][]) strArray0, 1);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) strArray0, 10);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) strArray0, 1);
        java.util.List<java.util.TreeSet<java.lang.CharSequence[]>> charSequenceArraySetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[][]) strArray0, (int) '4');
        java.lang.Class<?> wildcardClass15 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNotNull(strArraySetList4);
        org.junit.Assert.assertNotNull(constableArraySetList6);
        org.junit.Assert.assertNotNull(charSequenceArraySetList8);
        org.junit.Assert.assertNotNull(constableArraySetList10);
        org.junit.Assert.assertNotNull(constableArraySetList12);
        org.junit.Assert.assertNotNull(charSequenceArraySetList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        java.lang.Class[][][][] classArray1 = new java.lang.Class[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 5);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][]>> genericDeclarationArraySetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][][]) wildcardClassArray2, (int) '4');
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(typeArraySetList6);
        org.junit.Assert.assertNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNull(typeArraySetList10);
        org.junit.Assert.assertNotNull(typeArraySetList12);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList14);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        java.util.List[][][][][] listArray1 = new java.util.List[0][][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][]>> listArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][]>> listArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) 1);
        java.lang.Class<?> wildcardClass9 = strSetListArray2.getClass();
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArraySetList4);
        org.junit.Assert.assertNotNull(listArraySetList6);
        org.junit.Assert.assertNotNull(listArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        java.lang.Class[][][] classArray1 = new java.lang.Class[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][] wildcardClassArray2 = (java.lang.Class<?>[][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList10 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 6);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][]>> typeArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][]) wildcardClassArray2, 1);
        java.lang.Class<?> wildcardClass13 = typeArraySetList12.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList10);
        org.junit.Assert.assertNotNull(typeArraySetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][]) wildcardClassArray2, 5);
        java.util.List<java.util.TreeSet<java.lang.Object>> objSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.Object[]) wildcardClassArray2, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][]) wildcardClassArray2, 100);
        java.lang.Class<?> wildcardClass17 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(typeArraySetList6);
        org.junit.Assert.assertNull(objSetList8);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList10);
        org.junit.Assert.assertNull(constableArraySetList12);
        org.junit.Assert.assertNotNull(constableArraySetList14);
        org.junit.Assert.assertNotNull(typeArraySetList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        com.thealgorithms.backtracking.Combination combination0 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination[] combinationArray1 = new com.thealgorithms.backtracking.Combination[] { combination0 };
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination>> combinationSetList3 = com.thealgorithms.backtracking.Combination.combination(combinationArray1, (int) (byte) 100);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination>> combinationSetList5 = com.thealgorithms.backtracking.Combination.combination(combinationArray1, (int) (byte) 100);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination>> combinationSetList7 = com.thealgorithms.backtracking.Combination.combination(combinationArray1, 2);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination>> combinationSetList9 = com.thealgorithms.backtracking.Combination.combination(combinationArray1, 4);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination>> combinationSetList11 = com.thealgorithms.backtracking.Combination.combination(combinationArray1, 10);
        java.lang.Class<?> wildcardClass12 = combinationArray1.getClass();
        org.junit.Assert.assertNotNull(combinationArray1);
        org.junit.Assert.assertNotNull(combinationSetList3);
        org.junit.Assert.assertNotNull(combinationSetList5);
        org.junit.Assert.assertNotNull(combinationSetList7);
        org.junit.Assert.assertNotNull(combinationSetList9);
        org.junit.Assert.assertNotNull(combinationSetList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        com.thealgorithms.backtracking.Combination combination0 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination1 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination2 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination3 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination[] combinationArray4 = new com.thealgorithms.backtracking.Combination[] { combination0, combination1, combination2, combination3 };
        com.thealgorithms.backtracking.Combination combination5 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination6 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination7 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination8 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination[] combinationArray9 = new com.thealgorithms.backtracking.Combination[] { combination5, combination6, combination7, combination8 };
        com.thealgorithms.backtracking.Combination combination10 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination11 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination12 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination13 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination[] combinationArray14 = new com.thealgorithms.backtracking.Combination[] { combination10, combination11, combination12, combination13 };
        com.thealgorithms.backtracking.Combination[][] combinationArray15 = new com.thealgorithms.backtracking.Combination[][] { combinationArray4, combinationArray9, combinationArray14 };
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[]>> combinationArraySetList17 = com.thealgorithms.backtracking.Combination.combination(combinationArray15, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[]>> combinationArraySetList19 = com.thealgorithms.backtracking.Combination.combination(combinationArray15, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(combinationArray4);
        org.junit.Assert.assertNotNull(combinationArray9);
        org.junit.Assert.assertNotNull(combinationArray14);
        org.junit.Assert.assertNotNull(combinationArray15);
        org.junit.Assert.assertNull(combinationArraySetList17);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        java.lang.String[][][][][][][][] strArray0 = new java.lang.String[][][][][][][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][][]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, 1);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNotNull(strArraySetList4);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> wildcardClassOfFieldSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[]) wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type>> typeSetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[]) wildcardClassArray2, (-1));
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(typeDescriptorSetList6);
        org.junit.Assert.assertNotNull(typeDescriptorSetList8);
        org.junit.Assert.assertNotNull(wildcardClassOfFieldSetList10);
        org.junit.Assert.assertNull(wildcardClassSetList12);
        org.junit.Assert.assertNotNull(genericDeclarationSetList14);
        org.junit.Assert.assertNotNull(typeSetList16);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        java.lang.Class[][][][][][][] classArray1 = new java.lang.Class[0][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][]>> wildcardClassArraySetList10 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][]>> wildcardClassArraySetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 10);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList12);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        java.lang.Class[][][][][][][][][][][] classArray1 = new java.lang.Class[0][][][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][][][][][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 5);
        java.lang.Class<?> wildcardClass5 = wildcardClassArraySetList4.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.lang.String[][][] strArray1 = new java.lang.String[][][] { strArray0 };
        java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList3 = com.thealgorithms.backtracking.Combination.combination(strArray1, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList5 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray1, 0);
        java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList7 = com.thealgorithms.backtracking.Combination.combination(strArray1, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList9 = com.thealgorithms.backtracking.Combination.combination(strArray1, 0);
        java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList11 = com.thealgorithms.backtracking.Combination.combination(strArray1, 0);
        java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList13 = com.thealgorithms.backtracking.Combination.combination(strArray1, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList15 = com.thealgorithms.backtracking.Combination.combination(strArray1, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList17 = com.thealgorithms.backtracking.Combination.combination(strArray1, (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArraySetList3);
        org.junit.Assert.assertNull(serializableSetList5);
        org.junit.Assert.assertNotNull(strArraySetList7);
        org.junit.Assert.assertNull(strArraySetList9);
        org.junit.Assert.assertNull(strArraySetList11);
        org.junit.Assert.assertNotNull(strArraySetList13);
        org.junit.Assert.assertNotNull(strArraySetList15);
        org.junit.Assert.assertNull(strArraySetList17);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        java.lang.Class<?>[][][][][][][][][] wildcardClassArray0 = null;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][]>> wildcardClassArraySetList2 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray0, 0);
        org.junit.Assert.assertNull(wildcardClassArraySetList2);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        java.lang.Class[][][][] classArray1 = new java.lang.Class[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (-1));
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][]>> genericDeclarationArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][][]) wildcardClassArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 10);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = typeArraySetList14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(typeArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList12);
        org.junit.Assert.assertNull(typeArraySetList14);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 6);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) '#');
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][]>> combinationArraySetList8 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 6);
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNull(combinationArraySetList2);
        org.junit.Assert.assertNotNull(combinationArraySetList4);
        org.junit.Assert.assertNotNull(combinationArraySetList6);
        org.junit.Assert.assertNotNull(combinationArraySetList8);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.lang.String[][][] strArray1 = new java.lang.String[][][] { strArray0 };
        java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList3 = com.thealgorithms.backtracking.Combination.combination(strArray1, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList5 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray1, 0);
        java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList7 = com.thealgorithms.backtracking.Combination.combination(strArray1, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList9 = com.thealgorithms.backtracking.Combination.combination(strArray1, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList11 = com.thealgorithms.backtracking.Combination.combination(strArray1, 5);
        java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList13 = com.thealgorithms.backtracking.Combination.combination(strArray1, (int) (short) 100);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArraySetList3);
        org.junit.Assert.assertNull(serializableSetList5);
        org.junit.Assert.assertNotNull(strArraySetList7);
        org.junit.Assert.assertNull(strArraySetList9);
        org.junit.Assert.assertNotNull(strArraySetList11);
        org.junit.Assert.assertNotNull(strArraySetList13);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        java.lang.String[][][][][][] strArray0 = new java.lang.String[][][][][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strArray0, 10);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strArray0, 0);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList10 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (short) 100);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNull(strArraySetList4);
        org.junit.Assert.assertNotNull(strArraySetList6);
        org.junit.Assert.assertNull(strArraySetList8);
        org.junit.Assert.assertNotNull(strArraySetList10);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
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
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> wildcardClassOfFieldSetList18 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[]) wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList20 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList22 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList24 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (short) 1);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(genericDeclarationSetList6);
        org.junit.Assert.assertNotNull(typeDescriptorSetList8);
        org.junit.Assert.assertNull(genericDeclarationSetList10);
        org.junit.Assert.assertNull(genericDeclarationSetList12);
        org.junit.Assert.assertNotNull(typeDescriptorSetList14);
        org.junit.Assert.assertNotNull(wildcardClassSetList16);
        org.junit.Assert.assertNotNull(wildcardClassOfFieldSetList18);
        org.junit.Assert.assertNotNull(typeDescriptorSetList20);
        org.junit.Assert.assertNotNull(wildcardClassSetList22);
        org.junit.Assert.assertNotNull(typeDescriptorSetList24);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> wildcardClassOfFieldSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[]) wildcardClassArray2, 2);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, 2);
        java.util.List<java.util.TreeSet<java.lang.reflect.AnnotatedElement>> annotatedElementSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.AnnotatedElement[]) wildcardClassArray2, 5);
        java.lang.Class<?> wildcardClass15 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(genericDeclarationSetList6);
        org.junit.Assert.assertNotNull(typeDescriptorSetList8);
        org.junit.Assert.assertNotNull(wildcardClassOfFieldSetList10);
        org.junit.Assert.assertNotNull(typeDescriptorSetList12);
        org.junit.Assert.assertNotNull(annotatedElementSetList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        com.thealgorithms.backtracking.Combination combination0 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination[] combinationArray1 = new com.thealgorithms.backtracking.Combination[] { combination0 };
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination>> combinationSetList3 = com.thealgorithms.backtracking.Combination.combination(combinationArray1, (int) (byte) 100);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination>> combinationSetList5 = com.thealgorithms.backtracking.Combination.combination(combinationArray1, (int) (byte) 100);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination>> combinationSetList7 = com.thealgorithms.backtracking.Combination.combination(combinationArray1, 2);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination>> combinationSetList9 = com.thealgorithms.backtracking.Combination.combination(combinationArray1, 4);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination>> combinationSetList11 = com.thealgorithms.backtracking.Combination.combination(combinationArray1, 0);
        org.junit.Assert.assertNotNull(combinationArray1);
        org.junit.Assert.assertNotNull(combinationSetList3);
        org.junit.Assert.assertNotNull(combinationSetList5);
        org.junit.Assert.assertNotNull(combinationSetList7);
        org.junit.Assert.assertNotNull(combinationSetList9);
        org.junit.Assert.assertNull(combinationSetList11);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        java.lang.Class[][][][][] classArray1 = new java.lang.Class[0][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 10);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList10 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) '4');
        java.lang.Class<?> wildcardClass11 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        java.util.List[] listArray1 = new java.util.List[0];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>>> setListSetList4 = com.thealgorithms.backtracking.Combination.combination((java.util.List<java.util.TreeSet<java.lang.String>>[]) listArray1, (int) (short) 1);
        java.lang.Class<?> wildcardClass5 = setListSetList4.getClass();
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(setListSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        java.lang.String[][][][][] strArray0 = new java.lang.String[][][][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, 100);
        java.util.List<java.util.TreeSet<java.lang.String[][][][]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, 4);
        java.util.List<java.util.TreeSet<java.lang.String[][][][]>> strArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strArray0, 10);
        java.util.List<java.util.TreeSet<java.lang.String[][][][]>> strArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.lang.String[][][][]>> strArraySetList10 = com.thealgorithms.backtracking.Combination.combination(strArray0, 100);
        java.lang.Class<?> wildcardClass11 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNotNull(strArraySetList4);
        org.junit.Assert.assertNotNull(strArraySetList6);
        org.junit.Assert.assertNotNull(strArraySetList8);
        org.junit.Assert.assertNotNull(strArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        java.lang.Class[][][][][][][][][] classArray1 = new java.lang.Class[0][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][][][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 2);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 10);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][]>> wildcardClassArraySetList10 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (-1));
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList10);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        java.lang.Class[][][][][] classArray1 = new java.lang.Class[0][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 10);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (-1));
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][][]>> genericDeclarationArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][][][]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][][]>> genericDeclarationArraySetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][][][]) wildcardClassArray2, (int) (byte) 100);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNull(genericDeclarationArraySetList10);
        org.junit.Assert.assertNull(wildcardClassArraySetList12);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList14);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        com.thealgorithms.backtracking.Combination[][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (byte) 1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][]>> combinationArraySetList8 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) '4');
        java.lang.Class<?> wildcardClass9 = combinationArray0.getClass();
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNotNull(combinationArraySetList2);
        org.junit.Assert.assertNotNull(combinationArraySetList4);
        org.junit.Assert.assertNull(combinationArraySetList6);
        org.junit.Assert.assertNotNull(combinationArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        com.thealgorithms.backtracking.Combination[][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (-1));
        java.lang.Class<?> wildcardClass5 = combinationArraySetList4.getClass();
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNotNull(combinationArraySetList2);
        org.junit.Assert.assertNotNull(combinationArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        java.util.List[][][][][][][][] listArray1 = new java.util.List[0][][][][][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, 0);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][]>> listArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, 6);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][]>> listArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][]>> listArraySetList10 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (byte) 10);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][]>> listArraySetList12 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) 0);
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNull(listArraySetList4);
        org.junit.Assert.assertNotNull(listArraySetList6);
        org.junit.Assert.assertNotNull(listArraySetList8);
        org.junit.Assert.assertNotNull(listArraySetList10);
        org.junit.Assert.assertNull(listArraySetList12);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        java.lang.Class[][][][][][] classArray1 = new java.lang.Class[0][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 4);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList10 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (-1));
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList14 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 0);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList12);
        org.junit.Assert.assertNull(wildcardClassArraySetList14);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        java.lang.String[][][][][][][] strArray0 = new java.lang.String[][][][][][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][]>> strArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (short) 100);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNotNull(strArraySetList4);
        org.junit.Assert.assertNotNull(strArraySetList6);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        java.lang.String[][][] strArray0 = new java.lang.String[][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, 3);
        java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strArray0, 2);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNotNull(strArraySetList4);
        org.junit.Assert.assertNotNull(strArraySetList6);
        org.junit.Assert.assertNotNull(strArraySetList8);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
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
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList20 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList22 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.reflect.AnnotatedElement>> annotatedElementSetList24 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.AnnotatedElement[]) wildcardClassArray2, 5);
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
        org.junit.Assert.assertNotNull(typeDescriptorSetList22);
        org.junit.Assert.assertNotNull(annotatedElementSetList24);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList10 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.reflect.AnnotatedElement>> annotatedElementSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.AnnotatedElement[]) wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> wildcardClassOfFieldSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[]) wildcardClassArray2, (int) (short) 1);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(typeDescriptorSetList6);
        org.junit.Assert.assertNull(genericDeclarationSetList8);
        org.junit.Assert.assertNotNull(serializableSetList10);
        org.junit.Assert.assertNotNull(annotatedElementSetList12);
        org.junit.Assert.assertNotNull(wildcardClassOfFieldSetList14);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        java.lang.String[][][] strArray0 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray1 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray2 = new java.lang.String[][][] {};
        java.lang.String[][][][] strArray3 = new java.lang.String[][][][] { strArray0, strArray1, strArray2 };
        java.lang.String[][][][][] strArray4 = new java.lang.String[][][][][] { strArray3 };
        java.lang.String[][][] strArray5 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray6 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray7 = new java.lang.String[][][] {};
        java.lang.String[][][][] strArray8 = new java.lang.String[][][][] { strArray5, strArray6, strArray7 };
        java.lang.String[][][][][] strArray9 = new java.lang.String[][][][][] { strArray8 };
        java.lang.String[][][] strArray10 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray11 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray12 = new java.lang.String[][][] {};
        java.lang.String[][][][] strArray13 = new java.lang.String[][][][] { strArray10, strArray11, strArray12 };
        java.lang.String[][][][][] strArray14 = new java.lang.String[][][][][] { strArray13 };
        java.lang.String[][][] strArray15 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray16 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray17 = new java.lang.String[][][] {};
        java.lang.String[][][][] strArray18 = new java.lang.String[][][][] { strArray15, strArray16, strArray17 };
        java.lang.String[][][][][] strArray19 = new java.lang.String[][][][][] { strArray18 };
        java.lang.String[][][][][][] strArray20 = new java.lang.String[][][][][][] { strArray4, strArray9, strArray14, strArray19 };
        java.lang.String[][][] strArray21 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray22 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray23 = new java.lang.String[][][] {};
        java.lang.String[][][][] strArray24 = new java.lang.String[][][][] { strArray21, strArray22, strArray23 };
        java.lang.String[][][][][] strArray25 = new java.lang.String[][][][][] { strArray24 };
        java.lang.String[][][] strArray26 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray27 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray28 = new java.lang.String[][][] {};
        java.lang.String[][][][] strArray29 = new java.lang.String[][][][] { strArray26, strArray27, strArray28 };
        java.lang.String[][][][][] strArray30 = new java.lang.String[][][][][] { strArray29 };
        java.lang.String[][][] strArray31 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray32 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray33 = new java.lang.String[][][] {};
        java.lang.String[][][][] strArray34 = new java.lang.String[][][][] { strArray31, strArray32, strArray33 };
        java.lang.String[][][][][] strArray35 = new java.lang.String[][][][][] { strArray34 };
        java.lang.String[][][] strArray36 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray37 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray38 = new java.lang.String[][][] {};
        java.lang.String[][][][] strArray39 = new java.lang.String[][][][] { strArray36, strArray37, strArray38 };
        java.lang.String[][][][][] strArray40 = new java.lang.String[][][][][] { strArray39 };
        java.lang.String[][][][][][] strArray41 = new java.lang.String[][][][][][] { strArray25, strArray30, strArray35, strArray40 };
        java.lang.String[][][] strArray42 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray43 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray44 = new java.lang.String[][][] {};
        java.lang.String[][][][] strArray45 = new java.lang.String[][][][] { strArray42, strArray43, strArray44 };
        java.lang.String[][][][][] strArray46 = new java.lang.String[][][][][] { strArray45 };
        java.lang.String[][][] strArray47 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray48 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray49 = new java.lang.String[][][] {};
        java.lang.String[][][][] strArray50 = new java.lang.String[][][][] { strArray47, strArray48, strArray49 };
        java.lang.String[][][][][] strArray51 = new java.lang.String[][][][][] { strArray50 };
        java.lang.String[][][] strArray52 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray53 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray54 = new java.lang.String[][][] {};
        java.lang.String[][][][] strArray55 = new java.lang.String[][][][] { strArray52, strArray53, strArray54 };
        java.lang.String[][][][][] strArray56 = new java.lang.String[][][][][] { strArray55 };
        java.lang.String[][][] strArray57 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray58 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray59 = new java.lang.String[][][] {};
        java.lang.String[][][][] strArray60 = new java.lang.String[][][][] { strArray57, strArray58, strArray59 };
        java.lang.String[][][][][] strArray61 = new java.lang.String[][][][][] { strArray60 };
        java.lang.String[][][][][][] strArray62 = new java.lang.String[][][][][][] { strArray46, strArray51, strArray56, strArray61 };
        java.lang.String[][][] strArray63 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray64 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray65 = new java.lang.String[][][] {};
        java.lang.String[][][][] strArray66 = new java.lang.String[][][][] { strArray63, strArray64, strArray65 };
        java.lang.String[][][][][] strArray67 = new java.lang.String[][][][][] { strArray66 };
        java.lang.String[][][] strArray68 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray69 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray70 = new java.lang.String[][][] {};
        java.lang.String[][][][] strArray71 = new java.lang.String[][][][] { strArray68, strArray69, strArray70 };
        java.lang.String[][][][][] strArray72 = new java.lang.String[][][][][] { strArray71 };
        java.lang.String[][][] strArray73 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray74 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray75 = new java.lang.String[][][] {};
        java.lang.String[][][][] strArray76 = new java.lang.String[][][][] { strArray73, strArray74, strArray75 };
        java.lang.String[][][][][] strArray77 = new java.lang.String[][][][][] { strArray76 };
        java.lang.String[][][] strArray78 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray79 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray80 = new java.lang.String[][][] {};
        java.lang.String[][][][] strArray81 = new java.lang.String[][][][] { strArray78, strArray79, strArray80 };
        java.lang.String[][][][][] strArray82 = new java.lang.String[][][][][] { strArray81 };
        java.lang.String[][][][][][] strArray83 = new java.lang.String[][][][][][] { strArray67, strArray72, strArray77, strArray82 };
        java.lang.String[][][][][][][] strArray84 = new java.lang.String[][][][][][][] { strArray20, strArray41, strArray62, strArray83 };
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][]>> strArraySetList86 = com.thealgorithms.backtracking.Combination.combination(strArray84, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.String[][][][][][]>> strArraySetList88 = com.thealgorithms.backtracking.Combination.combination(strArray84, (int) (short) 0);
        java.lang.Class<?> wildcardClass89 = strArray84.getClass();
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
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertNull(strArraySetList86);
        org.junit.Assert.assertNull(strArraySetList88);
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "", "" };
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList10 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray6, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.Object>> objSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.Object[]) strArray6, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, 100);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList16 = com.thealgorithms.backtracking.Combination.combination(strArray6, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList18 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray6, (-1));
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList20 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, 4);
        java.lang.Class<?> wildcardClass21 = strComparableSetList20.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strComparableSetList8);
        org.junit.Assert.assertNotNull(serializableSetList10);
        org.junit.Assert.assertNotNull(objSetList12);
        org.junit.Assert.assertNotNull(strComparableSetList14);
        org.junit.Assert.assertNotNull(strSetList16);
        org.junit.Assert.assertNotNull(charSequenceSetList18);
        org.junit.Assert.assertNotNull(strComparableSetList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        java.lang.Class[][][][][][][][] classArray1 = new java.lang.Class[0][][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 2);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][]>> wildcardClassArraySetList10 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][]>> wildcardClassArraySetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 2);
        java.util.List<java.util.TreeSet<java.lang.Object>> objSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.Object[]) wildcardClassArray2, (int) (byte) 0);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNull(wildcardClassArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList12);
        org.junit.Assert.assertNull(objSetList14);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
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
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][]>> listArraySetList25 = com.thealgorithms.backtracking.Combination.combination(strSetListArray15, 4);
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
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        java.util.List[][][][][][][][] listArray1 = new java.util.List[0][][][][][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, 0);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][][]>> listArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (byte) 10);
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNull(listArraySetList4);
        org.junit.Assert.assertNotNull(listArraySetList6);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][]) wildcardClassArray2, 5);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][]) wildcardClassArray2, (int) (short) 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) wildcardClassArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[]>> ofFieldArraySetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[][]) wildcardClassArray2, 3);
        java.lang.Class<?> wildcardClass17 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(typeArraySetList8);
        org.junit.Assert.assertNotNull(typeArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList12);
        org.junit.Assert.assertNotNull(constableArraySetList14);
        org.junit.Assert.assertNotNull(ofFieldArraySetList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        java.lang.Class[][][][][][][][][] classArray1 = new java.lang.Class[0][][][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][][][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 2);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][][][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 100);
        java.lang.Class<?> wildcardClass7 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        java.lang.Class[][][] classArray1 = new java.lang.Class[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][] wildcardClassArray2 = (java.lang.Class<?>[][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][]>> genericDeclarationArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][]) wildcardClassArray2, (-1));
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][]>> typeArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][]) wildcardClassArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 6);
        java.lang.Class<?> wildcardClass13 = wildcardClassArraySetList12.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(typeArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        java.lang.String[][][] strArray0 = new java.lang.String[][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, 3);
        java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, 0);
        java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) 100);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNull(strArraySetList4);
        org.junit.Assert.assertNotNull(strArraySetList6);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        com.thealgorithms.backtracking.Combination[][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 100);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][]>> combinationArraySetList8 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 10);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][]>> combinationArraySetList10 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) '#');
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][]>> combinationArraySetList12 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][]>> combinationArraySetList14 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) '4');
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][]>> combinationArraySetList16 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 6);
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
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.lang.CharSequence[]>> charSequenceArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[][]) strArray0, 6);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNotNull(strArraySetList4);
        org.junit.Assert.assertNotNull(charSequenceArraySetList6);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        com.thealgorithms.backtracking.Combination[][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 4);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 100);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][]>> combinationArraySetList8 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) ' ');
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNotNull(combinationArraySetList2);
        org.junit.Assert.assertNotNull(combinationArraySetList4);
        org.junit.Assert.assertNotNull(combinationArraySetList6);
        org.junit.Assert.assertNotNull(combinationArraySetList8);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        com.thealgorithms.backtracking.Combination[][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (short) -1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass7 = combinationArraySetList6.getClass();
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNull(combinationArraySetList2);
        org.junit.Assert.assertNotNull(combinationArraySetList4);
        org.junit.Assert.assertNotNull(combinationArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (-1));
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 6);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNotNull(combinationArraySetList2);
        org.junit.Assert.assertNotNull(combinationArraySetList4);
        org.junit.Assert.assertNull(combinationArraySetList6);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray1 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray2 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray3 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][] combinationArray4 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][] { combinationArray0, combinationArray1, combinationArray2, combinationArray3 };
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray4, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][]>> combinationArraySetList8 = com.thealgorithms.backtracking.Combination.combination(combinationArray4, 1);
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
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
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
        java.util.List<java.util.TreeSet<java.util.Collection[][]>> collectionArraySetList21 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][][]) strSetListArray15, (int) '#');
        java.util.List<java.util.TreeSet<java.util.Collection[][]>> collectionArraySetList23 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][][]) strSetListArray15, 100);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][]>> listArraySetList25 = com.thealgorithms.backtracking.Combination.combination(strSetListArray15, 5);
        java.lang.Class<?> wildcardClass26 = listArraySetList25.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray1 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray2 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][] combinationArray3 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][] combinationArray4 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][] { combinationArray0, combinationArray1, combinationArray2, combinationArray3 };
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray4, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][]>> combinationArraySetList8 = com.thealgorithms.backtracking.Combination.combination(combinationArray4, (int) (short) -1);
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
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        com.thealgorithms.backtracking.Combination[][][][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][][][] {};
        com.thealgorithms.backtracking.Combination[][][][][][][][][] combinationArray1 = new com.thealgorithms.backtracking.Combination[][][][][][][][][] { combinationArray0 };
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][]>> combinationArraySetList3 = com.thealgorithms.backtracking.Combination.combination(combinationArray1, 0);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][]>> combinationArraySetList5 = com.thealgorithms.backtracking.Combination.combination(combinationArray1, (int) (short) 10);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][]>> combinationArraySetList7 = com.thealgorithms.backtracking.Combination.combination(combinationArray1, (int) (short) 100);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][]>> combinationArraySetList9 = com.thealgorithms.backtracking.Combination.combination(combinationArray1, (int) ' ');
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNotNull(combinationArray1);
        org.junit.Assert.assertNull(combinationArraySetList3);
        org.junit.Assert.assertNotNull(combinationArraySetList5);
        org.junit.Assert.assertNotNull(combinationArraySetList7);
        org.junit.Assert.assertNotNull(combinationArraySetList9);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.lang.String[][][] strArray1 = new java.lang.String[][][] { strArray0 };
        java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList3 = com.thealgorithms.backtracking.Combination.combination(strArray1, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList5 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray1, 0);
        java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList7 = com.thealgorithms.backtracking.Combination.combination(strArray1, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList9 = com.thealgorithms.backtracking.Combination.combination(strArray1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass10 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArraySetList3);
        org.junit.Assert.assertNull(serializableSetList5);
        org.junit.Assert.assertNotNull(strArraySetList7);
        org.junit.Assert.assertNull(strArraySetList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        com.thealgorithms.backtracking.Combination[][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 1);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][]>> combinationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 4);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][]>> combinationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 100);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][]>> combinationArraySetList8 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 100);
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNotNull(combinationArraySetList2);
        org.junit.Assert.assertNotNull(combinationArraySetList4);
        org.junit.Assert.assertNotNull(combinationArraySetList6);
        org.junit.Assert.assertNotNull(combinationArraySetList8);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList4 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray0, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.CharSequence[]>> charSequenceArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[][]) strArray0, 3);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNull(serializableSetList4);
        org.junit.Assert.assertNotNull(charSequenceArraySetList6);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (byte) 1);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(genericDeclarationSetList6);
        org.junit.Assert.assertNotNull(typeDescriptorSetList8);
        org.junit.Assert.assertNull(genericDeclarationSetList10);
        org.junit.Assert.assertNull(genericDeclarationSetList12);
        org.junit.Assert.assertNull(typeDescriptorSetList14);
        org.junit.Assert.assertNotNull(genericDeclarationSetList16);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][]) wildcardClassArray2, 5);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][]) wildcardClassArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][]) wildcardClassArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList14 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (-1));
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, 5);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(typeArraySetList8);
        org.junit.Assert.assertNotNull(typeArraySetList10);
        org.junit.Assert.assertNotNull(typeArraySetList12);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList14);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList16);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        java.lang.Class[][][][][] classArray1 = new java.lang.Class[0][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 10);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList10 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 5);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][][]>> genericDeclarationArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][][][]) wildcardClassArray2, 1);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList10);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList12);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        java.lang.reflect.GenericDeclaration[][][][] genericDeclarationArray0 = new java.lang.reflect.GenericDeclaration[][][][] {};
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][]>> genericDeclarationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(genericDeclarationArray0, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][]>> genericDeclarationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(genericDeclarationArray0, 0);
        java.lang.Class<?> wildcardClass5 = genericDeclarationArray0.getClass();
        org.junit.Assert.assertNotNull(genericDeclarationArray0);
        org.junit.Assert.assertNull(genericDeclarationArraySetList2);
        org.junit.Assert.assertNull(genericDeclarationArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        java.util.List[][][][][][] listArray1 = new java.util.List[0][][][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][]>> listArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][]>> listArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, 5);
        java.lang.Class<?> wildcardClass9 = listArraySetList8.getClass();
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArraySetList4);
        org.junit.Assert.assertNotNull(listArraySetList6);
        org.junit.Assert.assertNotNull(listArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.reflect.Type>> typeSetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[]) wildcardClassArray2, (int) ' ');
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(genericDeclarationSetList6);
        org.junit.Assert.assertNotNull(typeDescriptorSetList8);
        org.junit.Assert.assertNull(genericDeclarationSetList10);
        org.junit.Assert.assertNotNull(genericDeclarationSetList12);
        org.junit.Assert.assertNotNull(typeDescriptorSetList14);
        org.junit.Assert.assertNotNull(typeSetList16);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        java.lang.Class[][][] classArray1 = new java.lang.Class[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][] wildcardClassArray2 = (java.lang.Class<?>[][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][]>> typeArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][]) wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][]>> typeArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][]) wildcardClassArray2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass11 = typeArraySetList10.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(typeArraySetList8);
        org.junit.Assert.assertNotNull(typeArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.Object>> objSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.Object[]) wildcardClassArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[]>> ofFieldArraySetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[][]) wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList16 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 6);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[]>> ofFieldArraySetList18 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[][]) wildcardClassArray2, (int) (byte) -1);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNull(genericDeclarationArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNull(genericDeclarationArraySetList10);
        org.junit.Assert.assertNotNull(objSetList12);
        org.junit.Assert.assertNotNull(ofFieldArraySetList14);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList16);
        org.junit.Assert.assertNotNull(ofFieldArraySetList18);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> wildcardClassOfFieldSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[]) wildcardClassArray2, 2);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> wildcardClassOfFieldSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[]) wildcardClassArray2, (-1));
        java.lang.Class<?> wildcardClass13 = wildcardClassOfFieldSetList12.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(genericDeclarationSetList6);
        org.junit.Assert.assertNotNull(typeDescriptorSetList8);
        org.junit.Assert.assertNotNull(wildcardClassOfFieldSetList10);
        org.junit.Assert.assertNotNull(wildcardClassOfFieldSetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        java.lang.Class[][][][] classArray1 = new java.lang.Class[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.Object>> objSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.Object[]) wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 0);
        java.lang.Class<?> wildcardClass13 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(typeArraySetList6);
        org.junit.Assert.assertNotNull(typeArraySetList8);
        org.junit.Assert.assertNotNull(objSetList10);
        org.junit.Assert.assertNull(wildcardClassArraySetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][] combinationArray0 = new com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][][] {};
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][][][][][][][][][][][]>> combinationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, 100);
        org.junit.Assert.assertNotNull(combinationArray0);
        org.junit.Assert.assertNotNull(combinationArraySetList2);
    }
}

