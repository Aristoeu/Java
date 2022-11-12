package ciphers.SimpleSubCipher;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test02501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02501");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HH!", "hh!!hh!!!!hh!!hh!!!!hh!!hh!!!!hh!!hh!!!!hh!!hh!!!!hh!!hh!!!!hh!!hh!!!!hh!!hh!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!" + "'", str2, "!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!");
    }

    @Test
    public void test02502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02502");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!", "\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031anullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348!" + "'", str2, "\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348!");
    }

    @Test
    public void test02503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02503");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("llllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLL!", "unllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!" + "'", str2, "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
    }

    @Test
    public void test02504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02504");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!!!!", "``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!!" + "'", str2, "````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!!");
    }

    @Test
    public void test02505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02505");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02506");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348}~\200\200}~\200\200\u0126\u0128\u0128\u0126\u0128\u0128}~\200\200}~\200\200\u0126\u0128\u0128\u0126\u0128\u0128}~\200\200}~\200\200\u0126\u0128\u0128\u0126\u0128\u0128}~\200\200}~\200\200\u0126\u0128\u0128\u0126\u0128\u0128\u0348\u0346\u0346!", "LL!!!!!LL!!!!!LL!!!!!LL!!!!!LL!!!!!LL!!!!!LL!!!!!LL!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnull\223\223nullnullnullnullnull\223\223nullnullnull}~\200\200}~\200\200nullnull\223\223nullnullnullnullnull\223\223nullnullnull}~\200\200}~\200\200nullnull\223\223nullnullnullnullnull\223\223nullnullnull}~\200\200}~\200\200nullnull\223\223nullnullnullnullnull\223\223\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnull\223\223nullnullnullnullnull\223\223nullnullnull}~\200\200}~\200\200nullnull\223\223nullnullnullnullnull\223\223nullnullnull}~\200\200}~\200\200nullnull\223\223nullnullnullnullnull\223\223nullnullnull}~\200\200}~\200\200nullnull\223\223nullnullnullnullnull\223\223\u0348\u0346\u0346!");
    }

    @Test
    public void test02507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02507");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!!wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!!wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!!wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!!wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!", "\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250!!\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250!!\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250!!\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250!!\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250!" + "'", str2, "\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250!!\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250!!\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250!!\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250!!\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250!");
    }

    @Test
    public void test02508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02508");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!", "``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU!!``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU!!``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU!!``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU!!``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU!" + "'", str2, "``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU!!``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU!!``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU!!``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU!!``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU!");
    }

    @Test
    public void test02509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02509");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]]UU]]UU!!]]UU]]UU!!]]UU]]UU]]UU]]UU!!]]UU]]UU!!]]UU]]UU!", "!u!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull!" + "'", str2, "]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull!");
    }

    @Test
    public void test02510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02510");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullBBnullnullBB!", "!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!NLL!NLL!!!NLL!NLL!!!" + "'", str2, "!NLL!NLL!!!NLL!NLL!!!");
    }

    @Test
    public void test02511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02511");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "~}\200\200~}\200\200NNLLNNLL~}\200\200~}\200\200NNLLNNLL~}\200\200~}\200\200NNLLNNLL~}\200\200~}\200\200NNLLNNLL~}\200\200~}\200\200NNLLNNLL~}\200\200~}\200\200NNLLNNLL~}\200\200~}\200\200NNLLNNLL~}\200\200~}\200\200NNLLNNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02512");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("unllunllunllunllunllunllunllunll!", "nullnullnullnullnullnullnullnullu\253llu\253llnullnullnullnullnullnullnullnullu\253llu\253ll!!nullnullnullnullnullnullnullnullu\253llu\253llnullnullnullnullnullnullnullnullu\253llu\253ll!!nullnullnullnullnullnullnullnullu\253llu\253llnullnullnullnullnullnullnullnullu\253llu\253llnullnullnullnullnullnullnullnullu\253llu\253llnullnullnullnullnullnullnullnullu\253llu\253ll!!nullnullnullnullnullnullnullnullu\253llu\253llnullnullnullnullnullnullnullnullu\253llu\253ll!!nullnullnullnullnullnullnullnullu\253llu\253llnullnullnullnullnullnullnullnullu\253llu\253ll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0245\u023d\u0248\u0248\u0245\u023d\u0248\u0248\u0245\u023d\u0248\u0248\u0245\u023d\u0248\u0248\u0245\u023d\u0248\u0248\u0245\u023d\u0248\u0248\u0245\u023d\u0248\u0248\u0245\u023d\u0248\u0248!" + "'", str2, "\u0245\u023d\u0248\u0248\u0245\u023d\u0248\u0248\u0245\u023d\u0248\u0248\u0245\u023d\u0248\u0248\u0245\u023d\u0248\u0248\u0245\u023d\u0248\u0248\u0245\u023d\u0248\u0248\u0245\u023d\u0248\u0248!");
    }

    @Test
    public void test02513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02513");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!", "]]]]]]]]!!]]]]]]]]!!]]]]]]]]]]]]]]]]!!]]]]]]]]!!]]]]]]]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull!!]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull!!]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull!!]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull!!]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull!" + "'", str2, "]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull!!]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull!!]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull!!]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull!!]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull!");
    }

    @Test
    public void test02514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02514");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("N!LLN!LL!", "\u0366\u0365\u0368\u0368nullnull\204\204nullnullnullnullnull\204\204nullnullnull!!nullnull\204\204nullnullnullnullnull\204\204nullnullnull!!nullnull\204\204nullnullnullnullnull\204\204nullnullnull!!nullnull\204\204nullnullnullnullnull\204\204\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\367!\372\372\367!\372\372!" + "'", str2, "\367!\372\372\367!\372\372!");
    }

    @Test
    public void test02515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02515");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHH!", "\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!!\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!!\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!!\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!!\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!" + "'", str2, "\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!");
    }

    @Test
    public void test02516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02516");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NULLNULLUNLLUNLLNULLNULLUNLLUNLLNULLNULLUNLLUNLLNULLNULLUNLLUNLLNULLNULLUNLLUNLLNULLNULLUNLLUNLLNULLNULLUNLLUNLLNULLNULLUNLLUNLL!", "UNLLUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02517");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]]HH]]HH!!]]HH]]HH!!]]HH]]HH]]HH]]HH!!]]HH]]HH!!]]HH]]HH!", "LUUULUUULUUULUUU\200}}`LUUULUUULUUULUUU]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull!" + "'", str2, "]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull!");
    }

    @Test
    public void test02518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02518");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!!", "!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU\200}}`!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254!!!" + "'", str2, "\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254!!!");
    }

    @Test
    public void test02519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02519");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "ULNNULNNULNNULNNULNNULNNULNNULNN!!ULNNULNNULNNULNNULNNULNNULNNULNN!!ULNNULNNULNNULNNULNNULNNULNNULNNULNNULNNULNNULNNULNNULNNULNNULNN!!ULNNULNNULNNULNNULNNULNNULNNULNN!!ULNNULNNULNNULNNULNNULNNULNNULNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test02520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02520");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!", "!!!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnullnull]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnull!" + "'", str2, "null]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnullnull]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnull!");
    }

    @Test
    public void test02521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02521");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("u]uuu]uu!!u]uuu]uu!!u]uuu]uuu]uuu]uu!!u]uuu]uu!!u]uuu]uu!", "\336\335\340\340\336\335\340\340!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnullnull]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnull!" + "'", str2, "null]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnullnull]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnull!");
    }

    @Test
    public void test02522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02522");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340nullnullnullnullnullnullnullnull\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340nullnullnullnullnullnullnullnull!", "\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248null\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248!" + "'", str2, "null\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248null\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248!");
    }

    @Test
    public void test02523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02523");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NULLNULL!!NULLNULL!!NULLNULLNULLNULL!!NULLNULL!!NULLNULL!", "nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!" + "'", str2, "!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!");
    }

    @Test
    public void test02524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02524");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348\u0108\u0106\u0106\u0106\u0348\u0346\u0346!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test02525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02525");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!!\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!!\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!!\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!!\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!", "!L!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!!\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!!\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!!\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!!\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!" + "'", str2, "\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!!\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!!\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!!\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!!\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!");
    }

    @Test
    public void test02526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02526");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null\340\336\336nullnullnullnull\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336nullnullnullnull\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336!", "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128nullnullnull!" + "'", str2, "\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128nullnullnull!");
    }

    @Test
    public void test02527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02527");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!", "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!" + "'", str2, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
    }

    @Test
    public void test02528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02528");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("hfHHhfHH!!hfHHhfHH!!hfHHhfHH!!hfHHhfHH!!hfHHhfHH!!hfHHhfHH!!hfHHhfHH!!hfHHhfHH!!!", "NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test02529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02529");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226!!UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226!!!", "!\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226!!nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226!!!" + "'", str2, "nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226!!nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226!!!");
    }

    @Test
    public void test02530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02530");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!nullnullnullnull!", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02531");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276bcee\275\275\276bcee\275\275c!eec!eec!eec!eec!eec!eec!eec!ee\276bcee\275\275\276bcee\275\275c!eec!eec!eec!eec!eec!eec!eec!ee\276bcee\275\275\276bcee\275\275c!eec!eec!eec!eec!eec!eec!eec!ee\276bcee\275\275\276bcee\275\275c!eec!eec!eec!eec!eec!eec!eec!ee\276bcee\275\275\276bcee\275\275c!eec!eec!eec!eec!eec!eec!eec!ee\276bcee\275\275\276bcee\275\275c!eec!eec!eec!eec!eec!eec!eec!ee\276bcee\275\275\276bcee\275\275c!eec!eec!eec!eec!eec!eec!eec!ee\276bcee\275\275\276bcee\275\275c!eec!eec!eec!eec!eec!eec!eec!ee!", "}~\200\200}~\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL}~\200\200}~\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN!" + "'", str2, "\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN!");
    }

    @Test
    public void test02532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02532");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!", "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULL!" + "'", str2, "UULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULL!");
    }

    @Test
    public void test02533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02533");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7!!!", "\u0366\u0365\u0368\u0368nullnull\204\204nullnullnullnullnull\204\204nullnullnull!!nullnull\204\204nullnullnullnullnull\204\204nullnullnull!!nullnull\204\204nullnullnullnullnull\204\204nullnullnull!!nullnull\204\204nullnullnullnullnull\204\204\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`nullnull!!nullnull!!nullnull!!`nullnull!!nullnull!!nullnull!!!" + "'", str2, "`nullnull!!nullnull!!nullnull!!`nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test02534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02534");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "\u017e\u0180\u0180\u0180\u017e\u0180\u0180\u0180\u017e\u0180\u0180\u0180\u017e\u0180\u0180\u0180\u017e\u0180\u0180\u0180\u017e\u0180\u0180\u0180\u017e\u0180\u0180\u0180\u017e\u0180\u0180\u0180!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02535");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366!", "rrpprrppRRPPRRPPrrpprrppRRPPRRPPrrpprrppRRPPRRPPrrpprrppRRPPRRPPrrpprrppRRPPRRPPrrpprrppRRPPRRPPrrpprrppRRPPRRPPrrpprrppRRPPRRPP!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366!" + "'", str2, "\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366!");
    }

    @Test
    public void test02536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02536");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLL!", "\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!!!" + "'", str2, "\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!!!");
    }

    @Test
    public void test02537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02537");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275UNLLUNLLUNLL\276UNLL\275\275!", "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275NULLNULLNULL\276NULL\275\275!" + "'", str2, "\275NULLNULLNULL\276NULL\275\275!");
    }

    @Test
    public void test02538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02538");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null\335\340\340null\335\340\340null\335\340\340null\335\340\340null\335\340\340null\335\340\340null\335\340\340null\335\340\340!", "\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02539");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("u]uuu]uu!!u]uuu]uu!!u]uuu]uuu]uuu]uu!!u]uuu]uu!!u]uuu]uu!", "~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}]}}}]}}!!}]}}}]}}!!}]}}}]}}}]}}}]}}!!}]}}}]}}!!}]}}}]}}!" + "'", str2, "}]}}}]}}!!}]}}}]}}!!}]}}}]}}}]}}}]}}!!}]}}}]}}!!}]}}}]}}!");
    }

    @Test
    public void test02540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02540");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("N~~~N~~~N~~~N~~~N~~~N~~~N~~~N~~~!", "unllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "N~~~N~~~N~~~N~~~N~~~N~~~N~~~N~~~!" + "'", str2, "N~~~N~~~N~~~N~~~N~~~N~~~N~~~N~~~!");
    }

    @Test
    public void test02541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02541");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!" + "'", str2, "\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!");
    }

    @Test
    public void test02542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02542");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d!!!" + "'", str2, "\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d!!!");
    }

    @Test
    public void test02543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02543");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullUNLL!", "\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\336\300\300\300\300\336\300\300!" + "'", str2, "\336\300\300\300\300\336\300\300!");
    }

    @Test
    public void test02544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02544");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null~}}^null]]!", "!\331\330\333\333\331\330\333\333\331\330\333\333\331\330\333\333!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull~}}^nullnullnullnull]]!" + "'", str2, "nullnullnullnull~}}^nullnullnullnull]]!");
    }

    @Test
    public void test02545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02545");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("EEEEEEEEEEEEEEEE\200}}`EEEEEEEEEEEEEEEE]]!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNNNNNNNNNNNNNNN\200}}`NNNNNNNNNNNNNNNN]]!" + "'", str2, "NNNNNNNNNNNNNNNN\200}}`NNNNNNNNNNNNNNNN]]!");
    }

    @Test
    public void test02546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02546");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!", "\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348!!\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348!!\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348!!\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348!!\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~!!~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~!!~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~!!~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~!!~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~!" + "'", str2, "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~!!~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~!!~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~!!~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~!!~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~!");
    }

    @Test
    public void test02547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02547");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368!!]]!!]]\200\200\u0346\u0348\u0348!", "HHHHHHHHHHHHHHHH\200}}`HHHHHHHHHHHHHHHH]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368!!]]!!]]\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368!!]]!!]]\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test02548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02548");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!!!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!!!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!!!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!!!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!", "!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!" + "'", str2, "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!");
    }

    @Test
    public void test02549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02549");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU!", "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368LLLLLLLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!" + "'", str2, "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!");
    }

    @Test
    public void test02550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02550");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\352\356\356\356\352\356\356\356\352\356\356\356\352\356\356\356\200}}`\352\356\356\356\352\356\356\356\352\356\356\356\352\356\356\356]]!", "UUXXUUXXXXUUXXUUXXXX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test02551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02551");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("XXUUXXUU!", "l!lll!lll!lll!lll!lll!lll!lll!ll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02552");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NLLLNLLLNLLLNLLL\200}}`NLLLNLLLNLLLNLLL]]!", "}~\200\200}~\200\200NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL}~\200\200}~\200\200NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ULLLULLLULLLULLL\200}}`ULLLULLLULLLULLL]]!" + "'", str2, "ULLLULLLULLLULLL\200}}`ULLLULLLULLLULLL]]!");
    }

    @Test
    public void test02553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02553");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "unllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02554");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02555");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NLLL\200}}`NLLL]]!", "XXXXXXXXXXXXXXXX\200}}`XXXXXXXXXXXXXXXX]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "XXXX\200}}`XXXX]]!" + "'", str2, "XXXX\200}}`XXXX]]!");
    }

    @Test
    public void test02556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02556");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178!", "\u0366\u0365\u0368\u0368\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullRRRnullnullnullnullRRRnullnullnullnullRRRnullnullnullnullRRRnullnullnullnullRRRnullnullnullnullRRRnullnullnullnullRRRnullnullnullnullRRR!" + "'", str2, "nullnullnullnullRRRnullnullnullnullRRRnullnullnullnullRRRnullnullnullnullRRRnullnullnullnullRRRnullnullnullnullRRRnullnullnullnullRRRnullnullnullnullRRR!");
    }

    @Test
    public void test02557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02557");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200\u0348\u0346\u0346!", "\311\314\314\314\311\314\314\314\311\314\314\314\311\314\314\314\311\314\314\314\311\314\314\314\311\314\314\314\311\314\314\314!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200\u0348\u0346\u0346!");
    }

    @Test
    public void test02558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02558");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "NULLNULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02559");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226!!null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226!!!", "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226!!null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226!!!" + "'", str2, "null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226!!null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226!!!");
    }

    @Test
    public void test02560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02560");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256!", "UBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256!" + "'", str2, "\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256!");
    }

    @Test
    public void test02561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02561");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~}\200\200~}\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLnullnullUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLnullnull~}\200\200~}\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLnullnullUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLnullnull~}\200\200~}\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLnullnullUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLnullnull~}\200\200~}\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLnullnullUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLnullnull~}\200\200~}\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLnullnullUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLnullnull~}\200\200~}\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLnullnullUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLnullnull~}\200\200~}\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLnullnullUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLnullnull~}\200\200~}\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLnullnullUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLnullnull!", "\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200!" + "'", str2, "~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200!");
    }

    @Test
    public void test02562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02562");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test02563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02563");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\276!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\276!" + "'", str2, "!\276!");
    }

    @Test
    public void test02564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02564");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!", "UNLLUNLL!!UNLLUNLL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!" + "'", str2, "\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!");
    }

    @Test
    public void test02565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02565");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\226!!!\226!!!\226!!!\226!!!\226!!!\226!!!\226!!!\226!!!!", "!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\226!!!\226!!!\226!!!\226!!!\226!!!\226!!!\226!!!\226!!!!" + "'", str2, "\226!!!\226!!!\226!!!\226!!!\226!!!\226!!!\226!!!\226!!!!");
    }

    @Test
    public void test02566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02566");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250!", "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250!" + "'", str2, "\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250!");
    }

    @Test
    public void test02567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02567");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnull\255\256\260\260\255\256\260\260nullnull\255\256\260\260\255\256\260\260nullnull\255\256\260\260\255\256\260\260nullnull\255\256\260\260\255\256\260\260nullnull\255\256\260\260\255\256\260\260nullnull\255\256\260\260\255\256\260\260nullnull\255\256\260\260\255\256\260\260nullnull\255\256\260\260\255\256\260\260!", "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnull\223\223nullnullnullnullnull\223\223nullnullnull}~\200\200}~\200\200nullnull\223\223nullnullnullnullnull\223\223nullnullnull}~\200\200}~\200\200nullnull\223\223nullnullnullnullnull\223\223nullnullnull}~\200\200}~\200\200nullnull\223\223nullnullnullnullnull\223\223\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260!" + "'", str2, "\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260!");
    }

    @Test
    public void test02568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02568");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128!", "NULLNULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02569");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "\340nullnullnullnullnull\300\300nullnull\300\300!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test02570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02570");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULL!", "JLLLJLLLJLLLJLLLJLLLJLLLJLLLJLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL!" + "'", str2, "LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL!");
    }

    @Test
    public void test02571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02571");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\201\204\204\204\201\204\204\204\201\204\204\204\201\204\204\204\200}}`\201\204\204\204\201\204\204\204\201\204\204\204\201\204\204\204]]!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\201\204\204\204\201\204\204\204\201\204\204\204\201\204\204\204\200}}`\201\204\204\204\201\204\204\204\201\204\204\204\201\204\204\204]]!" + "'", str2, "\201\204\204\204\201\204\204\204\201\204\204\204\201\204\204\204\200}}`\201\204\204\204\201\204\204\204\201\204\204\204\201\204\204\204]]!");
    }

    @Test
    public void test02572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02572");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\245\245\245\245\u0346\u0348\u0348!", "\305\306\310\310\305\306\310\310!!\305\306\310\310\305\306\310\310!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\245\245\245\245\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\245\245\245\245\u0346\u0348\u0348!");
    }

    @Test
    public void test02573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02573");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!", "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!" + "'", str2, "LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!");
    }

    @Test
    public void test02574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02574");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!", "\351\354\354\354\351\354\354\354\351\354\354\354\351\354\354\354\200}}`\351\354\354\354\351\354\354\354\351\354\354\354\351\354\354\354]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!" + "'", str2, "\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!");
    }

    @Test
    public void test02575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02575");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!", "\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!" + "'", str2, "\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!");
    }

    @Test
    public void test02576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02576");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\275!!\275\275!!!!\275\275!!\275\275!!!!!", "LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\275!!\275\275!!!!\275\275!!\275\275!!!!!" + "'", str2, "\275\275!!\275\275!!!!\275\275!!\275\275!!!!!");
    }

    @Test
    public void test02577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02577");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\300\336\336\336\300\336\336\336\300\336\336\336\300\336\336\336\300\336\336\336\300\336\336\336\300\336\336\336\300\336\336\336!", "!\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02578");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull!!]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull!!]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull!!]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull!!]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull!", "}]}}}]}}!!}]}}}]}}!!}]}}}]}}}]}}}]}}!!}]}}}]}}!!}]}}}]}}!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!" + "'", str2, "]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!");
    }

    @Test
    public void test02579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02579");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!" + "'", str2, "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!");
    }

    @Test
    public void test02580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02580");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!", "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02581");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348!", "\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348!" + "'", str2, "\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348!");
    }

    @Test
    public void test02582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02582");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340!", "}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170nullnull!" + "'", str2, "\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170nullnull!");
    }

    @Test
    public void test02583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02583");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u016a\u016a\u016a\u016a\u016a\u016aLL!", "efhhefhhefhhefhhefhhefhhefhhefhh!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EHHHEnullHHEnullHHEnullHHEnullHHEHHHEnullHHEnullHH!" + "'", str2, "EHHHEnullHHEnullHHEnullHHEnullHHEHHHEnullHHEnullHH!");
    }

    @Test
    public void test02584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02584");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129!!!!!", "!]!!!]!!!!!]!!!]!!!!!]!!!]!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!" + "'", str2, "!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!");
    }

    @Test
    public void test02585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02585");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU!", "LL!!!!!LL!!!!!LL!!!!!LL!!!!!LL!!!!!LL!!!!!LL!!!!!LL!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull!" + "'", str2, "\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull!");
    }

    @Test
    public void test02586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02586");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\253\254\256\256nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnullnullnull!", "\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!!!\253\254\256\256\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!!!!" + "'", str2, "\253\254\256\256\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!!!\253\254\256\256\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!!!!");
    }

    @Test
    public void test02587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02587");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("l!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLL!", "\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0388\u0386\u0386\u0388\u0386\u0386\u0368\u0368\u0388\u0386\u0386\u0388\u0386\u0386\u0368\u0368\u0388\u0386\u0386\u0388\u0386\u0386\u0368\u0368\u0388\u0386\u0386\u0388\u0386\u0386\u0368\u0368\u0388\u0386\u0386\u0388\u0386\u0386\u0368\u0368\u0388\u0386\u0386\u0388\u0386\u0386\u0368\u0368\u0388\u0386\u0386\u0388\u0386\u0386\u0368\u0368\u0388\u0386\u0386\u0388\u0386\u0386\u0368\u0368!" + "'", str2, "\u0388\u0386\u0386\u0388\u0386\u0386\u0368\u0368\u0388\u0386\u0386\u0388\u0386\u0386\u0368\u0368\u0388\u0386\u0386\u0388\u0386\u0386\u0368\u0368\u0388\u0386\u0386\u0388\u0386\u0386\u0368\u0368\u0388\u0386\u0386\u0388\u0386\u0386\u0368\u0368\u0388\u0386\u0386\u0388\u0386\u0386\u0368\u0368\u0388\u0386\u0386\u0388\u0386\u0386\u0368\u0368\u0388\u0386\u0386\u0388\u0386\u0386\u0368\u0368!");
    }

    @Test
    public void test02588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02588");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!", "TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!ttTT!!TT!!ttTT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!ttTT!!TT!!ttTT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!ttTT!!TT!!ttTT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!ttTT!!TT!!ttTT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!ttTT!!TT!!ttTT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!ttTT!!TT!!ttTT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!ttTT!!TT!!ttTT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!ttTT!!TT!!tt!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!!!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!!!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!!!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!!!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!" + "'", str2, "!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!!!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!!!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!!!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!!!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!");
    }

    @Test
    public void test02589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02589");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("h]hhh]hh!!h]hhh]hh!!h]hhh]hhh]hhh]hh!!h]hhh]hh!!h]hhh]hh!", "^```^```^```^```^```^```^```^```^```^```\230UELL\226\226\230UELL\226\226^```^```\230UELL\226\226\230UELL\226\226^```^```^```^```^```^```^```^```^```^```\230UELL\226\226\230UELL\226\226^```^```\230UELL\226\226\230UELL\226\226^```^```^```^```^```^```^```^```^```^```\230UELL\226\226\230UELL\226\226^```^```\230UELL\226\226\230UELL\226\226^```^```^```^```^```^```^```^```^```^```\230UELL\226\226\230UELL\226\226^```^```\230UELL\226\226\230UELL\226\226^```^```^```^```^```^```^```^```^```^```\230UELL\226\226\230UELL\226\226^```^```\230UELL\226\226\230UELL\226\226^```^```^```^```^```^```^```^```^```^```\230UELL\226\226\230UELL\226\226^```^```\230UELL\226\226\230UELL\226\226^```^```^```^```^```^```^```^```^```^```\230UELL\226\226\230UELL\226\226^```^```\230UELL\226\226\230UELL\226\226^```^```^```^```^```^```^```^```^```^```\230UELL\226\226\230UELL\226\226^```^```\230UELL\226\226\230UELL\226\226!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnullnull]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnull!" + "'", str2, "null]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnullnull]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnull!");
    }

    @Test
    public void test02590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02590");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NULLNULL!!NULLNULL!!NULLNULLNULLNULL!!NULLNULL!!NULLNULL!", "\u03dd\u03de\u03e0\u03e0nullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U!LLU!LL!!U!LLU!LL!!U!LLU!LLU!LLU!LL!!U!LLU!LL!!U!LLU!LL!" + "'", str2, "U!LLU!LL!!U!LLU!LL!!U!LLU!LLU!LLU!LL!!U!LLU!LL!!U!LLU!LL!");
    }

    @Test
    public void test02591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02591");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("l]lll]ll!!l]lll]ll!!l]lll]lll]lll]ll!!l]lll]ll!!l]lll]ll!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnullnull]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnull!" + "'", str2, "null]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnullnull]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnull!");
    }

    @Test
    public void test02592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02592");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("TT!!TT!!!", "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!!");
    }

    @Test
    public void test02593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02593");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!", "\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!!\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!!\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!!\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!!\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!" + "'", str2, "!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!");
    }

    @Test
    public void test02594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02594");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~}\200\200~}\200\200UNLLUNLLuuUNLLUNLLuu~}\200\200~}\200\200UNLLUNLLuuUNLLUNLLuu~}\200\200~}\200\200UNLLUNLLuuUNLLUNLLuu~}\200\200~}\200\200UNLLUNLLuuUNLLUNLLuu~}\200\200~}\200\200UNLLUNLLuuUNLLUNLLuu~}\200\200~}\200\200UNLLUNLLuuUNLLUNLLuu~}\200\200~}\200\200UNLLUNLLuuUNLLUNLLuu~}\200\200~}\200\200UNLLUNLLuuUNLLUNLLuu!", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200nullxnullnullnullxnullnullnullnullnullxnullnullnullxnullnullnullnull~}\200\200~}\200\200nullxnullnullnullxnullnullnullnullnullxnullnullnullxnullnullnullnull~}\200\200~}\200\200nullxnullnullnullxnullnullnullnullnullxnullnullnullxnullnullnullnull~}\200\200~}\200\200nullxnullnullnullxnullnullnullnullnullxnullnullnullxnullnullnullnull~}\200\200~}\200\200nullxnullnullnullxnullnullnullnullnullxnullnullnullxnullnullnullnull~}\200\200~}\200\200nullxnullnullnullxnullnullnullnullnullxnullnullnullxnullnullnullnull~}\200\200~}\200\200nullxnullnullnullxnullnullnullnullnullxnullnullnullxnullnullnullnull~}\200\200~}\200\200nullxnullnullnullxnullnullnullnullnullxnullnullnullxnullnullnullnull!" + "'", str2, "~}\200\200~}\200\200nullxnullnullnullxnullnullnullnullnullxnullnullnullxnullnullnullnull~}\200\200~}\200\200nullxnullnullnullxnullnullnullnullnullxnullnullnullxnullnullnullnull~}\200\200~}\200\200nullxnullnullnullxnullnullnullnullnullxnullnullnullxnullnullnullnull~}\200\200~}\200\200nullxnullnullnullxnullnullnullnullnullxnullnullnullxnullnullnullnull~}\200\200~}\200\200nullxnullnullnullxnullnullnullnullnullxnullnullnullxnullnullnullnull~}\200\200~}\200\200nullxnullnullnullxnullnullnullnullnullxnullnullnullxnullnullnullnull~}\200\200~}\200\200nullxnullnullnullxnullnullnullnullnullxnullnullnullxnullnullnullnull~}\200\200~}\200\200nullxnullnullnullxnullnullnullnullnullxnullnullnullxnullnullnullnull!");
    }

    @Test
    public void test02595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02595");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275!", "\u01a0\u0196\u019d\u019d\u01a0\u0196\u019d\u019d\u01a0\u0196\u019d\u019d\u01a0\u0196\u019d\u019d\u01a0\u0196\u019d\u019d\u01a0\u0196\u019d\u019d\u01a0\u0196\u019d\u019d\u01a0\u0196\u019d\u019d!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275!" + "'", str2, "\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275!");
    }

    @Test
    public void test02596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02596");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("`\253!!!\253!!!\253!!!`\253!!!\253!!!\253!!!!", "\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`\253!!!\253!!!\253!!!`\253!!!\253!!!\253!!!!" + "'", str2, "`\253!!!\253!!!\253!!!`\253!!!\253!!!\253!!!!");
    }

    @Test
    public void test02597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02597");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("X!UUX!UUX!UUX!UUX!UUX!UUX!UUX!UU!", "\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0106\u0128\u0128\u0106\u0128\u0128\u0106\u0128\u0128\u0106\u0128\u0128\u0106\u0128\u0128\u0106\u0128\u0128\u0106\u0128\u0128\u0106\u0128\u0128!" + "'", str2, "\u0106\u0128\u0128\u0106\u0128\u0128\u0106\u0128\u0128\u0106\u0128\u0128\u0106\u0128\u0128\u0106\u0128\u0128\u0106\u0128\u0128\u0106\u0128\u0128!");
    }

    @Test
    public void test02598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02598");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NULLNULLNULLNULLNULLNULLNULLNULL!", "\336\336\335\335\336\336\335\335!!\336\336\335\335\336\336\335\335!!!!\336\336\335\335\336\336\335\335!!\336\336\335\335\336\336\335\335!!!!\336\336\335\335\336\336\335\335!!\336\336\335\335\336\336\335\335!!!!\336\336\335\335\336\336\335\335!!\336\336\335\335\336\336\335\335!!!!\336\336\335\335\336\336\335\335!!\336\336\335\335\336\336\335\335!!!!\336\336\335\335\336\336\335\335!!\336\336\335\335\336\336\335\335!!!!\336\336\335\335\336\336\335\335!!\336\336\335\335\336\336\335\335!!!!\336\336\335\335\336\336\335\335!!\336\336\335\335\336\336\335\335!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02599");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!", "HH!!HH!!HHHH!!HH!!HH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!" + "'", str2, "\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!");
    }

    @Test
    public void test02600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02600");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!", "\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
    }

    @Test
    public void test02601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02601");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnull!", "NUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUU!" + "'", str2, "UNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUU!");
    }

    @Test
    public void test02602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02602");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!!", "NULLNULLNULLNULLNULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test02603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02603");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHH!", "nullnull!!nullnull!!nullnull!!nullnull!!null!!!null!!!null!!!null!!!nullnull!!nullnull!!nullnull!!nullnull!!null!!!null!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!" + "'", str2, "!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!");
    }

    @Test
    public void test02604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02604");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "nullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUU!!nullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUU!!nullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUU!!nullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUU!!nullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test02605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02605");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!", "HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!" + "'", str2, "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!");
    }

    @Test
    public void test02606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02606");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128nullnull!", "LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e!" + "'", str2, "\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e!");
    }

    @Test
    public void test02607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02607");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL!", "LLLLnullnullnullnullLLLLnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLUULLUULLUULLUULLUULLUULLUULLUULLLLUULLUULLUULLUULLUULLUULLUULLUULLLLUULLUULLUULLUULLUULLUULLUULLUULLLLUULLUULLUULLUULLUULLUULLUULLUULLLLUULLUULLUULLUULLUULLUULLUULLUULLLLUULLUULLUULLUULLUULLUULLUULLUULLLLUULLUULLUULLUULLUULLUULLUULLUULLLLUULLUULLUULLUULLUULLUULLUULLUULL!" + "'", str2, "LLUULLUULLUULLUULLUULLUULLUULLUULLLLUULLUULLUULLUULLUULLUULLUULLUULLLLUULLUULLUULLUULLUULLUULLUULLUULLLLUULLUULLUULLUULLUULLUULLUULLUULLLLUULLUULLUULLUULLUULLUULLUULLUULLLLUULLUULLUULLUULLUULLUULLUULLUULLLLUULLUULLUULLUULLUULLUULLUULLUULLLLUULLUULLUULLUULLUULLUULLUULLUULL!");
    }

    @Test
    public void test02608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02608");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test02609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02609");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NLLLULNN!", "wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!!wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!!wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!!wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!!wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02610");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull!", "!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!" + "'", str2, "^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!");
    }

    @Test
    public void test02611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02611");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LUUULUUULUUULUUU\200}}`LUUULUUULUUULUUU]]!", "LnullLLLnullLL!!LnullLLLnullLL!!LnullLLLnullLLLnullLLLnullLL!!LnullLLLnullLL!!LnullLLLnullLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLL\200}}`LLLLLLLLLLLLLLLL]]!" + "'", str2, "LLLLLLLLLLLLLLLL\200}}`LLLLLLLLLLLLLLLL]]!");
    }

    @Test
    public void test02612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02612");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]]AA]]AA!!]]AA]]AA!!]]AA]]AA]]AA]]AA!!]]AA]]AA!!]]AA]]AA!", "\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]\300\300]]\300\300!!]]\300\300]]\300\300!!]]\300\300]]\300\300]]\300\300]]\300\300!!]]\300\300]]\300\300!!]]\300\300]]\300\300!" + "'", str2, "]]\300\300]]\300\300!!]]\300\300]]\300\300!!]]\300\300]]\300\300]]\300\300]]\300\300!!]]\300\300]]\300\300!!]]\300\300]]\300\300!");
    }

    @Test
    public void test02613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02613");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!!", "\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!!" + "'", str2, "\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!!");
    }

    @Test
    public void test02614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02614");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!", "null\200~~null\200~~nullnullnull\200~~null\200~~nullnull!!null\200~~null\200~~nullnullnull\200~~null\200~~nullnull!!null\200~~null\200~~nullnullnull\200~~null\200~~nullnullnull\200~~null\200~~nullnullnull\200~~null\200~~nullnull!!null\200~~null\200~~nullnullnull\200~~null\200~~nullnull!!null\200~~null\200~~nullnullnull\200~~null\200~~nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!~LL!!!!~LL!!!!!!~LL!!!!~LL!!!!!!~LL!!!!~LL!!!!~LL!!!!~LL!!!!!!~LL!!!!~LL!!!!!!~LL!!!!~LL!!!" + "'", str2, "!!~LL!!!!~LL!!!!!!~LL!!!!~LL!!!!!!~LL!!!!~LL!!!!~LL!!!!~LL!!!!!!~LL!!!!~LL!!!!!!~LL!!!!~LL!!!");
    }

    @Test
    public void test02615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02615");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("EHHH\200}}`EHHH]]!", "NNUUNNUU!!NNUUNNUU!!NNUUNNUUNNUUNNUU!!NNUUNNUU!!NNUUNNUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\200}}`nullnullnullnull]]!" + "'", str2, "nullnullnullnull\200}}`nullnullnullnull]]!");
    }

    @Test
    public void test02616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02616");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("ijllijllijllijll!ill!ill!ill!illijllijllijllijll!ill!ill!", "\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNNNNNNNNNNNNNNN!NNN!NNN!NNN!NNNNNNNNNNNNNNNNNNN!NNN!NNN!" + "'", str2, "NNNNNNNNNNNNNNNN!NNN!NNN!NNN!NNNNNNNNNNNNNNNNNNN!NNN!NNN!");
    }

    @Test
    public void test02617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02617");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnullnull!", "XXXX\200}}`XXXX]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02618");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u026c\u026c\u026c!", "``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02619");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test02620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02620");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test02621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02621");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!", "\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test02622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02622");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\305\306\310\310\305\306\310\310!!\305\306\310\310\305\306\310\310!!!", "\u0289\u028a\u028c\u028c!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test02623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02623");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108!", "LLUULLUULLUULLUULLUULLUULLUULLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02624");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!", "efhhefhhefhhefhhefhhefhhefhhefhh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test02625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02625");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull!", "LL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "llllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLL!" + "'", str2, "llllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLL!");
    }

    @Test
    public void test02626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02626");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200!", "HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200!" + "'", str2, "\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200!");
    }

    @Test
    public void test02627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02627");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}~\200\200}~\200\200null^nullnullnull^nullnull}~\200\200}~\200\200null^nullnullnull^nullnull!", "!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200\u0170\u0170\u0170\u0170\u0170\u0170nullnullnull}~\200\200}~\200\200\u0170\u0170\u0170\u0170\u0170\u0170nullnullnull!" + "'", str2, "}~\200\200}~\200\200\u0170\u0170\u0170\u0170\u0170\u0170nullnullnull}~\200\200}~\200\200\u0170\u0170\u0170\u0170\u0170\u0170nullnullnull!");
    }

    @Test
    public void test02628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02628");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214!", "LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214!" + "'", str2, "JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214!");
    }

    @Test
    public void test02629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02629");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368nullnull\200\200\u0346\u0348\u0348!", "]!null!!!null!!!null!!!null!!!null!!]]!null!!!null!!]]!null!!!null!!]]!null!!!null!!]]]!null!!!null!!!null!!!null!!!null!!]]!null!!!null!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368!]!!!]!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368!]!!!]!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test02630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02630");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!", "!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!" + "'", str2, "!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!");
    }

    @Test
    public void test02631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02631");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348\u037b\u037c\u037e\u037e\u0348\u0346\u0346!", "nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u037e\u037e\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u037e\u037e\u0348\u0346\u0346!");
    }

    @Test
    public void test02632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02632");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\351\354\354\354\351\354\354\354\351\354\354\354\351\354\354\354\200}}`\351\354\354\354\351\354\354\354\351\354\354\354\351\354\354\354]]!", "\300!!!\300!!!\300!!!\300!!!\300!!!\300!!!\300!!!\300!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test02633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02633");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("ULLLULLLULLLULLLULLLULLLULLLULLL!", "LNUULNUU!!LNUULNUU!!LNUULNUULNUULNUU!!LNUULNUU!!LNUULNUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNN!" + "'", str2, "LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNN!");
    }

    @Test
    public void test02634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02634");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u041b\u041c\u041c\u041c\u0346\u0348\u0348!", "`nullnull!!nullnull!!nullnull!!`nullnull!!nullnull!!nullnull!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test02635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02635");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "!!nullnull!!!!!!!!nullnull!!!!!!!!!!nullnull!!!!!!!!nullnull!!!!!!!!!!nullnull!!!!!!!!nullnull!!!!!!!!!!nullnull!!!!!!!!nullnull!!!!!!!!!!nullnull!!!!!!!!nullnull!!!!!!!!!!nullnull!!!!!!!!nullnull!!!!!!!!!!nullnull!!!!!!!!nullnull!!!!!!!!!!nullnull!!!!!!!!nullnull!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02636");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!", "nullnullnullnullUNLLUNLLUNLLUNLLnullnullnullnullUNLLUNLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test02637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02637");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348!", "LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
    }

    @Test
    public void test02638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02638");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!", "eeee\220eeeeeeee\200~~eeee\220eeeeeeee\200~~eeee\220eeeeeeeeeeee\220eeeeeeeeeeee\220eeeeeeee\200~~eeee\220eeeeeeee\200~~eeee\220eeeeeeeeeeee\220eeeeeeee!!eeee\220eeeeeeee\200~~eeee\220eeeeeeee\200~~eeee\220eeeeeeeeeeee\220eeeeeeeeeeee\220eeeeeeee\200~~eeee\220eeeeeeee\200~~eeee\220eeeeeeeeeeee\220eeeeeeee!!eeee\220eeeeeeee\200~~eeee\220eeeeeeee\200~~eeee\220eeeeeeeeeeee\220eeeeeeeeeeee\220eeeeeeee\200~~eeee\220eeeeeeee\200~~eeee\220eeeeeeeeeeee\220eeeeeeeeeeee\220eeeeeeee\200~~eeee\220eeeeeeee\200~~eeee\220eeeeeeeeeeee\220eeeeeeeeeeee\220eeeeeeee\200~~eeee\220eeeeeeee\200~~eeee\220eeeeeeeeeeee\220eeeeeeee!!eeee\220eeeeeeee\200~~eeee\220eeeeeeee\200~~eeee\220eeeeeeeeeeee\220eeeeeeeeeeee\220eeeeeeee\200~~eeee\220eeeeeeee\200~~eeee\220eeeeeeeeeeee\220eeeeeeee!!eeee\220eeeeeeee\200~~eeee\220eeeeeeee\200~~eeee\220eeeeeeeeeeee\220eeeeeeeeeeee\220eeeeeeee\200~~eeee\220eeeeeeee\200~~eeee\220eeeeeeeeeeee\220eeeeeeee!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200E\220\220\200E\220\220\200E\220\220\200E\220\220\200E\220\220\200E\220\220\200E\220\220\200E\220\220!" + "'", str2, "\200E\220\220\200E\220\220\200E\220\220\200E\220\220\200E\220\220\200E\220\220\200E\220\220\200E\220\220!");
    }

    @Test
    public void test02639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02639");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```!", "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUUUNLLUNLLUU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe!!!```!" + "'", str2, "\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe!!!```!");
    }

    @Test
    public void test02640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02640");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull!", "!\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02641");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UNLLUNLLUNLLUNLLULLLULLLULLLULLLUNLLUNLLUNLLUNLLULLLULLL!", "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02642");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!\200}}`!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!]]!", "!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150!!\200\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150!!]]!" + "'", str2, "\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150!!\200\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150!!]]!");
    }

    @Test
    public void test02643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02643");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL!", "\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128!" + "'", str2, "\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128!");
    }

    @Test
    public void test02644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02644");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LNUULNUU!!LNUULNUU!!LNUULNUULNUULNUU!!LNUULNUU!!LNUULNUU!", "]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]U!!]U!!!!]U!!]U!!!!]U!!]U!!]U!!]U!!!!]U!!]U!!!!]U!!]U!!!" + "'", str2, "]U!!]U!!!!]U!!]U!!!!]U!!]U!!]U!!]U!!!!]U!!]U!!!!]U!!]U!!!");
    }

    @Test
    public void test02645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02645");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```!", "!\253\256\256\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```!" + "'", str2, "nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```!");
    }

    @Test
    public void test02646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02646");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200!", "!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200!" + "'", str2, "\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200!");
    }

    @Test
    public void test02647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02647");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!!", "\352\351\354\354\352\351\354\354!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test02648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02648");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!", "\u01a0\u0196\u019d\u019d\u01a0\u0196\u019d\u019d\u01a0\u0196\u019d\u019d\u01a0\u0196\u019d\u019d\u01a0\u0196\u019d\u019d\u01a0\u0196\u019d\u019d\u01a0\u0196\u019d\u019d\u01a0\u0196\u019d\u019d!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!" + "'", str2, "\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!");
    }

    @Test
    public void test02649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02649");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~n~~\225\230\230~n~~\225\230\230~n~~\225\230\230~n~~\225\230\230\200}}`~n~~\225\230\230~n~~\225\230\230~n~~\225\230\230~n~~\225\230\230]]!", "\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348~~\225\230\230\u0348~~\225\230\230\u0348~~\225\230\230\u0348~~\225\230\230\200\u0348~~\225\230\230\u0348~~\225\230\230\u0348~~\225\230\230\u0348~~\225\230\230]]!" + "'", str2, "\u0348~~\225\230\230\u0348~~\225\230\230\u0348~~\225\230\230\u0348~~\225\230\230\200\u0348~~\225\230\230\u0348~~\225\230\230\u0348~~\225\230\230\u0348~~\225\230\230]]!");
    }

    @Test
    public void test02650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02650");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336!", "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02651");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220!", "\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220!" + "'", str2, "\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220!");
    }

    @Test
    public void test02652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02652");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLUULLUU}}LLUULLUU}}!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u03c0\u03c0\u03be\u03be\u03c0\u03c0\u03be\u03be\u03c0\u03c0\u03be\u03be\u03c0\u03c0\u03be\u03be}}!" + "'", str2, "\u03c0\u03c0\u03be\u03be\u03c0\u03c0\u03be\u03be\u03c0\u03c0\u03be\u03be\u03c0\u03c0\u03be\u03be}}!");
    }

    @Test
    public void test02653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02653");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02654");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L~UUL~UU!!L~UUL~UU!!L~UUL~UUL~UUL~UU!!L~UUL~UU!!L~UUL~UU!" + "'", str2, "L~UUL~UU!!L~UUL~UU!!L~UUL~UUL~UUL~UU!!L~UUL~UU!!L~UUL~UU!");
    }

    @Test
    public void test02655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02655");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!!", "\u0106\u0106\u0106\u0106!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!" + "'", str2, "LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!");
    }

    @Test
    public void test02656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02656");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("P\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NN!!P\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NN!!P\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NN!!P\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NN!!P\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NN!", "\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246!!!```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!" + "'", str2, "null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!");
    }

    @Test
    public void test02657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02657");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0nullnull!", "ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!" + "'", str2, "!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!");
    }

    @Test
    public void test02658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02658");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("EEEEEEEEEEEEEEEE\200}}`EEEEEEEEEEEEEEEE]]!", "nullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test02659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02659");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe!!!```!", "\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```!" + "'", str2, "nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```!");
    }

    @Test
    public void test02660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02660");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("N~LLN~LL!!N~LLN~LL!!N~LLN~LLN~LLN~LL!!N~LLN~LL!!N~LLN~LL!", "LL!!!!!LL!!!!!LL!!!!!LL!!!!!LL!!!!!LL!!!!!LL!!!!!LL!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null~ssnull~ss!!null~ssnull~ss!!null~ssnull~ssnull~ssnull~ss!!null~ssnull~ss!!null~ssnull~ss!" + "'", str2, "null~ssnull~ss!!null~ssnull~ss!!null~ssnull~ssnull~ssnull~ss!!null~ssnull~ss!!null~ssnull~ss!");
    }

    @Test
    public void test02661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02661");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!null!", "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnullnull!" + "'", str2, "!nullnullnullnull!");
    }

    @Test
    public void test02662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02662");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e!", "\u017e\u017e\u017e\u017e\u017e\u017enullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull!" + "'", str2, "\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02663");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\254~\256\256\254~\256\256\254~\256\256\254~\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!" + "'", str2, "\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!");
    }

    @Test
    public void test02664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02664");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("ab!", "!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UU!" + "'", str2, "UU!");
    }

    @Test
    public void test02665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02665");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\336\336\335\335\336\336\335\335!!\336\336\335\335\336\336\335\335!!!", "ZWXXZWXXZWXXZWXXZWXXZWXX!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test02666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02666");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\200!", "\u016e\u016e\u016e\u016e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u016e\u016e\u016e\u016e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\200!" + "'", str2, "!\200!");
    }

    @Test
    public void test02667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02667");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u041b\u041c\u041c\u041c\u0346\u0348\u0348!", "!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test02668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02668");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248null\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248!", "nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "NLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02669");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test02670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02670");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u019b\u019c\u019e\u019e\u019b\u019c\u019e\u019e\u019b\u019c\u019e\u019e\u019b\u019c\u019e\u019e!", "!~HH!~HH!!!~HH!~HH!!!~HH!~HH!~HH!~HH!!!~HH!~HH!!!~HH!~HH!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H!~~H!~~H!~~H!~~H!~~H!~~H!~~H!~~nullnullnullnullnullnullnullnullH!~~H!~~H!~~H!~~H!~~H!~~H!~~H!~~nullnullnullnullnullnullnullnull!" + "'", str2, "H!~~H!~~H!~~H!~~H!~~H!~~H!~~H!~~nullnullnullnullnullnullnullnullH!~~H!~~H!~~H!~~H!~~H!~~H!~~H!~~nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02671");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!tttnullnullnullnull!tttnullnull!", "\246\246!!\246\246!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02672");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnull\223\223nullnullnullnullnull\223\223nullnullnull}~\200\200}~\200\200nullnull\223\223nullnullnullnullnull\223\223nullnullnull}~\200\200}~\200\200nullnull\223\223nullnullnullnullnull\223\223nullnullnull}~\200\200}~\200\200nullnull\223\223nullnullnullnullnull\223\223\u0348\u0346\u0346!", "FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348}~\200\200}~\200\200hfhhhfhh\223\223hfhhhfhhhfhhhfhhhfhh\223\223hfhhhfhhhfhh}~\200\200}~\200\200hfhhhfhh\223\223hfhhhfhhhfhhhfhhhfhh\223\223hfhhhfhhhfhh}~\200\200}~\200\200hfhhhfhh\223\223hfhhhfhhhfhhhfhhhfhh\223\223hfhhhfhhhfhh}~\200\200}~\200\200hfhhhfhh\223\223hfhhhfhhhfhhhfhhhfhh\223\223\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348}~\200\200}~\200\200hfhhhfhh\223\223hfhhhfhhhfhhhfhhhfhh\223\223hfhhhfhhhfhh}~\200\200}~\200\200hfhhhfhh\223\223hfhhhfhhhfhhhfhhhfhh\223\223hfhhhfhhhfhh}~\200\200}~\200\200hfhhhfhh\223\223hfhhhfhhhfhhhfhhhfhh\223\223hfhhhfhhhfhh}~\200\200}~\200\200hfhhhfhh\223\223hfhhhfhhhfhhhfhhhfhh\223\223\u0348\u0346\u0346!");
    }

    @Test
    public void test02673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02673");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150!!\200\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150!!]]!", "\200\200!!\200\200!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\200}}`!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!]]!" + "'", str2, "!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\200}}`!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!]]!");
    }

    @Test
    public void test02674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02674");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL!", "\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull!" + "'", str2, "\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull!");
    }

    @Test
    public void test02675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02675");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\230!", "\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\230!" + "'", str2, "!\230!");
    }

    @Test
    public void test02676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02676");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108nullnull!!!!!!!", "}~\200\200}~\200\200LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNN}~\200\200}~\200\200LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNN!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\260null\255\255\260null\255\255!!!!nullnullnullnull\260null\255\255\260null\255\255!!!!!!nullnullnullnull\260null\255\255\260null\255\255!!!!nullnullnullnull\260null\255\255\260null\255\255!!!!!!nullnullnullnull\260null\255\255\260null\255\255!!!!nullnullnullnull\260null\255\255\260null\255\255!!!!!!nullnullnullnull\260null\255\255\260null\255\255!!!!nullnullnullnull\260null\255\255\260null\255\255!!!!!!nullnullnullnull\260null\255\255\260null\255\255!!!!nullnullnullnull\260null\255\255\260null\255\255!!!!!!nullnullnullnull\260null\255\255\260null\255\255!!!!nullnullnullnull\260null\255\255\260null\255\255!!!!!!nullnullnullnull\260null\255\255\260null\255\255!!!!nullnullnullnull\260null\255\255\260null\255\255!!!!!!nullnullnullnull\260null\255\255\260null\255\255!!!!nullnullnullnull\260null\255\255\260null\255\255!!!!!!!" + "'", str2, "nullnullnullnull\260null\255\255\260null\255\255!!!!nullnullnullnull\260null\255\255\260null\255\255!!!!!!nullnullnullnull\260null\255\255\260null\255\255!!!!nullnullnullnull\260null\255\255\260null\255\255!!!!!!nullnullnullnull\260null\255\255\260null\255\255!!!!nullnullnullnull\260null\255\255\260null\255\255!!!!!!nullnullnullnull\260null\255\255\260null\255\255!!!!nullnullnullnull\260null\255\255\260null\255\255!!!!!!nullnullnullnull\260null\255\255\260null\255\255!!!!nullnullnullnull\260null\255\255\260null\255\255!!!!!!nullnullnullnull\260null\255\255\260null\255\255!!!!nullnullnullnull\260null\255\255\260null\255\255!!!!!!nullnullnullnull\260null\255\255\260null\255\255!!!!nullnullnullnull\260null\255\255\260null\255\255!!!!!!nullnullnullnull\260null\255\255\260null\255\255!!!!nullnullnullnull\260null\255\255\260null\255\255!!!!!!!");
    }

    @Test
    public void test02677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02677");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!!!!", "nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!!!!" + "'", str2, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!!!!");
    }

    @Test
    public void test02678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02678");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("HH!!HH!!!", "\275HHH\276H\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FF!!FF!!!" + "'", str2, "FF!!FF!!!");
    }

    @Test
    public void test02679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02679");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\253\256\256\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!", "FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\256\256\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!" + "'", str2, "!\253\256\256\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
    }

    @Test
    public void test02680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02680");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("H!~~H!~~H!~~H!~~H!~~H!~~H!~~H!~~nullnullnullnullnullnullnullnullH!~~H!~~H!~~H!~~H!~~H!~~H!~~H!~~nullnullnullnullnullnullnullnull!", "````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02681");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200\u0348\u0346\u0346!", "NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200\u0348\u0346\u0346!");
    }

    @Test
    public void test02682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02682");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("ULLLULLL!!ULLLULLL!!ULLLULLLULLLULLL!!ULLLULLL!!ULLLULLL!", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "XXXXXXXX!!XXXXXXXX!!XXXXXXXXXXXXXXXX!!XXXXXXXX!!XXXXXXXX!" + "'", str2, "XXXXXXXX!!XXXXXXXX!!XXXXXXXXXXXXXXXX!!XXXXXXXX!!XXXXXXXX!");
    }

    @Test
    public void test02683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02683");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368nullnull!!nullnull!!\200\200\u0346\u0348\u0348!", "RRPPRRPPRRPPRRPPRRPPRRPPRRPPRRPP!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test02684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02684");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("IJLLIJLL!!IJLLIJLL!!IJLLIJLLIJLLIJLL!!IJLLIJLL!!IJLLIJLL!", "L~UUL~UU!!L~UUL~UU!!L~UUL~UUL~UUL~UU!!L~UUL~UU!!L~UUL~UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!~~!!~~!!!!~~!!~~!!!!~~!!~~!!~~!!~~!!!!~~!!~~!!!!~~!!~~!" + "'", str2, "!!~~!!~~!!!!~~!!~~!!!!~~!!~~!!~~!!~~!!!!~~!!~~!!!!~~!!~~!");
    }

    @Test
    public void test02685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02685");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!!", "OPRROPRROPRROPRROPRROPRROPRROPRR!!OPRROPRROPRROPRROPRROPRROPRROPRR!!OPRROPRROPRROPRROPRROPRROPRROPRR!!OPRROPRROPRROPRROPRROPRROPRROPRR!!OPRROPRROPRROPRROPRROPRROPRROPRR!!OPRROPRROPRROPRROPRROPRROPRROPRR!!OPRROPRROPRROPRROPRROPRROPRROPRR!!OPRROPRROPRROPRROPRROPRROPRROPRR!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OPRROPRROPRROPRROPRROPRROPRROPRR!!OPRROPRROPRROPRROPRROPRROPRROPRR!!OPRROPRROPRROPRROPRROPRROPRROPRR!!OPRROPRROPRROPRROPRROPRROPRROPRR!!OPRROPRROPRROPRROPRROPRROPRROPRR!!OPRROPRROPRROPRROPRROPRROPRROPRR!!OPRROPRROPRROPRROPRROPRROPRROPRR!!OPRROPRROPRROPRROPRROPRROPRROPRR!!!" + "'", str2, "OPRROPRROPRROPRROPRROPRROPRROPRR!!OPRROPRROPRROPRROPRROPRROPRROPRR!!OPRROPRROPRROPRROPRROPRROPRROPRR!!OPRROPRROPRROPRROPRROPRROPRROPRR!!OPRROPRROPRROPRROPRROPRROPRROPRR!!OPRROPRROPRROPRROPRROPRROPRROPRR!!OPRROPRROPRROPRROPRROPRROPRROPRR!!OPRROPRROPRROPRROPRROPRROPRROPRR!!!");
    }

    @Test
    public void test02686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02686");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!!", "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!" + "'", str2, "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!");
    }

    @Test
    public void test02687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02687");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u014f!", "!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!" + "'", str2, "!null!");
    }

    @Test
    public void test02688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02688");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NN!!NN!!LNNNLNNNNN!!NN!!LNNNLNNNNN!!NN!!LNNNLNNNNN!!NN!!LNNNLNNNNN!!NN!!LNNNLNNNNN!!NN!!LNNNLNNNNN!!NN!!LNNNLNNNNN!!NN!!LNNNLNNN!" + "'", str2, "NN!!NN!!LNNNLNNNNN!!NN!!LNNNLNNNNN!!NN!!LNNNLNNNNN!!NN!!LNNNLNNNNN!!NN!!LNNNLNNNNN!!NN!!LNNNLNNNNN!!NN!!LNNNLNNNNN!!NN!!LNNNLNNN!");
    }

    @Test
    public void test02689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02689");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "ECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBB!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02690");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368LL!!LL!!\200\200\u0346\u0348\u0348!", "nullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u03c0\u03c0\u03c0\u03c0!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u03c0\u03c0\u03c0\u03c0!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test02691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02691");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!!", "nullnullnullnullZWXXZWXXZWXXZWXXnullnullnullnullZWXXZWXX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UZLLUZLL!!UZLLUZLL!!!!UZLLUZLL!!UZLLUZLL!!!!!!UZLLUZLL!!UZLLUZLL!!!!UZLLUZLL!!UZLLUZLL!!!!!!UZLLUZLL!!UZLLUZLL!!!!UZLLUZLL!!UZLLUZLL!!!!!!UZLLUZLL!!UZLLUZLL!!!!UZLLUZLL!!UZLLUZLL!!!!!!UZLLUZLL!!UZLLUZLL!!!!UZLLUZLL!!UZLLUZLL!!!!!!UZLLUZLL!!UZLLUZLL!!!!UZLLUZLL!!UZLLUZLL!!!!!!UZLLUZLL!!UZLLUZLL!!!!UZLLUZLL!!UZLLUZLL!!!!!!UZLLUZLL!!UZLLUZLL!!!!UZLLUZLL!!UZLLUZLL!!!!!!!" + "'", str2, "UZLLUZLL!!UZLLUZLL!!!!UZLLUZLL!!UZLLUZLL!!!!!!UZLLUZLL!!UZLLUZLL!!!!UZLLUZLL!!UZLLUZLL!!!!!!UZLLUZLL!!UZLLUZLL!!!!UZLLUZLL!!UZLLUZLL!!!!!!UZLLUZLL!!UZLLUZLL!!!!UZLLUZLL!!UZLLUZLL!!!!!!UZLLUZLL!!UZLLUZLL!!!!UZLLUZLL!!UZLLUZLL!!!!!!UZLLUZLL!!UZLLUZLL!!!!UZLLUZLL!!UZLLUZLL!!!!!!UZLLUZLL!!UZLLUZLL!!!!UZLLUZLL!!UZLLUZLL!!!!!!UZLLUZLL!!UZLLUZLL!!!!UZLLUZLL!!UZLLUZLL!!!!!!!");
    }

    @Test
    public void test02692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02692");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "EnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02693");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]!null!!!null!!!null!!!null!!!null!!]]!null!!!null!!]]!null!!!null!!]]!null!!!null!!]]]!null!!!null!!!null!!!null!!!null!!]]!null!!!null!!]]!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!]]!nullnullnullnull!!!nullnullnullnull!!]]!nullnullnullnull!!!nullnullnullnull!!]]!nullnullnullnull!!!nullnullnullnull!!]]]!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!]]!nullnullnullnull!!!nullnullnullnull!!]]!" + "'", str2, "]!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!]]!nullnullnullnull!!!nullnullnullnull!!]]!nullnullnullnull!!!nullnullnullnull!!]]!nullnullnullnull!!!nullnullnullnull!!]]]!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!]]!nullnullnullnull!!!nullnullnullnull!!]]!");
    }

    @Test
    public void test02694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02694");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "T!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TT!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test02695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02695");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test02696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02696");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128!", "\u03dd\u03de\u03e0\u03e0nullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull!" + "'", str2, "\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull!");
    }

    @Test
    public void test02697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02697");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!", "\u0366\u0365\u0368\u0368\u0128\u0128\u0128\u0128\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!" + "'", str2, "}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!");
    }

    @Test
    public void test02698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02698");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108!!!", "LNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNN!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test02699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02699");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02700");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}~\200\200}~\200\200nullnull}~\200\200}~\200\200nullnull!", "!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnull!" + "'", str2, "}~\200\200}~\200\200nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02701");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnull!", "HFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFF!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FH!!FH!!FH!!FH!!FH!!FH!!FH!!FH!!!" + "'", str2, "FH!!FH!!FH!!FH!!FH!!FH!!FH!!FH!!!");
    }

    @Test
    public void test02702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02702");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\215\216\230\230nullnullnull\215\216\230\230nullnullnull\215\216\230\230nullnullnull\215\216\230\230nullnullnull\215\216\230\230nullnullnull\215\216\230\230nullnullnull\215\216\230\230nullnullnull\215\216\230\230nullnullnull!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL!" + "'", str2, "\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL!");
    }

    @Test
    public void test02703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02703");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("hhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHH!", "`ULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLL`ULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!" + "'", str2, "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
    }

    @Test
    public void test02704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02704");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "NNNNNNNN!!NNNNNNNN!!NNNNNNNNNNNNNNNN!!NNNNNNNN!!NNNNNNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test02705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02705");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]]]]]]]]!!]]]]]]]]!!]]]]]]]]]]]]]]]]!!]]]]]]]]!!]]]]]]]]!", "^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]]]]]]]!!]]]]]]]]!!]]]]]]]]]]]]]]]]!!]]]]]]]]!!]]]]]]]]!" + "'", str2, "]]]]]]]]!!]]]]]]]]!!]]]]]]]]]]]]]]]]!!]]]]]]]]!!]]]]]]]]!");
    }

    @Test
    public void test02706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02706");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnull!", "\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128nullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LNUULNUU!!LNUULNUU!!\276LNUULNUULNUU\276LNUULNUULNUULNUULNUU!!LNUULNUU!!\276LNUULNUULNUU\276LNUULNUULNUULNUULNUU!!LNUULNUU!!\276LNUULNUULNUU\276LNUULNUULNUULNUULNUU!!LNUULNUU!!\276LNUULNUULNUU\276LNUULNUULNUULNUULNUU!!LNUULNUU!!\276LNUULNUULNUU\276LNUULNUULNUULNUULNUU!!LNUULNUU!!\276LNUULNUULNUU\276LNUULNUULNUULNUULNUU!!LNUULNUU!!\276LNUULNUULNUU\276LNUULNUULNUULNUULNUU!!LNUULNUU!!\276LNUULNUULNUU\276LNUULNUULNUU!" + "'", str2, "LNUULNUU!!LNUULNUU!!\276LNUULNUULNUU\276LNUULNUULNUULNUULNUU!!LNUULNUU!!\276LNUULNUULNUU\276LNUULNUULNUULNUULNUU!!LNUULNUU!!\276LNUULNUULNUU\276LNUULNUULNUULNUULNUU!!LNUULNUU!!\276LNUULNUULNUU\276LNUULNUULNUULNUULNUU!!LNUULNUU!!\276LNUULNUULNUU\276LNUULNUULNUULNUULNUU!!LNUULNUU!!\276LNUULNUULNUU\276LNUULNUULNUULNUULNUU!!LNUULNUU!!\276LNUULNUULNUU\276LNUULNUULNUULNUULNUU!!LNUULNUU!!\276LNUULNUULNUU\276LNUULNUULNUU!");
    }

    @Test
    public void test02707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02707");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("efhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhh!!efhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhh!!efhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhh!!efhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhh!!efhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhh!", "~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02708");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129!!!!!", "l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230\200}}`l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!" + "'", str2, "!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!");
    }

    @Test
    public void test02709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02709");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u014f!", "\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!" + "'", str2, "!null!");
    }

    @Test
    public void test02710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02710");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108nullnull!!!!!!!", "\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106!!!!!!!" + "'", str2, "\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106!!!!!!!");
    }

    @Test
    public void test02711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02711");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH!", "UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02712");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U\220!!\200~~U\220!!\200~~U\220!!U\220!!U\220!!\200~~U\220!!\200~~U\220!!U\220!!!!U\220!!\200~~U\220!!\200~~U\220!!U\220!!U\220!!\200~~U\220!!\200~~U\220!!U\220!!!!U\220!!\200~~U\220!!\200~~U\220!!U\220!!U\220!!\200~~U\220!!\200~~U\220!!U\220!!U\220!!\200~~U\220!!\200~~U\220!!U\220!!U\220!!\200~~U\220!!\200~~U\220!!U\220!!!!U\220!!\200~~U\220!!\200~~U\220!!U\220!!U\220!!\200~~U\220!!\200~~U\220!!U\220!!!!U\220!!\200~~U\220!!\200~~U\220!!U\220!!U\220!!\200~~U\220!!\200~~U\220!!U\220!!!" + "'", str2, "U\220!!\200~~U\220!!\200~~U\220!!U\220!!U\220!!\200~~U\220!!\200~~U\220!!U\220!!!!U\220!!\200~~U\220!!\200~~U\220!!U\220!!U\220!!\200~~U\220!!\200~~U\220!!U\220!!!!U\220!!\200~~U\220!!\200~~U\220!!U\220!!U\220!!\200~~U\220!!\200~~U\220!!U\220!!U\220!!\200~~U\220!!\200~~U\220!!U\220!!U\220!!\200~~U\220!!\200~~U\220!!U\220!!!!U\220!!\200~~U\220!!\200~~U\220!!U\220!!U\220!!\200~~U\220!!\200~~U\220!!U\220!!!!U\220!!\200~~U\220!!\200~~U\220!!U\220!!U\220!!\200~~U\220!!\200~~U\220!!U\220!!!");
    }

    @Test
    public void test02713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02713");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140!", "\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLL!" + "'", str2, "LUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLL!");
    }

    @Test
    public void test02714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02714");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129!!!!!", "\u011b\u011c\u011e\u011e\u011b\u011c\u011e\u011e\u011e\214\214\u011e\214\214\u011b\u011c\u011e\u011e\u011b\u011c\u011e\u011e\u011e\214\214\u011e\214\214\u011b\u011c\u011e\u011e\u011b\u011c\u011e\u011e\u011e\214\214\u011e\214\214\u011b\u011c\u011e\u011e\u011b\u011c\u011e\u011e\u011e\214\214\u011e\214\214\u011b\u011c\u011e\u011e\u011b\u011c\u011e\u011e\u011e\214\214\u011e\214\214\u011b\u011c\u011e\u011e\u011b\u011c\u011e\u011e\u011e\214\214\u011e\214\214\u011b\u011c\u011e\u011e\u011b\u011c\u011e\u011e\u011e\214\214\u011e\214\214\u011b\u011c\u011e\u011e\u011b\u011c\u011e\u011e\u011e\214\214\u011e\214\214!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!" + "'", str2, "!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!");
    }

    @Test
    public void test02715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02715");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u023d\u023e\u0240\u0240\u023d\u023e\u0240\u0240\u023d\u023e\u0240\u0240\u023d\u023e\u0240\u0240!", "\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02716");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0150\u0150\u0150\u0150!", "a]aaa]aa!!a]aaa]aa!!a]aaa]aaa]aaa]aa!!a]aaa]aa!!a]aaa]aa!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AA]]AA]]nullnullAA]]AA]]nullnull!" + "'", str2, "AA]]AA]]nullnullAA]]AA]]nullnull!");
    }

    @Test
    public void test02717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02717");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test02718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02718");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!~HH!~HH!!!~HH!~HH!!!~HH!~HH!~HH!~HH!!!~HH!~HH!!!~HH!~HH!", "nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~nullnull!~nullnull!!!~nullnull!~nullnull!!!~nullnull!~nullnull!~nullnull!~nullnull!!!~nullnull!~nullnull!!!~nullnull!~nullnull!" + "'", str2, "!~nullnull!~nullnull!!!~nullnull!~nullnull!!!~nullnull!~nullnull!~nullnull!~nullnull!!!~nullnull!~nullnull!!!~nullnull!~nullnull!");
    }

    @Test
    public void test02719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02719");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHH!", "\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128!!!!" + "'", str2, "\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128!!!!");
    }

    @Test
    public void test02720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02720");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108!!!", "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test02721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02721");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```!", "EHHHEHHHEHHHEHHHEHHHEHHHEHHHEHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```!" + "'", str2, "HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```!");
    }

    @Test
    public void test02722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02722");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLUUUULL!", "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnullnullnull!!!" + "'", str2, "!!nullnullnullnull!!!");
    }

    @Test
    public void test02723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02723");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256!", "~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256!" + "'", str2, "~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256!");
    }

    @Test
    public void test02724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02724");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!!", "UNLL\256\254\254UNLL\256\254\254!!UNLL\256\254\254UNLL\256\254\254!!UNLL\256\254\254UNLL\256\254\254!!UNLL\256\254\254UNLL\256\254\254!!UNLL\256\254\254UNLL\256\254\254!!UNLL\256\254\254UNLL\256\254\254!!UNLL\256\254\254UNLL\256\254\254!!UNLL\256\254\254UNLL\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test02725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02725");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!", "!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!" + "'", str2, "L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!");
    }

    @Test
    public void test02726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02726");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275!!!\275!!!\275!!!\275!!!!!\275\275!!\275\275!!\275\275!!\275\275\275!!!\275!!!\275!!!\275!!!!!\275\275!!\275\275!", "~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275!!!\275!!!\275!!!\275!!!!!\275\275!!\275\275!!\275\275!!\275\275\275!!!\275!!!\275!!!\275!!!!!\275\275!!\275\275!" + "'", str2, "\275!!!\275!!!\275!!!\275!!!!!\275\275!!\275\275!!\275\275!!\275\275\275!!!\275!!!\275!!!\275!!!!!\275\275!!\275\275!");
    }

    @Test
    public void test02727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02727");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("l!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLL!", "U~LLU~LL!!U~LLU~LL!!U~LLU~LLU~LLU~LL!!U~LLU~LL!!U~LLU~LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230!\225\225\230!\225\225xx\230!\225\225\230!\225\225xx\230!\225\225\230!\225\225xx\230!\225\225\230!\225\225xx\230!\225\225\230!\225\225xx\230!\225\225\230!\225\225xx\230!\225\225\230!\225\225xx\230!\225\225\230!\225\225xx!" + "'", str2, "\230!\225\225\230!\225\225xx\230!\225\225\230!\225\225xx\230!\225\225\230!\225\225xx\230!\225\225\230!\225\225xx\230!\225\225\230!\225\225xx\230!\225\225\230!\225\225xx\230!\225\225\230!\225\225xx\230!\225\225\230!\225\225xx!");
    }

    @Test
    public void test02728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02728");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnull\226\226nullnull\226\226nullnullvvnullnullvvnullnull\226\226nullnull\226\226nullnullvvnullnullvvnullnull\226\226nullnull\226\226nullnullvvnullnullvvnullnull\226\226nullnull\226\226nullnullvvnullnullvvnullnull\226\226nullnull\226\226nullnullvvnullnullvvnullnull\226\226nullnull\226\226nullnullvvnullnullvvnullnull\226\226nullnull\226\226nullnullvvnullnullvvnullnull\226\226nullnull\226\226nullnullvvnullnullvv!", "UUNNNNUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fhnullnullfhnullnull\226\226fhnullnullfhnullnull\226\226fhnullnullfhnullnullnullnullfhnullnullfhnullnullnullnullfhnullnullfhnullnull\226\226fhnullnullfhnullnull\226\226fhnullnullfhnullnullnullnullfhnullnullfhnullnullnullnullfhnullnullfhnullnull\226\226fhnullnullfhnullnull\226\226fhnullnullfhnullnullnullnullfhnullnullfhnullnullnullnullfhnullnullfhnullnull\226\226fhnullnullfhnullnull\226\226fhnullnullfhnullnullnullnullfhnullnullfhnullnullnullnullfhnullnullfhnullnull\226\226fhnullnullfhnullnull\226\226fhnullnullfhnullnullnullnullfhnullnullfhnullnullnullnullfhnullnullfhnullnull\226\226fhnullnullfhnullnull\226\226fhnullnullfhnullnullnullnullfhnullnullfhnullnullnullnullfhnullnullfhnullnull\226\226fhnullnullfhnullnull\226\226fhnullnullfhnullnullnullnullfhnullnullfhnullnullnullnullfhnullnullfhnullnull\226\226fhnullnullfhnullnull\226\226fhnullnullfhnullnullnullnullfhnullnullfhnullnullnullnull!" + "'", str2, "fhnullnullfhnullnull\226\226fhnullnullfhnullnull\226\226fhnullnullfhnullnullnullnullfhnullnullfhnullnullnullnullfhnullnullfhnullnull\226\226fhnullnullfhnullnull\226\226fhnullnullfhnullnullnullnullfhnullnullfhnullnullnullnullfhnullnullfhnullnull\226\226fhnullnullfhnullnull\226\226fhnullnullfhnullnullnullnullfhnullnullfhnullnullnullnullfhnullnullfhnullnull\226\226fhnullnullfhnullnull\226\226fhnullnullfhnullnullnullnullfhnullnullfhnullnullnullnullfhnullnullfhnullnull\226\226fhnullnullfhnullnull\226\226fhnullnullfhnullnullnullnullfhnullnullfhnullnullnullnullfhnullnullfhnullnull\226\226fhnullnullfhnullnull\226\226fhnullnullfhnullnullnullnullfhnullnullfhnullnullnullnullfhnullnullfhnullnull\226\226fhnullnullfhnullnull\226\226fhnullnullfhnullnullnullnullfhnullnullfhnullnullnullnullfhnullnullfhnullnull\226\226fhnullnullfhnullnull\226\226fhnullnullfhnullnullnullnullfhnullnullfhnullnullnullnull!");
    }

    @Test
    public void test02729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02729");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("````````````````````````````````!", "\u0346\u0348\u0348\u0348\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "````````````````````````````````!" + "'", str2, "````````````````````````````````!");
    }

    @Test
    public void test02730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02730");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230\200}}`LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230]]!", "~null~~\225\230\230~null~~\225\230\230~null~~\225\230\230~null~~\225\230\230\200}}`~null~~\225\230\230~null~~\225\230\230~null~~\225\230\230~null~~\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNNNNNNNNNNNNNNN\225\230\230NNNNNNNNNNNNNNNN\225\230\230NNNNNNNNNNNNNNNN\225\230\230NNNNNNNNNNNNNNNN\225\230\230\200}}`NNNNNNNNNNNNNNNN\225\230\230NNNNNNNNNNNNNNNN\225\230\230NNNNNNNNNNNNNNNN\225\230\230NNNNNNNNNNNNNNNN\225\230\230]]!" + "'", str2, "NNNNNNNNNNNNNNNN\225\230\230NNNNNNNNNNNNNNNN\225\230\230NNNNNNNNNNNNNNNN\225\230\230NNNNNNNNNNNNNNNN\225\230\230\200}}`NNNNNNNNNNNNNNNN\225\230\230NNNNNNNNNNNNNNNN\225\230\230NNNNNNNNNNNNNNNN\225\230\230NNNNNNNNNNNNNNNN\225\230\230]]!");
    }

    @Test
    public void test02731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02731");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017e\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017e\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017e\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017e\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017e\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017e\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017e\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017enullnull!", "qrttqrttnullnullqrttqrttnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqll!" + "'", str2, "nullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqll!");
    }

    @Test
    public void test02732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02732");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254!!!", "!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!!!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!!!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!!!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!!!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!!" + "'", str2, "\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!!");
    }

    @Test
    public void test02733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02733");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02734");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU!!``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU!!``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU!!``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU!!``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU!", "LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL!!``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL!!``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL!!``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL!!``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL!" + "'", str2, "``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL!!``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL!!``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL!!``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL!!``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL!");
    }

    @Test
    public void test02735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02735");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02736");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170!", "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8nullnullnullnullnullnullnullnull!" + "'", str2, "\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02737");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~!", "~}\200\200~}\200\200U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230~}\200\200~}\200\200U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230~}\200\200~}\200\200U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230~}\200\200~}\200\200U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230~}\200\200~}\200\200U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230~}\200\200~}\200\200U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230~}\200\200~}\200\200U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230~}\200\200~}\200\200U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02benullnull~~!" + "'", str2, "\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02benullnull~~!");
    }

    @Test
    public void test02738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02738");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHH!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02739");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e!", "LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNN!!!LUNN!!!LUNN!!!LUNN!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNN!!!LUNN!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!" + "'", str2, "!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!");
    }

    @Test
    public void test02740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02740");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300!", "\u0366\u0365\u0368\u0368!]!!!]!!\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02741");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null~ssnull~ss!!null~ssnull~ss!!null~ssnull~ssnull~ssnull~ss!!null~ssnull~ss!!null~ssnull~ss!", "\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\336\266\266~\326\326\276\336\266\266~\326\326!!\276\336\266\266~\326\326\276\336\266\266~\326\326!!\276\336\266\266~\326\326\276\336\266\266~\326\326\276\336\266\266~\326\326\276\336\266\266~\326\326!!\276\336\266\266~\326\326\276\336\266\266~\326\326!!\276\336\266\266~\326\326\276\336\266\266~\326\326!" + "'", str2, "\276\336\266\266~\326\326\276\336\266\266~\326\326!!\276\336\266\266~\326\326\276\336\266\266~\326\326!!\276\336\266\266~\326\326\276\336\266\266~\326\326\276\336\266\266~\326\326\276\336\266\266~\326\326!!\276\336\266\266~\326\326\276\336\266\266~\326\326!!\276\336\266\266~\326\326\276\336\266\266~\326\326!");
    }

    @Test
    public void test02742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02742");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("````````````````````````````````!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "````````````````````````````````!" + "'", str2, "````````````````````````````````!");
    }

    @Test
    public void test02743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02743");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256!", "\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256!" + "'", str2, "~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256!");
    }

    @Test
    public void test02744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02744");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!", "LNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NN!!NN!!!!NN!!NN!!!!NN!!NN!!!!NN!!NN!!!!NN!!NN!!!!NN!!NN!!!!NN!!NN!!!!NN!!NN!!!!!" + "'", str2, "NN!!NN!!!!NN!!NN!!!!NN!!NN!!!!NN!!NN!!!!NN!!NN!!!!NN!!NN!!!!NN!!NN!!!!NN!!NN!!!!!");
    }

    @Test
    public void test02745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02745");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\225!", "!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\225!" + "'", str2, "!\225!");
    }

    @Test
    public void test02746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02746");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ!", "!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!!" + "'", str2, "\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!!");
    }

    @Test
    public void test02747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02747");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!nullnullnullnull!", "UU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!UUUUUUUUUUUUUUUU!" + "'", str2, "!UUUUUUUUUUUUUUUU!");
    }

    @Test
    public void test02748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02748");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test02749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02749");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!", "!\253\253\253!\253\253\253!\253\253\253!\253\253\253\200}}`!\253\253\253!\253\253\253!\253\253\253!\253\253\253]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test02750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02750");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275XXX\275XXX!", "`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275UUU\275UUU!" + "'", str2, "\275UUU\275UUU!");
    }

    @Test
    public void test02751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02751");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NNNNNNNNNNNNNNNN\200}}`NNNNNNNNNNNNNNNN]]!", "!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!\200}}`!!!!!!!!!!!!!!!!]]!" + "'", str2, "!!!!!!!!!!!!!!!!\200}}`!!!!!!!!!!!!!!!!]]!");
    }

    @Test
    public void test02752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02752");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("X!UUX!UUX!UUX!UUX!UUX!UUX!UUX!UU!", "\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!" + "'", str2, "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
    }

    @Test
    public void test02753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02753");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!!!!!!!", "hfhhhfhh!!hfhhhfhh!!hfhhhfhhhfhhhfhh!!hfhhhfhh!!hfhhhfhh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!" + "'", str2, "!!!!!!!!!");
    }

    @Test
    public void test02754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02754");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("xxxxxxxxxxxxxxxxnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullxxxxxxxxxxxxxxxxnullnullnullnullnullnullnullnull!", "`R!RRRRRR!RRRRRR!RRRRR`R!RRRRRR!RRRRRR!RRRRR!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02755");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!", "LNUULNUU!!LNUULNUU!!LNUULNUULNUULNUU!!LNUULNUU!!LNUULNUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ULNNULNNULNNULNNULNNULNNULNNULNN!!ULNNULNNULNNULNNULNNULNNULNNULNN!!!" + "'", str2, "ULNNULNNULNNULNNULNNULNNULNNULNN!!ULNNULNNULNNULNNULNNULNNULNNULNN!!!");
    }

    @Test
    public void test02756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02756");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!", "JILLJILLJILLJILLJILLJILLJILLJILL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijll\200}}`ijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijll]]!" + "'", str2, "ijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijll\200}}`ijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijll]]!");
    }

    @Test
    public void test02757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02757");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!", "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!" + "'", str2, "\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!");
    }

    @Test
    public void test02758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02758");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnull!", "]!\253\253]!\253\253!!]!\253\253]!\253\253!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!!" + "'", str2, "!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!!");
    }

    @Test
    public void test02759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02759");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128!", "LNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull!" + "'", str2, "\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull!");
    }

    @Test
    public void test02760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02760");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\230!", "\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016enullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\230!" + "'", str2, "!\230!");
    }

    @Test
    public void test02761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02761");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7!", "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!" + "'", str2, "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
    }

    @Test
    public void test02762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02762");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128nullnull!", "l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn!!l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237!" + "'", str2, "nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237!");
    }

    @Test
    public void test02763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02763");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("EHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHH!", "LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02764");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!", "NNNNNNNNNNNNNNNN!NNN!NNN!NNN!NNNNNNNNNNNNNNNNNNN!NNN!NNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\256N!NN\254\254\256N!NN\254\254!!\256N!NN\254\254\256N!NN\254\254!!\256N!NN\254\254\256N!NN\254\254!!\256N!NN\254\254\256N!NN\254\254!!\256N!NN\254\254\256N!NN\254\254!!\256N!NN\254\254\256N!NN\254\254!!\256N!NN\254\254\256N!NN\254\254!!\256N!NN\254\254\256N!NN\254\254!" + "'", str2, "!!\256N!NN\254\254\256N!NN\254\254!!\256N!NN\254\254\256N!NN\254\254!!\256N!NN\254\254\256N!NN\254\254!!\256N!NN\254\254\256N!NN\254\254!!\256N!NN\254\254\256N!NN\254\254!!\256N!NN\254\254\256N!NN\254\254!!\256N!NN\254\254\256N!NN\254\254!!\256N!NN\254\254\256N!NN\254\254!");
    }

    @Test
    public void test02765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02765");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02766");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UZLLUZLL!!UZLLUZLL!!!!UZLLUZLL!!UZLLUZLL!!!!!!UZLLUZLL!!UZLLUZLL!!!!UZLLUZLL!!UZLLUZLL!!!!!!UZLLUZLL!!UZLLUZLL!!!!UZLLUZLL!!UZLLUZLL!!!!!!UZLLUZLL!!UZLLUZLL!!!!UZLLUZLL!!UZLLUZLL!!!!!!UZLLUZLL!!UZLLUZLL!!!!UZLLUZLL!!UZLLUZLL!!!!!!UZLLUZLL!!UZLLUZLL!!!!UZLLUZLL!!UZLLUZLL!!!!!!UZLLUZLL!!UZLLUZLL!!!!UZLLUZLL!!UZLLUZLL!!!!!!UZLLUZLL!!UZLLUZLL!!!!UZLLUZLL!!UZLLUZLL!!!!!!!", "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!!!!!!!" + "'", str2, "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!!!!!!!");
    }

    @Test
    public void test02767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02767");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d!", "!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF\200}}`!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test02768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02768");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!!", "FH!!FH!!FH!!FH!!FH!!FH!!FH!!FH!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!!" + "'", str2, "\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!!");
    }

    @Test
    public void test02769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02769");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!" + "'", str2, "!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!");
    }

    @Test
    public void test02770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02770");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128!", "`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull!" + "'", str2, "\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull!");
    }

    @Test
    public void test02771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02771");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test02772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02772");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("EnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnull!", "LLUULLUU}}LLUULLUU}}!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Lu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!ll!" + "'", str2, "Lu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!ll!");
    }

    @Test
    public void test02773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02773");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230!", "\u016a\u016a\u016a\u016a\u016a\u016aLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200null}\200\200null}\200\200\230\230null}\200\200null}\200\200\230\230~}\200\200~}\200\200null}\200\200null}\200\200\230\230null}\200\200null}\200\200\230\230~}\200\200~}\200\200null}\200\200null}\200\200\230\230null}\200\200null}\200\200\230\230~}\200\200~}\200\200null}\200\200null}\200\200\230\230null}\200\200null}\200\200\230\230~}\200\200~}\200\200null}\200\200null}\200\200\230\230null}\200\200null}\200\200\230\230~}\200\200~}\200\200null}\200\200null}\200\200\230\230null}\200\200null}\200\200\230\230~}\200\200~}\200\200null}\200\200null}\200\200\230\230null}\200\200null}\200\200\230\230~}\200\200~}\200\200null}\200\200null}\200\200\230\230null}\200\200null}\200\200\230\230!" + "'", str2, "~}\200\200~}\200\200null}\200\200null}\200\200\230\230null}\200\200null}\200\200\230\230~}\200\200~}\200\200null}\200\200null}\200\200\230\230null}\200\200null}\200\200\230\230~}\200\200~}\200\200null}\200\200null}\200\200\230\230null}\200\200null}\200\200\230\230~}\200\200~}\200\200null}\200\200null}\200\200\230\230null}\200\200null}\200\200\230\230~}\200\200~}\200\200null}\200\200null}\200\200\230\230null}\200\200null}\200\200\230\230~}\200\200~}\200\200null}\200\200null}\200\200\230\230null}\200\200null}\200\200\230\230~}\200\200~}\200\200null}\200\200null}\200\200\230\230null}\200\200null}\200\200\230\230~}\200\200~}\200\200null}\200\200null}\200\200\230\230null}\200\200null}\200\200\230\230!");
    }

    @Test
    public void test02774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02774");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!!", "FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!!" + "'", str2, "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!!");
    }

    @Test
    public void test02775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02775");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126!", "!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLnullNLLLnullnullnullNLLLnullnullNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLnullNLLLnullnullnullNLLLnullnullNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLnullNLLLnullnullnullNLLLnullnullNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLnullNLLLnullnullnullNLLLnullnullNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLnullNLLLnullnullnullNLLLnullnullNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLnullNLLLnullnullnullNLLLnullnullNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLnullNLLLnullnullnullNLLLnullnullNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLnullNLLLnullnullnullNLLLnullnull!" + "'", str2, "NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLnullNLLLnullnullnullNLLLnullnullNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLnullNLLLnullnullnullNLLLnullnullNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLnullNLLLnullnullnullNLLLnullnullNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLnullNLLLnullnullnullNLLLnullnullNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLnullNLLLnullnullnullNLLLnullnullNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLnullNLLLnullnullnullNLLLnullnullNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLnullNLLLnullnullnullNLLLnullnullNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLnullNLLLnullnullnullNLLLnullnull!");
    }

    @Test
    public void test02776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02776");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214!", "RRPPRRPPRRPPRRPPRRPPRRPPRRPPRRPP!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RRPPRRPPnullP\214\214nullP\214\214RRPPRRPPnullP\214\214nullP\214\214RRPPRRPPnullP\214\214nullP\214\214RRPPRRPPnullP\214\214nullP\214\214RRPPRRPPnullP\214\214nullP\214\214RRPPRRPPnullP\214\214nullP\214\214RRPPRRPPnullP\214\214nullP\214\214RRPPRRPPnullP\214\214nullP\214\214!" + "'", str2, "RRPPRRPPnullP\214\214nullP\214\214RRPPRRPPnullP\214\214nullP\214\214RRPPRRPPnullP\214\214nullP\214\214RRPPRRPPnullP\214\214nullP\214\214RRPPRRPPnullP\214\214nullP\214\214RRPPRRPPnullP\214\214nullP\214\214RRPPRRPPnullP\214\214nullP\214\214RRPPRRPPnullP\214\214nullP\214\214!");
    }

    @Test
    public void test02777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02777");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02778");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440nullnull!", "!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!!!!]!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!!!!!!!nullnullnullnullnullnullnullnull!!!!!!!!nullnullnullnullnullnullnullnull!!!!!!!!nullnullnullnullnullnullnullnull!!!!!!!!nullnullnullnullnullnullnullnull!!!!!!!!nullnullnullnullnullnullnullnull!!!!!!!!nullnullnullnullnullnullnullnull!!!!!!!!nullnullnullnullnullnullnullnull!!!!!!!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!!!!!!!nullnullnullnullnullnullnullnull!!!!!!!!nullnullnullnullnullnullnullnull!!!!!!!!nullnullnullnullnullnullnullnull!!!!!!!!nullnullnullnullnullnullnullnull!!!!!!!!nullnullnullnullnullnullnullnull!!!!!!!!nullnullnullnullnullnullnullnull!!!!!!!!nullnullnullnullnullnullnullnull!!!!!!!!!");
    }

    @Test
    public void test02779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02779");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UU!!````````````UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!````````````UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!", "nullnull\226\226nullnull\226\226nullnullvvnullnullvvnullnull\226\226nullnull\226\226nullnullvvnullnullvvnullnull\226\226nullnull\226\226nullnullvvnullnullvvnullnull\226\226nullnull\226\226nullnullvvnullnullvvnullnull\226\226nullnull\226\226nullnullvvnullnullvvnullnull\226\226nullnull\226\226nullnullvvnullnullvvnullnull\226\226nullnull\226\226nullnullvvnullnullvvnullnull\226\226nullnull\226\226nullnullvvnullnullvv!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c!!!" + "'", str2, "\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c!!!");
    }

    @Test
    public void test02780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02780");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!", "\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!" + "'", str2, "!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!");
    }

    @Test
    public void test02781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02781");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null~}}^null]]!", "nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a]]!" + "'", str2, "\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a]]!");
    }

    @Test
    public void test02782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02782");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256!", "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014enullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256!" + "'", str2, "~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256!");
    }

    @Test
    public void test02783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02783");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNN!", "TT!!TT!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02784");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}~\200\200}~\200\200\u0170\u0170\u0170\u0170\u0170\u0170nullnullnull}~\200\200}~\200\200\u0170\u0170\u0170\u0170\u0170\u0170nullnullnull!", "EnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200LUELLUELLUELL^LUELLUELLUELLLUELLUELLUELLLUELLUELLUELL^LUELLUELLUELLLUELLUELLUELL}~\200\200}~\200\200LUELLUELLUELL^LUELLUELLUELLLUELLUELLUELLLUELLUELLUELL^LUELLUELLUELLLUELLUELLUELL!" + "'", str2, "}~\200\200}~\200\200LUELLUELLUELL^LUELLUELLUELLLUELLUELLUELLLUELLUELLUELL^LUELLUELLUELLLUELLUELLUELL}~\200\200}~\200\200LUELLUELLUELL^LUELLUELLUELLLUELLUELLUELLLUELLUELLUELL^LUELLUELLUELLLUELLUELLUELL!");
    }

    @Test
    public void test02785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02785");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!", "^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e!" + "'", str2, "\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e!");
    }

    @Test
    public void test02786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02786");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe!!!```!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```!" + "'", str2, "nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```!");
    }

    @Test
    public void test02787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02787");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!", "nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226!" + "'", str2, "\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226!");
    }

    @Test
    public void test02788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02788");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0176\u0175\u0178\u0178\u0176\u0175\u0178\u0178\u0176\u0175\u0178\u0178\u0176\u0175\u0178\u0178!!!", "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test02789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02789");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!N!", "FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!H!" + "'", str2, "!H!");
    }

    @Test
    public void test02790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02790");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!", "RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test02791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02791");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NULLNULLUNLLUNLLNULLNULLUNLLUNLLNULLNULLUNLLUNLLNULLNULLUNLLUNLLNULLNULLUNLLUNLLNULLNULLUNLLUNLLNULLNULLUNLLUNLLNULLNULLUNLLUNLL!", "\230\226\u0128\u0128nullnull\236\276\276\230\226\u0128\u0128nullnull\236\276\276!!\230\226\u0128\u0128nullnull\236\276\276\230\226\u0128\u0128nullnull\236\276\276!!\230\226\u0128\u0128nullnull\236\276\276\230\226\u0128\u0128nullnull\236\276\276\230\226\u0128\u0128nullnull\236\276\276\230\226\u0128\u0128nullnull\236\276\276!!\230\226\u0128\u0128nullnull\236\276\276\230\226\u0128\u0128nullnull\236\276\276!!\230\226\u0128\u0128nullnull\236\276\276\230\226\u0128\u0128nullnull\236\276\276!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LNNNLNNNNLNNNLNNLNNNLNNNNLNNNLNNLNNNLNNNNLNNNLNNLNNNLNNNNLNNNLNNLNNNLNNNNLNNNLNNLNNNLNNNNLNNNLNNLNNNLNNNNLNNNLNNLNNNLNNNNLNNNLNN!" + "'", str2, "LNNNLNNNNLNNNLNNLNNNLNNNNLNNNLNNLNNNLNNNNLNNNLNNLNNNLNNNNLNNNLNNLNNNLNNNNLNNNLNNLNNNLNNNNLNNNLNNLNNNLNNNNLNNNLNNLNNNLNNNNLNNNLNN!");
    }

    @Test
    public void test02792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02792");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null\340\336\336nullnullnullnull\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336nullnullnullnull\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336!", "~n~~\225\230\230~n~~\225\230\230~n~~\225\230\230~n~~\225\230\230\200}}`~n~~\225\230\230~n~~\225\230\230~n~~\225\230\230~n~~\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\227nullnullnullnullnullnull\227nullnullnull\227nullnullnull\227nullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnull\227nullnullnull\227nullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull!" + "'", str2, "\227nullnullnullnullnullnull\227nullnullnull\227nullnullnull\227nullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnull\227nullnullnull\227nullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull!");
    }

    @Test
    public void test02793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02793");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd!", "LL!!LL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull!" + "'", str2, "~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02794");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!\200}}`!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!]]!", "LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!\200}}`!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!]]!" + "'", str2, "!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!\200}}`!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!]]!");
    }

    @Test
    public void test02795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02795");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\336\300\300\300\300\336\300\300!", "FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02796");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200null}\200\200null}\200\200\230\230null}\200\200null}\200\200\230\230~}\200\200~}\200\200null}\200\200null}\200\200\230\230null}\200\200null}\200\200\230\230~}\200\200~}\200\200null}\200\200null}\200\200\230\230null}\200\200null}\200\200\230\230~}\200\200~}\200\200null}\200\200null}\200\200\230\230null}\200\200null}\200\200\230\230~}\200\200~}\200\200null}\200\200null}\200\200\230\230null}\200\200null}\200\200\230\230~}\200\200~}\200\200null}\200\200null}\200\200\230\230null}\200\200null}\200\200\230\230~}\200\200~}\200\200null}\200\200null}\200\200\230\230null}\200\200null}\200\200\230\230~}\200\200~}\200\200null}\200\200null}\200\200\230\230null}\200\200null}\200\200\230\230!", "\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!!\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!!\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!!\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!!\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230!" + "'", str2, "~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230!");
    }

    @Test
    public void test02797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02797");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02798");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}~\200\200}~\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL}~\200\200}~\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!", "TTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRR!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200TTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRR}~\200\200}~\200\200TTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRR!" + "'", str2, "}~\200\200}~\200\200TTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRR}~\200\200}~\200\200TTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRR!");
    }

    @Test
    public void test02799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02799");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "LLUULLUULLUULLUULLUULLUULLUULLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02800");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!!", "\u0170null!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "bceebceebceebceebceebceebceebcee!!bceebceebceebceebceebceebceebcee!!!!bceebceebceebceebceebceebceebcee!!bceebceebceebceebceebceebceebcee!!!!bceebceebceebceebceebceebceebcee!!bceebceebceebceebceebceebceebcee!!!!bceebceebceebceebceebceebceebcee!!bceebceebceebceebceebceebceebcee!!!!bceebceebceebceebceebceebceebcee!!bceebceebceebceebceebceebceebcee!!!!bceebceebceebceebceebceebceebcee!!bceebceebceebceebceebceebceebcee!!!!bceebceebceebceebceebceebceebcee!!bceebceebceebceebceebceebceebcee!!!!bceebceebceebceebceebceebceebcee!!bceebceebceebceebceebceebceebcee!!!!!" + "'", str2, "bceebceebceebceebceebceebceebcee!!bceebceebceebceebceebceebceebcee!!!!bceebceebceebceebceebceebceebcee!!bceebceebceebceebceebceebceebcee!!!!bceebceebceebceebceebceebceebcee!!bceebceebceebceebceebceebceebcee!!!!bceebceebceebceebceebceebceebcee!!bceebceebceebceebceebceebceebcee!!!!bceebceebceebceebceebceebceebcee!!bceebceebceebceebceebceebceebcee!!!!bceebceebceebceebceebceebceebcee!!bceebceebceebceebceebceebceebcee!!!!bceebceebceebceebceebceebceebcee!!bceebceebceebceebceebceebceebcee!!!!bceebceebceebceebceebceebceebcee!!bceebceebceebceebceebceebceebcee!!!!!");
    }

    @Test
    public void test02801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02801");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn!", "\u0346\u0348\u0348\u0348\u0108\u0106\u0106\u0106\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!" + "'", str2, "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test02802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02802");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226!!UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226!!!", "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226!!LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226!!!" + "'", str2, "LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226!!LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226!!!");
    }

    @Test
    public void test02803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02803");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!!", "RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!!" + "'", str2, "rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!!");
    }

    @Test
    public void test02804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02804");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!", "!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!" + "'", str2, "\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!");
    }

    @Test
    public void test02805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02805");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220!", "nullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220!" + "'", str2, "\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220!");
    }

    @Test
    public void test02806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02806");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368LL!!LL!!\200\200\u0346\u0348\u0348!", "\u014e\u014e\u014e\u014e!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368nullnull!!nullnull!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368nullnull!!nullnull!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test02807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02807");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("unllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunll!", "\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02808");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!!", "]!E!!!E!!!E!!!E!!!E!!]]!E!!!E!!]]!E!!!E!!]]!E!!!E!!]]]!E!!!E!!!E!!!E!!!E!!]]!E!!!E!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test02809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02809");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "`LLUULLUULLUU`LLUULLUULLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test02810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02810");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!", "nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LUUULUUULUUULUUULUUULUUULUUULUUU!" + "'", str2, "LUUULUUULUUULUUULUUULUUULUUULUUU!");
    }

    @Test
    public void test02811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02811");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null\256nullnullnull!", "\276\336\266\266~\326\326\276\336\266\266~\326\326!!\276\336\266\266~\326\326\276\336\266\266~\326\326!!\276\336\266\266~\326\326\276\336\266\266~\326\326\276\336\266\266~\326\326\276\336\266\266~\326\326!!\276\336\266\266~\326\326\276\336\266\266~\326\326!!\276\336\266\266~\326\326\276\336\266\266~\326\326!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\256nullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnull\256nullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02812");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!" + "'", str2, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
    }

    @Test
    public void test02813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02813");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN!", "ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\u011d\u011dnullnull\275\275\276\u011d\u011dnullnull\275\275\u011d\u011d\u011d\u011d\u011d\u011d\u011d\u011d!nullnull\276\u011d\u011dnullnull\275\275\276\u011d\u011dnullnull\275\275\u011d\u011d\u011d\u011d\u011d\u011d\u011d\u011d!nullnull\276\u011d\u011dnullnull\275\275\276\u011d\u011dnullnull\275\275\u011d\u011d\u011d\u011d\u011d\u011d\u011d\u011d!nullnull\276\u011d\u011dnullnull\275\275\276\u011d\u011dnullnull\275\275\u011d\u011d\u011d\u011d\u011d\u011d\u011d\u011d!nullnull\276\u011d\u011dnullnull\275\275\276\u011d\u011dnullnull\275\275\u011d\u011d\u011d\u011d\u011d\u011d\u011d\u011d!nullnull\276\u011d\u011dnullnull\275\275\276\u011d\u011dnullnull\275\275\u011d\u011d\u011d\u011d\u011d\u011d\u011d\u011d!nullnull\276\u011d\u011dnullnull\275\275\276\u011d\u011dnullnull\275\275\u011d\u011d\u011d\u011d\u011d\u011d\u011d\u011d!nullnull\276\u011d\u011dnullnull\275\275\276\u011d\u011dnullnull\275\275\u011d\u011d\u011d\u011d\u011d\u011d\u011d\u011d!nullnull!" + "'", str2, "\276\u011d\u011dnullnull\275\275\276\u011d\u011dnullnull\275\275\u011d\u011d\u011d\u011d\u011d\u011d\u011d\u011d!nullnull\276\u011d\u011dnullnull\275\275\276\u011d\u011dnullnull\275\275\u011d\u011d\u011d\u011d\u011d\u011d\u011d\u011d!nullnull\276\u011d\u011dnullnull\275\275\276\u011d\u011dnullnull\275\275\u011d\u011d\u011d\u011d\u011d\u011d\u011d\u011d!nullnull\276\u011d\u011dnullnull\275\275\276\u011d\u011dnullnull\275\275\u011d\u011d\u011d\u011d\u011d\u011d\u011d\u011d!nullnull\276\u011d\u011dnullnull\275\275\276\u011d\u011dnullnull\275\275\u011d\u011d\u011d\u011d\u011d\u011d\u011d\u011d!nullnull\276\u011d\u011dnullnull\275\275\276\u011d\u011dnullnull\275\275\u011d\u011d\u011d\u011d\u011d\u011d\u011d\u011d!nullnull\276\u011d\u011dnullnull\275\275\276\u011d\u011dnullnull\275\275\u011d\u011d\u011d\u011d\u011d\u011d\u011d\u011d!nullnull\276\u011d\u011dnullnull\275\275\276\u011d\u011dnullnull\275\275\u011d\u011d\u011d\u011d\u011d\u011d\u011d\u011d!nullnull!");
    }

    @Test
    public void test02814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02814");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u03c0\u03c0\u03be\u03be\u03c0\u03c0\u03be\u03be\u03c0\u03c0\u03be\u03be\u03c0\u03c0\u03be\u03be}}!", "UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!" + "'", str2, "nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!");
    }

    @Test
    public void test02815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02815");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!N!", "~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!" + "'", str2, "!null!");
    }

    @Test
    public void test02816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02816");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02817");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02818");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02819");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016eUU!!!!!!!", "UNLLUNLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "eHHHHnullEEHnullEE!!!!eHHHHnullEEHnullEE!!!!!!eHHHHnullEEHnullEE!!!!eHHHHnullEEHnullEE!!!!!!eHHHHnullEEHnullEE!!!!eHHHHnullEEHnullEE!!!!!!eHHHHnullEEHnullEE!!!!eHHHHnullEEHnullEE!!!!!!eHHHHnullEEHnullEE!!!!eHHHHnullEEHnullEE!!!!!!eHHHHnullEEHnullEE!!!!eHHHHnullEEHnullEE!!!!!!eHHHHnullEEHnullEE!!!!eHHHHnullEEHnullEE!!!!!!eHHHHnullEEHnullEE!!!!eHHHHnullEEHnullEE!!!!!!!" + "'", str2, "eHHHHnullEEHnullEE!!!!eHHHHnullEEHnullEE!!!!!!eHHHHnullEEHnullEE!!!!eHHHHnullEEHnullEE!!!!!!eHHHHnullEEHnullEE!!!!eHHHHnullEEHnullEE!!!!!!eHHHHnullEEHnullEE!!!!eHHHHnullEEHnullEE!!!!!!eHHHHnullEEHnullEE!!!!eHHHHnullEEHnullEE!!!!!!eHHHHnullEEHnullEE!!!!eHHHHnullEEHnullEE!!!!!!eHHHHnullEEHnullEE!!!!eHHHHnullEEHnullEE!!!!!!eHHHHnullEEHnullEE!!!!eHHHHnullEEHnullEE!!!!!!!");
    }

    @Test
    public void test02820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02820");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!nullnullnullnull!!!", "L!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!lll!lll!lll!lll!!!" + "'", str2, "!!!lll!lll!lll!lll!!!");
    }

    @Test
    public void test02821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02821");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("porrporr!!porrporr!!porrporr!!porrporr!!porrporr!!porrporr!!porrporr!!porrporr!!!", "\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!!" + "'", str2, "LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!!");
    }

    @Test
    public void test02822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02822");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NNUUNNUU!!NNUUNNUU!!NNUUNNUUNNUUNNUU!!NNUUNNUU!!NNUUNNUU!", "!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02823");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!", "\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!" + "'", str2, "!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!");
    }

    @Test
    public void test02824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02824");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UNLLUNLL!!UNLLUNLL!!!", "!e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test02825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02825");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!", "NULLNULLUNLLUNLLNULLNULLUNLLUNLLNULLNULLUNLLUNLLNULLNULLUNLLUNLLNULLNULLUNLLUNLLNULLNULLUNLLUNLLNULLNULLUNLLUNLLNULLNULLUNLLUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!" + "'", str2, "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!");
    }

    @Test
    public void test02826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02826");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!\254\254!!\254\254!!!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!!!\254\254!!\254\254!", "~~!!U~~~U~~~U~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!U~~~U~~~U~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\254\254!!\254\254!!!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!!!\254\254!!\254\254!" + "'", str2, "!!\254\254!!\254\254!!!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!!!\254\254!!\254\254!");
    }

    @Test
    public void test02827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02827");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("P\220NN\200}}`P\220NN]]!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\220nullnull\200}}`null\220nullnull]]!" + "'", str2, "null\220nullnull\200}}`null\220nullnull]]!");
    }

    @Test
    public void test02828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02828");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LL!!LL!!!", "\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0368\u0368\u0368\u0368!!!" + "'", str2, "\u0368\u0368\u0368\u0368!!!");
    }

    @Test
    public void test02829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02829");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("H!~~H!~~H!~~H!~~H!~~H!~~H!~~H!~~nullnullnullnullnullnullnullnullH!~~H!~~H!~~H!~~H!~~H!~~H!~~H!~~nullnullnullnullnullnullnullnull!", "\275HHH\276H\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullF!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullF!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02830");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull!", "EEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EE!!EEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EE!!EEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EE!!EEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EE!!EEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EE!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EEEEEEEE!" + "'", str2, "EEEEEEEE!");
    }

    @Test
    public void test02831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02831");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d!", "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!" + "'", str2, "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test02832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02832");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!", "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\225\230\230UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\225\230\230UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\225\230\230UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\225\230\230\200}}`UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\225\230\230UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\225\230\230UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\225\230\230UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!" + "'", str2, "!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!");
    }

    @Test
    public void test02833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02833");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226!!null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02834");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225!", "!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225!" + "'", str2, "\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225!");
    }

    @Test
    public void test02835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02835");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("TT!!TT!!!", "\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0420\u0420\u0420\u0420!!!" + "'", str2, "\u0420\u0420\u0420\u0420!!!");
    }

    @Test
    public void test02836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02836");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!", "UU^^\225\230\230UU^^\225\230\230UU^^\225\230\230UU^^\225\230\230\200}}`UU^^\225\230\230UU^^\225\230\230UU^^\225\230\230UU^^\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230!!\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230!!\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230!!\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230!!\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230!" + "'", str2, "\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230!!\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230!!\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230!!\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230!!\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230!");
    }

    @Test
    public void test02837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02837");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "\u02cc\u02ce\u02ce\u02ce\u02cc\u02ce\u02ce\u02ce\u02cc\u02ce\u02ce\u02ce\u02cc\u02ce\u02ce\u02ce\200\u02cc\u02ce\u02ce\u02ce\u02cc\u02ce\u02ce\u02ce\u02cc\u02ce\u02ce\u02ce\u02cc\u02ce\u02ce\u02ce]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test02838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02838");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "\u03c0\u03c0\u03be\u03be\u03c0\u03c0\u03be\u03be\u03c0\u03c0\u03be\u03be\u03c0\u03c0\u03be\u03be}}!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02839");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHH!", "}~\200\200}~\200\200FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHH}~\200\200}~\200\200FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200!" + "'", str2, "HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200!");
    }

    @Test
    public void test02840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02840");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!", "\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276V\275\275\276V\275\275\276V\275\275\276V\275\275\276V\275\275\276V\275\275\276V\275\275\276V\275\275!" + "'", str2, "\276V\275\275\276V\275\275\276V\275\275\276V\275\275\276V\275\275\276V\275\275\276V\275\275\276V\275\275!");
    }

    @Test
    public void test02841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02841");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("L~UUL~UU!!L~UUL~UU!!L~UUL~UUL~UUL~UU!!L~UUL~UU!!L~UUL~UU!", "\u0366\u0365\u0368\u0368LL!!LL!!\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~nullnull!~nullnull!!!~nullnull!~nullnull!!!~nullnull!~nullnull!~nullnull!~nullnull!!!~nullnull!~nullnull!!!~nullnull!~nullnull!" + "'", str2, "!~nullnull!~nullnull!!!~nullnull!~nullnull!!!~nullnull!~nullnull!~nullnull!~nullnull!!!~nullnull!~nullnull!!!~nullnull!~nullnull!");
    }

    @Test
    public void test02842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02842");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253!", "nullnull!!\200~~nullnull!!\200~~nullnull!!nullnull!!nullnull!!\200~~nullnull!!\200~~nullnull!!nullnull!!!!nullnull!!\200~~nullnull!!\200~~nullnull!!nullnull!!nullnull!!\200~~nullnull!!\200~~nullnull!!nullnull!!!!nullnull!!\200~~nullnull!!\200~~nullnull!!nullnull!!nullnull!!\200~~nullnull!!\200~~nullnull!!nullnull!!nullnull!!\200~~nullnull!!\200~~nullnull!!nullnull!!nullnull!!\200~~nullnull!!\200~~nullnull!!nullnull!!!!nullnull!!\200~~nullnull!!\200~~nullnull!!nullnull!!nullnull!!\200~~nullnull!!\200~~nullnull!!nullnull!!!!nullnull!!\200~~nullnull!!\200~~nullnull!!nullnull!!nullnull!!\200~~nullnull!!\200~~nullnull!!nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL\253\253!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL\253\253!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL\253\253!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL\253\253!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL\253\253!" + "'", str2, "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL\253\253!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL\253\253!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL\253\253!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL\253\253!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL\253\253!");
    }

    @Test
    public void test02843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02843");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!");
    }

    @Test
    public void test02844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02844");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLLLnullnullnullnullLLLLnullnull!", "]U!!]U!!!!]U!!]U!!!!]U!!]U!!]U!!]U!!!!]U!!]U!!!!]U!!]U!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUU!]UU!]UU!]UU!]UUUUUU!]UU!]UU!" + "'", str2, "UUUU!]UU!]UU!]UU!]UUUUUU!]UU!]UU!");
    }

    @Test
    public void test02845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02845");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!", "JLLLJLLLJLLLJLLLJLLLJLLLJLLLJLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!!" + "'", str2, "JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!!");
    }

    @Test
    public void test02846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02846");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\352\356\356\356\352\356\356\356\352\356\356\356\352\356\356\356\200}}`\352\356\356\356\352\356\356\356\352\356\356\356\352\356\356\356]]!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test02847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02847");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LUUULUUULUUULUUU\200}}`LUUULUUULUUULUUU]]!", "\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275!!!\275!!!\275!!!\275!!!\200}}`\275!!!\275!!!\275!!!\275!!!]]!" + "'", str2, "\275!!!\275!!!\275!!!\275!!!\200}}`\275!!!\275!!!\275!!!\275!!!]]!");
    }

    @Test
    public void test02848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02848");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!", "]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!" + "'", str2, "}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!");
    }

    @Test
    public void test02849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02849");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368!", "HFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFF!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368!" + "'", str2, "\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368!");
    }

    @Test
    public void test02850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02850");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}N\200\200}N\200\200}N\200\200}N\200\200ULLLULLLULLLULLL}N\200\200}N\200\200}N\200\200}N\200\200ULLLULLL!", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0108\200\200\u0108\200\200\u0108\200\200\u0108\200\200\u0108\200\200\u0108\200\200\u0108\200\200\u0108\200\200nullnullnullnullnullnullnullnull!" + "'", str2, "\u0108\200\200\u0108\200\200\u0108\200\200\u0108\200\200\u0108\200\200\u0108\200\200\u0108\200\200\u0108\200\200nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02851");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014f\u014f!", "!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]\200}}`!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull!" + "'", str2, "nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test02852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02852");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!!", "\253\254\256\256nullnullnullnull\253\254\256\256nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LULLLULL!!LULLLULL!!LULLLULL!!LULLLULL!!LULLLULL!!LULLLULL!!LULLLULL!!LULLLULL!!!" + "'", str2, "LULLLULL!!LULLLULL!!LULLLULL!!LULLLULL!!LULLLULL!!LULLLULL!!LULLLULL!!LULLLULL!!!");
    }

    @Test
    public void test02853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02853");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLL!", "xmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxx!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "XNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMM!" + "'", str2, "XNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMM!");
    }

    @Test
    public void test02854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02854");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NLLLNLLLNLLLNLLL\200}}`NLLLNLLLNLLLNLLL]]!", "~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}}}}}}}}}}}}}}}}\200}}`}}}}}}}}}}}}}}}}]]!" + "'", str2, "}}}}}}}}}}}}}}}}\200}}`}}}}}}}}}}}}}}}}]]!");
    }

    @Test
    public void test02855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02855");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!~nullnull!~nullnull!!!~nullnull!~nullnull!!!~nullnull!~nullnull!~nullnull!~nullnull!!!~nullnull!~nullnull!!!~nullnull!~nullnull!", "\u0366\u0365\u0368\u0368\335\340\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~lnulluulnulluu!~lnulluulnulluu!!!~lnulluulnulluu!~lnulluulnulluu!!!~lnulluulnulluu!~lnulluulnulluu!~lnulluulnulluu!~lnulluulnulluu!!!~lnulluulnulluu!~lnulluulnulluu!!!~lnulluulnulluu!~lnulluulnulluu!" + "'", str2, "!~lnulluulnulluu!~lnulluulnulluu!!!~lnulluulnulluu!~lnulluulnulluu!!!~lnulluulnulluu!~lnulluulnulluu!~lnulluulnulluu!~lnulluulnulluu!!!~lnulluulnulluu!~lnulluulnulluu!!!~lnulluulnulluu!~lnulluulnulluu!");
    }

    @Test
    public void test02856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02856");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!!wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!!wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!!wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!!wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!", "\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038enullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!" + "'", str2, "LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!");
    }

    @Test
    public void test02857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02857");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230!", "LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200\u0106\u0106\u0106\u0106\u0106\u0106\230\230\u0106\u0106\u0106\u0106\u0106\u0106\230\230~}\200\200~}\200\200\u0106\u0106\u0106\u0106\u0106\u0106\230\230\u0106\u0106\u0106\u0106\u0106\u0106\230\230~}\200\200~}\200\200\u0106\u0106\u0106\u0106\u0106\u0106\230\230\u0106\u0106\u0106\u0106\u0106\u0106\230\230~}\200\200~}\200\200\u0106\u0106\u0106\u0106\u0106\u0106\230\230\u0106\u0106\u0106\u0106\u0106\u0106\230\230~}\200\200~}\200\200\u0106\u0106\u0106\u0106\u0106\u0106\230\230\u0106\u0106\u0106\u0106\u0106\u0106\230\230~}\200\200~}\200\200\u0106\u0106\u0106\u0106\u0106\u0106\230\230\u0106\u0106\u0106\u0106\u0106\u0106\230\230~}\200\200~}\200\200\u0106\u0106\u0106\u0106\u0106\u0106\230\230\u0106\u0106\u0106\u0106\u0106\u0106\230\230~}\200\200~}\200\200\u0106\u0106\u0106\u0106\u0106\u0106\230\230\u0106\u0106\u0106\u0106\u0106\u0106\230\230!" + "'", str2, "~}\200\200~}\200\200\u0106\u0106\u0106\u0106\u0106\u0106\230\230\u0106\u0106\u0106\u0106\u0106\u0106\230\230~}\200\200~}\200\200\u0106\u0106\u0106\u0106\u0106\u0106\230\230\u0106\u0106\u0106\u0106\u0106\u0106\230\230~}\200\200~}\200\200\u0106\u0106\u0106\u0106\u0106\u0106\230\230\u0106\u0106\u0106\u0106\u0106\u0106\230\230~}\200\200~}\200\200\u0106\u0106\u0106\u0106\u0106\u0106\230\230\u0106\u0106\u0106\u0106\u0106\u0106\230\230~}\200\200~}\200\200\u0106\u0106\u0106\u0106\u0106\u0106\230\230\u0106\u0106\u0106\u0106\u0106\u0106\230\230~}\200\200~}\200\200\u0106\u0106\u0106\u0106\u0106\u0106\230\230\u0106\u0106\u0106\u0106\u0106\u0106\230\230~}\200\200~}\200\200\u0106\u0106\u0106\u0106\u0106\u0106\230\230\u0106\u0106\u0106\u0106\u0106\u0106\230\230~}\200\200~}\200\200\u0106\u0106\u0106\u0106\u0106\u0106\230\230\u0106\u0106\u0106\u0106\u0106\u0106\230\230!");
    }

    @Test
    public void test02858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02858");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!", "~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!" + "'", str2, "!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!");
    }

    @Test
    public void test02859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02859");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!!", "\275XXX\275XXX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!!" + "'", str2, "nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!!");
    }

    @Test
    public void test02860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02860");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UULLUULLLLUULLUUUULLUULLLLUULLUUUULLUULLLLUULLUUUULLUULLLLUULLUUUULLUULLLLUULLUUUULLUULLLLUULLUUUULLUULLLLUULLUUUULLUULLLLUULLUU!", "L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035bnullnull!" + "'", str2, "\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035bnullnull!");
    }

    @Test
    public void test02861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02861");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("u]uuu]uu!!u]uuu]uu!!u]uuu]uuu]uuu]uu!!u]uuu]uu!!u]uuu]uu!", "!\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnullnull]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnull!" + "'", str2, "null]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnullnull]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnull!");
    }

    @Test
    public void test02862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02862");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440nullnull!", "`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016enullnull!" + "'", str2, "\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016enullnull!");
    }

    @Test
    public void test02863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02863");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnull\255\256\260\260\255\256\260\260nullnull\255\256\260\260\255\256\260\260nullnull\255\256\260\260\255\256\260\260nullnull\255\256\260\260\255\256\260\260nullnull\255\256\260\260\255\256\260\260nullnull\255\256\260\260\255\256\260\260nullnull\255\256\260\260\255\256\260\260nullnull\255\256\260\260\255\256\260\260!", "\u0366\u0365\u0368\u0368nullnull!!nullnull!!\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "stvvstvv\255\256\260\260\255\256\260\260stvvstvv\255\256\260\260\255\256\260\260stvvstvv\255\256\260\260\255\256\260\260stvvstvv\255\256\260\260\255\256\260\260stvvstvv\255\256\260\260\255\256\260\260stvvstvv\255\256\260\260\255\256\260\260stvvstvv\255\256\260\260\255\256\260\260stvvstvv\255\256\260\260\255\256\260\260!" + "'", str2, "stvvstvv\255\256\260\260\255\256\260\260stvvstvv\255\256\260\260\255\256\260\260stvvstvv\255\256\260\260\255\256\260\260stvvstvv\255\256\260\260\255\256\260\260stvvstvv\255\256\260\260\255\256\260\260stvvstvv\255\256\260\260\255\256\260\260stvvstvv\255\256\260\260\255\256\260\260stvvstvv\255\256\260\260\255\256\260\260!");
    }

    @Test
    public void test02864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02864");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!", "!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\276\276\276null\276\276\276null\276\276\276null\276\276\276null\276\276\276null\276\276\276null\276\276\276null\276\276\276!" + "'", str2, "null\276\276\276null\276\276\276null\276\276\276null\276\276\276null\276\276\276null\276\276\276null\276\276\276null\276\276\276!");
    }

    @Test
    public void test02865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02865");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test02866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02866");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214!", "nullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\214\214\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\214\214\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\214\214\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\214\214\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\214\214\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\214\214\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\214\214\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\214\214!" + "'", str2, "\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\214\214\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\214\214\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\214\214\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\214\214\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\214\214\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\214\214\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\214\214\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\214\214!");
    }

    @Test
    public void test02867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02867");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016enullnull!", "\u0346\u0348\u0348\u0348\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320!" + "'", str2, "\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320!");
    }

    @Test
    public void test02868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02868");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "NNNNNNNNNNNNNNNN\200}}`NNNNNNNNNNNNNNNN]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn!" + "'", str2, "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn!");
    }

    @Test
    public void test02869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02869");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\226!", "LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\226!" + "'", str2, "!\226!");
    }

    @Test
    public void test02870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02870");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275HHH\276H\275\275!", "XXXXXXXXXXXXXXXXXXXXXXXXXXXX!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullnull\276null\275\275!" + "'", str2, "\275nullnullnull\276null\275\275!");
    }

    @Test
    public void test02871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02871");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!", "~}\200\200~}\200\200NNLLNNLL~}\200\200~}\200\200NNLLNNLL~}\200\200~}\200\200NNLLNNLL~}\200\200~}\200\200NNLLNNLL~}\200\200~}\200\200NNLLNNLL~}\200\200~}\200\200NNLLNNLL~}\200\200~}\200\200NNLLNNLL~}\200\200~}\200\200NNLLNNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!" + "'", str2, "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test02872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02872");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u02cc\u02ce\u02ce\u02ce\u02cc\u02ce\u02ce\u02ce\u02cc\u02ce\u02ce\u02ce\u02cc\u02ce\u02ce\u02ce\200\u02cc\u02ce\u02ce\u02ce\u02cc\u02ce\u02ce\u02ce\u02cc\u02ce\u02ce\u02ce\u02cc\u02ce\u02ce\u02ce]]!", "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnull!!!nullnullnullnull!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test02873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02873");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225!", "\340\340!!nullnullnull\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!nullnullnull\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276\300\300\275\276\300\300\225\225\275\276\300\300\275\276\300\300\225\225\275\276\300\300\275\276\300\300\225\225\275\276\300\300\275\276\300\300\225\225\275\276\300\300\275\276\300\300\225\225\275\276\300\300\275\276\300\300\225\225\275\276\300\300\275\276\300\300\225\225\275\276\300\300\275\276\300\300\225\225!" + "'", str2, "\275\276\300\300\275\276\300\300\225\225\275\276\300\300\275\276\300\300\225\225\275\276\300\300\275\276\300\300\225\225\275\276\300\300\275\276\300\300\225\225\275\276\300\300\275\276\300\300\225\225\275\276\300\300\275\276\300\300\225\225\275\276\300\300\275\276\300\300\225\225\275\276\300\300\275\276\300\300\225\225!");
    }

    @Test
    public void test02874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02874");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn!", "\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!" + "'", str2, "!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!");
    }

    @Test
    public void test02875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02875");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("`RRPPRRPPRRPP`RRPPRRPPRRPP!", "!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!\200}}`!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`UU!!UU!!UU!!`UU!!UU!!UU!!!" + "'", str2, "`UU!!UU!!UU!!`UU!!UU!!UU!!!");
    }

    @Test
    public void test02876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02876");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!!", "nullnullnullnullnullnullnullnullu\253llu\253llnullnullnullnullnullnullnullnullu\253llu\253ll!!nullnullnullnullnullnullnullnullu\253llu\253llnullnullnullnullnullnullnullnullu\253llu\253ll!!nullnullnullnullnullnullnullnullu\253llu\253llnullnullnullnullnullnullnullnullu\253llu\253llnullnullnullnullnullnullnullnullu\253llu\253llnullnullnullnullnullnullnullnullu\253llu\253ll!!nullnullnullnullnullnullnullnullu\253llu\253llnullnullnullnullnullnullnullnullu\253llu\253ll!!nullnullnullnullnullnullnullnullu\253llu\253llnullnullnullnullnullnullnullnullu\253llu\253ll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!!" + "'", str2, "\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!!");
    }

    @Test
    public void test02877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02877");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ`JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ!" + "'", str2, "`JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ`JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ!");
    }

    @Test
    public void test02878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02878");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02879");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276!!!\276\276!!\276\276!!\276\276!!\276\276!!\276!!!\276\276!!\276\276!!!", "\275LLL\275LLL\275LLL\275LLLLL\275\275LL\275\275LL\275\275LL\275\275\275LLL\275LLL\275LLL\275LLLLL\275\275LL\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!!!\276\276!!\276\276!!\276\276!!\276\276!!\276!!!\276\276!!\276\276!!!" + "'", str2, "\276!!!\276\276!!\276\276!!\276\276!!\276\276!!\276!!!\276\276!!\276\276!!!");
    }

    @Test
    public void test02880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02880");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!", "nullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "TT!!TT!!TT!!TT!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!" + "'", str2, "TT!!TT!!TT!!TT!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!");
    }

    @Test
    public void test02881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02881");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("llllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLL!", "~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02882");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}~\200\200}~\200\200U^LLU^LL}~\200\200}~\200\200U^LLU^LL!", "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200~^~~~^~~}~\200\200}~\200\200~^~~~^~~!" + "'", str2, "}~\200\200}~\200\200~^~~~^~~}~\200\200}~\200\200~^~~~^~~!");
    }

    @Test
    public void test02883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02883");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!", "LLUUL~~LLUUL~~LLUUL~~LLUUL~~LLUUL~~LLUUL~~LLUUL~~LLUUL~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!" + "'", str2, "\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!");
    }

    @Test
    public void test02884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02884");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!" + "'", str2, "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
    }

    @Test
    public void test02885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02885");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("HFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFF!", "\340nullnullnullnullnull\300\300nullnull\300\300!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LNNN!LNNNLNNNLNNN!LNNNLNNNLNNN!LNNNLNNNLNNN!LNNNLNNNLNNN!LNNNLNNNLNNN!LNNNLNNNLNNN!LNNNLNNNLNNN!LNNNLNNN!" + "'", str2, "LNNN!LNNNLNNNLNNN!LNNNLNNNLNNN!LNNNLNNNLNNN!LNNNLNNNLNNN!LNNNLNNNLNNN!LNNNLNNNLNNN!LNNNLNNNLNNN!LNNNLNNN!");
    }

    @Test
    public void test02886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02886");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("unllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnull!", "UU^^\225\230\230UU^^\225\230\230UU^^\225\230\230UU^^\225\230\230\200}}`UU^^\225\230\230UU^^\225\230\230UU^^\225\230\230UU^^\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!" + "'", str2, "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!");
    }

    @Test
    public void test02887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02887");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull!", "nullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRR!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200L!LLL!LLURRRURRRL!LLL!LLURRRURRR~}\200\200~}\200\200L!LLL!LLURRRURRRL!LLL!LLURRRURRR~}\200\200~}\200\200L!LLL!LLURRRURRRL!LLL!LLURRRURRR~}\200\200~}\200\200L!LLL!LLURRRURRRL!LLL!LLURRRURRR~}\200\200~}\200\200L!LLL!LLURRRURRRL!LLL!LLURRRURRR~}\200\200~}\200\200L!LLL!LLURRRURRRL!LLL!LLURRRURRR~}\200\200~}\200\200L!LLL!LLURRRURRRL!LLL!LLURRRURRR~}\200\200~}\200\200L!LLL!LLURRRURRRL!LLL!LLURRRURRR!" + "'", str2, "~}\200\200~}\200\200L!LLL!LLURRRURRRL!LLL!LLURRRURRR~}\200\200~}\200\200L!LLL!LLURRRURRRL!LLL!LLURRRURRR~}\200\200~}\200\200L!LLL!LLURRRURRRL!LLL!LLURRRURRR~}\200\200~}\200\200L!LLL!LLURRRURRRL!LLL!LLURRRURRR~}\200\200~}\200\200L!LLL!LLURRRURRRL!LLL!LLURRRURRR~}\200\200~}\200\200L!LLL!LLURRRURRRL!LLL!LLURRRURRR~}\200\200~}\200\200L!LLL!LLURRRURRRL!LLL!LLURRRURRR~}\200\200~}\200\200L!LLL!LLURRRURRRL!LLL!LLURRRURRR!");
    }

    @Test
    public void test02888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02888");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!", "nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!" + "'", str2, "!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!");
    }

    @Test
    public void test02889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02889");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!", "nullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u!ll!!!u!ll!!!u!ll!!!u!ll!!!u!ll!!!u!ll!!!u!ll!!!u!ll!!!!" + "'", str2, "u!ll!!!u!ll!!!u!ll!!!u!ll!!!u!ll!!!u!ll!!!u!ll!!!u!ll!!!!");
    }

    @Test
    public void test02890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02890");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d!!!", "\276V\275\275\276V\275\275\276V\275\275\276V\275\275\276V\275\275\276V\275\275\276V\275\275\276V\275\275!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "v\276\275\275null!nullnullnullnullv\276\275\275null!nullnullnullnull!!v\276\275\275null!nullnullnullnullv\276\275\275null!nullnullnullnull!!v\276\275\275null!nullnullnullnullv\276\275\275null!nullnullnullnull!!v\276\275\275null!nullnullnullnullv\276\275\275null!nullnullnullnull!!v\276\275\275null!nullnullnullnullv\276\275\275null!nullnullnullnull!!v\276\275\275null!nullnullnullnullv\276\275\275null!nullnullnullnull!!v\276\275\275null!nullnullnullnullv\276\275\275null!nullnullnullnull!!v\276\275\275null!nullnullnullnullv\276\275\275null!nullnullnullnull!!!" + "'", str2, "v\276\275\275null!nullnullnullnullv\276\275\275null!nullnullnullnull!!v\276\275\275null!nullnullnullnullv\276\275\275null!nullnullnullnull!!v\276\275\275null!nullnullnullnullv\276\275\275null!nullnullnullnull!!v\276\275\275null!nullnullnullnullv\276\275\275null!nullnullnullnull!!v\276\275\275null!nullnullnullnullv\276\275\275null!nullnullnullnull!!v\276\275\275null!nullnullnullnullv\276\275\275null!nullnullnullnull!!v\276\275\275null!nullnullnullnullv\276\275\275null!nullnullnullnull!!v\276\275\275null!nullnullnullnullv\276\275\275null!nullnullnullnull!!!");
    }

    @Test
    public void test02891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02891");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!l!", "\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0108!" + "'", str2, "\u0108!");
    }

    @Test
    public void test02892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02892");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NNNNNNNNNNNNNNNN\225\230\230NNNNNNNNNNNNNNNN\225\230\230NNNNNNNNNNNNNNNN\225\230\230NNNNNNNNNNNNNNNN\225\230\230\200}}`NNNNNNNNNNNNNNNN\225\230\230NNNNNNNNNNNNNNNN\225\230\230NNNNNNNNNNNNNNNN\225\230\230NNNNNNNNNNNNNNNN\225\230\230]]!", "LUUULUUULUUULUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUULUUULUUULUUULUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230]]!");
    }

    @Test
    public void test02893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02893");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```!", "!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```!" + "'", str2, "UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```!");
    }

    @Test
    public void test02894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02894");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\275nullnullnull\275nullnullnullnullnull\275nullnullnull\275nullnullnullnullnull\275nullnullnull\275nullnullnullnullnull\275nullnullnull\275nullnullnullnullnull\275nullnullnull\275nullnullnullnullnull\275nullnullnull\275nullnullnullnullnull\275nullnullnull\275nullnullnullnullnull\275nullnullnull\275nullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02895");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300!!\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300!!\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300!!\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300!!\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300!", "NLLLNLLLLLNLLLNLLLLL!!NLLLNLLLLLNLLLNLLLLL!!NLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLL!!NLLLNLLLLLNLLLNLLLLL!!NLLLNLLLLLNLLLNLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "llLL~llLLllLLllLL~llLLllLL!!llLL~llLLllLLllLL~llLLllLL!!llLL~llLLllLLllLL~llLLllLLllLL~llLLllLLllLL~llLLllLL!!llLL~llLLllLLllLL~llLLllLL!!llLL~llLLllLLllLL~llLLllLL!" + "'", str2, "llLL~llLLllLLllLL~llLLllLL!!llLL~llLLllLLllLL~llLLllLL!!llLL~llLLllLLllLL~llLLllLLllLL~llLLllLLllLL~llLLllLL!!llLL~llLLllLLllLL~llLLllLL!!llLL~llLLllLLllLL~llLLllLL!");
    }

    @Test
    public void test02896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02896");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!ll\340\340ll\340\340!!ll\340\340ll\340\340!!ll\340\340ll\340\340!!ll\340\340ll\340\340!!ll\340\340ll\340\340!!ll\340\340ll\340\340!!ll\340\340ll\340\340!!ll\340\340ll\340\340!", "!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!!!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!!!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!!!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!!!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\336\336\336\336\336\336\336\336!!\336\336\336\336\336\336\336\336!!\336\336\336\336\336\336\336\336!!\336\336\336\336\336\336\336\336!!\336\336\336\336\336\336\336\336!!\336\336\336\336\336\336\336\336!!\336\336\336\336\336\336\336\336!!\336\336\336\336\336\336\336\336!" + "'", str2, "!!\336\336\336\336\336\336\336\336!!\336\336\336\336\336\336\336\336!!\336\336\336\336\336\336\336\336!!\336\336\336\336\336\336\336\336!!\336\336\336\336\336\336\336\336!!\336\336\336\336\336\336\336\336!!\336\336\336\336\336\336\336\336!!\336\336\336\336\336\336\336\336!");
    }

    @Test
    public void test02897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02897");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275nullnullnull\276null\275\275!", "~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\335\336\340\340\335\336\340\340\335\336\340\340\276\335\336\340\340\275\275!" + "'", str2, "\275\335\336\340\340\335\336\340\340\335\336\340\340\276\335\336\340\340\275\275!");
    }

    @Test
    public void test02898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02898");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02899");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170nullnull!", "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02900");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL!", "^```^```^```^```^```^```^```^```^```^```\226XXXX\230\230\226XXXX\230\230^```^```\226XXXX\230\230\226XXXX\230\230^```^```^```^```^```^```^```^```^```^```\226XXXX\230\230\226XXXX\230\230^```^```\226XXXX\230\230\226XXXX\230\230^```^```^```^```^```^```^```^```^```^```\226XXXX\230\230\226XXXX\230\230^```^```\226XXXX\230\230\226XXXX\230\230^```^```^```^```^```^```^```^```^```^```\226XXXX\230\230\226XXXX\230\230^```^```\226XXXX\230\230\226XXXX\230\230^```^```^```^```^```^```^```^```^```^```\226XXXX\230\230\226XXXX\230\230^```^```\226XXXX\230\230\226XXXX\230\230^```^```^```^```^```^```^```^```^```^```\226XXXX\230\230\226XXXX\230\230^```^```\226XXXX\230\230\226XXXX\230\230^```^```^```^```^```^```^```^```^```^```\226XXXX\230\230\226XXXX\230\230^```^```\226XXXX\230\230\226XXXX\230\230^```^```^```^```^```^```^```^```^```^```\226XXXX\230\230\226XXXX\230\230^```^```\226XXXX\230\230\226XXXX\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull!" + "'", str2, "\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull!");
    }

    @Test
    public void test02901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02901");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]]]]]]]]!!]]]]]]]]!!]]]]]]]]]]]]]]]]!!]]]]]]]]!!]]]]]]]]!", "LULLLULL!!LULLLULL!!LULLLULLLULLLULL!!LULLLULL!!LULLLULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]]]]]]]!!]]]]]]]]!!]]]]]]]]]]]]]]]]!!]]]]]]]]!!]]]]]]]]!" + "'", str2, "]]]]]]]]!!]]]]]]]]!!]]]]]]]]]]]]]]]]!!]]]]]]]]!!]]]]]]]]!");
    }

    @Test
    public void test02902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02902");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!" + "'", str2, "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!");
    }

    @Test
    public void test02903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02903");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]!", "LLUUL~~LLUUL~~LLUUL~~LLUUL~~LLUUL~~LLUUL~~LLUUL~~LLUUL~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]!" + "'", str2, "\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]!");
    }

    @Test
    public void test02904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02904");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]^``]^``!!]^``]^``!!]^``]^``]^``]^``!!]^``]^``!!]^``]^``!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]^``]^``!!]^``]^``!!]^``]^``]^``]^``!!]^``]^``!!]^``]^``!" + "'", str2, "]^``]^``!!]^``]^``!!]^``]^``]^``]^``!!]^``]^``!!]^``]^``!");
    }

    @Test
    public void test02905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02905");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!!", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!!" + "'", str2, "\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!!");
    }

    @Test
    public void test02906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02906");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!", "\256\254\254\254\256\254\254\254\256\254\254\254\256\254\254\254\256\254\254\254\256\254\254\254\256\254\254\254\256\254\254\254!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!" + "'", str2, "!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!");
    }

    @Test
    public void test02907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02907");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````!", "\u0108\200\200\u0108\200\200\u0108\200\200\u0108\200\200\u0108\200\200\u0108\200\200\u0108\200\200\u0108\200\200nullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300````\300\300``\300\300````\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300````\300\300``\300\300````\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300````\300\300``\300\300````\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300````\300\300``\300\300````\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300````\300\300``\300\300````\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300````\300\300``\300\300````\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300````\300\300``\300\300````\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300````\300\300``\300\300````!" + "'", str2, "\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300````\300\300``\300\300````\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300````\300\300``\300\300````\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300````\300\300``\300\300````\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300````\300\300``\300\300````\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300````\300\300``\300\300````\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300````\300\300``\300\300````\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300````\300\300``\300\300````\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300````\300\300``\300\300````!");
    }

    @Test
    public void test02908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02908");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\ua7ad\ua7ad\ua7ad\ua7ad\200\ua7ad\ua7ad\ua7ad\ua7ad]]!", "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\200}}`nullnullnullnull]]!" + "'", str2, "nullnullnullnull\200}}`nullnullnullnull]]!");
    }

    @Test
    public void test02909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02909");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!", "nullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLUULLUU!!LLUULLUU!!!!LLUULLUU!!LLUULLUU!!!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!!!LLUULLUU!!LLUULLUU!!!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!!!LLUULLUU!!LLUULLUU!!!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!!!LLUULLUU!!LLUULLUU!!!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!!!LLUULLUU!!LLUULLUU!!!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!!!LLUULLUU!!LLUULLUU!!!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!!!LLUULLUU!!LLUULLUU!!!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!!!LLUULLUU!!LLUULLUU!!!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!!" + "'", str2, "LLUULLUU!!LLUULLUU!!!!LLUULLUU!!LLUULLUU!!!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!!!LLUULLUU!!LLUULLUU!!!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!!!LLUULLUU!!LLUULLUU!!!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!!!LLUULLUU!!LLUULLUU!!!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!!!LLUULLUU!!LLUULLUU!!!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!!!LLUULLUU!!LLUULLUU!!!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!!!LLUULLUU!!LLUULLUU!!!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!!!LLUULLUU!!LLUULLUU!!!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!!");
    }

    @Test
    public void test02910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02910");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\u03dd\u03de\u03e0\u03e0nullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02911");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128nullnull!", "fhnullnullfhnullnull\226\226fhnullnullfhnullnull\226\226fhnullnullfhnullnullnullnullfhnullnullfhnullnullnullnullfhnullnullfhnullnull\226\226fhnullnullfhnullnull\226\226fhnullnullfhnullnullnullnullfhnullnullfhnullnullnullnullfhnullnullfhnullnull\226\226fhnullnullfhnullnull\226\226fhnullnullfhnullnullnullnullfhnullnullfhnullnullnullnullfhnullnullfhnullnull\226\226fhnullnullfhnullnull\226\226fhnullnullfhnullnullnullnullfhnullnullfhnullnullnullnullfhnullnullfhnullnull\226\226fhnullnullfhnullnull\226\226fhnullnullfhnullnullnullnullfhnullnullfhnullnullnullnullfhnullnullfhnullnull\226\226fhnullnullfhnullnull\226\226fhnullnullfhnullnullnullnullfhnullnullfhnullnullnullnullfhnullnullfhnullnull\226\226fhnullnullfhnullnull\226\226fhnullnullfhnullnullnullnullfhnullnullfhnullnullnullnullfhnullnullfhnullnull\226\226fhnullnullfhnullnull\226\226fhnullnullfhnullnullnullnullfhnullnullfhnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380!" + "'", str2, "\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380!");
    }

    @Test
    public void test02912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02912");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0170null!", "!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!LL!" + "'", str2, "!!!LL!");
    }

    @Test
    public void test02913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02913");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```!" + "'", str2, "ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```!");
    }

    @Test
    public void test02914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02914");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226!!nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226!!nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226!!nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226!!nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02915");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016eUU!!!!!!!", "UNLL\256\254\254UNLL\256\254\254!!UNLL\256\254\254UNLL\256\254\254!!UNLL\256\254\254UNLL\256\254\254!!UNLL\256\254\254UNLL\256\254\254!!UNLL\256\254\254UNLL\256\254\254!!UNLL\256\254\254UNLL\256\254\254!!UNLL\256\254\254UNLL\256\254\254!!UNLL\256\254\254UNLL\256\254\254!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\330\273\273\273\273null\270\270\273null\270\270!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!!!!" + "'", str2, "\330\273\273\273\273null\270\270\273null\270\270!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!!!!");
    }

    @Test
    public void test02916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02916");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullvvvnullvvvnullvvvnullvvv\200}}`nullvvvnullvvvnullvvvnullvvv]]!", "\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test02917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02917");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null\226\230\230nullnullnullnull\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230nullnullnullnull\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230!", "HH!!HH!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\226\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230!" + "'", str2, "nullnullnullnull\226\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230!");
    }

    @Test
    public void test02918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02918");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0146\u0146\u0146\u0146\u0146\u0146\u0146\u0146\u0346\u0348\u0348!", "v\276\275\275null!nullnullnullnullv\276\275\275null!nullnullnullnull!!v\276\275\275null!nullnullnullnullv\276\275\275null!nullnullnullnull!!v\276\275\275null!nullnullnullnullv\276\275\275null!nullnullnullnull!!v\276\275\275null!nullnullnullnullv\276\275\275null!nullnullnullnull!!v\276\275\275null!nullnullnullnullv\276\275\275null!nullnullnullnull!!v\276\275\275null!nullnullnullnullv\276\275\275null!nullnullnullnull!!v\276\275\275null!nullnullnullnullv\276\275\275null!nullnullnullnull!!v\276\275\275null!nullnullnullnullv\276\275\275null!nullnullnullnull!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test02919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02919");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u019b\u019c\u019e\u019e\u019b\u019c\u019e\u019e\u019b\u019c\u019e\u019e\u019b\u019c\u019e\u019e!", "L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016dnullnullnullnullnullnullnullnull!" + "'", str2, "\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016dnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02920");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\200}}`\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300]]!", "\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!!\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!!\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!!\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!!\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test02921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02921");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246!", "!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NLLLNLLLnullnullnullnullnullnullnullnullNLLLNLLLnullnullnullnullnullnullnullnullNLLLNLLLnullnullnullnullnullnullnullnullNLLLNLLLnullnullnullnullnullnullnullnullNLLLNLLLnullnullnullnullnullnullnullnullNLLLNLLLnullnullnullnullnullnullnullnullNLLLNLLLnullnullnullnullnullnullnullnullNLLLNLLLnullnullnullnullnullnullnullnull!" + "'", str2, "NLLLNLLLnullnullnullnullnullnullnullnullNLLLNLLLnullnullnullnullnullnullnullnullNLLLNLLLnullnullnullnullnullnullnullnullNLLLNLLLnullnullnullnullnullnullnullnullNLLLNLLLnullnullnullnullnullnullnullnullNLLLNLLLnullnullnullnullnullnullnullnullNLLLNLLLnullnullnullnullnullnullnullnullNLLLNLLLnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02922");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\254\254\254\254\u0346\u0348\u0348!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\254\254\254\254\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\254\254\254\254\u0346\u0348\u0348!");
    }

    @Test
    public void test02923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02923");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull!", "LUUULUUULUUULUUULUUULUUULUUULUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]uluuuluu]]uluuuluu!!]]uluuuluu]]uluuuluu!!]]uluuuluu]]uluuuluu]]uluuuluu]]uluuuluu!!]]uluuuluu]]uluuuluu!!]]uluuuluu]]uluuuluu!" + "'", str2, "]]uluuuluu]]uluuuluu!!]]uluuuluu]]uluuuluu!!]]uluuuluu]]uluuuluu]]uluuuluu]]uluuuluu!!]]uluuuluu]]uluuuluu!!]]uluuuluu]]uluuuluu!");
    }

    @Test
    public void test02924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02924");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200\u0348\u0346\u0346!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200\u0348\u0346\u0346!");
    }

    @Test
    public void test02925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02925");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02926");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("fehhfehh!", "!\226!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02927");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null\216\254\254null\216\254\254nullnullnullnullnullnullnullnullnull\216\254\254null\216\254\254nullnullnullnullnullnullnullnullnull\216\254\254null\216\254\254nullnullnullnullnullnullnullnullnull\216\254\254null\216\254\254nullnullnullnullnullnullnullnullnull\216\254\254null\216\254\254nullnullnullnullnullnullnullnullnull\216\254\254null\216\254\254nullnullnullnullnullnullnullnullnull\216\254\254null\216\254\254nullnullnullnullnullnullnullnullnull\216\254\254null\216\254\254nullnullnullnullnullnullnullnull!", "L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!l!!\216\254\254!l!!\216\254\254!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!\216\254\254!l!!\216\254\254!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!\216\254\254!l!!\216\254\254!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!\216\254\254!l!!\216\254\254!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!\216\254\254!l!!\216\254\254!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!\216\254\254!l!!\216\254\254!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!\216\254\254!l!!\216\254\254!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!\216\254\254!l!!\216\254\254!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!!" + "'", str2, "!l!!\216\254\254!l!!\216\254\254!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!\216\254\254!l!!\216\254\254!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!\216\254\254!l!!\216\254\254!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!\216\254\254!l!!\216\254\254!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!\216\254\254!l!!\216\254\254!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!\216\254\254!l!!\216\254\254!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!\216\254\254!l!!\216\254\254!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!\216\254\254!l!!\216\254\254!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!!");
    }

    @Test
    public void test02928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02928");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300!!\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300!!\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300!!\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300!!\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300!", "U!LLU!LL!!U!LLU!LL!!U!LLU!LLU!LLU!LL!!U!LLU!LL!!U!LLU!LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02929");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02930");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!\200\200\u0346\u0348\u0348!", "]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test02931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02931");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}~\200\200}~\200\200nullnull}~\200\200}~\200\200nullnull!", "\215\215\215\215\215\215\215\215!!\215\215\215\215\215\215\215\215!!\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215!!\215\215\215\215\215\215\215\215!!\215\215\215\215\215\215\215\215!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200\215\215\215\215\215\215\215\215}~\200\200}~\200\200\215\215\215\215\215\215\215\215!" + "'", str2, "}~\200\200}~\200\200\215\215\215\215\215\215\215\215}~\200\200}~\200\200\215\215\215\215\215\215\215\215!");
    }

    @Test
    public void test02932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02932");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248nullnullnull!", "UELLUELLUELLUELLUELLUELLUELLUELLFHHHFHHHUELLUELLUELLUELLUELLUELLUELLUELLFHHHFHHHUELLUELLUELLUELLUELLUELLUELLUELLFHHHFHHHUELLUELLUELLUELLUELLUELLUELLUELLFHHHFHHHUELLUELLUELLUELLUELLUELLUELLUELLFHHHFHHHUELLUELLUELLUELLUELLUELLUELLUELLFHHHFHHHUELLUELLUELLUELLUELLUELLUELLUELLFHHHFHHHUELLUELLUELLUELLUELLUELLUELLUELLFHHHFHHH!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullEULLEULLEULLnullnullnullnullEULLEULLEULLnullnullnullnullEULLEULLEULLnullnullnullnullEULLEULLEULLnullnullnullnullEULLEULLEULLnullnullnullnullEULLEULLEULLnullnullnullnullEULLEULLEULLnullnullnullnullEULLEULLEULL!" + "'", str2, "nullnullnullnullEULLEULLEULLnullnullnullnullEULLEULLEULLnullnullnullnullEULLEULLEULLnullnullnullnullEULLEULLEULLnullnullnullnullEULLEULLEULLnullnullnullnullEULLEULLEULLnullnullnullnullEULLEULLEULLnullnullnullnullEULLEULLEULL!");
    }

    @Test
    public void test02933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02933");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!", "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253UNLLUNLL\253\253UNLLUNLL\253\253UNLLUNLL\253\253UNLLUNLL\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253UNLLUNLL\253\253UNLLUNLL\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!" + "'", str2, "!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!");
    }

    @Test
    public void test02934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02934");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!~TT!~TT!!!~TT!~TT!!!~TT!~TT!~TT!~TT!!!~TT!~TT!!!~TT!~TT!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~LL!~LL!!!~LL!~LL!!!~LL!~LL!~LL!~LL!!!~LL!~LL!!!~LL!~LL!" + "'", str2, "!~LL!~LL!!!~LL!~LL!!!~LL!~LL!~LL!~LL!!!~LL!~LL!!!~LL!~LL!");
    }

    @Test
    public void test02935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02935");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}!", "nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}!" + "'", str2, "~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}!");
    }

    @Test
    public void test02936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02936");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("U!LLU!LL!!U!LLU!LL!!!", "\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!!" + "'", str2, "null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!!");
    }

    @Test
    public void test02937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02937");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!", "\275\300\300\300\275\300\300\300\300\300\275\300\300\300\275\300\300\300\300\300\275\300\300\300\275\300\300\300\300\300\275\300\300\300\275\300\300\300\300\300\275\300\300\300\275\300\300\300\300\300\275\300\300\300\275\300\300\300\300\300\275\300\300\300\275\300\300\300\300\300\275\300\300\300\275\300\300\300\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!````````````nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!````````````nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!````````````nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!````````````nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test02938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02938");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!", "LLUULLUU}}LLUULLUU}}!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test02939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02939");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!", "\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnullnull]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnull!" + "'", str2, "null]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnullnull]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnull!");
    }

    @Test
    public void test02940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02940");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!!!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!!!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!!!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!!!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!", "LULLLULL!!LULLLULL!!LULLLULLLULLLULL!!LULLLULL!!LULLLULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!" + "'", str2, "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!");
    }

    @Test
    public void test02941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02941");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!", "\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!" + "'", str2, "\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!");
    }

    @Test
    public void test02942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02942");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02943");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull!", "NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0317\u031a\u0317\u031a\u0317\u031a\u0317\u031anullnull!" + "'", str2, "\u0317\u031a\u0317\u031a\u0317\u031a\u0317\u031anullnull!");
    }

    @Test
    public void test02944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02944");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106!", "UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02945");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null\340\336\336nullnullnullnull\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336nullnullnullnull\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336!", "}~\200\200}~\200\200NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL}~\200\200}~\200\200NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170nullnullnull!" + "'", str2, "\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170nullnullnull!");
    }

    @Test
    public void test02946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02946");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UU!!````````````UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!````````````UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!", "nullnullnullnullRRRnullnullnullnullRRRnullnullnullnullRRRnullnullnullnullRRRnullnullnullnullRRRnullnullnullnullRRRnullnullnullnullRRRnullnullnullnullRRR!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UU!!````````````UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!````````````UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!" + "'", str2, "UU!!````````````UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!````````````UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!");
    }

    @Test
    public void test02947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02947");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL!", "^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```!" + "'", str2, "\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```!");
    }

    @Test
    public void test02948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02948");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("L]LLL]LL!!L]LLL]LL!!L]LLL]LLL]LLL]LL!!L]LLL]LL!!L]LLL]LL!", "\276null\275\275\276null\275\275u!llu!llu!llu!llu!llu!llu!llu!ll\276null\275\275\276null\275\275u!llu!llu!llu!llu!llu!llu!llu!ll\276null\275\275\276null\275\275u!llu!llu!llu!llu!llu!llu!llu!ll\276null\275\275\276null\275\275u!llu!llu!llu!llu!llu!llu!llu!ll\276null\275\275\276null\275\275u!llu!llu!llu!llu!llu!llu!llu!ll\276null\275\275\276null\275\275u!llu!llu!llu!llu!llu!llu!llu!ll\276null\275\275\276null\275\275u!llu!llu!llu!llu!llu!llu!llu!ll\276null\275\275\276null\275\275u!llu!llu!llu!llu!llu!llu!llu!ll!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0!" + "'", str2, "\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0!");
    }

    @Test
    public void test02949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02949");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0180\u017e\u017e\u0180\u017e\u017e\u0180\u017e\u017e\u0180\u017e\u017e\u0180\u017e\u017e\u0180\u017e\u017e\u0180\u017e\u017e\u0180\u017e\u017e!", "T!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TT!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "T!!!T!!!T!!!T!!!T!!!T!!!T!!!T!!!!" + "'", str2, "T!!!T!!!T!!!T!!!T!!!T!!!T!!!T!!!!");
    }

    @Test
    public void test02950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02950");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!", "NN!!NN!!!!NN!!NN!!!!NN!!NN!!!!NN!!NN!!!!NN!!NN!!!!NN!!NN!!!!NN!!NN!!!!NN!!NN!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!" + "'", str2, "!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!");
    }

    @Test
    public void test02951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02951");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LL!!LL!!!", "nullnull\300\300~nullnull\300\300nullnull\300\300nullnull\300\300~nullnull\300\300nullnull\300\300!!nullnull\300\300~nullnull\300\300nullnull\300\300nullnull\300\300~nullnull\300\300nullnull\300\300!!nullnull\300\300~nullnull\300\300nullnull\300\300nullnull\300\300~nullnull\300\300nullnull\300\300nullnull\300\300~nullnull\300\300nullnull\300\300nullnull\300\300~nullnull\300\300nullnull\300\300!!nullnull\300\300~nullnull\300\300nullnull\300\300nullnull\300\300~nullnull\300\300nullnull\300\300!!nullnull\300\300~nullnull\300\300nullnull\300\300nullnull\300\300~nullnull\300\300nullnull\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NN!!NN!!!" + "'", str2, "NN!!NN!!!");
    }

    @Test
    public void test02952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02952");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\253\254\256\256nullnullnullnull\253\254\256\256nullnull!", "UNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUU!!UNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUU!!UNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUU!!UNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUU!!UNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\253\254\256\256\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246!" + "'", str2, "\253\254\256\256\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\253\254\256\256\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246!");
    }

    @Test
    public void test02953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02953");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!!", "\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test02954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02954");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LL!!LL!!!", "FF!!FF!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!!");
    }

    @Test
    public void test02955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02955");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!", "\275XXX\275XXX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02956");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226!!]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226!!]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226!!!" + "'", str2, "]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226!!]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226!!!");
    }

    @Test
    public void test02957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02957");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368LL!!LL!!!!LL!!LL!!!!\200\200\u0346\u0348\u0348!", "\335\300\336\336\335\300\336\336\335\300\336\336\335\300\336\336\335\300\336\336\335\300\336\336\335\300\336\336\335\300\336\336!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\336\336!!\336\336!!!!\336\336!!\336\336!!!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\336\336!!\336\336!!!!\336\336!!\336\336!!!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test02958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02958");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("efhhefhhefhhefhhefhhefhhefhhefhh!!efhhefhhefhhefhhefhhefhhefhhefhh!!!!efhhefhhefhhefhhefhhefhhefhhefhh!!efhhefhhefhhefhhefhhefhhefhhefhh!!!!efhhefhhefhhefhhefhhefhhefhhefhh!!efhhefhhefhhefhhefhhefhhefhhefhh!!!!efhhefhhefhhefhhefhhefhhefhhefhh!!efhhefhhefhhefhhefhhefhhefhhefhh!!!!efhhefhhefhhefhhefhhefhhefhhefhh!!efhhefhhefhhefhhefhhefhhefhhefhh!!!!efhhefhhefhhefhhefhhefhhefhhefhh!!efhhefhhefhhefhhefhhefhhefhhefhh!!!!efhhefhhefhhefhhefhhefhhefhhefhh!!efhhefhhefhhefhhefhhefhhefhhefhh!!!!efhhefhhefhhefhhefhhefhhefhhefhh!!efhhefhhefhhefhhefhhefhhefhhefhh!!!!!", "T!!!T!!!T!!!T!!!T!!!T!!!T!!!T!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!!" + "'", str2, "t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!!");
    }

    @Test
    public void test02959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02959");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]]UU]]UU!!]]UU]]UU!!]]UU]]UU]]UU]]UU!!]]UU]]UU!!]]UU]]UU!", "\300\336\300\300\300\336\300\300\300\336\300\300\300\336\300\300\300\336\300\300\300\336\300\300\300\336\300\300\300\336\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]\300\300]]\300\300!!]]\300\300]]\300\300!!]]\300\300]]\300\300]]\300\300]]\300\300!!]]\300\300]]\300\300!!]]\300\300]]\300\300!" + "'", str2, "]]\300\300]]\300\300!!]]\300\300]]\300\300!!]]\300\300]]\300\300]]\300\300]]\300\300!!]]\300\300]]\300\300!!]]\300\300]]\300\300!");
    }

    @Test
    public void test02960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02960");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226!!LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226!!!", "U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226!!\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226!!!" + "'", str2, "\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226!!\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226!!!");
    }

    @Test
    public void test02961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02961");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d!", "]nullnullnullnullnull]]nullnull]]nullnull]]nullnull]]]nullnullnullnullnull]]nullnull]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!" + "'", str2, "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test02962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02962");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0228\u0228\u0228\u0228nullnull!", "}~\200\200}~\200\200\215\215\215\215\215\215\215\215}~\200\200}~\200\200\215\215\215\215\215\215\215\215!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215}\215\215\215}\215\215nullnullnullnull\215}\215\215\215}\215\215!" + "'", str2, "\215}\215\215\215}\215\215nullnullnullnull\215}\215\215\215}\215\215!");
    }

    @Test
    public void test02963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02963");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~}\200\200~}\200\200NNLLNNLL~}\200\200~}\200\200NNLLNNLL~}\200\200~}\200\200NNLLNNLL~}\200\200~}\200\200NNLLNNLL~}\200\200~}\200\200NNLLNNLL~}\200\200~}\200\200NNLLNNLL~}\200\200~}\200\200NNLLNNLL~}\200\200~}\200\200NNLLNNLL!", "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnull\253\253nullnull\253\253nullnull\253\253nullnull\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnull\253\253nullnull\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232!" + "'", str2, "~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232!");
    }

    @Test
    public void test02964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02964");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]AAAAA]]AA]]AA]]AA]]]AAAAA]]AA]]!", "\u0366\u0365\u0368\u0368LL!!LL!!!!LL!!LL!!!!\200\200\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366]]!" + "'", str2, "\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366]]!");
    }

    @Test
    public void test02965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02965");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn!", "XXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxx!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02966");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275UUU\275UUU!", "XXXXXXXX!!XXXXXXXX!!XXXXXXXXXXXXXXXX!!XXXXXXXX!!XXXXXXXX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275XXX\275XXX!" + "'", str2, "\275XXX\275XXX!");
    }

    @Test
    public void test02967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02967");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u016e\u016e\u016e\u016e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u016e\u016e\u016e\u016e!", "L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~UU!~UU\220\220!~UU!~UU\220\220\220!~UU\220\220\220!~UU\220\220\220!~UU\220\220\220!~UU\220\220!~UU!~UU\220\220!~UU!~UU\220\220!" + "'", str2, "!~UU!~UU\220\220!~UU!~UU\220\220\220!~UU\220\220\220!~UU\220\220\220!~UU\220\220\220!~UU\220\220!~UU!~UU\220\220!~UU!~UU\220\220!");
    }

    @Test
    public void test02968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02968");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnull!!nullnull!!!", "!T!!!T!!!!!T!!!T!!!!!T!!!T!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test02969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02969");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!", "}}}}}}}}}}}}}}}}\200}}`}}}}}}}}}}}}}}}}]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02970");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "}~\200\200}~\200\200~^~~~^~~}~\200\200}~\200\200~^~~~^~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02971");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL\200}}`NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02972");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("ILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLii!!ILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLii!!ILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLii!!ILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLii!!ILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLii!", "!~nullnull!~nullnull!!!~nullnull!~nullnull!!!~nullnull!~nullnull!~nullnull!~nullnull!!!~nullnull!~nullnull!!!~nullnull!~nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LL!!L~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LL!!L~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LL!!L~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LL!!L~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LL!" + "'", str2, "L~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LL!!L~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LL!!L~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LL!!L~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LL!!L~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LL!");
    }

    @Test
    public void test02973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02973");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UUUUUUUU\214\214UUUUUUUU\214\214UUUUUUUU\214\214UUUUUUUU\214\214UUUUUUUU\214\214UUUUUUUU\214\214UUUUUUUU\214\214UUUUUUUU\214\214!", "\336\335\340\340\336\335\340\340!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214!" + "'", str2, "nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214!");
    }

    @Test
    public void test02974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02974");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NLUUNLUU!", "!~nullnull!~nullnull!!!~nullnull!~nullnull!!!~nullnull!~nullnull!~nullnull!~nullnull!!!~nullnull!~nullnull!!!~nullnull!~nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\300\276\276\275\300\276\276!" + "'", str2, "\275\300\276\276\275\300\276\276!");
    }

    @Test
    public void test02975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02975");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!\256N!NN\254\254\256N!NN\254\254!!\256N!NN\254\254\256N!NN\254\254!!\256N!NN\254\254\256N!NN\254\254!!\256N!NN\254\254\256N!NN\254\254!!\256N!NN\254\254\256N!NN\254\254!!\256N!NN\254\254\256N!NN\254\254!!\256N!NN\254\254\256N!NN\254\254!!\256N!NN\254\254\256N!NN\254\254!", "HHHHHHHHHHHHHHHH\200}}`HHHHHHHHHHHHHHHH]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\256null!nullnull\254\254\256null!nullnull\254\254!!\256null!nullnull\254\254\256null!nullnull\254\254!!\256null!nullnull\254\254\256null!nullnull\254\254!!\256null!nullnull\254\254\256null!nullnull\254\254!!\256null!nullnull\254\254\256null!nullnull\254\254!!\256null!nullnull\254\254\256null!nullnull\254\254!!\256null!nullnull\254\254\256null!nullnull\254\254!!\256null!nullnull\254\254\256null!nullnull\254\254!" + "'", str2, "!!\256null!nullnull\254\254\256null!nullnull\254\254!!\256null!nullnull\254\254\256null!nullnull\254\254!!\256null!nullnull\254\254\256null!nullnull\254\254!!\256null!nullnull\254\254\256null!nullnull\254\254!!\256null!nullnull\254\254\256null!nullnull\254\254!!\256null!nullnull\254\254\256null!nullnull\254\254!!\256null!nullnull\254\254\256null!nullnull\254\254!!\256null!nullnull\254\254\256null!nullnull\254\254!");
    }

    @Test
    public void test02976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02976");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\253\256\256nullnullnullnullnullnullnullnullnullnullnullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256nullnullnullnullnullnullnullnullnullnullnullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!", "EHHH\200}}`EHHH]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\256\256]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!" + "'", str2, "!\253\256\256]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
    }

    @Test
    public void test02977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02977");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!!", "HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!!" + "'", str2, "FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!!");
    }

    @Test
    public void test02978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02978");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnull\254~\256\256\254~\256\256\254~\256\256\254~\256\256!", "!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!!!!]!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!\254~\256\256\254~\256\256\254~\256\256\254~\256\256!" + "'", str2, "!!!!!!!!!!!!!!!!\254~\256\256\254~\256\256\254~\256\256\254~\256\256!");
    }

    @Test
    public void test02979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02979");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!!", "\201\204\204\204\201\204\204\204\201\204\204\204\201\204\204\204\200}}`\201\204\204\204\201\204\204\204\201\204\204\204\201\204\204\204]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!" + "'", str2, "\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!");
    }

    @Test
    public void test02980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02980");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnullabddabddabddabddnullnullnullnullabddabdd!", "!!\256null!nullnull\254\254\256null!nullnull\254\254!!\256null!nullnull\254\254\256null!nullnull\254\254!!\256null!nullnull\254\254\256null!nullnull\254\254!!\256null!nullnull\254\254\256null!nullnull\254\254!!\256null!nullnull\254\254\256null!nullnull\254\254!!\256null!nullnull\254\254\256null!nullnull\254\254!!\256null!nullnull\254\254\256null!nullnull\254\254!!\256null!nullnull\254\254\256null!nullnull\254\254!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016enullnullnullnullnullnullnullnull!" + "'", str2, "\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016enullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02981");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "LL!!!!!LL!!!!!LL!!!!!LL!!!!!LL!!!!!LL!!!!!LL!!!!!LL!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02982");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!!", "LLLLnullnullnullnullLLLLnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!!" + "'", str2, "nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!!");
    }

    @Test
    public void test02983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02983");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("ELLLELLLELLLELLL\200}}`ELLLELLLELLLELLL]]!", "!LLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullCCCnullCCCnullCCCnullCCC\200}}`nullCCCnullCCCnullCCCnullCCC]]!" + "'", str2, "nullCCCnullCCCnullCCCnullCCC\200}}`nullCCCnullCCCnullCCCnullCCC]]!");
    }

    @Test
    public void test02984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02984");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!", "nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02985");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnull~}}^nullnullnullnull]]!", "\213\216\214\214\213\216\214\214\213\216\214\214\213\216\214\214\213\216\214\214\213\216\214\214\213\216\214\214\213\216\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}}^nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}}^nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test02986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02986");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!", "\u0366\u0365\u0368\u0368\u0146\u0146\u0146\u0146\u0146\u0146\u0146\u0146\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!" + "'", str2, "null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!");
    }

    @Test
    public void test02987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02987");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("`LLUULLUULLUU`LLUULLUULLUU!", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`nullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "`nullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02988");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!~nullnull!~nullnull!!!~nullnull!~nullnull!!!~nullnull!~nullnull!~nullnull!~nullnull!!!~nullnull!~nullnull!!!~nullnull!~nullnull!", "LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~\200null~~\200null~~!~\200null~~\200null~~!!!~\200null~~\200null~~!~\200null~~\200null~~!!!~\200null~~\200null~~!~\200null~~\200null~~!~\200null~~\200null~~!~\200null~~\200null~~!!!~\200null~~\200null~~!~\200null~~\200null~~!!!~\200null~~\200null~~!~\200null~~\200null~~!" + "'", str2, "!~\200null~~\200null~~!~\200null~~\200null~~!!!~\200null~~\200null~~!~\200null~~\200null~~!!!~\200null~~\200null~~!~\200null~~\200null~~!~\200null~~\200null~~!~\200null~~\200null~~!!!~\200null~~\200null~~!~\200null~~\200null~~!!!~\200null~~\200null~~!~\200null~~\200null~~!");
    }

    @Test
    public void test02989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02989");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("ijllijllijllijll!ill!ill!ill!illijllijllijllijll!ill!ill!", "nulloprr!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!nullnull!!nullnull!" + "'", str2, "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test02990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02990");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106nullLL!!!", "!NLL!NLL!!!NLL!NLL!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullpnullrrRRnullpnullrrRR!!nullpnullrrRRnullpnullrrRR!!nullpnullrrRRnullpnullrrRR!!nullpnullrrRRnullpnullrrRR!!nullpnullrrRRnullpnullrrRR!!nullpnullrrRRnullpnullrrRR!!nullpnullrrRRnullpnullrrRR!!nullpnullrrRRnullpnullrrRR!!!" + "'", str2, "nullpnullrrRRnullpnullrrRR!!nullpnullrrRRnullpnullrrRR!!nullpnullrrRRnullpnullrrRR!!nullpnullrrRRnullpnullrrRR!!nullpnullrrRRnullpnullrrRR!!nullpnullrrRRnullpnullrrRR!!nullpnullrrRRnullpnullrrRR!!nullpnullrrRRnullpnullrrRR!!!");
    }

    @Test
    public void test02991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02991");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!nullnullnullnull!", "EEEEEEEEEEEEEEEE\200}}`EEEEEEEEEEEEEEEE]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!eeeeeeeeeeeeeeee!" + "'", str2, "!eeeeeeeeeeeeeeee!");
    }

    @Test
    public void test02992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02992");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ!", "!UUUUUUUUUUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!" + "'", str2, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
    }

    @Test
    public void test02993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02993");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016eUU!!!!!!!", "null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226!!null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L\230\230\230\230null\226\226\230null\226\226!!!!L\230\230\230\230null\226\226\230null\226\226!!!!!!L\230\230\230\230null\226\226\230null\226\226!!!!L\230\230\230\230null\226\226\230null\226\226!!!!!!L\230\230\230\230null\226\226\230null\226\226!!!!L\230\230\230\230null\226\226\230null\226\226!!!!!!L\230\230\230\230null\226\226\230null\226\226!!!!L\230\230\230\230null\226\226\230null\226\226!!!!!!L\230\230\230\230null\226\226\230null\226\226!!!!L\230\230\230\230null\226\226\230null\226\226!!!!!!L\230\230\230\230null\226\226\230null\226\226!!!!L\230\230\230\230null\226\226\230null\226\226!!!!!!L\230\230\230\230null\226\226\230null\226\226!!!!L\230\230\230\230null\226\226\230null\226\226!!!!!!L\230\230\230\230null\226\226\230null\226\226!!!!L\230\230\230\230null\226\226\230null\226\226!!!!!!!" + "'", str2, "L\230\230\230\230null\226\226\230null\226\226!!!!L\230\230\230\230null\226\226\230null\226\226!!!!!!L\230\230\230\230null\226\226\230null\226\226!!!!L\230\230\230\230null\226\226\230null\226\226!!!!!!L\230\230\230\230null\226\226\230null\226\226!!!!L\230\230\230\230null\226\226\230null\226\226!!!!!!L\230\230\230\230null\226\226\230null\226\226!!!!L\230\230\230\230null\226\226\230null\226\226!!!!!!L\230\230\230\230null\226\226\230null\226\226!!!!L\230\230\230\230null\226\226\230null\226\226!!!!!!L\230\230\230\230null\226\226\230null\226\226!!!!L\230\230\230\230null\226\226\230null\226\226!!!!!!L\230\230\230\230null\226\226\230null\226\226!!!!L\230\230\230\230null\226\226\230null\226\226!!!!!!L\230\230\230\230null\226\226\230null\226\226!!!!L\230\230\230\230null\226\226\230null\226\226!!!!!!!");
    }

    @Test
    public void test02994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02994");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```!", "LNNN!LNNNLNNNLNNN!LNNNLNNNLNNN!LNNNLNNNLNNN!LNNNLNNNLNNN!LNNNLNNNLNNN!LNNNLNNNLNNN!LNNNLNNNLNNN!LNNNLNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```!" + "'", str2, "LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```!");
    }

    @Test
    public void test02995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02995");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("unllunllunllunllunllunllunllunll!", "NLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!" + "'", str2, "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
    }

    @Test
    public void test02996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02996");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225!", "\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\225!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\225!");
    }

    @Test
    public void test02997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02997");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "OPRROPRROPRROPRROPRROPRROPRROPRR!!OPRROPRROPRROPRROPRROPRROPRROPRR!!OPRROPRROPRROPRROPRROPRROPRROPRR!!OPRROPRROPRROPRROPRROPRROPRROPRR!!OPRROPRROPRROPRROPRROPRROPRROPRR!!OPRROPRROPRROPRROPRROPRROPRROPRR!!OPRROPRROPRROPRROPRROPRROPRROPRR!!OPRROPRROPRROPRROPRROPRROPRROPRR!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test02998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02998");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]]HH]]HH!!]]HH]]HH!!]]HH]]HH]]HH]]HH!!]]HH]]HH!!]]HH]]HH!", "\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]LL]]LL!!]]LL]]LL!!]]LL]]LL]]LL]]LL!!]]LL]]LL!!]]LL]]LL!" + "'", str2, "]]LL]]LL!!]]LL]]LL!!]]LL]]LL]]LL]]LL!!]]LL]]LL!!]]LL]]LL!");
    }

    @Test
    public void test02999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02999");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
    }

    @Test
    public void test03000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test03000");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("P\220NN\200}}`P\220NN]]!", "\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U\220LL\200}}`U\220LL]]!" + "'", str2, "U\220LL\200}}`U\220LL]]!");
    }
}
