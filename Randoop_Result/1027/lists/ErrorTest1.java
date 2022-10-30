package lists;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test501");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.nodeHeight(5);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList9 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) -1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int11 = bernoulliHeightStrategy2.height((int) (byte) 100);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList12 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) '4', (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        java.lang.String str13 = strSkipList12.toString();
        int int14 = strSkipList12.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strSkipList12.get(0);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        java.lang.String str1 = strSkipList0.toString();
        java.lang.String str2 = strSkipList0.toString();
        int int3 = strSkipList0.size();
        strSkipList0.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        boolean boolean7 = strSkipList0.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        java.lang.String str8 = strSkipList0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strSkipList0.get(2);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy4 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int6 = bernoulliHeightStrategy4.nodeHeight((int) (short) 0);
        int int8 = bernoulliHeightStrategy4.height((int) 'a');
        int int10 = bernoulliHeightStrategy4.height((int) '#');
        int int12 = bernoulliHeightStrategy4.height((int) (byte) 1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList13 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) -1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy4);
        int int15 = bernoulliHeightStrategy4.nodeHeight((int) ' ');
        int int17 = bernoulliHeightStrategy4.nodeHeight(10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList18 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) 10, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy4);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList19 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(2, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy4);
        int int21 = bernoulliHeightStrategy4.nodeHeight((int) (byte) 100);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList22 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) ' ', (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy4);
        int int23 = strSkipList22.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = strSkipList22.get((-2));
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        int int9 = bernoulliHeightStrategy1.nodeHeight(5);
        int int11 = bernoulliHeightStrategy1.height(2);
        int int13 = bernoulliHeightStrategy1.height((int) ' ');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList14 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) 0, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        java.lang.String str15 = strSkipList14.toString();
        int int16 = strSkipList14.size();
        java.lang.String str17 = strSkipList14.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = strSkipList14.get(6);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        int int9 = bernoulliHeightStrategy1.nodeHeight((int) (short) 10);
        int int11 = bernoulliHeightStrategy1.nodeHeight((int) (short) 1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList12 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) -1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        java.lang.String str13 = strSkipList12.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strSkipList12.get((int) (short) 10);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        int int9 = bernoulliHeightStrategy1.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList10 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        strSkipList10.remove("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strSkipList10.get(6);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.height((-1));
        int int5 = bernoulliHeightStrategy1.nodeHeight((int) 'a');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList6 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(10, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        strSkipList6.add("[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] [ ] \n H   0\n");
        boolean boolean10 = strSkipList6.contains("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strSkipList6.get(5);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        strSkipList0.add("hi!");
        int int5 = strSkipList0.size();
        boolean boolean7 = strSkipList0.contains("[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] [ ] \n H   0\n");
        strSkipList0.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        int int10 = strSkipList0.size();
        strSkipList0.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList0.remove("[ ] [ ] \n H   0\n");
        strSkipList0.add("[ ] --- \n[ ] [ ] \n[ ] [ ] \n[ ] [ ] \n H   0\n");
        boolean boolean18 = strSkipList0.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList0.remove("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- [ ] \n[ ] --- --- [ ] \n[ ] --- [ ] [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = strSkipList0.get(8);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.height((-1));
        int int6 = bernoulliHeightStrategy2.nodeHeight((int) 'a');
        int int8 = bernoulliHeightStrategy2.height(2);
        int int10 = bernoulliHeightStrategy2.height((int) 'a');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList11 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(7, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int13 = bernoulliHeightStrategy2.nodeHeight(4);
        int int15 = bernoulliHeightStrategy2.height(5);
        int int17 = bernoulliHeightStrategy2.height(5);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList18 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) ' ', (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = strSkipList18.get(100);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.height((int) '#');
        int int10 = bernoulliHeightStrategy2.height((int) (byte) 1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList11 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) -1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int13 = bernoulliHeightStrategy2.nodeHeight((int) ' ');
        int int15 = bernoulliHeightStrategy2.nodeHeight(10);
        int int17 = bernoulliHeightStrategy2.nodeHeight((int) (short) 10);
        int int19 = bernoulliHeightStrategy2.height((int) ' ');
        int int21 = bernoulliHeightStrategy2.nodeHeight(2);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList22 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        java.lang.String str23 = strSkipList22.toString();
        strSkipList22.remove("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        boolean boolean27 = strSkipList22.contains("[ ] --- --- --- \n[ ] --- --- [ ] \n[ ] --- --- [ ] \n[ ] --- --- [ ] \n[ ] --- --- [ ] \n[ ] --- --- [ ] \n[ ] --- [ ] [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str29 = strSkipList22.get((-4));
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.height((int) '#');
        int int10 = bernoulliHeightStrategy2.height((int) (byte) 1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList11 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) -1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int13 = bernoulliHeightStrategy2.nodeHeight((int) ' ');
        int int15 = bernoulliHeightStrategy2.nodeHeight(10);
        int int17 = bernoulliHeightStrategy2.nodeHeight((int) (short) 10);
        int int19 = bernoulliHeightStrategy2.height((int) ' ');
        int int21 = bernoulliHeightStrategy2.nodeHeight(2);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList22 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        java.lang.String str23 = strSkipList22.toString();
        strSkipList22.remove("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        boolean boolean27 = strSkipList22.contains("[ ] --- --- --- \n[ ] --- --- [ ] \n[ ] --- --- [ ] \n[ ] --- --- [ ] \n[ ] --- --- [ ] \n[ ] --- --- [ ] \n[ ] --- [ ] [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str29 = strSkipList22.get(3);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        int int3 = strSkipList0.size();
        int int4 = strSkipList0.size();
        java.lang.String str6 = strSkipList0.get((int) (short) 0);
        boolean boolean8 = strSkipList0.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList0.remove("[ ] --- \n[ ] [ ] \n[ ] [ ] \n[ ] [ ] \n H   0\n");
        int int11 = strSkipList0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strSkipList0.get(1);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.nodeHeight(4);
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) -1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList8 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(0, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strSkipList8.get(4);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        strSkipList0.add("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = strSkipList0.get(3);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        int int9 = bernoulliHeightStrategy1.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList10 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        strSkipList10.add("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        strSkipList10.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strSkipList10.get((int) (byte) 10);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        strSkipList0.add("hi!");
        java.lang.String str5 = strSkipList0.toString();
        java.lang.String str7 = strSkipList0.get(0);
        java.lang.String str9 = strSkipList0.get((int) (short) 0);
        strSkipList0.add("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        int int12 = strSkipList0.size();
        boolean boolean14 = strSkipList0.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList0.remove("[ ] --- \n[ ] [ ] \n[ ] [ ] \n[ ] [ ] \n H   0\n");
        boolean boolean18 = strSkipList0.contains("[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] [ ] [ ] [ ] [ ] \n H   0   1   2   3\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = strSkipList0.get(100);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight(5);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList8 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) -1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        java.lang.String str10 = strSkipList8.get((int) (short) -1);
        java.lang.String str12 = strSkipList8.get((int) (short) -1);
        int int13 = strSkipList8.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strSkipList8.get(1);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        java.lang.String str3 = strSkipList0.toString();
        int int4 = strSkipList0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = strSkipList0.get((int) (short) 10);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.height((-1));
        int int5 = bernoulliHeightStrategy1.nodeHeight((int) 'a');
        int int7 = bernoulliHeightStrategy1.height(2);
        int int9 = bernoulliHeightStrategy1.height((int) 'a');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList10 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(7, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        strSkipList10.remove("[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList10.remove("[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n H \n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strSkipList10.get(2);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        java.lang.String str3 = strSkipList0.toString();
        int int4 = strSkipList0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = strSkipList0.get(4);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.height((-1));
        int int5 = bernoulliHeightStrategy1.nodeHeight((int) 'a');
        int int7 = bernoulliHeightStrategy1.height(2);
        int int9 = bernoulliHeightStrategy1.height((int) 'a');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList10 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(7, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        strSkipList10.remove("[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        boolean boolean14 = strSkipList10.contains("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] [ ] [ ] --- \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        int int15 = strSkipList10.size();
        strSkipList10.remove("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = strSkipList10.get(6);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.remove("");
        strSkipList0.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList0.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = strSkipList0.get(3);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight(5);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList8 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) -1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        java.lang.String str10 = strSkipList8.get((int) (short) -1);
        java.lang.String str12 = strSkipList8.get((int) (short) -1);
        int int13 = strSkipList8.size();
        java.lang.String str14 = strSkipList8.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strSkipList8.get(2);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 0);
        int int10 = bernoulliHeightStrategy2.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList11 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int13 = bernoulliHeightStrategy2.nodeHeight(5);
        int int15 = bernoulliHeightStrategy2.nodeHeight((int) '#');
        int int17 = bernoulliHeightStrategy2.nodeHeight(2);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList18 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) 0, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = strSkipList18.get(0);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.nodeHeight(4);
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) -1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList8 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(0, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        strSkipList8.add("[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strSkipList8.get((int) (byte) 100);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.height((int) '#');
        int int9 = bernoulliHeightStrategy1.nodeHeight((int) '4');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList10 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 0, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strSkipList10.get((int) (byte) 10);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.height((-1));
        int int6 = bernoulliHeightStrategy2.nodeHeight((int) 'a');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList7 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(10, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int9 = bernoulliHeightStrategy2.nodeHeight((int) (short) -1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList10 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(4, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        strSkipList10.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strSkipList10.get((int) (short) 100);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy4 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int6 = bernoulliHeightStrategy4.nodeHeight((int) (short) 0);
        int int8 = bernoulliHeightStrategy4.nodeHeight(4);
        int int10 = bernoulliHeightStrategy4.nodeHeight((int) (byte) -1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList11 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) 'a', (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy4);
        int int13 = bernoulliHeightStrategy4.height((int) (byte) -1);
        int int15 = bernoulliHeightStrategy4.nodeHeight((int) (byte) -1);
        int int17 = bernoulliHeightStrategy4.height(100);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList18 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(0, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy4);
        int int20 = bernoulliHeightStrategy4.height(0);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList21 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy4);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList22 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) ' ', (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy4);
        int int23 = strSkipList22.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = strSkipList22.get(6);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        int int3 = strSkipList0.size();
        int int4 = strSkipList0.size();
        java.lang.String str6 = strSkipList0.get((int) (short) 0);
        boolean boolean8 = strSkipList0.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList0.remove("[ ] --- \n[ ] [ ] \n[ ] [ ] \n[ ] [ ] \n H   0\n");
        int int11 = strSkipList0.size();
        boolean boolean13 = strSkipList0.contains("[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] [ ] [ ] [ ] --- \n[ ] [ ] [ ] [ ] --- \n[ ] [ ] [ ] [ ] [ ] \n H   0   1   2   3\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strSkipList0.get((int) '4');
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.remove("");
        strSkipList0.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = strSkipList0.get(1);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        int int9 = bernoulliHeightStrategy1.nodeHeight(5);
        int int11 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList12 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) -1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        java.lang.String str13 = strSkipList12.toString();
        strSkipList12.add("[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = strSkipList12.get((int) '4');
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        strSkipList0.add("hi!");
        int int5 = strSkipList0.size();
        int int6 = strSkipList0.size();
        boolean boolean8 = strSkipList0.contains("[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] [ ] \n[ ] [ ] \n H   0\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strSkipList0.get((-4));
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy4 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int6 = bernoulliHeightStrategy4.nodeHeight((int) (short) 0);
        int int8 = bernoulliHeightStrategy4.height((int) 'a');
        int int10 = bernoulliHeightStrategy4.height((int) '#');
        int int12 = bernoulliHeightStrategy4.height((int) (byte) 1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList13 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) -1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy4);
        int int15 = bernoulliHeightStrategy4.nodeHeight((int) ' ');
        int int17 = bernoulliHeightStrategy4.nodeHeight(10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList18 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) 10, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy4);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList19 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((-2), (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy4);
        int int21 = bernoulliHeightStrategy4.height(4);
        int int23 = bernoulliHeightStrategy4.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList24 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((-2), (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = strSkipList24.get(0);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.height((-1));
        int int6 = bernoulliHeightStrategy2.nodeHeight((int) 'a');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList7 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(10, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int9 = bernoulliHeightStrategy2.nodeHeight((int) (short) -1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList10 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        java.lang.String str11 = strSkipList10.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strSkipList10.get(11);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.height((int) (short) 10);
        int int5 = bernoulliHeightStrategy1.nodeHeight(5);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList6 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 10, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        boolean boolean8 = strSkipList6.contains("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- [ ] [ ] \n[ ] --- [ ] [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        java.lang.String str9 = strSkipList6.toString();
        boolean boolean11 = strSkipList6.contains("[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList6.remove("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] [ ] --- --- \n[ ] [ ] --- [ ] \n[ ] [ ] --- [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strSkipList6.get(0);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        int int9 = bernoulliHeightStrategy1.nodeHeight(5);
        int int11 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 1);
        int int13 = bernoulliHeightStrategy1.height((int) (byte) 0);
        int int15 = bernoulliHeightStrategy1.height(1);
        int int17 = bernoulliHeightStrategy1.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList18 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) 'a', (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        java.lang.String str19 = strSkipList18.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = strSkipList18.get((int) '#');
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.height((int) '#');
        int int10 = bernoulliHeightStrategy2.height((int) (byte) 1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList11 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) -1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int13 = bernoulliHeightStrategy2.nodeHeight((int) ' ');
        int int15 = bernoulliHeightStrategy2.nodeHeight(0);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList16 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        strSkipList16.remove("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n H   0   1\n");
        boolean boolean20 = strSkipList16.contains("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        strSkipList16.add("[ ] [ ] \n H   0\n");
        boolean boolean24 = strSkipList16.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList16.remove("[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n H   0   1\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str28 = strSkipList16.get(7);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.nodeHeight(5);
        int int10 = bernoulliHeightStrategy2.height(100);
        int int12 = bernoulliHeightStrategy2.height((-1));
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList13 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((-1), (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList14 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((-1), (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        strSkipList14.add("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] [ ] --- --- \n[ ] [ ] [ ] [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        java.lang.String str18 = strSkipList14.get((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = strSkipList14.get((int) (short) 100);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test539");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy4 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int6 = bernoulliHeightStrategy4.nodeHeight((int) (short) 0);
        int int8 = bernoulliHeightStrategy4.height((int) 'a');
        int int10 = bernoulliHeightStrategy4.height((int) '#');
        int int12 = bernoulliHeightStrategy4.nodeHeight((int) 'a');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList13 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) -1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy4);
        int int15 = bernoulliHeightStrategy4.height(10);
        int int17 = bernoulliHeightStrategy4.height((int) (short) 0);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList18 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) '4', (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy4);
        int int20 = bernoulliHeightStrategy4.height(5);
        int int22 = bernoulliHeightStrategy4.nodeHeight((-1));
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList23 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) 1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy4);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList24 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) ' ', (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = strSkipList24.get((int) 'a');
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 0);
        int int10 = bernoulliHeightStrategy2.nodeHeight(5);
        int int12 = bernoulliHeightStrategy2.height(100);
        int int14 = bernoulliHeightStrategy2.height(5);
        int int16 = bernoulliHeightStrategy2.height((int) (byte) -1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList17 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(6, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int19 = bernoulliHeightStrategy2.height(0);
        int int21 = bernoulliHeightStrategy2.height((-1));
        int int23 = bernoulliHeightStrategy2.height(8);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList24 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 10, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = strSkipList24.get((int) '4');
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test541");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        strSkipList0.add("hi!");
        int int5 = strSkipList0.size();
        strSkipList0.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n H   0   1\n");
        int int8 = strSkipList0.size();
        java.lang.String str10 = strSkipList0.get(2);
        strSkipList0.remove("");
        boolean boolean14 = strSkipList0.contains("[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] [ ] \n H   0\n");
        int int15 = strSkipList0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = strSkipList0.get((int) '#');
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test542");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 10);
        int int10 = bernoulliHeightStrategy2.nodeHeight(10);
        int int12 = bernoulliHeightStrategy2.height(4);
        int int14 = bernoulliHeightStrategy2.nodeHeight(1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList15 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) -1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int17 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList18 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) -1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int19 = strSkipList18.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = strSkipList18.get(100);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test543");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        strSkipList0.add("hi!");
        strSkipList0.add("[ ] [ ] \n H   0\n");
        strSkipList0.remove("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        boolean boolean10 = strSkipList0.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        boolean boolean12 = strSkipList0.contains("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] [ ] --- --- \n[ ] [ ] [ ] [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        strSkipList0.add("[ ] [ ] \n H   0\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strSkipList0.get(5);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test544");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        int int3 = strSkipList0.size();
        int int4 = strSkipList0.size();
        java.lang.String str6 = strSkipList0.get((int) (short) 0);
        java.lang.String str7 = strSkipList0.toString();
        java.lang.String str8 = strSkipList0.toString();
        strSkipList0.add("[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n H \n");
        boolean boolean12 = strSkipList0.contains("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] [ ] [ ] [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strSkipList0.get((int) 'a');
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test545");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 0);
        int int10 = bernoulliHeightStrategy2.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList11 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int13 = bernoulliHeightStrategy2.height(100);
        int int15 = bernoulliHeightStrategy2.nodeHeight((int) 'a');
        int int17 = bernoulliHeightStrategy2.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList18 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        strSkipList18.remove("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = strSkipList18.get(3);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test546");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        boolean boolean2 = strSkipList0.contains("[ ] --- \n[ ] --- \n[ ] --- \n[ ] [ ] \n[ ] [ ] \n[ ] [ ] \n[ ] [ ] \n[ ] [ ] \n H   0\n");
        int int3 = strSkipList0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = strSkipList0.get(2);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test547");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        strSkipList0.add("hi!");
        boolean boolean6 = strSkipList0.contains("");
        java.lang.String str7 = strSkipList0.toString();
        boolean boolean9 = strSkipList0.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList0.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList0.remove("[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n H \n");
        strSkipList0.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n H   0   1\n");
        int int16 = strSkipList0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = strSkipList0.get(5);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test548");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        strSkipList0.add("hi!");
        java.lang.String str5 = strSkipList0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = strSkipList0.get(10);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test549");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        int int9 = bernoulliHeightStrategy1.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList10 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        strSkipList10.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList10.remove("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList10.remove("hi!");
        java.lang.String str18 = strSkipList10.get((int) (short) 0);
        strSkipList10.remove("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] [ ] --- --- \n[ ] [ ] [ ] [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        strSkipList10.add("[ ] \n[ ] \n[ ] \n[ ] \n H \n");
        java.lang.String str24 = strSkipList10.get((int) (short) 1);
        strSkipList10.remove("[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] [ ] \n H   0\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str28 = strSkipList10.get((int) (short) 100);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test550");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.nodeHeight((-1));
        int int7 = bernoulliHeightStrategy1.height(3);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList8 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(3, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strSkipList8.get((int) ' ');
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test551");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy4 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int6 = bernoulliHeightStrategy4.nodeHeight((int) (short) 0);
        int int8 = bernoulliHeightStrategy4.height((int) 'a');
        int int10 = bernoulliHeightStrategy4.nodeHeight((int) (byte) 0);
        int int12 = bernoulliHeightStrategy4.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList13 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy4);
        int int15 = bernoulliHeightStrategy4.height(100);
        int int17 = bernoulliHeightStrategy4.nodeHeight(100);
        int int19 = bernoulliHeightStrategy4.height(1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList20 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(7, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy4);
        int int22 = bernoulliHeightStrategy4.height((int) 'a');
        int int24 = bernoulliHeightStrategy4.height((int) (short) 0);
        int int26 = bernoulliHeightStrategy4.height((int) (short) 0);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList27 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) -1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy4);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList28 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(0, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str30 = strSkipList28.get(3);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test552");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        strSkipList0.add("hi!");
        java.lang.String str5 = strSkipList0.toString();
        strSkipList0.remove("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        boolean boolean9 = strSkipList0.contains("[ ] [ ] \n H   0\n");
        strSkipList0.remove("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strSkipList0.get(15);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test553");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 10);
        int int9 = bernoulliHeightStrategy1.nodeHeight(10);
        int int11 = bernoulliHeightStrategy1.height(4);
        int int13 = bernoulliHeightStrategy1.nodeHeight(1);
        int int15 = bernoulliHeightStrategy1.nodeHeight((-1));
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList16 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = strSkipList16.get(11);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test554");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy3 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int5 = bernoulliHeightStrategy3.nodeHeight((int) (short) 0);
        int int7 = bernoulliHeightStrategy3.height((int) 'a');
        int int9 = bernoulliHeightStrategy3.height((int) '#');
        int int11 = bernoulliHeightStrategy3.nodeHeight((int) (short) 100);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList12 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(0, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList13 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) '#', (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        int int15 = bernoulliHeightStrategy3.height((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList16 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((-1), (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        java.lang.String str17 = strSkipList16.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = strSkipList16.get((-4));
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test555");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        strSkipList0.add("hi!");
        strSkipList0.add("[ ] [ ] \n H   0\n");
        java.lang.String str7 = strSkipList0.toString();
        java.lang.String str9 = strSkipList0.get(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strSkipList0.get((-4));
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test556");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 0);
        int int10 = bernoulliHeightStrategy2.nodeHeight(5);
        int int12 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 1);
        int int14 = bernoulliHeightStrategy2.nodeHeight((int) 'a');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList15 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((-2), (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList16 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) -1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        strSkipList16.remove("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        int int19 = strSkipList16.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = strSkipList16.get((int) '4');
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test557");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight(5);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList8 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) -1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        java.lang.String str10 = strSkipList8.get((int) (short) -1);
        java.lang.String str12 = strSkipList8.get((int) (short) -1);
        boolean boolean14 = strSkipList8.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        int int15 = strSkipList8.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = strSkipList8.get(15);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test558");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 10);
        int int10 = bernoulliHeightStrategy2.nodeHeight(10);
        int int12 = bernoulliHeightStrategy2.height(4);
        int int14 = bernoulliHeightStrategy2.nodeHeight(1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList15 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) -1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int17 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList18 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        strSkipList18.add("[ ] \n[ ] \n[ ] \n H \n");
        strSkipList18.add("[ ] [ ] \n H   0\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = strSkipList18.get((int) (byte) 100);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test559");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.height((-1));
        int int6 = bernoulliHeightStrategy2.nodeHeight((int) 'a');
        int int8 = bernoulliHeightStrategy2.height(2);
        int int10 = bernoulliHeightStrategy2.height((int) 'a');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList11 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(7, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int13 = bernoulliHeightStrategy2.nodeHeight(4);
        int int15 = bernoulliHeightStrategy2.height(5);
        int int17 = bernoulliHeightStrategy2.height(5);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList18 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) ' ', (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = strSkipList18.get(11);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test560");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 0);
        int int10 = bernoulliHeightStrategy2.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList11 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int13 = bernoulliHeightStrategy2.height(100);
        int int15 = bernoulliHeightStrategy2.nodeHeight((int) 'a');
        int int17 = bernoulliHeightStrategy2.height(100);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList18 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) 'a', (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        java.lang.String str19 = strSkipList18.toString();
        strSkipList18.add("[ ] \n[ ] \n[ ] \n[ ] \n H \n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = strSkipList18.get((int) '#');
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test561");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.height((int) '#');
        int int10 = bernoulliHeightStrategy2.height((int) (byte) 1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList11 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) -1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int13 = bernoulliHeightStrategy2.nodeHeight((int) ' ');
        int int15 = bernoulliHeightStrategy2.nodeHeight(10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList16 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(10, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        boolean boolean18 = strSkipList16.contains("[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n H   0   1\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = strSkipList16.get(7);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test562");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight(5);
        int int9 = bernoulliHeightStrategy1.height(100);
        int int11 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList12 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 0, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        int int13 = strSkipList12.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strSkipList12.get((int) (short) 100);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test563");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.height((int) '#');
        int int9 = bernoulliHeightStrategy1.nodeHeight((int) ' ');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList10 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(5, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strSkipList10.get((int) (byte) 0);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test564");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 0);
        int int10 = bernoulliHeightStrategy2.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList11 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int13 = bernoulliHeightStrategy2.nodeHeight(5);
        int int15 = bernoulliHeightStrategy2.nodeHeight((int) '#');
        int int17 = bernoulliHeightStrategy2.nodeHeight(2);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList18 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) 0, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        strSkipList18.remove("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = strSkipList18.get((int) (short) 100);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test565");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 0);
        int int10 = bernoulliHeightStrategy2.nodeHeight(5);
        int int12 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList13 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) -1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList14 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(2, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        strSkipList14.remove("[ ] --- \n[ ] --- \n[ ] [ ] \n[ ] [ ] \n[ ] [ ] \n[ ] [ ] \n[ ] [ ] \n[ ] [ ] \n H   0\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = strSkipList14.get((int) 'a');
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test566");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 0);
        int int10 = bernoulliHeightStrategy2.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList11 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int13 = bernoulliHeightStrategy2.height(100);
        int int15 = bernoulliHeightStrategy2.nodeHeight(100);
        int int17 = bernoulliHeightStrategy2.nodeHeight((int) '4');
        int int19 = bernoulliHeightStrategy2.height(100);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList20 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((-1), (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        boolean boolean22 = strSkipList20.contains("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] [ ] [ ] [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        strSkipList20.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        boolean boolean26 = strSkipList20.contains("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- [ ] [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        boolean boolean28 = strSkipList20.contains("[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] [ ] [ ] [ ] [ ] \n H   0   1   2   3\n");
        strSkipList20.remove("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str32 = strSkipList20.get((-4));
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test567");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        strSkipList0.add("hi!");
        strSkipList0.remove("");
        java.lang.String str8 = strSkipList0.get((int) (short) 0);
        boolean boolean10 = strSkipList0.contains("[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n H \n");
        java.lang.String str11 = strSkipList0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strSkipList0.get(5);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test568");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        java.lang.String str1 = strSkipList0.toString();
        boolean boolean3 = strSkipList0.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        int int4 = strSkipList0.size();
        boolean boolean6 = strSkipList0.contains("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- [ ] [ ] \n[ ] --- [ ] [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        int int7 = strSkipList0.size();
        boolean boolean9 = strSkipList0.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        boolean boolean11 = strSkipList0.contains("");
        int int12 = strSkipList0.size();
        boolean boolean14 = strSkipList0.contains("[ ] --- --- \n[ ] [ ] [ ] \n H   0   1\n");
        int int15 = strSkipList0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = strSkipList0.get((int) (byte) 10);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test569");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        int int3 = strSkipList0.size();
        int int4 = strSkipList0.size();
        boolean boolean6 = strSkipList0.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = strSkipList0.get((int) (short) 1);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test570");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.height((int) '#');
        int int9 = bernoulliHeightStrategy1.height(10);
        int int11 = bernoulliHeightStrategy1.nodeHeight((-1));
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList12 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(7, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        strSkipList12.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        java.lang.String str15 = strSkipList12.toString();
        java.lang.String str16 = strSkipList12.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = strSkipList12.get((int) (byte) 100);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test571");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 0);
        int int10 = bernoulliHeightStrategy2.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList11 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int13 = bernoulliHeightStrategy2.height(100);
        int int15 = bernoulliHeightStrategy2.nodeHeight((int) '4');
        int int17 = bernoulliHeightStrategy2.nodeHeight(0);
        int int19 = bernoulliHeightStrategy2.height((int) '4');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList20 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        strSkipList20.add("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] [ ] [ ] --- \n[ ] [ ] [ ] --- \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        strSkipList20.remove("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- [ ] \n[ ] --- --- [ ] \n[ ] --- --- [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = strSkipList20.get((int) (byte) 1);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test572");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 0);
        int int10 = bernoulliHeightStrategy2.nodeHeight(5);
        int int12 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 1);
        int int14 = bernoulliHeightStrategy2.nodeHeight(2);
        int int16 = bernoulliHeightStrategy2.height((-2));
        int int18 = bernoulliHeightStrategy2.height(5);
        int int20 = bernoulliHeightStrategy2.height((int) (byte) -1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList21 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(7, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int23 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 100);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList24 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(0, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        boolean boolean26 = strSkipList24.contains("[ ] --- \n[ ] [ ] \n H   0\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str28 = strSkipList24.get(100);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test573");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.height((-1));
        int int5 = bernoulliHeightStrategy1.nodeHeight((int) 'a');
        int int7 = bernoulliHeightStrategy1.height(2);
        int int9 = bernoulliHeightStrategy1.height((int) 'a');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList10 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(7, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        strSkipList10.remove("[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        boolean boolean14 = strSkipList10.contains("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] [ ] [ ] --- \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        int int15 = strSkipList10.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = strSkipList10.get(10);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test574");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.height((int) '#');
        int int10 = bernoulliHeightStrategy2.height((int) (byte) 1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList11 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) -1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int13 = bernoulliHeightStrategy2.nodeHeight((int) ' ');
        int int15 = bernoulliHeightStrategy2.nodeHeight(10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList16 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(10, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        strSkipList16.add("[ ] --- \n[ ] --- \n[ ] --- \n[ ] [ ] \n[ ] [ ] \n[ ] [ ] \n[ ] [ ] \n[ ] [ ] \n H   0\n");
        boolean boolean20 = strSkipList16.contains("[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] [ ] [ ] [ ] [ ] \n H   0   1   2   3\n");
        int int21 = strSkipList16.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = strSkipList16.get(15);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test575");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        int int9 = bernoulliHeightStrategy1.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList10 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        strSkipList10.remove("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        int int13 = strSkipList10.size();
        int int14 = strSkipList10.size();
        strSkipList10.remove("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        boolean boolean18 = strSkipList10.contains("[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] --- [ ] --- --- \n[ ] --- [ ] --- --- \n[ ] [ ] [ ] [ ] [ ] \n[ ] [ ] [ ] [ ] [ ] \n H   0   1   2   3\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = strSkipList10.get((int) (byte) 100);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test576");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        int int9 = bernoulliHeightStrategy1.nodeHeight(5);
        int int11 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList12 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) -1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        java.lang.String str13 = strSkipList12.toString();
        int int14 = strSkipList12.size();
        strSkipList12.add("[ ] --- --- --- \n[ ] --- --- --- \n[ ] [ ] --- --- \n[ ] [ ] --- --- \n[ ] [ ] --- --- \n[ ] [ ] --- --- \n[ ] [ ] --- --- \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = strSkipList12.get((-4));
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test577");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 0);
        int int10 = bernoulliHeightStrategy2.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList11 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int13 = bernoulliHeightStrategy2.height((int) ' ');
        int int15 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 10);
        int int17 = bernoulliHeightStrategy2.height(5);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList18 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(10, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        strSkipList18.remove("[ ] --- \n[ ] [ ] \n H   0\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = strSkipList18.get(10);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test578");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        int int9 = bernoulliHeightStrategy1.nodeHeight(5);
        int int11 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 1);
        int int13 = bernoulliHeightStrategy1.nodeHeight((int) '#');
        int int15 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList16 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = strSkipList16.get((int) (short) 10);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test579");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        strSkipList0.add("hi!");
        strSkipList0.remove("");
        int int7 = strSkipList0.size();
        java.lang.String str8 = strSkipList0.toString();
        java.lang.String str9 = strSkipList0.toString();
        int int10 = strSkipList0.size();
        strSkipList0.remove("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strSkipList0.get(7);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test580");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.remove("");
        int int3 = strSkipList0.size();
        int int4 = strSkipList0.size();
        int int5 = strSkipList0.size();
        strSkipList0.add("[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n H \n");
        boolean boolean9 = strSkipList0.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList0.remove("[ ] --- \n[ ] --- \n[ ] [ ] \n[ ] [ ] \n[ ] [ ] \n[ ] [ ] \n[ ] [ ] \n[ ] [ ] \n H   0\n");
        strSkipList0.remove("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- [ ] [ ] \n[ ] [ ] [ ] [ ] \n[ ] [ ] [ ] [ ] \n[ ] [ ] [ ] [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strSkipList0.get((int) (short) 100);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test581");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        strSkipList0.add("hi!");
        int int5 = strSkipList0.size();
        strSkipList0.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n H   0   1\n");
        int int8 = strSkipList0.size();
        java.lang.String str10 = strSkipList0.get(2);
        strSkipList0.remove("");
        boolean boolean14 = strSkipList0.contains("[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] [ ] \n H   0\n");
        int int15 = strSkipList0.size();
        boolean boolean17 = strSkipList0.contains("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] [ ] [ ] [ ] \n[ ] [ ] [ ] [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = strSkipList0.get(8);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test582");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.nodeHeight(4);
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) -1);
        int int9 = bernoulliHeightStrategy1.nodeHeight((int) (short) 1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList10 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) 'a', (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        strSkipList10.remove("[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] [ ] \n H   0\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strSkipList10.get(9);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test583");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight(5);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList8 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) -1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        java.lang.String str10 = strSkipList8.get((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strSkipList8.get((int) (short) 10);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test584");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        int int9 = bernoulliHeightStrategy1.nodeHeight(5);
        int int11 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 1);
        int int13 = bernoulliHeightStrategy1.nodeHeight((int) 'a');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList14 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((-2), (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        strSkipList14.add("");
        java.lang.String str17 = strSkipList14.toString();
        java.lang.String str18 = strSkipList14.toString();
        java.lang.String str19 = strSkipList14.toString();
        boolean boolean21 = strSkipList14.contains("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- [ ] \n[ ] --- --- [ ] \n[ ] --- --- [ ] \n[ ] [ ] --- [ ] \n[ ] [ ] --- [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = strSkipList14.get(10);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test585");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        strSkipList0.add("hi!");
        int int5 = strSkipList0.size();
        strSkipList0.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList0.add("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] [ ] [ ] --- \n[ ] [ ] [ ] --- \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        strSkipList0.remove("[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] [ ] \n H   0\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strSkipList0.get((int) ' ');
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test586");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy3 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int5 = bernoulliHeightStrategy3.nodeHeight((int) (short) 0);
        int int7 = bernoulliHeightStrategy3.height((int) 'a');
        int int9 = bernoulliHeightStrategy3.height((int) '#');
        int int11 = bernoulliHeightStrategy3.height((int) (byte) 1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList12 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) -1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        int int14 = bernoulliHeightStrategy3.nodeHeight((int) ' ');
        int int16 = bernoulliHeightStrategy3.nodeHeight(10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList17 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) 10, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        int int19 = bernoulliHeightStrategy3.nodeHeight((int) '#');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList20 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) -1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        strSkipList20.remove("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- [ ] [ ] \n[ ] --- [ ] [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = strSkipList20.get(9);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test587");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.height((int) '#');
        int int9 = bernoulliHeightStrategy1.nodeHeight((int) ' ');
        int int11 = bernoulliHeightStrategy1.height((int) ' ');
        int int13 = bernoulliHeightStrategy1.nodeHeight(5);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList14 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) 0, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        strSkipList14.remove("[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList14.remove("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] [ ] [ ] --- \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        boolean boolean20 = strSkipList14.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList14.add("[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] [ ] \n[ ] [ ] \n[ ] [ ] \n[ ] [ ] \n H   0\n");
        int int23 = strSkipList14.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = strSkipList14.get(6);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test588");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        int int3 = strSkipList0.size();
        int int4 = strSkipList0.size();
        java.lang.String str6 = strSkipList0.get((int) (short) 0);
        java.lang.String str7 = strSkipList0.toString();
        strSkipList0.add("[ ] \n H \n");
        java.lang.String str10 = strSkipList0.toString();
        int int11 = strSkipList0.size();
        int int12 = strSkipList0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strSkipList0.get((int) 'a');
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test589");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.nodeHeight(5);
        int int10 = bernoulliHeightStrategy2.height(100);
        int int12 = bernoulliHeightStrategy2.height((-1));
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList13 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((-1), (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList14 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((-1), (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        strSkipList14.add("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] [ ] --- --- \n[ ] [ ] [ ] [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        int int17 = strSkipList14.size();
        strSkipList14.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = strSkipList14.get((-4));
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test590");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.height((int) '#');
        int int9 = bernoulliHeightStrategy1.nodeHeight((int) 'a');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList10 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) -1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        strSkipList10.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        int int13 = strSkipList10.size();
        boolean boolean15 = strSkipList10.contains("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- [ ] \n[ ] --- --- [ ] \n[ ] --- --- [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        int int16 = strSkipList10.size();
        strSkipList10.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        java.lang.String str19 = strSkipList10.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = strSkipList10.get(8);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test591");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        int int9 = bernoulliHeightStrategy1.nodeHeight(5);
        int int11 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 1);
        int int13 = bernoulliHeightStrategy1.nodeHeight(2);
        int int15 = bernoulliHeightStrategy1.height((-2));
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList16 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(2, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        boolean boolean18 = strSkipList16.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n H   0   1\n");
        java.lang.String str19 = strSkipList16.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = strSkipList16.get(10);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test592");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight(5);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList8 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) -1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        boolean boolean10 = strSkipList8.contains("hi!");
        int int11 = strSkipList8.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strSkipList8.get((int) (byte) 100);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test593");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 0);
        int int10 = bernoulliHeightStrategy2.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList11 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int13 = bernoulliHeightStrategy2.height(100);
        int int15 = bernoulliHeightStrategy2.nodeHeight((int) 'a');
        int int17 = bernoulliHeightStrategy2.height(100);
        int int19 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 10);
        int int21 = bernoulliHeightStrategy2.nodeHeight((int) (byte) -1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList22 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 0, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        strSkipList22.remove("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n H   0   1\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = strSkipList22.get((int) ' ');
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test594");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.remove("");
        int int3 = strSkipList0.size();
        java.lang.String str5 = strSkipList0.get((int) (byte) -1);
        strSkipList0.remove("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList0.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList0.add("[ ] --- \n[ ] --- \n[ ] [ ] \n[ ] [ ] \n H   0\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strSkipList0.get((-3));
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test595");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 0);
        int int10 = bernoulliHeightStrategy2.nodeHeight(5);
        int int12 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 1);
        int int14 = bernoulliHeightStrategy2.nodeHeight((int) 'a');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList15 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) '4', (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList16 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(0, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        java.lang.String str17 = strSkipList16.toString();
        java.lang.String str18 = strSkipList16.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = strSkipList16.get((int) (byte) 100);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test596");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 0);
        int int10 = bernoulliHeightStrategy2.nodeHeight(5);
        int int12 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 1);
        int int14 = bernoulliHeightStrategy2.nodeHeight((int) 'a');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList15 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((-2), (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int17 = bernoulliHeightStrategy2.height((int) ' ');
        int int19 = bernoulliHeightStrategy2.nodeHeight((int) ' ');
        int int21 = bernoulliHeightStrategy2.height((int) (short) -1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList22 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(8, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = strSkipList22.get((int) 'a');
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test597");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        strSkipList0.add("hi!");
        int int5 = strSkipList0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = strSkipList0.get((int) (byte) 100);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test598");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight(5);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList8 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) -1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        boolean boolean10 = strSkipList8.contains("hi!");
        strSkipList8.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strSkipList8.get(9);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test599");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        int int3 = strSkipList0.size();
        int int4 = strSkipList0.size();
        strSkipList0.remove("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n H   0   1\n");
        boolean boolean8 = strSkipList0.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n H   0   1\n");
        boolean boolean10 = strSkipList0.contains("[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] [ ] \n[ ] [ ] \n[ ] [ ] \n H   0\n");
        int int11 = strSkipList0.size();
        int int12 = strSkipList0.size();
        strSkipList0.remove("[ ] \n[ ] \n[ ] \n[ ] \n H \n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strSkipList0.get((-4));
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test600");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy3 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int5 = bernoulliHeightStrategy3.nodeHeight((int) (short) 0);
        int int7 = bernoulliHeightStrategy3.height((int) 'a');
        int int9 = bernoulliHeightStrategy3.nodeHeight(5);
        int int11 = bernoulliHeightStrategy3.height(100);
        int int13 = bernoulliHeightStrategy3.height((int) (byte) 0);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList14 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(0, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        int int16 = bernoulliHeightStrategy3.height((int) '#');
        int int18 = bernoulliHeightStrategy3.height(1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList19 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(7, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList20 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) -1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = strSkipList20.get((int) (byte) 0);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test601");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 0);
        int int10 = bernoulliHeightStrategy2.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList11 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int13 = bernoulliHeightStrategy2.height(100);
        int int15 = bernoulliHeightStrategy2.nodeHeight((int) 'a');
        int int17 = bernoulliHeightStrategy2.height(100);
        int int19 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 10);
        int int21 = bernoulliHeightStrategy2.nodeHeight((int) (byte) -1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList22 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 0, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int23 = strSkipList22.size();
        strSkipList22.add("");
        strSkipList22.add("[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        boolean boolean29 = strSkipList22.contains("[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n H \n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str31 = strSkipList22.get((int) (short) 10);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test602");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.height((int) '#');
        int int10 = bernoulliHeightStrategy2.height((int) (byte) 1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList11 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) -1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int13 = bernoulliHeightStrategy2.nodeHeight((int) ' ');
        int int15 = bernoulliHeightStrategy2.nodeHeight(10);
        int int17 = bernoulliHeightStrategy2.nodeHeight((int) (short) 10);
        int int19 = bernoulliHeightStrategy2.height((int) ' ');
        int int21 = bernoulliHeightStrategy2.nodeHeight(2);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList22 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        java.lang.String str23 = strSkipList22.toString();
        strSkipList22.remove("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList22.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str29 = strSkipList22.get(2);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test603");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        java.lang.String str1 = strSkipList0.toString();
        boolean boolean3 = strSkipList0.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        int int4 = strSkipList0.size();
        boolean boolean6 = strSkipList0.contains("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- [ ] [ ] \n[ ] --- [ ] [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        int int7 = strSkipList0.size();
        java.lang.String str8 = strSkipList0.toString();
        boolean boolean10 = strSkipList0.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList0.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n H   0   1\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strSkipList0.get((int) (byte) 100);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test604");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.height((-1));
        int int5 = bernoulliHeightStrategy1.nodeHeight((int) 'a');
        int int7 = bernoulliHeightStrategy1.height(2);
        int int9 = bernoulliHeightStrategy1.height((int) 'a');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList10 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(7, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        int int11 = strSkipList10.size();
        strSkipList10.remove("[ ] --- \n[ ] [ ] \n[ ] [ ] \n[ ] [ ] \n H   0\n");
        int int14 = strSkipList10.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strSkipList10.get((-3));
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test605");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 0);
        int int10 = bernoulliHeightStrategy2.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList11 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int13 = bernoulliHeightStrategy2.height(100);
        int int15 = bernoulliHeightStrategy2.nodeHeight((int) 'a');
        int int17 = bernoulliHeightStrategy2.height(100);
        int int19 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 10);
        int int21 = bernoulliHeightStrategy2.nodeHeight((int) (short) 100);
        int int23 = bernoulliHeightStrategy2.height((int) ' ');
        int int25 = bernoulliHeightStrategy2.nodeHeight(7);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList26 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(0, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str28 = strSkipList26.get((int) (short) 0);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test606");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        java.lang.String str1 = strSkipList0.toString();
        java.lang.String str2 = strSkipList0.toString();
        int int3 = strSkipList0.size();
        strSkipList0.add("hi!");
        java.lang.String str6 = strSkipList0.toString();
        strSkipList0.add("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- [ ] [ ] \n[ ] --- [ ] [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        java.lang.String str9 = strSkipList0.toString();
        boolean boolean11 = strSkipList0.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n H   0   1\n");
        java.lang.String str13 = strSkipList0.get(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strSkipList0.get(7);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test607");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        int int3 = strSkipList0.size();
        strSkipList0.remove("");
        int int6 = strSkipList0.size();
        strSkipList0.add("[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        boolean boolean10 = strSkipList0.contains("[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] --- [ ] --- --- \n[ ] --- [ ] --- --- \n[ ] [ ] [ ] [ ] [ ] \n[ ] [ ] [ ] [ ] [ ] \n H   0   1   2   3\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strSkipList0.get(5);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test608");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.height((int) '#');
        int int9 = bernoulliHeightStrategy1.nodeHeight((int) 'a');
        int int11 = bernoulliHeightStrategy1.height(0);
        int int13 = bernoulliHeightStrategy1.height(7);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList14 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        java.lang.String str15 = strSkipList14.toString();
        java.lang.String str17 = strSkipList14.get((-1));
        int int18 = strSkipList14.size();
        strSkipList14.add("");
        java.lang.String str21 = strSkipList14.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = strSkipList14.get((int) '#');
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test609");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 0);
        int int10 = bernoulliHeightStrategy2.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList11 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int13 = bernoulliHeightStrategy2.nodeHeight(5);
        int int15 = bernoulliHeightStrategy2.nodeHeight((int) '#');
        int int17 = bernoulliHeightStrategy2.nodeHeight(2);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList18 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) 10, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = strSkipList18.get(15);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test610");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy3 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int5 = bernoulliHeightStrategy3.nodeHeight((int) (short) 0);
        int int7 = bernoulliHeightStrategy3.height((int) 'a');
        int int9 = bernoulliHeightStrategy3.height((int) '#');
        int int11 = bernoulliHeightStrategy3.height((int) (byte) 1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList12 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) -1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        int int14 = bernoulliHeightStrategy3.nodeHeight((int) ' ');
        int int16 = bernoulliHeightStrategy3.nodeHeight(10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList17 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) 10, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        int int19 = bernoulliHeightStrategy3.nodeHeight((int) (short) 1);
        int int21 = bernoulliHeightStrategy3.height((int) ' ');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList22 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = strSkipList22.get((int) 'a');
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test611");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        java.lang.String str1 = strSkipList0.toString();
        strSkipList0.add("[ ] --- \n[ ] --- \n[ ] --- \n[ ] [ ] \n[ ] [ ] \n[ ] [ ] \n[ ] [ ] \n[ ] [ ] \n H   0\n");
        int int4 = strSkipList0.size();
        java.lang.String str6 = strSkipList0.get(0);
        boolean boolean8 = strSkipList0.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n H   0   1\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strSkipList0.get((int) ' ');
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test612");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        int int3 = strSkipList0.size();
        strSkipList0.remove("");
        int int6 = strSkipList0.size();
        strSkipList0.add("hi!");
        int int9 = strSkipList0.size();
        strSkipList0.remove("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList0.add("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] [ ] [ ] --- \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strSkipList0.get(3);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test613");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        int int3 = strSkipList0.size();
        int int4 = strSkipList0.size();
        java.lang.String str6 = strSkipList0.get(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = strSkipList0.get((int) '#');
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test614");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 0);
        int int10 = bernoulliHeightStrategy2.nodeHeight(5);
        int int12 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 1);
        int int14 = bernoulliHeightStrategy2.nodeHeight((int) 'a');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList15 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((-2), (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList16 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) -1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        strSkipList16.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        java.lang.String str19 = strSkipList16.toString();
        boolean boolean21 = strSkipList16.contains("[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] [ ] \n[ ] [ ] \n H   0\n");
        strSkipList16.add("[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        java.lang.String str24 = strSkipList16.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = strSkipList16.get(10);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test615");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.height((int) '#');
        int int9 = bernoulliHeightStrategy1.nodeHeight((int) ' ');
        int int11 = bernoulliHeightStrategy1.height((int) ' ');
        int int13 = bernoulliHeightStrategy1.nodeHeight(5);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList14 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) 0, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        strSkipList14.remove("[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList14.remove("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] [ ] [ ] --- \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        strSkipList14.remove("[ ] --- --- --- --- --- \n[ ] --- --- --- --- --- \n[ ] --- --- --- --- --- \n[ ] --- --- --- --- --- \n[ ] --- --- --- --- --- \n[ ] [ ] --- --- --- --- \n[ ] [ ] [ ] --- --- --- \n[ ] [ ] [ ] [ ] [ ] [ ] \n H   0   1   2   3   4\n");
        strSkipList14.add("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- [ ] --- \n[ ] [ ] [ ] --- \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = strSkipList14.get((int) (byte) 10);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test616");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.height((int) '#');
        int int10 = bernoulliHeightStrategy2.nodeHeight((int) 'a');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList11 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) -1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList12 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) ' ', (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        strSkipList12.add("[ ] --- \n[ ] --- \n[ ] [ ] \n H   0\n");
        boolean boolean16 = strSkipList12.contains("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- [ ] \n[ ] [ ] --- [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = strSkipList12.get(10);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test617");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight(5);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList8 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) -1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        java.lang.String str10 = strSkipList8.get((int) (byte) -1);
        java.lang.String str11 = strSkipList8.toString();
        java.lang.String str12 = strSkipList8.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strSkipList8.get((int) 'a');
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test618");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.nodeHeight(4);
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) -1);
        int int9 = bernoulliHeightStrategy1.height((int) (byte) 10);
        int int11 = bernoulliHeightStrategy1.height((int) (short) 100);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList12 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(10, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        strSkipList12.add("[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n H \n");
        strSkipList12.remove("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        boolean boolean18 = strSkipList12.contains("[ ] --- \n[ ] --- \n[ ] --- \n[ ] [ ] \n[ ] [ ] \n[ ] [ ] \n[ ] [ ] \n[ ] [ ] \n H   0\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = strSkipList12.get((int) '4');
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test619");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight(5);
        int int9 = bernoulliHeightStrategy1.height(100);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList10 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 10, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strSkipList10.get((-3));
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test620");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        int int3 = strSkipList0.size();
        int int4 = strSkipList0.size();
        java.lang.String str6 = strSkipList0.get((int) (short) 0);
        boolean boolean8 = strSkipList0.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList0.add("[ ] --- --- --- \n[ ] --- --- [ ] \n[ ] --- --- [ ] \n[ ] --- --- [ ] \n[ ] --- --- [ ] \n[ ] [ ] --- [ ] \n[ ] [ ] [ ] [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        strSkipList0.remove("[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strSkipList0.get((int) (short) 10);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test621");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 0);
        int int10 = bernoulliHeightStrategy2.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList11 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int13 = bernoulliHeightStrategy2.height(100);
        int int15 = bernoulliHeightStrategy2.nodeHeight((int) 'a');
        int int17 = bernoulliHeightStrategy2.nodeHeight((int) (short) 10);
        int int19 = bernoulliHeightStrategy2.nodeHeight(10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList20 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((-2), (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        strSkipList20.add("[ ] \n[ ] \n[ ] \n H \n");
        strSkipList20.add("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- [ ] \n[ ] --- --- [ ] \n[ ] --- --- [ ] \n[ ] [ ] --- [ ] \n[ ] [ ] [ ] [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = strSkipList20.get((-4));
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test622");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        java.lang.String str1 = strSkipList0.toString();
        boolean boolean3 = strSkipList0.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        int int4 = strSkipList0.size();
        boolean boolean6 = strSkipList0.contains("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- [ ] [ ] \n[ ] --- [ ] [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        int int7 = strSkipList0.size();
        boolean boolean9 = strSkipList0.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        boolean boolean11 = strSkipList0.contains("");
        int int12 = strSkipList0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strSkipList0.get((int) 'a');
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test623");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.height((int) '#');
        int int9 = bernoulliHeightStrategy1.nodeHeight((int) ' ');
        int int11 = bernoulliHeightStrategy1.height((int) ' ');
        int int13 = bernoulliHeightStrategy1.height(0);
        int int15 = bernoulliHeightStrategy1.height((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList16 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(0, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        strSkipList16.add("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] [ ] --- --- \n[ ] [ ] [ ] [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = strSkipList16.get(5);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test624");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        int int9 = bernoulliHeightStrategy1.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList10 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        strSkipList10.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList10.remove("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList10.remove("hi!");
        java.lang.String str18 = strSkipList10.get((int) (short) 0);
        strSkipList10.remove("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] [ ] --- --- \n[ ] [ ] [ ] [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        strSkipList10.add("[ ] \n[ ] \n[ ] \n[ ] \n H \n");
        java.lang.String str24 = strSkipList10.get((int) (short) 1);
        strSkipList10.remove("[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] [ ] \n H   0\n");
        boolean boolean28 = strSkipList10.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n H   0   1\n");
        java.lang.String str30 = strSkipList10.get(0);
        boolean boolean32 = strSkipList10.contains("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str34 = strSkipList10.get((-3));
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test625");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList8 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) ' ', (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        boolean boolean10 = strSkipList8.contains("[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n H \n");
        java.lang.String str11 = strSkipList8.toString();
        int int12 = strSkipList8.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strSkipList8.get((int) (byte) 100);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test626");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        int int9 = bernoulliHeightStrategy1.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList10 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        strSkipList10.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList10.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        int int15 = strSkipList10.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = strSkipList10.get((int) '#');
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test627");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.remove("");
        int int3 = strSkipList0.size();
        java.lang.String str5 = strSkipList0.get((int) (byte) -1);
        boolean boolean7 = strSkipList0.contains("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] [ ] --- --- \n[ ] [ ] [ ] [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        int int8 = strSkipList0.size();
        strSkipList0.add("[ ] \n H \n");
        strSkipList0.remove("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] [ ] [ ] --- \n[ ] [ ] [ ] --- \n[ ] [ ] [ ] --- \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strSkipList0.get(5);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test628");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy3 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int5 = bernoulliHeightStrategy3.nodeHeight((int) (short) 0);
        int int7 = bernoulliHeightStrategy3.height((int) 'a');
        int int9 = bernoulliHeightStrategy3.nodeHeight((int) (byte) 0);
        int int11 = bernoulliHeightStrategy3.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList12 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        int int14 = bernoulliHeightStrategy3.height(100);
        int int16 = bernoulliHeightStrategy3.nodeHeight((int) '4');
        int int18 = bernoulliHeightStrategy3.nodeHeight(0);
        int int20 = bernoulliHeightStrategy3.height((int) '4');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList21 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        int int23 = bernoulliHeightStrategy3.nodeHeight(100);
        int int25 = bernoulliHeightStrategy3.nodeHeight((int) (short) -1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList26 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(10, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        boolean boolean28 = strSkipList26.contains("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- [ ] --- \n[ ] [ ] [ ] [ ] \n[ ] [ ] [ ] [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str30 = strSkipList26.get(3);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test629");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy3 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int5 = bernoulliHeightStrategy3.height((-1));
        int int7 = bernoulliHeightStrategy3.nodeHeight((int) 'a');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList8 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(10, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        int int10 = bernoulliHeightStrategy3.height(1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList11 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(7, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        int int13 = bernoulliHeightStrategy3.nodeHeight(4);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList14 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(9, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        strSkipList14.remove("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] [ ] --- [ ] \n[ ] [ ] [ ] [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = strSkipList14.get(1);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test630");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        int int9 = bernoulliHeightStrategy1.nodeHeight(5);
        int int11 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 1);
        int int13 = bernoulliHeightStrategy1.nodeHeight((int) 'a');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList14 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((-2), (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        java.lang.String str15 = strSkipList14.toString();
        java.lang.String str17 = strSkipList14.get((int) (byte) -1);
        boolean boolean19 = strSkipList14.contains("hi!");
        boolean boolean21 = strSkipList14.contains("[ ] [ ] \n H   0\n");
        strSkipList14.remove("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList14.add("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] [ ] --- --- \n[ ] [ ] [ ] --- \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        boolean boolean27 = strSkipList14.contains("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] [ ] --- [ ] \n[ ] [ ] [ ] [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str29 = strSkipList14.get((int) (short) 100);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test631");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height(2);
        int int7 = bernoulliHeightStrategy1.nodeHeight(3);
        int int9 = bernoulliHeightStrategy1.nodeHeight(6);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList10 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strSkipList10.get(11);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test632");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        boolean boolean2 = strSkipList0.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        boolean boolean4 = strSkipList0.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList0.add("");
        strSkipList0.remove("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strSkipList0.get(9);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test633");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        java.lang.String str1 = strSkipList0.toString();
        boolean boolean3 = strSkipList0.contains("[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n H \n");
        boolean boolean5 = strSkipList0.contains("[ ] --- \n[ ] --- \n[ ] --- \n[ ] [ ] \n[ ] [ ] \n[ ] [ ] \n[ ] [ ] \n[ ] [ ] \n H   0\n");
        int int6 = strSkipList0.size();
        int int7 = strSkipList0.size();
        java.lang.String str8 = strSkipList0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strSkipList0.get((int) (short) 10);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test634");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.height((-1));
        int int5 = bernoulliHeightStrategy1.nodeHeight((int) 'a');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList6 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(10, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        boolean boolean8 = strSkipList6.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        int int9 = strSkipList6.size();
        int int10 = strSkipList6.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strSkipList6.get(9);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test635");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        boolean boolean2 = strSkipList0.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList0.add("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- [ ] \n[ ] --- [ ] [ ] \n[ ] --- [ ] [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = strSkipList0.get(8);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test636");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        int int3 = strSkipList0.size();
        int int4 = strSkipList0.size();
        java.lang.String str6 = strSkipList0.get((int) (short) 0);
        boolean boolean8 = strSkipList0.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList0.add("[ ] --- --- --- \n[ ] --- --- [ ] \n[ ] --- --- [ ] \n[ ] --- --- [ ] \n[ ] --- --- [ ] \n[ ] [ ] --- [ ] \n[ ] [ ] [ ] [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        strSkipList0.remove("[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        boolean boolean14 = strSkipList0.contains("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        int int15 = strSkipList0.size();
        strSkipList0.remove("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = strSkipList0.get((int) (byte) 100);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test637");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 0);
        int int10 = bernoulliHeightStrategy2.nodeHeight((int) (short) 10);
        int int12 = bernoulliHeightStrategy2.nodeHeight((int) (short) 1);
        int int14 = bernoulliHeightStrategy2.height((int) 'a');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList15 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(2, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList16 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = strSkipList16.get((int) (byte) 0);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test638");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        int int9 = bernoulliHeightStrategy1.nodeHeight(5);
        int int11 = bernoulliHeightStrategy1.height(100);
        int int13 = bernoulliHeightStrategy1.height(5);
        int int15 = bernoulliHeightStrategy1.height((int) (byte) 0);
        int int17 = bernoulliHeightStrategy1.height((-2));
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList18 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        boolean boolean20 = strSkipList18.contains("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] [ ] [ ] --- \n[ ] [ ] [ ] --- \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        strSkipList18.remove("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        int int23 = strSkipList18.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = strSkipList18.get((int) (byte) 100);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test639");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        strSkipList0.add("hi!");
        strSkipList0.remove("");
        java.lang.String str8 = strSkipList0.get((int) (short) 0);
        java.lang.String str9 = strSkipList0.toString();
        java.lang.String str10 = strSkipList0.toString();
        boolean boolean12 = strSkipList0.contains("[ ] \n H \n");
        strSkipList0.remove("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strSkipList0.get((int) (byte) 100);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test640");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy3 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int5 = bernoulliHeightStrategy3.nodeHeight((int) (short) 0);
        int int7 = bernoulliHeightStrategy3.height((int) 'a');
        int int9 = bernoulliHeightStrategy3.nodeHeight((int) (byte) 0);
        int int11 = bernoulliHeightStrategy3.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList12 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList13 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(7, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        int int15 = bernoulliHeightStrategy3.nodeHeight((int) (byte) 1);
        int int17 = bernoulliHeightStrategy3.height(0);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList18 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) '#', (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        int int19 = strSkipList18.size();
        int int20 = strSkipList18.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = strSkipList18.get((int) '4');
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test641");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.height((int) '#');
        int int9 = bernoulliHeightStrategy1.nodeHeight((int) 'a');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList10 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) -1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        strSkipList10.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        java.lang.String str13 = strSkipList10.toString();
        java.lang.String str14 = strSkipList10.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strSkipList10.get(10);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test642");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 0);
        int int10 = bernoulliHeightStrategy2.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList11 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList12 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) -1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        strSkipList12.add("[ ] --- \n[ ] --- \n[ ] --- \n[ ] [ ] \n H   0\n");
        boolean boolean16 = strSkipList12.contains("[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] [ ] \n[ ] [ ] \n H   0\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = strSkipList12.get((-3));
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test643");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        int int9 = bernoulliHeightStrategy1.nodeHeight((int) (short) 10);
        int int11 = bernoulliHeightStrategy1.nodeHeight((int) (short) 1);
        int int13 = bernoulliHeightStrategy1.height((-1));
        int int15 = bernoulliHeightStrategy1.nodeHeight(6);
        int int17 = bernoulliHeightStrategy1.height((int) (short) 0);
        int int19 = bernoulliHeightStrategy1.nodeHeight(7);
        int int21 = bernoulliHeightStrategy1.nodeHeight(3);
        int int23 = bernoulliHeightStrategy1.nodeHeight(2);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList24 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((-4), (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = strSkipList24.get(9);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test644");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        boolean boolean2 = strSkipList0.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        boolean boolean4 = strSkipList0.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n H   0   1\n");
        boolean boolean6 = strSkipList0.contains("[ ] [ ] \n H   0\n");
        strSkipList0.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList0.add("");
        strSkipList0.add("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] [ ] [ ] --- \n[ ] [ ] [ ] --- \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strSkipList0.get(7);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test645");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 0);
        int int10 = bernoulliHeightStrategy2.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList11 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList12 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) -1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        strSkipList12.add("[ ] --- \n[ ] --- \n[ ] --- \n[ ] [ ] \n H   0\n");
        strSkipList12.remove("[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] [ ] \n[ ] [ ] \n H   0\n");
        int int17 = strSkipList12.size();
        strSkipList12.remove("[ ] [ ] \n H   0\n");
        int int20 = strSkipList12.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = strSkipList12.get(7);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test646");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        java.lang.String str1 = strSkipList0.toString();
        strSkipList0.add("[ ] --- \n[ ] --- \n[ ] --- \n[ ] [ ] \n[ ] [ ] \n[ ] [ ] \n[ ] [ ] \n[ ] [ ] \n H   0\n");
        int int4 = strSkipList0.size();
        java.lang.String str6 = strSkipList0.get(0);
        strSkipList0.add("[ ] [ ] [ ] \n H   0   1\n");
        strSkipList0.remove("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strSkipList0.get(5);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test647");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        strSkipList0.add("hi!");
        boolean boolean6 = strSkipList0.contains("");
        java.lang.String str7 = strSkipList0.toString();
        boolean boolean9 = strSkipList0.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList0.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList0.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList0.remove("[ ] [ ] [ ] \n H   0   1\n");
        boolean boolean17 = strSkipList0.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = strSkipList0.get((int) (byte) 10);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test648");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.height((int) '#');
        int int10 = bernoulliHeightStrategy2.nodeHeight((int) 'a');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList11 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) -1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int13 = bernoulliHeightStrategy2.nodeHeight(4);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList14 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(4, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        strSkipList14.add("[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] [ ] \n[ ] [ ] \n H   0\n");
        java.lang.String str18 = strSkipList14.get((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = strSkipList14.get((int) (short) 1);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test649");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 10);
        int int9 = bernoulliHeightStrategy1.nodeHeight(10);
        int int11 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 10);
        int int13 = bernoulliHeightStrategy1.nodeHeight(10);
        int int15 = bernoulliHeightStrategy1.nodeHeight((int) 'a');
        int int17 = bernoulliHeightStrategy1.height((int) ' ');
        int int19 = bernoulliHeightStrategy1.nodeHeight((int) '4');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList20 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) 1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        strSkipList20.add("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = strSkipList20.get(3);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test650");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy3 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int5 = bernoulliHeightStrategy3.height((-1));
        int int7 = bernoulliHeightStrategy3.nodeHeight((int) 'a');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList8 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(10, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        int int10 = bernoulliHeightStrategy3.height(1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList11 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(7, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        int int13 = bernoulliHeightStrategy3.nodeHeight(2);
        int int15 = bernoulliHeightStrategy3.height(8);
        int int17 = bernoulliHeightStrategy3.height((int) (byte) 100);
        int int19 = bernoulliHeightStrategy3.nodeHeight((-1));
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList20 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) '4', (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = strSkipList20.get((int) (short) 10);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test651");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight(5);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList8 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) -1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        boolean boolean10 = strSkipList8.contains("hi!");
        strSkipList8.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList8.remove("[ ] [ ] [ ] \n H   0   1\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strSkipList8.get((-4));
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test652");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.height((int) '#');
        int int9 = bernoulliHeightStrategy1.height((int) (byte) 1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList10 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) -1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        strSkipList10.add("hi!");
        java.lang.String str13 = strSkipList10.toString();
        strSkipList10.add("[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] [ ] \n H   0\n");
        strSkipList10.remove("[ ] --- --- --- \n[ ] [ ] --- --- \n[ ] [ ] --- --- \n[ ] [ ] --- --- \n[ ] [ ] --- --- \n[ ] [ ] [ ] --- \n[ ] [ ] [ ] --- \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = strSkipList10.get(11);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test653");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.remove("");
        int int3 = strSkipList0.size();
        java.lang.String str5 = strSkipList0.get((int) (byte) -1);
        strSkipList0.remove("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        int int8 = strSkipList0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strSkipList0.get(5);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test654");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 0);
        int int10 = bernoulliHeightStrategy2.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList11 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int13 = bernoulliHeightStrategy2.height(100);
        int int15 = bernoulliHeightStrategy2.nodeHeight(100);
        int int17 = bernoulliHeightStrategy2.nodeHeight((int) '4');
        int int19 = bernoulliHeightStrategy2.nodeHeight(10);
        int int21 = bernoulliHeightStrategy2.height(10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList22 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(2, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        strSkipList22.remove("[ ] --- --- --- \n[ ] --- --- [ ] \n[ ] --- --- [ ] \n[ ] --- --- [ ] \n[ ] --- --- [ ] \n[ ] [ ] --- [ ] \n[ ] [ ] [ ] [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = strSkipList22.get((int) 'a');
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test655");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        int int9 = bernoulliHeightStrategy1.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList10 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        strSkipList10.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList10.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        int int15 = strSkipList10.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = strSkipList10.get(6);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test656");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        int int9 = bernoulliHeightStrategy1.nodeHeight(5);
        int int11 = bernoulliHeightStrategy1.height(100);
        int int13 = bernoulliHeightStrategy1.nodeHeight((-1));
        int int15 = bernoulliHeightStrategy1.height(3);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList16 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = strSkipList16.get(15);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test657");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        int int9 = bernoulliHeightStrategy1.nodeHeight(5);
        int int11 = bernoulliHeightStrategy1.height(2);
        int int13 = bernoulliHeightStrategy1.nodeHeight((int) '#');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList14 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(5, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strSkipList14.get(0);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test658");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        int int9 = bernoulliHeightStrategy1.nodeHeight(5);
        int int11 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 1);
        int int13 = bernoulliHeightStrategy1.nodeHeight(2);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList14 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        int int15 = strSkipList14.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = strSkipList14.get((-4));
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test659");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList8 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) ' ', (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        boolean boolean10 = strSkipList8.contains("[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n H \n");
        java.lang.String str11 = strSkipList8.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strSkipList8.get((int) (byte) 10);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test660");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 0);
        int int10 = bernoulliHeightStrategy2.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList11 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int13 = bernoulliHeightStrategy2.height((int) (short) 0);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList14 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 0, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int15 = strSkipList14.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = strSkipList14.get((int) (byte) 0);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test661");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.remove("");
        int int3 = strSkipList0.size();
        int int4 = strSkipList0.size();
        int int5 = strSkipList0.size();
        strSkipList0.add("[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n H \n");
        boolean boolean9 = strSkipList0.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList0.remove("");
        strSkipList0.add("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strSkipList0.get((int) (byte) 100);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test662");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        strSkipList0.add("hi!");
        strSkipList0.remove("");
        java.lang.String str8 = strSkipList0.get((int) (short) 0);
        java.lang.String str9 = strSkipList0.toString();
        java.lang.String str10 = strSkipList0.toString();
        int int11 = strSkipList0.size();
        int int12 = strSkipList0.size();
        strSkipList0.add("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- [ ] \n[ ] --- [ ] [ ] \n[ ] --- [ ] [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        strSkipList0.add("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = strSkipList0.get((int) '#');
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test663");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        strSkipList0.add("hi!");
        strSkipList0.add("[ ] [ ] \n H   0\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = strSkipList0.get((int) (short) 100);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test664");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.height(100);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList5 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(0, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList6 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) ' ', (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = strSkipList6.get((int) 'a');
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test665");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight(5);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList8 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) -1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        java.lang.String str10 = strSkipList8.get((int) (short) -1);
        java.lang.String str12 = strSkipList8.get((int) (short) -1);
        boolean boolean14 = strSkipList8.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strSkipList8.get((int) '#');
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test666");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        int int9 = bernoulliHeightStrategy1.nodeHeight(5);
        int int11 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 1);
        int int13 = bernoulliHeightStrategy1.nodeHeight(2);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList14 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        boolean boolean16 = strSkipList14.contains("[ ] --- \n[ ] --- \n[ ] [ ] \n[ ] [ ] \n H   0\n");
        boolean boolean18 = strSkipList14.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        int int19 = strSkipList14.size();
        boolean boolean21 = strSkipList14.contains("[ ] --- \n[ ] --- \n[ ] [ ] \n[ ] [ ] \n H   0\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = strSkipList14.get((int) (short) 1);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test667");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 0);
        int int10 = bernoulliHeightStrategy2.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList11 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int13 = bernoulliHeightStrategy2.height(100);
        int int15 = bernoulliHeightStrategy2.nodeHeight(100);
        int int17 = bernoulliHeightStrategy2.height(1);
        int int19 = bernoulliHeightStrategy2.nodeHeight(6);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList20 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) '#', (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        strSkipList20.add("[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = strSkipList20.get(3);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test668");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 0);
        int int10 = bernoulliHeightStrategy2.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList11 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int13 = bernoulliHeightStrategy2.height(100);
        int int15 = bernoulliHeightStrategy2.nodeHeight((int) 'a');
        int int17 = bernoulliHeightStrategy2.height(100);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList18 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) 'a', (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        java.lang.String str19 = strSkipList18.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = strSkipList18.get((-3));
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test669");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        int int9 = bernoulliHeightStrategy1.nodeHeight(5);
        int int11 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 1);
        int int13 = bernoulliHeightStrategy1.nodeHeight(2);
        int int15 = bernoulliHeightStrategy1.nodeHeight(0);
        int int17 = bernoulliHeightStrategy1.height((int) '4');
        int int19 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 100);
        int int21 = bernoulliHeightStrategy1.height(1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList22 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(5, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        strSkipList22.remove("[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] --- --- [ ] --- \n[ ] --- --- [ ] [ ] \n[ ] [ ] --- [ ] [ ] \n[ ] [ ] [ ] [ ] [ ] \n H   0   1   2   3\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = strSkipList22.get((int) (short) 1);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test670");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        int int9 = bernoulliHeightStrategy1.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList10 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        strSkipList10.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList10.remove("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList10.remove("hi!");
        java.lang.String str18 = strSkipList10.get((int) (short) 0);
        strSkipList10.remove("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] [ ] --- --- \n[ ] [ ] [ ] [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        strSkipList10.add("[ ] \n[ ] \n[ ] \n[ ] \n H \n");
        java.lang.String str24 = strSkipList10.get((int) (short) 1);
        strSkipList10.remove("[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] [ ] \n H   0\n");
        boolean boolean28 = strSkipList10.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n H   0   1\n");
        int int29 = strSkipList10.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str31 = strSkipList10.get((int) (byte) 100);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test671");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 0);
        int int10 = bernoulliHeightStrategy2.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList11 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int13 = bernoulliHeightStrategy2.height(100);
        int int15 = bernoulliHeightStrategy2.nodeHeight((int) 'a');
        int int17 = bernoulliHeightStrategy2.height(100);
        int int19 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 10);
        int int21 = bernoulliHeightStrategy2.nodeHeight((int) (byte) -1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList22 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 0, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int23 = strSkipList22.size();
        strSkipList22.add("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str27 = strSkipList22.get(8);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test672");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        strSkipList0.add("hi!");
        java.lang.String str5 = strSkipList0.toString();
        strSkipList0.remove("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        boolean boolean9 = strSkipList0.contains("[ ] [ ] \n H   0\n");
        strSkipList0.remove("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList0.add("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] [ ] --- --- \n[ ] [ ] --- --- \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strSkipList0.get((-3));
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test673");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        int int9 = bernoulliHeightStrategy1.nodeHeight((int) (short) 10);
        int int11 = bernoulliHeightStrategy1.nodeHeight((int) (short) 1);
        int int13 = bernoulliHeightStrategy1.height((-1));
        int int15 = bernoulliHeightStrategy1.nodeHeight(6);
        int int17 = bernoulliHeightStrategy1.height((int) (short) 0);
        int int19 = bernoulliHeightStrategy1.nodeHeight(7);
        int int21 = bernoulliHeightStrategy1.nodeHeight(3);
        int int23 = bernoulliHeightStrategy1.nodeHeight(2);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList24 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((-4), (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = strSkipList24.get((int) '#');
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test674");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 0);
        int int10 = bernoulliHeightStrategy2.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList11 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int13 = bernoulliHeightStrategy2.height(100);
        int int15 = bernoulliHeightStrategy2.nodeHeight((int) 'a');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList16 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) 10, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        strSkipList16.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n H   0   1\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = strSkipList16.get((int) ' ');
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test675");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy3 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int5 = bernoulliHeightStrategy3.nodeHeight((int) (short) 0);
        int int7 = bernoulliHeightStrategy3.height((int) 'a');
        int int9 = bernoulliHeightStrategy3.height((int) '#');
        int int11 = bernoulliHeightStrategy3.height((int) (byte) 1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList12 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) -1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        int int14 = bernoulliHeightStrategy3.nodeHeight((int) ' ');
        int int16 = bernoulliHeightStrategy3.nodeHeight(10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList17 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) 10, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList18 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(2, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        boolean boolean20 = strSkipList18.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList18.add("[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] [ ] \n[ ] [ ] \n[ ] [ ] \n H   0\n");
        strSkipList18.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        java.lang.String str25 = strSkipList18.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str27 = strSkipList18.get((-3));
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test676");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        strSkipList0.add("hi!");
        strSkipList0.remove("");
        java.lang.String str8 = strSkipList0.get((int) (short) 0);
        int int9 = strSkipList0.size();
        java.lang.String str10 = strSkipList0.toString();
        java.lang.String str11 = strSkipList0.toString();
        java.lang.String str12 = strSkipList0.toString();
        java.lang.String str13 = strSkipList0.toString();
        boolean boolean15 = strSkipList0.contains("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        strSkipList0.remove("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] [ ] [ ] --- \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        strSkipList0.add("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] --- [ ] [ ] \n[ ] --- [ ] [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = strSkipList0.get((int) (byte) 10);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test677");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        int int9 = bernoulliHeightStrategy1.nodeHeight(5);
        int int11 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList12 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) -1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        java.lang.String str13 = strSkipList12.toString();
        int int14 = strSkipList12.size();
        strSkipList12.add("[ ] --- --- --- \n[ ] --- --- --- \n[ ] [ ] --- --- \n[ ] [ ] --- --- \n[ ] [ ] --- --- \n[ ] [ ] --- --- \n[ ] [ ] --- --- \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = strSkipList12.get((int) '4');
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test678");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        int int3 = strSkipList0.size();
        strSkipList0.remove("");
        java.lang.String str6 = strSkipList0.toString();
        strSkipList0.remove("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strSkipList0.get(7);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test679");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        strSkipList0.add("hi!");
        java.lang.String str5 = strSkipList0.toString();
        java.lang.String str7 = strSkipList0.get(0);
        java.lang.String str9 = strSkipList0.get((int) (short) 0);
        boolean boolean11 = strSkipList0.contains("[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] --- [ ] --- --- \n[ ] [ ] [ ] [ ] [ ] \n H   0   1   2   3\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strSkipList0.get((int) '#');
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test680");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.height((-1));
        int int5 = bernoulliHeightStrategy1.nodeHeight((int) 'a');
        int int7 = bernoulliHeightStrategy1.height(2);
        int int9 = bernoulliHeightStrategy1.height((int) 'a');
        int int11 = bernoulliHeightStrategy1.nodeHeight((int) 'a');
        int int13 = bernoulliHeightStrategy1.nodeHeight((int) (short) 100);
        int int15 = bernoulliHeightStrategy1.nodeHeight(0);
        int int17 = bernoulliHeightStrategy1.height(6);
        int int19 = bernoulliHeightStrategy1.nodeHeight(6);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList20 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(5, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = strSkipList20.get((int) (short) 10);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test681");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        strSkipList0.add("hi!");
        boolean boolean6 = strSkipList0.contains("");
        java.lang.String str7 = strSkipList0.toString();
        strSkipList0.add("[ ] \n H \n");
        boolean boolean11 = strSkipList0.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList0.remove("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] [ ] [ ] --- \n[ ] [ ] [ ] --- \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strSkipList0.get((-4));
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test682");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        int int3 = strSkipList0.size();
        int int4 = strSkipList0.size();
        java.lang.String str6 = strSkipList0.get((int) (short) 0);
        java.lang.String str7 = strSkipList0.toString();
        strSkipList0.add("[ ] \n H \n");
        java.lang.String str10 = strSkipList0.toString();
        java.lang.String str12 = strSkipList0.get((int) (byte) 0);
        boolean boolean14 = strSkipList0.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        int int15 = strSkipList0.size();
        strSkipList0.remove("[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = strSkipList0.get((int) (byte) 100);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test683");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 0);
        int int10 = bernoulliHeightStrategy2.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList11 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int13 = bernoulliHeightStrategy2.height(100);
        int int15 = bernoulliHeightStrategy2.nodeHeight((int) '4');
        int int17 = bernoulliHeightStrategy2.nodeHeight(0);
        int int19 = bernoulliHeightStrategy2.height((int) '4');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList20 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        java.lang.String str21 = strSkipList20.toString();
        int int22 = strSkipList20.size();
        strSkipList20.remove("[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] --- --- [ ] --- \n[ ] --- --- [ ] --- \n[ ] --- --- [ ] --- \n[ ] [ ] --- [ ] --- \n[ ] [ ] [ ] [ ] [ ] \n H   0   1   2   3\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = strSkipList20.get((-2));
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test684");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        int int9 = bernoulliHeightStrategy1.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList10 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        strSkipList10.add("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        strSkipList10.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        int int15 = strSkipList10.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = strSkipList10.get((-2));
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test685");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.height((-1));
        int int5 = bernoulliHeightStrategy1.nodeHeight((int) 'a');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList6 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(10, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        strSkipList6.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n H   0   1\n");
        java.lang.String str9 = strSkipList6.toString();
        strSkipList6.remove("");
        boolean boolean13 = strSkipList6.contains("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] [ ] [ ] --- \n[ ] [ ] [ ] --- \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        boolean boolean15 = strSkipList6.contains("[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        int int16 = strSkipList6.size();
        strSkipList6.remove("");
        boolean boolean20 = strSkipList6.contains("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- [ ] --- \n[ ] [ ] [ ] [ ] \n[ ] [ ] [ ] [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = strSkipList6.get((int) (byte) 100);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test686");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.remove("");
        boolean boolean4 = strSkipList0.contains("[ ] --- \n[ ] --- \n[ ] [ ] \n[ ] [ ] \n H   0\n");
        boolean boolean6 = strSkipList0.contains("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] [ ] [ ] --- \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = strSkipList0.get((int) (short) 1);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test687");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.height((int) '#');
        int int9 = bernoulliHeightStrategy1.nodeHeight((int) ' ');
        int int11 = bernoulliHeightStrategy1.height((int) ' ');
        int int13 = bernoulliHeightStrategy1.nodeHeight(5);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList14 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) 0, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        boolean boolean16 = strSkipList14.contains("[ ] \n[ ] \n[ ] \n[ ] \n H \n");
        int int17 = strSkipList14.size();
        int int18 = strSkipList14.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = strSkipList14.get(4);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test688");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        strSkipList0.add("hi!");
        java.lang.String str5 = strSkipList0.toString();
        java.lang.String str7 = strSkipList0.get(0);
        strSkipList0.add("hi!");
        java.lang.String str10 = strSkipList0.toString();
        java.lang.String str11 = strSkipList0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strSkipList0.get(11);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test689");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        strSkipList0.add("hi!");
        boolean boolean6 = strSkipList0.contains("");
        java.lang.String str7 = strSkipList0.toString();
        boolean boolean9 = strSkipList0.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList0.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList0.remove("[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n H \n");
        int int14 = strSkipList0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strSkipList0.get((-4));
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test690");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.remove("");
        strSkipList0.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList0.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        boolean boolean8 = strSkipList0.contains("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- [ ] [ ] \n[ ] [ ] [ ] [ ] \n[ ] [ ] [ ] [ ] \n[ ] [ ] [ ] [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strSkipList0.get(10);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test691");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        int int9 = bernoulliHeightStrategy1.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList10 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        strSkipList10.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList10.remove("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList10.remove("hi!");
        java.lang.String str18 = strSkipList10.get((int) (short) 0);
        strSkipList10.remove("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] [ ] --- --- \n[ ] [ ] [ ] [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = strSkipList10.get(10);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test692");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        java.lang.String str1 = strSkipList0.toString();
        java.lang.String str2 = strSkipList0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = strSkipList0.get(100);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test693");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        int int9 = bernoulliHeightStrategy1.nodeHeight(5);
        int int11 = bernoulliHeightStrategy1.height(2);
        int int13 = bernoulliHeightStrategy1.nodeHeight((int) 'a');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList14 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strSkipList14.get(6);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test694");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        int int9 = bernoulliHeightStrategy1.nodeHeight((int) (short) 10);
        int int11 = bernoulliHeightStrategy1.nodeHeight((int) (short) 1);
        int int13 = bernoulliHeightStrategy1.height((-1));
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList14 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(10, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        int int15 = strSkipList14.size();
        java.lang.String str16 = strSkipList14.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = strSkipList14.get((int) (byte) 100);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test695");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.height((int) '#');
        int int10 = bernoulliHeightStrategy2.height((int) (byte) 1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList11 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) -1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int13 = bernoulliHeightStrategy2.nodeHeight((int) ' ');
        int int15 = bernoulliHeightStrategy2.nodeHeight(10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList16 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(10, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        boolean boolean18 = strSkipList16.contains("[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n H   0   1\n");
        int int19 = strSkipList16.size();
        boolean boolean21 = strSkipList16.contains("[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n H \n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = strSkipList16.get(15);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test696");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.height((int) '#');
        int int9 = bernoulliHeightStrategy1.nodeHeight((int) 'a');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList10 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) -1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        strSkipList10.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        int int13 = strSkipList10.size();
        boolean boolean15 = strSkipList10.contains("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- [ ] \n[ ] --- --- [ ] \n[ ] --- --- [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        int int16 = strSkipList10.size();
        strSkipList10.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList10.remove("[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = strSkipList10.get(4);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test697");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        int int9 = bernoulliHeightStrategy1.nodeHeight(5);
        int int11 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 1);
        int int13 = bernoulliHeightStrategy1.nodeHeight(2);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList14 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        java.lang.String str15 = strSkipList14.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = strSkipList14.get(2);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test698");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        int int9 = bernoulliHeightStrategy1.nodeHeight(5);
        int int11 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 1);
        int int13 = bernoulliHeightStrategy1.nodeHeight((int) 'a');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList14 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((-2), (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        java.lang.String str15 = strSkipList14.toString();
        boolean boolean17 = strSkipList14.contains("[ ] \n H \n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = strSkipList14.get(4);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test699");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList8 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) ' ', (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        boolean boolean10 = strSkipList8.contains("[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n H \n");
        java.lang.String str11 = strSkipList8.toString();
        strSkipList8.add("[ ] \n[ ] \n[ ] \n[ ] \n H \n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strSkipList8.get((int) (short) 100);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test700");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList9 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 10, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList10 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(2, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        java.lang.String str11 = strSkipList10.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strSkipList10.get((int) (byte) 100);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test701");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.height((-1));
        int int5 = bernoulliHeightStrategy1.nodeHeight((int) 'a');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList6 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(10, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        strSkipList6.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n H   0   1\n");
        int int9 = strSkipList6.size();
        java.lang.String str10 = strSkipList6.toString();
        java.lang.String str11 = strSkipList6.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strSkipList6.get((-3));
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test702");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.height((int) '#');
        int int10 = bernoulliHeightStrategy2.nodeHeight((int) (short) 100);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList11 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(0, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int13 = bernoulliHeightStrategy2.nodeHeight(6);
        int int15 = bernoulliHeightStrategy2.height((int) '#');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList16 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((-2), (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        boolean boolean18 = strSkipList16.contains("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] [ ] --- --- \n[ ] [ ] [ ] [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = strSkipList16.get((int) 'a');
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test703");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        int int9 = bernoulliHeightStrategy1.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList10 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        strSkipList10.remove("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        int int13 = strSkipList10.size();
        int int14 = strSkipList10.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strSkipList10.get((int) (byte) 100);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test704");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        strSkipList0.add("hi!");
        java.lang.String str5 = strSkipList0.toString();
        java.lang.String str7 = strSkipList0.get(0);
        strSkipList0.add("hi!");
        java.lang.String str10 = strSkipList0.toString();
        boolean boolean12 = strSkipList0.contains("hi!");
        int int13 = strSkipList0.size();
        boolean boolean15 = strSkipList0.contains("[ ] --- --- --- \n[ ] [ ] --- [ ] \n[ ] [ ] --- [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = strSkipList0.get((int) (short) 10);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test705");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        strSkipList0.add("hi!");
        java.lang.String str5 = strSkipList0.toString();
        strSkipList0.remove("[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList0.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strSkipList0.get(4);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test706");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        strSkipList0.add("hi!");
        java.lang.String str5 = strSkipList0.toString();
        java.lang.String str7 = strSkipList0.get(0);
        strSkipList0.add("hi!");
        java.lang.String str10 = strSkipList0.toString();
        int int11 = strSkipList0.size();
        java.lang.String str12 = strSkipList0.toString();
        strSkipList0.add("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- [ ] --- \n[ ] --- [ ] [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strSkipList0.get(7);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test707");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy3 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int5 = bernoulliHeightStrategy3.nodeHeight((int) (short) 0);
        int int7 = bernoulliHeightStrategy3.height((int) 'a');
        int int9 = bernoulliHeightStrategy3.height((int) '#');
        int int11 = bernoulliHeightStrategy3.nodeHeight((int) (short) 100);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList12 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(0, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList13 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) '#', (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        int int15 = bernoulliHeightStrategy3.nodeHeight(6);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList16 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        strSkipList16.remove("[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] --- [ ] --- --- \n[ ] [ ] [ ] [ ] [ ] \n H   0   1   2   3\n");
        int int19 = strSkipList16.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = strSkipList16.get(0);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test708");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        strSkipList0.add("hi!");
        strSkipList0.remove("");
        java.lang.String str8 = strSkipList0.get((int) (short) 0);
        int int9 = strSkipList0.size();
        java.lang.String str10 = strSkipList0.toString();
        boolean boolean12 = strSkipList0.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        boolean boolean14 = strSkipList0.contains("");
        java.lang.String str15 = strSkipList0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = strSkipList0.get(7);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test709");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.remove("");
        int int3 = strSkipList0.size();
        int int4 = strSkipList0.size();
        int int5 = strSkipList0.size();
        int int6 = strSkipList0.size();
        int int7 = strSkipList0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strSkipList0.get((int) (short) 1);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test710");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.height((int) '#');
        int int9 = bernoulliHeightStrategy1.nodeHeight((int) ' ');
        int int11 = bernoulliHeightStrategy1.height((int) ' ');
        int int13 = bernoulliHeightStrategy1.nodeHeight(5);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList14 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) 0, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        strSkipList14.remove("[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList14.remove("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] [ ] [ ] --- \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        strSkipList14.remove("[ ] --- --- --- --- --- \n[ ] --- --- --- --- --- \n[ ] --- --- --- --- --- \n[ ] --- --- --- --- --- \n[ ] --- --- --- --- --- \n[ ] [ ] --- --- --- --- \n[ ] [ ] [ ] --- --- --- \n[ ] [ ] [ ] [ ] [ ] [ ] \n H   0   1   2   3   4\n");
        strSkipList14.add("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- [ ] --- \n[ ] [ ] [ ] --- \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        strSkipList14.remove("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] [ ] --- --- \n[ ] [ ] --- --- \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = strSkipList14.get((int) '4');
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test711");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        int int9 = bernoulliHeightStrategy1.nodeHeight(5);
        int int11 = bernoulliHeightStrategy1.height(100);
        int int13 = bernoulliHeightStrategy1.nodeHeight((-1));
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList14 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(4, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        java.lang.String str15 = strSkipList14.toString();
        strSkipList14.add("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] [ ] --- --- \n[ ] [ ] [ ] [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        java.lang.String str18 = strSkipList14.toString();
        java.lang.String str19 = strSkipList14.toString();
        boolean boolean21 = strSkipList14.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = strSkipList14.get((int) ' ');
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test712");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        strSkipList0.add("hi!");
        int int5 = strSkipList0.size();
        int int6 = strSkipList0.size();
        strSkipList0.add("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] [ ] --- [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        int int9 = strSkipList0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strSkipList0.get((int) ' ');
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test713");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 0);
        int int10 = bernoulliHeightStrategy2.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList11 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int13 = bernoulliHeightStrategy2.height(100);
        int int15 = bernoulliHeightStrategy2.nodeHeight(100);
        int int17 = bernoulliHeightStrategy2.nodeHeight((int) '4');
        int int19 = bernoulliHeightStrategy2.height(100);
        int int21 = bernoulliHeightStrategy2.height(6);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList22 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((-1), (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        strSkipList22.remove("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] [ ] --- --- \n[ ] [ ] [ ] [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        boolean boolean26 = strSkipList22.contains("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- [ ] [ ] \n[ ] --- [ ] [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        strSkipList22.remove("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n H   0   1\n");
        boolean boolean30 = strSkipList22.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n H   0   1\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str32 = strSkipList22.get((int) 'a');
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test714");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        strSkipList0.add("hi!");
        strSkipList0.remove("");
        java.lang.String str8 = strSkipList0.get((int) (short) 0);
        java.lang.String str9 = strSkipList0.toString();
        strSkipList0.add("");
        int int12 = strSkipList0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strSkipList0.get(100);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test715");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        int int9 = bernoulliHeightStrategy1.nodeHeight(5);
        int int11 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 1);
        int int13 = bernoulliHeightStrategy1.nodeHeight((int) 'a');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList14 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((-2), (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        java.lang.String str15 = strSkipList14.toString();
        boolean boolean17 = strSkipList14.contains("[ ] \n H \n");
        strSkipList14.remove("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = strSkipList14.get((int) (byte) 10);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test716");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy3 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int5 = bernoulliHeightStrategy3.nodeHeight((int) (short) 0);
        int int7 = bernoulliHeightStrategy3.height((int) 'a');
        int int9 = bernoulliHeightStrategy3.nodeHeight((int) (byte) 0);
        int int11 = bernoulliHeightStrategy3.nodeHeight(5);
        int int13 = bernoulliHeightStrategy3.nodeHeight((int) (byte) 1);
        int int15 = bernoulliHeightStrategy3.nodeHeight((int) 'a');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList16 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((-2), (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        int int18 = bernoulliHeightStrategy3.nodeHeight((int) (byte) 1);
        int int20 = bernoulliHeightStrategy3.height(10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList21 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) 'a', (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        int int23 = bernoulliHeightStrategy3.height(5);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList24 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) '4', (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        int int25 = strSkipList24.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str27 = strSkipList24.get((int) ' ');
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test717");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.height((-1));
        int int5 = bernoulliHeightStrategy1.nodeHeight((int) 'a');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList6 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(10, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        strSkipList6.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n H   0   1\n");
        boolean boolean10 = strSkipList6.contains("[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] [ ] \n H   0\n");
        java.lang.String str11 = strSkipList6.toString();
        strSkipList6.remove("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList6.remove("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = strSkipList6.get(3);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test718");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 0);
        int int10 = bernoulliHeightStrategy2.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList11 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int13 = bernoulliHeightStrategy2.height(100);
        int int15 = bernoulliHeightStrategy2.nodeHeight((int) '4');
        int int17 = bernoulliHeightStrategy2.nodeHeight(0);
        int int19 = bernoulliHeightStrategy2.height((int) '4');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList20 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int21 = strSkipList20.size();
        boolean boolean23 = strSkipList20.contains("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        strSkipList20.remove("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- [ ] \n[ ] --- --- [ ] \n[ ] [ ] --- [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str27 = strSkipList20.get((int) (byte) 0);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test719");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.height((-1));
        int int5 = bernoulliHeightStrategy1.nodeHeight((int) 'a');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList6 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(10, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        strSkipList6.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n H   0   1\n");
        boolean boolean10 = strSkipList6.contains("[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] [ ] \n H   0\n");
        strSkipList6.remove("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n H   0   1\n");
        java.lang.String str14 = strSkipList6.get((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strSkipList6.get(11);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test720");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        strSkipList0.add("hi!");
        strSkipList0.add("[ ] [ ] \n H   0\n");
        strSkipList0.remove("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList0.remove("[ ] --- \n[ ] --- \n[ ] --- \n[ ] [ ] \n H   0\n");
        java.lang.String str12 = strSkipList0.get((int) (short) 1);
        strSkipList0.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] [ ] \n H   0   1\n");
        int int15 = strSkipList0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = strSkipList0.get((int) (byte) 100);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test721");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        int int9 = bernoulliHeightStrategy1.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList10 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        strSkipList10.add("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        strSkipList10.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        boolean boolean16 = strSkipList10.contains("[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] [ ] \n H   0\n");
        strSkipList10.remove("[ ] --- \n[ ] --- \n[ ] --- \n[ ] [ ] \n H   0\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = strSkipList10.get((-3));
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test722");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        strSkipList0.add("hi!");
        java.lang.String str5 = strSkipList0.toString();
        java.lang.String str7 = strSkipList0.get(0);
        strSkipList0.add("hi!");
        java.lang.String str10 = strSkipList0.toString();
        java.lang.String str11 = strSkipList0.toString();
        java.lang.String str13 = strSkipList0.get((int) (short) 0);
        boolean boolean15 = strSkipList0.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = strSkipList0.get(4);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test723");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        java.lang.String str1 = strSkipList0.toString();
        strSkipList0.add("[ ] --- \n[ ] --- \n[ ] --- \n[ ] [ ] \n[ ] [ ] \n[ ] [ ] \n[ ] [ ] \n[ ] [ ] \n H   0\n");
        strSkipList0.remove("[ ] --- \n[ ] --- \n[ ] --- \n[ ] [ ] \n[ ] [ ] \n[ ] [ ] \n[ ] [ ] \n[ ] [ ] \n H   0\n");
        boolean boolean7 = strSkipList0.contains("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] [ ] --- --- \n[ ] [ ] --- [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        strSkipList0.remove("[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] [ ] \n H   0\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strSkipList0.get((int) (short) 1);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test724");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        strSkipList0.add("hi!");
        strSkipList0.remove("");
        java.lang.String str8 = strSkipList0.get((int) (short) 0);
        java.lang.String str9 = strSkipList0.toString();
        java.lang.String str10 = strSkipList0.toString();
        int int11 = strSkipList0.size();
        int int12 = strSkipList0.size();
        strSkipList0.remove("[ ] \n[ ] \n[ ] \n[ ] \n H \n");
        strSkipList0.remove("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] [ ] --- --- \n[ ] [ ] [ ] [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        strSkipList0.add("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- [ ] [ ] \n[ ] [ ] [ ] [ ] \n[ ] [ ] [ ] [ ] \n[ ] [ ] [ ] [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        strSkipList0.remove("[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        int int21 = strSkipList0.size();
        strSkipList0.remove("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- [ ] \n[ ] [ ] --- [ ] \n[ ] [ ] --- [ ] \n[ ] [ ] --- [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = strSkipList0.get(3);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test725");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        strSkipList0.add("hi!");
        int int5 = strSkipList0.size();
        int int6 = strSkipList0.size();
        boolean boolean8 = strSkipList0.contains("[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] [ ] \n[ ] [ ] \n H   0\n");
        java.lang.String str9 = strSkipList0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strSkipList0.get(11);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test726");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.height((-1));
        int int6 = bernoulliHeightStrategy2.nodeHeight((int) 'a');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList7 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(10, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int9 = bernoulliHeightStrategy2.nodeHeight((int) (short) -1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList10 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        boolean boolean12 = strSkipList10.contains("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        java.lang.String str13 = strSkipList10.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strSkipList10.get((-3));
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test727");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        java.lang.String str1 = strSkipList0.toString();
        boolean boolean3 = strSkipList0.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList0.remove("[ ] [ ] [ ] \n H   0   1\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = strSkipList0.get(9);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test728");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.height((-1));
        int int5 = bernoulliHeightStrategy1.nodeHeight((int) 'a');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList6 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(10, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        java.lang.String str7 = strSkipList6.toString();
        java.lang.String str8 = strSkipList6.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strSkipList6.get((int) '4');
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test729");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.height((int) '#');
        int int9 = bernoulliHeightStrategy1.nodeHeight((int) (short) 100);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList10 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(0, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        java.lang.String str11 = strSkipList10.toString();
        boolean boolean13 = strSkipList10.contains("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] [ ] [ ] [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        strSkipList10.add("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- [ ] \n[ ] --- --- [ ] \n[ ] --- --- [ ] \n[ ] --- --- [ ] \n[ ] --- [ ] [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = strSkipList10.get(9);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test730");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        strSkipList0.add("hi!");
        java.lang.String str5 = strSkipList0.toString();
        java.lang.String str7 = strSkipList0.get(0);
        strSkipList0.add("hi!");
        boolean boolean11 = strSkipList0.contains("");
        java.lang.String str12 = strSkipList0.toString();
        strSkipList0.add("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- [ ] [ ] \n[ ] --- [ ] [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        int int15 = strSkipList0.size();
        strSkipList0.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        int int18 = strSkipList0.size();
        java.lang.String str19 = strSkipList0.toString();
        strSkipList0.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = strSkipList0.get((-3));
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test731");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.height((-1));
        int int5 = bernoulliHeightStrategy1.nodeHeight((int) 'a');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList6 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(10, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        strSkipList6.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList6.remove("[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] [ ] [ ] [ ] --- \n[ ] [ ] [ ] [ ] --- \n[ ] [ ] [ ] [ ] [ ] \n H   0   1   2   3\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strSkipList6.get(3);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test732");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        strSkipList0.add("hi!");
        boolean boolean6 = strSkipList0.contains("");
        java.lang.String str7 = strSkipList0.toString();
        boolean boolean9 = strSkipList0.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] [ ] \n H   0   1\n");
        boolean boolean11 = strSkipList0.contains("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] --- [ ] [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        java.lang.String str12 = strSkipList0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strSkipList0.get((int) (short) 10);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test733");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.height((int) '#');
        int int9 = bernoulliHeightStrategy1.nodeHeight((int) ' ');
        int int11 = bernoulliHeightStrategy1.height((int) ' ');
        int int13 = bernoulliHeightStrategy1.nodeHeight(5);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList14 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) 0, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        strSkipList14.remove("[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList14.remove("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] [ ] [ ] --- \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        int int19 = strSkipList14.size();
        strSkipList14.add("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] [ ] --- --- \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = strSkipList14.get((int) '4');
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test734");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        java.lang.String str1 = strSkipList0.toString();
        java.lang.String str2 = strSkipList0.toString();
        int int3 = strSkipList0.size();
        strSkipList0.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        boolean boolean7 = strSkipList0.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        boolean boolean9 = strSkipList0.contains("");
        int int10 = strSkipList0.size();
        strSkipList0.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList0.add("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- [ ] --- \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        int int15 = strSkipList0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = strSkipList0.get(100);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test735");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        int int9 = bernoulliHeightStrategy1.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList10 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        strSkipList10.add("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        int int13 = strSkipList10.size();
        boolean boolean15 = strSkipList10.contains("[ ] --- \n[ ] --- \n[ ] [ ] \n[ ] [ ] \n H   0\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = strSkipList10.get(9);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test736");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy5 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int7 = bernoulliHeightStrategy5.nodeHeight((int) (short) 0);
        int int9 = bernoulliHeightStrategy5.height((int) 'a');
        int int11 = bernoulliHeightStrategy5.nodeHeight((int) (byte) 10);
        int int13 = bernoulliHeightStrategy5.nodeHeight(10);
        int int15 = bernoulliHeightStrategy5.height(4);
        int int17 = bernoulliHeightStrategy5.nodeHeight(1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList18 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) -1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy5);
        int int20 = bernoulliHeightStrategy5.nodeHeight((int) (byte) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList21 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(6, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy5);
        int int23 = bernoulliHeightStrategy5.height(0);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList24 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(10, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy5);
        int int26 = bernoulliHeightStrategy5.height(9);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList27 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(11, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy5);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList28 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) 1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str30 = strSkipList28.get((int) (byte) 1);
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test737");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        int int9 = bernoulliHeightStrategy1.nodeHeight(5);
        int int11 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList12 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) -1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        strSkipList12.remove("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strSkipList12.get((int) (short) 100);
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test738");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.nodeHeight(5);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList9 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) -1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int11 = bernoulliHeightStrategy2.height((int) (byte) 100);
        int int13 = bernoulliHeightStrategy2.nodeHeight((-2));
        int int15 = bernoulliHeightStrategy2.height((int) (byte) 0);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList16 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) 1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        java.lang.String str18 = strSkipList16.get((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = strSkipList16.get(1);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test739");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy3 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int5 = bernoulliHeightStrategy3.nodeHeight((int) (short) 0);
        int int7 = bernoulliHeightStrategy3.height((int) 'a');
        int int9 = bernoulliHeightStrategy3.height((int) '#');
        int int11 = bernoulliHeightStrategy3.nodeHeight((int) (short) 100);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList12 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(0, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList13 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) '#', (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        int int15 = bernoulliHeightStrategy3.nodeHeight(6);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList16 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        java.lang.String str17 = strSkipList16.toString();
        strSkipList16.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = strSkipList16.get(4);
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test740");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        java.lang.String str1 = strSkipList0.toString();
        java.lang.String str2 = strSkipList0.toString();
        int int3 = strSkipList0.size();
        strSkipList0.add("hi!");
        java.lang.String str6 = strSkipList0.toString();
        strSkipList0.add("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- [ ] [ ] \n[ ] --- [ ] [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        java.lang.String str9 = strSkipList0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strSkipList0.get(8);
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test741");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 10);
        int int10 = bernoulliHeightStrategy2.nodeHeight(10);
        int int12 = bernoulliHeightStrategy2.height(4);
        int int14 = bernoulliHeightStrategy2.nodeHeight(1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList15 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) -1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int17 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList18 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) -1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int19 = strSkipList18.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = strSkipList18.get(5);
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test742");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.height((int) '#');
        int int9 = bernoulliHeightStrategy1.nodeHeight((int) '4');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList10 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        strSkipList10.remove("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- [ ] [ ] \n[ ] [ ] [ ] [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strSkipList10.get((int) (short) 1);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test743");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        int int9 = bernoulliHeightStrategy1.nodeHeight(5);
        int int11 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 1);
        int int13 = bernoulliHeightStrategy1.height((int) (byte) 0);
        int int15 = bernoulliHeightStrategy1.height(1);
        int int17 = bernoulliHeightStrategy1.nodeHeight((int) (short) 10);
        int int19 = bernoulliHeightStrategy1.nodeHeight(9);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList20 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        java.lang.String str21 = strSkipList20.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = strSkipList20.get(4);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test744");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy4 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int6 = bernoulliHeightStrategy4.nodeHeight((int) (short) 0);
        int int8 = bernoulliHeightStrategy4.height((int) 'a');
        int int10 = bernoulliHeightStrategy4.height((int) '#');
        int int12 = bernoulliHeightStrategy4.height((int) (byte) 1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList13 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) -1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy4);
        int int15 = bernoulliHeightStrategy4.nodeHeight((int) ' ');
        int int17 = bernoulliHeightStrategy4.nodeHeight(10);
        int int19 = bernoulliHeightStrategy4.nodeHeight((int) (short) 100);
        int int21 = bernoulliHeightStrategy4.nodeHeight((-1));
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList22 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) ' ', (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy4);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList23 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy4);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList24 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(6, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy4);
        java.lang.String str25 = strSkipList24.toString();
        strSkipList24.remove("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] [ ] [ ] [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str29 = strSkipList24.get(10);
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test745");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy3 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int5 = bernoulliHeightStrategy3.nodeHeight((int) (short) 0);
        int int7 = bernoulliHeightStrategy3.height((int) 'a');
        int int9 = bernoulliHeightStrategy3.nodeHeight((int) (byte) 0);
        int int11 = bernoulliHeightStrategy3.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList12 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        int int14 = bernoulliHeightStrategy3.height(100);
        int int16 = bernoulliHeightStrategy3.nodeHeight(100);
        int int18 = bernoulliHeightStrategy3.nodeHeight((int) '4');
        int int20 = bernoulliHeightStrategy3.height(100);
        int int22 = bernoulliHeightStrategy3.nodeHeight(7);
        int int24 = bernoulliHeightStrategy3.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList25 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) '4', (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList26 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(2, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str28 = strSkipList26.get((int) '#');
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test746");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.remove("");
        int int3 = strSkipList0.size();
        int int4 = strSkipList0.size();
        int int5 = strSkipList0.size();
        strSkipList0.add("[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n H \n");
        boolean boolean9 = strSkipList0.contains("[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] [ ] \n[ ] [ ] \n[ ] [ ] \n[ ] [ ] \n H   0\n");
        boolean boolean11 = strSkipList0.contains("[ ] --- --- --- \n[ ] --- --- [ ] \n[ ] --- --- [ ] \n[ ] --- --- [ ] \n[ ] --- --- [ ] \n[ ] [ ] --- [ ] \n[ ] [ ] [ ] [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        boolean boolean13 = strSkipList0.contains("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strSkipList0.get((int) '#');
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test747");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight(5);
        int int9 = bernoulliHeightStrategy1.height(100);
        int int11 = bernoulliHeightStrategy1.height((-1));
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList12 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((-1), (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        java.lang.String str13 = strSkipList12.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strSkipList12.get(10);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test748");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.height((int) '#');
        int int9 = bernoulliHeightStrategy1.nodeHeight((int) 'a');
        int int11 = bernoulliHeightStrategy1.height(0);
        int int13 = bernoulliHeightStrategy1.height(7);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList14 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        java.lang.String str15 = strSkipList14.toString();
        java.lang.String str17 = strSkipList14.get((-1));
        int int18 = strSkipList14.size();
        strSkipList14.add("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = strSkipList14.get((int) 'a');
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test749");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        strSkipList0.add("hi!");
        java.lang.String str5 = strSkipList0.toString();
        strSkipList0.remove("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        int int8 = strSkipList0.size();
        java.lang.String str10 = strSkipList0.get((-1));
        strSkipList0.add("[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n H \n");
        strSkipList0.remove("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] [ ] --- --- \n[ ] [ ] [ ] [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        strSkipList0.remove("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] [ ] --- --- \n[ ] [ ] [ ] --- \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = strSkipList0.get(8);
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test750");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        int int9 = bernoulliHeightStrategy1.nodeHeight(5);
        int int11 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 1);
        int int13 = bernoulliHeightStrategy1.nodeHeight(2);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList14 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        boolean boolean16 = strSkipList14.contains("[ ] --- \n[ ] --- \n[ ] [ ] \n[ ] [ ] \n H   0\n");
        boolean boolean18 = strSkipList14.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList14.remove("[ ] --- \n[ ] --- \n[ ] [ ] \n H   0\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = strSkipList14.get(9);
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test751");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.height(100);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList5 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(0, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList6 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) ' ', (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        boolean boolean8 = strSkipList6.contains("[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] --- [ ] --- --- \n[ ] --- [ ] --- --- \n[ ] [ ] [ ] [ ] [ ] \n[ ] [ ] [ ] [ ] [ ] \n H   0   1   2   3\n");
        strSkipList6.add("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strSkipList6.get((int) (short) 10);
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test752");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 0);
        int int10 = bernoulliHeightStrategy2.nodeHeight(5);
        int int12 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 1);
        int int14 = bernoulliHeightStrategy2.nodeHeight((int) 'a');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList15 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) '4', (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList16 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(0, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        strSkipList16.remove("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = strSkipList16.get(4);
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test753");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.height((int) '#');
        int int9 = bernoulliHeightStrategy1.height((int) (byte) 1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList10 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) -1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        strSkipList10.remove("hi!");
        int int13 = strSkipList10.size();
        boolean boolean15 = strSkipList10.contains("[ ] \n[ ] \n[ ] \n[ ] \n H \n");
        boolean boolean17 = strSkipList10.contains("[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] [ ] \n[ ] [ ] \n H   0\n");
        strSkipList10.remove("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        boolean boolean21 = strSkipList10.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        int int22 = strSkipList10.size();
        strSkipList10.remove("[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] [ ] \n H   0\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = strSkipList10.get((int) (byte) 100);
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test754");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        strSkipList0.add("hi!");
        strSkipList0.remove("");
        java.lang.String str8 = strSkipList0.get((int) (short) 0);
        int int9 = strSkipList0.size();
        java.lang.String str10 = strSkipList0.toString();
        strSkipList0.remove("[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] [ ] \n H   0\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strSkipList0.get((int) (byte) 100);
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test755");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.remove("");
        strSkipList0.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList0.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList0.remove("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- [ ] [ ] \n[ ] [ ] [ ] [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strSkipList0.get(5);
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test756");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        boolean boolean2 = strSkipList0.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        boolean boolean4 = strSkipList0.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n H   0   1\n");
        int int5 = strSkipList0.size();
        boolean boolean7 = strSkipList0.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        int int8 = strSkipList0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strSkipList0.get((-4));
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test757");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.height((-1));
        int int6 = bernoulliHeightStrategy2.nodeHeight((int) 'a');
        int int8 = bernoulliHeightStrategy2.height(2);
        int int10 = bernoulliHeightStrategy2.height((int) 'a');
        int int12 = bernoulliHeightStrategy2.nodeHeight((int) 'a');
        int int14 = bernoulliHeightStrategy2.height((int) (short) 100);
        int int16 = bernoulliHeightStrategy2.nodeHeight((-1));
        int int18 = bernoulliHeightStrategy2.nodeHeight((int) (short) 10);
        int int20 = bernoulliHeightStrategy2.nodeHeight(0);
        int int22 = bernoulliHeightStrategy2.nodeHeight((int) (short) 1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList23 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 0, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList24 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(6, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = strSkipList24.get((-2));
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test758");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.height((int) '#');
        int int10 = bernoulliHeightStrategy2.height((int) (byte) 1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList11 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) -1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int13 = bernoulliHeightStrategy2.nodeHeight((int) ' ');
        int int15 = bernoulliHeightStrategy2.nodeHeight(10);
        int int17 = bernoulliHeightStrategy2.nodeHeight((int) (short) 100);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList18 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(0, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        boolean boolean20 = strSkipList18.contains("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] [ ] [ ] --- \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = strSkipList18.get(8);
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test759");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        int int9 = bernoulliHeightStrategy1.nodeHeight((int) (short) 10);
        int int11 = bernoulliHeightStrategy1.nodeHeight((int) (short) 1);
        int int13 = bernoulliHeightStrategy1.height((int) (byte) -1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList14 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(10, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        int int15 = strSkipList14.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = strSkipList14.get((-3));
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test760");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy3 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int5 = bernoulliHeightStrategy3.nodeHeight((int) (short) 0);
        int int7 = bernoulliHeightStrategy3.height((int) 'a');
        int int9 = bernoulliHeightStrategy3.nodeHeight(5);
        int int11 = bernoulliHeightStrategy3.height(100);
        int int13 = bernoulliHeightStrategy3.height((int) (byte) 0);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList14 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(0, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        int int16 = bernoulliHeightStrategy3.height((int) '#');
        int int18 = bernoulliHeightStrategy3.height(1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList19 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(10, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        int int21 = bernoulliHeightStrategy3.height(9);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList22 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) ' ', (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        strSkipList22.remove("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] [ ] --- --- \n[ ] [ ] --- --- \n[ ] [ ] --- --- \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        strSkipList22.remove("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str28 = strSkipList22.get(100);
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test761");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        strSkipList0.add("hi!");
        int int5 = strSkipList0.size();
        strSkipList0.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n H   0   1\n");
        int int8 = strSkipList0.size();
        java.lang.String str10 = strSkipList0.get(2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strSkipList0.get(10);
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test762");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        int int9 = bernoulliHeightStrategy1.nodeHeight((int) (short) 10);
        int int11 = bernoulliHeightStrategy1.nodeHeight((int) (short) 1);
        int int13 = bernoulliHeightStrategy1.height((int) (byte) -1);
        int int15 = bernoulliHeightStrategy1.nodeHeight(2);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList16 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) 10, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = strSkipList16.get(4);
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test763");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList8 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 10, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        boolean boolean10 = strSkipList8.contains("[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] [ ] [ ] [ ] --- \n[ ] [ ] [ ] [ ] --- \n[ ] [ ] [ ] [ ] [ ] \n H   0   1   2   3\n");
        int int11 = strSkipList8.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strSkipList8.get((int) (byte) 1);
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test764");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        int int9 = bernoulliHeightStrategy1.nodeHeight(5);
        int int11 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 1);
        int int13 = bernoulliHeightStrategy1.nodeHeight(2);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList14 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        int int15 = strSkipList14.size();
        int int16 = strSkipList14.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = strSkipList14.get(10);
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test765");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 0);
        int int10 = bernoulliHeightStrategy2.nodeHeight(5);
        int int12 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 1);
        int int14 = bernoulliHeightStrategy2.nodeHeight((int) 'a');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList15 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((-2), (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int17 = bernoulliHeightStrategy2.height((int) ' ');
        int int19 = bernoulliHeightStrategy2.nodeHeight((int) ' ');
        int int21 = bernoulliHeightStrategy2.height((int) (short) -1);
        int int23 = bernoulliHeightStrategy2.nodeHeight(3);
        int int25 = bernoulliHeightStrategy2.nodeHeight(1);
        int int27 = bernoulliHeightStrategy2.height(0);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList28 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(6, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str30 = strSkipList28.get((int) (byte) 10);
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test766");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        int int3 = strSkipList0.size();
        int int4 = strSkipList0.size();
        strSkipList0.remove("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n H   0   1\n");
        int int7 = strSkipList0.size();
        int int8 = strSkipList0.size();
        strSkipList0.add("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strSkipList0.get(11);
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test767");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 0);
        int int10 = bernoulliHeightStrategy2.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList11 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int13 = bernoulliHeightStrategy2.height(100);
        int int15 = bernoulliHeightStrategy2.nodeHeight((int) '4');
        int int17 = bernoulliHeightStrategy2.nodeHeight(0);
        int int19 = bernoulliHeightStrategy2.height((int) '4');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList20 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int21 = strSkipList20.size();
        boolean boolean23 = strSkipList20.contains("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        strSkipList20.remove("[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] --- [ ] --- [ ] \n[ ] [ ] [ ] [ ] [ ] \n H   0   1   2   3\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str27 = strSkipList20.get((int) (byte) 100);
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test768");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.height((int) '#');
        int int9 = bernoulliHeightStrategy1.height((int) (short) 1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList10 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(15, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strSkipList10.get((int) '4');
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test769");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.remove("");
        int int3 = strSkipList0.size();
        int int4 = strSkipList0.size();
        int int5 = strSkipList0.size();
        int int6 = strSkipList0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = strSkipList0.get(5);
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test770");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        int int9 = bernoulliHeightStrategy1.nodeHeight(5);
        int int11 = bernoulliHeightStrategy1.height(2);
        int int13 = bernoulliHeightStrategy1.nodeHeight((int) '#');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList14 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) '4', (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strSkipList14.get(7);
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test771");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        int int9 = bernoulliHeightStrategy1.nodeHeight(5);
        int int11 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 1);
        int int13 = bernoulliHeightStrategy1.nodeHeight((int) '#');
        int int15 = bernoulliHeightStrategy1.height((int) 'a');
        int int17 = bernoulliHeightStrategy1.nodeHeight(4);
        int int19 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 100);
        int int21 = bernoulliHeightStrategy1.height(6);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList22 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(10, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = strSkipList22.get(10);
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test772");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.height(100);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList4 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((-1), (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        int int5 = strSkipList4.size();
        boolean boolean7 = strSkipList4.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strSkipList4.get(1);
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test773");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        strSkipList0.add("hi!");
        boolean boolean6 = strSkipList0.contains("");
        java.lang.String str7 = strSkipList0.toString();
        strSkipList0.add("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] [ ] [ ] [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strSkipList0.get(5);
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test774");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.height(100);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList5 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(0, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList6 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(5, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = strSkipList6.get((int) (short) 1);
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test775");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        strSkipList0.add("hi!");
        boolean boolean6 = strSkipList0.contains("");
        java.lang.String str7 = strSkipList0.toString();
        strSkipList0.add("hi!");
        java.lang.String str10 = strSkipList0.toString();
        java.lang.String str11 = strSkipList0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strSkipList0.get(8);
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test776");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        int int9 = bernoulliHeightStrategy1.nodeHeight(5);
        int int11 = bernoulliHeightStrategy1.height(100);
        int int13 = bernoulliHeightStrategy1.height(5);
        int int15 = bernoulliHeightStrategy1.height((int) (byte) 0);
        int int17 = bernoulliHeightStrategy1.height((-2));
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList18 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        java.lang.String str19 = strSkipList18.toString();
        java.lang.String str20 = strSkipList18.toString();
        int int21 = strSkipList18.size();
        int int22 = strSkipList18.size();
        strSkipList18.add("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] [ ] --- --- \n[ ] [ ] --- [ ] \n[ ] [ ] --- [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = strSkipList18.get(8);
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test777");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        int int3 = strSkipList0.size();
        int int4 = strSkipList0.size();
        boolean boolean6 = strSkipList0.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = strSkipList0.get((int) ' ');
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test778");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        strSkipList0.add("hi!");
        java.lang.String str5 = strSkipList0.toString();
        java.lang.String str7 = strSkipList0.get(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strSkipList0.get((int) (short) 100);
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test779");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy4 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int6 = bernoulliHeightStrategy4.nodeHeight((int) (short) 0);
        int int8 = bernoulliHeightStrategy4.height((int) 'a');
        int int10 = bernoulliHeightStrategy4.height((int) '#');
        int int12 = bernoulliHeightStrategy4.height((int) (byte) 1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList13 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) -1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy4);
        int int15 = bernoulliHeightStrategy4.nodeHeight((int) ' ');
        int int17 = bernoulliHeightStrategy4.nodeHeight(10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList18 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) 10, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy4);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList19 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((-2), (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy4);
        int int21 = bernoulliHeightStrategy4.height(4);
        int int23 = bernoulliHeightStrategy4.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList24 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((-2), (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy4);
        strSkipList24.add("[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] [ ] \n[ ] [ ] \n H   0\n");
        boolean boolean28 = strSkipList24.contains("[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        java.lang.String str29 = strSkipList24.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str31 = strSkipList24.get((int) (byte) 1);
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test780");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy3 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int5 = bernoulliHeightStrategy3.nodeHeight((int) (short) 0);
        int int7 = bernoulliHeightStrategy3.nodeHeight(4);
        int int9 = bernoulliHeightStrategy3.nodeHeight((int) (byte) -1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList10 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) 'a', (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        int int12 = bernoulliHeightStrategy3.height((int) (byte) -1);
        int int14 = bernoulliHeightStrategy3.nodeHeight((int) (byte) -1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList15 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(4, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        int int17 = bernoulliHeightStrategy3.nodeHeight((int) (byte) 1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList18 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) 10, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = strSkipList18.get((int) '#');
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test781");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 0);
        int int10 = bernoulliHeightStrategy2.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList11 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int13 = bernoulliHeightStrategy2.nodeHeight(5);
        int int15 = bernoulliHeightStrategy2.nodeHeight((int) '#');
        int int17 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 10);
        int int19 = bernoulliHeightStrategy2.nodeHeight(100);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList20 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((-3), (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = strSkipList20.get(5);
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test782");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        int int9 = bernoulliHeightStrategy1.nodeHeight(5);
        int int11 = bernoulliHeightStrategy1.height(100);
        int int13 = bernoulliHeightStrategy1.height(5);
        int int15 = bernoulliHeightStrategy1.height((int) (byte) 0);
        int int17 = bernoulliHeightStrategy1.height((-2));
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList18 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        int int19 = strSkipList18.size();
        java.lang.String str21 = strSkipList18.get((int) (byte) -1);
        boolean boolean23 = strSkipList18.contains("[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n H \n");
        strSkipList18.remove("[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] [ ] --- --- --- \n[ ] [ ] --- --- --- \n[ ] [ ] --- --- --- \n[ ] [ ] --- --- --- \n[ ] [ ] --- --- --- \n[ ] [ ] [ ] [ ] [ ] \n H   0   1   2   3\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str27 = strSkipList18.get(4);
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test783");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 0);
        int int10 = bernoulliHeightStrategy2.nodeHeight((int) (short) 10);
        int int12 = bernoulliHeightStrategy2.nodeHeight((int) (short) 1);
        int int14 = bernoulliHeightStrategy2.height((-1));
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList15 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(7, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList16 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(10, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int17 = strSkipList16.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = strSkipList16.get(8);
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test784");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.height((int) (byte) -1);
        int int5 = bernoulliHeightStrategy1.nodeHeight((int) (short) 100);
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        int int9 = bernoulliHeightStrategy1.height(5);
        int int11 = bernoulliHeightStrategy1.nodeHeight(10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList12 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(3, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strSkipList12.get(10);
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test785");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 0);
        int int10 = bernoulliHeightStrategy2.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList11 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int13 = bernoulliHeightStrategy2.height(100);
        int int15 = bernoulliHeightStrategy2.nodeHeight(100);
        int int17 = bernoulliHeightStrategy2.nodeHeight((int) '4');
        int int19 = bernoulliHeightStrategy2.height(100);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList20 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((-1), (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        boolean boolean22 = strSkipList20.contains("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] [ ] [ ] [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        boolean boolean24 = strSkipList20.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        int int25 = strSkipList20.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str27 = strSkipList20.get((int) (short) 0);
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test786");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        strSkipList0.add("hi!");
        int int5 = strSkipList0.size();
        boolean boolean7 = strSkipList0.contains("[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] [ ] \n H   0\n");
        strSkipList0.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        int int10 = strSkipList0.size();
        strSkipList0.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList0.remove("[ ] [ ] \n H   0\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strSkipList0.get(10);
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test787");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        java.lang.String str1 = strSkipList0.toString();
        java.lang.String str2 = strSkipList0.toString();
        int int3 = strSkipList0.size();
        strSkipList0.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        boolean boolean7 = strSkipList0.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        boolean boolean9 = strSkipList0.contains("");
        int int10 = strSkipList0.size();
        strSkipList0.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] [ ] \n H   0   1\n");
        boolean boolean14 = strSkipList0.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strSkipList0.get(3);
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test788");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        strSkipList0.add("hi!");
        strSkipList0.remove("");
        java.lang.String str8 = strSkipList0.get((int) (short) 0);
        int int9 = strSkipList0.size();
        java.lang.String str10 = strSkipList0.toString();
        boolean boolean12 = strSkipList0.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        boolean boolean14 = strSkipList0.contains("");
        boolean boolean16 = strSkipList0.contains("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] [ ] --- --- \n[ ] [ ] --- [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        boolean boolean18 = strSkipList0.contains("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] [ ] --- --- \n[ ] [ ] --- [ ] \n[ ] [ ] --- [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = strSkipList0.get(10);
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test789");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.height((-1));
        int int5 = bernoulliHeightStrategy1.nodeHeight((int) 'a');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList6 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(10, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        strSkipList6.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n H   0   1\n");
        java.lang.String str9 = strSkipList6.toString();
        strSkipList6.remove("");
        boolean boolean13 = strSkipList6.contains("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] [ ] [ ] --- \n[ ] [ ] [ ] --- \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strSkipList6.get((int) (short) 100);
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test790");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        int int9 = bernoulliHeightStrategy1.nodeHeight((int) (short) 10);
        int int11 = bernoulliHeightStrategy1.nodeHeight((int) (short) 1);
        int int13 = bernoulliHeightStrategy1.height((int) (byte) -1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList14 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(10, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        strSkipList14.remove("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList14.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = strSkipList14.get((int) (byte) 100);
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test791");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((-1));
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList4 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = strSkipList4.get(11);
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test792");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        java.lang.String str1 = strSkipList0.toString();
        boolean boolean3 = strSkipList0.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        int int4 = strSkipList0.size();
        boolean boolean6 = strSkipList0.contains("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- [ ] [ ] \n[ ] --- [ ] [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        int int7 = strSkipList0.size();
        java.lang.String str8 = strSkipList0.toString();
        boolean boolean10 = strSkipList0.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList0.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n H   0   1\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strSkipList0.get((int) (byte) 1);
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test793");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        int int3 = strSkipList0.size();
        strSkipList0.remove("");
        java.lang.String str6 = strSkipList0.toString();
        int int7 = strSkipList0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strSkipList0.get(4);
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test794");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 0);
        int int10 = bernoulliHeightStrategy2.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList11 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList12 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) -1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        strSkipList12.add("[ ] --- \n[ ] --- \n[ ] --- \n[ ] [ ] \n H   0\n");
        boolean boolean16 = strSkipList12.contains("[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] [ ] \n[ ] [ ] \n H   0\n");
        java.lang.String str17 = strSkipList12.toString();
        int int18 = strSkipList12.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = strSkipList12.get(6);
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test795");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.height((-1));
        int int5 = bernoulliHeightStrategy1.nodeHeight((int) 'a');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList6 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(10, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        strSkipList6.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n H   0   1\n");
        int int9 = strSkipList6.size();
        java.lang.String str10 = strSkipList6.toString();
        java.lang.String str11 = strSkipList6.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strSkipList6.get(9);
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test796");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        strSkipList0.add("hi!");
        int int5 = strSkipList0.size();
        boolean boolean7 = strSkipList0.contains("[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] [ ] \n H   0\n");
        boolean boolean9 = strSkipList0.contains("[ ] --- \n[ ] --- \n[ ] [ ] \n[ ] [ ] \n H   0\n");
        java.lang.String str11 = strSkipList0.get((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strSkipList0.get((int) (byte) 10);
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test797");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 0);
        int int10 = bernoulliHeightStrategy2.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList11 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int13 = bernoulliHeightStrategy2.height((int) ' ');
        int int15 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 10);
        int int17 = bernoulliHeightStrategy2.height(5);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList18 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(10, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = strSkipList18.get(3);
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test798");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.height((-1));
        int int5 = bernoulliHeightStrategy1.nodeHeight((int) 'a');
        int int7 = bernoulliHeightStrategy1.height(2);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList8 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) ' ', (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        strSkipList8.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n H   0   1\n");
        int int11 = strSkipList8.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strSkipList8.get((-3));
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test799");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        strSkipList0.add("hi!");
        java.lang.String str5 = strSkipList0.toString();
        java.lang.String str7 = strSkipList0.get(0);
        strSkipList0.remove("[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n H \n");
        int int10 = strSkipList0.size();
        strSkipList0.remove("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        boolean boolean14 = strSkipList0.contains("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] [ ] [ ] --- \n[ ] [ ] [ ] --- \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strSkipList0.get((int) 'a');
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test800");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        strSkipList0.add("hi!");
        strSkipList0.remove("");
        java.lang.String str8 = strSkipList0.get((int) (short) 0);
        boolean boolean10 = strSkipList0.contains("[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n H \n");
        strSkipList0.remove("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- [ ] \n[ ] --- --- [ ] \n[ ] --- [ ] [ ] \n[ ] --- [ ] [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strSkipList0.get((int) '4');
    }

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test801");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy3 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int5 = bernoulliHeightStrategy3.nodeHeight((int) (short) 0);
        int int7 = bernoulliHeightStrategy3.height((int) 'a');
        int int9 = bernoulliHeightStrategy3.nodeHeight((int) (byte) 0);
        int int11 = bernoulliHeightStrategy3.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList12 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        int int14 = bernoulliHeightStrategy3.nodeHeight(5);
        int int16 = bernoulliHeightStrategy3.nodeHeight((int) '#');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList17 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((-1), (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        int int19 = bernoulliHeightStrategy3.nodeHeight((int) '#');
        int int21 = bernoulliHeightStrategy3.height(15);
        int int23 = bernoulliHeightStrategy3.height((int) '4');
        int int25 = bernoulliHeightStrategy3.nodeHeight((int) (byte) 0);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList26 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) -1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str28 = strSkipList26.get(5);
    }

    @Test
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test802");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        int int3 = strSkipList0.size();
        int int4 = strSkipList0.size();
        java.lang.String str6 = strSkipList0.get((int) (short) 0);
        java.lang.String str7 = strSkipList0.toString();
        boolean boolean9 = strSkipList0.contains("");
        strSkipList0.remove("[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList0.remove("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strSkipList0.get(10);
    }

    @Test
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test803");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        int int9 = bernoulliHeightStrategy1.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList10 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        strSkipList10.add("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        int int13 = strSkipList10.size();
        boolean boolean15 = strSkipList10.contains("[ ] --- \n[ ] --- \n[ ] [ ] \n[ ] [ ] \n H   0\n");
        strSkipList10.add("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- [ ] \n[ ] --- --- [ ] \n[ ] [ ] --- [ ] \n[ ] [ ] --- [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        strSkipList10.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        boolean boolean21 = strSkipList10.contains("[ ] \n H \n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = strSkipList10.get(3);
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test804");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        int int9 = bernoulliHeightStrategy1.nodeHeight(5);
        int int11 = bernoulliHeightStrategy1.nodeHeight(2);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList12 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(9, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        java.lang.String str13 = strSkipList12.toString();
        java.lang.String str15 = strSkipList12.get((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = strSkipList12.get(0);
    }

    @Test
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test805");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 0);
        int int10 = bernoulliHeightStrategy2.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList11 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int13 = bernoulliHeightStrategy2.height(100);
        int int15 = bernoulliHeightStrategy2.nodeHeight(100);
        int int17 = bernoulliHeightStrategy2.nodeHeight(7);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList18 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) 10, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = strSkipList18.get(9);
    }

    @Test
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test806");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.height((int) '#');
        int int9 = bernoulliHeightStrategy1.height((int) (byte) 1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList10 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) -1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        strSkipList10.remove("hi!");
        int int13 = strSkipList10.size();
        boolean boolean15 = strSkipList10.contains("[ ] \n[ ] \n[ ] \n[ ] \n H \n");
        boolean boolean17 = strSkipList10.contains("[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] [ ] \n[ ] [ ] \n H   0\n");
        strSkipList10.remove("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        boolean boolean21 = strSkipList10.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = strSkipList10.get(9);
    }

    @Test
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test807");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        strSkipList0.add("hi!");
        strSkipList0.remove("");
        java.lang.String str8 = strSkipList0.get((int) (short) 0);
        boolean boolean10 = strSkipList0.contains("[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n H \n");
        java.lang.String str11 = strSkipList0.toString();
        java.lang.String str12 = strSkipList0.toString();
        strSkipList0.remove("[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] [ ] \n[ ] [ ] \n[ ] [ ] \n H   0\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strSkipList0.get((int) '#');
    }

    @Test
    public void test808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test808");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        strSkipList0.add("hi!");
        boolean boolean6 = strSkipList0.contains("");
        java.lang.String str8 = strSkipList0.get((int) (byte) 1);
        int int9 = strSkipList0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strSkipList0.get(10);
    }

    @Test
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test809");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.height(100);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList5 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList6 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        boolean boolean8 = strSkipList6.contains("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] [ ] --- --- \n[ ] [ ] --- --- \n[ ] [ ] --- [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strSkipList6.get((-3));
    }

    @Test
    public void test810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test810");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        int int9 = bernoulliHeightStrategy1.nodeHeight(5);
        int int11 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 1);
        int int13 = bernoulliHeightStrategy1.height((int) (byte) 0);
        int int15 = bernoulliHeightStrategy1.height(1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList16 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(0, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        boolean boolean18 = strSkipList16.contains("[ ] --- \n[ ] --- \n[ ] [ ] \n[ ] [ ] \n H   0\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = strSkipList16.get((int) '4');
    }

    @Test
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test811");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.height((int) '#');
        int int10 = bernoulliHeightStrategy2.nodeHeight((int) (short) 100);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList11 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(0, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int13 = bernoulliHeightStrategy2.nodeHeight(6);
        int int15 = bernoulliHeightStrategy2.height((int) '#');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList16 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((-2), (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = strSkipList16.get((int) (byte) 1);
    }

    @Test
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test812");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        strSkipList0.add("hi!");
        int int5 = strSkipList0.size();
        strSkipList0.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n H   0   1\n");
        int int8 = strSkipList0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strSkipList0.get((int) (short) 10);
    }

    @Test
    public void test813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test813");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        int int9 = bernoulliHeightStrategy1.nodeHeight(5);
        int int11 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int13 = bernoulliHeightStrategy1.nodeHeight((-1));
        int int15 = bernoulliHeightStrategy1.height((int) '4');
        int int17 = bernoulliHeightStrategy1.nodeHeight((int) 'a');
        int int19 = bernoulliHeightStrategy1.nodeHeight(7);
        int int21 = bernoulliHeightStrategy1.height((int) (short) 1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList22 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = strSkipList22.get((-3));
    }

    @Test
    public void test814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test814");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.height((-1));
        int int6 = bernoulliHeightStrategy2.nodeHeight((int) 'a');
        int int8 = bernoulliHeightStrategy2.height(2);
        int int10 = bernoulliHeightStrategy2.height((int) 'a');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList11 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(7, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int13 = bernoulliHeightStrategy2.nodeHeight(4);
        int int15 = bernoulliHeightStrategy2.nodeHeight((int) (byte) -1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList16 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(0, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        strSkipList16.remove("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- [ ] --- \n[ ] --- [ ] [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = strSkipList16.get(3);
    }

    @Test
    public void test815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test815");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.nodeHeight(5);
        int int10 = bernoulliHeightStrategy2.height(100);
        int int12 = bernoulliHeightStrategy2.height((int) (byte) 0);
        int int14 = bernoulliHeightStrategy2.height((-2));
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList15 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(6, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int17 = bernoulliHeightStrategy2.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList18 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = strSkipList18.get((int) (short) 10);
    }

    @Test
    public void test816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test816");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy3 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int5 = bernoulliHeightStrategy3.nodeHeight((int) (short) 0);
        int int7 = bernoulliHeightStrategy3.height((int) 'a');
        int int9 = bernoulliHeightStrategy3.nodeHeight((int) (byte) 0);
        int int11 = bernoulliHeightStrategy3.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList12 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList13 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(7, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        int int15 = bernoulliHeightStrategy3.nodeHeight((int) (byte) 1);
        int int17 = bernoulliHeightStrategy3.height(0);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList18 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) '#', (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        java.lang.String str19 = strSkipList18.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = strSkipList18.get((-4));
    }

    @Test
    public void test817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test817");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        strSkipList0.add("hi!");
        java.lang.String str5 = strSkipList0.toString();
        java.lang.String str7 = strSkipList0.get(0);
        strSkipList0.add("hi!");
        boolean boolean11 = strSkipList0.contains("");
        strSkipList0.add("[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        int int14 = strSkipList0.size();
        int int15 = strSkipList0.size();
        boolean boolean17 = strSkipList0.contains("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] [ ] --- --- \n[ ] [ ] --- --- \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        boolean boolean19 = strSkipList0.contains("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] [ ] [ ] --- \n[ ] [ ] [ ] --- \n[ ] [ ] [ ] --- \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = strSkipList0.get((-4));
    }

    @Test
    public void test818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test818");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 10);
        int int10 = bernoulliHeightStrategy2.nodeHeight(10);
        int int12 = bernoulliHeightStrategy2.height(4);
        int int14 = bernoulliHeightStrategy2.nodeHeight(1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList15 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) -1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int17 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList18 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        strSkipList18.add("[ ] \n[ ] \n[ ] \n H \n");
        int int21 = strSkipList18.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = strSkipList18.get(7);
    }

    @Test
    public void test819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test819");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.height((int) '#');
        int int9 = bernoulliHeightStrategy1.height((int) (byte) 1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList10 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) -1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strSkipList10.get((int) (short) 100);
    }

    @Test
    public void test820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test820");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 10);
        int int10 = bernoulliHeightStrategy2.nodeHeight(10);
        int int12 = bernoulliHeightStrategy2.height(4);
        int int14 = bernoulliHeightStrategy2.nodeHeight(1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList15 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) -1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int17 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList18 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        strSkipList18.add("[ ] \n[ ] \n[ ] \n H \n");
        strSkipList18.add("[ ] [ ] \n H   0\n");
        int int23 = strSkipList18.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = strSkipList18.get(7);
    }

    @Test
    public void test821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test821");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        int int3 = strSkipList0.size();
        int int4 = strSkipList0.size();
        strSkipList0.remove("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n H   0   1\n");
        int int7 = strSkipList0.size();
        int int8 = strSkipList0.size();
        int int9 = strSkipList0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strSkipList0.get(3);
    }

    @Test
    public void test822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test822");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy3 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int5 = bernoulliHeightStrategy3.nodeHeight((int) (short) 0);
        int int7 = bernoulliHeightStrategy3.height((int) 'a');
        int int9 = bernoulliHeightStrategy3.nodeHeight((int) (byte) 0);
        int int11 = bernoulliHeightStrategy3.nodeHeight(5);
        int int13 = bernoulliHeightStrategy3.nodeHeight((int) (byte) 1);
        int int15 = bernoulliHeightStrategy3.nodeHeight(2);
        int int17 = bernoulliHeightStrategy3.height((-2));
        int int19 = bernoulliHeightStrategy3.height((int) (byte) 1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList20 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) 0, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList21 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(10, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        int int23 = bernoulliHeightStrategy3.height(7);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList24 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(4, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        strSkipList24.remove("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList24.remove("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- [ ] \n[ ] --- --- [ ] \n[ ] --- [ ] [ ] \n[ ] --- [ ] [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str30 = strSkipList24.get((int) (byte) 10);
    }

    @Test
    public void test823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test823");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight(5);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList8 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) -1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        int int9 = strSkipList8.size();
        strSkipList8.add("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] [ ] --- --- \n[ ] [ ] --- --- \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        java.lang.String str12 = strSkipList8.toString();
        boolean boolean14 = strSkipList8.contains("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] --- [ ] [ ] \n[ ] --- [ ] [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strSkipList8.get((int) '4');
    }

    @Test
    public void test824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test824");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy3 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int5 = bernoulliHeightStrategy3.nodeHeight((int) (short) 0);
        int int7 = bernoulliHeightStrategy3.height((int) 'a');
        int int9 = bernoulliHeightStrategy3.nodeHeight((int) (byte) 0);
        int int11 = bernoulliHeightStrategy3.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList12 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        int int14 = bernoulliHeightStrategy3.height(100);
        int int16 = bernoulliHeightStrategy3.nodeHeight((int) 'a');
        int int18 = bernoulliHeightStrategy3.height(100);
        int int20 = bernoulliHeightStrategy3.nodeHeight((int) (byte) 10);
        int int22 = bernoulliHeightStrategy3.nodeHeight((int) (short) 100);
        int int24 = bernoulliHeightStrategy3.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList25 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((-2), (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        int int27 = bernoulliHeightStrategy3.nodeHeight(5);
        int int29 = bernoulliHeightStrategy3.nodeHeight(7);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList30 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(8, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str32 = strSkipList30.get(0);
    }

    @Test
    public void test825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test825");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        strSkipList0.add("hi!");
        boolean boolean6 = strSkipList0.contains("");
        java.lang.String str7 = strSkipList0.toString();
        strSkipList0.add("[ ] \n H \n");
        java.lang.String str10 = strSkipList0.toString();
        java.lang.String str11 = strSkipList0.toString();
        java.lang.String str13 = strSkipList0.get((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strSkipList0.get((int) (byte) 100);
    }

    @Test
    public void test826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test826");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.height((-1));
        int int5 = bernoulliHeightStrategy1.nodeHeight((int) 'a');
        int int7 = bernoulliHeightStrategy1.height(2);
        int int9 = bernoulliHeightStrategy1.nodeHeight((int) ' ');
        int int11 = bernoulliHeightStrategy1.nodeHeight((int) ' ');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList12 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((-1), (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        int int13 = strSkipList12.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strSkipList12.get((int) '4');
    }

    @Test
    public void test827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test827");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.height((int) (short) 10);
        int int5 = bernoulliHeightStrategy1.nodeHeight(5);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList6 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 10, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        strSkipList6.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        boolean boolean10 = strSkipList6.contains("[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n H \n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strSkipList6.get((int) (byte) 10);
    }

    @Test
    public void test828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test828");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy3 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int5 = bernoulliHeightStrategy3.nodeHeight((int) (short) 0);
        int int7 = bernoulliHeightStrategy3.height((int) 'a');
        int int9 = bernoulliHeightStrategy3.nodeHeight((int) (byte) 10);
        int int11 = bernoulliHeightStrategy3.nodeHeight(10);
        int int13 = bernoulliHeightStrategy3.height(4);
        int int15 = bernoulliHeightStrategy3.nodeHeight(1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList16 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) -1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        int int18 = bernoulliHeightStrategy3.nodeHeight((int) (byte) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList19 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(6, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        int int21 = bernoulliHeightStrategy3.height(0);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList22 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(10, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = strSkipList22.get(15);
    }

    @Test
    public void test829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test829");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        int int9 = bernoulliHeightStrategy1.nodeHeight(5);
        int int11 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 1);
        int int13 = bernoulliHeightStrategy1.nodeHeight(2);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList14 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        int int15 = strSkipList14.size();
        java.lang.String str16 = strSkipList14.toString();
        strSkipList14.add("[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        java.lang.String str20 = strSkipList14.get((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = strSkipList14.get((int) (byte) 10);
    }

    @Test
    public void test830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test830");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        int int9 = bernoulliHeightStrategy1.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList10 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        strSkipList10.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList10.add("[ ] \n H \n");
        int int15 = strSkipList10.size();
        int int16 = strSkipList10.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = strSkipList10.get((int) 'a');
    }

    @Test
    public void test831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test831");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy3 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int5 = bernoulliHeightStrategy3.nodeHeight((int) (short) 0);
        int int7 = bernoulliHeightStrategy3.height((int) 'a');
        int int9 = bernoulliHeightStrategy3.nodeHeight((int) (byte) 0);
        int int11 = bernoulliHeightStrategy3.nodeHeight(5);
        int int13 = bernoulliHeightStrategy3.nodeHeight((int) (byte) 1);
        int int15 = bernoulliHeightStrategy3.nodeHeight(2);
        int int17 = bernoulliHeightStrategy3.height((-2));
        int int19 = bernoulliHeightStrategy3.height((int) (byte) 1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList20 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) 0, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList21 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(10, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        int int23 = bernoulliHeightStrategy3.height(7);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList24 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(4, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        java.lang.String str25 = strSkipList24.toString();
        strSkipList24.add("[ ] --- --- --- \n[ ] [ ] --- --- \n[ ] [ ] --- --- \n[ ] [ ] --- --- \n[ ] [ ] --- --- \n[ ] [ ] --- --- \n[ ] [ ] --- [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str29 = strSkipList24.get(2);
    }

    @Test
    public void test832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test832");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        int int9 = bernoulliHeightStrategy1.nodeHeight(5);
        int int11 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 1);
        int int13 = bernoulliHeightStrategy1.nodeHeight((int) '#');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList14 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strSkipList14.get(3);
    }

    @Test
    public void test833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test833");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 0);
        int int10 = bernoulliHeightStrategy2.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList11 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int13 = bernoulliHeightStrategy2.height(100);
        int int15 = bernoulliHeightStrategy2.nodeHeight(100);
        int int17 = bernoulliHeightStrategy2.nodeHeight((int) '4');
        int int19 = bernoulliHeightStrategy2.nodeHeight(10);
        int int21 = bernoulliHeightStrategy2.height(10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList22 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(2, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        strSkipList22.add("[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = strSkipList22.get((int) (byte) 10);
    }

    @Test
    public void test834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test834");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.height((-1));
        int int6 = bernoulliHeightStrategy2.nodeHeight((int) 'a');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList7 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(10, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int9 = bernoulliHeightStrategy2.height(1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList10 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(7, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        strSkipList10.remove("[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] --- --- [ ] --- \n[ ] [ ] [ ] [ ] [ ] \n H   0   1   2   3\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strSkipList10.get(4);
    }

    @Test
    public void test835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test835");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.height((int) (short) 10);
        int int5 = bernoulliHeightStrategy1.nodeHeight(5);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList6 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 10, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        boolean boolean8 = strSkipList6.contains("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- [ ] [ ] \n[ ] --- [ ] [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        int int9 = strSkipList6.size();
        strSkipList6.remove("[ ] --- --- --- --- --- \n[ ] [ ] --- --- --- --- \n[ ] [ ] --- --- --- --- \n[ ] [ ] --- --- --- --- \n[ ] [ ] --- --- --- --- \n[ ] [ ] --- --- [ ] --- \n[ ] [ ] --- --- [ ] --- \n[ ] [ ] [ ] [ ] [ ] [ ] \n H   0   1   2   3   4\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strSkipList6.get(4);
    }

    @Test
    public void test836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test836");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        strSkipList0.add("hi!");
        boolean boolean6 = strSkipList0.contains("");
        boolean boolean8 = strSkipList0.contains("[ ] [ ] \n H   0\n");
        java.lang.String str9 = strSkipList0.toString();
        strSkipList0.add("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- [ ] [ ] \n[ ] [ ] [ ] [ ] \n[ ] [ ] [ ] [ ] \n[ ] [ ] [ ] [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        java.lang.String str12 = strSkipList0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strSkipList0.get(5);
    }

    @Test
    public void test837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test837");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy3 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int5 = bernoulliHeightStrategy3.nodeHeight((int) (short) 0);
        int int7 = bernoulliHeightStrategy3.height((int) 'a');
        int int9 = bernoulliHeightStrategy3.nodeHeight((int) (byte) 0);
        int int11 = bernoulliHeightStrategy3.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList12 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        int int14 = bernoulliHeightStrategy3.nodeHeight(5);
        int int16 = bernoulliHeightStrategy3.nodeHeight((int) '#');
        int int18 = bernoulliHeightStrategy3.height(3);
        int int20 = bernoulliHeightStrategy3.height((int) ' ');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList21 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList22 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(5, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = strSkipList22.get((int) (byte) 100);
    }

    @Test
    public void test838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test838");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        strSkipList0.add("hi!");
        strSkipList0.add("[ ] [ ] \n H   0\n");
        strSkipList0.remove("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        boolean boolean10 = strSkipList0.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList0.add("[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n H \n");
        strSkipList0.remove("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList0.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList0.add("[ ] --- --- --- --- --- \n[ ] --- --- --- --- --- \n[ ] --- --- --- --- --- \n[ ] --- --- --- --- --- \n[ ] --- --- --- --- --- \n[ ] [ ] --- --- --- --- \n[ ] [ ] [ ] --- --- --- \n[ ] [ ] [ ] [ ] [ ] [ ] \n H   0   1   2   3   4\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = strSkipList0.get((int) 'a');
    }

    @Test
    public void test839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test839");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 0);
        int int10 = bernoulliHeightStrategy2.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList11 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int13 = bernoulliHeightStrategy2.height(100);
        int int15 = bernoulliHeightStrategy2.nodeHeight((int) '4');
        int int17 = bernoulliHeightStrategy2.nodeHeight(0);
        int int19 = bernoulliHeightStrategy2.height((int) '4');
        int int21 = bernoulliHeightStrategy2.nodeHeight((int) (short) -1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList22 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = strSkipList22.get((int) (short) 1);
    }

    @Test
    public void test840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test840");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        strSkipList0.add("hi!");
        int int5 = strSkipList0.size();
        boolean boolean7 = strSkipList0.contains("[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] [ ] \n H   0\n");
        strSkipList0.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        int int10 = strSkipList0.size();
        strSkipList0.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList0.remove("[ ] [ ] \n H   0\n");
        strSkipList0.add("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] [ ] [ ] [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        strSkipList0.add("");
        strSkipList0.add("[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] [ ] \n[ ] [ ] \n[ ] [ ] \n[ ] [ ] \n H   0\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = strSkipList0.get(11);
    }

    @Test
    public void test841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test841");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        int int9 = bernoulliHeightStrategy1.nodeHeight(5);
        int int11 = bernoulliHeightStrategy1.height(100);
        int int13 = bernoulliHeightStrategy1.nodeHeight((-1));
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList14 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) '#', (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        int int15 = strSkipList14.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = strSkipList14.get((int) (byte) 10);
    }

    @Test
    public void test842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test842");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 10);
        int int9 = bernoulliHeightStrategy1.nodeHeight(10);
        int int11 = bernoulliHeightStrategy1.height(4);
        int int13 = bernoulliHeightStrategy1.height(2);
        int int15 = bernoulliHeightStrategy1.height((-2));
        int int17 = bernoulliHeightStrategy1.height(7);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList18 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(0, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = strSkipList18.get((-4));
    }

    @Test
    public void test843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test843");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        java.lang.String str1 = strSkipList0.toString();
        boolean boolean3 = strSkipList0.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList0.add("");
        strSkipList0.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] [ ] \n H   0   1\n");
        boolean boolean9 = strSkipList0.contains("[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] [ ] \n H   0\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strSkipList0.get((int) ' ');
    }

    @Test
    public void test844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test844");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        strSkipList0.add("hi!");
        java.lang.String str5 = strSkipList0.toString();
        java.lang.String str7 = strSkipList0.get(0);
        java.lang.String str9 = strSkipList0.get((int) (short) 0);
        strSkipList0.add("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        int int12 = strSkipList0.size();
        boolean boolean14 = strSkipList0.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        java.lang.String str15 = strSkipList0.toString();
        strSkipList0.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        java.lang.String str19 = strSkipList0.get((int) (byte) 1);
        java.lang.String str21 = strSkipList0.get(3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = strSkipList0.get(8);
    }

    @Test
    public void test845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test845");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.nodeHeight(5);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList9 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) -1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int11 = bernoulliHeightStrategy2.height((int) (byte) 100);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList12 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) '4', (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        strSkipList12.add("[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] [ ] \n[ ] [ ] \n[ ] [ ] \n[ ] [ ] \n H   0\n");
        int int15 = strSkipList12.size();
        java.lang.String str16 = strSkipList12.toString();
        strSkipList12.remove("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] [ ] --- --- \n[ ] [ ] --- [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = strSkipList12.get(2);
    }

    @Test
    public void test846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test846");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        int int3 = strSkipList0.size();
        strSkipList0.remove("");
        boolean boolean7 = strSkipList0.contains("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strSkipList0.get((int) ' ');
    }

    @Test
    public void test847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test847");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        int int9 = bernoulliHeightStrategy1.nodeHeight(5);
        int int11 = bernoulliHeightStrategy1.height(100);
        int int13 = bernoulliHeightStrategy1.height(5);
        int int15 = bernoulliHeightStrategy1.height((int) (byte) 0);
        int int17 = bernoulliHeightStrategy1.height((-2));
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList18 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        java.lang.String str19 = strSkipList18.toString();
        java.lang.String str20 = strSkipList18.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = strSkipList18.get((int) (byte) 100);
    }

    @Test
    public void test848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test848");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 0);
        int int10 = bernoulliHeightStrategy2.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList11 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int13 = bernoulliHeightStrategy2.height(100);
        int int15 = bernoulliHeightStrategy2.nodeHeight(100);
        int int17 = bernoulliHeightStrategy2.height((int) (byte) 1);
        int int19 = bernoulliHeightStrategy2.height((-2));
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList20 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 10, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        boolean boolean22 = strSkipList20.contains("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = strSkipList20.get((int) ' ');
    }

    @Test
    public void test849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test849");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.height((-1));
        int int5 = bernoulliHeightStrategy1.nodeHeight((int) 'a');
        int int7 = bernoulliHeightStrategy1.height(2);
        int int9 = bernoulliHeightStrategy1.height((int) 'a');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList10 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(7, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        strSkipList10.remove("[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        java.lang.String str14 = strSkipList10.get((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strSkipList10.get((int) (short) 10);
    }

    @Test
    public void test850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test850");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 0);
        int int10 = bernoulliHeightStrategy2.nodeHeight(5);
        int int12 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 1);
        int int14 = bernoulliHeightStrategy2.nodeHeight(2);
        int int16 = bernoulliHeightStrategy2.height((-2));
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList17 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(2, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList18 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(5, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = strSkipList18.get((int) '#');
    }

    @Test
    public void test851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test851");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.height(100);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList5 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int7 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 10);
        int int9 = bernoulliHeightStrategy2.nodeHeight((int) (short) 100);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList10 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) 1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int11 = strSkipList10.size();
        boolean boolean13 = strSkipList10.contains("[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] --- [ ] --- [ ] \n[ ] [ ] [ ] [ ] [ ] \n H   0   1   2   3\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strSkipList10.get(10);
    }

    @Test
    public void test852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test852");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 0);
        int int10 = bernoulliHeightStrategy2.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList11 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int13 = bernoulliHeightStrategy2.height(100);
        int int15 = bernoulliHeightStrategy2.nodeHeight(100);
        int int17 = bernoulliHeightStrategy2.nodeHeight((int) '4');
        int int19 = bernoulliHeightStrategy2.height(100);
        int int21 = bernoulliHeightStrategy2.height(6);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList22 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((-1), (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        strSkipList22.remove("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] [ ] --- --- \n[ ] [ ] [ ] [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        boolean boolean26 = strSkipList22.contains("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- [ ] [ ] \n[ ] --- [ ] [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        strSkipList22.remove("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n H   0   1\n");
        boolean boolean30 = strSkipList22.contains("[ ] --- \n[ ] --- \n[ ] [ ] \n[ ] [ ] \n[ ] [ ] \n[ ] [ ] \n[ ] [ ] \n[ ] [ ] \n H   0\n");
        strSkipList22.add("[ ] --- --- --- --- --- \n[ ] --- --- --- --- --- \n[ ] --- --- --- --- --- \n[ ] --- --- --- --- --- \n[ ] --- --- --- --- --- \n[ ] --- [ ] --- --- [ ] \n[ ] --- [ ] --- [ ] [ ] \n[ ] [ ] [ ] [ ] [ ] [ ] \n H   0   1   2   3   4\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str34 = strSkipList22.get((int) (short) 1);
    }

    @Test
    public void test853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test853");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        int int9 = bernoulliHeightStrategy1.nodeHeight(5);
        int int11 = bernoulliHeightStrategy1.height(100);
        int int13 = bernoulliHeightStrategy1.nodeHeight((-1));
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList14 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) '#', (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strSkipList14.get(100);
    }

    @Test
    public void test854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test854");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 10);
        int int9 = bernoulliHeightStrategy1.nodeHeight((-1));
        int int11 = bernoulliHeightStrategy1.nodeHeight(4);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList12 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(7, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        int int13 = strSkipList12.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strSkipList12.get((int) (byte) 1);
    }

    @Test
    public void test855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test855");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy3 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int5 = bernoulliHeightStrategy3.height((-1));
        int int7 = bernoulliHeightStrategy3.nodeHeight((int) 'a');
        int int9 = bernoulliHeightStrategy3.height(2);
        int int11 = bernoulliHeightStrategy3.height((int) 'a');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList12 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(7, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        int int14 = bernoulliHeightStrategy3.nodeHeight(4);
        int int16 = bernoulliHeightStrategy3.height(5);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList17 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList18 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(6, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = strSkipList18.get(8);
    }

    @Test
    public void test856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test856");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 0);
        int int10 = bernoulliHeightStrategy2.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList11 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int13 = bernoulliHeightStrategy2.height(100);
        int int15 = bernoulliHeightStrategy2.nodeHeight(100);
        int int17 = bernoulliHeightStrategy2.nodeHeight((int) '4');
        int int19 = bernoulliHeightStrategy2.height(100);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList20 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((-1), (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        boolean boolean22 = strSkipList20.contains("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] [ ] [ ] [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        boolean boolean24 = strSkipList20.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        int int25 = strSkipList20.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str27 = strSkipList20.get((int) ' ');
    }

    @Test
    public void test857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test857");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 10);
        int int10 = bernoulliHeightStrategy2.nodeHeight(10);
        int int12 = bernoulliHeightStrategy2.height(4);
        int int14 = bernoulliHeightStrategy2.nodeHeight(1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList15 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) -1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int17 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList18 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) -1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = strSkipList18.get((int) 'a');
    }

    @Test
    public void test858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test858");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 0);
        int int10 = bernoulliHeightStrategy2.nodeHeight(5);
        int int12 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 1);
        int int14 = bernoulliHeightStrategy2.nodeHeight(2);
        int int16 = bernoulliHeightStrategy2.height((-2));
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList17 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((-2), (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int19 = bernoulliHeightStrategy2.nodeHeight(0);
        int int21 = bernoulliHeightStrategy2.nodeHeight(7);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList22 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) 1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = strSkipList22.get(0);
    }

    @Test
    public void test859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test859");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        int int3 = strSkipList0.size();
        int int4 = strSkipList0.size();
        java.lang.String str6 = strSkipList0.get((int) (short) 0);
        java.lang.String str7 = strSkipList0.toString();
        boolean boolean9 = strSkipList0.contains("");
        boolean boolean11 = strSkipList0.contains("[ ] \n H \n");
        java.lang.String str12 = strSkipList0.toString();
        strSkipList0.add("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strSkipList0.get(9);
    }

    @Test
    public void test860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test860");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.height((-1));
        int int6 = bernoulliHeightStrategy2.nodeHeight((int) 'a');
        int int8 = bernoulliHeightStrategy2.height(2);
        int int10 = bernoulliHeightStrategy2.nodeHeight((int) ' ');
        int int12 = bernoulliHeightStrategy2.nodeHeight((int) ' ');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList13 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(6, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList14 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        strSkipList14.add("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] [ ] --- --- \n[ ] [ ] [ ] --- \n[ ] [ ] [ ] --- \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = strSkipList14.get((int) (short) 10);
    }

    @Test
    public void test861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test861");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        int int9 = bernoulliHeightStrategy1.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList10 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        strSkipList10.add("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        strSkipList10.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        boolean boolean16 = strSkipList10.contains("[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] [ ] \n H   0\n");
        java.lang.String str17 = strSkipList10.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = strSkipList10.get((int) 'a');
    }

    @Test
    public void test862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test862");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        int int3 = strSkipList0.size();
        int int4 = strSkipList0.size();
        strSkipList0.remove("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n H   0   1\n");
        boolean boolean8 = strSkipList0.contains("[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] [ ] \n H   0\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strSkipList0.get(9);
    }

    @Test
    public void test863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test863");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.height((-1));
        int int6 = bernoulliHeightStrategy2.nodeHeight((int) 'a');
        int int8 = bernoulliHeightStrategy2.height(2);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList9 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) ' ', (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int11 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 100);
        int int13 = bernoulliHeightStrategy2.height(6);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList14 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(3, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strSkipList14.get(15);
    }

    @Test
    public void test864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test864");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.nodeHeight(5);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList9 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) -1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int11 = bernoulliHeightStrategy2.height((int) (byte) 100);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList12 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) '4', (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        strSkipList12.add("[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] [ ] \n[ ] [ ] \n[ ] [ ] \n[ ] [ ] \n H   0\n");
        int int15 = strSkipList12.size();
        java.lang.String str16 = strSkipList12.toString();
        strSkipList12.remove("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] [ ] --- --- \n[ ] [ ] --- [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = strSkipList12.get((int) '4');
    }

    @Test
    public void test865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test865");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        int int9 = bernoulliHeightStrategy1.nodeHeight(5);
        int int11 = bernoulliHeightStrategy1.height(100);
        int int13 = bernoulliHeightStrategy1.nodeHeight((-1));
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList14 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(4, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        java.lang.String str15 = strSkipList14.toString();
        boolean boolean17 = strSkipList14.contains("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] [ ] [ ] --- \n[ ] [ ] [ ] --- \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        strSkipList14.remove("[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n H   0   1\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = strSkipList14.get(9);
    }

    @Test
    public void test866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test866");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 0);
        int int10 = bernoulliHeightStrategy2.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList11 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int13 = bernoulliHeightStrategy2.height(100);
        int int15 = bernoulliHeightStrategy2.nodeHeight((int) 'a');
        int int17 = bernoulliHeightStrategy2.height(100);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList18 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) 'a', (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        boolean boolean20 = strSkipList18.contains("");
        strSkipList18.add("[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] [ ] \n[ ] [ ] \n H   0\n");
        strSkipList18.add("[ ] --- \n[ ] --- \n[ ] --- \n[ ] --- \n[ ] [ ] \n[ ] [ ] \n[ ] [ ] \n[ ] [ ] \n H   0\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = strSkipList18.get(15);
    }

    @Test
    public void test867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test867");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        strSkipList0.add("hi!");
        java.lang.String str5 = strSkipList0.toString();
        java.lang.String str7 = strSkipList0.get(0);
        java.lang.String str9 = strSkipList0.get((int) (short) 0);
        strSkipList0.add("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        int int12 = strSkipList0.size();
        boolean boolean14 = strSkipList0.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        java.lang.String str15 = strSkipList0.toString();
        strSkipList0.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        boolean boolean19 = strSkipList0.contains("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- [ ] --- \n[ ] --- [ ] [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = strSkipList0.get(4);
    }

    @Test
    public void test868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test868");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        boolean boolean2 = strSkipList0.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        java.lang.String str3 = strSkipList0.toString();
        strSkipList0.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        int int6 = strSkipList0.size();
        strSkipList0.remove("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- [ ] \n[ ] --- --- [ ] \n[ ] --- --- [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strSkipList0.get(10);
    }

    @Test
    public void test869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test869");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        int int9 = bernoulliHeightStrategy1.nodeHeight(5);
        int int11 = bernoulliHeightStrategy1.height(100);
        int int13 = bernoulliHeightStrategy1.height(5);
        int int15 = bernoulliHeightStrategy1.height((int) (byte) 0);
        int int17 = bernoulliHeightStrategy1.height((-2));
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList18 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        int int19 = strSkipList18.size();
        java.lang.String str21 = strSkipList18.get((int) (byte) -1);
        boolean boolean23 = strSkipList18.contains("[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n[ ] \n H \n");
        java.lang.String str24 = strSkipList18.toString();
        strSkipList18.remove("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        strSkipList18.add("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str30 = strSkipList18.get(3);
    }

    @Test
    public void test870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test870");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.height((-1));
        int int6 = bernoulliHeightStrategy2.nodeHeight((int) 'a');
        int int8 = bernoulliHeightStrategy2.height(2);
        int int10 = bernoulliHeightStrategy2.nodeHeight((int) ' ');
        int int12 = bernoulliHeightStrategy2.nodeHeight((int) ' ');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList13 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(6, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList14 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strSkipList14.get((-2));
    }

    @Test
    public void test871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test871");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        java.lang.String str1 = strSkipList0.toString();
        boolean boolean3 = strSkipList0.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        int int4 = strSkipList0.size();
        boolean boolean6 = strSkipList0.contains("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- [ ] [ ] \n[ ] --- [ ] [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        int int7 = strSkipList0.size();
        boolean boolean9 = strSkipList0.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        boolean boolean11 = strSkipList0.contains("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strSkipList0.get(15);
    }

    @Test
    public void test872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test872");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        int int3 = strSkipList0.size();
        int int4 = strSkipList0.size();
        strSkipList0.remove("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n H   0   1\n");
        int int7 = strSkipList0.size();
        int int8 = strSkipList0.size();
        strSkipList0.add("");
        int int11 = strSkipList0.size();
        strSkipList0.add("[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] --- --- --- --- \n[ ] --- --- [ ] --- \n[ ] --- [ ] [ ] [ ] \n[ ] [ ] [ ] [ ] [ ] \n H   0   1   2   3\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strSkipList0.get((int) '4');
    }

    @Test
    public void test873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test873");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.nodeHeight((int) (short) 0);
        int int6 = bernoulliHeightStrategy2.height((int) 'a');
        int int8 = bernoulliHeightStrategy2.nodeHeight((int) (byte) 0);
        int int10 = bernoulliHeightStrategy2.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList11 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int13 = bernoulliHeightStrategy2.height(100);
        int int15 = bernoulliHeightStrategy2.nodeHeight((int) '4');
        int int17 = bernoulliHeightStrategy2.nodeHeight(0);
        int int19 = bernoulliHeightStrategy2.height((int) '4');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList20 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        strSkipList20.add("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] --- [ ] --- \n[ ] [ ] [ ] --- \n[ ] [ ] [ ] --- \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = strSkipList20.get(6);
    }

    @Test
    public void test874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test874");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.height((int) (byte) -1);
        int int5 = bernoulliHeightStrategy1.nodeHeight((int) (short) 100);
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        int int9 = bernoulliHeightStrategy1.height(5);
        int int11 = bernoulliHeightStrategy1.nodeHeight(10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList12 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(3, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        boolean boolean14 = strSkipList12.contains("[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- --- \n[ ] --- --- [ ] \n[ ] --- --- [ ] \n[ ] [ ] --- [ ] \n[ ] [ ] --- [ ] \n[ ] [ ] [ ] [ ] \n H   0   1   2\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strSkipList12.get(11);
    }

    @Test
    public void test875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test875");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy1 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int3 = bernoulliHeightStrategy1.nodeHeight((int) (short) 0);
        int int5 = bernoulliHeightStrategy1.height((int) 'a');
        int int7 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 0);
        int int9 = bernoulliHeightStrategy1.nodeHeight(5);
        int int11 = bernoulliHeightStrategy1.nodeHeight((int) (byte) 1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList12 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (short) -1, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy1);
        java.lang.String str13 = strSkipList12.toString();
        int int14 = strSkipList12.size();
        boolean boolean16 = strSkipList12.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        boolean boolean18 = strSkipList12.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] --- --- \n[ ] [ ] --- \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = strSkipList12.get(0);
    }

    @Test
    public void test876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test876");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy2 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int4 = bernoulliHeightStrategy2.height((-1));
        int int6 = bernoulliHeightStrategy2.nodeHeight((int) 'a');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList7 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(10, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int9 = bernoulliHeightStrategy2.nodeHeight((int) (short) -1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList10 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy2);
        int int11 = strSkipList10.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strSkipList10.get(0);
    }

    @Test
    public void test877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test877");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy3 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int5 = bernoulliHeightStrategy3.nodeHeight((int) (short) 0);
        int int7 = bernoulliHeightStrategy3.height((int) 'a');
        int int9 = bernoulliHeightStrategy3.nodeHeight((int) (byte) 0);
        int int11 = bernoulliHeightStrategy3.nodeHeight(5);
        int int13 = bernoulliHeightStrategy3.nodeHeight((int) (byte) 1);
        int int15 = bernoulliHeightStrategy3.nodeHeight((int) 'a');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList16 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((-2), (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        int int18 = bernoulliHeightStrategy3.nodeHeight((int) 'a');
        int int20 = bernoulliHeightStrategy3.height((int) (byte) 1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList21 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 0, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        int int23 = bernoulliHeightStrategy3.height(8);
        int int25 = bernoulliHeightStrategy3.nodeHeight(10);
        int int27 = bernoulliHeightStrategy3.nodeHeight(0);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList28 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(7, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str30 = strSkipList28.get((int) (byte) 100);
    }

    @Test
    public void test878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test878");
        com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy bernoulliHeightStrategy3 = new com.thealgorithms.datastructures.lists.SkipList.BernoulliHeightStrategy();
        int int5 = bernoulliHeightStrategy3.nodeHeight((int) (short) 0);
        int int7 = bernoulliHeightStrategy3.height((int) 'a');
        int int9 = bernoulliHeightStrategy3.nodeHeight((int) (byte) 0);
        int int11 = bernoulliHeightStrategy3.nodeHeight((int) (short) 10);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList12 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        int int14 = bernoulliHeightStrategy3.height(100);
        int int16 = bernoulliHeightStrategy3.nodeHeight((int) '4');
        int int18 = bernoulliHeightStrategy3.nodeHeight(0);
        int int20 = bernoulliHeightStrategy3.height((int) '4');
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList21 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>((int) (byte) 100, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        int int23 = bernoulliHeightStrategy3.nodeHeight(100);
        int int25 = bernoulliHeightStrategy3.nodeHeight((int) (short) -1);
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList26 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>(10, (com.thealgorithms.datastructures.lists.SkipList.HeightStrategy) bernoulliHeightStrategy3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str28 = strSkipList26.get((int) (short) 10);
    }

    @Test
    public void test879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test879");
        com.thealgorithms.datastructures.lists.SkipList<java.lang.String> strSkipList0 = new com.thealgorithms.datastructures.lists.SkipList<java.lang.String>();
        strSkipList0.add("");
        strSkipList0.add("hi!");
        strSkipList0.remove("");
        java.lang.String str7 = strSkipList0.toString();
        boolean boolean9 = strSkipList0.contains("[ ] --- --- \n[ ] --- --- \n[ ] --- [ ] \n[ ] --- [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n[ ] [ ] [ ] \n H   0   1\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strSkipList0.get((int) (byte) 10);
    }
}

