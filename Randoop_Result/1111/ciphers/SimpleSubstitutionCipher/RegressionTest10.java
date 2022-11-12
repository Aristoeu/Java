package ciphers.SimpleSubstitutionCipher;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

    public static boolean debug = false;

    @Test
    public void test05001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05001");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!\253\256\256\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!", "\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\256\256\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!" + "'", str2, "!\253\256\256\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
    }

    @Test
    public void test05002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05002");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!!" + "'", str2, "nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!!");
    }

    @Test
    public void test05003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05003");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!" + "'", str2, "!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!");
    }

    @Test
    public void test05004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05004");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275nullnull\200\200nullnull\200\200nullnull\200\200\276nullnull\200\200\275\275!", "\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276L\225\225\276L\225\225\200\200\276L\225\225\276L\225\225\200\200\276L\225\225\276L\225\225\200\200\276\276L\225\225\276L\225\225\200\200\275\275!" + "'", str2, "\275\276L\225\225\276L\225\225\200\200\276L\225\225\276L\225\225\200\200\276L\225\225\276L\225\225\200\200\276\276L\225\225\276L\225\225\200\200\275\275!");
    }

    @Test
    public void test05005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05005");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!" + "'", str2, "\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!");
    }

    @Test
    public void test05006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05006");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368\236\240\240\240\u0346\u0348\u0348!", "nullnullnullnullnullnullnullnullu\253llu\253llnullnullnullnullnullnullnullnullu\253llu\253ll!!nullnullnullnullnullnullnullnullu\253llu\253llnullnullnullnullnullnullnullnullu\253llu\253ll!!nullnullnullnullnullnullnullnullu\253llu\253llnullnullnullnullnullnullnullnullu\253llu\253llnullnullnullnullnullnullnullnullu\253llu\253llnullnullnullnullnullnullnullnullu\253llu\253ll!!nullnullnullnullnullnullnullnullu\253llu\253llnullnullnullnullnullnullnullnullu\253llu\253ll!!nullnullnullnullnullnullnullnullu\253llu\253llnullnullnullnullnullnullnullnullu\253llu\253ll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\236\240\240\240\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\236\240\240\240\u0346\u0348\u0348!");
    }

    @Test
    public void test05007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05007");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "XXXX\200}}`XXXX]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05008");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368!", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368!" + "'", str2, "\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368!");
    }

    @Test
    public void test05009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05009");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("L~UUL~UU!!L~UUL~UU!!L~UUL~UUL~UUL~UU!!L~UUL~UU!!L~UUL~UU!", "LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u011e\u0120\u0120\u011e\u0120\u0120\u011e\u0120\u0120\u011e\u0120\u0120\u011e\u0120\u0120\u011e\u0120\u0120\u011e\u0120\u0120\u011e\u0120\u0120\u011e\u0120\u0120\u011e\u0120\u0120\u011e\u0120\u0120\u011e\u0120\u0120!" + "'", str2, "\u011e\u0120\u0120\u011e\u0120\u0120\u011e\u0120\u0120\u011e\u0120\u0120\u011e\u0120\u0120\u011e\u0120\u0120\u011e\u0120\u0120\u011e\u0120\u0120\u011e\u0120\u0120\u011e\u0120\u0120\u011e\u0120\u0120\u011e\u0120\u0120!");
    }

    @Test
    public void test05010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05010");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "HHHHHHHH\200\200HHHHHHHH\200\200HHHHHHHH\200\200HHHHHHHH\200\200HHHHHHHH\200\200HHHHHHHH\200\200HHHHHHHH\200\200HHHHHHHH\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05011");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7!", "JILLJILLJILLJILLJILLJILLJILLJILL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!" + "'", str2, "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
    }

    @Test
    public void test05012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05012");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("FHEEFHEE!!FHEEFHEE!!FHEEFHEEFHEEFHEE!!FHEEFHEE!!FHEEFHEE!", "\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05013");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!\253\256\256]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!", "lLLLLnullLLLnullLL!!!!lLLLLnullLLLnullLL!!!!!!lLLLLnullLLLnullLL!!!!lLLLLnullLLLnullLL!!!!!!lLLLLnullLLLnullLL!!!!lLLLLnullLLLnullLL!!!!!!lLLLLnullLLLnullLL!!!!lLLLLnullLLLnullLL!!!!!!lLLLLnullLLLnullLL!!!!lLLLLnullLLLnullLL!!!!!!lLLLLnullLLLnullLL!!!!lLLLLnullLLLnullLL!!!!!!lLLLLnullLLLnullLL!!!!lLLLLnullLLLnullLL!!!!!!lLLLLnullLLLnullLL!!!!lLLLLnullLLLnullLL!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\256\256\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01canullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01canullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!" + "'", str2, "!\253\256\256\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01canullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01canullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
    }

    @Test
    public void test05014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05014");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!~LL!~LL!!!~LL!~LL!!!~LL!~LL!~LL!~LL!!!~LL!~LL!!!~LL!~LL!", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~nullnull!~nullnull!!!~nullnull!~nullnull!!!~nullnull!~nullnull!~nullnull!~nullnull!!!~nullnull!~nullnull!!!~nullnull!~nullnull!" + "'", str2, "!~nullnull!~nullnull!!!~nullnull!~nullnull!!!~nullnull!~nullnull!~nullnull!~nullnull!!!~nullnull!~nullnull!!!~nullnull!~nullnull!");
    }

    @Test
    public void test05015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05015");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275!!!\275!!!\275!!!\275!!!\200}}`\275!!!\275!!!\275!!!\275!!!]]!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275!!!\275!!!\275!!!\275!!!\200}}`\275!!!\275!!!\275!!!\275!!!]]!" + "'", str2, "\275!!!\275!!!\275!!!\275!!!\200}}`\275!!!\275!!!\275!!!\275!!!]]!");
    }

    @Test
    public void test05016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05016");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0346\u0346\u0346\u0346!", "U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0346\u0346\u0346!" + "'", str2, "\u0346\u0346\u0346\u0346!");
    }

    @Test
    public void test05017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05017");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!", "`nullnullnull`nullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!" + "'", str2, "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!");
    }

    @Test
    public void test05018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05018");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u026c\u026c\u026c!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05019");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u015a\u015a\u0158\u0158\u015a\u015a\u015a\u0158\u0158\u015a\u015a\u015a\u0158\u0158\u015a\u015a\u015a\u0158\u0158\u015a\u015a\u015a\u0158\u0158\u015a\u015a\u015a\u0158\u0158\u015a\u015a\u015a\u0158\u0158\u015a\u015a\u015a\u0158\u0158\u015a~~!", "\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~!" + "'", str2, "nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~!");
    }

    @Test
    public void test05020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05020");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\324\325\327\327!\324\325\327\327\324\325\327\327\324\325\327\327!\324\325\327\327\324\325\327\327\u0368\u0368\324\325\327\327!\324\325\327\327\324\325\327\327\324\325\327\327!\324\325\327\327\324\325\327\327\u0368\u0368\324\325\327\327!\324\325\327\327\324\325\327\327\324\325\327\327!\324\325\327\327\324\325\327\327\u0368\u0368\324\325\327\327!\324\325\327\327\324\325\327\327\324\325\327\327!\324\325\327\327\324\325\327\327\u0368\u0368\324\325\327\327!\324\325\327\327\324\325\327\327\324\325\327\327!\324\325\327\327\324\325\327\327\u0368\u0368\324\325\327\327!\324\325\327\327\324\325\327\327\324\325\327\327!\324\325\327\327\324\325\327\327\u0368\u0368\324\325\327\327!\324\325\327\327\324\325\327\327\324\325\327\327!\324\325\327\327\324\325\327\327\u0368\u0368\324\325\327\327!\324\325\327\327\324\325\327\327\324\325\327\327!\324\325\327\327\324\325\327\327\u0368\u0368!", "ORRRORRRRRORRRORRRRRORRRORRRRRORRRORRRRRORRRORRRRRORRRORRRRRORRRORRRRRORRRORRRRR!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull\327\327!nullnull\327\327nullnull\327\327nullnull\327\327!nullnull\327\327nullnull\327\327\u0368\u0368nullnull\327\327!nullnull\327\327nullnull\327\327nullnull\327\327!nullnull\327\327nullnull\327\327\u0368\u0368nullnull\327\327!nullnull\327\327nullnull\327\327nullnull\327\327!nullnull\327\327nullnull\327\327\u0368\u0368nullnull\327\327!nullnull\327\327nullnull\327\327nullnull\327\327!nullnull\327\327nullnull\327\327\u0368\u0368nullnull\327\327!nullnull\327\327nullnull\327\327nullnull\327\327!nullnull\327\327nullnull\327\327\u0368\u0368nullnull\327\327!nullnull\327\327nullnull\327\327nullnull\327\327!nullnull\327\327nullnull\327\327\u0368\u0368nullnull\327\327!nullnull\327\327nullnull\327\327nullnull\327\327!nullnull\327\327nullnull\327\327\u0368\u0368nullnull\327\327!nullnull\327\327nullnull\327\327nullnull\327\327!nullnull\327\327nullnull\327\327\u0368\u0368!" + "'", str2, "nullnull\327\327!nullnull\327\327nullnull\327\327nullnull\327\327!nullnull\327\327nullnull\327\327\u0368\u0368nullnull\327\327!nullnull\327\327nullnull\327\327nullnull\327\327!nullnull\327\327nullnull\327\327\u0368\u0368nullnull\327\327!nullnull\327\327nullnull\327\327nullnull\327\327!nullnull\327\327nullnull\327\327\u0368\u0368nullnull\327\327!nullnull\327\327nullnull\327\327nullnull\327\327!nullnull\327\327nullnull\327\327\u0368\u0368nullnull\327\327!nullnull\327\327nullnull\327\327nullnull\327\327!nullnull\327\327nullnull\327\327\u0368\u0368nullnull\327\327!nullnull\327\327nullnull\327\327nullnull\327\327!nullnull\327\327nullnull\327\327\u0368\u0368nullnull\327\327!nullnull\327\327nullnull\327\327nullnull\327\327!nullnull\327\327nullnull\327\327\u0368\u0368nullnull\327\327!nullnull\327\327nullnull\327\327nullnull\327\327!nullnull\327\327nullnull\327\327\u0368\u0368!");
    }

    @Test
    public void test05021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05021");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254!!!", "\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\214\214\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\214\214\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\214\214\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\214\214\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\214\214\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\214\214\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\214\214\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\214\214!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!!" + "'", str2, "nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!!");
    }

    @Test
    public void test05022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05022");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("}~\200\200}~\200\200\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e}~\200\200}~\200\200\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e!", "XXXX\200}}`XXXX]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05023");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!", "!!!!!!!!!!!!!!!!\254~\256\256\254~\256\256\254~\256\256\254~\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!" + "'", str2, "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
    }

    @Test
    public void test05024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05024");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL\253\254\256\256\253\254\256\256NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL\253\254\256\256\253\254\256\256NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL\253\254\256\256\253\254\256\256NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL\253\254\256\256\253\254\256\256NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL\253\254\256\256\253\254\256\256NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL\253\254\256\256\253\254\256\256NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL\253\254\256\256\253\254\256\256NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL\253\254\256\256\253\254\256\256!", "^```^```^```^```^```^```^```^```^```^```U\331\225\225U\331\225\225^```^```U\331\225\225U\331\225\225^```^```^```^```^```^```^```^```^```^```U\331\225\225U\331\225\225^```^```U\331\225\225U\331\225\225^```^```^```^```^```^```^```^```^```^```U\331\225\225U\331\225\225^```^```U\331\225\225U\331\225\225^```^```^```^```^```^```^```^```^```^```U\331\225\225U\331\225\225^```^```U\331\225\225U\331\225\225^```^```^```^```^```^```^```^```^```^```U\331\225\225U\331\225\225^```^```U\331\225\225U\331\225\225^```^```^```^```^```^```^```^```^```^```U\331\225\225U\331\225\225^```^```U\331\225\225U\331\225\225^```^```^```^```^```^```^```^```^```^```U\331\225\225U\331\225\225^```^```U\331\225\225U\331\225\225^```^```^```^```^```^```^```^```^```^```U\331\225\225U\331\225\225^```^```U\331\225\225U\331\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "````````````````````````````````\253\254\256\256\253\254\256\256````````````````````````````````\253\254\256\256\253\254\256\256````````````````````````````````\253\254\256\256\253\254\256\256````````````````````````````````\253\254\256\256\253\254\256\256````````````````````````````````\253\254\256\256\253\254\256\256````````````````````````````````\253\254\256\256\253\254\256\256````````````````````````````````\253\254\256\256\253\254\256\256````````````````````````````````\253\254\256\256\253\254\256\256!" + "'", str2, "````````````````````````````````\253\254\256\256\253\254\256\256````````````````````````````````\253\254\256\256\253\254\256\256````````````````````````````````\253\254\256\256\253\254\256\256````````````````````````````````\253\254\256\256\253\254\256\256````````````````````````````````\253\254\256\256\253\254\256\256````````````````````````````````\253\254\256\256\253\254\256\256````````````````````````````````\253\254\256\256\253\254\256\256````````````````````````````````\253\254\256\256\253\254\256\256!");
    }

    @Test
    public void test05025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05025");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!" + "'", str2, "\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!");
    }

    @Test
    public void test05026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05026");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test05027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05027");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("}~\200\200}~\200\200nullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnull!", "UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNN!!UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNN!!UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNN!!UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNN!!UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200NNUUNNUUNNUUNNUU^NNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUU^NNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUU}~\200\200}~\200\200NNUUNNUUNNUUNNUU^NNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUU^NNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUU!" + "'", str2, "}~\200\200}~\200\200NNUUNNUUNNUUNNUU^NNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUU^NNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUU}~\200\200}~\200\200NNUUNNUUNNUUNNUU^NNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUU^NNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUU!");
    }

    @Test
    public void test05028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05028");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05029");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\230\230\225\225\230\230\225\225!", "\253\254\256\256!JJJ!JJJ!JJJ!JJJ\253\254\256\256!JJJ!JJJ!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230\230\225\225\230\230\225\225!" + "'", str2, "\230\230\225\225\230\230\225\225!");
    }

    @Test
    public void test05030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05030");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0346\u0348\u0348!", "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test05031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05031");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!", "!!~~!!~~!!!!~~!!~~!!!!~~!!~~!!~~!!~~!!!!~~!!~~!!!!~~!!~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!" + "'", str2, "!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!");
    }

    @Test
    public void test05032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05032");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!!", "\u0366\u0365\u0368\u0368ULLLULLL!!ULLLULLL!!\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test05033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05033");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!", "\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!" + "'", str2, "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test05034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05034");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("XXXX\200}}`XXXX]]!", "UNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\200}}`nullnullnullnull]]!" + "'", str2, "nullnullnullnull\200}}`nullnullnullnull]]!");
    }

    @Test
    public void test05035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05035");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!\200\200\u0346\u0348\u0348!", "\275\300\300\300\276\300\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test05036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05036");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "EHHH\200}}`EHHH]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05037");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108!", "NNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!" + "'", str2, "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
    }

    @Test
    public void test05038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05038");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull!!\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull!!\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull!!\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull!!\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull!", "~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull~~~~~~~~nullnullnullnullnullnullnullnull~~~~~~~~!!nullnullnullnullnullnullnullnull~~~~~~~~nullnullnullnullnullnullnullnull~~~~~~~~!!nullnullnullnullnullnullnullnull~~~~~~~~nullnullnullnullnullnullnullnull~~~~~~~~nullnullnullnullnullnullnullnull~~~~~~~~nullnullnullnullnullnullnullnull~~~~~~~~!!nullnullnullnullnullnullnullnull~~~~~~~~nullnullnullnullnullnullnullnull~~~~~~~~!!nullnullnullnullnullnullnullnull~~~~~~~~nullnullnullnullnullnullnullnull~~~~~~~~!" + "'", str2, "nullnullnullnullnullnullnullnull~~~~~~~~nullnullnullnullnullnullnullnull~~~~~~~~!!nullnullnullnullnullnullnullnull~~~~~~~~nullnullnullnullnullnullnullnull~~~~~~~~!!nullnullnullnullnullnullnullnull~~~~~~~~nullnullnullnullnullnullnullnull~~~~~~~~nullnullnullnullnullnullnullnull~~~~~~~~nullnullnullnullnullnullnullnull~~~~~~~~!!nullnullnullnullnullnullnullnull~~~~~~~~nullnullnullnullnullnullnullnull~~~~~~~~!!nullnullnullnullnullnullnullnull~~~~~~~~nullnullnullnullnullnullnullnull~~~~~~~~!");
    }

    @Test
    public void test05039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05039");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!X!", "nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226!!nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!" + "'", str2, "!null!");
    }

    @Test
    public void test05040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05040");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "nullnullnullnullnullnullnullnullnull\230nullnullnull\230nullnullnullnullnullnullnullnullnullnullnull\230nullnullnull\230nullnullnullnullnullnullnullnullnullnullnull\230nullnullnull\230nullnullnullnullnullnullnullnullnullnullnull\230nullnullnull\230nullnullnullnullnullnullnullnullnullnullnull\230nullnullnull\230nullnullnullnullnullnullnullnullnullnullnull\230nullnullnull\230nullnullnullnullnullnullnullnullnullnullnull\230nullnullnull\230nullnullnullnullnullnullnullnullnullnullnull\230nullnullnull\230nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05041");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("]!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!]]!nullnullnullnull!!!nullnullnullnull!!]]!nullnullnullnull!!!nullnullnullnull!!]]!nullnullnullnull!!!nullnullnullnull!!]]]!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!]]!nullnullnullnull!!!nullnullnullnull!!]]!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]!lnulllllnulllllnulllllnullll!!!lnulllllnulllllnulllllnullll!!!lnulllllnulllllnulllllnullll!!!lnulllllnulllllnulllllnullll!!!lnulllllnulllllnulllllnullll!!]]!lnulllllnulllllnulllllnullll!!!lnulllllnulllllnulllllnullll!!]]!lnulllllnulllllnulllllnullll!!!lnulllllnulllllnulllllnullll!!]]!lnulllllnulllllnulllllnullll!!!lnulllllnulllllnulllllnullll!!]]]!lnulllllnulllllnulllllnullll!!!lnulllllnulllllnulllllnullll!!!lnulllllnulllllnulllllnullll!!!lnulllllnulllllnulllllnullll!!!lnulllllnulllllnulllllnullll!!]]!lnulllllnulllllnulllllnullll!!!lnulllllnulllllnulllllnullll!!]]!" + "'", str2, "]!lnulllllnulllllnulllllnullll!!!lnulllllnulllllnulllllnullll!!!lnulllllnulllllnulllllnullll!!!lnulllllnulllllnulllllnullll!!!lnulllllnulllllnulllllnullll!!]]!lnulllllnulllllnulllllnullll!!!lnulllllnulllllnulllllnullll!!]]!lnulllllnulllllnulllllnullll!!!lnulllllnulllllnulllllnullll!!]]!lnulllllnulllllnulllllnullll!!!lnulllllnulllllnulllllnullll!!]]]!lnulllllnulllllnulllllnullll!!!lnulllllnulllllnulllllnullll!!!lnulllllnulllllnulllllnullll!!!lnulllllnulllllnulllllnullll!!!lnulllllnulllllnulllllnullll!!]]!lnulllllnulllllnulllllnullll!!!lnulllllnulllllnulllllnullll!!]]!");
    }

    @Test
    public void test05042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05042");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("~}\200\200~}\200\200ULLLULLLULLLULLLULLLULLLULLLULLLJJULLLULLLULLLULLLULLLULLLULLLULLLJJ~}\200\200~}\200\200ULLLULLLULLLULLLULLLULLLULLLULLLJJULLLULLLULLLULLLULLLULLLULLLULLLJJ~}\200\200~}\200\200ULLLULLLULLLULLLULLLULLLULLLULLLJJULLLULLLULLLULLLULLLULLLULLLULLLJJ~}\200\200~}\200\200ULLLULLLULLLULLLULLLULLLULLLULLLJJULLLULLLULLLULLLULLLULLLULLLULLLJJ~}\200\200~}\200\200ULLLULLLULLLULLLULLLULLLULLLULLLJJULLLULLLULLLULLLULLLULLLULLLULLLJJ~}\200\200~}\200\200ULLLULLLULLLULLLULLLULLLULLLULLLJJULLLULLLULLLULLLULLLULLLULLLULLLJJ~}\200\200~}\200\200ULLLULLLULLLULLLULLLULLLULLLULLLJJULLLULLLULLLULLLULLLULLLULLLULLLJJ~}\200\200~}\200\200ULLLULLLULLLULLLULLLULLLULLLULLLJJULLLULLLULLLULLLULLLULLLULLLULLLJJ!", "FEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHEEFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHEE~}\200\200~}\200\200FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHEEFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHEE~}\200\200~}\200\200FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHEEFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHEE~}\200\200~}\200\200FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHEEFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHEE~}\200\200~}\200\200FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHEEFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHEE~}\200\200~}\200\200FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHEEFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHEE~}\200\200~}\200\200FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHEEFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHEE~}\200\200~}\200\200FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHEEFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHEE!" + "'", str2, "~}\200\200~}\200\200FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHEEFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHEE~}\200\200~}\200\200FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHEEFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHEE~}\200\200~}\200\200FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHEEFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHEE~}\200\200~}\200\200FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHEEFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHEE~}\200\200~}\200\200FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHEEFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHEE~}\200\200~}\200\200FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHEEFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHEE~}\200\200~}\200\200FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHEEFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHEE~}\200\200~}\200\200FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHEEFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHEE!");
    }

    @Test
    public void test05043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05043");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!", "nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!" + "'", str2, "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
    }

    @Test
    public void test05044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05044");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!", "nullnullLULLLULLLULLLULLnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!" + "'", str2, "LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!");
    }

    @Test
    public void test05045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05045");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~NNN\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~NNN]]!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!!!\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!!!]]!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!!!\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!!!]]!");
    }

    @Test
    public void test05046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05046");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226!!]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226!!!", "P\220NN\200}}`P\220NN]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226!!]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226!!!" + "'", str2, "]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226!!]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226!!!");
    }

    @Test
    public void test05047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05047");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "null\335\340\340null\335\340\340null\335\340\340null\335\340\340null\335\340\340null\335\340\340null\335\340\340null\335\340\340!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\300\300!!\300\300!!\300\300!!\300\300\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\300\300!!\300\300!!\300\300!!\300\300\u0346\u0348\u0348!");
    }

    @Test
    public void test05048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05048");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!!\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!!\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!!\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!!\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05049");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!!!!!!!!!!!!!!!\254~\256\256\254~\256\256\254~\256\256\254~\256\256!", "L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!\254~\256\256\254~\256\256\254~\256\256\254~\256\256!" + "'", str2, "!!!!!!!!!!!!!!!!\254~\256\256\254~\256\256\254~\256\256\254~\256\256!");
    }

    @Test
    public void test05050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05050");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullUUUUUUUUnullnullUUUUUUUUnullnullUUUUUUUUnullnullUUUUUUUUnullnullUUUUUUUUnullnullUUUUUUUUnullnullUUUUUUUUnullnullUUUUUUUU!", "\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\254\u02be\u02be!\254\u02be\u02be!!!!!!!!!\254\u02be\u02be!\254\u02be\u02be!!!!!!!!!\254\u02be\u02be!\254\u02be\u02be!!!!!!!!!\254\u02be\u02be!\254\u02be\u02be!!!!!!!!!\254\u02be\u02be!\254\u02be\u02be!!!!!!!!!\254\u02be\u02be!\254\u02be\u02be!!!!!!!!!\254\u02be\u02be!\254\u02be\u02be!!!!!!!!!\254\u02be\u02be!\254\u02be\u02be!!!!!!!!!" + "'", str2, "!\254\u02be\u02be!\254\u02be\u02be!!!!!!!!!\254\u02be\u02be!\254\u02be\u02be!!!!!!!!!\254\u02be\u02be!\254\u02be\u02be!!!!!!!!!\254\u02be\u02be!\254\u02be\u02be!!!!!!!!!\254\u02be\u02be!\254\u02be\u02be!!!!!!!!!\254\u02be\u02be!\254\u02be\u02be!!!!!!!!!\254\u02be\u02be!\254\u02be\u02be!!!!!!!!!\254\u02be\u02be!\254\u02be\u02be!!!!!!!!!");
    }

    @Test
    public void test05051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05051");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]!", "!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]!" + "'", str2, "\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]!");
    }

    @Test
    public void test05052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05052");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UNLLnullnullnullUNLLnullnullnullUNLLnullnullnullUNLLnullnullnullUNLLnullnullnullUNLLnullnullnullUNLLnullnullnullUNLLnullnullnull!" + "'", str2, "UNLLnullnullnullUNLLnullnullnullUNLLnullnullnullUNLLnullnullnullUNLLnullnullnullUNLLnullnullnullUNLLnullnullnullUNLLnullnullnull!");
    }

    @Test
    public void test05053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05053");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!!", "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368NULLNULL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!!" + "'", str2, "LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!!");
    }

    @Test
    public void test05054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05054");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275\300\300\300\275\300\300\300!", "!\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275NNN\275NNN!" + "'", str2, "\275NNN\275NNN!");
    }

    @Test
    public void test05055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05055");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("nullvvvnullvvvnullvvvnullvvv\200}}`nullvvvnullvvvnullvvvnullvvv]]!", "!!\336\336\336\336\336\336\336\336!!\336\336\336\336\336\336\336\336!!\336\336\336\336\336\336\336\336!!\336\336\336\336\336\336\336\336!!\336\336\336\336\336\336\336\336!!\336\336\336\336\336\336\336\336!!\336\336\336\336\336\336\336\336!!\336\336\336\336\336\336\336\336!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test05056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05056");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!!\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!!\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!!\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!!\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!", "UNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!!" + "'", str2, "\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!\216\216NU!!NU!!!");
    }

    @Test
    public void test05057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05057");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!", "\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!" + "'", str2, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
    }

    @Test
    public void test05058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05058");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253UNLLUNLL\253\253UNLLUNLL\253\253UNLLUNLL\253\253UNLLUNLL\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253UNLLUNLL\253\253UNLLUNLL\253\253!", "!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253!" + "'", str2, "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253!");
    }

    @Test
    public void test05059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05059");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("````\220````````\200~~````\220````````\200~~````\220````````````\220````````````\220````````\200~~````\220````````\200~~````\220````````````\220````````!!````\220````````\200~~````\220````````\200~~````\220````````````\220````````````\220````````\200~~````\220````````\200~~````\220````````````\220````````!!````\220````````\200~~````\220````````\200~~````\220````````````\220````````````\220````````\200~~````\220````````\200~~````\220````````````\220````````````\220````````\200~~````\220````````\200~~````\220````````````\220````````````\220````````\200~~````\220````````\200~~````\220````````````\220````````!!````\220````````\200~~````\220````````\200~~````\220````````````\220````````````\220````````\200~~````\220````````\200~~````\220````````````\220````````!!````\220````````\200~~````\220````````\200~~````\220````````````\220````````````\220````````\200~~````\220````````\200~~````\220````````````\220````````!", "nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226!!nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "````\220````````\200~~````\220````````\200~~````\220````````````\220````````````\220````````\200~~````\220````````\200~~````\220````````````\220````````!!````\220````````\200~~````\220````````\200~~````\220````````````\220````````````\220````````\200~~````\220````````\200~~````\220````````````\220````````!!````\220````````\200~~````\220````````\200~~````\220````````````\220````````````\220````````\200~~````\220````````\200~~````\220````````````\220````````````\220````````\200~~````\220````````\200~~````\220````````````\220````````````\220````````\200~~````\220````````\200~~````\220````````````\220````````!!````\220````````\200~~````\220````````\200~~````\220````````````\220````````````\220````````\200~~````\220````````\200~~````\220````````````\220````````!!````\220````````\200~~````\220````````\200~~````\220````````````\220````````````\220````````\200~~````\220````````\200~~````\220````````````\220````````!" + "'", str2, "````\220````````\200~~````\220````````\200~~````\220````````````\220````````````\220````````\200~~````\220````````\200~~````\220````````````\220````````!!````\220````````\200~~````\220````````\200~~````\220````````````\220````````````\220````````\200~~````\220````````\200~~````\220````````````\220````````!!````\220````````\200~~````\220````````\200~~````\220````````````\220````````````\220````````\200~~````\220````````\200~~````\220````````````\220````````````\220````````\200~~````\220````````\200~~````\220````````````\220````````````\220````````\200~~````\220````````\200~~````\220````````````\220````````!!````\220````````\200~~````\220````````\200~~````\220````````````\220````````````\220````````\200~~````\220````````\200~~````\220````````````\220````````!!````\220````````\200~~````\220````````\200~~````\220````````````\220````````````\220````````\200~~````\220````````\200~~````\220````````````\220````````!");
    }

    @Test
    public void test05060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05060");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!", "nullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!" + "'", str2, "\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!");
    }

    @Test
    public void test05061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05061");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0346\u0348\u0348!", "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368XXXXXXXX!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test05062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05062");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d!!!", "}}}}}}}}!!!!}}}}}}}}!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test05063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05063");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220!!\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220!!!", "\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220!!\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220!!!" + "'", str2, "\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220!!\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220!!!");
    }

    @Test
    public void test05064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05064");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275!!!\275!!!\275!!!\275!!!!!\275\275!!\275\275!!\275\275!!\275\275\275!!!\275!!!\275!!!\275!!!!!\275\275!!\275\275!", "\u0104\u0104!LL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275!!!\275!!!\275!!!\275!!!!!\275\275!!\275\275!!\275\275!!\275\275\275!!!\275!!!\275!!!\275!!!!!\275\275!!\275\275!" + "'", str2, "\275!!!\275!!!\275!!!\275!!!!!\275\275!!\275\275!!\275\275!!\275\275\275!!!\275!!!\275!!!\275!!!!!\275\275!!\275\275!");
    }

    @Test
    public void test05065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05065");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368N!!!N!!!\200\200\u0346\u0348\u0348!", "UULLUULLUULLUULLUULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368U!!!U!!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368U!!!U!!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test05066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05066");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05067");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!!wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!!wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!!wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!!wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05068");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("null\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnull\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!null\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnull\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!!", "\265\276\276\276\265\276\276\276\276\276\265\276\276\276\265\276\276\276\276\276\265\276\276\276\265\276\276\276\276\276\265\276\276\276\265\276\276\276\276\276\265\276\276\276\265\276\276\276\276\276\265\276\276\276\265\276\276\276\276\276\265\276\276\276\265\276\276\276\276\276\265\276\276\276\265\276\276\276\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!!" + "'", str2, "\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!!");
    }

    @Test
    public void test05069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05069");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!!", "\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!!" + "'", str2, "\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!!");
    }

    @Test
    public void test05070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05070");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256!", "nullnullnullnullnullnullnullnulll!nnl!nnnullnullnullnullnullnullnullnulll!nnl!nnnullnullnullnullnullnullnullnulll!nnl!nnnullnullnullnullnullnullnullnulll!nnl!nnnullnullnullnullnullnullnullnulll!nnl!nnnullnullnullnullnullnullnullnulll!nnl!nnnullnullnullnullnullnullnullnulll!nnl!nnnullnullnullnullnullnullnullnulll!nnl!nn!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256!" + "'", str2, "~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256!");
    }

    @Test
    public void test05071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05071");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\336\336LL\336\336LL!!\336\336LL\336\336LL!!\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL!!\336\336LL\336\336LL!!\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL!!\336\336LL\336\336LL!!\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL!!\336\336LL\336\336LL!!\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL!!\336\336LL\336\336LL!!\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL!!\336\336LL\336\336LL!!\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL!!\336\336LL\336\336LL!!\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL!!\336\336LL\336\336LL!!\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL!", "N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nn\200\200nn\200\200!!nn\200\200nn\200\200!!nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200!!nn\200\200nn\200\200!!nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200!!nn\200\200nn\200\200!!nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200!!nn\200\200nn\200\200!!nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200!!nn\200\200nn\200\200!!nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200!!nn\200\200nn\200\200!!nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200!!nn\200\200nn\200\200!!nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200!!nn\200\200nn\200\200!!nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200!" + "'", str2, "nn\200\200nn\200\200!!nn\200\200nn\200\200!!nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200!!nn\200\200nn\200\200!!nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200!!nn\200\200nn\200\200!!nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200!!nn\200\200nn\200\200!!nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200!!nn\200\200nn\200\200!!nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200!!nn\200\200nn\200\200!!nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200!!nn\200\200nn\200\200!!nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200!!nn\200\200nn\200\200!!nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200!");
    }

    @Test
    public void test05072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05072");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266!", "U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~NN!~NN!~NN!~NN!~NN!~NN!~NN!~NN\276\276\266\266\276\276\266\266!~NN!~NN!~NN!~NN!~NN!~NN!~NN!~NN\276\276\266\266\276\276\266\266!~NN!~NN!~NN!~NN!~NN!~NN!~NN!~NN\276\276\266\266\276\276\266\266!~NN!~NN!~NN!~NN!~NN!~NN!~NN!~NN\276\276\266\266\276\276\266\266!~NN!~NN!~NN!~NN!~NN!~NN!~NN!~NN\276\276\266\266\276\276\266\266!~NN!~NN!~NN!~NN!~NN!~NN!~NN!~NN\276\276\266\266\276\276\266\266!~NN!~NN!~NN!~NN!~NN!~NN!~NN!~NN\276\276\266\266\276\276\266\266!~NN!~NN!~NN!~NN!~NN!~NN!~NN!~NN\276\276\266\266\276\276\266\266!" + "'", str2, "!~NN!~NN!~NN!~NN!~NN!~NN!~NN!~NN\276\276\266\266\276\276\266\266!~NN!~NN!~NN!~NN!~NN!~NN!~NN!~NN\276\276\266\266\276\276\266\266!~NN!~NN!~NN!~NN!~NN!~NN!~NN!~NN\276\276\266\266\276\276\266\266!~NN!~NN!~NN!~NN!~NN!~NN!~NN!~NN\276\276\266\266\276\276\266\266!~NN!~NN!~NN!~NN!~NN!~NN!~NN!~NN\276\276\266\266\276\276\266\266!~NN!~NN!~NN!~NN!~NN!~NN!~NN!~NN\276\276\266\266\276\276\266\266!~NN!~NN!~NN!~NN!~NN!~NN!~NN!~NN\276\276\266\266\276\276\266\266!~NN!~NN!~NN!~NN!~NN!~NN!~NN!~NN\276\276\266\266\276\276\266\266!");
    }

    @Test
    public void test05073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05073");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!", "~}\200\200~}\200\200HHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHH~}\200\200~}\200\200HHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHH~}\200\200~}\200\200HHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHH~}\200\200~}\200\200HHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHH~}\200\200~}\200\200HHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHH~}\200\200~}\200\200HHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHH~}\200\200~}\200\200HHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHH~}\200\200~}\200\200HHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!" + "'", str2, "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!");
    }

    @Test
    public void test05074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05074");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "N\254NNN\254NNN\254NNN\254NN!N\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NN!N\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NN!N\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NN!N\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NN!N\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NN!N\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NN!N\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NN!N\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!" + "'", str2, "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!");
    }

    @Test
    public void test05075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05075");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\275L!]]L!]]L!]]\275L!]]L!]]L!]]!", "\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016enullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\u03c0\u03c0\u03c0!]]\275\u03c0\u03c0\u03c0!]]!" + "'", str2, "\275\u03c0\u03c0\u03c0!]]\275\u03c0\u03c0\u03c0!]]!");
    }

    @Test
    public void test05076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05076");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL!", "\275\335\336\340\340\335\336\340\340\335\336\340\340\276\335\336\340\340\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300!" + "'", str2, "\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300!");
    }

    @Test
    public void test05077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05077");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\275\276L\225\225\276L\225\225\200\200\276L\225\225\276L\225\225\200\200\276L\225\225\276L\225\225\200\200\276\276L\225\225\276L\225\225\200\200\275\275!", "\u0143\u0145\u0145\u0143\u0145\u0145\u0143\u0145\u0145\u0143\u0145\u0145\u0143\u0145\u0145\u0143\u0145\u0145\u0143\u0145\u0145\u0143\u0145\u0145!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276null\225\225\276null\225\225\200\200\276null\225\225\276null\225\225\200\200\276null\225\225\276null\225\225\200\200\276\276null\225\225\276null\225\225\200\200\275\275!" + "'", str2, "\275\276null\225\225\276null\225\225\200\200\276null\225\225\276null\225\225\200\200\276null\225\225\276null\225\225\200\200\276\276null\225\225\276null\225\225\200\200\275\275!");
    }

    @Test
    public void test05078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05078");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("ULLL\200}}`ULLL]]!", "\u0126\u0128\u0128\u0126\u0128\u0128!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JLLL\200}}`JLLL]]!" + "'", str2, "JLLL\200}}`JLLL]]!");
    }

    @Test
    public void test05079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05079");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!!", "null\254\256\256null\254\256\256nullnullnullnullnullnullnullnullnull\254\256\256null\254\256\256nullnullnullnullnullnullnullnullnull\254\256\256null\254\256\256nullnullnullnullnullnullnullnullnull\254\256\256null\254\256\256nullnullnullnullnullnullnullnullnull\254\256\256null\254\256\256nullnullnullnullnullnullnullnullnull\254\256\256null\254\256\256nullnullnullnullnullnullnullnullnull\254\256\256null\254\256\256nullnullnullnullnullnullnullnullnull\254\256\256null\254\256\256nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!!" + "'", str2, "!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!!");
    }

    @Test
    public void test05080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05080");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!!\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!!\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!!\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!!\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!", "!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!!\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!!\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!!\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!!\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!" + "'", str2, "\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!!\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!!\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!!\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!!\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!");
    }

    @Test
    public void test05081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05081");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!~nullnull!~nullnull!!!~nullnull!~nullnull!!!~nullnull!~nullnull!~nullnull!~nullnull!!!~nullnull!~nullnull!!!~nullnull!~nullnull!", "\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!" + "'", str2, "!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05082");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "\u0126\u0128\u0128\u0126\u0128\u0128!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test05083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05083");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LNNN\256\254\254LNNN\256\254\254!!LNNN\256\254\254LNNN\256\254\254!!LNNN\256\254\254LNNN\256\254\254!!LNNN\256\254\254LNNN\256\254\254!!LNNN\256\254\254LNNN\256\254\254!!LNNN\256\254\254LNNN\256\254\254!!LNNN\256\254\254LNNN\256\254\254!!LNNN\256\254\254LNNN\256\254\254!!!", "}~\200\200}~\200\200TTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRR}~\200\200}~\200\200TTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRR!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RTTT\256\254\254RTTT\256\254\254!!RTTT\256\254\254RTTT\256\254\254!!RTTT\256\254\254RTTT\256\254\254!!RTTT\256\254\254RTTT\256\254\254!!RTTT\256\254\254RTTT\256\254\254!!RTTT\256\254\254RTTT\256\254\254!!RTTT\256\254\254RTTT\256\254\254!!RTTT\256\254\254RTTT\256\254\254!!!" + "'", str2, "RTTT\256\254\254RTTT\256\254\254!!RTTT\256\254\254RTTT\256\254\254!!RTTT\256\254\254RTTT\256\254\254!!RTTT\256\254\254RTTT\256\254\254!!RTTT\256\254\254RTTT\256\254\254!!RTTT\256\254\254RTTT\256\254\254!!RTTT\256\254\254RTTT\256\254\254!!RTTT\256\254\254RTTT\256\254\254!!!");
    }

    @Test
    public void test05084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05084");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253!", "````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253!" + "'", str2, "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253!");
    }

    @Test
    public void test05085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05085");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!\254\u02be\u02be!\254\u02be\u02be!!!!!!!!!\254\u02be\u02be!\254\u02be\u02be!!!!!!!!!\254\u02be\u02be!\254\u02be\u02be!!!!!!!!!\254\u02be\u02be!\254\u02be\u02be!!!!!!!!!\254\u02be\u02be!\254\u02be\u02be!!!!!!!!!\254\u02be\u02be!\254\u02be\u02be!!!!!!!!!\254\u02be\u02be!\254\u02be\u02be!!!!!!!!!\254\u02be\u02be!\254\u02be\u02be!!!!!!!!!", "UNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!" + "'", str2, "!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!");
    }

    @Test
    public void test05086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05086");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "\u016e\u016e\275\u016e\u016e\u016e\u016e\u016e\u016e\275\u016e\u016e\u016e\u016e\u016e\u016e\275\u016e\u016e\u016e\u016e\u016e\u016e\275\u016e\u016e\u016e\u016e\u016e\u016e\275\u016e\u016e\u016e\u016e\u016e\u016e\275\u016e\u016e\u016e\u016e\u016e\u016e\275\u016e\u016e\u016e\u016e\u016e\u016e\275\u016e\u016e\u016e\u016e\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275\u016e\u016e\275\u016e\u016e\u016e\u016e\u016e\u016e\275\u016e\u016e\u016e\u016e\u016e\u016e\275\u016e\u016e\u016e\u016e\u016e\u016e\275\u016e\u016e\u016e\u016e\u016e\u016e\275\u016e\u016e\u016e\u016e\u016e\u016e\275\u016e\u016e\u016e\u016e\u016e\u016e\275\u016e\u016e\u016e\u016e\u016e\u016e\275\u016e\u016e\u016e\u016e\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test05087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05087");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368\275!!!\275!!!\204\204\275!!!\275!!!\275!!!\275!!!\275!!!\204\204\275!!!\275!!!\275!!!!!\275!!!\275!!!\204\204\275!!!\275!!!\275!!!\275!!!\275!!!\204\204\275!!!\275!!!\275!!!!!\275!!!\275!!!\204\204\275!!!\275!!!\275!!!\275!!!\275!!!\204\204\275!!!\275!!!\275!!!!!\275!!!\275!!!\204\204\275!!!\275!!!\275!!!\275!!!\275!!!\204\204\275!!!\275!!!\275\u0346\u0348\u0348!", "!\253\256\256\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\275!!!\275!!!\204\204\275!!!\275!!!\275!!!\275!!!\275!!!\204\204\275!!!\275!!!\275!!!!!\275!!!\275!!!\204\204\275!!!\275!!!\275!!!\275!!!\275!!!\204\204\275!!!\275!!!\275!!!!!\275!!!\275!!!\204\204\275!!!\275!!!\275!!!\275!!!\275!!!\204\204\275!!!\275!!!\275!!!!!\275!!!\275!!!\204\204\275!!!\275!!!\275!!!\275!!!\275!!!\204\204\275!!!\275!!!\275\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\275!!!\275!!!\204\204\275!!!\275!!!\275!!!\275!!!\275!!!\204\204\275!!!\275!!!\275!!!!!\275!!!\275!!!\204\204\275!!!\275!!!\275!!!\275!!!\275!!!\204\204\275!!!\275!!!\275!!!!!\275!!!\275!!!\204\204\275!!!\275!!!\275!!!\275!!!\275!!!\204\204\275!!!\275!!!\275!!!!!\275!!!\275!!!\204\204\275!!!\275!!!\275!!!\275!!!\275!!!\204\204\275!!!\275!!!\275\u0346\u0348\u0348!");
    }

    @Test
    public void test05088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05088");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!", "EEnullnullEEnullnullEEnullnullEEnullnull!EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EE!!EE!!EE!!EE!!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!!" + "'", str2, "EE!!EE!!EE!!EE!!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!!");
    }

    @Test
    public void test05089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05089");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("NNNN\230\226\226NNNN\230\226\226NNNN\230\226\226NNNN\230\226\226NNNN\230\226\226NNNN\230\226\226NNNN\230\226\226NNNN\230\226\226!!NNNN\230\226\226NNNN\230\226\226NNNN\230\226\226NNNN\230\226\226NNNN\230\226\226NNNN\230\226\226NNNN\230\226\226NNNN\230\226\226!!!", "}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226!!nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226!!!" + "'", str2, "nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226!!nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226!!!");
    }

    @Test
    public void test05090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05090");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!", "\200~\200\200\200~\200\200!!\200~\200\200\200~\200\200!!\200~\200\200\200~\200\200\200~\200\200\200~\200\200!!\200~\200\200\200~\200\200!!\200~\200\200\200~\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!" + "'", str2, "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!");
    }

    @Test
    public void test05091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05091");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!", "FEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!" + "'", str2, "!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!");
    }

    @Test
    public void test05092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05092");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368NULLNULL!", "N!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368NNLLNNLL!" + "'", str2, "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368NNLLNNLL!");
    }

    @Test
    public void test05093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05093");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!", "\326\325\330\330\325\326\330\330!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!" + "'", str2, "!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!");
    }

    @Test
    public void test05094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05094");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("null\254\253\256\256\254\253\256\256\254\253\256\256null\254\253\256\256\254\253\256\256\254\253\256\256!!null\254\253\256\256\254\253\256\256\254\253\256\256null\254\253\256\256\254\253\256\256\254\253\256\256!!null\254\253\256\256\254\253\256\256\254\253\256\256null\254\253\256\256\254\253\256\256\254\253\256\256!!null\254\253\256\256\254\253\256\256\254\253\256\256null\254\253\256\256\254\253\256\256\254\253\256\256!!null\254\253\256\256\254\253\256\256\254\253\256\256null\254\253\256\256\254\253\256\256\254\253\256\256!!null\254\253\256\256\254\253\256\256\254\253\256\256null\254\253\256\256\254\253\256\256\254\253\256\256!!null\254\253\256\256\254\253\256\256\254\253\256\256null\254\253\256\256\254\253\256\256\254\253\256\256!!null\254\253\256\256\254\253\256\256\254\253\256\256null\254\253\256\256\254\253\256\256\254\253\256\256!!!", "\u0348l!!\200\u0348l!!]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]null!!\254\253\256\256\254\253\256\256\254\253\256\256]null!!\254\253\256\256\254\253\256\256\254\253\256\256!!]null!!\254\253\256\256\254\253\256\256\254\253\256\256]null!!\254\253\256\256\254\253\256\256\254\253\256\256!!]null!!\254\253\256\256\254\253\256\256\254\253\256\256]null!!\254\253\256\256\254\253\256\256\254\253\256\256!!]null!!\254\253\256\256\254\253\256\256\254\253\256\256]null!!\254\253\256\256\254\253\256\256\254\253\256\256!!]null!!\254\253\256\256\254\253\256\256\254\253\256\256]null!!\254\253\256\256\254\253\256\256\254\253\256\256!!]null!!\254\253\256\256\254\253\256\256\254\253\256\256]null!!\254\253\256\256\254\253\256\256\254\253\256\256!!]null!!\254\253\256\256\254\253\256\256\254\253\256\256]null!!\254\253\256\256\254\253\256\256\254\253\256\256!!]null!!\254\253\256\256\254\253\256\256\254\253\256\256]null!!\254\253\256\256\254\253\256\256\254\253\256\256!!!" + "'", str2, "]null!!\254\253\256\256\254\253\256\256\254\253\256\256]null!!\254\253\256\256\254\253\256\256\254\253\256\256!!]null!!\254\253\256\256\254\253\256\256\254\253\256\256]null!!\254\253\256\256\254\253\256\256\254\253\256\256!!]null!!\254\253\256\256\254\253\256\256\254\253\256\256]null!!\254\253\256\256\254\253\256\256\254\253\256\256!!]null!!\254\253\256\256\254\253\256\256\254\253\256\256]null!!\254\253\256\256\254\253\256\256\254\253\256\256!!]null!!\254\253\256\256\254\253\256\256\254\253\256\256]null!!\254\253\256\256\254\253\256\256\254\253\256\256!!]null!!\254\253\256\256\254\253\256\256\254\253\256\256]null!!\254\253\256\256\254\253\256\256\254\253\256\256!!]null!!\254\253\256\256\254\253\256\256\254\253\256\256]null!!\254\253\256\256\254\253\256\256\254\253\256\256!!]null!!\254\253\256\256\254\253\256\256\254\253\256\256]null!!\254\253\256\256\254\253\256\256\254\253\256\256!!!");
    }

    @Test
    public void test05095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05095");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!!nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!!!", "\253\254\256\256null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!\253\254\256\256null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test05096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05096");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~!" + "'", str2, "\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~!");
    }

    @Test
    public void test05097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05097");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!!", "}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200\204\204}~\200\200}~\200\200\204\204}~\200\200}~\200\200\204\204}~\200\200}~\200\200\204\204}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200\204\204}~\200\200}~\200\200\204\204!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!!" + "'", str2, "\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!!");
    }

    @Test
    public void test05098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05098");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!", "NN``NN``NN``NN``NN``NN``NN``NN``\214\214NN``NN``NN``NN``NN``NN``NN``NN``\214\214NN``NN``NN``NN``NN``NN``NN``NN``\214\214NN``NN``NN``NN``NN``NN``NN``NN``\214\214NN``NN``NN``NN``NN``NN``NN``NN``\214\214NN``NN``NN``NN``NN``NN``NN``NN``\214\214NN``NN``NN``NN``NN``NN``NN``NN``\214\214NN``NN``NN``NN``NN``NN``NN``NN``\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!" + "'", str2, "!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!");
    }

    @Test
    public void test05099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05099");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("u]uuu]uu!!u]uuu]uu!!u]uuu]uuu]uuu]uu!!u]uuu]uu!!u]uuu]uu!", "\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc!" + "'", str2, "\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc!");
    }

    @Test
    public void test05100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05100");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\300\300\275\275\300\300\275\275\300\300\275\275\300\300\275\275\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\300\300\275\275\300\300\275\275!", "UN\275\275UN\275\275LLUN\275\275UN\275\275LLUN\275\275UN\275\275LLUN\275\275UN\275\275LLUN\275\275UN\275\275LLUN\275\275UN\275\275LLUN\275\275UN\275\275LLUN\275\275UN\275\275LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnullnullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnullnullnull\275\275nullnull\275\275!" + "'", str2, "\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnullnullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnullnullnull\275\275nullnull\275\275!");
    }

    @Test
    public void test05101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05101");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!L\230NNL\230NNL\230NN!L\230NNL\230NNL\230NN!L\230NNL\230NNL\230NN!L\230NNL\230NNL\230NN!!L\230NNL\230NN!!L\230NNL\230NN!!L\230NNL\230NN!!L\230NNL\230NN!L\230NNL\230NNL\230NN!L\230NNL\230NNL\230NN!L\230NNL\230NNL\230NN!L\230NNL\230NNL\230NN!!L\230NNL\230NN!!L\230NNL\230NN!", "\u03dd\u03e0\u03e0\u03dd\u03e0\u03e0\u03dd\u03e0\u03e0\u03dd\u03e0\u03e0\u03dd\u03e0\u03e0\u03dd\u03e0\u03e0!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\207\230\204\204\207\230\204\204\207\230\204\204!\207\230\204\204\207\230\204\204\207\230\204\204!\207\230\204\204\207\230\204\204\207\230\204\204!\207\230\204\204\207\230\204\204\207\230\204\204!!\207\230\204\204\207\230\204\204!!\207\230\204\204\207\230\204\204!!\207\230\204\204\207\230\204\204!!\207\230\204\204\207\230\204\204!\207\230\204\204\207\230\204\204\207\230\204\204!\207\230\204\204\207\230\204\204\207\230\204\204!\207\230\204\204\207\230\204\204\207\230\204\204!\207\230\204\204\207\230\204\204\207\230\204\204!!\207\230\204\204\207\230\204\204!!\207\230\204\204\207\230\204\204!" + "'", str2, "!\207\230\204\204\207\230\204\204\207\230\204\204!\207\230\204\204\207\230\204\204\207\230\204\204!\207\230\204\204\207\230\204\204\207\230\204\204!\207\230\204\204\207\230\204\204\207\230\204\204!!\207\230\204\204\207\230\204\204!!\207\230\204\204\207\230\204\204!!\207\230\204\204\207\230\204\204!!\207\230\204\204\207\230\204\204!\207\230\204\204\207\230\204\204\207\230\204\204!\207\230\204\204\207\230\204\204\207\230\204\204!\207\230\204\204\207\230\204\204\207\230\204\204!\207\230\204\204\207\230\204\204\207\230\204\204!!\207\230\204\204\207\230\204\204!!\207\230\204\204\207\230\204\204!");
    }

    @Test
    public void test05102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05102");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!!!!!", "NN!!NN!!LNNNLNNNNN!!NN!!LNNNLNNNNN!!NN!!LNNNLNNNNN!!NN!!LNNNLNNNNN!!NN!!LNNNLNNNNN!!NN!!LNNNLNNNNN!!NN!!LNNNLNNNNN!!NN!!LNNNLNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!!!!!" + "'", str2, "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!!!!!");
    }

    @Test
    public void test05103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05103");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!", "\246\246!!\246\246!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!" + "'", str2, "}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!");
    }

    @Test
    public void test05104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05104");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ!", "\275\276\300\300\275\276\300\300\225\225\275\276\300\300\275\276\300\300\225\225\275\276\300\300\275\276\300\300\225\225\275\276\300\300\275\276\300\300\225\225\275\276\300\300\275\276\300\300\225\225\275\276\300\300\275\276\300\300\225\225\275\276\300\300\275\276\300\300\225\225\275\276\300\300\275\276\300\300\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull!" + "'", str2, "~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test05105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05105");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275\276L\225\225\276L\225\225\200\200\276L\225\225\276L\225\225\200\200\276L\225\225\276L\225\225\200\200\276\276L\225\225\276L\225\225\200\200\275\275!", "LL]NNLLLL]NNLLLL]NNLLLL]NNLL!LL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLL!LL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLL!LL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLL!LL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLL!LL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLL!LL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLL!LL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLL!LL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276N\225\225\276N\225\225\200\200\276N\225\225\276N\225\225\200\200\276N\225\225\276N\225\225\200\200\276\276N\225\225\276N\225\225\200\200\275\275!" + "'", str2, "\275\276N\225\225\276N\225\225\200\200\276N\225\225\276N\225\225\200\200\276N\225\225\276N\225\225\200\200\276\276N\225\225\276N\225\225\200\200\275\275!");
    }

    @Test
    public void test05106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05106");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0144\u0143\u0146\u0146\u0144\u0143\u0146\u0146\u0144\u0143\u0146\u0146\u0144\u0143\u0146\u0146\u0144\u0143\u0146\u0146!", "!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!\200}}`!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`}UU`}UU`}UU`}UU`}UU!" + "'", str2, "`}UU`}UU`}UU`}UU`}UU!");
    }

    @Test
    public void test05107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05107");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260!", "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnull}~\200\200}~\200\200nullnull}~\200\200}~\200\200nullnull}~\200\200}~\200\200\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260!" + "'", str2, "nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260!");
    }

    @Test
    public void test05108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05108");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108!!!", "UUXXUUXXXXUUXXUUXXXX!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test05109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05109");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LL!!LL!!!LLL!LLLLL!!LL!!!LLL!LLLLL!!LL!!!LLL!LLLLL!!LL!!!LLL!LLLLL!!LL!!!LLL!LLLLL!!LL!!!LLL!LLLLL!!LL!!!LLL!LLLLL!!LL!!!LLL!LLL!", "\275\325nullnullnull\325nullnullnull\325nullnullnull\275\325nullnullnull\325nullnullnull\325nullnullnull\275\325nullnullnull\325nullnullnull\325nullnullnull\275\325nullnullnull\325nullnullnull\325nullnullnull\325nullnullnull\325nullnullnull\275\275\325nullnullnull\325nullnullnull\275\275\325nullnullnull\325nullnullnull\275\275\325nullnullnull\325nullnullnull\275\275\275\325nullnullnull\325nullnullnull\325nullnullnull\275\325nullnullnull\325nullnullnull\325nullnullnull\275\325nullnullnull\325nullnullnull\325nullnullnull\275\325nullnullnull\325nullnullnull\325nullnullnull\325nullnullnull\325nullnullnull\275\275\325nullnullnull\325nullnullnull\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UU!!UU!!!UUU!UUUUU!!UU!!!UUU!UUUUU!!UU!!!UUU!UUUUU!!UU!!!UUU!UUUUU!!UU!!!UUU!UUUUU!!UU!!!UUU!UUUUU!!UU!!!UUU!UUUUU!!UU!!!UUU!UUU!" + "'", str2, "UU!!UU!!!UUU!UUUUU!!UU!!!UUU!UUUUU!!UU!!!UUU!UUUUU!!UU!!!UUU!UUUUU!!UU!!!UUU!UUUUU!!UU!!!UUU!UUUUU!!UU!!!UUU!UUUUU!!UU!!!UUU!UUU!");
    }

    @Test
    public void test05110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05110");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL\253\254\256\256\253\254\256\256NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL\253\254\256\256\253\254\256\256NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL\253\254\256\256\253\254\256\256NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL\253\254\256\256\253\254\256\256NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL\253\254\256\256\253\254\256\256NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL\253\254\256\256\253\254\256\256NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL\253\254\256\256\253\254\256\256NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL\253\254\256\256\253\254\256\256!", "!UUUUUUUUUUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256\253\254\256\256!" + "'", str2, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256\253\254\256\256!");
    }

    @Test
    public void test05111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05111");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!", "]!E!!!E!!!E!!!E!!!E!!]]!E!!!E!!]]!E!!!E!!]]!E!!!E!!]]]!E!!!E!!!E!!!E!!!E!!]]!E!!!E!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!" + "'", str2, "}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!");
    }

    @Test
    public void test05112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05112");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\200}}`LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL]]!", "\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~!!\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~!!\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~!!\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~!!\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test05113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05113");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\215\215!!\215\215!!\215\215!!\215\215!!\215\215!!\215\215!!\215\215!!\215\215!!!", "!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\215!!\215\215!!\215\215!!\215\215!!\215\215!!\215\215!!\215\215!!\215\215!!!" + "'", str2, "\215\215!!\215\215!!\215\215!!\215\215!!\215\215!!\215\215!!\215\215!!\215\215!!!");
    }

    @Test
    public void test05114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05114");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("fehhfehhfehhfehhfehhfehhfehhfehh!", "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014enullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!" + "'", str2, "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!");
    }

    @Test
    public void test05115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05115");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u03c0\u03c0\u03be\u03be\u03c0\u03c0\u03be\u03be\u03c0\u03c0\u03be\u03be\u03c0\u03c0\u03be\u03be}}!", "\u0366\u0365\u0368\u0368\220\220!!\220\220!!\220\220!!\220\220\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!" + "'", str2, "nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!");
    }

    @Test
    public void test05116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05116");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("AA]]AA]]nullnullAA]]AA]]nullnull!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull]]nullnull]]nullnullnullnullnullnullnullnullnullnull]]nullnull]]nullnullnullnullnullnullnullnull!" + "'", str2, "nullnull]]nullnull]]nullnullnullnullnullnullnullnullnullnull]]nullnull]]nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05117");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!X!", "!~!!!~!!\220\220!~!!!~!!\220\220\220!~!!\220\220\220!~!!\220\220\220!~!!\220\220\220!~!!\220\220!~!!!~!!\220\220!~!!!~!!\220\220!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!" + "'", str2, "!!!");
    }

    @Test
    public void test05118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05118");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]!", "\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\214\214\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\214\214\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\214\214\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\214\214\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\214\214\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\214\214\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\214\214\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]!" + "'", str2, "]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]!");
    }

    @Test
    public void test05119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05119");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test05120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05120");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!", "UNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LNUULNUULNUULNUULNUULNUULNUULNUU!!LNUULNUULNUULNUULNUULNUULNUULNUU!!LNUULNUULNUULNUULNUULNUULNUULNUU!!LNUULNUULNUULNUULNUULNUULNUULNUU!!LNUULNUULNUULNUULNUULNUULNUULNUU!!LNUULNUULNUULNUULNUULNUULNUULNUU!!LNUULNUULNUULNUULNUULNUULNUULNUU!!LNUULNUULNUULNUULNUULNUULNUULNUU!!!" + "'", str2, "LNUULNUULNUULNUULNUULNUULNUULNUU!!LNUULNUULNUULNUULNUULNUULNUULNUU!!LNUULNUULNUULNUULNUULNUULNUULNUU!!LNUULNUULNUULNUULNUULNUULNUULNUU!!LNUULNUULNUULNUULNUULNUULNUULNUU!!LNUULNUULNUULNUULNUULNUULNUULNUU!!LNUULNUULNUULNUULNUULNUULNUULNUU!!LNUULNUULNUULNUULNUULNUULNUULNUU!!!");
    }

    @Test
    public void test05121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05121");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!\225!", "\271\271LLnullnullnull\271\271LLnullnullnull\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LLnullnullnull\271\271LLnullnullnull\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LLnullnullnull\271\271LLnullnullnull\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LLnullnullnull\271\271LLnullnullnull\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LLnullnullnull\271\271LLnullnullnull\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LLnullnullnull\271\271LLnullnullnull\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LLnullnullnull\271\271LLnullnullnull\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LLnullnullnull\271\271LLnullnullnull\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\225!" + "'", str2, "!\225!");
    }

    @Test
    public void test05122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05122");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05123");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("ULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLL!", "\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016dnullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360!" + "'", str2, "\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360!");
    }

    @Test
    public void test05124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05124");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```!", "LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```!" + "'", str2, "U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```!");
    }

    @Test
    public void test05125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05125");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0346\u0348\u0348\u0348}~\200\200}~\200\200hfhhhfhh\223\223hfhhhfhhhfhhhfhhhfhh\223\223hfhhhfhhhfhh}~\200\200}~\200\200hfhhhfhh\223\223hfhhhfhhhfhhhfhhhfhh\223\223hfhhhfhhhfhh}~\200\200}~\200\200hfhhhfhh\223\223hfhhhfhhhfhhhfhhhfhh\223\223hfhhhfhhhfhh}~\200\200}~\200\200hfhhhfhh\223\223hfhhhfhhhfhhhfhhhfhh\223\223\u0348\u0346\u0346!", "!LLL!LLL!LLL!LLL\230\226\226!LLL!LLL!LLL!LLL\230\226\226!LLL!LLL!LLL!LLL\230\226\226!LLL!LLL!LLL!LLL\230\226\226!LLL!LLL!LLL!LLL\230\226\226!LLL!LLL!LLL!LLL\230\226\226!LLL!LLL!LLL!LLL\230\226\226!LLL!LLL!LLL!LLL\230\226\226!!!LLL!LLL!LLL!LLL\230\226\226!LLL!LLL!LLL!LLL\230\226\226!LLL!LLL!LLL!LLL\230\226\226!LLL!LLL!LLL!LLL\230\226\226!LLL!LLL!LLL!LLL\230\226\226!LLL!LLL!LLL!LLL\230\226\226!LLL!LLL!LLL!LLL\230\226\226!LLL!LLL!LLL!LLL\230\226\226!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348}~\200\200}~\200\200L\226LLL\226LL\223\223L\226LLL\226LLL\226LLL\226LLL\226LL\223\223L\226LLL\226LLL\226LL}~\200\200}~\200\200L\226LLL\226LL\223\223L\226LLL\226LLL\226LLL\226LLL\226LL\223\223L\226LLL\226LLL\226LL}~\200\200}~\200\200L\226LLL\226LL\223\223L\226LLL\226LLL\226LLL\226LLL\226LL\223\223L\226LLL\226LLL\226LL}~\200\200}~\200\200L\226LLL\226LL\223\223L\226LLL\226LLL\226LLL\226LLL\226LL\223\223L\226LLL\226LLL\226\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348}~\200\200}~\200\200L\226LLL\226LL\223\223L\226LLL\226LLL\226LLL\226LLL\226LL\223\223L\226LLL\226LLL\226LL}~\200\200}~\200\200L\226LLL\226LL\223\223L\226LLL\226LLL\226LLL\226LLL\226LL\223\223L\226LLL\226LLL\226LL}~\200\200}~\200\200L\226LLL\226LL\223\223L\226LLL\226LLL\226LLL\226LLL\226LL\223\223L\226LLL\226LLL\226LL}~\200\200}~\200\200L\226LLL\226LL\223\223L\226LLL\226LLL\226LLL\226LLL\226LL\223\223L\226LLL\226LLL\226\u0348\u0346\u0346!");
    }

    @Test
    public void test05126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05126");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!!", "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!!" + "'", str2, "\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!!");
    }

    @Test
    public void test05127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05127");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("UNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUU!", "unllunllunllunllunllunllunllunll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]^^^]^^^]^^^]^^^]]]]]]]]]]]]]^^^]^^^]^^^]^^^]]]]]]]]]]]]]^^^]^^^]^^^]^^^]]]]]]]]]]]]]^^^]^^^]^^^]^^^]]]]]]]]]]]]]^^^]^^^]^^^]^^^]]]]]]]]]]]]]^^^]^^^]^^^]^^^]]]]]]]]]]]]]^^^]^^^]^^^]^^^]]]]]]]]]]]]]^^^]^^^]^^^]^^^]]]]]]]]]]]]!" + "'", str2, "]^^^]^^^]^^^]^^^]]]]]]]]]]]]]^^^]^^^]^^^]^^^]]]]]]]]]]]]]^^^]^^^]^^^]^^^]]]]]]]]]]]]]^^^]^^^]^^^]^^^]]]]]]]]]]]]]^^^]^^^]^^^]^^^]]]]]]]]]]]]]^^^]^^^]^^^]^^^]]]]]]]]]]]]]^^^]^^^]^^^]^^^]]]]]]]]]]]]]^^^]^^^]^^^]^^^]]]]]]]]]]]]!");
    }

    @Test
    public void test05128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05128");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("qrttqrttnullnullqrttqrttnullnull!", "}LLUULLUULLUU}LLUULLUULLUULLUULLUU}LLUULLUULLUU}LLUULLUULLUULLUULLUU\225\225}LLUULLUULLUU}LLUULLUULLUULLUULLUU}LLUULLUULLUU}LLUULLUULLUULLUULLUU\225\225}LLUULLUULLUU}LLUULLUULLUULLUULLUU}LLUULLUULLUU}LLUULLUULLUULLUULLUU\225\225}LLUULLUULLUU}LLUULLUULLUULLUULLUU}LLUULLUULLUU}LLUULLUULLUULLUULLUU\225\225}LLUULLUULLUU}LLUULLUULLUULLUULLUU}LLUULLUULLUU}LLUULLUULLUULLUULLUU\225\225}LLUULLUULLUU}LLUULLUULLUULLUULLUU}LLUULLUULLUU}LLUULLUULLUULLUULLUU\225\225}LLUULLUULLUU}LLUULLUULLUULLUULLUU}LLUULLUULLUU}LLUULLUULLUULLUULLUU\225\225}LLUULLUULLUU}LLUULLUULLUULLUULLUU}LLUULLUULLUU}LLUULLUULLUULLUULLUU\225\225!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c!" + "'", str2, "\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c!");
    }

    @Test
    public void test05129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05129");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("NNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NN!!NNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NN!!NNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NN!!NNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NN!!NNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NN!", "\226L\230\230LLL\226L\230\230LLLLL\226L\230\230LLL\226L\230\230LLLLL\226L\230\230LLL\226L\230\230LLLLL\226L\230\230LLL\226L\230\230LLLLL\226L\230\230LLL\226L\230\230LLLLL\226L\230\230LLL\226L\230\230LLLLL\226L\230\230LLL\226L\230\230LLLLL\226L\230\230LLL\226L\230\230LLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LL!!LLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LL!!LLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LL!!LLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LL!!LLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LL!" + "'", str2, "LLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LL!!LLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LL!!LLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LL!!LLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LL!!LLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LL!");
    }

    @Test
    public void test05130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05130");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c!", "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]nullnullnullnullnullnullnullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "]]nullnullnullnullnullnullnullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05131");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("l]lll]ll!!l]lll]ll!!l]lll]lll]lll]ll!!l]lll]ll!!l]lll]ll!", "\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!]!!!]!!!!!]!!!]!!!!!]!!!]!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!" + "'", str2, "!]!!!]!!!!!]!!!]!!!!!]!!!]!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!");
    }

    @Test
    public void test05132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05132");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!", "!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!" + "'", str2, "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!");
    }

    @Test
    public void test05133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05133");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("UU!!UU!!!", "\200unll\220\220\200unll\220\220\200unll\220\220\200unll\220\220\200unll\220\220\200unll\220\220\200unll\220\220\200unll\220\220!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ss!!ss!!!" + "'", str2, "ss!!ss!!!");
    }

    @Test
    public void test05134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05134");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!\253\256\256]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!", "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\256\256]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!" + "'", str2, "!\253\256\256]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
    }

    @Test
    public void test05135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05135");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u029e\u0346\u029e\u0346\u0366\u0366\u029e\u0346\u029e\u0346\u0366\u0366\u029e\u0346\u029e\u0346\u0366\u0366\u029e\u0346\u029e\u0346\u0366\u0366\u029e\u0346\u029e\u0346\u0366\u0366\u029e\u0346\u029e\u0346\u0366\u0366\u029e\u0346\u029e\u0346\u0366\u0366\u029e\u0346\u029e\u0346\u0366\u0366!", "!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366!" + "'", str2, "\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366!");
    }

    @Test
    public void test05136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05136");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\275null~}}null~}}\200\200null~}}null~}}\200\200null~}}null~}}\200\200\276null~}}null~}}\200\200\275\275!", "\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullnullnull~}}nullnullnullnull~}}\200\200nullnullnullnull~}}nullnullnullnull~}}\200\200nullnullnullnull~}}nullnullnullnull~}}\200\200\276nullnullnullnull~}}nullnullnullnull~}}\200\200\275\275!" + "'", str2, "\275nullnullnullnull~}}nullnullnullnull~}}\200\200nullnullnullnull~}}nullnullnullnull~}}\200\200nullnullnullnull~}}nullnullnullnull~}}\200\200\276nullnullnullnull~}}nullnullnullnull~}}\200\200\275\275!");
    }

    @Test
    public void test05137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05137");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("f]fff]ff!!f]fff]ff!!f]fff]fff]fff]ff!!f]fff]ff!!f]fff]ff!", "``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU!!``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU!!``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU!!``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU!!``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`]```]``!!`]```]``!!`]```]```]```]``!!`]```]``!!`]```]``!" + "'", str2, "`]```]``!!`]```]``!!`]```]```]```]``!!`]```]``!!`]```]``!");
    }

    @Test
    public void test05138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05138");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\215\216\230\230\276UNUUUNUUUNUU\276UNUUUNUUUNUU\276UNUUUNUUUNUU\215\216\230\230\276UNUUUNUUUNUU\276UNUUUNUUUNUU\276UNUUUNUUUNUU\215\216\230\230\276UNUUUNUUUNUU\276UNUUUNUUUNUU\276UNUUUNUUUNUU\215\216\230\230\276UNUUUNUUUNUU\276UNUUUNUUUNUU\276UNUUUNUUUNUU\215\216\230\230\276UNUUUNUUUNUU\276UNUUUNUUUNUU\276UNUUUNUUUNUU\215\216\230\230\276UNUUUNUUUNUU\276UNUUUNUUUNUU\276UNUUUNUUUNUU\215\216\230\230\276UNUUUNUUUNUU\276UNUUUNUUUNUU\276UNUUUNUUUNUU\215\216\230\230\276UNUUUNUUUNUU\276UNUUUNUUUNUU\276UNUUUNUUUNUU!", "U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU!" + "'", str2, "\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU!");
    }

    @Test
    public void test05139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05139");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL\200}}`!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05140");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "\u0366\u0365\u0368\u0368\u0123\u0124\u0126\u0126\213\213\213\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05141");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("ZWXXZWXXZWXXZWXXZWXXZWXX!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!!!!", "null\261\261\261null\261\261\261null\261\261\261null\261\261\261null\261\261\261null\261\261\261null\261\261\261null\261\261\261null\261\261\261null\261\261\261null\261\261\261null\261\261\261null\261\261\261null\261\261\261!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\261ULL\261ULL\261ULL\261ULL\261ULL\261ULL!!!!\261ULL\261ULL\261ULL\261ULL\261ULL\261ULL!!!!!!\261ULL\261ULL\261ULL\261ULL\261ULL\261ULL!!!!\261ULL\261ULL\261ULL\261ULL\261ULL\261ULL!!!!!!\261ULL\261ULL\261ULL\261ULL\261ULL\261ULL!!!!\261ULL\261ULL\261ULL\261ULL\261ULL\261ULL!!!!!!\261ULL\261ULL\261ULL\261ULL\261ULL\261ULL!!!!\261ULL\261ULL\261ULL\261ULL\261ULL\261ULL!!!!!!\261ULL\261ULL\261ULL\261ULL\261ULL\261ULL!!!!\261ULL\261ULL\261ULL\261ULL\261ULL\261ULL!!!!!!\261ULL\261ULL\261ULL\261ULL\261ULL\261ULL!!!!\261ULL\261ULL\261ULL\261ULL\261ULL\261ULL!!!!!!\261ULL\261ULL\261ULL\261ULL\261ULL\261ULL!!!!\261ULL\261ULL\261ULL\261ULL\261ULL\261ULL!!!!!!\261ULL\261ULL\261ULL\261ULL\261ULL\261ULL!!!!\261ULL\261ULL\261ULL\261ULL\261ULL\261ULL!!!!!!!" + "'", str2, "\261ULL\261ULL\261ULL\261ULL\261ULL\261ULL!!!!\261ULL\261ULL\261ULL\261ULL\261ULL\261ULL!!!!!!\261ULL\261ULL\261ULL\261ULL\261ULL\261ULL!!!!\261ULL\261ULL\261ULL\261ULL\261ULL\261ULL!!!!!!\261ULL\261ULL\261ULL\261ULL\261ULL\261ULL!!!!\261ULL\261ULL\261ULL\261ULL\261ULL\261ULL!!!!!!\261ULL\261ULL\261ULL\261ULL\261ULL\261ULL!!!!\261ULL\261ULL\261ULL\261ULL\261ULL\261ULL!!!!!!\261ULL\261ULL\261ULL\261ULL\261ULL\261ULL!!!!\261ULL\261ULL\261ULL\261ULL\261ULL\261ULL!!!!!!\261ULL\261ULL\261ULL\261ULL\261ULL\261ULL!!!!\261ULL\261ULL\261ULL\261ULL\261ULL\261ULL!!!!!!\261ULL\261ULL\261ULL\261ULL\261ULL\261ULL!!!!\261ULL\261ULL\261ULL\261ULL\261ULL\261ULL!!!!!!\261ULL\261ULL\261ULL\261ULL\261ULL\261ULL!!!!\261ULL\261ULL\261ULL\261ULL\261ULL\261ULL!!!!!!!");
    }

    @Test
    public void test05142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05142");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!nullnullnullnull!!!", "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e}}!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u014f\u014f\u014f\u014f!uu!!!" + "'", str2, "\u014f\u014f\u014f\u014f!uu!!!");
    }

    @Test
    public void test05143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05143");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UUUNNNUNNNUNNNUNNNUNNNUNNNUNNNUNNN\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UUUNNNUNNNUNNNUNNNUNNNUNNNUNNNUNNN\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UUUNNNUNNNUNNNUNNNUNNNUNNNUNNNUNNN\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UUUNNNUNNNUNNNUNNNUNNNUNNNUNNNUNNN\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UUUNNNUNNNUNNNUNNNUNNNUNNNUNNNUNNN\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UUUNNNUNNNUNNNUNNNUNNNUNNNUNNNUNNN\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UUUNNNUNNNUNNNUNNNUNNNUNNNUNNNUNNN\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UUUNNNUNNNUNNNUNNNUNNNUNNNUNNNUNNN!", "!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!!!UUU!UUU!!!UUU!UUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!" + "'", str2, "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!");
    }

    @Test
    public void test05144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05144");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0170\u016c\u016e\u016e\276\276\276\u0170\u016c\u016e\u016e\276\276\276\276\276\u0170\u016c\u016e\u016e\276\276\276\u0170\u016c\u016e\u016e\276\276\276\276\276\u0170\u016c\u016e\u016e\276\276\276\u0170\u016c\u016e\u016e\276\276\276\276\276\u0170\u016c\u016e\u016e\276\276\276\u0170\u016c\u016e\u016e\276\276\276\276\276\u0170\u016c\u016e\u016e\276\276\276\u0170\u016c\u016e\u016e\276\276\276\276\276\u0170\u016c\u016e\u016e\276\276\276\u0170\u016c\u016e\u016e\276\276\276\276\276\u0170\u016c\u016e\u016e\276\276\276\u0170\u016c\u016e\u016e\276\276\276\276\276\u0170\u016c\u016e\u016e\276\276\276\u0170\u016c\u016e\u016e\276\276\276\276\276!", "\u0366\u0365\u0368\u0368nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276!" + "'", str2, "nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276!");
    }

    @Test
    public void test05145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05145");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!", "``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ!!``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ!!``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ!!``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ!!``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!" + "'", str2, "!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!");
    }

    @Test
    public void test05146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05146");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05147");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170!", "ULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnull!!nullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnull!!nullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnull!!nullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnull!!nullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnull!!nullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnull!!nullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnull!!nullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnull!!nullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05148");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("}UNLLUNLLUNLL~}}^}UNLLUNLLUNLL]]!", "\u01de\u01dc\u01dc\u01dc\u01de\u01dc\u01dc\u01dc\u01de\u01dc\u01dc\u01dc\u01de\u01dc\u01dc\u01dc\u01de\u01dc\u01dc\u01dc\u01de\u01dc\u01dc\u01dc\u01de\u01dc\u01dc\u01dc\u01de\u01dc\u01dc\u01dc!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01de\u01db\u01db\u01db\u01de\u01db\u01db\u01db\u01de\u01db\u01db\u01db\u01de\u01db\u01db\u01db\u01de\u01db\u01db\u01db\u01de\u01db\u01db\u01db]]!" + "'", str2, "\u01de\u01db\u01db\u01db\u01de\u01db\u01db\u01db\u01de\u01db\u01db\u01db\u01de\u01db\u01db\u01db\u01de\u01db\u01db\u01db\u01de\u01db\u01db\u01db]]!");
    }

    @Test
    public void test05149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05149");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("J\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220II!!J\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220II!!J\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220II!!J\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220II!!J\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220II!", "\214\214!!\214\214!!\214\214\214\214\214\214\214\214\214\214!!\214\214!!\214\214\214\214\214\214\214\214\214\214!!\214\214!!\214\214\214\214\214\214\214\214\214\214!!\214\214!!\214\214\214\214\214\214\214\214\214\214!!\214\214!!\214\214\214\214\214\214\214\214\214\214!!\214\214!!\214\214\214\214\214\214\214\214\214\214!!\214\214!!\214\214\214\214\214\214\214\214\214\214!!\214\214!!\214\214\214\214\214\214\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!" + "'", str2, "null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!");
    }

    @Test
    public void test05150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05150");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275!", "nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275!" + "'", str2, "\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275!");
    }

    @Test
    public void test05151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05151");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]\225\230\230U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]\225\230\230U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]\225\230\230U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]\225\230\230\200}}`U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]\225\230\230U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]\225\230\230U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]\225\230\230U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]\225\230\230]]!", "\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012anullnull!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230\200}}`L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230]]!" + "'", str2, "L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230\200}}`L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230]]!");
    }

    @Test
    public void test05152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05152");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!", "!\216\216\216!\216\216\216!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!" + "'", str2, "!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!");
    }

    @Test
    public void test05153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05153");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368!!\216\216\u0346\u0348\u0348!", "]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226!!]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368!!\216\216\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368!!\216\216\u0346\u0348\u0348!");
    }

    @Test
    public void test05154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05154");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!", "\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!" + "'", str2, "\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!");
    }

    @Test
    public void test05155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05155");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("FEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHH!", "}H\200\200}H\200\200}H\200\200}H\200\200!HHH!HHH!HHH!HHH}H\200\200}H\200\200}H\200\200}H\200\200!HHH!HHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxx!" + "'", str2, "nullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxxnullnullxx!");
    }

    @Test
    public void test05156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05156");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnull!", "!\253\256\256nullnullnullnullnullnullnullnullnullnullnullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256nullnullnullnullnullnullnullnullnullnullnullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LL!!U!LLU!LL!" + "'", str2, "U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LL!!U!LLU!LL!");
    }

    @Test
    public void test05157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05157");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!!", "`^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^``!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!!" + "'", str2, "\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!!");
    }

    @Test
    public void test05158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05158");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!UUUUUUUUUUUUUUUU!", "nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!LLLLLLLLLLLLLLLL!" + "'", str2, "!LLLLLLLLLLLLLLLL!");
    }

    @Test
    public void test05159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05159");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnull\253\253nullnull\253\253nullnull\253\253nullnull\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnull\253\253nullnull\253\253!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253!" + "'", str2, "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253!");
    }

    @Test
    public void test05160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05160");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u029d\u029d\u02bd\u02bd\u02bd\u02bd\u029d\u029d\u02bd\u02bd\u02bd\u02bd\u029d\u029d\u02bd\u02bd\u02bd\u02bd\u029d\u029d\u02bd\u02bd\u02bd\u02bd\u029d\u029d\u02bd\u02bd\u02bd\u02bd\u029d\u029d\u02bd\u02bd\u02bd\u02bd\u029d\u029d\u02bd\u02bd\u02bd\u02bd\u029d\u029d\u02bd\u02bd\u02bd\u02bd!", "]`^^]`^^!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05161");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\253\254\256\256nullnullnullnull\253\254\256\256nullnull!", "nullnullnullnull\225\230\230nullnullnullnull\225\230\230nullnullnullnull\225\230\230nullnullnullnull\225\230\230\200}}`nullnullnullnull\225\230\230nullnullnullnull\225\230\230nullnullnullnull\225\230\230nullnullnullnull\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256\366\367\371\371\366\367\371\371\366\367\371\371\366\367\371\371\253\254\256\256\366\367\371\371\366\367\371\371!" + "'", str2, "\253\254\256\256\366\367\371\371\366\367\371\371\366\367\371\371\366\367\371\371\253\254\256\256\366\367\371\371\366\367\371\371!");
    }

    @Test
    public void test05162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05162");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!!", "nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test05163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05163");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\215}\215\215\215}\215\215nullnullnullnull\215}\215\215\215}\215\215!", "nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215}\215\215\215}\215\215ULLLULLLULLLULLL\215}\215\215\215}\215\215!" + "'", str2, "\215}\215\215\215}\215\215ULLLULLLULLLULLL\215}\215\215\215}\215\215!");
    }

    @Test
    public void test05164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05164");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017enullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\225\226\230\230\225\226\230\230\225\226\230\230\225\226\230\230\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\225\226\230\230\225\226\230\230\225\226\230\230\225\226\230\230\u0348\u0346\u0346!");
    }

    @Test
    public void test05165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05165");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250!!\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250!!\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250!!\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250!!\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250!", "IILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250!!\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250!!\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250!!\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250!!\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250!" + "'", str2, "\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250!!\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250!!\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250!!\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250!!\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250!");
    }

    @Test
    public void test05166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05166");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLL!", "UULLUULLLLUULLUUUULLUULLLLUULLUUUULLUULLLLUULLUUUULLUULLLLUULLUUUULLUULLLLUULLUUUULLUULLLLUULLUUUULLUULLLLUULLUUUULLUULLLLUULLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUU!" + "'", str2, "ULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUU!");
    }

    @Test
    public void test05167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05167");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7!", "nullnull]]nullnull]]nullnull]]nullnull]]~}}^nullnull]]nullnull]]nullnull]]nullnull]]]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!" + "'", str2, "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
    }

    @Test
    public void test05168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05168");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("l!uul!uul!uul!uul!uul!uul!uul!uu!", "\276\276\276\276nullnullnull\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276nullnullnull\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\300!\276\276\300!\276\276\300!\276\276\300!\276\276\300!\276\276\300!\276\276\300!\276\276\300!\276\276!" + "'", str2, "\300!\276\276\300!\276\276\300!\276\276\300!\276\276\300!\276\276\300!\276\276\300!\276\276\300!\276\276!");
    }

    @Test
    public void test05169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05169");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "fhnullnullfhnullnull\226\226fhnullnullfhnullnull\226\226fhnullnullfhnullnullnullnullfhnullnullfhnullnullnullnullfhnullnullfhnullnull\226\226fhnullnullfhnullnull\226\226fhnullnullfhnullnullnullnullfhnullnullfhnullnullnullnullfhnullnullfhnullnull\226\226fhnullnullfhnullnull\226\226fhnullnullfhnullnullnullnullfhnullnullfhnullnullnullnullfhnullnullfhnullnull\226\226fhnullnullfhnullnull\226\226fhnullnullfhnullnullnullnullfhnullnullfhnullnullnullnullfhnullnullfhnullnull\226\226fhnullnullfhnullnull\226\226fhnullnullfhnullnullnullnullfhnullnullfhnullnullnullnullfhnullnullfhnullnull\226\226fhnullnullfhnullnull\226\226fhnullnullfhnullnullnullnullfhnullnullfhnullnullnullnullfhnullnullfhnullnull\226\226fhnullnullfhnullnull\226\226fhnullnullfhnullnullnullnullfhnullnullfhnullnullnullnullfhnullnullfhnullnull\226\226fhnullnullfhnullnull\226\226fhnullnullfhnullnullnullnullfhnullnullfhnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05170");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("ELLLELLLELLLELLL\200}}`ELLLELLLELLLELLL]]!", "LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L!!!L!!!L!!!L!!!\200}}`L!!!L!!!L!!!L!!!]]!" + "'", str2, "L!!!L!!!L!!!L!!!\200}}`L!!!L!!!L!!!L!!!]]!");
    }

    @Test
    public void test05171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05171");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368\u041b\u041c\u041c\u041c\u0346\u0348\u0348!", "\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test05172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05172");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("]]uluuuluu]]uluuuluu!!]]uluuuluu]]uluuuluu!!]]uluuuluu]]uluuuluu]]uluuuluu]]uluuuluu!!]]uluuuluu]]uluuuluu!!]]uluuuluu]]uluuuluu!", "U!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200!!]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200!!]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200!!]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200!!]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200!" + "'", str2, "]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200!!]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200!!]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200!!]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200!!]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200!");
    }

    @Test
    public void test05173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05173");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!", "nullnullUUUUUUUUnullnullUUUUUUUUnullnullUUUUUUUUnullnullUUUUUUUUnullnullUUUUUUUUnullnullUUUUUUUUnullnullUUUUUUUUnullnullUUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!" + "'", str2, "!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!");
    }

    @Test
    public void test05174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05174");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("L!!!L!!!L!!!L!!!\200}}`L!!!L!!!L!!!L!!!]]!", "!\253\256\256\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\266!!!\266!!!\266!!!\266!!!\200}}`\266!!!\266!!!\266!!!\266!!!]]!" + "'", str2, "\266!!!\266!!!\266!!!\266!!!\200}}`\266!!!\266!!!\266!!!\266!!!]]!");
    }

    @Test
    public void test05175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05175");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test05176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05176");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226!!nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test05177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05177");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!", "nullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljj!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!" + "'", str2, "\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!");
    }

    @Test
    public void test05178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05178");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL!" + "'", str2, "\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL!");
    }

    @Test
    public void test05179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05179");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u011b\u011c\u011e\u011e\u011b\u011c\u011e\u011e\u011e\214\214\u011e\214\214\u011b\u011c\u011e\u011e\u011b\u011c\u011e\u011e\u011e\214\214\u011e\214\214\u011b\u011c\u011e\u011e\u011b\u011c\u011e\u011e\u011e\214\214\u011e\214\214\u011b\u011c\u011e\u011e\u011b\u011c\u011e\u011e\u011e\214\214\u011e\214\214\u011b\u011c\u011e\u011e\u011b\u011c\u011e\u011e\u011e\214\214\u011e\214\214\u011b\u011c\u011e\u011e\u011b\u011c\u011e\u011e\u011e\214\214\u011e\214\214\u011b\u011c\u011e\u011e\u011b\u011c\u011e\u011e\u011e\214\214\u011e\214\214\u011b\u011c\u011e\u011e\u011b\u011c\u011e\u011e\u011e\214\214\u011e\214\214!", "\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull\376\376!!null\214\214\376\376!!null\214\214nullnullnullnullnullnullnullnull\376\376!!null\214\214\376\376!!null\214\214nullnullnullnullnullnullnullnull\376\376!!null\214\214\376\376!!null\214\214nullnullnullnullnullnullnullnull\376\376!!null\214\214\376\376!!null\214\214nullnullnullnullnullnullnullnull\376\376!!null\214\214\376\376!!null\214\214nullnullnullnullnullnullnullnull\376\376!!null\214\214\376\376!!null\214\214nullnullnullnullnullnullnullnull\376\376!!null\214\214\376\376!!null\214\214nullnullnullnullnullnullnullnull\376\376!!null\214\214\376\376!!null\214\214!" + "'", str2, "nullnullnullnullnullnullnullnull\376\376!!null\214\214\376\376!!null\214\214nullnullnullnullnullnullnullnull\376\376!!null\214\214\376\376!!null\214\214nullnullnullnullnullnullnullnull\376\376!!null\214\214\376\376!!null\214\214nullnullnullnullnullnullnullnull\376\376!!null\214\214\376\376!!null\214\214nullnullnullnullnullnullnullnull\376\376!!null\214\214\376\376!!null\214\214nullnullnullnullnullnullnullnull\376\376!!null\214\214\376\376!!null\214\214nullnullnullnullnullnullnullnull\376\376!!null\214\214\376\376!!null\214\214nullnullnullnullnullnullnullnull\376\376!!null\214\214\376\376!!null\214\214!");
    }

    @Test
    public void test05180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05180");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("UU]]UU]]LUUULUUUUU]]UU]]LUUULUUU!", "\275LLLLLLLLLLL!!!!\275LLLLLLLLLLL!!!!!!\275LLLLLLLLLLL!!!!\275LLLLLLLLLLL!!!!!!\275LLLLLLLLLLL!!!!\275LLLLLLLLLLL!!!!!!\275LLLLLLLLLLL!!!!\275LLLLLLLLLLL!!!!!!\275LLLLLLLLLLL!!!!\275LLLLLLLLLLL!!!!!!\275LLLLLLLLLLL!!!!\275LLLLLLLLLLL!!!!!!\275LLLLLLLLLLL!!!!\275LLLLLLLLLLL!!!!!!\275LLLLLLLLLLL!!!!\275LLLLLLLLLLL!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL]]LL]]LLLLLLLLLL]]LL]]LLLLLLLL!" + "'", str2, "LL]]LL]]LLLLLLLLLL]]LL]]LLLLLLLL!");
    }

    @Test
    public void test05181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05181");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!", "\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test05182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05182");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253LNLLLNLL\253\253LNLLLNLL\253\253LNLLLNLL\253\253LNLLLNLL\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253LNLLLNLL\253\253LNLLLNLL\253\253!", "\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253uruuuruu\253\253uruuuruu\253\253uruuuruu\253\253uruuuruu\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253uruuuruu\253\253uruuuruu\253\253!" + "'", str2, "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253uruuuruu\253\253uruuuruu\253\253uruuuruu\253\253uruuuruu\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253uruuuruu\253\253uruuuruu\253\253!");
    }

    @Test
    public void test05183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05183");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH!", "HHFFH~~HHFFH~~HHFFH~~HHFFH~~HHFFH~~HHFFH~~HHFFH~~HHFFH~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvv!" + "'", str2, "nulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvv!");
    }

    @Test
    public void test05184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05184");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("FF!!FF!!!", "\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ua7ad\ua7ad\ua7ad\ua7ad!!!" + "'", str2, "\ua7ad\ua7ad\ua7ad\ua7ad!!!");
    }

    @Test
    public void test05185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05185");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!", "\275nullnullnull\275nullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!" + "'", str2, "!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!");
    }

    @Test
    public void test05186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05186");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "!!!!nullnull!!nullnull!!nullnull!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!nullnull!!nullnull!!nullnull!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05187");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0346\u0348\u0348\u0348nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340\u0348\u0346\u0346!", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test05188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05188");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275!!!\275\275!!\275\275!!\275\275!!\275\275!!\275!!!\275\275!!\275\275!!!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275!!!\275\275!!\275\275!!\275\275!!\275\275!!\275!!!\275\275!!\275\275!!!" + "'", str2, "\275!!!\275\275!!\275\275!!\275\275!!\275\275!!\275!!!\275\275!!\275\275!!!");
    }

    @Test
    public void test05189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05189");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU!", "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUUUNLLUNLLUU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0!" + "'", str2, "\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0!");
    }

    @Test
    public void test05190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05190");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!", "NN]]NN]]UNNNUNNNNN]]NN]]UNNNUNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "N!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NN!!N!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NN!!N!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NN!!N!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NN!!N!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NN!" + "'", str2, "N!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NN!!N!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NN!!N!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NN!!N!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NN!!N!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NN!");
    }

    @Test
    public void test05191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05191");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("null\225\230\230null\225\230\230null\225\230\230null\225\230\230\200}}`null\225\230\230null\225\230\230null\225\230\230null\225\230\230]]!", "\u0366\u0365\u0368\u0368\335\336\340\340\335\336\340\340\204\204\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\204\204\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\204\204\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\204\204\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\204\204\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\204\204\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\204\204\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\204\204\335\336\340\340\335\336\340\340\335\336\340\340\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\225\230\230nullnullnullnull\225\230\230nullnullnullnull\225\230\230nullnullnullnull\225\230\230\200}}`nullnullnullnull\225\230\230nullnullnullnull\225\230\230nullnullnullnull\225\230\230nullnullnullnull\225\230\230]]!" + "'", str2, "nullnullnullnull\225\230\230nullnullnullnull\225\230\230nullnullnullnull\225\230\230nullnullnullnull\225\230\230\200}}`nullnullnullnull\225\230\230nullnullnullnull\225\230\230nullnullnullnull\225\230\230nullnullnullnull\225\230\230]]!");
    }

    @Test
    public void test05192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05192");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e!!!", "!\253\256\256\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031anullnullnullnullnullnullnullnull!!!" + "'", str2, "\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031anullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test05193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05193");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}!", "\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}!" + "'", str2, "~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}!");
    }

    @Test
    public void test05194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05194");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!", "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\254\214\214!!\214\214!!!\254\214\214!!\214\214!!!!!!!!!!!\254\214\214!!\214\214!!!\254\214\214!!\214\214!!!!!!!!!!!\254\214\214!!\214\214!!!\254\214\214!!\214\214!!!!!!!!!!!\254\214\214!!\214\214!!!\254\214\214!!\214\214!!!!!!!!!!!\254\214\214!!\214\214!!!\254\214\214!!\214\214!!!!!!!!!!!\254\214\214!!\214\214!!!\254\214\214!!\214\214!!!!!!!!!!!\254\214\214!!\214\214!!!\254\214\214!!\214\214!!!!!!!!!!!\254\214\214!!\214\214!!!\254\214\214!!\214\214!!!!!!!!!!!" + "'", str2, "!\254\214\214!!\214\214!!!\254\214\214!!\214\214!!!!!!!!!!!\254\214\214!!\214\214!!!\254\214\214!!\214\214!!!!!!!!!!!\254\214\214!!\214\214!!!\254\214\214!!\214\214!!!!!!!!!!!\254\214\214!!\214\214!!!\254\214\214!!\214\214!!!!!!!!!!!\254\214\214!!\214\214!!!\254\214\214!!\214\214!!!!!!!!!!!\254\214\214!!\214\214!!!\254\214\214!!\214\214!!!!!!!!!!!\254\214\214!!\214\214!!!\254\214\214!!\214\214!!!!!!!!!!!\254\214\214!!\214\214!!!\254\214\214!!\214\214!!!!!!!!!!!");
    }

    @Test
    public void test05195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05195");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!", "HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!" + "'", str2, "!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!");
    }

    @Test
    public void test05196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05196");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\225]\225\225\225]\225\225!!\225]\225\225\225]\225\225!!\225]\225\225\225]\225\225\225]\225\225\225]\225\225!!\225]\225\225\225]\225\225!!\225]\225\225\225]\225\225!", "}~\200\200}~\200\200\276\271\271\271^\276\271\271\271\276\271\271\271\276\271\271\271^\276\271\271\271\276\271\271\271}~\200\200}~\200\200\276\271\271\271^\276\271\271\271\276\271\271\271\276\271\271\271^\276\271\271\271\276\271\271\271!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\225]\225\225\225]\225\225!!\225]\225\225\225]\225\225!!\225]\225\225\225]\225\225\225]\225\225\225]\225\225!!\225]\225\225\225]\225\225!!\225]\225\225\225]\225\225!" + "'", str2, "\225]\225\225\225]\225\225!!\225]\225\225\225]\225\225!!\225]\225\225\225]\225\225\225]\225\225\225]\225\225!!\225]\225\225\225]\225\225!!\225]\225\225\225]\225\225!");
    }

    @Test
    public void test05197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05197");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!!", "~}\200\200~}\200\200LNNNnullnullnullLNNNnullnullnull\230\230LNNNnullnullnullLNNNnullnullnull\230\230~}\200\200~}\200\200LNNNnullnullnullLNNNnullnullnull\230\230LNNNnullnullnullLNNNnullnullnull\230\230~}\200\200~}\200\200LNNNnullnullnullLNNNnullnullnull\230\230LNNNnullnullnullLNNNnullnullnull\230\230~}\200\200~}\200\200LNNNnullnullnullLNNNnullnullnull\230\230LNNNnullnullnullLNNNnullnullnull\230\230~}\200\200~}\200\200LNNNnullnullnullLNNNnullnullnull\230\230LNNNnullnullnullLNNNnullnullnull\230\230~}\200\200~}\200\200LNNNnullnullnullLNNNnullnullnull\230\230LNNNnullnullnullLNNNnullnullnull\230\230~}\200\200~}\200\200LNNNnullnullnullLNNNnullnullnull\230\230LNNNnullnullnullLNNNnullnullnull\230\230~}\200\200~}\200\200LNNNnullnullnullLNNNnullnullnull\230\230LNNNnullnullnullLNNNnullnullnull\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!!" + "'", str2, "\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!!");
    }

    @Test
    public void test05198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05198");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("nullnullnullnullnullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnullnullnullnullnull\204\204nullnull\204\204!", "!~}}\200\200}}\200\200!~}}\200\200}}\200\200!!!~}}\200\200}}\200\200!~}}\200\200}}\200\200!!!~}}\200\200}}\200\200!~}}\200\200}}\200\200!~}}\200\200}}\200\200!~}}\200\200}}\200\200!!!~}}\200\200}}\200\200!~}}\200\200}}\200\200!!!~}}\200\200}}\200\200!~}}\200\200}}\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnull\204\204!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnull\204\204!");
    }

    @Test
    public void test05199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05199");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\305\305\305\305\305\305\305\305\305\305\305\305\305\305\305\305\200}}`\305\305\305\305\305\305\305\305\305\305\305\305\305\305\305\305]]!", "hnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ff!!hnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ff!!hnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ff!!hnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ff!!hnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ff!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FFFFFFFFFFFFFFFF\200}}`FFFFFFFFFFFFFFFF]]!" + "'", str2, "FFFFFFFFFFFFFFFF\200}}`FFFFFFFFFFFFFFFF]]!");
    }

    @Test
    public void test05200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05200");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("porrporr!!porrporr!!porrporr!!porrporr!!porrporr!!porrporr!!porrporr!!porrporr!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test05201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05201");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!", "LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLL!" + "'", str2, "ULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLL!");
    }

    @Test
    public void test05202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05202");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("}~\200\200}~\200\200null\304\304\304^null\304\304\304null\304\304\304null\304\304\304^null\304\304\304null\304\304\304}~\200\200}~\200\200null\304\304\304^null\304\304\304null\304\304\304null\304\304\304^null\304\304\304null\304\304\304!", "U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200!U!!!!!^!U!!!!!!U!!!!!!U!!!!!^!U!!!!!!U!!!!!}~\200\200}~\200\200!U!!!!!^!U!!!!!!U!!!!!!U!!!!!^!U!!!!!!U!!!!!!" + "'", str2, "}~\200\200}~\200\200!U!!!!!^!U!!!!!!U!!!!!!U!!!!!^!U!!!!!!U!!!!!}~\200\200}~\200\200!U!!!!!^!U!!!!!!U!!!!!!U!!!!!^!U!!!!!!U!!!!!!");
    }

    @Test
    public void test05203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05203");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!!", "\u03dc\u03dc\u03dc\u03dc\u03dc\u03dc\u03dc\u03dc\u03dc\u03dc\u03dc\u03dc\u03dc\u03dc\u03dc\u03dc!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!!" + "'", str2, "\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!!");
    }

    @Test
    public void test05204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05204");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("}~\200\200}~\200\200PNNNPNNNPNNNPNNNPNNNPNNNPNNNPNNN}~\200\200}~\200\200PNNNPNNNPNNNPNNNPNNNPNNNPNNNPNNN!", "\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200!\335\335\335!\335\335\335!\335\335\335!\335\335\335!\335\335\335!\335\335\335!\335\335\335!\335\335\335}~\200\200}~\200\200!\335\335\335!\335\335\335!\335\335\335!\335\335\335!\335\335\335!\335\335\335!\335\335\335!\335\335\335!" + "'", str2, "}~\200\200}~\200\200!\335\335\335!\335\335\335!\335\335\335!\335\335\335!\335\335\335!\335\335\335!\335\335\335!\335\335\335}~\200\200}~\200\200!\335\335\335!\335\335\335!\335\335\335!\335\335\335!\335\335\335!\335\335\335!\335\335\335!\335\335\335!");
    }

    @Test
    public void test05205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05205");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("]]\300\300]]\300\300!!]]\300\300]]\300\300!!]]\300\300]]\300\300]]\300\300]]\300\300!!]]\300\300]]\300\300!!]]\300\300]]\300\300!", "\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull!" + "'", str2, "]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull!");
    }

    @Test
    public void test05206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05206");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u017e\u017e\u017e\u017e\u017e\u017e!", "^```^```^```^```^```^```^```^```^```^```U\331\225\225U\331\225\225^```^```U\331\225\225U\331\225\225^```^```^```^```^```^```^```^```^```^```U\331\225\225U\331\225\225^```^```U\331\225\225U\331\225\225^```^```^```^```^```^```^```^```^```^```U\331\225\225U\331\225\225^```^```U\331\225\225U\331\225\225^```^```^```^```^```^```^```^```^```^```U\331\225\225U\331\225\225^```^```U\331\225\225U\331\225\225^```^```^```^```^```^```^```^```^```^```U\331\225\225U\331\225\225^```^```U\331\225\225U\331\225\225^```^```^```^```^```^```^```^```^```^```U\331\225\225U\331\225\225^```^```U\331\225\225U\331\225\225^```^```^```^```^```^```^```^```^```^```U\331\225\225U\331\225\225^```^```U\331\225\225U\331\225\225^```^```^```^```^```^```^```^```^```^```U\331\225\225U\331\225\225^```^```U\331\225\225U\331\225\225!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\331^\225\225\331\331\331\331^\225\225\331\331\331!" + "'", str2, "\331^\225\225\331\331\331\331^\225\225\331\331\331!");
    }

    @Test
    public void test05207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05207");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!", "nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226!!nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU\200}}`LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU]]!" + "'", str2, "LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU\200}}`LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU]]!");
    }

    @Test
    public void test05208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05208");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("}~\200\200}~\200\200NNUUNNUUNNUUNNUU^NNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUU^NNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUU}~\200\200}~\200\200NNUUNNUUNNUUNNUU^NNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUU^NNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUU!", "\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05209");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0346\u0348\u0348\u0348}~\200\200}~\200\200\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016enullnullnull}~\200\200}~\200\200\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016enullnullnull}~\200\200}~\200\200\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016enullnullnull}~\200\200}~\200\200\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u0348\u0346\u0346!", "nullvvvnullvvvnullvvvnullvvv\200}}`nullvvvnullvvvnullvvvnullvvv]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnullnullnull\226\227\231\231\226\227\231\231\226\227\231\231nullnullnullnull\226\227\231\231\226\227\231\231\226\227\231\231}~\200\200}~\200\200nullnullnullnull\226\227\231\231\226\227\231\231\226\227\231\231nullnullnullnull\226\227\231\231\226\227\231\231\226\227\231\231}~\200\200}~\200\200nullnullnullnull\226\227\231\231\226\227\231\231\226\227\231\231nullnullnullnull\226\227\231\231\226\227\231\231\226\227\231\231}~\200\200}~\200\200nullnullnullnull\226\227\231\231\226\227\231\231\226\227\231\231nullnullnullnull\226\227\231\231\226\227\231\231\226\227\231\231\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnullnullnull\226\227\231\231\226\227\231\231\226\227\231\231nullnullnullnull\226\227\231\231\226\227\231\231\226\227\231\231}~\200\200}~\200\200nullnullnullnull\226\227\231\231\226\227\231\231\226\227\231\231nullnullnullnull\226\227\231\231\226\227\231\231\226\227\231\231}~\200\200}~\200\200nullnullnullnull\226\227\231\231\226\227\231\231\226\227\231\231nullnullnullnull\226\227\231\231\226\227\231\231\226\227\231\231}~\200\200}~\200\200nullnullnullnull\226\227\231\231\226\227\231\231\226\227\231\231nullnullnullnull\226\227\231\231\226\227\231\231\226\227\231\231\u0348\u0346\u0346!");
    }

    @Test
    public void test05210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05210");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test05211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05211");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\220\220!!\220\220!!\220\220!!\220\220\u0346\u0348\u0348!", "XNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMM!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\220\220!!\220\220!!\220\220!!\220\220\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\220\220!!\220\220!!\220\220!!\220\220\u0346\u0348\u0348!");
    }

    @Test
    public void test05212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05212");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!", "nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!" + "'", str2, "!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!");
    }

    @Test
    public void test05213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05213");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\276X\266\266~XX\276X\266\266~XX!!\276X\266\266~XX\276X\266\266~XX!!\276X\266\266~XX\276X\266\266~XX\276X\266\266~XX\276X\266\266~XX!!\276X\266\266~XX\276X\266\266~XX!!\276X\266\266~XX\276X\266\266~XX!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!" + "'", str2, "\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!");
    }

    @Test
    public void test05214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05214");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("NNLLNNLL!!NNLLNNLL!!NNLLNNLL!!NNLLNNLL!!NNLLNNLL!!NNLLNNLL!!NNLLNNLL!!NNLLNNLL!!!", "\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e]]!!!" + "'", str2, "\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e]]!!!");
    }

    @Test
    public void test05215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05215");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!!", "\u0106\u0128\u0128\u0106\u0128\u0128\u0106\u0128\u0128\u0106\u0128\u0128\u0106\u0128\u0128\u0106\u0128\u0128\u0106\u0128\u0128\u0106\u0128\u0128!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!!" + "'", str2, "\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!!");
    }

    @Test
    public void test05216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05216");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("fehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehh!", "qrttqrttqrttqrttqrttqrttqrttqrttnullnullnullnullnullnullnullnullqrttqrttqrttqrttqrttqrttqrttqrttnullnullnullnullnullnullnullnullqrttqrttqrttqrttqrttqrttqrttqrttnullnullnullnullnullnullnullnullqrttqrttqrttqrttqrttqrttqrttqrttnullnullnullnullnullnullnullnullqrttqrttqrttqrttqrttqrttqrttqrttnullnullnullnullnullnullnullnullqrttqrttqrttqrttqrttqrttqrttqrttnullnullnullnullnullnullnullnullqrttqrttqrttqrttqrttqrttqrttqrttnullnullnullnullnullnullnullnullqrttqrttqrttqrttqrttqrttqrttqrttnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05217");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("HFFFHFFF!", "]]FF]]FF!!]]FF]]FF!!]]FF]]FF]]FF]]FF!!]]FF]]FF!!]]FF]]FF!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "F]]]F]]]!" + "'", str2, "F]]]F]]]!");
    }

    @Test
    public void test05218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05218");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("HHHHHHHH\200\200HHHHHHHH\200\200HHHHHHHH\200\200HHHHHHHH\200\200HHHHHHHH\200\200HHHHHHHH\200\200HHHHHHHH\200\200HHHHHHHH\200\200!", "\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016enullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200!" + "'", str2, "nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200!");
    }

    @Test
    public void test05219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05219");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!", "\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0!!!```!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test05220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05220");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test05221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05221");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05222");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("~\200}}~\200}}~\200}}~\200}}nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~\200}}~\200}}~\200}}~\200}}nullnullnullnullnullnullnullnull!", "LLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUU!!LLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUU!!LLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUU!!LLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUU!!LLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUU!!LLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUU!!LLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUU!!LLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUU!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~\200}}~\200}}~\200}}~\200\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c~\200}}~\200}}~\200}}~\200\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c!" + "'", str2, "~\200}}~\200}}~\200}}~\200\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c~\200}}~\200}}~\200}}~\200\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c!");
    }

    @Test
    public void test05223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05223");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "\u0366\u0365\u0368\u0368UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test05224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05224");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!", "LIIILIII!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!" + "'", str2, "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!");
    }

    @Test
    public void test05225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05225");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("FF!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!" + "'", str2, "nullnull!");
    }

    @Test
    public void test05226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05226");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!!!\220\220!!\220\220!!\220\220!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\220\220!!\220\220!!\220\220!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "\275LLL\275LLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!\220\220!!\220\220!!\220\220!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\220\220!!\220\220!!\220\220!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!\220\220!!\220\220!!\220\220!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\220\220!!\220\220!!\220\220!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test05227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05227");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("UUNNUUNN!!UUNNUUNN!!UUNNUUNNUUNNUUNN!!UUNNUUNN!!UUNNUUNN!", "\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01ac\u01ac\u01ab\u01ab\u01ac\u01ac\u01ab\u01ab\u01ac\u01ac\u01ab\u01ab\u01ac\u01ac\u01ab\u01ab\u01ac\u01ac\u01ab\u01ab\u01ac\u01ac\u01ab\u01ab\u01ac\u01ac\u01ab\u01ab\u01ac\u01ac\u01ab\u01ab\u01ac\u01ac\u01ab\u01ab\u01ac\u01ac\u01ab\u01ab\u01ac\u01ac\u01ab\u01ab\u01ac\u01ac\u01ab\u01ab!" + "'", str2, "\u01ac\u01ac\u01ab\u01ab\u01ac\u01ac\u01ab\u01ab\u01ac\u01ac\u01ab\u01ab\u01ac\u01ac\u01ab\u01ab\u01ac\u01ac\u01ab\u01ab\u01ac\u01ac\u01ab\u01ab\u01ac\u01ac\u01ab\u01ab\u01ac\u01ac\u01ab\u01ab\u01ac\u01ac\u01ab\u01ab\u01ac\u01ac\u01ab\u01ab\u01ac\u01ac\u01ab\u01ab\u01ac\u01ac\u01ab\u01ab!");
    }

    @Test
    public void test05228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05228");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("UNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUU!", "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368NNLLNNLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!" + "'", str2, "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!");
    }

    @Test
    public void test05229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05229");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LLnullnullLLnullnullLLnullnullLLnullnullLLnullnullLLnullnullLLnullnullLLnullnull!", "\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``nullnull\200\200nullnull\200\200``nullnull\200\200nullnull\200\200``nullnull\200\200nullnull\200\200``nullnull\200\200nullnull\200\200``nullnull\200\200nullnull\200\200``nullnull\200\200nullnull\200\200``nullnull\200\200nullnull\200\200``nullnull\200\200nullnull\200\200!" + "'", str2, "``nullnull\200\200nullnull\200\200``nullnull\200\200nullnull\200\200``nullnull\200\200nullnull\200\200``nullnull\200\200nullnull\200\200``nullnull\200\200nullnull\200\200``nullnull\200\200nullnull\200\200``nullnull\200\200nullnull\200\200``nullnull\200\200nullnull\200\200!");
    }

    @Test
    public void test05230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05230");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("~}\200\200~}\200\200EE~~}\200\200EE~~}\200\200\230\230EE~~}\200\200EE~~}\200\200\230\230~}\200\200~}\200\200EE~~}\200\200EE~~}\200\200\230\230EE~~}\200\200EE~~}\200\200\230\230~}\200\200~}\200\200EE~~}\200\200EE~~}\200\200\230\230EE~~}\200\200EE~~}\200\200\230\230~}\200\200~}\200\200EE~~}\200\200EE~~}\200\200\230\230EE~~}\200\200EE~~}\200\200\230\230~}\200\200~}\200\200EE~~}\200\200EE~~}\200\200\230\230EE~~}\200\200EE~~}\200\200\230\230~}\200\200~}\200\200EE~~}\200\200EE~~}\200\200\230\230EE~~}\200\200EE~~}\200\200\230\230~}\200\200~}\200\200EE~~}\200\200EE~~}\200\200\230\230EE~~}\200\200EE~~}\200\200\230\230~}\200\200~}\200\200EE~~}\200\200EE~~}\200\200\230\230EE~~}\200\200EE~~}\200\200\230\230!", "NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200NN~~}\200\200NN~~}\200\200\230\230NN~~}\200\200NN~~}\200\200\230\230~}\200\200~}\200\200NN~~}\200\200NN~~}\200\200\230\230NN~~}\200\200NN~~}\200\200\230\230~}\200\200~}\200\200NN~~}\200\200NN~~}\200\200\230\230NN~~}\200\200NN~~}\200\200\230\230~}\200\200~}\200\200NN~~}\200\200NN~~}\200\200\230\230NN~~}\200\200NN~~}\200\200\230\230~}\200\200~}\200\200NN~~}\200\200NN~~}\200\200\230\230NN~~}\200\200NN~~}\200\200\230\230~}\200\200~}\200\200NN~~}\200\200NN~~}\200\200\230\230NN~~}\200\200NN~~}\200\200\230\230~}\200\200~}\200\200NN~~}\200\200NN~~}\200\200\230\230NN~~}\200\200NN~~}\200\200\230\230~}\200\200~}\200\200NN~~}\200\200NN~~}\200\200\230\230NN~~}\200\200NN~~}\200\200\230\230!" + "'", str2, "~}\200\200~}\200\200NN~~}\200\200NN~~}\200\200\230\230NN~~}\200\200NN~~}\200\200\230\230~}\200\200~}\200\200NN~~}\200\200NN~~}\200\200\230\230NN~~}\200\200NN~~}\200\200\230\230~}\200\200~}\200\200NN~~}\200\200NN~~}\200\200\230\230NN~~}\200\200NN~~}\200\200\230\230~}\200\200~}\200\200NN~~}\200\200NN~~}\200\200\230\230NN~~}\200\200NN~~}\200\200\230\230~}\200\200~}\200\200NN~~}\200\200NN~~}\200\200\230\230NN~~}\200\200NN~~}\200\200\230\230~}\200\200~}\200\200NN~~}\200\200NN~~}\200\200\230\230NN~~}\200\200NN~~}\200\200\230\230~}\200\200~}\200\200NN~~}\200\200NN~~}\200\200\230\230NN~~}\200\200NN~~}\200\200\230\230~}\200\200~}\200\200NN~~}\200\200NN~~}\200\200\230\230NN~~}\200\200NN~~}\200\200\230\230!");
    }

    @Test
    public void test05231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05231");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````!", "~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````!" + "'", str2, "\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````!");
    }

    @Test
    public void test05232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05232");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("unllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnull!", "\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0127\u0129\u0129\u0127\u0129\u0129\u0127\u0129\u0129\u0127\u0129\u0129\u0127\u0129\u0129\u0127\u0129\u0129\u0127\u0129\u0129\u0127\u0129\u0129\u0127\u0129\u0129\u0127\u0129\u0129\u0127\u0129\u0129\u0127\u0129\u0129\u0127\u0129\u0129\u0127\u0129\u0129\u0127\u0129\u0129\u0127\u0129\u0129\u0127\u0129\u0129\u0127\u0129\u0129\u0127\u0129\u0129\u0127\u0129\u0129\u0127\u0129\u0129\u0127\u0129\u0129\u0127\u0129\u0129\u0127\u0129\u0129\u0127\u0129\u0129\u0127\u0129\u0129\u0127\u0129\u0129\u0127\u0129\u0129\u0127\u0129\u0129\u0127\u0129\u0129\u0127\u0129\u0129\u0127\u0129\u0129!" + "'", str2, "\u0127\u0129\u0129\u0127\u0129\u0129\u0127\u0129\u0129\u0127\u0129\u0129\u0127\u0129\u0129\u0127\u0129\u0129\u0127\u0129\u0129\u0127\u0129\u0129\u0127\u0129\u0129\u0127\u0129\u0129\u0127\u0129\u0129\u0127\u0129\u0129\u0127\u0129\u0129\u0127\u0129\u0129\u0127\u0129\u0129\u0127\u0129\u0129\u0127\u0129\u0129\u0127\u0129\u0129\u0127\u0129\u0129\u0127\u0129\u0129\u0127\u0129\u0129\u0127\u0129\u0129\u0127\u0129\u0129\u0127\u0129\u0129\u0127\u0129\u0129\u0127\u0129\u0129\u0127\u0129\u0129\u0127\u0129\u0129\u0127\u0129\u0129\u0127\u0129\u0129\u0127\u0129\u0129\u0127\u0129\u0129!");
    }

    @Test
    public void test05233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05233");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!!!!!!!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!!!!" + "'", str2, "nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!!!!");
    }

    @Test
    public void test05234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05234");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!", "\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05235");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05236");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0243\u0243\u0243\u0243\u0243\u0243~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!", "HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HH!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~~!!null~~~null~~~null~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!null~~~null~~~null~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!" + "'", str2, "~~!!null~~~null~~~null~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!null~~~null~~~null~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!");
    }

    @Test
    public void test05237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05237");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "!NLL!NLL!!!NLL!NLL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05238");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLL!", "ffff\236\276\276ffff\236\276\276!!ffff\236\276\276ffff\236\276\276!!ffff\236\276\276ffff\236\276\276ffff\236\276\276ffff\236\276\276!!ffff\236\276\276ffff\236\276\276!!ffff\236\276\276ffff\236\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05239");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!!", "\275!!!\275!!!\275!!!\275!!!!!\275\275!!\275\275!!\275\275!!\275\275\275!!!\275!!!\275!!!\275!!!!!\275\275!!\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test05240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05240");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnullnullnullnullnullhhnullnullnullnullnullnullnullnullhhnullnullnullnullnullnullnullnullhhnullnullnullnullnullnullnullnullhhnullnullnullnullnullnullnullnullhhnullnullnullnullnullnullnullnullhhnullnullnullnullnullnullnullnullhhnullnullnullnullnullnullnullnullhh!", "!\276!~~\276!~~\276!~~\276!~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276null~~\276null~~\276null~~\276null~~\276null~~\276null~~\276null~~\276null~~~~\276null~~\276null~~\276null~~\276null~~\276null~~\276null~~\276null~~\276null~~~~\276null~~\276null~~\276null~~\276null~~\276null~~\276null~~\276null~~\276null~~~~\276null~~\276null~~\276null~~\276null~~\276null~~\276null~~\276null~~\276null~~~~\276null~~\276null~~\276null~~\276null~~\276null~~\276null~~\276null~~\276null~~~~\276null~~\276null~~\276null~~\276null~~\276null~~\276null~~\276null~~\276null~~~~\276null~~\276null~~\276null~~\276null~~\276null~~\276null~~\276null~~\276null~~~~\276null~~\276null~~\276null~~\276null~~\276null~~\276null~~\276null~~\276null~~~~!" + "'", str2, "\276null~~\276null~~\276null~~\276null~~\276null~~\276null~~\276null~~\276null~~~~\276null~~\276null~~\276null~~\276null~~\276null~~\276null~~\276null~~\276null~~~~\276null~~\276null~~\276null~~\276null~~\276null~~\276null~~\276null~~\276null~~~~\276null~~\276null~~\276null~~\276null~~\276null~~\276null~~\276null~~\276null~~~~\276null~~\276null~~\276null~~\276null~~\276null~~\276null~~\276null~~\276null~~~~\276null~~\276null~~\276null~~\276null~~\276null~~\276null~~\276null~~\276null~~~~\276null~~\276null~~\276null~~\276null~~\276null~~\276null~~\276null~~\276null~~~~\276null~~\276null~~\276null~~\276null~~\276null~~\276null~~\276null~~\276null~~~~!");
    }

    @Test
    public void test05241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05241");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~!", "^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~!" + "'", str2, "\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~!");
    }

    @Test
    public void test05242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05242");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0346\u0348\u0348!", "\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test05243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05243");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0346\u0348\u0348\u0348\u037b\u037c\u037e\u037e\u0348\u0346\u0346!", "L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u037e\u037e\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u037e\u037e\u0348\u0346\u0346!");
    }

    @Test
    public void test05244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05244");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("xxuuxxuuxxuuxxuu!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!", "NULLNULL!!NULLNULL!!NULLNULLNULLNULL!!NULLNULL!!NULLNULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLNNLLNNLLNNLLNN!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!" + "'", str2, "LLNNLLNNLLNNLLNN!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!");
    }

    @Test
    public void test05245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05245");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("nullnull\226\226nullnull\226\226nullnullvvnullnullvvnullnull\226\226nullnull\226\226nullnullvvnullnullvvnullnull\226\226nullnull\226\226nullnullvvnullnullvvnullnull\226\226nullnull\226\226nullnullvvnullnullvvnullnull\226\226nullnull\226\226nullnullvvnullnullvvnullnull\226\226nullnull\226\226nullnullvvnullnullvvnullnull\226\226nullnull\226\226nullnullvvnullnullvvnullnull\226\226nullnull\226\226nullnullvvnullnullvv!", "null\220nullnull\200}}`null\220nullnull]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull{|~~{|~~nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull{|~~{|~~nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull{|~~{|~~nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull{|~~{|~~nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull{|~~{|~~nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull{|~~{|~~nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull{|~~{|~~nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull{|~~{|~~nullnull!" + "'", str2, "{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull{|~~{|~~nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull{|~~{|~~nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull{|~~{|~~nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull{|~~{|~~nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull{|~~{|~~nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull{|~~{|~~nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull{|~~{|~~nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull{|~~{|~~nullnull!");
    }

    @Test
    public void test05246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05246");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!", "^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^!``^!``^!``^!``^!``^!``^!``^!``!!^!``^!``^!``^!``^!``^!``^!``^!``!!^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``!!^!``^!``^!``^!``^!``^!``^!``^!``!!^!``^!``^!``^!``^!``^!``^!``^!``!" + "'", str2, "^!``^!``^!``^!``^!``^!``^!``^!``!!^!``^!``^!``^!``^!``^!``^!``^!``!!^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``!!^!``^!``^!``^!``^!``^!``^!``^!``!!^!``^!``^!``^!``^!``^!``^!``^!``!");
    }

    @Test
    public void test05247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05247");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108nullnull!!!!!!!", "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!!" + "'", str2, "NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!!");
    }

    @Test
    public void test05248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05248");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("UNLLUNLLLLUNLLUNLLLL!!UNLLUNLLLLUNLLUNLLLL!!UNLLUNLLLLUNLLUNLLLL!!UNLLUNLLLLUNLLUNLLLL!!UNLLUNLLLLUNLLUNLLLL!!UNLLUNLLLLUNLLUNLLLL!!UNLLUNLLLLUNLLUNLLLL!!UNLLUNLLLLUNLLUNLLLL!!!", "EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEEEFHHEFHHEEEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEEEFHHEFHHEEEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEEEFHHEFHHEEEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEEEFHHEFHHEEEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEEEFHHEFHHEEEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEEEFHHEFHHEEEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEEEFHHEFHHEEEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEEEFHHEFHHEE!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test05249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05249");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05250");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("`nullnullnull`nullnullnull!", "nullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUU!!nullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUU!!nullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUU!!nullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUU!!nullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`UNUUUNUUUNUU`UNUUUNUUUNUU!" + "'", str2, "`UNUUUNUUUNUU`UNUUUNUUUNUU!");
    }

    @Test
    public void test05251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05251");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!", "LL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test05252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05252");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test05253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05253");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("UU!!````````````UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!````````````UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!", "\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test05254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05254");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\276!!!\276\276!!\276\276!!\276\276!!\276\276!!\276!!!\276\276!!\276\276!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test05255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05255");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("null\253\253\253\200}}`null\253\253\253]]!", "EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!!EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!!EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!!EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!!EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0245\u0246\u0248\u0248\253\253\253\200\u0245\u0246\u0248\u0248\253\253\253]]!" + "'", str2, "\u0245\u0246\u0248\u0248\253\253\253\200\u0245\u0246\u0248\u0248\253\253\253]]!");
    }

    @Test
    public void test05256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05256");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!", "\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!\200\200!!\200\200!" + "'", str2, "!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!\200\200!!\200\200!");
    }

    @Test
    public void test05257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05257");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("T!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TT!", "h]hhh]hh!!h]hhh]hh!!h]hhh]hhh]hhh]hh!!h]hhh]hh!!h]hhh]hh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test05258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05258");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "UBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test05259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05259");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("efhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnull!", "\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05260");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("efhhefhhefhhefhhefhhefhhefhhefhh!", "\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340nullnullnullnullnullnullnullnull\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NULLNULLNULLNULLNULLNULLNULLNULL!" + "'", str2, "NULLNULLNULLNULLNULLNULLNULLNULL!");
    }

    @Test
    public void test05261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05261");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!", "\u0346\u0348\u0348\u0348\u011e\u011c\u011c\u011c\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test05262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05262");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!\200\200!!\200\200!", "LLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!\200\200!!\200\200!" + "'", str2, "!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!\200\200!!\200\200!");
    }

    @Test
    public void test05263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05263");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "null\275\275\275null\275\275\275!!null\275\275\275null\275\275\275!!null\275\275\275null\275\275\275null\275\275\275null\275\275\275!!null\275\275\275null\275\275\275!!null\275\275\275null\275\275\275!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\275\275\275\275\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\275\275\275\275\u0348\u0346\u0346!");
    }

    @Test
    public void test05264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05264");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull!!\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull!!\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull!!\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull!!\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull!", "NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!!" + "'", str2, "\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!!");
    }

    @Test
    public void test05265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05265");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("RTTT\256\254\254RTTT\256\254\254!!RTTT\256\254\254RTTT\256\254\254!!RTTT\256\254\254RTTT\256\254\254!!RTTT\256\254\254RTTT\256\254\254!!RTTT\256\254\254RTTT\256\254\254!!RTTT\256\254\254RTTT\256\254\254!!RTTT\256\254\254RTTT\256\254\254!!RTTT\256\254\254RTTT\256\254\254!!!", "~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~~~\256\254\254!~~~\256\254\254!!!~~~\256\254\254!~~~\256\254\254!!!~~~\256\254\254!~~~\256\254\254!!!~~~\256\254\254!~~~\256\254\254!!!~~~\256\254\254!~~~\256\254\254!!!~~~\256\254\254!~~~\256\254\254!!!~~~\256\254\254!~~~\256\254\254!!!~~~\256\254\254!~~~\256\254\254!!!" + "'", str2, "!~~~\256\254\254!~~~\256\254\254!!!~~~\256\254\254!~~~\256\254\254!!!~~~\256\254\254!~~~\256\254\254!!!~~~\256\254\254!~~~\256\254\254!!!~~~\256\254\254!~~~\256\254\254!!!~~~\256\254\254!~~~\256\254\254!!!~~~\256\254\254!~~~\256\254\254!!!~~~\256\254\254!~~~\256\254\254!!!");
    }

    @Test
    public void test05266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05266");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("`!!nullnull!!nullnull!!nullnull`!!nullnull!!nullnull!!nullnull!", "]AAAAA]]AA]]AA]]AA]]]AAAAA]]AA]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull`!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "`!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull`!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05267");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255!", "\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255!" + "'", str2, "\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255!");
    }

    @Test
    public void test05268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05268");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("nullLLLnullLLLLLnullLLLnullLLLLLnullLLLnullLLLLLnullLLLnullLLLLLnullLLLnullLLLLLnullLLLnullLLLLLnullLLLnullLLLLLnullLLLnullLLLLL!", "nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01de\u01de!" + "'", str2, "\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01de\u01de!");
    }

    @Test
    public void test05269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05269");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c!", "!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUU!" + "'", str2, "UUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUU!");
    }

    @Test
    public void test05270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05270");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!\276\276\276\276\276!!\276\276!!\276\276!!\276\276!!!", "W!XXW!XXW!XXW!XX\200}}`W!XXW!XXW!XXW!XX]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\276\276\276\276\276!!\276\276!!\276\276!!\276\276!!!" + "'", str2, "!\276\276\276\276\276!!\276\276!!\276\276!!\276\276!!!");
    }

    @Test
    public void test05271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05271");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u014b\u014c\u014e\u014e\u014b\u014c\u014e\u014e!", "\u014e\u014e\u014e\u014e!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullHHnullnullHH!" + "'", str2, "nullnullHHnullnullHH!");
    }

    @Test
    public void test05272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05272");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!!", "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullFHHnullFHH!!nullFHHnullFHH!!nullFHHnullFHH!!nullFHHnullFHH!!nullFHHnullFHH!!nullFHHnullFHH!!nullFHHnullFHH!!nullFHHnullFHH!!!" + "'", str2, "nullFHHnullFHH!!nullFHHnullFHH!!nullFHHnullFHH!!nullFHHnullFHH!!nullFHHnullFHH!!nullFHHnullFHH!!nullFHHnullFHH!!nullFHHnullFHH!!!");
    }

    @Test
    public void test05273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05273");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "!\253\256\256\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01canullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01canullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05274");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!!", "wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!!wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!!wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!!wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!!wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "XWZZXWZZ!!XWZZXWZZ!!XWZZXWZZ!!XWZZXWZZ!!XWZZXWZZ!!XWZZXWZZ!!XWZZXWZZ!!XWZZXWZZ!!!" + "'", str2, "XWZZXWZZ!!XWZZXWZZ!!XWZZXWZZ!!XWZZXWZZ!!XWZZXWZZ!!XWZZXWZZ!!XWZZXWZZ!!XWZZXWZZ!!!");
    }

    @Test
    public void test05275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05275");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!", "!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!" + "'", str2, "null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!");
    }

    @Test
    public void test05276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05276");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("NUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUU!", "null\335\335!!!!null\335\335!!!!!!null\335\335!!!!null\335\335!!!!!!null\335\335!!!!null\335\335!!!!!!null\335\335!!!!null\335\335!!!!!!null\335\335!!!!null\335\335!!!!!!null\335\335!!!!null\335\335!!!!!!null\335\335!!!!null\335\335!!!!!!null\335\335!!!!null\335\335!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!" + "'", str2, "L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!");
    }

    @Test
    public void test05277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05277");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335!", "FEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "eeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeff!" + "'", str2, "eeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeff!");
    }

    @Test
    public void test05278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05278");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "\u0264\u0264!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!ijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijll!" + "'", str2, "!!ijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijll!");
    }

    @Test
    public void test05279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05279");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test05280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05280");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test05281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05281");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("unllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunll!", "nullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!!" + "'", str2, "NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!!");
    }

    @Test
    public void test05282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05282");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106!!!!!!!", "\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLL\227UPLLUPLLUPLL\227UPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLL\227UPLLUPLLUPLL\227UPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LUUULUUULUUULUUULPLLLPLL!!!!LUUULUUULUUULUUULPLLLPLL!!!!!!LUUULUUULUUULUUULPLLLPLL!!!!LUUULUUULUUULUUULPLLLPLL!!!!!!LUUULUUULUUULUUULPLLLPLL!!!!LUUULUUULUUULUUULPLLLPLL!!!!!!LUUULUUULUUULUUULPLLLPLL!!!!LUUULUUULUUULUUULPLLLPLL!!!!!!LUUULUUULUUULUUULPLLLPLL!!!!LUUULUUULUUULUUULPLLLPLL!!!!!!LUUULUUULUUULUUULPLLLPLL!!!!LUUULUUULUUULUUULPLLLPLL!!!!!!LUUULUUULUUULUUULPLLLPLL!!!!LUUULUUULUUULUUULPLLLPLL!!!!!!LUUULUUULUUULUUULPLLLPLL!!!!LUUULUUULUUULUUULPLLLPLL!!!!!!!" + "'", str2, "LUUULUUULUUULUUULPLLLPLL!!!!LUUULUUULUUULUUULPLLLPLL!!!!!!LUUULUUULUUULUUULPLLLPLL!!!!LUUULUUULUUULUUULPLLLPLL!!!!!!LUUULUUULUUULUUULPLLLPLL!!!!LUUULUUULUUULUUULPLLLPLL!!!!!!LUUULUUULUUULUUULPLLLPLL!!!!LUUULUUULUUULUUULPLLLPLL!!!!!!LUUULUUULUUULUUULPLLLPLL!!!!LUUULUUULUUULUUULPLLLPLL!!!!!!LUUULUUULUUULUUULPLLLPLL!!!!LUUULUUULUUULUUULPLLLPLL!!!!!!LUUULUUULUUULUUULPLLLPLL!!!!LUUULUUULUUULUUULPLLLPLL!!!!!!LUUULUUULUUULUUULPLLLPLL!!!!LUUULUUULUUULUUULPLLLPLL!!!!!!!");
    }

    @Test
    public void test05283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05283");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05284");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!", "\227nullnullnullnullnullnull\227nullnullnull\227nullnullnull\227nullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnull\227nullnullnull\227nullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!" + "'", str2, "\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!");
    }

    @Test
    public void test05285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05285");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\253\254\256\256````````````````\253\254\256\256````````!", "{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull{|~~{|~~nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull{|~~{|~~nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull{|~~{|~~nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull{|~~{|~~nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull{|~~{|~~nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull{|~~{|~~nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull{|~~{|~~nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull{|~~{|~~nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256````````````````\253\254\256\256````````!" + "'", str2, "\253\254\256\256````````````````\253\254\256\256````````!");
    }

    @Test
    public void test05286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05286");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!", "xmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxx!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!M\253\253!M\253\253!!!M\253\253!M\253\253!!!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!!!M\253\253!M\253\253!!!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!!!M\253\253!M\253\253!!!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!!!M\253\253!M\253\253!!!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!!!M\253\253!M\253\253!!!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!!!M\253\253!M\253\253!!!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!!!M\253\253!M\253\253!!!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!!!M\253\253!M\253\253!!!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!" + "'", str2, "!M\253\253!M\253\253!!!M\253\253!M\253\253!!!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!!!M\253\253!M\253\253!!!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!!!M\253\253!M\253\253!!!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!!!M\253\253!M\253\253!!!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!!!M\253\253!M\253\253!!!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!!!M\253\253!M\253\253!!!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!!!M\253\253!M\253\253!!!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!!!M\253\253!M\253\253!!!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!M\253\253!");
    }

    @Test
    public void test05287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05287");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226!", "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226!" + "'", str2, "\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226!");
    }

    @Test
    public void test05288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05288");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LLUU\275\275\275LLUU\275\275\275!!LLUU\275\275\275LLUU\275\275\275!!LLUU\275\275\275LLUU\275\275\275LLUU\275\275\275LLUU\275\275\275!!LLUU\275\275\275LLUU\275\275\275!!LLUU\275\275\275LLUU\275\275\275!", "eeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeff!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\275\275\275nullnullnullnull\275\275\275!!nullnullnullnull\275\275\275nullnullnullnull\275\275\275!!nullnullnullnull\275\275\275nullnullnullnull\275\275\275nullnullnullnull\275\275\275nullnullnullnull\275\275\275!!nullnullnullnull\275\275\275nullnullnullnull\275\275\275!!nullnullnullnull\275\275\275nullnullnullnull\275\275\275!" + "'", str2, "nullnullnullnull\275\275\275nullnullnullnull\275\275\275!!nullnullnullnull\275\275\275nullnullnullnull\275\275\275!!nullnullnullnull\275\275\275nullnullnullnull\275\275\275nullnullnullnull\275\275\275nullnullnullnull\275\275\275!!nullnullnullnull\275\275\275nullnullnullnull\275\275\275!!nullnullnullnull\275\275\275nullnullnullnull\275\275\275!");
    }

    @Test
    public void test05289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05289");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!!", "LL]UULLLL]UULLLL]UULLLL]UULL!LL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULL!LL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULL!LL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULL!LL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULL!LL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULL!LL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULL!LL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULL!LL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test05290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05290");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("ffff\236\276\276ffff\236\276\276!!ffff\236\276\276ffff\236\276\276!!ffff\236\276\276ffff\236\276\276ffff\236\276\276ffff\236\276\276!!ffff\236\276\276ffff\236\276\276!!ffff\236\276\276ffff\236\276\276!", "\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316!!\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316!!\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316!!\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316!!\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\316\316\316\316\236\276\276\316\316\316\316\236\276\276!!\316\316\316\316\236\276\276\316\316\316\316\236\276\276!!\316\316\316\316\236\276\276\316\316\316\316\236\276\276\316\316\316\316\236\276\276\316\316\316\316\236\276\276!!\316\316\316\316\236\276\276\316\316\316\316\236\276\276!!\316\316\316\316\236\276\276\316\316\316\316\236\276\276!" + "'", str2, "\316\316\316\316\236\276\276\316\316\316\316\236\276\276!!\316\316\316\316\236\276\276\316\316\316\316\236\276\276!!\316\316\316\316\236\276\276\316\316\316\316\236\276\276\316\316\316\316\236\276\276\316\316\316\316\236\276\276!!\316\316\316\316\236\276\276\316\316\316\316\236\276\276!!\316\316\316\316\236\276\276\316\316\316\316\236\276\276!");
    }

    @Test
    public void test05291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05291");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u035e\u035e\u035e\u035e\u035e\u035e\u035e\u035e!", "\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0140\u0140\u0140\u0140\u035e\u035e\u0140\u0140\u0140\u0140\u035e\u035e\u0140\u0140\u0140\u0140\u035e\u035e\u0140\u0140\u0140\u0140\u035e\u035e!" + "'", str2, "\u0140\u0140\u0140\u0140\u035e\u035e\u0140\u0140\u0140\u0140\u035e\u035e\u0140\u0140\u0140\u0140\u035e\u035e\u0140\u0140\u0140\u0140\u035e\u035e!");
    }

    @Test
    public void test05292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05292");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL\200\200\200\200\200\200\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL\200\200\200\200\200\200\200\200!!NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL\200\200\200\200\200\200\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL\200\200\200\200\200\200\200\200!!NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL\200\200\200\200\200\200\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL\200\200\200\200\200\200\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL\200\200\200\200\200\200\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL\200\200\200\200\200\200\200\200!!NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL\200\200\200\200\200\200\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL\200\200\200\200\200\200\200\200!!NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL\200\200\200\200\200\200\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL\200\200\200\200\200\200\200\200!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0220\u021d\u021d\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0220\u021d\u021d\u0346\u0348\u0348!");
    }

    @Test
    public void test05293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05293");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u014e\u014e\u014e\u014e!", "\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276nullnull\276\276nullnull!" + "'", str2, "\276\276nullnull\276\276nullnull!");
    }

    @Test
    public void test05294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05294");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("UU!", "EEnullnullEEnullnullEEnullnullEEnullnull!EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0406\u0406!" + "'", str2, "\u0406\u0406!");
    }

    @Test
    public void test05295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05295");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!!", "]uuuu]uuu]]]]]uuuu]uuu]]]]!!]uuuu]uuu]]]]]uuuu]uuu]]]]!!]uuuu]uuu]]]]]uuuu]uuu]]]]!!]uuuu]uuu]]]]]uuuu]uuu]]]]!!]uuuu]uuu]]]]]uuuu]uuu]]]]!!]uuuu]uuu]]]]]uuuu]uuu]]]]!!]uuuu]uuu]]]]]uuuu]uuu]]]]!!]uuuu]uuu]]]]]uuuu]uuu]]]]!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011anullnullnull!!!!!!!" + "'", str2, "\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011anullnullnull!!!!!!!");
    }

    @Test
    public void test05296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05296");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("}~\200\200}~\200\200nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnull!", "}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200}~\200\200}~\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200!" + "'", str2, "}~\200\200}~\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200}~\200\200}~\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200!");
    }

    @Test
    public void test05297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05297");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!", "nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!" + "'", str2, "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!");
    }

    @Test
    public void test05298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05298");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200!", "`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull!!`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull!!`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull!!`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull!!`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull!!`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull!!`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull!!`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200!" + "'", str2, "nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200!");
    }

    @Test
    public void test05299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05299");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNN!", "\u03dd\u03de\u03e0\u03e0nullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "TQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQ!" + "'", str2, "TQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQ!");
    }

    @Test
    public void test05300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05300");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("Lu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!ll!", "\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fa\u02fa\u02fa\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02faLNNNLNNNLNNN!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL!" + "'", str2, "\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL!");
    }

    @Test
    public void test05301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05301");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnull]]nullnull]]nullnull]]nullnull]]~}}^nullnull]]nullnull]]nullnull]]nullnull]]]]!", "!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NLLLNLLL]]NLLLNLLL]]NLLLNLLL]]NLLLNLLL]]~}}^NLLLNLLL]]NLLLNLLL]]NLLLNLLL]]NLLLNLLL]]]]!" + "'", str2, "NLLLNLLL]]NLLLNLLL]]NLLLNLLL]]NLLLNLLL]]~}}^NLLLNLLL]]NLLLNLLL]]NLLLNLLL]]NLLLNLLL]]]]!");
    }

    @Test
    public void test05302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05302");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0143\u0145\u0145\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0143\u0145\u0145\u0145\u0143\u0145\u0143!!!", "\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnullnull!!nullnull!!nullnull!!nullnull!!null!nullnullnullnull!!nullnull!!!" + "'", str2, "null!nullnullnullnull!!nullnull!!nullnull!!nullnull!!null!nullnullnullnull!!nullnull!!!");
    }

    @Test
    public void test05303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05303");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0245\u023d\u0248\u0248\u0245\u023d\u0248\u0248\u0245\u023d\u0248\u0248\u0245\u023d\u0248\u0248\u0245\u023d\u0248\u0248\u0245\u023d\u0248\u0248\u0245\u023d\u0248\u0248\u0245\u023d\u0248\u0248!", "}~\200\200}~\200\200\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338}~\200\200}~\200\200\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05304");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!", "!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!" + "'", str2, "!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!");
    }

    @Test
    public void test05305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05305");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAA!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull!!\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull!!\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull!!\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull!!\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull!" + "'", str2, "\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull!!\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull!!\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull!!\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull!!\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull!");
    }

    @Test
    public void test05306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05306");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!!", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "XXXXXXXXXXXX!!!!XXXXXXXXXXXX!!!!!!XXXXXXXXXXXX!!!!XXXXXXXXXXXX!!!!!!XXXXXXXXXXXX!!!!XXXXXXXXXXXX!!!!!!XXXXXXXXXXXX!!!!XXXXXXXXXXXX!!!!!!XXXXXXXXXXXX!!!!XXXXXXXXXXXX!!!!!!XXXXXXXXXXXX!!!!XXXXXXXXXXXX!!!!!!XXXXXXXXXXXX!!!!XXXXXXXXXXXX!!!!!!XXXXXXXXXXXX!!!!XXXXXXXXXXXX!!!!!!!" + "'", str2, "XXXXXXXXXXXX!!!!XXXXXXXXXXXX!!!!!!XXXXXXXXXXXX!!!!XXXXXXXXXXXX!!!!!!XXXXXXXXXXXX!!!!XXXXXXXXXXXX!!!!!!XXXXXXXXXXXX!!!!XXXXXXXXXXXX!!!!!!XXXXXXXXXXXX!!!!XXXXXXXXXXXX!!!!!!XXXXXXXXXXXX!!!!XXXXXXXXXXXX!!!!!!XXXXXXXXXXXX!!!!XXXXXXXXXXXX!!!!!!XXXXXXXXXXXX!!!!XXXXXXXXXXXX!!!!!!!");
    }

    @Test
    public void test05307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05307");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!", "LL!!!!!LL!!!!!LL!!!!!LL!!!!!LL!!!!!LL!!!!!LL!!!!!LL!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!" + "'", str2, "}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!");
    }

    @Test
    public void test05308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05308");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275!", "RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275!" + "'", str2, "\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275!");
    }

    @Test
    public void test05309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05309");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368\300\300!!\300\300!!\300\300!!\300\300\u0346\u0348\u0348!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test05310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05310");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("NN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNN!", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05311");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("porrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporr!", "~}\200\200~}\200\200!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230~}\200\200~}\200\200!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230~}\200\200~}\200\200!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230~}\200\200~}\200\200!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230~}\200\200~}\200\200!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230~}\200\200~}\200\200!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230~}\200\200~}\200\200!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230~}\200\200~}\200\200!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!" + "'", str2, "!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!");
    }

    @Test
    public void test05312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05312");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "nullnullnullnull\276nullnullnullnullnullnullnull\276\276nullnullnullnullnull\276\276nullnullnullnullnull\276\276nullnullnullnullnull\276\276nullnullnullnull\276nullnullnullnullnullnullnull\276\276nullnullnullnullnull\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05313");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440nullnull!", "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05314");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0346\u0346\u0346\u0346!", "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0346\u0346\u0346!" + "'", str2, "\u0346\u0346\u0346\u0346!");
    }

    @Test
    public void test05315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05315");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("l]lll]ll!!l]lll]ll!!l]lll]lll]lll]ll!!l]lll]ll!!l]lll]ll!", "\u0366\u0365\u0368\u0368\300\335\335\335\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!]!!!]!!!!!]!!!]!!!!!]!!!]!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!" + "'", str2, "!]!!!]!!!!!]!!!]!!!!!]!!!]!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!");
    }

    @Test
    public void test05316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05316");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("H!~~H!~~H!~~H!~~H!~~H!~~H!~~H!~~nullnullnullnullnullnullnullnullH!~~H!~~H!~~H!~~H!~~H!~~H!~~H!~~nullnullnullnullnullnullnullnull!", "\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05317");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("}~\200\200}~\200\200!\335\335\335!\335\335\335!\335\335\335!\335\335\335!\335\335\335!\335\335\335!\335\335\335!\335\335\335}~\200\200}~\200\200!\335\335\335!\335\335\335!\335\335\335!\335\335\335!\335\335\335!\335\335\335!\335\335\335!\335\335\335!", "\265\276\276\276\265\276\276\276\276\276\265\276\276\276\265\276\276\276\276\276\265\276\276\276\265\276\276\276\276\276\265\276\276\276\265\276\276\276\276\276\265\276\276\276\265\276\276\276\276\276\265\276\276\276\265\276\276\276\276\276\265\276\276\276\265\276\276\276\276\276\265\276\276\276\265\276\276\276\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull}~\200\200}~\200\200!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!" + "'", str2, "}~\200\200}~\200\200!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull}~\200\200}~\200\200!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!");
    }

    @Test
    public void test05318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05318");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\220\220!!\220\220!!\220\220!!\220\220\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\220\220!!\220\220!!\220\220!!\220\220\u0346\u0348\u0348!");
    }

    @Test
    public void test05319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05319");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!" + "'", str2, "\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!");
    }

    @Test
    public void test05320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05320");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7```!", "LL!!LL!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```!" + "'", str2, "nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```!");
    }

    @Test
    public void test05321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05321");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LLLLnullnullnullnullLLLLnullnull!", "LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0106\u0106\u0106\u0106\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0106\u0106\u0106\u0106\u0128\u0126\u0126\u0128\u0126\u0126!" + "'", str2, "\u0106\u0106\u0106\u0106\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0106\u0106\u0106\u0106\u0128\u0126\u0126\u0128\u0126\u0126!");
    }

    @Test
    public void test05322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05322");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("NNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLL!!NNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLL!!NNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLL!!NNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLL!!NNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLL!", "~null~~\225\230\230~null~~\225\230\230~null~~\225\230\230~null~~\225\230\230\200}}`~null~~\225\230\230~null~~\225\230\230~null~~\225\230\230~null~~\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL~LNN~LNNLL~LNN~LNNLL~LNN~LNNLL~LNN~LNNLL~LNN~LNNLL~LNN~LNNLL~LNN~LNNLL~LNN~LNN!!LL~LNN~LNNLL~LNN~LNNLL~LNN~LNNLL~LNN~LNNLL~LNN~LNNLL~LNN~LNNLL~LNN~LNNLL~LNN~LNN!!LL~LNN~LNNLL~LNN~LNNLL~LNN~LNNLL~LNN~LNNLL~LNN~LNNLL~LNN~LNNLL~LNN~LNNLL~LNN~LNNLL~LNN~LNNLL~LNN~LNNLL~LNN~LNNLL~LNN~LNNLL~LNN~LNNLL~LNN~LNNLL~LNN~LNNLL~LNN~LNN!!LL~LNN~LNNLL~LNN~LNNLL~LNN~LNNLL~LNN~LNNLL~LNN~LNNLL~LNN~LNNLL~LNN~LNNLL~LNN~LNN!!LL~LNN~LNNLL~LNN~LNNLL~LNN~LNNLL~LNN~LNNLL~LNN~LNNLL~LNN~LNNLL~LNN~LNNLL~LNN~LNN!" + "'", str2, "LL~LNN~LNNLL~LNN~LNNLL~LNN~LNNLL~LNN~LNNLL~LNN~LNNLL~LNN~LNNLL~LNN~LNNLL~LNN~LNN!!LL~LNN~LNNLL~LNN~LNNLL~LNN~LNNLL~LNN~LNNLL~LNN~LNNLL~LNN~LNNLL~LNN~LNNLL~LNN~LNN!!LL~LNN~LNNLL~LNN~LNNLL~LNN~LNNLL~LNN~LNNLL~LNN~LNNLL~LNN~LNNLL~LNN~LNNLL~LNN~LNNLL~LNN~LNNLL~LNN~LNNLL~LNN~LNNLL~LNN~LNNLL~LNN~LNNLL~LNN~LNNLL~LNN~LNNLL~LNN~LNN!!LL~LNN~LNNLL~LNN~LNNLL~LNN~LNNLL~LNN~LNNLL~LNN~LNNLL~LNN~LNNLL~LNN~LNNLL~LNN~LNN!!LL~LNN~LNNLL~LNN~LNNLL~LNN~LNNLL~LNN~LNNLL~LNN~LNNLL~LNN~LNNLL~LNN~LNNLL~LNN~LNN!");
    }

    @Test
    public void test05323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05323");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("efhhefhh!", "nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL\300\300LL\300\300!" + "'", str2, "LL\300\300LL\300\300!");
    }

    @Test
    public void test05324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05324");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!", "unulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluunullunulluuunulluuunulluunullunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluunullunulluuunulluuunulluunullunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluunullunulluuunulluuunulluunullunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluunullunulluuunulluuunulluunullunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluunullunulluuunulluuunulluunullunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluunullunulluuunulluuunulluunullunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluunullunulluuunulluuunulluunullunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluunullunulluuunulluuunulluunullunulluuunulluu!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULL!" + "'", str2, "UULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULL!");
    }

    @Test
    public void test05325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05325");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\275``UU``UU``UU\276``UU\275\275!", "\u0346\u0348\u0348\u0348\u037b\u037c\u037e\u037e\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275``nullnull``nullnull``nullnull\276``nullnull\275\275!" + "'", str2, "\275``nullnull``nullnull``nullnull\276``nullnull\275\275!");
    }

    @Test
    public void test05326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05326");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!!", "LLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUU!!LLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUU!!LLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUU!!LLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUU!!LLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUU!!LLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUU!!LLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUU!!LLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!!" + "'", str2, "nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!!");
    }

    @Test
    public void test05327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05327");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\201\204\204\204\201\204\204\204\201\204\204\204\201\204\204\204\200}}`\201\204\204\204\201\204\204\204\201\204\204\204\201\204\204\204]]!", "\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\201\204\204\204\201\204\204\204\201\204\204\204\201\204\204\204\200}}`\201\204\204\204\201\204\204\204\201\204\204\204\201\204\204\204]]!" + "'", str2, "\201\204\204\204\201\204\204\204\201\204\204\204\201\204\204\204\200}}`\201\204\204\204\201\204\204\204\201\204\204\204\201\204\204\204]]!");
    }

    @Test
    public void test05328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05328");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("null\225\223\223\275\275\275null\225\223\223\275\275\275!!null\225\223\223\275\275\275null\225\223\223\275\275\275!!null\225\223\223\275\275\275null\225\223\223\275\275\275null\225\223\223\275\275\275null\225\223\223\275\275\275!!null\225\223\223\275\275\275null\225\223\223\275\275\275!!null\225\223\223\275\275\275null\225\223\223\275\275\275!", "nullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnullee\254~\256\256\254~\256\256\254~\256\256\254~\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\373\374\376\376\225\223\223\275\275\275\373\374\376\376\225\223\223\275\275\275!!\373\374\376\376\225\223\223\275\275\275\373\374\376\376\225\223\223\275\275\275!!\373\374\376\376\225\223\223\275\275\275\373\374\376\376\225\223\223\275\275\275\373\374\376\376\225\223\223\275\275\275\373\374\376\376\225\223\223\275\275\275!!\373\374\376\376\225\223\223\275\275\275\373\374\376\376\225\223\223\275\275\275!!\373\374\376\376\225\223\223\275\275\275\373\374\376\376\225\223\223\275\275\275!" + "'", str2, "\373\374\376\376\225\223\223\275\275\275\373\374\376\376\225\223\223\275\275\275!!\373\374\376\376\225\223\223\275\275\275\373\374\376\376\225\223\223\275\275\275!!\373\374\376\376\225\223\223\275\275\275\373\374\376\376\225\223\223\275\275\275\373\374\376\376\225\223\223\275\275\275\373\374\376\376\225\223\223\275\275\275!!\373\374\376\376\225\223\223\275\275\275\373\374\376\376\225\223\223\275\275\275!!\373\374\376\376\225\223\223\275\275\275\373\374\376\376\225\223\223\275\275\275!");
    }

    @Test
    public void test05329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05329");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340nullnullnullnullnullnullnullnull\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340nullnullnullnullnullnullnullnull!", "\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`\275```\275```\275```\275```\275```\275```\275```\275\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368`\275```\275```\275```\275```\275```\275```\275```\275\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368!" + "'", str2, "`\275```\275```\275```\275```\275```\275```\275```\275\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368`\275```\275```\275```\275```\275```\275```\275```\275\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368!");
    }

    @Test
    public void test05330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05330");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!", "HHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!" + "'", str2, "\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!");
    }

    @Test
    public void test05331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05331");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```!", "\u0170\u016c\u016e\u016e\276\276\276\u0170\u016c\u016e\u016e\276\276\276\276\276\u0170\u016c\u016e\u016e\276\276\276\u0170\u016c\u016e\u016e\276\276\276\276\276\u0170\u016c\u016e\u016e\276\276\276\u0170\u016c\u016e\u016e\276\276\276\276\276\u0170\u016c\u016e\u016e\276\276\276\u0170\u016c\u016e\u016e\276\276\276\276\276\u0170\u016c\u016e\u016e\276\276\276\u0170\u016c\u016e\u016e\276\276\276\276\276\u0170\u016c\u016e\u016e\276\276\276\u0170\u016c\u016e\u016e\276\276\276\276\276\u0170\u016c\u016e\u016e\276\276\276\u0170\u016c\u016e\u016e\276\276\276\276\276\u0170\u016c\u016e\u016e\276\276\276\u0170\u016c\u016e\u016e\276\276\276\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```!" + "'", str2, "nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```!");
    }

    @Test
    public void test05332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05332");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("UNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUU!", "!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05333");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("EEEEEEEEEEEEEEEE\200}}`EEEEEEEEEEEEEEEE]]!", "}~\200\200}~\200\200NNUUNNUUNNUUNNUU^NNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUU^NNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUU}~\200\200}~\200\200NNUUNNUUNNUUNNUU^NNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUU^NNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}}}}}}}}}}}}}}}}\200}}`}}}}}}}}}}}}}}}}]]!" + "'", str2, "}}}}}}}}}}}}}}}}\200}}`}}}}}}}}}}}}}}}}]]!");
    }

    @Test
    public void test05334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05334");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!", "\215}\215\215\215}\215\215\u014e\u014e\u014e\u014e!!!\215}\215\215\215}\215\215!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!" + "'", str2, "\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!");
    }

    @Test
    public void test05335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05335");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!", "\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!" + "'", str2, "\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!");
    }

    @Test
    public void test05336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05336");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test05337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05337");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull!", "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test05338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05338");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!!", "\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!" + "'", str2, "!!!");
    }

    @Test
    public void test05339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05339");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("enullnullnull\200}}enullnullnull\200}}enullnullnull\200}}enullnullnull\200}}enullnullnull\200}}enullnullnull\200}}enullnullnull\200}}enullnullnull\200}}!", "!\253\256\256\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u014e\u014e\u014e\u014e\u014e\u014e\200\u014e\u014e\u014e\u014e\u014e\u014e\200\u014e\u014e\u014e\u014e\u014e\u014e\200\u014e\u014e\u014e\u014e\u014e\u014e\200\u014e\u014e\u014e\u014e\u014e\u014e\200\u014e\u014e\u014e\u014e\u014e\u014e\200\u014e\u014e\u014e\u014e\u014e\u014e\200\u014e\u014e\u014e\u014e\u014e\u014e\200}}!" + "'", str2, "\u014e\u014e\u014e\u014e\u014e\u014e\200\u014e\u014e\u014e\u014e\u014e\u014e\200\u014e\u014e\u014e\u014e\u014e\u014e\200\u014e\u014e\u014e\u014e\u014e\u014e\200\u014e\u014e\u014e\u014e\u014e\u014e\200\u014e\u014e\u014e\u014e\u014e\u014e\200\u014e\u014e\u014e\u014e\u014e\u014e\200\u014e\u014e\u014e\u014e\u014e\u014e\200}}!");
    }

    @Test
    public void test05340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05340");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368nullnullnullnull\213\213\213\u0346\u0348\u0348!", "\200!\200\200\200!\200\200\200!\200\200\200!\200\200\200!\200\200\200!\200\200\200!\200\200\200!\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\213\213\213\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\213\213\213\u0346\u0348\u0348!");
    }

    @Test
    public void test05341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05341");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!!!!!!!!!!!!!!!!!!!!", "\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test05342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05342");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253!", "\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253!" + "'", str2, "\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253!");
    }

    @Test
    public void test05343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05343");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU\200}}`LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU]]!", "\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276\200}}`!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276]]!" + "'", str2, "!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276\200}}`!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276]]!");
    }

    @Test
    public void test05344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05344");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!", "\275\335\336\340\340\335\336\340\340\335\336\340\340\276\335\336\340\340\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!" + "'", str2, "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test05345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05345");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\226!!!\226!!!\226!!!\226!!!\226!!!\226!!!\226!!!\226!!!!", "\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\226!!!\226!!!\226!!!\226!!!\226!!!\226!!!\226!!!\226!!!!" + "'", str2, "\226!!!\226!!!\226!!!\226!!!\226!!!\226!!!\226!!!\226!!!!");
    }

    @Test
    public void test05346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05346");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\276\276\275\275\275\275\276\276!", "UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276\275\275\275\275\276\276!" + "'", str2, "\276\276\275\275\275\275\276\276!");
    }

    @Test
    public void test05347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05347");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("L!!!L!!!L!!!L!!!\200}}`L!!!L!!!L!!!L!!!]]!", "\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!!!\276!!!\276!!!\276!!!\200}}`\276!!!\276!!!\276!!!\276!!!]]!" + "'", str2, "\276!!!\276!!!\276!!!\276!!!\200}}`\276!!!\276!!!\276!!!\276!!!]]!");
    }

    @Test
    public void test05348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05348");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!", "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!" + "'", str2, "!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!");
    }

    @Test
    public void test05349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05349");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\275nmppnmppnmpp\275nmppnmppnmpp\275nmppnmppnmpp\275nmppnmppnmppnmppnmpp\275\275nmppnmpp\275\275nmppnmpp\275\275nmppnmpp\275\275\275nmppnmppnmpp\275nmppnmppnmpp\275nmppnmppnmpp\275nmppnmppnmppnmppnmpp\275\275nmppnmpp\275\275!", "nullpnullrrRRnullpnullrrRR!!nullpnullrrRRnullpnullrrRR!!nullpnullrrRRnullpnullrrRR!!nullpnullrrRRnullpnullrrRR!!nullpnullrrRRnullpnullrrRR!!nullpnullrrRRnullpnullrrRR!!nullpnullrrRRnullpnullrrRR!!nullpnullrrRRnullpnullrrRR!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\u0137\u0136\u0136\u0137\u0136\u0136\u0137\u0136\u0136\275\u0137\u0136\u0136\u0137\u0136\u0136\u0137\u0136\u0136\275\u0137\u0136\u0136\u0137\u0136\u0136\u0137\u0136\u0136\275\u0137\u0136\u0136\u0137\u0136\u0136\u0137\u0136\u0136\u0137\u0136\u0136\u0137\u0136\u0136\275\275\u0137\u0136\u0136\u0137\u0136\u0136\275\275\u0137\u0136\u0136\u0137\u0136\u0136\275\275\u0137\u0136\u0136\u0137\u0136\u0136\275\275\275\u0137\u0136\u0136\u0137\u0136\u0136\u0137\u0136\u0136\275\u0137\u0136\u0136\u0137\u0136\u0136\u0137\u0136\u0136\275\u0137\u0136\u0136\u0137\u0136\u0136\u0137\u0136\u0136\275\u0137\u0136\u0136\u0137\u0136\u0136\u0137\u0136\u0136\u0137\u0136\u0136\u0137\u0136\u0136\275\275\u0137\u0136\u0136\u0137\u0136\u0136\275\275!" + "'", str2, "\275\u0137\u0136\u0136\u0137\u0136\u0136\u0137\u0136\u0136\275\u0137\u0136\u0136\u0137\u0136\u0136\u0137\u0136\u0136\275\u0137\u0136\u0136\u0137\u0136\u0136\u0137\u0136\u0136\275\u0137\u0136\u0136\u0137\u0136\u0136\u0137\u0136\u0136\u0137\u0136\u0136\u0137\u0136\u0136\275\275\u0137\u0136\u0136\u0137\u0136\u0136\275\275\u0137\u0136\u0136\u0137\u0136\u0136\275\275\u0137\u0136\u0136\u0137\u0136\u0136\275\275\275\u0137\u0136\u0136\u0137\u0136\u0136\u0137\u0136\u0136\275\u0137\u0136\u0136\u0137\u0136\u0136\u0137\u0136\u0136\275\u0137\u0136\u0136\u0137\u0136\u0136\u0137\u0136\u0136\275\u0137\u0136\u0136\u0137\u0136\u0136\u0137\u0136\u0136\u0137\u0136\u0136\u0137\u0136\u0136\275\275\u0137\u0136\u0136\u0137\u0136\u0136\275\275!");
    }

    @Test
    public void test05350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05350");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("]nullnullnullnullnull]]nullnull]]nullnull]]nullnull]]]nullnullnullnullnull]]nullnull]]!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!]]nullnull!!nullnull!!]]nullnull!!nullnull!!]]nullnull!!nullnull!!]]]nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!]]nullnull!!nullnull!!]]!" + "'", str2, "]nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!]]nullnull!!nullnull!!]]nullnull!!nullnull!!]]nullnull!!nullnull!!]]]nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!]]nullnull!!nullnull!!]]!");
    }

    @Test
    public void test05351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05351");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnull!!null~~nullnull!!null~~nullnull!!null~~nullnull!!null~~nullnull!!null~~nullnull!!null~~nullnull!!null~~nullnull!!null~~!", "!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~!" + "'", str2, "\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~!");
    }

    @Test
    public void test05352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05352");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("f]fff]ff!!f]fff]ff!!f]fff]fff]fff]ff!!f]fff]ff!!f]fff]ff!", "null~\225\225\230\230\225\225\230\230\225\225\230\230\225\225null~\225\225\230\230\225\225\230\230\225\225\230\230\225\225null~\225\225\230\230\225\225\230\230\225\225\230\230\225\225null~\225\225\230\230\225\225\230\230\225\225\230\230\225\225null~\225\225\230\230\225\225\230\230\225\225\230\230\225\225null~\225\225\230\230\225\225\230\230\225\225\230\230\225\225null~\225\225\230\230\225\225\230\230\225\225\230\230\225\225null~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\225]\225\225\225]\225\225!!\225]\225\225\225]\225\225!!\225]\225\225\225]\225\225\225]\225\225\225]\225\225!!\225]\225\225\225]\225\225!!\225]\225\225\225]\225\225!" + "'", str2, "\225]\225\225\225]\225\225!!\225]\225\225\225]\225\225!!\225]\225\225\225]\225\225\225]\225\225\225]\225\225!!\225]\225\225\225]\225\225!!\225]\225\225\225]\225\225!");
    }

    @Test
    public void test05353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05353");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("]]\256\256]]\256\256!!]]\256\256]]\256\256!!]]\256\256]]\256\256]]\256\256]]\256\256!!]]\256\256]]\256\256!!]]\256\256]]\256\256!", "]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]\256\256]]\256\256!!]]\256\256]]\256\256!!]]\256\256]]\256\256]]\256\256]]\256\256!!]]\256\256]]\256\256!!]]\256\256]]\256\256!" + "'", str2, "]]\256\256]]\256\256!!]]\256\256]]\256\256!!]]\256\256]]\256\256]]\256\256]]\256\256!!]]\256\256]]\256\256!!]]\256\256]]\256\256!");
    }

    @Test
    public void test05354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05354");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!", "!\254\214\214!!\214\214!!!\254\214\214!!\214\214!!!!!!!!!!!\254\214\214!!\214\214!!!\254\214\214!!\214\214!!!!!!!!!!!\254\214\214!!\214\214!!!\254\214\214!!\214\214!!!!!!!!!!!\254\214\214!!\214\214!!!\254\214\214!!\214\214!!!!!!!!!!!\254\214\214!!\214\214!!!\254\214\214!!\214\214!!!!!!!!!!!\254\214\214!!\214\214!!!\254\214\214!!\214\214!!!!!!!!!!!\254\214\214!!\214\214!!!\254\214\214!!\214\214!!!!!!!!!!!\254\214\214!!\214\214!!!\254\214\214!!\214\214!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\200}}`\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!]]!" + "'", str2, "\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\200}}`\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!]]!");
    }

    @Test
    public void test05355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05355");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("UU]]UU]]LUUULUUUUU]]UU]]LUUULUUU!", "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull]]nullnull]]nullnullnullnullnullnullnullnullnullnull]]nullnull]]nullnullnullnullnullnullnullnull!" + "'", str2, "nullnull]]nullnull]]nullnullnullnullnullnullnullnullnullnull]]nullnull]]nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05356");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226!!null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226!!!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226!!UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226!!!" + "'", str2, "UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226!!UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226!!!");
    }

    @Test
    public void test05357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05357");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull!", "\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230!\225\225\230!\225\225\250\250!!\250\250!!\230!\225\225\230!\225\225\250\250!!\250\250!!\230!\225\225\230!\225\225\250\250!!\250\250!!\230!\225\225\230!\225\225\250\250!!\250\250!!\230!\225\225\230!\225\225\250\250!!\250\250!!\230!\225\225\230!\225\225\250\250!!\250\250!!\230!\225\225\230!\225\225\250\250!!\250\250!!\230!\225\225\230!\225\225\250\250!!\250\250!!!" + "'", str2, "\230!\225\225\230!\225\225\250\250!!\250\250!!\230!\225\225\230!\225\225\250\250!!\250\250!!\230!\225\225\230!\225\225\250\250!!\250\250!!\230!\225\225\230!\225\225\250\250!!\250\250!!\230!\225\225\230!\225\225\250\250!!\250\250!!\230!\225\225\230!\225\225\250\250!!\250\250!!\230!\225\225\230!\225\225\250\250!!\250\250!!\230!\225\225\230!\225\225\250\250!!\250\250!!!");
    }

    @Test
    public void test05358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05358");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("}~\200\200}~\200\200FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF}~\200\200}~\200\200FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF!", "JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ}~\200\200}~\200\200JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ!" + "'", str2, "}~\200\200}~\200\200JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ}~\200\200}~\200\200JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ!");
    }

    @Test
    public void test05359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05359");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05360");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!ULL!ULL!ULL!ULL!ULL!", "\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!" + "'", str2, "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!");
    }

    @Test
    public void test05361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05361");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\300!!!\300!!!\300!!!\300!!!\300!!!\300!!!\300!!!\300!!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!" + "'", str2, "null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!");
    }

    @Test
    public void test05362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05362");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~!", "LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU\200}}`LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~!" + "'", str2, "\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~!");
    }

    @Test
    public void test05363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05363");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "UUU!!UUUUU!!UU!!UUU!!UUUUU!!UU!!UUU!!UUUUU!!UUUUU!!UUUUU!!UU!!UUU!!UUUUU!!UU!!UUU!!UUUUU!!UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05364");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\215}\215\215\215}\215\215\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\215}\215\215\215}\215\215!", "nullnullnullnullUNLLUNLLUNLLUNLLnullnullnullnullUNLLUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215}\215\215\215}\215\215\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\215}\215\215\215}\215\215!" + "'", str2, "\215}\215\215\215}\215\215\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\215}\215\215\215}\215\215!");
    }

    @Test
    public void test05365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05365");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU!", "nullnull!!null`nullnullnull`nullnullnull`nullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!null`nullnullnull`nullnullnull`nullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e!" + "'", str2, "\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e!");
    }

    @Test
    public void test05366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05366");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\225\225\225\225\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\225\225\225\225\u0346\u0348\u0348!");
    }

    @Test
    public void test05367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05367");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!", "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!!!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!!!");
    }

    @Test
    public void test05368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05368");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!", "LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nll!nll!!!nll!nll!!!nll!nll!nll!nll!nll!nll!nll!nll!nll!nll!!!nll!nll!!!nll!nll!nll!nll!nll!nll!nll!nll!nll!nll!!!nll!nll!!!nll!nll!nll!nll!nll!nll!nll!nll!nll!nll!!!nll!nll!!!nll!nll!nll!nll!nll!nll!nll!nll!nll!nll!!!nll!nll!!!nll!nll!nll!nll!nll!nll!nll!nll!nll!nll!!!nll!nll!!!nll!nll!nll!nll!nll!nll!nll!nll!nll!nll!!!nll!nll!!!nll!nll!nll!nll!nll!nll!nll!nll!nll!nll!!!nll!nll!!!nll!nll!nll!nll!nll!nll!nll!nll!" + "'", str2, "!nll!nll!!!nll!nll!!!nll!nll!nll!nll!nll!nll!nll!nll!nll!nll!!!nll!nll!!!nll!nll!nll!nll!nll!nll!nll!nll!nll!nll!!!nll!nll!!!nll!nll!nll!nll!nll!nll!nll!nll!nll!nll!!!nll!nll!!!nll!nll!nll!nll!nll!nll!nll!nll!nll!nll!!!nll!nll!!!nll!nll!nll!nll!nll!nll!nll!nll!nll!nll!!!nll!nll!!!nll!nll!nll!nll!nll!nll!nll!nll!nll!nll!!!nll!nll!!!nll!nll!nll!nll!nll!nll!nll!nll!nll!nll!!!nll!nll!!!nll!nll!nll!nll!nll!nll!nll!nll!");
    }

    @Test
    public void test05369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05369");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test05370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05370");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\340\340!!nullnullnull\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!nullnullnull\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!!", "TT!!TT!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test05371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05371");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!H!", "!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!" + "'", str2, "!null!");
    }

    @Test
    public void test05372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05372");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254!", "``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254!" + "'", str2, "\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254!");
    }

    @Test
    public void test05373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05373");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLnullNLLLnullnullnullNLLLnullnullNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLnullNLLLnullnullnullNLLLnullnullNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLnullNLLLnullnullnullNLLLnullnullNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLnullNLLLnullnullnullNLLLnullnullNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLnullNLLLnullnullnullNLLLnullnullNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLnullNLLLnullnullnullNLLLnullnullNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLnullNLLLnullnullnullNLLLnullnullNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLnullNLLLnullnullnullNLLLnullnull!", "nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LUUULUUULUUULUUULUUULUUULUUULUUUUL!!LUUUUL!!UL!!UL!!LUUUUL!!UL!!LUUULUUULUUULUUULUUULUUULUUULUUUUL!!LUUUUL!!UL!!UL!!LUUUUL!!UL!!LUUULUUULUUULUUULUUULUUULUUULUUUUL!!LUUUUL!!UL!!UL!!LUUUUL!!UL!!LUUULUUULUUULUUULUUULUUULUUULUUUUL!!LUUUUL!!UL!!UL!!LUUUUL!!UL!!LUUULUUULUUULUUULUUULUUULUUULUUUUL!!LUUUUL!!UL!!UL!!LUUUUL!!UL!!LUUULUUULUUULUUULUUULUUULUUULUUUUL!!LUUUUL!!UL!!UL!!LUUUUL!!UL!!LUUULUUULUUULUUULUUULUUULUUULUUUUL!!LUUUUL!!UL!!UL!!LUUUUL!!UL!!LUUULUUULUUULUUULUUULUUULUUULUUUUL!!LUUUUL!!UL!!UL!!LUUUUL!!UL!!!" + "'", str2, "LUUULUUULUUULUUULUUULUUULUUULUUUUL!!LUUUUL!!UL!!UL!!LUUUUL!!UL!!LUUULUUULUUULUUULUUULUUULUUULUUUUL!!LUUUUL!!UL!!UL!!LUUUUL!!UL!!LUUULUUULUUULUUULUUULUUULUUULUUUUL!!LUUUUL!!UL!!UL!!LUUUUL!!UL!!LUUULUUULUUULUUULUUULUUULUUULUUUUL!!LUUUUL!!UL!!UL!!LUUUUL!!UL!!LUUULUUULUUULUUULUUULUUULUUULUUUUL!!LUUUUL!!UL!!UL!!LUUUUL!!UL!!LUUULUUULUUULUUULUUULUUULUUULUUUUL!!LUUUUL!!UL!!UL!!LUUUUL!!UL!!LUUULUUULUUULUUULUUULUUULUUULUUUUL!!LUUUUL!!UL!!UL!!LUUUUL!!UL!!LUUULUUULUUULUUULUUULUUULUUULUUUUL!!LUUUUL!!UL!!UL!!LUUUUL!!UL!!!");
    }

    @Test
    public void test05374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05374");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242!!!", "}~\200\200}~\200\200nullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test05375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05375");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "`^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^``!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05376");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0346\u0348\u0348\u0348}~\200\200}~\200\200u!llnullnullnullu!llnullnullnull}~\200\200}~\200\200u!llnullnullnullu!llnullnullnull}~\200\200}~\200\200u!llnullnullnullu!llnullnullnull}~\200\200}~\200\200\u0348\u0346\u0346!", "LL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348}~\200\200}~\200\200null!\340\340nullnull\340\340nullnull\340\340nullnull\340\340null!\340\340nullnull\340\340nullnull\340\340nullnull\340\340}~\200\200}~\200\200null!\340\340nullnull\340\340nullnull\340\340nullnull\340\340null!\340\340nullnull\340\340nullnull\340\340nullnull\340\340}~\200\200}~\200\200null!\340\340nullnull\340\340nullnull\340\340nullnull\340\340null!\340\340nullnull\340\340nullnull\340\340nullnull\340\340}~\200\200}~\200\200null!\340\340nullnull\340\340nullnull\340\340nullnull\340\340null!\340\340nullnull\340\340nullnull\340\340nullnull\340\340\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348}~\200\200}~\200\200null!\340\340nullnull\340\340nullnull\340\340nullnull\340\340null!\340\340nullnull\340\340nullnull\340\340nullnull\340\340}~\200\200}~\200\200null!\340\340nullnull\340\340nullnull\340\340nullnull\340\340null!\340\340nullnull\340\340nullnull\340\340nullnull\340\340}~\200\200}~\200\200null!\340\340nullnull\340\340nullnull\340\340nullnull\340\340null!\340\340nullnull\340\340nullnull\340\340nullnull\340\340}~\200\200}~\200\200null!\340\340nullnull\340\340nullnull\340\340nullnull\340\340null!\340\340nullnull\340\340nullnull\340\340nullnull\340\340\u0348\u0346\u0346!");
    }

    @Test
    public void test05377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05377");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("`}UU`}UU`}UU`}UU`}UU!", "WZZZ\200}}`WZZZ]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`}nullnull`}nullnull`}nullnull`}nullnull`}nullnull!" + "'", str2, "`}nullnull`}nullnull`}nullnull`}nullnull`}nullnull!");
    }

    @Test
    public void test05378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05378");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275\u0137\u0136\u0136\u0137\u0136\u0136\u0137\u0136\u0136\275\u0137\u0136\u0136\u0137\u0136\u0136\u0137\u0136\u0136\275\u0137\u0136\u0136\u0137\u0136\u0136\u0137\u0136\u0136\275\u0137\u0136\u0136\u0137\u0136\u0136\u0137\u0136\u0136\u0137\u0136\u0136\u0137\u0136\u0136\275\275\u0137\u0136\u0136\u0137\u0136\u0136\275\275\u0137\u0136\u0136\u0137\u0136\u0136\275\275\u0137\u0136\u0136\u0137\u0136\u0136\275\275\275\u0137\u0136\u0136\u0137\u0136\u0136\u0137\u0136\u0136\275\u0137\u0136\u0136\u0137\u0136\u0136\u0137\u0136\u0136\275\u0137\u0136\u0136\u0137\u0136\u0136\u0137\u0136\u0136\275\u0137\u0136\u0136\u0137\u0136\u0136\u0137\u0136\u0136\u0137\u0136\u0136\u0137\u0136\u0136\275\275\u0137\u0136\u0136\u0137\u0136\u0136\275\275!", "]]LL]]LL!!]]LL]]LL!!]]LL]]LL]]LL]]LL!!]]LL]]LL!!]]LL]]LL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullL]]]nullnullnullL]]]nullnullnullL]]]nullnull\275nullL]]]nullnullnullL]]]nullnullnullL]]]nullnull\275nullL]]]nullnullnullL]]]nullnullnullL]]]nullnull\275nullL]]]nullnullnullL]]]nullnullnullL]]]nullnullnullL]]]nullnullnullL]]]nullnull\275\275nullL]]]nullnullnullL]]]nullnull\275\275nullL]]]nullnullnullL]]]nullnull\275\275nullL]]]nullnullnullL]]]nullnull\275\275\275nullL]]]nullnullnullL]]]nullnullnullL]]]nullnull\275nullL]]]nullnullnullL]]]nullnullnullL]]]nullnull\275nullL]]]nullnullnullL]]]nullnullnullL]]]nullnull\275nullL]]]nullnullnullL]]]nullnullnullL]]]nullnullnullL]]]nullnullnullL]]]nullnull\275\275nullL]]]nullnullnullL]]]nullnull\275\275!" + "'", str2, "\275nullL]]]nullnullnullL]]]nullnullnullL]]]nullnull\275nullL]]]nullnullnullL]]]nullnullnullL]]]nullnull\275nullL]]]nullnullnullL]]]nullnullnullL]]]nullnull\275nullL]]]nullnullnullL]]]nullnullnullL]]]nullnullnullL]]]nullnullnullL]]]nullnull\275\275nullL]]]nullnullnullL]]]nullnull\275\275nullL]]]nullnullnullL]]]nullnull\275\275nullL]]]nullnullnullL]]]nullnull\275\275\275nullL]]]nullnullnullL]]]nullnullnullL]]]nullnull\275nullL]]]nullnullnullL]]]nullnullnullL]]]nullnull\275nullL]]]nullnullnullL]]]nullnullnullL]]]nullnull\275nullL]]]nullnullnullL]]]nullnullnullL]]]nullnullnullL]]]nullnullnullL]]]nullnull\275\275nullL]]]nullnullnullL]]]nullnull\275\275!");
    }

    @Test
    public void test05379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05379");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("``!!``!!!", "HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``!!``!!!" + "'", str2, "``!!``!!!");
    }

    @Test
    public void test05380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05380");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("nullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHH!", "\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125nullnull!" + "'", str2, "\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125nullnull!");
    }

    @Test
    public void test05381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05381");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL!", "L!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``!" + "'", str2, "\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``!");
    }

    @Test
    public void test05382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05382");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUU!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnull!nullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNN!" + "'", str2, "LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNN!");
    }

    @Test
    public void test05383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05383");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ!", "\u0243\u0243\u0243\u0243\u0243\u0243~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull!" + "'", str2, "\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull!");
    }

    @Test
    public void test05384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05384");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "}~\200\200}~\200\200\300\300\300\300^\300\300\300\300\300\300\300\300\300\300\300\300^\300\300\300\300\300\300\300\300}~\200\200}~\200\200\300\300\300\300^\300\300\300\300\300\300\300\300\300\300\300\300^\300\300\300\300\300\300\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300!" + "'", str2, "\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300!");
    }

    @Test
    public void test05385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05385");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!", "UUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!" + "'", str2, "!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!");
    }

    @Test
    public void test05386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05386");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("J\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220II!!J\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220II!!J\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220II!!J\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220II!!J\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220II!", "!~\200FFFF~~\200FFFF~~!~\200FFFF~~\200FFFF~~!!!~\200FFFF~~\200FFFF~~!~\200FFFF~~\200FFFF~~!!!~\200FFFF~~\200FFFF~~!~\200FFFF~~\200FFFF~~!~\200FFFF~~\200FFFF~~!~\200FFFF~~\200FFFF~~!!!~\200FFFF~~\200FFFF~~!~\200FFFF~~\200FFFF~~!!!~\200FFFF~~\200FFFF~~!~\200FFFF~~\200FFFF~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~!!\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~!!\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~!!\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~!!\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~!" + "'", str2, "\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~!!\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~!!\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~!!\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~!!\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~!");
    }

    @Test
    public void test05387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05387");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214!", "nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UULLUULLnullL\214\214nullL\214\214UULLUULLnullL\214\214nullL\214\214UULLUULLnullL\214\214nullL\214\214UULLUULLnullL\214\214nullL\214\214UULLUULLnullL\214\214nullL\214\214UULLUULLnullL\214\214nullL\214\214UULLUULLnullL\214\214nullL\214\214UULLUULLnullL\214\214nullL\214\214!" + "'", str2, "UULLUULLnullL\214\214nullL\214\214UULLUULLnullL\214\214nullL\214\214UULLUULLnullL\214\214nullL\214\214UULLUULLnullL\214\214nullL\214\214UULLUULLnullL\214\214nullL\214\214UULLUULLnullL\214\214nullL\214\214UULLUULLnullL\214\214nullL\214\214UULLUULLnullL\214\214nullL\214\214!");
    }

    @Test
    public void test05388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05388");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("]]\253\271\271!!\256\256\253\271\271!!\256\256]]\253\271\271!!\256\256\253\271\271!!\256\256!!]]\253\271\271!!\256\256\253\271\271!!\256\256]]\253\271\271!!\256\256\253\271\271!!\256\256!!]]\253\271\271!!\256\256\253\271\271!!\256\256]]\253\271\271!!\256\256\253\271\271!!\256\256]]\253\271\271!!\256\256\253\271\271!!\256\256]]\253\271\271!!\256\256\253\271\271!!\256\256!!]]\253\271\271!!\256\256\253\271\271!!\256\256]]\253\271\271!!\256\256\253\271\271!!\256\256!!]]\253\271\271!!\256\256\253\271\271!!\256\256]]\253\271\271!!\256\256\253\271\271!!\256\256!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]\253\271\271!!\256\256\253\271\271!!\256\256]]\253\271\271!!\256\256\253\271\271!!\256\256!!]]\253\271\271!!\256\256\253\271\271!!\256\256]]\253\271\271!!\256\256\253\271\271!!\256\256!!]]\253\271\271!!\256\256\253\271\271!!\256\256]]\253\271\271!!\256\256\253\271\271!!\256\256]]\253\271\271!!\256\256\253\271\271!!\256\256]]\253\271\271!!\256\256\253\271\271!!\256\256!!]]\253\271\271!!\256\256\253\271\271!!\256\256]]\253\271\271!!\256\256\253\271\271!!\256\256!!]]\253\271\271!!\256\256\253\271\271!!\256\256]]\253\271\271!!\256\256\253\271\271!!\256\256!" + "'", str2, "]]\253\271\271!!\256\256\253\271\271!!\256\256]]\253\271\271!!\256\256\253\271\271!!\256\256!!]]\253\271\271!!\256\256\253\271\271!!\256\256]]\253\271\271!!\256\256\253\271\271!!\256\256!!]]\253\271\271!!\256\256\253\271\271!!\256\256]]\253\271\271!!\256\256\253\271\271!!\256\256]]\253\271\271!!\256\256\253\271\271!!\256\256]]\253\271\271!!\256\256\253\271\271!!\256\256!!]]\253\271\271!!\256\256\253\271\271!!\256\256]]\253\271\271!!\256\256\253\271\271!!\256\256!!]]\253\271\271!!\256\256\253\271\271!!\256\256]]\253\271\271!!\256\256\253\271\271!!\256\256!");
    }

    @Test
    public void test05389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05389");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test05390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05390");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "~\200}}~\200}}~\200}}~\200\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c~\200}}~\200}}~\200}}~\200\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05391");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!", "`nullhffnullhffnullhff`nullhffnullhffnullhff!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj!" + "'", str2, "jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj!");
    }

    @Test
    public void test05392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05392");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```!", "\367!\372\372\367!\372\372!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```!" + "'", str2, "nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```!");
    }

    @Test
    public void test05393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05393");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0!!!", "\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test05394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05394");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!", "UNLLUNLLUNLLUNLLULLLULLLULLLULLLUNLLUNLLUNLLUNLLULLLULLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
    }

    @Test
    public void test05395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05395");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("}nullnullnull~}}^}nullnullnull]]!", "nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}UN``UN``UN``~}}^}UN``UN``UN``]]!" + "'", str2, "}UN``UN``UN``~}}^}UN``UN``UN``]]!");
    }

    @Test
    public void test05396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05396");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "\u0143\u0145\u0145\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0143\u0145\u0145\u0145\u0143\u0145\u0143!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05397");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260!", "\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260!" + "'", str2, "nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260!");
    }

    @Test
    public void test05398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05398");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214!", "!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]\200}}`!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214!" + "'", str2, "nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214!");
    }

    @Test
    public void test05399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05399");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("null\335\340\340null\335\340\340null\335\340\340null\335\340\340null\335\340\340null\335\340\340null\335\340\340null\335\340\340!", "\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108UU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!" + "'", str2, "\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!");
    }

    @Test
    public void test05400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05400");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108!", "]!null!!!null!!!null!!!null!!!null!!]]!null!!!null!!]]!null!!!null!!]]!null!!!null!!]]]!null!!!null!!!null!!!null!!!null!!]]!null!!!null!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05401");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("]!!!]!!!!!]!!!]!!!!!]!!!]!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!", "LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]!!!]!!!!!]!!!]!!!!!]!!!]!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!" + "'", str2, "]!!!]!!!!!]!!!]!!!!!]!!!]!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!");
    }

    @Test
    public void test05402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05402");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "\u0108!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05403");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("HHHHHHHH\200\200HHHHHHHH\200\200HHHHHHHH\200\200HHHHHHHH\200\200HHHHHHHH\200\200HHHHHHHH\200\200HHHHHHHH\200\200HHHHHHHH\200\200!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNNNNNNN\200\200NNNNNNNN\200\200NNNNNNNN\200\200NNNNNNNN\200\200NNNNNNNN\200\200NNNNNNNN\200\200NNNNNNNN\200\200NNNNNNNN\200\200!" + "'", str2, "NNNNNNNN\200\200NNNNNNNN\200\200NNNNNNNN\200\200NNNNNNNN\200\200NNNNNNNN\200\200NNNNNNNN\200\200NNNNNNNN\200\200NNNNNNNN\200\200!");
    }

    @Test
    public void test05404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05404");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106!!!", "N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test05405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05405");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e!", "N\254NNN\254NNN\254NNN\254NN!N\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NN!N\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NN!N\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NN!N\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NN!N\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NN!N\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NN!N\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NN!N\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NN!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "N\254NNN\254NN!!N\254NNN\254NN!!N\254NNN\254NNN\254NNN\254NN!!N\254NNN\254NN!!N\254NNN\254NN!" + "'", str2, "N\254NNN\254NN!!N\254NNN\254NN!!N\254NNN\254NNN\254NNN\254NN!!N\254NNN\254NN!!N\254NNN\254NN!");
    }

    @Test
    public void test05406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05406");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("RRPPRRPPnullP\214\214nullP\214\214RRPPRRPPnullP\214\214nullP\214\214RRPPRRPPnullP\214\214nullP\214\214RRPPRRPPnullP\214\214nullP\214\214RRPPRRPPnullP\214\214nullP\214\214RRPPRRPPnullP\214\214nullP\214\214RRPPRRPPnullP\214\214nullP\214\214RRPPRRPPnullP\214\214nullP\214\214!", "\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214!");
    }

    @Test
    public void test05407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05407");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0406\u0406!", "FFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!" + "'", str2, "nullnull!");
    }

    @Test
    public void test05408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05408");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]\200}}`!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05409");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275\276\u0111\u0112\u0114\u0114\u0111\u0112\u0114\u0114\275\276\u0111\u0112\u0114\u0114\u0111\u0112\u0114\u0114\225\225\275\276\u0111\u0112\u0114\u0114\u0111\u0112\u0114\u0114\275\276\u0111\u0112\u0114\u0114\u0111\u0112\u0114\u0114\225\225\275\276\u0111\u0112\u0114\u0114\u0111\u0112\u0114\u0114\275\276\u0111\u0112\u0114\u0114\u0111\u0112\u0114\u0114\225\225\275\276\u0111\u0112\u0114\u0114\u0111\u0112\u0114\u0114\275\276\u0111\u0112\u0114\u0114\u0111\u0112\u0114\u0114\225\225\275\276\u0111\u0112\u0114\u0114\u0111\u0112\u0114\u0114\275\276\u0111\u0112\u0114\u0114\u0111\u0112\u0114\u0114\225\225\275\276\u0111\u0112\u0114\u0114\u0111\u0112\u0114\u0114\275\276\u0111\u0112\u0114\u0114\u0111\u0112\u0114\u0114\225\225\275\276\u0111\u0112\u0114\u0114\u0111\u0112\u0114\u0114\275\276\u0111\u0112\u0114\u0114\u0111\u0112\u0114\u0114\225\225\275\276\u0111\u0112\u0114\u0114\u0111\u0112\u0114\u0114\275\276\u0111\u0112\u0114\u0114\u0111\u0112\u0114\u0114\225\225!", "\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225!" + "'", str2, "\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225!");
    }

    @Test
    public void test05410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05410");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!", "ppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnn!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05411");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd!", "````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull!" + "'", str2, "~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05412");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!", "lLLLLnullLLLnullLL!!!!lLLLLnullLLLnullLL!!!!!!lLLLLnullLLLnullLL!!!!lLLLLnullLLLnullLL!!!!!!lLLLLnullLLLnullLL!!!!lLLLLnullLLLnullLL!!!!!!lLLLLnullLLLnullLL!!!!lLLLLnullLLLnullLL!!!!!!lLLLLnullLLLnullLL!!!!lLLLLnullLLLnullLL!!!!!!lLLLLnullLLLnullLL!!!!lLLLLnullLLLnullLL!!!!!!lLLLLnullLLLnullLL!!!!lLLLLnullLLLnullLL!!!!!!lLLLLnullLLLnullLL!!!!lLLLLnullLLLnullLL!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!" + "'", str2, "]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!");
    }

    @Test
    public void test05413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05413");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!~~!!~~!!!!~~!!~~!!!!~~!!~~!!~~!!~~!!!!~~!!~~!!!!~~!!~~!", "\335\336\340\340\220\335\336\340\340\335\336\340\340\200}}`\335\336\340\340\220\335\336\340\340\335\336\340\340]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!~~!!~~!!!!~~!!~~!!!!~~!!~~!!~~!!~~!!!!~~!!~~!!!!~~!!~~!" + "'", str2, "!!~~!!~~!!!!~~!!~~!!!!~~!!~~!!~~!!~~!!!!~~!!~~!!!!~~!!~~!");
    }

    @Test
    public void test05414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05414");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0348\u0348\u01e0\u01e0\u01e0\u0348\u0348\u01e0\u01e0\u01e0\u0348\u0348\u01e0\u01e0\u01e0\u0348\u0348\u01e0\u01e0\u01e0\200\u0348\u0348\u01e0\u01e0\u01e0\u0348\u0348\u01e0\u01e0\u01e0\u0348\u0348\u01e0\u01e0\u01e0\u0348\u0348\u01e0\u01e0\u01e0]]!", "\253\254\256\256nullnullnullnull\253\254\256\256nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~nullnullnull\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~nullnullnull]]!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~nullnullnull\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~nullnullnull]]!");
    }

    @Test
    public void test05415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05415");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("unllNULL!", "^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05416");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0346\u0348\u0348\u0348}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200\u0348\u0346\u0346!", "UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200\u0348\u0346\u0346!");
    }

    @Test
    public void test05417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05417");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0176\u0175\u0178\u0178\u0176\u0175\u0178\u0178\u0176\u0175\u0178\u0178\u0176\u0175\u0178\u0178!!!", "``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ!!``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ!!``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ!!``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ!!``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``JJ``JJ!!``JJ``JJ!!!" + "'", str2, "``JJ``JJ!!``JJ``JJ!!!");
    }

    @Test
    public void test05418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05418");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LL``LL``LL``LL``LL``LL``LL``LL``!!LL``LL``LL``LL``LL``LL``LL``LL``!!LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``!!LL``LL``LL``LL``LL``LL``LL``LL``!!LL``LL``LL``LL``LL``LL``LL``LL``!", "]\256!\254\254\256!\254\254\256!\254\254\256!\254\254\256!\254\254]]\256!\254\254\256!\254\254]]\256!\254\254\256!\254\254]]\256!\254\254\256!\254\254]]]\256!\254\254\256!\254\254\256!\254\254\256!\254\254\256!\254\254]]\256!\254\254\256!\254\254]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``!!nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``!!nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``!!nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``!!nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``!" + "'", str2, "nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``!!nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``!!nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``!!nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``!!nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``!");
    }

    @Test
    public void test05419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05419");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\276\276nullnullnullnull\276\227\227nullnullnullnull\276\227\227\276\276nullnullnullnull\276\227\227nullnullnullnull\276\227\227\276\276nullnullnullnull\276\227\227nullnullnullnull\276\227\227\276\276nullnullnullnull\276\227\227nullnullnullnull\276\227\227\276\276nullnullnullnull\276\227\227nullnullnullnull\276\227\227\276\276nullnullnullnull\276\227\227nullnullnullnull\276\227\227\276\276nullnullnullnull\276\227\227nullnullnullnull\276\227\227\276\276nullnullnullnull\276\227\227nullnullnullnull\276\227\227!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\227\227\276\276\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\227\227\276\276\u0346\u0348\u0348!");
    }

    @Test
    public void test05420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05420");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!\200\200\u0346\u0348\u0348!", "!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN\200}}`!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!!!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!!!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test05421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05421");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05422");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\213\216\214\214\213\216\214\214\213\216\214\214\213\216\214\214\213\216\214\214\213\216\214\214\213\216\214\214\213\216\214\214!", "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\213\216\214\214\213\216\214\214\213\216\214\214\213\216\214\214\213\216\214\214\213\216\214\214\213\216\214\214\213\216\214\214!" + "'", str2, "\213\216\214\214\213\216\214\214\213\216\214\214\213\216\214\214\213\216\214\214\213\216\214\214\213\216\214\214\213\216\214\214!");
    }

    @Test
    public void test05423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05423");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e!!!", "\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~null\300\300\300\300nullnullnull\300\300\300\300nullnull!~null\300\300\300\300nullnullnull\300\300\300\300nullnull!~null\300\300\300\300nullnullnull\300\300\300\300nullnull!~null\300\300\300\300nullnullnull\300\300\300\300nullnull!~null\300\300\300\300nullnullnull\300\300\300\300nullnull!~null\300\300\300\300nullnullnull\300\300\300\300nullnull!~null\300\300\300\300nullnullnull\300\300\300\300nullnull!~null\300\300\300\300nullnullnull\300\300\300\300nullnull!!!~null\300\300\300\300nullnullnull\300\300\300\300nullnull!~null\300\300\300\300nullnullnull\300\300\300\300nullnull!~null\300\300\300\300nullnullnull\300\300\300\300nullnull!~null\300\300\300\300nullnullnull\300\300\300\300nullnull!~null\300\300\300\300nullnullnull\300\300\300\300nullnull!~null\300\300\300\300nullnullnull\300\300\300\300nullnull!~null\300\300\300\300nullnullnull\300\300\300\300nullnull!~null\300\300\300\300nullnullnull\300\300\300\300nullnull!!!" + "'", str2, "!~null\300\300\300\300nullnullnull\300\300\300\300nullnull!~null\300\300\300\300nullnullnull\300\300\300\300nullnull!~null\300\300\300\300nullnullnull\300\300\300\300nullnull!~null\300\300\300\300nullnullnull\300\300\300\300nullnull!~null\300\300\300\300nullnullnull\300\300\300\300nullnull!~null\300\300\300\300nullnullnull\300\300\300\300nullnull!~null\300\300\300\300nullnullnull\300\300\300\300nullnull!~null\300\300\300\300nullnullnull\300\300\300\300nullnull!!!~null\300\300\300\300nullnullnull\300\300\300\300nullnull!~null\300\300\300\300nullnullnull\300\300\300\300nullnull!~null\300\300\300\300nullnullnull\300\300\300\300nullnull!~null\300\300\300\300nullnullnull\300\300\300\300nullnull!~null\300\300\300\300nullnullnull\300\300\300\300nullnull!~null\300\300\300\300nullnullnull\300\300\300\300nullnull!~null\300\300\300\300nullnullnull\300\300\300\300nullnull!~null\300\300\300\300nullnullnull\300\300\300\300nullnull!!!");
    }

    @Test
    public void test05424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05424");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\253\254\256\256!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!", "\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!" + "'", str2, "\253\254\256\256!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!");
    }

    @Test
    public void test05425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05425");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255!", "\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255!" + "'", str2, "\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255!");
    }

    @Test
    public void test05426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05426");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!", "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!" + "'", str2, "!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test05427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05427");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!", "H!\275\275H!\275\275HHH!\275\275H!\275\275HHH!\275\275H!\275\275HHH!\275\275H!\275\275HHH!\275\275H!\275\275HHH!\275\275H!\275\275HHH!\275\275H!\275\275HHH!\275\275H!\275\275HH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!" + "'", str2, "HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!");
    }

    @Test
    public void test05428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05428");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!!", "nullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!!" + "'", str2, "L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!!");
    }

    @Test
    public void test05429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05429");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!", "\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276nullnullnullnull\266\266~nullnullnullnullnullnullnullnull\276nullnullnullnull\266\266~nullnullnullnullnullnullnullnull!!\276nullnullnullnull\266\266~nullnullnullnullnullnullnullnull\276nullnullnullnull\266\266~nullnullnullnullnullnullnullnull!!\276nullnullnullnull\266\266~nullnullnullnullnullnullnullnull\276nullnullnullnull\266\266~nullnullnullnullnullnullnullnull\276nullnullnullnull\266\266~nullnullnullnullnullnullnullnull\276nullnullnullnull\266\266~nullnullnullnullnullnullnullnull!!\276nullnullnullnull\266\266~nullnullnullnullnullnullnullnull\276nullnullnullnull\266\266~nullnullnullnullnullnullnullnull!!\276nullnullnullnull\266\266~nullnullnullnullnullnullnullnull\276nullnullnullnull\266\266~nullnullnullnullnullnullnullnull!" + "'", str2, "\276nullnullnullnull\266\266~nullnullnullnullnullnullnullnull\276nullnullnullnull\266\266~nullnullnullnullnullnullnullnull!!\276nullnullnullnull\266\266~nullnullnullnullnullnullnullnull\276nullnullnullnull\266\266~nullnullnullnullnullnullnullnull!!\276nullnullnullnull\266\266~nullnullnullnullnullnullnullnull\276nullnullnullnull\266\266~nullnullnullnullnullnullnullnull\276nullnullnullnull\266\266~nullnullnullnullnullnullnullnull\276nullnullnullnull\266\266~nullnullnullnullnullnullnullnull!!\276nullnullnullnull\266\266~nullnullnullnullnullnullnullnull\276nullnullnullnull\266\266~nullnullnullnullnullnullnullnull!!\276nullnullnullnull\266\266~nullnullnullnullnullnullnullnull\276nullnullnullnull\266\266~nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05430");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNN!", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test05431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05431");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~NNN\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~NNN]]!", "\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~nullnullnull\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~nullnullnull]]!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~nullnullnull\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~nullnullnull]]!");
    }

    @Test
    public void test05432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05432");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("fehhfehhnullnullfehhfehhnullnull!", "~~!!null~~~null~~~null~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!null~~~null~~~null~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~!!!~!!!~!!!~!!!~!!!~!!!~!!!~!!!!" + "'", str2, "~!!!~!!!~!!!~!!!~!!!~!!!~!!!~!!!!");
    }

    @Test
    public void test05433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05433");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\200E\220\220\200E\220\220\200E\220\220\200E\220\220\200E\220\220\200E\220\220\200E\220\220\200E\220\220!", "!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220!" + "'", str2, "\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220!");
    }

    @Test
    public void test05434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05434");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!", "\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250!!\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250!!\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250!!\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250!!\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!" + "'", str2, "!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!");
    }

    @Test
    public void test05435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05435");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("~}\200\200~}\200\200rrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnullrrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnull~}\200\200~}\200\200rrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnullrrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnull~}\200\200~}\200\200rrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnullrrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnull~}\200\200~}\200\200rrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnullrrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnull~}\200\200~}\200\200rrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnullrrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnull~}\200\200~}\200\200rrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnullrrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnull~}\200\200~}\200\200rrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnullrrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnull~}\200\200~}\200\200rrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnullrrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnull!", "UU!!UU!!!UUU!UUUUU!!UU!!!UUU!UUUUU!!UU!!!UUU!UUUUU!!UU!!!UUU!UUUUU!!UU!!!UUU!UUUUU!!UU!!!UUU!UUUUU!!UU!!!UUU!UUUUU!!UU!!!UUU!UUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU~}\200\200~}\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU~}\200\200~}\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU~}\200\200~}\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU~}\200\200~}\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU~}\200\200~}\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU~}\200\200~}\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU~}\200\200~}\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!" + "'", str2, "~}\200\200~}\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU~}\200\200~}\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU~}\200\200~}\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU~}\200\200~}\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU~}\200\200~}\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU~}\200\200~}\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU~}\200\200~}\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU~}\200\200~}\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
    }

    @Test
    public void test05436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05436");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```!" + "'", str2, "nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```!");
    }

    @Test
    public void test05437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05437");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("~~!!null~~~null~~~null~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!null~~~null~~~null~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!", "\u03aa\u03aa\u03aa\u038a\u038a\u038a!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~~!!nullnullnullnull~~~nullnullnullnull~~~nullnullnullnull~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!nullnullnullnull~~~nullnullnullnull~~~nullnullnullnull~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!" + "'", str2, "~~!!nullnullnullnull~~~nullnullnullnull~~~nullnullnullnull~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!nullnullnullnull~~~nullnullnullnull~~~nullnullnullnull~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!");
    }

    @Test
    public void test05438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05438");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!!", "\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!!\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!!\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!!\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!!\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!!" + "'", str2, "nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!!");
    }

    @Test
    public void test05439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05439");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!" + "'", str2, "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!");
    }

    @Test
    public void test05440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05440");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320!", "!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320!" + "'", str2, "\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320!");
    }

    @Test
    public void test05441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05441");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246!!!", "UNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!" + "'", str2, "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!");
    }

    @Test
    public void test05442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05442");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!", "\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!ll!!ll!!ll!!ll!!ll!!ll!!ll!!ll!" + "'", str2, "!!ll!!ll!!ll!!ll!!ll!!ll!!ll!!ll!");
    }

    @Test
    public void test05443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05443");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\275LLL\276L\275\275!", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullnull\276null\275\275!" + "'", str2, "\275nullnullnull\276null\275\275!");
    }

    @Test
    public void test05444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05444");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("n\273\273\273\273LLNN\270\270\273LLNN\270\270!!!!n\273\273\273\273LLNN\270\270\273LLNN\270\270!!!!!!n\273\273\273\273LLNN\270\270\273LLNN\270\270!!!!n\273\273\273\273LLNN\270\270\273LLNN\270\270!!!!!!n\273\273\273\273LLNN\270\270\273LLNN\270\270!!!!n\273\273\273\273LLNN\270\270\273LLNN\270\270!!!!!!n\273\273\273\273LLNN\270\270\273LLNN\270\270!!!!n\273\273\273\273LLNN\270\270\273LLNN\270\270!!!!!!n\273\273\273\273LLNN\270\270\273LLNN\270\270!!!!n\273\273\273\273LLNN\270\270\273LLNN\270\270!!!!!!n\273\273\273\273LLNN\270\270\273LLNN\270\270!!!!n\273\273\273\273LLNN\270\270\273LLNN\270\270!!!!!!n\273\273\273\273LLNN\270\270\273LLNN\270\270!!!!n\273\273\273\273LLNN\270\270\273LLNN\270\270!!!!!!n\273\273\273\273LLNN\270\270\273LLNN\270\270!!!!n\273\273\273\273LLNN\270\270\273LLNN\270\270!!!!!!!", "\275LLLLLLLLLLL!!!!\275LLLLLLLLLLL!!!!!!\275LLLLLLLLLLL!!!!\275LLLLLLLLLLL!!!!!!\275LLLLLLLLLLL!!!!\275LLLLLLLLLLL!!!!!!\275LLLLLLLLLLL!!!!\275LLLLLLLLLLL!!!!!!\275LLLLLLLLLLL!!!!\275LLLLLLLLLLL!!!!!!\275LLLLLLLLLLL!!!!\275LLLLLLLLLLL!!!!!!\275LLLLLLLLLLL!!!!\275LLLLLLLLLLL!!!!!!\275LLLLLLLLLLL!!!!\275LLLLLLLLLLL!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L\273\273\273\273LL!!\270\270\273LL!!\270\270!!!!L\273\273\273\273LL!!\270\270\273LL!!\270\270!!!!!!L\273\273\273\273LL!!\270\270\273LL!!\270\270!!!!L\273\273\273\273LL!!\270\270\273LL!!\270\270!!!!!!L\273\273\273\273LL!!\270\270\273LL!!\270\270!!!!L\273\273\273\273LL!!\270\270\273LL!!\270\270!!!!!!L\273\273\273\273LL!!\270\270\273LL!!\270\270!!!!L\273\273\273\273LL!!\270\270\273LL!!\270\270!!!!!!L\273\273\273\273LL!!\270\270\273LL!!\270\270!!!!L\273\273\273\273LL!!\270\270\273LL!!\270\270!!!!!!L\273\273\273\273LL!!\270\270\273LL!!\270\270!!!!L\273\273\273\273LL!!\270\270\273LL!!\270\270!!!!!!L\273\273\273\273LL!!\270\270\273LL!!\270\270!!!!L\273\273\273\273LL!!\270\270\273LL!!\270\270!!!!!!L\273\273\273\273LL!!\270\270\273LL!!\270\270!!!!L\273\273\273\273LL!!\270\270\273LL!!\270\270!!!!!!!" + "'", str2, "L\273\273\273\273LL!!\270\270\273LL!!\270\270!!!!L\273\273\273\273LL!!\270\270\273LL!!\270\270!!!!!!L\273\273\273\273LL!!\270\270\273LL!!\270\270!!!!L\273\273\273\273LL!!\270\270\273LL!!\270\270!!!!!!L\273\273\273\273LL!!\270\270\273LL!!\270\270!!!!L\273\273\273\273LL!!\270\270\273LL!!\270\270!!!!!!L\273\273\273\273LL!!\270\270\273LL!!\270\270!!!!L\273\273\273\273LL!!\270\270\273LL!!\270\270!!!!!!L\273\273\273\273LL!!\270\270\273LL!!\270\270!!!!L\273\273\273\273LL!!\270\270\273LL!!\270\270!!!!!!L\273\273\273\273LL!!\270\270\273LL!!\270\270!!!!L\273\273\273\273LL!!\270\270\273LL!!\270\270!!!!!!L\273\273\273\273LL!!\270\270\273LL!!\270\270!!!!L\273\273\273\273LL!!\270\270\273LL!!\270\270!!!!!!L\273\273\273\273LL!!\270\270\273LL!!\270\270!!!!L\273\273\273\273LL!!\270\270\273LL!!\270\270!!!!!!!");
    }

    @Test
    public void test05445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05445");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnull\300\300~nullnull\300\300nullnull\300\300nullnull\300\300~nullnull\300\300nullnull\300\300!!nullnull\300\300~nullnull\300\300nullnull\300\300nullnull\300\300~nullnull\300\300nullnull\300\300!!nullnull\300\300~nullnull\300\300nullnull\300\300nullnull\300\300~nullnull\300\300nullnull\300\300nullnull\300\300~nullnull\300\300nullnull\300\300nullnull\300\300~nullnull\300\300nullnull\300\300!!nullnull\300\300~nullnull\300\300nullnull\300\300nullnull\300\300~nullnull\300\300nullnull\300\300!!nullnull\300\300~nullnull\300\300nullnull\300\300nullnull\300\300~nullnull\300\300nullnull\300\300!", "\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!U!!!U!!UU~!U!!!U!!UU!U!!!U!!UU!U!!!U!!UU~!U!!!U!!UU!U!!!U!!UU!!!U!!!U!!UU~!U!!!U!!UU!U!!!U!!UU!U!!!U!!UU~!U!!!U!!UU!U!!!U!!UU!!!U!!!U!!UU~!U!!!U!!UU!U!!!U!!UU!U!!!U!!UU~!U!!!U!!UU!U!!!U!!UU!U!!!U!!UU~!U!!!U!!UU!U!!!U!!UU!U!!!U!!UU~!U!!!U!!UU!U!!!U!!UU!!!U!!!U!!UU~!U!!!U!!UU!U!!!U!!UU!U!!!U!!UU~!U!!!U!!UU!U!!!U!!UU!!!U!!!U!!UU~!U!!!U!!UU!U!!!U!!UU!U!!!U!!UU~!U!!!U!!UU!U!!!U!!UU!" + "'", str2, "!U!!!U!!UU~!U!!!U!!UU!U!!!U!!UU!U!!!U!!UU~!U!!!U!!UU!U!!!U!!UU!!!U!!!U!!UU~!U!!!U!!UU!U!!!U!!UU!U!!!U!!UU~!U!!!U!!UU!U!!!U!!UU!!!U!!!U!!UU~!U!!!U!!UU!U!!!U!!UU!U!!!U!!UU~!U!!!U!!UU!U!!!U!!UU!U!!!U!!UU~!U!!!U!!UU!U!!!U!!UU!U!!!U!!UU~!U!!!U!!UU!U!!!U!!UU!!!U!!!U!!UU~!U!!!U!!UU!U!!!U!!UU!U!!!U!!UU~!U!!!U!!UU!U!!!U!!UU!!!U!!!U!!UU~!U!!!U!!UU!U!!!U!!UU!U!!!U!!UU~!U!!!U!!UU!U!!!U!!UU!");
    }

    @Test
    public void test05446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05446");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!\200\200\u0346\u0348\u0348!", "\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368ULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLL!!ULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLL!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368ULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLL!!ULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLL!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test05447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05447");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017enullnullnullnull!", "\u0366\u0365\u0368\u0368N!!!N!!!\200\200\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullinullnullnullinullnullnullnullnullinullnullnullinullnullnullinullnullnullinullnullnullnullnullinullnullnullinullnullnullnullnullinullnullnullinullnullnullinullnullnullinullnullnull!" + "'", str2, "nullnullinullnullnullinullnullnullnullnullinullnullnullinullnullnullinullnullnullinullnullnullnullnullinullnullnullinullnullnullnullnullinullnullnullinullnullnullinullnullnullinullnullnull!");
    }

    @Test
    public void test05448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05448");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("}N\200\200}N\200\200}N\200\200}N\200\200ULLLULLLULLLULLL}N\200\200}N\200\200}N\200\200}N\200\200ULLLULLL!", "hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleenullhnulleenullnullnullhnulleenullnullhnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleenullhnulleenullnullnullhnulleenullnullhnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleenullhnulleenullnullnullhnulleenullnullhnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleenullhnulleenullnullnullhnulleenullnullhnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleenullhnulleenullnullnullhnulleenullnullhnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleenullhnulleenullnullnullhnulleenullnullhnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleenullhnulleenullnullnullhnulleenullnullhnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleenullhnulleenullnullnullhnulleenullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u032d\200\200\u032d\200\200\u032d\200\200\u032d\200\200\u032e\u0330\u0330\u0330\u032e\u0330\u0330\u0330\u032e\u0330\u0330\u0330\u032e\u0330\u0330\u0330\u032d\200\200\u032d\200\200\u032d\200\200\u032d\200\200\u032e\u0330\u0330\u0330\u032e\u0330\u0330\u0330!" + "'", str2, "\u032d\200\200\u032d\200\200\u032d\200\200\u032d\200\200\u032e\u0330\u0330\u0330\u032e\u0330\u0330\u0330\u032e\u0330\u0330\u0330\u032e\u0330\u0330\u0330\u032d\200\200\u032d\200\200\u032d\200\200\u032d\200\200\u032e\u0330\u0330\u0330\u032e\u0330\u0330\u0330!");
    }

    @Test
    public void test05449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05449");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!", "ijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijll\200}}`ijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijll]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JILL\220JILLJILL\200~~JILL\220JILLJILL\200~~JILL\220JILLJILLJILL\220JILLJILLJILL\220JILLJILL\200~~JILL\220JILLJILL\200~~JILL\220JILLJILLJILL\220JILLJILL!!JILL\220JILLJILL\200~~JILL\220JILLJILL\200~~JILL\220JILLJILLJILL\220JILLJILLJILL\220JILLJILL\200~~JILL\220JILLJILL\200~~JILL\220JILLJILLJILL\220JILLJILL!!JILL\220JILLJILL\200~~JILL\220JILLJILL\200~~JILL\220JILLJILLJILL\220JILLJILLJILL\220JILLJILL\200~~JILL\220JILLJILL\200~~JILL\220JILLJILLJILL\220JILLJILLJILL\220JILLJILL\200~~JILL\220JILLJILL\200~~JILL\220JILLJILLJILL\220JILLJILLJILL\220JILLJILL\200~~JILL\220JILLJILL\200~~JILL\220JILLJILLJILL\220JILLJILL!!JILL\220JILLJILL\200~~JILL\220JILLJILL\200~~JILL\220JILLJILLJILL\220JILLJILLJILL\220JILLJILL\200~~JILL\220JILLJILL\200~~JILL\220JILLJILLJILL\220JILLJILL!!JILL\220JILLJILL\200~~JILL\220JILLJILL\200~~JILL\220JILLJILLJILL\220JILLJILLJILL\220JILLJILL\200~~JILL\220JILLJILL\200~~JILL\220JILLJILLJILL\220JILLJILL!" + "'", str2, "JILL\220JILLJILL\200~~JILL\220JILLJILL\200~~JILL\220JILLJILLJILL\220JILLJILLJILL\220JILLJILL\200~~JILL\220JILLJILL\200~~JILL\220JILLJILLJILL\220JILLJILL!!JILL\220JILLJILL\200~~JILL\220JILLJILL\200~~JILL\220JILLJILLJILL\220JILLJILLJILL\220JILLJILL\200~~JILL\220JILLJILL\200~~JILL\220JILLJILLJILL\220JILLJILL!!JILL\220JILLJILL\200~~JILL\220JILLJILL\200~~JILL\220JILLJILLJILL\220JILLJILLJILL\220JILLJILL\200~~JILL\220JILLJILL\200~~JILL\220JILLJILLJILL\220JILLJILLJILL\220JILLJILL\200~~JILL\220JILLJILL\200~~JILL\220JILLJILLJILL\220JILLJILLJILL\220JILLJILL\200~~JILL\220JILLJILL\200~~JILL\220JILLJILLJILL\220JILLJILL!!JILL\220JILLJILL\200~~JILL\220JILLJILL\200~~JILL\220JILLJILLJILL\220JILLJILLJILL\220JILLJILL\200~~JILL\220JILLJILL\200~~JILL\220JILLJILLJILL\220JILLJILL!!JILL\220JILLJILL\200~~JILL\220JILLJILL\200~~JILL\220JILLJILLJILL\220JILLJILLJILL\220JILLJILL\200~~JILL\220JILLJILL\200~~JILL\220JILLJILLJILL\220JILLJILL!");
    }

    @Test
    public void test05450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05450");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u0346\u0348\u0348!", "\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test05451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05451");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!!", "unllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UULL!UULLUULLUULL!UULLUULLUULL!UULLUULLUULL!UULLUULLUULL!UULLUULLUULL!UULLUULLUULL!UULLUULLUULL!UULLUULL!!UULL!UULLUULLUULL!UULLUULLUULL!UULLUULLUULL!UULLUULLUULL!UULLUULLUULL!UULLUULLUULL!UULLUULLUULL!UULLUULL!!!" + "'", str2, "UULL!UULLUULLUULL!UULLUULLUULL!UULLUULLUULL!UULLUULLUULL!UULLUULLUULL!UULLUULLUULL!UULLUULLUULL!UULLUULL!!UULL!UULLUULLUULL!UULLUULLUULL!UULLUULLUULL!UULLUULLUULL!UULLUULLUULL!UULLUULLUULL!UULLUULLUULL!UULLUULL!!!");
    }

    @Test
    public void test05452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05452");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("NUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUU!", "null~ssnull~ss!!null~ssnull~ss!!null~ssnull~ssnull~ssnull~ss!!null~ssnull~ss!!null~ssnull~ss!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227!" + "'", str2, "\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227!");
    }

    @Test
    public void test05453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05453");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("FH!!FH!!FH!!FH!!FH!!FH!!FH!!FH!!!", "~null~~\225\230\230~null~~\225\230\230~null~~\225\230\230~null~~\225\230\230\200}}`~null~~\225\230\230~null~~\225\230\230~null~~\225\230\230~null~~\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test05454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05454");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\250\250\246\246\250\250\246\246!", "\275\300\276\276\275\300\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\250\250\246\246\250\250\246\246!" + "'", str2, "\250\250\246\246\250\250\246\246!");
    }

    @Test
    public void test05455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05455");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300!!\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300!!\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300!!\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300!!\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300!", "]U!!]U!!!!]U!!]U!!!!]U!!]U!!]U!!]U!!!!]U!!]U!!!!]U!!]U!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05456");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!", "nullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunll!!nullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunll!!nullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunll!!nullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunll!!nullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!NNLLNNLLNNLLNNLL!!!NNLLNNLLNNLLNNLL!!!!!NNLLNNLLNNLLNNLL!!!NNLLNNLLNNLLNNLL!!!!!NNLLNNLLNNLLNNLL!!!NNLLNNLLNNLLNNLL!!!!!NNLLNNLLNNLLNNLL!!!NNLLNNLLNNLLNNLL!!!!!NNLLNNLLNNLLNNLL!!!NNLLNNLLNNLLNNLL!!!!!NNLLNNLLNNLLNNLL!!!NNLLNNLLNNLLNNLL!!!!!NNLLNNLLNNLLNNLL!!!NNLLNNLLNNLLNNLL!!!!!NNLLNNLLNNLLNNLL!!!NNLLNNLLNNLLNNLL!!!!!" + "'", str2, "!NNLLNNLLNNLLNNLL!!!NNLLNNLLNNLLNNLL!!!!!NNLLNNLLNNLLNNLL!!!NNLLNNLLNNLLNNLL!!!!!NNLLNNLLNNLLNNLL!!!NNLLNNLLNNLLNNLL!!!!!NNLLNNLLNNLLNNLL!!!NNLLNNLLNNLLNNLL!!!!!NNLLNNLLNNLLNNLL!!!NNLLNNLLNNLLNNLL!!!!!NNLLNNLLNNLLNNLL!!!NNLLNNLLNNLLNNLL!!!!!NNLLNNLLNNLLNNLL!!!NNLLNNLLNNLLNNLL!!!!!NNLLNNLLNNLLNNLL!!!NNLLNNLLNNLLNNLL!!!!!");
    }

    @Test
    public void test05457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05457");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275\335\336\340\340\335\336\340\340\335\336\340\340\276\335\336\340\340\275\275!", "LL!!LL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullnullnullnullnullnullnullnullnullnullnull\276nullnullnullnull\275\275!" + "'", str2, "\275nullnullnullnullnullnullnullnullnullnullnullnull\276nullnullnullnull\275\275!");
    }

    @Test
    public void test05458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05458");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368nullnull!!nullnull!!\200\200\u0346\u0348\u0348!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test05459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05459");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275\276L\225\225\276L\225\225\200\200\276L\225\225\276L\225\225\200\200\276L\225\225\276L\225\225\200\200\276\276L\225\225\276L\225\225\200\200\275\275!", "NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276!\225\225\276!\225\225\200\200\276!\225\225\276!\225\225\200\200\276!\225\225\276!\225\225\200\200\276\276!\225\225\276!\225\225\200\200\275\275!" + "'", str2, "\275\276!\225\225\276!\225\225\200\200\276!\225\225\276!\225\225\200\200\276!\225\225\276!\225\225\200\200\276\276!\225\225\276!\225\225\200\200\275\275!");
    }

    @Test
    public void test05460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05460");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```!", "ULLL\200}}`ULLL]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```!" + "'", str2, "nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```!");
    }

    @Test
    public void test05461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05461");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnull!!nullnullnull\256\254\254nullnull!!nullnullnull\256\254\254!!nullnull!!nullnullnull\256\254\254nullnull!!nullnullnull\256\254\254!!nullnull!!nullnullnull\256\254\254nullnull!!nullnullnull\256\254\254!!nullnull!!nullnullnull\256\254\254nullnull!!nullnullnull\256\254\254!!nullnull!!nullnullnull\256\254\254nullnull!!nullnullnull\256\254\254!!nullnull!!nullnullnull\256\254\254nullnull!!nullnullnull\256\254\254!!nullnull!!nullnullnull\256\254\254nullnull!!nullnullnull\256\254\254!!nullnull!!nullnullnull\256\254\254nullnull!!nullnullnull\256\254\254!!!", "nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!");
    }

    @Test
    public void test05462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05462");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("TQTTTQTT!!TQTTTQTT!!TQTTTQTT!!TQTTTQTT!!TQTTTQTT!!TQTTTQTT!!TQTTTQTT!!TQTTTQTT!!!", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test05463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05463");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("NN!!NN!!!!NN!!NN!!!!NN!!NN!!!!NN!!NN!!!!NN!!NN!!!!NN!!NN!!!!NN!!NN!!!!NN!!NN!!!!!", "\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!" + "'", str2, "LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!");
    }

    @Test
    public void test05464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05464");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214!", "!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214!" + "'", str2, "\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214!");
    }

    @Test
    public void test05465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05465");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368XXXXXXXX!", "\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!!!!!!!!!" + "'", str2, "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!!!!!!!!!");
    }

    @Test
    public void test05466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05466");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05467");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016enullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05468");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("~}\200\200~}\200\200L!UU!L!UUL!UUL!UU!L!UUL!UU!LUU!LUUL!UU!L!UUL!UUL!UU!L!UUL!UU!LUU!LUU~}\200\200~}\200\200L!UU!L!UUL!UUL!UU!L!UUL!UU!LUU!LUUL!UU!L!UUL!UUL!UU!L!UUL!UU!LUU!LUU~}\200\200~}\200\200L!UU!L!UUL!UUL!UU!L!UUL!UU!LUU!LUUL!UU!L!UUL!UUL!UU!L!UUL!UU!LUU!LUU~}\200\200~}\200\200L!UU!L!UUL!UUL!UU!L!UUL!UU!LUU!LUUL!UU!L!UUL!UUL!UU!L!UUL!UU!LUU!LUU~}\200\200~}\200\200L!UU!L!UUL!UUL!UU!L!UUL!UU!LUU!LUUL!UU!L!UUL!UUL!UU!L!UUL!UU!LUU!LUU~}\200\200~}\200\200L!UU!L!UUL!UUL!UU!L!UUL!UU!LUU!LUUL!UU!L!UUL!UUL!UU!L!UUL!UU!LUU!LUU~}\200\200~}\200\200L!UU!L!UUL!UUL!UU!L!UUL!UU!LUU!LUUL!UU!L!UUL!UUL!UU!L!UUL!UU!LUU!LUU~}\200\200~}\200\200L!UU!L!UUL!UUL!UU!L!UUL!UU!LUU!LUUL!UU!L!UUL!UUL!UU!L!UUL!UU!LUU!LUU!", "\u0348null!!\200\u0348null!!]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!!~}\200\200~}\200\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!!~}\200\200~}\200\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!!~}\200\200~}\200\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!!~}\200\200~}\200\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!!~}\200\200~}\200\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!!~}\200\200~}\200\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!!~}\200\200~}\200\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!!!" + "'", str2, "~}\200\200~}\200\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!!~}\200\200~}\200\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!!~}\200\200~}\200\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!!~}\200\200~}\200\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!!~}\200\200~}\200\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!!~}\200\200~}\200\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!!~}\200\200~}\200\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!!~}\200\200~}\200\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!!!");
    }

    @Test
    public void test05469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05469");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("TTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRR!", "fehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05470");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!!", "\335\336\340\340\220\335\336\340\340\335\336\340\340\200}}`\335\336\340\340\220\335\336\340\340\335\336\340\340]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test05471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05471");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("}~\200\200}~\200\200U^LLU^LL}~\200\200}~\200\200U^LLU^LL!", "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014enullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200\u014e\u014e\u014e\u014e\u014e\u014e}~\200\200}~\200\200\u014e\u014e\u014e\u014e\u014e\u014e!" + "'", str2, "}~\200\200}~\200\200\u014e\u014e\u014e\u014e\u014e\u014e}~\200\200}~\200\200\u014e\u014e\u014e\u014e\u014e\u014e!");
    }

    @Test
    public void test05472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05472");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!", "h]hhh]hh!!h]hhh]hh!!h]hhh]hhh]hhh]hh!!h]hhh]hh!!h]hhh]hh!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!" + "'", str2, "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!");
    }

    @Test
    public void test05473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05473");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300!", "\u0198\u0198\u0196\u0196\u0198\u0198\u0196\u0196\u0178\u0178\u0176\u0176\u0178\u0178\u0176\u0176\u0198\u0198\u0196\u0196\u0198\u0198\u0196\u0196\u0178\u0178\u0176\u0176\u0178\u0178\u0176\u0176\u0198\u0198\u0196\u0196\u0198\u0198\u0196\u0196\u0178\u0178\u0176\u0176\u0178\u0178\u0176\u0176\u0198\u0198\u0196\u0196\u0198\u0198\u0196\u0196\u0178\u0178\u0176\u0176\u0178\u0178\u0176\u0176\u0198\u0198\u0196\u0196\u0198\u0198\u0196\u0196\u0178\u0178\u0176\u0176\u0178\u0178\u0176\u0176\u0198\u0198\u0196\u0196\u0198\u0198\u0196\u0196\u0178\u0178\u0176\u0176\u0178\u0178\u0176\u0176\u0198\u0198\u0196\u0196\u0198\u0198\u0196\u0196\u0178\u0178\u0176\u0176\u0178\u0178\u0176\u0176\u0198\u0198\u0196\u0196\u0198\u0198\u0196\u0196\u0178\u0178\u0176\u0176\u0178\u0178\u0176\u0176!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176!" + "'", str2, "\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176!");
    }

    @Test
    public void test05474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05474");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!", "~!!!~!!!~!!!~!!!~!!!~!!!~!!!~!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!" + "'", str2, "!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test05475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05475");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!", "!!!!!!!!!!!!!!!!\200}}`!!!!!!!!!!!!!!!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!" + "'", str2, "}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!");
    }

    @Test
    public void test05476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05476");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fa\u02fa\u02fa\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fanullnullnull!", "\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\300\300\300\300\300\300\300\300\300\300\300\300\u02fa\300\300\300\300\300\300\300\300\300\300\300\300\u02fa\300\300\300\300\300\300\300\300\300\300\300\300\u02fa\300\300\300\300\300\300\300\300\300\300\300\300\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\300\300\300\300\300\300\300\300\300\300\300\300\u02fa\300\300\300\300\300\300\300\300\300\300\300\300!" + "'", str2, "\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\300\300\300\300\300\300\300\300\300\300\300\300\u02fa\300\300\300\300\300\300\300\300\300\300\300\300\u02fa\300\300\300\300\300\300\300\300\300\300\300\300\u02fa\300\300\300\300\300\300\300\300\300\300\300\300\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\300\300\300\300\300\300\300\300\300\300\300\300\u02fa\300\300\300\300\300\300\300\300\300\300\300\300!");
    }

    @Test
    public void test05477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05477");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05478");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!", "``!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!" + "'", str2, "null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!");
    }

    @Test
    public void test05479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05479");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\226\225\226\226\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\226\225\226\226\u0348\u0346\u0346!");
    }

    @Test
    public void test05480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05480");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05481");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnullZWXXZWXXZWXXZWXXnullnullnullnullZWXXZWXX!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05482");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("~}\200\200~}\200\200HHFFHHFF~}\200\200~}\200\200HHFFHHFF~}\200\200~}\200\200HHFFHHFF~}\200\200~}\200\200HHFFHHFF~}\200\200~}\200\200HHFFHHFF~}\200\200~}\200\200HHFFHHFF~}\200\200~}\200\200HHFFHHFF~}\200\200~}\200\200HHFFHHFF!", "]!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!]]!nullnullnullnull!!!nullnullnullnull!!]]!nullnullnullnull!!!nullnullnullnull!!]]!nullnullnullnull!!!nullnullnullnull!!]]]!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!]]!nullnullnullnull!!!nullnullnullnull!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull!" + "'", str2, "~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05483");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!nullnullnullnullnull\230\230nullnull\230\230nullnull\230\230nullnull\230\230!nullnullnullnullnull\230\230nullnull\230\230!", "\u0388\u0386\u0386\u0388\u0386\u0386\u0368\u0368\u0388\u0386\u0386\u0388\u0386\u0386\u0368\u0368\u0388\u0386\u0386\u0388\u0386\u0386\u0368\u0368\u0388\u0386\u0386\u0388\u0386\u0386\u0368\u0368\u0388\u0386\u0386\u0388\u0386\u0386\u0368\u0368\u0388\u0386\u0386\u0388\u0386\u0386\u0368\u0368\u0388\u0386\u0386\u0388\u0386\u0386\u0368\u0368\u0388\u0386\u0386\u0388\u0386\u0386\u0368\u0368!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230!" + "'", str2, "!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230!");
    }

    @Test
    public void test05484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05484");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("]AAAAA]]AA]]AA]]AA]]]AAAAA]]AA]]!", "\367!nullnull\367!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]nullnullnullnullnull]]nullnull]]nullnull]]nullnull]]]nullnullnullnullnull]]nullnull]]!" + "'", str2, "]nullnullnullnullnull]]nullnull]]nullnull]]nullnull]]]nullnullnullnullnull]]nullnull]]!");
    }

    @Test
    public void test05485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05485");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("NULLNULLLLNULLNULLLL!!NULLNULLLLNULLNULLLL!!NULLNULLLLNULLNULLLL!!NULLNULLLLNULLNULLLL!!NULLNULLLLNULLNULLLL!!NULLNULLLLNULLNULLLL!!NULLNULLLLNULLNULLLL!!NULLNULLLLNULLNULLLL!!!", "LJ\225\225LJ\225\225LJ\225\225LJ\225\225LJ\225\225LJ\225\225LJ\225\225LJ\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JL\225\225JL\225\225\225\225JL\225\225JL\225\225\225\225!!JL\225\225JL\225\225\225\225JL\225\225JL\225\225\225\225!!JL\225\225JL\225\225\225\225JL\225\225JL\225\225\225\225!!JL\225\225JL\225\225\225\225JL\225\225JL\225\225\225\225!!JL\225\225JL\225\225\225\225JL\225\225JL\225\225\225\225!!JL\225\225JL\225\225\225\225JL\225\225JL\225\225\225\225!!JL\225\225JL\225\225\225\225JL\225\225JL\225\225\225\225!!JL\225\225JL\225\225\225\225JL\225\225JL\225\225\225\225!!!" + "'", str2, "JL\225\225JL\225\225\225\225JL\225\225JL\225\225\225\225!!JL\225\225JL\225\225\225\225JL\225\225JL\225\225\225\225!!JL\225\225JL\225\225\225\225JL\225\225JL\225\225\225\225!!JL\225\225JL\225\225\225\225JL\225\225JL\225\225\225\225!!JL\225\225JL\225\225\225\225JL\225\225JL\225\225\225\225!!JL\225\225JL\225\225\225\225JL\225\225JL\225\225\225\225!!JL\225\225JL\225\225\225\225JL\225\225JL\225\225\225\225!!JL\225\225JL\225\225\225\225JL\225\225JL\225\225\225\225!!!");
    }

    @Test
    public void test05486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05486");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\215}\215\215\215}\215\215\u014b\u014e\u014e\u014e\u014b\u014e\u014e\u014e\u014b\u014e\u014e\u014e\u014b\u014e\u014e\u014e\215}\215\215\215}\215\215!", "\330\273\273\273\273null\270\270\273null\270\270!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215}\215\215\215}\215\215L\270\270\270L\270\270\270L\270\270\270L\270\270\270\215}\215\215\215}\215\215!" + "'", str2, "\215}\215\215\215}\215\215L\270\270\270L\270\270\270L\270\270\270L\270\270\270\215}\215\215\215}\215\215!");
    }

    @Test
    public void test05487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05487");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("]!E!!!E!!!E!!!E!!!E!!]]!E!!!E!!]]!E!!!E!!]]!E!!!E!!]]]!E!!!E!!!E!!!E!!!E!!]]!E!!!E!!]]!", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]!H!!!H!!!H!!!H!!!H!!]]!H!!!H!!]]!H!!!H!!]]!H!!!H!!]]]!H!!!H!!!H!!!H!!!H!!]]!H!!!H!!]]!" + "'", str2, "]!H!!!H!!!H!!!H!!!H!!]]!H!!!H!!]]!H!!!H!!]]!H!!!H!!]]]!H!!!H!!!H!!!H!!!H!!]]!H!!!H!!]]!");
    }

    @Test
    public void test05488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05488");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("``JJ``JJ!!``JJ``JJ!!!", "}~\200\200}~\200\200nullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``nullnull``nullnull!!``nullnull``nullnull!!!" + "'", str2, "``nullnull``nullnull!!``nullnull``nullnull!!!");
    }

    @Test
    public void test05489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05489");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!", "}~\200\200}~\200\200L^NNL^NN}~\200\200}~\200\200L^NNL^NN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!" + "'", str2, "\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!");
    }

    @Test
    public void test05490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05490");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366]]!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366]]!" + "'", str2, "\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366]]!");
    }

    @Test
    public void test05491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05491");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!" + "'", str2, "\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!");
    }

    @Test
    public void test05492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05492");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u019b\u019c\u019e\u019e\u019b\u019c\u019e\u019e\u019b\u019c\u019e\u019e\u019b\u019c\u019e\u019e!", "\352\351\354\354\352\351\354\354!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05493");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU!!``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU!!``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU!!``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU!!``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU!", "null\253\253\253\200}}`null\253\253\253]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM!!``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM!!``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM!!``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM!!``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM!" + "'", str2, "``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM!!``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM!!``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM!!``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM!!``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM!");
    }

    @Test
    public void test05494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05494");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("````````````````````````````````\253\254\256\256\253\254\256\256````````````````````````````````\253\254\256\256\253\254\256\256````````````````````````````````\253\254\256\256\253\254\256\256````````````````````````````````\253\254\256\256\253\254\256\256````````````````````````````````\253\254\256\256\253\254\256\256````````````````````````````````\253\254\256\256\253\254\256\256````````````````````````````````\253\254\256\256\253\254\256\256````````````````````````````````\253\254\256\256\253\254\256\256!", "\276\340\275\275\276\340\275\275nullnullnullnullnullnullnullnull\276\340\275\275\276\340\275\275nullnullnullnullnullnullnullnull\276\340\275\275\276\340\275\275nullnullnullnullnullnullnullnull\276\340\275\275\276\340\275\275nullnullnullnullnullnullnullnull\276\340\275\275\276\340\275\275nullnullnullnullnullnullnullnull\276\340\275\275\276\340\275\275nullnullnullnullnullnullnullnull\276\340\275\275\276\340\275\275nullnullnullnullnullnullnullnull\276\340\275\275\276\340\275\275nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "````````````````````````````````\253\254\256\256\253\254\256\256````````````````````````````````\253\254\256\256\253\254\256\256````````````````````````````````\253\254\256\256\253\254\256\256````````````````````````````````\253\254\256\256\253\254\256\256````````````````````````````````\253\254\256\256\253\254\256\256````````````````````````````````\253\254\256\256\253\254\256\256````````````````````````````````\253\254\256\256\253\254\256\256````````````````````````````````\253\254\256\256\253\254\256\256!" + "'", str2, "````````````````````````````````\253\254\256\256\253\254\256\256````````````````````````````````\253\254\256\256\253\254\256\256````````````````````````````````\253\254\256\256\253\254\256\256````````````````````````````````\253\254\256\256\253\254\256\256````````````````````````````````\253\254\256\256\253\254\256\256````````````````````````````````\253\254\256\256\253\254\256\256````````````````````````````````\253\254\256\256\253\254\256\256````````````````````````````````\253\254\256\256\253\254\256\256!");
    }

    @Test
    public void test05495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05495");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u0346\u0348\u0348!", "\275!!!\275\275!!\275\275!!\275\275!!\275\275!!\275!!!\275\275!!\275\275!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test05496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05496");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c!", "EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05497");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\253\254\256\256~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200\253\254\256\256~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200!", "N~~~N~~~N~~~N~~~N~~~N~~~N~~~N~~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256~}\200\200~n~~~}\200\200~}\200\200~}\200\200~n~~~}\200\200~}\200\200~}\200\200~n~~~}\200\200~}\200\200~}\200\200~n~~~}\200\200~}\200\200~}\200\200~n~~~}\200\200~}\200\200~}\200\200~n~~~}\200\200~}\200\200~}\200\200~n~~~}\200\200~}\200\200~}\200\200~n~~~}\200\200~}\200\200~}\200\200~n~~~}\200\200~}\200\200~}\200\200~n~~~}\200\200~}\200\200~}\200\200~n~~~}\200\200~}\200\200~}\200\200~n~~~}\200\200~}\200\200~}\200\200~n~~~}\200\200~}\200\200~}\200\200~n~~~}\200\200~}\200\200~}\200\200~n~~~}\200\200~}\200\200~}\200\200~n~~~}\200\200~}\200\200\253\254\256\256~}\200\200~n~~~}\200\200~}\200\200~}\200\200~n~~~}\200\200~}\200\200~}\200\200~n~~~}\200\200~}\200\200~}\200\200~n~~~}\200\200~}\200\200~}\200\200~n~~~}\200\200~}\200\200~}\200\200~n~~~}\200\200~}\200\200~}\200\200~n~~~}\200\200~}\200\200~}\200\200~n~~~}\200\200~}\200\200!" + "'", str2, "\253\254\256\256~}\200\200~n~~~}\200\200~}\200\200~}\200\200~n~~~}\200\200~}\200\200~}\200\200~n~~~}\200\200~}\200\200~}\200\200~n~~~}\200\200~}\200\200~}\200\200~n~~~}\200\200~}\200\200~}\200\200~n~~~}\200\200~}\200\200~}\200\200~n~~~}\200\200~}\200\200~}\200\200~n~~~}\200\200~}\200\200~}\200\200~n~~~}\200\200~}\200\200~}\200\200~n~~~}\200\200~}\200\200~}\200\200~n~~~}\200\200~}\200\200~}\200\200~n~~~}\200\200~}\200\200~}\200\200~n~~~}\200\200~}\200\200~}\200\200~n~~~}\200\200~}\200\200~}\200\200~n~~~}\200\200~}\200\200~}\200\200~n~~~}\200\200~}\200\200\253\254\256\256~}\200\200~n~~~}\200\200~}\200\200~}\200\200~n~~~}\200\200~}\200\200~}\200\200~n~~~}\200\200~}\200\200~}\200\200~n~~~}\200\200~}\200\200~}\200\200~n~~~}\200\200~}\200\200~}\200\200~n~~~}\200\200~}\200\200~}\200\200~n~~~}\200\200~}\200\200~}\200\200~n~~~}\200\200~}\200\200!");
    }

    @Test
    public void test05498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05498");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318!", "TQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQ!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318!" + "'", str2, "\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318!");
    }

    @Test
    public void test05499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05499");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u029d\u029d\u02bd\u02bd\u02bd\u02bd\u029d\u029d\u02bd\u02bd\u02bd\u02bd\u029d\u029d\u02bd\u02bd\u02bd\u02bd\u029d\u029d\u02bd\u02bd\u02bd\u02bd\u029d\u029d\u02bd\u02bd\u02bd\u02bd\u029d\u029d\u02bd\u02bd\u02bd\u02bd\u029d\u029d\u02bd\u02bd\u02bd\u02bd\u029d\u029d\u02bd\u02bd\u02bd\u02bd!", "LL!!````````````LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!````````````LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\336\336nullnull\336\336nullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnull\336\336nullnull\336\336nullnull!" + "'", str2, "nullnullnullnull\336\336nullnull\336\336nullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnull\336\336nullnull\336\336nullnull!");
    }

    @Test
    public void test05500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05500");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\335\336\340\340\335\336\340\340\204\204\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\204\204\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\204\204\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\204\204\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\204\204\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\204\204\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\204\204\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\204\204\335\336\340\340\335\336\340\340\335\336\340\340\u0346\u0348\u0348!", "\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u013f\u013f\u013f\u013fUU\204\204\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013fUU\204\204\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013fUU\204\204\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013fUU\204\204\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013fUU\204\204\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013fUU\204\204\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013fUU\204\204\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013fUU\204\204\u013f\u013f\u013f\u013f\u013f\u013f\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u013f\u013f\u013f\u013fUU\204\204\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013fUU\204\204\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013fUU\204\204\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013fUU\204\204\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013fUU\204\204\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013fUU\204\204\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013fUU\204\204\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013fUU\204\204\u013f\u013f\u013f\u013f\u013f\u013f\u0346\u0348\u0348!");
    }
}
