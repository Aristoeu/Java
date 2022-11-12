package backtracking.Combination;

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
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.lang.Class<?> wildcardClass5 = strSetList4.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "", "" };
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, (int) (byte) 1);
        java.lang.Class<?> wildcardClass9 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strComparableSetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        java.lang.Iterable[] iterableArray1 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.TreeSet<java.lang.String>>[] strSetIterableArray2 = (java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]) iterableArray1;
        java.lang.Iterable[] iterableArray4 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.TreeSet<java.lang.String>>[] strSetIterableArray5 = (java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]) iterableArray4;
        java.lang.Iterable[] iterableArray7 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.TreeSet<java.lang.String>>[] strSetIterableArray8 = (java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]) iterableArray7;
        java.lang.Iterable[] iterableArray10 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.TreeSet<java.lang.String>>[] strSetIterableArray11 = (java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]) iterableArray10;
        java.lang.Iterable[] iterableArray13 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.TreeSet<java.lang.String>>[] strSetIterableArray14 = (java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]) iterableArray13;
        java.lang.Iterable[] iterableArray16 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.TreeSet<java.lang.String>>[] strSetIterableArray17 = (java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]) iterableArray16;
        java.lang.Iterable[][] iterableArray19 = new java.lang.Iterable[6][];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.TreeSet<java.lang.String>>[][] strSetIterableArray20 = (java.lang.Iterable<java.util.TreeSet<java.lang.String>>[][]) iterableArray19;
        strSetIterableArray20[0] = strSetIterableArray2;
        strSetIterableArray20[1] = strSetIterableArray5;
        strSetIterableArray20[2] = iterableArray7;
        strSetIterableArray20[3] = iterableArray10;
        strSetIterableArray20[4] = iterableArray13;
        strSetIterableArray20[5] = iterableArray16;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]>> iterableArraySetList34 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray20, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class [Ljava.lang.Iterable; cannot be cast to class java.lang.Comparable ([Ljava.lang.Iterable; and java.lang.Comparable are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterableArray1);
        org.junit.Assert.assertNotNull(strSetIterableArray2);
        org.junit.Assert.assertNotNull(iterableArray4);
        org.junit.Assert.assertNotNull(strSetIterableArray5);
        org.junit.Assert.assertNotNull(iterableArray7);
        org.junit.Assert.assertNotNull(strSetIterableArray8);
        org.junit.Assert.assertNotNull(iterableArray10);
        org.junit.Assert.assertNotNull(strSetIterableArray11);
        org.junit.Assert.assertNotNull(iterableArray13);
        org.junit.Assert.assertNotNull(strSetIterableArray14);
        org.junit.Assert.assertNotNull(iterableArray16);
        org.junit.Assert.assertNotNull(strSetIterableArray17);
        org.junit.Assert.assertNotNull(iterableArray19);
        org.junit.Assert.assertNotNull(strSetIterableArray20);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        java.lang.Iterable[] iterableArray1 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.TreeSet<java.lang.String>>[] strSetIterableArray2 = (java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]) iterableArray1;
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList4 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList6 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList8 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, (int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = setIterableSetList8.getClass();
        org.junit.Assert.assertNotNull(iterableArray1);
        org.junit.Assert.assertNotNull(strSetIterableArray2);
        org.junit.Assert.assertNotNull(setIterableSetList4);
        org.junit.Assert.assertNull(setIterableSetList6);
        org.junit.Assert.assertNotNull(setIterableSetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        com.thealgorithms.backtracking.Combination combination0 = new com.thealgorithms.backtracking.Combination();
        java.lang.Class<?> wildcardClass1 = combination0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        java.lang.constant.ConstantDesc[] constantDescArray3 = new java.lang.constant.ConstantDesc[] { 10L, (-1.0f), "" };
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList5 = com.thealgorithms.backtracking.Combination.combination(constantDescArray3, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Long cannot be cast to class java.lang.Float (java.lang.Long and java.lang.Float are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescArray3);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 10);
        java.lang.Class<?> wildcardClass7 = charSequenceSetList6.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(charSequenceSetList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        java.lang.Iterable[] iterableArray1 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.TreeSet<java.lang.String>>[] strSetIterableArray2 = (java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]) iterableArray1;
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList4 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList6 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList8 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, (int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = strSetIterableArray2.getClass();
        org.junit.Assert.assertNotNull(iterableArray1);
        org.junit.Assert.assertNotNull(strSetIterableArray2);
        org.junit.Assert.assertNotNull(setIterableSetList4);
        org.junit.Assert.assertNull(setIterableSetList6);
        org.junit.Assert.assertNotNull(setIterableSetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray29 = new java.lang.String[] { "", "hi!", "", "hi!", "" };
        java.lang.String[][] strArray30 = new java.lang.String[][] { strArray5, strArray11, strArray17, strArray23, strArray29 };
        java.lang.String[] strArray36 = new java.lang.String[] { "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray42 = new java.lang.String[] { "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray48 = new java.lang.String[] { "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray54 = new java.lang.String[] { "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray60 = new java.lang.String[] { "", "hi!", "", "hi!", "" };
        java.lang.String[][] strArray61 = new java.lang.String[][] { strArray36, strArray42, strArray48, strArray54, strArray60 };
        java.lang.String[] strArray67 = new java.lang.String[] { "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray73 = new java.lang.String[] { "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray79 = new java.lang.String[] { "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray85 = new java.lang.String[] { "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray91 = new java.lang.String[] { "", "hi!", "", "hi!", "" };
        java.lang.String[][] strArray92 = new java.lang.String[][] { strArray67, strArray73, strArray79, strArray85, strArray91 };
        java.lang.String[][][] strArray93 = new java.lang.String[][][] { strArray30, strArray61, strArray92 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList95 = com.thealgorithms.backtracking.Combination.combination(strArray93, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class [[Ljava.lang.String; cannot be cast to class java.lang.Comparable ([[Ljava.lang.String; and java.lang.Comparable are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertNotNull(strArray91);
        org.junit.Assert.assertNotNull(strArray92);
        org.junit.Assert.assertNotNull(strArray93);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        java.lang.constant.Constable[] constableArray2 = new java.lang.constant.Constable[] { (byte) 1, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.constant.Constable>> constableSetList4 = com.thealgorithms.backtracking.Combination.combination(constableArray2, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Byte cannot be cast to class java.lang.Short (java.lang.Byte and java.lang.Short are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constableArray2);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        java.lang.Iterable[] iterableArray1 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.TreeSet<java.lang.String>>[] strSetIterableArray2 = (java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]) iterableArray1;
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList4 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, 100);
        java.lang.Class<?> wildcardClass5 = setIterableSetList4.getClass();
        org.junit.Assert.assertNotNull(iterableArray1);
        org.junit.Assert.assertNotNull(strSetIterableArray2);
        org.junit.Assert.assertNotNull(setIterableSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable>> constableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[]) strArray2, (int) (byte) 1);
        java.lang.Class<?> wildcardClass9 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(charSequenceSetList6);
        org.junit.Assert.assertNotNull(constableSetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.lang.Class<?> wildcardClass5 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        java.lang.Iterable[] iterableArray1 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.TreeSet<java.lang.String>>[] strSetIterableArray2 = (java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]) iterableArray1;
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList4 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList6 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList8 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, (int) ' ');
        java.lang.Class<?> wildcardClass9 = setIterableSetList8.getClass();
        org.junit.Assert.assertNotNull(iterableArray1);
        org.junit.Assert.assertNotNull(strSetIterableArray2);
        org.junit.Assert.assertNotNull(setIterableSetList4);
        org.junit.Assert.assertNull(setIterableSetList6);
        org.junit.Assert.assertNotNull(setIterableSetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        java.util.Collection[] collectionArray1 = new java.util.Collection[0];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.util.TreeSet<java.lang.String>>[] strSetCollectionArray2 = (java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray1;
        java.util.List<java.util.TreeSet<java.util.Collection<java.util.TreeSet<java.lang.String>>>> setCollectionSetList4 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray1, (-1));
        java.lang.Class<?> wildcardClass5 = setCollectionSetList4.getClass();
        org.junit.Assert.assertNotNull(collectionArray1);
        org.junit.Assert.assertNotNull(strSetCollectionArray2);
        org.junit.Assert.assertNotNull(setCollectionSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList9 = com.thealgorithms.backtracking.Combination.combination(strArray7, (int) '#');
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList14 = com.thealgorithms.backtracking.Combination.combination(strArray12, (int) '#');
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList19 = com.thealgorithms.backtracking.Combination.combination(strArray17, (int) '#');
        java.lang.String[] strArray22 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList24 = com.thealgorithms.backtracking.Combination.combination(strArray22, (int) '#');
        java.lang.String[] strArray27 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList29 = com.thealgorithms.backtracking.Combination.combination(strArray27, (int) '#');
        java.util.List[] listArray31 = new java.util.List[6];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[] strSetListArray32 = (java.util.List<java.util.TreeSet<java.lang.String>>[]) listArray31;
        strSetListArray32[0] = strSetList4;
        strSetListArray32[1] = strSetList9;
        strSetListArray32[2] = strSetList14;
        strSetListArray32[3] = strSetList19;
        strSetListArray32[4] = strSetList24;
        strSetListArray32[5] = strSetList29;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>>> setListSetList46 = com.thealgorithms.backtracking.Combination.combination(strSetListArray32, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.util.LinkedList cannot be cast to class java.lang.Comparable (java.util.LinkedList and java.lang.Comparable are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strSetList9);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strSetList14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strSetList19);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strSetList24);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strSetList29);
        org.junit.Assert.assertNotNull(listArray31);
        org.junit.Assert.assertNotNull(strSetListArray32);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass9 = constantDescSetList8.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(charSequenceSetList6);
        org.junit.Assert.assertNotNull(constantDescSetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable>> constableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[]) strArray2, (int) (byte) 1);
        java.lang.Class<?> wildcardClass9 = strArray2.getClass();
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList14 = com.thealgorithms.backtracking.Combination.combination(strArray12, (int) '#');
        java.lang.Class<?> wildcardClass15 = strSetList14.getClass();
        com.thealgorithms.backtracking.Combination combination16 = new com.thealgorithms.backtracking.Combination();
        java.lang.Class<?> wildcardClass17 = combination16.getClass();
        java.lang.Class[] classArray19 = new java.lang.Class[3];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray20 = (java.lang.Class<?>[]) classArray19;
        wildcardClassArray20[0] = wildcardClass9;
        wildcardClassArray20[1] = wildcardClass15;
        wildcardClassArray20[2] = wildcardClass17;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList28 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray20, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Class cannot be cast to class java.lang.Comparable (java.lang.Class and java.lang.Comparable are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(charSequenceSetList6);
        org.junit.Assert.assertNotNull(constableSetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strSetList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(classArray19);
        org.junit.Assert.assertNotNull(wildcardClassArray20);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Iterable[] iterableArray3 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.TreeSet<java.lang.String>>[] strSetIterableArray4 = (java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]) iterableArray3;
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList6 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray4, 100);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList8 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray4, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList10 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray4, (int) (byte) 10);
        java.lang.Class<?> wildcardClass11 = strSetIterableArray4.getClass();
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList16 = com.thealgorithms.backtracking.Combination.combination(strArray14, (int) '#');
        java.lang.Class<?> wildcardClass17 = strArray14.getClass();
        java.lang.String[] strArray24 = new java.lang.String[] { "", "", "", "", "", "" };
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList26 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray24, (int) (byte) 1);
        java.lang.Class<?> wildcardClass27 = strArray24.getClass();
        java.lang.reflect.Type[] typeArray28 = new java.lang.reflect.Type[] { wildcardClass1, wildcardClass11, wildcardClass17, wildcardClass27 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.reflect.Type>> typeSetList30 = com.thealgorithms.backtracking.Combination.combination(typeArray28, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Class cannot be cast to class java.lang.Comparable (java.lang.Class and java.lang.Comparable are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(iterableArray3);
        org.junit.Assert.assertNotNull(strSetIterableArray4);
        org.junit.Assert.assertNotNull(setIterableSetList6);
        org.junit.Assert.assertNull(setIterableSetList8);
        org.junit.Assert.assertNotNull(setIterableSetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strSetList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strComparableSetList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(typeArray28);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "", "" };
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, (int) (byte) 1);
        java.lang.Class<?> wildcardClass9 = strComparableSetList8.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strComparableSetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.lang.String[][] strArray6 = new java.lang.String[][] { strArray0, strArray1, strArray2, strArray3, strArray4, strArray5 };
        java.lang.String[] strArray7 = new java.lang.String[] {};
        java.lang.String[] strArray8 = new java.lang.String[] {};
        java.lang.String[] strArray9 = new java.lang.String[] {};
        java.lang.String[] strArray10 = new java.lang.String[] {};
        java.lang.String[] strArray11 = new java.lang.String[] {};
        java.lang.String[] strArray12 = new java.lang.String[] {};
        java.lang.String[][] strArray13 = new java.lang.String[][] { strArray7, strArray8, strArray9, strArray10, strArray11, strArray12 };
        java.lang.String[] strArray14 = new java.lang.String[] {};
        java.lang.String[] strArray15 = new java.lang.String[] {};
        java.lang.String[] strArray16 = new java.lang.String[] {};
        java.lang.String[] strArray17 = new java.lang.String[] {};
        java.lang.String[] strArray18 = new java.lang.String[] {};
        java.lang.String[] strArray19 = new java.lang.String[] {};
        java.lang.String[][] strArray20 = new java.lang.String[][] { strArray14, strArray15, strArray16, strArray17, strArray18, strArray19 };
        java.lang.String[][][] strArray21 = new java.lang.String[][][] { strArray6, strArray13, strArray20 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList23 = com.thealgorithms.backtracking.Combination.combination(strArray21, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class [[Ljava.lang.String; cannot be cast to class java.lang.Comparable ([[Ljava.lang.String; and java.lang.Comparable are in module java.base of loader 'bootstrap')");
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
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        com.thealgorithms.backtracking.Combination[] combinationArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination>> combinationSetList2 = com.thealgorithms.backtracking.Combination.combination(combinationArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"[Ljava.lang.Object;.clone()\" because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        java.lang.Iterable[] iterableArray1 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.TreeSet<java.lang.String>>[] strSetIterableArray2 = (java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]) iterableArray1;
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList4 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, 100);
        java.lang.Class<?> wildcardClass5 = strSetIterableArray2.getClass();
        org.junit.Assert.assertNotNull(iterableArray1);
        org.junit.Assert.assertNotNull(strSetIterableArray2);
        org.junit.Assert.assertNotNull(setIterableSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray2, 10);
        java.lang.Class<?> wildcardClass9 = constantDescSetList8.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(charSequenceSetList6);
        org.junit.Assert.assertNotNull(constantDescSetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        java.util.Collection[] collectionArray1 = new java.util.Collection[0];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.util.TreeSet<java.lang.String>>[] strSetCollectionArray2 = (java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray1;
        java.util.List<java.util.TreeSet<java.util.Collection<java.util.TreeSet<java.lang.String>>>> setCollectionSetList4 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray1, (-1));
        java.lang.Class<?> wildcardClass5 = collectionArray1.getClass();
        org.junit.Assert.assertNotNull(collectionArray1);
        org.junit.Assert.assertNotNull(strSetCollectionArray2);
        org.junit.Assert.assertNotNull(setCollectionSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        java.lang.Iterable[] iterableArray1 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.TreeSet<java.lang.String>>[] strSetIterableArray2 = (java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]) iterableArray1;
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList4 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList6 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.Object>> objSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.Object[]) strSetIterableArray2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass9 = objSetList8.getClass();
        org.junit.Assert.assertNotNull(iterableArray1);
        org.junit.Assert.assertNotNull(strSetIterableArray2);
        org.junit.Assert.assertNotNull(setIterableSetList4);
        org.junit.Assert.assertNull(setIterableSetList6);
        org.junit.Assert.assertNotNull(objSetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        java.util.Collection[] collectionArray1 = new java.util.Collection[0];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.util.TreeSet<java.lang.String>>[] strSetCollectionArray2 = (java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray1;
        java.util.List<java.util.TreeSet<java.util.Collection<java.util.TreeSet<java.lang.String>>>> setCollectionSetList4 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray1, (-1));
        java.lang.Class<?> wildcardClass5 = setCollectionSetList4.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray6 = new java.lang.reflect.GenericDeclaration[] { wildcardClass5 };
        java.util.Collection[] collectionArray8 = new java.util.Collection[0];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.util.TreeSet<java.lang.String>>[] strSetCollectionArray9 = (java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray8;
        java.util.List<java.util.TreeSet<java.util.Collection<java.util.TreeSet<java.lang.String>>>> setCollectionSetList11 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray8, (-1));
        java.lang.Class<?> wildcardClass12 = setCollectionSetList11.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray13 = new java.lang.reflect.GenericDeclaration[] { wildcardClass12 };
        java.util.Collection[] collectionArray15 = new java.util.Collection[0];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.util.TreeSet<java.lang.String>>[] strSetCollectionArray16 = (java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray15;
        java.util.List<java.util.TreeSet<java.util.Collection<java.util.TreeSet<java.lang.String>>>> setCollectionSetList18 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray15, (-1));
        java.lang.Class<?> wildcardClass19 = setCollectionSetList18.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray20 = new java.lang.reflect.GenericDeclaration[] { wildcardClass19 };
        java.util.Collection[] collectionArray22 = new java.util.Collection[0];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.util.TreeSet<java.lang.String>>[] strSetCollectionArray23 = (java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray22;
        java.util.List<java.util.TreeSet<java.util.Collection<java.util.TreeSet<java.lang.String>>>> setCollectionSetList25 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray22, (-1));
        java.lang.Class<?> wildcardClass26 = setCollectionSetList25.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray27 = new java.lang.reflect.GenericDeclaration[] { wildcardClass26 };
        java.util.Collection[] collectionArray29 = new java.util.Collection[0];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.util.TreeSet<java.lang.String>>[] strSetCollectionArray30 = (java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray29;
        java.util.List<java.util.TreeSet<java.util.Collection<java.util.TreeSet<java.lang.String>>>> setCollectionSetList32 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray29, (-1));
        java.lang.Class<?> wildcardClass33 = setCollectionSetList32.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray34 = new java.lang.reflect.GenericDeclaration[] { wildcardClass33 };
        java.util.Collection[] collectionArray36 = new java.util.Collection[0];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.util.TreeSet<java.lang.String>>[] strSetCollectionArray37 = (java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray36;
        java.util.List<java.util.TreeSet<java.util.Collection<java.util.TreeSet<java.lang.String>>>> setCollectionSetList39 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray36, (-1));
        java.lang.Class<?> wildcardClass40 = setCollectionSetList39.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray41 = new java.lang.reflect.GenericDeclaration[] { wildcardClass40 };
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray42 = new java.lang.reflect.GenericDeclaration[][] { genericDeclarationArray6, genericDeclarationArray13, genericDeclarationArray20, genericDeclarationArray27, genericDeclarationArray34, genericDeclarationArray41 };
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList44 = com.thealgorithms.backtracking.Combination.combination(genericDeclarationArray42, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList46 = com.thealgorithms.backtracking.Combination.combination(genericDeclarationArray42, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class [Ljava.lang.reflect.GenericDeclaration; cannot be cast to class java.lang.Comparable ([Ljava.lang.reflect.GenericDeclaration; and java.lang.Comparable are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collectionArray1);
        org.junit.Assert.assertNotNull(strSetCollectionArray2);
        org.junit.Assert.assertNotNull(setCollectionSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(genericDeclarationArray6);
        org.junit.Assert.assertNotNull(collectionArray8);
        org.junit.Assert.assertNotNull(strSetCollectionArray9);
        org.junit.Assert.assertNotNull(setCollectionSetList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(genericDeclarationArray13);
        org.junit.Assert.assertNotNull(collectionArray15);
        org.junit.Assert.assertNotNull(strSetCollectionArray16);
        org.junit.Assert.assertNotNull(setCollectionSetList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(genericDeclarationArray20);
        org.junit.Assert.assertNotNull(collectionArray22);
        org.junit.Assert.assertNotNull(strSetCollectionArray23);
        org.junit.Assert.assertNotNull(setCollectionSetList25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(genericDeclarationArray27);
        org.junit.Assert.assertNotNull(collectionArray29);
        org.junit.Assert.assertNotNull(strSetCollectionArray30);
        org.junit.Assert.assertNotNull(setCollectionSetList32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(genericDeclarationArray34);
        org.junit.Assert.assertNotNull(collectionArray36);
        org.junit.Assert.assertNotNull(strSetCollectionArray37);
        org.junit.Assert.assertNotNull(setCollectionSetList39);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(genericDeclarationArray41);
        org.junit.Assert.assertNotNull(genericDeclarationArray42);
        org.junit.Assert.assertNull(genericDeclarationArraySetList44);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList9 = com.thealgorithms.backtracking.Combination.combination(strArray7, (int) '#');
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList14 = com.thealgorithms.backtracking.Combination.combination(strArray12, (int) '#');
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList19 = com.thealgorithms.backtracking.Combination.combination(strArray17, (int) '#');
        java.lang.String[] strArray22 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList24 = com.thealgorithms.backtracking.Combination.combination(strArray22, (int) '#');
        java.lang.String[] strArray27 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList29 = com.thealgorithms.backtracking.Combination.combination(strArray27, (int) '#');
        java.util.List[] listArray31 = new java.util.List[6];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[] strSetListArray32 = (java.util.List<java.util.TreeSet<java.lang.String>>[]) listArray31;
        strSetListArray32[0] = strSetList4;
        strSetListArray32[1] = strSetList9;
        strSetListArray32[2] = strSetList14;
        strSetListArray32[3] = strSetList19;
        strSetListArray32[4] = strSetList24;
        strSetListArray32[5] = strSetList29;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>>> setListSetList46 = com.thealgorithms.backtracking.Combination.combination(strSetListArray32, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.util.LinkedList cannot be cast to class java.lang.Comparable (java.util.LinkedList and java.lang.Comparable are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strSetList9);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strSetList14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strSetList19);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strSetList24);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strSetList29);
        org.junit.Assert.assertNotNull(listArray31);
        org.junit.Assert.assertNotNull(strSetListArray32);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        java.lang.Iterable[] iterableArray1 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.TreeSet<java.lang.String>>[] strSetIterableArray2 = (java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]) iterableArray1;
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList4 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList6 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, (int) (short) 0);
        java.lang.Class<?> wildcardClass7 = strSetIterableArray2.getClass();
        org.junit.Assert.assertNotNull(iterableArray1);
        org.junit.Assert.assertNotNull(strSetIterableArray2);
        org.junit.Assert.assertNotNull(setIterableSetList4);
        org.junit.Assert.assertNull(setIterableSetList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        java.lang.constant.Constable[] constableArray1 = new java.lang.constant.Constable[] { 10 };
        java.lang.constant.Constable[] constableArray3 = new java.lang.constant.Constable[] { 10 };
        java.lang.constant.Constable[] constableArray5 = new java.lang.constant.Constable[] { 10 };
        java.lang.constant.Constable[] constableArray7 = new java.lang.constant.Constable[] { 10 };
        java.lang.constant.Constable[][] constableArray8 = new java.lang.constant.Constable[][] { constableArray1, constableArray3, constableArray5, constableArray7 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList10 = com.thealgorithms.backtracking.Combination.combination(constableArray8, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class [Ljava.lang.constant.Constable; cannot be cast to class java.lang.Comparable ([Ljava.lang.constant.Constable; and java.lang.Comparable are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constableArray1);
        org.junit.Assert.assertNotNull(constableArray3);
        org.junit.Assert.assertNotNull(constableArray5);
        org.junit.Assert.assertNotNull(constableArray7);
        org.junit.Assert.assertNotNull(constableArray8);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        java.lang.Iterable[] iterableArray1 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.TreeSet<java.lang.String>>[] strSetIterableArray2 = (java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]) iterableArray1;
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList4 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.Object>> objSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.Object[]) strSetIterableArray2, (int) ' ');
        java.lang.Class<?> wildcardClass7 = objSetList6.getClass();
        org.junit.Assert.assertNotNull(iterableArray1);
        org.junit.Assert.assertNotNull(strSetIterableArray2);
        org.junit.Assert.assertNotNull(setIterableSetList4);
        org.junit.Assert.assertNotNull(objSetList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        java.lang.Iterable[] iterableArray1 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.TreeSet<java.lang.String>>[] strSetIterableArray2 = (java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]) iterableArray1;
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList4 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList6 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.Object>> objSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.Object[]) strSetIterableArray2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass9 = objSetList8.getClass();
        com.thealgorithms.backtracking.Combination combination10 = new com.thealgorithms.backtracking.Combination();
        java.lang.Class<?> wildcardClass11 = combination10.getClass();
        java.lang.reflect.Type[] typeArray12 = new java.lang.reflect.Type[] { wildcardClass9, wildcardClass11 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.reflect.Type>> typeSetList14 = com.thealgorithms.backtracking.Combination.combination(typeArray12, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Class cannot be cast to class java.lang.Comparable (java.lang.Class and java.lang.Comparable are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterableArray1);
        org.junit.Assert.assertNotNull(strSetIterableArray2);
        org.junit.Assert.assertNotNull(setIterableSetList4);
        org.junit.Assert.assertNull(setIterableSetList6);
        org.junit.Assert.assertNotNull(objSetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(typeArray12);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        java.lang.Iterable[] iterableArray1 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.TreeSet<java.lang.String>>[] strSetIterableArray2 = (java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]) iterableArray1;
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList4 = com.thealgorithms.backtracking.Combination.combination((java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]) iterableArray1, (int) (short) 100);
        java.lang.Class<?> wildcardClass5 = iterableArray1.getClass();
        org.junit.Assert.assertNotNull(iterableArray1);
        org.junit.Assert.assertNotNull(strSetIterableArray2);
        org.junit.Assert.assertNotNull(setIterableSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList8 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass9 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(constantDescSetList6);
        org.junit.Assert.assertNotNull(strSetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass9 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(charSequenceSetList6);
        org.junit.Assert.assertNotNull(constantDescSetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray2, 1);
        java.lang.Class<?> wildcardClass7 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(constantDescSetList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
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
            java.util.List<java.util.TreeSet<java.util.Collection<java.util.TreeSet<java.lang.String>>>> setCollectionSetList20 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection<java.util.TreeSet<java.lang.String>>[]) strSetListArray12, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.util.LinkedList cannot be cast to class java.lang.Comparable (java.util.LinkedList and java.lang.Comparable are in module java.base of loader 'bootstrap')");
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
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList8 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass9 = strSetList8.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(constantDescSetList6);
        org.junit.Assert.assertNotNull(strSetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.lang.String[][][] strArray1 = new java.lang.String[][][] { strArray0 };
        java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList3 = com.thealgorithms.backtracking.Combination.combination(strArray1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArraySetList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable>> constableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[]) strArray2, (int) (byte) 1);
        java.lang.Class<?> wildcardClass9 = strArray2.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray10 = new java.lang.reflect.GenericDeclaration[] { wildcardClass9 };
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList12 = com.thealgorithms.backtracking.Combination.combination(genericDeclarationArray10, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList14 = com.thealgorithms.backtracking.Combination.combination(genericDeclarationArray10, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = genericDeclarationSetList14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(charSequenceSetList6);
        org.junit.Assert.assertNotNull(constableSetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(genericDeclarationArray10);
        org.junit.Assert.assertNull(genericDeclarationSetList12);
        org.junit.Assert.assertNull(genericDeclarationSetList14);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        java.lang.Iterable[] iterableArray1 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.TreeSet<java.lang.String>>[] strSetIterableArray2 = (java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]) iterableArray1;
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList4 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList6 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList8 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, (int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = strSetIterableArray2.getClass();
        java.lang.reflect.Type[] typeArray10 = new java.lang.reflect.Type[] { wildcardClass9 };
        java.lang.Iterable[] iterableArray12 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.TreeSet<java.lang.String>>[] strSetIterableArray13 = (java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]) iterableArray12;
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList15 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray13, 100);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList17 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray13, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList19 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray13, (int) (byte) 10);
        java.lang.Class<?> wildcardClass20 = strSetIterableArray13.getClass();
        java.lang.reflect.Type[] typeArray21 = new java.lang.reflect.Type[] { wildcardClass20 };
        java.lang.Iterable[] iterableArray23 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.TreeSet<java.lang.String>>[] strSetIterableArray24 = (java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]) iterableArray23;
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList26 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray24, 100);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList28 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray24, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList30 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray24, (int) (byte) 10);
        java.lang.Class<?> wildcardClass31 = strSetIterableArray24.getClass();
        java.lang.reflect.Type[] typeArray32 = new java.lang.reflect.Type[] { wildcardClass31 };
        java.lang.Iterable[] iterableArray34 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.TreeSet<java.lang.String>>[] strSetIterableArray35 = (java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]) iterableArray34;
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList37 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray35, 100);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList39 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray35, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList41 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray35, (int) (byte) 10);
        java.lang.Class<?> wildcardClass42 = strSetIterableArray35.getClass();
        java.lang.reflect.Type[] typeArray43 = new java.lang.reflect.Type[] { wildcardClass42 };
        java.lang.Iterable[] iterableArray45 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.TreeSet<java.lang.String>>[] strSetIterableArray46 = (java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]) iterableArray45;
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList48 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray46, 100);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList50 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray46, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList52 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray46, (int) (byte) 10);
        java.lang.Class<?> wildcardClass53 = strSetIterableArray46.getClass();
        java.lang.reflect.Type[] typeArray54 = new java.lang.reflect.Type[] { wildcardClass53 };
        java.lang.Iterable[] iterableArray56 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.TreeSet<java.lang.String>>[] strSetIterableArray57 = (java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]) iterableArray56;
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList59 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray57, 100);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList61 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray57, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList63 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray57, (int) (byte) 10);
        java.lang.Class<?> wildcardClass64 = strSetIterableArray57.getClass();
        java.lang.reflect.Type[] typeArray65 = new java.lang.reflect.Type[] { wildcardClass64 };
        java.lang.reflect.Type[][] typeArray66 = new java.lang.reflect.Type[][] { typeArray10, typeArray21, typeArray32, typeArray43, typeArray54, typeArray65 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList68 = com.thealgorithms.backtracking.Combination.combination(typeArray66, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class [Ljava.lang.reflect.Type; cannot be cast to class java.lang.Comparable ([Ljava.lang.reflect.Type; and java.lang.Comparable are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterableArray1);
        org.junit.Assert.assertNotNull(strSetIterableArray2);
        org.junit.Assert.assertNotNull(setIterableSetList4);
        org.junit.Assert.assertNull(setIterableSetList6);
        org.junit.Assert.assertNotNull(setIterableSetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(iterableArray12);
        org.junit.Assert.assertNotNull(strSetIterableArray13);
        org.junit.Assert.assertNotNull(setIterableSetList15);
        org.junit.Assert.assertNull(setIterableSetList17);
        org.junit.Assert.assertNotNull(setIterableSetList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(iterableArray23);
        org.junit.Assert.assertNotNull(strSetIterableArray24);
        org.junit.Assert.assertNotNull(setIterableSetList26);
        org.junit.Assert.assertNull(setIterableSetList28);
        org.junit.Assert.assertNotNull(setIterableSetList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertNotNull(iterableArray34);
        org.junit.Assert.assertNotNull(strSetIterableArray35);
        org.junit.Assert.assertNotNull(setIterableSetList37);
        org.junit.Assert.assertNull(setIterableSetList39);
        org.junit.Assert.assertNotNull(setIterableSetList41);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertNotNull(iterableArray45);
        org.junit.Assert.assertNotNull(strSetIterableArray46);
        org.junit.Assert.assertNotNull(setIterableSetList48);
        org.junit.Assert.assertNull(setIterableSetList50);
        org.junit.Assert.assertNotNull(setIterableSetList52);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(typeArray54);
        org.junit.Assert.assertNotNull(iterableArray56);
        org.junit.Assert.assertNotNull(strSetIterableArray57);
        org.junit.Assert.assertNotNull(setIterableSetList59);
        org.junit.Assert.assertNull(setIterableSetList61);
        org.junit.Assert.assertNotNull(setIterableSetList63);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(typeArray65);
        org.junit.Assert.assertNotNull(typeArray66);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        java.lang.Iterable[] iterableArray1 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.TreeSet<java.lang.String>>[] strSetIterableArray2 = (java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]) iterableArray1;
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList4 = com.thealgorithms.backtracking.Combination.combination((java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]) iterableArray1, (int) (short) 100);
        java.lang.Class<?> wildcardClass5 = setIterableSetList4.getClass();
        org.junit.Assert.assertNotNull(iterableArray1);
        org.junit.Assert.assertNotNull(strSetIterableArray2);
        org.junit.Assert.assertNotNull(setIterableSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        java.io.Serializable[] serializableArray0 = null;
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList2 = com.thealgorithms.backtracking.Combination.combination(serializableArray0, (int) (short) 0);
        org.junit.Assert.assertNull(serializableSetList2);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "", "" };
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList10 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray6, (int) '4');
        java.lang.Class<?> wildcardClass11 = serializableSetList10.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strComparableSetList8);
        org.junit.Assert.assertNotNull(serializableSetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass3 = strArraySetList2.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        java.lang.constant.Constable[] constableArray0 = new java.lang.constant.Constable[] {};
        java.util.List<java.util.TreeSet<java.lang.constant.Constable>> constableSetList2 = com.thealgorithms.backtracking.Combination.combination(constableArray0, (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = constableArray0.getClass();
        org.junit.Assert.assertNotNull(constableArray0);
        org.junit.Assert.assertNotNull(constableSetList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        java.lang.Iterable[] iterableArray1 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.TreeSet<java.lang.String>>[] strSetIterableArray2 = (java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]) iterableArray1;
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList4 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList6 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList8 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, (int) ' ');
        java.lang.Class<?> wildcardClass9 = setIterableSetList8.getClass();
        java.lang.reflect.Type[] typeArray10 = new java.lang.reflect.Type[] { wildcardClass9 };
        java.lang.Iterable[] iterableArray12 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.TreeSet<java.lang.String>>[] strSetIterableArray13 = (java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]) iterableArray12;
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList15 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray13, 100);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList17 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray13, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList19 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray13, (int) ' ');
        java.lang.Class<?> wildcardClass20 = setIterableSetList19.getClass();
        java.lang.reflect.Type[] typeArray21 = new java.lang.reflect.Type[] { wildcardClass20 };
        java.lang.Iterable[] iterableArray23 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.TreeSet<java.lang.String>>[] strSetIterableArray24 = (java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]) iterableArray23;
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList26 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray24, 100);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList28 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray24, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList30 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray24, (int) ' ');
        java.lang.Class<?> wildcardClass31 = setIterableSetList30.getClass();
        java.lang.reflect.Type[] typeArray32 = new java.lang.reflect.Type[] { wildcardClass31 };
        java.lang.reflect.Type[][] typeArray33 = new java.lang.reflect.Type[][] { typeArray10, typeArray21, typeArray32 };
        java.lang.Iterable[] iterableArray35 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.TreeSet<java.lang.String>>[] strSetIterableArray36 = (java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]) iterableArray35;
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList38 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray36, 100);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList40 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray36, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList42 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray36, (int) ' ');
        java.lang.Class<?> wildcardClass43 = setIterableSetList42.getClass();
        java.lang.reflect.Type[] typeArray44 = new java.lang.reflect.Type[] { wildcardClass43 };
        java.lang.Iterable[] iterableArray46 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.TreeSet<java.lang.String>>[] strSetIterableArray47 = (java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]) iterableArray46;
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList49 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray47, 100);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList51 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray47, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList53 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray47, (int) ' ');
        java.lang.Class<?> wildcardClass54 = setIterableSetList53.getClass();
        java.lang.reflect.Type[] typeArray55 = new java.lang.reflect.Type[] { wildcardClass54 };
        java.lang.Iterable[] iterableArray57 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.TreeSet<java.lang.String>>[] strSetIterableArray58 = (java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]) iterableArray57;
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList60 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray58, 100);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList62 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray58, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList64 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray58, (int) ' ');
        java.lang.Class<?> wildcardClass65 = setIterableSetList64.getClass();
        java.lang.reflect.Type[] typeArray66 = new java.lang.reflect.Type[] { wildcardClass65 };
        java.lang.reflect.Type[][] typeArray67 = new java.lang.reflect.Type[][] { typeArray44, typeArray55, typeArray66 };
        java.lang.reflect.Type[][][] typeArray68 = new java.lang.reflect.Type[][][] { typeArray33, typeArray67 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.reflect.Type[][]>> typeArraySetList70 = com.thealgorithms.backtracking.Combination.combination(typeArray68, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class [[Ljava.lang.reflect.Type; cannot be cast to class java.lang.Comparable ([[Ljava.lang.reflect.Type; and java.lang.Comparable are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterableArray1);
        org.junit.Assert.assertNotNull(strSetIterableArray2);
        org.junit.Assert.assertNotNull(setIterableSetList4);
        org.junit.Assert.assertNull(setIterableSetList6);
        org.junit.Assert.assertNotNull(setIterableSetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(iterableArray12);
        org.junit.Assert.assertNotNull(strSetIterableArray13);
        org.junit.Assert.assertNotNull(setIterableSetList15);
        org.junit.Assert.assertNull(setIterableSetList17);
        org.junit.Assert.assertNotNull(setIterableSetList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(iterableArray23);
        org.junit.Assert.assertNotNull(strSetIterableArray24);
        org.junit.Assert.assertNotNull(setIterableSetList26);
        org.junit.Assert.assertNull(setIterableSetList28);
        org.junit.Assert.assertNotNull(setIterableSetList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertNotNull(iterableArray35);
        org.junit.Assert.assertNotNull(strSetIterableArray36);
        org.junit.Assert.assertNotNull(setIterableSetList38);
        org.junit.Assert.assertNull(setIterableSetList40);
        org.junit.Assert.assertNotNull(setIterableSetList42);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(typeArray44);
        org.junit.Assert.assertNotNull(iterableArray46);
        org.junit.Assert.assertNotNull(strSetIterableArray47);
        org.junit.Assert.assertNotNull(setIterableSetList49);
        org.junit.Assert.assertNull(setIterableSetList51);
        org.junit.Assert.assertNotNull(setIterableSetList53);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(typeArray55);
        org.junit.Assert.assertNotNull(iterableArray57);
        org.junit.Assert.assertNotNull(strSetIterableArray58);
        org.junit.Assert.assertNotNull(setIterableSetList60);
        org.junit.Assert.assertNull(setIterableSetList62);
        org.junit.Assert.assertNotNull(setIterableSetList64);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNotNull(typeArray66);
        org.junit.Assert.assertNotNull(typeArray67);
        org.junit.Assert.assertNotNull(typeArray68);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        java.util.Collection[] collectionArray1 = new java.util.Collection[0];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.util.TreeSet<java.lang.String>>[] strSetCollectionArray2 = (java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray1;
        java.util.List<java.util.TreeSet<java.util.Collection<java.util.TreeSet<java.lang.String>>>> setCollectionSetList4 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray1, (-1));
        java.lang.Class<?> wildcardClass5 = collectionArray1.getClass();
        java.lang.reflect.Type[] typeArray6 = new java.lang.reflect.Type[] { wildcardClass5 };
        java.util.List<java.util.TreeSet<java.lang.reflect.Type>> typeSetList8 = com.thealgorithms.backtracking.Combination.combination(typeArray6, (int) ' ');
        java.lang.Class<?> wildcardClass9 = typeSetList8.getClass();
        org.junit.Assert.assertNotNull(collectionArray1);
        org.junit.Assert.assertNotNull(strSetCollectionArray2);
        org.junit.Assert.assertNotNull(setCollectionSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeSetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
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
        java.lang.Class<?> wildcardClass19 = strSetListArray12.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strSetList9);
        org.junit.Assert.assertNotNull(listArray11);
        org.junit.Assert.assertNotNull(strSetListArray12);
        org.junit.Assert.assertNull(setListSetList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        java.util.Collection[] collectionArray1 = new java.util.Collection[0];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.util.TreeSet<java.lang.String>>[] strSetCollectionArray2 = (java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray1;
        java.util.List<java.util.TreeSet<java.util.Collection<java.util.TreeSet<java.lang.String>>>> setCollectionSetList4 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray1, (-1));
        java.lang.Class<?> wildcardClass5 = setCollectionSetList4.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray6 = new java.lang.reflect.GenericDeclaration[] { wildcardClass5 };
        java.util.Collection[] collectionArray8 = new java.util.Collection[0];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.util.TreeSet<java.lang.String>>[] strSetCollectionArray9 = (java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray8;
        java.util.List<java.util.TreeSet<java.util.Collection<java.util.TreeSet<java.lang.String>>>> setCollectionSetList11 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray8, (-1));
        java.lang.Class<?> wildcardClass12 = setCollectionSetList11.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray13 = new java.lang.reflect.GenericDeclaration[] { wildcardClass12 };
        java.util.Collection[] collectionArray15 = new java.util.Collection[0];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.util.TreeSet<java.lang.String>>[] strSetCollectionArray16 = (java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray15;
        java.util.List<java.util.TreeSet<java.util.Collection<java.util.TreeSet<java.lang.String>>>> setCollectionSetList18 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray15, (-1));
        java.lang.Class<?> wildcardClass19 = setCollectionSetList18.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray20 = new java.lang.reflect.GenericDeclaration[] { wildcardClass19 };
        java.util.Collection[] collectionArray22 = new java.util.Collection[0];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.util.TreeSet<java.lang.String>>[] strSetCollectionArray23 = (java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray22;
        java.util.List<java.util.TreeSet<java.util.Collection<java.util.TreeSet<java.lang.String>>>> setCollectionSetList25 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray22, (-1));
        java.lang.Class<?> wildcardClass26 = setCollectionSetList25.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray27 = new java.lang.reflect.GenericDeclaration[] { wildcardClass26 };
        java.util.Collection[] collectionArray29 = new java.util.Collection[0];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.util.TreeSet<java.lang.String>>[] strSetCollectionArray30 = (java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray29;
        java.util.List<java.util.TreeSet<java.util.Collection<java.util.TreeSet<java.lang.String>>>> setCollectionSetList32 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray29, (-1));
        java.lang.Class<?> wildcardClass33 = setCollectionSetList32.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray34 = new java.lang.reflect.GenericDeclaration[] { wildcardClass33 };
        java.util.Collection[] collectionArray36 = new java.util.Collection[0];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.util.TreeSet<java.lang.String>>[] strSetCollectionArray37 = (java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray36;
        java.util.List<java.util.TreeSet<java.util.Collection<java.util.TreeSet<java.lang.String>>>> setCollectionSetList39 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray36, (-1));
        java.lang.Class<?> wildcardClass40 = setCollectionSetList39.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray41 = new java.lang.reflect.GenericDeclaration[] { wildcardClass40 };
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray42 = new java.lang.reflect.GenericDeclaration[][] { genericDeclarationArray6, genericDeclarationArray13, genericDeclarationArray20, genericDeclarationArray27, genericDeclarationArray34, genericDeclarationArray41 };
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList44 = com.thealgorithms.backtracking.Combination.combination(genericDeclarationArray42, 0);
        java.lang.Class<?> wildcardClass45 = genericDeclarationArray42.getClass();
        org.junit.Assert.assertNotNull(collectionArray1);
        org.junit.Assert.assertNotNull(strSetCollectionArray2);
        org.junit.Assert.assertNotNull(setCollectionSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(genericDeclarationArray6);
        org.junit.Assert.assertNotNull(collectionArray8);
        org.junit.Assert.assertNotNull(strSetCollectionArray9);
        org.junit.Assert.assertNotNull(setCollectionSetList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(genericDeclarationArray13);
        org.junit.Assert.assertNotNull(collectionArray15);
        org.junit.Assert.assertNotNull(strSetCollectionArray16);
        org.junit.Assert.assertNotNull(setCollectionSetList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(genericDeclarationArray20);
        org.junit.Assert.assertNotNull(collectionArray22);
        org.junit.Assert.assertNotNull(strSetCollectionArray23);
        org.junit.Assert.assertNotNull(setCollectionSetList25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(genericDeclarationArray27);
        org.junit.Assert.assertNotNull(collectionArray29);
        org.junit.Assert.assertNotNull(strSetCollectionArray30);
        org.junit.Assert.assertNotNull(setCollectionSetList32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(genericDeclarationArray34);
        org.junit.Assert.assertNotNull(collectionArray36);
        org.junit.Assert.assertNotNull(strSetCollectionArray37);
        org.junit.Assert.assertNotNull(setCollectionSetList39);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(genericDeclarationArray41);
        org.junit.Assert.assertNotNull(genericDeclarationArray42);
        org.junit.Assert.assertNull(genericDeclarationArraySetList44);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList4 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray0, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) strArray0, (int) (short) 10);
        java.lang.Class<?> wildcardClass7 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNull(serializableSetList4);
        org.junit.Assert.assertNotNull(constableArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.lang.Class<?> wildcardClass5 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "", "" };
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, (int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strComparableSetList8);
        org.junit.Assert.assertNotNull(strComparableSetList10);
        org.junit.Assert.assertNotNull(strComparableSetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        java.util.Collection[] collectionArray1 = new java.util.Collection[0];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.util.TreeSet<java.lang.String>>[] strSetCollectionArray2 = (java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray1;
        java.util.List<java.util.TreeSet<java.util.Collection<java.util.TreeSet<java.lang.String>>>> setCollectionSetList4 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray1, (-1));
        java.lang.Class<?> wildcardClass5 = setCollectionSetList4.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray6 = new java.lang.reflect.GenericDeclaration[] { wildcardClass5 };
        java.util.Collection[] collectionArray8 = new java.util.Collection[0];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.util.TreeSet<java.lang.String>>[] strSetCollectionArray9 = (java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray8;
        java.util.List<java.util.TreeSet<java.util.Collection<java.util.TreeSet<java.lang.String>>>> setCollectionSetList11 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray8, (-1));
        java.lang.Class<?> wildcardClass12 = setCollectionSetList11.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray13 = new java.lang.reflect.GenericDeclaration[] { wildcardClass12 };
        java.util.Collection[] collectionArray15 = new java.util.Collection[0];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.util.TreeSet<java.lang.String>>[] strSetCollectionArray16 = (java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray15;
        java.util.List<java.util.TreeSet<java.util.Collection<java.util.TreeSet<java.lang.String>>>> setCollectionSetList18 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray15, (-1));
        java.lang.Class<?> wildcardClass19 = setCollectionSetList18.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray20 = new java.lang.reflect.GenericDeclaration[] { wildcardClass19 };
        java.util.Collection[] collectionArray22 = new java.util.Collection[0];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.util.TreeSet<java.lang.String>>[] strSetCollectionArray23 = (java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray22;
        java.util.List<java.util.TreeSet<java.util.Collection<java.util.TreeSet<java.lang.String>>>> setCollectionSetList25 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray22, (-1));
        java.lang.Class<?> wildcardClass26 = setCollectionSetList25.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray27 = new java.lang.reflect.GenericDeclaration[] { wildcardClass26 };
        java.util.Collection[] collectionArray29 = new java.util.Collection[0];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.util.TreeSet<java.lang.String>>[] strSetCollectionArray30 = (java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray29;
        java.util.List<java.util.TreeSet<java.util.Collection<java.util.TreeSet<java.lang.String>>>> setCollectionSetList32 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray29, (-1));
        java.lang.Class<?> wildcardClass33 = setCollectionSetList32.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray34 = new java.lang.reflect.GenericDeclaration[] { wildcardClass33 };
        java.util.Collection[] collectionArray36 = new java.util.Collection[0];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.util.TreeSet<java.lang.String>>[] strSetCollectionArray37 = (java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray36;
        java.util.List<java.util.TreeSet<java.util.Collection<java.util.TreeSet<java.lang.String>>>> setCollectionSetList39 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray36, (-1));
        java.lang.Class<?> wildcardClass40 = setCollectionSetList39.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray41 = new java.lang.reflect.GenericDeclaration[] { wildcardClass40 };
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray42 = new java.lang.reflect.GenericDeclaration[][] { genericDeclarationArray6, genericDeclarationArray13, genericDeclarationArray20, genericDeclarationArray27, genericDeclarationArray34, genericDeclarationArray41 };
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList44 = com.thealgorithms.backtracking.Combination.combination(genericDeclarationArray42, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass45 = genericDeclarationArraySetList44.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collectionArray1);
        org.junit.Assert.assertNotNull(strSetCollectionArray2);
        org.junit.Assert.assertNotNull(setCollectionSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(genericDeclarationArray6);
        org.junit.Assert.assertNotNull(collectionArray8);
        org.junit.Assert.assertNotNull(strSetCollectionArray9);
        org.junit.Assert.assertNotNull(setCollectionSetList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(genericDeclarationArray13);
        org.junit.Assert.assertNotNull(collectionArray15);
        org.junit.Assert.assertNotNull(strSetCollectionArray16);
        org.junit.Assert.assertNotNull(setCollectionSetList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(genericDeclarationArray20);
        org.junit.Assert.assertNotNull(collectionArray22);
        org.junit.Assert.assertNotNull(strSetCollectionArray23);
        org.junit.Assert.assertNotNull(setCollectionSetList25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(genericDeclarationArray27);
        org.junit.Assert.assertNotNull(collectionArray29);
        org.junit.Assert.assertNotNull(strSetCollectionArray30);
        org.junit.Assert.assertNotNull(setCollectionSetList32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(genericDeclarationArray34);
        org.junit.Assert.assertNotNull(collectionArray36);
        org.junit.Assert.assertNotNull(strSetCollectionArray37);
        org.junit.Assert.assertNotNull(setCollectionSetList39);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(genericDeclarationArray41);
        org.junit.Assert.assertNotNull(genericDeclarationArray42);
        org.junit.Assert.assertNull(genericDeclarationArraySetList44);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        java.lang.reflect.Type[] typeArray0 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray1 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[][] typeArray2 = new java.lang.reflect.Type[][] { typeArray0, typeArray1 };
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList4 = com.thealgorithms.backtracking.Combination.combination(typeArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList6 = com.thealgorithms.backtracking.Combination.combination(typeArray2, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class [Ljava.lang.reflect.Type; cannot be cast to class java.lang.Comparable ([Ljava.lang.reflect.Type; and java.lang.Comparable are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray0);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertNull(typeArraySetList4);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        java.lang.Iterable[] iterableArray1 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.TreeSet<java.lang.String>>[] strSetIterableArray2 = (java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]) iterableArray1;
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList4 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList6 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, (int) (short) 1);
        java.lang.Class<?> wildcardClass7 = setIterableSetList6.getClass();
        org.junit.Assert.assertNotNull(iterableArray1);
        org.junit.Assert.assertNotNull(strSetIterableArray2);
        org.junit.Assert.assertNotNull(setIterableSetList4);
        org.junit.Assert.assertNotNull(setIterableSetList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "", "" };
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList10 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray6, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.Object>> objSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.Object[]) strArray6, (int) '#');
        java.lang.Class<?> wildcardClass13 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strComparableSetList8);
        org.junit.Assert.assertNotNull(serializableSetList10);
        org.junit.Assert.assertNotNull(objSetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        java.lang.Iterable[] iterableArray1 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.TreeSet<java.lang.String>>[] strSetIterableArray2 = (java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]) iterableArray1;
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList4 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList6 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, (int) (short) 1);
        java.lang.Class<?> wildcardClass7 = strSetIterableArray2.getClass();
        org.junit.Assert.assertNotNull(iterableArray1);
        org.junit.Assert.assertNotNull(strSetIterableArray2);
        org.junit.Assert.assertNotNull(setIterableSetList4);
        org.junit.Assert.assertNotNull(setIterableSetList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = typeDescriptorSetList6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNull(typeDescriptorSetList6);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        java.lang.Iterable[] iterableArray1 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.TreeSet<java.lang.String>>[] strSetIterableArray2 = (java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]) iterableArray1;
        java.lang.Iterable[] iterableArray4 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.TreeSet<java.lang.String>>[] strSetIterableArray5 = (java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]) iterableArray4;
        java.lang.Iterable[] iterableArray7 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.TreeSet<java.lang.String>>[] strSetIterableArray8 = (java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]) iterableArray7;
        java.lang.Iterable[][] iterableArray10 = new java.lang.Iterable[3][];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.TreeSet<java.lang.String>>[][] strSetIterableArray11 = (java.lang.Iterable<java.util.TreeSet<java.lang.String>>[][]) iterableArray10;
        strSetIterableArray11[0] = iterableArray1;
        strSetIterableArray11[1] = iterableArray4;
        strSetIterableArray11[2] = iterableArray7;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]>> iterableArraySetList19 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray11, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class [Ljava.lang.Iterable; cannot be cast to class java.lang.Comparable ([Ljava.lang.Iterable; and java.lang.Comparable are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterableArray1);
        org.junit.Assert.assertNotNull(strSetIterableArray2);
        org.junit.Assert.assertNotNull(iterableArray4);
        org.junit.Assert.assertNotNull(strSetIterableArray5);
        org.junit.Assert.assertNotNull(iterableArray7);
        org.junit.Assert.assertNotNull(strSetIterableArray8);
        org.junit.Assert.assertNotNull(iterableArray10);
        org.junit.Assert.assertNotNull(strSetIterableArray11);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        java.lang.String[][][][] strArray0 = new java.lang.String[][][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
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
            java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>>> setListSetList22 = com.thealgorithms.backtracking.Combination.combination(strSetListArray12, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.util.LinkedList cannot be cast to class java.lang.Comparable (java.util.LinkedList and java.lang.Comparable are in module java.base of loader 'bootstrap')");
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
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        java.lang.String[][][][] strArray0 = new java.lang.String[][][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) 10);
        java.util.List<java.util.TreeSet<java.lang.String[][][]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (short) 100);
        java.lang.Class<?> wildcardClass5 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNotNull(strArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        java.lang.Iterable[] iterableArray1 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.TreeSet<java.lang.String>>[] strSetIterableArray2 = (java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]) iterableArray1;
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList4 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.Object>> objSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.Object[]) strSetIterableArray2, (int) ' ');
        java.lang.Class<?> wildcardClass7 = strSetIterableArray2.getClass();
        org.junit.Assert.assertNotNull(iterableArray1);
        org.junit.Assert.assertNotNull(strSetIterableArray2);
        org.junit.Assert.assertNotNull(setIterableSetList4);
        org.junit.Assert.assertNotNull(objSetList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList8 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass9 = strSetList8.getClass();
        java.lang.Iterable[] iterableArray11 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.TreeSet<java.lang.String>>[] strSetIterableArray12 = (java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]) iterableArray11;
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]) iterableArray11, (int) (short) 100);
        java.lang.Class<?> wildcardClass15 = setIterableSetList14.getClass();
        java.util.Collection[] collectionArray17 = new java.util.Collection[0];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.util.TreeSet<java.lang.String>>[] strSetCollectionArray18 = (java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray17;
        java.util.List<java.util.TreeSet<java.util.Collection<java.util.TreeSet<java.lang.String>>>> setCollectionSetList20 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray17, (-1));
        java.lang.Class<?> wildcardClass21 = collectionArray17.getClass();
        java.lang.Class[] classArray23 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray24 = (java.lang.Class<?>[]) classArray23;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList26 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray24, (int) (byte) 0);
        java.lang.Class<?> wildcardClass27 = wildcardClassArray24.getClass();
        java.lang.Class[] classArray29 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray30 = (java.lang.Class<?>[]) classArray29;
        wildcardClassArray30[0] = wildcardClass9;
        wildcardClassArray30[1] = wildcardClass15;
        wildcardClassArray30[2] = wildcardClass21;
        wildcardClassArray30[3] = wildcardClass27;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList40 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray30, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Class cannot be cast to class java.lang.Comparable (java.lang.Class and java.lang.Comparable are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(constantDescSetList6);
        org.junit.Assert.assertNotNull(strSetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(iterableArray11);
        org.junit.Assert.assertNotNull(strSetIterableArray12);
        org.junit.Assert.assertNotNull(setIterableSetList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(collectionArray17);
        org.junit.Assert.assertNotNull(strSetCollectionArray18);
        org.junit.Assert.assertNotNull(setCollectionSetList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(classArray23);
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertNull(wildcardClassSetList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(classArray29);
        org.junit.Assert.assertNotNull(wildcardClassArray30);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList8 = com.thealgorithms.backtracking.Combination.combination(strArray2, 0);
        java.lang.Class<?> wildcardClass9 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(charSequenceSetList6);
        org.junit.Assert.assertNull(strSetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "", "" };
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, (int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = strComparableSetList12.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strComparableSetList8);
        org.junit.Assert.assertNotNull(strComparableSetList10);
        org.junit.Assert.assertNotNull(strComparableSetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.lang.String[][][] strArray1 = new java.lang.String[][][] { strArray0 };
        java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList3 = com.thealgorithms.backtracking.Combination.combination(strArray1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = strArraySetList3.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArraySetList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        java.lang.String[][][][] strArray0 = new java.lang.String[][][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = strArray0.getClass();
        java.lang.Class[] classArray5 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray6 = (java.lang.Class<?>[]) classArray5;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray6, (int) (byte) 0);
        java.lang.Iterable[] iterableArray11 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.TreeSet<java.lang.String>>[] strSetIterableArray12 = (java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]) iterableArray11;
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList14 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray12, 100);
        java.util.Collection[][] collectionArray15 = new java.util.Collection[][] {};
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList17 = com.thealgorithms.backtracking.Combination.combination(collectionArray15, (int) (byte) 0);
        java.lang.Iterable[] iterableArray19 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.TreeSet<java.lang.String>>[] strSetIterableArray20 = (java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]) iterableArray19;
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList22 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray20, 100);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList24 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray20, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList26 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray20, (int) (byte) 10);
        java.lang.Class<?> wildcardClass27 = strSetIterableArray20.getClass();
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { strArray0, (byte) 0, (short) 0, strSetIterableArray12, collectionArray15, strSetIterableArray20 };
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList30 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) collectionArray15, (-1));
        java.lang.Class<?> wildcardClass31 = collectionArray15.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(classArray5);
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertNull(wildcardClassSetList8);
        org.junit.Assert.assertNotNull(iterableArray11);
        org.junit.Assert.assertNotNull(strSetIterableArray12);
        org.junit.Assert.assertNotNull(setIterableSetList14);
        org.junit.Assert.assertNotNull(collectionArray15);
        org.junit.Assert.assertNull(collectionArraySetList17);
        org.junit.Assert.assertNotNull(iterableArray19);
        org.junit.Assert.assertNotNull(strSetIterableArray20);
        org.junit.Assert.assertNotNull(setIterableSetList22);
        org.junit.Assert.assertNull(setIterableSetList24);
        org.junit.Assert.assertNotNull(setIterableSetList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertNotNull(serializableSetList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        com.thealgorithms.backtracking.Combination combination0 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination1 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination[] combinationArray2 = new com.thealgorithms.backtracking.Combination[] { combination0, combination1 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination>> combinationSetList4 = com.thealgorithms.backtracking.Combination.combination(combinationArray2, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class com.thealgorithms.backtracking.Combination cannot be cast to class java.lang.Comparable (com.thealgorithms.backtracking.Combination is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(combinationArray2);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "", "" };
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList10 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray6, (int) '4');
        java.lang.Class<?> wildcardClass11 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strComparableSetList8);
        org.junit.Assert.assertNotNull(serializableSetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        java.lang.Iterable[] iterableArray1 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.TreeSet<java.lang.String>>[] strSetIterableArray2 = (java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]) iterableArray1;
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList4 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList6 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = setIterableSetList6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterableArray1);
        org.junit.Assert.assertNotNull(strSetIterableArray2);
        org.junit.Assert.assertNotNull(setIterableSetList4);
        org.junit.Assert.assertNull(setIterableSetList6);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        com.thealgorithms.backtracking.Combination combination0 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination1 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination2 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination3 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination4 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination[] combinationArray5 = new com.thealgorithms.backtracking.Combination[] { combination0, combination1, combination2, combination3, combination4 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination>> combinationSetList7 = com.thealgorithms.backtracking.Combination.combination(combinationArray5, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class com.thealgorithms.backtracking.Combination cannot be cast to class java.lang.Comparable (com.thealgorithms.backtracking.Combination is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(combinationArray5);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "", "" };
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList10 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray6, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList12 = com.thealgorithms.backtracking.Combination.combination(strArray6, 1);
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray6, (int) (short) 100);
        java.lang.Class<?> wildcardClass15 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strComparableSetList8);
        org.junit.Assert.assertNotNull(serializableSetList10);
        org.junit.Assert.assertNotNull(strSetList12);
        org.junit.Assert.assertNotNull(constantDescSetList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        java.lang.reflect.GenericDeclaration[][][] genericDeclarationArray0 = new java.lang.reflect.GenericDeclaration[][][] {};
        java.lang.reflect.GenericDeclaration[][][] genericDeclarationArray1 = new java.lang.reflect.GenericDeclaration[][][] {};
        java.lang.reflect.GenericDeclaration[][][] genericDeclarationArray2 = new java.lang.reflect.GenericDeclaration[][][] {};
        java.lang.reflect.GenericDeclaration[][][][] genericDeclarationArray3 = new java.lang.reflect.GenericDeclaration[][][][] { genericDeclarationArray0, genericDeclarationArray1, genericDeclarationArray2 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][]>> genericDeclarationArraySetList5 = com.thealgorithms.backtracking.Combination.combination(genericDeclarationArray3, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class [[[Ljava.lang.reflect.GenericDeclaration; cannot be cast to class java.lang.Comparable ([[[Ljava.lang.reflect.GenericDeclaration; and java.lang.Comparable are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(genericDeclarationArray0);
        org.junit.Assert.assertNotNull(genericDeclarationArray1);
        org.junit.Assert.assertNotNull(genericDeclarationArray2);
        org.junit.Assert.assertNotNull(genericDeclarationArray3);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList4 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray0, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) strArray0, (int) (short) 10);
        java.lang.Class<?> wildcardClass7 = constableArraySetList6.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNull(serializableSetList4);
        org.junit.Assert.assertNotNull(constableArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!", "" };
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList7 = com.thealgorithms.backtracking.Combination.combination(charSequenceArray5, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList9 = com.thealgorithms.backtracking.Combination.combination(charSequenceArray5, (int) (byte) 100);
        java.lang.Class<?> wildcardClass10 = charSequenceSetList9.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceSetList7);
        org.junit.Assert.assertNotNull(charSequenceSetList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
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
            java.lang.Class<?> wildcardClass21 = setListSetList20.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        java.lang.reflect.Type[][] typeArray0 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray1 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray2 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray3 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][][] typeArray4 = new java.lang.reflect.Type[][][] { typeArray0, typeArray1, typeArray2, typeArray3 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.reflect.Type[][]>> typeArraySetList6 = com.thealgorithms.backtracking.Combination.combination(typeArray4, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class [[Ljava.lang.reflect.Type; cannot be cast to class java.lang.Comparable ([[Ljava.lang.reflect.Type; and java.lang.Comparable are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray0);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertNotNull(typeArray3);
        org.junit.Assert.assertNotNull(typeArray4);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
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
            java.util.List<java.util.TreeSet<java.lang.Object>> objSetList22 = com.thealgorithms.backtracking.Combination.combination((java.lang.Object[]) strSetListArray12, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.util.LinkedList cannot be cast to class java.lang.Comparable (java.util.LinkedList and java.lang.Comparable are in module java.base of loader 'bootstrap')");
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
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        java.util.Collection[] collectionArray0 = new java.util.Collection[] {};
        java.util.Collection[] collectionArray1 = new java.util.Collection[] {};
        java.util.Collection[] collectionArray2 = new java.util.Collection[] {};
        java.util.Collection[][] collectionArray3 = new java.util.Collection[][] { collectionArray0, collectionArray1, collectionArray2 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList5 = com.thealgorithms.backtracking.Combination.combination(collectionArray3, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class [Ljava.util.Collection; cannot be cast to class java.lang.Comparable ([Ljava.util.Collection; and java.lang.Comparable are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collectionArray0);
        org.junit.Assert.assertNotNull(collectionArray1);
        org.junit.Assert.assertNotNull(collectionArray2);
        org.junit.Assert.assertNotNull(collectionArray3);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "", "" };
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray6, (int) '4');
        java.lang.Class<?> wildcardClass15 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strComparableSetList8);
        org.junit.Assert.assertNotNull(strComparableSetList10);
        org.junit.Assert.assertNotNull(strComparableSetList12);
        org.junit.Assert.assertNotNull(charSequenceSetList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) ' ');
        java.lang.Class<?> wildcardClass9 = typeDescriptorSetList8.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(genericDeclarationSetList6);
        org.junit.Assert.assertNotNull(typeDescriptorSetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (short) 10);
        java.lang.Class<?> wildcardClass9 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(typeDescriptorSetList6);
        org.junit.Assert.assertNotNull(typeDescriptorSetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.CharSequence[]>> charSequenceArraySetList2 = com.thealgorithms.backtracking.Combination.combination(charSequenceArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"[Ljava.lang.Object;.clone()\" because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        java.lang.reflect.Type[] typeArray0 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray1 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[][] typeArray2 = new java.lang.reflect.Type[][] { typeArray0, typeArray1 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList4 = com.thealgorithms.backtracking.Combination.combination(typeArray2, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class [Ljava.lang.reflect.Type; cannot be cast to class java.lang.Comparable ([Ljava.lang.reflect.Type; and java.lang.Comparable are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray0);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(typeArray2);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList4 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray0, (int) (short) 0);
        java.lang.Class<?> wildcardClass5 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNull(serializableSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        java.lang.reflect.Type[][] typeArray0 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray1 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray2 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray3 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray4 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][][] typeArray5 = new java.lang.reflect.Type[][][] { typeArray0, typeArray1, typeArray2, typeArray3, typeArray4 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.reflect.Type[][]>> typeArraySetList7 = com.thealgorithms.backtracking.Combination.combination(typeArray5, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class [[Ljava.lang.reflect.Type; cannot be cast to class java.lang.Comparable ([[Ljava.lang.reflect.Type; and java.lang.Comparable are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray0);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertNotNull(typeArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray5);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        java.lang.reflect.GenericDeclaration[][][] genericDeclarationArray0 = new java.lang.reflect.GenericDeclaration[][][] {};
        java.lang.reflect.GenericDeclaration[][][] genericDeclarationArray1 = new java.lang.reflect.GenericDeclaration[][][] {};
        java.lang.reflect.GenericDeclaration[][][] genericDeclarationArray2 = new java.lang.reflect.GenericDeclaration[][][] {};
        java.lang.reflect.GenericDeclaration[][][][] genericDeclarationArray3 = new java.lang.reflect.GenericDeclaration[][][][] { genericDeclarationArray0, genericDeclarationArray1, genericDeclarationArray2 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][]>> genericDeclarationArraySetList5 = com.thealgorithms.backtracking.Combination.combination(genericDeclarationArray3, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class [[[Ljava.lang.reflect.GenericDeclaration; cannot be cast to class java.lang.Comparable ([[[Ljava.lang.reflect.GenericDeclaration; and java.lang.Comparable are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(genericDeclarationArray0);
        org.junit.Assert.assertNotNull(genericDeclarationArray1);
        org.junit.Assert.assertNotNull(genericDeclarationArray2);
        org.junit.Assert.assertNotNull(genericDeclarationArray3);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class[][] classArray4 = new java.lang.Class[1][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray5 = (java.lang.Class<?>[][]) classArray4;
        wildcardClassArray5[0] = classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList9 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray5, 10);
        java.lang.Class<?> wildcardClass10 = wildcardClassArraySetList9.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(classArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        java.lang.constant.Constable[][] constableArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList2 = com.thealgorithms.backtracking.Combination.combination(constableArray0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"[Ljava.lang.Object;.clone()\" because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, 0);
        java.lang.Class<?> wildcardClass7 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNull(typeDescriptorSetList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.lang.String[][][] strArray1 = new java.lang.String[][][] { strArray0 };
        java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList3 = com.thealgorithms.backtracking.Combination.combination(strArray1, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList5 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray1, 0);
        java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList7 = com.thealgorithms.backtracking.Combination.combination(strArray1, (int) '#');
        java.lang.Class<?> wildcardClass8 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArraySetList3);
        org.junit.Assert.assertNull(serializableSetList5);
        org.junit.Assert.assertNotNull(strArraySetList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable>> constableSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[]) strArray2, (int) 'a');
        java.lang.Class<?> wildcardClass11 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(charSequenceSetList6);
        org.junit.Assert.assertNotNull(constantDescSetList8);
        org.junit.Assert.assertNotNull(constableSetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (byte) 1);
        java.lang.Class<?> wildcardClass7 = genericDeclarationSetList6.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(genericDeclarationSetList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (short) 10);
        java.lang.Class<?> wildcardClass9 = typeDescriptorSetList8.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(typeDescriptorSetList6);
        org.junit.Assert.assertNotNull(typeDescriptorSetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        java.util.Collection[][] collectionArray0 = new java.util.Collection[][] {};
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList2 = com.thealgorithms.backtracking.Combination.combination(collectionArray0, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList4 = com.thealgorithms.backtracking.Combination.combination(collectionArray0, (int) (short) 0);
        java.lang.Class<?> wildcardClass5 = collectionArray0.getClass();
        org.junit.Assert.assertNotNull(collectionArray0);
        org.junit.Assert.assertNull(collectionArraySetList2);
        org.junit.Assert.assertNull(collectionArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (byte) 100);
        java.lang.Class<?> wildcardClass7 = typeDescriptorSetList6.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(typeDescriptorSetList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = charSequenceSetList8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(constantDescSetList6);
        org.junit.Assert.assertNull(charSequenceSetList8);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray2, (int) (byte) 10);
        java.lang.Class<?> wildcardClass11 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(constantDescSetList6);
        org.junit.Assert.assertNull(charSequenceSetList8);
        org.junit.Assert.assertNotNull(strComparableSetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, (-1));
        java.lang.Class<?> wildcardClass5 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNotNull(strArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
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
            java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>>> setListSetList20 = com.thealgorithms.backtracking.Combination.combination(strSetListArray12, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.util.LinkedList cannot be cast to class java.lang.Comparable (java.util.LinkedList and java.lang.Comparable are in module java.base of loader 'bootstrap')");
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
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class[][] classArray4 = new java.lang.Class[1][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray5 = (java.lang.Class<?>[][]) classArray4;
        wildcardClassArray5[0] = classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList9 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray5, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList11 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][]) wildcardClassArray5, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class [Ljava.lang.Class; cannot be cast to class java.lang.Comparable ([Ljava.lang.Class; and java.lang.Comparable are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(classArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList9);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class[][] classArray4 = new java.lang.Class[1][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray5 = (java.lang.Class<?>[][]) classArray4;
        wildcardClassArray5[0] = classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList9 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray5, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList11 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) wildcardClassArray5, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class [Ljava.lang.Class; cannot be cast to class java.lang.Comparable ([Ljava.lang.Class; and java.lang.Comparable are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(classArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList9);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable>> constableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[]) strArray2, (int) (byte) 1);
        java.lang.Class<?> wildcardClass9 = strArray2.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray10 = new java.lang.reflect.GenericDeclaration[] { wildcardClass9 };
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList12 = com.thealgorithms.backtracking.Combination.combination(genericDeclarationArray10, 0);
        java.lang.Class<?> wildcardClass13 = genericDeclarationArray10.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(charSequenceSetList6);
        org.junit.Assert.assertNotNull(constableSetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(genericDeclarationArray10);
        org.junit.Assert.assertNull(genericDeclarationSetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        java.lang.constant.ConstantDesc[] constantDescArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList2 = com.thealgorithms.backtracking.Combination.combination(constantDescArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"[Ljava.lang.Object;.clone()\" because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.lang.String[][][] strArray1 = new java.lang.String[][][] { strArray0 };
        java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList3 = com.thealgorithms.backtracking.Combination.combination(strArray1, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList5 = com.thealgorithms.backtracking.Combination.combination(strArray1, 100);
        java.lang.Class<?> wildcardClass6 = strArraySetList5.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArraySetList3);
        org.junit.Assert.assertNotNull(strArraySetList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
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
            java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>>> setListSetList22 = com.thealgorithms.backtracking.Combination.combination(strSetListArray12, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.util.LinkedList cannot be cast to class java.lang.Comparable (java.util.LinkedList and java.lang.Comparable are in module java.base of loader 'bootstrap')");
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
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!", "" };
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList7 = com.thealgorithms.backtracking.Combination.combination(charSequenceArray5, (int) (byte) 1);
        java.lang.Class<?> wildcardClass8 = charSequenceSetList7.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceSetList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!", "" };
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList7 = com.thealgorithms.backtracking.Combination.combination(charSequenceArray5, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList9 = com.thealgorithms.backtracking.Combination.combination(charSequenceArray5, (int) (byte) 100);
        java.lang.Class<?> wildcardClass10 = charSequenceArray5.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceSetList7);
        org.junit.Assert.assertNotNull(charSequenceSetList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "", "" };
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList10 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray6, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.Object>> objSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.Object[]) strArray6, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, 100);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList16 = com.thealgorithms.backtracking.Combination.combination(strArray6, (int) '4');
        java.lang.Class<?> wildcardClass17 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strComparableSetList8);
        org.junit.Assert.assertNotNull(serializableSetList10);
        org.junit.Assert.assertNotNull(objSetList12);
        org.junit.Assert.assertNotNull(strComparableSetList14);
        org.junit.Assert.assertNotNull(strSetList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "", "" };
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList10 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray6, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.Object>> objSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.Object[]) strArray6, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, 100);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList16 = com.thealgorithms.backtracking.Combination.combination(strArray6, (int) '4');
        java.lang.Class<?> wildcardClass17 = strSetList16.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strComparableSetList8);
        org.junit.Assert.assertNotNull(serializableSetList10);
        org.junit.Assert.assertNotNull(objSetList12);
        org.junit.Assert.assertNotNull(strComparableSetList14);
        org.junit.Assert.assertNotNull(strSetList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
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
        java.lang.Class<?> wildcardClass21 = strSetListArray12.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strSetList9);
        org.junit.Assert.assertNotNull(listArray11);
        org.junit.Assert.assertNotNull(strSetListArray12);
        org.junit.Assert.assertNull(setListSetList18);
        org.junit.Assert.assertNull(setListSetList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable>> constableSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[]) strArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList12 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(charSequenceSetList6);
        org.junit.Assert.assertNotNull(constantDescSetList8);
        org.junit.Assert.assertNotNull(constableSetList10);
        org.junit.Assert.assertNotNull(strSetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        java.lang.reflect.GenericDeclaration[][][] genericDeclarationArray0 = new java.lang.reflect.GenericDeclaration[][][] {};
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][]>> genericDeclarationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(genericDeclarationArray0, 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][]>> genericDeclarationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(genericDeclarationArray0, 10);
        java.lang.Class<?> wildcardClass5 = genericDeclarationArraySetList4.getClass();
        org.junit.Assert.assertNotNull(genericDeclarationArray0);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList2);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (byte) 100);
        java.lang.Class<?> wildcardClass7 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(typeDescriptorSetList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        java.lang.reflect.GenericDeclaration[][][] genericDeclarationArray0 = new java.lang.reflect.GenericDeclaration[][][] {};
        java.lang.reflect.GenericDeclaration[][][] genericDeclarationArray1 = new java.lang.reflect.GenericDeclaration[][][] {};
        java.lang.reflect.GenericDeclaration[][][] genericDeclarationArray2 = new java.lang.reflect.GenericDeclaration[][][] {};
        java.lang.reflect.GenericDeclaration[][][][] genericDeclarationArray3 = new java.lang.reflect.GenericDeclaration[][][][] { genericDeclarationArray0, genericDeclarationArray1, genericDeclarationArray2 };
        java.lang.reflect.GenericDeclaration[][][] genericDeclarationArray4 = new java.lang.reflect.GenericDeclaration[][][] {};
        java.lang.reflect.GenericDeclaration[][][] genericDeclarationArray5 = new java.lang.reflect.GenericDeclaration[][][] {};
        java.lang.reflect.GenericDeclaration[][][] genericDeclarationArray6 = new java.lang.reflect.GenericDeclaration[][][] {};
        java.lang.reflect.GenericDeclaration[][][][] genericDeclarationArray7 = new java.lang.reflect.GenericDeclaration[][][][] { genericDeclarationArray4, genericDeclarationArray5, genericDeclarationArray6 };
        java.lang.reflect.GenericDeclaration[][][] genericDeclarationArray8 = new java.lang.reflect.GenericDeclaration[][][] {};
        java.lang.reflect.GenericDeclaration[][][] genericDeclarationArray9 = new java.lang.reflect.GenericDeclaration[][][] {};
        java.lang.reflect.GenericDeclaration[][][] genericDeclarationArray10 = new java.lang.reflect.GenericDeclaration[][][] {};
        java.lang.reflect.GenericDeclaration[][][][] genericDeclarationArray11 = new java.lang.reflect.GenericDeclaration[][][][] { genericDeclarationArray8, genericDeclarationArray9, genericDeclarationArray10 };
        java.lang.reflect.GenericDeclaration[][][] genericDeclarationArray12 = new java.lang.reflect.GenericDeclaration[][][] {};
        java.lang.reflect.GenericDeclaration[][][] genericDeclarationArray13 = new java.lang.reflect.GenericDeclaration[][][] {};
        java.lang.reflect.GenericDeclaration[][][] genericDeclarationArray14 = new java.lang.reflect.GenericDeclaration[][][] {};
        java.lang.reflect.GenericDeclaration[][][][] genericDeclarationArray15 = new java.lang.reflect.GenericDeclaration[][][][] { genericDeclarationArray12, genericDeclarationArray13, genericDeclarationArray14 };
        java.lang.reflect.GenericDeclaration[][][] genericDeclarationArray16 = new java.lang.reflect.GenericDeclaration[][][] {};
        java.lang.reflect.GenericDeclaration[][][] genericDeclarationArray17 = new java.lang.reflect.GenericDeclaration[][][] {};
        java.lang.reflect.GenericDeclaration[][][] genericDeclarationArray18 = new java.lang.reflect.GenericDeclaration[][][] {};
        java.lang.reflect.GenericDeclaration[][][][] genericDeclarationArray19 = new java.lang.reflect.GenericDeclaration[][][][] { genericDeclarationArray16, genericDeclarationArray17, genericDeclarationArray18 };
        java.lang.reflect.GenericDeclaration[][][] genericDeclarationArray20 = new java.lang.reflect.GenericDeclaration[][][] {};
        java.lang.reflect.GenericDeclaration[][][] genericDeclarationArray21 = new java.lang.reflect.GenericDeclaration[][][] {};
        java.lang.reflect.GenericDeclaration[][][] genericDeclarationArray22 = new java.lang.reflect.GenericDeclaration[][][] {};
        java.lang.reflect.GenericDeclaration[][][][] genericDeclarationArray23 = new java.lang.reflect.GenericDeclaration[][][][] { genericDeclarationArray20, genericDeclarationArray21, genericDeclarationArray22 };
        java.lang.reflect.GenericDeclaration[][][][][] genericDeclarationArray24 = new java.lang.reflect.GenericDeclaration[][][][][] { genericDeclarationArray3, genericDeclarationArray7, genericDeclarationArray11, genericDeclarationArray15, genericDeclarationArray19, genericDeclarationArray23 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][][]>> genericDeclarationArraySetList26 = com.thealgorithms.backtracking.Combination.combination(genericDeclarationArray24, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(genericDeclarationArray0);
        org.junit.Assert.assertNotNull(genericDeclarationArray1);
        org.junit.Assert.assertNotNull(genericDeclarationArray2);
        org.junit.Assert.assertNotNull(genericDeclarationArray3);
        org.junit.Assert.assertNotNull(genericDeclarationArray4);
        org.junit.Assert.assertNotNull(genericDeclarationArray5);
        org.junit.Assert.assertNotNull(genericDeclarationArray6);
        org.junit.Assert.assertNotNull(genericDeclarationArray7);
        org.junit.Assert.assertNotNull(genericDeclarationArray8);
        org.junit.Assert.assertNotNull(genericDeclarationArray9);
        org.junit.Assert.assertNotNull(genericDeclarationArray10);
        org.junit.Assert.assertNotNull(genericDeclarationArray11);
        org.junit.Assert.assertNotNull(genericDeclarationArray12);
        org.junit.Assert.assertNotNull(genericDeclarationArray13);
        org.junit.Assert.assertNotNull(genericDeclarationArray14);
        org.junit.Assert.assertNotNull(genericDeclarationArray15);
        org.junit.Assert.assertNotNull(genericDeclarationArray16);
        org.junit.Assert.assertNotNull(genericDeclarationArray17);
        org.junit.Assert.assertNotNull(genericDeclarationArray18);
        org.junit.Assert.assertNotNull(genericDeclarationArray19);
        org.junit.Assert.assertNotNull(genericDeclarationArray20);
        org.junit.Assert.assertNotNull(genericDeclarationArray21);
        org.junit.Assert.assertNotNull(genericDeclarationArray22);
        org.junit.Assert.assertNotNull(genericDeclarationArray23);
        org.junit.Assert.assertNotNull(genericDeclarationArray24);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.constant.Constable>> constableSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[]) strArray2, (int) (byte) 100);
        java.lang.Class<?> wildcardClass7 = constableSetList6.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(constableSetList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        java.lang.constant.Constable[] constableArray0 = new java.lang.constant.Constable[] {};
        java.util.List<java.util.TreeSet<java.lang.constant.Constable>> constableSetList2 = com.thealgorithms.backtracking.Combination.combination(constableArray0, (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = constableSetList2.getClass();
        org.junit.Assert.assertNotNull(constableArray0);
        org.junit.Assert.assertNotNull(constableSetList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList4 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray2, 1);
        java.lang.Class<?> wildcardClass5 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strComparableSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, 0);
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
        org.junit.Assert.assertNotNull(typeDescriptorSetList8);
        org.junit.Assert.assertNull(genericDeclarationSetList10);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class[][] classArray4 = new java.lang.Class[1][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray5 = (java.lang.Class<?>[][]) classArray4;
        wildcardClassArray5[0] = classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList9 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray5, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList11 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray5, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class [Ljava.lang.Class; cannot be cast to class java.lang.Comparable ([Ljava.lang.Class; and java.lang.Comparable are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(classArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList9);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type>> typeSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[]) wildcardClassArray2, (int) (byte) 1);
        java.lang.Class<?> wildcardClass11 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(typeDescriptorSetList6);
        org.junit.Assert.assertNotNull(typeDescriptorSetList8);
        org.junit.Assert.assertNotNull(typeSetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        java.util.Collection[] collectionArray1 = new java.util.Collection[0];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.util.TreeSet<java.lang.String>>[] strSetCollectionArray2 = (java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray1;
        java.util.List<java.util.TreeSet<java.util.Collection<java.util.TreeSet<java.lang.String>>>> setCollectionSetList4 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray1, (-1));
        java.lang.Class<?> wildcardClass5 = setCollectionSetList4.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray6 = new java.lang.reflect.GenericDeclaration[] { wildcardClass5 };
        java.util.Collection[] collectionArray8 = new java.util.Collection[0];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.util.TreeSet<java.lang.String>>[] strSetCollectionArray9 = (java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray8;
        java.util.List<java.util.TreeSet<java.util.Collection<java.util.TreeSet<java.lang.String>>>> setCollectionSetList11 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray8, (-1));
        java.lang.Class<?> wildcardClass12 = setCollectionSetList11.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray13 = new java.lang.reflect.GenericDeclaration[] { wildcardClass12 };
        java.util.Collection[] collectionArray15 = new java.util.Collection[0];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.util.TreeSet<java.lang.String>>[] strSetCollectionArray16 = (java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray15;
        java.util.List<java.util.TreeSet<java.util.Collection<java.util.TreeSet<java.lang.String>>>> setCollectionSetList18 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray15, (-1));
        java.lang.Class<?> wildcardClass19 = setCollectionSetList18.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray20 = new java.lang.reflect.GenericDeclaration[] { wildcardClass19 };
        java.util.Collection[] collectionArray22 = new java.util.Collection[0];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.util.TreeSet<java.lang.String>>[] strSetCollectionArray23 = (java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray22;
        java.util.List<java.util.TreeSet<java.util.Collection<java.util.TreeSet<java.lang.String>>>> setCollectionSetList25 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray22, (-1));
        java.lang.Class<?> wildcardClass26 = setCollectionSetList25.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray27 = new java.lang.reflect.GenericDeclaration[] { wildcardClass26 };
        java.util.Collection[] collectionArray29 = new java.util.Collection[0];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.util.TreeSet<java.lang.String>>[] strSetCollectionArray30 = (java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray29;
        java.util.List<java.util.TreeSet<java.util.Collection<java.util.TreeSet<java.lang.String>>>> setCollectionSetList32 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray29, (-1));
        java.lang.Class<?> wildcardClass33 = setCollectionSetList32.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray34 = new java.lang.reflect.GenericDeclaration[] { wildcardClass33 };
        java.util.Collection[] collectionArray36 = new java.util.Collection[0];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.util.TreeSet<java.lang.String>>[] strSetCollectionArray37 = (java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray36;
        java.util.List<java.util.TreeSet<java.util.Collection<java.util.TreeSet<java.lang.String>>>> setCollectionSetList39 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray36, (-1));
        java.lang.Class<?> wildcardClass40 = setCollectionSetList39.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray41 = new java.lang.reflect.GenericDeclaration[] { wildcardClass40 };
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray42 = new java.lang.reflect.GenericDeclaration[][] { genericDeclarationArray6, genericDeclarationArray13, genericDeclarationArray20, genericDeclarationArray27, genericDeclarationArray34, genericDeclarationArray41 };
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList44 = com.thealgorithms.backtracking.Combination.combination(genericDeclarationArray42, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList46 = com.thealgorithms.backtracking.Combination.combination(genericDeclarationArray42, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collectionArray1);
        org.junit.Assert.assertNotNull(strSetCollectionArray2);
        org.junit.Assert.assertNotNull(setCollectionSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(genericDeclarationArray6);
        org.junit.Assert.assertNotNull(collectionArray8);
        org.junit.Assert.assertNotNull(strSetCollectionArray9);
        org.junit.Assert.assertNotNull(setCollectionSetList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(genericDeclarationArray13);
        org.junit.Assert.assertNotNull(collectionArray15);
        org.junit.Assert.assertNotNull(strSetCollectionArray16);
        org.junit.Assert.assertNotNull(setCollectionSetList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(genericDeclarationArray20);
        org.junit.Assert.assertNotNull(collectionArray22);
        org.junit.Assert.assertNotNull(strSetCollectionArray23);
        org.junit.Assert.assertNotNull(setCollectionSetList25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(genericDeclarationArray27);
        org.junit.Assert.assertNotNull(collectionArray29);
        org.junit.Assert.assertNotNull(strSetCollectionArray30);
        org.junit.Assert.assertNotNull(setCollectionSetList32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(genericDeclarationArray34);
        org.junit.Assert.assertNotNull(collectionArray36);
        org.junit.Assert.assertNotNull(strSetCollectionArray37);
        org.junit.Assert.assertNotNull(setCollectionSetList39);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(genericDeclarationArray41);
        org.junit.Assert.assertNotNull(genericDeclarationArray42);
        org.junit.Assert.assertNull(genericDeclarationArraySetList44);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.lang.Class<?> wildcardClass5 = wildcardClassArraySetList4.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "", "" };
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList10 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray6, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList12 = com.thealgorithms.backtracking.Combination.combination(strArray6, 1);
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray6, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList16 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray6, 2);
        java.lang.Class<?> wildcardClass17 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strComparableSetList8);
        org.junit.Assert.assertNotNull(serializableSetList10);
        org.junit.Assert.assertNotNull(strSetList12);
        org.junit.Assert.assertNotNull(constantDescSetList14);
        org.junit.Assert.assertNotNull(serializableSetList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable>> constableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[]) strArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList10 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) (short) 1);
        java.lang.Class<?> wildcardClass11 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(charSequenceSetList6);
        org.junit.Assert.assertNotNull(constableSetList8);
        org.junit.Assert.assertNotNull(strSetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, (int) (byte) 1);
        java.lang.Class<?> wildcardClass7 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(charSequenceSetList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, 0);
        java.lang.Class<?> wildcardClass13 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(genericDeclarationSetList6);
        org.junit.Assert.assertNotNull(typeDescriptorSetList8);
        org.junit.Assert.assertNull(genericDeclarationSetList10);
        org.junit.Assert.assertNull(genericDeclarationSetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass7 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "", "" };
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList10 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray6, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList12 = com.thealgorithms.backtracking.Combination.combination(strArray6, 1);
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray6, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.lang.Object>> objSetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.Object[]) strArray6, (int) (byte) 10);
        java.lang.Class<?> wildcardClass17 = objSetList16.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strComparableSetList8);
        org.junit.Assert.assertNotNull(serializableSetList10);
        org.junit.Assert.assertNotNull(strSetList12);
        org.junit.Assert.assertNotNull(constantDescSetList14);
        org.junit.Assert.assertNotNull(objSetList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        java.lang.String[][][] strArray0 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray1 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray2 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray3 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray4 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray5 = new java.lang.String[][][] {};
        java.lang.String[][][][] strArray6 = new java.lang.String[][][][] { strArray0, strArray1, strArray2, strArray3, strArray4, strArray5 };
        java.lang.String[][][] strArray7 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray8 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray9 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray10 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray11 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray12 = new java.lang.String[][][] {};
        java.lang.String[][][][] strArray13 = new java.lang.String[][][][] { strArray7, strArray8, strArray9, strArray10, strArray11, strArray12 };
        java.lang.String[][][] strArray14 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray15 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray16 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray17 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray18 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray19 = new java.lang.String[][][] {};
        java.lang.String[][][][] strArray20 = new java.lang.String[][][][] { strArray14, strArray15, strArray16, strArray17, strArray18, strArray19 };
        java.lang.String[][][][][] strArray21 = new java.lang.String[][][][][] { strArray6, strArray13, strArray20 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.String[][][][]>> strArraySetList23 = com.thealgorithms.backtracking.Combination.combination(strArray21, (-1));
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
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        java.util.Collection[][] collectionArray0 = new java.util.Collection[][] {};
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList2 = com.thealgorithms.backtracking.Combination.combination(collectionArray0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = collectionArray0.getClass();
        org.junit.Assert.assertNotNull(collectionArray0);
        org.junit.Assert.assertNull(collectionArraySetList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        java.util.Collection[][] collectionArray0 = new java.util.Collection[][] {};
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList2 = com.thealgorithms.backtracking.Combination.combination(collectionArray0, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList4 = com.thealgorithms.backtracking.Combination.combination(collectionArray0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass5 = collectionArray0.getClass();
        org.junit.Assert.assertNotNull(collectionArray0);
        org.junit.Assert.assertNull(collectionArraySetList2);
        org.junit.Assert.assertNotNull(collectionArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable>> constableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[]) strArray2, (int) (byte) 1);
        java.lang.Class<?> wildcardClass9 = strArray2.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray10 = new java.lang.reflect.GenericDeclaration[] { wildcardClass9 };
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList12 = com.thealgorithms.backtracking.Combination.combination(genericDeclarationArray10, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList14 = com.thealgorithms.backtracking.Combination.combination(genericDeclarationArray10, (int) (short) 0);
        java.lang.Class<?> wildcardClass15 = genericDeclarationArray10.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(charSequenceSetList6);
        org.junit.Assert.assertNotNull(constableSetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(genericDeclarationArray10);
        org.junit.Assert.assertNull(genericDeclarationSetList12);
        org.junit.Assert.assertNull(genericDeclarationSetList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList8 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) (byte) -1);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "", "", "", "", "" };
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList17 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray15, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList19 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray15, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList21 = com.thealgorithms.backtracking.Combination.combination(strArray15, 1);
        java.util.Collection[] collectionArray23 = new java.util.Collection[2];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.util.TreeSet<java.lang.String>>[] strSetCollectionArray24 = (java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray23;
        strSetCollectionArray24[0] = strSetList8;
        strSetCollectionArray24[1] = strSetList21;
        java.util.List<java.util.TreeSet<java.util.Collection<java.util.TreeSet<java.lang.String>>>> setCollectionSetList30 = com.thealgorithms.backtracking.Combination.combination(strSetCollectionArray24, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList32 = com.thealgorithms.backtracking.Combination.combination((java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]) strSetCollectionArray24, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass33 = setIterableSetList32.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(constantDescSetList6);
        org.junit.Assert.assertNotNull(strSetList8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strComparableSetList17);
        org.junit.Assert.assertNotNull(serializableSetList19);
        org.junit.Assert.assertNotNull(strSetList21);
        org.junit.Assert.assertNotNull(collectionArray23);
        org.junit.Assert.assertNotNull(strSetCollectionArray24);
        org.junit.Assert.assertNull(setCollectionSetList30);
        org.junit.Assert.assertNull(setIterableSetList32);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class[][] classArray4 = new java.lang.Class[1][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray5 = (java.lang.Class<?>[][]) classArray4;
        wildcardClassArray5[0] = classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList9 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray5, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList11 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray5, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class [Ljava.lang.Class; cannot be cast to class java.lang.Comparable ([Ljava.lang.Class; and java.lang.Comparable are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(classArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList9);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, (-1));
        java.lang.Class<?> wildcardClass5 = strArraySetList4.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNotNull(strArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        java.util.Collection[][] collectionArray0 = new java.util.Collection[][] {};
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList2 = com.thealgorithms.backtracking.Combination.combination(collectionArray0, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList4 = com.thealgorithms.backtracking.Combination.combination(collectionArray0, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList6 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) collectionArray0, (int) '4');
        java.lang.Class<?> wildcardClass7 = serializableSetList6.getClass();
        org.junit.Assert.assertNotNull(collectionArray0);
        org.junit.Assert.assertNull(collectionArraySetList2);
        org.junit.Assert.assertNotNull(collectionArraySetList4);
        org.junit.Assert.assertNotNull(serializableSetList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        java.lang.Iterable[] iterableArray1 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.TreeSet<java.lang.String>>[] strSetIterableArray2 = (java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]) iterableArray1;
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList4 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList6 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList8 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, (int) (byte) 10);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList10 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, (int) (short) 100);
        java.lang.Class<?> wildcardClass11 = setIterableSetList10.getClass();
        org.junit.Assert.assertNotNull(iterableArray1);
        org.junit.Assert.assertNotNull(strSetIterableArray2);
        org.junit.Assert.assertNotNull(setIterableSetList4);
        org.junit.Assert.assertNull(setIterableSetList6);
        org.junit.Assert.assertNotNull(setIterableSetList8);
        org.junit.Assert.assertNotNull(setIterableSetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList8 = com.thealgorithms.backtracking.Combination.combination(strArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray2, 1);
        java.lang.Class<?> wildcardClass11 = constantDescSetList10.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(charSequenceSetList6);
        org.junit.Assert.assertNull(strSetList8);
        org.junit.Assert.assertNotNull(constantDescSetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        java.lang.constant.ConstantDesc[] constantDescArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList2 = com.thealgorithms.backtracking.Combination.combination(constantDescArray0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"[Ljava.lang.Object;.clone()\" because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.lang.String[][][] strArray1 = new java.lang.String[][][] { strArray0 };
        java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList3 = com.thealgorithms.backtracking.Combination.combination(strArray1, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList5 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray1, 0);
        java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList7 = com.thealgorithms.backtracking.Combination.combination(strArray1, (int) '#');
        java.lang.Class<?> wildcardClass8 = strArraySetList7.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArraySetList3);
        org.junit.Assert.assertNull(serializableSetList5);
        org.junit.Assert.assertNotNull(strArraySetList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        java.util.Collection[][] collectionArray0 = new java.util.Collection[][] {};
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList2 = com.thealgorithms.backtracking.Combination.combination(collectionArray0, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList4 = com.thealgorithms.backtracking.Combination.combination(collectionArray0, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList6 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) collectionArray0, (int) '4');
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList8 = com.thealgorithms.backtracking.Combination.combination(collectionArray0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass9 = collectionArraySetList8.getClass();
        org.junit.Assert.assertNotNull(collectionArray0);
        org.junit.Assert.assertNull(collectionArraySetList2);
        org.junit.Assert.assertNotNull(collectionArraySetList4);
        org.junit.Assert.assertNotNull(serializableSetList6);
        org.junit.Assert.assertNotNull(collectionArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        java.lang.Class[][][] classArray1 = new java.lang.Class[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][] wildcardClassArray2 = (java.lang.Class<?>[][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][]>> typeArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][]) wildcardClassArray2, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = typeArraySetList6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNull(typeArraySetList6);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
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
        java.lang.Class<?> wildcardClass21 = strSetListArray12.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strSetList9);
        org.junit.Assert.assertNotNull(listArray11);
        org.junit.Assert.assertNotNull(strSetListArray12);
        org.junit.Assert.assertNull(setListSetList18);
        org.junit.Assert.assertNull(setCollectionSetList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        java.lang.reflect.GenericDeclaration[][][][] genericDeclarationArray0 = new java.lang.reflect.GenericDeclaration[][][][] {};
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][]>> genericDeclarationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(genericDeclarationArray0, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][]>> genericDeclarationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(genericDeclarationArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = genericDeclarationArraySetList4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(genericDeclarationArray0);
        org.junit.Assert.assertNull(genericDeclarationArraySetList2);
        org.junit.Assert.assertNull(genericDeclarationArraySetList4);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) '#');
        java.lang.Class<?> wildcardClass9 = typeDescriptorSetList8.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(typeDescriptorSetList6);
        org.junit.Assert.assertNotNull(typeDescriptorSetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList8 = com.thealgorithms.backtracking.Combination.combination(strArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray2, 1);
        java.lang.Class<?> wildcardClass11 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(charSequenceSetList6);
        org.junit.Assert.assertNull(strSetList8);
        org.junit.Assert.assertNotNull(constantDescSetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        java.util.Collection[][] collectionArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList2 = com.thealgorithms.backtracking.Combination.combination(collectionArray0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"[Ljava.lang.Object;.clone()\" because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        java.lang.reflect.GenericDeclaration[][][][] genericDeclarationArray0 = new java.lang.reflect.GenericDeclaration[][][][] {};
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][]>> genericDeclarationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(genericDeclarationArray0, (int) (short) 1);
        java.lang.Class<?> wildcardClass3 = genericDeclarationArraySetList2.getClass();
        org.junit.Assert.assertNotNull(genericDeclarationArray0);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList9 = com.thealgorithms.backtracking.Combination.combination(strArray7, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList11 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray7, 10);
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList13 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray7, 10);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable>> constableSetList15 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[]) strArray7, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList17 = com.thealgorithms.backtracking.Combination.combination(strArray7, (int) (byte) -1);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList22 = com.thealgorithms.backtracking.Combination.combination(strArray20, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList24 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray20, 1);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList26 = com.thealgorithms.backtracking.Combination.combination(strArray20, (int) (byte) -1);
        java.lang.String[] strArray29 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList31 = com.thealgorithms.backtracking.Combination.combination(strArray29, (int) '#');
        java.util.List[] listArray33 = new java.util.List[4];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[] strSetListArray34 = (java.util.List<java.util.TreeSet<java.lang.String>>[]) listArray33;
        strSetListArray34[0] = strSetList4;
        strSetListArray34[1] = strSetList17;
        strSetListArray34[2] = strSetList26;
        strSetListArray34[3] = strSetList31;
        java.lang.String[] strArray45 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList47 = com.thealgorithms.backtracking.Combination.combination(strArray45, (int) '#');
        java.lang.String[] strArray50 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList52 = com.thealgorithms.backtracking.Combination.combination(strArray50, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList54 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray50, 10);
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList56 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray50, 10);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable>> constableSetList58 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[]) strArray50, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList60 = com.thealgorithms.backtracking.Combination.combination(strArray50, (int) (byte) -1);
        java.lang.String[] strArray63 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList65 = com.thealgorithms.backtracking.Combination.combination(strArray63, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList67 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray63, 1);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList69 = com.thealgorithms.backtracking.Combination.combination(strArray63, (int) (byte) -1);
        java.lang.String[] strArray72 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList74 = com.thealgorithms.backtracking.Combination.combination(strArray72, (int) '#');
        java.util.List[] listArray76 = new java.util.List[4];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[] strSetListArray77 = (java.util.List<java.util.TreeSet<java.lang.String>>[]) listArray76;
        strSetListArray77[0] = strSetList47;
        strSetListArray77[1] = strSetList60;
        strSetListArray77[2] = strSetList69;
        strSetListArray77[3] = strSetList74;
        java.util.List[][] listArray87 = new java.util.List[2][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][] strSetListArray88 = (java.util.List<java.util.TreeSet<java.lang.String>>[][]) listArray87;
        strSetListArray88[0] = strSetListArray34;
        strSetListArray88[1] = strSetListArray77;
        java.util.List[][][] listArray94 = new java.util.List[1][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][] strSetListArray95 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][]) listArray94;
        strSetListArray95[0] = strSetListArray88;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][]>> listArraySetList99 = com.thealgorithms.backtracking.Combination.combination(strSetListArray95, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class [[Ljava.util.List; cannot be cast to class java.lang.Comparable ([[Ljava.util.List; and java.lang.Comparable are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strSetList9);
        org.junit.Assert.assertNotNull(charSequenceSetList11);
        org.junit.Assert.assertNotNull(constantDescSetList13);
        org.junit.Assert.assertNotNull(constableSetList15);
        org.junit.Assert.assertNotNull(strSetList17);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strSetList22);
        org.junit.Assert.assertNotNull(constantDescSetList24);
        org.junit.Assert.assertNotNull(strSetList26);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strSetList31);
        org.junit.Assert.assertNotNull(listArray33);
        org.junit.Assert.assertNotNull(strSetListArray34);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(strSetList47);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(strSetList52);
        org.junit.Assert.assertNotNull(charSequenceSetList54);
        org.junit.Assert.assertNotNull(constantDescSetList56);
        org.junit.Assert.assertNotNull(constableSetList58);
        org.junit.Assert.assertNotNull(strSetList60);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(strSetList65);
        org.junit.Assert.assertNotNull(constantDescSetList67);
        org.junit.Assert.assertNotNull(strSetList69);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertNotNull(strSetList74);
        org.junit.Assert.assertNotNull(listArray76);
        org.junit.Assert.assertNotNull(strSetListArray77);
        org.junit.Assert.assertNotNull(listArray87);
        org.junit.Assert.assertNotNull(strSetListArray88);
        org.junit.Assert.assertNotNull(listArray94);
        org.junit.Assert.assertNotNull(strSetListArray95);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList4 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = serializableSetList4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNull(serializableSetList4);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) '#');
        java.lang.Class<?> wildcardClass11 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(genericDeclarationSetList6);
        org.junit.Assert.assertNotNull(typeDescriptorSetList8);
        org.junit.Assert.assertNotNull(genericDeclarationSetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable>> constableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[]) strArray2, (int) (byte) 1);
        java.lang.Class<?> wildcardClass9 = constableSetList8.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(charSequenceSetList6);
        org.junit.Assert.assertNotNull(constableSetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "", "" };
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList10 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray6, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList12 = com.thealgorithms.backtracking.Combination.combination(strArray6, 1);
        java.lang.Class<?> wildcardClass13 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strComparableSetList8);
        org.junit.Assert.assertNotNull(serializableSetList10);
        org.junit.Assert.assertNotNull(strSetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = genericDeclarationArraySetList10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNull(genericDeclarationArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNull(genericDeclarationArraySetList10);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.lang.String[][][] strArray1 = new java.lang.String[][][] { strArray0 };
        java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList3 = com.thealgorithms.backtracking.Combination.combination(strArray1, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList5 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray1, 0);
        java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList7 = com.thealgorithms.backtracking.Combination.combination(strArray1, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList9 = com.thealgorithms.backtracking.Combination.combination(strArray1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList11 = com.thealgorithms.backtracking.Combination.combination(strArray1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class [[Ljava.lang.String; cannot be cast to class java.lang.Comparable ([[Ljava.lang.String; and java.lang.Comparable are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArraySetList3);
        org.junit.Assert.assertNull(serializableSetList5);
        org.junit.Assert.assertNotNull(strArraySetList7);
        org.junit.Assert.assertNull(strArraySetList9);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.AnnotatedElement>> annotatedElementSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.AnnotatedElement[]) wildcardClassArray2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass9 = annotatedElementSetList8.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNull(typeDescriptorSetList6);
        org.junit.Assert.assertNotNull(annotatedElementSetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList8 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) (byte) -1);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList13 = com.thealgorithms.backtracking.Combination.combination(strArray11, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList15 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray11, 1);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList17 = com.thealgorithms.backtracking.Combination.combination(strArray11, (int) (byte) -1);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList22 = com.thealgorithms.backtracking.Combination.combination(strArray20, (int) '#');
        java.util.List[] listArray24 = new java.util.List[3];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[] strSetListArray25 = (java.util.List<java.util.TreeSet<java.lang.String>>[]) listArray24;
        strSetListArray25[0] = strSetList8;
        strSetListArray25[1] = strSetList17;
        strSetListArray25[2] = strSetList22;
        java.util.List[][] listArray33 = new java.util.List[1][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][] strSetListArray34 = (java.util.List<java.util.TreeSet<java.lang.String>>[][]) listArray33;
        strSetListArray34[0] = strSetListArray25;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList38 = com.thealgorithms.backtracking.Combination.combination(strSetListArray34, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class [Ljava.util.List; cannot be cast to class java.lang.Comparable ([Ljava.util.List; and java.lang.Comparable are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(constantDescSetList6);
        org.junit.Assert.assertNotNull(strSetList8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strSetList13);
        org.junit.Assert.assertNotNull(constantDescSetList15);
        org.junit.Assert.assertNotNull(strSetList17);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strSetList22);
        org.junit.Assert.assertNotNull(listArray24);
        org.junit.Assert.assertNotNull(strSetListArray25);
        org.junit.Assert.assertNotNull(listArray33);
        org.junit.Assert.assertNotNull(strSetListArray34);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.String>> strSetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"[Ljava.lang.Object;.clone()\" because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        java.lang.Iterable[] iterableArray1 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.TreeSet<java.lang.String>>[] strSetIterableArray2 = (java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]) iterableArray1;
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList4 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList6 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList8 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, (int) ' ');
        java.lang.Class<?> wildcardClass9 = strSetIterableArray2.getClass();
        org.junit.Assert.assertNotNull(iterableArray1);
        org.junit.Assert.assertNotNull(strSetIterableArray2);
        org.junit.Assert.assertNotNull(setIterableSetList4);
        org.junit.Assert.assertNull(setIterableSetList6);
        org.junit.Assert.assertNotNull(setIterableSetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "", "" };
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, (int) (byte) 1);
        java.lang.Class<?> wildcardClass11 = strComparableSetList10.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strComparableSetList8);
        org.junit.Assert.assertNotNull(strComparableSetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
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
            java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>>> setListSetList22 = com.thealgorithms.backtracking.Combination.combination(strSetListArray12, (int) '4');
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
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        java.lang.Iterable[] iterableArray1 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.TreeSet<java.lang.String>>[] strSetIterableArray2 = (java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]) iterableArray1;
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList4 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList6 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList8 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.Object>> objSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.Object[]) strSetIterableArray2, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = objSetList10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterableArray1);
        org.junit.Assert.assertNotNull(strSetIterableArray2);
        org.junit.Assert.assertNotNull(setIterableSetList4);
        org.junit.Assert.assertNull(setIterableSetList6);
        org.junit.Assert.assertNotNull(setIterableSetList8);
        org.junit.Assert.assertNull(objSetList10);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, (-1));
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) strArray0, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.CharSequence[]>> charSequenceArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[][]) strArray0, 1);
        java.lang.Class<?> wildcardClass9 = charSequenceArraySetList8.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNotNull(strArraySetList4);
        org.junit.Assert.assertNotNull(constableArraySetList6);
        org.junit.Assert.assertNotNull(charSequenceArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = wildcardClassArraySetList6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNull(wildcardClassArraySetList6);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList4 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray0, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strArray0, 0);
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strArray0, (-1));
        java.lang.Class<?> wildcardClass9 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNull(serializableSetList4);
        org.junit.Assert.assertNull(strArraySetList6);
        org.junit.Assert.assertNotNull(strArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 1);
        java.lang.Class<?> wildcardClass9 = wildcardClassArraySetList8.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNull(genericDeclarationArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList4 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray0, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strArray0, 0);
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strArray0, (-1));
        java.util.List<java.util.TreeSet<java.lang.CharSequence[]>> charSequenceArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[][]) strArray0, (-1));
        java.lang.Class<?> wildcardClass11 = charSequenceArraySetList10.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNull(serializableSetList4);
        org.junit.Assert.assertNull(strArraySetList6);
        org.junit.Assert.assertNotNull(strArraySetList8);
        org.junit.Assert.assertNotNull(charSequenceArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!", "" };
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList7 = com.thealgorithms.backtracking.Combination.combination(charSequenceArray5, (int) (byte) 1);
        java.lang.Class<?> wildcardClass8 = charSequenceArray5.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceSetList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.AnnotatedElement>> annotatedElementSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.AnnotatedElement[]) wildcardClassArray2, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (byte) 1);
        java.lang.Class<?> wildcardClass11 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNull(typeDescriptorSetList6);
        org.junit.Assert.assertNotNull(annotatedElementSetList8);
        org.junit.Assert.assertNotNull(typeDescriptorSetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, (int) (byte) 0);
        java.lang.Class<?> wildcardClass11 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNull(genericDeclarationArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNull(genericDeclarationArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        java.util.Collection[][] collectionArray0 = new java.util.Collection[][] {};
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList2 = com.thealgorithms.backtracking.Combination.combination(collectionArray0, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList4 = com.thealgorithms.backtracking.Combination.combination(collectionArray0, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList6 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) collectionArray0, (int) '4');
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList8 = com.thealgorithms.backtracking.Combination.combination(collectionArray0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass9 = collectionArray0.getClass();
        org.junit.Assert.assertNotNull(collectionArray0);
        org.junit.Assert.assertNull(collectionArraySetList2);
        org.junit.Assert.assertNotNull(collectionArraySetList4);
        org.junit.Assert.assertNotNull(serializableSetList6);
        org.junit.Assert.assertNotNull(collectionArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        java.lang.Class<?>[][][][] wildcardClassArray0 = null;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList2 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray0, (int) (byte) 0);
        org.junit.Assert.assertNull(wildcardClassArraySetList2);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        java.lang.String[][][][] strArray0 = new java.lang.String[][][][] {};
        java.lang.String[][][][] strArray1 = new java.lang.String[][][][] {};
        java.lang.String[][][][][] strArray2 = new java.lang.String[][][][][] { strArray0, strArray1 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.String[][][][]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class [[[[Ljava.lang.String; cannot be cast to class java.lang.Comparable ([[[[Ljava.lang.String; and java.lang.Comparable are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "", "" };
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList10 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray6, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.Object>> objSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.Object[]) strArray6, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray6, (int) (short) 0);
        java.lang.Class<?> wildcardClass15 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strComparableSetList8);
        org.junit.Assert.assertNotNull(serializableSetList10);
        org.junit.Assert.assertNotNull(objSetList12);
        org.junit.Assert.assertNull(constantDescSetList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        java.lang.reflect.GenericDeclaration[][][] genericDeclarationArray0 = new java.lang.reflect.GenericDeclaration[][][] {};
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][]>> genericDeclarationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(genericDeclarationArray0, 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][]>> genericDeclarationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(genericDeclarationArray0, 10);
        java.lang.Class<?> wildcardClass5 = genericDeclarationArray0.getClass();
        org.junit.Assert.assertNotNull(genericDeclarationArray0);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList2);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.AnnotatedElement>> annotatedElementSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.AnnotatedElement[]) wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type>> typeSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[]) wildcardClassArray2, 2);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (short) 1);
        java.lang.Class<?> wildcardClass13 = typeDescriptorSetList12.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNull(typeDescriptorSetList6);
        org.junit.Assert.assertNotNull(annotatedElementSetList8);
        org.junit.Assert.assertNotNull(typeSetList10);
        org.junit.Assert.assertNotNull(typeDescriptorSetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.lang.String[][][] strArray1 = new java.lang.String[][][] { strArray0 };
        java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList3 = com.thealgorithms.backtracking.Combination.combination(strArray1, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList5 = com.thealgorithms.backtracking.Combination.combination(strArray1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class [[Ljava.lang.String; cannot be cast to class java.lang.Comparable ([[Ljava.lang.String; and java.lang.Comparable are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArraySetList3);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        java.lang.Class[][][] classArray1 = new java.lang.Class[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][] wildcardClassArray2 = (java.lang.Class<?>[][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = wildcardClassArraySetList6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNull(wildcardClassArraySetList6);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (byte) 0);
        java.lang.Class<?> wildcardClass15 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(genericDeclarationSetList6);
        org.junit.Assert.assertNotNull(typeDescriptorSetList8);
        org.junit.Assert.assertNull(genericDeclarationSetList10);
        org.junit.Assert.assertNull(genericDeclarationSetList12);
        org.junit.Assert.assertNull(typeDescriptorSetList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        java.util.Collection[][] collectionArray0 = new java.util.Collection[][] {};
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList2 = com.thealgorithms.backtracking.Combination.combination(collectionArray0, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList4 = com.thealgorithms.backtracking.Combination.combination(collectionArray0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass5 = collectionArraySetList4.getClass();
        org.junit.Assert.assertNotNull(collectionArray0);
        org.junit.Assert.assertNull(collectionArraySetList2);
        org.junit.Assert.assertNotNull(collectionArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        java.lang.Class[][][][] classArray1 = new java.lang.Class[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 100);
        java.lang.Class<?> wildcardClass5 = wildcardClassArraySetList4.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][]) wildcardClassArray2, (int) (short) 100);
        java.lang.Class<?> wildcardClass9 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList6);
        org.junit.Assert.assertNotNull(typeArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        java.lang.reflect.GenericDeclaration[][][] genericDeclarationArray0 = new java.lang.reflect.GenericDeclaration[][][] {};
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][]>> genericDeclarationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(genericDeclarationArray0, 100);
        java.lang.Class<?> wildcardClass3 = genericDeclarationArray0.getClass();
        org.junit.Assert.assertNotNull(genericDeclarationArray0);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        java.util.List[][] listArray1 = new java.util.List[0][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][]) listArray1;
        java.util.List[][] listArray4 = new java.util.List[0][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][] strSetListArray5 = (java.util.List<java.util.TreeSet<java.lang.String>>[][]) listArray4;
        java.util.List[][] listArray7 = new java.util.List[0][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][] strSetListArray8 = (java.util.List<java.util.TreeSet<java.lang.String>>[][]) listArray7;
        java.util.List[][] listArray10 = new java.util.List[0][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][] strSetListArray11 = (java.util.List<java.util.TreeSet<java.lang.String>>[][]) listArray10;
        java.util.List[][][] listArray13 = new java.util.List[4][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][] strSetListArray14 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][]) listArray13;
        strSetListArray14[0] = strSetListArray2;
        strSetListArray14[1] = strSetListArray5;
        strSetListArray14[2] = strSetListArray8;
        strSetListArray14[3] = strSetListArray11;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][]>> listArraySetList24 = com.thealgorithms.backtracking.Combination.combination(strSetListArray14, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class [[Ljava.util.List; cannot be cast to class java.lang.Comparable ([[Ljava.util.List; and java.lang.Comparable are in module java.base of loader 'bootstrap')");
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
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable>> constableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[]) strArray2, (int) (byte) 1);
        java.lang.Class<?> wildcardClass9 = strArray2.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray10 = new java.lang.reflect.GenericDeclaration[] { wildcardClass9 };
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList12 = com.thealgorithms.backtracking.Combination.combination(genericDeclarationArray10, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = genericDeclarationSetList12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(charSequenceSetList6);
        org.junit.Assert.assertNotNull(constableSetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(genericDeclarationArray10);
        org.junit.Assert.assertNull(genericDeclarationSetList12);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        com.thealgorithms.backtracking.Combination combination0 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination1 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination2 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination3 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination4 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination5 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination[] combinationArray6 = new com.thealgorithms.backtracking.Combination[] { combination0, combination1, combination2, combination3, combination4, combination5 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination>> combinationSetList8 = com.thealgorithms.backtracking.Combination.combination(combinationArray6, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class com.thealgorithms.backtracking.Combination cannot be cast to class java.lang.Comparable (com.thealgorithms.backtracking.Combination is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(combinationArray6);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        java.lang.String[][][][] strArray0 = new java.lang.String[][][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) 10);
        java.util.List<java.util.TreeSet<java.lang.String[][][]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (short) 100);
        java.lang.Class<?> wildcardClass5 = strArraySetList4.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNotNull(strArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        java.util.List[][] listArray1 = new java.util.List[0][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) -1);
        java.lang.Class<?> wildcardClass5 = listArraySetList4.getClass();
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        java.util.List[][] listArray1 = new java.util.List[0][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]>> iterableArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.Iterable<java.util.TreeSet<java.lang.String>>[][]) strSetListArray2, 2);
        java.lang.Class<?> wildcardClass7 = strSetListArray2.getClass();
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArraySetList4);
        org.junit.Assert.assertNotNull(iterableArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        java.lang.reflect.GenericDeclaration[][][][] genericDeclarationArray0 = new java.lang.reflect.GenericDeclaration[][][][] {};
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][]>> genericDeclarationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(genericDeclarationArray0, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][]>> genericDeclarationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(genericDeclarationArray0, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][]>> genericDeclarationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(genericDeclarationArray0, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][]>> genericDeclarationArraySetList8 = com.thealgorithms.backtracking.Combination.combination(genericDeclarationArray0, 10);
        java.lang.Class<?> wildcardClass9 = genericDeclarationArray0.getClass();
        org.junit.Assert.assertNotNull(genericDeclarationArray0);
        org.junit.Assert.assertNull(genericDeclarationArraySetList2);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList4);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList6);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "", "" };
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList10 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray6, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList12 = com.thealgorithms.backtracking.Combination.combination(strArray6, 1);
        java.lang.Class<?> wildcardClass13 = strSetList12.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strComparableSetList8);
        org.junit.Assert.assertNotNull(serializableSetList10);
        org.junit.Assert.assertNotNull(strSetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        java.lang.constant.ConstantDesc[] constantDescArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList2 = com.thealgorithms.backtracking.Combination.combination(constantDescArray0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"[Ljava.lang.Object;.clone()\" because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "", "" };
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList10 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray6, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.Object>> objSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.Object[]) strArray6, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, 100);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList16 = com.thealgorithms.backtracking.Combination.combination(strArray6, (int) '4');
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList21 = com.thealgorithms.backtracking.Combination.combination(strArray19, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList23 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray19, 1);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList25 = com.thealgorithms.backtracking.Combination.combination(strArray19, (int) (byte) -1);
        java.util.List[] listArray27 = new java.util.List[2];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[] strSetListArray28 = (java.util.List<java.util.TreeSet<java.lang.String>>[]) listArray27;
        strSetListArray28[0] = strSetList16;
        strSetListArray28[1] = strSetList25;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>>> setListSetList34 = com.thealgorithms.backtracking.Combination.combination(strSetListArray28, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.util.LinkedList cannot be cast to class java.lang.Comparable (java.util.LinkedList and java.lang.Comparable are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strComparableSetList8);
        org.junit.Assert.assertNotNull(serializableSetList10);
        org.junit.Assert.assertNotNull(objSetList12);
        org.junit.Assert.assertNotNull(strComparableSetList14);
        org.junit.Assert.assertNotNull(strSetList16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strSetList21);
        org.junit.Assert.assertNotNull(constantDescSetList23);
        org.junit.Assert.assertNotNull(strSetList25);
        org.junit.Assert.assertNotNull(listArray27);
        org.junit.Assert.assertNotNull(strSetListArray28);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class[][] classArray4 = new java.lang.Class[1][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray5 = (java.lang.Class<?>[][]) classArray4;
        wildcardClassArray5[0] = classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList9 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray5, 10);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList11 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray5, (int) (short) 10);
        java.lang.Class<?> wildcardClass12 = wildcardClassArray5.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(classArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList9);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        java.lang.Class[][][][] classArray1 = new java.lang.Class[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][]) classArray1;
        java.lang.Class[][][][] classArray4 = new java.lang.Class[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][] wildcardClassArray5 = (java.lang.Class<?>[][][][]) classArray4;
        java.lang.Class[][][][] classArray7 = new java.lang.Class[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][] wildcardClassArray8 = (java.lang.Class<?>[][][][]) classArray7;
        java.lang.Class[][][][][] classArray10 = new java.lang.Class[3][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][] wildcardClassArray11 = (java.lang.Class<?>[][][][][]) classArray10;
        wildcardClassArray11[0] = wildcardClassArray2;
        wildcardClassArray11[1] = wildcardClassArray5;
        wildcardClassArray11[2] = wildcardClassArray8;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList19 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray11, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class [[[[Ljava.lang.Class; cannot be cast to class java.lang.Comparable ([[[[Ljava.lang.Class; and java.lang.Comparable are in module java.base of loader 'bootstrap')");
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
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "", "" };
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList10 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray6, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList12 = com.thealgorithms.backtracking.Combination.combination(strArray6, 1);
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray6, 2);
        java.lang.Class<?> wildcardClass15 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strComparableSetList8);
        org.junit.Assert.assertNotNull(serializableSetList10);
        org.junit.Assert.assertNotNull(strSetList12);
        org.junit.Assert.assertNotNull(constantDescSetList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) wildcardClassArray2, (int) (short) 10);
        java.lang.Class<?> wildcardClass11 = constableArraySetList10.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNull(genericDeclarationArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(constableArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, (int) (short) -1);
        java.lang.Class<?> wildcardClass7 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class[][] classArray4 = new java.lang.Class[1][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray5 = (java.lang.Class<?>[][]) classArray4;
        wildcardClassArray5[0] = classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList9 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray5, 10);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList11 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray5, (int) (short) 10);
        java.lang.Class<?> wildcardClass12 = wildcardClassArraySetList11.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(classArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList9);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        java.util.List[][] listArray1 = new java.util.List[0][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]>> iterableArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.Iterable<java.util.TreeSet<java.lang.String>>[][]) strSetListArray2, (int) '4');
        java.lang.Class<?> wildcardClass7 = iterableArraySetList6.getClass();
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArraySetList4);
        org.junit.Assert.assertNotNull(iterableArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.AnnotatedElement>> annotatedElementSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.AnnotatedElement[]) wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type>> typeSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[]) wildcardClassArray2, 2);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (short) 1);
        java.lang.Class<?> wildcardClass13 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNull(typeDescriptorSetList6);
        org.junit.Assert.assertNotNull(annotatedElementSetList8);
        org.junit.Assert.assertNotNull(typeSetList10);
        org.junit.Assert.assertNotNull(typeDescriptorSetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable>> constableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[]) strArray2, (int) (byte) 1);
        java.lang.Class<?> wildcardClass9 = strArray2.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray10 = new java.lang.reflect.GenericDeclaration[] { wildcardClass9 };
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList12 = com.thealgorithms.backtracking.Combination.combination(genericDeclarationArray10, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList14 = com.thealgorithms.backtracking.Combination.combination(genericDeclarationArray10, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.AnnotatedElement>> annotatedElementSetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.AnnotatedElement[]) genericDeclarationArray10, 0);
        java.lang.Class<?> wildcardClass17 = genericDeclarationArray10.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(charSequenceSetList6);
        org.junit.Assert.assertNotNull(constableSetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(genericDeclarationArray10);
        org.junit.Assert.assertNull(genericDeclarationSetList12);
        org.junit.Assert.assertNull(genericDeclarationSetList14);
        org.junit.Assert.assertNull(annotatedElementSetList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.constant.Constable>> constableSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[]) strArray2, (int) (byte) 100);
        java.lang.Class<?> wildcardClass7 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(constableSetList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        java.util.List[][] listArray1 = new java.util.List[0][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (-1));
        java.lang.Class<?> wildcardClass7 = strSetListArray2.getClass();
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArraySetList4);
        org.junit.Assert.assertNotNull(listArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "", "" };
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList10 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray6, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.Object>> objSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.Object[]) strArray6, (int) '#');
        java.lang.Class<?> wildcardClass13 = objSetList12.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strComparableSetList8);
        org.junit.Assert.assertNotNull(serializableSetList10);
        org.junit.Assert.assertNotNull(objSetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.lang.String[][][] strArray1 = new java.lang.String[][][] { strArray0 };
        java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList3 = com.thealgorithms.backtracking.Combination.combination(strArray1, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList5 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = serializableSetList5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArraySetList3);
        org.junit.Assert.assertNull(serializableSetList5);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        java.lang.String[][][][][] strArray0 = new java.lang.String[][][][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, 100);
        java.util.List<java.util.TreeSet<java.lang.String[][][][]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, 4);
        java.lang.Class<?> wildcardClass5 = strArraySetList4.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNotNull(strArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(genericDeclarationArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"[Ljava.lang.Object;.clone()\" because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
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
            java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>>> setListSetList63 = com.thealgorithms.backtracking.Combination.combination(strSetListArray49, 10);
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
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (byte) 0);
        java.lang.Class<?> wildcardClass9 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(typeDescriptorSetList6);
        org.junit.Assert.assertNull(genericDeclarationSetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        java.lang.Class[][][] classArray1 = new java.lang.Class[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][] wildcardClassArray2 = (java.lang.Class<?>[][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][]>> typeArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][]) wildcardClassArray2, (int) (byte) 100);
        java.lang.Class<?> wildcardClass9 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(typeArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        java.lang.String[][][] strArray0 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray1 = new java.lang.String[][][] {};
        java.lang.String[][][][] strArray2 = new java.lang.String[][][][] { strArray0, strArray1 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.String[][][]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = genericDeclarationSetList8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(typeDescriptorSetList6);
        org.junit.Assert.assertNull(genericDeclarationSetList8);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, 1);
        java.lang.Class<?> wildcardClass13 = genericDeclarationSetList12.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(genericDeclarationSetList6);
        org.junit.Assert.assertNotNull(typeDescriptorSetList8);
        org.junit.Assert.assertNotNull(genericDeclarationSetList10);
        org.junit.Assert.assertNotNull(genericDeclarationSetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.AnnotatedElement>> annotatedElementSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.AnnotatedElement[]) wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type>> typeSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[]) wildcardClassArray2, 2);
        java.lang.Class<?> wildcardClass11 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNull(typeDescriptorSetList6);
        org.junit.Assert.assertNotNull(annotatedElementSetList8);
        org.junit.Assert.assertNotNull(typeSetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, (int) (short) -1);
        java.util.Collection[] collectionArray7 = new java.util.Collection[] { genericDeclarationArraySetList6 };
        java.lang.Class[][] classArray9 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray10 = (java.lang.Class<?>[][]) classArray9;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray10, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray10, (int) (short) -1);
        java.util.Collection[] collectionArray15 = new java.util.Collection[] { genericDeclarationArraySetList14 };
        java.lang.Class[][] classArray17 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray18 = (java.lang.Class<?>[][]) classArray17;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList20 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray18, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList22 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray18, (int) (short) -1);
        java.util.Collection[] collectionArray23 = new java.util.Collection[] { genericDeclarationArraySetList22 };
        java.lang.Class[][] classArray25 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray26 = (java.lang.Class<?>[][]) classArray25;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList28 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray26, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList30 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray26, (int) (short) -1);
        java.util.Collection[] collectionArray31 = new java.util.Collection[] { genericDeclarationArraySetList30 };
        java.util.Collection[][] collectionArray32 = new java.util.Collection[][] { collectionArray7, collectionArray15, collectionArray23, collectionArray31 };
        java.lang.Class[][] classArray34 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray35 = (java.lang.Class<?>[][]) classArray34;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList37 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray35, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList39 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray35, (int) (short) -1);
        java.util.Collection[] collectionArray40 = new java.util.Collection[] { genericDeclarationArraySetList39 };
        java.lang.Class[][] classArray42 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray43 = (java.lang.Class<?>[][]) classArray42;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList45 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray43, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList47 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray43, (int) (short) -1);
        java.util.Collection[] collectionArray48 = new java.util.Collection[] { genericDeclarationArraySetList47 };
        java.lang.Class[][] classArray50 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray51 = (java.lang.Class<?>[][]) classArray50;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList53 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray51, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList55 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray51, (int) (short) -1);
        java.util.Collection[] collectionArray56 = new java.util.Collection[] { genericDeclarationArraySetList55 };
        java.lang.Class[][] classArray58 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray59 = (java.lang.Class<?>[][]) classArray58;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList61 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray59, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList63 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray59, (int) (short) -1);
        java.util.Collection[] collectionArray64 = new java.util.Collection[] { genericDeclarationArraySetList63 };
        java.util.Collection[][] collectionArray65 = new java.util.Collection[][] { collectionArray40, collectionArray48, collectionArray56, collectionArray64 };
        java.util.Collection[][][] collectionArray66 = new java.util.Collection[][][] { collectionArray32, collectionArray65 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.util.Collection[][]>> collectionArraySetList68 = com.thealgorithms.backtracking.Combination.combination(collectionArray66, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList6);
        org.junit.Assert.assertNotNull(collectionArray7);
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList12);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList14);
        org.junit.Assert.assertNotNull(collectionArray15);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList20);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList22);
        org.junit.Assert.assertNotNull(collectionArray23);
        org.junit.Assert.assertNotNull(classArray25);
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList28);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList30);
        org.junit.Assert.assertNotNull(collectionArray31);
        org.junit.Assert.assertNotNull(collectionArray32);
        org.junit.Assert.assertNotNull(classArray34);
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList37);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList39);
        org.junit.Assert.assertNotNull(collectionArray40);
        org.junit.Assert.assertNotNull(classArray42);
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList45);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList47);
        org.junit.Assert.assertNotNull(collectionArray48);
        org.junit.Assert.assertNotNull(classArray50);
        org.junit.Assert.assertNotNull(wildcardClassArray51);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList53);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList55);
        org.junit.Assert.assertNotNull(collectionArray56);
        org.junit.Assert.assertNotNull(classArray58);
        org.junit.Assert.assertNotNull(wildcardClassArray59);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList61);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList63);
        org.junit.Assert.assertNotNull(collectionArray64);
        org.junit.Assert.assertNotNull(collectionArray65);
        org.junit.Assert.assertNotNull(collectionArray66);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.lang.String[][][] strArray1 = new java.lang.String[][][] { strArray0 };
        java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList3 = com.thealgorithms.backtracking.Combination.combination(strArray1, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList5 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray1, 0);
        java.lang.Class<?> wildcardClass6 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArraySetList3);
        org.junit.Assert.assertNull(serializableSetList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        java.lang.String[][][][][] strArray0 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray1 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][][] strArray2 = new java.lang.String[][][][][][] { strArray0, strArray1 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        java.lang.reflect.Type[] typeArray0 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray1 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[][] typeArray2 = new java.lang.reflect.Type[][] { typeArray0, typeArray1 };
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList4 = com.thealgorithms.backtracking.Combination.combination(typeArray2, 0);
        java.lang.Class<?> wildcardClass5 = typeArray2.getClass();
        org.junit.Assert.assertNotNull(typeArray0);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertNull(typeArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.lang.String[][][] strArray1 = new java.lang.String[][][] { strArray0 };
        java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList3 = com.thealgorithms.backtracking.Combination.combination(strArray1, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList5 = com.thealgorithms.backtracking.Combination.combination(strArray1, 100);
        java.lang.Class<?> wildcardClass6 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArraySetList3);
        org.junit.Assert.assertNotNull(strArraySetList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable>> constableSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[]) strArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList12 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = strSetList12.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(charSequenceSetList6);
        org.junit.Assert.assertNotNull(constantDescSetList8);
        org.junit.Assert.assertNotNull(constableSetList10);
        org.junit.Assert.assertNotNull(strSetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type>> typeSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[]) wildcardClassArray2, (-1));
        java.lang.Class<?> wildcardClass7 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(typeSetList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        java.util.Collection[][] collectionArray0 = new java.util.Collection[][] {};
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList2 = com.thealgorithms.backtracking.Combination.combination(collectionArray0, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList4 = com.thealgorithms.backtracking.Combination.combination(collectionArray0, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList6 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) collectionArray0, (int) '4');
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList8 = com.thealgorithms.backtracking.Combination.combination(collectionArray0, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList10 = com.thealgorithms.backtracking.Combination.combination(collectionArray0, 1);
        java.lang.Class<?> wildcardClass11 = collectionArraySetList10.getClass();
        org.junit.Assert.assertNotNull(collectionArray0);
        org.junit.Assert.assertNull(collectionArraySetList2);
        org.junit.Assert.assertNotNull(collectionArraySetList4);
        org.junit.Assert.assertNotNull(serializableSetList6);
        org.junit.Assert.assertNotNull(collectionArraySetList8);
        org.junit.Assert.assertNotNull(collectionArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type>> typeSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.AnnotatedElement>> annotatedElementSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.AnnotatedElement[]) wildcardClassArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = annotatedElementSetList12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(typeDescriptorSetList6);
        org.junit.Assert.assertNotNull(typeDescriptorSetList8);
        org.junit.Assert.assertNotNull(typeSetList10);
        org.junit.Assert.assertNull(annotatedElementSetList12);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = genericDeclarationSetList12.getClass();
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
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        java.lang.Iterable[] iterableArray1 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.TreeSet<java.lang.String>>[] strSetIterableArray2 = (java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]) iterableArray1;
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList4 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList6 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList8 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, (int) (byte) 10);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList10 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, (int) (short) 100);
        java.lang.Class<?> wildcardClass11 = strSetIterableArray2.getClass();
        org.junit.Assert.assertNotNull(iterableArray1);
        org.junit.Assert.assertNotNull(strSetIterableArray2);
        org.junit.Assert.assertNotNull(setIterableSetList4);
        org.junit.Assert.assertNull(setIterableSetList6);
        org.junit.Assert.assertNotNull(setIterableSetList8);
        org.junit.Assert.assertNotNull(setIterableSetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.AnnotatedElement>> annotatedElementSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.AnnotatedElement[]) wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type>> typeSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[]) wildcardClassArray2, 2);
        java.util.List<java.util.TreeSet<java.lang.reflect.AnnotatedElement>> annotatedElementSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.AnnotatedElement[]) wildcardClassArray2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNull(typeDescriptorSetList6);
        org.junit.Assert.assertNotNull(annotatedElementSetList8);
        org.junit.Assert.assertNotNull(typeSetList10);
        org.junit.Assert.assertNotNull(annotatedElementSetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.lang.String[][][] strArray1 = new java.lang.String[][][] { strArray0 };
        java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList3 = com.thealgorithms.backtracking.Combination.combination(strArray1, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList5 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray1, 0);
        java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList7 = com.thealgorithms.backtracking.Combination.combination(strArray1, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList9 = com.thealgorithms.backtracking.Combination.combination(strArray1, 0);
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
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable>> constableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[]) strArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList10 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) (short) 1);
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray2, (int) (short) 10);
        java.lang.Class<?> wildcardClass13 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(charSequenceSetList6);
        org.junit.Assert.assertNotNull(constableSetList8);
        org.junit.Assert.assertNotNull(strSetList10);
        org.junit.Assert.assertNotNull(constantDescSetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        java.lang.Class[][][] classArray1 = new java.lang.Class[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][] wildcardClassArray2 = (java.lang.Class<?>[][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][]>> typeArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][]) wildcardClassArray2, (int) (byte) 100);
        java.lang.Class<?> wildcardClass9 = typeArraySetList8.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(typeArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        java.lang.Class<?>[][][][][] wildcardClassArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList2 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"[Ljava.lang.Object;.clone()\" because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        java.lang.reflect.GenericDeclaration[][][][] genericDeclarationArray0 = new java.lang.reflect.GenericDeclaration[][][][] {};
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][]>> genericDeclarationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(genericDeclarationArray0, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][]>> genericDeclarationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(genericDeclarationArray0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass5 = genericDeclarationArraySetList4.getClass();
        org.junit.Assert.assertNotNull(genericDeclarationArray0);
        org.junit.Assert.assertNull(genericDeclarationArraySetList2);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray0 = new java.lang.reflect.GenericDeclaration[][] {};
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray1 = new java.lang.reflect.GenericDeclaration[][] {};
        java.lang.reflect.GenericDeclaration[][][] genericDeclarationArray2 = new java.lang.reflect.GenericDeclaration[][][] { genericDeclarationArray0, genericDeclarationArray1 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][]>> genericDeclarationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(genericDeclarationArray2, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(genericDeclarationArray0);
        org.junit.Assert.assertNotNull(genericDeclarationArray1);
        org.junit.Assert.assertNotNull(genericDeclarationArray2);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, (int) (byte) 1);
        java.lang.Class<?> wildcardClass7 = charSequenceSetList6.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(charSequenceSetList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "", "" };
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList10 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray6, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList12 = com.thealgorithms.backtracking.Combination.combination(strArray6, 1);
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray6, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.lang.Object>> objSetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.Object[]) strArray6, (int) (byte) 10);
        java.lang.Class<?> wildcardClass17 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strComparableSetList8);
        org.junit.Assert.assertNotNull(serializableSetList10);
        org.junit.Assert.assertNotNull(strSetList12);
        org.junit.Assert.assertNotNull(constantDescSetList14);
        org.junit.Assert.assertNotNull(objSetList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        java.util.Collection[] collectionArray1 = new java.util.Collection[0];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.util.TreeSet<java.lang.String>>[] strSetCollectionArray2 = (java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray1;
        java.util.List<java.util.TreeSet<java.util.Collection<java.util.TreeSet<java.lang.String>>>> setCollectionSetList4 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray1, (-1));
        java.util.List<java.util.TreeSet<java.util.Collection<java.util.TreeSet<java.lang.String>>>> setCollectionSetList6 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray1, (int) '4');
        java.lang.Class<?> wildcardClass7 = collectionArray1.getClass();
        org.junit.Assert.assertNotNull(collectionArray1);
        org.junit.Assert.assertNotNull(strSetCollectionArray2);
        org.junit.Assert.assertNotNull(setCollectionSetList4);
        org.junit.Assert.assertNotNull(setCollectionSetList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.AnnotatedElement>> annotatedElementSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.AnnotatedElement[]) wildcardClassArray2, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> wildcardClassOfFieldSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[]) wildcardClassArray2, (-1));
        java.lang.Class<?> wildcardClass15 = wildcardClassOfFieldSetList14.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNull(typeDescriptorSetList6);
        org.junit.Assert.assertNotNull(annotatedElementSetList8);
        org.junit.Assert.assertNotNull(typeDescriptorSetList10);
        org.junit.Assert.assertNotNull(genericDeclarationSetList12);
        org.junit.Assert.assertNotNull(wildcardClassOfFieldSetList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) wildcardClassArray2, (int) (short) 10);
        java.lang.Class<?> wildcardClass11 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNull(genericDeclarationArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(constableArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable>> constableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[]) strArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList10 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) (short) 1);
        java.lang.Class<?> wildcardClass11 = strSetList10.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(charSequenceSetList6);
        org.junit.Assert.assertNotNull(constableSetList8);
        org.junit.Assert.assertNotNull(strSetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        java.util.List[][] listArray1 = new java.util.List[0][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (-1));
        java.lang.Class<?> wildcardClass7 = listArraySetList6.getClass();
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArraySetList4);
        org.junit.Assert.assertNotNull(listArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        java.util.Collection[][] collectionArray0 = new java.util.Collection[][] {};
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList2 = com.thealgorithms.backtracking.Combination.combination(collectionArray0, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList4 = com.thealgorithms.backtracking.Combination.combination(collectionArray0, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList6 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) collectionArray0, (int) '4');
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList8 = com.thealgorithms.backtracking.Combination.combination(collectionArray0, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList10 = com.thealgorithms.backtracking.Combination.combination(collectionArray0, 1);
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
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        java.util.Collection[][] collectionArray0 = new java.util.Collection[][] {};
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList2 = com.thealgorithms.backtracking.Combination.combination(collectionArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = collectionArraySetList2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collectionArray0);
        org.junit.Assert.assertNull(collectionArraySetList2);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (short) -1);
        java.lang.Class<?> wildcardClass5 = strArraySetList4.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNotNull(strArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.lang.String[][] strArray1 = new java.lang.String[][] {};
        java.lang.String[][] strArray2 = new java.lang.String[][] {};
        java.lang.String[][] strArray3 = new java.lang.String[][] {};
        java.lang.String[][][] strArray4 = new java.lang.String[][][] { strArray0, strArray1, strArray2, strArray3 };
        java.lang.String[][][][] strArray5 = new java.lang.String[][][][] { strArray4 };
        java.lang.String[][] strArray6 = new java.lang.String[][] {};
        java.lang.String[][] strArray7 = new java.lang.String[][] {};
        java.lang.String[][] strArray8 = new java.lang.String[][] {};
        java.lang.String[][] strArray9 = new java.lang.String[][] {};
        java.lang.String[][][] strArray10 = new java.lang.String[][][] { strArray6, strArray7, strArray8, strArray9 };
        java.lang.String[][][][] strArray11 = new java.lang.String[][][][] { strArray10 };
        java.lang.String[][] strArray12 = new java.lang.String[][] {};
        java.lang.String[][] strArray13 = new java.lang.String[][] {};
        java.lang.String[][] strArray14 = new java.lang.String[][] {};
        java.lang.String[][] strArray15 = new java.lang.String[][] {};
        java.lang.String[][][] strArray16 = new java.lang.String[][][] { strArray12, strArray13, strArray14, strArray15 };
        java.lang.String[][][][] strArray17 = new java.lang.String[][][][] { strArray16 };
        java.lang.String[][] strArray18 = new java.lang.String[][] {};
        java.lang.String[][] strArray19 = new java.lang.String[][] {};
        java.lang.String[][] strArray20 = new java.lang.String[][] {};
        java.lang.String[][] strArray21 = new java.lang.String[][] {};
        java.lang.String[][][] strArray22 = new java.lang.String[][][] { strArray18, strArray19, strArray20, strArray21 };
        java.lang.String[][][][] strArray23 = new java.lang.String[][][][] { strArray22 };
        java.lang.String[][] strArray24 = new java.lang.String[][] {};
        java.lang.String[][] strArray25 = new java.lang.String[][] {};
        java.lang.String[][] strArray26 = new java.lang.String[][] {};
        java.lang.String[][] strArray27 = new java.lang.String[][] {};
        java.lang.String[][][] strArray28 = new java.lang.String[][][] { strArray24, strArray25, strArray26, strArray27 };
        java.lang.String[][][][] strArray29 = new java.lang.String[][][][] { strArray28 };
        java.lang.String[][] strArray30 = new java.lang.String[][] {};
        java.lang.String[][] strArray31 = new java.lang.String[][] {};
        java.lang.String[][] strArray32 = new java.lang.String[][] {};
        java.lang.String[][] strArray33 = new java.lang.String[][] {};
        java.lang.String[][][] strArray34 = new java.lang.String[][][] { strArray30, strArray31, strArray32, strArray33 };
        java.lang.String[][][][] strArray35 = new java.lang.String[][][][] { strArray34 };
        java.lang.String[][][][][] strArray36 = new java.lang.String[][][][][] { strArray5, strArray11, strArray17, strArray23, strArray29, strArray35 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.String[][][][]>> strArraySetList38 = com.thealgorithms.backtracking.Combination.combination(strArray36, 2);
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
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        java.lang.String[][][][] strArray0 = new java.lang.String[][][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) 10);
        java.util.List<java.util.TreeSet<java.lang.String[][][]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.lang.String[][][]>> strArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (short) 100);
        java.lang.Class<?> wildcardClass7 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNotNull(strArraySetList4);
        org.junit.Assert.assertNotNull(strArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass3 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, 0);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(typeDescriptorSetList6);
        org.junit.Assert.assertNull(genericDeclarationSetList8);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        java.lang.reflect.Type[][] typeArray0 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray1 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray2 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray3 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray4 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][][] typeArray5 = new java.lang.reflect.Type[][][] { typeArray0, typeArray1, typeArray2, typeArray3, typeArray4 };
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][]>> typeArraySetList7 = com.thealgorithms.backtracking.Combination.combination(typeArray5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.reflect.Type[][]>> typeArraySetList9 = com.thealgorithms.backtracking.Combination.combination(typeArray5, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray0);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertNotNull(typeArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertNull(typeArraySetList7);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList8 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) (byte) -1);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "", "", "", "", "" };
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList17 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray15, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList19 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray15, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList21 = com.thealgorithms.backtracking.Combination.combination(strArray15, 1);
        java.util.Collection[] collectionArray23 = new java.util.Collection[2];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.util.TreeSet<java.lang.String>>[] strSetCollectionArray24 = (java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray23;
        strSetCollectionArray24[0] = strSetList8;
        strSetCollectionArray24[1] = strSetList21;
        java.util.List<java.util.TreeSet<java.util.Collection<java.util.TreeSet<java.lang.String>>>> setCollectionSetList30 = com.thealgorithms.backtracking.Combination.combination(strSetCollectionArray24, (int) (short) 0);
        java.lang.Class<?> wildcardClass31 = strSetCollectionArray24.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(constantDescSetList6);
        org.junit.Assert.assertNotNull(strSetList8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strComparableSetList17);
        org.junit.Assert.assertNotNull(serializableSetList19);
        org.junit.Assert.assertNotNull(strSetList21);
        org.junit.Assert.assertNotNull(collectionArray23);
        org.junit.Assert.assertNotNull(strSetCollectionArray24);
        org.junit.Assert.assertNull(setCollectionSetList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        java.lang.Class[][][] classArray1 = new java.lang.Class[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][] wildcardClassArray2 = (java.lang.Class<?>[][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][]>> typeArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][]) wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][]>> genericDeclarationArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][]) wildcardClassArray2, (int) (byte) 1);
        java.lang.Class<?> wildcardClass9 = genericDeclarationArraySetList8.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNull(typeArraySetList6);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 5);
        java.lang.Class<?> wildcardClass9 = charSequenceSetList8.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(charSequenceSetList6);
        org.junit.Assert.assertNotNull(charSequenceSetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        java.lang.Class[][][][] classArray1 = new java.lang.Class[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 100);
        java.lang.Class<?> wildcardClass5 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][]>> listArraySetList21 = com.thealgorithms.backtracking.Combination.combination(strSetListArray15, (int) (short) -1);
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
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.AnnotatedElement>> annotatedElementSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.AnnotatedElement[]) wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type>> typeSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[]) wildcardClassArray2, 2);
        java.util.List<java.util.TreeSet<java.lang.reflect.AnnotatedElement>> annotatedElementSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.AnnotatedElement[]) wildcardClassArray2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = annotatedElementSetList12.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNull(typeDescriptorSetList6);
        org.junit.Assert.assertNotNull(annotatedElementSetList8);
        org.junit.Assert.assertNotNull(typeSetList10);
        org.junit.Assert.assertNotNull(annotatedElementSetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList8 = com.thealgorithms.backtracking.Combination.combination(strArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass11 = constantDescSetList10.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(charSequenceSetList6);
        org.junit.Assert.assertNull(strSetList8);
        org.junit.Assert.assertNotNull(constantDescSetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        java.lang.Class[][][] classArray1 = new java.lang.Class[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][] wildcardClassArray2 = (java.lang.Class<?>[][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass5 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][]) wildcardClassArray2, (int) (short) 100);
        java.lang.Class<?> wildcardClass9 = typeArraySetList8.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList6);
        org.junit.Assert.assertNotNull(typeArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray2, (int) (byte) 10);
        java.lang.Class<?> wildcardClass11 = strComparableSetList10.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(constantDescSetList6);
        org.junit.Assert.assertNull(charSequenceSetList8);
        org.junit.Assert.assertNotNull(strComparableSetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "", "" };
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList10 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray6, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList12 = com.thealgorithms.backtracking.Combination.combination(strArray6, 1);
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray6, 2);
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray6, 10);
        java.lang.Class<?> wildcardClass17 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strComparableSetList8);
        org.junit.Assert.assertNotNull(serializableSetList10);
        org.junit.Assert.assertNotNull(strSetList12);
        org.junit.Assert.assertNotNull(constantDescSetList14);
        org.junit.Assert.assertNotNull(constantDescSetList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        java.lang.String[][][][][] strArray0 = new java.lang.String[][][][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, 100);
        java.util.List<java.util.TreeSet<java.lang.String[][][][]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, 4);
        java.util.List<java.util.TreeSet<java.lang.String[][][][]>> strArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strArray0, 10);
        java.lang.Class<?> wildcardClass7 = strArraySetList6.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNotNull(strArraySetList4);
        org.junit.Assert.assertNotNull(strArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> wildcardClassOfFieldSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[]) wildcardClassArray2, 2);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) ' ');
        java.lang.Class<?> wildcardClass13 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(genericDeclarationSetList6);
        org.junit.Assert.assertNotNull(typeDescriptorSetList8);
        org.junit.Assert.assertNotNull(wildcardClassOfFieldSetList10);
        org.junit.Assert.assertNotNull(typeDescriptorSetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, 100);
        java.lang.Class<?> wildcardClass9 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList6);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        java.lang.reflect.GenericDeclaration[][][][] genericDeclarationArray0 = new java.lang.reflect.GenericDeclaration[][][][] {};
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][]>> genericDeclarationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(genericDeclarationArray0, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][]>> genericDeclarationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(genericDeclarationArray0, 0);
        java.util.List<java.util.TreeSet<java.lang.Object>> objSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.Object[]) genericDeclarationArray0, 2);
        java.lang.Class<?> wildcardClass7 = objSetList6.getClass();
        org.junit.Assert.assertNotNull(genericDeclarationArray0);
        org.junit.Assert.assertNull(genericDeclarationArraySetList2);
        org.junit.Assert.assertNull(genericDeclarationArraySetList4);
        org.junit.Assert.assertNotNull(objSetList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 1);
        java.lang.Class<?> wildcardClass9 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNull(genericDeclarationArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList4 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray2, 1);
        java.lang.Class<?> wildcardClass5 = strComparableSetList4.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strComparableSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.AnnotatedElement>> annotatedElementSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.AnnotatedElement[]) wildcardClassArray2, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 3);
        java.lang.Class<?> wildcardClass13 = wildcardClassSetList12.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNull(typeDescriptorSetList6);
        org.junit.Assert.assertNotNull(annotatedElementSetList8);
        org.junit.Assert.assertNotNull(typeDescriptorSetList10);
        org.junit.Assert.assertNotNull(wildcardClassSetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.lang.String[][][] strArray1 = new java.lang.String[][][] { strArray0 };
        java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList3 = com.thealgorithms.backtracking.Combination.combination(strArray1, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList5 = com.thealgorithms.backtracking.Combination.combination(strArray1, 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList7 = com.thealgorithms.backtracking.Combination.combination(strArray1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArraySetList3);
        org.junit.Assert.assertNotNull(strArraySetList5);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        java.util.Collection[][] collectionArray0 = new java.util.Collection[][] {};
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList2 = com.thealgorithms.backtracking.Combination.combination(collectionArray0, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList4 = com.thealgorithms.backtracking.Combination.combination(collectionArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = collectionArraySetList4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collectionArray0);
        org.junit.Assert.assertNull(collectionArraySetList2);
        org.junit.Assert.assertNull(collectionArraySetList4);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        java.lang.constant.Constable[] constableArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.constant.Constable>> constableSetList2 = com.thealgorithms.backtracking.Combination.combination(constableArray0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"[Ljava.lang.Object;.clone()\" because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][]) wildcardClassArray2, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 3);
        java.lang.Class<?> wildcardClass13 = wildcardClassArraySetList12.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList6);
        org.junit.Assert.assertNotNull(typeArraySetList8);
        org.junit.Assert.assertNull(typeArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList9 = com.thealgorithms.backtracking.Combination.combination(strArray7, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList11 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray7, 1);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList13 = com.thealgorithms.backtracking.Combination.combination(strArray7, (int) (byte) -1);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList18 = com.thealgorithms.backtracking.Combination.combination(strArray16, (int) '#');
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList23 = com.thealgorithms.backtracking.Combination.combination(strArray21, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList25 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray21, 10);
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList27 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray21, 10);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable>> constableSetList29 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[]) strArray21, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList31 = com.thealgorithms.backtracking.Combination.combination(strArray21, (int) (byte) -1);
        java.util.List[] listArray33 = new java.util.List[4];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[] strSetListArray34 = (java.util.List<java.util.TreeSet<java.lang.String>>[]) listArray33;
        strSetListArray34[0] = strSetList4;
        strSetListArray34[1] = strSetList13;
        strSetListArray34[2] = strSetList18;
        strSetListArray34[3] = strSetList31;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>>> setListSetList44 = com.thealgorithms.backtracking.Combination.combination(strSetListArray34, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strSetList9);
        org.junit.Assert.assertNotNull(constantDescSetList11);
        org.junit.Assert.assertNotNull(strSetList13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strSetList18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strSetList23);
        org.junit.Assert.assertNotNull(charSequenceSetList25);
        org.junit.Assert.assertNotNull(constantDescSetList27);
        org.junit.Assert.assertNotNull(constableSetList29);
        org.junit.Assert.assertNotNull(strSetList31);
        org.junit.Assert.assertNotNull(listArray33);
        org.junit.Assert.assertNotNull(strSetListArray34);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> wildcardClassOfFieldSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[]) wildcardClassArray2, 2);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) ' ');
        java.lang.Class<?> wildcardClass13 = typeDescriptorSetList12.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(genericDeclarationSetList6);
        org.junit.Assert.assertNotNull(typeDescriptorSetList8);
        org.junit.Assert.assertNotNull(wildcardClassOfFieldSetList10);
        org.junit.Assert.assertNotNull(typeDescriptorSetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "", "" };
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList10 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray6, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList12 = com.thealgorithms.backtracking.Combination.combination(strArray6, 1);
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray6, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList16 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray6, 2);
        java.util.Collection[] collectionArray17 = new java.util.Collection[] { serializableSetList16 };
        java.lang.String[] strArray24 = new java.lang.String[] { "", "", "", "", "", "" };
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList26 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray24, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList28 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray24, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList30 = com.thealgorithms.backtracking.Combination.combination(strArray24, 1);
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList32 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray24, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList34 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray24, 2);
        java.util.Collection[] collectionArray35 = new java.util.Collection[] { serializableSetList34 };
        java.lang.String[] strArray42 = new java.lang.String[] { "", "", "", "", "", "" };
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList44 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray42, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList46 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray42, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList48 = com.thealgorithms.backtracking.Combination.combination(strArray42, 1);
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList50 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray42, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList52 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray42, 2);
        java.util.Collection[] collectionArray53 = new java.util.Collection[] { serializableSetList52 };
        java.lang.String[] strArray60 = new java.lang.String[] { "", "", "", "", "", "" };
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList62 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray60, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList64 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray60, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList66 = com.thealgorithms.backtracking.Combination.combination(strArray60, 1);
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList68 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray60, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList70 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray60, 2);
        java.util.Collection[] collectionArray71 = new java.util.Collection[] { serializableSetList70 };
        java.util.Collection[][] collectionArray72 = new java.util.Collection[][] { collectionArray17, collectionArray35, collectionArray53, collectionArray71 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList74 = com.thealgorithms.backtracking.Combination.combination(collectionArray72, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strComparableSetList8);
        org.junit.Assert.assertNotNull(serializableSetList10);
        org.junit.Assert.assertNotNull(strSetList12);
        org.junit.Assert.assertNotNull(constantDescSetList14);
        org.junit.Assert.assertNotNull(serializableSetList16);
        org.junit.Assert.assertNotNull(collectionArray17);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strComparableSetList26);
        org.junit.Assert.assertNotNull(serializableSetList28);
        org.junit.Assert.assertNotNull(strSetList30);
        org.junit.Assert.assertNotNull(constantDescSetList32);
        org.junit.Assert.assertNotNull(serializableSetList34);
        org.junit.Assert.assertNotNull(collectionArray35);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(strComparableSetList44);
        org.junit.Assert.assertNotNull(serializableSetList46);
        org.junit.Assert.assertNotNull(strSetList48);
        org.junit.Assert.assertNotNull(constantDescSetList50);
        org.junit.Assert.assertNotNull(serializableSetList52);
        org.junit.Assert.assertNotNull(collectionArray53);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(strComparableSetList62);
        org.junit.Assert.assertNotNull(serializableSetList64);
        org.junit.Assert.assertNotNull(strSetList66);
        org.junit.Assert.assertNotNull(constantDescSetList68);
        org.junit.Assert.assertNotNull(serializableSetList70);
        org.junit.Assert.assertNotNull(collectionArray71);
        org.junit.Assert.assertNotNull(collectionArray72);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
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
            java.util.List<java.util.TreeSet<java.util.Collection<java.util.TreeSet<java.lang.String>>>> setCollectionSetList22 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection<java.util.TreeSet<java.lang.String>>[]) strSetListArray12, 1);
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
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (byte) 0);
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
        org.junit.Assert.assertNull(genericDeclarationSetList10);
        org.junit.Assert.assertNull(genericDeclarationSetList12);
        org.junit.Assert.assertNull(typeDescriptorSetList14);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][]) wildcardClassArray2, 5);
        java.lang.Class<?> wildcardClass9 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(typeArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, 100);
        java.lang.Class<?> wildcardClass15 = typeDescriptorSetList14.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(genericDeclarationSetList6);
        org.junit.Assert.assertNotNull(typeDescriptorSetList8);
        org.junit.Assert.assertNull(genericDeclarationSetList10);
        org.junit.Assert.assertNull(genericDeclarationSetList12);
        org.junit.Assert.assertNotNull(typeDescriptorSetList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
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
        java.util.List<java.util.TreeSet<java.util.Collection<java.util.TreeSet<java.lang.String>>>> setCollectionSetList22 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection<java.util.TreeSet<java.lang.String>>[]) strSetListArray12, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>>> setListSetList24 = com.thealgorithms.backtracking.Combination.combination(strSetListArray12, 10);
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
        org.junit.Assert.assertNull(setCollectionSetList22);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        java.lang.Class[][][] classArray1 = new java.lang.Class[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][] wildcardClassArray2 = (java.lang.Class<?>[][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) 'a');
        java.lang.Class<?> wildcardClass7 = wildcardClassArraySetList6.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        java.lang.String[][][][][] strArray0 = new java.lang.String[][][][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, 100);
        java.lang.Class<?> wildcardClass3 = strArraySetList2.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        java.lang.Class[][][] classArray1 = new java.lang.Class[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][] wildcardClassArray2 = (java.lang.Class<?>[][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][]>> genericDeclarationArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][]) wildcardClassArray2, 5);
        java.lang.Class<?> wildcardClass7 = genericDeclarationArraySetList6.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        java.lang.Class[][][][] classArray1 = new java.lang.Class[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, (int) 'a');
        java.lang.Class<?> wildcardClass11 = typeArraySetList10.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(typeArraySetList6);
        org.junit.Assert.assertNotNull(typeArraySetList8);
        org.junit.Assert.assertNotNull(typeArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.AnnotatedElement>> annotatedElementSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.AnnotatedElement[]) wildcardClassArray2, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> wildcardClassOfFieldSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[]) wildcardClassArray2, (-1));
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> wildcardClassOfFieldSetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[]) wildcardClassArray2, 2);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNull(typeDescriptorSetList6);
        org.junit.Assert.assertNotNull(annotatedElementSetList8);
        org.junit.Assert.assertNotNull(typeDescriptorSetList10);
        org.junit.Assert.assertNotNull(genericDeclarationSetList12);
        org.junit.Assert.assertNotNull(wildcardClassOfFieldSetList14);
        org.junit.Assert.assertNotNull(wildcardClassOfFieldSetList16);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        java.lang.Class[][][][] classArray1 = new java.lang.Class[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 4);
        java.lang.Class<?> wildcardClass9 = wildcardClassArraySetList8.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(typeArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        java.lang.Class[][][][] classArray1 = new java.lang.Class[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 3);
        java.lang.Class<?> wildcardClass7 = typeArraySetList6.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(typeArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        java.lang.reflect.GenericDeclaration[][][][] genericDeclarationArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][]>> genericDeclarationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(genericDeclarationArray0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"[Ljava.lang.Object;.clone()\" because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList8 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray2, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = constantDescSetList10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(constantDescSetList6);
        org.junit.Assert.assertNotNull(strSetList8);
        org.junit.Assert.assertNull(constantDescSetList10);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 5);
        java.lang.Class<?> wildcardClass9 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(charSequenceSetList6);
        org.junit.Assert.assertNotNull(charSequenceSetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, (-1));
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) strArray0, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.CharSequence[]>> charSequenceArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[][]) strArray0, 1);
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList10 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) strArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = constableArraySetList12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNotNull(strArraySetList4);
        org.junit.Assert.assertNotNull(constableArraySetList6);
        org.junit.Assert.assertNotNull(charSequenceArraySetList8);
        org.junit.Assert.assertNotNull(strArraySetList10);
        org.junit.Assert.assertNull(constableArraySetList12);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        java.lang.String[][][] strArray0 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray1 = new java.lang.String[][][] {};
        java.lang.String[][][][] strArray2 = new java.lang.String[][][][] { strArray0, strArray1 };
        java.lang.String[][][] strArray3 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray4 = new java.lang.String[][][] {};
        java.lang.String[][][][] strArray5 = new java.lang.String[][][][] { strArray3, strArray4 };
        java.lang.String[][][][][] strArray6 = new java.lang.String[][][][][] { strArray2, strArray5 };
        java.lang.String[][][] strArray7 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray8 = new java.lang.String[][][] {};
        java.lang.String[][][][] strArray9 = new java.lang.String[][][][] { strArray7, strArray8 };
        java.lang.String[][][] strArray10 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray11 = new java.lang.String[][][] {};
        java.lang.String[][][][] strArray12 = new java.lang.String[][][][] { strArray10, strArray11 };
        java.lang.String[][][][][] strArray13 = new java.lang.String[][][][][] { strArray9, strArray12 };
        java.lang.String[][][] strArray14 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray15 = new java.lang.String[][][] {};
        java.lang.String[][][][] strArray16 = new java.lang.String[][][][] { strArray14, strArray15 };
        java.lang.String[][][] strArray17 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray18 = new java.lang.String[][][] {};
        java.lang.String[][][][] strArray19 = new java.lang.String[][][][] { strArray17, strArray18 };
        java.lang.String[][][][][] strArray20 = new java.lang.String[][][][][] { strArray16, strArray19 };
        java.lang.String[][][] strArray21 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray22 = new java.lang.String[][][] {};
        java.lang.String[][][][] strArray23 = new java.lang.String[][][][] { strArray21, strArray22 };
        java.lang.String[][][] strArray24 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray25 = new java.lang.String[][][] {};
        java.lang.String[][][][] strArray26 = new java.lang.String[][][][] { strArray24, strArray25 };
        java.lang.String[][][][][] strArray27 = new java.lang.String[][][][][] { strArray23, strArray26 };
        java.lang.String[][][][][][] strArray28 = new java.lang.String[][][][][][] { strArray6, strArray13, strArray20, strArray27 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList30 = com.thealgorithms.backtracking.Combination.combination(strArray28, (-1));
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
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strArray28);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
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
        java.util.List<java.util.TreeSet<java.lang.String[][][]>> strArraySetList23 = com.thealgorithms.backtracking.Combination.combination(strArray19, 0);
        java.util.List<java.util.TreeSet<java.lang.String[][][]>> strArraySetList25 = com.thealgorithms.backtracking.Combination.combination(strArray19, (int) '4');
        java.lang.Class<?> wildcardClass26 = strArraySetList25.getClass();
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
        org.junit.Assert.assertNull(strArraySetList23);
        org.junit.Assert.assertNotNull(strArraySetList25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 0);
        java.lang.Class<?> wildcardClass9 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(constantDescSetList6);
        org.junit.Assert.assertNull(charSequenceSetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        java.lang.String[][][][] strArray0 = new java.lang.String[][][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = strArray0.getClass();
        java.lang.Class[] classArray5 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray6 = (java.lang.Class<?>[]) classArray5;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray6, (int) (byte) 0);
        java.lang.Iterable[] iterableArray11 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.TreeSet<java.lang.String>>[] strSetIterableArray12 = (java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]) iterableArray11;
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList14 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray12, 100);
        java.util.Collection[][] collectionArray15 = new java.util.Collection[][] {};
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList17 = com.thealgorithms.backtracking.Combination.combination(collectionArray15, (int) (byte) 0);
        java.lang.Iterable[] iterableArray19 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.TreeSet<java.lang.String>>[] strSetIterableArray20 = (java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]) iterableArray19;
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList22 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray20, 100);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList24 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray20, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList26 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray20, (int) (byte) 10);
        java.lang.Class<?> wildcardClass27 = strSetIterableArray20.getClass();
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { strArray0, (byte) 0, (short) 0, strSetIterableArray12, collectionArray15, strSetIterableArray20 };
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList30 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) collectionArray15, (-1));
        java.lang.Class<?> wildcardClass31 = serializableSetList30.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(classArray5);
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertNull(wildcardClassSetList8);
        org.junit.Assert.assertNotNull(iterableArray11);
        org.junit.Assert.assertNotNull(strSetIterableArray12);
        org.junit.Assert.assertNotNull(setIterableSetList14);
        org.junit.Assert.assertNotNull(collectionArray15);
        org.junit.Assert.assertNull(collectionArraySetList17);
        org.junit.Assert.assertNotNull(iterableArray19);
        org.junit.Assert.assertNotNull(strSetIterableArray20);
        org.junit.Assert.assertNotNull(setIterableSetList22);
        org.junit.Assert.assertNull(setIterableSetList24);
        org.junit.Assert.assertNotNull(setIterableSetList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertNotNull(serializableSetList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable>> constableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[]) strArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList10 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) (short) 1);
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, (-1));
        java.lang.Class<?> wildcardClass13 = charSequenceSetList12.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(charSequenceSetList6);
        org.junit.Assert.assertNotNull(constableSetList8);
        org.junit.Assert.assertNotNull(strSetList10);
        org.junit.Assert.assertNotNull(charSequenceSetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.AnnotatedElement>> annotatedElementSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.AnnotatedElement[]) wildcardClassArray2, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (short) 100);
        java.lang.Class<?> wildcardClass15 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNull(typeDescriptorSetList6);
        org.junit.Assert.assertNotNull(annotatedElementSetList8);
        org.junit.Assert.assertNotNull(typeDescriptorSetList10);
        org.junit.Assert.assertNotNull(genericDeclarationSetList12);
        org.junit.Assert.assertNotNull(typeDescriptorSetList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        java.lang.reflect.GenericDeclaration[][][] genericDeclarationArray0 = new java.lang.reflect.GenericDeclaration[][][] {};
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][]>> genericDeclarationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(genericDeclarationArray0, 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][]>> genericDeclarationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(genericDeclarationArray0, (-1));
        java.lang.Class<?> wildcardClass5 = genericDeclarationArray0.getClass();
        org.junit.Assert.assertNotNull(genericDeclarationArray0);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList2);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        java.lang.Class[][][][] classArray1 = new java.lang.Class[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, (int) 'a');
        java.lang.Class<?> wildcardClass11 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(typeArraySetList6);
        org.junit.Assert.assertNotNull(typeArraySetList8);
        org.junit.Assert.assertNotNull(typeArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        java.lang.Class[][][][][] classArray1 = new java.lang.Class[0][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 10);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList10 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 3);
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
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable>> constableSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[]) strArray2, (int) 'a');
        java.lang.Class<?> wildcardClass11 = constableSetList10.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(charSequenceSetList6);
        org.junit.Assert.assertNotNull(constantDescSetList8);
        org.junit.Assert.assertNotNull(constableSetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][]) wildcardClassArray2, 5);
        java.lang.Class<?> wildcardClass7 = typeArraySetList6.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(typeArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, 100);
        java.lang.Class<?> wildcardClass15 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(genericDeclarationSetList6);
        org.junit.Assert.assertNotNull(typeDescriptorSetList8);
        org.junit.Assert.assertNull(genericDeclarationSetList10);
        org.junit.Assert.assertNull(genericDeclarationSetList12);
        org.junit.Assert.assertNotNull(typeDescriptorSetList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        java.lang.reflect.AnnotatedElement[] annotatedElementArray0 = null;
        java.util.List<java.util.TreeSet<java.lang.reflect.AnnotatedElement>> annotatedElementSetList2 = com.thealgorithms.backtracking.Combination.combination(annotatedElementArray0, 0);
        org.junit.Assert.assertNull(annotatedElementSetList2);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        java.lang.String[][][] strArray0 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray1 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray2 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray3 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray4 = new java.lang.String[][][] {};
        java.lang.String[][][][] strArray5 = new java.lang.String[][][][] { strArray0, strArray1, strArray2, strArray3, strArray4 };
        java.lang.String[][][] strArray6 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray7 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray8 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray9 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray10 = new java.lang.String[][][] {};
        java.lang.String[][][][] strArray11 = new java.lang.String[][][][] { strArray6, strArray7, strArray8, strArray9, strArray10 };
        java.lang.String[][][] strArray12 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray13 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray14 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray15 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray16 = new java.lang.String[][][] {};
        java.lang.String[][][][] strArray17 = new java.lang.String[][][][] { strArray12, strArray13, strArray14, strArray15, strArray16 };
        java.lang.String[][][][][] strArray18 = new java.lang.String[][][][][] { strArray5, strArray11, strArray17 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.String[][][][]>> strArraySetList20 = com.thealgorithms.backtracking.Combination.combination(strArray18, (-1));
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
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        java.lang.Class[][][] classArray1 = new java.lang.Class[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][] wildcardClassArray2 = (java.lang.Class<?>[][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][]>> genericDeclarationArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][]) wildcardClassArray2, 5);
        java.lang.Class<?> wildcardClass7 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        java.lang.Class[][][][] classArray1 = new java.lang.Class[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 100);
        java.lang.Class<?> wildcardClass9 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(typeArraySetList6);
        org.junit.Assert.assertNotNull(typeArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        java.util.List[][] listArray1 = new java.util.List[0][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]>> iterableArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.Iterable<java.util.TreeSet<java.lang.String>>[][]) strSetListArray2, (int) '4');
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][]) strSetListArray2, 10);
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][]) strSetListArray2, (int) (byte) -1);
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArraySetList4);
        org.junit.Assert.assertNotNull(iterableArraySetList6);
        org.junit.Assert.assertNotNull(collectionArraySetList8);
        org.junit.Assert.assertNotNull(collectionArraySetList10);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 100);
        java.lang.Class<?> wildcardClass11 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(charSequenceSetList6);
        org.junit.Assert.assertNotNull(constantDescSetList8);
        org.junit.Assert.assertNotNull(charSequenceSetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        java.util.List[][] listArray1 = new java.util.List[0][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (-1));
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (-1));
        java.lang.Class<?> wildcardClass9 = strSetListArray2.getClass();
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArraySetList4);
        org.junit.Assert.assertNotNull(listArraySetList6);
        org.junit.Assert.assertNotNull(listArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "", "" };
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray6, (int) (short) -1);
        java.lang.Class<?> wildcardClass15 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strComparableSetList8);
        org.junit.Assert.assertNotNull(strComparableSetList10);
        org.junit.Assert.assertNotNull(strComparableSetList12);
        org.junit.Assert.assertNotNull(charSequenceSetList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, 1);
        java.lang.Class<?> wildcardClass13 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(genericDeclarationSetList6);
        org.junit.Assert.assertNotNull(typeDescriptorSetList8);
        org.junit.Assert.assertNotNull(genericDeclarationSetList10);
        org.junit.Assert.assertNotNull(genericDeclarationSetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        java.lang.Class[][][][] classArray1 = new java.lang.Class[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 4);
        java.lang.Class<?> wildcardClass9 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(typeArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
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
        java.lang.Class<?> wildcardClass30 = strSetListArray17.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
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
        java.util.List<java.util.TreeSet<java.lang.String[][][]>> strArraySetList23 = com.thealgorithms.backtracking.Combination.combination(strArray19, 0);
        java.util.List<java.util.TreeSet<java.lang.String[][][]>> strArraySetList25 = com.thealgorithms.backtracking.Combination.combination(strArray19, (int) '4');
        java.lang.Class<?> wildcardClass26 = strArray19.getClass();
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
        org.junit.Assert.assertNull(strArraySetList23);
        org.junit.Assert.assertNotNull(strArraySetList25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        java.lang.reflect.GenericDeclaration[][][][] genericDeclarationArray0 = new java.lang.reflect.GenericDeclaration[][][][] {};
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][]>> genericDeclarationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(genericDeclarationArray0, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][]>> genericDeclarationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(genericDeclarationArray0, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][]>> genericDeclarationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(genericDeclarationArray0, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][]>> genericDeclarationArraySetList8 = com.thealgorithms.backtracking.Combination.combination(genericDeclarationArray0, (int) '4');
        java.lang.Class<?> wildcardClass9 = genericDeclarationArraySetList8.getClass();
        org.junit.Assert.assertNotNull(genericDeclarationArray0);
        org.junit.Assert.assertNull(genericDeclarationArraySetList2);
        org.junit.Assert.assertNull(genericDeclarationArraySetList4);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList6);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        java.lang.String[][][][] strArray0 = new java.lang.String[][][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = strArraySetList2.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        java.util.List[][][] listArray1 = new java.util.List[0][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][]) listArray1;
        java.util.List[][][][] listArray4 = new java.util.List[1][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][] strSetListArray5 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][]) listArray4;
        strSetListArray5[0] = strSetListArray2;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][]>> listArraySetList9 = com.thealgorithms.backtracking.Combination.combination(strSetListArray5, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArray4);
        org.junit.Assert.assertNotNull(strSetListArray5);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        com.thealgorithms.backtracking.Combination combination0 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination1 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination2 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination3 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination4 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination5 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination[] combinationArray6 = new com.thealgorithms.backtracking.Combination[] { combination0, combination1, combination2, combination3, combination4, combination5 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination>> combinationSetList8 = com.thealgorithms.backtracking.Combination.combination(combinationArray6, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(combinationArray6);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass30 = listArraySetList29.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        java.lang.reflect.GenericDeclaration[][][] genericDeclarationArray0 = new java.lang.reflect.GenericDeclaration[][][] {};
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][]>> genericDeclarationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(genericDeclarationArray0, 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][]>> genericDeclarationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(genericDeclarationArray0, (-1));
        java.lang.Class<?> wildcardClass5 = genericDeclarationArraySetList4.getClass();
        org.junit.Assert.assertNotNull(genericDeclarationArray0);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList2);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "", "" };
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList10 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray6, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.Object>> objSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.Object[]) strArray6, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray6, (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strComparableSetList8);
        org.junit.Assert.assertNotNull(serializableSetList10);
        org.junit.Assert.assertNotNull(objSetList12);
        org.junit.Assert.assertNull(charSequenceSetList14);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray2, 10);
        java.lang.Class<?> wildcardClass9 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(charSequenceSetList6);
        org.junit.Assert.assertNotNull(constantDescSetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.lang.String[][][] strArray1 = new java.lang.String[][][] { strArray0 };
        java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList3 = com.thealgorithms.backtracking.Combination.combination(strArray1, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList5 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray1, 0);
        java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList7 = com.thealgorithms.backtracking.Combination.combination(strArray1, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList9 = com.thealgorithms.backtracking.Combination.combination(strArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = strArraySetList9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArraySetList3);
        org.junit.Assert.assertNull(serializableSetList5);
        org.junit.Assert.assertNotNull(strArraySetList7);
        org.junit.Assert.assertNull(strArraySetList9);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.AnnotatedElement>> annotatedElementSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.AnnotatedElement[]) wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList10 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 1);
        java.lang.Class<?> wildcardClass11 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNull(typeDescriptorSetList6);
        org.junit.Assert.assertNotNull(annotatedElementSetList8);
        org.junit.Assert.assertNotNull(wildcardClassSetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.lang.String[][][] strArray1 = new java.lang.String[][][] { strArray0 };
        java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList3 = com.thealgorithms.backtracking.Combination.combination(strArray1, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList5 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray1, 0);
        java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList7 = com.thealgorithms.backtracking.Combination.combination(strArray1, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList9 = com.thealgorithms.backtracking.Combination.combination(strArray1, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList11 = com.thealgorithms.backtracking.Combination.combination(strArray1, 5);
        java.lang.Class<?> wildcardClass12 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArraySetList3);
        org.junit.Assert.assertNull(serializableSetList5);
        org.junit.Assert.assertNotNull(strArraySetList7);
        org.junit.Assert.assertNull(strArraySetList9);
        org.junit.Assert.assertNotNull(strArraySetList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList8 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = charSequenceSetList10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(constantDescSetList6);
        org.junit.Assert.assertNotNull(strSetList8);
        org.junit.Assert.assertNull(charSequenceSetList10);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type>> typeSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[]) wildcardClassArray2, (-1));
        java.util.List<java.util.TreeSet<java.lang.reflect.Type>> typeSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[]) wildcardClassArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList10 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) wildcardClassArray2, 2);
        java.lang.Class<?> wildcardClass11 = serializableSetList10.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(typeSetList6);
        org.junit.Assert.assertNotNull(typeSetList8);
        org.junit.Assert.assertNotNull(serializableSetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
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
        java.util.List<java.util.TreeSet<java.util.Collection<java.util.TreeSet<java.lang.String>>>> setCollectionSetList22 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection<java.util.TreeSet<java.lang.String>>[]) strSetListArray12, 0);
        java.lang.Class<?> wildcardClass23 = strSetListArray12.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strSetList9);
        org.junit.Assert.assertNotNull(listArray11);
        org.junit.Assert.assertNotNull(strSetListArray12);
        org.junit.Assert.assertNull(setListSetList18);
        org.junit.Assert.assertNull(setListSetList20);
        org.junit.Assert.assertNull(setCollectionSetList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        java.lang.Class[][][] classArray1 = new java.lang.Class[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][] wildcardClassArray2 = (java.lang.Class<?>[][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][]>> genericDeclarationArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][]) wildcardClassArray2, (-1));
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 3);
        java.lang.Class<?> wildcardClass9 = wildcardClassArraySetList8.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][]) wildcardClassArray2, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 3);
        java.lang.Class<?> wildcardClass13 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList6);
        org.junit.Assert.assertNotNull(typeArraySetList8);
        org.junit.Assert.assertNull(typeArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> wildcardClassOfFieldSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[]) wildcardClassArray2, 2);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList14 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 100);
        java.lang.Class<?> wildcardClass15 = wildcardClassSetList14.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(genericDeclarationSetList6);
        org.junit.Assert.assertNotNull(typeDescriptorSetList8);
        org.junit.Assert.assertNotNull(wildcardClassOfFieldSetList10);
        org.junit.Assert.assertNotNull(typeDescriptorSetList12);
        org.junit.Assert.assertNotNull(wildcardClassSetList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        java.lang.String[][][][][] strArray0 = new java.lang.String[][][][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, 100);
        java.util.List<java.util.TreeSet<java.lang.String[][][][]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, 4);
        java.util.List<java.util.TreeSet<java.lang.String[][][][]>> strArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strArray0, 10);
        java.lang.Class<?> wildcardClass7 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNotNull(strArraySetList4);
        org.junit.Assert.assertNotNull(strArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable>> constableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[]) strArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList10 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) (short) 1);
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray2, (int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(charSequenceSetList6);
        org.junit.Assert.assertNotNull(constableSetList8);
        org.junit.Assert.assertNotNull(strSetList10);
        org.junit.Assert.assertNotNull(strComparableSetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray0 = new java.lang.reflect.GenericDeclaration[][] {};
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray1 = new java.lang.reflect.GenericDeclaration[][] {};
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray2 = new java.lang.reflect.GenericDeclaration[][] {};
        java.lang.reflect.GenericDeclaration[][][] genericDeclarationArray3 = new java.lang.reflect.GenericDeclaration[][][] { genericDeclarationArray0, genericDeclarationArray1, genericDeclarationArray2 };
        java.lang.reflect.GenericDeclaration[][][][] genericDeclarationArray4 = new java.lang.reflect.GenericDeclaration[][][][] { genericDeclarationArray3 };
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][]>> genericDeclarationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(genericDeclarationArray4, (int) 'a');
        java.lang.Class<?> wildcardClass7 = genericDeclarationArray4.getClass();
        org.junit.Assert.assertNotNull(genericDeclarationArray0);
        org.junit.Assert.assertNotNull(genericDeclarationArray1);
        org.junit.Assert.assertNotNull(genericDeclarationArray2);
        org.junit.Assert.assertNotNull(genericDeclarationArray3);
        org.junit.Assert.assertNotNull(genericDeclarationArray4);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable>> constableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[]) strArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList10 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) (short) 1);
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray2, (int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = strComparableSetList12.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(charSequenceSetList6);
        org.junit.Assert.assertNotNull(constableSetList8);
        org.junit.Assert.assertNotNull(strSetList10);
        org.junit.Assert.assertNotNull(strComparableSetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type>> typeSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[]) wildcardClassArray2, (-1));
        java.util.List<java.util.TreeSet<java.lang.reflect.Type>> typeSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[]) wildcardClassArray2, (int) 'a');
        java.lang.Class<?> wildcardClass9 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(typeSetList6);
        org.junit.Assert.assertNotNull(typeSetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray0 = new java.lang.reflect.GenericDeclaration[][] {};
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray1 = new java.lang.reflect.GenericDeclaration[][] {};
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray2 = new java.lang.reflect.GenericDeclaration[][] {};
        java.lang.reflect.GenericDeclaration[][][] genericDeclarationArray3 = new java.lang.reflect.GenericDeclaration[][][] { genericDeclarationArray0, genericDeclarationArray1, genericDeclarationArray2 };
        java.lang.reflect.GenericDeclaration[][][][] genericDeclarationArray4 = new java.lang.reflect.GenericDeclaration[][][][] { genericDeclarationArray3 };
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][]>> genericDeclarationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(genericDeclarationArray4, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][]>> genericDeclarationArraySetList8 = com.thealgorithms.backtracking.Combination.combination(genericDeclarationArray4, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(genericDeclarationArray0);
        org.junit.Assert.assertNotNull(genericDeclarationArray1);
        org.junit.Assert.assertNotNull(genericDeclarationArray2);
        org.junit.Assert.assertNotNull(genericDeclarationArray3);
        org.junit.Assert.assertNotNull(genericDeclarationArray4);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList6);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) wildcardClassArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) 'a');
        java.lang.Class<?> wildcardClass13 = wildcardClassArraySetList12.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNull(genericDeclarationArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(constableArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        java.util.List[][] listArray1 = new java.util.List[0][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (-1));
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) 'a');
        java.lang.Class<?> wildcardClass9 = listArraySetList8.getClass();
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArraySetList4);
        org.junit.Assert.assertNotNull(listArraySetList6);
        org.junit.Assert.assertNotNull(listArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        java.lang.Class[][][] classArray1 = new java.lang.Class[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][] wildcardClassArray2 = (java.lang.Class<?>[][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass5 = wildcardClassArraySetList4.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
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
            java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>>> setListSetList20 = com.thealgorithms.backtracking.Combination.combination(strSetListArray12, (int) '4');
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
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) wildcardClassArray2, (-1));
        java.lang.Class<?> wildcardClass11 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(constableArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 5);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable>> constableSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[]) strArray2, (-1));
        java.lang.Class<?> wildcardClass11 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(charSequenceSetList6);
        org.junit.Assert.assertNotNull(charSequenceSetList8);
        org.junit.Assert.assertNotNull(constableSetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        java.util.List[] listArray1 = new java.util.List[0];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>>> setListSetList4 = com.thealgorithms.backtracking.Combination.combination((java.util.List<java.util.TreeSet<java.lang.String>>[]) listArray1, (int) (short) 1);
        java.lang.Class<?> wildcardClass5 = listArray1.getClass();
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(setListSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (byte) 1);
        java.lang.Class<?> wildcardClass7 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(genericDeclarationSetList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, (int) (short) 100);
        java.lang.Class<?> wildcardClass13 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(constantDescSetList6);
        org.junit.Assert.assertNull(charSequenceSetList8);
        org.junit.Assert.assertNotNull(charSequenceSetList10);
        org.junit.Assert.assertNotNull(charSequenceSetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        java.lang.Class[][][] classArray1 = new java.lang.Class[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][] wildcardClassArray2 = (java.lang.Class<?>[][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][]>> genericDeclarationArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][]) wildcardClassArray2, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][]>> genericDeclarationArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][]) wildcardClassArray2, 10);
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
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        com.thealgorithms.backtracking.Combination combination0 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination[] combinationArray1 = new com.thealgorithms.backtracking.Combination[] { combination0 };
        com.thealgorithms.backtracking.Combination combination2 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination[] combinationArray3 = new com.thealgorithms.backtracking.Combination[] { combination2 };
        com.thealgorithms.backtracking.Combination combination4 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination[] combinationArray5 = new com.thealgorithms.backtracking.Combination[] { combination4 };
        com.thealgorithms.backtracking.Combination combination6 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination[] combinationArray7 = new com.thealgorithms.backtracking.Combination[] { combination6 };
        com.thealgorithms.backtracking.Combination combination8 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination[] combinationArray9 = new com.thealgorithms.backtracking.Combination[] { combination8 };
        com.thealgorithms.backtracking.Combination combination10 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination[] combinationArray11 = new com.thealgorithms.backtracking.Combination[] { combination10 };
        com.thealgorithms.backtracking.Combination[][] combinationArray12 = new com.thealgorithms.backtracking.Combination[][] { combinationArray1, combinationArray3, combinationArray5, combinationArray7, combinationArray9, combinationArray11 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[]>> combinationArraySetList14 = com.thealgorithms.backtracking.Combination.combination(combinationArray12, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(combinationArray1);
        org.junit.Assert.assertNotNull(combinationArray3);
        org.junit.Assert.assertNotNull(combinationArray5);
        org.junit.Assert.assertNotNull(combinationArray7);
        org.junit.Assert.assertNotNull(combinationArray9);
        org.junit.Assert.assertNotNull(combinationArray11);
        org.junit.Assert.assertNotNull(combinationArray12);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        java.lang.Class[][][] classArray1 = new java.lang.Class[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][] wildcardClassArray2 = (java.lang.Class<?>[][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][]>> genericDeclarationArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][]) wildcardClassArray2, (int) (short) 100);
        java.lang.Class<?> wildcardClass9 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        java.lang.Class[][][][] classArray1 = new java.lang.Class[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, (-1));
        java.lang.Class<?> wildcardClass13 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(typeArraySetList6);
        org.junit.Assert.assertNotNull(typeArraySetList8);
        org.junit.Assert.assertNotNull(typeArraySetList10);
        org.junit.Assert.assertNotNull(typeArraySetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.Object>> objSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.Object[]) strArray2, (int) (short) 1);
        java.lang.Class<?> wildcardClass9 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(charSequenceSetList6);
        org.junit.Assert.assertNotNull(objSetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "", "" };
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList10 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray6, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.Object>> objSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.Object[]) strArray6, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, (int) (short) 10);
        java.lang.Class<?> wildcardClass17 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strComparableSetList8);
        org.junit.Assert.assertNotNull(serializableSetList10);
        org.junit.Assert.assertNotNull(objSetList12);
        org.junit.Assert.assertNull(strComparableSetList14);
        org.junit.Assert.assertNotNull(strComparableSetList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        java.lang.Iterable[] iterableArray1 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.TreeSet<java.lang.String>>[] strSetIterableArray2 = (java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]) iterableArray1;
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList4 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList6 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList8 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, (int) (byte) 10);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList10 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, 2);
        java.lang.Class<?> wildcardClass11 = setIterableSetList10.getClass();
        org.junit.Assert.assertNotNull(iterableArray1);
        org.junit.Assert.assertNotNull(strSetIterableArray2);
        org.junit.Assert.assertNotNull(setIterableSetList4);
        org.junit.Assert.assertNull(setIterableSetList6);
        org.junit.Assert.assertNotNull(setIterableSetList8);
        org.junit.Assert.assertNotNull(setIterableSetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "", "" };
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList10 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray6, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList12 = com.thealgorithms.backtracking.Combination.combination(strArray6, 1);
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray6, 2);
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray6, 10);
        java.lang.Class<?> wildcardClass17 = constantDescSetList16.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strComparableSetList8);
        org.junit.Assert.assertNotNull(serializableSetList10);
        org.junit.Assert.assertNotNull(strSetList12);
        org.junit.Assert.assertNotNull(constantDescSetList14);
        org.junit.Assert.assertNotNull(constantDescSetList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        java.lang.String[][][] strArray0 = new java.lang.String[][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, 3);
        java.lang.Class<?> wildcardClass3 = strArraySetList2.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        com.thealgorithms.backtracking.Combination combination0 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination1 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination2 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination[] combinationArray3 = new com.thealgorithms.backtracking.Combination[] { combination0, combination1, combination2 };
        com.thealgorithms.backtracking.Combination combination4 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination5 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination6 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination[] combinationArray7 = new com.thealgorithms.backtracking.Combination[] { combination4, combination5, combination6 };
        com.thealgorithms.backtracking.Combination combination8 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination9 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination10 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination[] combinationArray11 = new com.thealgorithms.backtracking.Combination[] { combination8, combination9, combination10 };
        com.thealgorithms.backtracking.Combination combination12 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination13 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination14 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination[] combinationArray15 = new com.thealgorithms.backtracking.Combination[] { combination12, combination13, combination14 };
        com.thealgorithms.backtracking.Combination combination16 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination17 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination18 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination[] combinationArray19 = new com.thealgorithms.backtracking.Combination[] { combination16, combination17, combination18 };
        com.thealgorithms.backtracking.Combination[][] combinationArray20 = new com.thealgorithms.backtracking.Combination[][] { combinationArray3, combinationArray7, combinationArray11, combinationArray15, combinationArray19 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[]>> combinationArraySetList22 = com.thealgorithms.backtracking.Combination.combination(combinationArray20, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(combinationArray3);
        org.junit.Assert.assertNotNull(combinationArray7);
        org.junit.Assert.assertNotNull(combinationArray11);
        org.junit.Assert.assertNotNull(combinationArray15);
        org.junit.Assert.assertNotNull(combinationArray19);
        org.junit.Assert.assertNotNull(combinationArray20);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        java.lang.invoke.TypeDescriptor[] typeDescriptorArray0 = null;
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList2 = com.thealgorithms.backtracking.Combination.combination(typeDescriptorArray0, (int) (byte) 0);
        org.junit.Assert.assertNull(typeDescriptorSetList2);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.Object>> objSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.Object[]) wildcardClassArray2, (int) ' ');
        java.lang.Class<?> wildcardClass13 = objSetList12.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(genericDeclarationSetList6);
        org.junit.Assert.assertNotNull(typeDescriptorSetList8);
        org.junit.Assert.assertNotNull(genericDeclarationSetList10);
        org.junit.Assert.assertNotNull(objSetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][]) wildcardClassArray2, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][]) wildcardClassArray2, (-1));
        java.lang.Class<?> wildcardClass11 = typeArraySetList10.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList6);
        org.junit.Assert.assertNotNull(typeArraySetList8);
        org.junit.Assert.assertNotNull(typeArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        com.thealgorithms.backtracking.Combination combination0 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination[] combinationArray1 = new com.thealgorithms.backtracking.Combination[] { combination0 };
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination>> combinationSetList3 = com.thealgorithms.backtracking.Combination.combination(combinationArray1, (int) (byte) 100);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination>> combinationSetList5 = com.thealgorithms.backtracking.Combination.combination(combinationArray1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = combinationArray1.getClass();
        org.junit.Assert.assertNotNull(combinationArray1);
        org.junit.Assert.assertNotNull(combinationSetList3);
        org.junit.Assert.assertNotNull(combinationSetList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
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
            java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>>> setListSetList63 = com.thealgorithms.backtracking.Combination.combination(strSetListArray49, (int) 'a');
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
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 5);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) wildcardClassArray2, (int) '#');
        java.lang.Class<?> wildcardClass11 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(constableArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        java.lang.Class[][][][] classArray1 = new java.lang.Class[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, (-1));
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 1);
        java.lang.Class<?> wildcardClass15 = typeArraySetList14.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(typeArraySetList6);
        org.junit.Assert.assertNotNull(typeArraySetList8);
        org.junit.Assert.assertNotNull(typeArraySetList10);
        org.junit.Assert.assertNotNull(typeArraySetList12);
        org.junit.Assert.assertNotNull(typeArraySetList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        java.lang.reflect.GenericDeclaration[][][][] genericDeclarationArray0 = new java.lang.reflect.GenericDeclaration[][][][] {};
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][]>> genericDeclarationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(genericDeclarationArray0, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][]>> genericDeclarationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(genericDeclarationArray0, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][]>> genericDeclarationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(genericDeclarationArray0, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][]>> genericDeclarationArraySetList8 = com.thealgorithms.backtracking.Combination.combination(genericDeclarationArray0, (int) '4');
        java.lang.Class<?> wildcardClass9 = genericDeclarationArray0.getClass();
        org.junit.Assert.assertNotNull(genericDeclarationArray0);
        org.junit.Assert.assertNull(genericDeclarationArraySetList2);
        org.junit.Assert.assertNull(genericDeclarationArraySetList4);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList6);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        java.lang.Class[][][] classArray1 = new java.lang.Class[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][] wildcardClassArray2 = (java.lang.Class<?>[][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][]>> typeArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][]) wildcardClassArray2, 0);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNull(typeArraySetList8);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        java.util.List<java.util.TreeSet<java.lang.String>>[][][] strSetListArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][]>> listArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strSetListArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"[Ljava.lang.Object;.clone()\" because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        java.lang.Class[][][][] classArray1 = new java.lang.Class[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, (int) '4');
        java.lang.Class<?> wildcardClass11 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(typeArraySetList6);
        org.junit.Assert.assertNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(typeArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        java.util.List[][] listArray1 = new java.util.List[0][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (-1));
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]>> iterableArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.Iterable<java.util.TreeSet<java.lang.String>>[][]) strSetListArray2, (int) '4');
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList10 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) 100);
        java.lang.Class<?> wildcardClass11 = listArraySetList10.getClass();
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArraySetList4);
        org.junit.Assert.assertNotNull(listArraySetList6);
        org.junit.Assert.assertNotNull(iterableArraySetList8);
        org.junit.Assert.assertNotNull(listArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> wildcardClassOfFieldSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[]) wildcardClassArray2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass11 = wildcardClassOfFieldSetList10.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(typeDescriptorSetList6);
        org.junit.Assert.assertNotNull(typeDescriptorSetList8);
        org.junit.Assert.assertNotNull(wildcardClassOfFieldSetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
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
        java.lang.Class<?> wildcardClass24 = listArraySetList23.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        java.lang.String[][][][] strArray0 = new java.lang.String[][][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) 10);
        java.util.List<java.util.TreeSet<java.lang.String[][][]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.lang.String[][][]>> strArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strArray0, 100);
        java.lang.Class<?> wildcardClass7 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNotNull(strArraySetList4);
        org.junit.Assert.assertNotNull(strArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
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
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][]>> listArraySetList23 = com.thealgorithms.backtracking.Combination.combination(strSetListArray15, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][]>> listArraySetList25 = com.thealgorithms.backtracking.Combination.combination(strSetListArray15, (-1));
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
        org.junit.Assert.assertNotNull(listArraySetList23);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, (-1));
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) strArray0, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.CharSequence[]>> charSequenceArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[][]) strArray0, 1);
        java.util.List<java.util.TreeSet<java.lang.CharSequence[]>> charSequenceArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[][]) strArray0, 1);
        java.lang.Class<?> wildcardClass11 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNotNull(strArraySetList4);
        org.junit.Assert.assertNotNull(constableArraySetList6);
        org.junit.Assert.assertNotNull(charSequenceArraySetList8);
        org.junit.Assert.assertNotNull(charSequenceArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
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
            java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>>> setListSetList63 = com.thealgorithms.backtracking.Combination.combination(strSetListArray49, (int) (byte) 10);
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
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList4 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray0, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strArray0, 0);
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strArray0, (-1));
        java.util.List<java.util.TreeSet<java.lang.CharSequence[]>> charSequenceArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[][]) strArray0, (-1));
        java.lang.Class<?> wildcardClass11 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNull(serializableSetList4);
        org.junit.Assert.assertNull(strArraySetList6);
        org.junit.Assert.assertNotNull(strArraySetList8);
        org.junit.Assert.assertNotNull(charSequenceArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray2, 1);
        java.lang.Class<?> wildcardClass7 = constantDescSetList6.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(constantDescSetList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList8 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 0);
        java.lang.Class<?> wildcardClass11 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(constantDescSetList6);
        org.junit.Assert.assertNotNull(strSetList8);
        org.junit.Assert.assertNull(charSequenceSetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        java.lang.String[][][] strArray0 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray1 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray2 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray3 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray4 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray5 = new java.lang.String[][][] {};
        java.lang.String[][][][] strArray6 = new java.lang.String[][][][] { strArray0, strArray1, strArray2, strArray3, strArray4, strArray5 };
        java.lang.String[][][][][] strArray7 = new java.lang.String[][][][][] { strArray6 };
        java.lang.String[][][][][][] strArray8 = new java.lang.String[][][][][][] { strArray7 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList10 = com.thealgorithms.backtracking.Combination.combination(strArray8, 1);
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
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        java.lang.String[][][][][] strArray0 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray1 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray2 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray3 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][][] strArray4 = new java.lang.String[][][][][][] { strArray0, strArray1, strArray2, strArray3 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strArray4, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        java.util.List<java.util.TreeSet<java.lang.String>>[][] strSetListArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strSetListArray0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"[Ljava.lang.Object;.clone()\" because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
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
            java.util.List<java.util.TreeSet<java.util.Collection<java.util.TreeSet<java.lang.String>>>> setCollectionSetList63 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection<java.util.TreeSet<java.lang.String>>[]) strSetListArray49, (int) (short) 10);
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
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList4 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable>> constableSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[]) strArray2, 4);
        java.lang.Class<?> wildcardClass7 = constableSetList6.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strComparableSetList4);
        org.junit.Assert.assertNotNull(constableSetList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        java.util.List[][] listArray1 = new java.util.List[0][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (-1));
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][]) strSetListArray2, (int) (short) 10);
        java.lang.Class<?> wildcardClass9 = strSetListArray2.getClass();
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArraySetList4);
        org.junit.Assert.assertNotNull(listArraySetList6);
        org.junit.Assert.assertNotNull(collectionArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        java.lang.Class[][][] classArray1 = new java.lang.Class[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][] wildcardClassArray2 = (java.lang.Class<?>[][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 1);
        java.lang.Class<?> wildcardClass9 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        java.lang.Iterable[] iterableArray1 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.TreeSet<java.lang.String>>[] strSetIterableArray2 = (java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]) iterableArray1;
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList4 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList6 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList8 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, (int) (byte) 10);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList10 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, 2);
        java.lang.Class<?> wildcardClass11 = strSetIterableArray2.getClass();
        org.junit.Assert.assertNotNull(iterableArray1);
        org.junit.Assert.assertNotNull(strSetIterableArray2);
        org.junit.Assert.assertNotNull(setIterableSetList4);
        org.junit.Assert.assertNull(setIterableSetList6);
        org.junit.Assert.assertNotNull(setIterableSetList8);
        org.junit.Assert.assertNotNull(setIterableSetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) wildcardClassArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) wildcardClassArray2, (int) ' ');
        java.lang.Class<?> wildcardClass15 = constableArraySetList14.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNull(genericDeclarationArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(constableArraySetList10);
        org.junit.Assert.assertNull(wildcardClassArraySetList12);
        org.junit.Assert.assertNotNull(constableArraySetList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        java.lang.String[][][][][] strArray0 = new java.lang.String[][][][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, 100);
        java.util.List<java.util.TreeSet<java.lang.String[][][][]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, 4);
        java.lang.Class<?> wildcardClass5 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNotNull(strArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        java.lang.Iterable<java.util.TreeSet<java.lang.String>>[][] strSetIterableArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]>> iterableArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"[Ljava.lang.Object;.clone()\" because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        com.thealgorithms.backtracking.Combination combination0 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination1 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination[] combinationArray2 = new com.thealgorithms.backtracking.Combination[] { combination0, combination1 };
        com.thealgorithms.backtracking.Combination combination3 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination4 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination[] combinationArray5 = new com.thealgorithms.backtracking.Combination[] { combination3, combination4 };
        com.thealgorithms.backtracking.Combination combination6 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination7 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination[] combinationArray8 = new com.thealgorithms.backtracking.Combination[] { combination6, combination7 };
        com.thealgorithms.backtracking.Combination combination9 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination10 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination[] combinationArray11 = new com.thealgorithms.backtracking.Combination[] { combination9, combination10 };
        com.thealgorithms.backtracking.Combination[][] combinationArray12 = new com.thealgorithms.backtracking.Combination[][] { combinationArray2, combinationArray5, combinationArray8, combinationArray11 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[]>> combinationArraySetList14 = com.thealgorithms.backtracking.Combination.combination(combinationArray12, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(combinationArray2);
        org.junit.Assert.assertNotNull(combinationArray5);
        org.junit.Assert.assertNotNull(combinationArray8);
        org.junit.Assert.assertNotNull(combinationArray11);
        org.junit.Assert.assertNotNull(combinationArray12);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        java.util.List[][] listArray1 = new java.util.List[0][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]>> iterableArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.Iterable<java.util.TreeSet<java.lang.String>>[][]) strSetListArray2, (int) '4');
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][]) strSetListArray2, 10);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList10 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) 1);
        java.lang.Class<?> wildcardClass11 = strSetListArray2.getClass();
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArraySetList4);
        org.junit.Assert.assertNotNull(iterableArraySetList6);
        org.junit.Assert.assertNotNull(collectionArraySetList8);
        org.junit.Assert.assertNotNull(listArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        java.lang.Class[][][][] classArray1 = new java.lang.Class[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (-1));
        java.lang.Class<?> wildcardClass9 = wildcardClassArraySetList8.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(typeArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> wildcardClassOfFieldSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[]) wildcardClassArray2, 2);
        java.lang.Class<?> wildcardClass11 = wildcardClassOfFieldSetList10.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(genericDeclarationSetList6);
        org.junit.Assert.assertNotNull(typeDescriptorSetList8);
        org.junit.Assert.assertNotNull(wildcardClassOfFieldSetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.Object>> objSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.Object[]) strArray2, (int) (short) 1);
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = constantDescSetList10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(charSequenceSetList6);
        org.junit.Assert.assertNotNull(objSetList8);
        org.junit.Assert.assertNull(constantDescSetList10);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
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
            java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>>> setListSetList22 = com.thealgorithms.backtracking.Combination.combination(strSetListArray12, (int) (short) 10);
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
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        java.lang.Class<?>[][][][][] wildcardClassArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList2 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"[Ljava.lang.Object;.clone()\" because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        java.lang.Class[][][] classArray1 = new java.lang.Class[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][] wildcardClassArray2 = (java.lang.Class<?>[][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][]>> typeArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][]) wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][]>> genericDeclarationArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][]) wildcardClassArray2, (int) (byte) 100);
        java.lang.Class<?> wildcardClass11 = genericDeclarationArraySetList10.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(typeArraySetList8);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        java.lang.reflect.GenericDeclaration[][][][] genericDeclarationArray0 = new java.lang.reflect.GenericDeclaration[][][][] {};
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][]>> genericDeclarationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(genericDeclarationArray0, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][]>> genericDeclarationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(genericDeclarationArray0, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][]>> genericDeclarationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(genericDeclarationArray0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass7 = genericDeclarationArraySetList6.getClass();
        org.junit.Assert.assertNotNull(genericDeclarationArray0);
        org.junit.Assert.assertNull(genericDeclarationArraySetList2);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList4);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList8 = com.thealgorithms.backtracking.Combination.combination(strArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass11 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(charSequenceSetList6);
        org.junit.Assert.assertNull(strSetList8);
        org.junit.Assert.assertNotNull(constantDescSetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][]) wildcardClassArray2, 5);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][]) wildcardClassArray2, (int) (short) 10);
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
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
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
            java.lang.Class<?> wildcardClass21 = setCollectionSetList20.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable>> constableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[]) strArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList10 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) (short) 1);
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray2, (int) (short) 1);
        java.lang.Class<?> wildcardClass13 = constantDescSetList12.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(charSequenceSetList6);
        org.junit.Assert.assertNotNull(constableSetList8);
        org.junit.Assert.assertNotNull(strSetList10);
        org.junit.Assert.assertNotNull(constantDescSetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, (-1));
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) strArray0, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.CharSequence[]>> charSequenceArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[][]) strArray0, 1);
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList10 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (short) 100);
        java.lang.Class<?> wildcardClass11 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNotNull(strArraySetList4);
        org.junit.Assert.assertNotNull(constableArraySetList6);
        org.junit.Assert.assertNotNull(charSequenceArraySetList8);
        org.junit.Assert.assertNotNull(strArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        java.lang.reflect.GenericDeclaration[][][][] genericDeclarationArray0 = new java.lang.reflect.GenericDeclaration[][][][] {};
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][]>> genericDeclarationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(genericDeclarationArray0, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][]>> genericDeclarationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(genericDeclarationArray0, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][]>> genericDeclarationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(genericDeclarationArray0, 10);
        java.lang.Class<?> wildcardClass7 = genericDeclarationArray0.getClass();
        org.junit.Assert.assertNotNull(genericDeclarationArray0);
        org.junit.Assert.assertNull(genericDeclarationArraySetList2);
        org.junit.Assert.assertNull(genericDeclarationArraySetList4);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList14 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 4);
        java.lang.Class<?> wildcardClass15 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(genericDeclarationSetList6);
        org.junit.Assert.assertNotNull(typeDescriptorSetList8);
        org.junit.Assert.assertNull(genericDeclarationSetList10);
        org.junit.Assert.assertNull(typeDescriptorSetList12);
        org.junit.Assert.assertNotNull(wildcardClassSetList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "", "" };
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable>> constableSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[]) strArray6, (int) (short) 0);
        java.lang.Class<?> wildcardClass11 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strComparableSetList8);
        org.junit.Assert.assertNull(constableSetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.Object>> objSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.Object[]) wildcardClassArray2, (int) ' ');
        java.lang.Class<?> wildcardClass13 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(genericDeclarationSetList6);
        org.junit.Assert.assertNotNull(typeDescriptorSetList8);
        org.junit.Assert.assertNotNull(genericDeclarationSetList10);
        org.junit.Assert.assertNotNull(objSetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        java.lang.String[][][] strArray0 = new java.lang.String[][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (short) 100);
        java.lang.Class<?> wildcardClass3 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) wildcardClassArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) wildcardClassArray2, (int) ' ');
        java.lang.Class<?> wildcardClass15 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNull(genericDeclarationArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(constableArraySetList10);
        org.junit.Assert.assertNull(wildcardClassArraySetList12);
        org.junit.Assert.assertNotNull(constableArraySetList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        java.lang.Class[][][][] classArray1 = new java.lang.Class[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, (-1));
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 1);
        java.lang.Class<?> wildcardClass15 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(typeArraySetList6);
        org.junit.Assert.assertNotNull(typeArraySetList8);
        org.junit.Assert.assertNotNull(typeArraySetList10);
        org.junit.Assert.assertNotNull(typeArraySetList12);
        org.junit.Assert.assertNotNull(typeArraySetList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        java.lang.Class[][][][] classArray1 = new java.lang.Class[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][]) classArray1;
        java.lang.Class[][][][] classArray4 = new java.lang.Class[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][] wildcardClassArray5 = (java.lang.Class<?>[][][][]) classArray4;
        java.lang.Class[][][][][] classArray7 = new java.lang.Class[2][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][] wildcardClassArray8 = (java.lang.Class<?>[][][][][]) classArray7;
        wildcardClassArray8[0] = wildcardClassArray2;
        wildcardClassArray8[1] = wildcardClassArray5;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList14 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray8, (int) (byte) 1);
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
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "", "" };
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList10 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray6, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList12 = com.thealgorithms.backtracking.Combination.combination(strArray6, 1);
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray6, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList16 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray6, 2);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable>> constableSetList18 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[]) strArray6, (int) (byte) 100);
        java.lang.Class<?> wildcardClass19 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strComparableSetList8);
        org.junit.Assert.assertNotNull(serializableSetList10);
        org.junit.Assert.assertNotNull(strSetList12);
        org.junit.Assert.assertNotNull(constantDescSetList14);
        org.junit.Assert.assertNotNull(serializableSetList16);
        org.junit.Assert.assertNotNull(constableSetList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        java.lang.Iterable[] iterableArray1 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.TreeSet<java.lang.String>>[] strSetIterableArray2 = (java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]) iterableArray1;
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList4 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList6 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList8 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, (-1));
        java.lang.Class<?> wildcardClass9 = strSetIterableArray2.getClass();
        org.junit.Assert.assertNotNull(iterableArray1);
        org.junit.Assert.assertNotNull(strSetIterableArray2);
        org.junit.Assert.assertNotNull(setIterableSetList4);
        org.junit.Assert.assertNull(setIterableSetList6);
        org.junit.Assert.assertNotNull(setIterableSetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        java.lang.Class[][][] classArray1 = new java.lang.Class[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][] wildcardClassArray2 = (java.lang.Class<?>[][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 10);
        java.lang.Class<?> wildcardClass7 = wildcardClassArraySetList6.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        java.lang.Class[][][] classArray1 = new java.lang.Class[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][] wildcardClassArray2 = (java.lang.Class<?>[][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][]>> genericDeclarationArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][]) wildcardClassArray2, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][]>> genericDeclarationArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][]) wildcardClassArray2, 10);
        java.lang.Class<?> wildcardClass11 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList8);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.lang.String[][][] strArray1 = new java.lang.String[][][] { strArray0 };
        java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList3 = com.thealgorithms.backtracking.Combination.combination(strArray1, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList5 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray1, 0);
        java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList7 = com.thealgorithms.backtracking.Combination.combination(strArray1, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList9 = com.thealgorithms.backtracking.Combination.combination(strArray1, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList11 = com.thealgorithms.backtracking.Combination.combination(strArray1, 5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList13 = com.thealgorithms.backtracking.Combination.combination(strArray1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArraySetList3);
        org.junit.Assert.assertNull(serializableSetList5);
        org.junit.Assert.assertNotNull(strArraySetList7);
        org.junit.Assert.assertNull(strArraySetList9);
        org.junit.Assert.assertNotNull(strArraySetList11);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][]>> listArraySetList23 = com.thealgorithms.backtracking.Combination.combination(strSetListArray15, 1);
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
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        java.lang.String[][][][] strArray0 = new java.lang.String[][][][] {};
        java.util.List<java.util.TreeSet<java.lang.String[][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) 10);
        java.util.List<java.util.TreeSet<java.lang.String[][][]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, 0);
        java.lang.Class<?> wildcardClass5 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNull(strArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type>> typeSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[]) wildcardClassArray2, (-1));
        java.lang.Class<?> wildcardClass7 = typeSetList6.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(typeSetList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
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
            java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>>> setListSetList63 = com.thealgorithms.backtracking.Combination.combination(strSetListArray49, (int) (short) 10);
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
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        java.lang.Class[][][][][][][] classArray1 = new java.lang.Class[0][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 1);
        java.lang.Class<?> wildcardClass5 = wildcardClassArraySetList4.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        java.lang.reflect.GenericDeclaration[][][][] genericDeclarationArray0 = new java.lang.reflect.GenericDeclaration[][][][] {};
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][]>> genericDeclarationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(genericDeclarationArray0, 10);
        org.junit.Assert.assertNotNull(genericDeclarationArray0);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList2);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, (int) (short) -1);
        java.lang.Class<?> wildcardClass7 = genericDeclarationArraySetList6.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "", "" };
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList10 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray6, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.Object>> objSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.Object[]) strArray6, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, (int) (short) 10);
        java.lang.Class<?> wildcardClass17 = strComparableSetList16.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strComparableSetList8);
        org.junit.Assert.assertNotNull(serializableSetList10);
        org.junit.Assert.assertNotNull(objSetList12);
        org.junit.Assert.assertNull(strComparableSetList14);
        org.junit.Assert.assertNotNull(strComparableSetList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.CharSequence[]>> charSequenceArraySetList2 = com.thealgorithms.backtracking.Combination.combination(charSequenceArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"[Ljava.lang.Object;.clone()\" because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
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
        java.lang.Class<?> wildcardClass17 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(genericDeclarationSetList6);
        org.junit.Assert.assertNotNull(typeDescriptorSetList8);
        org.junit.Assert.assertNull(genericDeclarationSetList10);
        org.junit.Assert.assertNull(genericDeclarationSetList12);
        org.junit.Assert.assertNotNull(typeDescriptorSetList14);
        org.junit.Assert.assertNotNull(wildcardClassSetList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        java.lang.Iterable[] iterableArray1 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.TreeSet<java.lang.String>>[] strSetIterableArray2 = (java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]) iterableArray1;
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList4 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList6 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList8 = com.thealgorithms.backtracking.Combination.combination(strSetIterableArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.Object>> objSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.Object[]) strSetIterableArray2, (int) (short) 0);
        java.lang.Class<?> wildcardClass11 = strSetIterableArray2.getClass();
        org.junit.Assert.assertNotNull(iterableArray1);
        org.junit.Assert.assertNotNull(strSetIterableArray2);
        org.junit.Assert.assertNotNull(setIterableSetList4);
        org.junit.Assert.assertNull(setIterableSetList6);
        org.junit.Assert.assertNotNull(setIterableSetList8);
        org.junit.Assert.assertNull(objSetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.AnnotatedElement>> annotatedElementSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.AnnotatedElement[]) wildcardClassArray2, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>> wildcardClassOfFieldSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[]) wildcardClassArray2, 100);
        java.lang.Class<?> wildcardClass15 = wildcardClassOfFieldSetList14.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNull(typeDescriptorSetList6);
        org.junit.Assert.assertNotNull(annotatedElementSetList8);
        org.junit.Assert.assertNotNull(typeDescriptorSetList10);
        org.junit.Assert.assertNotNull(wildcardClassSetList12);
        org.junit.Assert.assertNotNull(wildcardClassOfFieldSetList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][]>> listArraySetList21 = com.thealgorithms.backtracking.Combination.combination(strSetListArray15, (int) (byte) 1);
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
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        java.lang.Class[][][][][] classArray1 = new java.lang.Class[0][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 10);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = wildcardClassArraySetList8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNull(wildcardClassArraySetList8);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        java.lang.String[][][][][][] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"[Ljava.lang.Object;.clone()\" because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList8 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) (byte) -1);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList13 = com.thealgorithms.backtracking.Combination.combination(strArray11, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList15 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray11, 1);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList17 = com.thealgorithms.backtracking.Combination.combination(strArray11, (int) (byte) -1);
        java.util.Collection[] collectionArray19 = new java.util.Collection[2];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.util.TreeSet<java.lang.String>>[] strSetCollectionArray20 = (java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray19;
        strSetCollectionArray20[0] = strSetList8;
        strSetCollectionArray20[1] = strSetList17;
        java.util.List<java.util.TreeSet<java.util.Collection<java.util.TreeSet<java.lang.String>>>> setCollectionSetList26 = com.thealgorithms.backtracking.Combination.combination(strSetCollectionArray20, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.Object>> objSetList28 = com.thealgorithms.backtracking.Combination.combination((java.lang.Object[]) strSetCollectionArray20, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(constantDescSetList6);
        org.junit.Assert.assertNotNull(strSetList8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strSetList13);
        org.junit.Assert.assertNotNull(constantDescSetList15);
        org.junit.Assert.assertNotNull(strSetList17);
        org.junit.Assert.assertNotNull(collectionArray19);
        org.junit.Assert.assertNotNull(strSetCollectionArray20);
        org.junit.Assert.assertNull(setCollectionSetList26);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        java.lang.reflect.Type[][] typeArray0 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray1 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray2 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray3 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray4 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][][] typeArray5 = new java.lang.reflect.Type[][][] { typeArray0, typeArray1, typeArray2, typeArray3, typeArray4 };
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][]>> typeArraySetList7 = com.thealgorithms.backtracking.Combination.combination(typeArray5, (int) (byte) 0);
        java.lang.Class<?> wildcardClass8 = typeArray5.getClass();
        org.junit.Assert.assertNotNull(typeArray0);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertNotNull(typeArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertNull(typeArraySetList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) wildcardClassArray2, (int) ' ');
        java.lang.Class<?> wildcardClass9 = constableArraySetList8.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList6);
        org.junit.Assert.assertNotNull(constableArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        java.lang.Class[][][][] classArray1 = new java.lang.Class[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList14 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 100);
        java.lang.Class<?> wildcardClass15 = wildcardClassArraySetList14.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(typeArraySetList6);
        org.junit.Assert.assertNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(typeArraySetList10);
        org.junit.Assert.assertNotNull(typeArraySetList12);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, (-1));
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) strArray0, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.CharSequence[]>> charSequenceArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[][]) strArray0, 1);
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList10 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) ' ');
        java.lang.Class<?> wildcardClass11 = strArraySetList10.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNotNull(strArraySetList4);
        org.junit.Assert.assertNotNull(constableArraySetList6);
        org.junit.Assert.assertNotNull(charSequenceArraySetList8);
        org.junit.Assert.assertNotNull(strArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList2 = com.thealgorithms.backtracking.Combination.combination(genericDeclarationArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"[Ljava.lang.Object;.clone()\" because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        java.util.Collection[][] collectionArray0 = new java.util.Collection[][] {};
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList2 = com.thealgorithms.backtracking.Combination.combination(collectionArray0, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList4 = com.thealgorithms.backtracking.Combination.combination(collectionArray0, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList6 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) collectionArray0, (int) '4');
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList8 = com.thealgorithms.backtracking.Combination.combination(collectionArray0, (int) '#');
        java.lang.Class<?> wildcardClass9 = collectionArraySetList8.getClass();
        org.junit.Assert.assertNotNull(collectionArray0);
        org.junit.Assert.assertNull(collectionArraySetList2);
        org.junit.Assert.assertNotNull(collectionArraySetList4);
        org.junit.Assert.assertNotNull(serializableSetList6);
        org.junit.Assert.assertNotNull(collectionArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        java.lang.reflect.Type[] typeArray0 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray1 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[][] typeArray2 = new java.lang.reflect.Type[][] { typeArray0, typeArray1 };
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList4 = com.thealgorithms.backtracking.Combination.combination(typeArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList6 = com.thealgorithms.backtracking.Combination.combination(typeArray2, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.reflect.Type[]>> typeArraySetList8 = com.thealgorithms.backtracking.Combination.combination(typeArray2, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray0);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertNull(typeArraySetList4);
        org.junit.Assert.assertNull(typeArraySetList6);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.AnnotatedElement>> annotatedElementSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.AnnotatedElement[]) wildcardClassArray2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass9 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNull(typeDescriptorSetList6);
        org.junit.Assert.assertNotNull(annotatedElementSetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) wildcardClassArray2, 0);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNull(genericDeclarationArraySetList6);
        org.junit.Assert.assertNull(serializableSetList8);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.Object>> objSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.Object[]) wildcardClassArray2, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = objSetList8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNull(typeDescriptorSetList6);
        org.junit.Assert.assertNull(objSetList8);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        java.lang.Class[][][][][] classArray1 = new java.lang.Class[0][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 10);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList10 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList12 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList14 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 0);
        java.lang.Class<?> wildcardClass15 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList12);
        org.junit.Assert.assertNull(wildcardClassArraySetList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type>> typeSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[]) wildcardClassArray2, 2);
        java.lang.Class<?> wildcardClass7 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(typeSetList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        com.thealgorithms.backtracking.Combination combination0 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination1 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination2 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination3 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination4 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination[] combinationArray5 = new com.thealgorithms.backtracking.Combination[] { combination0, combination1, combination2, combination3, combination4 };
        com.thealgorithms.backtracking.Combination[][] combinationArray6 = new com.thealgorithms.backtracking.Combination[][] { combinationArray5 };
        com.thealgorithms.backtracking.Combination combination7 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination8 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination9 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination10 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination11 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination[] combinationArray12 = new com.thealgorithms.backtracking.Combination[] { combination7, combination8, combination9, combination10, combination11 };
        com.thealgorithms.backtracking.Combination[][] combinationArray13 = new com.thealgorithms.backtracking.Combination[][] { combinationArray12 };
        com.thealgorithms.backtracking.Combination combination14 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination15 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination16 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination17 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination combination18 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination[] combinationArray19 = new com.thealgorithms.backtracking.Combination[] { combination14, combination15, combination16, combination17, combination18 };
        com.thealgorithms.backtracking.Combination[][] combinationArray20 = new com.thealgorithms.backtracking.Combination[][] { combinationArray19 };
        com.thealgorithms.backtracking.Combination[][][] combinationArray21 = new com.thealgorithms.backtracking.Combination[][][] { combinationArray6, combinationArray13, combinationArray20 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][]>> combinationArraySetList23 = com.thealgorithms.backtracking.Combination.combination(combinationArray21, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(combinationArray5);
        org.junit.Assert.assertNotNull(combinationArray6);
        org.junit.Assert.assertNotNull(combinationArray12);
        org.junit.Assert.assertNotNull(combinationArray13);
        org.junit.Assert.assertNotNull(combinationArray19);
        org.junit.Assert.assertNotNull(combinationArray20);
        org.junit.Assert.assertNotNull(combinationArray21);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) 'a');
        java.util.Collection[] collectionArray9 = new java.util.Collection[] { wildcardClassArraySetList8 };
        java.lang.Class[][] classArray11 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray12 = (java.lang.Class<?>[][]) classArray11;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList14 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray12, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray12, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList18 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray12, (int) 'a');
        java.util.Collection[] collectionArray19 = new java.util.Collection[] { wildcardClassArraySetList18 };
        java.lang.Class[][] classArray21 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray22 = (java.lang.Class<?>[][]) classArray21;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList24 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray22, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList26 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray22, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList28 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray22, (int) 'a');
        java.util.Collection[] collectionArray29 = new java.util.Collection[] { wildcardClassArraySetList28 };
        java.lang.Class[][] classArray31 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray32 = (java.lang.Class<?>[][]) classArray31;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList34 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray32, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[]>> genericDeclarationArraySetList36 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray32, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[]>> wildcardClassArraySetList38 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray32, (int) 'a');
        java.util.Collection[] collectionArray39 = new java.util.Collection[] { wildcardClassArraySetList38 };
        java.util.Collection[][] collectionArray40 = new java.util.Collection[][] { collectionArray9, collectionArray19, collectionArray29, collectionArray39 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList42 = com.thealgorithms.backtracking.Combination.combination(collectionArray40, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(collectionArray9);
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList14);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList16);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList18);
        org.junit.Assert.assertNotNull(collectionArray19);
        org.junit.Assert.assertNotNull(classArray21);
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList24);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList26);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList28);
        org.junit.Assert.assertNotNull(collectionArray29);
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList34);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList36);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList38);
        org.junit.Assert.assertNotNull(collectionArray39);
        org.junit.Assert.assertNotNull(collectionArray40);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList8 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) (byte) -1);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "", "", "", "", "" };
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList17 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray15, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList19 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray15, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList21 = com.thealgorithms.backtracking.Combination.combination(strArray15, 1);
        java.util.Collection[] collectionArray23 = new java.util.Collection[2];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.util.TreeSet<java.lang.String>>[] strSetCollectionArray24 = (java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray23;
        strSetCollectionArray24[0] = strSetList8;
        strSetCollectionArray24[1] = strSetList21;
        java.util.List<java.util.TreeSet<java.util.Collection<java.util.TreeSet<java.lang.String>>>> setCollectionSetList30 = com.thealgorithms.backtracking.Combination.combination(strSetCollectionArray24, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass31 = setCollectionSetList30.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(constantDescSetList6);
        org.junit.Assert.assertNotNull(strSetList8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strComparableSetList17);
        org.junit.Assert.assertNotNull(serializableSetList19);
        org.junit.Assert.assertNotNull(strSetList21);
        org.junit.Assert.assertNotNull(collectionArray23);
        org.junit.Assert.assertNotNull(strSetCollectionArray24);
        org.junit.Assert.assertNull(setCollectionSetList30);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        java.util.List[] listArray1 = new java.util.List[0];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[]) listArray1;
        java.util.List[] listArray4 = new java.util.List[0];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[] strSetListArray5 = (java.util.List<java.util.TreeSet<java.lang.String>>[]) listArray4;
        java.util.List[] listArray7 = new java.util.List[0];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[] strSetListArray8 = (java.util.List<java.util.TreeSet<java.lang.String>>[]) listArray7;
        java.util.List[][] listArray10 = new java.util.List[3][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][] strSetListArray11 = (java.util.List<java.util.TreeSet<java.lang.String>>[][]) listArray10;
        strSetListArray11[0] = strSetListArray2;
        strSetListArray11[1] = listArray4;
        strSetListArray11[2] = strSetListArray8;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList19 = com.thealgorithms.backtracking.Combination.combination(strSetListArray11, (int) (short) 10);
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
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, (-1));
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) strArray0, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.CharSequence[]>> charSequenceArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[][]) strArray0, 1);
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList10 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) ' ');
        java.lang.Class<?> wildcardClass11 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNotNull(strArraySetList4);
        org.junit.Assert.assertNotNull(constableArraySetList6);
        org.junit.Assert.assertNotNull(charSequenceArraySetList8);
        org.junit.Assert.assertNotNull(strArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.AnnotatedElement>> annotatedElementSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.AnnotatedElement[]) wildcardClassArray2, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[]) wildcardClassArray2, (int) ' ');
        java.util.List<java.util.TreeSet<java.lang.reflect.Type>> typeSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[]) wildcardClassArray2, (int) '4');
        java.lang.Class<?> wildcardClass15 = typeSetList14.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNull(typeDescriptorSetList6);
        org.junit.Assert.assertNotNull(annotatedElementSetList8);
        org.junit.Assert.assertNotNull(typeDescriptorSetList10);
        org.junit.Assert.assertNotNull(genericDeclarationSetList12);
        org.junit.Assert.assertNotNull(typeSetList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "", "" };
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList10 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray6, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.Object>> objSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.Object[]) strArray6, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray6, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = constantDescSetList14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strComparableSetList8);
        org.junit.Assert.assertNotNull(serializableSetList10);
        org.junit.Assert.assertNotNull(objSetList12);
        org.junit.Assert.assertNull(constantDescSetList14);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        java.lang.Class[][][] classArray1 = new java.lang.Class[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][] wildcardClassArray2 = (java.lang.Class<?>[][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][]>> genericDeclarationArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][]) wildcardClassArray2, 5);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][]>> typeArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][]) wildcardClassArray2, 3);
        java.lang.Class<?> wildcardClass9 = typeArraySetList8.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList6);
        org.junit.Assert.assertNotNull(typeArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.lang.String[][] strArray9 = new java.lang.String[][] { strArray2, strArray5, strArray8 };
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.lang.String[] strArray15 = new java.lang.String[] { "", "" };
        java.lang.String[] strArray18 = new java.lang.String[] { "", "" };
        java.lang.String[][] strArray19 = new java.lang.String[][] { strArray12, strArray15, strArray18 };
        java.lang.String[][][] strArray20 = new java.lang.String[][][] { strArray9, strArray19 };
        java.lang.String[][][][] strArray21 = new java.lang.String[][][][] { strArray20 };
        java.lang.String[][][][][] strArray22 = new java.lang.String[][][][][] { strArray21 };
        java.lang.String[] strArray25 = new java.lang.String[] { "", "" };
        java.lang.String[] strArray28 = new java.lang.String[] { "", "" };
        java.lang.String[] strArray31 = new java.lang.String[] { "", "" };
        java.lang.String[][] strArray32 = new java.lang.String[][] { strArray25, strArray28, strArray31 };
        java.lang.String[] strArray35 = new java.lang.String[] { "", "" };
        java.lang.String[] strArray38 = new java.lang.String[] { "", "" };
        java.lang.String[] strArray41 = new java.lang.String[] { "", "" };
        java.lang.String[][] strArray42 = new java.lang.String[][] { strArray35, strArray38, strArray41 };
        java.lang.String[][][] strArray43 = new java.lang.String[][][] { strArray32, strArray42 };
        java.lang.String[][][][] strArray44 = new java.lang.String[][][][] { strArray43 };
        java.lang.String[][][][][] strArray45 = new java.lang.String[][][][][] { strArray44 };
        java.lang.String[] strArray48 = new java.lang.String[] { "", "" };
        java.lang.String[] strArray51 = new java.lang.String[] { "", "" };
        java.lang.String[] strArray54 = new java.lang.String[] { "", "" };
        java.lang.String[][] strArray55 = new java.lang.String[][] { strArray48, strArray51, strArray54 };
        java.lang.String[] strArray58 = new java.lang.String[] { "", "" };
        java.lang.String[] strArray61 = new java.lang.String[] { "", "" };
        java.lang.String[] strArray64 = new java.lang.String[] { "", "" };
        java.lang.String[][] strArray65 = new java.lang.String[][] { strArray58, strArray61, strArray64 };
        java.lang.String[][][] strArray66 = new java.lang.String[][][] { strArray55, strArray65 };
        java.lang.String[][][][] strArray67 = new java.lang.String[][][][] { strArray66 };
        java.lang.String[][][][][] strArray68 = new java.lang.String[][][][][] { strArray67 };
        java.lang.String[] strArray71 = new java.lang.String[] { "", "" };
        java.lang.String[] strArray74 = new java.lang.String[] { "", "" };
        java.lang.String[] strArray77 = new java.lang.String[] { "", "" };
        java.lang.String[][] strArray78 = new java.lang.String[][] { strArray71, strArray74, strArray77 };
        java.lang.String[] strArray81 = new java.lang.String[] { "", "" };
        java.lang.String[] strArray84 = new java.lang.String[] { "", "" };
        java.lang.String[] strArray87 = new java.lang.String[] { "", "" };
        java.lang.String[][] strArray88 = new java.lang.String[][] { strArray81, strArray84, strArray87 };
        java.lang.String[][][] strArray89 = new java.lang.String[][][] { strArray78, strArray88 };
        java.lang.String[][][][] strArray90 = new java.lang.String[][][][] { strArray89 };
        java.lang.String[][][][][] strArray91 = new java.lang.String[][][][][] { strArray90 };
        java.lang.String[][][][][][] strArray92 = new java.lang.String[][][][][][] { strArray22, strArray45, strArray68, strArray91 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList94 = com.thealgorithms.backtracking.Combination.combination(strArray92, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertNotNull(strArray88);
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertNotNull(strArray91);
        org.junit.Assert.assertNotNull(strArray92);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable>> constableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[]) strArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.Object>> objSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.Object[]) strArray2, (int) (short) 0);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList12 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = strSetList12.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(charSequenceSetList6);
        org.junit.Assert.assertNotNull(constableSetList8);
        org.junit.Assert.assertNull(objSetList10);
        org.junit.Assert.assertNotNull(strSetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "", "" };
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray6, (int) (short) -1);
        java.lang.Class<?> wildcardClass15 = charSequenceSetList14.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strComparableSetList8);
        org.junit.Assert.assertNotNull(strComparableSetList10);
        org.junit.Assert.assertNotNull(strComparableSetList12);
        org.junit.Assert.assertNotNull(charSequenceSetList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList8 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) (byte) -1);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "", "", "", "", "" };
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList17 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray15, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList19 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray15, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList21 = com.thealgorithms.backtracking.Combination.combination(strArray15, 1);
        java.util.Collection[] collectionArray23 = new java.util.Collection[2];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.util.TreeSet<java.lang.String>>[] strSetCollectionArray24 = (java.util.Collection<java.util.TreeSet<java.lang.String>>[]) collectionArray23;
        strSetCollectionArray24[0] = strSetList8;
        strSetCollectionArray24[1] = strSetList21;
        java.util.List<java.util.TreeSet<java.util.Collection<java.util.TreeSet<java.lang.String>>>> setCollectionSetList30 = com.thealgorithms.backtracking.Combination.combination(strSetCollectionArray24, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>>> setIterableSetList32 = com.thealgorithms.backtracking.Combination.combination((java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]) strSetCollectionArray24, (int) (byte) 10);
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
        org.junit.Assert.assertNotNull(strSetList21);
        org.junit.Assert.assertNotNull(collectionArray23);
        org.junit.Assert.assertNotNull(strSetCollectionArray24);
        org.junit.Assert.assertNull(setCollectionSetList30);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        java.lang.Class[][][] classArray1 = new java.lang.Class[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][] wildcardClassArray2 = (java.lang.Class<?>[][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][]>> genericDeclarationArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][]) wildcardClassArray2, (-1));
        java.lang.Class<?> wildcardClass7 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        java.lang.Class[][][][] classArray1 = new java.lang.Class[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, (-1));
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][]>> genericDeclarationArraySetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][][]) wildcardClassArray2, 5);
        java.lang.Class<?> wildcardClass17 = genericDeclarationArraySetList16.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(typeArraySetList6);
        org.junit.Assert.assertNotNull(typeArraySetList8);
        org.junit.Assert.assertNotNull(typeArraySetList10);
        org.junit.Assert.assertNotNull(typeArraySetList12);
        org.junit.Assert.assertNotNull(typeArraySetList14);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, (-1));
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) strArray0, (int) 'a');
        java.lang.Class<?> wildcardClass7 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNotNull(strArraySetList4);
        org.junit.Assert.assertNotNull(constableArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "", "" };
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList10 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray6, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList12 = com.thealgorithms.backtracking.Combination.combination(strArray6, 1);
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray6, 2);
        java.lang.Class<?> wildcardClass15 = constantDescSetList14.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strComparableSetList8);
        org.junit.Assert.assertNotNull(serializableSetList10);
        org.junit.Assert.assertNotNull(strSetList12);
        org.junit.Assert.assertNotNull(constantDescSetList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        com.thealgorithms.backtracking.Combination[] combinationArray0 = new com.thealgorithms.backtracking.Combination[] {};
        com.thealgorithms.backtracking.Combination[] combinationArray1 = new com.thealgorithms.backtracking.Combination[] {};
        com.thealgorithms.backtracking.Combination[] combinationArray2 = new com.thealgorithms.backtracking.Combination[] {};
        com.thealgorithms.backtracking.Combination[] combinationArray3 = new com.thealgorithms.backtracking.Combination[] {};
        com.thealgorithms.backtracking.Combination[] combinationArray4 = new com.thealgorithms.backtracking.Combination[] {};
        com.thealgorithms.backtracking.Combination[][] combinationArray5 = new com.thealgorithms.backtracking.Combination[][] { combinationArray0, combinationArray1, combinationArray2, combinationArray3, combinationArray4 };
        com.thealgorithms.backtracking.Combination[] combinationArray6 = new com.thealgorithms.backtracking.Combination[] {};
        com.thealgorithms.backtracking.Combination[] combinationArray7 = new com.thealgorithms.backtracking.Combination[] {};
        com.thealgorithms.backtracking.Combination[] combinationArray8 = new com.thealgorithms.backtracking.Combination[] {};
        com.thealgorithms.backtracking.Combination[] combinationArray9 = new com.thealgorithms.backtracking.Combination[] {};
        com.thealgorithms.backtracking.Combination[] combinationArray10 = new com.thealgorithms.backtracking.Combination[] {};
        com.thealgorithms.backtracking.Combination[][] combinationArray11 = new com.thealgorithms.backtracking.Combination[][] { combinationArray6, combinationArray7, combinationArray8, combinationArray9, combinationArray10 };
        com.thealgorithms.backtracking.Combination[] combinationArray12 = new com.thealgorithms.backtracking.Combination[] {};
        com.thealgorithms.backtracking.Combination[] combinationArray13 = new com.thealgorithms.backtracking.Combination[] {};
        com.thealgorithms.backtracking.Combination[] combinationArray14 = new com.thealgorithms.backtracking.Combination[] {};
        com.thealgorithms.backtracking.Combination[] combinationArray15 = new com.thealgorithms.backtracking.Combination[] {};
        com.thealgorithms.backtracking.Combination[] combinationArray16 = new com.thealgorithms.backtracking.Combination[] {};
        com.thealgorithms.backtracking.Combination[][] combinationArray17 = new com.thealgorithms.backtracking.Combination[][] { combinationArray12, combinationArray13, combinationArray14, combinationArray15, combinationArray16 };
        com.thealgorithms.backtracking.Combination[][][] combinationArray18 = new com.thealgorithms.backtracking.Combination[][][] { combinationArray5, combinationArray11, combinationArray17 };
        com.thealgorithms.backtracking.Combination[][][][] combinationArray19 = new com.thealgorithms.backtracking.Combination[][][][] { combinationArray18 };
        com.thealgorithms.backtracking.Combination[][][][][] combinationArray20 = new com.thealgorithms.backtracking.Combination[][][][][] { combinationArray19 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination[][][][]>> combinationArraySetList22 = com.thealgorithms.backtracking.Combination.combination(combinationArray20, (int) (short) -1);
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
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        java.util.List[][] listArray1 = new java.util.List[0][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (-1));
        java.util.List<java.util.TreeSet<java.util.Collection[]>> collectionArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.util.Collection[][]) strSetListArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList10 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, 3);
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
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        java.lang.Class[][][][] classArray1 = new java.lang.Class[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, (int) '4');
        java.lang.Class<?> wildcardClass11 = typeArraySetList10.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(typeArraySetList6);
        org.junit.Assert.assertNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(typeArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        java.lang.String[][][] strArray0 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray1 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray2 = new java.lang.String[][][] {};
        java.lang.String[][][][] strArray3 = new java.lang.String[][][][] { strArray0, strArray1, strArray2 };
        java.lang.String[][][] strArray4 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray5 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray6 = new java.lang.String[][][] {};
        java.lang.String[][][][] strArray7 = new java.lang.String[][][][] { strArray4, strArray5, strArray6 };
        java.lang.String[][][] strArray8 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray9 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray10 = new java.lang.String[][][] {};
        java.lang.String[][][][] strArray11 = new java.lang.String[][][][] { strArray8, strArray9, strArray10 };
        java.lang.String[][][] strArray12 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray13 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray14 = new java.lang.String[][][] {};
        java.lang.String[][][][] strArray15 = new java.lang.String[][][][] { strArray12, strArray13, strArray14 };
        java.lang.String[][][] strArray16 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray17 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray18 = new java.lang.String[][][] {};
        java.lang.String[][][][] strArray19 = new java.lang.String[][][][] { strArray16, strArray17, strArray18 };
        java.lang.String[][][][][] strArray20 = new java.lang.String[][][][][] { strArray3, strArray7, strArray11, strArray15, strArray19 };
        java.lang.String[][][] strArray21 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray22 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray23 = new java.lang.String[][][] {};
        java.lang.String[][][][] strArray24 = new java.lang.String[][][][] { strArray21, strArray22, strArray23 };
        java.lang.String[][][] strArray25 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray26 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray27 = new java.lang.String[][][] {};
        java.lang.String[][][][] strArray28 = new java.lang.String[][][][] { strArray25, strArray26, strArray27 };
        java.lang.String[][][] strArray29 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray30 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray31 = new java.lang.String[][][] {};
        java.lang.String[][][][] strArray32 = new java.lang.String[][][][] { strArray29, strArray30, strArray31 };
        java.lang.String[][][] strArray33 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray34 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray35 = new java.lang.String[][][] {};
        java.lang.String[][][][] strArray36 = new java.lang.String[][][][] { strArray33, strArray34, strArray35 };
        java.lang.String[][][] strArray37 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray38 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray39 = new java.lang.String[][][] {};
        java.lang.String[][][][] strArray40 = new java.lang.String[][][][] { strArray37, strArray38, strArray39 };
        java.lang.String[][][][][] strArray41 = new java.lang.String[][][][][] { strArray24, strArray28, strArray32, strArray36, strArray40 };
        java.lang.String[][][][][][] strArray42 = new java.lang.String[][][][][][] { strArray20, strArray41 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.String[][][][][]>> strArraySetList44 = com.thealgorithms.backtracking.Combination.combination(strArray42, (int) (byte) 1);
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
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
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
        java.lang.Class<?> wildcardClass62 = strSetListArray49.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
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
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][]>> genericDeclarationArraySetList18 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][][]) wildcardClassArray2, 0);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(typeArraySetList6);
        org.junit.Assert.assertNotNull(typeArraySetList8);
        org.junit.Assert.assertNotNull(typeArraySetList10);
        org.junit.Assert.assertNotNull(typeArraySetList12);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList14);
        org.junit.Assert.assertNotNull(typeArraySetList16);
        org.junit.Assert.assertNull(genericDeclarationArraySetList18);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "", "" };
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList10 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray6, (int) '4');
        java.util.List<java.util.TreeSet<java.lang.Object>> objSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.Object[]) strArray6, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, 100);
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList16 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray6, 1);
        java.util.List<java.util.TreeSet<java.io.Serializable>> serializableSetList18 = com.thealgorithms.backtracking.Combination.combination((java.io.Serializable[]) strArray6, 10);
        java.lang.Class<?> wildcardClass19 = serializableSetList18.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strComparableSetList8);
        org.junit.Assert.assertNotNull(serializableSetList10);
        org.junit.Assert.assertNotNull(objSetList12);
        org.junit.Assert.assertNotNull(strComparableSetList14);
        org.junit.Assert.assertNotNull(charSequenceSetList16);
        org.junit.Assert.assertNotNull(serializableSetList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        java.lang.Class[][][][][] classArray1 = new java.lang.Class[0][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 10);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][][]>> genericDeclarationArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][][][]) wildcardClassArray2, (int) (short) 10);
        java.lang.Class<?> wildcardClass9 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
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
        java.lang.Class<?> wildcardClass17 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(typeArraySetList6);
        org.junit.Assert.assertNotNull(typeArraySetList8);
        org.junit.Assert.assertNotNull(typeArraySetList10);
        org.junit.Assert.assertNotNull(typeArraySetList12);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList14);
        org.junit.Assert.assertNotNull(typeArraySetList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        java.util.List[][] listArray1 = new java.util.List[0][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (-1));
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]>> iterableArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.Iterable<java.util.TreeSet<java.lang.String>>[][]) strSetListArray2, (-1));
        java.lang.Class<?> wildcardClass11 = strSetListArray2.getClass();
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArraySetList4);
        org.junit.Assert.assertNotNull(listArraySetList6);
        org.junit.Assert.assertNotNull(listArraySetList8);
        org.junit.Assert.assertNotNull(iterableArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        java.lang.Class[][][][][][] classArray1 = new java.lang.Class[0][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][][]) classArray1;
        java.lang.Class[][][][][][] classArray4 = new java.lang.Class[0][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][] wildcardClassArray5 = (java.lang.Class<?>[][][][][][]) classArray4;
        java.lang.Class[][][][][][][] classArray7 = new java.lang.Class[2][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][] wildcardClassArray8 = (java.lang.Class<?>[][][][][][][]) classArray7;
        wildcardClassArray8[0] = wildcardClassArray2;
        wildcardClassArray8[1] = wildcardClassArray5;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][]>> wildcardClassArraySetList14 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray8, (int) '4');
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
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        java.lang.Class[][][][][] classArray1 = new java.lang.Class[0][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][]) classArray1;
        java.lang.Class[][][][][] classArray4 = new java.lang.Class[0][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][] wildcardClassArray5 = (java.lang.Class<?>[][][][][]) classArray4;
        java.lang.Class[][][][][] classArray7 = new java.lang.Class[0][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][] wildcardClassArray8 = (java.lang.Class<?>[][][][][]) classArray7;
        java.lang.Class[][][][][] classArray10 = new java.lang.Class[0][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][] wildcardClassArray11 = (java.lang.Class<?>[][][][][]) classArray10;
        java.lang.Class[][][][][] classArray13 = new java.lang.Class[0][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][] wildcardClassArray14 = (java.lang.Class<?>[][][][][]) classArray13;
        java.lang.Class[][][][][][] classArray16 = new java.lang.Class[5][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][] wildcardClassArray17 = (java.lang.Class<?>[][][][][][]) classArray16;
        wildcardClassArray17[0] = wildcardClassArray2;
        wildcardClassArray17[1] = wildcardClassArray5;
        wildcardClassArray17[2] = wildcardClassArray8;
        wildcardClassArray17[3] = wildcardClassArray11;
        wildcardClassArray17[4] = wildcardClassArray14;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList29 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray17, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][]>> wildcardClassArraySetList31 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray17, 1);
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
        org.junit.Assert.assertNull(wildcardClassArraySetList29);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        java.lang.Class[][][][][] classArray1 = new java.lang.Class[0][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList6 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 10);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (-1));
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][][][]>> genericDeclarationArraySetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.GenericDeclaration[][][][][]) wildcardClassArray2, 0);
        java.lang.Class<?> wildcardClass11 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNull(genericDeclarationArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        java.lang.Class[][][][][][][] classArray1 = new java.lang.Class[0][][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][][][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (short) -1);
        java.lang.Class<?> wildcardClass5 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        java.lang.constant.ConstantDesc[] constantDescArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList2 = com.thealgorithms.backtracking.Combination.combination(constantDescArray0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"[Ljava.lang.Object;.clone()\" because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        java.lang.reflect.GenericDeclaration[][][] genericDeclarationArray0 = new java.lang.reflect.GenericDeclaration[][][] {};
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][]>> genericDeclarationArraySetList2 = com.thealgorithms.backtracking.Combination.combination(genericDeclarationArray0, 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][]>> genericDeclarationArraySetList4 = com.thealgorithms.backtracking.Combination.combination(genericDeclarationArray0, (-1));
        java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration[][]>> genericDeclarationArraySetList6 = com.thealgorithms.backtracking.Combination.combination(genericDeclarationArray0, 100);
        java.lang.Class<?> wildcardClass7 = genericDeclarationArray0.getClass();
        org.junit.Assert.assertNotNull(genericDeclarationArray0);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList2);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList4);
        org.junit.Assert.assertNotNull(genericDeclarationArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
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
        java.lang.Class<?> wildcardClass22 = strSetListArray15.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
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
            java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>>> setListSetList20 = com.thealgorithms.backtracking.Combination.combination(strSetListArray12, (int) (short) 10);
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
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "", "" };
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray6, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList14 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray6, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList16 = com.thealgorithms.backtracking.Combination.combination(strArray6, 100);
        java.lang.Class<?> wildcardClass17 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strComparableSetList8);
        org.junit.Assert.assertNotNull(strComparableSetList10);
        org.junit.Assert.assertNotNull(strComparableSetList12);
        org.junit.Assert.assertNotNull(charSequenceSetList14);
        org.junit.Assert.assertNotNull(strSetList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
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
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][]>> listArraySetList23 = com.thealgorithms.backtracking.Combination.combination(strSetListArray15, (int) 'a');
        java.lang.Class<?> wildcardClass24 = strSetListArray15.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        java.util.List[][][][][] listArray1 = new java.util.List[0][][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][][]) listArray1;
        java.util.List[][][][][] listArray4 = new java.util.List[0][][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][][] strSetListArray5 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][][]) listArray4;
        java.util.List[][][][][] listArray7 = new java.util.List[0][][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][][] strSetListArray8 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][][]) listArray7;
        java.util.List[][][][][] listArray10 = new java.util.List[0][][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][][] strSetListArray11 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][][]) listArray10;
        java.util.List[][][][][] listArray13 = new java.util.List[0][][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][][] strSetListArray14 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][][]) listArray13;
        java.util.List[][][][][] listArray16 = new java.util.List[0][][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][][] strSetListArray17 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][][]) listArray16;
        java.util.List[][][][][][] listArray19 = new java.util.List[6][][][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][] strSetListArray20 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][]) listArray19;
        strSetListArray20[0] = strSetListArray2;
        strSetListArray20[1] = strSetListArray5;
        strSetListArray20[2] = strSetListArray8;
        strSetListArray20[3] = strSetListArray11;
        strSetListArray20[4] = strSetListArray14;
        strSetListArray20[5] = strSetListArray17;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][]>> listArraySetList34 = com.thealgorithms.backtracking.Combination.combination(strSetListArray20, (int) 'a');
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
        org.junit.Assert.assertNotNull(listArray19);
        org.junit.Assert.assertNotNull(strSetListArray20);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
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
            java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>>> setListSetList20 = com.thealgorithms.backtracking.Combination.combination(strSetListArray12, (int) (byte) -1);
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
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        java.util.List[][] listArray1 = new java.util.List[0][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (-1));
        java.util.List<java.util.TreeSet<java.lang.Iterable<java.util.TreeSet<java.lang.String>>[]>> iterableArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.Iterable<java.util.TreeSet<java.lang.String>>[][]) strSetListArray2, 0);
        java.lang.Class<?> wildcardClass9 = strSetListArray2.getClass();
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArraySetList4);
        org.junit.Assert.assertNotNull(listArraySetList6);
        org.junit.Assert.assertNull(iterableArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        java.util.List[][] listArray1 = new java.util.List[0][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][]) listArray1;
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) -1);
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList6 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (-1));
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList8 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) 'a');
        java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[]>> listArraySetList10 = com.thealgorithms.backtracking.Combination.combination(strSetListArray2, (int) (short) 100);
        java.lang.Class<?> wildcardClass11 = listArraySetList10.getClass();
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArraySetList4);
        org.junit.Assert.assertNotNull(listArraySetList6);
        org.junit.Assert.assertNotNull(listArraySetList8);
        org.junit.Assert.assertNotNull(listArraySetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
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
        strSetListArray8[1] = listArray4;
        java.util.List[][][] listArray14 = new java.util.List[1][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][] strSetListArray15 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][]) listArray14;
        strSetListArray15[0] = strSetListArray8;
        java.util.List[] listArray19 = new java.util.List[0];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[] strSetListArray20 = (java.util.List<java.util.TreeSet<java.lang.String>>[]) listArray19;
        java.util.List[] listArray22 = new java.util.List[0];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[] strSetListArray23 = (java.util.List<java.util.TreeSet<java.lang.String>>[]) listArray22;
        java.util.List[][] listArray25 = new java.util.List[2][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][] strSetListArray26 = (java.util.List<java.util.TreeSet<java.lang.String>>[][]) listArray25;
        strSetListArray26[0] = strSetListArray20;
        strSetListArray26[1] = listArray22;
        java.util.List[][][] listArray32 = new java.util.List[1][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][] strSetListArray33 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][]) listArray32;
        strSetListArray33[0] = strSetListArray26;
        java.util.List[][][][] listArray37 = new java.util.List[2][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][] strSetListArray38 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][]) listArray37;
        strSetListArray38[0] = strSetListArray15;
        strSetListArray38[1] = strSetListArray33;
        java.util.List[][][][][] listArray44 = new java.util.List[1][][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][][] strSetListArray45 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][][]) listArray44;
        strSetListArray45[0] = strSetListArray38;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][]>> listArraySetList49 = com.thealgorithms.backtracking.Combination.combination(strSetListArray45, (int) (short) 1);
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
        org.junit.Assert.assertNotNull(listArray19);
        org.junit.Assert.assertNotNull(strSetListArray20);
        org.junit.Assert.assertNotNull(listArray22);
        org.junit.Assert.assertNotNull(strSetListArray23);
        org.junit.Assert.assertNotNull(listArray25);
        org.junit.Assert.assertNotNull(strSetListArray26);
        org.junit.Assert.assertNotNull(listArray32);
        org.junit.Assert.assertNotNull(strSetListArray33);
        org.junit.Assert.assertNotNull(listArray37);
        org.junit.Assert.assertNotNull(strSetListArray38);
        org.junit.Assert.assertNotNull(listArray44);
        org.junit.Assert.assertNotNull(strSetListArray45);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        java.lang.Class[][][][] classArray1 = new java.lang.Class[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type[][][]>> typeArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[][][][]) wildcardClassArray2, 3);
        java.util.List<java.util.TreeSet<java.lang.Class<?>[][][]>> wildcardClassArraySetList8 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (-1));
        java.lang.Class<?> wildcardClass9 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList4);
        org.junit.Assert.assertNotNull(typeArraySetList6);
        org.junit.Assert.assertNotNull(wildcardClassArraySetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.reflect.GenericDeclaration>> genericDeclarationSetList2 = com.thealgorithms.backtracking.Combination.combination(genericDeclarationArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"[Ljava.lang.Object;.clone()\" because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.reflect.AnnotatedElement>> annotatedElementSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.AnnotatedElement[]) wildcardClassArray2, (int) '4');
        java.lang.Class<?> wildcardClass9 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNull(typeDescriptorSetList6);
        org.junit.Assert.assertNotNull(annotatedElementSetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 0);
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 100);
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, (int) (short) 100);
        java.lang.Class<?> wildcardClass13 = charSequenceSetList12.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(constantDescSetList6);
        org.junit.Assert.assertNull(charSequenceSetList8);
        org.junit.Assert.assertNotNull(charSequenceSetList10);
        org.junit.Assert.assertNotNull(charSequenceSetList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList4 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) '#');
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.constant.ConstantDesc>> constantDescSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.ConstantDesc[]) strArray2, 10);
        java.util.List<java.util.TreeSet<java.lang.CharSequence>> charSequenceSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[]) strArray2, 100);
        java.lang.Class<?> wildcardClass11 = charSequenceSetList10.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSetList4);
        org.junit.Assert.assertNotNull(charSequenceSetList6);
        org.junit.Assert.assertNotNull(constantDescSetList8);
        org.junit.Assert.assertNotNull(charSequenceSetList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
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
        java.lang.Class<?> wildcardClass17 = wildcardClassSetList16.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNull(wildcardClassSetList4);
        org.junit.Assert.assertNotNull(genericDeclarationSetList6);
        org.junit.Assert.assertNotNull(typeDescriptorSetList8);
        org.junit.Assert.assertNull(genericDeclarationSetList10);
        org.junit.Assert.assertNull(genericDeclarationSetList12);
        org.junit.Assert.assertNotNull(typeDescriptorSetList14);
        org.junit.Assert.assertNotNull(wildcardClassSetList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray11 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray15 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[][] strArray16 = new java.lang.String[][] { strArray3, strArray7, strArray11, strArray15 };
        java.lang.String[] strArray20 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray24 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray28 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray32 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[][] strArray33 = new java.lang.String[][] { strArray20, strArray24, strArray28, strArray32 };
        java.lang.String[] strArray37 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray41 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray45 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray49 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[][] strArray50 = new java.lang.String[][] { strArray37, strArray41, strArray45, strArray49 };
        java.lang.String[][][] strArray51 = new java.lang.String[][][] { strArray16, strArray33, strArray50 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.lang.String[][]>> strArraySetList53 = com.thealgorithms.backtracking.Combination.combination(strArray51, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(strArray51);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        com.thealgorithms.backtracking.Combination combination0 = new com.thealgorithms.backtracking.Combination();
        com.thealgorithms.backtracking.Combination[] combinationArray1 = new com.thealgorithms.backtracking.Combination[] { combination0 };
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination>> combinationSetList3 = com.thealgorithms.backtracking.Combination.combination(combinationArray1, (int) (byte) 100);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination>> combinationSetList5 = com.thealgorithms.backtracking.Combination.combination(combinationArray1, (int) (byte) 100);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination>> combinationSetList7 = com.thealgorithms.backtracking.Combination.combination(combinationArray1, 2);
        java.util.List<java.util.TreeSet<com.thealgorithms.backtracking.Combination>> combinationSetList9 = com.thealgorithms.backtracking.Combination.combination(combinationArray1, 4);
        java.lang.Class<?> wildcardClass10 = combinationSetList9.getClass();
        org.junit.Assert.assertNotNull(combinationArray1);
        org.junit.Assert.assertNotNull(combinationSetList3);
        org.junit.Assert.assertNotNull(combinationSetList5);
        org.junit.Assert.assertNotNull(combinationSetList7);
        org.junit.Assert.assertNotNull(combinationSetList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
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
        java.lang.Class<?> wildcardClass24 = strArraySetList23.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        java.util.List[][][][] listArray1 = new java.util.List[0][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][] strSetListArray2 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][]) listArray1;
        java.util.List[][][][][] listArray4 = new java.util.List[1][][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][][] strSetListArray5 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][][]) listArray4;
        strSetListArray5[0] = strSetListArray2;
        java.util.List[][][][] listArray9 = new java.util.List[0][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][] strSetListArray10 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][]) listArray9;
        java.util.List[][][][][] listArray12 = new java.util.List[1][][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][][] strSetListArray13 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][][]) listArray12;
        strSetListArray13[0] = strSetListArray10;
        java.util.List[][][][] listArray17 = new java.util.List[0][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][] strSetListArray18 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][]) listArray17;
        java.util.List[][][][][] listArray20 = new java.util.List[1][][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][][] strSetListArray21 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][][]) listArray20;
        strSetListArray21[0] = strSetListArray18;
        java.util.List[][][][] listArray25 = new java.util.List[0][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][] strSetListArray26 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][]) listArray25;
        java.util.List[][][][][] listArray28 = new java.util.List[1][][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][][] strSetListArray29 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][][]) listArray28;
        strSetListArray29[0] = strSetListArray26;
        java.util.List[][][][][][] listArray33 = new java.util.List[4][][][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][] strSetListArray34 = (java.util.List<java.util.TreeSet<java.lang.String>>[][][][][][]) listArray33;
        strSetListArray34[0] = strSetListArray5;
        strSetListArray34[1] = strSetListArray13;
        strSetListArray34[2] = strSetListArray21;
        strSetListArray34[3] = strSetListArray29;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.TreeSet<java.util.List<java.util.TreeSet<java.lang.String>>[][][][][]>> listArraySetList44 = com.thealgorithms.backtracking.Combination.combination(strSetListArray34, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(strSetListArray2);
        org.junit.Assert.assertNotNull(listArray4);
        org.junit.Assert.assertNotNull(strSetListArray5);
        org.junit.Assert.assertNotNull(listArray9);
        org.junit.Assert.assertNotNull(strSetListArray10);
        org.junit.Assert.assertNotNull(listArray12);
        org.junit.Assert.assertNotNull(strSetListArray13);
        org.junit.Assert.assertNotNull(listArray17);
        org.junit.Assert.assertNotNull(strSetListArray18);
        org.junit.Assert.assertNotNull(listArray20);
        org.junit.Assert.assertNotNull(strSetListArray21);
        org.junit.Assert.assertNotNull(listArray25);
        org.junit.Assert.assertNotNull(strSetListArray26);
        org.junit.Assert.assertNotNull(listArray28);
        org.junit.Assert.assertNotNull(strSetListArray29);
        org.junit.Assert.assertNotNull(listArray33);
        org.junit.Assert.assertNotNull(strSetListArray34);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.List<java.util.TreeSet<java.lang.Comparable<java.lang.String>>> strComparableSetList4 = com.thealgorithms.backtracking.Combination.combination((java.lang.Comparable<java.lang.String>[]) strArray2, 1);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable>> constableSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[]) strArray2, 4);
        java.util.List<java.util.TreeSet<java.lang.String>> strSetList8 = com.thealgorithms.backtracking.Combination.combination(strArray2, (int) (short) 100);
        java.lang.Class<?> wildcardClass9 = strSetList8.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strComparableSetList4);
        org.junit.Assert.assertNotNull(constableSetList6);
        org.junit.Assert.assertNotNull(strSetList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList2 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (byte) -1);
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList4 = com.thealgorithms.backtracking.Combination.combination(strArray0, (-1));
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) strArray0, (int) 'a');
        java.util.List<java.util.TreeSet<java.lang.CharSequence[]>> charSequenceArraySetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.CharSequence[][]) strArray0, 1);
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList10 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) (short) 100);
        java.util.List<java.util.TreeSet<java.lang.constant.Constable[]>> constableArraySetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.constant.Constable[][]) strArray0, 0);
        java.util.List<java.util.TreeSet<java.lang.String[]>> strArraySetList14 = com.thealgorithms.backtracking.Combination.combination(strArray0, (int) '4');
        java.lang.Class<?> wildcardClass15 = strArraySetList14.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArraySetList2);
        org.junit.Assert.assertNotNull(strArraySetList4);
        org.junit.Assert.assertNotNull(constableArraySetList6);
        org.junit.Assert.assertNotNull(charSequenceArraySetList8);
        org.junit.Assert.assertNotNull(strArraySetList10);
        org.junit.Assert.assertNull(constableArraySetList12);
        org.junit.Assert.assertNotNull(strArraySetList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.List<java.util.TreeSet<java.lang.Class<?>>> wildcardClassSetList4 = com.thealgorithms.backtracking.Combination.combination(wildcardClassArray2, (int) (byte) 0);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList6 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (byte) 100);
        java.util.List<java.util.TreeSet<java.lang.invoke.TypeDescriptor>> typeDescriptorSetList8 = com.thealgorithms.backtracking.Combination.combination((java.lang.invoke.TypeDescriptor[]) wildcardClassArray2, (int) (short) 10);
        java.util.List<java.util.TreeSet<java.lang.reflect.Type>> typeSetList10 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.Type[]) wildcardClassArray2, (int) (byte) 1);
        java.util.List<java.util.TreeSet<java.lang.reflect.AnnotatedElement>> annotatedElementSetList12 = com.thealgorithms.backtracking.Combination.combination((java.lang.reflect.AnnotatedElement[]) wildcardClassArray2, 3);
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
}

