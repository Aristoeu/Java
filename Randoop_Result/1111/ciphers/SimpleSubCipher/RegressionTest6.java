package ciphers.SimpleSubCipher;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test03001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03001");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("T!!!T!!!T!!!T!!!T!!!T!!!T!!!T!!!!", "]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!!" + "'", str2, "]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!!");
    }

    @Test
    public void test03002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03002");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("eeee\220eeeeeeee\200~~eeee\220eeeeeeee\200~~eeee\220eeeeeeeeeeee\220eeeeeeeeeeee\220eeeeeeee\200~~eeee\220eeeeeeee\200~~eeee\220eeeeeeeeeeee\220eeeeeeee!!eeee\220eeeeeeee\200~~eeee\220eeeeeeee\200~~eeee\220eeeeeeeeeeee\220eeeeeeeeeeee\220eeeeeeee\200~~eeee\220eeeeeeee\200~~eeee\220eeeeeeeeeeee\220eeeeeeee!!eeee\220eeeeeeee\200~~eeee\220eeeeeeee\200~~eeee\220eeeeeeeeeeee\220eeeeeeeeeeee\220eeeeeeee\200~~eeee\220eeeeeeee\200~~eeee\220eeeeeeeeeeee\220eeeeeeeeeeee\220eeeeeeee\200~~eeee\220eeeeeeee\200~~eeee\220eeeeeeeeeeee\220eeeeeeeeeeee\220eeeeeeee\200~~eeee\220eeeeeeee\200~~eeee\220eeeeeeeeeeee\220eeeeeeee!!eeee\220eeeeeeee\200~~eeee\220eeeeeeee\200~~eeee\220eeeeeeeeeeee\220eeeeeeeeeeee\220eeeeeeee\200~~eeee\220eeeeeeee\200~~eeee\220eeeeeeeeeeee\220eeeeeeee!!eeee\220eeeeeeee\200~~eeee\220eeeeeeee\200~~eeee\220eeeeeeeeeeee\220eeeeeeeeeeee\220eeeeeeee\200~~eeee\220eeeeeeee\200~~eeee\220eeeeeeeeeeee\220eeeeeeee!", "``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL!!``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL!!``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL!!``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL!!``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "````\220````````\200~~````\220````````\200~~````\220````````````\220````````````\220````````\200~~````\220````````\200~~````\220````````````\220````````!!````\220````````\200~~````\220````````\200~~````\220````````````\220````````````\220````````\200~~````\220````````\200~~````\220````````````\220````````!!````\220````````\200~~````\220````````\200~~````\220````````````\220````````````\220````````\200~~````\220````````\200~~````\220````````````\220````````````\220````````\200~~````\220````````\200~~````\220````````````\220````````````\220````````\200~~````\220````````\200~~````\220````````````\220````````!!````\220````````\200~~````\220````````\200~~````\220````````````\220````````````\220````````\200~~````\220````````\200~~````\220````````````\220````````!!````\220````````\200~~````\220````````\200~~````\220````````````\220````````````\220````````\200~~````\220````````\200~~````\220````````````\220````````!" + "'", str2, "````\220````````\200~~````\220````````\200~~````\220````````````\220````````````\220````````\200~~````\220````````\200~~````\220````````````\220````````!!````\220````````\200~~````\220````````\200~~````\220````````````\220````````````\220````````\200~~````\220````````\200~~````\220````````````\220````````!!````\220````````\200~~````\220````````\200~~````\220````````````\220````````````\220````````\200~~````\220````````\200~~````\220````````````\220````````````\220````````\200~~````\220````````\200~~````\220````````````\220````````````\220````````\200~~````\220````````\200~~````\220````````````\220````````!!````\220````````\200~~````\220````````\200~~````\220````````````\220````````````\220````````\200~~````\220````````\200~~````\220````````````\220````````!!````\220````````\200~~````\220````````\200~~````\220````````````\220````````````\220````````\200~~````\220````````\200~~````\220````````````\220````````!");
    }

    @Test
    public void test03003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03003");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!", "]!E!!!E!!!E!!!E!!!E!!]]!E!!!E!!]]!E!!!E!!]]!E!!!E!!]]]!E!!!E!!!E!!!E!!!E!!]]!E!!!E!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!");
    }

    @Test
    public void test03004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03004");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!", "l!lll!lll!lll!lll!lll!lll!lll!ll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!lll!lll!!!lll!lll!!!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!!!lll!lll!!!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!!!lll!lll!!!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!!!lll!lll!!!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!!!lll!lll!!!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!!!lll!lll!!!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!!!lll!lll!!!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!!!lll!lll!!!lll!lll!lll!lll!lll!lll!lll!lll!" + "'", str2, "!lll!lll!!!lll!lll!!!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!!!lll!lll!!!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!!!lll!lll!!!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!!!lll!lll!!!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!!!lll!lll!!!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!!!lll!lll!!!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!!!lll!lll!!!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!!!lll!lll!!!lll!lll!lll!lll!lll!lll!lll!lll!");
    }

    @Test
    public void test03005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03005");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7!", "\u0346\u0348\u0348\u0348}~\200\200}~\200\200hfhhhfhh\223\223hfhhhfhhhfhhhfhhhfhh\223\223hfhhhfhhhfhh}~\200\200}~\200\200hfhhhfhh\223\223hfhhhfhhhfhhhfhhhfhh\223\223hfhhhfhhhfhh}~\200\200}~\200\200hfhhhfhh\223\223hfhhhfhhhfhhhfhhhfhh\223\223hfhhhfhhhfhh}~\200\200}~\200\200hfhhhfhh\223\223hfhhhfhhhfhhhfhhhfhh\223\223\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!" + "'", str2, "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
    }

    @Test
    public void test03006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03006");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "nullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBB!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03007");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256!", "nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256!" + "'", str2, "\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256!");
    }

    @Test
    public void test03008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03008");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\331\330\333\333\331\330\333\333\331\330\333\333\331\330\333\333!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03009");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\200E\220\220\200E\220\220\200E\220\220\200E\220\220\200E\220\220\200E\220\220\200E\220\220\200E\220\220!", "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220!" + "'", str2, "\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220!");
    }

    @Test
    public void test03010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03010");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}~\200\200}~\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL}~\200\200}~\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!", "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU}~\200\200}~\200\200NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!" + "'", str2, "}~\200\200}~\200\200NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU}~\200\200}~\200\200NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!");
    }

    @Test
    public void test03011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03011");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03012");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\300\300\275\275\300\300\275\275\300\300\275\275\300\300\275\275\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\300\300\275\275\300\300\275\275!", "\u0366\u0365\u0368\u0368\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnullnullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnullnullnull\275\275nullnull\275\275!" + "'", str2, "\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnullnullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnullnullnull\275\275nullnull\275\275!");
    }

    @Test
    public void test03013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03013");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!", "ORRRORRRRRORRRORRRRRORRRORRRRRORRRORRRRRORRRORRRRRORRRORRRRRORRRORRRRRORRRORRRRR!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!" + "'", str2, "\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!");
    }

    @Test
    public void test03014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03014");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!", "XXXXXXXXXXXXXXXXXXXXXXXXXXXX!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!!" + "'", str2, "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!!");
    }

    @Test
    public void test03015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03015");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!", "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!" + "'", str2, "\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!");
    }

    @Test
    public void test03016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03016");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLL!", "]AAAAA]]AA]]AA]]AA]]]AAAAA]]AA]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]!" + "'", str2, "]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]!");
    }

    @Test
    public void test03017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03017");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!", "LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUUUUUUUUUU!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!" + "'", str2, "UUUUUUUUUUUUUUUU!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
    }

    @Test
    public void test03018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03018");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\253\254\256\256\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\253\254\256\256\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246!", "\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnullnullnull!" + "'", str2, "\253\254\256\256nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03019");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232!", "]AAAAA]]AA]]AA]]AA]]]AAAAA]]AA]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232!" + "'", str2, "~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232!");
    }

    @Test
    public void test03020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03020");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UUUUUUUU\214\214UUUUUUUU\214\214UUUUUUUU\214\214UUUUUUUU\214\214UUUUUUUU\214\214UUUUUUUU\214\214UUUUUUUU\214\214UUUUUUUU\214\214!", "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\214\214\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\214\214\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\214\214\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\214\214\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\214\214\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\214\214\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\214\214\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\214\214!" + "'", str2, "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\214\214\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\214\214\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\214\214\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\214\214\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\214\214\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\214\214\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\214\214\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\214\214!");
    }

    @Test
    public void test03021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03021");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NNNNNNNN!!NNNNNNNN!!NNNNNNNNNNNNNNNN!!NNNNNNNN!!NNNNNNNN!", "\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150!!\200\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03022");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300!", "!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull!" + "'", str2, "\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull!");
    }

    @Test
    public void test03023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03023");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!!", "EEEEEEEE!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!!" + "'", str2, "\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!!");
    }

    @Test
    public void test03024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03024");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\200\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c]]!", "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\200}}`LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL]]!" + "'", str2, "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\200}}`LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL]]!");
    }

    @Test
    public void test03025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03025");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\253\256\256\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!", "\u0317\u031a\u0317\u031a\u0317\u031a\u0317\u031anullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\256\256\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!" + "'", str2, "!\253\256\256\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
    }

    @Test
    public void test03026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03026");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!~HH!~HH!!!~HH!~HH!!!~HH!~HH!~HH!~HH!!!~HH!~HH!!!~HH!~HH!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~UU!~UU!!!~UU!~UU!!!~UU!~UU!~UU!~UU!!!~UU!~UU!!!~UU!~UU!" + "'", str2, "!~UU!~UU!!!~UU!~UU!!!~UU!~UU!~UU!~UU!!!~UU!~UU!!!~UU!~UU!");
    }

    @Test
    public void test03027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03027");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("AA]]AA]]nullnullAA]]AA]]nullnull!", "UULLUULLLLUULLUUUULLUULLLLUULLUUUULLUULLLLUULLUUUULLUULLLLUULLUUUULLUULLLLUULLUUUULLUULLLLUULLUUUULLUULLLLUULLUUUULLUULLLLUULLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UU]]UU]]LUUULUUUUU]]UU]]LUUULUUU!" + "'", str2, "UU]]UU]]LUUULUUUUU]]UU]]LUUULUUU!");
    }

    @Test
    public void test03028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03028");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!", "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368NULLNULL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!" + "'", str2, "!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!");
    }

    @Test
    public void test03029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03029");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\200~\200\200\200~\200\200!!\200~\200\200\200~\200\200!!\200~\200\200\200~\200\200\200~\200\200\200~\200\200!!\200~\200\200\200~\200\200!!\200~\200\200\200~\200\200!", "^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200~\200\200\200~\200\200!!\200~\200\200\200~\200\200!!\200~\200\200\200~\200\200\200~\200\200\200~\200\200!!\200~\200\200\200~\200\200!!\200~\200\200\200~\200\200!" + "'", str2, "\200~\200\200\200~\200\200!!\200~\200\200\200~\200\200!!\200~\200\200\200~\200\200\200~\200\200\200~\200\200!!\200~\200\200\200~\200\200!!\200~\200\200\200~\200\200!");
    }

    @Test
    public void test03030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03030");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03031");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128!!!!", "!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!" + "'", str2, "null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!");
    }

    @Test
    public void test03032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03032");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!", "IILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "II!!II!!II!!II!!II!!II!!II!!II!!!" + "'", str2, "II!!II!!II!!II!!II!!II!!II!!II!!!");
    }

    @Test
    public void test03033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03033");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256!", "LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256!" + "'", str2, "\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256!");
    }

    @Test
    public void test03034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03034");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!!" + "'", str2, "nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!!");
    }

    @Test
    public void test03035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03035");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUUUNLLUNLLUU!", "efhhefhhefhhefhhefhhefhhefhhefhh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEEEFHHEFHHEEEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEEEFHHEFHHEEEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEEEFHHEFHHEEEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEEEFHHEFHHEEEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEEEFHHEFHHEEEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEEEFHHEFHHEEEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEEEFHHEFHHEEEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEEEFHHEFHHEE!" + "'", str2, "EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEEEFHHEFHHEEEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEEEFHHEFHHEEEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEEEFHHEFHHEEEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEEEFHHEFHHEEEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEEEFHHEFHHEEEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEEEFHHEFHHEEEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEEEFHHEFHHEEEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEEEFHHEFHHEE!");
    }

    @Test
    public void test03036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03036");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!", "T!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TT!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!" + "'", str2, "!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!");
    }

    @Test
    public void test03037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03037");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!\256null!nullnull\254\254\256null!nullnull\254\254!!\256null!nullnull\254\254\256null!nullnull\254\254!!\256null!nullnull\254\254\256null!nullnull\254\254!!\256null!nullnull\254\254\256null!nullnull\254\254!!\256null!nullnull\254\254\256null!nullnull\254\254!!\256null!nullnull\254\254\256null!nullnull\254\254!!\256null!nullnull\254\254\256null!nullnull\254\254!!\256null!nullnull\254\254\256null!nullnull\254\254!", "LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\256nullnull~~!nullnull~~nullnull~~\254\254\256nullnull~~!nullnull~~nullnull~~\254\254!!\256nullnull~~!nullnull~~nullnull~~\254\254\256nullnull~~!nullnull~~nullnull~~\254\254!!\256nullnull~~!nullnull~~nullnull~~\254\254\256nullnull~~!nullnull~~nullnull~~\254\254!!\256nullnull~~!nullnull~~nullnull~~\254\254\256nullnull~~!nullnull~~nullnull~~\254\254!!\256nullnull~~!nullnull~~nullnull~~\254\254\256nullnull~~!nullnull~~nullnull~~\254\254!!\256nullnull~~!nullnull~~nullnull~~\254\254\256nullnull~~!nullnull~~nullnull~~\254\254!!\256nullnull~~!nullnull~~nullnull~~\254\254\256nullnull~~!nullnull~~nullnull~~\254\254!!\256nullnull~~!nullnull~~nullnull~~\254\254\256nullnull~~!nullnull~~nullnull~~\254\254!" + "'", str2, "!!\256nullnull~~!nullnull~~nullnull~~\254\254\256nullnull~~!nullnull~~nullnull~~\254\254!!\256nullnull~~!nullnull~~nullnull~~\254\254\256nullnull~~!nullnull~~nullnull~~\254\254!!\256nullnull~~!nullnull~~nullnull~~\254\254\256nullnull~~!nullnull~~nullnull~~\254\254!!\256nullnull~~!nullnull~~nullnull~~\254\254\256nullnull~~!nullnull~~nullnull~~\254\254!!\256nullnull~~!nullnull~~nullnull~~\254\254\256nullnull~~!nullnull~~nullnull~~\254\254!!\256nullnull~~!nullnull~~nullnull~~\254\254\256nullnull~~!nullnull~~nullnull~~\254\254!!\256nullnull~~!nullnull~~nullnull~~\254\254\256nullnull~~!nullnull~~nullnull~~\254\254!!\256nullnull~~!nullnull~~nullnull~~\254\254\256nullnull~~!nullnull~~nullnull~~\254\254!");
    }

    @Test
    public void test03038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03038");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv!", "\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d!" + "'", str2, "\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d!");
    }

    @Test
    public void test03039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03039");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "UNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUU!!UNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUU!!UNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUU!!UNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUU!!UNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUU!!UNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUU!!UNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUU!!UNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUU!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016enullnull!" + "'", str2, "\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016enullnull!");
    }

    @Test
    public void test03040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03040");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullvvvnullvvvnullvvvnullvvv\200}}`nullvvvnullvvvnullvvvnullvvv]]!", "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLLLLLLLLLLLLLL\200}}`LLLLLLLLLLLLLLLLLLLLLLLLLLLL]]!" + "'", str2, "LLLLLLLLLLLLLLLLLLLLLLLLLLLL\200}}`LLLLLLLLLLLLLLLLLLLLLLLLLLLL]]!");
    }

    @Test
    public void test03041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03041");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300!", "]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL!" + "'", str2, "\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL!");
    }

    @Test
    public void test03042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03042");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104~}\200\200~}\200\200\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104~}\200\200~}\200\200\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104~}\200\200~}\200\200\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104~}\200\200~}\200\200\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104~}\200\200~}\200\200\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104~}\200\200~}\200\200\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104~}\200\200~}\200\200\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104!", "}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200UNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULLUNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULL~}\200\200~}\200\200UNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULLUNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULL~}\200\200~}\200\200UNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULLUNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULL~}\200\200~}\200\200UNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULLUNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULL~}\200\200~}\200\200UNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULLUNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULL~}\200\200~}\200\200UNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULLUNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULL~}\200\200~}\200\200UNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULLUNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULL~}\200\200~}\200\200UNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULLUNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULL!" + "'", str2, "~}\200\200~}\200\200UNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULLUNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULL~}\200\200~}\200\200UNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULLUNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULL~}\200\200~}\200\200UNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULLUNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULL~}\200\200~}\200\200UNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULLUNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULL~}\200\200~}\200\200UNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULLUNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULL~}\200\200~}\200\200UNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULLUNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULL~}\200\200~}\200\200UNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULLUNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULL~}\200\200~}\200\200UNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULLUNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULL!");
    }

    @Test
    public void test03043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03043");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NNNNNNNNNNNNNNNN!NNN!NNN!NNN!NNNNNNNNNNNNNNNNNNN!NNN!NNN!", "]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnull!nullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnull!nullnullnull!");
    }

    @Test
    public void test03044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03044");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276\336\266\266~\326\326\276\336\266\266~\326\326!!\276\336\266\266~\326\326\276\336\266\266~\326\326!!\276\336\266\266~\326\326\276\336\266\266~\326\326\276\336\266\266~\326\326\276\336\266\266~\326\326!!\276\336\266\266~\326\326\276\336\266\266~\326\326!!\276\336\266\266~\326\326\276\336\266\266~\326\326!", "!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!" + "'", str2, "\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!");
    }

    @Test
    public void test03045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03045");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\225\225XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\225\225XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\225\225XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\225\225XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\225\225XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\225\225XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\225\225XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\225\225!", "~}\200\200~}\200\200!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230~}\200\200~}\200\200!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230~}\200\200~}\200\200!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230~}\200\200~}\200\200!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230~}\200\200~}\200\200!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230~}\200\200~}\200\200!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230~}\200\200~}\200\200!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230~}\200\200~}\200\200!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF\225\225FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF\225\225FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF\225\225FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF\225\225FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF\225\225FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF\225\225FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF\225\225FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF\225\225!" + "'", str2, "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF\225\225FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF\225\225FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF\225\225FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF\225\225FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF\225\225FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF\225\225FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF\225\225FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF\225\225!");
    }

    @Test
    public void test03046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03046");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnull\226\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230!", "UNNNUNNNUUUNNNUNNNUUUNNNUNNNUUUNNNUNNNUUUNNNUNNNUUUNNNUNNNUUUNNNUNNNUUUNNNUNNNUU!!UNNNUNNNUUUNNNUNNNUUUNNNUNNNUUUNNNUNNNUUUNNNUNNNUUUNNNUNNNUUUNNNUNNNUUUNNNUNNNUU!!UNNNUNNNUUUNNNUNNNUUUNNNUNNNUUUNNNUNNNUUUNNNUNNNUUUNNNUNNNUUUNNNUNNNUUUNNNUNNNUUUNNNUNNNUUUNNNUNNNUUUNNNUNNNUUUNNNUNNNUUUNNNUNNNUUUNNNUNNNUUUNNNUNNNUUUNNNUNNNUU!!UNNNUNNNUUUNNNUNNNUUUNNNUNNNUUUNNNUNNNUUUNNNUNNNUUUNNNUNNNUUUNNNUNNNUUUNNNUNNNUU!!UNNNUNNNUUUNNNUNNNUUUNNNUNNNUUUNNNUNNNUUUNNNUNNNUUUNNNUNNNUUUNNNUNNNUUUNNNUNNNUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230!" + "'", str2, "NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230!");
    }

    @Test
    public void test03047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03047");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!!", "LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!!" + "'", str2, "````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!!");
    }

    @Test
    public void test03048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03048");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("EHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHH!", "U\220LL\200}}`U\220LL]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````!" + "'", str2, "\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````!");
    }

    @Test
    public void test03049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03049");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("`RRPPRRPPRRPP`RRPPRRPPRRPP!", "\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u026c\u026c\u026c!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`nullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "`nullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03050");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF\225\225FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF\225\225FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF\225\225FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF\225\225FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF\225\225FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF\225\225FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF\225\225FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF}~\200\200}~\200\200FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF!" + "'", str2, "}~\200\200}~\200\200FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF}~\200\200}~\200\200FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF!");
    }

    @Test
    public void test03051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03051");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("stvvstvv\255\256\260\260\255\256\260\260stvvstvv\255\256\260\260\255\256\260\260stvvstvv\255\256\260\260\255\256\260\260stvvstvv\255\256\260\260\255\256\260\260stvvstvv\255\256\260\260\255\256\260\260stvvstvv\255\256\260\260\255\256\260\260stvvstvv\255\256\260\260\255\256\260\260stvvstvv\255\256\260\260\255\256\260\260!", "\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230!!\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230!!\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230!!\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230!!\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\225\225\230\230\225\225\230\230\255\256\260\260\255\256\260\260\225\225\230\230\225\225\230\230\255\256\260\260\255\256\260\260\225\225\230\230\225\225\230\230\255\256\260\260\255\256\260\260\225\225\230\230\225\225\230\230\255\256\260\260\255\256\260\260\225\225\230\230\225\225\230\230\255\256\260\260\255\256\260\260\225\225\230\230\225\225\230\230\255\256\260\260\255\256\260\260\225\225\230\230\225\225\230\230\255\256\260\260\255\256\260\260\225\225\230\230\225\225\230\230\255\256\260\260\255\256\260\260!" + "'", str2, "\225\225\230\230\225\225\230\230\255\256\260\260\255\256\260\260\225\225\230\230\225\225\230\230\255\256\260\260\255\256\260\260\225\225\230\230\225\225\230\230\255\256\260\260\255\256\260\260\225\225\230\230\225\225\230\230\255\256\260\260\255\256\260\260\225\225\230\230\225\225\230\230\255\256\260\260\255\256\260\260\225\225\230\230\225\225\230\230\255\256\260\260\255\256\260\260\225\225\230\230\225\225\230\230\255\256\260\260\255\256\260\260\225\225\230\230\225\225\230\230\255\256\260\260\255\256\260\260!");
    }

    @Test
    public void test03052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03052");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!null!", "`nullhffnullhffnullhff`nullhffnullhffnullhff!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ffFF!" + "'", str2, "!ffFF!");
    }

    @Test
    public void test03053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03053");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216!", "\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043bnullnullnullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216!" + "'", str2, "\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216!");
    }

    @Test
    public void test03054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03054");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03055");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0!", "~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!]!!!]!!!!!]!!!]!!!!!]!!!]!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!" + "'", str2, "!]!!!]!!!!!]!!!]!!!!!]!!!]!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!");
    }

    @Test
    public void test03056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03056");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd!", "\261\262\264\264nullnull!!!!\261\262\264\264nullnull!!!!!!\261\262\264\264nullnull!!!!\261\262\264\264nullnull!!!!!!\261\262\264\264nullnull!!!!\261\262\264\264nullnull!!!!!!\261\262\264\264nullnull!!!!\261\262\264\264nullnull!!!!!!\261\262\264\264nullnull!!!!\261\262\264\264nullnull!!!!!!\261\262\264\264nullnull!!!!\261\262\264\264nullnull!!!!!!\261\262\264\264nullnull!!!!\261\262\264\264nullnull!!!!!!\261\262\264\264nullnull!!!!\261\262\264\264nullnull!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull!" + "'", str2, "~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03057");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!", "`JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ`JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!" + "'", str2, "``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!");
    }

    @Test
    public void test03058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03058");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UNLLUNLLUNLLUNLLULLLULLLULLLULLLUNLLUNLLUNLLUNLLULLLULLL!", "\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016dnullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\356\355\360\360\356\355\360\360\356\355\360\360\356\355\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\355\360\360\356\355\360\360\356\355\360\360\356\355\360\360\356\360\360\360\356\360\360\360!" + "'", str2, "\356\355\360\360\356\355\360\360\356\355\360\360\356\355\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\355\360\360\356\355\360\360\356\355\360\360\356\355\360\360\356\360\360\360\356\360\360\360!");
    }

    @Test
    public void test03059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03059");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("unllunllunllunllunllunllunllunll!", "XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03060");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!", "\250\250\246\246\250\250\246\246!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}}!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}}!");
    }

    @Test
    public void test03061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03061");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull!", "nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^```^```^```^```^```^```^```^```^```^```U\331\225\225U\331\225\225^```^```U\331\225\225U\331\225\225^```^```^```^```^```^```^```^```^```^```U\331\225\225U\331\225\225^```^```U\331\225\225U\331\225\225^```^```^```^```^```^```^```^```^```^```U\331\225\225U\331\225\225^```^```U\331\225\225U\331\225\225^```^```^```^```^```^```^```^```^```^```U\331\225\225U\331\225\225^```^```U\331\225\225U\331\225\225^```^```^```^```^```^```^```^```^```^```U\331\225\225U\331\225\225^```^```U\331\225\225U\331\225\225^```^```^```^```^```^```^```^```^```^```U\331\225\225U\331\225\225^```^```U\331\225\225U\331\225\225^```^```^```^```^```^```^```^```^```^```U\331\225\225U\331\225\225^```^```U\331\225\225U\331\225\225^```^```^```^```^```^```^```^```^```^```U\331\225\225U\331\225\225^```^```U\331\225\225U\331\225\225!" + "'", str2, "^```^```^```^```^```^```^```^```^```^```U\331\225\225U\331\225\225^```^```U\331\225\225U\331\225\225^```^```^```^```^```^```^```^```^```^```U\331\225\225U\331\225\225^```^```U\331\225\225U\331\225\225^```^```^```^```^```^```^```^```^```^```U\331\225\225U\331\225\225^```^```U\331\225\225U\331\225\225^```^```^```^```^```^```^```^```^```^```U\331\225\225U\331\225\225^```^```U\331\225\225U\331\225\225^```^```^```^```^```^```^```^```^```^```U\331\225\225U\331\225\225^```^```U\331\225\225U\331\225\225^```^```^```^```^```^```^```^```^```^```U\331\225\225U\331\225\225^```^```U\331\225\225U\331\225\225^```^```^```^```^```^```^```^```^```^```U\331\225\225U\331\225\225^```^```U\331\225\225U\331\225\225^```^```^```^```^```^```^```^```^```^```U\331\225\225U\331\225\225^```^```U\331\225\225U\331\225\225!");
    }

    @Test
    public void test03062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03062");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276null\275\275\276null\275\275u!llu!llu!llu!llu!llu!llu!llu!ll\276null\275\275\276null\275\275u!llu!llu!llu!llu!llu!llu!llu!ll\276null\275\275\276null\275\275u!llu!llu!llu!llu!llu!llu!llu!ll\276null\275\275\276null\275\275u!llu!llu!llu!llu!llu!llu!llu!ll\276null\275\275\276null\275\275u!llu!llu!llu!llu!llu!llu!llu!ll\276null\275\275\276null\275\275u!llu!llu!llu!llu!llu!llu!llu!ll\276null\275\275\276null\275\275u!llu!llu!llu!llu!llu!llu!llu!ll\276null\275\275\276null\275\275u!llu!llu!llu!llu!llu!llu!llu!ll!", "LL!!UULLUULLUULLLL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!UULLUULLUULLLL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276LL!!\275\275\276LL!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\276LL!!\275\275\276LL!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\276LL!!\275\275\276LL!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\276LL!!\275\275\276LL!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\276LL!!\275\275\276LL!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\276LL!!\275\275\276LL!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\276LL!!\275\275\276LL!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\276LL!!\275\275\276LL!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!" + "'", str2, "\276LL!!\275\275\276LL!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\276LL!!\275\275\276LL!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\276LL!!\275\275\276LL!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\276LL!!\275\275\276LL!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\276LL!!\275\275\276LL!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\276LL!!\275\275\276LL!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\276LL!!\275\275\276LL!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\276LL!!\275\275\276LL!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!");
    }

    @Test
    public void test03063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03063");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!", "\253\254\256\256nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "N\254NNN\254NNN\254NNN\254NN!N\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NN!N\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NN!N\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NN!N\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NN!N\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NN!N\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NN!N\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NN!N\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NN!" + "'", str2, "N\254NNN\254NNN\254NNN\254NN!N\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NN!N\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NN!N\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NN!N\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NN!N\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NN!N\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NN!N\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NN!N\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NN!");
    }

    @Test
    public void test03064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03064");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!", "\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test03065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03065");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\300\300\300\276\300\275\275!", "NLUUNLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullnull\276null\275\275!" + "'", str2, "\275nullnullnull\276null\275\275!");
    }

    @Test
    public void test03066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03066");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126!", "]!null!!!null!!!null!!!null!!!null!!]]!null!!!null!!]]!null!!!null!!]]!null!!!null!!]]]!null!!!null!!!null!!!null!!!null!!]]!null!!!null!!]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!null!]!!nullnullnull!]!!nullnull!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!null!]!!nullnullnull!]!!nullnull!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!null!]!!nullnullnull!]!!nullnull!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!null!]!!nullnullnull!]!!nullnull!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!null!]!!nullnullnull!]!!nullnull!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!null!]!!nullnullnull!]!!nullnull!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!null!]!!nullnullnull!]!!nullnull!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!null!]!!nullnullnull!]!!nullnull!" + "'", str2, "!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!null!]!!nullnullnull!]!!nullnull!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!null!]!!nullnullnull!]!!nullnull!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!null!]!!nullnullnull!]!!nullnull!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!null!]!!nullnullnull!]!!nullnull!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!null!]!!nullnullnull!]!!nullnull!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!null!]!!nullnullnull!]!!nullnull!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!null!]!!nullnullnull!]!!nullnull!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!null!]!!nullnullnull!]!!nullnull!");
    }

    @Test
    public void test03067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03067");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0318\u031a\u031a\u031a\u0318\u031a\u031a\u031a\u0318\u031a\u031a\u031a\u0318\u031a\u031a\u031a\u0318\u031a\u031a\u031a\u0318\u031a\u031a\u031a\u0318\u031a\u031a\u031a\u0318\u031a\u031a\u031a!", "lluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0318\u031a\u031a\u031a\u0318\u031a\u031a\u031a\u0318\u031a\u031a\u031a\u0318\u031a\u031a\u031a\u0318\u031a\u031a\u031a\u0318\u031a\u031a\u031a\u0318\u031a\u031a\u031a\u0318\u031a\u031a\u031a!" + "'", str2, "\u0318\u031a\u031a\u031a\u0318\u031a\u031a\u031a\u0318\u031a\u031a\u031a\u0318\u031a\u031a\u031a\u0318\u031a\u031a\u031a\u0318\u031a\u031a\u031a\u0318\u031a\u031a\u031a\u0318\u031a\u031a\u031a!");
    }

    @Test
    public void test03068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03068");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!", "LNNNLNNNNLNNNLNNLNNNLNNNNLNNNLNNLNNNLNNNNLNNNLNNLNNNLNNNNLNNNLNNLNNNLNNNNLNNNLNNLNNNLNNNNLNNNLNNLNNNLNNNNLNNNLNNLNNNLNNNNLNNNLNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!!NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!!NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!!NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!!NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!" + "'", str2, "NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!!NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!!NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!!NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!!NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!");
    }

    @Test
    public void test03069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03069");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\336nullnullnull\336nullnullnull!!\336nullnullnull\336nullnullnull!!\336nullnullnull\336nullnullnull!!\336nullnullnull\336nullnullnull!!\336nullnullnull\336nullnullnull!!\336nullnullnull\336nullnullnull!!\336nullnullnull\336nullnullnull!!\336nullnullnull\336nullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03070");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll!", "\u0346\u0348\u0348\u0348}~\200\200}~\200\200\u0126\u0128\u0128\u0126\u0128\u0128}~\200\200}~\200\200\u0126\u0128\u0128\u0126\u0128\u0128}~\200\200}~\200\200\u0126\u0128\u0128\u0126\u0128\u0128}~\200\200}~\200\200\u0126\u0128\u0128\u0126\u0128\u0128\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL!" + "'", str2, "\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL!");
    }

    @Test
    public void test03071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03071");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UU!!````````````UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!````````````UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!", "LLnullnullLLnullnullLLnullnullLLnullnullLLnullnullLLnullnullLLnullnullLLnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL!!````````````LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!````````````LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!" + "'", str2, "LL!!````````````LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!````````````LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!");
    }

    @Test
    public void test03072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03072");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226!!\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226!!!", "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226!!\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226!!!" + "'", str2, "\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226!!\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226!!!");
    }

    @Test
    public void test03073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03073");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!!!!!!!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!" + "'", str2, "!!!!!!!!!");
    }

    @Test
    public void test03074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03074");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!" + "'", str2, "\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!");
    }

    @Test
    public void test03075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03075");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\275UNLLUNLLUNLL\276UNLL\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03076");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!", "nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULL!" + "'", str2, "UULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULL!");
    }

    @Test
    public void test03077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03077");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246!", "\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\340\340!!\340\340!!nullnullnullnullnullnullnullnull\340\340!!\340\340!!nullnullnullnullnullnullnullnull\340\340!!\340\340!!nullnullnullnullnullnullnullnull\340\340!!\340\340!!nullnullnullnullnullnullnullnull\340\340!!\340\340!!nullnullnullnullnullnullnullnull\340\340!!\340\340!!nullnullnullnullnullnullnullnull\340\340!!\340\340!!nullnullnullnullnullnullnullnull\340\340!!\340\340!!nullnullnullnullnullnullnullnull!" + "'", str2, "\340\340!!\340\340!!nullnullnullnullnullnullnullnull\340\340!!\340\340!!nullnullnullnullnullnullnullnull\340\340!!\340\340!!nullnullnullnullnullnullnullnull\340\340!!\340\340!!nullnullnullnullnullnullnullnull\340\340!!\340\340!!nullnullnullnullnullnullnullnull\340\340!!\340\340!!nullnullnullnullnullnullnullnull\340\340!!\340\340!!nullnullnullnullnullnullnullnull\340\340!!\340\340!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03078");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!l!!\216\254\254!l!!\216\254\254!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!\216\254\254!l!!\216\254\254!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!\216\254\254!l!!\216\254\254!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!\216\254\254!l!!\216\254\254!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!\216\254\254!l!!\216\254\254!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!\216\254\254!l!!\216\254\254!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!\216\254\254!l!!\216\254\254!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!\216\254\254!l!!\216\254\254!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!!", "~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!!" + "'", str2, "\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!!");
    }

    @Test
    public void test03079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03079");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "XNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMM!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03080");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348!", "EEEEEEEEEEEEEEEE\200}}`EEEEEEEEEEEEEEEE]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
    }

    @Test
    public void test03081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03081");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!l\253\253!l\253\253!!!l\253\253!l\253\253!!!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!!!l\253\253!l\253\253!!!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!!!l\253\253!l\253\253!!!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!!!l\253\253!l\253\253!!!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!!!l\253\253!l\253\253!!!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!!!l\253\253!l\253\253!!!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!!!l\253\253!l\253\253!!!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!!!l\253\253!l\253\253!!!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!", "nullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnull\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!U\253\253!U\253\253!!!U\253\253!U\253\253!!!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!!!U\253\253!U\253\253!!!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!!!U\253\253!U\253\253!!!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!!!U\253\253!U\253\253!!!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!!!U\253\253!U\253\253!!!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!!!U\253\253!U\253\253!!!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!!!U\253\253!U\253\253!!!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!!!U\253\253!U\253\253!!!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!" + "'", str2, "!U\253\253!U\253\253!!!U\253\253!U\253\253!!!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!!!U\253\253!U\253\253!!!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!!!U\253\253!U\253\253!!!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!!!U\253\253!U\253\253!!!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!!!U\253\253!U\253\253!!!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!!!U\253\253!U\253\253!!!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!!!U\253\253!U\253\253!!!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!!!U\253\253!U\253\253!!!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!");
    }

    @Test
    public void test03082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03082");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\u0366\u0365\u0368\u0368\335\340\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03083");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0180\u0180\u0180\u0180nullnull\214\214\u0180\u0180\u0180\u0180nullnull\214\214\u0180\u0180\u0180\u0180nullnull\214\214\u0180\u0180\u0180\u0180nullnull\214\214\u0180\u0180\u0180\u0180nullnull\214\214\u0180\u0180\u0180\u0180nullnull\214\214\u0180\u0180\u0180\u0180nullnull\214\214\u0180\u0180\u0180\u0180nullnull\214\214!", "!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!!!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullLNUULNUUnullnullLNUULNUU\214\214nullnullLNUULNUUnullnullLNUULNUU\214\214nullnullLNUULNUUnullnullLNUULNUU\214\214nullnullLNUULNUUnullnullLNUULNUU\214\214nullnullLNUULNUUnullnullLNUULNUU\214\214nullnullLNUULNUUnullnullLNUULNUU\214\214nullnullLNUULNUUnullnullLNUULNUU\214\214nullnullLNUULNUUnullnullLNUULNUU\214\214!" + "'", str2, "nullnullLNUULNUUnullnullLNUULNUU\214\214nullnullLNUULNUUnullnullLNUULNUU\214\214nullnullLNUULNUUnullnullLNUULNUU\214\214nullnullLNUULNUUnullnullLNUULNUU\214\214nullnullLNUULNUUnullnullLNUULNUU\214\214nullnullLNUULNUUnullnullLNUULNUU\214\214nullnullLNUULNUUnullnullLNUULNUU\214\214nullnullLNUULNUUnullnullLNUULNUU\214\214!");
    }

    @Test
    public void test03084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03084");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull!", "null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320!" + "'", str2, "\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320!");
    }

    @Test
    public void test03085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03085");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!", "\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!" + "'", str2, "\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!");
    }

    @Test
    public void test03086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03086");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!!\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!!\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!!\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!!\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!", "FFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH!!\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH!!\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH!!\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH!!\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH!" + "'", str2, "\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH!!\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH!!\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH!!\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH!!\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH!");
    }

    @Test
    public void test03087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03087");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300!", "!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!" + "'", str2, "!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!");
    }

    @Test
    public void test03088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03088");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!T!!!T!!!!!T!!!T!!!!!T!!!T!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!", "~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!}!!!}!!!!!}!!!}!!!!!}!!!}!!!}!!!}!!!!!}!!!}!!!!!}!!!}!!!" + "'", str2, "!}!!!}!!!!!}!!!}!!!!!}!!!}!!!}!!!}!!!!!}!!!}!!!!!}!!!}!!!");
    }

    @Test
    public void test03089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03089");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "rqttrqttnullnullrqttrqttnullnull\225\225rqttrqttnullnullrqttrqttnullnull\225\225rqttrqttnullnullrqttrqttnullnull\225\225rqttrqttnullnullrqttrqttnullnull\225\225rqttrqttnullnullrqttrqttnullnull\225\225rqttrqttnullnullrqttrqttnullnull\225\225rqttrqttnullnullrqttrqttnullnull\225\225rqttrqttnullnullrqttrqttnullnull\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test03090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03090");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("efhhefhh!", "~}\200\200~}\200\200null}\200\200null}\200\200\230\230null}\200\200null}\200\200\230\230~}\200\200~}\200\200null}\200\200null}\200\200\230\230null}\200\200null}\200\200\230\230~}\200\200~}\200\200null}\200\200null}\200\200\230\230null}\200\200null}\200\200\230\230~}\200\200~}\200\200null}\200\200null}\200\200\230\230null}\200\200null}\200\200\230\230~}\200\200~}\200\200null}\200\200null}\200\200\230\230null}\200\200null}\200\200\230\230~}\200\200~}\200\200null}\200\200null}\200\200\230\230null}\200\200null}\200\200\230\230~}\200\200~}\200\200null}\200\200null}\200\200\230\230null}\200\200null}\200\200\230\230~}\200\200~}\200\200null}\200\200null}\200\200\230\230null}\200\200null}\200\200\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\200\230\230\200\200\230\230!" + "'", str2, "\200\200\230\230\200\200\230\230!");
    }

    @Test
    public void test03091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03091");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!", "~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u011b\u011e\u011e\u011e\u011b\u011e\u011e\u011e\u011b\u011e\u011e\u011e\u011b\u011e\u011e\u011e\u011b\u011e\u011e\u011e\u011b\u011e\u011e\u011e\u011b\u011e\u011e\u011e\u011b\u011e\u011e\u011e!" + "'", str2, "\u011b\u011e\u011e\u011e\u011b\u011e\u011e\u011e\u011b\u011e\u011e\u011e\u011b\u011e\u011e\u011e\u011b\u011e\u011e\u011e\u011b\u011e\u011e\u011e\u011b\u011e\u011e\u011e\u011b\u011e\u011e\u011e!");
    }

    @Test
    public void test03092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03092");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LL!!UULLUULLUULLLL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!UULLUULLUULLLL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!", "!!\256nullnull~~!nullnull~~nullnull~~\254\254\256nullnull~~!nullnull~~nullnull~~\254\254!!\256nullnull~~!nullnull~~nullnull~~\254\254\256nullnull~~!nullnull~~nullnull~~\254\254!!\256nullnull~~!nullnull~~nullnull~~\254\254\256nullnull~~!nullnull~~nullnull~~\254\254!!\256nullnull~~!nullnull~~nullnull~~\254\254\256nullnull~~!nullnull~~nullnull~~\254\254!!\256nullnull~~!nullnull~~nullnull~~\254\254\256nullnull~~!nullnull~~nullnull~~\254\254!!\256nullnull~~!nullnull~~nullnull~~\254\254\256nullnull~~!nullnull~~nullnull~~\254\254!!\256nullnull~~!nullnull~~nullnull~~\254\254\256nullnull~~!nullnull~~nullnull~~\254\254!!\256nullnull~~!nullnull~~nullnull~~\254\254\256nullnull~~!nullnull~~nullnull~~\254\254!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u026c\u026c\u026a\u026a\u026c\u026c\u026a\u026a\u026c\u026c\u026a\u026a\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026a\u026a\u026c\u026c\u026a\u026a\u026c\u026c\u026a\u026a\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c!!!" + "'", str2, "\u026c\u026c\u026a\u026a\u026c\u026c\u026a\u026a\u026c\u026c\u026a\u026a\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026a\u026a\u026c\u026c\u026a\u026a\u026c\u026c\u026a\u026a\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c!!!");
    }

    @Test
    public void test03093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03093");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull!", "xxuuxxuuxxuuxxuu!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU!" + "'", str2, "\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU!");
    }

    @Test
    public void test03094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03094");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!!" + "'", str2, "\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!!");
    }

    @Test
    public void test03095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03095");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276\336\266\266~\326\326\276\336\266\266~\326\326!!\276\336\266\266~\326\326\276\336\266\266~\326\326!!\276\336\266\266~\326\326\276\336\266\266~\326\326\276\336\266\266~\326\326\276\336\266\266~\326\326!!\276\336\266\266~\326\326\276\336\266\266~\326\326!!\276\336\266\266~\326\326\276\336\266\266~\326\326!", "\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276U\266\266~UU\276U\266\266~UU!!\276U\266\266~UU\276U\266\266~UU!!\276U\266\266~UU\276U\266\266~UU\276U\266\266~UU\276U\266\266~UU!!\276U\266\266~UU\276U\266\266~UU!!\276U\266\266~UU\276U\266\266~UU!" + "'", str2, "\276U\266\266~UU\276U\266\266~UU!!\276U\266\266~UU\276U\266\266~UU!!\276U\266\266~UU\276U\266\266~UU\276U\266\266~UU\276U\266\266~UU!!\276U\266\266~UU\276U\266\266~UU!!\276U\266\266~UU\276U\266\266~UU!");
    }

    @Test
    public void test03096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03096");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0nullnull!", "LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126!" + "'", str2, "\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126!");
    }

    @Test
    public void test03097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03097");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275}~\200\200}~\200\200}~\200\200\276}~\200\200\275\275!", "NLLLL]NNL]NNL]NNL]NNNLLLL]NNL]NN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275}~\200\200}~\200\200}~\200\200\276}~\200\200\275\275!" + "'", str2, "\275}~\200\200}~\200\200}~\200\200\276}~\200\200\275\275!");
    }

    @Test
    public void test03098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03098");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108!", "NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UULLUULL!" + "'", str2, "UULLUULL!");
    }

    @Test
    public void test03099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03099");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!", "LL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!" + "'", str2, "\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!");
    }

    @Test
    public void test03100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03100");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!u!", "l]lll]ll!!l]lll]ll!!l]lll]lll]lll]ll!!l]lll]ll!!l]lll]ll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!L!" + "'", str2, "!L!");
    }

    @Test
    public void test03101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03101");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NULLLNUULNUULNUULNUUNULLLNUULNUU!", "UULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\276\300\300\300null\276\276\300null\276\276\300null\276\276\300null\276\276null\276\300\300\300null\276\276\300null\276\276!" + "'", str2, "null\276\300\300\300null\276\276\300null\276\276\300null\276\276\300null\276\276null\276\300\300\300null\276\276\300null\276\276!");
    }

    @Test
    public void test03102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03102");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!", "nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!" + "'", str2, "LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!");
    }

    @Test
    public void test03103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03103");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```!", "nullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnull!!nullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnull!!nullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnull!!nullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnull!!nullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```!" + "'", str2, "LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```!");
    }

    @Test
    public void test03104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03104");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL!", "\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d!" + "'", str2, "\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d!");
    }

    @Test
    public void test03105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03105");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnull\200}}`nullnullnullnull]]!", "ZWXXZWXXZWXXZWXXZWXXZWXX!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "W!XXW!XXW!XXW!XX\200}}`W!XXW!XXW!XXW!XX]]!" + "'", str2, "W!XXW!XXW!XXW!XX\200}}`W!XXW!XXW!XXW!XX]]!");
    }

    @Test
    public void test03106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03106");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!", "\u0348~~\225\230\230\u0348~~\225\230\230\u0348~~\225\230\230\u0348~~\225\230\230\200\u0348~~\225\230\230\u0348~~\225\230\230\u0348~~\225\230\230\u0348~~\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03107");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn!!l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn!!!", "\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b!!!" + "'", str2, "\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b!!!");
    }

    @Test
    public void test03108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03108");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!", "!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!" + "'", str2, "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!");
    }

    @Test
    public void test03109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03109");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248nullnullnull!", "fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullEHHHEHHHEHHHnullnullnullnullEHHHEHHHEHHHnullnullnullnullEHHHEHHHEHHHnullnullnullnullEHHHEHHHEHHHnullnullnullnullEHHHEHHHEHHHnullnullnullnullEHHHEHHHEHHHnullnullnullnullEHHHEHHHEHHHnullnullnullnullEHHHEHHHEHHH!" + "'", str2, "nullnullnullnullEHHHEHHHEHHHnullnullnullnullEHHHEHHHEHHHnullnullnullnullEHHHEHHHEHHHnullnullnullnullEHHHEHHHEHHHnullnullnullnullEHHHEHHHEHHHnullnullnullnullEHHHEHHHEHHHnullnullnullnullEHHHEHHHEHHHnullnullnullnullEHHHEHHHEHHH!");
    }

    @Test
    public void test03110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03110");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0146\u0146\u0146\u0146\u0146\u0146\u0146\u0146\u0346\u0348\u0348!", "HHHHHHHH!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test03111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03111");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("ULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLL!", "hehhhehhhehhhehh!hehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehh!hehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehh!hehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehh!hehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehh!hehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehh!hehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehh!hehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehh!hehhhehhhehhhehhhehhhehhhehhhehh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!" + "'", str2, "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!");
    }

    @Test
    public void test03112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03112");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("RRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!!!!", "!!nullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!!!!" + "'", str2, "LLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!!!!");
    }

    @Test
    public void test03113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03113");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!", "~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!" + "'", str2, "!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!");
    }

    @Test
    public void test03114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03114");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("`ULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLL`ULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLL!", "\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL`NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!" + "'", str2, "`NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL`NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!");
    }

    @Test
    public void test03115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03115");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("`\253!!!\253!!!\253!!!`\253!!!\253!!!\253!!!!", "!\226!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`\253!!!\253!!!\253!!!`\253!!!\253!!!\253!!!!" + "'", str2, "`\253!!!\253!!!\253!!!`\253!!!\253!!!\253!!!!");
    }

    @Test
    public void test03116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03116");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!", "`UU!!UU!!UU!!`UU!!UU!!UU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!" + "'", str2, "]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!");
    }

    @Test
    public void test03117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03117");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NLUUNLUU!", "FHHHnullnullnullnullFHHHnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]`^^]`^^!" + "'", str2, "]`^^]`^^!");
    }

    @Test
    public void test03118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03118");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL!", "!]!!!]!!!!!]!!!]!!!!!]!!!]!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]!" + "'", str2, "\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]!");
    }

    @Test
    public void test03119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03119");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!", "LLUULLUULLUULLUULLUULLUULLUULLUULLLLUULLUULLUULLUULLUULLUULLUULLUULLLLUULLUULLUULLUULLUULLUULLUULLUULLLLUULLUULLUULLUULLUULLUULLUULLUULLLLUULLUULLUULLUULLUULLUULLUULLUULLLLUULLUULLUULLUULLUULLUULLUULLUULLLLUULLUULLUULLUULLUULLUULLUULLUULLLLUULLUULLUULLUULLUULLUULLUULLUULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!" + "'", str2, "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
    }

    @Test
    public void test03120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03120");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!!", "\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test03121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03121");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test03122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03122");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!!", "`\253!!!\253!!!\253!!!`\253!!!\253!!!\253!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test03123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03123");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NNNNNNNN!!NNNNNNNN!!NNNNNNNNNNNNNNNN!!NNNNNNNN!!NNNNNNNN!", "HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03124");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!", "ULLLULLL!!ULLLULLL!!ULLLULLLULLLULLL!!ULLLULLL!!ULLLULLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!" + "'", str2, "\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!");
    }

    @Test
    public void test03125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03125");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225!", "UUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullhnullnullnullhnullnullnullnullnullhnullnullnullhnullnullnullnull\225\225nullhnullnullnullhnullnullnullnullnullhnullnullnullhnullnullnullnull\225\225nullhnullnullnullhnullnullnullnullnullhnullnullnullhnullnullnullnull\225\225nullhnullnullnullhnullnullnullnullnullhnullnullnullhnullnullnullnull\225\225nullhnullnullnullhnullnullnullnullnullhnullnullnullhnullnullnullnull\225\225nullhnullnullnullhnullnullnullnullnullhnullnullnullhnullnullnullnull\225\225nullhnullnullnullhnullnullnullnullnullhnullnullnullhnullnullnullnull\225\225nullhnullnullnullhnullnullnullnullnullhnullnullnullhnullnullnullnull\225\225!" + "'", str2, "nullhnullnullnullhnullnullnullnullnullhnullnullnullhnullnullnullnull\225\225nullhnullnullnullhnullnullnullnullnullhnullnullnullhnullnullnullnull\225\225nullhnullnullnullhnullnullnullnullnullhnullnullnullhnullnullnullnull\225\225nullhnullnullnullhnullnullnullnullnullhnullnullnullhnullnullnullnull\225\225nullhnullnullnullhnullnullnullnullnullhnullnullnullhnullnullnullnull\225\225nullhnullnullnullhnullnullnullnullnullhnullnullnullhnullnullnullnull\225\225nullhnullnullnullhnullnullnullnullnullhnullnullnullhnullnullnullnull\225\225nullhnullnullnullhnullnullnullnullnullhnullnullnullhnullnullnullnull\225\225!");
    }

    @Test
    public void test03126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03126");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!!", "nullnullnullnull\200}}`nullnullnullnull]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!!" + "'", str2, "d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!!");
    }

    @Test
    public void test03127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03127");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("EHHHEHHHEHHHEHHHEHHHEHHHEHHHEHHH!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!" + "'", str2, "NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!");
    }

    @Test
    public void test03128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03128");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UNLLUNLLLLUNLLUNLLLL!!UNLLUNLLLLUNLLUNLLLL!!UNLLUNLLLLUNLLUNLLLL!!UNLLUNLLLLUNLLUNLLLL!!UNLLUNLLLLUNLLUNLLLL!!UNLLUNLLLLUNLLUNLLLL!!UNLLUNLLLLUNLLUNLLLL!!UNLLUNLLLLUNLLUNLLLL!!!" + "'", str2, "UNLLUNLLLLUNLLUNLLLL!!UNLLUNLLLLUNLLUNLLLL!!UNLLUNLLLLUNLLUNLLLL!!UNLLUNLLLLUNLLUNLLLL!!UNLLUNLLLLUNLLUNLLLL!!UNLLUNLLLLUNLLUNLLLL!!UNLLUNLLLLUNLLUNLLLL!!UNLLUNLLLLUNLLUNLLLL!!!");
    }

    @Test
    public void test03129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03129");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull!!nullnull!!nullnull!!nullnull!!null!!!null!!!null!!!null!!!nullnull!!nullnull!!nullnull!!nullnull!!null!!!null!!!!", "LLLLLLLLLLLLLLLLLLLLLLLLLLLL\200}}`LLLLLLLLLLLLLLLLLLLLLLLLLLLL]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLL!!!LLLL!!!LLLL!!!LLLL!!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLL!!!LLLL!!!!" + "'", str2, "LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLL!!!LLLL!!!LLLL!!!LLLL!!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLL!!!LLLL!!!!");
    }

    @Test
    public void test03130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03130");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!", "\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031anullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275!" + "'", str2, "\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275!");
    }

    @Test
    public void test03131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03131");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!!!!!!!!!!!!!!\254~\256\256\254~\256\256\254~\256\256\254~\256\256!", "\200E\220\220\200E\220\220\200E\220\220\200E\220\220\200E\220\220\200E\220\220\200E\220\220\200E\220\220!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!\254~\256\256\254~\256\256\254~\256\256\254~\256\256!" + "'", str2, "!!!!!!!!!!!!!!!!\254~\256\256\254~\256\256\254~\256\256\254~\256\256!");
    }

    @Test
    public void test03132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03132");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200!", "RRRRRRRR!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200!" + "'", str2, "~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200!");
    }

    @Test
    public void test03133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03133");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("H!\275\275H!\275\275HHH!\275\275H!\275\275HHH!\275\275H!\275\275HHH!\275\275H!\275\275HHH!\275\275H!\275\275HHH!\275\275H!\275\275HHH!\275\275H!\275\275HHH!\275\275H!\275\275HH!", "NN!!U`LLU`LLU`LLNN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!U`LLU`LLU`LLNN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnull!" + "'", str2, "null!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnull!");
    }

    @Test
    public void test03134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03134");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test03135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03135");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\351\354\354\354\351\354\354\354\351\354\354\354\351\354\354\354\200}}`\351\354\354\354\351\354\354\354\351\354\354\354\351\354\354\354]]!", "nullnullnullnullnullnullnullnull!!\276\276!!\276\276nullnullnullnullnullnullnullnull!!\276\276!!\276\276nullnullnullnullnullnullnullnull!!\276\276!!\276\276nullnullnullnullnullnullnullnull!!\276\276!!\276\276nullnullnullnullnullnullnullnull!!\276\276!!\276\276nullnullnullnullnullnullnullnull!!\276\276!!\276\276nullnullnullnullnullnullnullnull!!\276\276!!\276\276nullnullnullnullnullnullnullnull!!\276\276!!\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test03136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03136");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0170null!", "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\200}}`LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0264\u0264!" + "'", str2, "\u0264\u0264!");
    }

    @Test
    public void test03137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03137");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!~lnulluulnulluu!~lnulluulnulluu!!!~lnulluulnulluu!~lnulluulnulluu!!!~lnulluulnulluu!~lnulluulnulluu!~lnulluulnulluu!~lnulluulnulluu!!!~lnulluulnulluu!~lnulluulnulluu!!!~lnulluulnulluu!~lnulluulnulluu!", "!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03138");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!", "EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH\200}}`EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!!EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!!EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!!EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!!EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!" + "'", str2, "EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!!EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!!EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!!EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!!EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!");
    }

    @Test
    public void test03139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03139");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\216\254\254\254\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\216\254\254\254\u0348\u0346\u0346!");
    }

    @Test
    public void test03140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03140");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UU]]UU]]LUUULUUUUU]]UU]]LUUULUUU!", "\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull]]nullnull]]nullnullnullnullnullnullnullnullnullnull]]nullnull]]nullnullnullnullnullnullnullnull!" + "'", str2, "nullnull]]nullnull]]nullnullnullnullnullnullnullnullnullnull]]nullnull]]nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03141");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200\336\336LL\336\336LL~}\200\200~}\200\200\336\336LL\336\336LL~}\200\200~}\200\200\336\336LL\336\336LL~}\200\200~}\200\200\336\336LL\336\336LL~}\200\200~}\200\200\336\336LL\336\336LL~}\200\200~}\200\200\336\336LL\336\336LL~}\200\200~}\200\200\336\336LL\336\336LL~}\200\200~}\200\200\336\336LL\336\336LL!", "eeee\220eeeeeeee\200~~eeee\220eeeeeeee\200~~eeee\220eeeeeeeeeeee\220eeeeeeeeeeee\220eeeeeeee\200~~eeee\220eeeeeeee\200~~eeee\220eeeeeeeeeeee\220eeeeeeee!!eeee\220eeeeeeee\200~~eeee\220eeeeeeee\200~~eeee\220eeeeeeeeeeee\220eeeeeeeeeeee\220eeeeeeee\200~~eeee\220eeeeeeee\200~~eeee\220eeeeeeeeeeee\220eeeeeeee!!eeee\220eeeeeeee\200~~eeee\220eeeeeeee\200~~eeee\220eeeeeeeeeeee\220eeeeeeeeeeee\220eeeeeeee\200~~eeee\220eeeeeeee\200~~eeee\220eeeeeeeeeeee\220eeeeeeeeeeee\220eeeeeeee\200~~eeee\220eeeeeeee\200~~eeee\220eeeeeeeeeeee\220eeeeeeeeeeee\220eeeeeeee\200~~eeee\220eeeeeeee\200~~eeee\220eeeeeeeeeeee\220eeeeeeee!!eeee\220eeeeeeee\200~~eeee\220eeeeeeee\200~~eeee\220eeeeeeeeeeee\220eeeeeeeeeeee\220eeeeeeee\200~~eeee\220eeeeeeee\200~~eeee\220eeeeeeeeeeee\220eeeeeeee!!eeee\220eeeeeeee\200~~eeee\220eeeeeeee\200~~eeee\220eeeeeeeeeeee\220eeeeeeeeeeee\220eeeeeeee\200~~eeee\220eeeeeeee\200~~eeee\220eeeeeeeeeeee\220eeeeeeee!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE!" + "'", str2, "~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE!");
    }

    @Test
    public void test03142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03142");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\200!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\200!" + "'", str2, "!\200!");
    }

    @Test
    public void test03143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03143");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200!", "nullnullnullnull\225\230\230nullnullnullnull\225\230\230nullnullnullnull\225\230\230nullnullnullnull\225\230\230\200}}`nullnullnullnull\225\230\230nullnullnullnull\225\230\230nullnullnullnull\225\230\230nullnullnullnull\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200!" + "'", str2, "~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200!");
    }

    @Test
    public void test03144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03144");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275XXX\275XXX!", "\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullnull\275nullnullnull!" + "'", str2, "\275nullnullnull\275nullnullnull!");
    }

    @Test
    public void test03145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03145");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!!", "LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLL!!!LLLL!!!LLLL!!!LLLL!!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLL!!!LLLL!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!" + "'", str2, "LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!");
    }

    @Test
    public void test03146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03146");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!!", "!\253\256\256\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!" + "'", str2, "!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!");
    }

    @Test
    public void test03147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03147");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!!!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!!!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!!!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!!!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!", "\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348!!\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348!!\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348!!\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348!!\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!" + "'", str2, "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!");
    }

    @Test
    public void test03148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03148");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!", "\u0366\u0365\u0368\u0368nullnull\204\204nullnullnullnullnull\204\204nullnullnull!!nullnull\204\204nullnullnullnullnull\204\204nullnullnull!!nullnull\204\204nullnullnullnullnull\204\204nullnullnull!!nullnull\204\204nullnullnullnullnull\204\204\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!" + "'", str2, "LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!");
    }

    @Test
    public void test03149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03149");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL!", "}~\200\200}~\200\200ULLL^ULLLULLLULLL^ULLLULLL}~\200\200}~\200\200ULLL^ULLLULLLULLL^ULLLULLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204!" + "'", str2, "null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204!");
    }

    @Test
    public void test03150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03150");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull!!\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull!!\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull!!\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull!!\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull!", "\u026c\u026c\u026a\u026a\u026c\u026c\u026a\u026a\u026c\u026c\u026a\u026a\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026a\u026a\u026c\u026c\u026a\u026a\u026c\u026c\u026a\u026a\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03151");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnullnullnullnullnull!", "l!uul!uul!uul!uul!uul!uul!uul!uu!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\200}}null\200}}null\200}}null\200}}null\200}}null\200}}null\200}}null\200}}!" + "'", str2, "null\200}}null\200}}null\200}}null\200}}null\200}}null\200}}null\200}}null\200}}!");
    }

    @Test
    public void test03152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03152");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]]uluuuluu]]uluuuluu!!]]uluuuluu]]uluuuluu!!]]uluuuluu]]uluuuluu]]uluuuluu]]uluuuluu!!]]uluuuluu]]uluuuluu!!]]uluuuluu]]uluuuluu!", "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c!" + "'", str2, "\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c!");
    }

    @Test
    public void test03153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03153");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03154");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null\335\340\340null\335\340\340null\335\340\340null\335\340\340null\335\340\340null\335\340\340null\335\340\340null\335\340\340!", "null~}}^null]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ijllnullnullnullijllnullnullnullijllnullnullnullijllnullnullnullijllnullnullnullijllnullnullnullijllnullnullnullijllnullnullnull!" + "'", str2, "ijllnullnullnullijllnullnullnullijllnullnullnullijllnullnullnullijllnullnullnullijllnullnullnullijllnullnullnullijllnullnullnull!");
    }

    @Test
    public void test03155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03155");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!!", "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254!!NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254!!NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254!!NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254!!NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254!!NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254!!NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254!!NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254!!!" + "'", str2, "NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254!!NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254!!NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254!!NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254!!NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254!!NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254!!NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254!!NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254!!!");
    }

    @Test
    public void test03156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03156");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("fehhfehh!", "FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0126\u0128\u0128\u0126\u0128\u0128!" + "'", str2, "\u0126\u0128\u0128\u0126\u0128\u0128!");
    }

    @Test
    public void test03157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03157");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]]HH]]HH!!]]HH]]HH!!]]HH]]HH]]HH]]HH!!]]HH]]HH!!]]HH]]HH!", "\u0368\u0368\u0368\u0368!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]!!]]!!!!]]!!]]!!!!]]!!]]!!]]!!]]!!!!]]!!]]!!!!]]!!]]!!!" + "'", str2, "]]!!]]!!!!]]!!]]!!!!]]!!]]!!]]!!]]!!!!]]!!]]!!!!]]!!]]!!!");
    }

    @Test
    public void test03158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03158");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!!", "~}\200\200~}\200\200null}\200\200null}\200\200\230\230null}\200\200null}\200\200\230\230~}\200\200~}\200\200null}\200\200null}\200\200\230\230null}\200\200null}\200\200\230\230~}\200\200~}\200\200null}\200\200null}\200\200\230\230null}\200\200null}\200\200\230\230~}\200\200~}\200\200null}\200\200null}\200\200\230\230null}\200\200null}\200\200\230\230~}\200\200~}\200\200null}\200\200null}\200\200\230\230null}\200\200null}\200\200\230\230~}\200\200~}\200\200null}\200\200null}\200\200\230\230null}\200\200null}\200\200\230\230~}\200\200~}\200\200null}\200\200null}\200\200\230\230null}\200\200null}\200\200\230\230~}\200\200~}\200\200null}\200\200null}\200\200\230\230null}\200\200null}\200\200\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!!" + "'", str2, "]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!!");
    }

    @Test
    public void test03159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03159");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!!", "nullnullnullnull\254~\256\256\254~\256\256\254~\256\256\254~\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mnppmnppmnppmnppmnppmnppmnppmnpp!!mnppmnppmnppmnppmnppmnppmnppmnpp!!!!mnppmnppmnppmnppmnppmnppmnppmnpp!!mnppmnppmnppmnppmnppmnppmnppmnpp!!!!mnppmnppmnppmnppmnppmnppmnppmnpp!!mnppmnppmnppmnppmnppmnppmnppmnpp!!!!mnppmnppmnppmnppmnppmnppmnppmnpp!!mnppmnppmnppmnppmnppmnppmnppmnpp!!!!mnppmnppmnppmnppmnppmnppmnppmnpp!!mnppmnppmnppmnppmnppmnppmnppmnpp!!!!mnppmnppmnppmnppmnppmnppmnppmnpp!!mnppmnppmnppmnppmnppmnppmnppmnpp!!!!mnppmnppmnppmnppmnppmnppmnppmnpp!!mnppmnppmnppmnppmnppmnppmnppmnpp!!!!mnppmnppmnppmnppmnppmnppmnppmnpp!!mnppmnppmnppmnppmnppmnppmnppmnpp!!!!!" + "'", str2, "mnppmnppmnppmnppmnppmnppmnppmnpp!!mnppmnppmnppmnppmnppmnppmnppmnpp!!!!mnppmnppmnppmnppmnppmnppmnppmnpp!!mnppmnppmnppmnppmnppmnppmnppmnpp!!!!mnppmnppmnppmnppmnppmnppmnppmnpp!!mnppmnppmnppmnppmnppmnppmnppmnpp!!!!mnppmnppmnppmnppmnppmnppmnppmnpp!!mnppmnppmnppmnppmnppmnppmnppmnpp!!!!mnppmnppmnppmnppmnppmnppmnppmnpp!!mnppmnppmnppmnppmnppmnppmnppmnpp!!!!mnppmnppmnppmnppmnppmnppmnppmnpp!!mnppmnppmnppmnppmnppmnppmnppmnpp!!!!mnppmnppmnppmnppmnppmnppmnppmnpp!!mnppmnppmnppmnppmnppmnppmnppmnpp!!!!mnppmnppmnppmnppmnppmnppmnppmnpp!!mnppmnppmnppmnppmnppmnppmnppmnpp!!!!!");
    }

    @Test
    public void test03160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03160");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300!", "II!!II!!II!!II!!II!!II!!II!!II!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03161");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\200~\200\200\200~\200\200!!\200~\200\200\200~\200\200!!\200~\200\200\200~\200\200\200~\200\200\200~\200\200!!\200~\200\200\200~\200\200!!\200~\200\200\200~\200\200!", "\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200~\200\200\200~\200\200!!\200~\200\200\200~\200\200!!\200~\200\200\200~\200\200\200~\200\200\200~\200\200!!\200~\200\200\200~\200\200!!\200~\200\200\200~\200\200!" + "'", str2, "\200~\200\200\200~\200\200!!\200~\200\200\200~\200\200!!\200~\200\200\200~\200\200\200~\200\200\200~\200\200!!\200~\200\200\200~\200\200!!\200~\200\200\200~\200\200!");
    }

    @Test
    public void test03162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03162");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULL!", "NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!" + "'", str2, "NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!");
    }

    @Test
    public void test03163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03163");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NN!!NN!!!!NN!!NN!!!!NN!!NN!!!!NN!!NN!!!!NN!!NN!!!!NN!!NN!!!!NN!!NN!!!!NN!!NN!!!!!", "\u01c8\u01c5\u01c5\u01c5\u01c8\u01c5\u01c5\u01c5!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!" + "'", str2, "nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!");
    }

    @Test
    public void test03164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03164");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE!", "\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246!!!```!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!!" + "'", str2, "~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!!");
    }

    @Test
    public void test03165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03165");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullUNLL!", "\u0366\u0365\u0368\u0368\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u029e\u0346\u0346\ua7b0!!!" + "'", str2, "\u029e\u0346\u0346\ua7b0!!!");
    }

    @Test
    public void test03166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03166");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("l!uul!uul!uul!uul!uul!uul!uul!uu!", "\u014f!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!" + "'", str2, "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
    }

    @Test
    public void test03167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03167");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH!", "l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN!" + "'", str2, "L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN!");
    }

    @Test
    public void test03168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03168");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d!", "N\254NNN\254NNN\254NNN\254NN!N\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NN!N\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NN!N\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NN!N\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NN!N\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NN!N\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NN!N\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NN!N\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NN!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!" + "'", str2, "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test03169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03169");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test03170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03170");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null\200}}`null]]!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348l!!\200\u0348l!!]]!" + "'", str2, "\u0348l!!\200\u0348l!!]]!");
    }

    @Test
    public void test03171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03171");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de!!!", "}~\200\200}~\200\200U^LLU^LL}~\200\200}~\200\200U^LLU^LL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test03172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03172");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!", "nullnull!!nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!" + "'", str2, "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!");
    }

    @Test
    public void test03173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03173");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!!!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03174");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]AAAAA]]AA]]AA]]AA]]]AAAAA]]AA]]!", "!NLL!NLL!!!NLL!NLL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]nullnullnullnullnull]]nullnull]]nullnull]]nullnull]]]nullnullnullnullnull]]nullnull]]!" + "'", str2, "]nullnullnullnullnull]]nullnull]]nullnull]]nullnull]]]nullnullnullnullnull]]nullnull]]!");
    }

    @Test
    public void test03175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03175");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\254\254\254\254\u0346\u0348\u0348!", "!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\254\254\254\254\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\254\254\254\254\u0346\u0348\u0348!");
    }

    @Test
    public void test03176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03176");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!~UU!~UU\220\220!~UU!~UU\220\220\220!~UU\220\220\220!~UU\220\220\220!~UU\220\220\220!~UU\220\220!~UU!~UU\220\220!~UU!~UU\220\220!", "hhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~HH!~HH\220\220!~HH!~HH\220\220\220!~HH\220\220\220!~HH\220\220\220!~HH\220\220\220!~HH\220\220!~HH!~HH\220\220!~HH!~HH\220\220!" + "'", str2, "!~HH!~HH\220\220!~HH!~HH\220\220\220!~HH\220\220\220!~HH\220\220\220!~HH\220\220\220!~HH\220\220!~HH!~HH\220\220!~HH!~HH\220\220!");
    }

    @Test
    public void test03177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03177");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!!!!!!!!!!!!!!!!!!!!", "nullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test03178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03178");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!", "!!oprroprroprroprroprroprroprroprr!!oprroprroprroprroprroprroprroprr!!oprroprroprroprroprroprroprroprr!!oprroprroprroprroprroprroprroprr!!oprroprroprroprroprroprroprroprr!!oprroprroprroprroprroprroprroprr!!oprroprroprroprroprroprroprroprr!!oprroprroprroprroprroprroprroprr!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!" + "'", str2, "\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!");
    }

    @Test
    public void test03179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03179");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!!!!!!!", "HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!" + "'", str2, "!!!!!!!!!");
    }

    @Test
    public void test03180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03180");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!~LL!!!!~LL!!!!!!~LL!!!!~LL!!!!!!~LL!!!!~LL!!!!~LL!!!!~LL!!!!!!~LL!!!!~LL!!!!!!~LL!!!!~LL!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!~nullnull!!!!~nullnull!!!!!!~nullnull!!!!~nullnull!!!!!!~nullnull!!!!~nullnull!!!!~nullnull!!!!~nullnull!!!!!!~nullnull!!!!~nullnull!!!!!!~nullnull!!!!~nullnull!!!" + "'", str2, "!!~nullnull!!!!~nullnull!!!!!!~nullnull!!!!~nullnull!!!!!!~nullnull!!!!~nullnull!!!!~nullnull!!!!~nullnull!!!!!!~nullnull!!!!~nullnull!!!!!!~nullnull!!!!~nullnull!!!");
    }

    @Test
    public void test03181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03181");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!!" + "'", str2, "\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!!");
    }

    @Test
    public void test03182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03182");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("L\335LLL\335LL!!L\335LLL\335LL!!L\335LLL\335LLL\335LLL\335LL!!L\335LLL\335LL!!L\335LLL\335LL!", "~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03183");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!~\200null~~\200null~~!~\200null~~\200null~~!!!~\200null~~\200null~~!~\200null~~\200null~~!!!~\200null~~\200null~~!~\200null~~\200null~~!~\200null~~\200null~~!~\200null~~\200null~~!!!~\200null~~\200null~~!~\200null~~\200null~~!!!~\200null~~\200null~~!~\200null~~\200null~~!", "}~\200\200}~\200\200FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF}~\200\200}~\200\200FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~\200FFFF~~\200FFFF~~!~\200FFFF~~\200FFFF~~!!!~\200FFFF~~\200FFFF~~!~\200FFFF~~\200FFFF~~!!!~\200FFFF~~\200FFFF~~!~\200FFFF~~\200FFFF~~!~\200FFFF~~\200FFFF~~!~\200FFFF~~\200FFFF~~!!!~\200FFFF~~\200FFFF~~!~\200FFFF~~\200FFFF~~!!!~\200FFFF~~\200FFFF~~!~\200FFFF~~\200FFFF~~!" + "'", str2, "!~\200FFFF~~\200FFFF~~!~\200FFFF~~\200FFFF~~!!!~\200FFFF~~\200FFFF~~!~\200FFFF~~\200FFFF~~!!!~\200FFFF~~\200FFFF~~!~\200FFFF~~\200FFFF~~!~\200FFFF~~\200FFFF~~!~\200FFFF~~\200FFFF~~!!!~\200FFFF~~\200FFFF~~!~\200FFFF~~\200FFFF~~!!!~\200FFFF~~\200FFFF~~!~\200FFFF~~\200FFFF~~!");
    }

    @Test
    public void test03184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03184");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\300\276\276\275\300\276\276!", "``!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275!\276\276\275!\276\276!" + "'", str2, "\275!\276\276\275!\276\276!");
    }

    @Test
    public void test03185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03185");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!~HH!~HH\220\220!~HH!~HH\220\220\220!~HH\220\220\220!~HH\220\220\220!~HH\220\220\220!~HH\220\220!~HH!~HH\220\220!~HH!~HH\220\220!", "\u0366\u0365\u0368\u0368\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~!!!~!!\220\220!~!!!~!!\220\220\220!~!!\220\220\220!~!!\220\220\220!~!!\220\220\220!~!!\220\220!~!!!~!!\220\220!~!!!~!!\220\220!" + "'", str2, "!~!!!~!!\220\220!~!!!~!!\220\220\220!~!!\220\220\220!~!!\220\220\220!~!!\220\220\220!~!!\220\220!~!!!~!!\220\220!~!!!~!!\220\220!");
    }

    @Test
    public void test03186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03186");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("`ULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLL`ULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLL!", "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180!" + "'", str2, "\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180!");
    }

    @Test
    public void test03187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03187");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UU]]UU]]LUUULUUUUU]]UU]]LUUULUUU!", "NLLL\200}}`NLLL]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull]]nullnull]]LnullnullnullLnullnullnullnullnull]]nullnull]]LnullnullnullLnullnullnull!" + "'", str2, "nullnull]]nullnull]]LnullnullnullLnullnullnullnullnull]]nullnull]]LnullnullnullLnullnullnull!");
    }

    @Test
    public void test03188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03188");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("efhhefhhefhhefhhefhhefhhefhhefhh!", "!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03189");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null~}}^null]]!", "N~~~N~~~N~~~N~~~N~~~N~~~N~~~N~~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}nullnullnull~}}^}nullnullnull]]!" + "'", str2, "}nullnullnull~}}^}nullnullnull]]!");
    }

    @Test
    public void test03190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03190");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u03c0\u03c0\u03be\u03be\u03c0\u03c0\u03be\u03be\u03c0\u03c0\u03be\u03be\u03c0\u03c0\u03be\u03be}}!", "!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!" + "'", str2, "nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!");
    }

    @Test
    public void test03191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03191");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\u029e\u0346\u0346\ua7b0!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03192");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHH!", "NULLNULL!!NULLNULL!!NULLNULLNULLNULL!!NULLNULL!!NULLNULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ULLLULLLULLLULLLULLLULLLULLLULLL!" + "'", str2, "ULLLULLLULLLULLLULLLULLLULLLULLL!");
    }

    @Test
    public void test03193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03193");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "\253\254\256\256\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!!!\253\254\256\256\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03194");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullBBnullnullBB!", "!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03195");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230\200}}`l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230]]!", "\340nullnullnullnullnull\300\300nullnull\300\300!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230\200}}`U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230]]!" + "'", str2, "U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230\200}}`U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230]]!");
    }

    @Test
    public void test03196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03196");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("FF!!FF!!!", "\275!!!\275!!!\275!!!\275!!!!!\275\275!!\275\275!!\275\275!!\275\275\275!!!\275!!!\275!!!\275!!!!!\275\275!!\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!!");
    }

    @Test
    public void test03197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03197");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!!", "NLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e!!!" + "'", str2, "\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e!!!");
    }

    @Test
    public void test03198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03198");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("RRPPRRPPnullP\214\214nullP\214\214RRPPRRPPnullP\214\214nullP\214\214RRPPRRPPnullP\214\214nullP\214\214RRPPRRPPnullP\214\214nullP\214\214RRPPRRPPnullP\214\214nullP\214\214RRPPRRPPnullP\214\214nullP\214\214RRPPRRPPnullP\214\214nullP\214\214RRPPRRPPnullP\214\214nullP\214\214!", "\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0262\214\214\u0264\u0264\u0262\u0262\u0262\214\214\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0262\214\214\u0264\u0264\u0262\u0262\u0262\214\214\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0262\214\214\u0264\u0264\u0262\u0262\u0262\214\214\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0262\214\214\u0264\u0264\u0262\u0262\u0262\214\214\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0262\214\214\u0264\u0264\u0262\u0262\u0262\214\214\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0262\214\214\u0264\u0264\u0262\u0262\u0262\214\214\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0262\214\214\u0264\u0264\u0262\u0262\u0262\214\214\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0262\214\214\u0264\u0264\u0262\u0262\u0262\214\214!" + "'", str2, "\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0262\214\214\u0264\u0264\u0262\u0262\u0262\214\214\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0262\214\214\u0264\u0264\u0262\u0262\u0262\214\214\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0262\214\214\u0264\u0264\u0262\u0262\u0262\214\214\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0262\214\214\u0264\u0264\u0262\u0262\u0262\214\214\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0262\214\214\u0264\u0264\u0262\u0262\u0262\214\214\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0262\214\214\u0264\u0264\u0262\u0262\u0262\214\214\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0262\214\214\u0264\u0264\u0262\u0262\u0262\214\214\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0262\214\214\u0264\u0264\u0262\u0262\u0262\214\214!");
    }

    @Test
    public void test03199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03199");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test03200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03200");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03201");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!!" + "'", str2, "HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!!");
    }

    @Test
    public void test03202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03202");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("HHHHHHHH!", "nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03203");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276\276\271\271\276\276\271\271\276\276\271\271\276\276\271\271\276\276\271\271\276\276\271\271\276\276\271\271\276\276\271\271!", "!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276\271\271\276\276\271\271\276\276\271\271\276\276\271\271\276\276\271\271\276\276\271\271\276\276\271\271\276\276\271\271!" + "'", str2, "\276\276\271\271\276\276\271\271\276\276\271\271\276\276\271\271\276\276\271\271\276\276\271\271\276\276\271\271\276\276\271\271!");
    }

    @Test
    public void test03204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03204");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!", "U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230\200}}`U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259!" + "'", str2, "\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259!");
    }

    @Test
    public void test03205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03205");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NLNNNLNNnullN\214\214nullN\214\214NLNNNLNNnullN\214\214nullN\214\214NLNNNLNNnullN\214\214nullN\214\214NLNNNLNNnullN\214\214nullN\214\214NLNNNLNNnullN\214\214nullN\214\214NLNNNLNNnullN\214\214nullN\214\214NLNNNLNNnullN\214\214nullN\214\214NLNNNLNNnullN\214\214nullN\214\214!", "LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ULUUULUULUUUU\214\214LUUUU\214\214ULUUULUULUUUU\214\214LUUUU\214\214ULUUULUULUUUU\214\214LUUUU\214\214ULUUULUULUUUU\214\214LUUUU\214\214ULUUULUULUUUU\214\214LUUUU\214\214ULUUULUULUUUU\214\214LUUUU\214\214ULUUULUULUUUU\214\214LUUUU\214\214ULUUULUULUUUU\214\214LUUUU\214\214!" + "'", str2, "ULUUULUULUUUU\214\214LUUUU\214\214ULUUULUULUUUU\214\214LUUUU\214\214ULUUULUULUUUU\214\214LUUUU\214\214ULUUULUULUUUU\214\214LUUUU\214\214ULUUULUULUUUU\214\214LUUUU\214\214ULUUULUULUUUU\214\214LUUUU\214\214ULUUULUULUUUU\214\214LUUUU\214\214ULUUULUULUUUU\214\214LUUUU\214\214!");
    }

    @Test
    public void test03206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03206");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!}!!!}!!!!!}!!!}!!!!!}!!!}!!!}!!!}!!!!!}!!!}!!!!!}!!!}!!!", "\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!}!!!}!!!!!}!!!}!!!!!}!!!}!!!}!!!}!!!!!}!!!}!!!!!}!!!}!!!" + "'", str2, "!}!!!}!!!!!}!!!}!!!!!}!!!}!!!}!!!}!!!!!}!!!}!!!!!}!!!}!!!");
    }

    @Test
    public void test03207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03207");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("XXXXXXXXXXXXXXXX\200}}`XXXXXXXXXXXXXXXX]]!", "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLL\200}}`LLLLLLLLLLLLLLLL]]!" + "'", str2, "LLLLLLLLLLLLLLLL\200}}`LLLLLLLLLLLLLLLL]]!");
    }

    @Test
    public void test03208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03208");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("porrporrporrporrporrporrporrporrporrporrnullnullporrporrnullnullporrporrporrporrporrporrporrporrporrporrnullnullporrporrnullnullporrporrporrporrporrporrporrporrporrporrnullnullporrporrnullnullporrporrporrporrporrporrporrporrporrporrnullnullporrporrnullnullporrporrporrporrporrporrporrporrporrporrnullnullporrporrnullnullporrporrporrporrporrporrporrporrporrporrnullnullporrporrnullnullporrporrporrporrporrporrporrporrporrporrnullnullporrporrnullnullporrporrporrporrporrporrporrporrporrporrnullnullporrporrnullnull!", "\u0317\u031a\u0317\u031a\u0317\u031a\u0317\u031anullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a!" + "'", str2, "\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a!");
    }

    @Test
    public void test03209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03209");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!!!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!!!", "~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e!!!" + "'", str2, "\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e!!!");
    }

    @Test
    public void test03210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03210");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226!", "P\220NN\200}}`P\220NN]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226!" + "'", str2, "\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226!");
    }

    @Test
    public void test03211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03211");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!!", "\200\200\230\230\200\200\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!!" + "'", str2, "nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!!");
    }

    @Test
    public void test03212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03212");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("W!XXW!XXW!XXW!XX\200}}`W!XXW!XXW!XXW!XX]]!", "\276!!!\276\276!!\276\276!!\276\276!!\276\276!!\276!!!\276\276!!\276\276!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnull!nullnullnull!nullnull\200}}`null!nullnullnull!nullnullnull!nullnullnull!nullnull]]!" + "'", str2, "null!nullnullnull!nullnullnull!nullnullnull!nullnull\200}}`null!nullnullnull!nullnullnull!nullnullnull!nullnull]]!");
    }

    @Test
    public void test03213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03213");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!", "}~\200\200}~\200\200nullnull}~\200\200}~\200\200nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03214");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}~\200\200}~\200\200ULLL^ULLLULLLULLL^ULLLULLL}~\200\200}~\200\200ULLL^ULLLULLLULLL^ULLLULLL!", "\276\276\271\271\276\276\271\271\276\276\271\271\276\276\271\271\276\276\271\271\276\276\271\271\276\276\271\271\276\276\271\271!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200\276\271\271\271^\276\271\271\271\276\271\271\271\276\271\271\271^\276\271\271\271\276\271\271\271}~\200\200}~\200\200\276\271\271\271^\276\271\271\271\276\271\271\271\276\271\271\271^\276\271\271\271\276\271\271\271!" + "'", str2, "}~\200\200}~\200\200\276\271\271\271^\276\271\271\271\276\271\271\271\276\271\271\271^\276\271\271\271\276\271\271\271}~\200\200}~\200\200\276\271\271\271^\276\271\271\271\276\271\271\271\276\271\271\271^\276\271\271\271\276\271\271\271!");
    }

    @Test
    public void test03215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03215");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "!!XX!!XX!!!!XX!!XX!!!!XX!!XX!!!!XX!!XX!!!!XX!!XX!!!!XX!!XX!!!!XX!!XX!!!!XX!!XX!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03216");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test03217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03217");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276U\266\266~UU\276U\266\266~UU!!\276U\266\266~UU\276U\266\266~UU!!\276U\266\266~UU\276U\266\266~UU\276U\266\266~UU\276U\266\266~UU!!\276U\266\266~UU\276U\266\266~UU!!\276U\266\266~UU\276U\266\266~UU!", "hh!!hh!!!!hh!!hh!!!!hh!!hh!!!!hh!!hh!!!!hh!!hh!!!!hh!!hh!!!!hh!!hh!!!!hh!!hh!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!" + "'", str2, "\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!");
    }

    @Test
    public void test03218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03218");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("T!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TT!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!" + "'", str2, "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
    }

    @Test
    public void test03219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03219");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "]AAAAA]]AA]]AA]]AA]]]AAAAA]]AA]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03220");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226!!UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226!!!", "\352\356\356\356\352\356\356\356\352\356\356\356\352\356\356\356\200}}`\352\356\356\356\352\356\356\356\352\356\356\356\352\356\356\356]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\312\316\316\316\230\226\226\312\316\316\316\230\226\226\312\316\316\316\230\226\226\312\316\316\316\230\226\226\312\316\316\316\230\226\226\312\316\316\316\230\226\226\312\316\316\316\230\226\226\312\316\316\316\230\226\226!!\312\316\316\316\230\226\226\312\316\316\316\230\226\226\312\316\316\316\230\226\226\312\316\316\316\230\226\226\312\316\316\316\230\226\226\312\316\316\316\230\226\226\312\316\316\316\230\226\226\312\316\316\316\230\226\226!!!" + "'", str2, "\312\316\316\316\230\226\226\312\316\316\316\230\226\226\312\316\316\316\230\226\226\312\316\316\316\230\226\226\312\316\316\316\230\226\226\312\316\316\316\230\226\226\312\316\316\316\230\226\226\312\316\316\316\230\226\226!!\312\316\316\316\230\226\226\312\316\316\316\230\226\226\312\316\316\316\230\226\226\312\316\316\316\230\226\226\312\316\316\316\230\226\226\312\316\316\316\230\226\226\312\316\316\316\230\226\226\312\316\316\316\230\226\226!!!");
    }

    @Test
    public void test03221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03221");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]!", "\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220\220\216\216\220\220\216\216ss]]ss]]ss]]ss]]ss]]ss]]ss]]ss]]\220\220\216\216\220\220\216\216ss]]ss]]ss]]ss]]ss]]ss]]ss]]ss]]\220\220\216\216\220\220\216\216ss]]ss]]ss]]ss]]ss]]ss]]ss]]ss]]\220\220\216\216\220\220\216\216ss]]ss]]ss]]ss]]ss]]ss]]ss]]ss]]\220\220\216\216\220\220\216\216ss]]ss]]ss]]ss]]ss]]ss]]ss]]ss]]\220\220\216\216\220\220\216\216ss]]ss]]ss]]ss]]ss]]ss]]ss]]ss]]\220\220\216\216\220\220\216\216ss]]ss]]ss]]ss]]ss]]ss]]ss]]ss]]\220\220\216\216\220\220\216\216ss]]ss]]ss]]ss]]ss]]ss]]ss]]ss]]!" + "'", str2, "\220\220\216\216\220\220\216\216ss]]ss]]ss]]ss]]ss]]ss]]ss]]ss]]\220\220\216\216\220\220\216\216ss]]ss]]ss]]ss]]ss]]ss]]ss]]ss]]\220\220\216\216\220\220\216\216ss]]ss]]ss]]ss]]ss]]ss]]ss]]ss]]\220\220\216\216\220\220\216\216ss]]ss]]ss]]ss]]ss]]ss]]ss]]ss]]\220\220\216\216\220\220\216\216ss]]ss]]ss]]ss]]ss]]ss]]ss]]ss]]\220\220\216\216\220\220\216\216ss]]ss]]ss]]ss]]ss]]ss]]ss]]ss]]\220\220\216\216\220\220\216\216ss]]ss]]ss]]ss]]ss]]ss]]ss]]ss]]\220\220\216\216\220\220\216\216ss]]ss]]ss]]ss]]ss]]ss]]ss]]ss]]!");
    }

    @Test
    public void test03222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03222");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016enullnull!", "LUUULUUULUUULUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUULUUULUUULUUULUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUnullUUUUUUUUUUUUnullUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUnullUUUUUUUUUUUUnullUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUnullUUUUUUUUUUUUnullUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUnullUUUUUUUUUUUUnullUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUnullUUUUUUUUUUUUnullUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUnullUUUUUUUUUUUUnullUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUnullUUUUUUUUUUUUnullUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUnullUUUUUUUUUUUUnullUUUUUUUU!" + "'", str2, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUnullUUUUUUUUUUUUnullUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUnullUUUUUUUUUUUUnullUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUnullUUUUUUUUUUUUnullUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUnullUUUUUUUUUUUUnullUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUnullUUUUUUUUUUUUnullUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUnullUUUUUUUUUUUUnullUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUnullUUUUUUUUUUUUnullUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUnullUUUUUUUUUUUUnullUUUUUUUU!");
    }

    @Test
    public void test03223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03223");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300!", "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLL!" + "'", str2, "LL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLL!");
    }

    @Test
    public void test03224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03224");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!", "NN!!U`LLU`LLU`LLNN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!U`LLU`LLU`LLNN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!" + "'", str2, "]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!");
    }

    @Test
    public void test03225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03225");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300!", "ELLLELLLELLLELLL\200}}`ELLLELLLELLLELLL]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03226");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180!", "~}\200\200~}\200\200L!LLL!LLURRRURRRL!LLL!LLURRRURRR~}\200\200~}\200\200L!LLL!LLURRRURRRL!LLL!LLURRRURRR~}\200\200~}\200\200L!LLL!LLURRRURRRL!LLL!LLURRRURRR~}\200\200~}\200\200L!LLL!LLURRRURRRL!LLL!LLURRRURRR~}\200\200~}\200\200L!LLL!LLURRRURRRL!LLL!LLURRRURRR~}\200\200~}\200\200L!LLL!LLURRRURRRL!LLL!LLURRRURRR~}\200\200~}\200\200L!LLL!LLURRRURRRL!LLL!LLURRRURRR~}\200\200~}\200\200L!LLL!LLURRRURRRL!LLL!LLURRRURRR!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198nullnullnull!" + "'", str2, "\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198nullnullnull!");
    }

    @Test
    public void test03227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03227");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LUUULUUULUUULUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUULUUULUUULUUULUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!", "NLLLNLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03228");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!", "U~LLU~LL!!U~LLU~LL!!U~LLU~LLU~LLU~LL!!U~LLU~LL!!U~LLU~LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!" + "'", str2, "!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!");
    }

    @Test
    public void test03229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03229");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("llLL~llLLllLLllLL~llLLllLL!!llLL~llLLllLLllLL~llLLllLL!!llLL~llLLllLLllLL~llLLllLLllLL~llLLllLLllLL~llLLllLL!!llLL~llLLllLLllLL~llLLllLL!!llLL~llLLllLLllLL~llLLllLL!", "\201\204\204\204\201\204\204\204\201\204\204\204\201\204\204\204\200}}`\201\204\204\204\201\204\204\204\201\204\204\204\201\204\204\204]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!!\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!!\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!!\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!!\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!" + "'", str2, "\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!!\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!!\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!!\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!!\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!");
    }

    @Test
    public void test03230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03230");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "h]hhh]hh!!h]hhh]hh!!h]hhh]hhh]hhh]hh!!h]hhh]hh!!h]hhh]hh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03231");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03232");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230!", "\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200\u01a0\u01a0nullnull\230\230\u01a0\u01a0nullnull\230\230~}\200\200~}\200\200\u01a0\u01a0nullnull\230\230\u01a0\u01a0nullnull\230\230~}\200\200~}\200\200\u01a0\u01a0nullnull\230\230\u01a0\u01a0nullnull\230\230~}\200\200~}\200\200\u01a0\u01a0nullnull\230\230\u01a0\u01a0nullnull\230\230~}\200\200~}\200\200\u01a0\u01a0nullnull\230\230\u01a0\u01a0nullnull\230\230~}\200\200~}\200\200\u01a0\u01a0nullnull\230\230\u01a0\u01a0nullnull\230\230~}\200\200~}\200\200\u01a0\u01a0nullnull\230\230\u01a0\u01a0nullnull\230\230~}\200\200~}\200\200\u01a0\u01a0nullnull\230\230\u01a0\u01a0nullnull\230\230!" + "'", str2, "~}\200\200~}\200\200\u01a0\u01a0nullnull\230\230\u01a0\u01a0nullnull\230\230~}\200\200~}\200\200\u01a0\u01a0nullnull\230\230\u01a0\u01a0nullnull\230\230~}\200\200~}\200\200\u01a0\u01a0nullnull\230\230\u01a0\u01a0nullnull\230\230~}\200\200~}\200\200\u01a0\u01a0nullnull\230\230\u01a0\u01a0nullnull\230\230~}\200\200~}\200\200\u01a0\u01a0nullnull\230\230\u01a0\u01a0nullnull\230\230~}\200\200~}\200\200\u01a0\u01a0nullnull\230\230\u01a0\u01a0nullnull\230\230~}\200\200~}\200\200\u01a0\u01a0nullnull\230\230\u01a0\u01a0nullnull\230\230~}\200\200~}\200\200\u01a0\u01a0nullnull\230\230\u01a0\u01a0nullnull\230\230!");
    }

    @Test
    public void test03233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03233");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0170null!", "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnull!" + "'", str2, "nullnullnullnullnull!");
    }

    @Test
    public void test03234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03234");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200jghh}\200\200jghh}\200\200\230\230jghh}\200\200jghh}\200\200\230\230~}\200\200~}\200\200jghh}\200\200jghh}\200\200\230\230jghh}\200\200jghh}\200\200\230\230~}\200\200~}\200\200jghh}\200\200jghh}\200\200\230\230jghh}\200\200jghh}\200\200\230\230~}\200\200~}\200\200jghh}\200\200jghh}\200\200\230\230jghh}\200\200jghh}\200\200\230\230~}\200\200~}\200\200jghh}\200\200jghh}\200\200\230\230jghh}\200\200jghh}\200\200\230\230~}\200\200~}\200\200jghh}\200\200jghh}\200\200\230\230jghh}\200\200jghh}\200\200\230\230~}\200\200~}\200\200jghh}\200\200jghh}\200\200\230\230jghh}\200\200jghh}\200\200\230\230~}\200\200~}\200\200jghh}\200\200jghh}\200\200\230\230jghh}\200\200jghh}\200\200\230\230!" + "'", str2, "~}\200\200~}\200\200jghh}\200\200jghh}\200\200\230\230jghh}\200\200jghh}\200\200\230\230~}\200\200~}\200\200jghh}\200\200jghh}\200\200\230\230jghh}\200\200jghh}\200\200\230\230~}\200\200~}\200\200jghh}\200\200jghh}\200\200\230\230jghh}\200\200jghh}\200\200\230\230~}\200\200~}\200\200jghh}\200\200jghh}\200\200\230\230jghh}\200\200jghh}\200\200\230\230~}\200\200~}\200\200jghh}\200\200jghh}\200\200\230\230jghh}\200\200jghh}\200\200\230\230~}\200\200~}\200\200jghh}\200\200jghh}\200\200\230\230jghh}\200\200jghh}\200\200\230\230~}\200\200~}\200\200jghh}\200\200jghh}\200\200\230\230jghh}\200\200jghh}\200\200\230\230~}\200\200~}\200\200jghh}\200\200jghh}\200\200\230\230jghh}\200\200jghh}\200\200\230\230!");
    }

    @Test
    public void test03235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03235");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullBBnullnullBB!", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\225\225XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\225\225XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\225\225XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\225\225XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\225\225XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\225\225XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\225\225XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03236");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!!", "\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test03237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03237");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!", "LIIILIII!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03238");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c!", "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037enullnull!" + "'", str2, "\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037enullnull!");
    }

    @Test
    public void test03239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03239");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU!!``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU!!``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU!!``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU!!``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU!", "!u!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB!!``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB!!``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB!!``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB!!``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB!" + "'", str2, "``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB!!``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB!!``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB!!``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB!!``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB!");
    }

    @Test
    public void test03240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03240");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!!", "~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!!" + "'", str2, "\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!!");
    }

    @Test
    public void test03241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03241");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\253\256\256\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!", "nullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\256\256\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!" + "'", str2, "!\253\256\256\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
    }

    @Test
    public void test03242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03242");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UU!", "FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FF!" + "'", str2, "FF!");
    }

    @Test
    public void test03243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03243");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340nullnullnullnullnullnullnullnull\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340nullnullnullnullnullnullnullnull!", "\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnull\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!null\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnull\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!!" + "'", str2, "null\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnull\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!null\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnull\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!!");
    }

    @Test
    public void test03244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03244");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u026c\u026c\u026a\u026a\u026c\u026c\u026a\u026a\u026c\u026c\u026a\u026a\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026a\u026a\u026c\u026c\u026a\u026a\u026c\u026c\u026a\u026a\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c!!!", "hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test03245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03245");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("TT!!TT!!!", "\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!!");
    }

    @Test
    public void test03246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03246");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!!", "NN!!NN!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!!" + "'", str2, "nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!!");
    }

    @Test
    public void test03247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03247");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!", "!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!" + "'", str2, "\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!");
    }

    @Test
    public void test03248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03248");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275!!!\275\275!!\275\275!!\275\275!!\275\275!!\275!!!\275\275!!\275\275!!!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275!!!\275\275!!\275\275!!\275\275!!\275\275!!\275!!!\275\275!!\275\275!!!" + "'", str2, "\275!!!\275\275!!\275\275!!\275\275!!\275\275!!\275!!!\275\275!!\275\275!!!");
    }

    @Test
    public void test03249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03249");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "UUNNUUNN\214\214UUNNUUNN\214\214UUNNUUNN\214\214UUNNUUNN\214\214UUNNUUNN\214\214UUNNUUNN\214\214UUNNUUNN\214\214UUNNUUNN\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03250");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u03dd\u03de\u03e0\u03e0nullnullnullnull!", "\u0126\u0128\u0128\u0126\u0128\u0128!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0129\u0129\u0129\u0129nullll!" + "'", str2, "\u0129\u0129\u0129\u0129nullll!");
    }

    @Test
    public void test03251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03251");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\336\300\300\300\300\336\300\300!", "nullnull]]nullnull]]nullnullnullnullnullnullnullnullnullnull]]nullnull]]nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03252");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!", "~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!" + "'", str2, "!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!");
    }

    @Test
    public void test03253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03253");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!", "null\340\336\336nullnullnullnull\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336nullnullnullnull\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\336\336LL\336\336LL!!\336\336LL\336\336LL!!\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL!!\336\336LL\336\336LL!!\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL!!\336\336LL\336\336LL!!\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL!!\336\336LL\336\336LL!!\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL!!\336\336LL\336\336LL!!\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL!!\336\336LL\336\336LL!!\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL!!\336\336LL\336\336LL!!\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL!!\336\336LL\336\336LL!!\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL!" + "'", str2, "\336\336LL\336\336LL!!\336\336LL\336\336LL!!\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL!!\336\336LL\336\336LL!!\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL!!\336\336LL\336\336LL!!\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL!!\336\336LL\336\336LL!!\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL!!\336\336LL\336\336LL!!\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL!!\336\336LL\336\336LL!!\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL!!\336\336LL\336\336LL!!\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL!!\336\336LL\336\336LL!!\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL!");
    }

    @Test
    public void test03254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03254");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108UU!", "!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!" + "'", str2, "!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!");
    }

    @Test
    public void test03255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03255");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LULLLULL!!LULLLULL!!LULLLULLLULLLULL!!LULLLULL!!LULLLULL!", "!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03256");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UU]]UU]]LUUULUUUUU]]UU]]LUUULUUU!", "NULLNULL!!NULLNULL!!NULLNULLNULLNULL!!NULLNULL!!NULLNULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NN]]NN]]UNNNUNNNNN]]NN]]UNNNUNNN!" + "'", str2, "NN]]NN]]UNNNUNNNNN]]NN]]UNNNUNNN!");
    }

    @Test
    public void test03257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03257");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullEULLEULLEULLnullnullnullnullEULLEULLEULLnullnullnullnullEULLEULLEULLnullnullnullnullEULLEULLEULLnullnullnullnullEULLEULLEULLnullnullnullnullEULLEULLEULLnullnullnullnullEULLEULLEULLnullnullnullnullEULLEULLEULL!", "UUNNUUNN\214\214UUNNUUNN\214\214UUNNUUNN\214\214UUNNUUNN\214\214UUNNUUNN\214\214UUNNUUNN\214\214UUNNUUNN\214\214UUNNUUNN\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUU!" + "'", str2, "UNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUU!");
    }

    @Test
    public void test03258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03258");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```!", "hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!" + "'", str2, "!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!");
    }

    @Test
    public void test03259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03259");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UULLUULL!", "\275!!!\275\275!!\275\275!!\275\275!!\275\275!!\275!!!\275\275!!\275\275!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03260");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnullnullnullnullnullu\253llu\253llnullnullnullnullnullnullnullnullu\253llu\253ll!!nullnullnullnullnullnullnullnullu\253llu\253llnullnullnullnullnullnullnullnullu\253llu\253ll!!nullnullnullnullnullnullnullnullu\253llu\253llnullnullnullnullnullnullnullnullu\253llu\253llnullnullnullnullnullnullnullnullu\253llu\253llnullnullnullnullnullnullnullnullu\253llu\253ll!!nullnullnullnullnullnullnullnullu\253llu\253llnullnullnullnullnullnullnullnullu\253llu\253ll!!nullnullnullnullnullnullnullnullu\253llu\253llnullnullnullnullnullnullnullnullu\253llu\253ll!", "NNLLLLNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ff!!hnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ff!!hnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ff!!hnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ff!!hnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ff!" + "'", str2, "hnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ff!!hnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ff!!hnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ff!!hnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ff!!hnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ff!");
    }

    @Test
    public void test03261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03261");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d!!!!", "\u0346\u0348\u0348\u0348\u037e\u037e\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ijllijllijllijllijllijllijllijllnull!!!null!!!ijllijllijllijllijllijllijllijllnull!!!null!!!!!ijllijllijllijllijllijllijllijllnull!!!null!!!ijllijllijllijllijllijllijllijllnull!!!null!!!!!ijllijllijllijllijllijllijllijllnull!!!null!!!ijllijllijllijllijllijllijllijllnull!!!null!!!ijllijllijllijllijllijllijllijllnull!!!null!!!ijllijllijllijllijllijllijllijllnull!!!null!!!!!ijllijllijllijllijllijllijllijllnull!!!null!!!ijllijllijllijllijllijllijllijllnull!!!null!!!!!ijllijllijllijllijllijllijllijllnull!!!null!!!ijllijllijllijllijllijllijllijllnull!!!null!!!!" + "'", str2, "ijllijllijllijllijllijllijllijllnull!!!null!!!ijllijllijllijllijllijllijllijllnull!!!null!!!!!ijllijllijllijllijllijllijllijllnull!!!null!!!ijllijllijllijllijllijllijllijllnull!!!null!!!!!ijllijllijllijllijllijllijllijllnull!!!null!!!ijllijllijllijllijllijllijllijllnull!!!null!!!ijllijllijllijllijllijllijllijllnull!!!null!!!ijllijllijllijllijllijllijllijllnull!!!null!!!!!ijllijllijllijllijllijllijllijllnull!!!null!!!ijllijllijllijllijllijllijllijllnull!!!null!!!!!ijllijllijllijllijllijllijllijllnull!!!null!!!ijllijllijllijllijllijllijllijllnull!!!null!!!!");
    }

    @Test
    public void test03262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03262");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\230!\225\225\230!\225\225xx\230!\225\225\230!\225\225xx\230!\225\225\230!\225\225xx\230!\225\225\230!\225\225xx\230!\225\225\230!\225\225xx\230!\225\225\230!\225\225xx\230!\225\225\230!\225\225xx\230!\225\225\230!\225\225xx!", "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull!" + "'", str2, "\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull!");
    }

    @Test
    public void test03263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03263");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnullnullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnullnullnull\275\275nullnull\275\275!", "\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031anullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275UNLLUNLLUNLL\275UNLLUNLLUNLL\275UNLLUNLLUNLL\275UNLLUNLLUNLLUNLLUNLL\275\275UNLLUNLL\275\275UNLLUNLL\275\275UNLLUNLL\275\275\275UNLLUNLLUNLL\275UNLLUNLLUNLL\275UNLLUNLLUNLL\275UNLLUNLLUNLLUNLLUNLL\275\275UNLLUNLL\275\275!" + "'", str2, "\275UNLLUNLLUNLL\275UNLLUNLLUNLL\275UNLLUNLLUNLL\275UNLLUNLLUNLLUNLLUNLL\275\275UNLLUNLL\275\275UNLLUNLL\275\275UNLLUNLL\275\275\275UNLLUNLLUNLL\275UNLLUNLLUNLL\275UNLLUNLLUNLL\275UNLLUNLLUNLLUNLLUNLL\275\275UNLLUNLL\275\275!");
    }

    @Test
    public void test03264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03264");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("`\253!!!\253!!!\253!!!`\253!!!\253!!!\253!!!!", "UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`\253!!!\253!!!\253!!!`\253!!!\253!!!\253!!!!" + "'", str2, "`\253!!!\253!!!\253!!!`\253!!!\253!!!\253!!!!");
    }

    @Test
    public void test03265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03265");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\335\340\u0346\u0348\u0348!", "llllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test03266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03266");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!!", "\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!!" + "'", str2, "U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!!");
    }

    @Test
    public void test03267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03267");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("N~LLN~LL!!N~LLN~LL!!N~LLN~LLN~LLN~LL!!N~LLN~LL!!N~LLN~LL!", "\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\336~\300\300\336~\300\300!!\336~\300\300\336~\300\300!!\336~\300\300\336~\300\300\336~\300\300\336~\300\300!!\336~\300\300\336~\300\300!!\336~\300\300\336~\300\300!" + "'", str2, "\336~\300\300\336~\300\300!!\336~\300\300\336~\300\300!!\336~\300\300\336~\300\300\336~\300\300\336~\300\300!!\336~\300\300\336~\300\300!!\336~\300\300\336~\300\300!");
    }

    @Test
    public void test03268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03268");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!LLUULLUULLUULLUU!!!LLUULLUULLUULLUU!!!!!LLUULLUULLUULLUU!!!LLUULLUULLUULLUU!!!!!LLUULLUULLUULLUU!!!LLUULLUULLUULLUU!!!LLUULLUULLUULLUU!!!LLUULLUULLUULLUU!!!!!LLUULLUULLUULLUU!!!LLUULLUULLUULLUU!!!!!LLUULLUULLUULLUU!!!LLUULLUULLUULLUU!!!", "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL\253\253!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL\253\253!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL\253\253!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL\253\253!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL\253\253!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012anullnull!!!" + "'", str2, "\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012anullnull!!!");
    }

    @Test
    public void test03269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03269");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!", "null~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnullnull~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!" + "'", str2, "!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!");
    }

    @Test
    public void test03270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03270");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!", "\300\300!!\300\300!!\300\300\300\300\300\300\300\300\300\300!!\300\300!!\300\300\300\300\300\300\300\300\300\300!!\300\300!!\300\300\300\300\300\300\300\300\300\300!!\300\300!!\300\300\300\300\300\300\300\300\300\300!!\300\300!!\300\300\300\300\300\300\300\300\300\300!!\300\300!!\300\300\300\300\300\300\300\300\300\300!!\300\300!!\300\300\300\300\300\300\300\300\300\300!!\300\300!!\300\300\300\300\300\300\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!" + "'", str2, "]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!");
    }

    @Test
    public void test03271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03271");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!!", "NLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!" + "'", str2, "LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!");
    }

    @Test
    public void test03272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03272");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0346\u0346\u0346!", "LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0346\u0346\u0346!" + "'", str2, "\u0346\u0346\u0346\u0346!");
    }

    @Test
    public void test03273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03273");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276\276!!\276\276!!!", "\u0346\u0348\u0348\u0348}~\200\200}~\200\200hfhhhfhh\223\223hfhhhfhhhfhhhfhhhfhh\223\223hfhhhfhhhfhh}~\200\200}~\200\200hfhhhfhh\223\223hfhhhfhhhfhhhfhhhfhh\223\223hfhhhfhhhfhh}~\200\200}~\200\200hfhhhfhh\223\223hfhhhfhhhfhhhfhhhfhh\223\223hfhhhfhhhfhh}~\200\200}~\200\200hfhhhfhh\223\223hfhhhfhhhfhhhfhhhfhh\223\223\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276!!\276\276!!!" + "'", str2, "\276\276!!\276\276!!!");
    }

    @Test
    public void test03274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03274");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de!!!", "NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test03275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03275");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\336\336LL\336\336LL!!\336\336LL\336\336LL!!\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL!!\336\336LL\336\336LL!!\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL!!\336\336LL\336\336LL!!\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL!!\336\336LL\336\336LL!!\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL!!\336\336LL\336\336LL!!\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL!!\336\336LL\336\336LL!!\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL!!\336\336LL\336\336LL!!\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL!!\336\336LL\336\336LL!!\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL!", "L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullUUnullnullUU!!nullnullUUnullnullUU!!nullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUU!!nullnullUUnullnullUU!!nullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUU!!nullnullUUnullnullUU!!nullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUU!!nullnullUUnullnullUU!!nullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUU!!nullnullUUnullnullUU!!nullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUU!!nullnullUUnullnullUU!!nullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUU!!nullnullUUnullnullUU!!nullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUU!!nullnullUUnullnullUU!!nullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUU!" + "'", str2, "nullnullUUnullnullUU!!nullnullUUnullnullUU!!nullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUU!!nullnullUUnullnullUU!!nullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUU!!nullnullUUnullnullUU!!nullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUU!!nullnullUUnullnullUU!!nullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUU!!nullnullUUnullnullUU!!nullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUU!!nullnullUUnullnullUU!!nullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUU!!nullnullUUnullnullUU!!nullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUU!!nullnullUUnullnullUU!!nullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUU!");
    }

    @Test
    public void test03276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03276");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!", "HHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!" + "'", str2, "\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!");
    }

    @Test
    public void test03277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03277");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03278");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038enullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03279");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!!!", "T!!!T!!!T!!!T!!!T!!!T!!!T!!!T!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!" + "'", str2, "!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!");
    }

    @Test
    public void test03280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03280");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "````````````````````````````````!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03281");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!", "L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!" + "'", str2, "\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!");
    }

    @Test
    public void test03282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03282");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ!", "\u0346\u0348\u0348\u0348\u037b\u037c\u037e\u037e\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull!" + "'", str2, "\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull!");
    }

    @Test
    public void test03283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03283");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275!!!\275!!!\275!!!\275!!!\200}}`\275!!!\275!!!\275!!!\275!!!]]!", "xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275!!!\275!!!\275!!!\275!!!\200}}`\275!!!\275!!!\275!!!\275!!!]]!" + "'", str2, "\275!!!\275!!!\275!!!\275!!!\200}}`\275!!!\275!!!\275!!!\275!!!]]!");
    }

    @Test
    public void test03284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03284");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\253\254\256\256LNUULNUULNUULNUU\253\254\256\256LNUULNUU!", "JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256!JJJ!JJJ!JJJ!JJJ\253\254\256\256!JJJ!JJJ!" + "'", str2, "\253\254\256\256!JJJ!JJJ!JJJ!JJJ\253\254\256\256!JJJ!JJJ!");
    }

    @Test
    public void test03285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03285");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!!", "LLnullnullLLnullnullLLnullnullLLnullnullLLnullnullLLnullnullLLnullnullLLnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!!" + "'", str2, "\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!!");
    }

    @Test
    public void test03286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03286");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!!", "\275!!!\275\275!!\275\275!!\275\275!!\275\275!!\275!!!\275\275!!\275\275!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!!" + "'", str2, "^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!!");
    }

    @Test
    public void test03287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03287");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("ULLLULLL!!ULLLULLL!!ULLLULLLULLLULLL!!ULLLULLL!!ULLLULLL!", "L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\275\275\275null\275\275\275!!null\275\275\275null\275\275\275!!null\275\275\275null\275\275\275null\275\275\275null\275\275\275!!null\275\275\275null\275\275\275!!null\275\275\275null\275\275\275!" + "'", str2, "null\275\275\275null\275\275\275!!null\275\275\275null\275\275\275!!null\275\275\275null\275\275\275null\275\275\275null\275\275\275!!null\275\275\275null\275\275\275!!null\275\275\275null\275\275\275!");
    }

    @Test
    public void test03288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03288");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("RRPPRRPPRRPPRRPPRRPPRRPPRRPPRRPP!", "\250\250\246\246\250\250\246\246!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03289");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!", "lluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!" + "'", str2, "!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!");
    }

    @Test
    public void test03290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03290");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull!", "~}\200\200~}\200\200jghh}\200\200jghh}\200\200\230\230jghh}\200\200jghh}\200\200\230\230~}\200\200~}\200\200jghh}\200\200jghh}\200\200\230\230jghh}\200\200jghh}\200\200\230\230~}\200\200~}\200\200jghh}\200\200jghh}\200\200\230\230jghh}\200\200jghh}\200\200\230\230~}\200\200~}\200\200jghh}\200\200jghh}\200\200\230\230jghh}\200\200jghh}\200\200\230\230~}\200\200~}\200\200jghh}\200\200jghh}\200\200\230\230jghh}\200\200jghh}\200\200\230\230~}\200\200~}\200\200jghh}\200\200jghh}\200\200\230\230jghh}\200\200jghh}\200\200\230\230~}\200\200~}\200\200jghh}\200\200jghh}\200\200\230\230jghh}\200\200jghh}\200\200\230\230~}\200\200~}\200\200jghh}\200\200jghh}\200\200\230\230jghh}\200\200jghh}\200\200\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull!" + "'", str2, "``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03291");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!", "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!" + "'", str2, "nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!");
    }

    @Test
    public void test03292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03292");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\215}\215\215\215}\215\215nullnullnullnull\215}\215\215\215}\215\215!", "LL!!LL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215}\215\215\215}\215\215nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\215}\215\215\215}\215\215!" + "'", str2, "\215}\215\215\215}\215\215nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\215}\215\215\215}\215\215!");
    }

    @Test
    public void test03293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03293");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!", "!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!" + "'", str2, "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!");
    }

    @Test
    public void test03294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03294");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("fehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehh!", "nullnull!!nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "unllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunll!" + "'", str2, "unllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunll!");
    }

    @Test
    public void test03295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03295");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0180\u017e\u017e\u0180\u017e\u017e\u0180\u017e\u017e\u0180\u017e\u017e\u0180\u017e\u017e\u0180\u017e\u017e\u0180\u017e\u017e\u0180\u017e\u017e!", "\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!" + "'", str2, "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
    }

    @Test
    public void test03296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03296");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LU\225\225LU\225\225LU\225\225LU\225\225LU\225\225LU\225\225LU\225\225LU\225\225!", "JLLLJLLLJLLLJLLLJLLLJLLLJLLLJLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LJ\225\225LJ\225\225LJ\225\225LJ\225\225LJ\225\225LJ\225\225LJ\225\225LJ\225\225!" + "'", str2, "LJ\225\225LJ\225\225LJ\225\225LJ\225\225LJ\225\225LJ\225\225LJ\225\225LJ\225\225!");
    }

    @Test
    public void test03297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03297");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU!", "NN!!U`LLU`LLU`LLNN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!U`LLU`LLU`LLNN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^```^```^```^```^```^```^```^```^```^```NNNNNNNN^```^```NNNNNNNN^```^```^```^```^```^```^```^```^```^```NNNNNNNN^```^```NNNNNNNN^```^```^```^```^```^```^```^```^```^```NNNNNNNN^```^```NNNNNNNN^```^```^```^```^```^```^```^```^```^```NNNNNNNN^```^```NNNNNNNN^```^```^```^```^```^```^```^```^```^```NNNNNNNN^```^```NNNNNNNN^```^```^```^```^```^```^```^```^```^```NNNNNNNN^```^```NNNNNNNN^```^```^```^```^```^```^```^```^```^```NNNNNNNN^```^```NNNNNNNN^```^```^```^```^```^```^```^```^```^```NNNNNNNN^```^```NNNNNNNN!" + "'", str2, "^```^```^```^```^```^```^```^```^```^```NNNNNNNN^```^```NNNNNNNN^```^```^```^```^```^```^```^```^```^```NNNNNNNN^```^```NNNNNNNN^```^```^```^```^```^```^```^```^```^```NNNNNNNN^```^```NNNNNNNN^```^```^```^```^```^```^```^```^```^```NNNNNNNN^```^```NNNNNNNN^```^```^```^```^```^```^```^```^```^```NNNNNNNN^```^```NNNNNNNN^```^```^```^```^```^```^```^```^```^```NNNNNNNN^```^```NNNNNNNN^```^```^```^```^```^```^```^```^```^```NNNNNNNN^```^```NNNNNNNN^```^```^```^```^```^```^```^```^```^```NNNNNNNN^```^```NNNNNNNN!");
    }

    @Test
    public void test03298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03298");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!", "\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ULL!ULL!ULL!ULL!ULL!" + "'", str2, "!ULL!ULL!ULL!ULL!ULL!");
    }

    @Test
    public void test03299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03299");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLUULLUU}}LLUULLUU}}!", "\u016e\u016e\u016e\u016e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u016e\u016e\u016e\u016e!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e}}!" + "'", str2, "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e}}!");
    }

    @Test
    public void test03300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03300");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "EHHH\200}}`EHHH]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test03301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03301");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!", "\u0366\u0365\u0368\u0368\u03c0\u03c0\u03c0\u03c0!!\200\200\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!" + "'", str2, "\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!");
    }

    @Test
    public void test03302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03302");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!", "null\256nullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!" + "'", str2, "``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!");
    }

    @Test
    public void test03303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03303");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("`LLUULLUULLUU`LLUULLUULLUU!", "!!nullnull!!!!!!!!nullnull!!!!!!!!!!nullnull!!!!!!!!nullnull!!!!!!!!!!nullnull!!!!!!!!nullnull!!!!!!!!!!nullnull!!!!!!!!nullnull!!!!!!!!!!nullnull!!!!!!!!nullnull!!!!!!!!!!nullnull!!!!!!!!nullnull!!!!!!!!!!nullnull!!!!!!!!nullnull!!!!!!!!!!nullnull!!!!!!!!nullnull!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`!!LL!!LL!!LL`!!LL!!LL!!LL!" + "'", str2, "`!!LL!!LL!!LL`!!LL!!LL!!LL!");
    }

    @Test
    public void test03304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03304");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnullnullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnullnullnull\275\275nullnull\275\275!", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275HHHHHHHHHHHH\275HHHHHHHHHHHH\275HHHHHHHHHHHH\275HHHHHHHHHHHHHHHHHHHH\275\275HHHHHHHH\275\275HHHHHHHH\275\275HHHHHHHH\275\275\275HHHHHHHHHHHH\275HHHHHHHHHHHH\275HHHHHHHHHHHH\275HHHHHHHHHHHHHHHHHHHH\275\275HHHHHHHH\275\275!" + "'", str2, "\275HHHHHHHHHHHH\275HHHHHHHHHHHH\275HHHHHHHHHHHH\275HHHHHHHHHHHHHHHHHHHH\275\275HHHHHHHH\275\275HHHHHHHH\275\275HHHHHHHH\275\275\275HHHHHHHHHHHH\275HHHHHHHHHHHH\275HHHHHHHHHHHH\275HHHHHHHHHHHHHHHHHHHH\275\275HHHHHHHH\275\275!");
    }

    @Test
    public void test03305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03305");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("EEEEEEEE!", "wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!!wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!!wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!!wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!!wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03306");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("porrporr!!porrporr!!porrporr!!porrporr!!porrporr!!porrporr!!porrporr!!porrporr!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test03307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03307");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!", "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368nullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!" + "'", str2, "!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!");
    }

    @Test
    public void test03308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03308");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348\u0108\u0106\u0106\u0106\u0348\u0346\u0346!", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test03309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03309");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("ELLLELLLLLELLLELLLLLELLLELLLLLELLLELLLLLELLLELLLLLELLLELLLLLELLLELLLLLELLLELLLLL!", "\u0366\u0365\u0368\u0368\u041b\u041c\u041c\u041c\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03310");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NN!!NN!!!", "NULLNULLNULLNULLNULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UU!!UU!!!" + "'", str2, "UU!!UU!!!");
    }

    @Test
    public void test03311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03311");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300!", "LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnull!" + "'", str2, "nullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnull!");
    }

    @Test
    public void test03312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03312");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016enullnull!", "}~\200\200}~\200\200~^~~~^~~}~\200\200}~\200\200~^~~~^~~!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03313");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLnullnullLLnullnullLLnullnullLLnullnullLLnullnullLLnullnullLLnullnullLLnullnull!", "LL!!UULLUULLUULLLL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!UULLUULLUULLLL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276null\276\336\336null\276\336\336\276\276null\276\336\336null\276\336\336\276\276null\276\336\336null\276\336\336\276\276null\276\336\336null\276\336\336\276\276null\276\336\336null\276\336\336\276\276null\276\336\336null\276\336\336\276\276null\276\336\336null\276\336\336\276\276null\276\336\336null\276\336\336!" + "'", str2, "\276\276null\276\336\336null\276\336\336\276\276null\276\336\336null\276\336\336\276\276null\276\336\336null\276\336\336\276\276null\276\336\336null\276\336\336\276\276null\276\336\336null\276\336\336\276\276null\276\336\336null\276\336\336\276\276null\276\336\336null\276\336\336\276\276null\276\336\336null\276\336\336!");
    }

    @Test
    public void test03314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03314");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!!!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!!!", "EEEEEEEE!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!" + "'", str2, "!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test03315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03315");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\200\200!!\200\200!!!", "~}\200\200~}\200\200U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230~}\200\200~}\200\200U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230~}\200\200~}\200\200U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230~}\200\200~}\200\200U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230~}\200\200~}\200\200U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230~}\200\200~}\200\200U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230~}\200\200~}\200\200U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230~}\200\200~}\200\200U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\200!!\200\200!!!" + "'", str2, "\200\200!!\200\200!!!");
    }

    @Test
    public void test03316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03316");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("u]uuu]uu!!u]uuu]uu!!u]uuu]uuu]uuu]uu!!u]uuu]uu!!u]uuu]uu!", "d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnullnull]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnull!" + "'", str2, "null]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnullnull]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnull!");
    }

    @Test
    public void test03317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03317");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!!", "\276\336\266\266~\326\326\276\336\266\266~\326\326!!\276\336\266\266~\326\326\276\336\266\266~\326\326!!\276\336\266\266~\326\326\276\336\266\266~\326\326\276\336\266\266~\326\326\276\336\266\266~\326\326!!\276\336\266\266~\326\326\276\336\266\266~\326\326!!\276\336\266\266~\326\326\276\336\266\266~\326\326!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!!" + "'", str2, "\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!!");
    }

    @Test
    public void test03318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03318");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!", "XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test03319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03319");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLLLLLLLLLLLLLLLLLLLLLLLLLLL\200}}`LLLLLLLLLLLLLLLLLLLLLLLLLLLL]]!", "\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!!\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!!\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!!\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!!\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test03320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03320");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!", "\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\200\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!" + "'", str2, "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!");
    }

    @Test
    public void test03321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03321");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!!\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!!\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!!\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!!\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!", "\300!!!\300!!!\300!!!\300!!!\300!!!\300!!!\300!!!\300!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!!\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!!\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!!\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!!\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!" + "'", str2, "\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!!\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!!\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!!\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!!\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!");
    }

    @Test
    public void test03322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03322");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("U\220LL\200}}`U\220LL]]!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\220nullnull\200}}`null\220nullnull]]!" + "'", str2, "null\220nullnull\200}}`null\220nullnull]]!");
    }

    @Test
    public void test03323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03323");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03324");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!e!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!" + "'", str2, "!null!");
    }

    @Test
    public void test03325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03325");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!!", "\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!!" + "'", str2, "]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!!");
    }

    @Test
    public void test03326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03326");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]]\300\300]]\300\300!!]]\300\300]]\300\300!!]]\300\300]]\300\300]]\300\300]]\300\300!!]]\300\300]]\300\300!!]]\300\300]]\300\300!", "!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull!" + "'", str2, "]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull!");
    }

    @Test
    public void test03327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03327");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!", "a]aaa]aa!!a]aaa]aa!!a]aaa]aaa]aaa]aa!!a]aaa]aa!!a]aaa]aa!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AA]]AA]]AA]]AA]]!AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]!AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]!AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]!AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]!AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]!AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]!AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]!AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]!" + "'", str2, "AA]]AA]]AA]]AA]]!AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]!AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]!AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]!AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]!AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]!AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]!AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]!AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]!");
    }

    @Test
    public void test03328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03328");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!", "`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230!" + "'", str2, "~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230!");
    }

    @Test
    public void test03329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03329");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]]HH]]HH!!]]HH]]HH!!]]HH]]HH]]HH]]HH!!]]HH]]HH!!]]HH]]HH!", "]]\256\256]]\256\256!!]]\256\256]]\256\256!!]]\256\256]]\256\256]]\256\256]]\256\256!!]]\256\256]]\256\256!!]]\256\256]]\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull!" + "'", str2, "]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull!");
    }

    @Test
    public void test03330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03330");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNN!!UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNN!!UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNN!!UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNN!!UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNN!", "LLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAA!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!" + "'", str2, "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
    }

    @Test
    public void test03331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03331");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("ULLLULLL!!ULLLULLL!!ULLLULLL!!ULLLULLL!!ULLLULLL!!ULLLULLL!!ULLLULLL!!ULLLULLL!!!", "\275UNLLUNLLUNLL\275UNLLUNLLUNLL\275UNLLUNLLUNLL\275UNLLUNLLUNLLUNLLUNLL\275\275UNLLUNLL\275\275UNLLUNLL\275\275UNLLUNLL\275\275\275UNLLUNLLUNLL\275UNLLUNLLUNLL\275UNLLUNLLUNLL\275UNLLUNLLUNLLUNLLUNLL\275\275UNLLUNLL\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!" + "'", str2, "LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!");
    }

    @Test
    public void test03332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03332");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]!", "}~\200\200}~\200\200\276\271\271\271^\276\271\271\271\276\271\271\271\276\271\271\271^\276\271\271\271\276\271\271\271}~\200\200}~\200\200\276\271\271\271^\276\271\271\271\276\271\271\271\276\271\271\271^\276\271\271\271\276\271\271\271!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]!" + "'", str2, "]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]!");
    }

    @Test
    public void test03333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03333");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\335\336\340\340\335\336\340\340\335\336\340\340\276\335\336\340\340\275\275!", "HFFFHFFF!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullnullnullnullnullnullnullnullnullnullnull\276nullnullnullnull\275\275!" + "'", str2, "\275nullnullnullnullnullnullnullnullnullnullnullnull\276nullnullnullnull\275\275!");
    }

    @Test
    public void test03334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03334");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254!!!", "\u0366\u0365\u0368\u0368!!\216\216\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnullnull\256\254\254nullnull!!nullnullnull\256\254\254!!nullnull!!nullnullnull\256\254\254nullnull!!nullnullnull\256\254\254!!nullnull!!nullnullnull\256\254\254nullnull!!nullnullnull\256\254\254!!nullnull!!nullnullnull\256\254\254nullnull!!nullnullnull\256\254\254!!nullnull!!nullnullnull\256\254\254nullnull!!nullnullnull\256\254\254!!nullnull!!nullnullnull\256\254\254nullnull!!nullnullnull\256\254\254!!nullnull!!nullnullnull\256\254\254nullnull!!nullnullnull\256\254\254!!nullnull!!nullnullnull\256\254\254nullnull!!nullnullnull\256\254\254!!!" + "'", str2, "nullnull!!nullnullnull\256\254\254nullnull!!nullnullnull\256\254\254!!nullnull!!nullnullnull\256\254\254nullnull!!nullnullnull\256\254\254!!nullnull!!nullnullnull\256\254\254nullnull!!nullnullnull\256\254\254!!nullnull!!nullnullnull\256\254\254nullnull!!nullnullnull\256\254\254!!nullnull!!nullnullnull\256\254\254nullnull!!nullnullnull\256\254\254!!nullnull!!nullnullnull\256\254\254nullnull!!nullnullnull\256\254\254!!nullnull!!nullnullnull\256\254\254nullnull!!nullnullnull\256\254\254!!nullnull!!nullnullnull\256\254\254nullnull!!nullnullnull\256\254\254!!!");
    }

    @Test
    public void test03335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03335");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!", "nullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunll!!nullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunll!!nullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunll!!nullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunll!!nullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNLLNNLL!!NNLLNNLL!!NNLLNNLL!!NNLLNNLL!!NNLLNNLL!!NNLLNNLL!!NNLLNNLL!!NNLLNNLL!!!" + "'", str2, "NNLLNNLL!!NNLLNNLL!!NNLLNNLL!!NNLLNNLL!!NNLLNNLL!!NNLLNNLL!!NNLLNNLL!!NNLLNNLL!!!");
    }

    @Test
    public void test03336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03336");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253UNLLUNLL\253\253UNLLUNLL\253\253UNLLUNLL\253\253UNLLUNLL\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253UNLLUNLL\253\253UNLLUNLL\253\253!", "]nullnullnullnullnull]]nullnull]]nullnull]]nullnull]]]nullnullnullnullnull]]nullnull]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253!" + "'", str2, "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253!");
    }

    @Test
    public void test03337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03337");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL!", "\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253!" + "'", str2, "\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253!");
    }

    @Test
    public void test03338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03338");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0128\u0128\u0128\u0128\u0346\u0348\u0348!", "NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test03339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03339");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!", "\275nullnullnull\275nullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L\220LL\200~~L\220LL\200~~L\220LLL\220LLL\220LL\200~~L\220LL\200~~L\220LLL\220LL!!L\220LL\200~~L\220LL\200~~L\220LLL\220LLL\220LL\200~~L\220LL\200~~L\220LLL\220LL!!L\220LL\200~~L\220LL\200~~L\220LLL\220LLL\220LL\200~~L\220LL\200~~L\220LLL\220LLL\220LL\200~~L\220LL\200~~L\220LLL\220LLL\220LL\200~~L\220LL\200~~L\220LLL\220LL!!L\220LL\200~~L\220LL\200~~L\220LLL\220LLL\220LL\200~~L\220LL\200~~L\220LLL\220LL!!L\220LL\200~~L\220LL\200~~L\220LLL\220LLL\220LL\200~~L\220LL\200~~L\220LLL\220LL!" + "'", str2, "L\220LL\200~~L\220LL\200~~L\220LLL\220LLL\220LL\200~~L\220LL\200~~L\220LLL\220LL!!L\220LL\200~~L\220LL\200~~L\220LLL\220LLL\220LL\200~~L\220LL\200~~L\220LLL\220LL!!L\220LL\200~~L\220LL\200~~L\220LLL\220LLL\220LL\200~~L\220LL\200~~L\220LLL\220LLL\220LL\200~~L\220LL\200~~L\220LLL\220LLL\220LL\200~~L\220LL\200~~L\220LLL\220LL!!L\220LL\200~~L\220LL\200~~L\220LLL\220LLL\220LL\200~~L\220LL\200~~L\220LLL\220LL!!L\220LL\200~~L\220LL\200~~L\220LLL\220LLL\220LL\200~~L\220LL\200~~L\220LLL\220LL!");
    }

    @Test
    public void test03340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03340");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnull~}}^nullnullnullnull]]!", "null\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullqrttqrttqrttqrttqrttqrttqrttqrttnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullqrttqrttqrttqrttqrttqrttqrttqrtt!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150]]!" + "'", str2, "\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150]]!");
    }

    @Test
    public void test03341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03341");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("l!nnl!nnnullnulll!nnl!nnnullnull!", "!\253\256\256\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\271\271!!\271\271\271\271!!\271\271!!!!\271\271!!\271\271\271\271!!\271\271!!!" + "'", str2, "!!\271\271!!\271\271\271\271!!\271\271!!!!\271\271!!\271\271\271\271!!\271\271!!!");
    }

    @Test
    public void test03342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03342");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0129\u0129\u0129\u0129\u0146\u0147\u0149\u0149\u0146\u0147\u0149\u0149\u0146\u0147\u0149\u0149\u0146\u0147\u0149\u0149\u0129\u0129\u0129\u0129\u0146\u0147\u0149\u0149\u0146\u0147\u0149\u0149!", "]^``]^``!!]^``]^``!!]^``]^``]^``]^``!!]^``]^``!!]^``]^``!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03343");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!~TT!~TT!!!~TT!~TT!!!~TT!~TT!~TT!~TT!!!~TT!~TT!!!~TT!~TT!", "\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108nullnull!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!" + "'", str2, "\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!");
    }

    @Test
    public void test03344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03344");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UULL~UULLUULLUULL~UULLUULL!!UULL~UULLUULLUULL~UULLUULL!!UULL~UULLUULLUULL~UULLUULLUULL~UULLUULLUULL~UULLUULL!!UULL~UULLUULLUULL~UULLUULL!!UULL~UULLUULLUULL~UULLUULL!", "~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03345");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!", "mnppmnppmnppmnppmnppmnppmnppmnpp!!mnppmnppmnppmnppmnppmnppmnppmnpp!!!!mnppmnppmnppmnppmnppmnppmnppmnpp!!mnppmnppmnppmnppmnppmnppmnppmnpp!!!!mnppmnppmnppmnppmnppmnppmnppmnpp!!mnppmnppmnppmnppmnppmnppmnppmnpp!!!!mnppmnppmnppmnppmnppmnppmnppmnpp!!mnppmnppmnppmnppmnppmnppmnppmnpp!!!!mnppmnppmnppmnppmnppmnppmnppmnpp!!mnppmnppmnppmnppmnppmnppmnppmnpp!!!!mnppmnppmnppmnppmnppmnppmnppmnpp!!mnppmnppmnppmnppmnppmnppmnppmnpp!!!!mnppmnppmnppmnppmnppmnppmnppmnpp!!mnppmnppmnppmnppmnppmnppmnppmnpp!!!!mnppmnppmnppmnppmnppmnppmnppmnpp!!mnppmnppmnppmnppmnppmnppmnppmnpp!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
    }

    @Test
    public void test03346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03346");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~!", "\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~!" + "'", str2, "\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~!");
    }

    @Test
    public void test03347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03347");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!!", "!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e!!!" + "'", str2, "\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e!!!");
    }

    @Test
    public void test03348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03348");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("`nullnullnull`nullnullnull!", "\u0106\u0106\u0106\u0106!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`oprroprroprr`oprroprroprr!" + "'", str2, "`oprroprroprr`oprroprroprr!");
    }

    @Test
    public void test03349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03349");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340nullnullnullnullnullnullnullnull\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340nullnullnullnullnullnullnullnull!", "~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL}\335\200\200}\335\200\200}\335\200\200}\335\200\200}\335\200\200}\335\200\200}\335\200\200}\335\200\200L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL}\335\200\200}\335\200\200}\335\200\200}\335\200\200}\335\200\200}\335\200\200}\335\200\200}\335\200\200!" + "'", str2, "L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL}\335\200\200}\335\200\200}\335\200\200}\335\200\200}\335\200\200}\335\200\200}\335\200\200}\335\200\200L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL}\335\200\200}\335\200\200}\335\200\200}\335\200\200}\335\200\200}\335\200\200}\335\200\200}\335\200\200!");
    }

    @Test
    public void test03350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03350");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226nullnull!", "FHEEFHEE!!FHEEFHEE!!FHEEFHEEFHEEFHEE!!FHEEFHEE!!FHEEFHEE!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHH!!nullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHH!!nullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHH!!nullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHH!!nullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHH!" + "'", str2, "nullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHH!!nullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHH!!nullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHH!!nullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHH!!nullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHH!");
    }

    @Test
    public void test03351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03351");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\220\220!!\220\220!!\220\220!!\220\220\u0346\u0348\u0348!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\220\220!!\220\220!!\220\220!!\220\220\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\220\220!!\220\220!!\220\220!!\220\220\u0346\u0348\u0348!");
    }

    @Test
    public void test03352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03352");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null\220OO\200~~null\220OO\200~~null\220OOnull\220OOnull\220OO\200~~null\220OO\200~~null\220OOnull\220OO!!null\220OO\200~~null\220OO\200~~null\220OOnull\220OOnull\220OO\200~~null\220OO\200~~null\220OOnull\220OO!!null\220OO\200~~null\220OO\200~~null\220OOnull\220OOnull\220OO\200~~null\220OO\200~~null\220OOnull\220OOnull\220OO\200~~null\220OO\200~~null\220OOnull\220OOnull\220OO\200~~null\220OO\200~~null\220OOnull\220OO!!null\220OO\200~~null\220OO\200~~null\220OOnull\220OOnull\220OO\200~~null\220OO\200~~null\220OOnull\220OO!!null\220OO\200~~null\220OO\200~~null\220OOnull\220OOnull\220OO\200~~null\220OO\200~~null\220OOnull\220OO!", "\u0264\u0264!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ijll\220nullnull\200~~ijll\220nullnull\200~~ijll\220nullnullijll\220nullnullijll\220nullnull\200~~ijll\220nullnull\200~~ijll\220nullnullijll\220nullnull!!ijll\220nullnull\200~~ijll\220nullnull\200~~ijll\220nullnullijll\220nullnullijll\220nullnull\200~~ijll\220nullnull\200~~ijll\220nullnullijll\220nullnull!!ijll\220nullnull\200~~ijll\220nullnull\200~~ijll\220nullnullijll\220nullnullijll\220nullnull\200~~ijll\220nullnull\200~~ijll\220nullnullijll\220nullnullijll\220nullnull\200~~ijll\220nullnull\200~~ijll\220nullnullijll\220nullnullijll\220nullnull\200~~ijll\220nullnull\200~~ijll\220nullnullijll\220nullnull!!ijll\220nullnull\200~~ijll\220nullnull\200~~ijll\220nullnullijll\220nullnullijll\220nullnull\200~~ijll\220nullnull\200~~ijll\220nullnullijll\220nullnull!!ijll\220nullnull\200~~ijll\220nullnull\200~~ijll\220nullnullijll\220nullnullijll\220nullnull\200~~ijll\220nullnull\200~~ijll\220nullnullijll\220nullnull!" + "'", str2, "ijll\220nullnull\200~~ijll\220nullnull\200~~ijll\220nullnullijll\220nullnullijll\220nullnull\200~~ijll\220nullnull\200~~ijll\220nullnullijll\220nullnull!!ijll\220nullnull\200~~ijll\220nullnull\200~~ijll\220nullnullijll\220nullnullijll\220nullnull\200~~ijll\220nullnull\200~~ijll\220nullnullijll\220nullnull!!ijll\220nullnull\200~~ijll\220nullnull\200~~ijll\220nullnullijll\220nullnullijll\220nullnull\200~~ijll\220nullnull\200~~ijll\220nullnullijll\220nullnullijll\220nullnull\200~~ijll\220nullnull\200~~ijll\220nullnullijll\220nullnullijll\220nullnull\200~~ijll\220nullnull\200~~ijll\220nullnullijll\220nullnull!!ijll\220nullnull\200~~ijll\220nullnull\200~~ijll\220nullnullijll\220nullnullijll\220nullnull\200~~ijll\220nullnull\200~~ijll\220nullnullijll\220nullnull!!ijll\220nullnull\200~~ijll\220nullnull\200~~ijll\220nullnullijll\220nullnullijll\220nullnull\200~~ijll\220nullnull\200~~ijll\220nullnullijll\220nullnull!");
    }

    @Test
    public void test03353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03353");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e!", "AALLLLAA!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnullnull~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnull!" + "'", str2, "null~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnullnull~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnull!");
    }

    @Test
    public void test03354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03354");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "!LLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03355");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275UNLLUNLLUNLL\275UNLLUNLLUNLL\275UNLLUNLLUNLL\275UNLLUNLLUNLLUNLLUNLL\275\275UNLLUNLL\275\275UNLLUNLL\275\275UNLLUNLL\275\275\275UNLLUNLLUNLL\275UNLLUNLLUNLL\275UNLLUNLLUNLL\275UNLLUNLLUNLLUNLLUNLL\275\275UNLLUNLL\275\275!", "\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\275\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\275!" + "'", str2, "\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\275\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\275!");
    }

    @Test
    public void test03356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03356");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~~!!U~~~U~~~U~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!U~~~U~~~U~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!", "\u0180\u017e\u017e\u0180\u017e\u017e\u0180\u017e\u017e\u0180\u017e\u017e\u0180\u017e\u017e\u0180\u017e\u017e\u0180\u017e\u017e\u0180\u017e\u017e!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0243\u0243\u0243\u0243\u0243\u0243~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!" + "'", str2, "\u0243\u0243\u0243\u0243\u0243\u0243~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!");
    }

    @Test
    public void test03357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03357");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "~}\200\200~}\200\200L!LLL!LLURRRURRRL!LLL!LLURRRURRR~}\200\200~}\200\200L!LLL!LLURRRURRRL!LLL!LLURRRURRR~}\200\200~}\200\200L!LLL!LLURRRURRRL!LLL!LLURRRURRR~}\200\200~}\200\200L!LLL!LLURRRURRRL!LLL!LLURRRURRR~}\200\200~}\200\200L!LLL!LLURRRURRRL!LLL!LLURRRURRR~}\200\200~}\200\200L!LLL!LLURRRURRRL!LLL!LLURRRURRR~}\200\200~}\200\200L!LLL!LLURRRURRRL!LLL!LLURRRURRR~}\200\200~}\200\200L!LLL!LLURRRURRRL!LLL!LLURRRURRR!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u0346\u0348\u0348!");
    }

    @Test
    public void test03358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03358");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!!!!]!!!!!!", "~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!!!!]!!!!!!" + "'", str2, "!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!!!!]!!!!!!");
    }

    @Test
    public void test03359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03359");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnullnullnullnullnullXXXXXXXXnullnullnullnullnullnullnullnullXXXXXXXXnullnullnullnullnullnullnullnullXXXXXXXXnullnullnullnullnullnullnullnullXXXXXXXXnullnullnullnullnullnullnullnullXXXXXXXXnullnullnullnullnullnullnullnullXXXXXXXXnullnullnullnullnullnullnullnullXXXXXXXXnullnullnullnullnullnullnullnullXXXXXXXX!", "nullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "qrttqrttqrttqrttqrttqrttqrttqrttnullnullnullnullnullnullnullnullqrttqrttqrttqrttqrttqrttqrttqrttnullnullnullnullnullnullnullnullqrttqrttqrttqrttqrttqrttqrttqrttnullnullnullnullnullnullnullnullqrttqrttqrttqrttqrttqrttqrttqrttnullnullnullnullnullnullnullnullqrttqrttqrttqrttqrttqrttqrttqrttnullnullnullnullnullnullnullnullqrttqrttqrttqrttqrttqrttqrttqrttnullnullnullnullnullnullnullnullqrttqrttqrttqrttqrttqrttqrttqrttnullnullnullnullnullnullnullnullqrttqrttqrttqrttqrttqrttqrttqrttnullnullnullnullnullnullnullnull!" + "'", str2, "qrttqrttqrttqrttqrttqrttqrttqrttnullnullnullnullnullnullnullnullqrttqrttqrttqrttqrttqrttqrttqrttnullnullnullnullnullnullnullnullqrttqrttqrttqrttqrttqrttqrttqrttnullnullnullnullnullnullnullnullqrttqrttqrttqrttqrttqrttqrttqrttnullnullnullnullnullnullnullnullqrttqrttqrttqrttqrttqrttqrttqrttnullnullnullnullnullnullnullnullqrttqrttqrttqrttqrttqrttqrttqrttnullnullnullnullnullnullnullnullqrttqrttqrttqrttqrttqrttqrttqrttnullnullnullnullnullnullnullnullqrttqrttqrttqrttqrttqrttqrttqrttnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03360");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull!", "!~UU!~UU!!!~UU!~UU!!!~UU!~UU!~UU!~UU!!!~UU!~UU!!!~UU!~UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnull\230nullnullnull\230nullnullnullnullnullnullnullnullnullnullnull\230nullnullnull\230nullnullnullnullnullnullnullnullnullnullnull\230nullnullnull\230nullnullnullnullnullnullnullnullnullnullnull\230nullnullnull\230nullnullnullnullnullnullnullnullnullnullnull\230nullnullnull\230nullnullnullnullnullnullnullnullnullnullnull\230nullnullnull\230nullnullnullnullnullnullnullnullnullnullnull\230nullnullnull\230nullnullnullnullnullnullnullnullnullnullnull\230nullnullnull\230nullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnull\230nullnullnull\230nullnullnullnullnullnullnullnullnullnullnull\230nullnullnull\230nullnullnullnullnullnullnullnullnullnullnull\230nullnullnull\230nullnullnullnullnullnullnullnullnullnullnull\230nullnullnull\230nullnullnullnullnullnullnullnullnullnullnull\230nullnullnull\230nullnullnullnullnullnullnullnullnullnullnull\230nullnullnull\230nullnullnullnullnullnullnullnullnullnullnull\230nullnullnull\230nullnullnullnullnullnullnullnullnullnullnull\230nullnullnull\230nullnull!");
    }

    @Test
    public void test03361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03361");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\226!!!\226!!!\226!!!\226!!!\226!!!\226!!!\226!!!\226!!!!", "\u0366\u0365\u0368\u0368nullnull\204\204nullnullnullnullnull\204\204nullnullnull!!nullnull\204\204nullnullnullnullnull\204\204nullnullnull!!nullnull\204\204nullnullnullnullnull\204\204nullnullnull!!nullnull\204\204nullnullnullnullnull\204\204\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\226!!!\226!!!\226!!!\226!!!\226!!!\226!!!\226!!!\226!!!!" + "'", str2, "\226!!!\226!!!\226!!!\226!!!\226!!!\226!!!\226!!!\226!!!!");
    }

    @Test
    public void test03362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03362");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380!", "]nullnullnullnullnull]]nullnull]]nullnull]]nullnull]]]nullnullnullnullnull]]nullnull]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380!" + "'", str2, "\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380!");
    }

    @Test
    public void test03363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03363");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226!!\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03364");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UNLLUNLL!!UNLLUNLL!!!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NULLNULL!!NULLNULL!!!" + "'", str2, "NULLNULL!!NULLNULL!!!");
    }

    @Test
    public void test03365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03365");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!", "!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL\200}}`!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL]]!" + "'", str2, "!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL\200}}`!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL]]!");
    }

    @Test
    public void test03366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03366");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\246\250\250\250\246\250\250\250!", "UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\246\250\250\250\246\250\250\250!" + "'", str2, "\246\250\250\250\246\250\250\250!");
    }

    @Test
    public void test03367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03367");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170!", "nullnullnullnullnullnullnullnull!!\276\276!!\276\276nullnullnullnullnullnullnullnull!!\276\276!!\276\276nullnullnullnullnullnullnullnull!!\276\276!!\276\276nullnullnullnullnullnullnullnull!!\276\276!!\276\276nullnullnullnullnullnullnullnull!!\276\276!!\276\276nullnullnullnullnullnullnullnull!!\276\276!!\276\276nullnullnullnullnullnullnullnull!!\276\276!!\276\276nullnullnullnullnullnullnullnull!!\276\276!!\276\276!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198nullnullnullnullnullnullnullnull!" + "'", str2, "\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03368");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!", "!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!" + "'", str2, "!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!");
    }

    @Test
    public void test03369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03369");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230\200}}`LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test03370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03370");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("HHHHHHHH!!HHHHHHHH!!HHHHHHHHHHHHHHHH!!HHHHHHHH!!HHHHHHHH!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03371");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u0346\u0348\u0348!", "\u0243\u0243\u0243\u0243\u0243\u0243~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test03372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03372");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\200}}`!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!]]!", "!!oprroprroprroprroprroprroprroprr!!oprroprroprroprroprroprroprroprr!!oprroprroprroprroprroprroprroprr!!oprroprroprroprroprroprroprroprr!!oprroprroprroprroprroprroprroprr!!oprroprroprroprroprroprroprroprr!!oprroprroprroprroprroprroprroprr!!oprroprroprroprroprroprroprroprr!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!\200}}`!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!]]!" + "'", str2, "!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!\200}}`!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!]]!");
    }

    @Test
    public void test03373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03373");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]!", "hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleenullhnulleenullnullnullhnulleenullnullhnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleenullhnulleenullnullnullhnulleenullnullhnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleenullhnulleenullnullnullhnulleenullnullhnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleenullhnulleenullnullnullhnulleenullnullhnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleenullhnulleenullnullnullhnulleenullnullhnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleenullhnulleenullnullnullhnulleenullnullhnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleenullhnulleenullnullnullhnulleenullnullhnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleenullhnulleenullnullnullhnulleenullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]!" + "'", str2, "\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]!");
    }

    @Test
    public void test03374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03374");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!\200\200\u0346\u0348\u0348!", "\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test03375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03375");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!", "\u0107\u0105\u0109\u0109\u0107\u0105\u0109\u0109!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03376");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178!", "~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}\200\200\200nullnullnull}\200\200\200nullnullnull}\200\200\200nullnullnull}\200\200\200nullnullnull}\200\200\200nullnullnull}\200\200\200nullnullnull}\200\200\200nullnullnull}\200\200\200nullnullnull!" + "'", str2, "}\200\200\200nullnullnull}\200\200\200nullnullnull}\200\200\200nullnullnull}\200\200\200nullnullnull}\200\200\200nullnullnull}\200\200\200nullnullnull}\200\200\200nullnullnull}\200\200\200nullnullnull!");
    }

    @Test
    public void test03377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03377");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "F!HHF!HHF!HHF!HHF!HHF!HHF!HHF!HH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03378");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275nullnull\200\200nullnull\200\200nullnull\200\200\276nullnull\200\200\275\275!", "LU\225\225LU\225\225LU\225\225LU\225\225LU\225\225LU\225\225LU\225\225LU\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275null~}}null~}}\200\200null~}}null~}}\200\200null~}}null~}}\200\200\276null~}}null~}}\200\200\275\275!" + "'", str2, "\275null~}}null~}}\200\200null~}}null~}}\200\200null~}}null~}}\200\200\276null~}}null~}}\200\200\275\275!");
    }

    @Test
    public void test03379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03379");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03380");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null\226\230\230nullnullnullnull\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230nullnullnullnull\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230!", "!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\226\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230!" + "'", str2, "nullnullnullnull\226\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230!");
    }

    @Test
    public void test03381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03381");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!", "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!" + "'", str2, "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!");
    }

    @Test
    public void test03382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03382");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("TTQQTTQQTTQQTTQQTTQQTTQQTTQQTTQQ\214\214TTQQTTQQTTQQTTQQTTQQTTQQTTQQTTQQ\214\214TTQQTTQQTTQQTTQQTTQQTTQQTTQQTTQQ\214\214TTQQTTQQTTQQTTQQTTQQTTQQTTQQTTQQ\214\214TTQQTTQQTTQQTTQQTTQQTTQQTTQQTTQQ\214\214TTQQTTQQTTQQTTQQTTQQTTQQTTQQTTQQ\214\214TTQQTTQQTTQQTTQQTTQQTTQQTTQQTTQQ\214\214TTQQTTQQTTQQTTQQTTQQTTQQTTQQTTQQ\214\214!", "!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!!!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!!!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!!!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!!!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\214\214\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\214\214\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\214\214\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\214\214\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\214\214\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\214\214\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\214\214\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\214\214!" + "'", str2, "\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\214\214\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\214\214\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\214\214\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\214\214\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\214\214\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\214\214\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\214\214\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\214\214!");
    }

    @Test
    public void test03383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03383");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!", "null\275\275\275null\275\275\275!!null\275\275\275null\275\275\275!!null\275\275\275null\275\275\275null\275\275\275null\275\275\275!!null\275\275\275null\275\275\275!!null\275\275\275null\275\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275!" + "'", str2, "\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275!");
    }

    @Test
    public void test03384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03384");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368!!\216\216\u0346\u0348\u0348!", "}~\200\200}~\200\200FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHH}~\200\200}~\200\200FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368!!\216\216\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368!!\216\216\u0346\u0348\u0348!");
    }

    @Test
    public void test03385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03385");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!", "\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d!" + "'", str2, "\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d!");
    }

    @Test
    public void test03386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03386");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LNUULNUU!!LNUULNUU!!LNUULNUULNUULNUU!!LNUULNUU!!LNUULNUU!", "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!" + "'", str2, "LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!");
    }

    @Test
    public void test03387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03387");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "]]\300\300]]\300\300!!]]\300\300]]\300\300!!]]\300\300]]\300\300]]\300\300]]\300\300!!]]\300\300]]\300\300!!]]\300\300]]\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test03388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03388");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!", "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!" + "'", str2, "]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!");
    }

    @Test
    public void test03389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03389");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]]\300\300]]\300\300!!]]\300\300]]\300\300!!]]\300\300]]\300\300]]\300\300]]\300\300!!]]\300\300]]\300\300!!]]\300\300]]\300\300!", "nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]\220\220]]\220\220!!]]\220\220]]\220\220!!]]\220\220]]\220\220]]\220\220]]\220\220!!]]\220\220]]\220\220!!]]\220\220]]\220\220!" + "'", str2, "]]\220\220]]\220\220!!]]\220\220]]\220\220!!]]\220\220]]\220\220]]\220\220]]\220\220!!]]\220\220]]\220\220!!]]\220\220]]\220\220!");
    }

    @Test
    public void test03390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03390");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03391");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!", "lLLLLLLLLLLL!!!!lLLLLLLLLLLL!!!!!!lLLLLLLLLLLL!!!!lLLLLLLLLLLL!!!!!!lLLLLLLLLLLL!!!!lLLLLLLLLLLL!!!!!!lLLLLLLLLLLL!!!!lLLLLLLLLLLL!!!!!!lLLLLLLLLLLL!!!!lLLLLLLLLLLL!!!!!!lLLLLLLLLLLL!!!!lLLLLLLLLLLL!!!!!!lLLLLLLLLLLL!!!!lLLLLLLLLLLL!!!!!!lLLLLLLLLLLL!!!!lLLLLLLLLLLL!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!" + "'", str2, "LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!");
    }

    @Test
    public void test03392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03392");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\300\300\300\276\300\275\275!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullnull\276null\275\275!" + "'", str2, "\275nullnullnull\276null\275\275!");
    }

    @Test
    public void test03393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03393");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("U!LLU!LL!!U!LLU!LL!!U!LLU!LLU!LLU!LL!!U!LLU!LL!!U!LLU!LL!", "\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!" + "'", str2, "null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!");
    }

    @Test
    public void test03394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03394");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\215\216\230\230nullnullnull\215\216\230\230nullnullnull\215\216\230\230nullnullnull\215\216\230\230nullnullnull\215\216\230\230nullnullnull\215\216\230\230nullnullnull\215\216\230\230nullnullnull\215\216\230\230nullnullnull!", "LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\216\230\230L!!!L!!!L!!!\215\216\230\230L!!!L!!!L!!!\215\216\230\230L!!!L!!!L!!!\215\216\230\230L!!!L!!!L!!!\215\216\230\230L!!!L!!!L!!!\215\216\230\230L!!!L!!!L!!!\215\216\230\230L!!!L!!!L!!!\215\216\230\230L!!!L!!!L!!!!" + "'", str2, "\215\216\230\230L!!!L!!!L!!!\215\216\230\230L!!!L!!!L!!!\215\216\230\230L!!!L!!!L!!!\215\216\230\230L!!!L!!!L!!!\215\216\230\230L!!!L!!!L!!!\215\216\230\230L!!!L!!!L!!!\215\216\230\230L!!!L!!!L!!!\215\216\230\230L!!!L!!!L!!!!");
    }

    @Test
    public void test03395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03395");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276V\275\275\276V\275\275\276V\275\275\276V\275\275\276V\275\275\276V\275\275\276V\275\275\276V\275\275!", "\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\230\275\275\276\230\275\275\276\230\275\275\276\230\275\275\276\230\275\275\276\230\275\275\276\230\275\275\276\230\275\275!" + "'", str2, "\276\230\275\275\276\230\275\275\276\230\275\275\276\230\275\275\276\230\275\275\276\230\275\275\276\230\275\275\276\230\275\275!");
    }

    @Test
    public void test03396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03396");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "TT!!TT!!TT!!TT!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test03397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03397");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03398");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!", "null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204!!\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204!!\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204!!\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204!!\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204!" + "'", str2, "\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204!!\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204!!\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204!!\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204!!\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204!");
    }

    @Test
    public void test03399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03399");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UULLUULLLLUULLUUUULLUULLLLUULLUUUULLUULLLLUULLUUUULLUULLLLUULLUUUULLUULLLLUULLUUUULLUULLLLUULLUUUULLUULLLLUULLUUUULLUULLLLUULLUU!", "LNUULNUU!!LNUULNUU!!\276LNUULNUULNUU\276LNUULNUULNUULNUULNUU!!LNUULNUU!!\276LNUULNUULNUU\276LNUULNUULNUULNUULNUU!!LNUULNUU!!\276LNUULNUULNUU\276LNUULNUULNUULNUULNUU!!LNUULNUU!!\276LNUULNUULNUU\276LNUULNUULNUULNUULNUU!!LNUULNUU!!\276LNUULNUULNUU\276LNUULNUULNUULNUULNUU!!LNUULNUU!!\276LNUULNUULNUU\276LNUULNUULNUULNUULNUU!!LNUULNUU!!\276LNUULNUULNUU\276LNUULNUULNUULNUULNUU!!LNUULNUU!!\276LNUULNUULNUU\276LNUULNUULNUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276NN\276\276NNNN\276\276NN\276\276\276\276NN\276\276NNNN\276\276NN\276\276\276\276NN\276\276NNNN\276\276NN\276\276\276\276NN\276\276NNNN\276\276NN\276\276\276\276NN\276\276NNNN\276\276NN\276\276\276\276NN\276\276NNNN\276\276NN\276\276\276\276NN\276\276NNNN\276\276NN\276\276\276\276NN\276\276NNNN\276\276NN\276\276!" + "'", str2, "\276\276NN\276\276NNNN\276\276NN\276\276\276\276NN\276\276NNNN\276\276NN\276\276\276\276NN\276\276NNNN\276\276NN\276\276\276\276NN\276\276NNNN\276\276NN\276\276\276\276NN\276\276NNNN\276\276NN\276\276\276\276NN\276\276NNNN\276\276NN\276\276\276\276NN\276\276NNNN\276\276NN\276\276\276\276NN\276\276NNNN\276\276NN\276\276!");
    }

    @Test
    public void test03400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03400");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\200}}`!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!]]!", "FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\200}}`!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!]]!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\200}}`!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!]]!");
    }

    @Test
    public void test03401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03401");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnullnull~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnull!", "H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226!!H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226!!H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226!!H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226!!H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!" + "'", str2, "\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!");
    }

    @Test
    public void test03402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03402");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]]\300\300]]\300\300!!]]\300\300]]\300\300!!]]\300\300]]\300\300]]\300\300]]\300\300!!]]\300\300]]\300\300!!]]\300\300]]\300\300!", "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull!" + "'", str2, "]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull!");
    }

    @Test
    public void test03403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03403");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!!!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!!!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!!!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!!!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!", "llllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!" + "'", str2, "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!");
    }

    @Test
    public void test03404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03404");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!!", "\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!!" + "'", str2, "\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!!");
    }

    @Test
    public void test03405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03405");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!!wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!!wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!!wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!!wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03406");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!", "ijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijll\200}}`ijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijll]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ!" + "'", str2, "JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ!");
    }

    @Test
    public void test03407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03407");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300!", "!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03408");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("TT!!TT!!!", "NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UU!!UU!!!" + "'", str2, "UU!!UU!!!");
    }

    @Test
    public void test03409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03409");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!!", "\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!!" + "'", str2, "\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!!");
    }

    @Test
    public void test03410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03410");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\254!", "!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\254!" + "'", str2, "!\254!");
    }

    @Test
    public void test03411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03411");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("hfHHhfHH!!hfHHhfHH!!hfHHhfHH!!hfHHhfHH!!hfHHhfHH!!hfHHhfHH!!hfHHhfHH!!hfHHhfHH!!!", "!~lnulluulnulluu!~lnulluulnulluu!!!~lnulluulnulluu!~lnulluulnulluu!!!~lnulluulnulluu!~lnulluulnulluu!~lnulluulnulluu!~lnulluulnulluu!!!~lnulluulnulluu!~lnulluulnulluu!!!~lnulluulnulluu!~lnulluulnulluu!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test03412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03412");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\253\253\253!\253\253\253!\253\253\253!\253\253\253\200}}`!\253\253\253!\253\253\253!\253\253\253!\253\253\253]]!", "\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\253\253!\253\253\253!\253\253\253!\253\253\253\200}}`!\253\253\253!\253\253\253!\253\253\253!\253\253\253]]!" + "'", str2, "!\253\253\253!\253\253\253!\253\253\253!\253\253\253\200}}`!\253\253\253!\253\253\253!\253\253\253!\253\253\253]]!");
    }

    @Test
    public void test03413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03413");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348\234\235\237\237\u0348\u0346\u0346!", "]U!!]U!!!!]U!!]U!!!!]U!!]U!!]U!!]U!!!!]U!!]U!!!!]U!!]U!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\234\235\237\237\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\234\235\237\237\u0348\u0346\u0346!");
    }

    @Test
    public void test03414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03414");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("`nullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnull!", "UULLUULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03415");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("HFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFF!", "EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFF!" + "'", str2, "HFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFF!");
    }

    @Test
    public void test03416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03416");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~!!U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~!!U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~!!U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~!!U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03417");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03418");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8!", "``!!``!!``!!``!!``!!``!!``!!``!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!" + "'", str2, "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
    }

    @Test
    public void test03419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03419");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("EHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHH!", "LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03420");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```!", "nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```!" + "'", str2, "NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```!");
    }

    @Test
    public void test03421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03421");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]U!!]U!!!!]U!!]U!!!!]U!!]U!!]U!!]U!!!!]U!!]U!!!!]U!!]U!!!", "NULLNULLNULLNULLNULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]!!!]!!!!!]!!!]!!!!!]!!!]!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!" + "'", str2, "]!!!]!!!!!]!!!]!!!!!]!!!]!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!");
    }

    @Test
    public void test03422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03422");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("F!HHF!HHF!HHF!HHF!HHF!HHF!HHF!HH!", "\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!" + "'", str2, "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
    }

    @Test
    public void test03423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03423");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!!", "LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test03424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03424");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!", "\215}\215\215\215}\215\215nullnullnullnull\215}\215\215\215}\215\215!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!!!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!!!" + "'", str2, "!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!!!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!!!");
    }

    @Test
    public void test03425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03425");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225!", "\u0128\u0126\u0126\u0108\u0106\u0106!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0107\u0107nullll\225\225\u0107\u0107nullll\225\225\u0107\u0107nullll\225\225\u0107\u0107nullll\225\225\u0107\u0107nullll\225\225\u0107\u0107nullll\225\225\u0107\u0107nullll\225\225\u0107\u0107nullll\225\225!" + "'", str2, "\u0107\u0107nullll\225\225\u0107\u0107nullll\225\225\u0107\u0107nullll\225\225\u0107\u0107nullll\225\225\u0107\u0107nullll\225\225\u0107\u0107nullll\225\225\u0107\u0107nullll\225\225\u0107\u0107nullll\225\225!");
    }

    @Test
    public void test03426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03426");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!!", "\336UUUUnull!!Unull!!!!!!\336UUUUnull!!Unull!!!!!!!!\336UUUUnull!!Unull!!!!!!\336UUUUnull!!Unull!!!!!!!!\336UUUUnull!!Unull!!!!!!\336UUUUnull!!Unull!!!!!!!!\336UUUUnull!!Unull!!!!!!\336UUUUnull!!Unull!!!!!!!!\336UUUUnull!!Unull!!!!!!\336UUUUnull!!Unull!!!!!!!!\336UUUUnull!!Unull!!!!!!\336UUUUnull!!Unull!!!!!!!!\336UUUUnull!!Unull!!!!!!\336UUUUnull!!Unull!!!!!!!!\336UUUUnull!!Unull!!!!!!\336UUUUnull!!Unull!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!" + "'", str2, "!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!");
    }

    @Test
    public void test03427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03427");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NN!!NN!!!", "UNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UU!!UU!!!" + "'", str2, "UU!!UU!!!");
    }

    @Test
    public void test03428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03428");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!\271\271!!\271\271\271\271!!\271\271!!!!\271\271!!\271\271\271\271!!\271\271!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\271\271!!\271\271\271\271!!\271\271!!!!\271\271!!\271\271\271\271!!\271\271!!!" + "'", str2, "!!\271\271!!\271\271\271\271!!\271\271!!!!\271\271!!\271\271\271\271!!\271\271!!!");
    }

    @Test
    public void test03429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03429");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!~TT!~TT!!!~TT!~TT!!!~TT!~TT!~TT!~TT!!!~TT!~TT!!!~TT!~TT!", "\u0108\200\200\u0108\200\200\u0108\200\200\u0108\200\200\u0108\200\200\u0108\200\200\u0108\200\200\u0108\200\200nullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~LL!~LL!!!~LL!~LL!!!~LL!~LL!~LL!~LL!!!~LL!~LL!!!~LL!~LL!" + "'", str2, "!~LL!~LL!!!~LL!~LL!!!~LL!~LL!~LL!~LL!!!~LL!~LL!!!~LL!~LL!");
    }

    @Test
    public void test03430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03430");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106!!!", "!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!!" + "'", str2, "UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!!");
    }

    @Test
    public void test03431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03431");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!", "\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253!!!\253!!!!!\253!!!\253!!!!!\253!!!\253!!!!!\253!!!\253!!!!!\253!!!\253!!!!!\253!!!\253!!!!!\253!!!\253!!!!!\253!!!\253!!!!!" + "'", str2, "!\253!!!\253!!!!!\253!!!\253!!!!!\253!!!\253!!!!!\253!!!\253!!!!!\253!!!\253!!!!!\253!!!\253!!!!!\253!!!\253!!!!!\253!!!\253!!!!!");
    }

    @Test
    public void test03432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03432");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\225!", "}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\225!" + "'", str2, "!\225!");
    }

    @Test
    public void test03433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03433");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276\276null\276\336\336null\276\336\336\276\276null\276\336\336null\276\336\336\276\276null\276\336\336null\276\336\336\276\276null\276\336\336null\276\336\336\276\276null\276\336\336null\276\336\336\276\276null\276\336\336null\276\336\336\276\276null\276\336\336null\276\336\336\276\276null\276\336\336null\276\336\336!", "\276\336\266\266~\326\326\276\336\266\266~\326\326!!\276\336\266\266~\326\326\276\336\266\266~\326\326!!\276\336\266\266~\326\326\276\336\266\266~\326\326\276\336\266\266~\326\326\276\336\266\266~\326\326!!\276\336\266\266~\326\326\276\336\266\266~\326\326!!\276\336\266\266~\326\326\276\336\266\266~\326\326!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276nullnullnullnull\276\227\227nullnullnullnull\276\227\227\276\276nullnullnullnull\276\227\227nullnullnullnull\276\227\227\276\276nullnullnullnull\276\227\227nullnullnullnull\276\227\227\276\276nullnullnullnull\276\227\227nullnullnullnull\276\227\227\276\276nullnullnullnull\276\227\227nullnullnullnull\276\227\227\276\276nullnullnullnull\276\227\227nullnullnullnull\276\227\227\276\276nullnullnullnull\276\227\227nullnullnullnull\276\227\227\276\276nullnullnullnull\276\227\227nullnullnullnull\276\227\227!" + "'", str2, "\276\276nullnullnullnull\276\227\227nullnullnullnull\276\227\227\276\276nullnullnullnull\276\227\227nullnullnullnull\276\227\227\276\276nullnullnullnull\276\227\227nullnullnullnull\276\227\227\276\276nullnullnullnull\276\227\227nullnullnullnull\276\227\227\276\276nullnullnullnull\276\227\227nullnullnullnull\276\227\227\276\276nullnullnullnull\276\227\227nullnullnullnull\276\227\227\276\276nullnullnullnull\276\227\227nullnullnullnull\276\227\227\276\276nullnullnullnull\276\227\227nullnullnullnull\276\227\227!");
    }

    @Test
    public void test03434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03434");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("FEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHH!", "]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull!!]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull!!]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull!!]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull!!]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!" + "'", str2, "]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!");
    }

    @Test
    public void test03435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03435");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("`\253!!!\253!!!\253!!!`\253!!!\253!!!\253!!!!", "UULL~UULLUULLUULL~UULLUULL!!UULL~UULLUULLUULL~UULLUULL!!UULL~UULLUULLUULL~UULLUULLUULL~UULLUULLUULL~UULLUULL!!UULL~UULLUULLUULL~UULLUULL!!UULL~UULLUULLUULL~UULLUULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`\253!!!\253!!!\253!!!`\253!!!\253!!!\253!!!!" + "'", str2, "`\253!!!\253!!!\253!!!`\253!!!\253!!!\253!!!!");
    }

    @Test
    public void test03436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03436");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NLLLULNN!", "\276\276!!\276\276!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03437");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}~\200\200}~\200\200null^nullnullnull^nullnull}~\200\200}~\200\200null^nullnullnull^nullnull!", "\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200\300\300\300\300^\300\300\300\300\300\300\300\300\300\300\300\300^\300\300\300\300\300\300\300\300}~\200\200}~\200\200\300\300\300\300^\300\300\300\300\300\300\300\300\300\300\300\300^\300\300\300\300\300\300\300\300!" + "'", str2, "}~\200\200}~\200\200\300\300\300\300^\300\300\300\300\300\300\300\300\300\300\300\300^\300\300\300\300\300\300\300\300}~\200\200}~\200\200\300\300\300\300^\300\300\300\300\300\300\300\300\300\300\300\300^\300\300\300\300\300\300\300\300!");
    }

    @Test
    public void test03438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03438");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\246\250\250\250\246\250\250\250!", "N~LLN~LL!!N~LLN~LL!!N~LLN~LLN~LLN~LL!!N~LLN~LL!!N~LLN~LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\246\250\250\250\246\250\250\250!" + "'", str2, "\246\250\250\250\246\250\250\250!");
    }

    @Test
    public void test03439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03439");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull!" + "'", str2, "\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull!");
    }

    @Test
    public void test03440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03440");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276\336\266\266~\326\326\276\336\266\266~\326\326!!\276\336\266\266~\326\326\276\336\266\266~\326\326!!\276\336\266\266~\326\326\276\336\266\266~\326\326\276\336\266\266~\326\326\276\336\266\266~\326\326!!\276\336\266\266~\326\326\276\336\266\266~\326\326!!\276\336\266\266~\326\326\276\336\266\266~\326\326!", "!!\336\336\336\336\336\336\336\336!!\336\336\336\336\336\336\336\336!!\336\336\336\336\336\336\336\336!!\336\336\336\336\336\336\336\336!!\336\336\336\336\336\336\336\336!!\336\336\336\336\336\336\336\336!!\336\336\336\336\336\336\336\336!!\336\336\336\336\336\336\336\336!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!" + "'", str2, "\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!");
    }

    @Test
    public void test03441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03441");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03442");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180!", "\u0388\u0386\u0386\u0388\u0386\u0386\u0368\u0368\u0388\u0386\u0386\u0388\u0386\u0386\u0368\u0368\u0388\u0386\u0386\u0388\u0386\u0386\u0368\u0368\u0388\u0386\u0386\u0388\u0386\u0386\u0368\u0368\u0388\u0386\u0386\u0388\u0386\u0386\u0368\u0368\u0388\u0386\u0386\u0388\u0386\u0386\u0368\u0368\u0388\u0386\u0386\u0388\u0386\u0386\u0368\u0368\u0388\u0386\u0386\u0388\u0386\u0386\u0368\u0368!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03443");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!!", "LNNN!LNNNLNNNLNNN!LNNNLNNNLNNN!LNNNLNNNLNNN!LNNNLNNNLNNN!LNNNLNNNLNNN!LNNNLNNNLNNN!LNNNLNNNLNNN!LNNNLNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NL!!NL!!!!NL!!NL!!!!!!NL!!NL!!!!NL!!NL!!!!!!NL!!NL!!!!NL!!NL!!!!!!NL!!NL!!!!NL!!NL!!!!!!NL!!NL!!!!NL!!NL!!!!!!NL!!NL!!!!NL!!NL!!!!!!NL!!NL!!!!NL!!NL!!!!!!NL!!NL!!!!NL!!NL!!!!!!!" + "'", str2, "NL!!NL!!!!NL!!NL!!!!!!NL!!NL!!!!NL!!NL!!!!!!NL!!NL!!!!NL!!NL!!!!!!NL!!NL!!!!NL!!NL!!!!!!NL!!NL!!!!NL!!NL!!!!!!NL!!NL!!!!NL!!NL!!!!!!NL!!NL!!!!NL!!NL!!!!!!NL!!NL!!!!NL!!NL!!!!!!!");
    }

    @Test
    public void test03444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03444");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("HFFFHFFF!", "nullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHH!!nullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHH!!nullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHH!!nullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHH!!nullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHHnullnullEFHHEFHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LUUULUUU!" + "'", str2, "LUUULUUU!");
    }

    @Test
    public void test03445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03445");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!!", "NLLLNLLLNLLLNLLLLLNNLLNNLLNNLLNNNLLLNLLLNLLLNLLLLLNNLLNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "xxxxxxxx!!xxxxxxxx!!xxxxxxxx!!xxxxxxxx!!xxxxxxxx!!xxxxxxxx!!xxxxxxxx!!xxxxxxxx!!!" + "'", str2, "xxxxxxxx!!xxxxxxxx!!xxxxxxxx!!xxxxxxxx!!xxxxxxxx!!xxxxxxxx!!xxxxxxxx!!xxxxxxxx!!!");
    }

    @Test
    public void test03446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03446");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!!", "null\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248null\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!!" + "'", str2, "\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!!");
    }

    @Test
    public void test03447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03447");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UU!!````````````UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!````````````UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!", "nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a!!!" + "'", str2, "\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a!!!");
    }

    @Test
    public void test03448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03448");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0108\200\200\u0108\200\200\u0108\200\200\u0108\200\200\u0108\200\200\u0108\200\200\u0108\200\200\u0108\200\200nullnullnullnullnullnullnullnull!", "!~LL!~LL!!!~LL!~LL!!!~LL!~LL!~LL!~LL!!!~LL!~LL!!!~LL!~LL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}null\200\200}null\200\200}null\200\200}null\200\200L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~}null\200\200}null\200\200}null\200\200}null\200\200L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~!" + "'", str2, "}null\200\200}null\200\200}null\200\200}null\200\200L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~}null\200\200}null\200\200}null\200\200}null\200\200L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~!");
    }

    @Test
    public void test03449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03449");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnull!!nullnull!!nullnull!!nullnull!!null!!!null!!!null!!!null!!!nullnull!!nullnull!!nullnull!!nullnull!!null!!!null!!!!", "qrttqrttqrttqrttqrttqrttqrttqrttnullnullnullnullnullnullnullnullqrttqrttqrttqrttqrttqrttqrttqrttnullnullnullnullnullnullnullnullqrttqrttqrttqrttqrttqrttqrttqrttnullnullnullnullnullnullnullnullqrttqrttqrttqrttqrttqrttqrttqrttnullnullnullnullnullnullnullnullqrttqrttqrttqrttqrttqrttqrttqrttnullnullnullnullnullnullnullnullqrttqrttqrttqrttqrttqrttqrttqrttnullnullnullnullnullnullnullnullqrttqrttqrttqrttqrttqrttqrttqrttnullnullnullnullnullnullnullnullqrttqrttqrttqrttqrttqrttqrttqrttnullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260!!!!" + "'", str2, "\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260!!!!");
    }

    @Test
    public void test03450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03450");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\200\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230]]!", "!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU\200}}`!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\200\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230]]!" + "'", str2, "\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\200\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230]]!");
    }

    @Test
    public void test03451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03451");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("EE!!EE!!!", "L~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LL!!L~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LL!!L~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LL!!L~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LL!!L~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL!!LL!!!" + "'", str2, "LL!!LL!!!");
    }

    @Test
    public void test03452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03452");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!lll!lll!!!lll!lll!!!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!!!lll!lll!!!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!!!lll!lll!!!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!!!lll!lll!!!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!!!lll!lll!!!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!!!lll!lll!!!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!!!lll!lll!!!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!!!lll!lll!!!lll!lll!lll!lll!lll!lll!lll!lll!", "!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test03453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03453");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\351\354\354\354\351\354\354\354\351\354\354\354\351\354\354\354\200}}`\351\354\354\354\351\354\354\354\351\354\354\354\351\354\354\354]]!", "]U!!]U!!!!]U!!]U!!!!]U!!]U!!]U!!]U!!!!]U!!]U!!!!]U!!]U!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test03454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03454");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!!", "\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016enullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!!" + "'", str2, "~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!!");
    }

    @Test
    public void test03455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03455");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336!", "!eeeeeeeeeeeeeeee!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "enulleeenulleenullnullenulleeenulleenullnull!!enulleeenulleenullnullenulleeenulleenullnull!!enulleeenulleenullnullenulleeenulleenullnullenulleeenulleenullnullenulleeenulleenullnull!!enulleeenulleenullnullenulleeenulleenullnull!!enulleeenulleenullnullenulleeenulleenullnull!" + "'", str2, "enulleeenulleenullnullenulleeenulleenullnull!!enulleeenulleenullnullenulleeenulleenullnull!!enulleeenulleenullnullenulleeenulleenullnullenulleeenulleenullnullenulleeenulleenullnull!!enulleeenulleenullnullenulleeenulleenullnull!!enulleeenulleenullnullenulleeenulleenullnull!");
    }

    @Test
    public void test03456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03456");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336!", "``!!``!!``!!``!!``!!``!!``!!``!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03457");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!", "\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!" + "'", str2, "}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!");
    }

    @Test
    public void test03458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03458");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}~\200\200}~\200\200\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be}~\200\200}~\200\200\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be!", "\u0366\u0365\u0368\u0368\254\254\254\254\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnull!" + "'", str2, "}~\200\200}~\200\200nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03459");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200!", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHH\200\200HHHHHHHH\200\200HHHHHHHH\200\200HHHHHHHH\200\200HHHHHHHH\200\200HHHHHHHH\200\200HHHHHHHH\200\200HHHHHHHH\200\200!" + "'", str2, "HHHHHHHH\200\200HHHHHHHH\200\200HHHHHHHH\200\200HHHHHHHH\200\200HHHHHHHH\200\200HHHHHHHH\200\200HHHHHHHH\200\200HHHHHHHH\200\200!");
    }

    @Test
    public void test03460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03460");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!", "!LLUULLUULLUULLUU!!!LLUULLUULLUULLUU!!!!!LLUULLUULLUULLUU!!!LLUULLUULLUULLUU!!!!!LLUULLUULLUULLUU!!!LLUULLUULLUULLUU!!!LLUULLUULLUULLUU!!!LLUULLUULLUULLUU!!!!!LLUULLUULLUULLUU!!!LLUULLUULLUULLUU!!!!!LLUULLUULLUULLUU!!!LLUULLUULLUULLUU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!" + "'", str2, "!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!");
    }

    @Test
    public void test03461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03461");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275HHHHHHHHHHHH\275HHHHHHHHHHHH\275HHHHHHHHHHHH\275HHHHHHHHHHHHHHHHHHHH\275\275HHHHHHHH\275\275HHHHHHHH\275\275HHHHHHHH\275\275\275HHHHHHHHHHHH\275HHHHHHHHHHHH\275HHHHHHHHHHHH\275HHHHHHHHHHHHHHHHHHHH\275\275HHHHHHHH\275\275!", "NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\275\275nullnullnullnullnullnullnullnull\275\275nullnullnullnullnullnullnullnull\275\275nullnullnullnullnullnullnullnull\275\275\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\275\275nullnullnullnullnullnullnullnull\275\275!" + "'", str2, "\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\275\275nullnullnullnullnullnullnullnull\275\275nullnullnullnullnullnullnullnull\275\275nullnullnullnullnullnullnullnull\275\275\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\275\275nullnullnullnullnullnullnullnull\275\275!");
    }

    @Test
    public void test03462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03462");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\200}}`!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!]]!", "nullnullLULLLULLLULLLULLnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\200}}`!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!]]!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\200}}`!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!]]!");
    }

    @Test
    public void test03463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03463");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!!", "FH!!FH!!FH!!FH!!FH!!FH!!FH!!FH!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!" + "'", str2, "!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!");
    }

    @Test
    public void test03464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03464");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("II!!II!!II!!II!!II!!II!!II!!II!!!", "H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test03465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03465");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u03c0\u03c0\u03be\u03be\u03c0\u03c0\u03be\u03be\u03c0\u03c0\u03be\u03be\u03c0\u03c0\u03be\u03be}}!", "\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!" + "'", str2, "nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!");
    }

    @Test
    public void test03466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03466");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\ua7ad\ua7ad\ua7ad\ua7ad\200\ua7ad\ua7ad\ua7ad\ua7ad]]!", "UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\200}}`nullnullnullnull]]!" + "'", str2, "nullnullnullnull\200}}`nullnullnullnull]]!");
    }

    @Test
    public void test03467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03467");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("P\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NN!!P\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NN!!P\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NN!!P\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NN!!P\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NN!", "!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!" + "'", str2, "null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!");
    }

    @Test
    public void test03468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03468");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null\236\276\276null\236\276\276!!null\236\276\276null\236\276\276!!null\236\276\276null\236\276\276null\236\276\276null\236\276\276!!null\236\276\276null\236\276\276!!null\236\276\276null\236\276\276!", "\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276!" + "'", str2, "\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276!");
    }

    @Test
    public void test03469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03469");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!", "^```^```^```^```^```^```^```^```^```^```\226XXXX\230\230\226XXXX\230\230^```^```\226XXXX\230\230\226XXXX\230\230^```^```^```^```^```^```^```^```^```^```\226XXXX\230\230\226XXXX\230\230^```^```\226XXXX\230\230\226XXXX\230\230^```^```^```^```^```^```^```^```^```^```\226XXXX\230\230\226XXXX\230\230^```^```\226XXXX\230\230\226XXXX\230\230^```^```^```^```^```^```^```^```^```^```\226XXXX\230\230\226XXXX\230\230^```^```\226XXXX\230\230\226XXXX\230\230^```^```^```^```^```^```^```^```^```^```\226XXXX\230\230\226XXXX\230\230^```^```\226XXXX\230\230\226XXXX\230\230^```^```^```^```^```^```^```^```^```^```\226XXXX\230\230\226XXXX\230\230^```^```\226XXXX\230\230\226XXXX\230\230^```^```^```^```^```^```^```^```^```^```\226XXXX\230\230\226XXXX\230\230^```^```\226XXXX\230\230\226XXXX\230\230^```^```^```^```^```^```^```^```^```^```\226XXXX\230\230\226XXXX\230\230^```^```\226XXXX\230\230\226XXXX\230\230!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!" + "'", str2, "XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!");
    }

    @Test
    public void test03470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03470");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\215}\215\215\215}\215\215nullnullnullnull\215}\215\215\215}\215\215!", "null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215}\215\215\215}\215\215NLLLNLLLNLLLNLLL\215}\215\215\215}\215\215!" + "'", str2, "\215}\215\215\215}\215\215NLLLNLLLNLLLNLLL\215}\215\215\215}\215\215!");
    }

    @Test
    public void test03471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03471");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "!lll!lll!!!lll!lll!!!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!!!lll!lll!!!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!!!lll!lll!!!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!!!lll!lll!!!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!!!lll!lll!!!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!!!lll!lll!!!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!!!lll!lll!!!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!!!lll!lll!!!lll!lll!lll!lll!lll!lll!lll!lll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03472");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!!", "\u0348l!!\200\u0348l!!]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JnullJJJnullJJ!!JnullJJJnullJJ!!JnullJJJnullJJ!!JnullJJJnullJJ!!JnullJJJnullJJ!!JnullJJJnullJJ!!JnullJJJnullJJ!!JnullJJJnullJJ!!!" + "'", str2, "JnullJJJnullJJ!!JnullJJJnullJJ!!JnullJJJnullJJ!!JnullJJJnullJJ!!JnullJJJnullJJ!!JnullJJJnullJJ!!JnullJJJnullJJ!!JnullJJJnullJJ!!!");
    }

    @Test
    public void test03473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03473");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````!", "eeee\220eeeeeeee\200~~eeee\220eeeeeeee\200~~eeee\220eeeeeeeeeeee\220eeeeeeeeeeee\220eeeeeeee\200~~eeee\220eeeeeeee\200~~eeee\220eeeeeeeeeeee\220eeeeeeee!!eeee\220eeeeeeee\200~~eeee\220eeeeeeee\200~~eeee\220eeeeeeeeeeee\220eeeeeeeeeeee\220eeeeeeee\200~~eeee\220eeeeeeee\200~~eeee\220eeeeeeeeeeee\220eeeeeeee!!eeee\220eeeeeeee\200~~eeee\220eeeeeeee\200~~eeee\220eeeeeeeeeeee\220eeeeeeeeeeee\220eeeeeeee\200~~eeee\220eeeeeeee\200~~eeee\220eeeeeeeeeeee\220eeeeeeeeeeee\220eeeeeeee\200~~eeee\220eeeeeeee\200~~eeee\220eeeeeeeeeeee\220eeeeeeeeeeee\220eeeeeeee\200~~eeee\220eeeeeeee\200~~eeee\220eeeeeeeeeeee\220eeeeeeee!!eeee\220eeeeeeee\200~~eeee\220eeeeeeee\200~~eeee\220eeeeeeeeeeee\220eeeeeeeeeeee\220eeeeeeee\200~~eeee\220eeeeeeee\200~~eeee\220eeeeeeeeeeee\220eeeeeeee!!eeee\220eeeeeeee\200~~eeee\220eeeeeeee\200~~eeee\220eeeeeeeeeeee\220eeeeeeeeeeee\220eeeeeeee\200~~eeee\220eeeeeeee\200~~eeee\220eeeeeeeeeeee\220eeeeeeee!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````!" + "'", str2, "nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````!");
    }

    @Test
    public void test03474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03474");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\201\204\204\204\201\204\204\204\201\204\204\204\201\204\204\204\200}}`\201\204\204\204\201\204\204\204\201\204\204\204\201\204\204\204]]!", "LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\201\204\204\204\201\204\204\204\201\204\204\204\201\204\204\204\200}}`\201\204\204\204\201\204\204\204\201\204\204\204\201\204\204\204]]!" + "'", str2, "\201\204\204\204\201\204\204\204\201\204\204\204\201\204\204\204\200}}`\201\204\204\204\201\204\204\204\201\204\204\204\201\204\204\204]]!");
    }

    @Test
    public void test03475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03475");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("H!~~H!~~H!~~H!~~H!~~H!~~H!~~H!~~nullnullnullnullnullnullnullnullH!~~H!~~H!~~H!~~H!~~H!~~H!~~H!~~nullnullnullnullnullnullnullnull!", "\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~N\275!!N\275!!N\275!!N\275!!N\275!!N\275!!N\275!!N\275!!\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~N\275!!N\275!!N\275!!N\275!!N\275!!N\275!!N\275!!N\275!!!" + "'", str2, "\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~N\275!!N\275!!N\275!!N\275!!N\275!!N\275!!N\275!!N\275!!\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~N\275!!N\275!!N\275!!N\275!!N\275!!N\275!!N\275!!N\275!!!");
    }

    @Test
    public void test03476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03476");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\215\216\230\230nullnullnull\215\216\230\230nullnullnull\215\216\230\230nullnullnull\215\216\230\230nullnullnull\215\216\230\230nullnullnull\215\216\230\230nullnullnull\215\216\230\230nullnullnull\215\216\230\230nullnullnull!", "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03477");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "nullnullnullnullijllijllijllijllnullnullnullnullijllijll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03478");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400!!!", "U!LLU!LL!!U!LLU!LL!!U!LLU!LLU!LLU!LL!!U!LLU!LL!!U!LLU!LL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test03479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03479");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test03480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03480");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u0346\u0348\u0348!", "hnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ff!!hnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ff!!hnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ff!!hnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ff!!hnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ff!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test03481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03481");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\340\340!!nullnullnull\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!nullnullnull\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!!", "\340\340!!nullnullnull\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!nullnullnull\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!\300\300!!\300\300!!\300\300!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\300\300!!\300\300!!\300\300!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!\300\300!!\300\300!!\300\300!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\300\300!!\300\300!!\300\300!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test03482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03482");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!", "\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!" + "'", str2, "\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!");
    }

    @Test
    public void test03483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03483");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\215\216\230\230L!!!L!!!L!!!\215\216\230\230L!!!L!!!L!!!\215\216\230\230L!!!L!!!L!!!\215\216\230\230L!!!L!!!L!!!\215\216\230\230L!!!L!!!L!!!\215\216\230\230L!!!L!!!L!!!\215\216\230\230L!!!L!!!L!!!\215\216\230\230L!!!L!!!L!!!!", "\u016a\u016a\u016a\u016a\u016a\u016aLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!!" + "'", str2, "\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!!");
    }

    @Test
    public void test03484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03484");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u019b\u019c\u019e\u019e\u019b\u019c\u019e\u019e\u019b\u019c\u019e\u019e\u019b\u019c\u019e\u019e!", "efhhefhhefhhefhhefhhefhhefhhefhh!!efhhefhhefhhefhhefhhefhhefhhefhh!!!!efhhefhhefhhefhhefhhefhhefhhefhh!!efhhefhhefhhefhhefhhefhhefhhefhh!!!!efhhefhhefhhefhhefhhefhhefhhefhh!!efhhefhhefhhefhhefhhefhhefhhefhh!!!!efhhefhhefhhefhhefhhefhhefhhefhh!!efhhefhhefhhefhhefhhefhhefhhefhh!!!!efhhefhhefhhefhhefhhefhhefhhefhh!!efhhefhhefhhefhhefhhefhhefhhefhh!!!!efhhefhhefhhefhhefhhefhhefhhefhh!!efhhefhhefhhefhhefhhefhhefhhefhh!!!!efhhefhhefhhefhhefhhefhhefhhefhh!!efhhefhhefhhefhhefhhefhhefhhefhh!!!!efhhefhhefhhefhhefhhefhhefhhefhh!!efhhefhhefhhefhhefhhefhhefhhefhh!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03485");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnull}~\200\200}~\200\200nullnull}~\200\200}~\200\200nullnull}~\200\200}~\200\200\u0348\u0346\u0346!", "!UUUUUUUUUUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullqnullnullnullqnullnull}~\200\200}~\200\200nullqnullnullnullqnullnull}~\200\200}~\200\200nullqnullnullnullqnullnull}~\200\200}~\200\200\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullqnullnullnullqnullnull}~\200\200}~\200\200nullqnullnullnullqnullnull}~\200\200}~\200\200nullqnullnullnullqnullnull}~\200\200}~\200\200\u0348\u0346\u0346!");
    }

    @Test
    public void test03486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03486");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214!", "!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214!" + "'", str2, "nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214!");
    }

    @Test
    public void test03487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03487");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!", "HH!!HH!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!" + "'", str2, "\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!");
    }

    @Test
    public void test03488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03488");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test03489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03489");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198nullnullnullnullnullnullnullnull!", "hhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHH!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!");
    }

    @Test
    public void test03490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03490");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0167\u0168\u016a\u016a\u0167\u0168\u016a\u016a\u0167\u0168\u016a\u016a\u0167\u0168\u016a\u016a\u0167\u0168\u016a\u016a\u0167\u0168\u016a\u016a\u0167\u0168\u016a\u016a\u0167\u0168\u016a\u016a\u0346\u0348\u0348!", "u!ll!!!u!ll!!!u!ll!!!u!ll!!!u!ll!!!u!ll!!!u!ll!!!u!ll!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test03491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03491");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420!!!", "NLLLNLLLNLLLNLLLLLNNLLNNLLNNLLNNNLLLNLLLNLLLNLLLLLNNLLNN!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230null\226\226nullnullnullnullnullnull\230null\226\226nullnullnullnullnullnull!!\230null\226\226nullnullnullnullnullnull\230null\226\226nullnullnullnullnullnull!!\230null\226\226nullnullnullnullnullnull\230null\226\226nullnullnullnullnullnull!!\230null\226\226nullnullnullnullnullnull\230null\226\226nullnullnullnullnullnull!!\230null\226\226nullnullnullnullnullnull\230null\226\226nullnullnullnullnullnull!!\230null\226\226nullnullnullnullnullnull\230null\226\226nullnullnullnullnullnull!!\230null\226\226nullnullnullnullnullnull\230null\226\226nullnullnullnullnullnull!!\230null\226\226nullnullnullnullnullnull\230null\226\226nullnullnullnullnullnull!!!" + "'", str2, "\230null\226\226nullnullnullnullnullnull\230null\226\226nullnullnullnullnullnull!!\230null\226\226nullnullnullnullnullnull\230null\226\226nullnullnullnullnullnull!!\230null\226\226nullnullnullnullnullnull\230null\226\226nullnullnullnullnullnull!!\230null\226\226nullnullnullnullnullnull\230null\226\226nullnullnullnullnullnull!!\230null\226\226nullnullnullnullnullnull\230null\226\226nullnullnullnullnullnull!!\230null\226\226nullnullnullnullnullnull\230null\226\226nullnullnullnullnullnull!!\230null\226\226nullnullnullnullnullnull\230null\226\226nullnullnullnullnullnull!!\230null\226\226nullnullnullnullnullnull\230null\226\226nullnullnullnullnullnull!!!");
    }

    @Test
    public void test03492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03492");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "EHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test03493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03493");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "NNLLNNLL!!NNLLNNLL!!NNLLNNLL!!NNLLNNLL!!NNLLNNLL!!NNLLNNLL!!NNLLNNLL!!NNLLNNLL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03494");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8nullnullnullnullnullnullnullnull!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03495");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248nullnullnull!", "NLLL\200}}`NLLL]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullinullllinullllinullllnullnullnullnullinullllinullllinullllnullnullnullnullinullllinullllinullllnullnullnullnullinullllinullllinullllnullnullnullnullinullllinullllinullllnullnullnullnullinullllinullllinullllnullnullnullnullinullllinullllinullllnullnullnullnullinullllinullllinullll!" + "'", str2, "nullnullnullnullinullllinullllinullllnullnullnullnullinullllinullllinullllnullnullnullnullinullllinullllinullllnullnullnullnullinullllinullllinullllnullnullnullnullinullllinullllinullllnullnullnullnullinullllinullllinullllnullnullnullnullinullllinullllinullllnullnullnullnullinullllinullllinullll!");
    }

    @Test
    public void test03496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03496");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!!", "fhnullnullfhnullnull\226\226fhnullnullfhnullnull\226\226fhnullnullfhnullnullnullnullfhnullnullfhnullnullnullnullfhnullnullfhnullnull\226\226fhnullnullfhnullnull\226\226fhnullnullfhnullnullnullnullfhnullnullfhnullnullnullnullfhnullnullfhnullnull\226\226fhnullnullfhnullnull\226\226fhnullnullfhnullnullnullnullfhnullnullfhnullnullnullnullfhnullnullfhnullnull\226\226fhnullnullfhnullnull\226\226fhnullnullfhnullnullnullnullfhnullnullfhnullnullnullnullfhnullnullfhnullnull\226\226fhnullnullfhnullnull\226\226fhnullnullfhnullnullnullnullfhnullnullfhnullnullnullnullfhnullnullfhnullnull\226\226fhnullnullfhnullnull\226\226fhnullnullfhnullnullnullnullfhnullnullfhnullnullnullnullfhnullnullfhnullnull\226\226fhnullnullfhnullnull\226\226fhnullnullfhnullnullnullnullfhnullnullfhnullnullnullnullfhnullnullfhnullnull\226\226fhnullnullfhnullnull\226\226fhnullnullfhnullnullnullnullfhnullnullfhnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test03497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03497");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!", "FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!" + "'", str2, "!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!");
    }

    @Test
    public void test03498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03498");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UULLUULL!", "NULLNULL!!NULLNULL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!UU!!UU!" + "'", str2, "!!UU!!UU!");
    }

    @Test
    public void test03499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03499");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "fehhfehhnullnullfehhfehhnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03500");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("u]uuu]uu!!u]uuu]uu!!u]uuu]uuu]uuu]uu!!u]uuu]uu!!u]uuu]uu!", "ULLLULLLULLLULLLULLLULLLULLLULLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}]}}}]}}!!}]}}}]}}!!}]}}}]}}}]}}}]}}!!}]}}}]}}!!}]}}}]}}!" + "'", str2, "}]}}}]}}!!}]}}}]}}!!}]}}}]}}}]}}}]}}!!}]}}}]}}!!}]}}}]}}!");
    }
}
